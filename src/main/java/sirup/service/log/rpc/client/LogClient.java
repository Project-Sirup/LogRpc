package sirup.service.log.rpc.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import sirup.service.log.rpc.proto.*;

import java.util.concurrent.TimeUnit;

import static sirup.service.log.rpc.client.ColorUtil.name;

public class LogClient {

    private static String address;
    private static int port;
    private static String serviceName;
    private static LogClient instance;
    private ManagedChannel managedChannel;
    private SirupLogServiceGrpc.SirupLogServiceBlockingStub logService;
    private boolean usingFallback = false;
    private Fallback fallback = new ConsoleFallback();
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
        getInstance().health();
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
            usingFallback = true;
            fallback.use("LogService unavailable, using fallback [" + name(fallback.getClass().getSimpleName()) + "]");
            return 500;
            //throw new LogServiceUnavailableException(e.getMessage());
        }
        return response.getHealthCode();
    }

    public int debug(String ...message) {
        String joinedMessage = String.join(" -> ", message);
        DebugRequest request = DebugRequest.newBuilder()
                .setLogRequest(makeLogRequest(joinedMessage)).build();
        DebugResponse response;
        try {
            response = logService.debug(request);
        } catch (StatusRuntimeException e) {
            fallback.use(joinedMessage);
            return 500;
            //throw new LogServiceUnavailableException(e.getMessage());
        }
        return response.getLogResponse().getCode();
    }
    public int info(String ...message) {
        String joinedMessage = String.join(" -> ", message);
        InfoRequest request = InfoRequest.newBuilder()
                .setLogRequest(makeLogRequest(joinedMessage)).build();
        InfoResponse response;
        try {
            response = logService.info(request);
        } catch (StatusRuntimeException e) {
            fallback.use(joinedMessage);
            return 500;
            //throw new LogServiceUnavailableException(e.getMessage());
        }
        return response.getLogResponse().getCode();
    }
    public int warn(String ...message) {
        String joinedMessage = String.join(" -> ", message);
        WarnRequest request = WarnRequest.newBuilder()
                .setLogRequest(makeLogRequest(joinedMessage)).build();
        WarnResponse response;
        try {
            response = logService.warn(request);
        } catch (StatusRuntimeException e) {
            fallback.use(joinedMessage);
            return 500;
            //throw new LogServiceUnavailableException(e.getMessage());
        }
        return response.getLogResponse().getCode();
    }
    public int error(String ...message) {
        String joinedMessage = String.join(" -> ", message);
        ErrorRequest request = ErrorRequest.newBuilder()
                .setLogRequest(makeLogRequest(joinedMessage)).build();
        ErrorResponse response;
        try {
            response = logService.error(request);
        } catch (StatusRuntimeException e) {
            fallback.use(joinedMessage);
            return 500;
            //throw new LogServiceUnavailableException(e.getMessage());
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
