package computationServices;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.0)",
    comments = "Source: SyncComputation.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SyncAddGrpc {

  private SyncAddGrpc() {}

  public static final String SERVICE_NAME = "computationServices.SyncAdd";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<computationServices.syncSumIp,
      computationServices.syncSumOp> getSyncAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SyncAdd",
      requestType = computationServices.syncSumIp.class,
      responseType = computationServices.syncSumOp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<computationServices.syncSumIp,
      computationServices.syncSumOp> getSyncAddMethod() {
    io.grpc.MethodDescriptor<computationServices.syncSumIp, computationServices.syncSumOp> getSyncAddMethod;
    if ((getSyncAddMethod = SyncAddGrpc.getSyncAddMethod) == null) {
      synchronized (SyncAddGrpc.class) {
        if ((getSyncAddMethod = SyncAddGrpc.getSyncAddMethod) == null) {
          SyncAddGrpc.getSyncAddMethod = getSyncAddMethod =
              io.grpc.MethodDescriptor.<computationServices.syncSumIp, computationServices.syncSumOp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SyncAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  computationServices.syncSumIp.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  computationServices.syncSumOp.getDefaultInstance()))
              .setSchemaDescriptor(new SyncAddMethodDescriptorSupplier("SyncAdd"))
              .build();
        }
      }
    }
    return getSyncAddMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SyncAddStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SyncAddStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SyncAddStub>() {
        @java.lang.Override
        public SyncAddStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SyncAddStub(channel, callOptions);
        }
      };
    return SyncAddStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SyncAddBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SyncAddBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SyncAddBlockingStub>() {
        @java.lang.Override
        public SyncAddBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SyncAddBlockingStub(channel, callOptions);
        }
      };
    return SyncAddBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SyncAddFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SyncAddFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SyncAddFutureStub>() {
        @java.lang.Override
        public SyncAddFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SyncAddFutureStub(channel, callOptions);
        }
      };
    return SyncAddFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SyncAddImplBase implements io.grpc.BindableService {

    /**
     */
    public void syncAdd(computationServices.syncSumIp request,
        io.grpc.stub.StreamObserver<computationServices.syncSumOp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSyncAddMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSyncAddMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                computationServices.syncSumIp,
                computationServices.syncSumOp>(
                  this, METHODID_SYNC_ADD)))
          .build();
    }
  }

  /**
   */
  public static final class SyncAddStub extends io.grpc.stub.AbstractAsyncStub<SyncAddStub> {
    private SyncAddStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SyncAddStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SyncAddStub(channel, callOptions);
    }

    /**
     */
    public void syncAdd(computationServices.syncSumIp request,
        io.grpc.stub.StreamObserver<computationServices.syncSumOp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSyncAddMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SyncAddBlockingStub extends io.grpc.stub.AbstractBlockingStub<SyncAddBlockingStub> {
    private SyncAddBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SyncAddBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SyncAddBlockingStub(channel, callOptions);
    }

    /**
     */
    public computationServices.syncSumOp syncAdd(computationServices.syncSumIp request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSyncAddMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SyncAddFutureStub extends io.grpc.stub.AbstractFutureStub<SyncAddFutureStub> {
    private SyncAddFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SyncAddFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SyncAddFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<computationServices.syncSumOp> syncAdd(
        computationServices.syncSumIp request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSyncAddMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SYNC_ADD = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SyncAddImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SyncAddImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SYNC_ADD:
          serviceImpl.syncAdd((computationServices.syncSumIp) request,
              (io.grpc.stub.StreamObserver<computationServices.syncSumOp>) responseObserver);
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

  private static abstract class SyncAddBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SyncAddBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return computationServices.part3Sync.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SyncAdd");
    }
  }

  private static final class SyncAddFileDescriptorSupplier
      extends SyncAddBaseDescriptorSupplier {
    SyncAddFileDescriptorSupplier() {}
  }

  private static final class SyncAddMethodDescriptorSupplier
      extends SyncAddBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SyncAddMethodDescriptorSupplier(String methodName) {
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
      synchronized (SyncAddGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SyncAddFileDescriptorSupplier())
              .addMethod(getSyncAddMethod())
              .build();
        }
      }
    }
    return result;
  }
}
