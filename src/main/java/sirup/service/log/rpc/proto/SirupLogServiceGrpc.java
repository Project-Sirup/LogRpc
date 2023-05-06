package sirup.service.log.rpc.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: sirup_log.proto")
public final class SirupLogServiceGrpc {

  private SirupLogServiceGrpc() {}

  public static final String SERVICE_NAME = "log.v2.SirupLogService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sirup.service.log.rpc.proto.HealthRequest,
      sirup.service.log.rpc.proto.HealthResponse> getHealthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Health",
      requestType = sirup.service.log.rpc.proto.HealthRequest.class,
      responseType = sirup.service.log.rpc.proto.HealthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sirup.service.log.rpc.proto.HealthRequest,
      sirup.service.log.rpc.proto.HealthResponse> getHealthMethod() {
    io.grpc.MethodDescriptor<sirup.service.log.rpc.proto.HealthRequest, sirup.service.log.rpc.proto.HealthResponse> getHealthMethod;
    if ((getHealthMethod = SirupLogServiceGrpc.getHealthMethod) == null) {
      synchronized (SirupLogServiceGrpc.class) {
        if ((getHealthMethod = SirupLogServiceGrpc.getHealthMethod) == null) {
          SirupLogServiceGrpc.getHealthMethod = getHealthMethod = 
              io.grpc.MethodDescriptor.<sirup.service.log.rpc.proto.HealthRequest, sirup.service.log.rpc.proto.HealthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "log.v2.SirupLogService", "Health"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sirup.service.log.rpc.proto.HealthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sirup.service.log.rpc.proto.HealthResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SirupLogServiceMethodDescriptorSupplier("Health"))
                  .build();
          }
        }
     }
     return getHealthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sirup.service.log.rpc.proto.DebugRequest,
      sirup.service.log.rpc.proto.DebugResponse> getDebugMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Debug",
      requestType = sirup.service.log.rpc.proto.DebugRequest.class,
      responseType = sirup.service.log.rpc.proto.DebugResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sirup.service.log.rpc.proto.DebugRequest,
      sirup.service.log.rpc.proto.DebugResponse> getDebugMethod() {
    io.grpc.MethodDescriptor<sirup.service.log.rpc.proto.DebugRequest, sirup.service.log.rpc.proto.DebugResponse> getDebugMethod;
    if ((getDebugMethod = SirupLogServiceGrpc.getDebugMethod) == null) {
      synchronized (SirupLogServiceGrpc.class) {
        if ((getDebugMethod = SirupLogServiceGrpc.getDebugMethod) == null) {
          SirupLogServiceGrpc.getDebugMethod = getDebugMethod = 
              io.grpc.MethodDescriptor.<sirup.service.log.rpc.proto.DebugRequest, sirup.service.log.rpc.proto.DebugResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "log.v2.SirupLogService", "Debug"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sirup.service.log.rpc.proto.DebugRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sirup.service.log.rpc.proto.DebugResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SirupLogServiceMethodDescriptorSupplier("Debug"))
                  .build();
          }
        }
     }
     return getDebugMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sirup.service.log.rpc.proto.InfoRequest,
      sirup.service.log.rpc.proto.InfoResponse> getInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Info",
      requestType = sirup.service.log.rpc.proto.InfoRequest.class,
      responseType = sirup.service.log.rpc.proto.InfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sirup.service.log.rpc.proto.InfoRequest,
      sirup.service.log.rpc.proto.InfoResponse> getInfoMethod() {
    io.grpc.MethodDescriptor<sirup.service.log.rpc.proto.InfoRequest, sirup.service.log.rpc.proto.InfoResponse> getInfoMethod;
    if ((getInfoMethod = SirupLogServiceGrpc.getInfoMethod) == null) {
      synchronized (SirupLogServiceGrpc.class) {
        if ((getInfoMethod = SirupLogServiceGrpc.getInfoMethod) == null) {
          SirupLogServiceGrpc.getInfoMethod = getInfoMethod = 
              io.grpc.MethodDescriptor.<sirup.service.log.rpc.proto.InfoRequest, sirup.service.log.rpc.proto.InfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "log.v2.SirupLogService", "Info"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sirup.service.log.rpc.proto.InfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sirup.service.log.rpc.proto.InfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SirupLogServiceMethodDescriptorSupplier("Info"))
                  .build();
          }
        }
     }
     return getInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sirup.service.log.rpc.proto.WarnRequest,
      sirup.service.log.rpc.proto.WarnResponse> getWarnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Warn",
      requestType = sirup.service.log.rpc.proto.WarnRequest.class,
      responseType = sirup.service.log.rpc.proto.WarnResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sirup.service.log.rpc.proto.WarnRequest,
      sirup.service.log.rpc.proto.WarnResponse> getWarnMethod() {
    io.grpc.MethodDescriptor<sirup.service.log.rpc.proto.WarnRequest, sirup.service.log.rpc.proto.WarnResponse> getWarnMethod;
    if ((getWarnMethod = SirupLogServiceGrpc.getWarnMethod) == null) {
      synchronized (SirupLogServiceGrpc.class) {
        if ((getWarnMethod = SirupLogServiceGrpc.getWarnMethod) == null) {
          SirupLogServiceGrpc.getWarnMethod = getWarnMethod = 
              io.grpc.MethodDescriptor.<sirup.service.log.rpc.proto.WarnRequest, sirup.service.log.rpc.proto.WarnResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "log.v2.SirupLogService", "Warn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sirup.service.log.rpc.proto.WarnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sirup.service.log.rpc.proto.WarnResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SirupLogServiceMethodDescriptorSupplier("Warn"))
                  .build();
          }
        }
     }
     return getWarnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sirup.service.log.rpc.proto.ErrorRequest,
      sirup.service.log.rpc.proto.ErrorResponse> getErrorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Error",
      requestType = sirup.service.log.rpc.proto.ErrorRequest.class,
      responseType = sirup.service.log.rpc.proto.ErrorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sirup.service.log.rpc.proto.ErrorRequest,
      sirup.service.log.rpc.proto.ErrorResponse> getErrorMethod() {
    io.grpc.MethodDescriptor<sirup.service.log.rpc.proto.ErrorRequest, sirup.service.log.rpc.proto.ErrorResponse> getErrorMethod;
    if ((getErrorMethod = SirupLogServiceGrpc.getErrorMethod) == null) {
      synchronized (SirupLogServiceGrpc.class) {
        if ((getErrorMethod = SirupLogServiceGrpc.getErrorMethod) == null) {
          SirupLogServiceGrpc.getErrorMethod = getErrorMethod = 
              io.grpc.MethodDescriptor.<sirup.service.log.rpc.proto.ErrorRequest, sirup.service.log.rpc.proto.ErrorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "log.v2.SirupLogService", "Error"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sirup.service.log.rpc.proto.ErrorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sirup.service.log.rpc.proto.ErrorResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SirupLogServiceMethodDescriptorSupplier("Error"))
                  .build();
          }
        }
     }
     return getErrorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sirup.service.log.rpc.proto.LogListRequest,
      sirup.service.log.rpc.proto.LogListResponse> getLogListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LogList",
      requestType = sirup.service.log.rpc.proto.LogListRequest.class,
      responseType = sirup.service.log.rpc.proto.LogListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sirup.service.log.rpc.proto.LogListRequest,
      sirup.service.log.rpc.proto.LogListResponse> getLogListMethod() {
    io.grpc.MethodDescriptor<sirup.service.log.rpc.proto.LogListRequest, sirup.service.log.rpc.proto.LogListResponse> getLogListMethod;
    if ((getLogListMethod = SirupLogServiceGrpc.getLogListMethod) == null) {
      synchronized (SirupLogServiceGrpc.class) {
        if ((getLogListMethod = SirupLogServiceGrpc.getLogListMethod) == null) {
          SirupLogServiceGrpc.getLogListMethod = getLogListMethod = 
              io.grpc.MethodDescriptor.<sirup.service.log.rpc.proto.LogListRequest, sirup.service.log.rpc.proto.LogListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "log.v2.SirupLogService", "LogList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sirup.service.log.rpc.proto.LogListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sirup.service.log.rpc.proto.LogListResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SirupLogServiceMethodDescriptorSupplier("LogList"))
                  .build();
          }
        }
     }
     return getLogListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sirup.service.log.rpc.proto.LogFromRequest,
      sirup.service.log.rpc.proto.LogFromResponse> getLogFromMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LogFrom",
      requestType = sirup.service.log.rpc.proto.LogFromRequest.class,
      responseType = sirup.service.log.rpc.proto.LogFromResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sirup.service.log.rpc.proto.LogFromRequest,
      sirup.service.log.rpc.proto.LogFromResponse> getLogFromMethod() {
    io.grpc.MethodDescriptor<sirup.service.log.rpc.proto.LogFromRequest, sirup.service.log.rpc.proto.LogFromResponse> getLogFromMethod;
    if ((getLogFromMethod = SirupLogServiceGrpc.getLogFromMethod) == null) {
      synchronized (SirupLogServiceGrpc.class) {
        if ((getLogFromMethod = SirupLogServiceGrpc.getLogFromMethod) == null) {
          SirupLogServiceGrpc.getLogFromMethod = getLogFromMethod = 
              io.grpc.MethodDescriptor.<sirup.service.log.rpc.proto.LogFromRequest, sirup.service.log.rpc.proto.LogFromResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "log.v2.SirupLogService", "LogFrom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sirup.service.log.rpc.proto.LogFromRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sirup.service.log.rpc.proto.LogFromResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SirupLogServiceMethodDescriptorSupplier("LogFrom"))
                  .build();
          }
        }
     }
     return getLogFromMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SirupLogServiceStub newStub(io.grpc.Channel channel) {
    return new SirupLogServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SirupLogServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SirupLogServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SirupLogServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SirupLogServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SirupLogServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void health(sirup.service.log.rpc.proto.HealthRequest request,
        io.grpc.stub.StreamObserver<sirup.service.log.rpc.proto.HealthResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHealthMethod(), responseObserver);
    }

    /**
     */
    public void debug(sirup.service.log.rpc.proto.DebugRequest request,
        io.grpc.stub.StreamObserver<sirup.service.log.rpc.proto.DebugResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDebugMethod(), responseObserver);
    }

    /**
     */
    public void info(sirup.service.log.rpc.proto.InfoRequest request,
        io.grpc.stub.StreamObserver<sirup.service.log.rpc.proto.InfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInfoMethod(), responseObserver);
    }

    /**
     */
    public void warn(sirup.service.log.rpc.proto.WarnRequest request,
        io.grpc.stub.StreamObserver<sirup.service.log.rpc.proto.WarnResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWarnMethod(), responseObserver);
    }

