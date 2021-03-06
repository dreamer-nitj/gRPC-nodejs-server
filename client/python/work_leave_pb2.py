# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: work_leave.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
from google.protobuf import descriptor_pb2
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='work_leave.proto',
  package='work_leave',
  syntax='proto3',
  serialized_pb=_b('\n\x10work_leave.proto\x12\nwork_leave\"g\n\x08\x45mployee\x12\x13\n\x0b\x65mployee_id\x18\x01 \x01(\x05\x12\x0c\n\x04name\x18\x02 \x01(\t\x12\x1a\n\x12\x61\x63\x63rued_leave_days\x18\x03 \x01(\x02\x12\x1c\n\x14requested_leave_days\x18\x04 \x01(\x02\"$\n\x10LeaveEligibility\x12\x10\n\x08\x65ligible\x18\x01 \x01(\x08\"X\n\rLeaveFeedback\x12\x0f\n\x07granted\x18\x01 \x01(\x08\x12\x1a\n\x12\x61\x63\x63rued_leave_days\x18\x02 \x01(\x02\x12\x1a\n\x12granted_leave_days\x18\x03 \x01(\x02\x32\xa1\x01\n\x18\x45mployeeLeaveDaysService\x12\x46\n\x10\x45ligibleForLeave\x12\x14.work_leave.Employee\x1a\x1c.work_leave.LeaveEligibility\x12=\n\ngrantLeave\x12\x14.work_leave.Employee\x1a\x19.work_leave.LeaveFeedbackB.\n\x1aio.grpc.examples.workleaveB\x0eWorkLeaveProtoP\x01\x62\x06proto3')
)




_EMPLOYEE = _descriptor.Descriptor(
  name='Employee',
  full_name='work_leave.Employee',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='employee_id', full_name='work_leave.Employee.employee_id', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='name', full_name='work_leave.Employee.name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='accrued_leave_days', full_name='work_leave.Employee.accrued_leave_days', index=2,
      number=3, type=2, cpp_type=6, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='requested_leave_days', full_name='work_leave.Employee.requested_leave_days', index=3,
      number=4, type=2, cpp_type=6, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=32,
  serialized_end=135,
)


_LEAVEELIGIBILITY = _descriptor.Descriptor(
  name='LeaveEligibility',
  full_name='work_leave.LeaveEligibility',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='eligible', full_name='work_leave.LeaveEligibility.eligible', index=0,
      number=1, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=137,
  serialized_end=173,
)


_LEAVEFEEDBACK = _descriptor.Descriptor(
  name='LeaveFeedback',
  full_name='work_leave.LeaveFeedback',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='granted', full_name='work_leave.LeaveFeedback.granted', index=0,
      number=1, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='accrued_leave_days', full_name='work_leave.LeaveFeedback.accrued_leave_days', index=1,
      number=2, type=2, cpp_type=6, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='granted_leave_days', full_name='work_leave.LeaveFeedback.granted_leave_days', index=2,
      number=3, type=2, cpp_type=6, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=175,
  serialized_end=263,
)

DESCRIPTOR.message_types_by_name['Employee'] = _EMPLOYEE
DESCRIPTOR.message_types_by_name['LeaveEligibility'] = _LEAVEELIGIBILITY
DESCRIPTOR.message_types_by_name['LeaveFeedback'] = _LEAVEFEEDBACK
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Employee = _reflection.GeneratedProtocolMessageType('Employee', (_message.Message,), dict(
  DESCRIPTOR = _EMPLOYEE,
  __module__ = 'work_leave_pb2'
  # @@protoc_insertion_point(class_scope:work_leave.Employee)
  ))
_sym_db.RegisterMessage(Employee)

LeaveEligibility = _reflection.GeneratedProtocolMessageType('LeaveEligibility', (_message.Message,), dict(
  DESCRIPTOR = _LEAVEELIGIBILITY,
  __module__ = 'work_leave_pb2'
  # @@protoc_insertion_point(class_scope:work_leave.LeaveEligibility)
  ))
_sym_db.RegisterMessage(LeaveEligibility)

LeaveFeedback = _reflection.GeneratedProtocolMessageType('LeaveFeedback', (_message.Message,), dict(
  DESCRIPTOR = _LEAVEFEEDBACK,
  __module__ = 'work_leave_pb2'
  # @@protoc_insertion_point(class_scope:work_leave.LeaveFeedback)
  ))
_sym_db.RegisterMessage(LeaveFeedback)


