// source: RpcHeader.proto

package org.apache.hadoop.ipc.protobuf;

public final class RpcHeaderProtos {
  private RpcHeaderProtos() {}
  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   **
   * RpcKind determine the rpcEngine and the serialization of the rpc request
   * </pre>
   *
   * Protobuf enum {@code hadoop.common.RpcKindProto}
   */
  public enum RpcKindProto
      implements org.apache.hadoop.thirdparty.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Used for built in calls by tests
     * </pre>
     *
     * <code>RPC_BUILTIN = 0;</code>
     */
    RPC_BUILTIN(0),
    /**
     * <pre>
     * Use WritableRpcEngine 
     * </pre>
     *
     * <code>RPC_WRITABLE = 1;</code>
     */
    RPC_WRITABLE(1),
    /**
     * <pre>
     * Use ProtobufRpcEngine
     * </pre>
     *
     * <code>RPC_PROTOCOL_BUFFER = 2;</code>
     */
    RPC_PROTOCOL_BUFFER(2),
    ;

    /**
     * <pre>
     * Used for built in calls by tests
     * </pre>
     *
     * <code>RPC_BUILTIN = 0;</code>
     */
    public static final int RPC_BUILTIN_VALUE = 0;
    /**
     * <pre>
     * Use WritableRpcEngine 
     * </pre>
     *
     * <code>RPC_WRITABLE = 1;</code>
     */
    public static final int RPC_WRITABLE_VALUE = 1;
    /**
     * <pre>
     * Use ProtobufRpcEngine
     * </pre>
     *
     * <code>RPC_PROTOCOL_BUFFER = 2;</code>
     */
    public static final int RPC_PROTOCOL_BUFFER_VALUE = 2;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static RpcKindProto valueOf(int value) {
      return forNumber(value);
    }

    public static RpcKindProto forNumber(int value) {
      switch (value) {
        case 0: return RPC_BUILTIN;
        case 1: return RPC_WRITABLE;
        case 2: return RPC_PROTOCOL_BUFFER;
        default: return null;
      }
    }

    public static org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<RpcKindProto>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<
        RpcKindProto> internalValueMap =
          new org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<RpcKindProto>() {
            public RpcKindProto findValueByNumber(int number) {
              return RpcKindProto.forNumber(number);
            }
          };

