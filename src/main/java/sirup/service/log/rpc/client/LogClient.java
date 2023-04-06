package sirup.service.log.rpc.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import sirup.service.log.rpc.client.LogServiceUnavailableException;
import sirup.service.log.rpc.proto.*;

import java.util.concurrent.TimeUnit;

public class LogClient {

    private static String address;
    private static int port;
    private static String serviceName;
    private static LogClient instance;
    private ManagedChannel managedChannel;
    private SirupLogServiceGrpc.SirupLogServiceBlockingStub logService;
    private LogClient() {
        managedChannel = ManagedChannelBuilder.forAddress(address, port).usePlaintext().build();
        logService = SirupLogServiceGrpc.newBlockingStub(managedChannel);
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

    public int health() {
        HealthRequest request = HealthRequest.newBuilder().build();
        HealthResponse response;
        try {
            response = logService.health(request);
        } catch (StatusRuntimeException e) {
            throw new LogServiceUnavailableException(e.getMessage());
        }
        return response.getHealthCode();
    }

    public int debug(String ...message) {
        DebugRequest request = DebugRequest.newBuilder()
                .setLogRequest(makeLogRequest(String.join(" -> ", message))).build();
        DebugResponse response;
        try {
            response = logService.debug(request);
        } catch (StatusRuntimeException e) {
            throw new LogServiceUnavailableException(e.getMessage());
        }
        return response.getLogResponse().getCode();
    }
    public int info(String ...message) {
        InfoRequest request = InfoRequest.newBuilder()
                .setLogRequest(makeLogRequest(String.join(" -> ",message))).build();
        InfoResponse response;
        try {
            response = logService.info(request);
        } catch (StatusRuntimeException e) {
            throw new LogServiceUnavailableException(e.getMessage());
        }
        return response.getLogResponse().getCode();
    }
    public int warn(String ...message) {
        WarnRequest request = WarnRequest.newBuilder()
                .setLogRequest(makeLogRequest(String.join(" -> ",message))).build();
        WarnResponse response;
        try {
            response = logService.warn(request);
        } catch (StatusRuntimeException e) {
            throw new LogServiceUnavailableException(e.getMessage());
        }
        return response.getLogResponse().getCode();
    }
    public int error(String ...message) {
        ErrorRequest request = ErrorRequest.newBuilder()
                .setLogRequest(makeLogRequest(String.join(" -> ",message))).build();
        ErrorResponse response;
        try {
            response = logService.error(request);
        } catch (StatusRuntimeException e) {
            throw new LogServiceUnavailableException(e.getMessage());
        }
        return response.getLogResponse().getCode();
    }
    private LogRequest makeLogRequest(String message) {
        return LogRequest.newBuilder()
                .setSenderService(serviceName)
                .setMessage(message)
                .build();
    }

}
