// source: GenericRefreshProtocol.proto

package org.apache.hadoop.ipc.proto;

public final class GenericRefreshProtocolProtos {
  private GenericRefreshProtocolProtos() {}
  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GenericRefreshRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.GenericRefreshRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>optional string identifier = 1;</code>
     */
    boolean hasIdentifier();
    /**
     * <code>optional string identifier = 1;</code>
     */
    java.lang.String getIdentifier();
    /**
     * <code>optional string identifier = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getIdentifierBytes();

    /**
     * <code>repeated string args = 2;</code>
     */
    java.util.List<java.lang.String>
        getArgsList();
    /**
     * <code>repeated string args = 2;</code>
     */
    int getArgsCount();
    /**
     * <code>repeated string args = 2;</code>
     */
    java.lang.String getArgs(int index);
    /**
     * <code>repeated string args = 2;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getArgsBytes(int index);
  }
  /**
   * <pre>
   **
   *  Refresh request.
   * </pre>
   *
   * Protobuf type {@code hadoop.common.GenericRefreshRequestProto}
   */
  public  static final class GenericRefreshRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.GenericRefreshRequestProto)
      GenericRefreshRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GenericRefreshRequestProto.newBuilder() to construct.
    private GenericRefreshRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GenericRefreshRequestProto() {
      identifier_ = "";
      args_ = org.apache.hadoop.thirdparty.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GenericRefreshRequestProto(
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
              identifier_ = bs;
              break;
            }
            case 18: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                args_ = new org.apache.hadoop.thirdparty.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000002;
              }
              args_.add(bs);
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
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          args_ = args_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.internal_static_hadoop_common_GenericRefreshRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.internal_static_hadoop_common_GenericRefreshRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto.class, org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto.Builder.class);
    }

    private int bitField0_;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    private volatile java.lang.Object identifier_;
    /**
     * <code>optional string identifier = 1;</code>
     */
    public boolean hasIdentifier() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string identifier = 1;</code>
     */
    public java.lang.String getIdentifier() {
      java.lang.Object ref = identifier_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          identifier_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string identifier = 1;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getIdentifierBytes() {
      java.lang.Object ref = identifier_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        identifier_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int ARGS_FIELD_NUMBER = 2;
    private org.apache.hadoop.thirdparty.protobuf.LazyStringList args_;
    /**
     * <code>repeated string args = 2;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ProtocolStringList
        getArgsList() {
      return args_;
    }
    /**
     * <code>repeated string args = 2;</code>
     */
    public int getArgsCount() {
      return args_.size();
    }
    /**
     * <code>repeated string args = 2;</code>
     */
    public java.lang.String getArgs(int index) {
      return args_.get(index);
    }
    /**
     * <code>repeated string args = 2;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getArgsBytes(int index) {
      return args_.getByteString(index);
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, identifier_);
      }
      for (int i = 0; i < args_.size(); i++) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 2, args_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, identifier_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < args_.size(); i++) {
          dataSize += computeStringSizeNoTag(args_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getArgsList().size();
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
      if (!(obj instanceof org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto other = (org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto) obj;

      if (hasIdentifier() != other.hasIdentifier()) return false;
      if (hasIdentifier()) {
        if (!getIdentifier()
            .equals(other.getIdentifier())) return false;
      }
      if (!getArgsList()
          .equals(other.getArgsList())) return false;
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
      if (hasIdentifier()) {
        hash = (37 * hash) + IDENTIFIER_FIELD_NUMBER;
        hash = (53 * hash) + getIdentifier().hashCode();
      }
      if (getArgsCount() > 0) {
        hash = (37 * hash) + ARGS_FIELD_NUMBER;
        hash = (53 * hash) + getArgsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto prototype) {
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
     *  Refresh request.
     * </pre>
     *
     * Protobuf type {@code hadoop.common.GenericRefreshRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.GenericRefreshRequestProto)
        org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.internal_static_hadoop_common_GenericRefreshRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.internal_static_hadoop_common_GenericRefreshRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto.class, org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto.newBuilder()
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
        identifier_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        args_ = org.apache.hadoop.thirdparty.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.internal_static_hadoop_common_GenericRefreshRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto build() {
        org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto buildPartial() {
        org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto result = new org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.identifier_ = identifier_;
        if (((bitField0_ & 0x00000002) != 0)) {
          args_ = args_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.args_ = args_;
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
        if (other instanceof org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto) {
          return mergeFrom((org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto other) {
        if (other == org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto.getDefaultInstance()) return this;
        if (other.hasIdentifier()) {
          bitField0_ |= 0x00000001;
          identifier_ = other.identifier_;
          onChanged();
        }
        if (!other.args_.isEmpty()) {
          if (args_.isEmpty()) {
            args_ = other.args_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureArgsIsMutable();
            args_.addAll(other.args_);
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
        org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object identifier_ = "";
      /**
       * <code>optional string identifier = 1;</code>
       */
      public boolean hasIdentifier() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional string identifier = 1;</code>
       */
      public java.lang.String getIdentifier() {
        java.lang.Object ref = identifier_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            identifier_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string identifier = 1;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getIdentifierBytes() {
        java.lang.Object ref = identifier_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          identifier_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string identifier = 1;</code>
       */
      public Builder setIdentifier(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        identifier_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string identifier = 1;</code>
       */
      public Builder clearIdentifier() {
        bitField0_ = (bitField0_ & ~0x00000001);
        identifier_ = getDefaultInstance().getIdentifier();
        onChanged();
        return this;
      }
      /**
       * <code>optional string identifier = 1;</code>
       */
      public Builder setIdentifierBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        identifier_ = value;
        onChanged();
        return this;
      }

      private org.apache.hadoop.thirdparty.protobuf.LazyStringList args_ = org.apache.hadoop.thirdparty.protobuf.LazyStringArrayList.EMPTY;
      private void ensureArgsIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          args_ = new org.apache.hadoop.thirdparty.protobuf.LazyStringArrayList(args_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated string args = 2;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ProtocolStringList
          getArgsList() {
        return args_.getUnmodifiableView();
      }
      /**
       * <code>repeated string args = 2;</code>
       */
      public int getArgsCount() {
        return args_.size();
      }
      /**
       * <code>repeated string args = 2;</code>
       */
      public java.lang.String getArgs(int index) {
        return args_.get(index);
      }
      /**
       * <code>repeated string args = 2;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getArgsBytes(int index) {
        return args_.getByteString(index);
      }
      /**
       * <code>repeated string args = 2;</code>
       */
      public Builder setArgs(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureArgsIsMutable();
        args_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string args = 2;</code>
       */
      public Builder addArgs(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureArgsIsMutable();
        args_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string args = 2;</code>
       */
      public Builder addAllArgs(
          java.lang.Iterable<java.lang.String> values) {
        ensureArgsIsMutable();
        org.apache.hadoop.thirdparty.protobuf.AbstractMessageLite.Builder.addAll(
            values, args_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string args = 2;</code>
       */
      public Builder clearArgs() {
        args_ = org.apache.hadoop.thirdparty.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string args = 2;</code>
       */
      public Builder addArgsBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureArgsIsMutable();
        args_.add(value);
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.GenericRefreshRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.GenericRefreshRequestProto)
    private static final org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto();
    }

    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<GenericRefreshRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<GenericRefreshRequestProto>() {
      @java.lang.Override
      public GenericRefreshRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new GenericRefreshRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<GenericRefreshRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<GenericRefreshRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GenericRefreshResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.GenericRefreshResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * unix exit status to return
     * </pre>
     *
     * <code>optional int32 exitStatus = 1;</code>
     */
    boolean hasExitStatus();
    /**
     * <pre>
     * unix exit status to return
     * </pre>
     *
     * <code>optional int32 exitStatus = 1;</code>
     */
    int getExitStatus();

    /**
     * <pre>
     * to be displayed to the user
     * </pre>
     *
     * <code>optional string userMessage = 2;</code>
     */
    boolean hasUserMessage();
    /**
     * <pre>
     * to be displayed to the user
     * </pre>
     *
     * <code>optional string userMessage = 2;</code>
     */
    java.lang.String getUserMessage();
    /**
     * <pre>
     * to be displayed to the user
     * </pre>
     *
     * <code>optional string userMessage = 2;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getUserMessageBytes();

    /**
     * <pre>
     * which handler sent this message
     * </pre>
     *
     * <code>optional string senderName = 3;</code>
     */
    boolean hasSenderName();
    /**
     * <pre>
     * which handler sent this message
     * </pre>
     *
     * <code>optional string senderName = 3;</code>
     */
    java.lang.String getSenderName();
    /**
     * <pre>
     * which handler sent this message
     * </pre>
     *
     * <code>optional string senderName = 3;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getSenderNameBytes();
  }
  /**
   * <pre>
   **
   * A single response from a refresh handler.
   * </pre>
   *
   * Protobuf type {@code hadoop.common.GenericRefreshResponseProto}
   */
  public  static final class GenericRefreshResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.GenericRefreshResponseProto)
      GenericRefreshResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GenericRefreshResponseProto.newBuilder() to construct.
    private GenericRefreshResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GenericRefreshResponseProto() {
      userMessage_ = "";
      senderName_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GenericRefreshResponseProto(
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
              exitStatus_ = input.readInt32();
              break;
            }
            case 18: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              userMessage_ = bs;
              break;
            }
            case 26: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              senderName_ = bs;
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
      return org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.internal_static_hadoop_common_GenericRefreshResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.internal_static_hadoop_common_GenericRefreshResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto.class, org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto.Builder.class);
    }

    private int bitField0_;
    public static final int EXITSTATUS_FIELD_NUMBER = 1;
    private int exitStatus_;
    /**
     * <pre>
     * unix exit status to return
     * </pre>
     *
     * <code>optional int32 exitStatus = 1;</code>
     */
    public boolean hasExitStatus() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * unix exit status to return
     * </pre>
     *
     * <code>optional int32 exitStatus = 1;</code>
     */
    public int getExitStatus() {
      return exitStatus_;
    }

    public static final int USERMESSAGE_FIELD_NUMBER = 2;
    private volatile java.lang.Object userMessage_;
    /**
     * <pre>
     * to be displayed to the user
     * </pre>
     *
     * <code>optional string userMessage = 2;</code>
     */
    public boolean hasUserMessage() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * to be displayed to the user
     * </pre>
     *
     * <code>optional string userMessage = 2;</code>
     */
    public java.lang.String getUserMessage() {
      java.lang.Object ref = userMessage_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          userMessage_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * to be displayed to the user
     * </pre>
     *
     * <code>optional string userMessage = 2;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getUserMessageBytes() {
      java.lang.Object ref = userMessage_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userMessage_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int SENDERNAME_FIELD_NUMBER = 3;
    private volatile java.lang.Object senderName_;
    /**
     * <pre>
     * which handler sent this message
     * </pre>
     *
     * <code>optional string senderName = 3;</code>
     */
    public boolean hasSenderName() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * which handler sent this message
     * </pre>
     *
     * <code>optional string senderName = 3;</code>
     */
    public java.lang.String getSenderName() {
      java.lang.Object ref = senderName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          senderName_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * which handler sent this message
     * </pre>
     *
     * <code>optional string senderName = 3;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getSenderNameBytes() {
      java.lang.Object ref = senderName_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        senderName_ = b;
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
        output.writeInt32(1, exitStatus_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 2, userMessage_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 3, senderName_);
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
          .computeInt32Size(1, exitStatus_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(2, userMessage_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(3, senderName_);
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
      if (!(obj instanceof org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto other = (org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto) obj;

      if (hasExitStatus() != other.hasExitStatus()) return false;
      if (hasExitStatus()) {
        if (getExitStatus()
            != other.getExitStatus()) return false;
      }
      if (hasUserMessage() != other.hasUserMessage()) return false;
      if (hasUserMessage()) {
        if (!getUserMessage()
            .equals(other.getUserMessage())) return false;
      }
      if (hasSenderName() != other.hasSenderName()) return false;
      if (hasSenderName()) {
        if (!getSenderName()
            .equals(other.getSenderName())) return false;
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
      if (hasExitStatus()) {
        hash = (37 * hash) + EXITSTATUS_FIELD_NUMBER;
        hash = (53 * hash) + getExitStatus();
      }
      if (hasUserMessage()) {
        hash = (37 * hash) + USERMESSAGE_FIELD_NUMBER;
        hash = (53 * hash) + getUserMessage().hashCode();
      }
      if (hasSenderName()) {
        hash = (37 * hash) + SENDERNAME_FIELD_NUMBER;
        hash = (53 * hash) + getSenderName().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto prototype) {
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
     * A single response from a refresh handler.
     * </pre>
     *
     * Protobuf type {@code hadoop.common.GenericRefreshResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.GenericRefreshResponseProto)
        org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.internal_static_hadoop_common_GenericRefreshResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.internal_static_hadoop_common_GenericRefreshResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto.class, org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto.newBuilder()
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
        exitStatus_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        userMessage_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        senderName_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.internal_static_hadoop_common_GenericRefreshResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto build() {
        org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto buildPartial() {
        org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto result = new org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.exitStatus_ = exitStatus_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.userMessage_ = userMessage_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.senderName_ = senderName_;
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
        if (other instanceof org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto) {
          return mergeFrom((org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto other) {
        if (other == org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto.getDefaultInstance()) return this;
        if (other.hasExitStatus()) {
          setExitStatus(other.getExitStatus());
        }
        if (other.hasUserMessage()) {
          bitField0_ |= 0x00000002;
          userMessage_ = other.userMessage_;
          onChanged();
        }
        if (other.hasSenderName()) {
          bitField0_ |= 0x00000004;
          senderName_ = other.senderName_;
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
        org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int exitStatus_ ;
      /**
       * <pre>
       * unix exit status to return
       * </pre>
       *
       * <code>optional int32 exitStatus = 1;</code>
       */
      public boolean hasExitStatus() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * unix exit status to return
       * </pre>
       *
       * <code>optional int32 exitStatus = 1;</code>
       */
      public int getExitStatus() {
        return exitStatus_;
      }
      /**
       * <pre>
       * unix exit status to return
       * </pre>
       *
       * <code>optional int32 exitStatus = 1;</code>
       */
      public Builder setExitStatus(int value) {
        bitField0_ |= 0x00000001;
        exitStatus_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * unix exit status to return
       * </pre>
       *
       * <code>optional int32 exitStatus = 1;</code>
       */
      public Builder clearExitStatus() {
        bitField0_ = (bitField0_ & ~0x00000001);
        exitStatus_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object userMessage_ = "";
      /**
       * <pre>
       * to be displayed to the user
       * </pre>
       *
       * <code>optional string userMessage = 2;</code>
       */
      public boolean hasUserMessage() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * to be displayed to the user
       * </pre>
       *
       * <code>optional string userMessage = 2;</code>
       */
      public java.lang.String getUserMessage() {
        java.lang.Object ref = userMessage_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            userMessage_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * to be displayed to the user
       * </pre>
       *
       * <code>optional string userMessage = 2;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getUserMessageBytes() {
        java.lang.Object ref = userMessage_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          userMessage_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * to be displayed to the user
       * </pre>
       *
       * <code>optional string userMessage = 2;</code>
       */
      public Builder setUserMessage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        userMessage_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * to be displayed to the user
       * </pre>
       *
       * <code>optional string userMessage = 2;</code>
       */
      public Builder clearUserMessage() {
        bitField0_ = (bitField0_ & ~0x00000002);
        userMessage_ = getDefaultInstance().getUserMessage();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * to be displayed to the user
       * </pre>
       *
       * <code>optional string userMessage = 2;</code>
       */
      public Builder setUserMessageBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        userMessage_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object senderName_ = "";
      /**
       * <pre>
       * which handler sent this message
       * </pre>
       *
       * <code>optional string senderName = 3;</code>
       */
      public boolean hasSenderName() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * which handler sent this message
       * </pre>
       *
       * <code>optional string senderName = 3;</code>
       */
      public java.lang.String getSenderName() {
        java.lang.Object ref = senderName_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            senderName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * which handler sent this message
       * </pre>
       *
       * <code>optional string senderName = 3;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getSenderNameBytes() {
        java.lang.Object ref = senderName_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          senderName_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * which handler sent this message
       * </pre>
       *
       * <code>optional string senderName = 3;</code>
       */
      public Builder setSenderName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        senderName_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * which handler sent this message
       * </pre>
       *
       * <code>optional string senderName = 3;</code>
       */
      public Builder clearSenderName() {
        bitField0_ = (bitField0_ & ~0x00000004);
        senderName_ = getDefaultInstance().getSenderName();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * which handler sent this message
       * </pre>
       *
       * <code>optional string senderName = 3;</code>
       */
      public Builder setSenderNameBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        senderName_ = value;
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.GenericRefreshResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.GenericRefreshResponseProto)
    private static final org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto();
    }

    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<GenericRefreshResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<GenericRefreshResponseProto>() {
      @java.lang.Override
      public GenericRefreshResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new GenericRefreshResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<GenericRefreshResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<GenericRefreshResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GenericRefreshResponseCollectionProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.GenericRefreshResponseCollectionProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .hadoop.common.GenericRefreshResponseProto responses = 1;</code>
     */
    java.util.List<org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto> 
        getResponsesList();
    /**
     * <code>repeated .hadoop.common.GenericRefreshResponseProto responses = 1;</code>
     */
    org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto getResponses(int index);
    /**
     * <code>repeated .hadoop.common.GenericRefreshResponseProto responses = 1;</code>
     */
    int getResponsesCount();
    /**
     * <code>repeated .hadoop.common.GenericRefreshResponseProto responses = 1;</code>
     */
    java.util.List<? extends org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProtoOrBuilder> 
        getResponsesOrBuilderList();
    /**
     * <code>repeated .hadoop.common.GenericRefreshResponseProto responses = 1;</code>
     */
    org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProtoOrBuilder getResponsesOrBuilder(
        int index);
  }
  /**
   * <pre>
   **
   * Collection of responses from zero or more handlers.
   * </pre>
   *
   * Protobuf type {@code hadoop.common.GenericRefreshResponseCollectionProto}
   */
  public  static final class GenericRefreshResponseCollectionProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.GenericRefreshResponseCollectionProto)
      GenericRefreshResponseCollectionProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GenericRefreshResponseCollectionProto.newBuilder() to construct.
    private GenericRefreshResponseCollectionProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GenericRefreshResponseCollectionProto() {
      responses_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GenericRefreshResponseCollectionProto(
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
                responses_ = new java.util.ArrayList<org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto>();
                mutable_bitField0_ |= 0x00000001;
              }
              responses_.add(
                  input.readMessage(org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto.PARSER, extensionRegistry));
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
      return org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.internal_static_hadoop_common_GenericRefreshResponseCollectionProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.internal_static_hadoop_common_GenericRefreshResponseCollectionProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto.class, org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto.Builder.class);
    }

    public static final int RESPONSES_FIELD_NUMBER = 1;
    private java.util.List<org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto> responses_;
    /**
     * <code>repeated .hadoop.common.GenericRefreshResponseProto responses = 1;</code>
     */
    public java.util.List<org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto> getResponsesList() {
      return responses_;
    }
    /**
     * <code>repeated .hadoop.common.GenericRefreshResponseProto responses = 1;</code>
     */
    public java.util.List<? extends org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProtoOrBuilder> 
        getResponsesOrBuilderList() {
      return responses_;
    }
    /**
     * <code>repeated .hadoop.common.GenericRefreshResponseProto responses = 1;</code>
     */
    public int getResponsesCount() {
      return responses_.size();
    }
    /**
     * <code>repeated .hadoop.common.GenericRefreshResponseProto responses = 1;</code>
     */
    public org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto getResponses(int index) {
      return responses_.get(index);
    }
    /**
     * <code>repeated .hadoop.common.GenericRefreshResponseProto responses = 1;</code>
     */
    public org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProtoOrBuilder getResponsesOrBuilder(
        int index) {
      return responses_.get(index);
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
      if (!(obj instanceof org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto other = (org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto) obj;

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

    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto prototype) {
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
     * Collection of responses from zero or more handlers.
     * </pre>
     *
     * Protobuf type {@code hadoop.common.GenericRefreshResponseCollectionProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.GenericRefreshResponseCollectionProto)
        org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.internal_static_hadoop_common_GenericRefreshResponseCollectionProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.internal_static_hadoop_common_GenericRefreshResponseCollectionProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto.class, org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto.Builder.class);
      }

      // Construct using org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto.newBuilder()
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
        return org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.internal_static_hadoop_common_GenericRefreshResponseCollectionProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto getDefaultInstanceForType() {
        return org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto build() {
        org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto buildPartial() {
        org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto result = new org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto(this);
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
        if (other instanceof org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto) {
          return mergeFrom((org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto other) {
        if (other == org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto.getDefaultInstance()) return this;
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
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto> responses_ =
        java.util.Collections.emptyList();
      private void ensureResponsesIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          responses_ = new java.util.ArrayList<org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto>(responses_);
          bitField0_ |= 0x00000001;
         }
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto, org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto.Builder, org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProtoOrBuilder> responsesBuilder_;

      /**
       * <code>repeated .hadoop.common.GenericRefreshResponseProto responses = 1;</code>
       */
      public java.util.List<org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto> getResponsesList() {
        if (responsesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(responses_);
        } else {
          return responsesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.common.GenericRefreshResponseProto responses = 1;</code>
       */
      public int getResponsesCount() {
        if (responsesBuilder_ == null) {
          return responses_.size();
        } else {
          return responsesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.common.GenericRefreshResponseProto responses = 1;</code>
       */
      public org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto getResponses(int index) {
        if (responsesBuilder_ == null) {
          return responses_.get(index);
        } else {
          return responsesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.common.GenericRefreshResponseProto responses = 1;</code>
       */
      public Builder setResponses(
          int index, org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto value) {
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
       * <code>repeated .hadoop.common.GenericRefreshResponseProto responses = 1;</code>
       */
      public Builder setResponses(
          int index, org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto.Builder builderForValue) {
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
       * <code>repeated .hadoop.common.GenericRefreshResponseProto responses = 1;</code>
       */
      public Builder addResponses(org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto value) {
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
       * <code>repeated .hadoop.common.GenericRefreshResponseProto responses = 1;</code>
       */
      public Builder addResponses(
          int index, org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto value) {
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
       * <code>repeated .hadoop.common.GenericRefreshResponseProto responses = 1;</code>
       */
      public Builder addResponses(
          org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto.Builder builderForValue) {
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
       * <code>repeated .hadoop.common.GenericRefreshResponseProto responses = 1;</code>
       */
      public Builder addResponses(
          int index, org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto.Builder builderForValue) {
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
       * <code>repeated .hadoop.common.GenericRefreshResponseProto responses = 1;</code>
       */
      public Builder addAllResponses(
          java.lang.Iterable<? extends org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto> values) {
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
       * <code>repeated .hadoop.common.GenericRefreshResponseProto responses = 1;</code>
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
       * <code>repeated .hadoop.common.GenericRefreshResponseProto responses = 1;</code>
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
       * <code>repeated .hadoop.common.GenericRefreshResponseProto responses = 1;</code>
       */
      public org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto.Builder getResponsesBuilder(
          int index) {
        return getResponsesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.common.GenericRefreshResponseProto responses = 1;</code>
       */
      public org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProtoOrBuilder getResponsesOrBuilder(
          int index) {
        if (responsesBuilder_ == null) {
          return responses_.get(index);  } else {
          return responsesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.common.GenericRefreshResponseProto responses = 1;</code>
       */
      public java.util.List<? extends org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProtoOrBuilder> 
           getResponsesOrBuilderList() {
        if (responsesBuilder_ != null) {
          return responsesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(responses_);
        }
      }
      /**
       * <code>repeated .hadoop.common.GenericRefreshResponseProto responses = 1;</code>
       */
      public org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto.Builder addResponsesBuilder() {
        return getResponsesFieldBuilder().addBuilder(
            org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.common.GenericRefreshResponseProto responses = 1;</code>
       */
      public org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto.Builder addResponsesBuilder(
          int index) {
        return getResponsesFieldBuilder().addBuilder(
            index, org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.common.GenericRefreshResponseProto responses = 1;</code>
       */
      public java.util.List<org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto.Builder> 
           getResponsesBuilderList() {
        return getResponsesFieldBuilder().getBuilderList();
      }
      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto, org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto.Builder, org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProtoOrBuilder> 
          getResponsesFieldBuilder() {
        if (responsesBuilder_ == null) {
          responsesBuilder_ = new org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
              org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto, org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProto.Builder, org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseProtoOrBuilder>(
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.GenericRefreshResponseCollectionProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.GenericRefreshResponseCollectionProto)
    private static final org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto();
    }

    public static org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<GenericRefreshResponseCollectionProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<GenericRefreshResponseCollectionProto>() {
      @java.lang.Override
      public GenericRefreshResponseCollectionProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new GenericRefreshResponseCollectionProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<GenericRefreshResponseCollectionProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<GenericRefreshResponseCollectionProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  /**
   * <pre>
   **
   * Protocol which is used to refresh a user-specified feature.
   * </pre>
   *
   * Protobuf service {@code hadoop.common.GenericRefreshProtocolService}
   */
  public static abstract class GenericRefreshProtocolService
      implements org.apache.hadoop.thirdparty.protobuf.Service {
    protected GenericRefreshProtocolService() {}

    public interface Interface {
      /**
       * <code>rpc refresh(.hadoop.common.GenericRefreshRequestProto) returns (.hadoop.common.GenericRefreshResponseCollectionProto);</code>
       */
      public abstract void refresh(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto> done);

    }

    public static org.apache.hadoop.thirdparty.protobuf.Service newReflectiveService(
        final Interface impl) {
      return new GenericRefreshProtocolService() {
        @java.lang.Override
        public  void refresh(
            org.apache.hadoop.thirdparty.protobuf.RpcController controller,
            org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto request,
            org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto> done) {
          impl.refresh(controller, request, done);
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
              return impl.refresh(controller, (org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto)request);
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
              return org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto.getDefaultInstance();
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
              return org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

      };
    }

    /**
     * <code>rpc refresh(.hadoop.common.GenericRefreshRequestProto) returns (.hadoop.common.GenericRefreshResponseCollectionProto);</code>
     */
    public abstract void refresh(
        org.apache.hadoop.thirdparty.protobuf.RpcController controller,
        org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto request,
        org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto> done);

    public static final
        org.apache.hadoop.thirdparty.protobuf.Descriptors.ServiceDescriptor
        getDescriptor() {
      return org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.getDescriptor().getServices().get(0);
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
          this.refresh(controller, (org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto)request,
            org.apache.hadoop.thirdparty.protobuf.RpcUtil.<org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto>specializeCallback(
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
          return org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto.getDefaultInstance();
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
          return org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public static Stub newStub(
        org.apache.hadoop.thirdparty.protobuf.RpcChannel channel) {
      return new Stub(channel);
    }

    public static final class Stub extends org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshProtocolService implements Interface {
      private Stub(org.apache.hadoop.thirdparty.protobuf.RpcChannel channel) {
        this.channel = channel;
      }

      private final org.apache.hadoop.thirdparty.protobuf.RpcChannel channel;

      public org.apache.hadoop.thirdparty.protobuf.RpcChannel getChannel() {
        return channel;
      }

      public  void refresh(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto.getDefaultInstance(),
          org.apache.hadoop.thirdparty.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto.class,
            org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto.getDefaultInstance()));
      }
    }

    public static BlockingInterface newBlockingStub(
        org.apache.hadoop.thirdparty.protobuf.BlockingRpcChannel channel) {
      return new BlockingStub(channel);
    }

    public interface BlockingInterface {
      public org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto refresh(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException;
    }

    private static final class BlockingStub implements BlockingInterface {
      private BlockingStub(org.apache.hadoop.thirdparty.protobuf.BlockingRpcChannel channel) {
        this.channel = channel;
      }

      private final org.apache.hadoop.thirdparty.protobuf.BlockingRpcChannel channel;

      public org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto refresh(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException {
        return (org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.ipc.proto.GenericRefreshProtocolProtos.GenericRefreshResponseCollectionProto.getDefaultInstance());
      }

    }

    // @@protoc_insertion_point(class_scope:hadoop.common.GenericRefreshProtocolService)
  }

  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_GenericRefreshRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_GenericRefreshRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_GenericRefreshResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_GenericRefreshResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_GenericRefreshResponseCollectionProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_GenericRefreshResponseCollectionProto_fieldAccessorTable;

  public static org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034GenericRefreshProtocol.proto\022\rhadoop.c" +
      "ommon\">\n\032GenericRefreshRequestProto\022\022\n\ni" +
      "dentifier\030\001 \001(\t\022\014\n\004args\030\002 \003(\t\"Z\n\033Generic" +
      "RefreshResponseProto\022\022\n\nexitStatus\030\001 \001(\005" +
      "\022\023\n\013userMessage\030\002 \001(\t\022\022\n\nsenderName\030\003 \001(" +
      "\t\"f\n%GenericRefreshResponseCollectionPro" +
      "to\022=\n\tresponses\030\001 \003(\0132*.hadoop.common.Ge" +
      "nericRefreshResponseProto2\213\001\n\035GenericRef" +
      "reshProtocolService\022j\n\007refresh\022).hadoop." +
      "common.GenericRefreshRequestProto\0324.hado" +
      "op.common.GenericRefreshResponseCollecti" +
      "onProtoBA\n\033org.apache.hadoop.ipc.protoB\034" +
      "GenericRefreshProtocolProtos\210\001\001\240\001\001"
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
    internal_static_hadoop_common_GenericRefreshRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hadoop_common_GenericRefreshRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_GenericRefreshRequestProto_descriptor,
        new java.lang.String[] { "Identifier", "Args", });
    internal_static_hadoop_common_GenericRefreshResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hadoop_common_GenericRefreshResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_GenericRefreshResponseProto_descriptor,
        new java.lang.String[] { "ExitStatus", "UserMessage", "SenderName", });
    internal_static_hadoop_common_GenericRefreshResponseCollectionProto_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_hadoop_common_GenericRefreshResponseCollectionProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_GenericRefreshResponseCollectionProto_descriptor,
        new java.lang.String[] { "Responses", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
