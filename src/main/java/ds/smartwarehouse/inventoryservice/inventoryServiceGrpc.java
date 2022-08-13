package ds.smartwarehouse.inventoryservice;

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
    comments = "Source: InventoryService.proto")
public final class inventoryServiceGrpc {

  private inventoryServiceGrpc() {}

  public static final String SERVICE_NAME = "inventoryService.inventoryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.smartwarehouse.inventoryservice.itemCode,
      ds.smartwarehouse.inventoryservice.item> getSearchItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchItem",
      requestType = ds.smartwarehouse.inventoryservice.itemCode.class,
      responseType = ds.smartwarehouse.inventoryservice.item.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.smartwarehouse.inventoryservice.itemCode,
      ds.smartwarehouse.inventoryservice.item> getSearchItemMethod() {
    io.grpc.MethodDescriptor<ds.smartwarehouse.inventoryservice.itemCode, ds.smartwarehouse.inventoryservice.item> getSearchItemMethod;
    if ((getSearchItemMethod = inventoryServiceGrpc.getSearchItemMethod) == null) {
      synchronized (inventoryServiceGrpc.class) {
        if ((getSearchItemMethod = inventoryServiceGrpc.getSearchItemMethod) == null) {
          inventoryServiceGrpc.getSearchItemMethod = getSearchItemMethod = 
              io.grpc.MethodDescriptor.<ds.smartwarehouse.inventoryservice.itemCode, ds.smartwarehouse.inventoryservice.item>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "inventoryService.inventoryService", "searchItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.smartwarehouse.inventoryservice.itemCode.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.smartwarehouse.inventoryservice.item.getDefaultInstance()))
                  .setSchemaDescriptor(new inventoryServiceMethodDescriptorSupplier("searchItem"))
                  .build();
          }
        }
     }
     return getSearchItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.smartwarehouse.inventoryservice.itemCode,
      ds.smartwarehouse.inventoryservice.confirmOrder> getMakeOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "makeOrder",
      requestType = ds.smartwarehouse.inventoryservice.itemCode.class,
      responseType = ds.smartwarehouse.inventoryservice.confirmOrder.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ds.smartwarehouse.inventoryservice.itemCode,
      ds.smartwarehouse.inventoryservice.confirmOrder> getMakeOrderMethod() {
    io.grpc.MethodDescriptor<ds.smartwarehouse.inventoryservice.itemCode, ds.smartwarehouse.inventoryservice.confirmOrder> getMakeOrderMethod;
    if ((getMakeOrderMethod = inventoryServiceGrpc.getMakeOrderMethod) == null) {
      synchronized (inventoryServiceGrpc.class) {
        if ((getMakeOrderMethod = inventoryServiceGrpc.getMakeOrderMethod) == null) {
          inventoryServiceGrpc.getMakeOrderMethod = getMakeOrderMethod = 
              io.grpc.MethodDescriptor.<ds.smartwarehouse.inventoryservice.itemCode, ds.smartwarehouse.inventoryservice.confirmOrder>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "inventoryService.inventoryService", "makeOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.smartwarehouse.inventoryservice.itemCode.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.smartwarehouse.inventoryservice.confirmOrder.getDefaultInstance()))
                  .setSchemaDescriptor(new inventoryServiceMethodDescriptorSupplier("makeOrder"))
                  .build();
          }
        }
     }
     return getMakeOrderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static inventoryServiceStub newStub(io.grpc.Channel channel) {
    return new inventoryServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static inventoryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new inventoryServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static inventoryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new inventoryServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class inventoryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void searchItem(ds.smartwarehouse.inventoryservice.itemCode request,
        io.grpc.stub.StreamObserver<ds.smartwarehouse.inventoryservice.item> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchItemMethod(), responseObserver);
    }

    /**
     */
    public void makeOrder(ds.smartwarehouse.inventoryservice.itemCode request,
        io.grpc.stub.StreamObserver<ds.smartwarehouse.inventoryservice.confirmOrder> responseObserver) {
      asyncUnimplementedUnaryCall(getMakeOrderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSearchItemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.smartwarehouse.inventoryservice.itemCode,
                ds.smartwarehouse.inventoryservice.item>(
                  this, METHODID_SEARCH_ITEM)))
          .addMethod(
            getMakeOrderMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ds.smartwarehouse.inventoryservice.itemCode,
                ds.smartwarehouse.inventoryservice.confirmOrder>(
                  this, METHODID_MAKE_ORDER)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class inventoryServiceStub extends io.grpc.stub.AbstractStub<inventoryServiceStub> {
    private inventoryServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private inventoryServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected inventoryServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new inventoryServiceStub(channel, callOptions);
    }

    /**
     */
    public void searchItem(ds.smartwarehouse.inventoryservice.itemCode request,
        io.grpc.stub.StreamObserver<ds.smartwarehouse.inventoryservice.item> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void makeOrder(ds.smartwarehouse.inventoryservice.itemCode request,
        io.grpc.stub.StreamObserver<ds.smartwarehouse.inventoryservice.confirmOrder> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getMakeOrderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class inventoryServiceBlockingStub extends io.grpc.stub.AbstractStub<inventoryServiceBlockingStub> {
    private inventoryServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private inventoryServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected inventoryServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new inventoryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ds.smartwarehouse.inventoryservice.item searchItem(ds.smartwarehouse.inventoryservice.itemCode request) {
      return blockingUnaryCall(
          getChannel(), getSearchItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<ds.smartwarehouse.inventoryservice.confirmOrder> makeOrder(
        ds.smartwarehouse.inventoryservice.itemCode request) {
      return blockingServerStreamingCall(
          getChannel(), getMakeOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class inventoryServiceFutureStub extends io.grpc.stub.AbstractStub<inventoryServiceFutureStub> {
    private inventoryServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private inventoryServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected inventoryServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new inventoryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.smartwarehouse.inventoryservice.item> searchItem(
        ds.smartwarehouse.inventoryservice.itemCode request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchItemMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH_ITEM = 0;
  private static final int METHODID_MAKE_ORDER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final inventoryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(inventoryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH_ITEM:
          serviceImpl.searchItem((ds.smartwarehouse.inventoryservice.itemCode) request,
              (io.grpc.stub.StreamObserver<ds.smartwarehouse.inventoryservice.item>) responseObserver);
          break;
        case METHODID_MAKE_ORDER:
          serviceImpl.makeOrder((ds.smartwarehouse.inventoryservice.itemCode) request,
              (io.grpc.stub.StreamObserver<ds.smartwarehouse.inventoryservice.confirmOrder>) responseObserver);
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

  private static abstract class inventoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    inventoryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.smartwarehouse.inventoryservice.InventoryServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("inventoryService");
    }
  }

  private static final class inventoryServiceFileDescriptorSupplier
      extends inventoryServiceBaseDescriptorSupplier {
    inventoryServiceFileDescriptorSupplier() {}
  }

  private static final class inventoryServiceMethodDescriptorSupplier
      extends inventoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    inventoryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (inventoryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new inventoryServiceFileDescriptorSupplier())
              .addMethod(getSearchItemMethod())
              .addMethod(getMakeOrderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