DESCRIPTOR.has_options = True
DESCRIPTOR._options = _descriptor._ParseOptions(descriptor_pb2.FileOptions(), _b('\n\032io.grpc.examples.workleaveB\016WorkLeaveProtoP\001'))
try:
  # THESE ELEMENTS WILL BE DEPRECATED.
  # Please use the generated *_pb2_grpc.py files instead.
  import grpc
  from grpc.beta import implementations as beta_implementations
  from grpc.beta import interfaces as beta_interfaces
  from grpc.framework.common import cardinality
  from grpc.framework.interfaces.face import utilities as face_utilities


  class EmployeeLeaveDaysServiceStub(object):
    """Service. define the methods that the grpc server can expose to the client.
    """

    def __init__(self, channel):
      """Constructor.

      Args:
        channel: A grpc.Channel.
      """
      self.EligibleForLeave = channel.unary_unary(
          '/work_leave.EmployeeLeaveDaysService/EligibleForLeave',
          request_serializer=Employee.SerializeToString,
          response_deserializer=LeaveEligibility.FromString,
          )
      self.grantLeave = channel.unary_unary(
          '/work_leave.EmployeeLeaveDaysService/grantLeave',
          request_serializer=Employee.SerializeToString,
          response_deserializer=LeaveFeedback.FromString,
          )


  class EmployeeLeaveDaysServiceServicer(object):
    """Service. define the methods that the grpc server can expose to the client.
    """

    def EligibleForLeave(self, request, context):
      # missing associated documentation comment in .proto file
      pass
      context.set_code(grpc.StatusCode.UNIMPLEMENTED)
      context.set_details('Method not implemented!')
      raise NotImplementedError('Method not implemented!')

    def grantLeave(self, request, context):
      # missing associated documentation comment in .proto file
      pass
      context.set_code(grpc.StatusCode.UNIMPLEMENTED)
      context.set_details('Method not implemented!')
      raise NotImplementedError('Method not implemented!')


  def add_EmployeeLeaveDaysServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
        'EligibleForLeave': grpc.unary_unary_rpc_method_handler(
            servicer.EligibleForLeave,
            request_deserializer=Employee.FromString,
            response_serializer=LeaveEligibility.SerializeToString,
        ),
        'grantLeave': grpc.unary_unary_rpc_method_handler(
            servicer.grantLeave,
            request_deserializer=Employee.FromString,
            response_serializer=LeaveFeedback.SerializeToString,
        ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
        'work_leave.EmployeeLeaveDaysService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


  class BetaEmployeeLeaveDaysServiceServicer(object):
    """The Beta API is deprecated for 0.15.0 and later.

    It is recommended to use the GA API (classes and functions in this
    file not marked beta) for all further purposes. This class was generated
    only to ease transition from grpcio<0.15.0 to grpcio>=0.15.0."""
    """Service. define the methods that the grpc server can expose to the client.
    """
    def EligibleForLeave(self, request, context):
      # missing associated documentation comment in .proto file
      pass
      context.code(beta_interfaces.StatusCode.UNIMPLEMENTED)
    def grantLeave(self, request, context):
      # missing associated documentation comment in .proto file
      pass
      context.code(beta_interfaces.StatusCode.UNIMPLEMENTED)


  class BetaEmployeeLeaveDaysServiceStub(object):
    """The Beta API is deprecated for 0.15.0 and later.

    It is recommended to use the GA API (classes and functions in this
    file not marked beta) for all further purposes. This class was generated
    only to ease transition from grpcio<0.15.0 to grpcio>=0.15.0."""
    """Service. define the methods that the grpc server can expose to the client.
    """
    def EligibleForLeave(self, request, timeout, metadata=None, with_call=False, protocol_options=None):
      # missing associated documentation comment in .proto file
      pass
      raise NotImplementedError()
    EligibleForLeave.future = None
    def grantLeave(self, request, timeout, metadata=None, with_call=False, protocol_options=None):
      # missing associated documentation comment in .proto file
      pass
      raise NotImplementedError()
    grantLeave.future = None


  def beta_create_EmployeeLeaveDaysService_server(servicer, pool=None, pool_size=None, default_timeout=None, maximum_timeout=None):
    """The Beta API is deprecated for 0.15.0 and later.

    It is recommended to use the GA API (classes and functions in this
    file not marked beta) for all further purposes. This function was
    generated only to ease transition from grpcio<0.15.0 to grpcio>=0.15.0"""
    request_deserializers = {
      ('work_leave.EmployeeLeaveDaysService', 'EligibleForLeave'): Employee.FromString,
      ('work_leave.EmployeeLeaveDaysService', 'grantLeave'): Employee.FromString,
    }
    response_serializers = {
      ('work_leave.EmployeeLeaveDaysService', 'EligibleForLeave'): LeaveEligibility.SerializeToString,
      ('work_leave.EmployeeLeaveDaysService', 'grantLeave'): LeaveFeedback.SerializeToString,
    }
    method_implementations = {
      ('work_leave.EmployeeLeaveDaysService', 'EligibleForLeave'): face_utilities.unary_unary_inline(servicer.EligibleForLeave),
      ('work_leave.EmployeeLeaveDaysService', 'grantLeave'): face_utilities.unary_unary_inline(servicer.grantLeave),
    }
    server_options = beta_implementations.server_options(request_deserializers=request_deserializers, response_serializers=response_serializers, thread_pool=pool, thread_pool_size=pool_size, default_timeout=default_timeout, maximum_timeout=maximum_timeout)
    return beta_implementations.server(method_implementations, options=server_options)


  def beta_create_EmployeeLeaveDaysService_stub(channel, host=None, metadata_transformer=None, pool=None, pool_size=None):
    """The Beta API is deprecated for 0.15.0 and later.

    It is recommended to use the GA API (classes and functions in this
    file not marked beta) for all further purposes. This function was
    generated only to ease transition from grpcio<0.15.0 to grpcio>=0.15.0"""
    request_serializers = {
      ('work_leave.EmployeeLeaveDaysService', 'EligibleForLeave'): Employee.SerializeToString,
      ('work_leave.EmployeeLeaveDaysService', 'grantLeave'): Employee.SerializeToString,
    }
    response_deserializers = {
      ('work_leave.EmployeeLeaveDaysService', 'EligibleForLeave'): LeaveEligibility.FromString,
      ('work_leave.EmployeeLeaveDaysService', 'grantLeave'): LeaveFeedback.FromString,
    }
    cardinalities = {
      'EligibleForLeave': cardinality.Cardinality.UNARY_UNARY,
      'grantLeave': cardinality.Cardinality.UNARY_UNARY,
    }
    stub_options = beta_implementations.stub_options(host=host, metadata_transformer=metadata_transformer, request_serializers=request_serializers, response_deserializers=response_deserializers, thread_pool=pool, thread_pool_size=pool_size)
    return beta_implementations.dynamic_stub(channel, 'work_leave.EmployeeLeaveDaysService', cardinalities, options=stub_options)
except ImportError:
  pass
# @@protoc_insertion_point(module_scope)
