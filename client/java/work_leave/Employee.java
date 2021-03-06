// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: work_leave.proto

package work_leave;

/**
 * <pre>
 * Message Type fefinition for an Employee.
 * </pre>
 *
 * Protobuf type {@code work_leave.Employee}
 */
public  final class Employee extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:work_leave.Employee)
    EmployeeOrBuilder {
  // Use Employee.newBuilder() to construct.
  private Employee(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Employee() {
    employeeId_ = 0;
    name_ = "";
    accruedLeaveDays_ = 0F;
    requestedLeaveDays_ = 0F;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Employee(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            employeeId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 29: {

            accruedLeaveDays_ = input.readFloat();
            break;
          }
          case 37: {

            requestedLeaveDays_ = input.readFloat();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return work_leave.WorkLeaveProto.internal_static_work_leave_Employee_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return work_leave.WorkLeaveProto.internal_static_work_leave_Employee_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            work_leave.Employee.class, work_leave.Employee.Builder.class);
  }

  public static final int EMPLOYEE_ID_FIELD_NUMBER = 1;
  private int employeeId_;
  /**
   * <code>int32 employee_id = 1;</code>
   */
  public int getEmployeeId() {
    return employeeId_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 2;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCRUED_LEAVE_DAYS_FIELD_NUMBER = 3;
  private float accruedLeaveDays_;
  /**
   * <code>float accrued_leave_days = 3;</code>
   */
  public float getAccruedLeaveDays() {
    return accruedLeaveDays_;
  }

  public static final int REQUESTED_LEAVE_DAYS_FIELD_NUMBER = 4;
  private float requestedLeaveDays_;
  /**
   * <code>float requested_leave_days = 4;</code>
   */
  public float getRequestedLeaveDays() {
    return requestedLeaveDays_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (employeeId_ != 0) {
      output.writeInt32(1, employeeId_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (accruedLeaveDays_ != 0F) {
      output.writeFloat(3, accruedLeaveDays_);
    }
    if (requestedLeaveDays_ != 0F) {
      output.writeFloat(4, requestedLeaveDays_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (employeeId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, employeeId_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (accruedLeaveDays_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, accruedLeaveDays_);
    }
    if (requestedLeaveDays_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, requestedLeaveDays_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof work_leave.Employee)) {
      return super.equals(obj);
    }
    work_leave.Employee other = (work_leave.Employee) obj;

    boolean result = true;
    result = result && (getEmployeeId()
        == other.getEmployeeId());
    result = result && getName()
        .equals(other.getName());
    result = result && (
        java.lang.Float.floatToIntBits(getAccruedLeaveDays())
        == java.lang.Float.floatToIntBits(
            other.getAccruedLeaveDays()));
    result = result && (
        java.lang.Float.floatToIntBits(getRequestedLeaveDays())
        == java.lang.Float.floatToIntBits(
            other.getRequestedLeaveDays()));
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + EMPLOYEE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEmployeeId();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + ACCRUED_LEAVE_DAYS_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getAccruedLeaveDays());
    hash = (37 * hash) + REQUESTED_LEAVE_DAYS_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getRequestedLeaveDays());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static work_leave.Employee parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static work_leave.Employee parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static work_leave.Employee parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static work_leave.Employee parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static work_leave.Employee parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static work_leave.Employee parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static work_leave.Employee parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static work_leave.Employee parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static work_leave.Employee parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static work_leave.Employee parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(work_leave.Employee prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Message Type fefinition for an Employee.
   * </pre>
   *
   * Protobuf type {@code work_leave.Employee}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:work_leave.Employee)
      work_leave.EmployeeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return work_leave.WorkLeaveProto.internal_static_work_leave_Employee_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return work_leave.WorkLeaveProto.internal_static_work_leave_Employee_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              work_leave.Employee.class, work_leave.Employee.Builder.class);
    }

    // Construct using work_leave.Employee.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      employeeId_ = 0;

      name_ = "";

      accruedLeaveDays_ = 0F;

      requestedLeaveDays_ = 0F;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return work_leave.WorkLeaveProto.internal_static_work_leave_Employee_descriptor;
    }

    public work_leave.Employee getDefaultInstanceForType() {
      return work_leave.Employee.getDefaultInstance();
    }

    public work_leave.Employee build() {
      work_leave.Employee result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public work_leave.Employee buildPartial() {
      work_leave.Employee result = new work_leave.Employee(this);
      result.employeeId_ = employeeId_;
      result.name_ = name_;
      result.accruedLeaveDays_ = accruedLeaveDays_;
      result.requestedLeaveDays_ = requestedLeaveDays_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof work_leave.Employee) {
        return mergeFrom((work_leave.Employee)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(work_leave.Employee other) {
      if (other == work_leave.Employee.getDefaultInstance()) return this;
      if (other.getEmployeeId() != 0) {
        setEmployeeId(other.getEmployeeId());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getAccruedLeaveDays() != 0F) {
        setAccruedLeaveDays(other.getAccruedLeaveDays());
      }
      if (other.getRequestedLeaveDays() != 0F) {
        setRequestedLeaveDays(other.getRequestedLeaveDays());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      work_leave.Employee parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (work_leave.Employee) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int employeeId_ ;
    /**
     * <code>int32 employee_id = 1;</code>
     */
    public int getEmployeeId() {
      return employeeId_;
    }
    /**
     * <code>int32 employee_id = 1;</code>
     */
    public Builder setEmployeeId(int value) {
      
      employeeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 employee_id = 1;</code>
     */
    public Builder clearEmployeeId() {
      
      employeeId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private float accruedLeaveDays_ ;
    /**
     * <code>float accrued_leave_days = 3;</code>
     */
    public float getAccruedLeaveDays() {
      return accruedLeaveDays_;
    }
    /**
     * <code>float accrued_leave_days = 3;</code>
     */
    public Builder setAccruedLeaveDays(float value) {
      
      accruedLeaveDays_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float accrued_leave_days = 3;</code>
     */
    public Builder clearAccruedLeaveDays() {
      
      accruedLeaveDays_ = 0F;
      onChanged();
      return this;
    }

    private float requestedLeaveDays_ ;
    /**
     * <code>float requested_leave_days = 4;</code>
     */
    public float getRequestedLeaveDays() {
      return requestedLeaveDays_;
    }
    /**
     * <code>float requested_leave_days = 4;</code>
     */
    public Builder setRequestedLeaveDays(float value) {
      
      requestedLeaveDays_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float requested_leave_days = 4;</code>
     */
    public Builder clearRequestedLeaveDays() {
      
      requestedLeaveDays_ = 0F;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:work_leave.Employee)
  }

  // @@protoc_insertion_point(class_scope:work_leave.Employee)
  private static final work_leave.Employee DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new work_leave.Employee();
  }

  public static work_leave.Employee getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Employee>
      PARSER = new com.google.protobuf.AbstractParser<Employee>() {
    public Employee parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Employee(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Employee> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Employee> getParserForType() {
    return PARSER;
  }

  public work_leave.Employee getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

