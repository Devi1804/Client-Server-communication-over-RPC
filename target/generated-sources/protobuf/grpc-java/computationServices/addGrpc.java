package computationServices;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.0)",
    comments = "Source: AsyncComputation.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class addGrpc {

  private addGrpc() {}

  public static final String SERVICE_NAME = "computationServices.add";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<computationServices.AsyncSumIp,
      computationServices.AsyncSumOp> getAsyncAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AsyncAdd",
      requestType = computationServices.AsyncSumIp.class,
      responseType = computationServices.AsyncSumOp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<computationServices.AsyncSumIp,
      computationServices.AsyncSumOp> getAsyncAddMethod() {
    io.grpc.MethodDescriptor<computationServices.AsyncSumIp, computationServices.AsyncSumOp> getAsyncAddMethod;
    if ((getAsyncAddMethod = addGrpc.getAsyncAddMethod) == null) {
      synchronized (addGrpc.class) {
        if ((getAsyncAddMethod = addGrpc.getAsyncAddMethod) == null) {
          addGrpc.getAsyncAddMethod = getAsyncAddMethod =
              io.grpc.MethodDescriptor.<computationServices.AsyncSumIp, computationServices.AsyncSumOp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AsyncAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  computationServices.AsyncSumIp.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  computationServices.AsyncSumOp.getDefaultInstance()))
              .setSchemaDescriptor(new addMethodDescriptorSupplier("AsyncAdd"))
              .build();
        }
      }
    }
    return getAsyncAddMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static addStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<addStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<addStub>() {
        @java.lang.Override
        public addStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new addStub(channel, callOptions);
        }
      };
    return addStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static addBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<addBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<addBlockingStub>() {
        @java.lang.Override
        public addBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new addBlockingStub(channel, callOptions);
        }
      };
    return addBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static addFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<addFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<addFutureStub>() {
        @java.lang.Override
        public addFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new addFutureStub(channel, callOptions);
        }
      };
    return addFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class addImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<computationServices.AsyncSumIp> asyncAdd(
        io.grpc.stub.StreamObserver<computationServices.AsyncSumOp> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getAsyncAddMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAsyncAddMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                computationServices.AsyncSumIp,
                computationServices.AsyncSumOp>(
                  this, METHODID_ASYNC_ADD)))
          .build();
    }
  }

  /**
   */
  public static final class addStub extends io.grpc.stub.AbstractAsyncStub<addStub> {
    private addStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected addStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new addStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<computationServices.AsyncSumIp> asyncAdd(
        io.grpc.stub.StreamObserver<computationServices.AsyncSumOp> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getAsyncAddMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class addBlockingStub extends io.grpc.stub.AbstractBlockingStub<addBlockingStub> {
    private addBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected addBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new addBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class addFutureStub extends io.grpc.stub.AbstractFutureStub<addFutureStub> {
    private addFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected addFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new addFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_ASYNC_ADD = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final addImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(addImplBase serviceImpl, int methodId) {
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
        case METHODID_ASYNC_ADD:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.asyncAdd(
              (io.grpc.stub.StreamObserver<computationServices.AsyncSumOp>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class addBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    addBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return computationServices.part3.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("add");
    }
  }

  private static final class addFileDescriptorSupplier
      extends addBaseDescriptorSupplier {
    addFileDescriptorSupplier() {}
  }

  private static final class addMethodDescriptorSupplier
      extends addBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    addMethodDescriptorSupplier(String methodName) {
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
      synchronized (addGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new addFileDescriptorSupplier())
              .addMethod(getAsyncAddMethod())
              .build();
        }
      }
    }
    return result;
  }
}
