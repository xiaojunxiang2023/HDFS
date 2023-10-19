// source: HAServiceProtocol.proto

package org.apache.hadoop.ha.proto;

public final class HAServiceProtocolProtos {
  private HAServiceProtocolProtos() {}
  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code hadoop.common.HAServiceStateProto}
   */
  public enum HAServiceStateProto
      implements org.apache.hadoop.thirdparty.protobuf.ProtocolMessageEnum {
    /**
     * <code>INITIALIZING = 0;</code>
     */
    INITIALIZING(0),
    /**
     * <code>ACTIVE = 1;</code>
     */
    ACTIVE(1),
    /**
     * <code>STANDBY = 2;</code>
     */
    STANDBY(2),
    /**
     * <code>OBSERVER = 3;</code>
     */
    OBSERVER(3),
    ;

    /**
     * <code>INITIALIZING = 0;</code>
     */
    public static final int INITIALIZING_VALUE = 0;
    /**
     * <code>ACTIVE = 1;</code>
     */
    public static final int ACTIVE_VALUE = 1;
    /**
     * <code>STANDBY = 2;</code>
     */
    public static final int STANDBY_VALUE = 2;
    /**
     * <code>OBSERVER = 3;</code>
     */
    public static final int OBSERVER_VALUE = 3;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static HAServiceStateProto valueOf(int value) {
      return forNumber(value);
    }

    public static HAServiceStateProto forNumber(int value) {
      switch (value) {
        case 0: return INITIALIZING;
        case 1: return ACTIVE;
        case 2: return STANDBY;
        case 3: return OBSERVER;
        default: return null;
      }
    }

    public static org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<HAServiceStateProto>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<
        HAServiceStateProto> internalValueMap =
          new org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<HAServiceStateProto>() {
            public HAServiceStateProto findValueByNumber(int number) {
              return HAServiceStateProto.forNumber(number);
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
      return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.getDescriptor().getEnumTypes().get(0);
    }

    private static final HAServiceStateProto[] VALUES = values();

    public static HAServiceStateProto valueOf(
        org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private HAServiceStateProto(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:hadoop.common.HAServiceStateProto)
  }

  /**
   * Protobuf enum {@code hadoop.common.HARequestSource}
   */
  public enum HARequestSource
      implements org.apache.hadoop.thirdparty.protobuf.ProtocolMessageEnum {
    /**
     * <code>REQUEST_BY_USER = 0;</code>
     */
    REQUEST_BY_USER(0),
    /**
     * <code>REQUEST_BY_USER_FORCED = 1;</code>
     */
    REQUEST_BY_USER_FORCED(1),
    /**
     * <code>REQUEST_BY_ZKFC = 2;</code>
     */
    REQUEST_BY_ZKFC(2),
    ;

    /**
     * <code>REQUEST_BY_USER = 0;</code>
     */
    public static final int REQUEST_BY_USER_VALUE = 0;
    /**
     * <code>REQUEST_BY_USER_FORCED = 1;</code>
     */
    public static final int REQUEST_BY_USER_FORCED_VALUE = 1;
    /**
     * <code>REQUEST_BY_ZKFC = 2;</code>
     */
    public static final int REQUEST_BY_ZKFC_VALUE = 2;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static HARequestSource valueOf(int value) {
      return forNumber(value);
    }

    public static HARequestSource forNumber(int value) {
      switch (value) {
        case 0: return REQUEST_BY_USER;
        case 1: return REQUEST_BY_USER_FORCED;
        case 2: return REQUEST_BY_ZKFC;
        default: return null;
      }
    }

    public static org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<HARequestSource>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<
        HARequestSource> internalValueMap =
          new org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<HARequestSource>() {
            public HARequestSource findValueByNumber(int number) {
              return HARequestSource.forNumber(number);
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
      return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.getDescriptor().getEnumTypes().get(1);
    }

    private static final HARequestSource[] VALUES = values();

    public static HARequestSource valueOf(
        org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private HARequestSource(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:hadoop.common.HARequestSource)
  }

  public interface HAStateChangeRequestInfoProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.HAStateChangeRequestInfoProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required .hadoop.common.HARequestSource reqSource = 1;</code>
     */
    boolean hasReqSource();
    /**
     * <code>required .hadoop.common.HARequestSource reqSource = 1;</code>
     */
    org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HARequestSource getReqSource();
  }
  /**
   * Protobuf type {@code hadoop.common.HAStateChangeRequestInfoProto}
   */
  public  static final class HAStateChangeRequestInfoProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.HAStateChangeRequestInfoProto)
      HAStateChangeRequestInfoProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HAStateChangeRequestInfoProto.newBuilder() to construct.
    private HAStateChangeRequestInfoProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HAStateChangeRequestInfoProto() {
      reqSource_ = 0;
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HAStateChangeRequestInfoProto(
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
              org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HARequestSource value = org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HARequestSource.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                reqSource_ = rawValue;
              }
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
      return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_HAStateChangeRequestInfoProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_HAStateChangeRequestInfoProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.class, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.Builder.class);
    }

    private int bitField0_;
    public static final int REQSOURCE_FIELD_NUMBER = 1;
    private int reqSource_;
    /**
     * <code>required .hadoop.common.HARequestSource reqSource = 1;</code>
     */
    public boolean hasReqSource() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required .hadoop.common.HARequestSource reqSource = 1;</code>
     */
    public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HARequestSource getReqSource() {
      @SuppressWarnings("deprecation")
      org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HARequestSource result = org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HARequestSource.valueOf(reqSource_);
      return result == null ? org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HARequestSource.REQUEST_BY_USER : result;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasReqSource()) {
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
        output.writeEnum(1, reqSource_);
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
          .computeEnumSize(1, reqSource_);
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
      if (!(obj instanceof org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto other = (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto) obj;

      if (hasReqSource() != other.hasReqSource()) return false;
      if (hasReqSource()) {
        if (reqSource_ != other.reqSource_) return false;
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
      if (hasReqSource()) {
        hash = (37 * hash) + REQSOURCE_FIELD_NUMBER;
        hash = (53 * hash) + reqSource_;
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto prototype) {
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
     * Protobuf type {@code hadoop.common.HAStateChangeRequestInfoProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.HAStateChangeRequestInfoProto)
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_HAStateChangeRequestInfoProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_HAStateChangeRequestInfoProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.class, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.Builder.class);
      }

      // Construct using org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.newBuilder()
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
        reqSource_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_HAStateChangeRequestInfoProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto getDefaultInstanceForType() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto build() {
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto buildPartial() {
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto result = new org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.reqSource_ = reqSource_;
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
        if (other instanceof org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto) {
          return mergeFrom((org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto other) {
        if (other == org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.getDefaultInstance()) return this;
        if (other.hasReqSource()) {
          setReqSource(other.getReqSource());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasReqSource()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int reqSource_ = 0;
      /**
       * <code>required .hadoop.common.HARequestSource reqSource = 1;</code>
       */
      public boolean hasReqSource() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required .hadoop.common.HARequestSource reqSource = 1;</code>
       */
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HARequestSource getReqSource() {
        @SuppressWarnings("deprecation")
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HARequestSource result = org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HARequestSource.valueOf(reqSource_);
        return result == null ? org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HARequestSource.REQUEST_BY_USER : result;
      }
      /**
       * <code>required .hadoop.common.HARequestSource reqSource = 1;</code>
       */
      public Builder setReqSource(org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HARequestSource value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        reqSource_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>required .hadoop.common.HARequestSource reqSource = 1;</code>
       */
      public Builder clearReqSource() {
        bitField0_ = (bitField0_ & ~0x00000001);
        reqSource_ = 0;
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.HAStateChangeRequestInfoProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.HAStateChangeRequestInfoProto)
    private static final org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto();
    }

    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<HAStateChangeRequestInfoProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<HAStateChangeRequestInfoProto>() {
      @java.lang.Override
      public HAStateChangeRequestInfoProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new HAStateChangeRequestInfoProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<HAStateChangeRequestInfoProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<HAStateChangeRequestInfoProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface MonitorHealthRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.MonitorHealthRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   **
   * void request
   * </pre>
   *
   * Protobuf type {@code hadoop.common.MonitorHealthRequestProto}
   */
  public  static final class MonitorHealthRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.MonitorHealthRequestProto)
      MonitorHealthRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MonitorHealthRequestProto.newBuilder() to construct.
    private MonitorHealthRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MonitorHealthRequestProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MonitorHealthRequestProto(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
      return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_MonitorHealthRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_MonitorHealthRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto.class, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto.Builder.class);
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
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto other = (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto) obj;

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
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto prototype) {
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
     * void request
     * </pre>
     *
     * Protobuf type {@code hadoop.common.MonitorHealthRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.MonitorHealthRequestProto)
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_MonitorHealthRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_MonitorHealthRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto.class, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto.newBuilder()
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
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_MonitorHealthRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto build() {
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto buildPartial() {
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto result = new org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto(this);
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
        if (other instanceof org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto) {
          return mergeFrom((org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto other) {
        if (other == org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.MonitorHealthRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.MonitorHealthRequestProto)
    private static final org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto();
    }

    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<MonitorHealthRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<MonitorHealthRequestProto>() {
      @java.lang.Override
      public MonitorHealthRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new MonitorHealthRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<MonitorHealthRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<MonitorHealthRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface MonitorHealthResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.MonitorHealthResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   **
   * void response
   * </pre>
   *
   * Protobuf type {@code hadoop.common.MonitorHealthResponseProto}
   */
  public  static final class MonitorHealthResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.MonitorHealthResponseProto)
      MonitorHealthResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MonitorHealthResponseProto.newBuilder() to construct.
    private MonitorHealthResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MonitorHealthResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MonitorHealthResponseProto(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
      return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_MonitorHealthResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_MonitorHealthResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto.class, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto.Builder.class);
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
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto other = (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto) obj;

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
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto prototype) {
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
     * void response
     * </pre>
     *
     * Protobuf type {@code hadoop.common.MonitorHealthResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.MonitorHealthResponseProto)
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_MonitorHealthResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_MonitorHealthResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto.class, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto.newBuilder()
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
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_MonitorHealthResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto build() {
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto buildPartial() {
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto result = new org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto(this);
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
        if (other instanceof org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto) {
          return mergeFrom((org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto other) {
        if (other == org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.MonitorHealthResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.MonitorHealthResponseProto)
    private static final org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto();
    }

    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<MonitorHealthResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<MonitorHealthResponseProto>() {
      @java.lang.Override
      public MonitorHealthResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new MonitorHealthResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<MonitorHealthResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<MonitorHealthResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface TransitionToActiveRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.TransitionToActiveRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
     */
    boolean hasReqInfo();
    /**
     * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
     */
    org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto getReqInfo();
    /**
     * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
     */
    org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProtoOrBuilder getReqInfoOrBuilder();
  }
  /**
   * <pre>
   **
   * void request
   * </pre>
   *
   * Protobuf type {@code hadoop.common.TransitionToActiveRequestProto}
   */
  public  static final class TransitionToActiveRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.TransitionToActiveRequestProto)
      TransitionToActiveRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TransitionToActiveRequestProto.newBuilder() to construct.
    private TransitionToActiveRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TransitionToActiveRequestProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TransitionToActiveRequestProto(
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
              org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = reqInfo_.toBuilder();
              }
              reqInfo_ = input.readMessage(org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(reqInfo_);
                reqInfo_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
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
      return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_TransitionToActiveRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_TransitionToActiveRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto.class, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto.Builder.class);
    }

    private int bitField0_;
    public static final int REQINFO_FIELD_NUMBER = 1;
    private org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto reqInfo_;
    /**
     * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
     */
    public boolean hasReqInfo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
     */
    public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto getReqInfo() {
      return reqInfo_ == null ? org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.getDefaultInstance() : reqInfo_;
    }
    /**
     * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
     */
    public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProtoOrBuilder getReqInfoOrBuilder() {
      return reqInfo_ == null ? org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.getDefaultInstance() : reqInfo_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasReqInfo()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getReqInfo().isInitialized()) {
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
        output.writeMessage(1, getReqInfo());
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
          .computeMessageSize(1, getReqInfo());
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
      if (!(obj instanceof org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto other = (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto) obj;

      if (hasReqInfo() != other.hasReqInfo()) return false;
      if (hasReqInfo()) {
        if (!getReqInfo()
            .equals(other.getReqInfo())) return false;
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
      if (hasReqInfo()) {
        hash = (37 * hash) + REQINFO_FIELD_NUMBER;
        hash = (53 * hash) + getReqInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto prototype) {
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
     * void request
     * </pre>
     *
     * Protobuf type {@code hadoop.common.TransitionToActiveRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.TransitionToActiveRequestProto)
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_TransitionToActiveRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_TransitionToActiveRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto.class, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto.newBuilder()
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
          getReqInfoFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (reqInfoBuilder_ == null) {
          reqInfo_ = null;
        } else {
          reqInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_TransitionToActiveRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto build() {
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto buildPartial() {
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto result = new org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (reqInfoBuilder_ == null) {
            result.reqInfo_ = reqInfo_;
          } else {
            result.reqInfo_ = reqInfoBuilder_.build();
          }
          to_bitField0_ |= 0x00000001;
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
        if (other instanceof org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto) {
          return mergeFrom((org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto other) {
        if (other == org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto.getDefaultInstance()) return this;
        if (other.hasReqInfo()) {
          mergeReqInfo(other.getReqInfo());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasReqInfo()) {
          return false;
        }
        if (!getReqInfo().isInitialized()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto reqInfo_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.Builder, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProtoOrBuilder> reqInfoBuilder_;
      /**
       * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
       */
      public boolean hasReqInfo() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
       */
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto getReqInfo() {
        if (reqInfoBuilder_ == null) {
          return reqInfo_ == null ? org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.getDefaultInstance() : reqInfo_;
        } else {
          return reqInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
       */
      public Builder setReqInfo(org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto value) {
        if (reqInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          reqInfo_ = value;
          onChanged();
        } else {
          reqInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
       */
      public Builder setReqInfo(
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.Builder builderForValue) {
        if (reqInfoBuilder_ == null) {
          reqInfo_ = builderForValue.build();
          onChanged();
        } else {
          reqInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
       */
      public Builder mergeReqInfo(org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto value) {
        if (reqInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              reqInfo_ != null &&
              reqInfo_ != org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.getDefaultInstance()) {
            reqInfo_ =
              org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.newBuilder(reqInfo_).mergeFrom(value).buildPartial();
          } else {
            reqInfo_ = value;
          }
          onChanged();
        } else {
          reqInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
       */
      public Builder clearReqInfo() {
        if (reqInfoBuilder_ == null) {
          reqInfo_ = null;
          onChanged();
        } else {
          reqInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
       */
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.Builder getReqInfoBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getReqInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
       */
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProtoOrBuilder getReqInfoOrBuilder() {
        if (reqInfoBuilder_ != null) {
          return reqInfoBuilder_.getMessageOrBuilder();
        } else {
          return reqInfo_ == null ?
              org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.getDefaultInstance() : reqInfo_;
        }
      }
      /**
       * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.Builder, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProtoOrBuilder> 
          getReqInfoFieldBuilder() {
        if (reqInfoBuilder_ == null) {
          reqInfoBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.Builder, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProtoOrBuilder>(
                  getReqInfo(),
                  getParentForChildren(),
                  isClean());
          reqInfo_ = null;
        }
        return reqInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.TransitionToActiveRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.TransitionToActiveRequestProto)
    private static final org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto();
    }

    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<TransitionToActiveRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<TransitionToActiveRequestProto>() {
      @java.lang.Override
      public TransitionToActiveRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new TransitionToActiveRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<TransitionToActiveRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<TransitionToActiveRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface TransitionToActiveResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.TransitionToActiveResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   **
   * void response
   * </pre>
   *
   * Protobuf type {@code hadoop.common.TransitionToActiveResponseProto}
   */
  public  static final class TransitionToActiveResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.TransitionToActiveResponseProto)
      TransitionToActiveResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TransitionToActiveResponseProto.newBuilder() to construct.
    private TransitionToActiveResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TransitionToActiveResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TransitionToActiveResponseProto(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
      return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_TransitionToActiveResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_TransitionToActiveResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto.class, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto.Builder.class);
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
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto other = (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto) obj;

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
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto prototype) {
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
     * void response
     * </pre>
     *
     * Protobuf type {@code hadoop.common.TransitionToActiveResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.TransitionToActiveResponseProto)
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_TransitionToActiveResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_TransitionToActiveResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto.class, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto.newBuilder()
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
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_TransitionToActiveResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto build() {
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto buildPartial() {
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto result = new org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto(this);
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
        if (other instanceof org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto) {
          return mergeFrom((org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto other) {
        if (other == org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.TransitionToActiveResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.TransitionToActiveResponseProto)
    private static final org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto();
    }

    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<TransitionToActiveResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<TransitionToActiveResponseProto>() {
      @java.lang.Override
      public TransitionToActiveResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new TransitionToActiveResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<TransitionToActiveResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<TransitionToActiveResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface TransitionToStandbyRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.TransitionToStandbyRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
     */
    boolean hasReqInfo();
    /**
     * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
     */
    org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto getReqInfo();
    /**
     * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
     */
    org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProtoOrBuilder getReqInfoOrBuilder();
  }
  /**
   * <pre>
   **
   * void request
   * </pre>
   *
   * Protobuf type {@code hadoop.common.TransitionToStandbyRequestProto}
   */
  public  static final class TransitionToStandbyRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.TransitionToStandbyRequestProto)
      TransitionToStandbyRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TransitionToStandbyRequestProto.newBuilder() to construct.
    private TransitionToStandbyRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TransitionToStandbyRequestProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TransitionToStandbyRequestProto(
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
              org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = reqInfo_.toBuilder();
              }
              reqInfo_ = input.readMessage(org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(reqInfo_);
                reqInfo_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
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
      return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_TransitionToStandbyRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_TransitionToStandbyRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto.class, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto.Builder.class);
    }

    private int bitField0_;
    public static final int REQINFO_FIELD_NUMBER = 1;
    private org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto reqInfo_;
    /**
     * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
     */
    public boolean hasReqInfo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
     */
    public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto getReqInfo() {
      return reqInfo_ == null ? org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.getDefaultInstance() : reqInfo_;
    }
    /**
     * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
     */
    public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProtoOrBuilder getReqInfoOrBuilder() {
      return reqInfo_ == null ? org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.getDefaultInstance() : reqInfo_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasReqInfo()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getReqInfo().isInitialized()) {
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
        output.writeMessage(1, getReqInfo());
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
          .computeMessageSize(1, getReqInfo());
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
      if (!(obj instanceof org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto other = (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto) obj;

      if (hasReqInfo() != other.hasReqInfo()) return false;
      if (hasReqInfo()) {
        if (!getReqInfo()
            .equals(other.getReqInfo())) return false;
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
      if (hasReqInfo()) {
        hash = (37 * hash) + REQINFO_FIELD_NUMBER;
        hash = (53 * hash) + getReqInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto prototype) {
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
     * void request
     * </pre>
     *
     * Protobuf type {@code hadoop.common.TransitionToStandbyRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.TransitionToStandbyRequestProto)
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_TransitionToStandbyRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_TransitionToStandbyRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto.class, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto.newBuilder()
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
          getReqInfoFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (reqInfoBuilder_ == null) {
          reqInfo_ = null;
        } else {
          reqInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_TransitionToStandbyRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto build() {
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto buildPartial() {
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto result = new org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (reqInfoBuilder_ == null) {
            result.reqInfo_ = reqInfo_;
          } else {
            result.reqInfo_ = reqInfoBuilder_.build();
          }
          to_bitField0_ |= 0x00000001;
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
        if (other instanceof org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto) {
          return mergeFrom((org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto other) {
        if (other == org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto.getDefaultInstance()) return this;
        if (other.hasReqInfo()) {
          mergeReqInfo(other.getReqInfo());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasReqInfo()) {
          return false;
        }
        if (!getReqInfo().isInitialized()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto reqInfo_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.Builder, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProtoOrBuilder> reqInfoBuilder_;
      /**
       * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
       */
      public boolean hasReqInfo() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
       */
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto getReqInfo() {
        if (reqInfoBuilder_ == null) {
          return reqInfo_ == null ? org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.getDefaultInstance() : reqInfo_;
        } else {
          return reqInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
       */
      public Builder setReqInfo(org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto value) {
        if (reqInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          reqInfo_ = value;
          onChanged();
        } else {
          reqInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
       */
      public Builder setReqInfo(
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.Builder builderForValue) {
        if (reqInfoBuilder_ == null) {
          reqInfo_ = builderForValue.build();
          onChanged();
        } else {
          reqInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
       */
      public Builder mergeReqInfo(org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto value) {
        if (reqInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              reqInfo_ != null &&
              reqInfo_ != org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.getDefaultInstance()) {
            reqInfo_ =
              org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.newBuilder(reqInfo_).mergeFrom(value).buildPartial();
          } else {
            reqInfo_ = value;
          }
          onChanged();
        } else {
          reqInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
       */
      public Builder clearReqInfo() {
        if (reqInfoBuilder_ == null) {
          reqInfo_ = null;
          onChanged();
        } else {
          reqInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
       */
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.Builder getReqInfoBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getReqInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
       */
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProtoOrBuilder getReqInfoOrBuilder() {
        if (reqInfoBuilder_ != null) {
          return reqInfoBuilder_.getMessageOrBuilder();
        } else {
          return reqInfo_ == null ?
              org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.getDefaultInstance() : reqInfo_;
        }
      }
      /**
       * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.Builder, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProtoOrBuilder> 
          getReqInfoFieldBuilder() {
        if (reqInfoBuilder_ == null) {
          reqInfoBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.Builder, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProtoOrBuilder>(
                  getReqInfo(),
                  getParentForChildren(),
                  isClean());
          reqInfo_ = null;
        }
        return reqInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.TransitionToStandbyRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.TransitionToStandbyRequestProto)
    private static final org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto();
    }

    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<TransitionToStandbyRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<TransitionToStandbyRequestProto>() {
      @java.lang.Override
      public TransitionToStandbyRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new TransitionToStandbyRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<TransitionToStandbyRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<TransitionToStandbyRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface TransitionToStandbyResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.TransitionToStandbyResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   **
   * void response
   * </pre>
   *
   * Protobuf type {@code hadoop.common.TransitionToStandbyResponseProto}
   */
  public  static final class TransitionToStandbyResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.TransitionToStandbyResponseProto)
      TransitionToStandbyResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TransitionToStandbyResponseProto.newBuilder() to construct.
    private TransitionToStandbyResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TransitionToStandbyResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TransitionToStandbyResponseProto(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
      return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_TransitionToStandbyResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_TransitionToStandbyResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto.class, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto.Builder.class);
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
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto other = (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto) obj;

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
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto prototype) {
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
     * void response
     * </pre>
     *
     * Protobuf type {@code hadoop.common.TransitionToStandbyResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.TransitionToStandbyResponseProto)
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_TransitionToStandbyResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_TransitionToStandbyResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto.class, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto.newBuilder()
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
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_TransitionToStandbyResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto build() {
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto buildPartial() {
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto result = new org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto(this);
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
        if (other instanceof org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto) {
          return mergeFrom((org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto other) {
        if (other == org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.TransitionToStandbyResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.TransitionToStandbyResponseProto)
    private static final org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto();
    }

    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<TransitionToStandbyResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<TransitionToStandbyResponseProto>() {
      @java.lang.Override
      public TransitionToStandbyResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new TransitionToStandbyResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<TransitionToStandbyResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<TransitionToStandbyResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface TransitionToObserverRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.TransitionToObserverRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
     */
    boolean hasReqInfo();
    /**
     * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
     */
    org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto getReqInfo();
    /**
     * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
     */
    org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProtoOrBuilder getReqInfoOrBuilder();
  }
  /**
   * <pre>
   **
   * void request
   * </pre>
   *
   * Protobuf type {@code hadoop.common.TransitionToObserverRequestProto}
   */
  public  static final class TransitionToObserverRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.TransitionToObserverRequestProto)
      TransitionToObserverRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TransitionToObserverRequestProto.newBuilder() to construct.
    private TransitionToObserverRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TransitionToObserverRequestProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TransitionToObserverRequestProto(
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
              org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = reqInfo_.toBuilder();
              }
              reqInfo_ = input.readMessage(org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(reqInfo_);
                reqInfo_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
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
      return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_TransitionToObserverRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_TransitionToObserverRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto.class, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto.Builder.class);
    }

    private int bitField0_;
    public static final int REQINFO_FIELD_NUMBER = 1;
    private org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto reqInfo_;
    /**
     * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
     */
    public boolean hasReqInfo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
     */
    public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto getReqInfo() {
      return reqInfo_ == null ? org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.getDefaultInstance() : reqInfo_;
    }
    /**
     * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
     */
    public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProtoOrBuilder getReqInfoOrBuilder() {
      return reqInfo_ == null ? org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.getDefaultInstance() : reqInfo_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasReqInfo()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getReqInfo().isInitialized()) {
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
        output.writeMessage(1, getReqInfo());
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
          .computeMessageSize(1, getReqInfo());
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
      if (!(obj instanceof org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto other = (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto) obj;

      if (hasReqInfo() != other.hasReqInfo()) return false;
      if (hasReqInfo()) {
        if (!getReqInfo()
            .equals(other.getReqInfo())) return false;
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
      if (hasReqInfo()) {
        hash = (37 * hash) + REQINFO_FIELD_NUMBER;
        hash = (53 * hash) + getReqInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto prototype) {
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
     * void request
     * </pre>
     *
     * Protobuf type {@code hadoop.common.TransitionToObserverRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.TransitionToObserverRequestProto)
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_TransitionToObserverRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_TransitionToObserverRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto.class, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto.newBuilder()
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
          getReqInfoFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (reqInfoBuilder_ == null) {
          reqInfo_ = null;
        } else {
          reqInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_TransitionToObserverRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto build() {
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto buildPartial() {
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto result = new org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (reqInfoBuilder_ == null) {
            result.reqInfo_ = reqInfo_;
          } else {
            result.reqInfo_ = reqInfoBuilder_.build();
          }
          to_bitField0_ |= 0x00000001;
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
        if (other instanceof org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto) {
          return mergeFrom((org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto other) {
        if (other == org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto.getDefaultInstance()) return this;
        if (other.hasReqInfo()) {
          mergeReqInfo(other.getReqInfo());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasReqInfo()) {
          return false;
        }
        if (!getReqInfo().isInitialized()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto reqInfo_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.Builder, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProtoOrBuilder> reqInfoBuilder_;
      /**
       * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
       */
      public boolean hasReqInfo() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
       */
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto getReqInfo() {
        if (reqInfoBuilder_ == null) {
          return reqInfo_ == null ? org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.getDefaultInstance() : reqInfo_;
        } else {
          return reqInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
       */
      public Builder setReqInfo(org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto value) {
        if (reqInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          reqInfo_ = value;
          onChanged();
        } else {
          reqInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
       */
      public Builder setReqInfo(
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.Builder builderForValue) {
        if (reqInfoBuilder_ == null) {
          reqInfo_ = builderForValue.build();
          onChanged();
        } else {
          reqInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
       */
      public Builder mergeReqInfo(org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto value) {
        if (reqInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              reqInfo_ != null &&
              reqInfo_ != org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.getDefaultInstance()) {
            reqInfo_ =
              org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.newBuilder(reqInfo_).mergeFrom(value).buildPartial();
          } else {
            reqInfo_ = value;
          }
          onChanged();
        } else {
          reqInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
       */
      public Builder clearReqInfo() {
        if (reqInfoBuilder_ == null) {
          reqInfo_ = null;
          onChanged();
        } else {
          reqInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
       */
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.Builder getReqInfoBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getReqInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
       */
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProtoOrBuilder getReqInfoOrBuilder() {
        if (reqInfoBuilder_ != null) {
          return reqInfoBuilder_.getMessageOrBuilder();
        } else {
          return reqInfo_ == null ?
              org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.getDefaultInstance() : reqInfo_;
        }
      }
      /**
       * <code>required .hadoop.common.HAStateChangeRequestInfoProto reqInfo = 1;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.Builder, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProtoOrBuilder> 
          getReqInfoFieldBuilder() {
        if (reqInfoBuilder_ == null) {
          reqInfoBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProto.Builder, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAStateChangeRequestInfoProtoOrBuilder>(
                  getReqInfo(),
                  getParentForChildren(),
                  isClean());
          reqInfo_ = null;
        }
        return reqInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.TransitionToObserverRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.TransitionToObserverRequestProto)
    private static final org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto();
    }

    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<TransitionToObserverRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<TransitionToObserverRequestProto>() {
      @java.lang.Override
      public TransitionToObserverRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new TransitionToObserverRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<TransitionToObserverRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<TransitionToObserverRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface TransitionToObserverResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.TransitionToObserverResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   **
   * void response
   * </pre>
   *
   * Protobuf type {@code hadoop.common.TransitionToObserverResponseProto}
   */
  public  static final class TransitionToObserverResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.TransitionToObserverResponseProto)
      TransitionToObserverResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TransitionToObserverResponseProto.newBuilder() to construct.
    private TransitionToObserverResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TransitionToObserverResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TransitionToObserverResponseProto(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
      return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_TransitionToObserverResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_TransitionToObserverResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto.class, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto.Builder.class);
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
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto other = (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto) obj;

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
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto prototype) {
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
     * void response
     * </pre>
     *
     * Protobuf type {@code hadoop.common.TransitionToObserverResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.TransitionToObserverResponseProto)
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_TransitionToObserverResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_TransitionToObserverResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto.class, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto.newBuilder()
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
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_TransitionToObserverResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto build() {
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto buildPartial() {
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto result = new org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto(this);
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
        if (other instanceof org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto) {
          return mergeFrom((org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto other) {
        if (other == org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.TransitionToObserverResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.TransitionToObserverResponseProto)
    private static final org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto();
    }

    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<TransitionToObserverResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<TransitionToObserverResponseProto>() {
      @java.lang.Override
      public TransitionToObserverResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new TransitionToObserverResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<TransitionToObserverResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<TransitionToObserverResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GetServiceStatusRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.GetServiceStatusRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   **
   * void request
   * </pre>
   *
   * Protobuf type {@code hadoop.common.GetServiceStatusRequestProto}
   */
  public  static final class GetServiceStatusRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.GetServiceStatusRequestProto)
      GetServiceStatusRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetServiceStatusRequestProto.newBuilder() to construct.
    private GetServiceStatusRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetServiceStatusRequestProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetServiceStatusRequestProto(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
      return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_GetServiceStatusRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_GetServiceStatusRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto.class, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto.Builder.class);
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
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto other = (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto) obj;

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
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto prototype) {
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
     * void request
     * </pre>
     *
     * Protobuf type {@code hadoop.common.GetServiceStatusRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.GetServiceStatusRequestProto)
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_GetServiceStatusRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_GetServiceStatusRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto.class, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto.newBuilder()
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
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_GetServiceStatusRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto build() {
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto buildPartial() {
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto result = new org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto(this);
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
        if (other instanceof org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto) {
          return mergeFrom((org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto other) {
        if (other == org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.GetServiceStatusRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.GetServiceStatusRequestProto)
    private static final org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto();
    }

    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<GetServiceStatusRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<GetServiceStatusRequestProto>() {
      @java.lang.Override
      public GetServiceStatusRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new GetServiceStatusRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<GetServiceStatusRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<GetServiceStatusRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GetServiceStatusResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.GetServiceStatusResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required .hadoop.common.HAServiceStateProto state = 1;</code>
     */
    boolean hasState();
    /**
     * <code>required .hadoop.common.HAServiceStateProto state = 1;</code>
     */
    org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAServiceStateProto getState();

    /**
     * <pre>
     * If state is STANDBY, indicate whether it is
     * ready to become active.
     * </pre>
     *
     * <code>optional bool readyToBecomeActive = 2;</code>
     */
    boolean hasReadyToBecomeActive();
    /**
     * <pre>
     * If state is STANDBY, indicate whether it is
     * ready to become active.
     * </pre>
     *
     * <code>optional bool readyToBecomeActive = 2;</code>
     */
    boolean getReadyToBecomeActive();

    /**
     * <pre>
     * If not ready to become active, a textual explanation of why not
     * </pre>
     *
     * <code>optional string notReadyReason = 3;</code>
     */
    boolean hasNotReadyReason();
    /**
     * <pre>
     * If not ready to become active, a textual explanation of why not
     * </pre>
     *
     * <code>optional string notReadyReason = 3;</code>
     */
    java.lang.String getNotReadyReason();
    /**
     * <pre>
     * If not ready to become active, a textual explanation of why not
     * </pre>
     *
     * <code>optional string notReadyReason = 3;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getNotReadyReasonBytes();
  }
  /**
   * <pre>
   **
   * Returns the state of the service
   * </pre>
   *
   * Protobuf type {@code hadoop.common.GetServiceStatusResponseProto}
   */
  public  static final class GetServiceStatusResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.GetServiceStatusResponseProto)
      GetServiceStatusResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetServiceStatusResponseProto.newBuilder() to construct.
    private GetServiceStatusResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetServiceStatusResponseProto() {
      state_ = 0;
      notReadyReason_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetServiceStatusResponseProto(
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
              org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAServiceStateProto value = org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAServiceStateProto.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                state_ = rawValue;
              }
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              readyToBecomeActive_ = input.readBool();
              break;
            }
            case 26: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              notReadyReason_ = bs;
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
      return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_GetServiceStatusResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_GetServiceStatusResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto.class, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto.Builder.class);
    }

    private int bitField0_;
    public static final int STATE_FIELD_NUMBER = 1;
    private int state_;
    /**
     * <code>required .hadoop.common.HAServiceStateProto state = 1;</code>
     */
    public boolean hasState() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required .hadoop.common.HAServiceStateProto state = 1;</code>
     */
    public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAServiceStateProto getState() {
      @SuppressWarnings("deprecation")
      org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAServiceStateProto result = org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAServiceStateProto.valueOf(state_);
      return result == null ? org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAServiceStateProto.INITIALIZING : result;
    }

    public static final int READYTOBECOMEACTIVE_FIELD_NUMBER = 2;
    private boolean readyToBecomeActive_;
    /**
     * <pre>
     * If state is STANDBY, indicate whether it is
     * ready to become active.
     * </pre>
     *
     * <code>optional bool readyToBecomeActive = 2;</code>
     */
    public boolean hasReadyToBecomeActive() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * If state is STANDBY, indicate whether it is
     * ready to become active.
     * </pre>
     *
     * <code>optional bool readyToBecomeActive = 2;</code>
     */
    public boolean getReadyToBecomeActive() {
      return readyToBecomeActive_;
    }

    public static final int NOTREADYREASON_FIELD_NUMBER = 3;
    private volatile java.lang.Object notReadyReason_;
    /**
     * <pre>
     * If not ready to become active, a textual explanation of why not
     * </pre>
     *
     * <code>optional string notReadyReason = 3;</code>
     */
    public boolean hasNotReadyReason() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * If not ready to become active, a textual explanation of why not
     * </pre>
     *
     * <code>optional string notReadyReason = 3;</code>
     */
    public java.lang.String getNotReadyReason() {
      java.lang.Object ref = notReadyReason_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          notReadyReason_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * If not ready to become active, a textual explanation of why not
     * </pre>
     *
     * <code>optional string notReadyReason = 3;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getNotReadyReasonBytes() {
      java.lang.Object ref = notReadyReason_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        notReadyReason_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
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
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(org.apache.hadoop.thirdparty.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeEnum(1, state_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeBool(2, readyToBecomeActive_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 3, notReadyReason_);
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
          .computeEnumSize(1, state_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeBoolSize(2, readyToBecomeActive_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(3, notReadyReason_);
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
      if (!(obj instanceof org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto other = (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto) obj;

      if (hasState() != other.hasState()) return false;
      if (hasState()) {
        if (state_ != other.state_) return false;
      }
      if (hasReadyToBecomeActive() != other.hasReadyToBecomeActive()) return false;
      if (hasReadyToBecomeActive()) {
        if (getReadyToBecomeActive()
            != other.getReadyToBecomeActive()) return false;
      }
      if (hasNotReadyReason() != other.hasNotReadyReason()) return false;
      if (hasNotReadyReason()) {
        if (!getNotReadyReason()
            .equals(other.getNotReadyReason())) return false;
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
      if (hasState()) {
        hash = (37 * hash) + STATE_FIELD_NUMBER;
        hash = (53 * hash) + state_;
      }
      if (hasReadyToBecomeActive()) {
        hash = (37 * hash) + READYTOBECOMEACTIVE_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashBoolean(
            getReadyToBecomeActive());
      }
      if (hasNotReadyReason()) {
        hash = (37 * hash) + NOTREADYREASON_FIELD_NUMBER;
        hash = (53 * hash) + getNotReadyReason().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto prototype) {
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
     * Returns the state of the service
     * </pre>
     *
     * Protobuf type {@code hadoop.common.GetServiceStatusResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.GetServiceStatusResponseProto)
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_GetServiceStatusResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_GetServiceStatusResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto.class, org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto.newBuilder()
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
        state_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        readyToBecomeActive_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        notReadyReason_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.internal_static_hadoop_common_GetServiceStatusResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto build() {
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto buildPartial() {
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto result = new org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.state_ = state_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.readyToBecomeActive_ = readyToBecomeActive_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.notReadyReason_ = notReadyReason_;
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
        if (other instanceof org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto) {
          return mergeFrom((org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto other) {
        if (other == org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto.getDefaultInstance()) return this;
        if (other.hasState()) {
          setState(other.getState());
        }
        if (other.hasReadyToBecomeActive()) {
          setReadyToBecomeActive(other.getReadyToBecomeActive());
        }
        if (other.hasNotReadyReason()) {
          bitField0_ |= 0x00000004;
          notReadyReason_ = other.notReadyReason_;
          onChanged();
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
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int state_ = 0;
      /**
       * <code>required .hadoop.common.HAServiceStateProto state = 1;</code>
       */
      public boolean hasState() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required .hadoop.common.HAServiceStateProto state = 1;</code>
       */
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAServiceStateProto getState() {
        @SuppressWarnings("deprecation")
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAServiceStateProto result = org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAServiceStateProto.valueOf(state_);
        return result == null ? org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAServiceStateProto.INITIALIZING : result;
      }
      /**
       * <code>required .hadoop.common.HAServiceStateProto state = 1;</code>
       */
      public Builder setState(org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAServiceStateProto value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        state_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>required .hadoop.common.HAServiceStateProto state = 1;</code>
       */
      public Builder clearState() {
        bitField0_ = (bitField0_ & ~0x00000001);
        state_ = 0;
        onChanged();
        return this;
      }

      private boolean readyToBecomeActive_ ;
      /**
       * <pre>
       * If state is STANDBY, indicate whether it is
       * ready to become active.
       * </pre>
       *
       * <code>optional bool readyToBecomeActive = 2;</code>
       */
      public boolean hasReadyToBecomeActive() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * If state is STANDBY, indicate whether it is
       * ready to become active.
       * </pre>
       *
       * <code>optional bool readyToBecomeActive = 2;</code>
       */
      public boolean getReadyToBecomeActive() {
        return readyToBecomeActive_;
      }
      /**
       * <pre>
       * If state is STANDBY, indicate whether it is
       * ready to become active.
       * </pre>
       *
       * <code>optional bool readyToBecomeActive = 2;</code>
       */
      public Builder setReadyToBecomeActive(boolean value) {
        bitField0_ |= 0x00000002;
        readyToBecomeActive_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * If state is STANDBY, indicate whether it is
       * ready to become active.
       * </pre>
       *
       * <code>optional bool readyToBecomeActive = 2;</code>
       */
      public Builder clearReadyToBecomeActive() {
        bitField0_ = (bitField0_ & ~0x00000002);
        readyToBecomeActive_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object notReadyReason_ = "";
      /**
       * <pre>
       * If not ready to become active, a textual explanation of why not
       * </pre>
       *
       * <code>optional string notReadyReason = 3;</code>
       */
      public boolean hasNotReadyReason() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * If not ready to become active, a textual explanation of why not
       * </pre>
       *
       * <code>optional string notReadyReason = 3;</code>
       */
      public java.lang.String getNotReadyReason() {
        java.lang.Object ref = notReadyReason_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            notReadyReason_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * If not ready to become active, a textual explanation of why not
       * </pre>
       *
       * <code>optional string notReadyReason = 3;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getNotReadyReasonBytes() {
        java.lang.Object ref = notReadyReason_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          notReadyReason_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * If not ready to become active, a textual explanation of why not
       * </pre>
       *
       * <code>optional string notReadyReason = 3;</code>
       */
      public Builder setNotReadyReason(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        notReadyReason_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * If not ready to become active, a textual explanation of why not
       * </pre>
       *
       * <code>optional string notReadyReason = 3;</code>
       */
      public Builder clearNotReadyReason() {
        bitField0_ = (bitField0_ & ~0x00000004);
        notReadyReason_ = getDefaultInstance().getNotReadyReason();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * If not ready to become active, a textual explanation of why not
       * </pre>
       *
       * <code>optional string notReadyReason = 3;</code>
       */
      public Builder setNotReadyReasonBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        notReadyReason_ = value;
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.GetServiceStatusResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.GetServiceStatusResponseProto)
    private static final org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto();
    }

    public static org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<GetServiceStatusResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<GetServiceStatusResponseProto>() {
      @java.lang.Override
      public GetServiceStatusResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new GetServiceStatusResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<GetServiceStatusResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<GetServiceStatusResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  /**
   * <pre>
   **
   * Protocol interface provides High availability related 
   * primitives to monitor and failover a service.
   * For details see o.a.h.ha.HAServiceProtocol.
   * </pre>
   *
   * Protobuf service {@code hadoop.common.HAServiceProtocolService}
   */
  public static abstract class HAServiceProtocolService
      implements org.apache.hadoop.thirdparty.protobuf.Service {
    protected HAServiceProtocolService() {}

    public interface Interface {
      /**
       * <pre>
       **
       * Monitor the health of a service.
       * </pre>
       *
       * <code>rpc monitorHealth(.hadoop.common.MonitorHealthRequestProto) returns (.hadoop.common.MonitorHealthResponseProto);</code>
       */
      public abstract void monitorHealth(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto> done);

      /**
       * <pre>
       **
       * Request service to tranisition to active state.
       * </pre>
       *
       * <code>rpc transitionToActive(.hadoop.common.TransitionToActiveRequestProto) returns (.hadoop.common.TransitionToActiveResponseProto);</code>
       */
      public abstract void transitionToActive(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto> done);

      /**
       * <pre>
       **
       * Request service to transition to standby state.
       * </pre>
       *
       * <code>rpc transitionToStandby(.hadoop.common.TransitionToStandbyRequestProto) returns (.hadoop.common.TransitionToStandbyResponseProto);</code>
       */
      public abstract void transitionToStandby(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto> done);

      /**
       * <pre>
       **
       * Request service to transition to observer state.
       * </pre>
       *
       * <code>rpc transitionToObserver(.hadoop.common.TransitionToObserverRequestProto) returns (.hadoop.common.TransitionToObserverResponseProto);</code>
       */
      public abstract void transitionToObserver(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto> done);

      /**
       * <pre>
       **
       * Get the current status of the service.
       * </pre>
       *
       * <code>rpc getServiceStatus(.hadoop.common.GetServiceStatusRequestProto) returns (.hadoop.common.GetServiceStatusResponseProto);</code>
       */
      public abstract void getServiceStatus(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto> done);

    }

    public static org.apache.hadoop.thirdparty.protobuf.Service newReflectiveService(
        final Interface impl) {
      return new HAServiceProtocolService() {
        @java.lang.Override
        public  void monitorHealth(
            org.apache.hadoop.thirdparty.protobuf.RpcController controller,
            org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto request,
            org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto> done) {
          impl.monitorHealth(controller, request, done);
        }

        @java.lang.Override
        public  void transitionToActive(
            org.apache.hadoop.thirdparty.protobuf.RpcController controller,
            org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto request,
            org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto> done) {
          impl.transitionToActive(controller, request, done);
        }

        @java.lang.Override
        public  void transitionToStandby(
            org.apache.hadoop.thirdparty.protobuf.RpcController controller,
            org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto request,
            org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto> done) {
          impl.transitionToStandby(controller, request, done);
        }

        @java.lang.Override
        public  void transitionToObserver(
            org.apache.hadoop.thirdparty.protobuf.RpcController controller,
            org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto request,
            org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto> done) {
          impl.transitionToObserver(controller, request, done);
        }

        @java.lang.Override
        public  void getServiceStatus(
            org.apache.hadoop.thirdparty.protobuf.RpcController controller,
            org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto request,
            org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto> done) {
          impl.getServiceStatus(controller, request, done);
        }

      };
    }

    public static org.apache.hadoop.thirdparty.protobuf.BlockingService
        newReflectiveBlockingService(final BlockingInterface impl) {
      return new org.apache.hadoop.thirdparty.protobuf.BlockingService() {
        public final org.apache.hadoop.thirdparty.protobuf.Descriptors.ServiceDescriptor
            getDescriptorForType() {
          return getDescriptor();
        }

        public final org.apache.hadoop.thirdparty.protobuf.Message callBlockingMethod(
            org.apache.hadoop.thirdparty.protobuf.Descriptors.MethodDescriptor method,
            org.apache.hadoop.thirdparty.protobuf.RpcController controller,
            org.apache.hadoop.thirdparty.protobuf.Message request)
            throws org.apache.hadoop.thirdparty.protobuf.ServiceException {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.callBlockingMethod() given method descriptor for " +
              "wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return impl.monitorHealth(controller, (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto)request);
            case 1:
              return impl.transitionToActive(controller, (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto)request);
            case 2:
              return impl.transitionToStandby(controller, (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto)request);
            case 3:
              return impl.transitionToObserver(controller, (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto)request);
            case 4:
              return impl.getServiceStatus(controller, (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto)request);
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

        public final org.apache.hadoop.thirdparty.protobuf.Message
            getRequestPrototype(
            org.apache.hadoop.thirdparty.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.getRequestPrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto.getDefaultInstance();
            case 1:
              return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto.getDefaultInstance();
            case 2:
              return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto.getDefaultInstance();
            case 3:
              return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto.getDefaultInstance();
            case 4:
              return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

        public final org.apache.hadoop.thirdparty.protobuf.Message
            getResponsePrototype(
            org.apache.hadoop.thirdparty.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.getResponsePrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto.getDefaultInstance();
            case 1:
              return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto.getDefaultInstance();
            case 2:
              return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto.getDefaultInstance();
            case 3:
              return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto.getDefaultInstance();
            case 4:
              return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

      };
    }

    /**
     * <pre>
     **
     * Monitor the health of a service.
     * </pre>
     *
     * <code>rpc monitorHealth(.hadoop.common.MonitorHealthRequestProto) returns (.hadoop.common.MonitorHealthResponseProto);</code>
     */
    public abstract void monitorHealth(
        org.apache.hadoop.thirdparty.protobuf.RpcController controller,
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto request,
        org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto> done);

    /**
     * <pre>
     **
     * Request service to tranisition to active state.
     * </pre>
     *
     * <code>rpc transitionToActive(.hadoop.common.TransitionToActiveRequestProto) returns (.hadoop.common.TransitionToActiveResponseProto);</code>
     */
    public abstract void transitionToActive(
        org.apache.hadoop.thirdparty.protobuf.RpcController controller,
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto request,
        org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto> done);

    /**
     * <pre>
     **
     * Request service to transition to standby state.
     * </pre>
     *
     * <code>rpc transitionToStandby(.hadoop.common.TransitionToStandbyRequestProto) returns (.hadoop.common.TransitionToStandbyResponseProto);</code>
     */
    public abstract void transitionToStandby(
        org.apache.hadoop.thirdparty.protobuf.RpcController controller,
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto request,
        org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto> done);

    /**
     * <pre>
     **
     * Request service to transition to observer state.
     * </pre>
     *
     * <code>rpc transitionToObserver(.hadoop.common.TransitionToObserverRequestProto) returns (.hadoop.common.TransitionToObserverResponseProto);</code>
     */
    public abstract void transitionToObserver(
        org.apache.hadoop.thirdparty.protobuf.RpcController controller,
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto request,
        org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto> done);

    /**
     * <pre>
     **
     * Get the current status of the service.
     * </pre>
     *
     * <code>rpc getServiceStatus(.hadoop.common.GetServiceStatusRequestProto) returns (.hadoop.common.GetServiceStatusResponseProto);</code>
     */
    public abstract void getServiceStatus(
        org.apache.hadoop.thirdparty.protobuf.RpcController controller,
        org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto request,
        org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto> done);

    public static final
        org.apache.hadoop.thirdparty.protobuf.Descriptors.ServiceDescriptor
        getDescriptor() {
      return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.getDescriptor().getServices().get(0);
    }
    public final org.apache.hadoop.thirdparty.protobuf.Descriptors.ServiceDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }

    public final void callMethod(
        org.apache.hadoop.thirdparty.protobuf.Descriptors.MethodDescriptor method,
        org.apache.hadoop.thirdparty.protobuf.RpcController controller,
        org.apache.hadoop.thirdparty.protobuf.Message request,
        org.apache.hadoop.thirdparty.protobuf.RpcCallback<
          org.apache.hadoop.thirdparty.protobuf.Message> done) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.callMethod() given method descriptor for wrong " +
          "service type.");
      }
      switch(method.getIndex()) {
        case 0:
          this.monitorHealth(controller, (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto)request,
            org.apache.hadoop.thirdparty.protobuf.RpcUtil.<org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto>specializeCallback(
              done));
          return;
        case 1:
          this.transitionToActive(controller, (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto)request,
            org.apache.hadoop.thirdparty.protobuf.RpcUtil.<org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto>specializeCallback(
              done));
          return;
        case 2:
          this.transitionToStandby(controller, (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto)request,
            org.apache.hadoop.thirdparty.protobuf.RpcUtil.<org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto>specializeCallback(
              done));
          return;
        case 3:
          this.transitionToObserver(controller, (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto)request,
            org.apache.hadoop.thirdparty.protobuf.RpcUtil.<org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto>specializeCallback(
              done));
          return;
        case 4:
          this.getServiceStatus(controller, (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto)request,
            org.apache.hadoop.thirdparty.protobuf.RpcUtil.<org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto>specializeCallback(
              done));
          return;
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public final org.apache.hadoop.thirdparty.protobuf.Message
        getRequestPrototype(
        org.apache.hadoop.thirdparty.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.getRequestPrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto.getDefaultInstance();
        case 1:
          return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto.getDefaultInstance();
        case 2:
          return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto.getDefaultInstance();
        case 3:
          return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto.getDefaultInstance();
        case 4:
          return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public final org.apache.hadoop.thirdparty.protobuf.Message
        getResponsePrototype(
        org.apache.hadoop.thirdparty.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.getResponsePrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto.getDefaultInstance();
        case 1:
          return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto.getDefaultInstance();
        case 2:
          return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto.getDefaultInstance();
        case 3:
          return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto.getDefaultInstance();
        case 4:
          return org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public static Stub newStub(
        org.apache.hadoop.thirdparty.protobuf.RpcChannel channel) {
      return new Stub(channel);
    }

    public static final class Stub extends org.apache.hadoop.ha.proto.HAServiceProtocolProtos.HAServiceProtocolService implements Interface {
      private Stub(org.apache.hadoop.thirdparty.protobuf.RpcChannel channel) {
        this.channel = channel;
      }

      private final org.apache.hadoop.thirdparty.protobuf.RpcChannel channel;

      public org.apache.hadoop.thirdparty.protobuf.RpcChannel getChannel() {
        return channel;
      }

      public  void monitorHealth(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto.getDefaultInstance(),
          org.apache.hadoop.thirdparty.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto.class,
            org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto.getDefaultInstance()));
      }

      public  void transitionToActive(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto.getDefaultInstance(),
          org.apache.hadoop.thirdparty.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto.class,
            org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto.getDefaultInstance()));
      }

      public  void transitionToStandby(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(2),
          controller,
          request,
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto.getDefaultInstance(),
          org.apache.hadoop.thirdparty.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto.class,
            org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto.getDefaultInstance()));
      }

      public  void transitionToObserver(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(3),
          controller,
          request,
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto.getDefaultInstance(),
          org.apache.hadoop.thirdparty.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto.class,
            org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto.getDefaultInstance()));
      }

      public  void getServiceStatus(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(4),
          controller,
          request,
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto.getDefaultInstance(),
          org.apache.hadoop.thirdparty.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto.class,
            org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto.getDefaultInstance()));
      }
    }

    public static BlockingInterface newBlockingStub(
        org.apache.hadoop.thirdparty.protobuf.BlockingRpcChannel channel) {
      return new BlockingStub(channel);
    }

    public interface BlockingInterface {
      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto monitorHealth(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException;

      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto transitionToActive(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException;

      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto transitionToStandby(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException;

      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto transitionToObserver(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException;

      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto getServiceStatus(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException;
    }

    private static final class BlockingStub implements BlockingInterface {
      private BlockingStub(org.apache.hadoop.thirdparty.protobuf.BlockingRpcChannel channel) {
        this.channel = channel;
      }

      private final org.apache.hadoop.thirdparty.protobuf.BlockingRpcChannel channel;

      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto monitorHealth(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException {
        return (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.MonitorHealthResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto transitionToActive(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException {
        return (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToActiveResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto transitionToStandby(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException {
        return (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(2),
          controller,
          request,
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToStandbyResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto transitionToObserver(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException {
        return (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(3),
          controller,
          request,
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.TransitionToObserverResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto getServiceStatus(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException {
        return (org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(4),
          controller,
          request,
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.GetServiceStatusResponseProto.getDefaultInstance());
      }

    }

    // @@protoc_insertion_point(class_scope:hadoop.common.HAServiceProtocolService)
  }

  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_HAStateChangeRequestInfoProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_HAStateChangeRequestInfoProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_MonitorHealthRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_MonitorHealthRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_MonitorHealthResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_MonitorHealthResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_TransitionToActiveRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_TransitionToActiveRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_TransitionToActiveResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_TransitionToActiveResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_TransitionToStandbyRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_TransitionToStandbyRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_TransitionToStandbyResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_TransitionToStandbyResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_TransitionToObserverRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_TransitionToObserverRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_TransitionToObserverResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_TransitionToObserverResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_GetServiceStatusRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_GetServiceStatusRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_GetServiceStatusResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_GetServiceStatusResponseProto_fieldAccessorTable;

  public static org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027HAServiceProtocol.proto\022\rhadoop.common" +
      "\"R\n\035HAStateChangeRequestInfoProto\0221\n\treq" +
      "Source\030\001 \002(\0162\036.hadoop.common.HARequestSo" +
      "urce\"\033\n\031MonitorHealthRequestProto\"\034\n\032Mon" +
      "itorHealthResponseProto\"_\n\036TransitionToA" +
      "ctiveRequestProto\022=\n\007reqInfo\030\001 \002(\0132,.had" +
      "oop.common.HAStateChangeRequestInfoProto" +
      "\"!\n\037TransitionToActiveResponseProto\"`\n\037T" +
      "ransitionToStandbyRequestProto\022=\n\007reqInf" +
      "o\030\001 \002(\0132,.hadoop.common.HAStateChangeReq" +
      "uestInfoProto\"\"\n TransitionToStandbyResp" +
      "onseProto\"a\n TransitionToObserverRequest" +
      "Proto\022=\n\007reqInfo\030\001 \002(\0132,.hadoop.common.H" +
      "AStateChangeRequestInfoProto\"#\n!Transiti" +
      "onToObserverResponseProto\"\036\n\034GetServiceS" +
      "tatusRequestProto\"\207\001\n\035GetServiceStatusRe" +
      "sponseProto\0221\n\005state\030\001 \002(\0162\".hadoop.comm" +
      "on.HAServiceStateProto\022\033\n\023readyToBecomeA" +
      "ctive\030\002 \001(\010\022\026\n\016notReadyReason\030\003 \001(\t*N\n\023H" +
      "AServiceStateProto\022\020\n\014INITIALIZING\020\000\022\n\n\006" +
      "ACTIVE\020\001\022\013\n\007STANDBY\020\002\022\014\n\010OBSERVER\020\003*W\n\017H" +
      "ARequestSource\022\023\n\017REQUEST_BY_USER\020\000\022\032\n\026R" +
      "EQUEST_BY_USER_FORCED\020\001\022\023\n\017REQUEST_BY_ZK" +
      "FC\020\0022\327\004\n\030HAServiceProtocolService\022d\n\rmon" +
      "itorHealth\022(.hadoop.common.MonitorHealth" +
      "RequestProto\032).hadoop.common.MonitorHeal" +
      "thResponseProto\022s\n\022transitionToActive\022-." +
      "hadoop.common.TransitionToActiveRequestP" +
      "roto\032..hadoop.common.TransitionToActiveR" +
      "esponseProto\022v\n\023transitionToStandby\022..ha" +
      "doop.common.TransitionToStandbyRequestPr" +
      "oto\032/.hadoop.common.TransitionToStandbyR" +
      "esponseProto\022y\n\024transitionToObserver\022/.h" +
      "adoop.common.TransitionToObserverRequest" +
      "Proto\0320.hadoop.common.TransitionToObserv" +
      "erResponseProto\022m\n\020getServiceStatus\022+.ha" +
      "doop.common.GetServiceStatusRequestProto" +
      "\032,.hadoop.common.GetServiceStatusRespons" +
      "eProtoB;\n\032org.apache.hadoop.ha.protoB\027HA" +
      "ServiceProtocolProtos\210\001\001\240\001\001"
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
    internal_static_hadoop_common_HAStateChangeRequestInfoProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hadoop_common_HAStateChangeRequestInfoProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_HAStateChangeRequestInfoProto_descriptor,
        new java.lang.String[] { "ReqSource", });
    internal_static_hadoop_common_MonitorHealthRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hadoop_common_MonitorHealthRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_MonitorHealthRequestProto_descriptor,
        new java.lang.String[] { });
    internal_static_hadoop_common_MonitorHealthResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_hadoop_common_MonitorHealthResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_MonitorHealthResponseProto_descriptor,
        new java.lang.String[] { });
    internal_static_hadoop_common_TransitionToActiveRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_hadoop_common_TransitionToActiveRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_TransitionToActiveRequestProto_descriptor,
        new java.lang.String[] { "ReqInfo", });
    internal_static_hadoop_common_TransitionToActiveResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_hadoop_common_TransitionToActiveResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_TransitionToActiveResponseProto_descriptor,
        new java.lang.String[] { });
    internal_static_hadoop_common_TransitionToStandbyRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_hadoop_common_TransitionToStandbyRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_TransitionToStandbyRequestProto_descriptor,
        new java.lang.String[] { "ReqInfo", });
    internal_static_hadoop_common_TransitionToStandbyResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_hadoop_common_TransitionToStandbyResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_TransitionToStandbyResponseProto_descriptor,
        new java.lang.String[] { });
    internal_static_hadoop_common_TransitionToObserverRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_hadoop_common_TransitionToObserverRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_TransitionToObserverRequestProto_descriptor,
        new java.lang.String[] { "ReqInfo", });
    internal_static_hadoop_common_TransitionToObserverResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_hadoop_common_TransitionToObserverResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_TransitionToObserverResponseProto_descriptor,
        new java.lang.String[] { });
    internal_static_hadoop_common_GetServiceStatusRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_hadoop_common_GetServiceStatusRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_GetServiceStatusRequestProto_descriptor,
        new java.lang.String[] { });
    internal_static_hadoop_common_GetServiceStatusResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_hadoop_common_GetServiceStatusResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_GetServiceStatusResponseProto_descriptor,
        new java.lang.String[] { "State", "ReadyToBecomeActive", "NotReadyReason", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
