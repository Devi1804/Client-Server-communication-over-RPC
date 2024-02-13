package computationServices;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.0)",
    comments = "Source: AsyncComputation.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class sortGrpc {

  private sortGrpc() {}

  public static final String SERVICE_NAME = "computationServices.sort";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<computationServices.AsyncSortIp,
      computationServices.AsyncSortOp> getAsyncSortMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AsyncSort",
      requestType = computationServices.AsyncSortIp.class,
      responseType = computationServices.AsyncSortOp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<computationServices.AsyncSortIp,
      computationServices.AsyncSortOp> getAsyncSortMethod() {
    io.grpc.MethodDescriptor<computationServices.AsyncSortIp, computationServices.AsyncSortOp> getAsyncSortMethod;
    if ((getAsyncSortMethod = sortGrpc.getAsyncSortMethod) == null) {
      synchronized (sortGrpc.class) {
        if ((getAsyncSortMethod = sortGrpc.getAsyncSortMethod) == null) {
          sortGrpc.getAsyncSortMethod = getAsyncSortMethod =
              io.grpc.MethodDescriptor.<computationServices.AsyncSortIp, computationServices.AsyncSortOp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AsyncSort"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  computationServices.AsyncSortIp.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  computationServices.AsyncSortOp.getDefaultInstance()))
              .setSchemaDescriptor(new sortMethodDescriptorSupplier("AsyncSort"))
              .build();
        }
      }
    }
    return getAsyncSortMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static sortStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<sortStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<sortStub>() {
        @java.lang.Override
        public sortStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new sortStub(channel, callOptions);
        }
      };
    return sortStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static sortBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<sortBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<sortBlockingStub>() {
        @java.lang.Override
        public sortBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new sortBlockingStub(channel, callOptions);
        }
      };
    return sortBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static sortFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<sortFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<sortFutureStub>() {
        @java.lang.Override
        public sortFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new sortFutureStub(channel, callOptions);
        }
      };
    return sortFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class sortImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<computationServices.AsyncSortIp> asyncSort(
        io.grpc.stub.StreamObserver<computationServices.AsyncSortOp> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getAsyncSortMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAsyncSortMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                computationServices.AsyncSortIp,
                computationServices.AsyncSortOp>(
                  this, METHODID_ASYNC_SORT)))
          .build();
    }
  }

  /**
   */
  public static final class sortStub extends io.grpc.stub.AbstractAsyncStub<sortStub> {
    private sortStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected sortStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new sortStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<computationServices.AsyncSortIp> asyncSort(
        io.grpc.stub.StreamObserver<computationServices.AsyncSortOp> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getAsyncSortMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class sortBlockingStub extends io.grpc.stub.AbstractBlockingStub<sortBlockingStub> {
    private sortBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected sortBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new sortBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class sortFutureStub extends io.grpc.stub.AbstractFutureStub<sortFutureStub> {
    private sortFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected sortFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new sortFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_ASYNC_SORT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final sortImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(sortImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ASYNC_SORT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.asyncSort(
              (io.grpc.stub.StreamObserver<computationServices.AsyncSortOp>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class sortBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    sortBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return computationServices.part3.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("sort");
    }
  }

  private static final class sortFileDescriptorSupplier
      extends sortBaseDescriptorSupplier {
    sortFileDescriptorSupplier() {}
  }

  private static final class sortMethodDescriptorSupplier
      extends sortBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    sortMethodDescriptorSupplier(String methodName) {
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
      synchronized (sortGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new sortFileDescriptorSupplier())
              .addMethod(getAsyncSortMethod())
              .build();
        }
      }
    }
    return result;
  }
}
