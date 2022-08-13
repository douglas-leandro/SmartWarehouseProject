package ds.smartwarehouse.pickingservice;

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
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: PickingService.proto")
public final class PickingGrpc {

  private PickingGrpc() {}

  public static final String SERVICE_NAME = "pickingService.Picking";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.smartwarehouse.pickingservice.orderList,
      ds.smartwarehouse.pickingservice.confirmOrder> getGetOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getOrder",
      requestType = ds.smartwarehouse.pickingservice.orderList.class,
      responseType = ds.smartwarehouse.pickingservice.confirmOrder.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<ds.smartwarehouse.pickingservice.orderList,
      ds.smartwarehouse.pickingservice.confirmOrder> getGetOrderMethod() {
    io.grpc.MethodDescriptor<ds.smartwarehouse.pickingservice.orderList, ds.smartwarehouse.pickingservice.confirmOrder> getGetOrderMethod;
    if ((getGetOrderMethod = PickingGrpc.getGetOrderMethod) == null) {
      synchronized (PickingGrpc.class) {
        if ((getGetOrderMethod = PickingGrpc.getGetOrderMethod) == null) {
          PickingGrpc.getGetOrderMethod = getGetOrderMethod = 
              io.grpc.MethodDescriptor.<ds.smartwarehouse.pickingservice.orderList, ds.smartwarehouse.pickingservice.confirmOrder>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "pickingService.Picking", "getOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.smartwarehouse.pickingservice.orderList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.smartwarehouse.pickingservice.confirmOrder.getDefaultInstance()))
                  .setSchemaDescriptor(new PickingMethodDescriptorSupplier("getOrder"))
                  .build();
          }
        }
     }
     return getGetOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.smartwarehouse.pickingservice.itemName,
      ds.smartwarehouse.pickingservice.itemStored> getSortProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sortProduct",
      requestType = ds.smartwarehouse.pickingservice.itemName.class,
      responseType = ds.smartwarehouse.pickingservice.itemStored.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ds.smartwarehouse.pickingservice.itemName,
      ds.smartwarehouse.pickingservice.itemStored> getSortProductMethod() {
    io.grpc.MethodDescriptor<ds.smartwarehouse.pickingservice.itemName, ds.smartwarehouse.pickingservice.itemStored> getSortProductMethod;
    if ((getSortProductMethod = PickingGrpc.getSortProductMethod) == null) {
      synchronized (PickingGrpc.class) {
        if ((getSortProductMethod = PickingGrpc.getSortProductMethod) == null) {
          PickingGrpc.getSortProductMethod = getSortProductMethod = 
              io.grpc.MethodDescriptor.<ds.smartwarehouse.pickingservice.itemName, ds.smartwarehouse.pickingservice.itemStored>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "pickingService.Picking", "sortProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.smartwarehouse.pickingservice.itemName.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.smartwarehouse.pickingservice.itemStored.getDefaultInstance()))
                  .setSchemaDescriptor(new PickingMethodDescriptorSupplier("sortProduct"))
                  .build();
          }
        }
     }
     return getSortProductMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PickingStub newStub(io.grpc.Channel channel) {
    return new PickingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PickingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PickingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PickingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PickingFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class PickingImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<ds.smartwarehouse.pickingservice.orderList> getOrder(
        io.grpc.stub.StreamObserver<ds.smartwarehouse.pickingservice.confirmOrder> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetOrderMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.smartwarehouse.pickingservice.itemName> sortProduct(
        io.grpc.stub.StreamObserver<ds.smartwarehouse.pickingservice.itemStored> responseObserver) {
      return asyncUnimplementedStreamingCall(getSortProductMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetOrderMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                ds.smartwarehouse.pickingservice.orderList,
                ds.smartwarehouse.pickingservice.confirmOrder>(
                  this, METHODID_GET_ORDER)))
          .addMethod(
            getSortProductMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ds.smartwarehouse.pickingservice.itemName,
                ds.smartwarehouse.pickingservice.itemStored>(
                  this, METHODID_SORT_PRODUCT)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class PickingStub extends io.grpc.stub.AbstractStub<PickingStub> {
    private PickingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PickingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PickingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PickingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.smartwarehouse.pickingservice.orderList> getOrder(
        io.grpc.stub.StreamObserver<ds.smartwarehouse.pickingservice.confirmOrder> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getGetOrderMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.smartwarehouse.pickingservice.itemName> sortProduct(
        io.grpc.stub.StreamObserver<ds.smartwarehouse.pickingservice.itemStored> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSortProductMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class PickingBlockingStub extends io.grpc.stub.AbstractStub<PickingBlockingStub> {
    private PickingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PickingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PickingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PickingBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class PickingFutureStub extends io.grpc.stub.AbstractStub<PickingFutureStub> {
    private PickingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PickingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PickingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PickingFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_ORDER = 0;
  private static final int METHODID_SORT_PRODUCT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PickingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PickingImplBase serviceImpl, int methodId) {
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
        case METHODID_GET_ORDER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getOrder(
              (io.grpc.stub.StreamObserver<ds.smartwarehouse.pickingservice.confirmOrder>) responseObserver);
        case METHODID_SORT_PRODUCT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sortProduct(
              (io.grpc.stub.StreamObserver<ds.smartwarehouse.pickingservice.itemStored>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PickingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PickingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.smartwarehouse.pickingservice.PickingServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Picking");
    }
  }

  private static final class PickingFileDescriptorSupplier
      extends PickingBaseDescriptorSupplier {
    PickingFileDescriptorSupplier() {}
  }

  private static final class PickingMethodDescriptorSupplier
      extends PickingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PickingMethodDescriptorSupplier(String methodName) {
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
      synchronized (PickingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PickingFileDescriptorSupplier())
              .addMethod(getGetOrderMethod())
              .addMethod(getSortProductMethod())
              .build();
        }
      }
    }
    return result;
  }
}
