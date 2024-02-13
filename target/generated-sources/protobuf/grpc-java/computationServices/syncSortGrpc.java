package computationServices;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.0)",
    comments = "Source: SyncComputation.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class syncSortGrpc {

  private syncSortGrpc() {}

  public static final String SERVICE_NAME = "computationServices.syncSort";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<computationServices.syncSortIp,
      computationServices.syncSortOp> getSyncSortMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SyncSort",
      requestType = computationServices.syncSortIp.class,
      responseType = computationServices.syncSortOp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<computationServices.syncSortIp,
      computationServices.syncSortOp> getSyncSortMethod() {
    io.grpc.MethodDescriptor<computationServices.syncSortIp, computationServices.syncSortOp> getSyncSortMethod;
    if ((getSyncSortMethod = syncSortGrpc.getSyncSortMethod) == null) {
      synchronized (syncSortGrpc.class) {
        if ((getSyncSortMethod = syncSortGrpc.getSyncSortMethod) == null) {
          syncSortGrpc.getSyncSortMethod = getSyncSortMethod =
              io.grpc.MethodDescriptor.<computationServices.syncSortIp, computationServices.syncSortOp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SyncSort"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  computationServices.syncSortIp.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  computationServices.syncSortOp.getDefaultInstance()))
              .setSchemaDescriptor(new syncSortMethodDescriptorSupplier("SyncSort"))
              .build();
        }
      }
    }
    return getSyncSortMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static syncSortStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<syncSortStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<syncSortStub>() {
        @java.lang.Override
        public syncSortStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new syncSortStub(channel, callOptions);
        }
      };
    return syncSortStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static syncSortBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<syncSortBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<syncSortBlockingStub>() {
        @java.lang.Override
        public syncSortBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new syncSortBlockingStub(channel, callOptions);
        }
      };
    return syncSortBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static syncSortFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<syncSortFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<syncSortFutureStub>() {
        @java.lang.Override
        public syncSortFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new syncSortFutureStub(channel, callOptions);
        }
      };
    return syncSortFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class syncSortImplBase implements io.grpc.BindableService {

    /**
     */
    public void syncSort(computationServices.syncSortIp request,
        io.grpc.stub.StreamObserver<computationServices.syncSortOp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSyncSortMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSyncSortMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                computationServices.syncSortIp,
                computationServices.syncSortOp>(
                  this, METHODID_SYNC_SORT)))
          .build();
    }
  }

  /**
   */
  public static final class syncSortStub extends io.grpc.stub.AbstractAsyncStub<syncSortStub> {
    private syncSortStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected syncSortStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new syncSortStub(channel, callOptions);
    }

    /**
     */
    public void syncSort(computationServices.syncSortIp request,
        io.grpc.stub.StreamObserver<computationServices.syncSortOp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSyncSortMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class syncSortBlockingStub extends io.grpc.stub.AbstractBlockingStub<syncSortBlockingStub> {
    private syncSortBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected syncSortBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new syncSortBlockingStub(channel, callOptions);
    }

    /**
     */
    public computationServices.syncSortOp syncSort(computationServices.syncSortIp request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSyncSortMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class syncSortFutureStub extends io.grpc.stub.AbstractFutureStub<syncSortFutureStub> {
    private syncSortFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected syncSortFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new syncSortFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<computationServices.syncSortOp> syncSort(
        computationServices.syncSortIp request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSyncSortMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SYNC_SORT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final syncSortImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(syncSortImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SYNC_SORT:
          serviceImpl.syncSort((computationServices.syncSortIp) request,
              (io.grpc.stub.StreamObserver<computationServices.syncSortOp>) responseObserver);
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

  private static abstract class syncSortBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    syncSortBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return computationServices.part3Sync.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("syncSort");
    }
  }

  private static final class syncSortFileDescriptorSupplier
      extends syncSortBaseDescriptorSupplier {
    syncSortFileDescriptorSupplier() {}
  }

  private static final class syncSortMethodDescriptorSupplier
      extends syncSortBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    syncSortMethodDescriptorSupplier(String methodName) {
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
      synchronized (syncSortGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new syncSortFileDescriptorSupplier())
              .addMethod(getSyncSortMethod())
              .build();
        }
      }
    }
    return result;
  }
}
