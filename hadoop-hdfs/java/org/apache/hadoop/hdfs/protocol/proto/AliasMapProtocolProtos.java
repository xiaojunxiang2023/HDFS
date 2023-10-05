// source: AliasMapProtocol.proto

package org.apache.hadoop.hdfs.protocol.proto;

public final class AliasMapProtocolProtos {
  private AliasMapProtocolProtos() {}
  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite) registry);
  }
  public interface KeyValueProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.KeyValueProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>optional .hadoop.hdfs.BlockProto key = 1;</code>
     */
    boolean hasKey();
    /**
     * <code>optional .hadoop.hdfs.BlockProto key = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto getKey();
    /**
     * <code>optional .hadoop.hdfs.BlockProto key = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder getKeyOrBuilder();

    /**
     * <code>optional .hadoop.hdfs.ProvidedStorageLocationProto value = 2;</code>
     */
    boolean hasValue();
    /**
     * <code>optional .hadoop.hdfs.ProvidedStorageLocationProto value = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto getValue();
    /**
     * <code>optional .hadoop.hdfs.ProvidedStorageLocationProto value = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProtoOrBuilder getValueOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.KeyValueProto}
   */
  public  static final class KeyValueProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.KeyValueProto)
      KeyValueProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use KeyValueProto.newBuilder() to construct.
    private KeyValueProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private KeyValueProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private KeyValueProto(
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
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = key_.toBuilder();
              }
              key_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(key_);
                key_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) != 0)) {
                subBuilder = value_.toBuilder();
              }
              value_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(value_);
                value_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
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
      return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_KeyValueProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_KeyValueProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto.class, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto.Builder.class);
    }

    private int bitField0_;
    public static final int KEY_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto key_;
    /**
     * <code>optional .hadoop.hdfs.BlockProto key = 1;</code>
     */
    public boolean hasKey() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .hadoop.hdfs.BlockProto key = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto getKey() {
      return key_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance() : key_;
    }
    /**
     * <code>optional .hadoop.hdfs.BlockProto key = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder getKeyOrBuilder() {
      return key_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance() : key_;
    }

    public static final int VALUE_FIELD_NUMBER = 2;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto value_;
    /**
     * <code>optional .hadoop.hdfs.ProvidedStorageLocationProto value = 2;</code>
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .hadoop.hdfs.ProvidedStorageLocationProto value = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto getValue() {
      return value_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto.getDefaultInstance() : value_;
    }
    /**
     * <code>optional .hadoop.hdfs.ProvidedStorageLocationProto value = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProtoOrBuilder getValueOrBuilder() {
      return value_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto.getDefaultInstance() : value_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (hasKey()) {
        if (!getKey().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasValue()) {
        if (!getValue().isInitialized()) {
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
        output.writeMessage(1, getKey());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeMessage(2, getValue());
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
          .computeMessageSize(1, getKey());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(2, getValue());
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto other = (org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto) obj;

      if (hasKey() != other.hasKey()) return false;
      if (hasKey()) {
        if (!getKey()
            .equals(other.getKey())) return false;
      }
      if (hasValue() != other.hasValue()) return false;
      if (hasValue()) {
        if (!getValue()
            .equals(other.getValue())) return false;
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
      if (hasKey()) {
        hash = (37 * hash) + KEY_FIELD_NUMBER;
        hash = (53 * hash) + getKey().hashCode();
      }
      if (hasValue()) {
        hash = (37 * hash) + VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getValue().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.KeyValueProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.KeyValueProto)
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_KeyValueProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_KeyValueProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto.class, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto.newBuilder()
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
          getKeyFieldBuilder();
          getValueFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (keyBuilder_ == null) {
          key_ = null;
        } else {
          keyBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (valueBuilder_ == null) {
          value_ = null;
        } else {
          valueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_KeyValueProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto result = new org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (keyBuilder_ == null) {
            result.key_ = key_;
          } else {
            result.key_ = keyBuilder_.build();
          }
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          if (valueBuilder_ == null) {
            result.value_ = value_;
          } else {
            result.value_ = valueBuilder_.build();
          }
          to_bitField0_ |= 0x00000002;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto.getDefaultInstance()) return this;
        if (other.hasKey()) {
          mergeKey(other.getKey());
        }
        if (other.hasValue()) {
          mergeValue(other.getValue());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (hasKey()) {
          if (!getKey().isInitialized()) {
            return false;
          }
        }
        if (hasValue()) {
          if (!getValue().isInitialized()) {
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
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto key_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder> keyBuilder_;
      /**
       * <code>optional .hadoop.hdfs.BlockProto key = 1;</code>
       */
      public boolean hasKey() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional .hadoop.hdfs.BlockProto key = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto getKey() {
        if (keyBuilder_ == null) {
          return key_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance() : key_;
        } else {
          return keyBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .hadoop.hdfs.BlockProto key = 1;</code>
       */
      public Builder setKey(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto value) {
        if (keyBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          key_ = value;
          onChanged();
        } else {
          keyBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.BlockProto key = 1;</code>
       */
      public Builder setKey(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder builderForValue) {
        if (keyBuilder_ == null) {
          key_ = builderForValue.build();
          onChanged();
        } else {
          keyBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.BlockProto key = 1;</code>
       */
      public Builder mergeKey(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto value) {
        if (keyBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              key_ != null &&
              key_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance()) {
            key_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.newBuilder(key_).mergeFrom(value).buildPartial();
          } else {
            key_ = value;
          }
          onChanged();
        } else {
          keyBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.BlockProto key = 1;</code>
       */
      public Builder clearKey() {
        if (keyBuilder_ == null) {
          key_ = null;
          onChanged();
        } else {
          keyBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.BlockProto key = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder getKeyBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getKeyFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .hadoop.hdfs.BlockProto key = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder getKeyOrBuilder() {
        if (keyBuilder_ != null) {
          return keyBuilder_.getMessageOrBuilder();
        } else {
          return key_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance() : key_;
        }
      }
      /**
       * <code>optional .hadoop.hdfs.BlockProto key = 1;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder> 
          getKeyFieldBuilder() {
        if (keyBuilder_ == null) {
          keyBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder>(
                  getKey(),
                  getParentForChildren(),
                  isClean());
          key_ = null;
        }
        return keyBuilder_;
      }

      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto value_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProtoOrBuilder> valueBuilder_;
      /**
       * <code>optional .hadoop.hdfs.ProvidedStorageLocationProto value = 2;</code>
       */
      public boolean hasValue() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional .hadoop.hdfs.ProvidedStorageLocationProto value = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto getValue() {
        if (valueBuilder_ == null) {
          return value_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto.getDefaultInstance() : value_;
        } else {
          return valueBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .hadoop.hdfs.ProvidedStorageLocationProto value = 2;</code>
       */
      public Builder setValue(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto value) {
        if (valueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          value_ = value;
          onChanged();
        } else {
          valueBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ProvidedStorageLocationProto value = 2;</code>
       */
      public Builder setValue(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto.Builder builderForValue) {
        if (valueBuilder_ == null) {
          value_ = builderForValue.build();
          onChanged();
        } else {
          valueBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ProvidedStorageLocationProto value = 2;</code>
       */
      public Builder mergeValue(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto value) {
        if (valueBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
              value_ != null &&
              value_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto.getDefaultInstance()) {
            value_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto.newBuilder(value_).mergeFrom(value).buildPartial();
          } else {
            value_ = value;
          }
          onChanged();
        } else {
          valueBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ProvidedStorageLocationProto value = 2;</code>
       */
      public Builder clearValue() {
        if (valueBuilder_ == null) {
          value_ = null;
          onChanged();
        } else {
          valueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ProvidedStorageLocationProto value = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto.Builder getValueBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getValueFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .hadoop.hdfs.ProvidedStorageLocationProto value = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProtoOrBuilder getValueOrBuilder() {
        if (valueBuilder_ != null) {
          return valueBuilder_.getMessageOrBuilder();
        } else {
          return value_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto.getDefaultInstance() : value_;
        }
      }
      /**
       * <code>optional .hadoop.hdfs.ProvidedStorageLocationProto value = 2;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProtoOrBuilder> 
          getValueFieldBuilder() {
        if (valueBuilder_ == null) {
          valueBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProtoOrBuilder>(
                  getValue(),
                  getParentForChildren(),
                  isClean());
          value_ = null;
        }
        return valueBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.KeyValueProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.KeyValueProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<KeyValueProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<KeyValueProto>() {
      @java.lang.Override
      public KeyValueProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new KeyValueProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<KeyValueProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<KeyValueProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface WriteRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.WriteRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required .hadoop.hdfs.KeyValueProto keyValuePair = 1;</code>
     */
    boolean hasKeyValuePair();
    /**
     * <code>required .hadoop.hdfs.KeyValueProto keyValuePair = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto getKeyValuePair();
    /**
     * <code>required .hadoop.hdfs.KeyValueProto keyValuePair = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProtoOrBuilder getKeyValuePairOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.WriteRequestProto}
   */
  public  static final class WriteRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.WriteRequestProto)
      WriteRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WriteRequestProto.newBuilder() to construct.
    private WriteRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WriteRequestProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WriteRequestProto(
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
              org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = keyValuePair_.toBuilder();
              }
              keyValuePair_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(keyValuePair_);
                keyValuePair_ = subBuilder.buildPartial();
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
      return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_WriteRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_WriteRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto.Builder.class);
    }

    private int bitField0_;
    public static final int KEYVALUEPAIR_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto keyValuePair_;
    /**
     * <code>required .hadoop.hdfs.KeyValueProto keyValuePair = 1;</code>
     */
    public boolean hasKeyValuePair() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required .hadoop.hdfs.KeyValueProto keyValuePair = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto getKeyValuePair() {
      return keyValuePair_ == null ? org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto.getDefaultInstance() : keyValuePair_;
    }
    /**
     * <code>required .hadoop.hdfs.KeyValueProto keyValuePair = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProtoOrBuilder getKeyValuePairOrBuilder() {
      return keyValuePair_ == null ? org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto.getDefaultInstance() : keyValuePair_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasKeyValuePair()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getKeyValuePair().isInitialized()) {
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
        output.writeMessage(1, getKeyValuePair());
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
          .computeMessageSize(1, getKeyValuePair());
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto) obj;

      if (hasKeyValuePair() != other.hasKeyValuePair()) return false;
      if (hasKeyValuePair()) {
        if (!getKeyValuePair()
            .equals(other.getKeyValuePair())) return false;
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
      if (hasKeyValuePair()) {
        hash = (37 * hash) + KEYVALUEPAIR_FIELD_NUMBER;
        hash = (53 * hash) + getKeyValuePair().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.WriteRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.WriteRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_WriteRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_WriteRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto.newBuilder()
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
          getKeyValuePairFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (keyValuePairBuilder_ == null) {
          keyValuePair_ = null;
        } else {
          keyValuePairBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_WriteRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (keyValuePairBuilder_ == null) {
            result.keyValuePair_ = keyValuePair_;
          } else {
            result.keyValuePair_ = keyValuePairBuilder_.build();
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto.getDefaultInstance()) return this;
        if (other.hasKeyValuePair()) {
          mergeKeyValuePair(other.getKeyValuePair());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasKeyValuePair()) {
          return false;
        }
        if (!getKeyValuePair().isInitialized()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto keyValuePair_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProtoOrBuilder> keyValuePairBuilder_;
      /**
       * <code>required .hadoop.hdfs.KeyValueProto keyValuePair = 1;</code>
       */
      public boolean hasKeyValuePair() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required .hadoop.hdfs.KeyValueProto keyValuePair = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto getKeyValuePair() {
        if (keyValuePairBuilder_ == null) {
          return keyValuePair_ == null ? org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto.getDefaultInstance() : keyValuePair_;
        } else {
          return keyValuePairBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.KeyValueProto keyValuePair = 1;</code>
       */
      public Builder setKeyValuePair(org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto value) {
        if (keyValuePairBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          keyValuePair_ = value;
          onChanged();
        } else {
          keyValuePairBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.KeyValueProto keyValuePair = 1;</code>
       */
      public Builder setKeyValuePair(
          org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto.Builder builderForValue) {
        if (keyValuePairBuilder_ == null) {
          keyValuePair_ = builderForValue.build();
          onChanged();
        } else {
          keyValuePairBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.KeyValueProto keyValuePair = 1;</code>
       */
      public Builder mergeKeyValuePair(org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto value) {
        if (keyValuePairBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              keyValuePair_ != null &&
              keyValuePair_ != org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto.getDefaultInstance()) {
            keyValuePair_ =
              org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto.newBuilder(keyValuePair_).mergeFrom(value).buildPartial();
          } else {
            keyValuePair_ = value;
          }
          onChanged();
        } else {
          keyValuePairBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.KeyValueProto keyValuePair = 1;</code>
       */
      public Builder clearKeyValuePair() {
        if (keyValuePairBuilder_ == null) {
          keyValuePair_ = null;
          onChanged();
        } else {
          keyValuePairBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.KeyValueProto keyValuePair = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto.Builder getKeyValuePairBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getKeyValuePairFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.KeyValueProto keyValuePair = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProtoOrBuilder getKeyValuePairOrBuilder() {
        if (keyValuePairBuilder_ != null) {
          return keyValuePairBuilder_.getMessageOrBuilder();
        } else {
          return keyValuePair_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto.getDefaultInstance() : keyValuePair_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.KeyValueProto keyValuePair = 1;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProtoOrBuilder> 
          getKeyValuePairFieldBuilder() {
        if (keyValuePairBuilder_ == null) {
          keyValuePairBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProtoOrBuilder>(
                  getKeyValuePair(),
                  getParentForChildren(),
                  isClean());
          keyValuePair_ = null;
        }
        return keyValuePairBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.WriteRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.WriteRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<WriteRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<WriteRequestProto>() {
      @java.lang.Override
      public WriteRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new WriteRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<WriteRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<WriteRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface WriteResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.WriteResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.WriteResponseProto}
   */
  public  static final class WriteResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.WriteResponseProto)
      WriteResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WriteResponseProto.newBuilder() to construct.
    private WriteResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WriteResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WriteResponseProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_WriteResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_WriteResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto.Builder.class);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.WriteResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.WriteResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_WriteResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_WriteResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_WriteResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto(this);
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto) e.getUnfinishedMessage();
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.WriteResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.WriteResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<WriteResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<WriteResponseProto>() {
      @java.lang.Override
      public WriteResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new WriteResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<WriteResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<WriteResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ReadRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.ReadRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required .hadoop.hdfs.BlockProto key = 1;</code>
     */
    boolean hasKey();
    /**
     * <code>required .hadoop.hdfs.BlockProto key = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto getKey();
    /**
     * <code>required .hadoop.hdfs.BlockProto key = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder getKeyOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.ReadRequestProto}
   */
  public  static final class ReadRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.ReadRequestProto)
      ReadRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReadRequestProto.newBuilder() to construct.
    private ReadRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReadRequestProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReadRequestProto(
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
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = key_.toBuilder();
              }
              key_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(key_);
                key_ = subBuilder.buildPartial();
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
      return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_ReadRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_ReadRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto.Builder.class);
    }

    private int bitField0_;
    public static final int KEY_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto key_;
    /**
     * <code>required .hadoop.hdfs.BlockProto key = 1;</code>
     */
    public boolean hasKey() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required .hadoop.hdfs.BlockProto key = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto getKey() {
      return key_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance() : key_;
    }
    /**
     * <code>required .hadoop.hdfs.BlockProto key = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder getKeyOrBuilder() {
      return key_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance() : key_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasKey()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getKey().isInitialized()) {
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
        output.writeMessage(1, getKey());
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
          .computeMessageSize(1, getKey());
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto) obj;

      if (hasKey() != other.hasKey()) return false;
      if (hasKey()) {
        if (!getKey()
            .equals(other.getKey())) return false;
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
      if (hasKey()) {
        hash = (37 * hash) + KEY_FIELD_NUMBER;
        hash = (53 * hash) + getKey().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.ReadRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.ReadRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_ReadRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_ReadRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto.newBuilder()
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
          getKeyFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (keyBuilder_ == null) {
          key_ = null;
        } else {
          keyBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_ReadRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (keyBuilder_ == null) {
            result.key_ = key_;
          } else {
            result.key_ = keyBuilder_.build();
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto.getDefaultInstance()) return this;
        if (other.hasKey()) {
          mergeKey(other.getKey());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasKey()) {
          return false;
        }
        if (!getKey().isInitialized()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto key_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder> keyBuilder_;
      /**
       * <code>required .hadoop.hdfs.BlockProto key = 1;</code>
       */
      public boolean hasKey() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required .hadoop.hdfs.BlockProto key = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto getKey() {
        if (keyBuilder_ == null) {
          return key_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance() : key_;
        } else {
          return keyBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.BlockProto key = 1;</code>
       */
      public Builder setKey(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto value) {
        if (keyBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          key_ = value;
          onChanged();
        } else {
          keyBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.BlockProto key = 1;</code>
       */
      public Builder setKey(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder builderForValue) {
        if (keyBuilder_ == null) {
          key_ = builderForValue.build();
          onChanged();
        } else {
          keyBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.BlockProto key = 1;</code>
       */
      public Builder mergeKey(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto value) {
        if (keyBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              key_ != null &&
              key_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance()) {
            key_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.newBuilder(key_).mergeFrom(value).buildPartial();
          } else {
            key_ = value;
          }
          onChanged();
        } else {
          keyBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.BlockProto key = 1;</code>
       */
      public Builder clearKey() {
        if (keyBuilder_ == null) {
          key_ = null;
          onChanged();
        } else {
          keyBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.BlockProto key = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder getKeyBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getKeyFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.BlockProto key = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder getKeyOrBuilder() {
        if (keyBuilder_ != null) {
          return keyBuilder_.getMessageOrBuilder();
        } else {
          return key_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance() : key_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.BlockProto key = 1;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder> 
          getKeyFieldBuilder() {
        if (keyBuilder_ == null) {
          keyBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder>(
                  getKey(),
                  getParentForChildren(),
                  isClean());
          key_ = null;
        }
        return keyBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.ReadRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ReadRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<ReadRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<ReadRequestProto>() {
      @java.lang.Override
      public ReadRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new ReadRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<ReadRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<ReadRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ReadResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.ReadResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>optional .hadoop.hdfs.ProvidedStorageLocationProto value = 1;</code>
     */
    boolean hasValue();
    /**
     * <code>optional .hadoop.hdfs.ProvidedStorageLocationProto value = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto getValue();
    /**
     * <code>optional .hadoop.hdfs.ProvidedStorageLocationProto value = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProtoOrBuilder getValueOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.ReadResponseProto}
   */
  public  static final class ReadResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.ReadResponseProto)
      ReadResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReadResponseProto.newBuilder() to construct.
    private ReadResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReadResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReadResponseProto(
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
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = value_.toBuilder();
              }
              value_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(value_);
                value_ = subBuilder.buildPartial();
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
      return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_ReadResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_ReadResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto.Builder.class);
    }

    private int bitField0_;
    public static final int VALUE_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto value_;
    /**
     * <code>optional .hadoop.hdfs.ProvidedStorageLocationProto value = 1;</code>
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .hadoop.hdfs.ProvidedStorageLocationProto value = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto getValue() {
      return value_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto.getDefaultInstance() : value_;
    }
    /**
     * <code>optional .hadoop.hdfs.ProvidedStorageLocationProto value = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProtoOrBuilder getValueOrBuilder() {
      return value_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto.getDefaultInstance() : value_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (hasValue()) {
        if (!getValue().isInitialized()) {
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
        output.writeMessage(1, getValue());
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
          .computeMessageSize(1, getValue());
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto) obj;

      if (hasValue() != other.hasValue()) return false;
      if (hasValue()) {
        if (!getValue()
            .equals(other.getValue())) return false;
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
      if (hasValue()) {
        hash = (37 * hash) + VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getValue().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.ReadResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.ReadResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_ReadResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_ReadResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto.newBuilder()
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
          getValueFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (valueBuilder_ == null) {
          value_ = null;
        } else {
          valueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_ReadResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (valueBuilder_ == null) {
            result.value_ = value_;
          } else {
            result.value_ = valueBuilder_.build();
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto.getDefaultInstance()) return this;
        if (other.hasValue()) {
          mergeValue(other.getValue());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (hasValue()) {
          if (!getValue().isInitialized()) {
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
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto value_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProtoOrBuilder> valueBuilder_;
      /**
       * <code>optional .hadoop.hdfs.ProvidedStorageLocationProto value = 1;</code>
       */
      public boolean hasValue() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional .hadoop.hdfs.ProvidedStorageLocationProto value = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto getValue() {
        if (valueBuilder_ == null) {
          return value_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto.getDefaultInstance() : value_;
        } else {
          return valueBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .hadoop.hdfs.ProvidedStorageLocationProto value = 1;</code>
       */
      public Builder setValue(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto value) {
        if (valueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          value_ = value;
          onChanged();
        } else {
          valueBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ProvidedStorageLocationProto value = 1;</code>
       */
      public Builder setValue(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto.Builder builderForValue) {
        if (valueBuilder_ == null) {
          value_ = builderForValue.build();
          onChanged();
        } else {
          valueBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ProvidedStorageLocationProto value = 1;</code>
       */
      public Builder mergeValue(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto value) {
        if (valueBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              value_ != null &&
              value_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto.getDefaultInstance()) {
            value_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto.newBuilder(value_).mergeFrom(value).buildPartial();
          } else {
            value_ = value;
          }
          onChanged();
        } else {
          valueBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ProvidedStorageLocationProto value = 1;</code>
       */
      public Builder clearValue() {
        if (valueBuilder_ == null) {
          value_ = null;
          onChanged();
        } else {
          valueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ProvidedStorageLocationProto value = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto.Builder getValueBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getValueFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .hadoop.hdfs.ProvidedStorageLocationProto value = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProtoOrBuilder getValueOrBuilder() {
        if (valueBuilder_ != null) {
          return valueBuilder_.getMessageOrBuilder();
        } else {
          return value_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto.getDefaultInstance() : value_;
        }
      }
      /**
       * <code>optional .hadoop.hdfs.ProvidedStorageLocationProto value = 1;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProtoOrBuilder> 
          getValueFieldBuilder() {
        if (valueBuilder_ == null) {
          valueBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ProvidedStorageLocationProtoOrBuilder>(
                  getValue(),
                  getParentForChildren(),
                  isClean());
          value_ = null;
        }
        return valueBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.ReadResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ReadResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<ReadResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<ReadResponseProto>() {
      @java.lang.Override
      public ReadResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new ReadResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<ReadResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<ReadResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ListRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.ListRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>optional .hadoop.hdfs.BlockProto marker = 1;</code>
     */
    boolean hasMarker();
    /**
     * <code>optional .hadoop.hdfs.BlockProto marker = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto getMarker();
    /**
     * <code>optional .hadoop.hdfs.BlockProto marker = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder getMarkerOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.ListRequestProto}
   */
  public  static final class ListRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.ListRequestProto)
      ListRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ListRequestProto.newBuilder() to construct.
    private ListRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ListRequestProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ListRequestProto(
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
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = marker_.toBuilder();
              }
              marker_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(marker_);
                marker_ = subBuilder.buildPartial();
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
      return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_ListRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_ListRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto.Builder.class);
    }

    private int bitField0_;
    public static final int MARKER_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto marker_;
    /**
     * <code>optional .hadoop.hdfs.BlockProto marker = 1;</code>
     */
    public boolean hasMarker() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .hadoop.hdfs.BlockProto marker = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto getMarker() {
      return marker_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance() : marker_;
    }
    /**
     * <code>optional .hadoop.hdfs.BlockProto marker = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder getMarkerOrBuilder() {
      return marker_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance() : marker_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (hasMarker()) {
        if (!getMarker().isInitialized()) {
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
        output.writeMessage(1, getMarker());
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
          .computeMessageSize(1, getMarker());
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto) obj;

      if (hasMarker() != other.hasMarker()) return false;
      if (hasMarker()) {
        if (!getMarker()
            .equals(other.getMarker())) return false;
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
      if (hasMarker()) {
        hash = (37 * hash) + MARKER_FIELD_NUMBER;
        hash = (53 * hash) + getMarker().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.ListRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.ListRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_ListRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_ListRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto.newBuilder()
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
          getMarkerFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (markerBuilder_ == null) {
          marker_ = null;
        } else {
          markerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_ListRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (markerBuilder_ == null) {
            result.marker_ = marker_;
          } else {
            result.marker_ = markerBuilder_.build();
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto.getDefaultInstance()) return this;
        if (other.hasMarker()) {
          mergeMarker(other.getMarker());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (hasMarker()) {
          if (!getMarker().isInitialized()) {
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
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto marker_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder> markerBuilder_;
      /**
       * <code>optional .hadoop.hdfs.BlockProto marker = 1;</code>
       */
      public boolean hasMarker() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional .hadoop.hdfs.BlockProto marker = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto getMarker() {
        if (markerBuilder_ == null) {
          return marker_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance() : marker_;
        } else {
          return markerBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .hadoop.hdfs.BlockProto marker = 1;</code>
       */
      public Builder setMarker(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto value) {
        if (markerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          marker_ = value;
          onChanged();
        } else {
          markerBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.BlockProto marker = 1;</code>
       */
      public Builder setMarker(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder builderForValue) {
        if (markerBuilder_ == null) {
          marker_ = builderForValue.build();
          onChanged();
        } else {
          markerBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.BlockProto marker = 1;</code>
       */
      public Builder mergeMarker(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto value) {
        if (markerBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              marker_ != null &&
              marker_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance()) {
            marker_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.newBuilder(marker_).mergeFrom(value).buildPartial();
          } else {
            marker_ = value;
          }
          onChanged();
        } else {
          markerBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.BlockProto marker = 1;</code>
       */
      public Builder clearMarker() {
        if (markerBuilder_ == null) {
          marker_ = null;
          onChanged();
        } else {
          markerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.BlockProto marker = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder getMarkerBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMarkerFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .hadoop.hdfs.BlockProto marker = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder getMarkerOrBuilder() {
        if (markerBuilder_ != null) {
          return markerBuilder_.getMessageOrBuilder();
        } else {
          return marker_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance() : marker_;
        }
      }
      /**
       * <code>optional .hadoop.hdfs.BlockProto marker = 1;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder> 
          getMarkerFieldBuilder() {
        if (markerBuilder_ == null) {
          markerBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder>(
                  getMarker(),
                  getParentForChildren(),
                  isClean());
          marker_ = null;
        }
        return markerBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.ListRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ListRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<ListRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<ListRequestProto>() {
      @java.lang.Override
      public ListRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new ListRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<ListRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<ListRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ListResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.ListResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .hadoop.hdfs.KeyValueProto fileRegions = 1;</code>
     */
    java.util.List<org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto> 
        getFileRegionsList();
    /**
     * <code>repeated .hadoop.hdfs.KeyValueProto fileRegions = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto getFileRegions(int index);
    /**
     * <code>repeated .hadoop.hdfs.KeyValueProto fileRegions = 1;</code>
     */
    int getFileRegionsCount();
    /**
     * <code>repeated .hadoop.hdfs.KeyValueProto fileRegions = 1;</code>
     */
    java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProtoOrBuilder> 
        getFileRegionsOrBuilderList();
    /**
     * <code>repeated .hadoop.hdfs.KeyValueProto fileRegions = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProtoOrBuilder getFileRegionsOrBuilder(
        int index);

    /**
     * <code>optional .hadoop.hdfs.BlockProto nextMarker = 2;</code>
     */
    boolean hasNextMarker();
    /**
     * <code>optional .hadoop.hdfs.BlockProto nextMarker = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto getNextMarker();
    /**
     * <code>optional .hadoop.hdfs.BlockProto nextMarker = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder getNextMarkerOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.ListResponseProto}
   */
  public  static final class ListResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.ListResponseProto)
      ListResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ListResponseProto.newBuilder() to construct.
    private ListResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ListResponseProto() {
      fileRegions_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ListResponseProto(
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
                fileRegions_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto>();
                mutable_bitField0_ |= 0x00000001;
              }
              fileRegions_.add(
                  input.readMessage(org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto.PARSER, extensionRegistry));
              break;
            }
            case 18: {
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = nextMarker_.toBuilder();
              }
              nextMarker_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(nextMarker_);
                nextMarker_ = subBuilder.buildPartial();
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          fileRegions_ = java.util.Collections.unmodifiableList(fileRegions_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_ListResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_ListResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto.Builder.class);
    }

    private int bitField0_;
    public static final int FILEREGIONS_FIELD_NUMBER = 1;
    private java.util.List<org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto> fileRegions_;
    /**
     * <code>repeated .hadoop.hdfs.KeyValueProto fileRegions = 1;</code>
     */
    public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto> getFileRegionsList() {
      return fileRegions_;
    }
    /**
     * <code>repeated .hadoop.hdfs.KeyValueProto fileRegions = 1;</code>
     */
    public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProtoOrBuilder> 
        getFileRegionsOrBuilderList() {
      return fileRegions_;
    }
    /**
     * <code>repeated .hadoop.hdfs.KeyValueProto fileRegions = 1;</code>
     */
    public int getFileRegionsCount() {
      return fileRegions_.size();
    }
    /**
     * <code>repeated .hadoop.hdfs.KeyValueProto fileRegions = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto getFileRegions(int index) {
      return fileRegions_.get(index);
    }
    /**
     * <code>repeated .hadoop.hdfs.KeyValueProto fileRegions = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProtoOrBuilder getFileRegionsOrBuilder(
        int index) {
      return fileRegions_.get(index);
    }

    public static final int NEXTMARKER_FIELD_NUMBER = 2;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto nextMarker_;
    /**
     * <code>optional .hadoop.hdfs.BlockProto nextMarker = 2;</code>
     */
    public boolean hasNextMarker() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .hadoop.hdfs.BlockProto nextMarker = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto getNextMarker() {
      return nextMarker_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance() : nextMarker_;
    }
    /**
     * <code>optional .hadoop.hdfs.BlockProto nextMarker = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder getNextMarkerOrBuilder() {
      return nextMarker_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance() : nextMarker_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getFileRegionsCount(); i++) {
        if (!getFileRegions(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasNextMarker()) {
        if (!getNextMarker().isInitialized()) {
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
      for (int i = 0; i < fileRegions_.size(); i++) {
        output.writeMessage(1, fileRegions_.get(i));
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(2, getNextMarker());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < fileRegions_.size(); i++) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(1, fileRegions_.get(i));
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(2, getNextMarker());
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto) obj;

      if (!getFileRegionsList()
          .equals(other.getFileRegionsList())) return false;
      if (hasNextMarker() != other.hasNextMarker()) return false;
      if (hasNextMarker()) {
        if (!getNextMarker()
            .equals(other.getNextMarker())) return false;
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
      if (getFileRegionsCount() > 0) {
        hash = (37 * hash) + FILEREGIONS_FIELD_NUMBER;
        hash = (53 * hash) + getFileRegionsList().hashCode();
      }
      if (hasNextMarker()) {
        hash = (37 * hash) + NEXTMARKER_FIELD_NUMBER;
        hash = (53 * hash) + getNextMarker().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.ListResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.ListResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_ListResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_ListResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto.newBuilder()
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
          getFileRegionsFieldBuilder();
          getNextMarkerFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (fileRegionsBuilder_ == null) {
          fileRegions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          fileRegionsBuilder_.clear();
        }
        if (nextMarkerBuilder_ == null) {
          nextMarker_ = null;
        } else {
          nextMarkerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_ListResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (fileRegionsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            fileRegions_ = java.util.Collections.unmodifiableList(fileRegions_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.fileRegions_ = fileRegions_;
        } else {
          result.fileRegions_ = fileRegionsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          if (nextMarkerBuilder_ == null) {
            result.nextMarker_ = nextMarker_;
          } else {
            result.nextMarker_ = nextMarkerBuilder_.build();
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto.getDefaultInstance()) return this;
        if (fileRegionsBuilder_ == null) {
          if (!other.fileRegions_.isEmpty()) {
            if (fileRegions_.isEmpty()) {
              fileRegions_ = other.fileRegions_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureFileRegionsIsMutable();
              fileRegions_.addAll(other.fileRegions_);
            }
            onChanged();
          }
        } else {
          if (!other.fileRegions_.isEmpty()) {
            if (fileRegionsBuilder_.isEmpty()) {
              fileRegionsBuilder_.dispose();
              fileRegionsBuilder_ = null;
              fileRegions_ = other.fileRegions_;
              bitField0_ = (bitField0_ & ~0x00000001);
              fileRegionsBuilder_ = 
                org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getFileRegionsFieldBuilder() : null;
            } else {
              fileRegionsBuilder_.addAllMessages(other.fileRegions_);
            }
          }
        }
        if (other.hasNextMarker()) {
          mergeNextMarker(other.getNextMarker());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        for (int i = 0; i < getFileRegionsCount(); i++) {
          if (!getFileRegions(i).isInitialized()) {
            return false;
          }
        }
        if (hasNextMarker()) {
          if (!getNextMarker().isInitialized()) {
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
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto> fileRegions_ =
        java.util.Collections.emptyList();
      private void ensureFileRegionsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          fileRegions_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto>(fileRegions_);
          bitField0_ |= 0x00000001;
         }
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProtoOrBuilder> fileRegionsBuilder_;

      /**
       * <code>repeated .hadoop.hdfs.KeyValueProto fileRegions = 1;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto> getFileRegionsList() {
        if (fileRegionsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(fileRegions_);
        } else {
          return fileRegionsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.KeyValueProto fileRegions = 1;</code>
       */
      public int getFileRegionsCount() {
        if (fileRegionsBuilder_ == null) {
          return fileRegions_.size();
        } else {
          return fileRegionsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.KeyValueProto fileRegions = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto getFileRegions(int index) {
        if (fileRegionsBuilder_ == null) {
          return fileRegions_.get(index);
        } else {
          return fileRegionsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.KeyValueProto fileRegions = 1;</code>
       */
      public Builder setFileRegions(
          int index, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto value) {
        if (fileRegionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFileRegionsIsMutable();
          fileRegions_.set(index, value);
          onChanged();
        } else {
          fileRegionsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.KeyValueProto fileRegions = 1;</code>
       */
      public Builder setFileRegions(
          int index, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto.Builder builderForValue) {
        if (fileRegionsBuilder_ == null) {
          ensureFileRegionsIsMutable();
          fileRegions_.set(index, builderForValue.build());
          onChanged();
        } else {
          fileRegionsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.KeyValueProto fileRegions = 1;</code>
       */
      public Builder addFileRegions(org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto value) {
        if (fileRegionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFileRegionsIsMutable();
          fileRegions_.add(value);
          onChanged();
        } else {
          fileRegionsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.KeyValueProto fileRegions = 1;</code>
       */
      public Builder addFileRegions(
          int index, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto value) {
        if (fileRegionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFileRegionsIsMutable();
          fileRegions_.add(index, value);
          onChanged();
        } else {
          fileRegionsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.KeyValueProto fileRegions = 1;</code>
       */
      public Builder addFileRegions(
          org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto.Builder builderForValue) {
        if (fileRegionsBuilder_ == null) {
          ensureFileRegionsIsMutable();
          fileRegions_.add(builderForValue.build());
          onChanged();
        } else {
          fileRegionsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.KeyValueProto fileRegions = 1;</code>
       */
      public Builder addFileRegions(
          int index, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto.Builder builderForValue) {
        if (fileRegionsBuilder_ == null) {
          ensureFileRegionsIsMutable();
          fileRegions_.add(index, builderForValue.build());
          onChanged();
        } else {
          fileRegionsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.KeyValueProto fileRegions = 1;</code>
       */
      public Builder addAllFileRegions(
          java.lang.Iterable<? extends org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto> values) {
        if (fileRegionsBuilder_ == null) {
          ensureFileRegionsIsMutable();
          org.apache.hadoop.thirdparty.protobuf.AbstractMessageLite.Builder.addAll(
              values, fileRegions_);
          onChanged();
        } else {
          fileRegionsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.KeyValueProto fileRegions = 1;</code>
       */
      public Builder clearFileRegions() {
        if (fileRegionsBuilder_ == null) {
          fileRegions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          fileRegionsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.KeyValueProto fileRegions = 1;</code>
       */
      public Builder removeFileRegions(int index) {
        if (fileRegionsBuilder_ == null) {
          ensureFileRegionsIsMutable();
          fileRegions_.remove(index);
          onChanged();
        } else {
          fileRegionsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.KeyValueProto fileRegions = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto.Builder getFileRegionsBuilder(
          int index) {
        return getFileRegionsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.hdfs.KeyValueProto fileRegions = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProtoOrBuilder getFileRegionsOrBuilder(
          int index) {
        if (fileRegionsBuilder_ == null) {
          return fileRegions_.get(index);  } else {
          return fileRegionsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.KeyValueProto fileRegions = 1;</code>
       */
      public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProtoOrBuilder> 
           getFileRegionsOrBuilderList() {
        if (fileRegionsBuilder_ != null) {
          return fileRegionsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(fileRegions_);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.KeyValueProto fileRegions = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto.Builder addFileRegionsBuilder() {
        return getFileRegionsFieldBuilder().addBuilder(
            org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.KeyValueProto fileRegions = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto.Builder addFileRegionsBuilder(
          int index) {
        return getFileRegionsFieldBuilder().addBuilder(
            index, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.KeyValueProto fileRegions = 1;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto.Builder> 
           getFileRegionsBuilderList() {
        return getFileRegionsFieldBuilder().getBuilderList();
      }
      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProtoOrBuilder> 
          getFileRegionsFieldBuilder() {
        if (fileRegionsBuilder_ == null) {
          fileRegionsBuilder_ = new org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.KeyValueProtoOrBuilder>(
                  fileRegions_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          fileRegions_ = null;
        }
        return fileRegionsBuilder_;
      }

      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto nextMarker_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder> nextMarkerBuilder_;
      /**
       * <code>optional .hadoop.hdfs.BlockProto nextMarker = 2;</code>
       */
      public boolean hasNextMarker() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional .hadoop.hdfs.BlockProto nextMarker = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto getNextMarker() {
        if (nextMarkerBuilder_ == null) {
          return nextMarker_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance() : nextMarker_;
        } else {
          return nextMarkerBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .hadoop.hdfs.BlockProto nextMarker = 2;</code>
       */
      public Builder setNextMarker(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto value) {
        if (nextMarkerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          nextMarker_ = value;
          onChanged();
        } else {
          nextMarkerBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.BlockProto nextMarker = 2;</code>
       */
      public Builder setNextMarker(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder builderForValue) {
        if (nextMarkerBuilder_ == null) {
          nextMarker_ = builderForValue.build();
          onChanged();
        } else {
          nextMarkerBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.BlockProto nextMarker = 2;</code>
       */
      public Builder mergeNextMarker(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto value) {
        if (nextMarkerBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
              nextMarker_ != null &&
              nextMarker_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance()) {
            nextMarker_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.newBuilder(nextMarker_).mergeFrom(value).buildPartial();
          } else {
            nextMarker_ = value;
          }
          onChanged();
        } else {
          nextMarkerBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.BlockProto nextMarker = 2;</code>
       */
      public Builder clearNextMarker() {
        if (nextMarkerBuilder_ == null) {
          nextMarker_ = null;
          onChanged();
        } else {
          nextMarkerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.BlockProto nextMarker = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder getNextMarkerBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getNextMarkerFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .hadoop.hdfs.BlockProto nextMarker = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder getNextMarkerOrBuilder() {
        if (nextMarkerBuilder_ != null) {
          return nextMarkerBuilder_.getMessageOrBuilder();
        } else {
          return nextMarker_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance() : nextMarker_;
        }
      }
      /**
       * <code>optional .hadoop.hdfs.BlockProto nextMarker = 2;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder> 
          getNextMarkerFieldBuilder() {
        if (nextMarkerBuilder_ == null) {
          nextMarkerBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder>(
                  getNextMarker(),
                  getParentForChildren(),
                  isClean());
          nextMarker_ = null;
        }
        return nextMarkerBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.ListResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ListResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<ListResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<ListResponseProto>() {
      @java.lang.Override
      public ListResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new ListResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<ListResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<ListResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface BlockPoolRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.BlockPoolRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.BlockPoolRequestProto}
   */
  public  static final class BlockPoolRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.BlockPoolRequestProto)
      BlockPoolRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BlockPoolRequestProto.newBuilder() to construct.
    private BlockPoolRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BlockPoolRequestProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BlockPoolRequestProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_BlockPoolRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_BlockPoolRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto.Builder.class);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.BlockPoolRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.BlockPoolRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_BlockPoolRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_BlockPoolRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_BlockPoolRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto(this);
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto) e.getUnfinishedMessage();
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.BlockPoolRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.BlockPoolRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<BlockPoolRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<BlockPoolRequestProto>() {
      @java.lang.Override
      public BlockPoolRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new BlockPoolRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<BlockPoolRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<BlockPoolRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface BlockPoolResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.BlockPoolResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required string blockPoolId = 1;</code>
     */
    boolean hasBlockPoolId();
    /**
     * <code>required string blockPoolId = 1;</code>
     */
    java.lang.String getBlockPoolId();
    /**
     * <code>required string blockPoolId = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getBlockPoolIdBytes();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.BlockPoolResponseProto}
   */
  public  static final class BlockPoolResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.BlockPoolResponseProto)
      BlockPoolResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BlockPoolResponseProto.newBuilder() to construct.
    private BlockPoolResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BlockPoolResponseProto() {
      blockPoolId_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BlockPoolResponseProto(
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
              blockPoolId_ = bs;
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
      return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_BlockPoolResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_BlockPoolResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto.Builder.class);
    }

    private int bitField0_;
    public static final int BLOCKPOOLID_FIELD_NUMBER = 1;
    private volatile java.lang.Object blockPoolId_;
    /**
     * <code>required string blockPoolId = 1;</code>
     */
    public boolean hasBlockPoolId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string blockPoolId = 1;</code>
     */
    public java.lang.String getBlockPoolId() {
      java.lang.Object ref = blockPoolId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          blockPoolId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string blockPoolId = 1;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getBlockPoolIdBytes() {
      java.lang.Object ref = blockPoolId_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        blockPoolId_ = b;
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

      if (!hasBlockPoolId()) {
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, blockPoolId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, blockPoolId_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto) obj;

      if (hasBlockPoolId() != other.hasBlockPoolId()) return false;
      if (hasBlockPoolId()) {
        if (!getBlockPoolId()
            .equals(other.getBlockPoolId())) return false;
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
      if (hasBlockPoolId()) {
        hash = (37 * hash) + BLOCKPOOLID_FIELD_NUMBER;
        hash = (53 * hash) + getBlockPoolId().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.BlockPoolResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.BlockPoolResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_BlockPoolResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_BlockPoolResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto.newBuilder()
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
        blockPoolId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.internal_static_hadoop_hdfs_BlockPoolResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.blockPoolId_ = blockPoolId_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto.getDefaultInstance()) return this;
        if (other.hasBlockPoolId()) {
          bitField0_ |= 0x00000001;
          blockPoolId_ = other.blockPoolId_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasBlockPoolId()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object blockPoolId_ = "";
      /**
       * <code>required string blockPoolId = 1;</code>
       */
      public boolean hasBlockPoolId() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string blockPoolId = 1;</code>
       */
      public java.lang.String getBlockPoolId() {
        java.lang.Object ref = blockPoolId_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            blockPoolId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string blockPoolId = 1;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getBlockPoolIdBytes() {
        java.lang.Object ref = blockPoolId_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          blockPoolId_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string blockPoolId = 1;</code>
       */
      public Builder setBlockPoolId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        blockPoolId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string blockPoolId = 1;</code>
       */
      public Builder clearBlockPoolId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        blockPoolId_ = getDefaultInstance().getBlockPoolId();
        onChanged();
        return this;
      }
      /**
       * <code>required string blockPoolId = 1;</code>
       */
      public Builder setBlockPoolIdBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        blockPoolId_ = value;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.BlockPoolResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.BlockPoolResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<BlockPoolResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<BlockPoolResponseProto>() {
      @java.lang.Override
      public BlockPoolResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new BlockPoolResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<BlockPoolResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<BlockPoolResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  /**
   * Protobuf service {@code hadoop.hdfs.AliasMapProtocolService}
   */
  public static abstract class AliasMapProtocolService
      implements org.apache.hadoop.thirdparty.protobuf.Service {
    protected AliasMapProtocolService() {}

    public interface Interface {
      /**
       * <code>rpc write(.hadoop.hdfs.WriteRequestProto) returns (.hadoop.hdfs.WriteResponseProto);</code>
       */
      public abstract void write(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto> done);

      /**
       * <code>rpc read(.hadoop.hdfs.ReadRequestProto) returns (.hadoop.hdfs.ReadResponseProto);</code>
       */
      public abstract void read(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto> done);

      /**
       * <code>rpc list(.hadoop.hdfs.ListRequestProto) returns (.hadoop.hdfs.ListResponseProto);</code>
       */
      public abstract void list(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto> done);

      /**
       * <code>rpc getBlockPoolId(.hadoop.hdfs.BlockPoolRequestProto) returns (.hadoop.hdfs.BlockPoolResponseProto);</code>
       */
      public abstract void getBlockPoolId(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto> done);

    }

    public static org.apache.hadoop.thirdparty.protobuf.Service newReflectiveService(
        final Interface impl) {
      return new AliasMapProtocolService() {
        @java.lang.Override
        public  void write(
            org.apache.hadoop.thirdparty.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto request,
            org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto> done) {
          impl.write(controller, request, done);
        }

        @java.lang.Override
        public  void read(
            org.apache.hadoop.thirdparty.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto request,
            org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto> done) {
          impl.read(controller, request, done);
        }

        @java.lang.Override
        public  void list(
            org.apache.hadoop.thirdparty.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto request,
            org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto> done) {
          impl.list(controller, request, done);
        }

        @java.lang.Override
        public  void getBlockPoolId(
            org.apache.hadoop.thirdparty.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto request,
            org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto> done) {
          impl.getBlockPoolId(controller, request, done);
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
              return impl.write(controller, (org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto)request);
            case 1:
              return impl.read(controller, (org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto)request);
            case 2:
              return impl.list(controller, (org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto)request);
            case 3:
              return impl.getBlockPoolId(controller, (org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto)request);
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
              return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto.getDefaultInstance();
            case 1:
              return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto.getDefaultInstance();
            case 2:
              return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto.getDefaultInstance();
            case 3:
              return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto.getDefaultInstance();
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
              return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto.getDefaultInstance();
            case 1:
              return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto.getDefaultInstance();
            case 2:
              return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto.getDefaultInstance();
            case 3:
              return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

      };
    }

    /**
     * <code>rpc write(.hadoop.hdfs.WriteRequestProto) returns (.hadoop.hdfs.WriteResponseProto);</code>
     */
    public abstract void write(
        org.apache.hadoop.thirdparty.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto request,
        org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto> done);

    /**
     * <code>rpc read(.hadoop.hdfs.ReadRequestProto) returns (.hadoop.hdfs.ReadResponseProto);</code>
     */
    public abstract void read(
        org.apache.hadoop.thirdparty.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto request,
        org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto> done);

    /**
     * <code>rpc list(.hadoop.hdfs.ListRequestProto) returns (.hadoop.hdfs.ListResponseProto);</code>
     */
    public abstract void list(
        org.apache.hadoop.thirdparty.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto request,
        org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto> done);

    /**
     * <code>rpc getBlockPoolId(.hadoop.hdfs.BlockPoolRequestProto) returns (.hadoop.hdfs.BlockPoolResponseProto);</code>
     */
    public abstract void getBlockPoolId(
        org.apache.hadoop.thirdparty.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto request,
        org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto> done);

    public static final
        org.apache.hadoop.thirdparty.protobuf.Descriptors.ServiceDescriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.getDescriptor().getServices().get(0);
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
          this.write(controller, (org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto)request,
            org.apache.hadoop.thirdparty.protobuf.RpcUtil.<org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto>specializeCallback(
              done));
          return;
        case 1:
          this.read(controller, (org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto)request,
            org.apache.hadoop.thirdparty.protobuf.RpcUtil.<org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto>specializeCallback(
              done));
          return;
        case 2:
          this.list(controller, (org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto)request,
            org.apache.hadoop.thirdparty.protobuf.RpcUtil.<org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto>specializeCallback(
              done));
          return;
        case 3:
          this.getBlockPoolId(controller, (org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto)request,
            org.apache.hadoop.thirdparty.protobuf.RpcUtil.<org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto>specializeCallback(
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
          return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto.getDefaultInstance();
        case 1:
          return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto.getDefaultInstance();
        case 2:
          return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto.getDefaultInstance();
        case 3:
          return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto.getDefaultInstance();
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
          return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto.getDefaultInstance();
        case 1:
          return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto.getDefaultInstance();
        case 2:
          return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto.getDefaultInstance();
        case 3:
          return org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public static Stub newStub(
        org.apache.hadoop.thirdparty.protobuf.RpcChannel channel) {
      return new Stub(channel);
    }

    public static final class Stub extends org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.AliasMapProtocolService implements Interface {
      private Stub(org.apache.hadoop.thirdparty.protobuf.RpcChannel channel) {
        this.channel = channel;
      }

      private final org.apache.hadoop.thirdparty.protobuf.RpcChannel channel;

      public org.apache.hadoop.thirdparty.protobuf.RpcChannel getChannel() {
        return channel;
      }

      public  void write(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto.getDefaultInstance(),
          org.apache.hadoop.thirdparty.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto.class,
            org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto.getDefaultInstance()));
      }

      public  void read(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto.getDefaultInstance(),
          org.apache.hadoop.thirdparty.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto.class,
            org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto.getDefaultInstance()));
      }

      public  void list(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(2),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto.getDefaultInstance(),
          org.apache.hadoop.thirdparty.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto.class,
            org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto.getDefaultInstance()));
      }

      public  void getBlockPoolId(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(3),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto.getDefaultInstance(),
          org.apache.hadoop.thirdparty.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto.class,
            org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto.getDefaultInstance()));
      }
    }

    public static BlockingInterface newBlockingStub(
        org.apache.hadoop.thirdparty.protobuf.BlockingRpcChannel channel) {
      return new BlockingStub(channel);
    }

    public interface BlockingInterface {
      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto write(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException;

      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto read(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException;

      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto list(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException;

      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto getBlockPoolId(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException;
    }

    private static final class BlockingStub implements BlockingInterface {
      private BlockingStub(org.apache.hadoop.thirdparty.protobuf.BlockingRpcChannel channel) {
        this.channel = channel;
      }

      private final org.apache.hadoop.thirdparty.protobuf.BlockingRpcChannel channel;

      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto write(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.WriteResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto read(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ReadResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto list(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(2),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.ListResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto getBlockPoolId(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(3),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.AliasMapProtocolProtos.BlockPoolResponseProto.getDefaultInstance());
      }

    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.AliasMapProtocolService)
  }

  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_KeyValueProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_KeyValueProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_WriteRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_WriteRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_WriteResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_WriteResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_ReadRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_ReadRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_ReadResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_ReadResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_ListRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_ListRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_ListResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_ListResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_BlockPoolRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_BlockPoolRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_BlockPoolResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_BlockPoolResponseProto_fieldAccessorTable;

  public static org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026AliasMapProtocol.proto\022\013hadoop.hdfs\032\nh" +
      "dfs.proto\"o\n\rKeyValueProto\022$\n\003key\030\001 \001(\0132" +
      "\027.hadoop.hdfs.BlockProto\0228\n\005value\030\002 \001(\0132" +
      ").hadoop.hdfs.ProvidedStorageLocationPro" +
      "to\"E\n\021WriteRequestProto\0220\n\014keyValuePair\030" +
      "\001 \002(\0132\032.hadoop.hdfs.KeyValueProto\"\024\n\022Wri" +
      "teResponseProto\"8\n\020ReadRequestProto\022$\n\003k" +
      "ey\030\001 \002(\0132\027.hadoop.hdfs.BlockProto\"M\n\021Rea" +
      "dResponseProto\0228\n\005value\030\001 \001(\0132).hadoop.h" +
      "dfs.ProvidedStorageLocationProto\";\n\020List" +
      "RequestProto\022\'\n\006marker\030\001 \001(\0132\027.hadoop.hd" +
      "fs.BlockProto\"q\n\021ListResponseProto\022/\n\013fi" +
      "leRegions\030\001 \003(\0132\032.hadoop.hdfs.KeyValuePr" +
      "oto\022+\n\nnextMarker\030\002 \001(\0132\027.hadoop.hdfs.Bl" +
      "ockProto\"\027\n\025BlockPoolRequestProto\"-\n\026Blo" +
      "ckPoolResponseProto\022\023\n\013blockPoolId\030\001 \002(\t" +
      "2\314\002\n\027AliasMapProtocolService\022H\n\005write\022\036." +
      "hadoop.hdfs.WriteRequestProto\032\037.hadoop.h" +
      "dfs.WriteResponseProto\022E\n\004read\022\035.hadoop." +
      "hdfs.ReadRequestProto\032\036.hadoop.hdfs.Read" +
      "ResponseProto\022E\n\004list\022\035.hadoop.hdfs.List" +
      "RequestProto\032\036.hadoop.hdfs.ListResponseP" +
      "roto\022Y\n\016getBlockPoolId\022\".hadoop.hdfs.Blo" +
      "ckPoolRequestProto\032#.hadoop.hdfs.BlockPo" +
      "olResponseProtoBE\n%org.apache.hadoop.hdf" +
      "s.protocol.protoB\026AliasMapProtocolProtos" +
      "\210\001\001\240\001\001"
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
    internal_static_hadoop_hdfs_KeyValueProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hadoop_hdfs_KeyValueProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_KeyValueProto_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_hadoop_hdfs_WriteRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hadoop_hdfs_WriteRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_WriteRequestProto_descriptor,
        new java.lang.String[] { "KeyValuePair", });
    internal_static_hadoop_hdfs_WriteResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_hadoop_hdfs_WriteResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_WriteResponseProto_descriptor,
        new java.lang.String[] { });
    internal_static_hadoop_hdfs_ReadRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_hadoop_hdfs_ReadRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_ReadRequestProto_descriptor,
        new java.lang.String[] { "Key", });
    internal_static_hadoop_hdfs_ReadResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_hadoop_hdfs_ReadResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_ReadResponseProto_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_hadoop_hdfs_ListRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_hadoop_hdfs_ListRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_ListRequestProto_descriptor,
        new java.lang.String[] { "Marker", });
    internal_static_hadoop_hdfs_ListResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_hadoop_hdfs_ListResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_ListResponseProto_descriptor,
        new java.lang.String[] { "FileRegions", "NextMarker", });
    internal_static_hadoop_hdfs_BlockPoolRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_hadoop_hdfs_BlockPoolRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_BlockPoolRequestProto_descriptor,
        new java.lang.String[] { });
    internal_static_hadoop_hdfs_BlockPoolResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_hadoop_hdfs_BlockPoolResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_BlockPoolResponseProto_descriptor,
        new java.lang.String[] { "BlockPoolId", });
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