    public final org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.getDescriptor().getEnumTypes().get(0);
    }

    private static final RpcKindProto[] VALUES = values();

    public static RpcKindProto valueOf(
        org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private RpcKindProto(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:hadoop.common.RpcKindProto)
  }

  public interface RPCTraceInfoProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.RPCTraceInfoProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * parentIdHigh
     * </pre>
     *
     * <code>optional int64 traceId = 1;</code>
     */
    boolean hasTraceId();
    /**
     * <pre>
     * parentIdHigh
     * </pre>
     *
     * <code>optional int64 traceId = 1;</code>
     */
    long getTraceId();

    /**
     * <pre>
     * parentIdLow
     * </pre>
     *
     * <code>optional int64 parentId = 2;</code>
     */
    boolean hasParentId();
    /**
     * <pre>
     * parentIdLow
     * </pre>
     *
     * <code>optional int64 parentId = 2;</code>
     */
    long getParentId();

    /**
     * <pre>
     * Trace SpanContext
     * </pre>
     *
     * <code>optional bytes spanContext = 3;</code>
     */
    boolean hasSpanContext();
    /**
     * <pre>
     * Trace SpanContext
     * </pre>
     *
     * <code>optional bytes spanContext = 3;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString getSpanContext();
  }
  /**
   * <pre>
   **
   * Used to pass through the information necessary to continue
   * a trace after an RPC is made. All we need is the traceid
   * (so we know the overarching trace this message is a part of), and
   * the id of the current span when this message was sent, so we know
   * what span caused the new span we will create when this message is received.
   * </pre>
   *
   * Protobuf type {@code hadoop.common.RPCTraceInfoProto}
   */
  public  static final class RPCTraceInfoProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.RPCTraceInfoProto)
      RPCTraceInfoProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RPCTraceInfoProto.newBuilder() to construct.
    private RPCTraceInfoProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RPCTraceInfoProto() {
      spanContext_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RPCTraceInfoProto(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet.Builder unknownFields =
          org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              bitField0_ |= 0x00000001;
              traceId_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              parentId_ = input.readInt64();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              spanContext_ = input.readBytes();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.internal_static_hadoop_common_RPCTraceInfoProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.internal_static_hadoop_common_RPCTraceInfoProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto.class, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto.Builder.class);
    }

    private int bitField0_;
    public static final int TRACEID_FIELD_NUMBER = 1;
    private long traceId_;
    /**
     * <pre>
     * parentIdHigh
     * </pre>
     *
     * <code>optional int64 traceId = 1;</code>
     */
    public boolean hasTraceId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * parentIdHigh
     * </pre>
     *
     * <code>optional int64 traceId = 1;</code>
     */
    public long getTraceId() {
      return traceId_;
    }

    public static final int PARENTID_FIELD_NUMBER = 2;
    private long parentId_;
    /**
     * <pre>
     * parentIdLow
     * </pre>
     *
     * <code>optional int64 parentId = 2;</code>
     */
    public boolean hasParentId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * parentIdLow
     * </pre>
     *
     * <code>optional int64 parentId = 2;</code>
     */
    public long getParentId() {
      return parentId_;
    }

    public static final int SPANCONTEXT_FIELD_NUMBER = 3;
    private org.apache.hadoop.thirdparty.protobuf.ByteString spanContext_;
    /**
     * <pre>
     * Trace SpanContext
     * </pre>
     *
     * <code>optional bytes spanContext = 3;</code>
     */
    public boolean hasSpanContext() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Trace SpanContext
     * </pre>
     *
     * <code>optional bytes spanContext = 3;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString getSpanContext() {
      return spanContext_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(org.apache.hadoop.thirdparty.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeInt64(1, traceId_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeInt64(2, parentId_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeBytes(3, spanContext_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeInt64Size(1, traceId_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeInt64Size(2, parentId_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeBytesSize(3, spanContext_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto other = (org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto) obj;

      if (hasTraceId() != other.hasTraceId()) return false;
      if (hasTraceId()) {
        if (getTraceId()
            != other.getTraceId()) return false;
      }
      if (hasParentId() != other.hasParentId()) return false;
      if (hasParentId()) {
        if (getParentId()
            != other.getParentId()) return false;
      }
      if (hasSpanContext() != other.hasSpanContext()) return false;
      if (hasSpanContext()) {
        if (!getSpanContext()
            .equals(other.getSpanContext())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasTraceId()) {
        hash = (37 * hash) + TRACEID_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getTraceId());
      }
      if (hasParentId()) {
        hash = (37 * hash) + PARENTID_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getParentId());
      }
      if (hasSpanContext()) {
        hash = (37 * hash) + SPANCONTEXT_FIELD_NUMBER;
        hash = (53 * hash) + getSpanContext().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     **
     * Used to pass through the information necessary to continue
     * a trace after an RPC is made. All we need is the traceid
     * (so we know the overarching trace this message is a part of), and
     * the id of the current span when this message was sent, so we know
     * what span caused the new span we will create when this message is received.
     * </pre>
     *
     * Protobuf type {@code hadoop.common.RPCTraceInfoProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.RPCTraceInfoProto)
        org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.internal_static_hadoop_common_RPCTraceInfoProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.internal_static_hadoop_common_RPCTraceInfoProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto.class, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto.Builder.class);
      }

      // Construct using org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        traceId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        parentId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        spanContext_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.internal_static_hadoop_common_RPCTraceInfoProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto getDefaultInstanceForType() {
        return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto build() {
        org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto buildPartial() {
        org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto result = new org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.traceId_ = traceId_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.parentId_ = parentId_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.spanContext_ = spanContext_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(org.apache.hadoop.thirdparty.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto) {
          return mergeFrom((org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto other) {
        if (other == org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto.getDefaultInstance()) return this;
        if (other.hasTraceId()) {
          setTraceId(other.getTraceId());
        }
        if (other.hasParentId()) {
          setParentId(other.getParentId());
        }
        if (other.hasSpanContext()) {
          setSpanContext(other.getSpanContext());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long traceId_ ;
      /**
       * <pre>
       * parentIdHigh
       * </pre>
       *
       * <code>optional int64 traceId = 1;</code>
       */
      public boolean hasTraceId() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * parentIdHigh
       * </pre>
       *
       * <code>optional int64 traceId = 1;</code>
       */
      public long getTraceId() {
        return traceId_;
      }
      /**
       * <pre>
       * parentIdHigh
       * </pre>
       *
       * <code>optional int64 traceId = 1;</code>
       */
      public Builder setTraceId(long value) {
        bitField0_ |= 0x00000001;
        traceId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * parentIdHigh
       * </pre>
       *
       * <code>optional int64 traceId = 1;</code>
       */
      public Builder clearTraceId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        traceId_ = 0L;
        onChanged();
        return this;
      }

      private long parentId_ ;
      /**
       * <pre>
       * parentIdLow
       * </pre>
       *
       * <code>optional int64 parentId = 2;</code>
       */
      public boolean hasParentId() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * parentIdLow
       * </pre>
       *
       * <code>optional int64 parentId = 2;</code>
       */
      public long getParentId() {
        return parentId_;
      }
      /**
       * <pre>
       * parentIdLow
       * </pre>
       *
       * <code>optional int64 parentId = 2;</code>
       */
      public Builder setParentId(long value) {
        bitField0_ |= 0x00000002;
        parentId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * parentIdLow
       * </pre>
       *
       * <code>optional int64 parentId = 2;</code>
       */
      public Builder clearParentId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        parentId_ = 0L;
        onChanged();
        return this;
      }

      private org.apache.hadoop.thirdparty.protobuf.ByteString spanContext_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       * Trace SpanContext
       * </pre>
       *
       * <code>optional bytes spanContext = 3;</code>
       */
      public boolean hasSpanContext() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * Trace SpanContext
       * </pre>
       *
       * <code>optional bytes spanContext = 3;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString getSpanContext() {
        return spanContext_;
      }
      /**
       * <pre>
       * Trace SpanContext
       * </pre>
       *
       * <code>optional bytes spanContext = 3;</code>
       */
      public Builder setSpanContext(org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        spanContext_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Trace SpanContext
       * </pre>
       *
       * <code>optional bytes spanContext = 3;</code>
       */
      public Builder clearSpanContext() {
        bitField0_ = (bitField0_ & ~0x00000004);
        spanContext_ = getDefaultInstance().getSpanContext();
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:hadoop.common.RPCTraceInfoProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.RPCTraceInfoProto)
    private static final org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto();
    }

    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<RPCTraceInfoProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<RPCTraceInfoProto>() {
      @java.lang.Override
      public RPCTraceInfoProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new RPCTraceInfoProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<RPCTraceInfoProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<RPCTraceInfoProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RPCCallerContextProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.RPCCallerContextProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required string context = 1;</code>
     */
    boolean hasContext();
    /**
     * <code>required string context = 1;</code>
     */
    java.lang.String getContext();
    /**
     * <code>required string context = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getContextBytes();

    /**
     * <code>optional bytes signature = 2;</code>
     */
    boolean hasSignature();
    /**
     * <code>optional bytes signature = 2;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString getSignature();
  }
  /**
   * <pre>
   **
   * Used to pass through the call context entry after an RPC is made.
   * </pre>
   *
   * Protobuf type {@code hadoop.common.RPCCallerContextProto}
   */
  public  static final class RPCCallerContextProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.RPCCallerContextProto)
      RPCCallerContextProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RPCCallerContextProto.newBuilder() to construct.
    private RPCCallerContextProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RPCCallerContextProto() {
      context_ = "";
      signature_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RPCCallerContextProto(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet.Builder unknownFields =
          org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              context_ = bs;
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              signature_ = input.readBytes();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.internal_static_hadoop_common_RPCCallerContextProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.internal_static_hadoop_common_RPCCallerContextProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto.class, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto.Builder.class);
    }

    private int bitField0_;
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private volatile java.lang.Object context_;
    /**
     * <code>required string context = 1;</code>
     */
    public boolean hasContext() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string context = 1;</code>
     */
    public java.lang.String getContext() {
      java.lang.Object ref = context_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          context_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string context = 1;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getContextBytes() {
      java.lang.Object ref = context_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        context_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int SIGNATURE_FIELD_NUMBER = 2;
    private org.apache.hadoop.thirdparty.protobuf.ByteString signature_;
    /**
     * <code>optional bytes signature = 2;</code>
     */
    public boolean hasSignature() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional bytes signature = 2;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString getSignature() {
      return signature_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasContext()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(org.apache.hadoop.thirdparty.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, context_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeBytes(2, signature_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, context_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeBytesSize(2, signature_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto other = (org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto) obj;

      if (hasContext() != other.hasContext()) return false;
      if (hasContext()) {
        if (!getContext()
            .equals(other.getContext())) return false;
      }
      if (hasSignature() != other.hasSignature()) return false;
      if (hasSignature()) {
        if (!getSignature()
            .equals(other.getSignature())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasContext()) {
        hash = (37 * hash) + CONTEXT_FIELD_NUMBER;
        hash = (53 * hash) + getContext().hashCode();
      }
      if (hasSignature()) {
        hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
        hash = (53 * hash) + getSignature().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     **
     * Used to pass through the call context entry after an RPC is made.
     * </pre>
     *
     * Protobuf type {@code hadoop.common.RPCCallerContextProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.RPCCallerContextProto)
        org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.internal_static_hadoop_common_RPCCallerContextProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.internal_static_hadoop_common_RPCCallerContextProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto.class, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto.Builder.class);
      }

      // Construct using org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        context_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        signature_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.internal_static_hadoop_common_RPCCallerContextProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto getDefaultInstanceForType() {
        return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto build() {
        org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto buildPartial() {
        org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto result = new org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.context_ = context_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.signature_ = signature_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(org.apache.hadoop.thirdparty.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto) {
          return mergeFrom((org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto other) {
        if (other == org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto.getDefaultInstance()) return this;
        if (other.hasContext()) {
          bitField0_ |= 0x00000001;
          context_ = other.context_;
          onChanged();
        }
        if (other.hasSignature()) {
          setSignature(other.getSignature());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasContext()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object context_ = "";
      /**
       * <code>required string context = 1;</code>
       */
      public boolean hasContext() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string context = 1;</code>
       */
      public java.lang.String getContext() {
        java.lang.Object ref = context_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            context_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string context = 1;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getContextBytes() {
        java.lang.Object ref = context_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          context_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string context = 1;</code>
       */
      public Builder setContext(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        context_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string context = 1;</code>
       */
      public Builder clearContext() {
        bitField0_ = (bitField0_ & ~0x00000001);
        context_ = getDefaultInstance().getContext();
        onChanged();
        return this;
      }
      /**
       * <code>required string context = 1;</code>
       */
      public Builder setContextBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        context_ = value;
        onChanged();
        return this;
      }

      private org.apache.hadoop.thirdparty.protobuf.ByteString signature_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes signature = 2;</code>
       */
      public boolean hasSignature() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional bytes signature = 2;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString getSignature() {
        return signature_;
      }
      /**
       * <code>optional bytes signature = 2;</code>
       */
      public Builder setSignature(org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        signature_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes signature = 2;</code>
       */
      public Builder clearSignature() {
        bitField0_ = (bitField0_ & ~0x00000002);
        signature_ = getDefaultInstance().getSignature();
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:hadoop.common.RPCCallerContextProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.RPCCallerContextProto)
    private static final org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto();
    }

    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<RPCCallerContextProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<RPCCallerContextProto>() {
      @java.lang.Override
      public RPCCallerContextProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new RPCCallerContextProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<RPCCallerContextProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<RPCCallerContextProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RpcRequestHeaderProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.RpcRequestHeaderProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>optional .hadoop.common.RpcKindProto rpcKind = 1;</code>
     */
    boolean hasRpcKind();
    /**
     * <code>optional .hadoop.common.RpcKindProto rpcKind = 1;</code>
     */
    org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcKindProto getRpcKind();

    /**
     * <code>optional .hadoop.common.RpcRequestHeaderProto.OperationProto rpcOp = 2;</code>
     */
    boolean hasRpcOp();
    /**
     * <code>optional .hadoop.common.RpcRequestHeaderProto.OperationProto rpcOp = 2;</code>
     */
    org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto.OperationProto getRpcOp();

    /**
     * <pre>
     * a sequence number that is sent back in response
     * </pre>
     *
     * <code>required sint32 callId = 3;</code>
     */
    boolean hasCallId();
    /**
     * <pre>
     * a sequence number that is sent back in response
     * </pre>
     *
     * <code>required sint32 callId = 3;</code>
     */
    int getCallId();

    /**
     * <pre>
     * Globally unique client ID
     * </pre>
     *
     * <code>required bytes clientId = 4;</code>
     */
    boolean hasClientId();
    /**
     * <pre>
     * Globally unique client ID
     * </pre>
     *
     * <code>required bytes clientId = 4;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString getClientId();

    /**
     * <pre>
     * clientId + callId uniquely identifies a request
     * retry count, 1 means this is the first retry
     * </pre>
     *
     * <code>optional sint32 retryCount = 5 [default = -1];</code>
     */
    boolean hasRetryCount();
    /**
     * <pre>
     * clientId + callId uniquely identifies a request
     * retry count, 1 means this is the first retry
     * </pre>
     *
     * <code>optional sint32 retryCount = 5 [default = -1];</code>
     */
    int getRetryCount();

    /**
     * <pre>
     * tracing info
     * </pre>
     *
     * <code>optional .hadoop.common.RPCTraceInfoProto traceInfo = 6;</code>
     */
    boolean hasTraceInfo();
    /**
     * <pre>
     * tracing info
     * </pre>
     *
     * <code>optional .hadoop.common.RPCTraceInfoProto traceInfo = 6;</code>
     */
    org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto getTraceInfo();
    /**
     * <pre>
     * tracing info
     * </pre>
     *
     * <code>optional .hadoop.common.RPCTraceInfoProto traceInfo = 6;</code>
     */
    org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProtoOrBuilder getTraceInfoOrBuilder();

    /**
     * <pre>
     * call context
     * </pre>
     *
     * <code>optional .hadoop.common.RPCCallerContextProto callerContext = 7;</code>
     */
    boolean hasCallerContext();
    /**
     * <pre>
     * call context
     * </pre>
     *
     * <code>optional .hadoop.common.RPCCallerContextProto callerContext = 7;</code>
     */
    org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto getCallerContext();
    /**
     * <pre>
     * call context
     * </pre>
     *
     * <code>optional .hadoop.common.RPCCallerContextProto callerContext = 7;</code>
     */
    org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProtoOrBuilder getCallerContextOrBuilder();

    /**
     * <pre>
     * The last seen Global State ID
     * </pre>
     *
     * <code>optional int64 stateId = 8;</code>
     */
    boolean hasStateId();
    /**
     * <pre>
     * The last seen Global State ID
     * </pre>
     *
     * <code>optional int64 stateId = 8;</code>
     */
    long getStateId();
  }
  /**
   * <pre>
   * the header for the RpcRequest
   * </pre>
   *
   * Protobuf type {@code hadoop.common.RpcRequestHeaderProto}
   */
  public  static final class RpcRequestHeaderProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.RpcRequestHeaderProto)
      RpcRequestHeaderProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RpcRequestHeaderProto.newBuilder() to construct.
    private RpcRequestHeaderProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RpcRequestHeaderProto() {
      rpcKind_ = 0;
      rpcOp_ = 0;
      clientId_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
      retryCount_ = -1;
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RpcRequestHeaderProto(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet.Builder unknownFields =
          org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
              org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcKindProto value = org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcKindProto.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                rpcKind_ = rawValue;
              }
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
              org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto.OperationProto value = org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto.OperationProto.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                rpcOp_ = rawValue;
              }
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              callId_ = input.readSInt32();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              clientId_ = input.readBytes();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              retryCount_ = input.readSInt32();
              break;
            }
            case 50: {
              org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000020) != 0)) {
                subBuilder = traceInfo_.toBuilder();
              }
              traceInfo_ = input.readMessage(org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(traceInfo_);
                traceInfo_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000020;
              break;
            }
            case 58: {
              org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000040) != 0)) {
                subBuilder = callerContext_.toBuilder();
              }
              callerContext_ = input.readMessage(org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(callerContext_);
                callerContext_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000040;
              break;
            }
            case 64: {
              bitField0_ |= 0x00000080;
              stateId_ = input.readInt64();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.internal_static_hadoop_common_RpcRequestHeaderProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.internal_static_hadoop_common_RpcRequestHeaderProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto.class, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto.Builder.class);
    }

    /**
     * Protobuf enum {@code hadoop.common.RpcRequestHeaderProto.OperationProto}
     */
    public enum OperationProto
        implements org.apache.hadoop.thirdparty.protobuf.ProtocolMessageEnum {
      /**
       * <pre>
       * The final RPC Packet
       * </pre>
       *
       * <code>RPC_FINAL_PACKET = 0;</code>
       */
      RPC_FINAL_PACKET(0),
      /**
       * <pre>
       * not implemented yet
       * </pre>
       *
       * <code>RPC_CONTINUATION_PACKET = 1;</code>
       */
      RPC_CONTINUATION_PACKET(1),
      /**
       * <pre>
       * close the rpc connection
       * </pre>
       *
       * <code>RPC_CLOSE_CONNECTION = 2;</code>
       */
      RPC_CLOSE_CONNECTION(2),
      ;

      /**
       * <pre>
       * The final RPC Packet
       * </pre>
       *
       * <code>RPC_FINAL_PACKET = 0;</code>
       */
      public static final int RPC_FINAL_PACKET_VALUE = 0;
      /**
       * <pre>
       * not implemented yet
       * </pre>
       *
       * <code>RPC_CONTINUATION_PACKET = 1;</code>
       */
      public static final int RPC_CONTINUATION_PACKET_VALUE = 1;
      /**
       * <pre>
       * close the rpc connection
       * </pre>
       *
       * <code>RPC_CLOSE_CONNECTION = 2;</code>
       */
      public static final int RPC_CLOSE_CONNECTION_VALUE = 2;


      public final int getNumber() {
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static OperationProto valueOf(int value) {
        return forNumber(value);
      }

      public static OperationProto forNumber(int value) {
        switch (value) {
          case 0: return RPC_FINAL_PACKET;
          case 1: return RPC_CONTINUATION_PACKET;
          case 2: return RPC_CLOSE_CONNECTION;
          default: return null;
        }
      }

      public static org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<OperationProto>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<
          OperationProto> internalValueMap =
            new org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<OperationProto>() {
              public OperationProto findValueByNumber(int number) {
                return OperationProto.forNumber(number);
              }
            };

      public final org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto.getDescriptor().getEnumTypes().get(0);
      }

      private static final OperationProto[] VALUES = values();

      public static OperationProto valueOf(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private OperationProto(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:hadoop.common.RpcRequestHeaderProto.OperationProto)
    }

    private int bitField0_;
    public static final int RPCKIND_FIELD_NUMBER = 1;
    private int rpcKind_;
    /**
     * <code>optional .hadoop.common.RpcKindProto rpcKind = 1;</code>
     */
    public boolean hasRpcKind() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .hadoop.common.RpcKindProto rpcKind = 1;</code>
     */
    public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcKindProto getRpcKind() {
      @SuppressWarnings("deprecation")
      org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcKindProto result = org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcKindProto.valueOf(rpcKind_);
      return result == null ? org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcKindProto.RPC_BUILTIN : result;
    }

    public static final int RPCOP_FIELD_NUMBER = 2;
    private int rpcOp_;
    /**
     * <code>optional .hadoop.common.RpcRequestHeaderProto.OperationProto rpcOp = 2;</code>
     */
    public boolean hasRpcOp() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .hadoop.common.RpcRequestHeaderProto.OperationProto rpcOp = 2;</code>
     */
    public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto.OperationProto getRpcOp() {
      @SuppressWarnings("deprecation")
      org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto.OperationProto result = org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto.OperationProto.valueOf(rpcOp_);
      return result == null ? org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto.OperationProto.RPC_FINAL_PACKET : result;
    }

    public static final int CALLID_FIELD_NUMBER = 3;
    private int callId_;
    /**
     * <pre>
     * a sequence number that is sent back in response
     * </pre>
     *
     * <code>required sint32 callId = 3;</code>
     */
    public boolean hasCallId() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * a sequence number that is sent back in response
     * </pre>
     *
     * <code>required sint32 callId = 3;</code>
     */
    public int getCallId() {
      return callId_;
    }

    public static final int CLIENTID_FIELD_NUMBER = 4;
    private org.apache.hadoop.thirdparty.protobuf.ByteString clientId_;
    /**
     * <pre>
     * Globally unique client ID
     * </pre>
     *
     * <code>required bytes clientId = 4;</code>
     */
    public boolean hasClientId() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Globally unique client ID
     * </pre>
     *
     * <code>required bytes clientId = 4;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString getClientId() {
      return clientId_;
    }

    public static final int RETRYCOUNT_FIELD_NUMBER = 5;
    private int retryCount_;
    /**
     * <pre>
     * clientId + callId uniquely identifies a request
     * retry count, 1 means this is the first retry
     * </pre>
     *
     * <code>optional sint32 retryCount = 5 [default = -1];</code>
     */
    public boolean hasRetryCount() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * clientId + callId uniquely identifies a request
     * retry count, 1 means this is the first retry
     * </pre>
     *
     * <code>optional sint32 retryCount = 5 [default = -1];</code>
     */
    public int getRetryCount() {
      return retryCount_;
    }

    public static final int TRACEINFO_FIELD_NUMBER = 6;
    private org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto traceInfo_;
    /**
     * <pre>
     * tracing info
     * </pre>
     *
     * <code>optional .hadoop.common.RPCTraceInfoProto traceInfo = 6;</code>
     */
    public boolean hasTraceInfo() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <pre>
     * tracing info
     * </pre>
     *
     * <code>optional .hadoop.common.RPCTraceInfoProto traceInfo = 6;</code>
     */
    public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto getTraceInfo() {
      return traceInfo_ == null ? org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto.getDefaultInstance() : traceInfo_;
    }
    /**
     * <pre>
     * tracing info
     * </pre>
     *
     * <code>optional .hadoop.common.RPCTraceInfoProto traceInfo = 6;</code>
     */
    public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProtoOrBuilder getTraceInfoOrBuilder() {
      return traceInfo_ == null ? org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto.getDefaultInstance() : traceInfo_;
    }

    public static final int CALLERCONTEXT_FIELD_NUMBER = 7;
    private org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto callerContext_;
    /**
     * <pre>
     * call context
     * </pre>
     *
     * <code>optional .hadoop.common.RPCCallerContextProto callerContext = 7;</code>
     */
    public boolean hasCallerContext() {
      return ((bitField0_ & 0x00000040) != 0);
    }
    /**
     * <pre>
     * call context
     * </pre>
     *
     * <code>optional .hadoop.common.RPCCallerContextProto callerContext = 7;</code>
     */
    public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto getCallerContext() {
      return callerContext_ == null ? org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto.getDefaultInstance() : callerContext_;
    }
    /**
     * <pre>
     * call context
     * </pre>
     *
     * <code>optional .hadoop.common.RPCCallerContextProto callerContext = 7;</code>
     */
    public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProtoOrBuilder getCallerContextOrBuilder() {
      return callerContext_ == null ? org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto.getDefaultInstance() : callerContext_;
    }

    public static final int STATEID_FIELD_NUMBER = 8;
    private long stateId_;
    /**
     * <pre>
     * The last seen Global State ID
     * </pre>
     *
     * <code>optional int64 stateId = 8;</code>
     */
    public boolean hasStateId() {
      return ((bitField0_ & 0x00000080) != 0);
    }
    /**
     * <pre>
     * The last seen Global State ID
     * </pre>
     *
     * <code>optional int64 stateId = 8;</code>
     */
    public long getStateId() {
      return stateId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasCallId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasClientId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasCallerContext()) {
        if (!getCallerContext().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(org.apache.hadoop.thirdparty.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeEnum(1, rpcKind_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeEnum(2, rpcOp_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeSInt32(3, callId_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeBytes(4, clientId_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        output.writeSInt32(5, retryCount_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        output.writeMessage(6, getTraceInfo());
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        output.writeMessage(7, getCallerContext());
      }
      if (((bitField0_ & 0x00000080) != 0)) {
        output.writeInt64(8, stateId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeEnumSize(1, rpcKind_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeEnumSize(2, rpcOp_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeSInt32Size(3, callId_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeBytesSize(4, clientId_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeSInt32Size(5, retryCount_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(6, getTraceInfo());
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(7, getCallerContext());
      }
      if (((bitField0_ & 0x00000080) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeInt64Size(8, stateId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto other = (org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto) obj;

      if (hasRpcKind() != other.hasRpcKind()) return false;
      if (hasRpcKind()) {
        if (rpcKind_ != other.rpcKind_) return false;
      }
      if (hasRpcOp() != other.hasRpcOp()) return false;
      if (hasRpcOp()) {
        if (rpcOp_ != other.rpcOp_) return false;
      }
      if (hasCallId() != other.hasCallId()) return false;
      if (hasCallId()) {
        if (getCallId()
            != other.getCallId()) return false;
      }
      if (hasClientId() != other.hasClientId()) return false;
      if (hasClientId()) {
        if (!getClientId()
            .equals(other.getClientId())) return false;
      }
      if (hasRetryCount() != other.hasRetryCount()) return false;
      if (hasRetryCount()) {
        if (getRetryCount()
            != other.getRetryCount()) return false;
      }
      if (hasTraceInfo() != other.hasTraceInfo()) return false;
      if (hasTraceInfo()) {
        if (!getTraceInfo()
            .equals(other.getTraceInfo())) return false;
      }
      if (hasCallerContext() != other.hasCallerContext()) return false;
      if (hasCallerContext()) {
        if (!getCallerContext()
            .equals(other.getCallerContext())) return false;
      }
      if (hasStateId() != other.hasStateId()) return false;
      if (hasStateId()) {
        if (getStateId()
            != other.getStateId()) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasRpcKind()) {
        hash = (37 * hash) + RPCKIND_FIELD_NUMBER;
        hash = (53 * hash) + rpcKind_;
      }
      if (hasRpcOp()) {
        hash = (37 * hash) + RPCOP_FIELD_NUMBER;
        hash = (53 * hash) + rpcOp_;
      }
      if (hasCallId()) {
        hash = (37 * hash) + CALLID_FIELD_NUMBER;
        hash = (53 * hash) + getCallId();
      }
      if (hasClientId()) {
        hash = (37 * hash) + CLIENTID_FIELD_NUMBER;
        hash = (53 * hash) + getClientId().hashCode();
      }
      if (hasRetryCount()) {
        hash = (37 * hash) + RETRYCOUNT_FIELD_NUMBER;
        hash = (53 * hash) + getRetryCount();
      }
      if (hasTraceInfo()) {
        hash = (37 * hash) + TRACEINFO_FIELD_NUMBER;
        hash = (53 * hash) + getTraceInfo().hashCode();
      }
      if (hasCallerContext()) {
        hash = (37 * hash) + CALLERCONTEXT_FIELD_NUMBER;
        hash = (53 * hash) + getCallerContext().hashCode();
      }
      if (hasStateId()) {
        hash = (37 * hash) + STATEID_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getStateId());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * the header for the RpcRequest
     * </pre>
     *
     * Protobuf type {@code hadoop.common.RpcRequestHeaderProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.RpcRequestHeaderProto)
        org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.internal_static_hadoop_common_RpcRequestHeaderProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.internal_static_hadoop_common_RpcRequestHeaderProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto.class, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto.Builder.class);
      }

      // Construct using org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getTraceInfoFieldBuilder();
          getCallerContextFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        rpcKind_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        rpcOp_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        callId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        clientId_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        retryCount_ = -1;
        bitField0_ = (bitField0_ & ~0x00000010);
        if (traceInfoBuilder_ == null) {
          traceInfo_ = null;
        } else {
          traceInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000020);
        if (callerContextBuilder_ == null) {
          callerContext_ = null;
        } else {
          callerContextBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000040);
        stateId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000080);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.internal_static_hadoop_common_RpcRequestHeaderProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto getDefaultInstanceForType() {
        return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto build() {
        org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto buildPartial() {
        org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto result = new org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.rpcKind_ = rpcKind_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.rpcOp_ = rpcOp_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.callId_ = callId_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          to_bitField0_ |= 0x00000008;
        }
        result.clientId_ = clientId_;
        if (((from_bitField0_ & 0x00000010) != 0)) {
          to_bitField0_ |= 0x00000010;
        }
        result.retryCount_ = retryCount_;
        if (((from_bitField0_ & 0x00000020) != 0)) {
          if (traceInfoBuilder_ == null) {
            result.traceInfo_ = traceInfo_;
          } else {
            result.traceInfo_ = traceInfoBuilder_.build();
          }
          to_bitField0_ |= 0x00000020;
        }
        if (((from_bitField0_ & 0x00000040) != 0)) {
          if (callerContextBuilder_ == null) {
            result.callerContext_ = callerContext_;
          } else {
            result.callerContext_ = callerContextBuilder_.build();
          }
          to_bitField0_ |= 0x00000040;
        }
        if (((from_bitField0_ & 0x00000080) != 0)) {
          result.stateId_ = stateId_;
          to_bitField0_ |= 0x00000080;
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(org.apache.hadoop.thirdparty.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto) {
          return mergeFrom((org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto other) {
        if (other == org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto.getDefaultInstance()) return this;
        if (other.hasRpcKind()) {
          setRpcKind(other.getRpcKind());
        }
        if (other.hasRpcOp()) {
          setRpcOp(other.getRpcOp());
        }
        if (other.hasCallId()) {
          setCallId(other.getCallId());
        }
        if (other.hasClientId()) {
          setClientId(other.getClientId());
        }
        if (other.hasRetryCount()) {
          setRetryCount(other.getRetryCount());
        }
        if (other.hasTraceInfo()) {
          mergeTraceInfo(other.getTraceInfo());
        }
        if (other.hasCallerContext()) {
          mergeCallerContext(other.getCallerContext());
        }
        if (other.hasStateId()) {
          setStateId(other.getStateId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasCallId()) {
          return false;
        }
        if (!hasClientId()) {
          return false;
        }
        if (hasCallerContext()) {
          if (!getCallerContext().isInitialized()) {
            return false;
          }
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int rpcKind_ = 0;
      /**
       * <code>optional .hadoop.common.RpcKindProto rpcKind = 1;</code>
       */
      public boolean hasRpcKind() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional .hadoop.common.RpcKindProto rpcKind = 1;</code>
       */
      public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcKindProto getRpcKind() {
        @SuppressWarnings("deprecation")
        org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcKindProto result = org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcKindProto.valueOf(rpcKind_);
        return result == null ? org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcKindProto.RPC_BUILTIN : result;
      }
      /**
       * <code>optional .hadoop.common.RpcKindProto rpcKind = 1;</code>
       */
      public Builder setRpcKind(org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcKindProto value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        rpcKind_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional .hadoop.common.RpcKindProto rpcKind = 1;</code>
       */
      public Builder clearRpcKind() {
        bitField0_ = (bitField0_ & ~0x00000001);
        rpcKind_ = 0;
        onChanged();
        return this;
      }

      private int rpcOp_ = 0;
      /**
       * <code>optional .hadoop.common.RpcRequestHeaderProto.OperationProto rpcOp = 2;</code>
       */
      public boolean hasRpcOp() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional .hadoop.common.RpcRequestHeaderProto.OperationProto rpcOp = 2;</code>
       */
      public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto.OperationProto getRpcOp() {
        @SuppressWarnings("deprecation")
        org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto.OperationProto result = org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto.OperationProto.valueOf(rpcOp_);
        return result == null ? org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto.OperationProto.RPC_FINAL_PACKET : result;
      }
      /**
       * <code>optional .hadoop.common.RpcRequestHeaderProto.OperationProto rpcOp = 2;</code>
       */
      public Builder setRpcOp(org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto.OperationProto value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        rpcOp_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional .hadoop.common.RpcRequestHeaderProto.OperationProto rpcOp = 2;</code>
       */
      public Builder clearRpcOp() {
        bitField0_ = (bitField0_ & ~0x00000002);
        rpcOp_ = 0;
        onChanged();
        return this;
      }

      private int callId_ ;
      /**
       * <pre>
       * a sequence number that is sent back in response
       * </pre>
       *
       * <code>required sint32 callId = 3;</code>
       */
      public boolean hasCallId() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * a sequence number that is sent back in response
       * </pre>
       *
       * <code>required sint32 callId = 3;</code>
       */
      public int getCallId() {
        return callId_;
      }
      /**
       * <pre>
       * a sequence number that is sent back in response
       * </pre>
       *
       * <code>required sint32 callId = 3;</code>
       */
      public Builder setCallId(int value) {
        bitField0_ |= 0x00000004;
        callId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * a sequence number that is sent back in response
       * </pre>
       *
       * <code>required sint32 callId = 3;</code>
       */
      public Builder clearCallId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        callId_ = 0;
        onChanged();
        return this;
      }

      private org.apache.hadoop.thirdparty.protobuf.ByteString clientId_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       * Globally unique client ID
       * </pre>
       *
       * <code>required bytes clientId = 4;</code>
       */
      public boolean hasClientId() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <pre>
       * Globally unique client ID
       * </pre>
       *
       * <code>required bytes clientId = 4;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString getClientId() {
        return clientId_;
      }
      /**
       * <pre>
       * Globally unique client ID
       * </pre>
       *
       * <code>required bytes clientId = 4;</code>
       */
      public Builder setClientId(org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        clientId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Globally unique client ID
       * </pre>
       *
       * <code>required bytes clientId = 4;</code>
       */
      public Builder clearClientId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        clientId_ = getDefaultInstance().getClientId();
        onChanged();
        return this;
      }

      private int retryCount_ = -1;
      /**
       * <pre>
       * clientId + callId uniquely identifies a request
       * retry count, 1 means this is the first retry
       * </pre>
       *
       * <code>optional sint32 retryCount = 5 [default = -1];</code>
       */
      public boolean hasRetryCount() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <pre>
       * clientId + callId uniquely identifies a request
       * retry count, 1 means this is the first retry
       * </pre>
       *
       * <code>optional sint32 retryCount = 5 [default = -1];</code>
       */
      public int getRetryCount() {
        return retryCount_;
      }
      /**
       * <pre>
       * clientId + callId uniquely identifies a request
       * retry count, 1 means this is the first retry
       * </pre>
       *
       * <code>optional sint32 retryCount = 5 [default = -1];</code>
       */
      public Builder setRetryCount(int value) {
        bitField0_ |= 0x00000010;
        retryCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * clientId + callId uniquely identifies a request
       * retry count, 1 means this is the first retry
       * </pre>
       *
       * <code>optional sint32 retryCount = 5 [default = -1];</code>
       */
      public Builder clearRetryCount() {
        bitField0_ = (bitField0_ & ~0x00000010);
        retryCount_ = -1;
        onChanged();
        return this;
      }

      private org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto traceInfo_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto.Builder, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProtoOrBuilder> traceInfoBuilder_;
      /**
       * <pre>
       * tracing info
       * </pre>
       *
       * <code>optional .hadoop.common.RPCTraceInfoProto traceInfo = 6;</code>
       */
      public boolean hasTraceInfo() {
        return ((bitField0_ & 0x00000020) != 0);
      }
      /**
       * <pre>
       * tracing info
       * </pre>
       *
       * <code>optional .hadoop.common.RPCTraceInfoProto traceInfo = 6;</code>
       */
      public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto getTraceInfo() {
        if (traceInfoBuilder_ == null) {
          return traceInfo_ == null ? org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto.getDefaultInstance() : traceInfo_;
        } else {
          return traceInfoBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * tracing info
       * </pre>
       *
       * <code>optional .hadoop.common.RPCTraceInfoProto traceInfo = 6;</code>
       */
      public Builder setTraceInfo(org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto value) {
        if (traceInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          traceInfo_ = value;
          onChanged();
        } else {
          traceInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000020;
        return this;
      }
      /**
       * <pre>
       * tracing info
       * </pre>
       *
       * <code>optional .hadoop.common.RPCTraceInfoProto traceInfo = 6;</code>
       */
      public Builder setTraceInfo(
          org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto.Builder builderForValue) {
        if (traceInfoBuilder_ == null) {
          traceInfo_ = builderForValue.build();
          onChanged();
        } else {
          traceInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000020;
        return this;
      }
      /**
       * <pre>
       * tracing info
       * </pre>
       *
       * <code>optional .hadoop.common.RPCTraceInfoProto traceInfo = 6;</code>
       */
      public Builder mergeTraceInfo(org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto value) {
        if (traceInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000020) != 0) &&
              traceInfo_ != null &&
              traceInfo_ != org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto.getDefaultInstance()) {
            traceInfo_ =
              org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto.newBuilder(traceInfo_).mergeFrom(value).buildPartial();
          } else {
            traceInfo_ = value;
          }
          onChanged();
        } else {
          traceInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000020;
        return this;
      }
      /**
       * <pre>
       * tracing info
       * </pre>
       *
       * <code>optional .hadoop.common.RPCTraceInfoProto traceInfo = 6;</code>
       */
      public Builder clearTraceInfo() {
        if (traceInfoBuilder_ == null) {
          traceInfo_ = null;
          onChanged();
        } else {
          traceInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }
      /**
       * <pre>
       * tracing info
       * </pre>
       *
       * <code>optional .hadoop.common.RPCTraceInfoProto traceInfo = 6;</code>
       */
      public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto.Builder getTraceInfoBuilder() {
        bitField0_ |= 0x00000020;
        onChanged();
        return getTraceInfoFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * tracing info
       * </pre>
       *
       * <code>optional .hadoop.common.RPCTraceInfoProto traceInfo = 6;</code>
       */
      public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProtoOrBuilder getTraceInfoOrBuilder() {
        if (traceInfoBuilder_ != null) {
          return traceInfoBuilder_.getMessageOrBuilder();
        } else {
          return traceInfo_ == null ?
              org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto.getDefaultInstance() : traceInfo_;
        }
      }
      /**
       * <pre>
       * tracing info
       * </pre>
       *
       * <code>optional .hadoop.common.RPCTraceInfoProto traceInfo = 6;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto.Builder, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProtoOrBuilder> 
          getTraceInfoFieldBuilder() {
        if (traceInfoBuilder_ == null) {
          traceInfoBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProto.Builder, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCTraceInfoProtoOrBuilder>(
                  getTraceInfo(),
                  getParentForChildren(),
                  isClean());
          traceInfo_ = null;
        }
        return traceInfoBuilder_;
      }

      private org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto callerContext_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto.Builder, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProtoOrBuilder> callerContextBuilder_;
      /**
       * <pre>
       * call context
       * </pre>
       *
       * <code>optional .hadoop.common.RPCCallerContextProto callerContext = 7;</code>
       */
      public boolean hasCallerContext() {
        return ((bitField0_ & 0x00000040) != 0);
      }
      /**
       * <pre>
       * call context
       * </pre>
       *
       * <code>optional .hadoop.common.RPCCallerContextProto callerContext = 7;</code>
       */
      public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto getCallerContext() {
        if (callerContextBuilder_ == null) {
          return callerContext_ == null ? org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto.getDefaultInstance() : callerContext_;
        } else {
          return callerContextBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * call context
       * </pre>
       *
       * <code>optional .hadoop.common.RPCCallerContextProto callerContext = 7;</code>
       */
      public Builder setCallerContext(org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto value) {
        if (callerContextBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          callerContext_ = value;
          onChanged();
        } else {
          callerContextBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000040;
        return this;
      }
      /**
       * <pre>
       * call context
       * </pre>
       *
       * <code>optional .hadoop.common.RPCCallerContextProto callerContext = 7;</code>
       */
      public Builder setCallerContext(
          org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto.Builder builderForValue) {
        if (callerContextBuilder_ == null) {
          callerContext_ = builderForValue.build();
          onChanged();
        } else {
          callerContextBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000040;
        return this;
      }
      /**
       * <pre>
       * call context
       * </pre>
       *
       * <code>optional .hadoop.common.RPCCallerContextProto callerContext = 7;</code>
       */
      public Builder mergeCallerContext(org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto value) {
        if (callerContextBuilder_ == null) {
          if (((bitField0_ & 0x00000040) != 0) &&
              callerContext_ != null &&
              callerContext_ != org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto.getDefaultInstance()) {
            callerContext_ =
              org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto.newBuilder(callerContext_).mergeFrom(value).buildPartial();
          } else {
            callerContext_ = value;
          }
          onChanged();
        } else {
          callerContextBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000040;
        return this;
      }
      /**
       * <pre>
       * call context
       * </pre>
       *
       * <code>optional .hadoop.common.RPCCallerContextProto callerContext = 7;</code>
       */
      public Builder clearCallerContext() {
        if (callerContextBuilder_ == null) {
          callerContext_ = null;
          onChanged();
        } else {
          callerContextBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }
      /**
       * <pre>
       * call context
       * </pre>
       *
       * <code>optional .hadoop.common.RPCCallerContextProto callerContext = 7;</code>
       */
      public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto.Builder getCallerContextBuilder() {
        bitField0_ |= 0x00000040;
        onChanged();
        return getCallerContextFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * call context
       * </pre>
       *
       * <code>optional .hadoop.common.RPCCallerContextProto callerContext = 7;</code>
       */
      public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProtoOrBuilder getCallerContextOrBuilder() {
        if (callerContextBuilder_ != null) {
          return callerContextBuilder_.getMessageOrBuilder();
        } else {
          return callerContext_ == null ?
              org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto.getDefaultInstance() : callerContext_;
        }
      }
      /**
       * <pre>
       * call context
       * </pre>
       *
       * <code>optional .hadoop.common.RPCCallerContextProto callerContext = 7;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto.Builder, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProtoOrBuilder> 
          getCallerContextFieldBuilder() {
        if (callerContextBuilder_ == null) {
          callerContextBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProto.Builder, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RPCCallerContextProtoOrBuilder>(
                  getCallerContext(),
                  getParentForChildren(),
                  isClean());
          callerContext_ = null;
        }
        return callerContextBuilder_;
      }

      private long stateId_ ;
      /**
       * <pre>
       * The last seen Global State ID
       * </pre>
       *
       * <code>optional int64 stateId = 8;</code>
       */
      public boolean hasStateId() {
        return ((bitField0_ & 0x00000080) != 0);
      }
      /**
       * <pre>
       * The last seen Global State ID
       * </pre>
       *
       * <code>optional int64 stateId = 8;</code>
       */
      public long getStateId() {
        return stateId_;
      }
      /**
       * <pre>
       * The last seen Global State ID
       * </pre>
       *
       * <code>optional int64 stateId = 8;</code>
       */
      public Builder setStateId(long value) {
        bitField0_ |= 0x00000080;
        stateId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The last seen Global State ID
       * </pre>
       *
       * <code>optional int64 stateId = 8;</code>
       */
      public Builder clearStateId() {
        bitField0_ = (bitField0_ & ~0x00000080);
        stateId_ = 0L;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:hadoop.common.RpcRequestHeaderProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.RpcRequestHeaderProto)
    private static final org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto();
    }

    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<RpcRequestHeaderProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<RpcRequestHeaderProto>() {
      @java.lang.Override
      public RpcRequestHeaderProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new RpcRequestHeaderProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<RpcRequestHeaderProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<RpcRequestHeaderProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcRequestHeaderProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RpcResponseHeaderProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.RpcResponseHeaderProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * callId used in Request
     * </pre>
     *
     * <code>required uint32 callId = 1;</code>
     */
    boolean hasCallId();
    /**
     * <pre>
     * callId used in Request
     * </pre>
     *
     * <code>required uint32 callId = 1;</code>
     */
    int getCallId();

    /**
     * <code>required .hadoop.common.RpcResponseHeaderProto.RpcStatusProto status = 2;</code>
     */
    boolean hasStatus();
    /**
     * <code>required .hadoop.common.RpcResponseHeaderProto.RpcStatusProto status = 2;</code>
     */
    org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.RpcStatusProto getStatus();

    /**
     * <pre>
     * Sent if success or fail
     * </pre>
     *
     * <code>optional uint32 serverIpcVersionNum = 3;</code>
     */
    boolean hasServerIpcVersionNum();
    /**
     * <pre>
     * Sent if success or fail
     * </pre>
     *
     * <code>optional uint32 serverIpcVersionNum = 3;</code>
     */
    int getServerIpcVersionNum();

    /**
     * <pre>
     * if request fails
     * </pre>
     *
     * <code>optional string exceptionClassName = 4;</code>
     */
    boolean hasExceptionClassName();
    /**
     * <pre>
     * if request fails
     * </pre>
     *
     * <code>optional string exceptionClassName = 4;</code>
     */
    java.lang.String getExceptionClassName();
    /**
     * <pre>
     * if request fails
     * </pre>
     *
     * <code>optional string exceptionClassName = 4;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getExceptionClassNameBytes();

    /**
     * <pre>
     * if request fails, often contains strack trace
     * </pre>
     *
     * <code>optional string errorMsg = 5;</code>
     */
    boolean hasErrorMsg();
    /**
     * <pre>
     * if request fails, often contains strack trace
     * </pre>
     *
     * <code>optional string errorMsg = 5;</code>
     */
    java.lang.String getErrorMsg();
    /**
     * <pre>
     * if request fails, often contains strack trace
     * </pre>
     *
     * <code>optional string errorMsg = 5;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getErrorMsgBytes();

    /**
     * <pre>
     * in case of error
     * </pre>
     *
     * <code>optional .hadoop.common.RpcResponseHeaderProto.RpcErrorCodeProto errorDetail = 6;</code>
     */
    boolean hasErrorDetail();
    /**
     * <pre>
     * in case of error
     * </pre>
     *
     * <code>optional .hadoop.common.RpcResponseHeaderProto.RpcErrorCodeProto errorDetail = 6;</code>
     */
    org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.RpcErrorCodeProto getErrorDetail();

    /**
     * <pre>
     * Globally unique client ID
     * </pre>
     *
     * <code>optional bytes clientId = 7;</code>
     */
    boolean hasClientId();
    /**
     * <pre>
     * Globally unique client ID
     * </pre>
     *
     * <code>optional bytes clientId = 7;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString getClientId();

    /**
     * <code>optional sint32 retryCount = 8 [default = -1];</code>
     */
    boolean hasRetryCount();
    /**
     * <code>optional sint32 retryCount = 8 [default = -1];</code>
     */
    int getRetryCount();

    /**
     * <pre>
     * The last written Global State ID
     * </pre>
     *
     * <code>optional int64 stateId = 9;</code>
     */
    boolean hasStateId();
    /**
     * <pre>
     * The last written Global State ID
     * </pre>
     *
     * <code>optional int64 stateId = 9;</code>
     */
    long getStateId();
  }
  /**
   * <pre>
   **
   * Rpc Response Header
   * +------------------------------------------------------------------+
   * | Rpc total response length in bytes (4 bytes int)                 |
   * |  (sum of next two parts)                                         |
   * +------------------------------------------------------------------+
   * | RpcResponseHeaderProto - serialized delimited ie has len         |
   * +------------------------------------------------------------------+
   * | if request is successful:                                        |
   * |   - RpcResponse -  The actual rpc response  bytes follow         |
   * |     the response header                                          |
   * |     This response is serialized based on RpcKindProto            |
   * | if request fails :                                               |
   * |   The rpc response header contains the necessary info            |
   * +------------------------------------------------------------------+
   * Note that rpc response header is also used when connection setup fails. 
   * Ie the response looks like a rpc response with a fake callId.
   * </pre>
   *
   * Protobuf type {@code hadoop.common.RpcResponseHeaderProto}
   */
  public  static final class RpcResponseHeaderProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.RpcResponseHeaderProto)
      RpcResponseHeaderProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RpcResponseHeaderProto.newBuilder() to construct.
    private RpcResponseHeaderProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RpcResponseHeaderProto() {
      status_ = 0;
      exceptionClassName_ = "";
      errorMsg_ = "";
      errorDetail_ = 1;
      clientId_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
      retryCount_ = -1;
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RpcResponseHeaderProto(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet.Builder unknownFields =
          org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              bitField0_ |= 0x00000001;
              callId_ = input.readUInt32();
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
              org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.RpcStatusProto value = org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.RpcStatusProto.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                status_ = rawValue;
              }
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              serverIpcVersionNum_ = input.readUInt32();
              break;
            }
            case 34: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              exceptionClassName_ = bs;
              break;
            }
            case 42: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000010;
              errorMsg_ = bs;
              break;
            }
            case 48: {
              int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
              org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.RpcErrorCodeProto value = org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.RpcErrorCodeProto.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(6, rawValue);
              } else {
                bitField0_ |= 0x00000020;
                errorDetail_ = rawValue;
              }
              break;
            }
            case 58: {
              bitField0_ |= 0x00000040;
              clientId_ = input.readBytes();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000080;
              retryCount_ = input.readSInt32();
              break;
            }
            case 72: {
              bitField0_ |= 0x00000100;
              stateId_ = input.readInt64();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.internal_static_hadoop_common_RpcResponseHeaderProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.internal_static_hadoop_common_RpcResponseHeaderProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.class, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.Builder.class);
    }

    /**
     * Protobuf enum {@code hadoop.common.RpcResponseHeaderProto.RpcStatusProto}
     */
    public enum RpcStatusProto
        implements org.apache.hadoop.thirdparty.protobuf.ProtocolMessageEnum {
      /**
       * <pre>
       * RPC succeeded
       * </pre>
       *
       * <code>SUCCESS = 0;</code>
       */
      SUCCESS(0),
      /**
       * <pre>
       * RPC or error - connection left open for future calls
       * </pre>
       *
       * <code>ERROR = 1;</code>
       */
      ERROR(1),
      /**
       * <pre>
       * Fatal error - connection closed
       * </pre>
       *
       * <code>FATAL = 2;</code>
       */
      FATAL(2),
      ;

      /**
       * <pre>
       * RPC succeeded
       * </pre>
       *
       * <code>SUCCESS = 0;</code>
       */
      public static final int SUCCESS_VALUE = 0;
      /**
       * <pre>
       * RPC or error - connection left open for future calls
       * </pre>
       *
       * <code>ERROR = 1;</code>
       */
      public static final int ERROR_VALUE = 1;
      /**
       * <pre>
       * Fatal error - connection closed
       * </pre>
       *
       * <code>FATAL = 2;</code>
       */
      public static final int FATAL_VALUE = 2;


      public final int getNumber() {
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static RpcStatusProto valueOf(int value) {
        return forNumber(value);
      }

      public static RpcStatusProto forNumber(int value) {
        switch (value) {
          case 0: return SUCCESS;
          case 1: return ERROR;
          case 2: return FATAL;
          default: return null;
        }
      }

      public static org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<RpcStatusProto>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<
          RpcStatusProto> internalValueMap =
            new org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<RpcStatusProto>() {
              public RpcStatusProto findValueByNumber(int number) {
                return RpcStatusProto.forNumber(number);
              }
            };

      public final org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.getDescriptor().getEnumTypes().get(0);
      }

      private static final RpcStatusProto[] VALUES = values();

      public static RpcStatusProto valueOf(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private RpcStatusProto(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:hadoop.common.RpcResponseHeaderProto.RpcStatusProto)
    }

    /**
     * Protobuf enum {@code hadoop.common.RpcResponseHeaderProto.RpcErrorCodeProto}
     */
    public enum RpcErrorCodeProto
        implements org.apache.hadoop.thirdparty.protobuf.ProtocolMessageEnum {
      /**
       * <pre>
       * Non-fatal Rpc error - connection left open for future rpc calls
       * </pre>
       *
       * <code>ERROR_APPLICATION = 1;</code>
       */
      ERROR_APPLICATION(1),
      /**
       * <pre>
       * Rpc error - no such method
       * </pre>
       *
       * <code>ERROR_NO_SUCH_METHOD = 2;</code>
       */
      ERROR_NO_SUCH_METHOD(2),
      /**
       * <pre>
       * Rpc error - no such protocol
       * </pre>
       *
       * <code>ERROR_NO_SUCH_PROTOCOL = 3;</code>
       */
      ERROR_NO_SUCH_PROTOCOL(3),
      /**
       * <pre>
       * Rpc error on server side
       * </pre>
       *
       * <code>ERROR_RPC_SERVER = 4;</code>
       */
      ERROR_RPC_SERVER(4),
      /**
       * <pre>
       * error serializign response
       * </pre>
       *
       * <code>ERROR_SERIALIZING_RESPONSE = 5;</code>
       */
      ERROR_SERIALIZING_RESPONSE(5),
      /**
       * <pre>
       * Rpc protocol version mismatch
       * </pre>
       *
       * <code>ERROR_RPC_VERSION_MISMATCH = 6;</code>
       */
      ERROR_RPC_VERSION_MISMATCH(6),
      /**
       * <pre>
       * Fatal Server side Rpc error - connection closed
       * </pre>
       *
       * <code>FATAL_UNKNOWN = 10;</code>
       */
      FATAL_UNKNOWN(10),
      /**
       * <pre>
       * IPC layer serilization type invalid
       * </pre>
       *
       * <code>FATAL_UNSUPPORTED_SERIALIZATION = 11;</code>
       */
      FATAL_UNSUPPORTED_SERIALIZATION(11),
      /**
       * <pre>
       * fields of RpcHeader are invalid
       * </pre>
       *
       * <code>FATAL_INVALID_RPC_HEADER = 12;</code>
       */
      FATAL_INVALID_RPC_HEADER(12),
      /**
       * <pre>
       * could not deserilize rpc request
       * </pre>
       *
       * <code>FATAL_DESERIALIZING_REQUEST = 13;</code>
       */
      FATAL_DESERIALIZING_REQUEST(13),
      /**
       * <pre>
       * Ipc Layer version mismatch
       * </pre>
       *
       * <code>FATAL_VERSION_MISMATCH = 14;</code>
       */
      FATAL_VERSION_MISMATCH(14),
      /**
       * <pre>
       * Auth failed
       * </pre>
       *
       * <code>FATAL_UNAUTHORIZED = 15;</code>
       */
      FATAL_UNAUTHORIZED(15),
      ;

      /**
       * <pre>
       * Non-fatal Rpc error - connection left open for future rpc calls
       * </pre>
       *
       * <code>ERROR_APPLICATION = 1;</code>
       */
      public static final int ERROR_APPLICATION_VALUE = 1;
      /**
       * <pre>
       * Rpc error - no such method
       * </pre>
       *
       * <code>ERROR_NO_SUCH_METHOD = 2;</code>
       */
      public static final int ERROR_NO_SUCH_METHOD_VALUE = 2;
      /**
       * <pre>
       * Rpc error - no such protocol
       * </pre>
       *
       * <code>ERROR_NO_SUCH_PROTOCOL = 3;</code>
       */
      public static final int ERROR_NO_SUCH_PROTOCOL_VALUE = 3;
      /**
       * <pre>
       * Rpc error on server side
       * </pre>
       *
       * <code>ERROR_RPC_SERVER = 4;</code>
       */
      public static final int ERROR_RPC_SERVER_VALUE = 4;
      /**
       * <pre>
       * error serializign response
       * </pre>
       *
       * <code>ERROR_SERIALIZING_RESPONSE = 5;</code>
       */
      public static final int ERROR_SERIALIZING_RESPONSE_VALUE = 5;
      /**
       * <pre>
       * Rpc protocol version mismatch
       * </pre>
       *
       * <code>ERROR_RPC_VERSION_MISMATCH = 6;</code>
       */
      public static final int ERROR_RPC_VERSION_MISMATCH_VALUE = 6;
      /**
       * <pre>
       * Fatal Server side Rpc error - connection closed
       * </pre>
       *
       * <code>FATAL_UNKNOWN = 10;</code>
       */
      public static final int FATAL_UNKNOWN_VALUE = 10;
      /**
       * <pre>
       * IPC layer serilization type invalid
       * </pre>
       *
       * <code>FATAL_UNSUPPORTED_SERIALIZATION = 11;</code>
       */
      public static final int FATAL_UNSUPPORTED_SERIALIZATION_VALUE = 11;
      /**
       * <pre>
       * fields of RpcHeader are invalid
       * </pre>
       *
       * <code>FATAL_INVALID_RPC_HEADER = 12;</code>
       */
      public static final int FATAL_INVALID_RPC_HEADER_VALUE = 12;
      /**
       * <pre>
       * could not deserilize rpc request
       * </pre>
       *
       * <code>FATAL_DESERIALIZING_REQUEST = 13;</code>
       */
      public static final int FATAL_DESERIALIZING_REQUEST_VALUE = 13;
      /**
       * <pre>
       * Ipc Layer version mismatch
       * </pre>
       *
       * <code>FATAL_VERSION_MISMATCH = 14;</code>
       */
      public static final int FATAL_VERSION_MISMATCH_VALUE = 14;
      /**
       * <pre>
       * Auth failed
       * </pre>
       *
       * <code>FATAL_UNAUTHORIZED = 15;</code>
       */
      public static final int FATAL_UNAUTHORIZED_VALUE = 15;


      public final int getNumber() {
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static RpcErrorCodeProto valueOf(int value) {
        return forNumber(value);
      }

      public static RpcErrorCodeProto forNumber(int value) {
        switch (value) {
          case 1: return ERROR_APPLICATION;
          case 2: return ERROR_NO_SUCH_METHOD;
          case 3: return ERROR_NO_SUCH_PROTOCOL;
          case 4: return ERROR_RPC_SERVER;
          case 5: return ERROR_SERIALIZING_RESPONSE;
          case 6: return ERROR_RPC_VERSION_MISMATCH;
          case 10: return FATAL_UNKNOWN;
          case 11: return FATAL_UNSUPPORTED_SERIALIZATION;
          case 12: return FATAL_INVALID_RPC_HEADER;
          case 13: return FATAL_DESERIALIZING_REQUEST;
          case 14: return FATAL_VERSION_MISMATCH;
          case 15: return FATAL_UNAUTHORIZED;
          default: return null;
        }
      }

      public static org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<RpcErrorCodeProto>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<
          RpcErrorCodeProto> internalValueMap =
            new org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<RpcErrorCodeProto>() {
              public RpcErrorCodeProto findValueByNumber(int number) {
                return RpcErrorCodeProto.forNumber(number);
              }
            };

      public final org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.getDescriptor().getEnumTypes().get(1);
      }

      private static final RpcErrorCodeProto[] VALUES = values();

      public static RpcErrorCodeProto valueOf(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private RpcErrorCodeProto(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:hadoop.common.RpcResponseHeaderProto.RpcErrorCodeProto)
    }

    private int bitField0_;
    public static final int CALLID_FIELD_NUMBER = 1;
    private int callId_;
    /**
     * <pre>
     * callId used in Request
     * </pre>
     *
     * <code>required uint32 callId = 1;</code>
     */
    public boolean hasCallId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * callId used in Request
     * </pre>
     *
     * <code>required uint32 callId = 1;</code>
     */
    public int getCallId() {
      return callId_;
    }

    public static final int STATUS_FIELD_NUMBER = 2;
    private int status_;
    /**
     * <code>required .hadoop.common.RpcResponseHeaderProto.RpcStatusProto status = 2;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required .hadoop.common.RpcResponseHeaderProto.RpcStatusProto status = 2;</code>
     */
    public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.RpcStatusProto getStatus() {
      @SuppressWarnings("deprecation")
      org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.RpcStatusProto result = org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.RpcStatusProto.valueOf(status_);
      return result == null ? org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.RpcStatusProto.SUCCESS : result;
    }

    public static final int SERVERIPCVERSIONNUM_FIELD_NUMBER = 3;
    private int serverIpcVersionNum_;
    /**
     * <pre>
     * Sent if success or fail
     * </pre>
     *
     * <code>optional uint32 serverIpcVersionNum = 3;</code>
     */
    public boolean hasServerIpcVersionNum() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Sent if success or fail
     * </pre>
     *
     * <code>optional uint32 serverIpcVersionNum = 3;</code>
     */
    public int getServerIpcVersionNum() {
      return serverIpcVersionNum_;
    }

    public static final int EXCEPTIONCLASSNAME_FIELD_NUMBER = 4;
    private volatile java.lang.Object exceptionClassName_;
    /**
     * <pre>
     * if request fails
     * </pre>
     *
     * <code>optional string exceptionClassName = 4;</code>
     */
    public boolean hasExceptionClassName() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * if request fails
     * </pre>
     *
     * <code>optional string exceptionClassName = 4;</code>
     */
    public java.lang.String getExceptionClassName() {
      java.lang.Object ref = exceptionClassName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          exceptionClassName_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * if request fails
     * </pre>
     *
     * <code>optional string exceptionClassName = 4;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getExceptionClassNameBytes() {
      java.lang.Object ref = exceptionClassName_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        exceptionClassName_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int ERRORMSG_FIELD_NUMBER = 5;
    private volatile java.lang.Object errorMsg_;
    /**
     * <pre>
     * if request fails, often contains strack trace
     * </pre>
     *
     * <code>optional string errorMsg = 5;</code>
     */
    public boolean hasErrorMsg() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * if request fails, often contains strack trace
     * </pre>
     *
     * <code>optional string errorMsg = 5;</code>
     */
    public java.lang.String getErrorMsg() {
      java.lang.Object ref = errorMsg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          errorMsg_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * if request fails, often contains strack trace
     * </pre>
     *
     * <code>optional string errorMsg = 5;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getErrorMsgBytes() {
      java.lang.Object ref = errorMsg_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errorMsg_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int ERRORDETAIL_FIELD_NUMBER = 6;
    private int errorDetail_;
    /**
     * <pre>
     * in case of error
     * </pre>
     *
     * <code>optional .hadoop.common.RpcResponseHeaderProto.RpcErrorCodeProto errorDetail = 6;</code>
     */
    public boolean hasErrorDetail() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <pre>
     * in case of error
     * </pre>
     *
     * <code>optional .hadoop.common.RpcResponseHeaderProto.RpcErrorCodeProto errorDetail = 6;</code>
     */
    public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.RpcErrorCodeProto getErrorDetail() {
      @SuppressWarnings("deprecation")
      org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.RpcErrorCodeProto result = org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.RpcErrorCodeProto.valueOf(errorDetail_);
      return result == null ? org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.RpcErrorCodeProto.ERROR_APPLICATION : result;
    }

    public static final int CLIENTID_FIELD_NUMBER = 7;
    private org.apache.hadoop.thirdparty.protobuf.ByteString clientId_;
    /**
     * <pre>
     * Globally unique client ID
     * </pre>
     *
     * <code>optional bytes clientId = 7;</code>
     */
    public boolean hasClientId() {
      return ((bitField0_ & 0x00000040) != 0);
    }
    /**
     * <pre>
     * Globally unique client ID
     * </pre>
     *
     * <code>optional bytes clientId = 7;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString getClientId() {
      return clientId_;
    }

    public static final int RETRYCOUNT_FIELD_NUMBER = 8;
    private int retryCount_;
    /**
     * <code>optional sint32 retryCount = 8 [default = -1];</code>
     */
    public boolean hasRetryCount() {
      return ((bitField0_ & 0x00000080) != 0);
    }
    /**
     * <code>optional sint32 retryCount = 8 [default = -1];</code>
     */
    public int getRetryCount() {
      return retryCount_;
    }

    public static final int STATEID_FIELD_NUMBER = 9;
    private long stateId_;
    /**
     * <pre>
     * The last written Global State ID
     * </pre>
     *
     * <code>optional int64 stateId = 9;</code>
     */
    public boolean hasStateId() {
      return ((bitField0_ & 0x00000100) != 0);
    }
    /**
     * <pre>
     * The last written Global State ID
     * </pre>
     *
     * <code>optional int64 stateId = 9;</code>
     */
    public long getStateId() {
      return stateId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasCallId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasStatus()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(org.apache.hadoop.thirdparty.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeUInt32(1, callId_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeEnum(2, status_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeUInt32(3, serverIpcVersionNum_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 4, exceptionClassName_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 5, errorMsg_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        output.writeEnum(6, errorDetail_);
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        output.writeBytes(7, clientId_);
      }
      if (((bitField0_ & 0x00000080) != 0)) {
        output.writeSInt32(8, retryCount_);
      }
      if (((bitField0_ & 0x00000100) != 0)) {
        output.writeInt64(9, stateId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeUInt32Size(1, callId_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeEnumSize(2, status_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeUInt32Size(3, serverIpcVersionNum_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(4, exceptionClassName_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(5, errorMsg_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeEnumSize(6, errorDetail_);
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeBytesSize(7, clientId_);
      }
      if (((bitField0_ & 0x00000080) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeSInt32Size(8, retryCount_);
      }
      if (((bitField0_ & 0x00000100) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeInt64Size(9, stateId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto other = (org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto) obj;

      if (hasCallId() != other.hasCallId()) return false;
      if (hasCallId()) {
        if (getCallId()
            != other.getCallId()) return false;
      }
      if (hasStatus() != other.hasStatus()) return false;
      if (hasStatus()) {
        if (status_ != other.status_) return false;
      }
      if (hasServerIpcVersionNum() != other.hasServerIpcVersionNum()) return false;
      if (hasServerIpcVersionNum()) {
        if (getServerIpcVersionNum()
            != other.getServerIpcVersionNum()) return false;
      }
      if (hasExceptionClassName() != other.hasExceptionClassName()) return false;
      if (hasExceptionClassName()) {
        if (!getExceptionClassName()
            .equals(other.getExceptionClassName())) return false;
      }
      if (hasErrorMsg() != other.hasErrorMsg()) return false;
      if (hasErrorMsg()) {
        if (!getErrorMsg()
            .equals(other.getErrorMsg())) return false;
      }
      if (hasErrorDetail() != other.hasErrorDetail()) return false;
      if (hasErrorDetail()) {
        if (errorDetail_ != other.errorDetail_) return false;
      }
      if (hasClientId() != other.hasClientId()) return false;
      if (hasClientId()) {
        if (!getClientId()
            .equals(other.getClientId())) return false;
      }
      if (hasRetryCount() != other.hasRetryCount()) return false;
      if (hasRetryCount()) {
        if (getRetryCount()
            != other.getRetryCount()) return false;
      }
      if (hasStateId() != other.hasStateId()) return false;
      if (hasStateId()) {
        if (getStateId()
            != other.getStateId()) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasCallId()) {
        hash = (37 * hash) + CALLID_FIELD_NUMBER;
        hash = (53 * hash) + getCallId();
      }
      if (hasStatus()) {
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + status_;
      }
      if (hasServerIpcVersionNum()) {
        hash = (37 * hash) + SERVERIPCVERSIONNUM_FIELD_NUMBER;
        hash = (53 * hash) + getServerIpcVersionNum();
      }
      if (hasExceptionClassName()) {
        hash = (37 * hash) + EXCEPTIONCLASSNAME_FIELD_NUMBER;
        hash = (53 * hash) + getExceptionClassName().hashCode();
      }
      if (hasErrorMsg()) {
        hash = (37 * hash) + ERRORMSG_FIELD_NUMBER;
        hash = (53 * hash) + getErrorMsg().hashCode();
      }
      if (hasErrorDetail()) {
        hash = (37 * hash) + ERRORDETAIL_FIELD_NUMBER;
        hash = (53 * hash) + errorDetail_;
      }
      if (hasClientId()) {
        hash = (37 * hash) + CLIENTID_FIELD_NUMBER;
        hash = (53 * hash) + getClientId().hashCode();
      }
      if (hasRetryCount()) {
        hash = (37 * hash) + RETRYCOUNT_FIELD_NUMBER;
        hash = (53 * hash) + getRetryCount();
      }
      if (hasStateId()) {
        hash = (37 * hash) + STATEID_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getStateId());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     **
     * Rpc Response Header
     * +------------------------------------------------------------------+
     * | Rpc total response length in bytes (4 bytes int)                 |
     * |  (sum of next two parts)                                         |
     * +------------------------------------------------------------------+
     * | RpcResponseHeaderProto - serialized delimited ie has len         |
     * +------------------------------------------------------------------+
     * | if request is successful:                                        |
     * |   - RpcResponse -  The actual rpc response  bytes follow         |
     * |     the response header                                          |
     * |     This response is serialized based on RpcKindProto            |
     * | if request fails :                                               |
     * |   The rpc response header contains the necessary info            |
     * +------------------------------------------------------------------+
     * Note that rpc response header is also used when connection setup fails. 
     * Ie the response looks like a rpc response with a fake callId.
     * </pre>
     *
     * Protobuf type {@code hadoop.common.RpcResponseHeaderProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.RpcResponseHeaderProto)
        org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.internal_static_hadoop_common_RpcResponseHeaderProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.internal_static_hadoop_common_RpcResponseHeaderProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.class, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.Builder.class);
      }

      // Construct using org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        callId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        status_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        serverIpcVersionNum_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        exceptionClassName_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        errorMsg_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        errorDetail_ = 1;
        bitField0_ = (bitField0_ & ~0x00000020);
        clientId_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000040);
        retryCount_ = -1;
        bitField0_ = (bitField0_ & ~0x00000080);
        stateId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000100);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.internal_static_hadoop_common_RpcResponseHeaderProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto getDefaultInstanceForType() {
        return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto build() {
        org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto buildPartial() {
        org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto result = new org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.callId_ = callId_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.status_ = status_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.serverIpcVersionNum_ = serverIpcVersionNum_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          to_bitField0_ |= 0x00000008;
        }
        result.exceptionClassName_ = exceptionClassName_;
        if (((from_bitField0_ & 0x00000010) != 0)) {
          to_bitField0_ |= 0x00000010;
        }
        result.errorMsg_ = errorMsg_;
        if (((from_bitField0_ & 0x00000020) != 0)) {
          to_bitField0_ |= 0x00000020;
        }
        result.errorDetail_ = errorDetail_;
        if (((from_bitField0_ & 0x00000040) != 0)) {
          to_bitField0_ |= 0x00000040;
        }
        result.clientId_ = clientId_;
        if (((from_bitField0_ & 0x00000080) != 0)) {
          to_bitField0_ |= 0x00000080;
        }
        result.retryCount_ = retryCount_;
        if (((from_bitField0_ & 0x00000100) != 0)) {
          result.stateId_ = stateId_;
          to_bitField0_ |= 0x00000100;
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(org.apache.hadoop.thirdparty.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto) {
          return mergeFrom((org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto other) {
        if (other == org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.getDefaultInstance()) return this;
        if (other.hasCallId()) {
          setCallId(other.getCallId());
        }
        if (other.hasStatus()) {
          setStatus(other.getStatus());
        }
        if (other.hasServerIpcVersionNum()) {
          setServerIpcVersionNum(other.getServerIpcVersionNum());
        }
        if (other.hasExceptionClassName()) {
          bitField0_ |= 0x00000008;
          exceptionClassName_ = other.exceptionClassName_;
          onChanged();
        }
        if (other.hasErrorMsg()) {
          bitField0_ |= 0x00000010;
          errorMsg_ = other.errorMsg_;
          onChanged();
        }
        if (other.hasErrorDetail()) {
          setErrorDetail(other.getErrorDetail());
        }
        if (other.hasClientId()) {
          setClientId(other.getClientId());
        }
        if (other.hasRetryCount()) {
          setRetryCount(other.getRetryCount());
        }
        if (other.hasStateId()) {
          setStateId(other.getStateId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasCallId()) {
          return false;
        }
        if (!hasStatus()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int callId_ ;
      /**
       * <pre>
       * callId used in Request
       * </pre>
       *
       * <code>required uint32 callId = 1;</code>
       */
      public boolean hasCallId() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * callId used in Request
       * </pre>
       *
       * <code>required uint32 callId = 1;</code>
       */
      public int getCallId() {
        return callId_;
      }
      /**
       * <pre>
       * callId used in Request
       * </pre>
       *
       * <code>required uint32 callId = 1;</code>
       */
      public Builder setCallId(int value) {
        bitField0_ |= 0x00000001;
        callId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * callId used in Request
       * </pre>
       *
       * <code>required uint32 callId = 1;</code>
       */
      public Builder clearCallId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        callId_ = 0;
        onChanged();
        return this;
      }

      private int status_ = 0;
      /**
       * <code>required .hadoop.common.RpcResponseHeaderProto.RpcStatusProto status = 2;</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required .hadoop.common.RpcResponseHeaderProto.RpcStatusProto status = 2;</code>
       */
      public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.RpcStatusProto getStatus() {
        @SuppressWarnings("deprecation")
        org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.RpcStatusProto result = org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.RpcStatusProto.valueOf(status_);
        return result == null ? org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.RpcStatusProto.SUCCESS : result;
      }
      /**
       * <code>required .hadoop.common.RpcResponseHeaderProto.RpcStatusProto status = 2;</code>
       */
      public Builder setStatus(org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.RpcStatusProto value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        status_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>required .hadoop.common.RpcResponseHeaderProto.RpcStatusProto status = 2;</code>
       */
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000002);
        status_ = 0;
        onChanged();
        return this;
      }

      private int serverIpcVersionNum_ ;
      /**
       * <pre>
       * Sent if success or fail
       * </pre>
       *
       * <code>optional uint32 serverIpcVersionNum = 3;</code>
       */
      public boolean hasServerIpcVersionNum() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * Sent if success or fail
       * </pre>
       *
       * <code>optional uint32 serverIpcVersionNum = 3;</code>
       */
      public int getServerIpcVersionNum() {
        return serverIpcVersionNum_;
      }
      /**
       * <pre>
       * Sent if success or fail
       * </pre>
       *
       * <code>optional uint32 serverIpcVersionNum = 3;</code>
       */
      public Builder setServerIpcVersionNum(int value) {
        bitField0_ |= 0x00000004;
        serverIpcVersionNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Sent if success or fail
       * </pre>
       *
       * <code>optional uint32 serverIpcVersionNum = 3;</code>
       */
      public Builder clearServerIpcVersionNum() {
        bitField0_ = (bitField0_ & ~0x00000004);
        serverIpcVersionNum_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object exceptionClassName_ = "";
      /**
       * <pre>
       * if request fails
       * </pre>
       *
       * <code>optional string exceptionClassName = 4;</code>
       */
      public boolean hasExceptionClassName() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <pre>
       * if request fails
       * </pre>
       *
       * <code>optional string exceptionClassName = 4;</code>
       */
      public java.lang.String getExceptionClassName() {
        java.lang.Object ref = exceptionClassName_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            exceptionClassName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * if request fails
       * </pre>
       *
       * <code>optional string exceptionClassName = 4;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getExceptionClassNameBytes() {
        java.lang.Object ref = exceptionClassName_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          exceptionClassName_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * if request fails
       * </pre>
       *
       * <code>optional string exceptionClassName = 4;</code>
       */
      public Builder setExceptionClassName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        exceptionClassName_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * if request fails
       * </pre>
       *
       * <code>optional string exceptionClassName = 4;</code>
       */
      public Builder clearExceptionClassName() {
        bitField0_ = (bitField0_ & ~0x00000008);
        exceptionClassName_ = getDefaultInstance().getExceptionClassName();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * if request fails
       * </pre>
       *
       * <code>optional string exceptionClassName = 4;</code>
       */
      public Builder setExceptionClassNameBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        exceptionClassName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object errorMsg_ = "";
      /**
       * <pre>
       * if request fails, often contains strack trace
       * </pre>
       *
       * <code>optional string errorMsg = 5;</code>
       */
      public boolean hasErrorMsg() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <pre>
       * if request fails, often contains strack trace
       * </pre>
       *
       * <code>optional string errorMsg = 5;</code>
       */
      public java.lang.String getErrorMsg() {
        java.lang.Object ref = errorMsg_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            errorMsg_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * if request fails, often contains strack trace
       * </pre>
       *
       * <code>optional string errorMsg = 5;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getErrorMsgBytes() {
        java.lang.Object ref = errorMsg_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          errorMsg_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * if request fails, often contains strack trace
       * </pre>
       *
       * <code>optional string errorMsg = 5;</code>
       */
      public Builder setErrorMsg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        errorMsg_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * if request fails, often contains strack trace
       * </pre>
       *
       * <code>optional string errorMsg = 5;</code>
       */
      public Builder clearErrorMsg() {
        bitField0_ = (bitField0_ & ~0x00000010);
        errorMsg_ = getDefaultInstance().getErrorMsg();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * if request fails, often contains strack trace
       * </pre>
       *
       * <code>optional string errorMsg = 5;</code>
       */
      public Builder setErrorMsgBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        errorMsg_ = value;
        onChanged();
        return this;
      }

      private int errorDetail_ = 1;
      /**
       * <pre>
       * in case of error
       * </pre>
       *
       * <code>optional .hadoop.common.RpcResponseHeaderProto.RpcErrorCodeProto errorDetail = 6;</code>
       */
      public boolean hasErrorDetail() {
        return ((bitField0_ & 0x00000020) != 0);
      }
      /**
       * <pre>
       * in case of error
       * </pre>
       *
       * <code>optional .hadoop.common.RpcResponseHeaderProto.RpcErrorCodeProto errorDetail = 6;</code>
       */
      public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.RpcErrorCodeProto getErrorDetail() {
        @SuppressWarnings("deprecation")
        org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.RpcErrorCodeProto result = org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.RpcErrorCodeProto.valueOf(errorDetail_);
        return result == null ? org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.RpcErrorCodeProto.ERROR_APPLICATION : result;
      }
      /**
       * <pre>
       * in case of error
       * </pre>
       *
       * <code>optional .hadoop.common.RpcResponseHeaderProto.RpcErrorCodeProto errorDetail = 6;</code>
       */
      public Builder setErrorDetail(org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto.RpcErrorCodeProto value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000020;
        errorDetail_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * in case of error
       * </pre>
       *
       * <code>optional .hadoop.common.RpcResponseHeaderProto.RpcErrorCodeProto errorDetail = 6;</code>
       */
      public Builder clearErrorDetail() {
        bitField0_ = (bitField0_ & ~0x00000020);
        errorDetail_ = 1;
        onChanged();
        return this;
      }

      private org.apache.hadoop.thirdparty.protobuf.ByteString clientId_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       * Globally unique client ID
       * </pre>
       *
       * <code>optional bytes clientId = 7;</code>
       */
      public boolean hasClientId() {
        return ((bitField0_ & 0x00000040) != 0);
      }
      /**
       * <pre>
       * Globally unique client ID
       * </pre>
       *
       * <code>optional bytes clientId = 7;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString getClientId() {
        return clientId_;
      }
      /**
       * <pre>
       * Globally unique client ID
       * </pre>
       *
       * <code>optional bytes clientId = 7;</code>
       */
      public Builder setClientId(org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        clientId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Globally unique client ID
       * </pre>
       *
       * <code>optional bytes clientId = 7;</code>
       */
      public Builder clearClientId() {
        bitField0_ = (bitField0_ & ~0x00000040);
        clientId_ = getDefaultInstance().getClientId();
        onChanged();
        return this;
      }

      private int retryCount_ = -1;
      /**
       * <code>optional sint32 retryCount = 8 [default = -1];</code>
       */
      public boolean hasRetryCount() {
        return ((bitField0_ & 0x00000080) != 0);
      }
      /**
       * <code>optional sint32 retryCount = 8 [default = -1];</code>
       */
      public int getRetryCount() {
        return retryCount_;
      }
      /**
       * <code>optional sint32 retryCount = 8 [default = -1];</code>
       */
      public Builder setRetryCount(int value) {
        bitField0_ |= 0x00000080;
        retryCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional sint32 retryCount = 8 [default = -1];</code>
       */
      public Builder clearRetryCount() {
        bitField0_ = (bitField0_ & ~0x00000080);
        retryCount_ = -1;
        onChanged();
        return this;
      }

      private long stateId_ ;
      /**
       * <pre>
       * The last written Global State ID
       * </pre>
       *
       * <code>optional int64 stateId = 9;</code>
       */
      public boolean hasStateId() {
        return ((bitField0_ & 0x00000100) != 0);
      }
      /**
       * <pre>
       * The last written Global State ID
       * </pre>
       *
       * <code>optional int64 stateId = 9;</code>
       */
      public long getStateId() {
        return stateId_;
      }
      /**
       * <pre>
       * The last written Global State ID
       * </pre>
       *
       * <code>optional int64 stateId = 9;</code>
       */
      public Builder setStateId(long value) {
        bitField0_ |= 0x00000100;
        stateId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The last written Global State ID
       * </pre>
       *
       * <code>optional int64 stateId = 9;</code>
       */
      public Builder clearStateId() {
        bitField0_ = (bitField0_ & ~0x00000100);
        stateId_ = 0L;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:hadoop.common.RpcResponseHeaderProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.RpcResponseHeaderProto)
    private static final org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto();
    }

    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<RpcResponseHeaderProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<RpcResponseHeaderProto>() {
      @java.lang.Override
      public RpcResponseHeaderProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new RpcResponseHeaderProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<RpcResponseHeaderProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<RpcResponseHeaderProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcResponseHeaderProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RpcSaslProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.RpcSaslProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>optional uint32 version = 1;</code>
     */
    boolean hasVersion();
    /**
     * <code>optional uint32 version = 1;</code>
     */
    int getVersion();

    /**
     * <code>required .hadoop.common.RpcSaslProto.SaslState state = 2;</code>
     */
    boolean hasState();
    /**
     * <code>required .hadoop.common.RpcSaslProto.SaslState state = 2;</code>
     */
    org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslState getState();

    /**
     * <code>optional bytes token = 3;</code>
     */
    boolean hasToken();
    /**
     * <code>optional bytes token = 3;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString getToken();

    /**
     * <code>repeated .hadoop.common.RpcSaslProto.SaslAuth auths = 4;</code>
     */
    java.util.List<org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth> 
        getAuthsList();
    /**
     * <code>repeated .hadoop.common.RpcSaslProto.SaslAuth auths = 4;</code>
     */
    org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth getAuths(int index);
    /**
     * <code>repeated .hadoop.common.RpcSaslProto.SaslAuth auths = 4;</code>
     */
    int getAuthsCount();
    /**
     * <code>repeated .hadoop.common.RpcSaslProto.SaslAuth auths = 4;</code>
     */
    java.util.List<? extends org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuthOrBuilder> 
        getAuthsOrBuilderList();
    /**
     * <code>repeated .hadoop.common.RpcSaslProto.SaslAuth auths = 4;</code>
     */
    org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuthOrBuilder getAuthsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code hadoop.common.RpcSaslProto}
   */
  public  static final class RpcSaslProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.RpcSaslProto)
      RpcSaslProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RpcSaslProto.newBuilder() to construct.
    private RpcSaslProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RpcSaslProto() {
      state_ = 0;
      token_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
      auths_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RpcSaslProto(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet.Builder unknownFields =
          org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              bitField0_ |= 0x00000001;
              version_ = input.readUInt32();
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
              org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslState value = org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslState.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                state_ = rawValue;
              }
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              token_ = input.readBytes();
              break;
            }
            case 34: {
              if (!((mutable_bitField0_ & 0x00000008) != 0)) {
                auths_ = new java.util.ArrayList<org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth>();
                mutable_bitField0_ |= 0x00000008;
              }
              auths_.add(
                  input.readMessage(org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth.PARSER, extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000008) != 0)) {
          auths_ = java.util.Collections.unmodifiableList(auths_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.internal_static_hadoop_common_RpcSaslProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.internal_static_hadoop_common_RpcSaslProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.class, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.Builder.class);
    }

    /**
     * Protobuf enum {@code hadoop.common.RpcSaslProto.SaslState}
     */
    public enum SaslState
        implements org.apache.hadoop.thirdparty.protobuf.ProtocolMessageEnum {
      /**
       * <code>SUCCESS = 0;</code>
       */
      SUCCESS(0),
      /**
       * <code>NEGOTIATE = 1;</code>
       */
      NEGOTIATE(1),
      /**
       * <code>INITIATE = 2;</code>
       */
      INITIATE(2),
      /**
       * <code>CHALLENGE = 3;</code>
       */
      CHALLENGE(3),
      /**
       * <code>RESPONSE = 4;</code>
       */
      RESPONSE(4),
      /**
       * <code>WRAP = 5;</code>
       */
      WRAP(5),
      ;

      /**
       * <code>SUCCESS = 0;</code>
       */
      public static final int SUCCESS_VALUE = 0;
      /**
       * <code>NEGOTIATE = 1;</code>
       */
      public static final int NEGOTIATE_VALUE = 1;
      /**
       * <code>INITIATE = 2;</code>
       */
      public static final int INITIATE_VALUE = 2;
      /**
       * <code>CHALLENGE = 3;</code>
       */
      public static final int CHALLENGE_VALUE = 3;
      /**
       * <code>RESPONSE = 4;</code>
       */
      public static final int RESPONSE_VALUE = 4;
      /**
       * <code>WRAP = 5;</code>
       */
      public static final int WRAP_VALUE = 5;


      public final int getNumber() {
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static SaslState valueOf(int value) {
        return forNumber(value);
      }

      public static SaslState forNumber(int value) {
        switch (value) {
          case 0: return SUCCESS;
          case 1: return NEGOTIATE;
          case 2: return INITIATE;
          case 3: return CHALLENGE;
          case 4: return RESPONSE;
          case 5: return WRAP;
          default: return null;
        }
      }

      public static org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<SaslState>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<
          SaslState> internalValueMap =
            new org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<SaslState>() {
              public SaslState findValueByNumber(int number) {
                return SaslState.forNumber(number);
              }
            };

      public final org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.getDescriptor().getEnumTypes().get(0);
      }

      private static final SaslState[] VALUES = values();

      public static SaslState valueOf(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private SaslState(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:hadoop.common.RpcSaslProto.SaslState)
    }

    public interface SaslAuthOrBuilder extends
        // @@protoc_insertion_point(interface_extends:hadoop.common.RpcSaslProto.SaslAuth)
        org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

      /**
       * <code>required string method = 1;</code>
       */
      boolean hasMethod();
      /**
       * <code>required string method = 1;</code>
       */
      java.lang.String getMethod();
      /**
       * <code>required string method = 1;</code>
       */
      org.apache.hadoop.thirdparty.protobuf.ByteString
          getMethodBytes();

      /**
       * <code>required string mechanism = 2;</code>
       */
      boolean hasMechanism();
      /**
       * <code>required string mechanism = 2;</code>
       */
      java.lang.String getMechanism();
      /**
       * <code>required string mechanism = 2;</code>
       */
      org.apache.hadoop.thirdparty.protobuf.ByteString
          getMechanismBytes();

      /**
       * <code>optional string protocol = 3;</code>
       */
      boolean hasProtocol();
      /**
       * <code>optional string protocol = 3;</code>
       */
      java.lang.String getProtocol();
      /**
       * <code>optional string protocol = 3;</code>
       */
      org.apache.hadoop.thirdparty.protobuf.ByteString
          getProtocolBytes();

      /**
       * <code>optional string serverId = 4;</code>
       */
      boolean hasServerId();
      /**
       * <code>optional string serverId = 4;</code>
       */
      java.lang.String getServerId();
      /**
       * <code>optional string serverId = 4;</code>
       */
      org.apache.hadoop.thirdparty.protobuf.ByteString
          getServerIdBytes();

      /**
       * <code>optional bytes challenge = 5;</code>
       */
      boolean hasChallenge();
      /**
       * <code>optional bytes challenge = 5;</code>
       */
      org.apache.hadoop.thirdparty.protobuf.ByteString getChallenge();
    }
    /**
     * Protobuf type {@code hadoop.common.RpcSaslProto.SaslAuth}
     */
    public  static final class SaslAuth extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:hadoop.common.RpcSaslProto.SaslAuth)
        SaslAuthOrBuilder {
    private static final long serialVersionUID = 0L;
      // Use SaslAuth.newBuilder() to construct.
      private SaslAuth(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
      }
      private SaslAuth() {
        method_ = "";
        mechanism_ = "";
        protocol_ = "";
        serverId_ = "";
        challenge_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
      }

      @java.lang.Override
      public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }
      private SaslAuth(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        int mutable_bitField0_ = 0;
        org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet.Builder unknownFields =
            org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet.newBuilder();
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                method_ = bs;
                break;
              }
              case 18: {
                org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000002;
                mechanism_ = bs;
                break;
              }
              case 26: {
                org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000004;
                protocol_ = bs;
                break;
              }
              case 34: {
                org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000008;
                serverId_ = bs;
                break;
              }
              case 42: {
                bitField0_ |= 0x00000010;
                challenge_ = input.readBytes();
                break;
              }
              default: {
                if (!parseUnknownField(
                    input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
            }
          }
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
          throw new org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException(
              e).setUnfinishedMessage(this);
        } finally {
          this.unknownFields = unknownFields.build();
          makeExtensionsImmutable();
        }
      }
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.internal_static_hadoop_common_RpcSaslProto_SaslAuth_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.internal_static_hadoop_common_RpcSaslProto_SaslAuth_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth.class, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth.Builder.class);
      }

      private int bitField0_;
      public static final int METHOD_FIELD_NUMBER = 1;
      private volatile java.lang.Object method_;
      /**
       * <code>required string method = 1;</code>
       */
      public boolean hasMethod() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string method = 1;</code>
       */
      public java.lang.String getMethod() {
        java.lang.Object ref = method_;
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            method_ = s;
          }
          return s;
        }
      }
      /**
       * <code>required string method = 1;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getMethodBytes() {
        java.lang.Object ref = method_;
        if (ref instanceof java.lang.String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          method_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }

      public static final int MECHANISM_FIELD_NUMBER = 2;
      private volatile java.lang.Object mechanism_;
      /**
       * <code>required string mechanism = 2;</code>
       */
      public boolean hasMechanism() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required string mechanism = 2;</code>
       */
      public java.lang.String getMechanism() {
        java.lang.Object ref = mechanism_;
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            mechanism_ = s;
          }
          return s;
        }
      }
      /**
       * <code>required string mechanism = 2;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getMechanismBytes() {
        java.lang.Object ref = mechanism_;
        if (ref instanceof java.lang.String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          mechanism_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }

      public static final int PROTOCOL_FIELD_NUMBER = 3;
      private volatile java.lang.Object protocol_;
      /**
       * <code>optional string protocol = 3;</code>
       */
      public boolean hasProtocol() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional string protocol = 3;</code>
       */
      public java.lang.String getProtocol() {
        java.lang.Object ref = protocol_;
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            protocol_ = s;
          }
          return s;
        }
      }
      /**
       * <code>optional string protocol = 3;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getProtocolBytes() {
        java.lang.Object ref = protocol_;
        if (ref instanceof java.lang.String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          protocol_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }

      public static final int SERVERID_FIELD_NUMBER = 4;
      private volatile java.lang.Object serverId_;
      /**
       * <code>optional string serverId = 4;</code>
       */
      public boolean hasServerId() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>optional string serverId = 4;</code>
       */
      public java.lang.String getServerId() {
        java.lang.Object ref = serverId_;
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            serverId_ = s;
          }
          return s;
        }
      }
      /**
       * <code>optional string serverId = 4;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getServerIdBytes() {
        java.lang.Object ref = serverId_;
        if (ref instanceof java.lang.String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          serverId_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }

      public static final int CHALLENGE_FIELD_NUMBER = 5;
      private org.apache.hadoop.thirdparty.protobuf.ByteString challenge_;
      /**
       * <code>optional bytes challenge = 5;</code>
       */
      public boolean hasChallenge() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <code>optional bytes challenge = 5;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString getChallenge() {
        return challenge_;
      }

      private byte memoizedIsInitialized = -1;
      @java.lang.Override
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        if (!hasMethod()) {
          memoizedIsInitialized = 0;
          return false;
        }
        if (!hasMechanism()) {
          memoizedIsInitialized = 0;
          return false;
        }
        memoizedIsInitialized = 1;
        return true;
      }

      @java.lang.Override
      public void writeTo(org.apache.hadoop.thirdparty.protobuf.CodedOutputStream output)
                          throws java.io.IOException {
        if (((bitField0_ & 0x00000001) != 0)) {
          org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, method_);
        }
        if (((bitField0_ & 0x00000002) != 0)) {
          org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 2, mechanism_);
        }
        if (((bitField0_ & 0x00000004) != 0)) {
          org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 3, protocol_);
        }
        if (((bitField0_ & 0x00000008) != 0)) {
          org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 4, serverId_);
        }
        if (((bitField0_ & 0x00000010) != 0)) {
          output.writeBytes(5, challenge_);
        }
        unknownFields.writeTo(output);
      }

      @java.lang.Override
      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) != 0)) {
          size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, method_);
        }
        if (((bitField0_ & 0x00000002) != 0)) {
          size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(2, mechanism_);
        }
        if (((bitField0_ & 0x00000004) != 0)) {
          size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(3, protocol_);
        }
        if (((bitField0_ & 0x00000008) != 0)) {
          size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(4, serverId_);
        }
        if (((bitField0_ & 0x00000010) != 0)) {
          size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
            .computeBytesSize(5, challenge_);
        }
        size += unknownFields.getSerializedSize();
        memoizedSize = size;
        return size;
      }

      @java.lang.Override
      public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
         return true;
        }
        if (!(obj instanceof org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth)) {
          return super.equals(obj);
        }
        org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth other = (org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth) obj;

        if (hasMethod() != other.hasMethod()) return false;
        if (hasMethod()) {
          if (!getMethod()
              .equals(other.getMethod())) return false;
        }
        if (hasMechanism() != other.hasMechanism()) return false;
        if (hasMechanism()) {
          if (!getMechanism()
              .equals(other.getMechanism())) return false;
        }
        if (hasProtocol() != other.hasProtocol()) return false;
        if (hasProtocol()) {
          if (!getProtocol()
              .equals(other.getProtocol())) return false;
        }
        if (hasServerId() != other.hasServerId()) return false;
        if (hasServerId()) {
          if (!getServerId()
              .equals(other.getServerId())) return false;
        }
        if (hasChallenge() != other.hasChallenge()) return false;
        if (hasChallenge()) {
          if (!getChallenge()
              .equals(other.getChallenge())) return false;
        }
        if (!unknownFields.equals(other.unknownFields)) return false;
        return true;
      }

      @java.lang.Override
      public int hashCode() {
        if (memoizedHashCode != 0) {
          return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        if (hasMethod()) {
          hash = (37 * hash) + METHOD_FIELD_NUMBER;
          hash = (53 * hash) + getMethod().hashCode();
        }
        if (hasMechanism()) {
          hash = (37 * hash) + MECHANISM_FIELD_NUMBER;
          hash = (53 * hash) + getMechanism().hashCode();
        }
        if (hasProtocol()) {
          hash = (37 * hash) + PROTOCOL_FIELD_NUMBER;
          hash = (53 * hash) + getProtocol().hashCode();
        }
        if (hasServerId()) {
          hash = (37 * hash) + SERVERID_FIELD_NUMBER;
          hash = (53 * hash) + getServerId().hashCode();
        }
        if (hasChallenge()) {
          hash = (37 * hash) + CHALLENGE_FIELD_NUMBER;
          hash = (53 * hash) + getChallenge().hashCode();
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth parseFrom(
          java.nio.ByteBuffer data)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth parseFrom(
          java.nio.ByteBuffer data,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth parseFrom(
          org.apache.hadoop.thirdparty.protobuf.ByteString data)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth parseFrom(
          org.apache.hadoop.thirdparty.protobuf.ByteString data,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth parseFrom(byte[] data)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth parseFrom(
          byte[] data,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth parseFrom(
          java.io.InputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }
      public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
      }
      public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth parseDelimitedFrom(
          java.io.InputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth parseFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth parseFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }

      @java.lang.Override
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
      }
      public static Builder newBuilder(org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }
      @java.lang.Override
      public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
            ? new Builder() : new Builder().mergeFrom(this);
      }

      @java.lang.Override
      protected Builder newBuilderForType(
          org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * Protobuf type {@code hadoop.common.RpcSaslProto.SaslAuth}
       */
      public static final class Builder extends
          org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:hadoop.common.RpcSaslProto.SaslAuth)
          org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuthOrBuilder {
        public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.internal_static_hadoop_common_RpcSaslProto_SaslAuth_descriptor;
        }

        @java.lang.Override
        protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.internal_static_hadoop_common_RpcSaslProto_SaslAuth_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth.class, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth.Builder.class);
        }

        // Construct using org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth.newBuilder()
        private Builder() {
          maybeForceBuilderInitialization();
        }

        private Builder(
            org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.BuilderParent parent) {
          super(parent);
          maybeForceBuilderInitialization();
        }
        private void maybeForceBuilderInitialization() {
          if (org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
                  .alwaysUseFieldBuilders) {
          }
        }
        @java.lang.Override
        public Builder clear() {
          super.clear();
          method_ = "";
          bitField0_ = (bitField0_ & ~0x00000001);
          mechanism_ = "";
          bitField0_ = (bitField0_ & ~0x00000002);
          protocol_ = "";
          bitField0_ = (bitField0_ & ~0x00000004);
          serverId_ = "";
          bitField0_ = (bitField0_ & ~0x00000008);
          challenge_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
          bitField0_ = (bitField0_ & ~0x00000010);
          return this;
        }

        @java.lang.Override
        public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.internal_static_hadoop_common_RpcSaslProto_SaslAuth_descriptor;
        }

        @java.lang.Override
        public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth getDefaultInstanceForType() {
          return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth.getDefaultInstance();
        }

        @java.lang.Override
        public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth build() {
          org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        @java.lang.Override
        public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth buildPartial() {
          org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth result = new org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) != 0)) {
            to_bitField0_ |= 0x00000001;
          }
          result.method_ = method_;
          if (((from_bitField0_ & 0x00000002) != 0)) {
            to_bitField0_ |= 0x00000002;
          }
          result.mechanism_ = mechanism_;
          if (((from_bitField0_ & 0x00000004) != 0)) {
            to_bitField0_ |= 0x00000004;
          }
          result.protocol_ = protocol_;
          if (((from_bitField0_ & 0x00000008) != 0)) {
            to_bitField0_ |= 0x00000008;
          }
          result.serverId_ = serverId_;
          if (((from_bitField0_ & 0x00000010) != 0)) {
            to_bitField0_ |= 0x00000010;
          }
          result.challenge_ = challenge_;
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }

        @java.lang.Override
        public Builder clone() {
          return super.clone();
        }
        @java.lang.Override
        public Builder setField(
            org.apache.hadoop.thirdparty.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return super.setField(field, value);
        }
        @java.lang.Override
        public Builder clearField(
            org.apache.hadoop.thirdparty.protobuf.Descriptors.FieldDescriptor field) {
          return super.clearField(field);
        }
        @java.lang.Override
        public Builder clearOneof(
            org.apache.hadoop.thirdparty.protobuf.Descriptors.OneofDescriptor oneof) {
          return super.clearOneof(oneof);
        }
        @java.lang.Override
        public Builder setRepeatedField(
            org.apache.hadoop.thirdparty.protobuf.Descriptors.FieldDescriptor field,
            int index, java.lang.Object value) {
          return super.setRepeatedField(field, index, value);
        }
        @java.lang.Override
        public Builder addRepeatedField(
            org.apache.hadoop.thirdparty.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return super.addRepeatedField(field, value);
        }
        @java.lang.Override
        public Builder mergeFrom(org.apache.hadoop.thirdparty.protobuf.Message other) {
          if (other instanceof org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth) {
            return mergeFrom((org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth other) {
          if (other == org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth.getDefaultInstance()) return this;
          if (other.hasMethod()) {
            bitField0_ |= 0x00000001;
            method_ = other.method_;
            onChanged();
          }
          if (other.hasMechanism()) {
            bitField0_ |= 0x00000002;
            mechanism_ = other.mechanism_;
            onChanged();
          }
          if (other.hasProtocol()) {
            bitField0_ |= 0x00000004;
            protocol_ = other.protocol_;
            onChanged();
          }
          if (other.hasServerId()) {
            bitField0_ |= 0x00000008;
            serverId_ = other.serverId_;
            onChanged();
          }
          if (other.hasChallenge()) {
            setChallenge(other.getChallenge());
          }
          this.mergeUnknownFields(other.unknownFields);
          onChanged();
          return this;
        }

        @java.lang.Override
        public final boolean isInitialized() {
          if (!hasMethod()) {
            return false;
          }
          if (!hasMechanism()) {
            return false;
          }
          return true;
        }

        @java.lang.Override
        public Builder mergeFrom(
            org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
            org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth) e.getUnfinishedMessage();
            throw e.unwrapIOException();
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }
        private int bitField0_;

        private java.lang.Object method_ = "";
        /**
         * <code>required string method = 1;</code>
         */
        public boolean hasMethod() {
          return ((bitField0_ & 0x00000001) != 0);
        }
        /**
         * <code>required string method = 1;</code>
         */
        public java.lang.String getMethod() {
          java.lang.Object ref = method_;
          if (!(ref instanceof java.lang.String)) {
            org.apache.hadoop.thirdparty.protobuf.ByteString bs =
                (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              method_ = s;
            }
            return s;
          } else {
            return (java.lang.String) ref;
          }
        }
        /**
         * <code>required string method = 1;</code>
         */
        public org.apache.hadoop.thirdparty.protobuf.ByteString
            getMethodBytes() {
          java.lang.Object ref = method_;
          if (ref instanceof String) {
            org.apache.hadoop.thirdparty.protobuf.ByteString b = 
                org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            method_ = b;
            return b;
          } else {
            return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          }
        }
        /**
         * <code>required string method = 1;</code>
         */
        public Builder setMethod(
            java.lang.String value) {
          if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
          method_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>required string method = 1;</code>
         */
        public Builder clearMethod() {
          bitField0_ = (bitField0_ & ~0x00000001);
          method_ = getDefaultInstance().getMethod();
          onChanged();
          return this;
        }
        /**
         * <code>required string method = 1;</code>
         */
        public Builder setMethodBytes(
            org.apache.hadoop.thirdparty.protobuf.ByteString value) {
          if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
          method_ = value;
          onChanged();
          return this;
        }

        private java.lang.Object mechanism_ = "";
        /**
         * <code>required string mechanism = 2;</code>
         */
        public boolean hasMechanism() {
          return ((bitField0_ & 0x00000002) != 0);
        }
        /**
         * <code>required string mechanism = 2;</code>
         */
        public java.lang.String getMechanism() {
          java.lang.Object ref = mechanism_;
          if (!(ref instanceof java.lang.String)) {
            org.apache.hadoop.thirdparty.protobuf.ByteString bs =
                (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              mechanism_ = s;
            }
            return s;
          } else {
            return (java.lang.String) ref;
          }
        }
        /**
         * <code>required string mechanism = 2;</code>
         */
        public org.apache.hadoop.thirdparty.protobuf.ByteString
            getMechanismBytes() {
          java.lang.Object ref = mechanism_;
          if (ref instanceof String) {
            org.apache.hadoop.thirdparty.protobuf.ByteString b = 
                org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            mechanism_ = b;
            return b;
          } else {
            return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          }
        }
        /**
         * <code>required string mechanism = 2;</code>
         */
        public Builder setMechanism(
            java.lang.String value) {
          if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
          mechanism_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>required string mechanism = 2;</code>
         */
        public Builder clearMechanism() {
          bitField0_ = (bitField0_ & ~0x00000002);
          mechanism_ = getDefaultInstance().getMechanism();
          onChanged();
          return this;
        }
        /**
         * <code>required string mechanism = 2;</code>
         */
        public Builder setMechanismBytes(
            org.apache.hadoop.thirdparty.protobuf.ByteString value) {
          if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
          mechanism_ = value;
          onChanged();
          return this;
        }

        private java.lang.Object protocol_ = "";
        /**
         * <code>optional string protocol = 3;</code>
         */
        public boolean hasProtocol() {
          return ((bitField0_ & 0x00000004) != 0);
        }
        /**
         * <code>optional string protocol = 3;</code>
         */
        public java.lang.String getProtocol() {
          java.lang.Object ref = protocol_;
          if (!(ref instanceof java.lang.String)) {
            org.apache.hadoop.thirdparty.protobuf.ByteString bs =
                (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              protocol_ = s;
            }
            return s;
          } else {
            return (java.lang.String) ref;
          }
        }
        /**
         * <code>optional string protocol = 3;</code>
         */
        public org.apache.hadoop.thirdparty.protobuf.ByteString
            getProtocolBytes() {
          java.lang.Object ref = protocol_;
          if (ref instanceof String) {
            org.apache.hadoop.thirdparty.protobuf.ByteString b = 
                org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            protocol_ = b;
            return b;
          } else {
            return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          }
        }
        /**
         * <code>optional string protocol = 3;</code>
         */
        public Builder setProtocol(
            java.lang.String value) {
          if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
          protocol_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>optional string protocol = 3;</code>
         */
        public Builder clearProtocol() {
          bitField0_ = (bitField0_ & ~0x00000004);
          protocol_ = getDefaultInstance().getProtocol();
          onChanged();
          return this;
        }
        /**
         * <code>optional string protocol = 3;</code>
         */
        public Builder setProtocolBytes(
            org.apache.hadoop.thirdparty.protobuf.ByteString value) {
          if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
          protocol_ = value;
          onChanged();
          return this;
        }

        private java.lang.Object serverId_ = "";
        /**
         * <code>optional string serverId = 4;</code>
         */
        public boolean hasServerId() {
          return ((bitField0_ & 0x00000008) != 0);
        }
        /**
         * <code>optional string serverId = 4;</code>
         */
        public java.lang.String getServerId() {
          java.lang.Object ref = serverId_;
          if (!(ref instanceof java.lang.String)) {
            org.apache.hadoop.thirdparty.protobuf.ByteString bs =
                (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              serverId_ = s;
            }
            return s;
          } else {
            return (java.lang.String) ref;
          }
        }
        /**
         * <code>optional string serverId = 4;</code>
         */
        public org.apache.hadoop.thirdparty.protobuf.ByteString
            getServerIdBytes() {
          java.lang.Object ref = serverId_;
          if (ref instanceof String) {
            org.apache.hadoop.thirdparty.protobuf.ByteString b = 
                org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            serverId_ = b;
            return b;
          } else {
            return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          }
        }
        /**
         * <code>optional string serverId = 4;</code>
         */
        public Builder setServerId(
            java.lang.String value) {
          if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
          serverId_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>optional string serverId = 4;</code>
         */
        public Builder clearServerId() {
          bitField0_ = (bitField0_ & ~0x00000008);
          serverId_ = getDefaultInstance().getServerId();
          onChanged();
          return this;
        }
        /**
         * <code>optional string serverId = 4;</code>
         */
        public Builder setServerIdBytes(
            org.apache.hadoop.thirdparty.protobuf.ByteString value) {
          if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
          serverId_ = value;
          onChanged();
          return this;
        }

        private org.apache.hadoop.thirdparty.protobuf.ByteString challenge_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
        /**
         * <code>optional bytes challenge = 5;</code>
         */
        public boolean hasChallenge() {
          return ((bitField0_ & 0x00000010) != 0);
        }
        /**
         * <code>optional bytes challenge = 5;</code>
         */
        public org.apache.hadoop.thirdparty.protobuf.ByteString getChallenge() {
          return challenge_;
        }
        /**
         * <code>optional bytes challenge = 5;</code>
         */
        public Builder setChallenge(org.apache.hadoop.thirdparty.protobuf.ByteString value) {
          if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
          challenge_ = value;
          onChanged();
          return this;
        }
        /**
         * <code>optional bytes challenge = 5;</code>
         */
        public Builder clearChallenge() {
          bitField0_ = (bitField0_ & ~0x00000010);
          challenge_ = getDefaultInstance().getChallenge();
          onChanged();
          return this;
        }
        @java.lang.Override
        public final Builder setUnknownFields(
            final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet unknownFields) {
          return super.setUnknownFields(unknownFields);
        }

        @java.lang.Override
        public final Builder mergeUnknownFields(
            final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet unknownFields) {
          return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:hadoop.common.RpcSaslProto.SaslAuth)
      }

      // @@protoc_insertion_point(class_scope:hadoop.common.RpcSaslProto.SaslAuth)
      private static final org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth();
      }

      public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<SaslAuth>
          PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<SaslAuth>() {
        @java.lang.Override
        public SaslAuth parsePartialFrom(
            org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
            org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
            throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
          return new SaslAuth(input, extensionRegistry);
        }
      };

      public static org.apache.hadoop.thirdparty.protobuf.Parser<SaslAuth> parser() {
        return PARSER;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Parser<SaslAuth> getParserForType() {
        return PARSER;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    private int bitField0_;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int version_;
    /**
     * <code>optional uint32 version = 1;</code>
     */
    public boolean hasVersion() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional uint32 version = 1;</code>
     */
    public int getVersion() {
      return version_;
    }

    public static final int STATE_FIELD_NUMBER = 2;
    private int state_;
    /**
     * <code>required .hadoop.common.RpcSaslProto.SaslState state = 2;</code>
     */
    public boolean hasState() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required .hadoop.common.RpcSaslProto.SaslState state = 2;</code>
     */
    public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslState getState() {
      @SuppressWarnings("deprecation")
      org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslState result = org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslState.valueOf(state_);
      return result == null ? org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslState.SUCCESS : result;
    }

    public static final int TOKEN_FIELD_NUMBER = 3;
    private org.apache.hadoop.thirdparty.protobuf.ByteString token_;
    /**
     * <code>optional bytes token = 3;</code>
     */
    public boolean hasToken() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional bytes token = 3;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString getToken() {
      return token_;
    }

    public static final int AUTHS_FIELD_NUMBER = 4;
    private java.util.List<org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth> auths_;
    /**
     * <code>repeated .hadoop.common.RpcSaslProto.SaslAuth auths = 4;</code>
     */
    public java.util.List<org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth> getAuthsList() {
      return auths_;
    }
    /**
     * <code>repeated .hadoop.common.RpcSaslProto.SaslAuth auths = 4;</code>
     */
    public java.util.List<? extends org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuthOrBuilder> 
        getAuthsOrBuilderList() {
      return auths_;
    }
    /**
     * <code>repeated .hadoop.common.RpcSaslProto.SaslAuth auths = 4;</code>
     */
    public int getAuthsCount() {
      return auths_.size();
    }
    /**
     * <code>repeated .hadoop.common.RpcSaslProto.SaslAuth auths = 4;</code>
     */
    public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth getAuths(int index) {
      return auths_.get(index);
    }
    /**
     * <code>repeated .hadoop.common.RpcSaslProto.SaslAuth auths = 4;</code>
     */
    public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuthOrBuilder getAuthsOrBuilder(
        int index) {
      return auths_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasState()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getAuthsCount(); i++) {
        if (!getAuths(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(org.apache.hadoop.thirdparty.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeUInt32(1, version_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeEnum(2, state_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeBytes(3, token_);
      }
      for (int i = 0; i < auths_.size(); i++) {
        output.writeMessage(4, auths_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeUInt32Size(1, version_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeEnumSize(2, state_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeBytesSize(3, token_);
      }
      for (int i = 0; i < auths_.size(); i++) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(4, auths_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto other = (org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto) obj;

      if (hasVersion() != other.hasVersion()) return false;
      if (hasVersion()) {
        if (getVersion()
            != other.getVersion()) return false;
      }
      if (hasState() != other.hasState()) return false;
      if (hasState()) {
        if (state_ != other.state_) return false;
      }
      if (hasToken() != other.hasToken()) return false;
      if (hasToken()) {
        if (!getToken()
            .equals(other.getToken())) return false;
      }
      if (!getAuthsList()
          .equals(other.getAuthsList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasVersion()) {
        hash = (37 * hash) + VERSION_FIELD_NUMBER;
        hash = (53 * hash) + getVersion();
      }
      if (hasState()) {
        hash = (37 * hash) + STATE_FIELD_NUMBER;
        hash = (53 * hash) + state_;
      }
      if (hasToken()) {
        hash = (37 * hash) + TOKEN_FIELD_NUMBER;
        hash = (53 * hash) + getToken().hashCode();
      }
      if (getAuthsCount() > 0) {
        hash = (37 * hash) + AUTHS_FIELD_NUMBER;
        hash = (53 * hash) + getAuthsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code hadoop.common.RpcSaslProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.RpcSaslProto)
        org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.internal_static_hadoop_common_RpcSaslProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.internal_static_hadoop_common_RpcSaslProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.class, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.Builder.class);
      }

      // Construct using org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getAuthsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        version_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        state_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        token_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        if (authsBuilder_ == null) {
          auths_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          authsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.internal_static_hadoop_common_RpcSaslProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto getDefaultInstanceForType() {
        return org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto build() {
        org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto buildPartial() {
        org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto result = new org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.version_ = version_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.state_ = state_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.token_ = token_;
        if (authsBuilder_ == null) {
          if (((bitField0_ & 0x00000008) != 0)) {
            auths_ = java.util.Collections.unmodifiableList(auths_);
            bitField0_ = (bitField0_ & ~0x00000008);
          }
          result.auths_ = auths_;
        } else {
          result.auths_ = authsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(org.apache.hadoop.thirdparty.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto) {
          return mergeFrom((org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto other) {
        if (other == org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.getDefaultInstance()) return this;
        if (other.hasVersion()) {
          setVersion(other.getVersion());
        }
        if (other.hasState()) {
          setState(other.getState());
        }
        if (other.hasToken()) {
          setToken(other.getToken());
        }
        if (authsBuilder_ == null) {
          if (!other.auths_.isEmpty()) {
            if (auths_.isEmpty()) {
              auths_ = other.auths_;
              bitField0_ = (bitField0_ & ~0x00000008);
            } else {
              ensureAuthsIsMutable();
              auths_.addAll(other.auths_);
            }
            onChanged();
          }
        } else {
          if (!other.auths_.isEmpty()) {
            if (authsBuilder_.isEmpty()) {
              authsBuilder_.dispose();
              authsBuilder_ = null;
              auths_ = other.auths_;
              bitField0_ = (bitField0_ & ~0x00000008);
              authsBuilder_ = 
                org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getAuthsFieldBuilder() : null;
            } else {
              authsBuilder_.addAllMessages(other.auths_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasState()) {
          return false;
        }
        for (int i = 0; i < getAuthsCount(); i++) {
          if (!getAuths(i).isInitialized()) {
            return false;
          }
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int version_ ;
      /**
       * <code>optional uint32 version = 1;</code>
       */
      public boolean hasVersion() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional uint32 version = 1;</code>
       */
      public int getVersion() {
        return version_;
      }
      /**
       * <code>optional uint32 version = 1;</code>
       */
      public Builder setVersion(int value) {
        bitField0_ |= 0x00000001;
        version_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 version = 1;</code>
       */
      public Builder clearVersion() {
        bitField0_ = (bitField0_ & ~0x00000001);
        version_ = 0;
        onChanged();
        return this;
      }

      private int state_ = 0;
      /**
       * <code>required .hadoop.common.RpcSaslProto.SaslState state = 2;</code>
       */
      public boolean hasState() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required .hadoop.common.RpcSaslProto.SaslState state = 2;</code>
       */
      public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslState getState() {
        @SuppressWarnings("deprecation")
        org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslState result = org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslState.valueOf(state_);
        return result == null ? org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslState.SUCCESS : result;
      }
      /**
       * <code>required .hadoop.common.RpcSaslProto.SaslState state = 2;</code>
       */
      public Builder setState(org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslState value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        state_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>required .hadoop.common.RpcSaslProto.SaslState state = 2;</code>
       */
      public Builder clearState() {
        bitField0_ = (bitField0_ & ~0x00000002);
        state_ = 0;
        onChanged();
        return this;
      }

      private org.apache.hadoop.thirdparty.protobuf.ByteString token_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes token = 3;</code>
       */
      public boolean hasToken() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional bytes token = 3;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString getToken() {
        return token_;
      }
      /**
       * <code>optional bytes token = 3;</code>
       */
      public Builder setToken(org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        token_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes token = 3;</code>
       */
      public Builder clearToken() {
        bitField0_ = (bitField0_ & ~0x00000004);
        token_ = getDefaultInstance().getToken();
        onChanged();
        return this;
      }

      private java.util.List<org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth> auths_ =
        java.util.Collections.emptyList();
      private void ensureAuthsIsMutable() {
        if (!((bitField0_ & 0x00000008) != 0)) {
          auths_ = new java.util.ArrayList<org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth>(auths_);
          bitField0_ |= 0x00000008;
         }
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth.Builder, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuthOrBuilder> authsBuilder_;

      /**
       * <code>repeated .hadoop.common.RpcSaslProto.SaslAuth auths = 4;</code>
       */
      public java.util.List<org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth> getAuthsList() {
        if (authsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(auths_);
        } else {
          return authsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.common.RpcSaslProto.SaslAuth auths = 4;</code>
       */
      public int getAuthsCount() {
        if (authsBuilder_ == null) {
          return auths_.size();
        } else {
          return authsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.common.RpcSaslProto.SaslAuth auths = 4;</code>
       */
      public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth getAuths(int index) {
        if (authsBuilder_ == null) {
          return auths_.get(index);
        } else {
          return authsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.common.RpcSaslProto.SaslAuth auths = 4;</code>
       */
      public Builder setAuths(
          int index, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth value) {
        if (authsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAuthsIsMutable();
          auths_.set(index, value);
          onChanged();
        } else {
          authsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.RpcSaslProto.SaslAuth auths = 4;</code>
       */
      public Builder setAuths(
          int index, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth.Builder builderForValue) {
        if (authsBuilder_ == null) {
          ensureAuthsIsMutable();
          auths_.set(index, builderForValue.build());
          onChanged();
        } else {
          authsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.RpcSaslProto.SaslAuth auths = 4;</code>
       */
      public Builder addAuths(org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth value) {
        if (authsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAuthsIsMutable();
          auths_.add(value);
          onChanged();
        } else {
          authsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.RpcSaslProto.SaslAuth auths = 4;</code>
       */
      public Builder addAuths(
          int index, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth value) {
        if (authsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAuthsIsMutable();
          auths_.add(index, value);
          onChanged();
        } else {
          authsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.RpcSaslProto.SaslAuth auths = 4;</code>
       */
      public Builder addAuths(
          org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth.Builder builderForValue) {
        if (authsBuilder_ == null) {
          ensureAuthsIsMutable();
          auths_.add(builderForValue.build());
          onChanged();
        } else {
          authsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.RpcSaslProto.SaslAuth auths = 4;</code>
       */
      public Builder addAuths(
          int index, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth.Builder builderForValue) {
        if (authsBuilder_ == null) {
          ensureAuthsIsMutable();
          auths_.add(index, builderForValue.build());
          onChanged();
        } else {
          authsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.RpcSaslProto.SaslAuth auths = 4;</code>
       */
      public Builder addAllAuths(
          java.lang.Iterable<? extends org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth> values) {
        if (authsBuilder_ == null) {
          ensureAuthsIsMutable();
          org.apache.hadoop.thirdparty.protobuf.AbstractMessageLite.Builder.addAll(
              values, auths_);
          onChanged();
        } else {
          authsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.RpcSaslProto.SaslAuth auths = 4;</code>
       */
      public Builder clearAuths() {
        if (authsBuilder_ == null) {
          auths_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
          onChanged();
        } else {
          authsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.RpcSaslProto.SaslAuth auths = 4;</code>
       */
      public Builder removeAuths(int index) {
        if (authsBuilder_ == null) {
          ensureAuthsIsMutable();
          auths_.remove(index);
          onChanged();
        } else {
          authsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.RpcSaslProto.SaslAuth auths = 4;</code>
       */
      public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth.Builder getAuthsBuilder(
          int index) {
        return getAuthsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.common.RpcSaslProto.SaslAuth auths = 4;</code>
       */
      public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuthOrBuilder getAuthsOrBuilder(
          int index) {
        if (authsBuilder_ == null) {
          return auths_.get(index);  } else {
          return authsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.common.RpcSaslProto.SaslAuth auths = 4;</code>
       */
      public java.util.List<? extends org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuthOrBuilder> 
           getAuthsOrBuilderList() {
        if (authsBuilder_ != null) {
          return authsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(auths_);
        }
      }
      /**
       * <code>repeated .hadoop.common.RpcSaslProto.SaslAuth auths = 4;</code>
       */
      public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth.Builder addAuthsBuilder() {
        return getAuthsFieldBuilder().addBuilder(
            org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.common.RpcSaslProto.SaslAuth auths = 4;</code>
       */
      public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth.Builder addAuthsBuilder(
          int index) {
        return getAuthsFieldBuilder().addBuilder(
            index, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.common.RpcSaslProto.SaslAuth auths = 4;</code>
       */
      public java.util.List<org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth.Builder> 
           getAuthsBuilderList() {
        return getAuthsFieldBuilder().getBuilderList();
      }
      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth.Builder, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuthOrBuilder> 
          getAuthsFieldBuilder() {
        if (authsBuilder_ == null) {
          authsBuilder_ = new org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
              org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuth.Builder, org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto.SaslAuthOrBuilder>(
                  auths_,
                  ((bitField0_ & 0x00000008) != 0),
                  getParentForChildren(),
                  isClean());
          auths_ = null;
        }
        return authsBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:hadoop.common.RpcSaslProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.RpcSaslProto)
    private static final org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto();
    }

    public static org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<RpcSaslProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<RpcSaslProto>() {
      @java.lang.Override
      public RpcSaslProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new RpcSaslProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<RpcSaslProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<RpcSaslProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.ipc.protobuf.RpcHeaderProtos.RpcSaslProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_RPCTraceInfoProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_RPCTraceInfoProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_RPCCallerContextProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_RPCCallerContextProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_RpcRequestHeaderProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_RpcRequestHeaderProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_RpcResponseHeaderProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_RpcResponseHeaderProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_RpcSaslProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_RpcSaslProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_RpcSaslProto_SaslAuth_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_RpcSaslProto_SaslAuth_fieldAccessorTable;

  public static org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017RpcHeader.proto\022\rhadoop.common\"K\n\021RPCT" +
      "raceInfoProto\022\017\n\007traceId\030\001 \001(\003\022\020\n\010parent" +
      "Id\030\002 \001(\003\022\023\n\013spanContext\030\003 \001(\014\";\n\025RPCCall" +
      "erContextProto\022\017\n\007context\030\001 \002(\t\022\021\n\tsigna" +
      "ture\030\002 \001(\014\"\245\003\n\025RpcRequestHeaderProto\022,\n\007" +
      "rpcKind\030\001 \001(\0162\033.hadoop.common.RpcKindPro" +
      "to\022B\n\005rpcOp\030\002 \001(\01623.hadoop.common.RpcReq" +
      "uestHeaderProto.OperationProto\022\016\n\006callId" +
      "\030\003 \002(\021\022\020\n\010clientId\030\004 \002(\014\022\026\n\nretryCount\030\005" +
      " \001(\021:\002-1\0223\n\ttraceInfo\030\006 \001(\0132 .hadoop.com" +
      "mon.RPCTraceInfoProto\022;\n\rcallerContext\030\007" +
      " \001(\0132$.hadoop.common.RPCCallerContextPro" +
      "to\022\017\n\007stateId\030\010 \001(\003\"]\n\016OperationProto\022\024\n" +
      "\020RPC_FINAL_PACKET\020\000\022\033\n\027RPC_CONTINUATION_" +
      "PACKET\020\001\022\030\n\024RPC_CLOSE_CONNECTION\020\002\"\333\005\n\026R" +
      "pcResponseHeaderProto\022\016\n\006callId\030\001 \002(\r\022D\n" +
      "\006status\030\002 \002(\01624.hadoop.common.RpcRespons" +
      "eHeaderProto.RpcStatusProto\022\033\n\023serverIpc" +
      "VersionNum\030\003 \001(\r\022\032\n\022exceptionClassName\030\004" +
      " \001(\t\022\020\n\010errorMsg\030\005 \001(\t\022L\n\013errorDetail\030\006 " +
      "\001(\01627.hadoop.common.RpcResponseHeaderPro" +
      "to.RpcErrorCodeProto\022\020\n\010clientId\030\007 \001(\014\022\026" +
      "\n\nretryCount\030\010 \001(\021:\002-1\022\017\n\007stateId\030\t \001(\003\"" +
      "3\n\016RpcStatusProto\022\013\n\007SUCCESS\020\000\022\t\n\005ERROR\020" +
      "\001\022\t\n\005FATAL\020\002\"\341\002\n\021RpcErrorCodeProto\022\025\n\021ER" +
      "ROR_APPLICATION\020\001\022\030\n\024ERROR_NO_SUCH_METHO" +
      "D\020\002\022\032\n\026ERROR_NO_SUCH_PROTOCOL\020\003\022\024\n\020ERROR" +
      "_RPC_SERVER\020\004\022\036\n\032ERROR_SERIALIZING_RESPO" +
      "NSE\020\005\022\036\n\032ERROR_RPC_VERSION_MISMATCH\020\006\022\021\n" +
      "\rFATAL_UNKNOWN\020\n\022#\n\037FATAL_UNSUPPORTED_SE" +
      "RIALIZATION\020\013\022\034\n\030FATAL_INVALID_RPC_HEADE" +
      "R\020\014\022\037\n\033FATAL_DESERIALIZING_REQUEST\020\r\022\032\n\026" +
      "FATAL_VERSION_MISMATCH\020\016\022\026\n\022FATAL_UNAUTH" +
      "ORIZED\020\017\"\335\002\n\014RpcSaslProto\022\017\n\007version\030\001 \001" +
      "(\r\0224\n\005state\030\002 \002(\0162%.hadoop.common.RpcSas" +
      "lProto.SaslState\022\r\n\005token\030\003 \001(\014\0223\n\005auths" +
      "\030\004 \003(\0132$.hadoop.common.RpcSaslProto.Sasl" +
      "Auth\032d\n\010SaslAuth\022\016\n\006method\030\001 \002(\t\022\021\n\tmech" +
      "anism\030\002 \002(\t\022\020\n\010protocol\030\003 \001(\t\022\020\n\010serverI" +
      "d\030\004 \001(\t\022\021\n\tchallenge\030\005 \001(\014\"\\\n\tSaslState\022" +
      "\013\n\007SUCCESS\020\000\022\r\n\tNEGOTIATE\020\001\022\014\n\010INITIATE\020" +
      "\002\022\r\n\tCHALLENGE\020\003\022\014\n\010RESPONSE\020\004\022\010\n\004WRAP\020\005" +
      "*J\n\014RpcKindProto\022\017\n\013RPC_BUILTIN\020\000\022\020\n\014RPC" +
      "_WRITABLE\020\001\022\027\n\023RPC_PROTOCOL_BUFFER\020\002B4\n\036" +
      "org.apache.hadoop.ipc.protobufB\017RpcHeade" +
      "rProtos\240\001\001"
    };
    org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public org.apache.hadoop.thirdparty.protobuf.ExtensionRegistry assignDescriptors(
              org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_hadoop_common_RPCTraceInfoProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hadoop_common_RPCTraceInfoProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_RPCTraceInfoProto_descriptor,
        new java.lang.String[] { "TraceId", "ParentId", "SpanContext", });
    internal_static_hadoop_common_RPCCallerContextProto_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hadoop_common_RPCCallerContextProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_RPCCallerContextProto_descriptor,
        new java.lang.String[] { "Context", "Signature", });
    internal_static_hadoop_common_RpcRequestHeaderProto_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_hadoop_common_RpcRequestHeaderProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_RpcRequestHeaderProto_descriptor,
        new java.lang.String[] { "RpcKind", "RpcOp", "CallId", "ClientId", "RetryCount", "TraceInfo", "CallerContext", "StateId", });
    internal_static_hadoop_common_RpcResponseHeaderProto_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_hadoop_common_RpcResponseHeaderProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_RpcResponseHeaderProto_descriptor,
        new java.lang.String[] { "CallId", "Status", "ServerIpcVersionNum", "ExceptionClassName", "ErrorMsg", "ErrorDetail", "ClientId", "RetryCount", "StateId", });
    internal_static_hadoop_common_RpcSaslProto_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_hadoop_common_RpcSaslProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_RpcSaslProto_descriptor,
        new java.lang.String[] { "Version", "State", "Token", "Auths", });
    internal_static_hadoop_common_RpcSaslProto_SaslAuth_descriptor =
      internal_static_hadoop_common_RpcSaslProto_descriptor.getNestedTypes().get(0);
    internal_static_hadoop_common_RpcSaslProto_SaslAuth_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_RpcSaslProto_SaslAuth_descriptor,
        new java.lang.String[] { "Method", "Mechanism", "Protocol", "ServerId", "Challenge", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}