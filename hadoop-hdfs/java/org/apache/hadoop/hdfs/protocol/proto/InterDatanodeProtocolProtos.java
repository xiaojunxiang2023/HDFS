// source: InterDatanodeProtocol.proto

package org.apache.hadoop.hdfs.protocol.proto;

public final class InterDatanodeProtocolProtos {
  private InterDatanodeProtocolProtos() {}
  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InitReplicaRecoveryRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.InitReplicaRecoveryRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required .hadoop.hdfs.RecoveringBlockProto block = 1;</code>
     */
    boolean hasBlock();
    /**
     * <code>required .hadoop.hdfs.RecoveringBlockProto block = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto getBlock();
    /**
     * <code>required .hadoop.hdfs.RecoveringBlockProto block = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProtoOrBuilder getBlockOrBuilder();
  }
  /**
   * <pre>
   **
   * Block with location information and new generation stamp
   * to be used for recovery.
   * </pre>
   *
   * Protobuf type {@code hadoop.hdfs.InitReplicaRecoveryRequestProto}
   */
  public  static final class InitReplicaRecoveryRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.InitReplicaRecoveryRequestProto)
      InitReplicaRecoveryRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InitReplicaRecoveryRequestProto.newBuilder() to construct.
    private InitReplicaRecoveryRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InitReplicaRecoveryRequestProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private InitReplicaRecoveryRequestProto(
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
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = block_.toBuilder();
              }
              block_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(block_);
                block_ = subBuilder.buildPartial();
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
      return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_InitReplicaRecoveryRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_InitReplicaRecoveryRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto.Builder.class);
    }

    private int bitField0_;
    public static final int BLOCK_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto block_;
    /**
     * <code>required .hadoop.hdfs.RecoveringBlockProto block = 1;</code>
     */
    public boolean hasBlock() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required .hadoop.hdfs.RecoveringBlockProto block = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto getBlock() {
      return block_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto.getDefaultInstance() : block_;
    }
    /**
     * <code>required .hadoop.hdfs.RecoveringBlockProto block = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProtoOrBuilder getBlockOrBuilder() {
      return block_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto.getDefaultInstance() : block_;
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
      if (!getBlock().isInitialized()) {
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
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto) obj;

      if (hasBlock() != other.hasBlock()) return false;
      if (hasBlock()) {
        if (!getBlock()
            .equals(other.getBlock())) return false;
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
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto prototype) {
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
     * Block with location information and new generation stamp
     * to be used for recovery.
     * </pre>
     *
     * Protobuf type {@code hadoop.hdfs.InitReplicaRecoveryRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.InitReplicaRecoveryRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_InitReplicaRecoveryRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_InitReplicaRecoveryRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto.newBuilder()
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
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_InitReplicaRecoveryRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto(this);
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto.getDefaultInstance()) return this;
        if (other.hasBlock()) {
          mergeBlock(other.getBlock());
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
        if (!getBlock().isInitialized()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto block_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProtoOrBuilder> blockBuilder_;
      /**
       * <code>required .hadoop.hdfs.RecoveringBlockProto block = 1;</code>
       */
      public boolean hasBlock() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required .hadoop.hdfs.RecoveringBlockProto block = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto getBlock() {
        if (blockBuilder_ == null) {
          return block_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto.getDefaultInstance() : block_;
        } else {
          return blockBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.RecoveringBlockProto block = 1;</code>
       */
      public Builder setBlock(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto value) {
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
       * <code>required .hadoop.hdfs.RecoveringBlockProto block = 1;</code>
       */
      public Builder setBlock(
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto.Builder builderForValue) {
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
       * <code>required .hadoop.hdfs.RecoveringBlockProto block = 1;</code>
       */
      public Builder mergeBlock(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto value) {
        if (blockBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              block_ != null &&
              block_ != org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto.getDefaultInstance()) {
            block_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto.newBuilder(block_).mergeFrom(value).buildPartial();
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
       * <code>required .hadoop.hdfs.RecoveringBlockProto block = 1;</code>
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
       * <code>required .hadoop.hdfs.RecoveringBlockProto block = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto.Builder getBlockBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getBlockFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.RecoveringBlockProto block = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProtoOrBuilder getBlockOrBuilder() {
        if (blockBuilder_ != null) {
          return blockBuilder_.getMessageOrBuilder();
        } else {
          return block_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto.getDefaultInstance() : block_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.RecoveringBlockProto block = 1;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProtoOrBuilder> 
          getBlockFieldBuilder() {
        if (blockBuilder_ == null) {
          blockBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProtoOrBuilder>(
                  getBlock(),
                  getParentForChildren(),
                  isClean());
          block_ = null;
        }
        return blockBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.InitReplicaRecoveryRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.InitReplicaRecoveryRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<InitReplicaRecoveryRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<InitReplicaRecoveryRequestProto>() {
      @java.lang.Override
      public InitReplicaRecoveryRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new InitReplicaRecoveryRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<InitReplicaRecoveryRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<InitReplicaRecoveryRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface InitReplicaRecoveryResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.InitReplicaRecoveryResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required bool replicaFound = 1;</code>
     */
    boolean hasReplicaFound();
    /**
     * <code>required bool replicaFound = 1;</code>
     */
    boolean getReplicaFound();

    /**
     * <pre>
     * The following entries are not set if there was no replica found.
     * </pre>
     *
     * <code>optional .hadoop.hdfs.ReplicaStateProto state = 2;</code>
     */
    boolean hasState();
    /**
     * <pre>
     * The following entries are not set if there was no replica found.
     * </pre>
     *
     * <code>optional .hadoop.hdfs.ReplicaStateProto state = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ReplicaStateProto getState();

    /**
     * <pre>
     * block information
     * </pre>
     *
     * <code>optional .hadoop.hdfs.BlockProto block = 3;</code>
     */
    boolean hasBlock();
    /**
     * <pre>
     * block information
     * </pre>
     *
     * <code>optional .hadoop.hdfs.BlockProto block = 3;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto getBlock();
    /**
     * <pre>
     * block information
     * </pre>
     *
     * <code>optional .hadoop.hdfs.BlockProto block = 3;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder getBlockOrBuilder();
  }
  /**
   * <pre>
   **
   * Repica recovery information
   * </pre>
   *
   * Protobuf type {@code hadoop.hdfs.InitReplicaRecoveryResponseProto}
   */
  public  static final class InitReplicaRecoveryResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.InitReplicaRecoveryResponseProto)
      InitReplicaRecoveryResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InitReplicaRecoveryResponseProto.newBuilder() to construct.
    private InitReplicaRecoveryResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InitReplicaRecoveryResponseProto() {
      state_ = 0;
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private InitReplicaRecoveryResponseProto(
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
              replicaFound_ = input.readBool();
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ReplicaStateProto value = org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ReplicaStateProto.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                state_ = rawValue;
              }
              break;
            }
            case 26: {
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) != 0)) {
                subBuilder = block_.toBuilder();
              }
              block_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(block_);
                block_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
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
      return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_InitReplicaRecoveryResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_InitReplicaRecoveryResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto.Builder.class);
    }

    private int bitField0_;
    public static final int REPLICAFOUND_FIELD_NUMBER = 1;
    private boolean replicaFound_;
    /**
     * <code>required bool replicaFound = 1;</code>
     */
    public boolean hasReplicaFound() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required bool replicaFound = 1;</code>
     */
    public boolean getReplicaFound() {
      return replicaFound_;
    }

    public static final int STATE_FIELD_NUMBER = 2;
    private int state_;
    /**
     * <pre>
     * The following entries are not set if there was no replica found.
     * </pre>
     *
     * <code>optional .hadoop.hdfs.ReplicaStateProto state = 2;</code>
     */
    public boolean hasState() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The following entries are not set if there was no replica found.
     * </pre>
     *
     * <code>optional .hadoop.hdfs.ReplicaStateProto state = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ReplicaStateProto getState() {
      @SuppressWarnings("deprecation")
      org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ReplicaStateProto result = org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ReplicaStateProto.valueOf(state_);
      return result == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ReplicaStateProto.FINALIZED : result;
    }

    public static final int BLOCK_FIELD_NUMBER = 3;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto block_;
    /**
     * <pre>
     * block information
     * </pre>
     *
     * <code>optional .hadoop.hdfs.BlockProto block = 3;</code>
     */
    public boolean hasBlock() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * block information
     * </pre>
     *
     * <code>optional .hadoop.hdfs.BlockProto block = 3;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto getBlock() {
      return block_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance() : block_;
    }
    /**
     * <pre>
     * block information
     * </pre>
     *
     * <code>optional .hadoop.hdfs.BlockProto block = 3;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder getBlockOrBuilder() {
      return block_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance() : block_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasReplicaFound()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasBlock()) {
        if (!getBlock().isInitialized()) {
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
        output.writeBool(1, replicaFound_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeEnum(2, state_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeMessage(3, getBlock());
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
          .computeBoolSize(1, replicaFound_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeEnumSize(2, state_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(3, getBlock());
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto) obj;

      if (hasReplicaFound() != other.hasReplicaFound()) return false;
      if (hasReplicaFound()) {
        if (getReplicaFound()
            != other.getReplicaFound()) return false;
      }
      if (hasState() != other.hasState()) return false;
      if (hasState()) {
        if (state_ != other.state_) return false;
      }
      if (hasBlock() != other.hasBlock()) return false;
      if (hasBlock()) {
        if (!getBlock()
            .equals(other.getBlock())) return false;
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
      if (hasReplicaFound()) {
        hash = (37 * hash) + REPLICAFOUND_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashBoolean(
            getReplicaFound());
      }
      if (hasState()) {
        hash = (37 * hash) + STATE_FIELD_NUMBER;
        hash = (53 * hash) + state_;
      }
      if (hasBlock()) {
        hash = (37 * hash) + BLOCK_FIELD_NUMBER;
        hash = (53 * hash) + getBlock().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto prototype) {
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
     * Repica recovery information
     * </pre>
     *
     * Protobuf type {@code hadoop.hdfs.InitReplicaRecoveryResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.InitReplicaRecoveryResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_InitReplicaRecoveryResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_InitReplicaRecoveryResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto.newBuilder()
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
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        replicaFound_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        state_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (blockBuilder_ == null) {
          block_ = null;
        } else {
          blockBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_InitReplicaRecoveryResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.replicaFound_ = replicaFound_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.state_ = state_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          if (blockBuilder_ == null) {
            result.block_ = block_;
          } else {
            result.block_ = blockBuilder_.build();
          }
          to_bitField0_ |= 0x00000004;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto.getDefaultInstance()) return this;
        if (other.hasReplicaFound()) {
          setReplicaFound(other.getReplicaFound());
        }
        if (other.hasState()) {
          setState(other.getState());
        }
        if (other.hasBlock()) {
          mergeBlock(other.getBlock());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasReplicaFound()) {
          return false;
        }
        if (hasBlock()) {
          if (!getBlock().isInitialized()) {
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
        org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean replicaFound_ ;
      /**
       * <code>required bool replicaFound = 1;</code>
       */
      public boolean hasReplicaFound() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required bool replicaFound = 1;</code>
       */
      public boolean getReplicaFound() {
        return replicaFound_;
      }
      /**
       * <code>required bool replicaFound = 1;</code>
       */
      public Builder setReplicaFound(boolean value) {
        bitField0_ |= 0x00000001;
        replicaFound_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool replicaFound = 1;</code>
       */
      public Builder clearReplicaFound() {
        bitField0_ = (bitField0_ & ~0x00000001);
        replicaFound_ = false;
        onChanged();
        return this;
      }

      private int state_ = 0;
      /**
       * <pre>
       * The following entries are not set if there was no replica found.
       * </pre>
       *
       * <code>optional .hadoop.hdfs.ReplicaStateProto state = 2;</code>
       */
      public boolean hasState() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * The following entries are not set if there was no replica found.
       * </pre>
       *
       * <code>optional .hadoop.hdfs.ReplicaStateProto state = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ReplicaStateProto getState() {
        @SuppressWarnings("deprecation")
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ReplicaStateProto result = org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ReplicaStateProto.valueOf(state_);
        return result == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ReplicaStateProto.FINALIZED : result;
      }
      /**
       * <pre>
       * The following entries are not set if there was no replica found.
       * </pre>
       *
       * <code>optional .hadoop.hdfs.ReplicaStateProto state = 2;</code>
       */
      public Builder setState(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ReplicaStateProto value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        state_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The following entries are not set if there was no replica found.
       * </pre>
       *
       * <code>optional .hadoop.hdfs.ReplicaStateProto state = 2;</code>
       */
      public Builder clearState() {
        bitField0_ = (bitField0_ & ~0x00000002);
        state_ = 0;
        onChanged();
        return this;
      }

      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto block_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder> blockBuilder_;
      /**
       * <pre>
       * block information
       * </pre>
       *
       * <code>optional .hadoop.hdfs.BlockProto block = 3;</code>
       */
      public boolean hasBlock() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * block information
       * </pre>
       *
       * <code>optional .hadoop.hdfs.BlockProto block = 3;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto getBlock() {
        if (blockBuilder_ == null) {
          return block_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance() : block_;
        } else {
          return blockBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * block information
       * </pre>
       *
       * <code>optional .hadoop.hdfs.BlockProto block = 3;</code>
       */
      public Builder setBlock(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto value) {
        if (blockBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          block_ = value;
          onChanged();
        } else {
          blockBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <pre>
       * block information
       * </pre>
       *
       * <code>optional .hadoop.hdfs.BlockProto block = 3;</code>
       */
      public Builder setBlock(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder builderForValue) {
        if (blockBuilder_ == null) {
          block_ = builderForValue.build();
          onChanged();
        } else {
          blockBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <pre>
       * block information
       * </pre>
       *
       * <code>optional .hadoop.hdfs.BlockProto block = 3;</code>
       */
      public Builder mergeBlock(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto value) {
        if (blockBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0) &&
              block_ != null &&
              block_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance()) {
            block_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.newBuilder(block_).mergeFrom(value).buildPartial();
          } else {
            block_ = value;
          }
          onChanged();
        } else {
          blockBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <pre>
       * block information
       * </pre>
       *
       * <code>optional .hadoop.hdfs.BlockProto block = 3;</code>
       */
      public Builder clearBlock() {
        if (blockBuilder_ == null) {
          block_ = null;
          onChanged();
        } else {
          blockBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <pre>
       * block information
       * </pre>
       *
       * <code>optional .hadoop.hdfs.BlockProto block = 3;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder getBlockBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getBlockFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * block information
       * </pre>
       *
       * <code>optional .hadoop.hdfs.BlockProto block = 3;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder getBlockOrBuilder() {
        if (blockBuilder_ != null) {
          return blockBuilder_.getMessageOrBuilder();
        } else {
          return block_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance() : block_;
        }
      }
      /**
       * <pre>
       * block information
       * </pre>
       *
       * <code>optional .hadoop.hdfs.BlockProto block = 3;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder> 
          getBlockFieldBuilder() {
        if (blockBuilder_ == null) {
          blockBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder>(
                  getBlock(),
                  getParentForChildren(),
                  isClean());
          block_ = null;
        }
        return blockBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.InitReplicaRecoveryResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.InitReplicaRecoveryResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<InitReplicaRecoveryResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<InitReplicaRecoveryResponseProto>() {
      @java.lang.Override
      public InitReplicaRecoveryResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new InitReplicaRecoveryResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<InitReplicaRecoveryResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<InitReplicaRecoveryResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface UpdateReplicaUnderRecoveryRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.UpdateReplicaUnderRecoveryRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Block identifier
     * </pre>
     *
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     */
    boolean hasBlock();
    /**
     * <pre>
     * Block identifier
     * </pre>
     *
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto getBlock();
    /**
     * <pre>
     * Block identifier
     * </pre>
     *
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProtoOrBuilder getBlockOrBuilder();

    /**
     * <pre>
     * New genstamp of the replica
     * </pre>
     *
     * <code>required uint64 recoveryId = 2;</code>
     */
    boolean hasRecoveryId();
    /**
     * <pre>
     * New genstamp of the replica
     * </pre>
     *
     * <code>required uint64 recoveryId = 2;</code>
     */
    long getRecoveryId();

    /**
     * <pre>
     * New length of the replica
     * </pre>
     *
     * <code>required uint64 newLength = 3;</code>
     */
    boolean hasNewLength();
    /**
     * <pre>
     * New length of the replica
     * </pre>
     *
     * <code>required uint64 newLength = 3;</code>
     */
    long getNewLength();

    /**
     * <pre>
     * New blockId for copy (truncate), default is 0.
     * </pre>
     *
     * <code>optional uint64 newBlockId = 4 [default = 0];</code>
     */
    boolean hasNewBlockId();
    /**
     * <pre>
     * New blockId for copy (truncate), default is 0.
     * </pre>
     *
     * <code>optional uint64 newBlockId = 4 [default = 0];</code>
     */
    long getNewBlockId();
  }
  /**
   * <pre>
   **
   * Update replica with new generation stamp and length
   * </pre>
   *
   * Protobuf type {@code hadoop.hdfs.UpdateReplicaUnderRecoveryRequestProto}
   */
  public  static final class UpdateReplicaUnderRecoveryRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.UpdateReplicaUnderRecoveryRequestProto)
      UpdateReplicaUnderRecoveryRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UpdateReplicaUnderRecoveryRequestProto.newBuilder() to construct.
    private UpdateReplicaUnderRecoveryRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UpdateReplicaUnderRecoveryRequestProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UpdateReplicaUnderRecoveryRequestProto(
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
            case 16: {
              bitField0_ |= 0x00000002;
              recoveryId_ = input.readUInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              newLength_ = input.readUInt64();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              newBlockId_ = input.readUInt64();
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
      return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto.Builder.class);
    }

    private int bitField0_;
    public static final int BLOCK_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto block_;
    /**
     * <pre>
     * Block identifier
     * </pre>
     *
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     */
    public boolean hasBlock() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Block identifier
     * </pre>
     *
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto getBlock() {
      return block_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.getDefaultInstance() : block_;
    }
    /**
     * <pre>
     * Block identifier
     * </pre>
     *
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProtoOrBuilder getBlockOrBuilder() {
      return block_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.getDefaultInstance() : block_;
    }

    public static final int RECOVERYID_FIELD_NUMBER = 2;
    private long recoveryId_;
    /**
     * <pre>
     * New genstamp of the replica
     * </pre>
     *
     * <code>required uint64 recoveryId = 2;</code>
     */
    public boolean hasRecoveryId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * New genstamp of the replica
     * </pre>
     *
     * <code>required uint64 recoveryId = 2;</code>
     */
    public long getRecoveryId() {
      return recoveryId_;
    }

    public static final int NEWLENGTH_FIELD_NUMBER = 3;
    private long newLength_;
    /**
     * <pre>
     * New length of the replica
     * </pre>
     *
     * <code>required uint64 newLength = 3;</code>
     */
    public boolean hasNewLength() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * New length of the replica
     * </pre>
     *
     * <code>required uint64 newLength = 3;</code>
     */
    public long getNewLength() {
      return newLength_;
    }

    public static final int NEWBLOCKID_FIELD_NUMBER = 4;
    private long newBlockId_;
    /**
     * <pre>
     * New blockId for copy (truncate), default is 0.
     * </pre>
     *
     * <code>optional uint64 newBlockId = 4 [default = 0];</code>
     */
    public boolean hasNewBlockId() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * New blockId for copy (truncate), default is 0.
     * </pre>
     *
     * <code>optional uint64 newBlockId = 4 [default = 0];</code>
     */
    public long getNewBlockId() {
      return newBlockId_;
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
      if (!hasRecoveryId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasNewLength()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getBlock().isInitialized()) {
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
        output.writeUInt64(2, recoveryId_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeUInt64(3, newLength_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeUInt64(4, newBlockId_);
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
          .computeUInt64Size(2, recoveryId_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeUInt64Size(3, newLength_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeUInt64Size(4, newBlockId_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto) obj;

      if (hasBlock() != other.hasBlock()) return false;
      if (hasBlock()) {
        if (!getBlock()
            .equals(other.getBlock())) return false;
      }
      if (hasRecoveryId() != other.hasRecoveryId()) return false;
      if (hasRecoveryId()) {
        if (getRecoveryId()
            != other.getRecoveryId()) return false;
      }
      if (hasNewLength() != other.hasNewLength()) return false;
      if (hasNewLength()) {
        if (getNewLength()
            != other.getNewLength()) return false;
      }
      if (hasNewBlockId() != other.hasNewBlockId()) return false;
      if (hasNewBlockId()) {
        if (getNewBlockId()
            != other.getNewBlockId()) return false;
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
      if (hasRecoveryId()) {
        hash = (37 * hash) + RECOVERYID_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getRecoveryId());
      }
      if (hasNewLength()) {
        hash = (37 * hash) + NEWLENGTH_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getNewLength());
      }
      if (hasNewBlockId()) {
        hash = (37 * hash) + NEWBLOCKID_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getNewBlockId());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto prototype) {
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
     * Update replica with new generation stamp and length
     * </pre>
     *
     * Protobuf type {@code hadoop.hdfs.UpdateReplicaUnderRecoveryRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.UpdateReplicaUnderRecoveryRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto.newBuilder()
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
        recoveryId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        newLength_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        newBlockId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto(this);
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
          result.recoveryId_ = recoveryId_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.newLength_ = newLength_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.newBlockId_ = newBlockId_;
          to_bitField0_ |= 0x00000008;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto.getDefaultInstance()) return this;
        if (other.hasBlock()) {
          mergeBlock(other.getBlock());
        }
        if (other.hasRecoveryId()) {
          setRecoveryId(other.getRecoveryId());
        }
        if (other.hasNewLength()) {
          setNewLength(other.getNewLength());
        }
        if (other.hasNewBlockId()) {
          setNewBlockId(other.getNewBlockId());
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
        if (!hasRecoveryId()) {
          return false;
        }
        if (!hasNewLength()) {
          return false;
        }
        if (!getBlock().isInitialized()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto) e.getUnfinishedMessage();
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
       * <pre>
       * Block identifier
       * </pre>
       *
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public boolean hasBlock() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Block identifier
       * </pre>
       *
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
       * <pre>
       * Block identifier
       * </pre>
       *
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
       * <pre>
       * Block identifier
       * </pre>
       *
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
       * <pre>
       * Block identifier
       * </pre>
       *
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
       * <pre>
       * Block identifier
       * </pre>
       *
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
       * <pre>
       * Block identifier
       * </pre>
       *
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.Builder getBlockBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getBlockFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * Block identifier
       * </pre>
       *
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
       * <pre>
       * Block identifier
       * </pre>
       *
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

      private long recoveryId_ ;
      /**
       * <pre>
       * New genstamp of the replica
       * </pre>
       *
       * <code>required uint64 recoveryId = 2;</code>
       */
      public boolean hasRecoveryId() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * New genstamp of the replica
       * </pre>
       *
       * <code>required uint64 recoveryId = 2;</code>
       */
      public long getRecoveryId() {
        return recoveryId_;
      }
      /**
       * <pre>
       * New genstamp of the replica
       * </pre>
       *
       * <code>required uint64 recoveryId = 2;</code>
       */
      public Builder setRecoveryId(long value) {
        bitField0_ |= 0x00000002;
        recoveryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * New genstamp of the replica
       * </pre>
       *
       * <code>required uint64 recoveryId = 2;</code>
       */
      public Builder clearRecoveryId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        recoveryId_ = 0L;
        onChanged();
        return this;
      }

      private long newLength_ ;
      /**
       * <pre>
       * New length of the replica
       * </pre>
       *
       * <code>required uint64 newLength = 3;</code>
       */
      public boolean hasNewLength() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * New length of the replica
       * </pre>
       *
       * <code>required uint64 newLength = 3;</code>
       */
      public long getNewLength() {
        return newLength_;
      }
      /**
       * <pre>
       * New length of the replica
       * </pre>
       *
       * <code>required uint64 newLength = 3;</code>
       */
      public Builder setNewLength(long value) {
        bitField0_ |= 0x00000004;
        newLength_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * New length of the replica
       * </pre>
       *
       * <code>required uint64 newLength = 3;</code>
       */
      public Builder clearNewLength() {
        bitField0_ = (bitField0_ & ~0x00000004);
        newLength_ = 0L;
        onChanged();
        return this;
      }

      private long newBlockId_ ;
      /**
       * <pre>
       * New blockId for copy (truncate), default is 0.
       * </pre>
       *
       * <code>optional uint64 newBlockId = 4 [default = 0];</code>
       */
      public boolean hasNewBlockId() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <pre>
       * New blockId for copy (truncate), default is 0.
       * </pre>
       *
       * <code>optional uint64 newBlockId = 4 [default = 0];</code>
       */
      public long getNewBlockId() {
        return newBlockId_;
      }
      /**
       * <pre>
       * New blockId for copy (truncate), default is 0.
       * </pre>
       *
       * <code>optional uint64 newBlockId = 4 [default = 0];</code>
       */
      public Builder setNewBlockId(long value) {
        bitField0_ |= 0x00000008;
        newBlockId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * New blockId for copy (truncate), default is 0.
       * </pre>
       *
       * <code>optional uint64 newBlockId = 4 [default = 0];</code>
       */
      public Builder clearNewBlockId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        newBlockId_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.UpdateReplicaUnderRecoveryRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.UpdateReplicaUnderRecoveryRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<UpdateReplicaUnderRecoveryRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<UpdateReplicaUnderRecoveryRequestProto>() {
      @java.lang.Override
      public UpdateReplicaUnderRecoveryRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new UpdateReplicaUnderRecoveryRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<UpdateReplicaUnderRecoveryRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<UpdateReplicaUnderRecoveryRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface UpdateReplicaUnderRecoveryResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.UpdateReplicaUnderRecoveryResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * ID of the storage that stores replica
     * </pre>
     *
     * <code>optional string storageUuid = 1;</code>
     */
    boolean hasStorageUuid();
    /**
     * <pre>
     * ID of the storage that stores replica
     * </pre>
     *
     * <code>optional string storageUuid = 1;</code>
     */
    java.lang.String getStorageUuid();
    /**
     * <pre>
     * ID of the storage that stores replica
     * </pre>
     *
     * <code>optional string storageUuid = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getStorageUuidBytes();
  }
  /**
   * <pre>
   **
   * Response returns updated block information
   * </pre>
   *
   * Protobuf type {@code hadoop.hdfs.UpdateReplicaUnderRecoveryResponseProto}
   */
  public  static final class UpdateReplicaUnderRecoveryResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.UpdateReplicaUnderRecoveryResponseProto)
      UpdateReplicaUnderRecoveryResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UpdateReplicaUnderRecoveryResponseProto.newBuilder() to construct.
    private UpdateReplicaUnderRecoveryResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UpdateReplicaUnderRecoveryResponseProto() {
      storageUuid_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UpdateReplicaUnderRecoveryResponseProto(
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
              storageUuid_ = bs;
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
      return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto.Builder.class);
    }

    private int bitField0_;
    public static final int STORAGEUUID_FIELD_NUMBER = 1;
    private volatile java.lang.Object storageUuid_;
    /**
     * <pre>
     * ID of the storage that stores replica
     * </pre>
     *
     * <code>optional string storageUuid = 1;</code>
     */
    public boolean hasStorageUuid() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * ID of the storage that stores replica
     * </pre>
     *
     * <code>optional string storageUuid = 1;</code>
     */
    public java.lang.String getStorageUuid() {
      java.lang.Object ref = storageUuid_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          storageUuid_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * ID of the storage that stores replica
     * </pre>
     *
     * <code>optional string storageUuid = 1;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getStorageUuidBytes() {
      java.lang.Object ref = storageUuid_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        storageUuid_ = b;
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, storageUuid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, storageUuid_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto) obj;

      if (hasStorageUuid() != other.hasStorageUuid()) return false;
      if (hasStorageUuid()) {
        if (!getStorageUuid()
            .equals(other.getStorageUuid())) return false;
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
      if (hasStorageUuid()) {
        hash = (37 * hash) + STORAGEUUID_FIELD_NUMBER;
        hash = (53 * hash) + getStorageUuid().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto prototype) {
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
     * Response returns updated block information
     * </pre>
     *
     * Protobuf type {@code hadoop.hdfs.UpdateReplicaUnderRecoveryResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.UpdateReplicaUnderRecoveryResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto.newBuilder()
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
        storageUuid_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.storageUuid_ = storageUuid_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto.getDefaultInstance()) return this;
        if (other.hasStorageUuid()) {
          bitField0_ |= 0x00000001;
          storageUuid_ = other.storageUuid_;
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
        org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object storageUuid_ = "";
      /**
       * <pre>
       * ID of the storage that stores replica
       * </pre>
       *
       * <code>optional string storageUuid = 1;</code>
       */
      public boolean hasStorageUuid() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * ID of the storage that stores replica
       * </pre>
       *
       * <code>optional string storageUuid = 1;</code>
       */
      public java.lang.String getStorageUuid() {
        java.lang.Object ref = storageUuid_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            storageUuid_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * ID of the storage that stores replica
       * </pre>
       *
       * <code>optional string storageUuid = 1;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getStorageUuidBytes() {
        java.lang.Object ref = storageUuid_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          storageUuid_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * ID of the storage that stores replica
       * </pre>
       *
       * <code>optional string storageUuid = 1;</code>
       */
      public Builder setStorageUuid(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        storageUuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ID of the storage that stores replica
       * </pre>
       *
       * <code>optional string storageUuid = 1;</code>
       */
      public Builder clearStorageUuid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        storageUuid_ = getDefaultInstance().getStorageUuid();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ID of the storage that stores replica
       * </pre>
       *
       * <code>optional string storageUuid = 1;</code>
       */
      public Builder setStorageUuidBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        storageUuid_ = value;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.UpdateReplicaUnderRecoveryResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.UpdateReplicaUnderRecoveryResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<UpdateReplicaUnderRecoveryResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<UpdateReplicaUnderRecoveryResponseProto>() {
      @java.lang.Override
      public UpdateReplicaUnderRecoveryResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new UpdateReplicaUnderRecoveryResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<UpdateReplicaUnderRecoveryResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<UpdateReplicaUnderRecoveryResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  /**
   * <pre>
   **
   * Protocol used between datanodes for block recovery.
   * See the request and response for details of rpc call.
   * </pre>
   *
   * Protobuf service {@code hadoop.hdfs.InterDatanodeProtocolService}
   */
  public static abstract class InterDatanodeProtocolService
      implements org.apache.hadoop.thirdparty.protobuf.Service {
    protected InterDatanodeProtocolService() {}

    public interface Interface {
      /**
       * <pre>
       **
       * Initialize recovery of a replica
       * </pre>
       *
       * <code>rpc initReplicaRecovery(.hadoop.hdfs.InitReplicaRecoveryRequestProto) returns (.hadoop.hdfs.InitReplicaRecoveryResponseProto);</code>
       */
      public abstract void initReplicaRecovery(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto> done);

      /**
       * <pre>
       **
       * Update a replica with new generation stamp and length
       * </pre>
       *
       * <code>rpc updateReplicaUnderRecovery(.hadoop.hdfs.UpdateReplicaUnderRecoveryRequestProto) returns (.hadoop.hdfs.UpdateReplicaUnderRecoveryResponseProto);</code>
       */
      public abstract void updateReplicaUnderRecovery(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto> done);

    }

    public static org.apache.hadoop.thirdparty.protobuf.Service newReflectiveService(
        final Interface impl) {
      return new InterDatanodeProtocolService() {
        @java.lang.Override
        public  void initReplicaRecovery(
            org.apache.hadoop.thirdparty.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto request,
            org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto> done) {
          impl.initReplicaRecovery(controller, request, done);
        }

        @java.lang.Override
        public  void updateReplicaUnderRecovery(
            org.apache.hadoop.thirdparty.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto request,
            org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto> done) {
          impl.updateReplicaUnderRecovery(controller, request, done);
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
              return impl.initReplicaRecovery(controller, (org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto)request);
            case 1:
              return impl.updateReplicaUnderRecovery(controller, (org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto)request);
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
              return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto.getDefaultInstance();
            case 1:
              return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto.getDefaultInstance();
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
              return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto.getDefaultInstance();
            case 1:
              return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

      };
    }

    /**
     * <pre>
     **
     * Initialize recovery of a replica
     * </pre>
     *
     * <code>rpc initReplicaRecovery(.hadoop.hdfs.InitReplicaRecoveryRequestProto) returns (.hadoop.hdfs.InitReplicaRecoveryResponseProto);</code>
     */
    public abstract void initReplicaRecovery(
        org.apache.hadoop.thirdparty.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto request,
        org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto> done);

    /**
     * <pre>
     **
     * Update a replica with new generation stamp and length
     * </pre>
     *
     * <code>rpc updateReplicaUnderRecovery(.hadoop.hdfs.UpdateReplicaUnderRecoveryRequestProto) returns (.hadoop.hdfs.UpdateReplicaUnderRecoveryResponseProto);</code>
     */
    public abstract void updateReplicaUnderRecovery(
        org.apache.hadoop.thirdparty.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto request,
        org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto> done);

    public static final
        org.apache.hadoop.thirdparty.protobuf.Descriptors.ServiceDescriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.getDescriptor().getServices().get(0);
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
          this.initReplicaRecovery(controller, (org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto)request,
            org.apache.hadoop.thirdparty.protobuf.RpcUtil.<org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto>specializeCallback(
              done));
          return;
        case 1:
          this.updateReplicaUnderRecovery(controller, (org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto)request,
            org.apache.hadoop.thirdparty.protobuf.RpcUtil.<org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto>specializeCallback(
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
          return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto.getDefaultInstance();
        case 1:
          return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto.getDefaultInstance();
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
          return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto.getDefaultInstance();
        case 1:
          return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public static Stub newStub(
        org.apache.hadoop.thirdparty.protobuf.RpcChannel channel) {
      return new Stub(channel);
    }

    public static final class Stub extends org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InterDatanodeProtocolService implements Interface {
      private Stub(org.apache.hadoop.thirdparty.protobuf.RpcChannel channel) {
        this.channel = channel;
      }

      private final org.apache.hadoop.thirdparty.protobuf.RpcChannel channel;

      public org.apache.hadoop.thirdparty.protobuf.RpcChannel getChannel() {
        return channel;
      }

      public  void initReplicaRecovery(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto.getDefaultInstance(),
          org.apache.hadoop.thirdparty.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto.class,
            org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto.getDefaultInstance()));
      }

      public  void updateReplicaUnderRecovery(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto.getDefaultInstance(),
          org.apache.hadoop.thirdparty.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto.class,
            org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto.getDefaultInstance()));
      }
    }

    public static BlockingInterface newBlockingStub(
        org.apache.hadoop.thirdparty.protobuf.BlockingRpcChannel channel) {
      return new BlockingStub(channel);
    }

    public interface BlockingInterface {
      public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto initReplicaRecovery(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException;

      public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto updateReplicaUnderRecovery(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException;
    }

    private static final class BlockingStub implements BlockingInterface {
      private BlockingStub(org.apache.hadoop.thirdparty.protobuf.BlockingRpcChannel channel) {
        this.channel = channel;
      }

      private final org.apache.hadoop.thirdparty.protobuf.BlockingRpcChannel channel;

      public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto initReplicaRecovery(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto updateReplicaUnderRecovery(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto.getDefaultInstance());
      }

    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.InterDatanodeProtocolService)
  }

  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_InitReplicaRecoveryRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_InitReplicaRecoveryRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_InitReplicaRecoveryResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_InitReplicaRecoveryResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryResponseProto_fieldAccessorTable;

  public static org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033InterDatanodeProtocol.proto\022\013hadoop.hd" +
      "fs\032\nhdfs.proto\032\020HdfsServer.proto\"S\n\037Init" +
      "ReplicaRecoveryRequestProto\0220\n\005block\030\001 \002" +
      "(\0132!.hadoop.hdfs.RecoveringBlockProto\"\217\001" +
      "\n InitReplicaRecoveryResponseProto\022\024\n\014re" +
      "plicaFound\030\001 \002(\010\022-\n\005state\030\002 \001(\0162\036.hadoop" +
      ".hdfs.ReplicaStateProto\022&\n\005block\030\003 \001(\0132\027" +
      ".hadoop.hdfs.BlockProto\"\226\001\n&UpdateReplic" +
      "aUnderRecoveryRequestProto\022.\n\005block\030\001 \002(" +
      "\0132\037.hadoop.hdfs.ExtendedBlockProto\022\022\n\nre" +
      "coveryId\030\002 \002(\004\022\021\n\tnewLength\030\003 \002(\004\022\025\n\nnew" +
      "BlockId\030\004 \001(\004:\0010\">\n\'UpdateReplicaUnderRe" +
      "coveryResponseProto\022\023\n\013storageUuid\030\001 \001(\t" +
      "2\234\002\n\034InterDatanodeProtocolService\022r\n\023ini" +
      "tReplicaRecovery\022,.hadoop.hdfs.InitRepli" +
      "caRecoveryRequestProto\032-.hadoop.hdfs.Ini" +
      "tReplicaRecoveryResponseProto\022\207\001\n\032update" +
      "ReplicaUnderRecovery\0223.hadoop.hdfs.Updat" +
      "eReplicaUnderRecoveryRequestProto\0324.hado" +
      "op.hdfs.UpdateReplicaUnderRecoveryRespon" +
      "seProtoBJ\n%org.apache.hadoop.hdfs.protoc" +
      "ol.protoB\033InterDatanodeProtocolProtos\210\001\001" +
      "\240\001\001"
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
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.getDescriptor(),
        }, assigner);
    internal_static_hadoop_hdfs_InitReplicaRecoveryRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hadoop_hdfs_InitReplicaRecoveryRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_InitReplicaRecoveryRequestProto_descriptor,
        new java.lang.String[] { "Block", });
    internal_static_hadoop_hdfs_InitReplicaRecoveryResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hadoop_hdfs_InitReplicaRecoveryResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_InitReplicaRecoveryResponseProto_descriptor,
        new java.lang.String[] { "ReplicaFound", "State", "Block", });
    internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryRequestProto_descriptor,
        new java.lang.String[] { "Block", "RecoveryId", "NewLength", "NewBlockId", });
    internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryResponseProto_descriptor,
        new java.lang.String[] { "StorageUuid", });
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.getDescriptor();
    org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
