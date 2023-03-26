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
public final class SirupLogGrpc {

  private SirupLogGrpc() {}

  public static final String SERVICE_NAME = "log.proto.SirupLog";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sirup.service.log.rpc.proto.LogRequest,
      sirup.service.log.rpc.proto.LogResponse> getLogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "log",
      requestType = sirup.service.log.rpc.proto.LogRequest.class,
      responseType = sirup.service.log.rpc.proto.LogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sirup.service.log.rpc.proto.LogRequest,
      sirup.service.log.rpc.proto.LogResponse> getLogMethod() {
    io.grpc.MethodDescriptor<sirup.service.log.rpc.proto.LogRequest, sirup.service.log.rpc.proto.LogResponse> getLogMethod;
    if ((getLogMethod = SirupLogGrpc.getLogMethod) == null) {
      synchronized (SirupLogGrpc.class) {
        if ((getLogMethod = SirupLogGrpc.getLogMethod) == null) {
          SirupLogGrpc.getLogMethod = getLogMethod = 
              io.grpc.MethodDescriptor.<sirup.service.log.rpc.proto.LogRequest, sirup.service.log.rpc.proto.LogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "log.proto.SirupLog", "log"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sirup.service.log.rpc.proto.LogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sirup.service.log.rpc.proto.LogResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SirupLogMethodDescriptorSupplier("log"))
                  .build();
          }
        }
     }
     return getLogMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SirupLogStub newStub(io.grpc.Channel channel) {
    return new SirupLogStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SirupLogBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SirupLogBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SirupLogFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SirupLogFutureStub(channel);
  }

  /**
   */
  public static abstract class SirupLogImplBase implements io.grpc.BindableService {

    /**
     */
    public void log(sirup.service.log.rpc.proto.LogRequest request,
        io.grpc.stub.StreamObserver<sirup.service.log.rpc.proto.LogResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLogMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLogMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sirup.service.log.rpc.proto.LogRequest,
                sirup.service.log.rpc.proto.LogResponse>(
                  this, METHODID_LOG)))
          .build();
    }
  }

  /**
   */
  public static final class SirupLogStub extends io.grpc.stub.AbstractStub<SirupLogStub> {
    private SirupLogStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SirupLogStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SirupLogStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SirupLogStub(channel, callOptions);
    }

    /**
     */
    public void log(sirup.service.log.rpc.proto.LogRequest request,
        io.grpc.stub.StreamObserver<sirup.service.log.rpc.proto.LogResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SirupLogBlockingStub extends io.grpc.stub.AbstractStub<SirupLogBlockingStub> {
    private SirupLogBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SirupLogBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SirupLogBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SirupLogBlockingStub(channel, callOptions);
    }

    /**
     */
    public sirup.service.log.rpc.proto.LogResponse log(sirup.service.log.rpc.proto.LogRequest request) {
      return blockingUnaryCall(
          getChannel(), getLogMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SirupLogFutureStub extends io.grpc.stub.AbstractStub<SirupLogFutureStub> {
    private SirupLogFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SirupLogFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SirupLogFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SirupLogFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sirup.service.log.rpc.proto.LogResponse> log(
        sirup.service.log.rpc.proto.LogRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLogMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOG = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SirupLogImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SirupLogImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOG:
          serviceImpl.log((sirup.service.log.rpc.proto.LogRequest) request,
              (io.grpc.stub.StreamObserver<sirup.service.log.rpc.proto.LogResponse>) responseObserver);
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

  private static abstract class SirupLogBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SirupLogBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sirup.service.log.rpc.proto.Log.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SirupLog");
    }
  }

  private static final class SirupLogFileDescriptorSupplier
      extends SirupLogBaseDescriptorSupplier {
    SirupLogFileDescriptorSupplier() {}
  }

  private static final class SirupLogMethodDescriptorSupplier
      extends SirupLogBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SirupLogMethodDescriptorSupplier(String methodName) {
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
      synchronized (SirupLogGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SirupLogFileDescriptorSupplier())
              .addMethod(getLogMethod())
              .build();
        }
      }
    }
    return result;
  }
}