    /**
     */
    public void error(sirup.service.log.rpc.proto.ErrorRequest request,
        io.grpc.stub.StreamObserver<sirup.service.log.rpc.proto.ErrorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getErrorMethod(), responseObserver);
    }

    /**
     */
    public void logList(sirup.service.log.rpc.proto.LogListRequest request,
        io.grpc.stub.StreamObserver<sirup.service.log.rpc.proto.LogListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLogListMethod(), responseObserver);
    }

    /**
     */
    public void logFrom(sirup.service.log.rpc.proto.LogFromRequest request,
        io.grpc.stub.StreamObserver<sirup.service.log.rpc.proto.LogFromResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLogFromMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHealthMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sirup.service.log.rpc.proto.HealthRequest,
                sirup.service.log.rpc.proto.HealthResponse>(
                  this, METHODID_HEALTH)))
          .addMethod(
            getDebugMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sirup.service.log.rpc.proto.DebugRequest,
                sirup.service.log.rpc.proto.DebugResponse>(
                  this, METHODID_DEBUG)))
          .addMethod(
            getInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sirup.service.log.rpc.proto.InfoRequest,
                sirup.service.log.rpc.proto.InfoResponse>(
                  this, METHODID_INFO)))
          .addMethod(
            getWarnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sirup.service.log.rpc.proto.WarnRequest,
                sirup.service.log.rpc.proto.WarnResponse>(
                  this, METHODID_WARN)))
          .addMethod(
            getErrorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sirup.service.log.rpc.proto.ErrorRequest,
                sirup.service.log.rpc.proto.ErrorResponse>(
                  this, METHODID_ERROR)))
          .addMethod(
            getLogListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sirup.service.log.rpc.proto.LogListRequest,
                sirup.service.log.rpc.proto.LogListResponse>(
                  this, METHODID_LOG_LIST)))
          .addMethod(
            getLogFromMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sirup.service.log.rpc.proto.LogFromRequest,
                sirup.service.log.rpc.proto.LogFromResponse>(
                  this, METHODID_LOG_FROM)))
          .build();
    }
  }

  /**
   */
  public static final class SirupLogServiceStub extends io.grpc.stub.AbstractStub<SirupLogServiceStub> {
    private SirupLogServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SirupLogServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SirupLogServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SirupLogServiceStub(channel, callOptions);
    }

    /**
     */
    public void health(sirup.service.log.rpc.proto.HealthRequest request,
        io.grpc.stub.StreamObserver<sirup.service.log.rpc.proto.HealthResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHealthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void debug(sirup.service.log.rpc.proto.DebugRequest request,
        io.grpc.stub.StreamObserver<sirup.service.log.rpc.proto.DebugResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDebugMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void info(sirup.service.log.rpc.proto.InfoRequest request,
        io.grpc.stub.StreamObserver<sirup.service.log.rpc.proto.InfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void warn(sirup.service.log.rpc.proto.WarnRequest request,
        io.grpc.stub.StreamObserver<sirup.service.log.rpc.proto.WarnResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWarnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void error(sirup.service.log.rpc.proto.ErrorRequest request,
        io.grpc.stub.StreamObserver<sirup.service.log.rpc.proto.ErrorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getErrorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logList(sirup.service.log.rpc.proto.LogListRequest request,
        io.grpc.stub.StreamObserver<sirup.service.log.rpc.proto.LogListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logFrom(sirup.service.log.rpc.proto.LogFromRequest request,
        io.grpc.stub.StreamObserver<sirup.service.log.rpc.proto.LogFromResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogFromMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SirupLogServiceBlockingStub extends io.grpc.stub.AbstractStub<SirupLogServiceBlockingStub> {
    private SirupLogServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SirupLogServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SirupLogServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SirupLogServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public sirup.service.log.rpc.proto.HealthResponse health(sirup.service.log.rpc.proto.HealthRequest request) {
      return blockingUnaryCall(
          getChannel(), getHealthMethod(), getCallOptions(), request);
    }

    /**
     */
    public sirup.service.log.rpc.proto.DebugResponse debug(sirup.service.log.rpc.proto.DebugRequest request) {
      return blockingUnaryCall(
          getChannel(), getDebugMethod(), getCallOptions(), request);
    }

    /**
     */
    public sirup.service.log.rpc.proto.InfoResponse info(sirup.service.log.rpc.proto.InfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public sirup.service.log.rpc.proto.WarnResponse warn(sirup.service.log.rpc.proto.WarnRequest request) {
      return blockingUnaryCall(
          getChannel(), getWarnMethod(), getCallOptions(), request);
    }

    /**
     */
    public sirup.service.log.rpc.proto.ErrorResponse error(sirup.service.log.rpc.proto.ErrorRequest request) {
      return blockingUnaryCall(
          getChannel(), getErrorMethod(), getCallOptions(), request);
    }

    /**
     */
    public sirup.service.log.rpc.proto.LogListResponse logList(sirup.service.log.rpc.proto.LogListRequest request) {
      return blockingUnaryCall(
          getChannel(), getLogListMethod(), getCallOptions(), request);
    }

    /**
     */
    public sirup.service.log.rpc.proto.LogFromResponse logFrom(sirup.service.log.rpc.proto.LogFromRequest request) {
      return blockingUnaryCall(
          getChannel(), getLogFromMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SirupLogServiceFutureStub extends io.grpc.stub.AbstractStub<SirupLogServiceFutureStub> {
    private SirupLogServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SirupLogServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SirupLogServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SirupLogServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sirup.service.log.rpc.proto.HealthResponse> health(
        sirup.service.log.rpc.proto.HealthRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHealthMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sirup.service.log.rpc.proto.DebugResponse> debug(
        sirup.service.log.rpc.proto.DebugRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDebugMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sirup.service.log.rpc.proto.InfoResponse> info(
        sirup.service.log.rpc.proto.InfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sirup.service.log.rpc.proto.WarnResponse> warn(
        sirup.service.log.rpc.proto.WarnRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWarnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sirup.service.log.rpc.proto.ErrorResponse> error(
        sirup.service.log.rpc.proto.ErrorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getErrorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sirup.service.log.rpc.proto.LogListResponse> logList(
        sirup.service.log.rpc.proto.LogListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLogListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sirup.service.log.rpc.proto.LogFromResponse> logFrom(
        sirup.service.log.rpc.proto.LogFromRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLogFromMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HEALTH = 0;
  private static final int METHODID_DEBUG = 1;
  private static final int METHODID_INFO = 2;
  private static final int METHODID_WARN = 3;
  private static final int METHODID_ERROR = 4;
  private static final int METHODID_LOG_LIST = 5;
  private static final int METHODID_LOG_FROM = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SirupLogServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SirupLogServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HEALTH:
          serviceImpl.health((sirup.service.log.rpc.proto.HealthRequest) request,
              (io.grpc.stub.StreamObserver<sirup.service.log.rpc.proto.HealthResponse>) responseObserver);
          break;
        case METHODID_DEBUG:
          serviceImpl.debug((sirup.service.log.rpc.proto.DebugRequest) request,
              (io.grpc.stub.StreamObserver<sirup.service.log.rpc.proto.DebugResponse>) responseObserver);
          break;
        case METHODID_INFO:
          serviceImpl.info((sirup.service.log.rpc.proto.InfoRequest) request,
              (io.grpc.stub.StreamObserver<sirup.service.log.rpc.proto.InfoResponse>) responseObserver);
          break;
        case METHODID_WARN:
          serviceImpl.warn((sirup.service.log.rpc.proto.WarnRequest) request,
              (io.grpc.stub.StreamObserver<sirup.service.log.rpc.proto.WarnResponse>) responseObserver);
          break;
        case METHODID_ERROR:
          serviceImpl.error((sirup.service.log.rpc.proto.ErrorRequest) request,
              (io.grpc.stub.StreamObserver<sirup.service.log.rpc.proto.ErrorResponse>) responseObserver);
          break;
        case METHODID_LOG_LIST:
          serviceImpl.logList((sirup.service.log.rpc.proto.LogListRequest) request,
              (io.grpc.stub.StreamObserver<sirup.service.log.rpc.proto.LogListResponse>) responseObserver);
          break;
        case METHODID_LOG_FROM:
          serviceImpl.logFrom((sirup.service.log.rpc.proto.LogFromRequest) request,
              (io.grpc.stub.StreamObserver<sirup.service.log.rpc.proto.LogFromResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SirupLogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SirupLogServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sirup.service.log.rpc.proto.Log.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SirupLogService");
    }
  }

  private static final class SirupLogServiceFileDescriptorSupplier
      extends SirupLogServiceBaseDescriptorSupplier {
    SirupLogServiceFileDescriptorSupplier() {}
  }

  private static final class SirupLogServiceMethodDescriptorSupplier
      extends SirupLogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SirupLogServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SirupLogServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SirupLogServiceFileDescriptorSupplier())
              .addMethod(getHealthMethod())
              .addMethod(getDebugMethod())
              .addMethod(getInfoMethod())
              .addMethod(getWarnMethod())
              .addMethod(getErrorMethod())
              .addMethod(getLogListMethod())
              .addMethod(getLogFromMethod())
              .build();
        }
      }
    }
    return result;
  }
}
