package management;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Management Service contract operations
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.0)",
    comments = "Source: ManagementServiceContract.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ManagementServiceGrpc {

  private ManagementServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "management.ManagementService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getIsAliveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsAlive",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getIsAliveMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getIsAliveMethod;
    if ((getIsAliveMethod = ManagementServiceGrpc.getIsAliveMethod) == null) {
      synchronized (ManagementServiceGrpc.class) {
        if ((getIsAliveMethod = ManagementServiceGrpc.getIsAliveMethod) == null) {
          ManagementServiceGrpc.getIsAliveMethod = getIsAliveMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsAlive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ManagementServiceMethodDescriptorSupplier("IsAlive"))
              .build();
        }
      }
    }
    return getIsAliveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<management.InstanceCount,
      com.google.protobuf.Empty> getChangeGRPCServerInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeGRPCServerInstances",
      requestType = management.InstanceCount.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<management.InstanceCount,
      com.google.protobuf.Empty> getChangeGRPCServerInstancesMethod() {
    io.grpc.MethodDescriptor<management.InstanceCount, com.google.protobuf.Empty> getChangeGRPCServerInstancesMethod;
    if ((getChangeGRPCServerInstancesMethod = ManagementServiceGrpc.getChangeGRPCServerInstancesMethod) == null) {
      synchronized (ManagementServiceGrpc.class) {
        if ((getChangeGRPCServerInstancesMethod = ManagementServiceGrpc.getChangeGRPCServerInstancesMethod) == null) {
          ManagementServiceGrpc.getChangeGRPCServerInstancesMethod = getChangeGRPCServerInstancesMethod =
              io.grpc.MethodDescriptor.<management.InstanceCount, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangeGRPCServerInstances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  management.InstanceCount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ManagementServiceMethodDescriptorSupplier("ChangeGRPCServerInstances"))
              .build();
        }
      }
    }
    return getChangeGRPCServerInstancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<management.InstanceCount,
      com.google.protobuf.Empty> getChangeImageProcessingInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeImageProcessingInstances",
      requestType = management.InstanceCount.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<management.InstanceCount,
      com.google.protobuf.Empty> getChangeImageProcessingInstancesMethod() {
    io.grpc.MethodDescriptor<management.InstanceCount, com.google.protobuf.Empty> getChangeImageProcessingInstancesMethod;
    if ((getChangeImageProcessingInstancesMethod = ManagementServiceGrpc.getChangeImageProcessingInstancesMethod) == null) {
      synchronized (ManagementServiceGrpc.class) {
        if ((getChangeImageProcessingInstancesMethod = ManagementServiceGrpc.getChangeImageProcessingInstancesMethod) == null) {
          ManagementServiceGrpc.getChangeImageProcessingInstancesMethod = getChangeImageProcessingInstancesMethod =
              io.grpc.MethodDescriptor.<management.InstanceCount, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangeImageProcessingInstances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  management.InstanceCount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ManagementServiceMethodDescriptorSupplier("ChangeImageProcessingInstances"))
              .build();
        }
      }
    }
    return getChangeImageProcessingInstancesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ManagementServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ManagementServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ManagementServiceStub>() {
        @java.lang.Override
        public ManagementServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ManagementServiceStub(channel, callOptions);
        }
      };
    return ManagementServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ManagementServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ManagementServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ManagementServiceBlockingStub>() {
        @java.lang.Override
        public ManagementServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ManagementServiceBlockingStub(channel, callOptions);
        }
      };
    return ManagementServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ManagementServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ManagementServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ManagementServiceFutureStub>() {
        @java.lang.Override
        public ManagementServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ManagementServiceFutureStub(channel, callOptions);
        }
      };
    return ManagementServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Management Service contract operations
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * ping server for testing service availability
     * </pre>
     */
    default void isAlive(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsAliveMethod(), responseObserver);
    }

    /**
     * <pre>
     * increase the number of instances of the gRPC server
     * </pre>
     */
    default void changeGRPCServerInstances(management.InstanceCount request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeGRPCServerInstancesMethod(), responseObserver);
    }

    /**
     * <pre>
     * increase the number of instances of the image processing server
     * </pre>
     */
    default void changeImageProcessingInstances(management.InstanceCount request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeImageProcessingInstancesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ManagementService.
   * <pre>
   * Management Service contract operations
   * </pre>
   */
  public static abstract class ManagementServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ManagementServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ManagementService.
   * <pre>
   * Management Service contract operations
   * </pre>
   */
  public static final class ManagementServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ManagementServiceStub> {
    private ManagementServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManagementServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ManagementServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * ping server for testing service availability
     * </pre>
     */
    public void isAlive(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsAliveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * increase the number of instances of the gRPC server
     * </pre>
     */
    public void changeGRPCServerInstances(management.InstanceCount request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeGRPCServerInstancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * increase the number of instances of the image processing server
     * </pre>
     */
    public void changeImageProcessingInstances(management.InstanceCount request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeImageProcessingInstancesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ManagementService.
   * <pre>
   * Management Service contract operations
   * </pre>
   */
  public static final class ManagementServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ManagementServiceBlockingStub> {
    private ManagementServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManagementServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ManagementServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ping server for testing service availability
     * </pre>
     */
    public com.google.protobuf.Empty isAlive(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsAliveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * increase the number of instances of the gRPC server
     * </pre>
     */
    public com.google.protobuf.Empty changeGRPCServerInstances(management.InstanceCount request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeGRPCServerInstancesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * increase the number of instances of the image processing server
     * </pre>
     */
    public com.google.protobuf.Empty changeImageProcessingInstances(management.InstanceCount request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeImageProcessingInstancesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ManagementService.
   * <pre>
   * Management Service contract operations
   * </pre>
   */
  public static final class ManagementServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ManagementServiceFutureStub> {
    private ManagementServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManagementServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ManagementServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * ping server for testing service availability
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> isAlive(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsAliveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * increase the number of instances of the gRPC server
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> changeGRPCServerInstances(
        management.InstanceCount request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeGRPCServerInstancesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * increase the number of instances of the image processing server
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> changeImageProcessingInstances(
        management.InstanceCount request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeImageProcessingInstancesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_IS_ALIVE = 0;
  private static final int METHODID_CHANGE_GRPCSERVER_INSTANCES = 1;
  private static final int METHODID_CHANGE_IMAGE_PROCESSING_INSTANCES = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_IS_ALIVE:
          serviceImpl.isAlive((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CHANGE_GRPCSERVER_INSTANCES:
          serviceImpl.changeGRPCServerInstances((management.InstanceCount) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CHANGE_IMAGE_PROCESSING_INSTANCES:
          serviceImpl.changeImageProcessingInstances((management.InstanceCount) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getIsAliveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.google.protobuf.Empty>(
                service, METHODID_IS_ALIVE)))
        .addMethod(
          getChangeGRPCServerInstancesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              management.InstanceCount,
              com.google.protobuf.Empty>(
                service, METHODID_CHANGE_GRPCSERVER_INSTANCES)))
        .addMethod(
          getChangeImageProcessingInstancesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              management.InstanceCount,
              com.google.protobuf.Empty>(
                service, METHODID_CHANGE_IMAGE_PROCESSING_INSTANCES)))
        .build();
  }

  private static abstract class ManagementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ManagementServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return management.ManagementServiceContract.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ManagementService");
    }
  }

  private static final class ManagementServiceFileDescriptorSupplier
      extends ManagementServiceBaseDescriptorSupplier {
    ManagementServiceFileDescriptorSupplier() {}
  }

  private static final class ManagementServiceMethodDescriptorSupplier
      extends ManagementServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ManagementServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ManagementServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ManagementServiceFileDescriptorSupplier())
              .addMethod(getIsAliveMethod())
              .addMethod(getChangeGRPCServerInstancesMethod())
              .addMethod(getChangeImageProcessingInstancesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
