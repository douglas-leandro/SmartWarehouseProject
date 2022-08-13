package ds.smartwarehouse.managementService;

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
    comments = "Source: Management.proto")
public final class ManagementGrpc {

  private ManagementGrpc() {}

  public static final String SERVICE_NAME = "managementService.Management";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.smartwarehouse.managementService.equipCode,
      ds.smartwarehouse.managementService.workHours> getGetHoursMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getHours",
      requestType = ds.smartwarehouse.managementService.equipCode.class,
      responseType = ds.smartwarehouse.managementService.workHours.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.smartwarehouse.managementService.equipCode,
      ds.smartwarehouse.managementService.workHours> getGetHoursMethod() {
    io.grpc.MethodDescriptor<ds.smartwarehouse.managementService.equipCode, ds.smartwarehouse.managementService.workHours> getGetHoursMethod;
    if ((getGetHoursMethod = ManagementGrpc.getGetHoursMethod) == null) {
      synchronized (ManagementGrpc.class) {
        if ((getGetHoursMethod = ManagementGrpc.getGetHoursMethod) == null) {
          ManagementGrpc.getGetHoursMethod = getGetHoursMethod = 
              io.grpc.MethodDescriptor.<ds.smartwarehouse.managementService.equipCode, ds.smartwarehouse.managementService.workHours>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "managementService.Management", "getHours"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.smartwarehouse.managementService.equipCode.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.smartwarehouse.managementService.workHours.getDefaultInstance()))
                  .setSchemaDescriptor(new ManagementMethodDescriptorSupplier("getHours"))
                  .build();
          }
        }
     }
     return getGetHoursMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.smartwarehouse.managementService.batteryLevel,
      ds.smartwarehouse.managementService.equipCode> getLowChargeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "lowCharge",
      requestType = ds.smartwarehouse.managementService.batteryLevel.class,
      responseType = ds.smartwarehouse.managementService.equipCode.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.smartwarehouse.managementService.batteryLevel,
      ds.smartwarehouse.managementService.equipCode> getLowChargeMethod() {
    io.grpc.MethodDescriptor<ds.smartwarehouse.managementService.batteryLevel, ds.smartwarehouse.managementService.equipCode> getLowChargeMethod;
    if ((getLowChargeMethod = ManagementGrpc.getLowChargeMethod) == null) {
      synchronized (ManagementGrpc.class) {
        if ((getLowChargeMethod = ManagementGrpc.getLowChargeMethod) == null) {
          ManagementGrpc.getLowChargeMethod = getLowChargeMethod = 
              io.grpc.MethodDescriptor.<ds.smartwarehouse.managementService.batteryLevel, ds.smartwarehouse.managementService.equipCode>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "managementService.Management", "lowCharge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.smartwarehouse.managementService.batteryLevel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.smartwarehouse.managementService.equipCode.getDefaultInstance()))
                  .setSchemaDescriptor(new ManagementMethodDescriptorSupplier("lowCharge"))
                  .build();
          }
        }
     }
     return getLowChargeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ManagementStub newStub(io.grpc.Channel channel) {
    return new ManagementStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ManagementBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ManagementBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ManagementFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ManagementFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class ManagementImplBase implements io.grpc.BindableService {

    /**
     */
    public void getHours(ds.smartwarehouse.managementService.equipCode request,
        io.grpc.stub.StreamObserver<ds.smartwarehouse.managementService.workHours> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHoursMethod(), responseObserver);
    }

    /**
     */
    public void lowCharge(ds.smartwarehouse.managementService.batteryLevel request,
        io.grpc.stub.StreamObserver<ds.smartwarehouse.managementService.equipCode> responseObserver) {
      asyncUnimplementedUnaryCall(getLowChargeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetHoursMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.smartwarehouse.managementService.equipCode,
                ds.smartwarehouse.managementService.workHours>(
                  this, METHODID_GET_HOURS)))
          .addMethod(
            getLowChargeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.smartwarehouse.managementService.batteryLevel,
                ds.smartwarehouse.managementService.equipCode>(
                  this, METHODID_LOW_CHARGE)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class ManagementStub extends io.grpc.stub.AbstractStub<ManagementStub> {
    private ManagementStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ManagementStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManagementStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ManagementStub(channel, callOptions);
    }

    /**
     */
    public void getHours(ds.smartwarehouse.managementService.equipCode request,
        io.grpc.stub.StreamObserver<ds.smartwarehouse.managementService.workHours> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetHoursMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lowCharge(ds.smartwarehouse.managementService.batteryLevel request,
        io.grpc.stub.StreamObserver<ds.smartwarehouse.managementService.equipCode> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLowChargeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class ManagementBlockingStub extends io.grpc.stub.AbstractStub<ManagementBlockingStub> {
    private ManagementBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ManagementBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManagementBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ManagementBlockingStub(channel, callOptions);
    }

    /**
     */
    public ds.smartwarehouse.managementService.workHours getHours(ds.smartwarehouse.managementService.equipCode request) {
      return blockingUnaryCall(
          getChannel(), getGetHoursMethod(), getCallOptions(), request);
    }

    /**
     */
    public ds.smartwarehouse.managementService.equipCode lowCharge(ds.smartwarehouse.managementService.batteryLevel request) {
      return blockingUnaryCall(
          getChannel(), getLowChargeMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class ManagementFutureStub extends io.grpc.stub.AbstractStub<ManagementFutureStub> {
    private ManagementFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ManagementFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManagementFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ManagementFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.smartwarehouse.managementService.workHours> getHours(
        ds.smartwarehouse.managementService.equipCode request) {
      return futureUnaryCall(
          getChannel().newCall(getGetHoursMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.smartwarehouse.managementService.equipCode> lowCharge(
        ds.smartwarehouse.managementService.batteryLevel request) {
      return futureUnaryCall(
          getChannel().newCall(getLowChargeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_HOURS = 0;
  private static final int METHODID_LOW_CHARGE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ManagementImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ManagementImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_HOURS:
          serviceImpl.getHours((ds.smartwarehouse.managementService.equipCode) request,
              (io.grpc.stub.StreamObserver<ds.smartwarehouse.managementService.workHours>) responseObserver);
          break;
        case METHODID_LOW_CHARGE:
          serviceImpl.lowCharge((ds.smartwarehouse.managementService.batteryLevel) request,
              (io.grpc.stub.StreamObserver<ds.smartwarehouse.managementService.equipCode>) responseObserver);
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

  private static abstract class ManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ManagementBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.smartwarehouse.managementService.ManagementServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Management");
    }
  }

  private static final class ManagementFileDescriptorSupplier
      extends ManagementBaseDescriptorSupplier {
    ManagementFileDescriptorSupplier() {}
  }

  private static final class ManagementMethodDescriptorSupplier
      extends ManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ManagementMethodDescriptorSupplier(String methodName) {
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
      synchronized (ManagementGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ManagementFileDescriptorSupplier())
              .addMethod(getGetHoursMethod())
              .addMethod(getLowChargeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
