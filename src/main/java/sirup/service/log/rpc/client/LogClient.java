package sirup.service.log.rpc.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import sirup.service.log.rpc.client.LogServiceUnavailableException;
import sirup.service.log.rpc.proto.LogRequest;
import sirup.service.log.rpc.proto.LogResponse;
import sirup.service.log.rpc.proto.SirupLogGrpc;

import java.util.concurrent.TimeUnit;

public class LogClient {

    private static String address;
    private static int port;
    private static LogClient instance;
    private ManagedChannel managedChannel;
    private SirupLogGrpc.SirupLogBlockingStub logService;
    private LogClient() {
        managedChannel = ManagedChannelBuilder.forAddress(address, port).usePlaintext().build();
        logService = SirupLogGrpc.newBlockingStub(managedChannel);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                managedChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));
    }
    public static void init(String address, int port) {
        LogClient.address = address;
        LogClient.port = port;
    }

    public static LogClient getInstance() {
        return instance == null ? instance = new LogClient() : instance;
    }

    public int log(String message) {
        LogRequest request = LogRequest.newBuilder()
                .setSenderService("AuthService")
                .setMessage(message)
                .build();
        LogResponse response;
        try {
            response = logService.log(request);
        } catch (StatusRuntimeException e) {
            throw new LogServiceUnavailableException(e.getMessage());
        }
        return response.getCode();
    }

}