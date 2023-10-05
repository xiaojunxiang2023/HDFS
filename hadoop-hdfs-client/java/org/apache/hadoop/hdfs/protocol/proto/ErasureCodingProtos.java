// source: erasurecoding.proto

package org.apache.hadoop.hdfs.protocol.proto;

public final class ErasureCodingProtos {
  private ErasureCodingProtos() {}
  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetErasureCodingPolicyRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.SetErasureCodingPolicyRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required string src = 1;</code>
     */
    boolean hasSrc();
    /**
     * <code>required string src = 1;</code>
     */
    java.lang.String getSrc();
    /**
     * <code>required string src = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getSrcBytes();

    /**
     * <code>optional string ecPolicyName = 2;</code>
     */
    boolean hasEcPolicyName();
    /**
     * <code>optional string ecPolicyName = 2;</code>
     */
    java.lang.String getEcPolicyName();
    /**
     * <code>optional string ecPolicyName = 2;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getEcPolicyNameBytes();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.SetErasureCodingPolicyRequestProto}
   */
  public  static final class SetErasureCodingPolicyRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.SetErasureCodingPolicyRequestProto)
      SetErasureCodingPolicyRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetErasureCodingPolicyRequestProto.newBuilder() to construct.
    private SetErasureCodingPolicyRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetErasureCodingPolicyRequestProto() {
      src_ = "";
      ecPolicyName_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SetErasureCodingPolicyRequestProto(
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
              src_ = bs;
              break;
            }
            case 18: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              ecPolicyName_ = bs;
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
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_SetErasureCodingPolicyRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_SetErasureCodingPolicyRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto.Builder.class);
    }

    private int bitField0_;
    public static final int SRC_FIELD_NUMBER = 1;
    private volatile java.lang.Object src_;
    /**
     * <code>required string src = 1;</code>
     */
    public boolean hasSrc() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string src = 1;</code>
     */
    public java.lang.String getSrc() {
      java.lang.Object ref = src_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          src_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string src = 1;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getSrcBytes() {
      java.lang.Object ref = src_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        src_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int ECPOLICYNAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object ecPolicyName_;
    /**
     * <code>optional string ecPolicyName = 2;</code>
     */
    public boolean hasEcPolicyName() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string ecPolicyName = 2;</code>
     */
    public java.lang.String getEcPolicyName() {
      java.lang.Object ref = ecPolicyName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          ecPolicyName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string ecPolicyName = 2;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getEcPolicyNameBytes() {
      java.lang.Object ref = ecPolicyName_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ecPolicyName_ = b;
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

      if (!hasSrc()) {
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, src_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 2, ecPolicyName_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, src_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(2, ecPolicyName_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto) obj;

      if (hasSrc() != other.hasSrc()) return false;
      if (hasSrc()) {
        if (!getSrc()
            .equals(other.getSrc())) return false;
      }
      if (hasEcPolicyName() != other.hasEcPolicyName()) return false;
      if (hasEcPolicyName()) {
        if (!getEcPolicyName()
            .equals(other.getEcPolicyName())) return false;
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
      if (hasSrc()) {
        hash = (37 * hash) + SRC_FIELD_NUMBER;
        hash = (53 * hash) + getSrc().hashCode();
      }
      if (hasEcPolicyName()) {
        hash = (37 * hash) + ECPOLICYNAME_FIELD_NUMBER;
        hash = (53 * hash) + getEcPolicyName().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.SetErasureCodingPolicyRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.SetErasureCodingPolicyRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_SetErasureCodingPolicyRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_SetErasureCodingPolicyRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto.newBuilder()
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
        src_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        ecPolicyName_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_SetErasureCodingPolicyRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.src_ = src_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.ecPolicyName_ = ecPolicyName_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto.getDefaultInstance()) return this;
        if (other.hasSrc()) {
          bitField0_ |= 0x00000001;
          src_ = other.src_;
          onChanged();
        }
        if (other.hasEcPolicyName()) {
          bitField0_ |= 0x00000002;
          ecPolicyName_ = other.ecPolicyName_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasSrc()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object src_ = "";
      /**
       * <code>required string src = 1;</code>
       */
      public boolean hasSrc() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string src = 1;</code>
       */
      public java.lang.String getSrc() {
        java.lang.Object ref = src_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            src_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string src = 1;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getSrcBytes() {
        java.lang.Object ref = src_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          src_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder setSrc(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        src_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder clearSrc() {
        bitField0_ = (bitField0_ & ~0x00000001);
        src_ = getDefaultInstance().getSrc();
        onChanged();
        return this;
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder setSrcBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        src_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object ecPolicyName_ = "";
      /**
       * <code>optional string ecPolicyName = 2;</code>
       */
      public boolean hasEcPolicyName() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional string ecPolicyName = 2;</code>
       */
      public java.lang.String getEcPolicyName() {
        java.lang.Object ref = ecPolicyName_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            ecPolicyName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string ecPolicyName = 2;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getEcPolicyNameBytes() {
        java.lang.Object ref = ecPolicyName_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          ecPolicyName_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string ecPolicyName = 2;</code>
       */
      public Builder setEcPolicyName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        ecPolicyName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string ecPolicyName = 2;</code>
       */
      public Builder clearEcPolicyName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        ecPolicyName_ = getDefaultInstance().getEcPolicyName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string ecPolicyName = 2;</code>
       */
      public Builder setEcPolicyNameBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        ecPolicyName_ = value;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.SetErasureCodingPolicyRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.SetErasureCodingPolicyRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<SetErasureCodingPolicyRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<SetErasureCodingPolicyRequestProto>() {
      @java.lang.Override
      public SetErasureCodingPolicyRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new SetErasureCodingPolicyRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<SetErasureCodingPolicyRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<SetErasureCodingPolicyRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface SetErasureCodingPolicyResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.SetErasureCodingPolicyResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.SetErasureCodingPolicyResponseProto}
   */
  public  static final class SetErasureCodingPolicyResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.SetErasureCodingPolicyResponseProto)
      SetErasureCodingPolicyResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetErasureCodingPolicyResponseProto.newBuilder() to construct.
    private SetErasureCodingPolicyResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetErasureCodingPolicyResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SetErasureCodingPolicyResponseProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_SetErasureCodingPolicyResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_SetErasureCodingPolicyResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto.Builder.class);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.SetErasureCodingPolicyResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.SetErasureCodingPolicyResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_SetErasureCodingPolicyResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_SetErasureCodingPolicyResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_SetErasureCodingPolicyResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto(this);
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto) e.getUnfinishedMessage();
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.SetErasureCodingPolicyResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.SetErasureCodingPolicyResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<SetErasureCodingPolicyResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<SetErasureCodingPolicyResponseProto>() {
      @java.lang.Override
      public SetErasureCodingPolicyResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new SetErasureCodingPolicyResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<SetErasureCodingPolicyResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<SetErasureCodingPolicyResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.SetErasureCodingPolicyResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GetErasureCodingPoliciesRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.GetErasureCodingPoliciesRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   * void request
   * </pre>
   *
   * Protobuf type {@code hadoop.hdfs.GetErasureCodingPoliciesRequestProto}
   */
  public  static final class GetErasureCodingPoliciesRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.GetErasureCodingPoliciesRequestProto)
      GetErasureCodingPoliciesRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetErasureCodingPoliciesRequestProto.newBuilder() to construct.
    private GetErasureCodingPoliciesRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetErasureCodingPoliciesRequestProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetErasureCodingPoliciesRequestProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetErasureCodingPoliciesRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetErasureCodingPoliciesRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto.Builder.class);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto prototype) {
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
     * void request
     * </pre>
     *
     * Protobuf type {@code hadoop.hdfs.GetErasureCodingPoliciesRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.GetErasureCodingPoliciesRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetErasureCodingPoliciesRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetErasureCodingPoliciesRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetErasureCodingPoliciesRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto(this);
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto) e.getUnfinishedMessage();
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetErasureCodingPoliciesRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetErasureCodingPoliciesRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<GetErasureCodingPoliciesRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<GetErasureCodingPoliciesRequestProto>() {
      @java.lang.Override
      public GetErasureCodingPoliciesRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new GetErasureCodingPoliciesRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<GetErasureCodingPoliciesRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<GetErasureCodingPoliciesRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GetErasureCodingPoliciesResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.GetErasureCodingPoliciesResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
     */
    java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto> 
        getEcPoliciesList();
    /**
     * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto getEcPolicies(int index);
    /**
     * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
     */
    int getEcPoliciesCount();
    /**
     * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
     */
    java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProtoOrBuilder> 
        getEcPoliciesOrBuilderList();
    /**
     * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProtoOrBuilder getEcPoliciesOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code hadoop.hdfs.GetErasureCodingPoliciesResponseProto}
   */
  public  static final class GetErasureCodingPoliciesResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.GetErasureCodingPoliciesResponseProto)
      GetErasureCodingPoliciesResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetErasureCodingPoliciesResponseProto.newBuilder() to construct.
    private GetErasureCodingPoliciesResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetErasureCodingPoliciesResponseProto() {
      ecPolicies_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetErasureCodingPoliciesResponseProto(
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                ecPolicies_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto>();
                mutable_bitField0_ |= 0x00000001;
              }
              ecPolicies_.add(
                  input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.PARSER, extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          ecPolicies_ = java.util.Collections.unmodifiableList(ecPolicies_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetErasureCodingPoliciesResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetErasureCodingPoliciesResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto.Builder.class);
    }

    public static final int ECPOLICIES_FIELD_NUMBER = 1;
    private java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto> ecPolicies_;
    /**
     * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
     */
    public java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto> getEcPoliciesList() {
      return ecPolicies_;
    }
    /**
     * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
     */
    public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProtoOrBuilder> 
        getEcPoliciesOrBuilderList() {
      return ecPolicies_;
    }
    /**
     * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
     */
    public int getEcPoliciesCount() {
      return ecPolicies_.size();
    }
    /**
     * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto getEcPolicies(int index) {
      return ecPolicies_.get(index);
    }
    /**
     * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProtoOrBuilder getEcPoliciesOrBuilder(
        int index) {
      return ecPolicies_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getEcPoliciesCount(); i++) {
        if (!getEcPolicies(i).isInitialized()) {
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
      for (int i = 0; i < ecPolicies_.size(); i++) {
        output.writeMessage(1, ecPolicies_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < ecPolicies_.size(); i++) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(1, ecPolicies_.get(i));
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto) obj;

      if (!getEcPoliciesList()
          .equals(other.getEcPoliciesList())) return false;
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
      if (getEcPoliciesCount() > 0) {
        hash = (37 * hash) + ECPOLICIES_FIELD_NUMBER;
        hash = (53 * hash) + getEcPoliciesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.GetErasureCodingPoliciesResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.GetErasureCodingPoliciesResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetErasureCodingPoliciesResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetErasureCodingPoliciesResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto.newBuilder()
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
          getEcPoliciesFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (ecPoliciesBuilder_ == null) {
          ecPolicies_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ecPoliciesBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetErasureCodingPoliciesResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto(this);
        int from_bitField0_ = bitField0_;
        if (ecPoliciesBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            ecPolicies_ = java.util.Collections.unmodifiableList(ecPolicies_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.ecPolicies_ = ecPolicies_;
        } else {
          result.ecPolicies_ = ecPoliciesBuilder_.build();
        }
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto.getDefaultInstance()) return this;
        if (ecPoliciesBuilder_ == null) {
          if (!other.ecPolicies_.isEmpty()) {
            if (ecPolicies_.isEmpty()) {
              ecPolicies_ = other.ecPolicies_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureEcPoliciesIsMutable();
              ecPolicies_.addAll(other.ecPolicies_);
            }
            onChanged();
          }
        } else {
          if (!other.ecPolicies_.isEmpty()) {
            if (ecPoliciesBuilder_.isEmpty()) {
              ecPoliciesBuilder_.dispose();
              ecPoliciesBuilder_ = null;
              ecPolicies_ = other.ecPolicies_;
              bitField0_ = (bitField0_ & ~0x00000001);
              ecPoliciesBuilder_ = 
                org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getEcPoliciesFieldBuilder() : null;
            } else {
              ecPoliciesBuilder_.addAllMessages(other.ecPolicies_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        for (int i = 0; i < getEcPoliciesCount(); i++) {
          if (!getEcPolicies(i).isInitialized()) {
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
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto> ecPolicies_ =
        java.util.Collections.emptyList();
      private void ensureEcPoliciesIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          ecPolicies_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto>(ecPolicies_);
          bitField0_ |= 0x00000001;
         }
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProtoOrBuilder> ecPoliciesBuilder_;

      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto> getEcPoliciesList() {
        if (ecPoliciesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(ecPolicies_);
        } else {
          return ecPoliciesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public int getEcPoliciesCount() {
        if (ecPoliciesBuilder_ == null) {
          return ecPolicies_.size();
        } else {
          return ecPoliciesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto getEcPolicies(int index) {
        if (ecPoliciesBuilder_ == null) {
          return ecPolicies_.get(index);
        } else {
          return ecPoliciesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public Builder setEcPolicies(
          int index, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto value) {
        if (ecPoliciesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEcPoliciesIsMutable();
          ecPolicies_.set(index, value);
          onChanged();
        } else {
          ecPoliciesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public Builder setEcPolicies(
          int index, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder builderForValue) {
        if (ecPoliciesBuilder_ == null) {
          ensureEcPoliciesIsMutable();
          ecPolicies_.set(index, builderForValue.build());
          onChanged();
        } else {
          ecPoliciesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public Builder addEcPolicies(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto value) {
        if (ecPoliciesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEcPoliciesIsMutable();
          ecPolicies_.add(value);
          onChanged();
        } else {
          ecPoliciesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public Builder addEcPolicies(
          int index, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto value) {
        if (ecPoliciesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEcPoliciesIsMutable();
          ecPolicies_.add(index, value);
          onChanged();
        } else {
          ecPoliciesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public Builder addEcPolicies(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder builderForValue) {
        if (ecPoliciesBuilder_ == null) {
          ensureEcPoliciesIsMutable();
          ecPolicies_.add(builderForValue.build());
          onChanged();
        } else {
          ecPoliciesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public Builder addEcPolicies(
          int index, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder builderForValue) {
        if (ecPoliciesBuilder_ == null) {
          ensureEcPoliciesIsMutable();
          ecPolicies_.add(index, builderForValue.build());
          onChanged();
        } else {
          ecPoliciesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public Builder addAllEcPolicies(
          java.lang.Iterable<? extends org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto> values) {
        if (ecPoliciesBuilder_ == null) {
          ensureEcPoliciesIsMutable();
          org.apache.hadoop.thirdparty.protobuf.AbstractMessageLite.Builder.addAll(
              values, ecPolicies_);
          onChanged();
        } else {
          ecPoliciesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public Builder clearEcPolicies() {
        if (ecPoliciesBuilder_ == null) {
          ecPolicies_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          ecPoliciesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public Builder removeEcPolicies(int index) {
        if (ecPoliciesBuilder_ == null) {
          ensureEcPoliciesIsMutable();
          ecPolicies_.remove(index);
          onChanged();
        } else {
          ecPoliciesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder getEcPoliciesBuilder(
          int index) {
        return getEcPoliciesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProtoOrBuilder getEcPoliciesOrBuilder(
          int index) {
        if (ecPoliciesBuilder_ == null) {
          return ecPolicies_.get(index);  } else {
          return ecPoliciesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProtoOrBuilder> 
           getEcPoliciesOrBuilderList() {
        if (ecPoliciesBuilder_ != null) {
          return ecPoliciesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(ecPolicies_);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder addEcPoliciesBuilder() {
        return getEcPoliciesFieldBuilder().addBuilder(
            org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder addEcPoliciesBuilder(
          int index) {
        return getEcPoliciesFieldBuilder().addBuilder(
            index, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder> 
           getEcPoliciesBuilderList() {
        return getEcPoliciesFieldBuilder().getBuilderList();
      }
      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProtoOrBuilder> 
          getEcPoliciesFieldBuilder() {
        if (ecPoliciesBuilder_ == null) {
          ecPoliciesBuilder_ = new org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProtoOrBuilder>(
                  ecPolicies_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          ecPolicies_ = null;
        }
        return ecPoliciesBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetErasureCodingPoliciesResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetErasureCodingPoliciesResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<GetErasureCodingPoliciesResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<GetErasureCodingPoliciesResponseProto>() {
      @java.lang.Override
      public GetErasureCodingPoliciesResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new GetErasureCodingPoliciesResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<GetErasureCodingPoliciesResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<GetErasureCodingPoliciesResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPoliciesResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GetErasureCodingCodecsRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.GetErasureCodingCodecsRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   * void request
   * </pre>
   *
   * Protobuf type {@code hadoop.hdfs.GetErasureCodingCodecsRequestProto}
   */
  public  static final class GetErasureCodingCodecsRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.GetErasureCodingCodecsRequestProto)
      GetErasureCodingCodecsRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetErasureCodingCodecsRequestProto.newBuilder() to construct.
    private GetErasureCodingCodecsRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetErasureCodingCodecsRequestProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetErasureCodingCodecsRequestProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetErasureCodingCodecsRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetErasureCodingCodecsRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto.Builder.class);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto prototype) {
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
     * void request
     * </pre>
     *
     * Protobuf type {@code hadoop.hdfs.GetErasureCodingCodecsRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.GetErasureCodingCodecsRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetErasureCodingCodecsRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetErasureCodingCodecsRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetErasureCodingCodecsRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto(this);
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto) e.getUnfinishedMessage();
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetErasureCodingCodecsRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetErasureCodingCodecsRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<GetErasureCodingCodecsRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<GetErasureCodingCodecsRequestProto>() {
      @java.lang.Override
      public GetErasureCodingCodecsRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new GetErasureCodingCodecsRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<GetErasureCodingCodecsRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<GetErasureCodingCodecsRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GetErasureCodingCodecsResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.GetErasureCodingCodecsResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .hadoop.hdfs.CodecProto codec = 1;</code>
     */
    java.util.List<org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto> 
        getCodecList();
    /**
     * <code>repeated .hadoop.hdfs.CodecProto codec = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto getCodec(int index);
    /**
     * <code>repeated .hadoop.hdfs.CodecProto codec = 1;</code>
     */
    int getCodecCount();
    /**
     * <code>repeated .hadoop.hdfs.CodecProto codec = 1;</code>
     */
    java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProtoOrBuilder> 
        getCodecOrBuilderList();
    /**
     * <code>repeated .hadoop.hdfs.CodecProto codec = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProtoOrBuilder getCodecOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code hadoop.hdfs.GetErasureCodingCodecsResponseProto}
   */
  public  static final class GetErasureCodingCodecsResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.GetErasureCodingCodecsResponseProto)
      GetErasureCodingCodecsResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetErasureCodingCodecsResponseProto.newBuilder() to construct.
    private GetErasureCodingCodecsResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetErasureCodingCodecsResponseProto() {
      codec_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetErasureCodingCodecsResponseProto(
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                codec_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto>();
                mutable_bitField0_ |= 0x00000001;
              }
              codec_.add(
                  input.readMessage(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto.PARSER, extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          codec_ = java.util.Collections.unmodifiableList(codec_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetErasureCodingCodecsResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetErasureCodingCodecsResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto.Builder.class);
    }

    public static final int CODEC_FIELD_NUMBER = 1;
    private java.util.List<org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto> codec_;
    /**
     * <code>repeated .hadoop.hdfs.CodecProto codec = 1;</code>
     */
    public java.util.List<org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto> getCodecList() {
      return codec_;
    }
    /**
     * <code>repeated .hadoop.hdfs.CodecProto codec = 1;</code>
     */
    public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProtoOrBuilder> 
        getCodecOrBuilderList() {
      return codec_;
    }
    /**
     * <code>repeated .hadoop.hdfs.CodecProto codec = 1;</code>
     */
    public int getCodecCount() {
      return codec_.size();
    }
    /**
     * <code>repeated .hadoop.hdfs.CodecProto codec = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto getCodec(int index) {
      return codec_.get(index);
    }
    /**
     * <code>repeated .hadoop.hdfs.CodecProto codec = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProtoOrBuilder getCodecOrBuilder(
        int index) {
      return codec_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getCodecCount(); i++) {
        if (!getCodec(i).isInitialized()) {
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
      for (int i = 0; i < codec_.size(); i++) {
        output.writeMessage(1, codec_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < codec_.size(); i++) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(1, codec_.get(i));
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto) obj;

      if (!getCodecList()
          .equals(other.getCodecList())) return false;
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
      if (getCodecCount() > 0) {
        hash = (37 * hash) + CODEC_FIELD_NUMBER;
        hash = (53 * hash) + getCodecList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.GetErasureCodingCodecsResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.GetErasureCodingCodecsResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetErasureCodingCodecsResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetErasureCodingCodecsResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto.newBuilder()
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
          getCodecFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (codecBuilder_ == null) {
          codec_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          codecBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetErasureCodingCodecsResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto(this);
        int from_bitField0_ = bitField0_;
        if (codecBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            codec_ = java.util.Collections.unmodifiableList(codec_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.codec_ = codec_;
        } else {
          result.codec_ = codecBuilder_.build();
        }
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto.getDefaultInstance()) return this;
        if (codecBuilder_ == null) {
          if (!other.codec_.isEmpty()) {
            if (codec_.isEmpty()) {
              codec_ = other.codec_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureCodecIsMutable();
              codec_.addAll(other.codec_);
            }
            onChanged();
          }
        } else {
          if (!other.codec_.isEmpty()) {
            if (codecBuilder_.isEmpty()) {
              codecBuilder_.dispose();
              codecBuilder_ = null;
              codec_ = other.codec_;
              bitField0_ = (bitField0_ & ~0x00000001);
              codecBuilder_ = 
                org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getCodecFieldBuilder() : null;
            } else {
              codecBuilder_.addAllMessages(other.codec_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        for (int i = 0; i < getCodecCount(); i++) {
          if (!getCodec(i).isInitialized()) {
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
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto> codec_ =
        java.util.Collections.emptyList();
      private void ensureCodecIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          codec_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto>(codec_);
          bitField0_ |= 0x00000001;
         }
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto.Builder, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProtoOrBuilder> codecBuilder_;

      /**
       * <code>repeated .hadoop.hdfs.CodecProto codec = 1;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto> getCodecList() {
        if (codecBuilder_ == null) {
          return java.util.Collections.unmodifiableList(codec_);
        } else {
          return codecBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.CodecProto codec = 1;</code>
       */
      public int getCodecCount() {
        if (codecBuilder_ == null) {
          return codec_.size();
        } else {
          return codecBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.CodecProto codec = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto getCodec(int index) {
        if (codecBuilder_ == null) {
          return codec_.get(index);
        } else {
          return codecBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.CodecProto codec = 1;</code>
       */
      public Builder setCodec(
          int index, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto value) {
        if (codecBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCodecIsMutable();
          codec_.set(index, value);
          onChanged();
        } else {
          codecBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.CodecProto codec = 1;</code>
       */
      public Builder setCodec(
          int index, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto.Builder builderForValue) {
        if (codecBuilder_ == null) {
          ensureCodecIsMutable();
          codec_.set(index, builderForValue.build());
          onChanged();
        } else {
          codecBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.CodecProto codec = 1;</code>
       */
      public Builder addCodec(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto value) {
        if (codecBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCodecIsMutable();
          codec_.add(value);
          onChanged();
        } else {
          codecBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.CodecProto codec = 1;</code>
       */
      public Builder addCodec(
          int index, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto value) {
        if (codecBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCodecIsMutable();
          codec_.add(index, value);
          onChanged();
        } else {
          codecBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.CodecProto codec = 1;</code>
       */
      public Builder addCodec(
          org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto.Builder builderForValue) {
        if (codecBuilder_ == null) {
          ensureCodecIsMutable();
          codec_.add(builderForValue.build());
          onChanged();
        } else {
          codecBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.CodecProto codec = 1;</code>
       */
      public Builder addCodec(
          int index, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto.Builder builderForValue) {
        if (codecBuilder_ == null) {
          ensureCodecIsMutable();
          codec_.add(index, builderForValue.build());
          onChanged();
        } else {
          codecBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.CodecProto codec = 1;</code>
       */
      public Builder addAllCodec(
          java.lang.Iterable<? extends org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto> values) {
        if (codecBuilder_ == null) {
          ensureCodecIsMutable();
          org.apache.hadoop.thirdparty.protobuf.AbstractMessageLite.Builder.addAll(
              values, codec_);
          onChanged();
        } else {
          codecBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.CodecProto codec = 1;</code>
       */
      public Builder clearCodec() {
        if (codecBuilder_ == null) {
          codec_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          codecBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.CodecProto codec = 1;</code>
       */
      public Builder removeCodec(int index) {
        if (codecBuilder_ == null) {
          ensureCodecIsMutable();
          codec_.remove(index);
          onChanged();
        } else {
          codecBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.CodecProto codec = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto.Builder getCodecBuilder(
          int index) {
        return getCodecFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.hdfs.CodecProto codec = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProtoOrBuilder getCodecOrBuilder(
          int index) {
        if (codecBuilder_ == null) {
          return codec_.get(index);  } else {
          return codecBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.CodecProto codec = 1;</code>
       */
      public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProtoOrBuilder> 
           getCodecOrBuilderList() {
        if (codecBuilder_ != null) {
          return codecBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(codec_);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.CodecProto codec = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto.Builder addCodecBuilder() {
        return getCodecFieldBuilder().addBuilder(
            org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.CodecProto codec = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto.Builder addCodecBuilder(
          int index) {
        return getCodecFieldBuilder().addBuilder(
            index, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.CodecProto codec = 1;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto.Builder> 
           getCodecBuilderList() {
        return getCodecFieldBuilder().getBuilderList();
      }
      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto.Builder, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProtoOrBuilder> 
          getCodecFieldBuilder() {
        if (codecBuilder_ == null) {
          codecBuilder_ = new org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto.Builder, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProtoOrBuilder>(
                  codec_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          codec_ = null;
        }
        return codecBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetErasureCodingCodecsResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetErasureCodingCodecsResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<GetErasureCodingCodecsResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<GetErasureCodingCodecsResponseProto>() {
      @java.lang.Override
      public GetErasureCodingCodecsResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new GetErasureCodingCodecsResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<GetErasureCodingCodecsResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<GetErasureCodingCodecsResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingCodecsResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GetErasureCodingPolicyRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.GetErasureCodingPolicyRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * path to get the policy info
     * </pre>
     *
     * <code>required string src = 1;</code>
     */
    boolean hasSrc();
    /**
     * <pre>
     * path to get the policy info
     * </pre>
     *
     * <code>required string src = 1;</code>
     */
    java.lang.String getSrc();
    /**
     * <pre>
     * path to get the policy info
     * </pre>
     *
     * <code>required string src = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getSrcBytes();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.GetErasureCodingPolicyRequestProto}
   */
  public  static final class GetErasureCodingPolicyRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.GetErasureCodingPolicyRequestProto)
      GetErasureCodingPolicyRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetErasureCodingPolicyRequestProto.newBuilder() to construct.
    private GetErasureCodingPolicyRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetErasureCodingPolicyRequestProto() {
      src_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetErasureCodingPolicyRequestProto(
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
              src_ = bs;
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
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetErasureCodingPolicyRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetErasureCodingPolicyRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto.Builder.class);
    }

    private int bitField0_;
    public static final int SRC_FIELD_NUMBER = 1;
    private volatile java.lang.Object src_;
    /**
     * <pre>
     * path to get the policy info
     * </pre>
     *
     * <code>required string src = 1;</code>
     */
    public boolean hasSrc() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * path to get the policy info
     * </pre>
     *
     * <code>required string src = 1;</code>
     */
    public java.lang.String getSrc() {
      java.lang.Object ref = src_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          src_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * path to get the policy info
     * </pre>
     *
     * <code>required string src = 1;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getSrcBytes() {
      java.lang.Object ref = src_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        src_ = b;
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

      if (!hasSrc()) {
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, src_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, src_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto) obj;

      if (hasSrc() != other.hasSrc()) return false;
      if (hasSrc()) {
        if (!getSrc()
            .equals(other.getSrc())) return false;
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
      if (hasSrc()) {
        hash = (37 * hash) + SRC_FIELD_NUMBER;
        hash = (53 * hash) + getSrc().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.GetErasureCodingPolicyRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.GetErasureCodingPolicyRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetErasureCodingPolicyRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetErasureCodingPolicyRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto.newBuilder()
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
        src_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetErasureCodingPolicyRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.src_ = src_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto.getDefaultInstance()) return this;
        if (other.hasSrc()) {
          bitField0_ |= 0x00000001;
          src_ = other.src_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasSrc()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object src_ = "";
      /**
       * <pre>
       * path to get the policy info
       * </pre>
       *
       * <code>required string src = 1;</code>
       */
      public boolean hasSrc() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * path to get the policy info
       * </pre>
       *
       * <code>required string src = 1;</code>
       */
      public java.lang.String getSrc() {
        java.lang.Object ref = src_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            src_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * path to get the policy info
       * </pre>
       *
       * <code>required string src = 1;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getSrcBytes() {
        java.lang.Object ref = src_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          src_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * path to get the policy info
       * </pre>
       *
       * <code>required string src = 1;</code>
       */
      public Builder setSrc(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        src_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * path to get the policy info
       * </pre>
       *
       * <code>required string src = 1;</code>
       */
      public Builder clearSrc() {
        bitField0_ = (bitField0_ & ~0x00000001);
        src_ = getDefaultInstance().getSrc();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * path to get the policy info
       * </pre>
       *
       * <code>required string src = 1;</code>
       */
      public Builder setSrcBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        src_ = value;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetErasureCodingPolicyRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetErasureCodingPolicyRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<GetErasureCodingPolicyRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<GetErasureCodingPolicyRequestProto>() {
      @java.lang.Override
      public GetErasureCodingPolicyRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new GetErasureCodingPolicyRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<GetErasureCodingPolicyRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<GetErasureCodingPolicyRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GetErasureCodingPolicyResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.GetErasureCodingPolicyResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>optional .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 1;</code>
     */
    boolean hasEcPolicy();
    /**
     * <code>optional .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto getEcPolicy();
    /**
     * <code>optional .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProtoOrBuilder getEcPolicyOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.GetErasureCodingPolicyResponseProto}
   */
  public  static final class GetErasureCodingPolicyResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.GetErasureCodingPolicyResponseProto)
      GetErasureCodingPolicyResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetErasureCodingPolicyResponseProto.newBuilder() to construct.
    private GetErasureCodingPolicyResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetErasureCodingPolicyResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetErasureCodingPolicyResponseProto(
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
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = ecPolicy_.toBuilder();
              }
              ecPolicy_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(ecPolicy_);
                ecPolicy_ = subBuilder.buildPartial();
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
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetErasureCodingPolicyResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetErasureCodingPolicyResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto.Builder.class);
    }

    private int bitField0_;
    public static final int ECPOLICY_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto ecPolicy_;
    /**
     * <code>optional .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 1;</code>
     */
    public boolean hasEcPolicy() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto getEcPolicy() {
      return ecPolicy_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.getDefaultInstance() : ecPolicy_;
    }
    /**
     * <code>optional .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProtoOrBuilder getEcPolicyOrBuilder() {
      return ecPolicy_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.getDefaultInstance() : ecPolicy_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (hasEcPolicy()) {
        if (!getEcPolicy().isInitialized()) {
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
        output.writeMessage(1, getEcPolicy());
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
          .computeMessageSize(1, getEcPolicy());
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto) obj;

      if (hasEcPolicy() != other.hasEcPolicy()) return false;
      if (hasEcPolicy()) {
        if (!getEcPolicy()
            .equals(other.getEcPolicy())) return false;
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
      if (hasEcPolicy()) {
        hash = (37 * hash) + ECPOLICY_FIELD_NUMBER;
        hash = (53 * hash) + getEcPolicy().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.GetErasureCodingPolicyResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.GetErasureCodingPolicyResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetErasureCodingPolicyResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetErasureCodingPolicyResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto.newBuilder()
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
          getEcPolicyFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (ecPolicyBuilder_ == null) {
          ecPolicy_ = null;
        } else {
          ecPolicyBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetErasureCodingPolicyResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (ecPolicyBuilder_ == null) {
            result.ecPolicy_ = ecPolicy_;
          } else {
            result.ecPolicy_ = ecPolicyBuilder_.build();
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto.getDefaultInstance()) return this;
        if (other.hasEcPolicy()) {
          mergeEcPolicy(other.getEcPolicy());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (hasEcPolicy()) {
          if (!getEcPolicy().isInitialized()) {
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
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto ecPolicy_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProtoOrBuilder> ecPolicyBuilder_;
      /**
       * <code>optional .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 1;</code>
       */
      public boolean hasEcPolicy() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto getEcPolicy() {
        if (ecPolicyBuilder_ == null) {
          return ecPolicy_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.getDefaultInstance() : ecPolicy_;
        } else {
          return ecPolicyBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 1;</code>
       */
      public Builder setEcPolicy(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto value) {
        if (ecPolicyBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ecPolicy_ = value;
          onChanged();
        } else {
          ecPolicyBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 1;</code>
       */
      public Builder setEcPolicy(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder builderForValue) {
        if (ecPolicyBuilder_ == null) {
          ecPolicy_ = builderForValue.build();
          onChanged();
        } else {
          ecPolicyBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 1;</code>
       */
      public Builder mergeEcPolicy(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto value) {
        if (ecPolicyBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              ecPolicy_ != null &&
              ecPolicy_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.getDefaultInstance()) {
            ecPolicy_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.newBuilder(ecPolicy_).mergeFrom(value).buildPartial();
          } else {
            ecPolicy_ = value;
          }
          onChanged();
        } else {
          ecPolicyBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 1;</code>
       */
      public Builder clearEcPolicy() {
        if (ecPolicyBuilder_ == null) {
          ecPolicy_ = null;
          onChanged();
        } else {
          ecPolicyBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder getEcPolicyBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getEcPolicyFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProtoOrBuilder getEcPolicyOrBuilder() {
        if (ecPolicyBuilder_ != null) {
          return ecPolicyBuilder_.getMessageOrBuilder();
        } else {
          return ecPolicy_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.getDefaultInstance() : ecPolicy_;
        }
      }
      /**
       * <code>optional .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 1;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProtoOrBuilder> 
          getEcPolicyFieldBuilder() {
        if (ecPolicyBuilder_ == null) {
          ecPolicyBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProtoOrBuilder>(
                  getEcPolicy(),
                  getParentForChildren(),
                  isClean());
          ecPolicy_ = null;
        }
        return ecPolicyBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetErasureCodingPolicyResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetErasureCodingPolicyResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<GetErasureCodingPolicyResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<GetErasureCodingPolicyResponseProto>() {
      @java.lang.Override
      public GetErasureCodingPolicyResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new GetErasureCodingPolicyResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<GetErasureCodingPolicyResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<GetErasureCodingPolicyResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetErasureCodingPolicyResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface AddErasureCodingPoliciesRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.AddErasureCodingPoliciesRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
     */
    java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto> 
        getEcPoliciesList();
    /**
     * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto getEcPolicies(int index);
    /**
     * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
     */
    int getEcPoliciesCount();
    /**
     * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
     */
    java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProtoOrBuilder> 
        getEcPoliciesOrBuilderList();
    /**
     * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProtoOrBuilder getEcPoliciesOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code hadoop.hdfs.AddErasureCodingPoliciesRequestProto}
   */
  public  static final class AddErasureCodingPoliciesRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.AddErasureCodingPoliciesRequestProto)
      AddErasureCodingPoliciesRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AddErasureCodingPoliciesRequestProto.newBuilder() to construct.
    private AddErasureCodingPoliciesRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AddErasureCodingPoliciesRequestProto() {
      ecPolicies_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AddErasureCodingPoliciesRequestProto(
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                ecPolicies_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto>();
                mutable_bitField0_ |= 0x00000001;
              }
              ecPolicies_.add(
                  input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.PARSER, extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          ecPolicies_ = java.util.Collections.unmodifiableList(ecPolicies_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_AddErasureCodingPoliciesRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_AddErasureCodingPoliciesRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto.Builder.class);
    }

    public static final int ECPOLICIES_FIELD_NUMBER = 1;
    private java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto> ecPolicies_;
    /**
     * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
     */
    public java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto> getEcPoliciesList() {
      return ecPolicies_;
    }
    /**
     * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
     */
    public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProtoOrBuilder> 
        getEcPoliciesOrBuilderList() {
      return ecPolicies_;
    }
    /**
     * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
     */
    public int getEcPoliciesCount() {
      return ecPolicies_.size();
    }
    /**
     * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto getEcPolicies(int index) {
      return ecPolicies_.get(index);
    }
    /**
     * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProtoOrBuilder getEcPoliciesOrBuilder(
        int index) {
      return ecPolicies_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getEcPoliciesCount(); i++) {
        if (!getEcPolicies(i).isInitialized()) {
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
      for (int i = 0; i < ecPolicies_.size(); i++) {
        output.writeMessage(1, ecPolicies_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < ecPolicies_.size(); i++) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(1, ecPolicies_.get(i));
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto) obj;

      if (!getEcPoliciesList()
          .equals(other.getEcPoliciesList())) return false;
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
      if (getEcPoliciesCount() > 0) {
        hash = (37 * hash) + ECPOLICIES_FIELD_NUMBER;
        hash = (53 * hash) + getEcPoliciesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.AddErasureCodingPoliciesRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.AddErasureCodingPoliciesRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_AddErasureCodingPoliciesRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_AddErasureCodingPoliciesRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto.newBuilder()
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
          getEcPoliciesFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (ecPoliciesBuilder_ == null) {
          ecPolicies_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ecPoliciesBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_AddErasureCodingPoliciesRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto(this);
        int from_bitField0_ = bitField0_;
        if (ecPoliciesBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            ecPolicies_ = java.util.Collections.unmodifiableList(ecPolicies_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.ecPolicies_ = ecPolicies_;
        } else {
          result.ecPolicies_ = ecPoliciesBuilder_.build();
        }
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto.getDefaultInstance()) return this;
        if (ecPoliciesBuilder_ == null) {
          if (!other.ecPolicies_.isEmpty()) {
            if (ecPolicies_.isEmpty()) {
              ecPolicies_ = other.ecPolicies_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureEcPoliciesIsMutable();
              ecPolicies_.addAll(other.ecPolicies_);
            }
            onChanged();
          }
        } else {
          if (!other.ecPolicies_.isEmpty()) {
            if (ecPoliciesBuilder_.isEmpty()) {
              ecPoliciesBuilder_.dispose();
              ecPoliciesBuilder_ = null;
              ecPolicies_ = other.ecPolicies_;
              bitField0_ = (bitField0_ & ~0x00000001);
              ecPoliciesBuilder_ = 
                org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getEcPoliciesFieldBuilder() : null;
            } else {
              ecPoliciesBuilder_.addAllMessages(other.ecPolicies_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        for (int i = 0; i < getEcPoliciesCount(); i++) {
          if (!getEcPolicies(i).isInitialized()) {
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
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto> ecPolicies_ =
        java.util.Collections.emptyList();
      private void ensureEcPoliciesIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          ecPolicies_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto>(ecPolicies_);
          bitField0_ |= 0x00000001;
         }
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProtoOrBuilder> ecPoliciesBuilder_;

      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto> getEcPoliciesList() {
        if (ecPoliciesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(ecPolicies_);
        } else {
          return ecPoliciesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public int getEcPoliciesCount() {
        if (ecPoliciesBuilder_ == null) {
          return ecPolicies_.size();
        } else {
          return ecPoliciesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto getEcPolicies(int index) {
        if (ecPoliciesBuilder_ == null) {
          return ecPolicies_.get(index);
        } else {
          return ecPoliciesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public Builder setEcPolicies(
          int index, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto value) {
        if (ecPoliciesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEcPoliciesIsMutable();
          ecPolicies_.set(index, value);
          onChanged();
        } else {
          ecPoliciesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public Builder setEcPolicies(
          int index, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder builderForValue) {
        if (ecPoliciesBuilder_ == null) {
          ensureEcPoliciesIsMutable();
          ecPolicies_.set(index, builderForValue.build());
          onChanged();
        } else {
          ecPoliciesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public Builder addEcPolicies(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto value) {
        if (ecPoliciesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEcPoliciesIsMutable();
          ecPolicies_.add(value);
          onChanged();
        } else {
          ecPoliciesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public Builder addEcPolicies(
          int index, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto value) {
        if (ecPoliciesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEcPoliciesIsMutable();
          ecPolicies_.add(index, value);
          onChanged();
        } else {
          ecPoliciesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public Builder addEcPolicies(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder builderForValue) {
        if (ecPoliciesBuilder_ == null) {
          ensureEcPoliciesIsMutable();
          ecPolicies_.add(builderForValue.build());
          onChanged();
        } else {
          ecPoliciesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public Builder addEcPolicies(
          int index, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder builderForValue) {
        if (ecPoliciesBuilder_ == null) {
          ensureEcPoliciesIsMutable();
          ecPolicies_.add(index, builderForValue.build());
          onChanged();
        } else {
          ecPoliciesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public Builder addAllEcPolicies(
          java.lang.Iterable<? extends org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto> values) {
        if (ecPoliciesBuilder_ == null) {
          ensureEcPoliciesIsMutable();
          org.apache.hadoop.thirdparty.protobuf.AbstractMessageLite.Builder.addAll(
              values, ecPolicies_);
          onChanged();
        } else {
          ecPoliciesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public Builder clearEcPolicies() {
        if (ecPoliciesBuilder_ == null) {
          ecPolicies_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          ecPoliciesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public Builder removeEcPolicies(int index) {
        if (ecPoliciesBuilder_ == null) {
          ensureEcPoliciesIsMutable();
          ecPolicies_.remove(index);
          onChanged();
        } else {
          ecPoliciesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder getEcPoliciesBuilder(
          int index) {
        return getEcPoliciesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProtoOrBuilder getEcPoliciesOrBuilder(
          int index) {
        if (ecPoliciesBuilder_ == null) {
          return ecPolicies_.get(index);  } else {
          return ecPoliciesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProtoOrBuilder> 
           getEcPoliciesOrBuilderList() {
        if (ecPoliciesBuilder_ != null) {
          return ecPoliciesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(ecPolicies_);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder addEcPoliciesBuilder() {
        return getEcPoliciesFieldBuilder().addBuilder(
            org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder addEcPoliciesBuilder(
          int index) {
        return getEcPoliciesFieldBuilder().addBuilder(
            index, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.ErasureCodingPolicyProto ecPolicies = 1;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder> 
           getEcPoliciesBuilderList() {
        return getEcPoliciesFieldBuilder().getBuilderList();
      }
      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProtoOrBuilder> 
          getEcPoliciesFieldBuilder() {
        if (ecPoliciesBuilder_ == null) {
          ecPoliciesBuilder_ = new org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProtoOrBuilder>(
                  ecPolicies_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          ecPolicies_ = null;
        }
        return ecPoliciesBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.AddErasureCodingPoliciesRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.AddErasureCodingPoliciesRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<AddErasureCodingPoliciesRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<AddErasureCodingPoliciesRequestProto>() {
      @java.lang.Override
      public AddErasureCodingPoliciesRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new AddErasureCodingPoliciesRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<AddErasureCodingPoliciesRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<AddErasureCodingPoliciesRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface AddErasureCodingPoliciesResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.AddErasureCodingPoliciesResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .hadoop.hdfs.AddErasureCodingPolicyResponseProto responses = 1;</code>
     */
    java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProto> 
        getResponsesList();
    /**
     * <code>repeated .hadoop.hdfs.AddErasureCodingPolicyResponseProto responses = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProto getResponses(int index);
    /**
     * <code>repeated .hadoop.hdfs.AddErasureCodingPolicyResponseProto responses = 1;</code>
     */
    int getResponsesCount();
    /**
     * <code>repeated .hadoop.hdfs.AddErasureCodingPolicyResponseProto responses = 1;</code>
     */
    java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProtoOrBuilder> 
        getResponsesOrBuilderList();
    /**
     * <code>repeated .hadoop.hdfs.AddErasureCodingPolicyResponseProto responses = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProtoOrBuilder getResponsesOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code hadoop.hdfs.AddErasureCodingPoliciesResponseProto}
   */
  public  static final class AddErasureCodingPoliciesResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.AddErasureCodingPoliciesResponseProto)
      AddErasureCodingPoliciesResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AddErasureCodingPoliciesResponseProto.newBuilder() to construct.
    private AddErasureCodingPoliciesResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AddErasureCodingPoliciesResponseProto() {
      responses_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AddErasureCodingPoliciesResponseProto(
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                responses_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProto>();
                mutable_bitField0_ |= 0x00000001;
              }
              responses_.add(
                  input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProto.PARSER, extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          responses_ = java.util.Collections.unmodifiableList(responses_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_AddErasureCodingPoliciesResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_AddErasureCodingPoliciesResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto.Builder.class);
    }

    public static final int RESPONSES_FIELD_NUMBER = 1;
    private java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProto> responses_;
    /**
     * <code>repeated .hadoop.hdfs.AddErasureCodingPolicyResponseProto responses = 1;</code>
     */
    public java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProto> getResponsesList() {
      return responses_;
    }
    /**
     * <code>repeated .hadoop.hdfs.AddErasureCodingPolicyResponseProto responses = 1;</code>
     */
    public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProtoOrBuilder> 
        getResponsesOrBuilderList() {
      return responses_;
    }
    /**
     * <code>repeated .hadoop.hdfs.AddErasureCodingPolicyResponseProto responses = 1;</code>
     */
    public int getResponsesCount() {
      return responses_.size();
    }
    /**
     * <code>repeated .hadoop.hdfs.AddErasureCodingPolicyResponseProto responses = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProto getResponses(int index) {
      return responses_.get(index);
    }
    /**
     * <code>repeated .hadoop.hdfs.AddErasureCodingPolicyResponseProto responses = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProtoOrBuilder getResponsesOrBuilder(
        int index) {
      return responses_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getResponsesCount(); i++) {
        if (!getResponses(i).isInitialized()) {
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
      for (int i = 0; i < responses_.size(); i++) {
        output.writeMessage(1, responses_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < responses_.size(); i++) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(1, responses_.get(i));
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto) obj;

      if (!getResponsesList()
          .equals(other.getResponsesList())) return false;
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
      if (getResponsesCount() > 0) {
        hash = (37 * hash) + RESPONSES_FIELD_NUMBER;
        hash = (53 * hash) + getResponsesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.AddErasureCodingPoliciesResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.AddErasureCodingPoliciesResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_AddErasureCodingPoliciesResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_AddErasureCodingPoliciesResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto.newBuilder()
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
          getResponsesFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (responsesBuilder_ == null) {
          responses_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          responsesBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_AddErasureCodingPoliciesResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto(this);
        int from_bitField0_ = bitField0_;
        if (responsesBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            responses_ = java.util.Collections.unmodifiableList(responses_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.responses_ = responses_;
        } else {
          result.responses_ = responsesBuilder_.build();
        }
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto.getDefaultInstance()) return this;
        if (responsesBuilder_ == null) {
          if (!other.responses_.isEmpty()) {
            if (responses_.isEmpty()) {
              responses_ = other.responses_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureResponsesIsMutable();
              responses_.addAll(other.responses_);
            }
            onChanged();
          }
        } else {
          if (!other.responses_.isEmpty()) {
            if (responsesBuilder_.isEmpty()) {
              responsesBuilder_.dispose();
              responsesBuilder_ = null;
              responses_ = other.responses_;
              bitField0_ = (bitField0_ & ~0x00000001);
              responsesBuilder_ = 
                org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getResponsesFieldBuilder() : null;
            } else {
              responsesBuilder_.addAllMessages(other.responses_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        for (int i = 0; i < getResponsesCount(); i++) {
          if (!getResponses(i).isInitialized()) {
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
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProto> responses_ =
        java.util.Collections.emptyList();
      private void ensureResponsesIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          responses_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProto>(responses_);
          bitField0_ |= 0x00000001;
         }
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProtoOrBuilder> responsesBuilder_;

      /**
       * <code>repeated .hadoop.hdfs.AddErasureCodingPolicyResponseProto responses = 1;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProto> getResponsesList() {
        if (responsesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(responses_);
        } else {
          return responsesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AddErasureCodingPolicyResponseProto responses = 1;</code>
       */
      public int getResponsesCount() {
        if (responsesBuilder_ == null) {
          return responses_.size();
        } else {
          return responsesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AddErasureCodingPolicyResponseProto responses = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProto getResponses(int index) {
        if (responsesBuilder_ == null) {
          return responses_.get(index);
        } else {
          return responsesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AddErasureCodingPolicyResponseProto responses = 1;</code>
       */
      public Builder setResponses(
          int index, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProto value) {
        if (responsesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureResponsesIsMutable();
          responses_.set(index, value);
          onChanged();
        } else {
          responsesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AddErasureCodingPolicyResponseProto responses = 1;</code>
       */
      public Builder setResponses(
          int index, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProto.Builder builderForValue) {
        if (responsesBuilder_ == null) {
          ensureResponsesIsMutable();
          responses_.set(index, builderForValue.build());
          onChanged();
        } else {
          responsesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AddErasureCodingPolicyResponseProto responses = 1;</code>
       */
      public Builder addResponses(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProto value) {
        if (responsesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureResponsesIsMutable();
          responses_.add(value);
          onChanged();
        } else {
          responsesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AddErasureCodingPolicyResponseProto responses = 1;</code>
       */
      public Builder addResponses(
          int index, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProto value) {
        if (responsesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureResponsesIsMutable();
          responses_.add(index, value);
          onChanged();
        } else {
          responsesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AddErasureCodingPolicyResponseProto responses = 1;</code>
       */
      public Builder addResponses(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProto.Builder builderForValue) {
        if (responsesBuilder_ == null) {
          ensureResponsesIsMutable();
          responses_.add(builderForValue.build());
          onChanged();
        } else {
          responsesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AddErasureCodingPolicyResponseProto responses = 1;</code>
       */
      public Builder addResponses(
          int index, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProto.Builder builderForValue) {
        if (responsesBuilder_ == null) {
          ensureResponsesIsMutable();
          responses_.add(index, builderForValue.build());
          onChanged();
        } else {
          responsesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AddErasureCodingPolicyResponseProto responses = 1;</code>
       */
      public Builder addAllResponses(
          java.lang.Iterable<? extends org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProto> values) {
        if (responsesBuilder_ == null) {
          ensureResponsesIsMutable();
          org.apache.hadoop.thirdparty.protobuf.AbstractMessageLite.Builder.addAll(
              values, responses_);
          onChanged();
        } else {
          responsesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AddErasureCodingPolicyResponseProto responses = 1;</code>
       */
      public Builder clearResponses() {
        if (responsesBuilder_ == null) {
          responses_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          responsesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AddErasureCodingPolicyResponseProto responses = 1;</code>
       */
      public Builder removeResponses(int index) {
        if (responsesBuilder_ == null) {
          ensureResponsesIsMutable();
          responses_.remove(index);
          onChanged();
        } else {
          responsesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AddErasureCodingPolicyResponseProto responses = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProto.Builder getResponsesBuilder(
          int index) {
        return getResponsesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.hdfs.AddErasureCodingPolicyResponseProto responses = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProtoOrBuilder getResponsesOrBuilder(
          int index) {
        if (responsesBuilder_ == null) {
          return responses_.get(index);  } else {
          return responsesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AddErasureCodingPolicyResponseProto responses = 1;</code>
       */
      public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProtoOrBuilder> 
           getResponsesOrBuilderList() {
        if (responsesBuilder_ != null) {
          return responsesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(responses_);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AddErasureCodingPolicyResponseProto responses = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProto.Builder addResponsesBuilder() {
        return getResponsesFieldBuilder().addBuilder(
            org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.AddErasureCodingPolicyResponseProto responses = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProto.Builder addResponsesBuilder(
          int index) {
        return getResponsesFieldBuilder().addBuilder(
            index, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.AddErasureCodingPolicyResponseProto responses = 1;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProto.Builder> 
           getResponsesBuilderList() {
        return getResponsesFieldBuilder().getBuilderList();
      }
      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProtoOrBuilder> 
          getResponsesFieldBuilder() {
        if (responsesBuilder_ == null) {
          responsesBuilder_ = new org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.AddErasureCodingPolicyResponseProtoOrBuilder>(
                  responses_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          responses_ = null;
        }
        return responsesBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.AddErasureCodingPoliciesResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.AddErasureCodingPoliciesResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<AddErasureCodingPoliciesResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<AddErasureCodingPoliciesResponseProto>() {
      @java.lang.Override
      public AddErasureCodingPoliciesResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new AddErasureCodingPoliciesResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<AddErasureCodingPoliciesResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<AddErasureCodingPoliciesResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.AddErasureCodingPoliciesResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RemoveErasureCodingPolicyRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.RemoveErasureCodingPolicyRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required string ecPolicyName = 1;</code>
     */
    boolean hasEcPolicyName();
    /**
     * <code>required string ecPolicyName = 1;</code>
     */
    java.lang.String getEcPolicyName();
    /**
     * <code>required string ecPolicyName = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getEcPolicyNameBytes();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.RemoveErasureCodingPolicyRequestProto}
   */
  public  static final class RemoveErasureCodingPolicyRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.RemoveErasureCodingPolicyRequestProto)
      RemoveErasureCodingPolicyRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RemoveErasureCodingPolicyRequestProto.newBuilder() to construct.
    private RemoveErasureCodingPolicyRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RemoveErasureCodingPolicyRequestProto() {
      ecPolicyName_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RemoveErasureCodingPolicyRequestProto(
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
              ecPolicyName_ = bs;
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
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_RemoveErasureCodingPolicyRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_RemoveErasureCodingPolicyRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto.Builder.class);
    }

    private int bitField0_;
    public static final int ECPOLICYNAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object ecPolicyName_;
    /**
     * <code>required string ecPolicyName = 1;</code>
     */
    public boolean hasEcPolicyName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string ecPolicyName = 1;</code>
     */
    public java.lang.String getEcPolicyName() {
      java.lang.Object ref = ecPolicyName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          ecPolicyName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string ecPolicyName = 1;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getEcPolicyNameBytes() {
      java.lang.Object ref = ecPolicyName_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ecPolicyName_ = b;
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

      if (!hasEcPolicyName()) {
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, ecPolicyName_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, ecPolicyName_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto) obj;

      if (hasEcPolicyName() != other.hasEcPolicyName()) return false;
      if (hasEcPolicyName()) {
        if (!getEcPolicyName()
            .equals(other.getEcPolicyName())) return false;
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
      if (hasEcPolicyName()) {
        hash = (37 * hash) + ECPOLICYNAME_FIELD_NUMBER;
        hash = (53 * hash) + getEcPolicyName().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.RemoveErasureCodingPolicyRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.RemoveErasureCodingPolicyRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_RemoveErasureCodingPolicyRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_RemoveErasureCodingPolicyRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto.newBuilder()
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
        ecPolicyName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_RemoveErasureCodingPolicyRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.ecPolicyName_ = ecPolicyName_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto.getDefaultInstance()) return this;
        if (other.hasEcPolicyName()) {
          bitField0_ |= 0x00000001;
          ecPolicyName_ = other.ecPolicyName_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasEcPolicyName()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object ecPolicyName_ = "";
      /**
       * <code>required string ecPolicyName = 1;</code>
       */
      public boolean hasEcPolicyName() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string ecPolicyName = 1;</code>
       */
      public java.lang.String getEcPolicyName() {
        java.lang.Object ref = ecPolicyName_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            ecPolicyName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string ecPolicyName = 1;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getEcPolicyNameBytes() {
        java.lang.Object ref = ecPolicyName_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          ecPolicyName_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string ecPolicyName = 1;</code>
       */
      public Builder setEcPolicyName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        ecPolicyName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string ecPolicyName = 1;</code>
       */
      public Builder clearEcPolicyName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        ecPolicyName_ = getDefaultInstance().getEcPolicyName();
        onChanged();
        return this;
      }
      /**
       * <code>required string ecPolicyName = 1;</code>
       */
      public Builder setEcPolicyNameBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        ecPolicyName_ = value;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.RemoveErasureCodingPolicyRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.RemoveErasureCodingPolicyRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<RemoveErasureCodingPolicyRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<RemoveErasureCodingPolicyRequestProto>() {
      @java.lang.Override
      public RemoveErasureCodingPolicyRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new RemoveErasureCodingPolicyRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<RemoveErasureCodingPolicyRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<RemoveErasureCodingPolicyRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RemoveErasureCodingPolicyResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.RemoveErasureCodingPolicyResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.RemoveErasureCodingPolicyResponseProto}
   */
  public  static final class RemoveErasureCodingPolicyResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.RemoveErasureCodingPolicyResponseProto)
      RemoveErasureCodingPolicyResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RemoveErasureCodingPolicyResponseProto.newBuilder() to construct.
    private RemoveErasureCodingPolicyResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RemoveErasureCodingPolicyResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RemoveErasureCodingPolicyResponseProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_RemoveErasureCodingPolicyResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_RemoveErasureCodingPolicyResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto.Builder.class);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.RemoveErasureCodingPolicyResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.RemoveErasureCodingPolicyResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_RemoveErasureCodingPolicyResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_RemoveErasureCodingPolicyResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_RemoveErasureCodingPolicyResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto(this);
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto) e.getUnfinishedMessage();
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.RemoveErasureCodingPolicyResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.RemoveErasureCodingPolicyResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<RemoveErasureCodingPolicyResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<RemoveErasureCodingPolicyResponseProto>() {
      @java.lang.Override
      public RemoveErasureCodingPolicyResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new RemoveErasureCodingPolicyResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<RemoveErasureCodingPolicyResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<RemoveErasureCodingPolicyResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.RemoveErasureCodingPolicyResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface EnableErasureCodingPolicyRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.EnableErasureCodingPolicyRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required string ecPolicyName = 1;</code>
     */
    boolean hasEcPolicyName();
    /**
     * <code>required string ecPolicyName = 1;</code>
     */
    java.lang.String getEcPolicyName();
    /**
     * <code>required string ecPolicyName = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getEcPolicyNameBytes();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.EnableErasureCodingPolicyRequestProto}
   */
  public  static final class EnableErasureCodingPolicyRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.EnableErasureCodingPolicyRequestProto)
      EnableErasureCodingPolicyRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EnableErasureCodingPolicyRequestProto.newBuilder() to construct.
    private EnableErasureCodingPolicyRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EnableErasureCodingPolicyRequestProto() {
      ecPolicyName_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EnableErasureCodingPolicyRequestProto(
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
              ecPolicyName_ = bs;
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
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_EnableErasureCodingPolicyRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_EnableErasureCodingPolicyRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto.Builder.class);
    }

    private int bitField0_;
    public static final int ECPOLICYNAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object ecPolicyName_;
    /**
     * <code>required string ecPolicyName = 1;</code>
     */
    public boolean hasEcPolicyName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string ecPolicyName = 1;</code>
     */
    public java.lang.String getEcPolicyName() {
      java.lang.Object ref = ecPolicyName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          ecPolicyName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string ecPolicyName = 1;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getEcPolicyNameBytes() {
      java.lang.Object ref = ecPolicyName_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ecPolicyName_ = b;
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

      if (!hasEcPolicyName()) {
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, ecPolicyName_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, ecPolicyName_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto) obj;

      if (hasEcPolicyName() != other.hasEcPolicyName()) return false;
      if (hasEcPolicyName()) {
        if (!getEcPolicyName()
            .equals(other.getEcPolicyName())) return false;
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
      if (hasEcPolicyName()) {
        hash = (37 * hash) + ECPOLICYNAME_FIELD_NUMBER;
        hash = (53 * hash) + getEcPolicyName().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.EnableErasureCodingPolicyRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.EnableErasureCodingPolicyRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_EnableErasureCodingPolicyRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_EnableErasureCodingPolicyRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto.newBuilder()
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
        ecPolicyName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_EnableErasureCodingPolicyRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.ecPolicyName_ = ecPolicyName_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto.getDefaultInstance()) return this;
        if (other.hasEcPolicyName()) {
          bitField0_ |= 0x00000001;
          ecPolicyName_ = other.ecPolicyName_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasEcPolicyName()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object ecPolicyName_ = "";
      /**
       * <code>required string ecPolicyName = 1;</code>
       */
      public boolean hasEcPolicyName() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string ecPolicyName = 1;</code>
       */
      public java.lang.String getEcPolicyName() {
        java.lang.Object ref = ecPolicyName_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            ecPolicyName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string ecPolicyName = 1;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getEcPolicyNameBytes() {
        java.lang.Object ref = ecPolicyName_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          ecPolicyName_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string ecPolicyName = 1;</code>
       */
      public Builder setEcPolicyName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        ecPolicyName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string ecPolicyName = 1;</code>
       */
      public Builder clearEcPolicyName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        ecPolicyName_ = getDefaultInstance().getEcPolicyName();
        onChanged();
        return this;
      }
      /**
       * <code>required string ecPolicyName = 1;</code>
       */
      public Builder setEcPolicyNameBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        ecPolicyName_ = value;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.EnableErasureCodingPolicyRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.EnableErasureCodingPolicyRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<EnableErasureCodingPolicyRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<EnableErasureCodingPolicyRequestProto>() {
      @java.lang.Override
      public EnableErasureCodingPolicyRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new EnableErasureCodingPolicyRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<EnableErasureCodingPolicyRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<EnableErasureCodingPolicyRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface EnableErasureCodingPolicyResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.EnableErasureCodingPolicyResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.EnableErasureCodingPolicyResponseProto}
   */
  public  static final class EnableErasureCodingPolicyResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.EnableErasureCodingPolicyResponseProto)
      EnableErasureCodingPolicyResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EnableErasureCodingPolicyResponseProto.newBuilder() to construct.
    private EnableErasureCodingPolicyResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EnableErasureCodingPolicyResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EnableErasureCodingPolicyResponseProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_EnableErasureCodingPolicyResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_EnableErasureCodingPolicyResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto.Builder.class);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.EnableErasureCodingPolicyResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.EnableErasureCodingPolicyResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_EnableErasureCodingPolicyResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_EnableErasureCodingPolicyResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_EnableErasureCodingPolicyResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto(this);
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto) e.getUnfinishedMessage();
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.EnableErasureCodingPolicyResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.EnableErasureCodingPolicyResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<EnableErasureCodingPolicyResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<EnableErasureCodingPolicyResponseProto>() {
      @java.lang.Override
      public EnableErasureCodingPolicyResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new EnableErasureCodingPolicyResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<EnableErasureCodingPolicyResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<EnableErasureCodingPolicyResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.EnableErasureCodingPolicyResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface DisableErasureCodingPolicyRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.DisableErasureCodingPolicyRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required string ecPolicyName = 1;</code>
     */
    boolean hasEcPolicyName();
    /**
     * <code>required string ecPolicyName = 1;</code>
     */
    java.lang.String getEcPolicyName();
    /**
     * <code>required string ecPolicyName = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getEcPolicyNameBytes();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.DisableErasureCodingPolicyRequestProto}
   */
  public  static final class DisableErasureCodingPolicyRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.DisableErasureCodingPolicyRequestProto)
      DisableErasureCodingPolicyRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DisableErasureCodingPolicyRequestProto.newBuilder() to construct.
    private DisableErasureCodingPolicyRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DisableErasureCodingPolicyRequestProto() {
      ecPolicyName_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DisableErasureCodingPolicyRequestProto(
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
              ecPolicyName_ = bs;
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
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_DisableErasureCodingPolicyRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_DisableErasureCodingPolicyRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto.Builder.class);
    }

    private int bitField0_;
    public static final int ECPOLICYNAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object ecPolicyName_;
    /**
     * <code>required string ecPolicyName = 1;</code>
     */
    public boolean hasEcPolicyName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string ecPolicyName = 1;</code>
     */
    public java.lang.String getEcPolicyName() {
      java.lang.Object ref = ecPolicyName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          ecPolicyName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string ecPolicyName = 1;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getEcPolicyNameBytes() {
      java.lang.Object ref = ecPolicyName_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ecPolicyName_ = b;
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

      if (!hasEcPolicyName()) {
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, ecPolicyName_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, ecPolicyName_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto) obj;

      if (hasEcPolicyName() != other.hasEcPolicyName()) return false;
      if (hasEcPolicyName()) {
        if (!getEcPolicyName()
            .equals(other.getEcPolicyName())) return false;
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
      if (hasEcPolicyName()) {
        hash = (37 * hash) + ECPOLICYNAME_FIELD_NUMBER;
        hash = (53 * hash) + getEcPolicyName().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.DisableErasureCodingPolicyRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.DisableErasureCodingPolicyRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_DisableErasureCodingPolicyRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_DisableErasureCodingPolicyRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto.newBuilder()
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
        ecPolicyName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_DisableErasureCodingPolicyRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.ecPolicyName_ = ecPolicyName_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto.getDefaultInstance()) return this;
        if (other.hasEcPolicyName()) {
          bitField0_ |= 0x00000001;
          ecPolicyName_ = other.ecPolicyName_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasEcPolicyName()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object ecPolicyName_ = "";
      /**
       * <code>required string ecPolicyName = 1;</code>
       */
      public boolean hasEcPolicyName() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string ecPolicyName = 1;</code>
       */
      public java.lang.String getEcPolicyName() {
        java.lang.Object ref = ecPolicyName_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            ecPolicyName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string ecPolicyName = 1;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getEcPolicyNameBytes() {
        java.lang.Object ref = ecPolicyName_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          ecPolicyName_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string ecPolicyName = 1;</code>
       */
      public Builder setEcPolicyName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        ecPolicyName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string ecPolicyName = 1;</code>
       */
      public Builder clearEcPolicyName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        ecPolicyName_ = getDefaultInstance().getEcPolicyName();
        onChanged();
        return this;
      }
      /**
       * <code>required string ecPolicyName = 1;</code>
       */
      public Builder setEcPolicyNameBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        ecPolicyName_ = value;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.DisableErasureCodingPolicyRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.DisableErasureCodingPolicyRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<DisableErasureCodingPolicyRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<DisableErasureCodingPolicyRequestProto>() {
      @java.lang.Override
      public DisableErasureCodingPolicyRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new DisableErasureCodingPolicyRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<DisableErasureCodingPolicyRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<DisableErasureCodingPolicyRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface DisableErasureCodingPolicyResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.DisableErasureCodingPolicyResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.DisableErasureCodingPolicyResponseProto}
   */
  public  static final class DisableErasureCodingPolicyResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.DisableErasureCodingPolicyResponseProto)
      DisableErasureCodingPolicyResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DisableErasureCodingPolicyResponseProto.newBuilder() to construct.
    private DisableErasureCodingPolicyResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DisableErasureCodingPolicyResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DisableErasureCodingPolicyResponseProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_DisableErasureCodingPolicyResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_DisableErasureCodingPolicyResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto.Builder.class);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.DisableErasureCodingPolicyResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.DisableErasureCodingPolicyResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_DisableErasureCodingPolicyResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_DisableErasureCodingPolicyResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_DisableErasureCodingPolicyResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto(this);
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto) e.getUnfinishedMessage();
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.DisableErasureCodingPolicyResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.DisableErasureCodingPolicyResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<DisableErasureCodingPolicyResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<DisableErasureCodingPolicyResponseProto>() {
      @java.lang.Override
      public DisableErasureCodingPolicyResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new DisableErasureCodingPolicyResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<DisableErasureCodingPolicyResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<DisableErasureCodingPolicyResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.DisableErasureCodingPolicyResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface UnsetErasureCodingPolicyRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.UnsetErasureCodingPolicyRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required string src = 1;</code>
     */
    boolean hasSrc();
    /**
     * <code>required string src = 1;</code>
     */
    java.lang.String getSrc();
    /**
     * <code>required string src = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getSrcBytes();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.UnsetErasureCodingPolicyRequestProto}
   */
  public  static final class UnsetErasureCodingPolicyRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.UnsetErasureCodingPolicyRequestProto)
      UnsetErasureCodingPolicyRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UnsetErasureCodingPolicyRequestProto.newBuilder() to construct.
    private UnsetErasureCodingPolicyRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UnsetErasureCodingPolicyRequestProto() {
      src_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UnsetErasureCodingPolicyRequestProto(
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
              src_ = bs;
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
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_UnsetErasureCodingPolicyRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_UnsetErasureCodingPolicyRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto.Builder.class);
    }

    private int bitField0_;
    public static final int SRC_FIELD_NUMBER = 1;
    private volatile java.lang.Object src_;
    /**
     * <code>required string src = 1;</code>
     */
    public boolean hasSrc() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string src = 1;</code>
     */
    public java.lang.String getSrc() {
      java.lang.Object ref = src_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          src_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string src = 1;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getSrcBytes() {
      java.lang.Object ref = src_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        src_ = b;
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

      if (!hasSrc()) {
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, src_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, src_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto) obj;

      if (hasSrc() != other.hasSrc()) return false;
      if (hasSrc()) {
        if (!getSrc()
            .equals(other.getSrc())) return false;
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
      if (hasSrc()) {
        hash = (37 * hash) + SRC_FIELD_NUMBER;
        hash = (53 * hash) + getSrc().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.UnsetErasureCodingPolicyRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.UnsetErasureCodingPolicyRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_UnsetErasureCodingPolicyRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_UnsetErasureCodingPolicyRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto.newBuilder()
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
        src_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_UnsetErasureCodingPolicyRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.src_ = src_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto.getDefaultInstance()) return this;
        if (other.hasSrc()) {
          bitField0_ |= 0x00000001;
          src_ = other.src_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasSrc()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object src_ = "";
      /**
       * <code>required string src = 1;</code>
       */
      public boolean hasSrc() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string src = 1;</code>
       */
      public java.lang.String getSrc() {
        java.lang.Object ref = src_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            src_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string src = 1;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getSrcBytes() {
        java.lang.Object ref = src_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          src_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder setSrc(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        src_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder clearSrc() {
        bitField0_ = (bitField0_ & ~0x00000001);
        src_ = getDefaultInstance().getSrc();
        onChanged();
        return this;
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder setSrcBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        src_ = value;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.UnsetErasureCodingPolicyRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.UnsetErasureCodingPolicyRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<UnsetErasureCodingPolicyRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<UnsetErasureCodingPolicyRequestProto>() {
      @java.lang.Override
      public UnsetErasureCodingPolicyRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new UnsetErasureCodingPolicyRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<UnsetErasureCodingPolicyRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<UnsetErasureCodingPolicyRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface UnsetErasureCodingPolicyResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.UnsetErasureCodingPolicyResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.UnsetErasureCodingPolicyResponseProto}
   */
  public  static final class UnsetErasureCodingPolicyResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.UnsetErasureCodingPolicyResponseProto)
      UnsetErasureCodingPolicyResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UnsetErasureCodingPolicyResponseProto.newBuilder() to construct.
    private UnsetErasureCodingPolicyResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UnsetErasureCodingPolicyResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UnsetErasureCodingPolicyResponseProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_UnsetErasureCodingPolicyResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_UnsetErasureCodingPolicyResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto.Builder.class);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.UnsetErasureCodingPolicyResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.UnsetErasureCodingPolicyResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_UnsetErasureCodingPolicyResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_UnsetErasureCodingPolicyResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_UnsetErasureCodingPolicyResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto(this);
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto) e.getUnfinishedMessage();
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.UnsetErasureCodingPolicyResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.UnsetErasureCodingPolicyResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<UnsetErasureCodingPolicyResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<UnsetErasureCodingPolicyResponseProto>() {
      @java.lang.Override
      public UnsetErasureCodingPolicyResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new UnsetErasureCodingPolicyResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<UnsetErasureCodingPolicyResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<UnsetErasureCodingPolicyResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.UnsetErasureCodingPolicyResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GetECTopologyResultForPoliciesRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.GetECTopologyResultForPoliciesRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>repeated string policies = 1;</code>
     */
    java.util.List<java.lang.String>
        getPoliciesList();
    /**
     * <code>repeated string policies = 1;</code>
     */
    int getPoliciesCount();
    /**
     * <code>repeated string policies = 1;</code>
     */
    java.lang.String getPolicies(int index);
    /**
     * <code>repeated string policies = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getPoliciesBytes(int index);
  }
  /**
   * Protobuf type {@code hadoop.hdfs.GetECTopologyResultForPoliciesRequestProto}
   */
  public  static final class GetECTopologyResultForPoliciesRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.GetECTopologyResultForPoliciesRequestProto)
      GetECTopologyResultForPoliciesRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetECTopologyResultForPoliciesRequestProto.newBuilder() to construct.
    private GetECTopologyResultForPoliciesRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetECTopologyResultForPoliciesRequestProto() {
      policies_ = org.apache.hadoop.thirdparty.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetECTopologyResultForPoliciesRequestProto(
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                policies_ = new org.apache.hadoop.thirdparty.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              policies_.add(bs);
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          policies_ = policies_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetECTopologyResultForPoliciesRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetECTopologyResultForPoliciesRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto.Builder.class);
    }

    public static final int POLICIES_FIELD_NUMBER = 1;
    private org.apache.hadoop.thirdparty.protobuf.LazyStringList policies_;
    /**
     * <code>repeated string policies = 1;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ProtocolStringList
        getPoliciesList() {
      return policies_;
    }
    /**
     * <code>repeated string policies = 1;</code>
     */
    public int getPoliciesCount() {
      return policies_.size();
    }
    /**
     * <code>repeated string policies = 1;</code>
     */
    public java.lang.String getPolicies(int index) {
      return policies_.get(index);
    }
    /**
     * <code>repeated string policies = 1;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getPoliciesBytes(int index) {
      return policies_.getByteString(index);
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
      for (int i = 0; i < policies_.size(); i++) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, policies_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < policies_.size(); i++) {
          dataSize += computeStringSizeNoTag(policies_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getPoliciesList().size();
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto) obj;

      if (!getPoliciesList()
          .equals(other.getPoliciesList())) return false;
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
      if (getPoliciesCount() > 0) {
        hash = (37 * hash) + POLICIES_FIELD_NUMBER;
        hash = (53 * hash) + getPoliciesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.GetECTopologyResultForPoliciesRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.GetECTopologyResultForPoliciesRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetECTopologyResultForPoliciesRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetECTopologyResultForPoliciesRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto.newBuilder()
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
        policies_ = org.apache.hadoop.thirdparty.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetECTopologyResultForPoliciesRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          policies_ = policies_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.policies_ = policies_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto.getDefaultInstance()) return this;
        if (!other.policies_.isEmpty()) {
          if (policies_.isEmpty()) {
            policies_ = other.policies_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePoliciesIsMutable();
            policies_.addAll(other.policies_);
          }
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
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private org.apache.hadoop.thirdparty.protobuf.LazyStringList policies_ = org.apache.hadoop.thirdparty.protobuf.LazyStringArrayList.EMPTY;
      private void ensurePoliciesIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          policies_ = new org.apache.hadoop.thirdparty.protobuf.LazyStringArrayList(policies_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated string policies = 1;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ProtocolStringList
          getPoliciesList() {
        return policies_.getUnmodifiableView();
      }
      /**
       * <code>repeated string policies = 1;</code>
       */
      public int getPoliciesCount() {
        return policies_.size();
      }
      /**
       * <code>repeated string policies = 1;</code>
       */
      public java.lang.String getPolicies(int index) {
        return policies_.get(index);
      }
      /**
       * <code>repeated string policies = 1;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getPoliciesBytes(int index) {
        return policies_.getByteString(index);
      }
      /**
       * <code>repeated string policies = 1;</code>
       */
      public Builder setPolicies(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensurePoliciesIsMutable();
        policies_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string policies = 1;</code>
       */
      public Builder addPolicies(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensurePoliciesIsMutable();
        policies_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string policies = 1;</code>
       */
      public Builder addAllPolicies(
          java.lang.Iterable<java.lang.String> values) {
        ensurePoliciesIsMutable();
        org.apache.hadoop.thirdparty.protobuf.AbstractMessageLite.Builder.addAll(
            values, policies_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string policies = 1;</code>
       */
      public Builder clearPolicies() {
        policies_ = org.apache.hadoop.thirdparty.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string policies = 1;</code>
       */
      public Builder addPoliciesBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensurePoliciesIsMutable();
        policies_.add(value);
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetECTopologyResultForPoliciesRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetECTopologyResultForPoliciesRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<GetECTopologyResultForPoliciesRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<GetECTopologyResultForPoliciesRequestProto>() {
      @java.lang.Override
      public GetECTopologyResultForPoliciesRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new GetECTopologyResultForPoliciesRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<GetECTopologyResultForPoliciesRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<GetECTopologyResultForPoliciesRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GetECTopologyResultForPoliciesResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.GetECTopologyResultForPoliciesResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required .hadoop.hdfs.ECTopologyVerifierResultProto response = 1;</code>
     */
    boolean hasResponse();
    /**
     * <code>required .hadoop.hdfs.ECTopologyVerifierResultProto response = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ECTopologyVerifierResultProto getResponse();
    /**
     * <code>required .hadoop.hdfs.ECTopologyVerifierResultProto response = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ECTopologyVerifierResultProtoOrBuilder getResponseOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.GetECTopologyResultForPoliciesResponseProto}
   */
  public  static final class GetECTopologyResultForPoliciesResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.GetECTopologyResultForPoliciesResponseProto)
      GetECTopologyResultForPoliciesResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetECTopologyResultForPoliciesResponseProto.newBuilder() to construct.
    private GetECTopologyResultForPoliciesResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetECTopologyResultForPoliciesResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetECTopologyResultForPoliciesResponseProto(
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
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ECTopologyVerifierResultProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = response_.toBuilder();
              }
              response_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ECTopologyVerifierResultProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(response_);
                response_ = subBuilder.buildPartial();
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
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetECTopologyResultForPoliciesResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetECTopologyResultForPoliciesResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto.Builder.class);
    }

    private int bitField0_;
    public static final int RESPONSE_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ECTopologyVerifierResultProto response_;
    /**
     * <code>required .hadoop.hdfs.ECTopologyVerifierResultProto response = 1;</code>
     */
    public boolean hasResponse() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required .hadoop.hdfs.ECTopologyVerifierResultProto response = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ECTopologyVerifierResultProto getResponse() {
      return response_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ECTopologyVerifierResultProto.getDefaultInstance() : response_;
    }
    /**
     * <code>required .hadoop.hdfs.ECTopologyVerifierResultProto response = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ECTopologyVerifierResultProtoOrBuilder getResponseOrBuilder() {
      return response_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ECTopologyVerifierResultProto.getDefaultInstance() : response_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasResponse()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getResponse().isInitialized()) {
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
        output.writeMessage(1, getResponse());
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
          .computeMessageSize(1, getResponse());
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto) obj;

      if (hasResponse() != other.hasResponse()) return false;
      if (hasResponse()) {
        if (!getResponse()
            .equals(other.getResponse())) return false;
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
      if (hasResponse()) {
        hash = (37 * hash) + RESPONSE_FIELD_NUMBER;
        hash = (53 * hash) + getResponse().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.GetECTopologyResultForPoliciesResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.GetECTopologyResultForPoliciesResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetECTopologyResultForPoliciesResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetECTopologyResultForPoliciesResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto.newBuilder()
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
          getResponseFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (responseBuilder_ == null) {
          response_ = null;
        } else {
          responseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_GetECTopologyResultForPoliciesResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (responseBuilder_ == null) {
            result.response_ = response_;
          } else {
            result.response_ = responseBuilder_.build();
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto.getDefaultInstance()) return this;
        if (other.hasResponse()) {
          mergeResponse(other.getResponse());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasResponse()) {
          return false;
        }
        if (!getResponse().isInitialized()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ECTopologyVerifierResultProto response_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ECTopologyVerifierResultProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ECTopologyVerifierResultProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ECTopologyVerifierResultProtoOrBuilder> responseBuilder_;
      /**
       * <code>required .hadoop.hdfs.ECTopologyVerifierResultProto response = 1;</code>
       */
      public boolean hasResponse() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required .hadoop.hdfs.ECTopologyVerifierResultProto response = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ECTopologyVerifierResultProto getResponse() {
        if (responseBuilder_ == null) {
          return response_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ECTopologyVerifierResultProto.getDefaultInstance() : response_;
        } else {
          return responseBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.ECTopologyVerifierResultProto response = 1;</code>
       */
      public Builder setResponse(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ECTopologyVerifierResultProto value) {
        if (responseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          response_ = value;
          onChanged();
        } else {
          responseBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ECTopologyVerifierResultProto response = 1;</code>
       */
      public Builder setResponse(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ECTopologyVerifierResultProto.Builder builderForValue) {
        if (responseBuilder_ == null) {
          response_ = builderForValue.build();
          onChanged();
        } else {
          responseBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ECTopologyVerifierResultProto response = 1;</code>
       */
      public Builder mergeResponse(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ECTopologyVerifierResultProto value) {
        if (responseBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              response_ != null &&
              response_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ECTopologyVerifierResultProto.getDefaultInstance()) {
            response_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ECTopologyVerifierResultProto.newBuilder(response_).mergeFrom(value).buildPartial();
          } else {
            response_ = value;
          }
          onChanged();
        } else {
          responseBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ECTopologyVerifierResultProto response = 1;</code>
       */
      public Builder clearResponse() {
        if (responseBuilder_ == null) {
          response_ = null;
          onChanged();
        } else {
          responseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ECTopologyVerifierResultProto response = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ECTopologyVerifierResultProto.Builder getResponseBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getResponseFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.ECTopologyVerifierResultProto response = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ECTopologyVerifierResultProtoOrBuilder getResponseOrBuilder() {
        if (responseBuilder_ != null) {
          return responseBuilder_.getMessageOrBuilder();
        } else {
          return response_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ECTopologyVerifierResultProto.getDefaultInstance() : response_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.ECTopologyVerifierResultProto response = 1;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ECTopologyVerifierResultProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ECTopologyVerifierResultProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ECTopologyVerifierResultProtoOrBuilder> 
          getResponseFieldBuilder() {
        if (responseBuilder_ == null) {
          responseBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ECTopologyVerifierResultProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ECTopologyVerifierResultProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ECTopologyVerifierResultProtoOrBuilder>(
                  getResponse(),
                  getParentForChildren(),
                  isClean());
          response_ = null;
        }
        return responseBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetECTopologyResultForPoliciesResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetECTopologyResultForPoliciesResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<GetECTopologyResultForPoliciesResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<GetECTopologyResultForPoliciesResponseProto>() {
      @java.lang.Override
      public GetECTopologyResultForPoliciesResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new GetECTopologyResultForPoliciesResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<GetECTopologyResultForPoliciesResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<GetECTopologyResultForPoliciesResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.GetECTopologyResultForPoliciesResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface BlockECReconstructionInfoProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.BlockECReconstructionInfoProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     */
    boolean hasBlock();
    /**
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto getBlock();
    /**
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProtoOrBuilder getBlockOrBuilder();

    /**
     * <code>required .hadoop.hdfs.DatanodeInfosProto sourceDnInfos = 2;</code>
     */
    boolean hasSourceDnInfos();
    /**
     * <code>required .hadoop.hdfs.DatanodeInfosProto sourceDnInfos = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto getSourceDnInfos();
    /**
     * <code>required .hadoop.hdfs.DatanodeInfosProto sourceDnInfos = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProtoOrBuilder getSourceDnInfosOrBuilder();

    /**
     * <code>required .hadoop.hdfs.DatanodeInfosProto targetDnInfos = 3;</code>
     */
    boolean hasTargetDnInfos();
    /**
     * <code>required .hadoop.hdfs.DatanodeInfosProto targetDnInfos = 3;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto getTargetDnInfos();
    /**
     * <code>required .hadoop.hdfs.DatanodeInfosProto targetDnInfos = 3;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProtoOrBuilder getTargetDnInfosOrBuilder();

    /**
     * <code>required .hadoop.hdfs.StorageUuidsProto targetStorageUuids = 4;</code>
     */
    boolean hasTargetStorageUuids();
    /**
     * <code>required .hadoop.hdfs.StorageUuidsProto targetStorageUuids = 4;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageUuidsProto getTargetStorageUuids();
    /**
     * <code>required .hadoop.hdfs.StorageUuidsProto targetStorageUuids = 4;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageUuidsProtoOrBuilder getTargetStorageUuidsOrBuilder();

    /**
     * <code>required .hadoop.hdfs.StorageTypesProto targetStorageTypes = 5;</code>
     */
    boolean hasTargetStorageTypes();
    /**
     * <code>required .hadoop.hdfs.StorageTypesProto targetStorageTypes = 5;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypesProto getTargetStorageTypes();
    /**
     * <code>required .hadoop.hdfs.StorageTypesProto targetStorageTypes = 5;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypesProtoOrBuilder getTargetStorageTypesOrBuilder();

    /**
     * <code>required bytes liveBlockIndices = 6;</code>
     */
    boolean hasLiveBlockIndices();
    /**
     * <code>required bytes liveBlockIndices = 6;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString getLiveBlockIndices();

    /**
     * <code>required .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 7;</code>
     */
    boolean hasEcPolicy();
    /**
     * <code>required .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 7;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto getEcPolicy();
    /**
     * <code>required .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 7;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProtoOrBuilder getEcPolicyOrBuilder();
  }
  /**
   * <pre>
   **
   * Block erasure coding reconstruction info
   * </pre>
   *
   * Protobuf type {@code hadoop.hdfs.BlockECReconstructionInfoProto}
   */
  public  static final class BlockECReconstructionInfoProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.BlockECReconstructionInfoProto)
      BlockECReconstructionInfoProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BlockECReconstructionInfoProto.newBuilder() to construct.
    private BlockECReconstructionInfoProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BlockECReconstructionInfoProto() {
      liveBlockIndices_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BlockECReconstructionInfoProto(
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
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = block_.toBuilder();
              }
              block_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(block_);
                block_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) != 0)) {
                subBuilder = sourceDnInfos_.toBuilder();
              }
              sourceDnInfos_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(sourceDnInfos_);
                sourceDnInfos_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
            case 26: {
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) != 0)) {
                subBuilder = targetDnInfos_.toBuilder();
              }
              targetDnInfos_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(targetDnInfos_);
                targetDnInfos_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
            case 34: {
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageUuidsProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000008) != 0)) {
                subBuilder = targetStorageUuids_.toBuilder();
              }
              targetStorageUuids_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageUuidsProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(targetStorageUuids_);
                targetStorageUuids_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000008;
              break;
            }
            case 42: {
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypesProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000010) != 0)) {
                subBuilder = targetStorageTypes_.toBuilder();
              }
              targetStorageTypes_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypesProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(targetStorageTypes_);
                targetStorageTypes_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000010;
              break;
            }
            case 50: {
              bitField0_ |= 0x00000020;
              liveBlockIndices_ = input.readBytes();
              break;
            }
            case 58: {
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000040) != 0)) {
                subBuilder = ecPolicy_.toBuilder();
              }
              ecPolicy_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(ecPolicy_);
                ecPolicy_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000040;
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
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_BlockECReconstructionInfoProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_BlockECReconstructionInfoProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto.Builder.class);
    }

    private int bitField0_;
    public static final int BLOCK_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto block_;
    /**
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     */
    public boolean hasBlock() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto getBlock() {
      return block_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.getDefaultInstance() : block_;
    }
    /**
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProtoOrBuilder getBlockOrBuilder() {
      return block_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.getDefaultInstance() : block_;
    }

    public static final int SOURCEDNINFOS_FIELD_NUMBER = 2;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto sourceDnInfos_;
    /**
     * <code>required .hadoop.hdfs.DatanodeInfosProto sourceDnInfos = 2;</code>
     */
    public boolean hasSourceDnInfos() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required .hadoop.hdfs.DatanodeInfosProto sourceDnInfos = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto getSourceDnInfos() {
      return sourceDnInfos_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto.getDefaultInstance() : sourceDnInfos_;
    }
    /**
     * <code>required .hadoop.hdfs.DatanodeInfosProto sourceDnInfos = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProtoOrBuilder getSourceDnInfosOrBuilder() {
      return sourceDnInfos_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto.getDefaultInstance() : sourceDnInfos_;
    }

    public static final int TARGETDNINFOS_FIELD_NUMBER = 3;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto targetDnInfos_;
    /**
     * <code>required .hadoop.hdfs.DatanodeInfosProto targetDnInfos = 3;</code>
     */
    public boolean hasTargetDnInfos() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required .hadoop.hdfs.DatanodeInfosProto targetDnInfos = 3;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto getTargetDnInfos() {
      return targetDnInfos_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto.getDefaultInstance() : targetDnInfos_;
    }
    /**
     * <code>required .hadoop.hdfs.DatanodeInfosProto targetDnInfos = 3;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProtoOrBuilder getTargetDnInfosOrBuilder() {
      return targetDnInfos_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto.getDefaultInstance() : targetDnInfos_;
    }

    public static final int TARGETSTORAGEUUIDS_FIELD_NUMBER = 4;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageUuidsProto targetStorageUuids_;
    /**
     * <code>required .hadoop.hdfs.StorageUuidsProto targetStorageUuids = 4;</code>
     */
    public boolean hasTargetStorageUuids() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>required .hadoop.hdfs.StorageUuidsProto targetStorageUuids = 4;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageUuidsProto getTargetStorageUuids() {
      return targetStorageUuids_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageUuidsProto.getDefaultInstance() : targetStorageUuids_;
    }
    /**
     * <code>required .hadoop.hdfs.StorageUuidsProto targetStorageUuids = 4;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageUuidsProtoOrBuilder getTargetStorageUuidsOrBuilder() {
      return targetStorageUuids_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageUuidsProto.getDefaultInstance() : targetStorageUuids_;
    }

    public static final int TARGETSTORAGETYPES_FIELD_NUMBER = 5;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypesProto targetStorageTypes_;
    /**
     * <code>required .hadoop.hdfs.StorageTypesProto targetStorageTypes = 5;</code>
     */
    public boolean hasTargetStorageTypes() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>required .hadoop.hdfs.StorageTypesProto targetStorageTypes = 5;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypesProto getTargetStorageTypes() {
      return targetStorageTypes_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypesProto.getDefaultInstance() : targetStorageTypes_;
    }
    /**
     * <code>required .hadoop.hdfs.StorageTypesProto targetStorageTypes = 5;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypesProtoOrBuilder getTargetStorageTypesOrBuilder() {
      return targetStorageTypes_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypesProto.getDefaultInstance() : targetStorageTypes_;
    }

    public static final int LIVEBLOCKINDICES_FIELD_NUMBER = 6;
    private org.apache.hadoop.thirdparty.protobuf.ByteString liveBlockIndices_;
    /**
     * <code>required bytes liveBlockIndices = 6;</code>
     */
    public boolean hasLiveBlockIndices() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <code>required bytes liveBlockIndices = 6;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString getLiveBlockIndices() {
      return liveBlockIndices_;
    }

    public static final int ECPOLICY_FIELD_NUMBER = 7;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto ecPolicy_;
    /**
     * <code>required .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 7;</code>
     */
    public boolean hasEcPolicy() {
      return ((bitField0_ & 0x00000040) != 0);
    }
    /**
     * <code>required .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 7;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto getEcPolicy() {
      return ecPolicy_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.getDefaultInstance() : ecPolicy_;
    }
    /**
     * <code>required .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 7;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProtoOrBuilder getEcPolicyOrBuilder() {
      return ecPolicy_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.getDefaultInstance() : ecPolicy_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasBlock()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSourceDnInfos()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTargetDnInfos()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTargetStorageUuids()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTargetStorageTypes()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLiveBlockIndices()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasEcPolicy()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getBlock().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getSourceDnInfos().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getTargetDnInfos().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getEcPolicy().isInitialized()) {
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
        output.writeMessage(1, getBlock());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeMessage(2, getSourceDnInfos());
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeMessage(3, getTargetDnInfos());
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeMessage(4, getTargetStorageUuids());
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        output.writeMessage(5, getTargetStorageTypes());
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        output.writeBytes(6, liveBlockIndices_);
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        output.writeMessage(7, getEcPolicy());
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
          .computeMessageSize(1, getBlock());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(2, getSourceDnInfos());
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(3, getTargetDnInfos());
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(4, getTargetStorageUuids());
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(5, getTargetStorageTypes());
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeBytesSize(6, liveBlockIndices_);
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(7, getEcPolicy());
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto other = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto) obj;

      if (hasBlock() != other.hasBlock()) return false;
      if (hasBlock()) {
        if (!getBlock()
            .equals(other.getBlock())) return false;
      }
      if (hasSourceDnInfos() != other.hasSourceDnInfos()) return false;
      if (hasSourceDnInfos()) {
        if (!getSourceDnInfos()
            .equals(other.getSourceDnInfos())) return false;
      }
      if (hasTargetDnInfos() != other.hasTargetDnInfos()) return false;
      if (hasTargetDnInfos()) {
        if (!getTargetDnInfos()
            .equals(other.getTargetDnInfos())) return false;
      }
      if (hasTargetStorageUuids() != other.hasTargetStorageUuids()) return false;
      if (hasTargetStorageUuids()) {
        if (!getTargetStorageUuids()
            .equals(other.getTargetStorageUuids())) return false;
      }
      if (hasTargetStorageTypes() != other.hasTargetStorageTypes()) return false;
      if (hasTargetStorageTypes()) {
        if (!getTargetStorageTypes()
            .equals(other.getTargetStorageTypes())) return false;
      }
      if (hasLiveBlockIndices() != other.hasLiveBlockIndices()) return false;
      if (hasLiveBlockIndices()) {
        if (!getLiveBlockIndices()
            .equals(other.getLiveBlockIndices())) return false;
      }
      if (hasEcPolicy() != other.hasEcPolicy()) return false;
      if (hasEcPolicy()) {
        if (!getEcPolicy()
            .equals(other.getEcPolicy())) return false;
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
      if (hasBlock()) {
        hash = (37 * hash) + BLOCK_FIELD_NUMBER;
        hash = (53 * hash) + getBlock().hashCode();
      }
      if (hasSourceDnInfos()) {
        hash = (37 * hash) + SOURCEDNINFOS_FIELD_NUMBER;
        hash = (53 * hash) + getSourceDnInfos().hashCode();
      }
      if (hasTargetDnInfos()) {
        hash = (37 * hash) + TARGETDNINFOS_FIELD_NUMBER;
        hash = (53 * hash) + getTargetDnInfos().hashCode();
      }
      if (hasTargetStorageUuids()) {
        hash = (37 * hash) + TARGETSTORAGEUUIDS_FIELD_NUMBER;
        hash = (53 * hash) + getTargetStorageUuids().hashCode();
      }
      if (hasTargetStorageTypes()) {
        hash = (37 * hash) + TARGETSTORAGETYPES_FIELD_NUMBER;
        hash = (53 * hash) + getTargetStorageTypes().hashCode();
      }
      if (hasLiveBlockIndices()) {
        hash = (37 * hash) + LIVEBLOCKINDICES_FIELD_NUMBER;
        hash = (53 * hash) + getLiveBlockIndices().hashCode();
      }
      if (hasEcPolicy()) {
        hash = (37 * hash) + ECPOLICY_FIELD_NUMBER;
        hash = (53 * hash) + getEcPolicy().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto prototype) {
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
     * Block erasure coding reconstruction info
     * </pre>
     *
     * Protobuf type {@code hadoop.hdfs.BlockECReconstructionInfoProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.BlockECReconstructionInfoProto)
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_BlockECReconstructionInfoProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_BlockECReconstructionInfoProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto.newBuilder()
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
          getBlockFieldBuilder();
          getSourceDnInfosFieldBuilder();
          getTargetDnInfosFieldBuilder();
          getTargetStorageUuidsFieldBuilder();
          getTargetStorageTypesFieldBuilder();
          getEcPolicyFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (blockBuilder_ == null) {
          block_ = null;
        } else {
          blockBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (sourceDnInfosBuilder_ == null) {
          sourceDnInfos_ = null;
        } else {
          sourceDnInfosBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (targetDnInfosBuilder_ == null) {
          targetDnInfos_ = null;
        } else {
          targetDnInfosBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        if (targetStorageUuidsBuilder_ == null) {
          targetStorageUuids_ = null;
        } else {
          targetStorageUuidsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        if (targetStorageTypesBuilder_ == null) {
          targetStorageTypes_ = null;
        } else {
          targetStorageTypesBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        liveBlockIndices_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000020);
        if (ecPolicyBuilder_ == null) {
          ecPolicy_ = null;
        } else {
          ecPolicyBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_BlockECReconstructionInfoProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto result = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (blockBuilder_ == null) {
            result.block_ = block_;
          } else {
            result.block_ = blockBuilder_.build();
          }
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          if (sourceDnInfosBuilder_ == null) {
            result.sourceDnInfos_ = sourceDnInfos_;
          } else {
            result.sourceDnInfos_ = sourceDnInfosBuilder_.build();
          }
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          if (targetDnInfosBuilder_ == null) {
            result.targetDnInfos_ = targetDnInfos_;
          } else {
            result.targetDnInfos_ = targetDnInfosBuilder_.build();
          }
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          if (targetStorageUuidsBuilder_ == null) {
            result.targetStorageUuids_ = targetStorageUuids_;
          } else {
            result.targetStorageUuids_ = targetStorageUuidsBuilder_.build();
          }
          to_bitField0_ |= 0x00000008;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          if (targetStorageTypesBuilder_ == null) {
            result.targetStorageTypes_ = targetStorageTypes_;
          } else {
            result.targetStorageTypes_ = targetStorageTypesBuilder_.build();
          }
          to_bitField0_ |= 0x00000010;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          to_bitField0_ |= 0x00000020;
        }
        result.liveBlockIndices_ = liveBlockIndices_;
        if (((from_bitField0_ & 0x00000040) != 0)) {
          if (ecPolicyBuilder_ == null) {
            result.ecPolicy_ = ecPolicy_;
          } else {
            result.ecPolicy_ = ecPolicyBuilder_.build();
          }
          to_bitField0_ |= 0x00000040;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto.getDefaultInstance()) return this;
        if (other.hasBlock()) {
          mergeBlock(other.getBlock());
        }
        if (other.hasSourceDnInfos()) {
          mergeSourceDnInfos(other.getSourceDnInfos());
        }
        if (other.hasTargetDnInfos()) {
          mergeTargetDnInfos(other.getTargetDnInfos());
        }
        if (other.hasTargetStorageUuids()) {
          mergeTargetStorageUuids(other.getTargetStorageUuids());
        }
        if (other.hasTargetStorageTypes()) {
          mergeTargetStorageTypes(other.getTargetStorageTypes());
        }
        if (other.hasLiveBlockIndices()) {
          setLiveBlockIndices(other.getLiveBlockIndices());
        }
        if (other.hasEcPolicy()) {
          mergeEcPolicy(other.getEcPolicy());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasBlock()) {
          return false;
        }
        if (!hasSourceDnInfos()) {
          return false;
        }
        if (!hasTargetDnInfos()) {
          return false;
        }
        if (!hasTargetStorageUuids()) {
          return false;
        }
        if (!hasTargetStorageTypes()) {
          return false;
        }
        if (!hasLiveBlockIndices()) {
          return false;
        }
        if (!hasEcPolicy()) {
          return false;
        }
        if (!getBlock().isInitialized()) {
          return false;
        }
        if (!getSourceDnInfos().isInitialized()) {
          return false;
        }
        if (!getTargetDnInfos().isInitialized()) {
          return false;
        }
        if (!getEcPolicy().isInitialized()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto block_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProtoOrBuilder> blockBuilder_;
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public boolean hasBlock() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto getBlock() {
        if (blockBuilder_ == null) {
          return block_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.getDefaultInstance() : block_;
        } else {
          return blockBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public Builder setBlock(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto value) {
        if (blockBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          block_ = value;
          onChanged();
        } else {
          blockBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public Builder setBlock(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.Builder builderForValue) {
        if (blockBuilder_ == null) {
          block_ = builderForValue.build();
          onChanged();
        } else {
          blockBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public Builder mergeBlock(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto value) {
        if (blockBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              block_ != null &&
              block_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.getDefaultInstance()) {
            block_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.newBuilder(block_).mergeFrom(value).buildPartial();
          } else {
            block_ = value;
          }
          onChanged();
        } else {
          blockBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public Builder clearBlock() {
        if (blockBuilder_ == null) {
          block_ = null;
          onChanged();
        } else {
          blockBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.Builder getBlockBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getBlockFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProtoOrBuilder getBlockOrBuilder() {
        if (blockBuilder_ != null) {
          return blockBuilder_.getMessageOrBuilder();
        } else {
          return block_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.getDefaultInstance() : block_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProtoOrBuilder> 
          getBlockFieldBuilder() {
        if (blockBuilder_ == null) {
          blockBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProtoOrBuilder>(
                  getBlock(),
                  getParentForChildren(),
                  isClean());
          block_ = null;
        }
        return blockBuilder_;
      }

      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto sourceDnInfos_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProtoOrBuilder> sourceDnInfosBuilder_;
      /**
       * <code>required .hadoop.hdfs.DatanodeInfosProto sourceDnInfos = 2;</code>
       */
      public boolean hasSourceDnInfos() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeInfosProto sourceDnInfos = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto getSourceDnInfos() {
        if (sourceDnInfosBuilder_ == null) {
          return sourceDnInfos_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto.getDefaultInstance() : sourceDnInfos_;
        } else {
          return sourceDnInfosBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeInfosProto sourceDnInfos = 2;</code>
       */
      public Builder setSourceDnInfos(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto value) {
        if (sourceDnInfosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          sourceDnInfos_ = value;
          onChanged();
        } else {
          sourceDnInfosBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeInfosProto sourceDnInfos = 2;</code>
       */
      public Builder setSourceDnInfos(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto.Builder builderForValue) {
        if (sourceDnInfosBuilder_ == null) {
          sourceDnInfos_ = builderForValue.build();
          onChanged();
        } else {
          sourceDnInfosBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeInfosProto sourceDnInfos = 2;</code>
       */
      public Builder mergeSourceDnInfos(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto value) {
        if (sourceDnInfosBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
              sourceDnInfos_ != null &&
              sourceDnInfos_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto.getDefaultInstance()) {
            sourceDnInfos_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto.newBuilder(sourceDnInfos_).mergeFrom(value).buildPartial();
          } else {
            sourceDnInfos_ = value;
          }
          onChanged();
        } else {
          sourceDnInfosBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeInfosProto sourceDnInfos = 2;</code>
       */
      public Builder clearSourceDnInfos() {
        if (sourceDnInfosBuilder_ == null) {
          sourceDnInfos_ = null;
          onChanged();
        } else {
          sourceDnInfosBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeInfosProto sourceDnInfos = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto.Builder getSourceDnInfosBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSourceDnInfosFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeInfosProto sourceDnInfos = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProtoOrBuilder getSourceDnInfosOrBuilder() {
        if (sourceDnInfosBuilder_ != null) {
          return sourceDnInfosBuilder_.getMessageOrBuilder();
        } else {
          return sourceDnInfos_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto.getDefaultInstance() : sourceDnInfos_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeInfosProto sourceDnInfos = 2;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProtoOrBuilder> 
          getSourceDnInfosFieldBuilder() {
        if (sourceDnInfosBuilder_ == null) {
          sourceDnInfosBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProtoOrBuilder>(
                  getSourceDnInfos(),
                  getParentForChildren(),
                  isClean());
          sourceDnInfos_ = null;
        }
        return sourceDnInfosBuilder_;
      }

      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto targetDnInfos_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProtoOrBuilder> targetDnInfosBuilder_;
      /**
       * <code>required .hadoop.hdfs.DatanodeInfosProto targetDnInfos = 3;</code>
       */
      public boolean hasTargetDnInfos() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeInfosProto targetDnInfos = 3;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto getTargetDnInfos() {
        if (targetDnInfosBuilder_ == null) {
          return targetDnInfos_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto.getDefaultInstance() : targetDnInfos_;
        } else {
          return targetDnInfosBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeInfosProto targetDnInfos = 3;</code>
       */
      public Builder setTargetDnInfos(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto value) {
        if (targetDnInfosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          targetDnInfos_ = value;
          onChanged();
        } else {
          targetDnInfosBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeInfosProto targetDnInfos = 3;</code>
       */
      public Builder setTargetDnInfos(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto.Builder builderForValue) {
        if (targetDnInfosBuilder_ == null) {
          targetDnInfos_ = builderForValue.build();
          onChanged();
        } else {
          targetDnInfosBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeInfosProto targetDnInfos = 3;</code>
       */
      public Builder mergeTargetDnInfos(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto value) {
        if (targetDnInfosBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0) &&
              targetDnInfos_ != null &&
              targetDnInfos_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto.getDefaultInstance()) {
            targetDnInfos_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto.newBuilder(targetDnInfos_).mergeFrom(value).buildPartial();
          } else {
            targetDnInfos_ = value;
          }
          onChanged();
        } else {
          targetDnInfosBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeInfosProto targetDnInfos = 3;</code>
       */
      public Builder clearTargetDnInfos() {
        if (targetDnInfosBuilder_ == null) {
          targetDnInfos_ = null;
          onChanged();
        } else {
          targetDnInfosBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeInfosProto targetDnInfos = 3;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto.Builder getTargetDnInfosBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getTargetDnInfosFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeInfosProto targetDnInfos = 3;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProtoOrBuilder getTargetDnInfosOrBuilder() {
        if (targetDnInfosBuilder_ != null) {
          return targetDnInfosBuilder_.getMessageOrBuilder();
        } else {
          return targetDnInfos_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto.getDefaultInstance() : targetDnInfos_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeInfosProto targetDnInfos = 3;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProtoOrBuilder> 
          getTargetDnInfosFieldBuilder() {
        if (targetDnInfosBuilder_ == null) {
          targetDnInfosBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfosProtoOrBuilder>(
                  getTargetDnInfos(),
                  getParentForChildren(),
                  isClean());
          targetDnInfos_ = null;
        }
        return targetDnInfosBuilder_;
      }

      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageUuidsProto targetStorageUuids_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageUuidsProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageUuidsProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageUuidsProtoOrBuilder> targetStorageUuidsBuilder_;
      /**
       * <code>required .hadoop.hdfs.StorageUuidsProto targetStorageUuids = 4;</code>
       */
      public boolean hasTargetStorageUuids() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>required .hadoop.hdfs.StorageUuidsProto targetStorageUuids = 4;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageUuidsProto getTargetStorageUuids() {
        if (targetStorageUuidsBuilder_ == null) {
          return targetStorageUuids_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageUuidsProto.getDefaultInstance() : targetStorageUuids_;
        } else {
          return targetStorageUuidsBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.StorageUuidsProto targetStorageUuids = 4;</code>
       */
      public Builder setTargetStorageUuids(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageUuidsProto value) {
        if (targetStorageUuidsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          targetStorageUuids_ = value;
          onChanged();
        } else {
          targetStorageUuidsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.StorageUuidsProto targetStorageUuids = 4;</code>
       */
      public Builder setTargetStorageUuids(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageUuidsProto.Builder builderForValue) {
        if (targetStorageUuidsBuilder_ == null) {
          targetStorageUuids_ = builderForValue.build();
          onChanged();
        } else {
          targetStorageUuidsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.StorageUuidsProto targetStorageUuids = 4;</code>
       */
      public Builder mergeTargetStorageUuids(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageUuidsProto value) {
        if (targetStorageUuidsBuilder_ == null) {
          if (((bitField0_ & 0x00000008) != 0) &&
              targetStorageUuids_ != null &&
              targetStorageUuids_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageUuidsProto.getDefaultInstance()) {
            targetStorageUuids_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageUuidsProto.newBuilder(targetStorageUuids_).mergeFrom(value).buildPartial();
          } else {
            targetStorageUuids_ = value;
          }
          onChanged();
        } else {
          targetStorageUuidsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.StorageUuidsProto targetStorageUuids = 4;</code>
       */
      public Builder clearTargetStorageUuids() {
        if (targetStorageUuidsBuilder_ == null) {
          targetStorageUuids_ = null;
          onChanged();
        } else {
          targetStorageUuidsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.StorageUuidsProto targetStorageUuids = 4;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageUuidsProto.Builder getTargetStorageUuidsBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getTargetStorageUuidsFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.StorageUuidsProto targetStorageUuids = 4;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageUuidsProtoOrBuilder getTargetStorageUuidsOrBuilder() {
        if (targetStorageUuidsBuilder_ != null) {
          return targetStorageUuidsBuilder_.getMessageOrBuilder();
        } else {
          return targetStorageUuids_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageUuidsProto.getDefaultInstance() : targetStorageUuids_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.StorageUuidsProto targetStorageUuids = 4;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageUuidsProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageUuidsProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageUuidsProtoOrBuilder> 
          getTargetStorageUuidsFieldBuilder() {
        if (targetStorageUuidsBuilder_ == null) {
          targetStorageUuidsBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageUuidsProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageUuidsProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageUuidsProtoOrBuilder>(
                  getTargetStorageUuids(),
                  getParentForChildren(),
                  isClean());
          targetStorageUuids_ = null;
        }
        return targetStorageUuidsBuilder_;
      }

      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypesProto targetStorageTypes_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypesProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypesProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypesProtoOrBuilder> targetStorageTypesBuilder_;
      /**
       * <code>required .hadoop.hdfs.StorageTypesProto targetStorageTypes = 5;</code>
       */
      public boolean hasTargetStorageTypes() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <code>required .hadoop.hdfs.StorageTypesProto targetStorageTypes = 5;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypesProto getTargetStorageTypes() {
        if (targetStorageTypesBuilder_ == null) {
          return targetStorageTypes_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypesProto.getDefaultInstance() : targetStorageTypes_;
        } else {
          return targetStorageTypesBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.StorageTypesProto targetStorageTypes = 5;</code>
       */
      public Builder setTargetStorageTypes(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypesProto value) {
        if (targetStorageTypesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          targetStorageTypes_ = value;
          onChanged();
        } else {
          targetStorageTypesBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.StorageTypesProto targetStorageTypes = 5;</code>
       */
      public Builder setTargetStorageTypes(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypesProto.Builder builderForValue) {
        if (targetStorageTypesBuilder_ == null) {
          targetStorageTypes_ = builderForValue.build();
          onChanged();
        } else {
          targetStorageTypesBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.StorageTypesProto targetStorageTypes = 5;</code>
       */
      public Builder mergeTargetStorageTypes(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypesProto value) {
        if (targetStorageTypesBuilder_ == null) {
          if (((bitField0_ & 0x00000010) != 0) &&
              targetStorageTypes_ != null &&
              targetStorageTypes_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypesProto.getDefaultInstance()) {
            targetStorageTypes_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypesProto.newBuilder(targetStorageTypes_).mergeFrom(value).buildPartial();
          } else {
            targetStorageTypes_ = value;
          }
          onChanged();
        } else {
          targetStorageTypesBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.StorageTypesProto targetStorageTypes = 5;</code>
       */
      public Builder clearTargetStorageTypes() {
        if (targetStorageTypesBuilder_ == null) {
          targetStorageTypes_ = null;
          onChanged();
        } else {
          targetStorageTypesBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.StorageTypesProto targetStorageTypes = 5;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypesProto.Builder getTargetStorageTypesBuilder() {
        bitField0_ |= 0x00000010;
        onChanged();
        return getTargetStorageTypesFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.StorageTypesProto targetStorageTypes = 5;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypesProtoOrBuilder getTargetStorageTypesOrBuilder() {
        if (targetStorageTypesBuilder_ != null) {
          return targetStorageTypesBuilder_.getMessageOrBuilder();
        } else {
          return targetStorageTypes_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypesProto.getDefaultInstance() : targetStorageTypes_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.StorageTypesProto targetStorageTypes = 5;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypesProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypesProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypesProtoOrBuilder> 
          getTargetStorageTypesFieldBuilder() {
        if (targetStorageTypesBuilder_ == null) {
          targetStorageTypesBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypesProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypesProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypesProtoOrBuilder>(
                  getTargetStorageTypes(),
                  getParentForChildren(),
                  isClean());
          targetStorageTypes_ = null;
        }
        return targetStorageTypesBuilder_;
      }

      private org.apache.hadoop.thirdparty.protobuf.ByteString liveBlockIndices_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
      /**
       * <code>required bytes liveBlockIndices = 6;</code>
       */
      public boolean hasLiveBlockIndices() {
        return ((bitField0_ & 0x00000020) != 0);
      }
      /**
       * <code>required bytes liveBlockIndices = 6;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString getLiveBlockIndices() {
        return liveBlockIndices_;
      }
      /**
       * <code>required bytes liveBlockIndices = 6;</code>
       */
      public Builder setLiveBlockIndices(org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        liveBlockIndices_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bytes liveBlockIndices = 6;</code>
       */
      public Builder clearLiveBlockIndices() {
        bitField0_ = (bitField0_ & ~0x00000020);
        liveBlockIndices_ = getDefaultInstance().getLiveBlockIndices();
        onChanged();
        return this;
      }

      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto ecPolicy_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProtoOrBuilder> ecPolicyBuilder_;
      /**
       * <code>required .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 7;</code>
       */
      public boolean hasEcPolicy() {
        return ((bitField0_ & 0x00000040) != 0);
      }
      /**
       * <code>required .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 7;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto getEcPolicy() {
        if (ecPolicyBuilder_ == null) {
          return ecPolicy_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.getDefaultInstance() : ecPolicy_;
        } else {
          return ecPolicyBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 7;</code>
       */
      public Builder setEcPolicy(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto value) {
        if (ecPolicyBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ecPolicy_ = value;
          onChanged();
        } else {
          ecPolicyBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000040;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 7;</code>
       */
      public Builder setEcPolicy(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder builderForValue) {
        if (ecPolicyBuilder_ == null) {
          ecPolicy_ = builderForValue.build();
          onChanged();
        } else {
          ecPolicyBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000040;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 7;</code>
       */
      public Builder mergeEcPolicy(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto value) {
        if (ecPolicyBuilder_ == null) {
          if (((bitField0_ & 0x00000040) != 0) &&
              ecPolicy_ != null &&
              ecPolicy_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.getDefaultInstance()) {
            ecPolicy_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.newBuilder(ecPolicy_).mergeFrom(value).buildPartial();
          } else {
            ecPolicy_ = value;
          }
          onChanged();
        } else {
          ecPolicyBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000040;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 7;</code>
       */
      public Builder clearEcPolicy() {
        if (ecPolicyBuilder_ == null) {
          ecPolicy_ = null;
          onChanged();
        } else {
          ecPolicyBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 7;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder getEcPolicyBuilder() {
        bitField0_ |= 0x00000040;
        onChanged();
        return getEcPolicyFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 7;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProtoOrBuilder getEcPolicyOrBuilder() {
        if (ecPolicyBuilder_ != null) {
          return ecPolicyBuilder_.getMessageOrBuilder();
        } else {
          return ecPolicy_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.getDefaultInstance() : ecPolicy_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 7;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProtoOrBuilder> 
          getEcPolicyFieldBuilder() {
        if (ecPolicyBuilder_ == null) {
          ecPolicyBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProtoOrBuilder>(
                  getEcPolicy(),
                  getParentForChildren(),
                  isClean());
          ecPolicy_ = null;
        }
        return ecPolicyBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.BlockECReconstructionInfoProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.BlockECReconstructionInfoProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<BlockECReconstructionInfoProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<BlockECReconstructionInfoProto>() {
      @java.lang.Override
      public BlockECReconstructionInfoProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new BlockECReconstructionInfoProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<BlockECReconstructionInfoProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<BlockECReconstructionInfoProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.BlockECReconstructionInfoProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CodecProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.CodecProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required string codec = 1;</code>
     */
    boolean hasCodec();
    /**
     * <code>required string codec = 1;</code>
     */
    java.lang.String getCodec();
    /**
     * <code>required string codec = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getCodecBytes();

    /**
     * <code>required string coders = 2;</code>
     */
    boolean hasCoders();
    /**
     * <code>required string coders = 2;</code>
     */
    java.lang.String getCoders();
    /**
     * <code>required string coders = 2;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getCodersBytes();
  }
  /**
   * <pre>
   **
   * Codec and it's corresponding coders
   * </pre>
   *
   * Protobuf type {@code hadoop.hdfs.CodecProto}
   */
  public  static final class CodecProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.CodecProto)
      CodecProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CodecProto.newBuilder() to construct.
    private CodecProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CodecProto() {
      codec_ = "";
      coders_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CodecProto(
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
              codec_ = bs;
              break;
            }
            case 18: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              coders_ = bs;
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
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_CodecProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_CodecProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto.Builder.class);
    }

    private int bitField0_;
    public static final int CODEC_FIELD_NUMBER = 1;
    private volatile java.lang.Object codec_;
    /**
     * <code>required string codec = 1;</code>
     */
    public boolean hasCodec() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string codec = 1;</code>
     */
    public java.lang.String getCodec() {
      java.lang.Object ref = codec_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          codec_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string codec = 1;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getCodecBytes() {
      java.lang.Object ref = codec_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        codec_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int CODERS_FIELD_NUMBER = 2;
    private volatile java.lang.Object coders_;
    /**
     * <code>required string coders = 2;</code>
     */
    public boolean hasCoders() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required string coders = 2;</code>
     */
    public java.lang.String getCoders() {
      java.lang.Object ref = coders_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          coders_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string coders = 2;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getCodersBytes() {
      java.lang.Object ref = coders_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        coders_ = b;
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

      if (!hasCodec()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCoders()) {
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, codec_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 2, coders_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, codec_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(2, coders_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto other = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto) obj;

      if (hasCodec() != other.hasCodec()) return false;
      if (hasCodec()) {
        if (!getCodec()
            .equals(other.getCodec())) return false;
      }
      if (hasCoders() != other.hasCoders()) return false;
      if (hasCoders()) {
        if (!getCoders()
            .equals(other.getCoders())) return false;
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
      if (hasCodec()) {
        hash = (37 * hash) + CODEC_FIELD_NUMBER;
        hash = (53 * hash) + getCodec().hashCode();
      }
      if (hasCoders()) {
        hash = (37 * hash) + CODERS_FIELD_NUMBER;
        hash = (53 * hash) + getCoders().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto prototype) {
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
     * Codec and it's corresponding coders
     * </pre>
     *
     * Protobuf type {@code hadoop.hdfs.CodecProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.CodecProto)
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_CodecProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_CodecProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto.class, org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto.newBuilder()
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
        codec_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        coders_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.internal_static_hadoop_hdfs_CodecProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto result = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.codec_ = codec_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.coders_ = coders_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto.getDefaultInstance()) return this;
        if (other.hasCodec()) {
          bitField0_ |= 0x00000001;
          codec_ = other.codec_;
          onChanged();
        }
        if (other.hasCoders()) {
          bitField0_ |= 0x00000002;
          coders_ = other.coders_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasCodec()) {
          return false;
        }
        if (!hasCoders()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object codec_ = "";
      /**
       * <code>required string codec = 1;</code>
       */
      public boolean hasCodec() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string codec = 1;</code>
       */
      public java.lang.String getCodec() {
        java.lang.Object ref = codec_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            codec_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string codec = 1;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getCodecBytes() {
        java.lang.Object ref = codec_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          codec_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string codec = 1;</code>
       */
      public Builder setCodec(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        codec_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string codec = 1;</code>
       */
      public Builder clearCodec() {
        bitField0_ = (bitField0_ & ~0x00000001);
        codec_ = getDefaultInstance().getCodec();
        onChanged();
        return this;
      }
      /**
       * <code>required string codec = 1;</code>
       */
      public Builder setCodecBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        codec_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object coders_ = "";
      /**
       * <code>required string coders = 2;</code>
       */
      public boolean hasCoders() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required string coders = 2;</code>
       */
      public java.lang.String getCoders() {
        java.lang.Object ref = coders_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            coders_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string coders = 2;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getCodersBytes() {
        java.lang.Object ref = coders_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          coders_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string coders = 2;</code>
       */
      public Builder setCoders(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        coders_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string coders = 2;</code>
       */
      public Builder clearCoders() {
        bitField0_ = (bitField0_ & ~0x00000002);
        coders_ = getDefaultInstance().getCoders();
        onChanged();
        return this;
      }
      /**
       * <code>required string coders = 2;</code>
       */
      public Builder setCodersBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        coders_ = value;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.CodecProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.CodecProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<CodecProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<CodecProto>() {
      @java.lang.Override
      public CodecProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new CodecProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<CodecProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<CodecProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.ErasureCodingProtos.CodecProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_SetErasureCodingPolicyRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_SetErasureCodingPolicyRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_SetErasureCodingPolicyResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_SetErasureCodingPolicyResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetErasureCodingPoliciesRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_GetErasureCodingPoliciesRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetErasureCodingPoliciesResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_GetErasureCodingPoliciesResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetErasureCodingCodecsRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_GetErasureCodingCodecsRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetErasureCodingCodecsResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_GetErasureCodingCodecsResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetErasureCodingPolicyRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_GetErasureCodingPolicyRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetErasureCodingPolicyResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_GetErasureCodingPolicyResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_AddErasureCodingPoliciesRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_AddErasureCodingPoliciesRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_AddErasureCodingPoliciesResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_AddErasureCodingPoliciesResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_RemoveErasureCodingPolicyRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_RemoveErasureCodingPolicyRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_RemoveErasureCodingPolicyResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_RemoveErasureCodingPolicyResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_EnableErasureCodingPolicyRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_EnableErasureCodingPolicyRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_EnableErasureCodingPolicyResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_EnableErasureCodingPolicyResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_DisableErasureCodingPolicyRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_DisableErasureCodingPolicyRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_DisableErasureCodingPolicyResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_DisableErasureCodingPolicyResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_UnsetErasureCodingPolicyRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_UnsetErasureCodingPolicyRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_UnsetErasureCodingPolicyResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_UnsetErasureCodingPolicyResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetECTopologyResultForPoliciesRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_GetECTopologyResultForPoliciesRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetECTopologyResultForPoliciesResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_GetECTopologyResultForPoliciesResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_BlockECReconstructionInfoProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_BlockECReconstructionInfoProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_CodecProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_CodecProto_fieldAccessorTable;

  public static org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023erasurecoding.proto\022\013hadoop.hdfs\032\nhdfs" +
      ".proto\"G\n\"SetErasureCodingPolicyRequestP" +
      "roto\022\013\n\003src\030\001 \002(\t\022\024\n\014ecPolicyName\030\002 \001(\t\"" +
      "%\n#SetErasureCodingPolicyResponseProto\"&" +
      "\n$GetErasureCodingPoliciesRequestProto\"b" +
      "\n%GetErasureCodingPoliciesResponseProto\022" +
      "9\n\necPolicies\030\001 \003(\0132%.hadoop.hdfs.Erasur" +
      "eCodingPolicyProto\"$\n\"GetErasureCodingCo" +
      "decsRequestProto\"M\n#GetErasureCodingCode" +
      "csResponseProto\022&\n\005codec\030\001 \003(\0132\027.hadoop." +
      "hdfs.CodecProto\"1\n\"GetErasureCodingPolic" +
      "yRequestProto\022\013\n\003src\030\001 \002(\t\"^\n#GetErasure" +
      "CodingPolicyResponseProto\0227\n\010ecPolicy\030\001 " +
      "\001(\0132%.hadoop.hdfs.ErasureCodingPolicyPro" +
      "to\"a\n$AddErasureCodingPoliciesRequestPro" +
      "to\0229\n\necPolicies\030\001 \003(\0132%.hadoop.hdfs.Era" +
      "sureCodingPolicyProto\"l\n%AddErasureCodin" +
      "gPoliciesResponseProto\022C\n\tresponses\030\001 \003(" +
      "\01320.hadoop.hdfs.AddErasureCodingPolicyRe" +
      "sponseProto\"=\n%RemoveErasureCodingPolicy" +
      "RequestProto\022\024\n\014ecPolicyName\030\001 \002(\t\"(\n&Re" +
      "moveErasureCodingPolicyResponseProto\"=\n%" +
      "EnableErasureCodingPolicyRequestProto\022\024\n" +
      "\014ecPolicyName\030\001 \002(\t\"(\n&EnableErasureCodi" +
      "ngPolicyResponseProto\">\n&DisableErasureC" +
      "odingPolicyRequestProto\022\024\n\014ecPolicyName\030" +
      "\001 \002(\t\")\n\'DisableErasureCodingPolicyRespo" +
      "nseProto\"3\n$UnsetErasureCodingPolicyRequ" +
      "estProto\022\013\n\003src\030\001 \002(\t\"\'\n%UnsetErasureCod" +
      "ingPolicyResponseProto\">\n*GetECTopologyR" +
      "esultForPoliciesRequestProto\022\020\n\010policies" +
      "\030\001 \003(\t\"k\n+GetECTopologyResultForPolicies" +
      "ResponseProto\022<\n\010response\030\001 \002(\0132*.hadoop" +
      ".hdfs.ECTopologyVerifierResultProto\"\213\003\n\036" +
      "BlockECReconstructionInfoProto\022.\n\005block\030" +
      "\001 \002(\0132\037.hadoop.hdfs.ExtendedBlockProto\0226" +
      "\n\rsourceDnInfos\030\002 \002(\0132\037.hadoop.hdfs.Data" +
      "nodeInfosProto\0226\n\rtargetDnInfos\030\003 \002(\0132\037." +
      "hadoop.hdfs.DatanodeInfosProto\022:\n\022target" +
      "StorageUuids\030\004 \002(\0132\036.hadoop.hdfs.Storage" +
      "UuidsProto\022:\n\022targetStorageTypes\030\005 \002(\0132\036" +
      ".hadoop.hdfs.StorageTypesProto\022\030\n\020liveBl" +
      "ockIndices\030\006 \002(\014\0227\n\010ecPolicy\030\007 \002(\0132%.had" +
      "oop.hdfs.ErasureCodingPolicyProto\"+\n\nCod" +
      "ecProto\022\r\n\005codec\030\001 \002(\t\022\016\n\006coders\030\002 \002(\tB?" +
      "\n%org.apache.hadoop.hdfs.protocol.protoB" +
      "\023ErasureCodingProtos\240\001\001"
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
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.getDescriptor(),
        }, assigner);
    internal_static_hadoop_hdfs_SetErasureCodingPolicyRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hadoop_hdfs_SetErasureCodingPolicyRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_SetErasureCodingPolicyRequestProto_descriptor,
        new java.lang.String[] { "Src", "EcPolicyName", });
    internal_static_hadoop_hdfs_SetErasureCodingPolicyResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hadoop_hdfs_SetErasureCodingPolicyResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_SetErasureCodingPolicyResponseProto_descriptor,
        new java.lang.String[] { });
    internal_static_hadoop_hdfs_GetErasureCodingPoliciesRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_hadoop_hdfs_GetErasureCodingPoliciesRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_GetErasureCodingPoliciesRequestProto_descriptor,
        new java.lang.String[] { });
    internal_static_hadoop_hdfs_GetErasureCodingPoliciesResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_hadoop_hdfs_GetErasureCodingPoliciesResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_GetErasureCodingPoliciesResponseProto_descriptor,
        new java.lang.String[] { "EcPolicies", });
    internal_static_hadoop_hdfs_GetErasureCodingCodecsRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_hadoop_hdfs_GetErasureCodingCodecsRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_GetErasureCodingCodecsRequestProto_descriptor,
        new java.lang.String[] { });
    internal_static_hadoop_hdfs_GetErasureCodingCodecsResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_hadoop_hdfs_GetErasureCodingCodecsResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_GetErasureCodingCodecsResponseProto_descriptor,
        new java.lang.String[] { "Codec", });
    internal_static_hadoop_hdfs_GetErasureCodingPolicyRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_hadoop_hdfs_GetErasureCodingPolicyRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_GetErasureCodingPolicyRequestProto_descriptor,
        new java.lang.String[] { "Src", });
    internal_static_hadoop_hdfs_GetErasureCodingPolicyResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_hadoop_hdfs_GetErasureCodingPolicyResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_GetErasureCodingPolicyResponseProto_descriptor,
        new java.lang.String[] { "EcPolicy", });
    internal_static_hadoop_hdfs_AddErasureCodingPoliciesRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_hadoop_hdfs_AddErasureCodingPoliciesRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_AddErasureCodingPoliciesRequestProto_descriptor,
        new java.lang.String[] { "EcPolicies", });
    internal_static_hadoop_hdfs_AddErasureCodingPoliciesResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_hadoop_hdfs_AddErasureCodingPoliciesResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_AddErasureCodingPoliciesResponseProto_descriptor,
        new java.lang.String[] { "Responses", });
    internal_static_hadoop_hdfs_RemoveErasureCodingPolicyRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_hadoop_hdfs_RemoveErasureCodingPolicyRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_RemoveErasureCodingPolicyRequestProto_descriptor,
        new java.lang.String[] { "EcPolicyName", });
    internal_static_hadoop_hdfs_RemoveErasureCodingPolicyResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_hadoop_hdfs_RemoveErasureCodingPolicyResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_RemoveErasureCodingPolicyResponseProto_descriptor,
        new java.lang.String[] { });
    internal_static_hadoop_hdfs_EnableErasureCodingPolicyRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_hadoop_hdfs_EnableErasureCodingPolicyRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_EnableErasureCodingPolicyRequestProto_descriptor,
        new java.lang.String[] { "EcPolicyName", });
    internal_static_hadoop_hdfs_EnableErasureCodingPolicyResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_hadoop_hdfs_EnableErasureCodingPolicyResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_EnableErasureCodingPolicyResponseProto_descriptor,
        new java.lang.String[] { });
    internal_static_hadoop_hdfs_DisableErasureCodingPolicyRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_hadoop_hdfs_DisableErasureCodingPolicyRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_DisableErasureCodingPolicyRequestProto_descriptor,
        new java.lang.String[] { "EcPolicyName", });
    internal_static_hadoop_hdfs_DisableErasureCodingPolicyResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_hadoop_hdfs_DisableErasureCodingPolicyResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_DisableErasureCodingPolicyResponseProto_descriptor,
        new java.lang.String[] { });
    internal_static_hadoop_hdfs_UnsetErasureCodingPolicyRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_hadoop_hdfs_UnsetErasureCodingPolicyRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_UnsetErasureCodingPolicyRequestProto_descriptor,
        new java.lang.String[] { "Src", });
    internal_static_hadoop_hdfs_UnsetErasureCodingPolicyResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_hadoop_hdfs_UnsetErasureCodingPolicyResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_UnsetErasureCodingPolicyResponseProto_descriptor,
        new java.lang.String[] { });
    internal_static_hadoop_hdfs_GetECTopologyResultForPoliciesRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(18);
    internal_static_hadoop_hdfs_GetECTopologyResultForPoliciesRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_GetECTopologyResultForPoliciesRequestProto_descriptor,
        new java.lang.String[] { "Policies", });
    internal_static_hadoop_hdfs_GetECTopologyResultForPoliciesResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(19);
    internal_static_hadoop_hdfs_GetECTopologyResultForPoliciesResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_GetECTopologyResultForPoliciesResponseProto_descriptor,
        new java.lang.String[] { "Response", });
    internal_static_hadoop_hdfs_BlockECReconstructionInfoProto_descriptor =
      getDescriptor().getMessageTypes().get(20);
    internal_static_hadoop_hdfs_BlockECReconstructionInfoProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_BlockECReconstructionInfoProto_descriptor,
        new java.lang.String[] { "Block", "SourceDnInfos", "TargetDnInfos", "TargetStorageUuids", "TargetStorageTypes", "LiveBlockIndices", "EcPolicy", });
    internal_static_hadoop_hdfs_CodecProto_descriptor =
      getDescriptor().getMessageTypes().get(21);
    internal_static_hadoop_hdfs_CodecProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_CodecProto_descriptor,
        new java.lang.String[] { "Codec", "Coders", });
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
