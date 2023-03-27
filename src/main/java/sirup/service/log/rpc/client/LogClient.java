package sirup.service.log.rpc.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import sirup.service.log.rpc.client.LogServiceUnavailableException;
import sirup.service.log.rpc.proto.Log;
import sirup.service.log.rpc.proto.LogRequest;
import sirup.service.log.rpc.proto.LogResponse;
import sirup.service.log.rpc.proto.SirupLogGrpc;

import java.util.concurrent.TimeUnit;

public class LogClient {

    private static String address;
    private static int port;
    private static String serviceName;
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
    public static void init(String address, int port, String serviceName) {
        LogClient.address = address;
        LogClient.port = port;
        LogClient.serviceName = serviceName;
    }

    public static LogClient getInstance() {
        return instance == null ? instance = new LogClient() : instance;
    }

    public int debug(String message) {
        LogRequest request = makeLogRequest(message);
        LogResponse response;
        try {
            response = logService.debug(request);
        } catch (StatusRuntimeException e) {
            throw new LogServiceUnavailableException(e.getMessage());
        }
        return response.getCode();
    }
    public int info(String message) {
        LogRequest request = makeLogRequest(message);
        LogResponse response;
        try {
            response = logService.info(request);
        } catch (StatusRuntimeException e) {
            throw new LogServiceUnavailableException(e.getMessage());
        }
        return response.getCode();
    }
    public int warn(String message) {
        LogRequest request = makeLogRequest(message);
        LogResponse response;
        try {
            response = logService.warn(request);
        } catch (StatusRuntimeException e) {
            throw new LogServiceUnavailableException(e.getMessage());
        }
        return response.getCode();
    }
    public int error(String message) {
        LogRequest request = makeLogRequest(message);
        LogResponse response;
        try {
            response = logService.error(request);
        } catch (StatusRuntimeException e) {
            throw new LogServiceUnavailableException(e.getMessage());
        }
        return response.getCode();
    }
    private LogRequest makeLogRequest(String message) {
        return LogRequest.newBuilder()
                .setSenderService(serviceName)
                .setMessage(message)
                .build();
    }

}
