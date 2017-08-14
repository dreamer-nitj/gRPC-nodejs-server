package work_leave;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 *Service. define the methods that the grpc server can expose to the client.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: work_leave.proto")
public final class EmployeeLeaveDaysServiceGrpc {

  private EmployeeLeaveDaysServiceGrpc() {}

  public static final String SERVICE_NAME = "work_leave.EmployeeLeaveDaysService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<work_leave.Employee,
      work_leave.LeaveEligibility> METHOD_ELIGIBLE_FOR_LEAVE =
      io.grpc.MethodDescriptor.<work_leave.Employee, work_leave.LeaveEligibility>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "work_leave.EmployeeLeaveDaysService", "EligibleForLeave"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              work_leave.Employee.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              work_leave.LeaveEligibility.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<work_leave.Employee,
      work_leave.LeaveFeedback> METHOD_GRANT_LEAVE =
      io.grpc.MethodDescriptor.<work_leave.Employee, work_leave.LeaveFeedback>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "work_leave.EmployeeLeaveDaysService", "grantLeave"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              work_leave.Employee.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              work_leave.LeaveFeedback.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmployeeLeaveDaysServiceStub newStub(io.grpc.Channel channel) {
    return new EmployeeLeaveDaysServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmployeeLeaveDaysServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EmployeeLeaveDaysServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmployeeLeaveDaysServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EmployeeLeaveDaysServiceFutureStub(channel);
  }

  /**
   * <pre>
   *Service. define the methods that the grpc server can expose to the client.
   * </pre>
   */
  public static abstract class EmployeeLeaveDaysServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void eligibleForLeave(work_leave.Employee request,
        io.grpc.stub.StreamObserver<work_leave.LeaveEligibility> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ELIGIBLE_FOR_LEAVE, responseObserver);
    }

    /**
     */
    public void grantLeave(work_leave.Employee request,
        io.grpc.stub.StreamObserver<work_leave.LeaveFeedback> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GRANT_LEAVE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_ELIGIBLE_FOR_LEAVE,
            asyncUnaryCall(
              new MethodHandlers<
                work_leave.Employee,
                work_leave.LeaveEligibility>(
                  this, METHODID_ELIGIBLE_FOR_LEAVE)))
          .addMethod(
            METHOD_GRANT_LEAVE,
            asyncUnaryCall(
              new MethodHandlers<
                work_leave.Employee,
                work_leave.LeaveFeedback>(
                  this, METHODID_GRANT_LEAVE)))
          .build();
    }
  }

  /**
   * <pre>
   *Service. define the methods that the grpc server can expose to the client.
   * </pre>
   */
  public static final class EmployeeLeaveDaysServiceStub extends io.grpc.stub.AbstractStub<EmployeeLeaveDaysServiceStub> {
    private EmployeeLeaveDaysServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeLeaveDaysServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeLeaveDaysServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeLeaveDaysServiceStub(channel, callOptions);
    }

    /**
     */
    public void eligibleForLeave(work_leave.Employee request,
        io.grpc.stub.StreamObserver<work_leave.LeaveEligibility> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ELIGIBLE_FOR_LEAVE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void grantLeave(work_leave.Employee request,
        io.grpc.stub.StreamObserver<work_leave.LeaveFeedback> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GRANT_LEAVE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *Service. define the methods that the grpc server can expose to the client.
   * </pre>
   */
  public static final class EmployeeLeaveDaysServiceBlockingStub extends io.grpc.stub.AbstractStub<EmployeeLeaveDaysServiceBlockingStub> {
    private EmployeeLeaveDaysServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeLeaveDaysServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeLeaveDaysServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeLeaveDaysServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public work_leave.LeaveEligibility eligibleForLeave(work_leave.Employee request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ELIGIBLE_FOR_LEAVE, getCallOptions(), request);
    }

    /**
     */
    public work_leave.LeaveFeedback grantLeave(work_leave.Employee request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GRANT_LEAVE, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *Service. define the methods that the grpc server can expose to the client.
   * </pre>
   */
  public static final class EmployeeLeaveDaysServiceFutureStub extends io.grpc.stub.AbstractStub<EmployeeLeaveDaysServiceFutureStub> {
    private EmployeeLeaveDaysServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeLeaveDaysServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeLeaveDaysServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeLeaveDaysServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<work_leave.LeaveEligibility> eligibleForLeave(
        work_leave.Employee request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ELIGIBLE_FOR_LEAVE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<work_leave.LeaveFeedback> grantLeave(
        work_leave.Employee request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GRANT_LEAVE, getCallOptions()), request);
    }
  }

  private static final int METHODID_ELIGIBLE_FOR_LEAVE = 0;
  private static final int METHODID_GRANT_LEAVE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmployeeLeaveDaysServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EmployeeLeaveDaysServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ELIGIBLE_FOR_LEAVE:
          serviceImpl.eligibleForLeave((work_leave.Employee) request,
              (io.grpc.stub.StreamObserver<work_leave.LeaveEligibility>) responseObserver);
          break;
        case METHODID_GRANT_LEAVE:
          serviceImpl.grantLeave((work_leave.Employee) request,
              (io.grpc.stub.StreamObserver<work_leave.LeaveFeedback>) responseObserver);
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

  private static final class EmployeeLeaveDaysServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return work_leave.WorkLeaveProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EmployeeLeaveDaysServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmployeeLeaveDaysServiceDescriptorSupplier())
              .addMethod(METHOD_ELIGIBLE_FOR_LEAVE)
              .addMethod(METHOD_GRANT_LEAVE)
              .build();
        }
      }
    }
    return result;
  }
}
