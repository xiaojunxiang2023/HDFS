package org.apache.hadoop.ipc.protobuf;

public final class IpcConnectionContextProtos {
  private IpcConnectionContextProtos() {
  }

  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite) registry);
  }

  public interface UserInformationProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.UserInformationProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>optional string effectiveUser = 1;</code>
     */
    boolean hasEffectiveUser();

    /**
     * <code>optional string effectiveUser = 1;</code>
     */
    java.lang.String getEffectiveUser();

    /**
     * <code>optional string effectiveUser = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
    getEffectiveUserBytes();

    /**
     * <code>optional string realUser = 2;</code>
     */
    boolean hasRealUser();

    /**
     * <code>optional string realUser = 2;</code>
     */
    java.lang.String getRealUser();

    /**
     * <code>optional string realUser = 2;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
    getRealUserBytes();
  }

  /**
   * <pre>
   **
   * Spec for UserInformationProto is specified in ProtoUtil#makeIpcConnectionContext
   * </pre>
   *
   * Protobuf type {@code hadoop.common.UserInformationProto}
   */
  public static final class UserInformationProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.UserInformationProto)
      UserInformationProtoOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use UserInformationProto.newBuilder() to construct.
    private UserInformationProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private UserInformationProto() {
      effectiveUser_ = "";
      realUser_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    private UserInformationProto(
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
              effectiveUser_ = bs;
              break;
            }
            case 18: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              realUser_ = bs;
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
      return org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.internal_static_hadoop_common_UserInformationProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.internal_static_hadoop_common_UserInformationProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto.class, org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto.Builder.class);
    }

    private int bitField0_;
    public static final int EFFECTIVEUSER_FIELD_NUMBER = 1;
    private volatile java.lang.Object effectiveUser_;

    /**
     * <code>optional string effectiveUser = 1;</code>
     */
    public boolean hasEffectiveUser() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>optional string effectiveUser = 1;</code>
     */
    public java.lang.String getEffectiveUser() {
      java.lang.Object ref = effectiveUser_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs =
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          effectiveUser_ = s;
        }
        return s;
      }
    }

    /**
     * <code>optional string effectiveUser = 1;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
    getEffectiveUserBytes() {
      java.lang.Object ref = effectiveUser_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b =
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        effectiveUser_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int REALUSER_FIELD_NUMBER = 2;
    private volatile java.lang.Object realUser_;

    /**
     * <code>optional string realUser = 2;</code>
     */
    public boolean hasRealUser() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     * <code>optional string realUser = 2;</code>
     */
    public java.lang.String getRealUser() {
      java.lang.Object ref = realUser_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs =
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          realUser_ = s;
        }
        return s;
      }
    }

    /**
     * <code>optional string realUser = 2;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
    getRealUserBytes() {
      java.lang.Object ref = realUser_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b =
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        realUser_ = b;
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

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(org.apache.hadoop.thirdparty.protobuf.CodedOutputStream output)
        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, effectiveUser_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 2, realUser_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, effectiveUser_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(2, realUser_);
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
      if (!(obj instanceof org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto other = (org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto) obj;

      if (hasEffectiveUser() != other.hasEffectiveUser()) return false;
      if (hasEffectiveUser()) {
        if (!getEffectiveUser()
            .equals(other.getEffectiveUser())) return false;
      }
      if (hasRealUser() != other.hasRealUser()) return false;
      if (hasRealUser()) {
        if (!getRealUser()
            .equals(other.getRealUser())) return false;
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
      if (hasEffectiveUser()) {
        hash = (37 * hash) + EFFECTIVEUSER_FIELD_NUMBER;
        hash = (53 * hash) + getEffectiveUser().hashCode();
      }
      if (hasRealUser()) {
        hash = (37 * hash) + REALUSER_FIELD_NUMBER;
        hash = (53 * hash) + getRealUser().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto prototype) {
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
     * Spec for UserInformationProto is specified in ProtoUtil#makeIpcConnectionContext
     * </pre>
     *
     * Protobuf type {@code hadoop.common.UserInformationProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.UserInformationProto)
        org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.internal_static_hadoop_common_UserInformationProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.internal_static_hadoop_common_UserInformationProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto.class, org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto.Builder.class);
      }

      // Construct using org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto.newBuilder()
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
        effectiveUser_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        realUser_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.internal_static_hadoop_common_UserInformationProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto getDefaultInstanceForType() {
        return org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto build() {
        org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto buildPartial() {
        org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto result = new org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.effectiveUser_ = effectiveUser_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.realUser_ = realUser_;
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
        if (other instanceof org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto) {
          return mergeFrom((org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto other) {
        if (other == org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto.getDefaultInstance())
          return this;
        if (other.hasEffectiveUser()) {
          bitField0_ |= 0x00000001;
          effectiveUser_ = other.effectiveUser_;
          onChanged();
        }
        if (other.hasRealUser()) {
          bitField0_ |= 0x00000002;
          realUser_ = other.realUser_;
          onChanged();
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
        org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object effectiveUser_ = "";

      /**
       * <code>optional string effectiveUser = 1;</code>
       */
      public boolean hasEffectiveUser() {
        return ((bitField0_ & 0x00000001) != 0);
      }

      /**
       * <code>optional string effectiveUser = 1;</code>
       */
      public java.lang.String getEffectiveUser() {
        java.lang.Object ref = effectiveUser_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            effectiveUser_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>optional string effectiveUser = 1;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
      getEffectiveUserBytes() {
        java.lang.Object ref = effectiveUser_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b =
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          effectiveUser_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>optional string effectiveUser = 1;</code>
       */
      public Builder setEffectiveUser(
          java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        effectiveUser_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional string effectiveUser = 1;</code>
       */
      public Builder clearEffectiveUser() {
        bitField0_ = (bitField0_ & ~0x00000001);
        effectiveUser_ = getDefaultInstance().getEffectiveUser();
        onChanged();
        return this;
      }

      /**
       * <code>optional string effectiveUser = 1;</code>
       */
      public Builder setEffectiveUserBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        effectiveUser_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object realUser_ = "";

      /**
       * <code>optional string realUser = 2;</code>
       */
      public boolean hasRealUser() {
        return ((bitField0_ & 0x00000002) != 0);
      }

      /**
       * <code>optional string realUser = 2;</code>
       */
      public java.lang.String getRealUser() {
        java.lang.Object ref = realUser_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            realUser_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>optional string realUser = 2;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
      getRealUserBytes() {
        java.lang.Object ref = realUser_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b =
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          realUser_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>optional string realUser = 2;</code>
       */
      public Builder setRealUser(
          java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        realUser_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional string realUser = 2;</code>
       */
      public Builder clearRealUser() {
        bitField0_ = (bitField0_ & ~0x00000002);
        realUser_ = getDefaultInstance().getRealUser();
        onChanged();
        return this;
      }

      /**
       * <code>optional string realUser = 2;</code>
       */
      public Builder setRealUserBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        realUser_ = value;
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.UserInformationProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.UserInformationProto)
    private static final org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto();
    }

    public static org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final org.apache.hadoop.thirdparty.protobuf.Parser<UserInformationProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<UserInformationProto>() {
      @java.lang.Override
      public UserInformationProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new UserInformationProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<UserInformationProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<UserInformationProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface IpcConnectionContextProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.IpcConnectionContextProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * UserInfo beyond what is determined as part of security handshake 
     * at connection time (kerberos, tokens etc).
     * </pre>
     *
     * <code>optional .hadoop.common.UserInformationProto userInfo = 2;</code>
     */
    boolean hasUserInfo();

    /**
     * <pre>
     * UserInfo beyond what is determined as part of security handshake 
     * at connection time (kerberos, tokens etc).
     * </pre>
     *
     * <code>optional .hadoop.common.UserInformationProto userInfo = 2;</code>
     */
    org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto getUserInfo();

    /**
     * <pre>
     * UserInfo beyond what is determined as part of security handshake 
     * at connection time (kerberos, tokens etc).
     * </pre>
     *
     * <code>optional .hadoop.common.UserInformationProto userInfo = 2;</code>
     */
    org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProtoOrBuilder getUserInfoOrBuilder();

    /**
     * <pre>
     * Protocol name for next rpc layer.
     * The client created a proxy with this protocol name
     * </pre>
     *
     * <code>optional string protocol = 3;</code>
     */
    boolean hasProtocol();

    /**
     * <pre>
     * Protocol name for next rpc layer.
     * The client created a proxy with this protocol name
     * </pre>
     *
     * <code>optional string protocol = 3;</code>
     */
    java.lang.String getProtocol();

    /**
     * <pre>
     * Protocol name for next rpc layer.
     * The client created a proxy with this protocol name
     * </pre>
     *
     * <code>optional string protocol = 3;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
    getProtocolBytes();
  }

  /**
   * <pre>
   **
   * The connection context is sent as part of the connection establishment.
   * It establishes the context for ALL Rpc calls within the connection.
   * </pre>
   *
   * Protobuf type {@code hadoop.common.IpcConnectionContextProto}
   */
  public static final class IpcConnectionContextProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.IpcConnectionContextProto)
      IpcConnectionContextProtoOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use IpcConnectionContextProto.newBuilder() to construct.
    private IpcConnectionContextProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private IpcConnectionContextProto() {
      protocol_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    private IpcConnectionContextProto(
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
            case 18: {
              org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = userInfo_.toBuilder();
              }
              userInfo_ = input.readMessage(org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(userInfo_);
                userInfo_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 26: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              protocol_ = bs;
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
      return org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.internal_static_hadoop_common_IpcConnectionContextProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.internal_static_hadoop_common_IpcConnectionContextProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto.class, org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto.Builder.class);
    }

    private int bitField0_;
    public static final int USERINFO_FIELD_NUMBER = 2;
    private org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto userInfo_;

    /**
     * <pre>
     * UserInfo beyond what is determined as part of security handshake 
     * at connection time (kerberos, tokens etc).
     * </pre>
     *
     * <code>optional .hadoop.common.UserInformationProto userInfo = 2;</code>
     */
    public boolean hasUserInfo() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <pre>
     * UserInfo beyond what is determined as part of security handshake 
     * at connection time (kerberos, tokens etc).
     * </pre>
     *
     * <code>optional .hadoop.common.UserInformationProto userInfo = 2;</code>
     */
    public org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto getUserInfo() {
      return userInfo_ == null ? org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto.getDefaultInstance() : userInfo_;
    }

    /**
     * <pre>
     * UserInfo beyond what is determined as part of security handshake 
     * at connection time (kerberos, tokens etc).
     * </pre>
     *
     * <code>optional .hadoop.common.UserInformationProto userInfo = 2;</code>
     */
    public org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProtoOrBuilder getUserInfoOrBuilder() {
      return userInfo_ == null ? org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto.getDefaultInstance() : userInfo_;
    }

    public static final int PROTOCOL_FIELD_NUMBER = 3;
    private volatile java.lang.Object protocol_;

    /**
     * <pre>
     * Protocol name for next rpc layer.
     * The client created a proxy with this protocol name
     * </pre>
     *
     * <code>optional string protocol = 3;</code>
     */
    public boolean hasProtocol() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     * <pre>
     * Protocol name for next rpc layer.
     * The client created a proxy with this protocol name
     * </pre>
     *
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
     * <pre>
     * Protocol name for next rpc layer.
     * The client created a proxy with this protocol name
     * </pre>
     *
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
        output.writeMessage(2, getUserInfo());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 3, protocol_);
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
            .computeMessageSize(2, getUserInfo());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(3, protocol_);
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
      if (!(obj instanceof org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto other = (org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto) obj;

      if (hasUserInfo() != other.hasUserInfo()) return false;
      if (hasUserInfo()) {
        if (!getUserInfo()
            .equals(other.getUserInfo())) return false;
      }
      if (hasProtocol() != other.hasProtocol()) return false;
      if (hasProtocol()) {
        if (!getProtocol()
            .equals(other.getProtocol())) return false;
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
      if (hasUserInfo()) {
        hash = (37 * hash) + USERINFO_FIELD_NUMBER;
        hash = (53 * hash) + getUserInfo().hashCode();
      }
      if (hasProtocol()) {
        hash = (37 * hash) + PROTOCOL_FIELD_NUMBER;
        hash = (53 * hash) + getProtocol().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto prototype) {
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
     * The connection context is sent as part of the connection establishment.
     * It establishes the context for ALL Rpc calls within the connection.
     * </pre>
     *
     * Protobuf type {@code hadoop.common.IpcConnectionContextProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.IpcConnectionContextProto)
        org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.internal_static_hadoop_common_IpcConnectionContextProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.internal_static_hadoop_common_IpcConnectionContextProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto.class, org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto.Builder.class);
      }

      // Construct using org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto.newBuilder()
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
          getUserInfoFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (userInfoBuilder_ == null) {
          userInfo_ = null;
        } else {
          userInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        protocol_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.internal_static_hadoop_common_IpcConnectionContextProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto getDefaultInstanceForType() {
        return org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto build() {
        org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto buildPartial() {
        org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto result = new org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (userInfoBuilder_ == null) {
            result.userInfo_ = userInfo_;
          } else {
            result.userInfo_ = userInfoBuilder_.build();
          }
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.protocol_ = protocol_;
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
        if (other instanceof org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto) {
          return mergeFrom((org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto other) {
        if (other == org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto.getDefaultInstance())
          return this;
        if (other.hasUserInfo()) {
          mergeUserInfo(other.getUserInfo());
        }
        if (other.hasProtocol()) {
          bitField0_ |= 0x00000002;
          protocol_ = other.protocol_;
          onChanged();
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
        org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto userInfo_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto, org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto.Builder, org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProtoOrBuilder> userInfoBuilder_;

      /**
       * <pre>
       * UserInfo beyond what is determined as part of security handshake 
       * at connection time (kerberos, tokens etc).
       * </pre>
       *
       * <code>optional .hadoop.common.UserInformationProto userInfo = 2;</code>
       */
      public boolean hasUserInfo() {
        return ((bitField0_ & 0x00000001) != 0);
      }

      /**
       * <pre>
       * UserInfo beyond what is determined as part of security handshake 
       * at connection time (kerberos, tokens etc).
       * </pre>
       *
       * <code>optional .hadoop.common.UserInformationProto userInfo = 2;</code>
       */
      public org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto getUserInfo() {
        if (userInfoBuilder_ == null) {
          return userInfo_ == null ? org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto.getDefaultInstance() : userInfo_;
        } else {
          return userInfoBuilder_.getMessage();
        }
      }

      /**
       * <pre>
       * UserInfo beyond what is determined as part of security handshake 
       * at connection time (kerberos, tokens etc).
       * </pre>
       *
       * <code>optional .hadoop.common.UserInformationProto userInfo = 2;</code>
       */
      public Builder setUserInfo(org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto value) {
        if (userInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          userInfo_ = value;
          onChanged();
        } else {
          userInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }

      /**
       * <pre>
       * UserInfo beyond what is determined as part of security handshake 
       * at connection time (kerberos, tokens etc).
       * </pre>
       *
       * <code>optional .hadoop.common.UserInformationProto userInfo = 2;</code>
       */
      public Builder setUserInfo(
          org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto.Builder builderForValue) {
        if (userInfoBuilder_ == null) {
          userInfo_ = builderForValue.build();
          onChanged();
        } else {
          userInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }

      /**
       * <pre>
       * UserInfo beyond what is determined as part of security handshake 
       * at connection time (kerberos, tokens etc).
       * </pre>
       *
       * <code>optional .hadoop.common.UserInformationProto userInfo = 2;</code>
       */
      public Builder mergeUserInfo(org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto value) {
        if (userInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              userInfo_ != null &&
              userInfo_ != org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto.getDefaultInstance()) {
            userInfo_ =
                org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto.newBuilder(userInfo_).mergeFrom(value).buildPartial();
          } else {
            userInfo_ = value;
          }
          onChanged();
        } else {
          userInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }

      /**
       * <pre>
       * UserInfo beyond what is determined as part of security handshake 
       * at connection time (kerberos, tokens etc).
       * </pre>
       *
       * <code>optional .hadoop.common.UserInformationProto userInfo = 2;</code>
       */
      public Builder clearUserInfo() {
        if (userInfoBuilder_ == null) {
          userInfo_ = null;
          onChanged();
        } else {
          userInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      /**
       * <pre>
       * UserInfo beyond what is determined as part of security handshake 
       * at connection time (kerberos, tokens etc).
       * </pre>
       *
       * <code>optional .hadoop.common.UserInformationProto userInfo = 2;</code>
       */
      public org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto.Builder getUserInfoBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getUserInfoFieldBuilder().getBuilder();
      }

      /**
       * <pre>
       * UserInfo beyond what is determined as part of security handshake 
       * at connection time (kerberos, tokens etc).
       * </pre>
       *
       * <code>optional .hadoop.common.UserInformationProto userInfo = 2;</code>
       */
      public org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProtoOrBuilder getUserInfoOrBuilder() {
        if (userInfoBuilder_ != null) {
          return userInfoBuilder_.getMessageOrBuilder();
        } else {
          return userInfo_ == null ?
              org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto.getDefaultInstance() : userInfo_;
        }
      }

      /**
       * <pre>
       * UserInfo beyond what is determined as part of security handshake 
       * at connection time (kerberos, tokens etc).
       * </pre>
       *
       * <code>optional .hadoop.common.UserInformationProto userInfo = 2;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto, org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto.Builder, org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProtoOrBuilder>
      getUserInfoFieldBuilder() {
        if (userInfoBuilder_ == null) {
          userInfoBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto, org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProto.Builder, org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.UserInformationProtoOrBuilder>(
              getUserInfo(),
              getParentForChildren(),
              isClean());
          userInfo_ = null;
        }
        return userInfoBuilder_;
      }

      private java.lang.Object protocol_ = "";

      /**
       * <pre>
       * Protocol name for next rpc layer.
       * The client created a proxy with this protocol name
       * </pre>
       *
       * <code>optional string protocol = 3;</code>
       */
      public boolean hasProtocol() {
        return ((bitField0_ & 0x00000002) != 0);
      }

      /**
       * <pre>
       * Protocol name for next rpc layer.
       * The client created a proxy with this protocol name
       * </pre>
       *
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
       * <pre>
       * Protocol name for next rpc layer.
       * The client created a proxy with this protocol name
       * </pre>
       *
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
       * <pre>
       * Protocol name for next rpc layer.
       * The client created a proxy with this protocol name
       * </pre>
       *
       * <code>optional string protocol = 3;</code>
       */
      public Builder setProtocol(
          java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        protocol_ = value;
        onChanged();
        return this;
      }

      /**
       * <pre>
       * Protocol name for next rpc layer.
       * The client created a proxy with this protocol name
       * </pre>
       *
       * <code>optional string protocol = 3;</code>
       */
      public Builder clearProtocol() {
        bitField0_ = (bitField0_ & ~0x00000002);
        protocol_ = getDefaultInstance().getProtocol();
        onChanged();
        return this;
      }

      /**
       * <pre>
       * Protocol name for next rpc layer.
       * The client created a proxy with this protocol name
       * </pre>
       *
       * <code>optional string protocol = 3;</code>
       */
      public Builder setProtocolBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        protocol_ = value;
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.IpcConnectionContextProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.IpcConnectionContextProto)
    private static final org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto();
    }

    public static org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final org.apache.hadoop.thirdparty.protobuf.Parser<IpcConnectionContextProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<IpcConnectionContextProto>() {
      @java.lang.Override
      public IpcConnectionContextProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new IpcConnectionContextProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<IpcConnectionContextProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<IpcConnectionContextProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.ipc.protobuf.IpcConnectionContextProtos.IpcConnectionContextProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      internal_static_hadoop_common_UserInformationProto_descriptor;
  private static final
  org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_UserInformationProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      internal_static_hadoop_common_IpcConnectionContextProto_descriptor;
  private static final
  org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_IpcConnectionContextProto_fieldAccessorTable;

  public static org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
  getDescriptor() {
    return descriptor;
  }

  private static org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      descriptor;

  static {
    java.lang.String[] descriptorData = {
        "\n\032IpcConnectionContext.proto\022\rhadoop.com" +
            "mon\"?\n\024UserInformationProto\022\025\n\reffective" +
            "User\030\001 \001(\t\022\020\n\010realUser\030\002 \001(\t\"d\n\031IpcConne" +
            "ctionContextProto\0225\n\010userInfo\030\002 \001(\0132#.ha" +
            "doop.common.UserInformationProto\022\020\n\010prot" +
            "ocol\030\003 \001(\tB?\n\036org.apache.hadoop.ipc.prot" +
            "obufB\032IpcConnectionContextProtos\240\001\001"
    };
    org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public org.apache.hadoop.thirdparty.protobuf.ExtensionRegistry assignDescriptors(
              org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
        .internalBuildGeneratedFileFrom(descriptorData,
            new org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor[]{
            }, assigner);
    internal_static_hadoop_common_UserInformationProto_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_hadoop_common_UserInformationProto_fieldAccessorTable = new
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_UserInformationProto_descriptor,
        new java.lang.String[]{"EffectiveUser", "RealUser",});
    internal_static_hadoop_common_IpcConnectionContextProto_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_hadoop_common_IpcConnectionContextProto_fieldAccessorTable = new
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_IpcConnectionContextProto_descriptor,
        new java.lang.String[]{"UserInfo", "Protocol",});
  }

  // @@protoc_insertion_point(outer_class_scope)
}
