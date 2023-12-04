// source: ProtocolInfo.proto

package org.apache.hadoop.ipc.protobuf;

public final class ProtocolInfoProtos {
  private ProtocolInfoProtos() {
  }

  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite) registry);
  }

  public interface GetProtocolVersionsRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.GetProtocolVersionsRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Protocol name
     * </pre>
     *
     * <code>required string protocol = 1;</code>
     */
    boolean hasProtocol();

    /**
     * <pre>
     * Protocol name
     * </pre>
     *
     * <code>required string protocol = 1;</code>
     */
    java.lang.String getProtocol();

    /**
     * <pre>
     * Protocol name
     * </pre>
     *
     * <code>required string protocol = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
    getProtocolBytes();
  }

  /**
   * <pre>
   **
   * Request to get protocol versions for all supported rpc kinds.
   * </pre>
   *
   * Protobuf type {@code hadoop.common.GetProtocolVersionsRequestProto}
   */
  public static final class GetProtocolVersionsRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.GetProtocolVersionsRequestProto)
      GetProtocolVersionsRequestProtoOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use GetProtocolVersionsRequestProto.newBuilder() to construct.
    private GetProtocolVersionsRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private GetProtocolVersionsRequestProto() {
      protocol_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    private GetProtocolVersionsRequestProto(
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
      return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.internal_static_hadoop_common_GetProtocolVersionsRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.internal_static_hadoop_common_GetProtocolVersionsRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto.class, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto.Builder.class);
    }

    private int bitField0_;
    public static final int PROTOCOL_FIELD_NUMBER = 1;
    private volatile java.lang.Object protocol_;

    /**
     * <pre>
     * Protocol name
     * </pre>
     *
     * <code>required string protocol = 1;</code>
     */
    public boolean hasProtocol() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <pre>
     * Protocol name
     * </pre>
     *
     * <code>required string protocol = 1;</code>
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
     * Protocol name
     * </pre>
     *
     * <code>required string protocol = 1;</code>
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

      if (!hasProtocol()) {
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, protocol_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, protocol_);
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
      if (!(obj instanceof org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto other = (org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto) obj;

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
      if (hasProtocol()) {
        hash = (37 * hash) + PROTOCOL_FIELD_NUMBER;
        hash = (53 * hash) + getProtocol().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto parseFrom(
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

    public static Builder newBuilder(org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto prototype) {
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
     * Request to get protocol versions for all supported rpc kinds.
     * </pre>
     *
     * Protobuf type {@code hadoop.common.GetProtocolVersionsRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.GetProtocolVersionsRequestProto)
        org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.internal_static_hadoop_common_GetProtocolVersionsRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.internal_static_hadoop_common_GetProtocolVersionsRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto.class, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto.newBuilder()
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
        protocol_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.internal_static_hadoop_common_GetProtocolVersionsRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto build() {
        org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto buildPartial() {
        org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto result = new org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
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
        if (other instanceof org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto) {
          return mergeFrom((org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto other) {
        if (other == org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto.getDefaultInstance())
          return this;
        if (other.hasProtocol()) {
          bitField0_ |= 0x00000001;
          protocol_ = other.protocol_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasProtocol()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object protocol_ = "";

      /**
       * <pre>
       * Protocol name
       * </pre>
       *
       * <code>required string protocol = 1;</code>
       */
      public boolean hasProtocol() {
        return ((bitField0_ & 0x00000001) != 0);
      }

      /**
       * <pre>
       * Protocol name
       * </pre>
       *
       * <code>required string protocol = 1;</code>
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
       * Protocol name
       * </pre>
       *
       * <code>required string protocol = 1;</code>
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
       * Protocol name
       * </pre>
       *
       * <code>required string protocol = 1;</code>
       */
      public Builder setProtocol(
          java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        protocol_ = value;
        onChanged();
        return this;
      }

      /**
       * <pre>
       * Protocol name
       * </pre>
       *
       * <code>required string protocol = 1;</code>
       */
      public Builder clearProtocol() {
        bitField0_ = (bitField0_ & ~0x00000001);
        protocol_ = getDefaultInstance().getProtocol();
        onChanged();
        return this;
      }

      /**
       * <pre>
       * Protocol name
       * </pre>
       *
       * <code>required string protocol = 1;</code>
       */
      public Builder setProtocolBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.GetProtocolVersionsRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.GetProtocolVersionsRequestProto)
    private static final org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto();
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final org.apache.hadoop.thirdparty.protobuf.Parser<GetProtocolVersionsRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<GetProtocolVersionsRequestProto>() {
      @java.lang.Override
      public GetProtocolVersionsRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new GetProtocolVersionsRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<GetProtocolVersionsRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<GetProtocolVersionsRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ProtocolVersionProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.ProtocolVersionProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *RPC kind
     * </pre>
     *
     * <code>required string rpcKind = 1;</code>
     */
    boolean hasRpcKind();

    /**
     * <pre>
     *RPC kind
     * </pre>
     *
     * <code>required string rpcKind = 1;</code>
     */
    java.lang.String getRpcKind();

    /**
     * <pre>
     *RPC kind
     * </pre>
     *
     * <code>required string rpcKind = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
    getRpcKindBytes();

    /**
     * <pre>
     *Protocol version corresponding to the rpc kind.
     * </pre>
     *
     * <code>repeated uint64 versions = 2;</code>
     */
    java.util.List<java.lang.Long> getVersionsList();

    /**
     * <pre>
     *Protocol version corresponding to the rpc kind.
     * </pre>
     *
     * <code>repeated uint64 versions = 2;</code>
     */
    int getVersionsCount();

    /**
     * <pre>
     *Protocol version corresponding to the rpc kind.
     * </pre>
     *
     * <code>repeated uint64 versions = 2;</code>
     */
    long getVersions(int index);
  }

  /**
   * <pre>
   **
   * Protocol version with corresponding rpc kind.
   * </pre>
   *
   * Protobuf type {@code hadoop.common.ProtocolVersionProto}
   */
  public static final class ProtocolVersionProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.ProtocolVersionProto)
      ProtocolVersionProtoOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use ProtocolVersionProto.newBuilder() to construct.
    private ProtocolVersionProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ProtocolVersionProto() {
      rpcKind_ = "";
      versions_ = emptyLongList();
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    private ProtocolVersionProto(
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
              rpcKind_ = bs;
              break;
            }
            case 16: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                versions_ = newLongList();
                mutable_bitField0_ |= 0x00000002;
              }
              versions_.addLong(input.readUInt64());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                versions_ = newLongList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                versions_.addLong(input.readUInt64());
              }
              input.popLimit(limit);
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
          versions_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.internal_static_hadoop_common_ProtocolVersionProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.internal_static_hadoop_common_ProtocolVersionProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto.class, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto.Builder.class);
    }

    private int bitField0_;
    public static final int RPCKIND_FIELD_NUMBER = 1;
    private volatile java.lang.Object rpcKind_;

    /**
     * <pre>
     *RPC kind
     * </pre>
     *
     * <code>required string rpcKind = 1;</code>
     */
    public boolean hasRpcKind() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <pre>
     *RPC kind
     * </pre>
     *
     * <code>required string rpcKind = 1;</code>
     */
    public java.lang.String getRpcKind() {
      java.lang.Object ref = rpcKind_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs =
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          rpcKind_ = s;
        }
        return s;
      }
    }

    /**
     * <pre>
     *RPC kind
     * </pre>
     *
     * <code>required string rpcKind = 1;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
    getRpcKindBytes() {
      java.lang.Object ref = rpcKind_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b =
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rpcKind_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int VERSIONS_FIELD_NUMBER = 2;
    private org.apache.hadoop.thirdparty.protobuf.Internal.LongList versions_;

    /**
     * <pre>
     *Protocol version corresponding to the rpc kind.
     * </pre>
     *
     * <code>repeated uint64 versions = 2;</code>
     */
    public java.util.List<java.lang.Long>
    getVersionsList() {
      return versions_;
    }

    /**
     * <pre>
     *Protocol version corresponding to the rpc kind.
     * </pre>
     *
     * <code>repeated uint64 versions = 2;</code>
     */
    public int getVersionsCount() {
      return versions_.size();
    }

    /**
     * <pre>
     *Protocol version corresponding to the rpc kind.
     * </pre>
     *
     * <code>repeated uint64 versions = 2;</code>
     */
    public long getVersions(int index) {
      return versions_.getLong(index);
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasRpcKind()) {
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, rpcKind_);
      }
      for (int i = 0; i < versions_.size(); i++) {
        output.writeUInt64(2, versions_.getLong(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, rpcKind_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < versions_.size(); i++) {
          dataSize += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
              .computeUInt64SizeNoTag(versions_.getLong(i));
        }
        size += dataSize;
        size += 1 * getVersionsList().size();
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
      if (!(obj instanceof org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto other = (org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto) obj;

      if (hasRpcKind() != other.hasRpcKind()) return false;
      if (hasRpcKind()) {
        if (!getRpcKind()
            .equals(other.getRpcKind())) return false;
      }
      if (!getVersionsList()
          .equals(other.getVersionsList())) return false;
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
        hash = (53 * hash) + getRpcKind().hashCode();
      }
      if (getVersionsCount() > 0) {
        hash = (37 * hash) + VERSIONS_FIELD_NUMBER;
        hash = (53 * hash) + getVersionsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto parseFrom(
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

    public static Builder newBuilder(org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto prototype) {
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
     * Protocol version with corresponding rpc kind.
     * </pre>
     *
     * Protobuf type {@code hadoop.common.ProtocolVersionProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.ProtocolVersionProto)
        org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.internal_static_hadoop_common_ProtocolVersionProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.internal_static_hadoop_common_ProtocolVersionProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto.class, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto.Builder.class);
      }

      // Construct using org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto.newBuilder()
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
        rpcKind_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        versions_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.internal_static_hadoop_common_ProtocolVersionProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto getDefaultInstanceForType() {
        return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto build() {
        org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto buildPartial() {
        org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto result = new org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.rpcKind_ = rpcKind_;
        if (((bitField0_ & 0x00000002) != 0)) {
          versions_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.versions_ = versions_;
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
        if (other instanceof org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto) {
          return mergeFrom((org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto other) {
        if (other == org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto.getDefaultInstance())
          return this;
        if (other.hasRpcKind()) {
          bitField0_ |= 0x00000001;
          rpcKind_ = other.rpcKind_;
          onChanged();
        }
        if (!other.versions_.isEmpty()) {
          if (versions_.isEmpty()) {
            versions_ = other.versions_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureVersionsIsMutable();
            versions_.addAll(other.versions_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasRpcKind()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object rpcKind_ = "";

      /**
       * <pre>
       *RPC kind
       * </pre>
       *
       * <code>required string rpcKind = 1;</code>
       */
      public boolean hasRpcKind() {
        return ((bitField0_ & 0x00000001) != 0);
      }

      /**
       * <pre>
       *RPC kind
       * </pre>
       *
       * <code>required string rpcKind = 1;</code>
       */
      public java.lang.String getRpcKind() {
        java.lang.Object ref = rpcKind_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            rpcKind_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <pre>
       *RPC kind
       * </pre>
       *
       * <code>required string rpcKind = 1;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
      getRpcKindBytes() {
        java.lang.Object ref = rpcKind_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b =
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          rpcKind_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }

      /**
       * <pre>
       *RPC kind
       * </pre>
       *
       * <code>required string rpcKind = 1;</code>
       */
      public Builder setRpcKind(
          java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        rpcKind_ = value;
        onChanged();
        return this;
      }

      /**
       * <pre>
       *RPC kind
       * </pre>
       *
       * <code>required string rpcKind = 1;</code>
       */
      public Builder clearRpcKind() {
        bitField0_ = (bitField0_ & ~0x00000001);
        rpcKind_ = getDefaultInstance().getRpcKind();
        onChanged();
        return this;
      }

      /**
       * <pre>
       *RPC kind
       * </pre>
       *
       * <code>required string rpcKind = 1;</code>
       */
      public Builder setRpcKindBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        rpcKind_ = value;
        onChanged();
        return this;
      }

      private org.apache.hadoop.thirdparty.protobuf.Internal.LongList versions_ = emptyLongList();

      private void ensureVersionsIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          versions_ = mutableCopy(versions_);
          bitField0_ |= 0x00000002;
        }
      }

      /**
       * <pre>
       *Protocol version corresponding to the rpc kind.
       * </pre>
       *
       * <code>repeated uint64 versions = 2;</code>
       */
      public java.util.List<java.lang.Long>
      getVersionsList() {
        return ((bitField0_ & 0x00000002) != 0) ?
            java.util.Collections.unmodifiableList(versions_) : versions_;
      }

      /**
       * <pre>
       *Protocol version corresponding to the rpc kind.
       * </pre>
       *
       * <code>repeated uint64 versions = 2;</code>
       */
      public int getVersionsCount() {
        return versions_.size();
      }

      /**
       * <pre>
       *Protocol version corresponding to the rpc kind.
       * </pre>
       *
       * <code>repeated uint64 versions = 2;</code>
       */
      public long getVersions(int index) {
        return versions_.getLong(index);
      }

      /**
       * <pre>
       *Protocol version corresponding to the rpc kind.
       * </pre>
       *
       * <code>repeated uint64 versions = 2;</code>
       */
      public Builder setVersions(
          int index, long value) {
        ensureVersionsIsMutable();
        versions_.setLong(index, value);
        onChanged();
        return this;
      }

      /**
       * <pre>
       *Protocol version corresponding to the rpc kind.
       * </pre>
       *
       * <code>repeated uint64 versions = 2;</code>
       */
      public Builder addVersions(long value) {
        ensureVersionsIsMutable();
        versions_.addLong(value);
        onChanged();
        return this;
      }

      /**
       * <pre>
       *Protocol version corresponding to the rpc kind.
       * </pre>
       *
       * <code>repeated uint64 versions = 2;</code>
       */
      public Builder addAllVersions(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureVersionsIsMutable();
        org.apache.hadoop.thirdparty.protobuf.AbstractMessageLite.Builder.addAll(
            values, versions_);
        onChanged();
        return this;
      }

      /**
       * <pre>
       *Protocol version corresponding to the rpc kind.
       * </pre>
       *
       * <code>repeated uint64 versions = 2;</code>
       */
      public Builder clearVersions() {
        versions_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.ProtocolVersionProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.ProtocolVersionProto)
    private static final org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto();
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final org.apache.hadoop.thirdparty.protobuf.Parser<ProtocolVersionProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<ProtocolVersionProto>() {
      @java.lang.Override
      public ProtocolVersionProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new ProtocolVersionProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<ProtocolVersionProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<ProtocolVersionProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GetProtocolVersionsResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.GetProtocolVersionsResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .hadoop.common.ProtocolVersionProto protocolVersions = 1;</code>
     */
    java.util.List<org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto>
    getProtocolVersionsList();

    /**
     * <code>repeated .hadoop.common.ProtocolVersionProto protocolVersions = 1;</code>
     */
    org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto getProtocolVersions(int index);

    /**
     * <code>repeated .hadoop.common.ProtocolVersionProto protocolVersions = 1;</code>
     */
    int getProtocolVersionsCount();

    /**
     * <code>repeated .hadoop.common.ProtocolVersionProto protocolVersions = 1;</code>
     */
    java.util.List<? extends org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProtoOrBuilder>
    getProtocolVersionsOrBuilderList();

    /**
     * <code>repeated .hadoop.common.ProtocolVersionProto protocolVersions = 1;</code>
     */
    org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProtoOrBuilder getProtocolVersionsOrBuilder(
        int index);
  }

  /**
   * <pre>
   **
   * Get protocol version response.
   * </pre>
   *
   * Protobuf type {@code hadoop.common.GetProtocolVersionsResponseProto}
   */
  public static final class GetProtocolVersionsResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.GetProtocolVersionsResponseProto)
      GetProtocolVersionsResponseProtoOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use GetProtocolVersionsResponseProto.newBuilder() to construct.
    private GetProtocolVersionsResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private GetProtocolVersionsResponseProto() {
      protocolVersions_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    private GetProtocolVersionsResponseProto(
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
                protocolVersions_ = new java.util.ArrayList<org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto>();
                mutable_bitField0_ |= 0x00000001;
              }
              protocolVersions_.add(
                  input.readMessage(org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto.PARSER, extensionRegistry));
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
          protocolVersions_ = java.util.Collections.unmodifiableList(protocolVersions_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.internal_static_hadoop_common_GetProtocolVersionsResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.internal_static_hadoop_common_GetProtocolVersionsResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto.class, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto.Builder.class);
    }

    public static final int PROTOCOLVERSIONS_FIELD_NUMBER = 1;
    private java.util.List<org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto> protocolVersions_;

    /**
     * <code>repeated .hadoop.common.ProtocolVersionProto protocolVersions = 1;</code>
     */
    public java.util.List<org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto> getProtocolVersionsList() {
      return protocolVersions_;
    }

    /**
     * <code>repeated .hadoop.common.ProtocolVersionProto protocolVersions = 1;</code>
     */
    public java.util.List<? extends org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProtoOrBuilder>
    getProtocolVersionsOrBuilderList() {
      return protocolVersions_;
    }

    /**
     * <code>repeated .hadoop.common.ProtocolVersionProto protocolVersions = 1;</code>
     */
    public int getProtocolVersionsCount() {
      return protocolVersions_.size();
    }

    /**
     * <code>repeated .hadoop.common.ProtocolVersionProto protocolVersions = 1;</code>
     */
    public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto getProtocolVersions(int index) {
      return protocolVersions_.get(index);
    }

    /**
     * <code>repeated .hadoop.common.ProtocolVersionProto protocolVersions = 1;</code>
     */
    public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProtoOrBuilder getProtocolVersionsOrBuilder(
        int index) {
      return protocolVersions_.get(index);
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getProtocolVersionsCount(); i++) {
        if (!getProtocolVersions(i).isInitialized()) {
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
      for (int i = 0; i < protocolVersions_.size(); i++) {
        output.writeMessage(1, protocolVersions_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < protocolVersions_.size(); i++) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
            .computeMessageSize(1, protocolVersions_.get(i));
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
      if (!(obj instanceof org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto other = (org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto) obj;

      if (!getProtocolVersionsList()
          .equals(other.getProtocolVersionsList())) return false;
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
      if (getProtocolVersionsCount() > 0) {
        hash = (37 * hash) + PROTOCOLVERSIONS_FIELD_NUMBER;
        hash = (53 * hash) + getProtocolVersionsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto parseFrom(
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

    public static Builder newBuilder(org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto prototype) {
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
     * Get protocol version response.
     * </pre>
     *
     * Protobuf type {@code hadoop.common.GetProtocolVersionsResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.GetProtocolVersionsResponseProto)
        org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.internal_static_hadoop_common_GetProtocolVersionsResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.internal_static_hadoop_common_GetProtocolVersionsResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto.class, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto.newBuilder()
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
          getProtocolVersionsFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (protocolVersionsBuilder_ == null) {
          protocolVersions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          protocolVersionsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.internal_static_hadoop_common_GetProtocolVersionsResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto build() {
        org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto buildPartial() {
        org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto result = new org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto(this);
        int from_bitField0_ = bitField0_;
        if (protocolVersionsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            protocolVersions_ = java.util.Collections.unmodifiableList(protocolVersions_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.protocolVersions_ = protocolVersions_;
        } else {
          result.protocolVersions_ = protocolVersionsBuilder_.build();
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
        if (other instanceof org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto) {
          return mergeFrom((org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto other) {
        if (other == org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto.getDefaultInstance())
          return this;
        if (protocolVersionsBuilder_ == null) {
          if (!other.protocolVersions_.isEmpty()) {
            if (protocolVersions_.isEmpty()) {
              protocolVersions_ = other.protocolVersions_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureProtocolVersionsIsMutable();
              protocolVersions_.addAll(other.protocolVersions_);
            }
            onChanged();
          }
        } else {
          if (!other.protocolVersions_.isEmpty()) {
            if (protocolVersionsBuilder_.isEmpty()) {
              protocolVersionsBuilder_.dispose();
              protocolVersionsBuilder_ = null;
              protocolVersions_ = other.protocolVersions_;
              bitField0_ = (bitField0_ & ~0x00000001);
              protocolVersionsBuilder_ =
                  org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                      getProtocolVersionsFieldBuilder() : null;
            } else {
              protocolVersionsBuilder_.addAllMessages(other.protocolVersions_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        for (int i = 0; i < getProtocolVersionsCount(); i++) {
          if (!getProtocolVersions(i).isInitialized()) {
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
        org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.util.List<org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto> protocolVersions_ =
          java.util.Collections.emptyList();

      private void ensureProtocolVersionsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          protocolVersions_ = new java.util.ArrayList<org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto>(protocolVersions_);
          bitField0_ |= 0x00000001;
        }
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto.Builder, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProtoOrBuilder> protocolVersionsBuilder_;

      /**
       * <code>repeated .hadoop.common.ProtocolVersionProto protocolVersions = 1;</code>
       */
      public java.util.List<org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto> getProtocolVersionsList() {
        if (protocolVersionsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(protocolVersions_);
        } else {
          return protocolVersionsBuilder_.getMessageList();
        }
      }

      /**
       * <code>repeated .hadoop.common.ProtocolVersionProto protocolVersions = 1;</code>
       */
      public int getProtocolVersionsCount() {
        if (protocolVersionsBuilder_ == null) {
          return protocolVersions_.size();
        } else {
          return protocolVersionsBuilder_.getCount();
        }
      }

      /**
       * <code>repeated .hadoop.common.ProtocolVersionProto protocolVersions = 1;</code>
       */
      public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto getProtocolVersions(int index) {
        if (protocolVersionsBuilder_ == null) {
          return protocolVersions_.get(index);
        } else {
          return protocolVersionsBuilder_.getMessage(index);
        }
      }

      /**
       * <code>repeated .hadoop.common.ProtocolVersionProto protocolVersions = 1;</code>
       */
      public Builder setProtocolVersions(
          int index, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto value) {
        if (protocolVersionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureProtocolVersionsIsMutable();
          protocolVersions_.set(index, value);
          onChanged();
        } else {
          protocolVersionsBuilder_.setMessage(index, value);
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.ProtocolVersionProto protocolVersions = 1;</code>
       */
      public Builder setProtocolVersions(
          int index, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto.Builder builderForValue) {
        if (protocolVersionsBuilder_ == null) {
          ensureProtocolVersionsIsMutable();
          protocolVersions_.set(index, builderForValue.build());
          onChanged();
        } else {
          protocolVersionsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.ProtocolVersionProto protocolVersions = 1;</code>
       */
      public Builder addProtocolVersions(org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto value) {
        if (protocolVersionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureProtocolVersionsIsMutable();
          protocolVersions_.add(value);
          onChanged();
        } else {
          protocolVersionsBuilder_.addMessage(value);
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.ProtocolVersionProto protocolVersions = 1;</code>
       */
      public Builder addProtocolVersions(
          int index, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto value) {
        if (protocolVersionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureProtocolVersionsIsMutable();
          protocolVersions_.add(index, value);
          onChanged();
        } else {
          protocolVersionsBuilder_.addMessage(index, value);
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.ProtocolVersionProto protocolVersions = 1;</code>
       */
      public Builder addProtocolVersions(
          org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto.Builder builderForValue) {
        if (protocolVersionsBuilder_ == null) {
          ensureProtocolVersionsIsMutable();
          protocolVersions_.add(builderForValue.build());
          onChanged();
        } else {
          protocolVersionsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.ProtocolVersionProto protocolVersions = 1;</code>
       */
      public Builder addProtocolVersions(
          int index, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto.Builder builderForValue) {
        if (protocolVersionsBuilder_ == null) {
          ensureProtocolVersionsIsMutable();
          protocolVersions_.add(index, builderForValue.build());
          onChanged();
        } else {
          protocolVersionsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.ProtocolVersionProto protocolVersions = 1;</code>
       */
      public Builder addAllProtocolVersions(
          java.lang.Iterable<? extends org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto> values) {
        if (protocolVersionsBuilder_ == null) {
          ensureProtocolVersionsIsMutable();
          org.apache.hadoop.thirdparty.protobuf.AbstractMessageLite.Builder.addAll(
              values, protocolVersions_);
          onChanged();
        } else {
          protocolVersionsBuilder_.addAllMessages(values);
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.ProtocolVersionProto protocolVersions = 1;</code>
       */
      public Builder clearProtocolVersions() {
        if (protocolVersionsBuilder_ == null) {
          protocolVersions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          protocolVersionsBuilder_.clear();
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.ProtocolVersionProto protocolVersions = 1;</code>
       */
      public Builder removeProtocolVersions(int index) {
        if (protocolVersionsBuilder_ == null) {
          ensureProtocolVersionsIsMutable();
          protocolVersions_.remove(index);
          onChanged();
        } else {
          protocolVersionsBuilder_.remove(index);
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.ProtocolVersionProto protocolVersions = 1;</code>
       */
      public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto.Builder getProtocolVersionsBuilder(
          int index) {
        return getProtocolVersionsFieldBuilder().getBuilder(index);
      }

      /**
       * <code>repeated .hadoop.common.ProtocolVersionProto protocolVersions = 1;</code>
       */
      public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProtoOrBuilder getProtocolVersionsOrBuilder(
          int index) {
        if (protocolVersionsBuilder_ == null) {
          return protocolVersions_.get(index);
        } else {
          return protocolVersionsBuilder_.getMessageOrBuilder(index);
        }
      }

      /**
       * <code>repeated .hadoop.common.ProtocolVersionProto protocolVersions = 1;</code>
       */
      public java.util.List<? extends org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProtoOrBuilder>
      getProtocolVersionsOrBuilderList() {
        if (protocolVersionsBuilder_ != null) {
          return protocolVersionsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(protocolVersions_);
        }
      }

      /**
       * <code>repeated .hadoop.common.ProtocolVersionProto protocolVersions = 1;</code>
       */
      public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto.Builder addProtocolVersionsBuilder() {
        return getProtocolVersionsFieldBuilder().addBuilder(
            org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto.getDefaultInstance());
      }

      /**
       * <code>repeated .hadoop.common.ProtocolVersionProto protocolVersions = 1;</code>
       */
      public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto.Builder addProtocolVersionsBuilder(
          int index) {
        return getProtocolVersionsFieldBuilder().addBuilder(
            index, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto.getDefaultInstance());
      }

      /**
       * <code>repeated .hadoop.common.ProtocolVersionProto protocolVersions = 1;</code>
       */
      public java.util.List<org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto.Builder>
      getProtocolVersionsBuilderList() {
        return getProtocolVersionsFieldBuilder().getBuilderList();
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto.Builder, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProtoOrBuilder>
      getProtocolVersionsFieldBuilder() {
        if (protocolVersionsBuilder_ == null) {
          protocolVersionsBuilder_ = new org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
              org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProto.Builder, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolVersionProtoOrBuilder>(
              protocolVersions_,
              ((bitField0_ & 0x00000001) != 0),
              getParentForChildren(),
              isClean());
          protocolVersions_ = null;
        }
        return protocolVersionsBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.GetProtocolVersionsResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.GetProtocolVersionsResponseProto)
    private static final org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto();
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final org.apache.hadoop.thirdparty.protobuf.Parser<GetProtocolVersionsResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<GetProtocolVersionsResponseProto>() {
      @java.lang.Override
      public GetProtocolVersionsResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new GetProtocolVersionsResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<GetProtocolVersionsResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<GetProtocolVersionsResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GetProtocolSignatureRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.GetProtocolSignatureRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Protocol name
     * </pre>
     *
     * <code>required string protocol = 1;</code>
     */
    boolean hasProtocol();

    /**
     * <pre>
     * Protocol name
     * </pre>
     *
     * <code>required string protocol = 1;</code>
     */
    java.lang.String getProtocol();

    /**
     * <pre>
     * Protocol name
     * </pre>
     *
     * <code>required string protocol = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
    getProtocolBytes();

    /**
     * <pre>
     * RPC kind
     * </pre>
     *
     * <code>required string rpcKind = 2;</code>
     */
    boolean hasRpcKind();

    /**
     * <pre>
     * RPC kind
     * </pre>
     *
     * <code>required string rpcKind = 2;</code>
     */
    java.lang.String getRpcKind();

    /**
     * <pre>
     * RPC kind
     * </pre>
     *
     * <code>required string rpcKind = 2;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
    getRpcKindBytes();
  }

  /**
   * <pre>
   **
   * Get protocol signature request.
   * </pre>
   *
   * Protobuf type {@code hadoop.common.GetProtocolSignatureRequestProto}
   */
  public static final class GetProtocolSignatureRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.GetProtocolSignatureRequestProto)
      GetProtocolSignatureRequestProtoOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use GetProtocolSignatureRequestProto.newBuilder() to construct.
    private GetProtocolSignatureRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private GetProtocolSignatureRequestProto() {
      protocol_ = "";
      rpcKind_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    private GetProtocolSignatureRequestProto(
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
              protocol_ = bs;
              break;
            }
            case 18: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              rpcKind_ = bs;
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
      return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.internal_static_hadoop_common_GetProtocolSignatureRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.internal_static_hadoop_common_GetProtocolSignatureRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto.class, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto.Builder.class);
    }

    private int bitField0_;
    public static final int PROTOCOL_FIELD_NUMBER = 1;
    private volatile java.lang.Object protocol_;

    /**
     * <pre>
     * Protocol name
     * </pre>
     *
     * <code>required string protocol = 1;</code>
     */
    public boolean hasProtocol() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <pre>
     * Protocol name
     * </pre>
     *
     * <code>required string protocol = 1;</code>
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
     * Protocol name
     * </pre>
     *
     * <code>required string protocol = 1;</code>
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

    public static final int RPCKIND_FIELD_NUMBER = 2;
    private volatile java.lang.Object rpcKind_;

    /**
     * <pre>
     * RPC kind
     * </pre>
     *
     * <code>required string rpcKind = 2;</code>
     */
    public boolean hasRpcKind() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     * <pre>
     * RPC kind
     * </pre>
     *
     * <code>required string rpcKind = 2;</code>
     */
    public java.lang.String getRpcKind() {
      java.lang.Object ref = rpcKind_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs =
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          rpcKind_ = s;
        }
        return s;
      }
    }

    /**
     * <pre>
     * RPC kind
     * </pre>
     *
     * <code>required string rpcKind = 2;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
    getRpcKindBytes() {
      java.lang.Object ref = rpcKind_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b =
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rpcKind_ = b;
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

      if (!hasProtocol()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRpcKind()) {
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, protocol_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 2, rpcKind_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, protocol_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(2, rpcKind_);
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
      if (!(obj instanceof org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto other = (org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto) obj;

      if (hasProtocol() != other.hasProtocol()) return false;
      if (hasProtocol()) {
        if (!getProtocol()
            .equals(other.getProtocol())) return false;
      }
      if (hasRpcKind() != other.hasRpcKind()) return false;
      if (hasRpcKind()) {
        if (!getRpcKind()
            .equals(other.getRpcKind())) return false;
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
      if (hasProtocol()) {
        hash = (37 * hash) + PROTOCOL_FIELD_NUMBER;
        hash = (53 * hash) + getProtocol().hashCode();
      }
      if (hasRpcKind()) {
        hash = (37 * hash) + RPCKIND_FIELD_NUMBER;
        hash = (53 * hash) + getRpcKind().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto parseFrom(
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

    public static Builder newBuilder(org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto prototype) {
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
     * Get protocol signature request.
     * </pre>
     *
     * Protobuf type {@code hadoop.common.GetProtocolSignatureRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.GetProtocolSignatureRequestProto)
        org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.internal_static_hadoop_common_GetProtocolSignatureRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.internal_static_hadoop_common_GetProtocolSignatureRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto.class, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto.newBuilder()
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
        protocol_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        rpcKind_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.internal_static_hadoop_common_GetProtocolSignatureRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto build() {
        org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto buildPartial() {
        org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto result = new org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.protocol_ = protocol_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.rpcKind_ = rpcKind_;
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
        if (other instanceof org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto) {
          return mergeFrom((org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto other) {
        if (other == org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto.getDefaultInstance())
          return this;
        if (other.hasProtocol()) {
          bitField0_ |= 0x00000001;
          protocol_ = other.protocol_;
          onChanged();
        }
        if (other.hasRpcKind()) {
          bitField0_ |= 0x00000002;
          rpcKind_ = other.rpcKind_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasProtocol()) {
          return false;
        }
        if (!hasRpcKind()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object protocol_ = "";

      /**
       * <pre>
       * Protocol name
       * </pre>
       *
       * <code>required string protocol = 1;</code>
       */
      public boolean hasProtocol() {
        return ((bitField0_ & 0x00000001) != 0);
      }

      /**
       * <pre>
       * Protocol name
       * </pre>
       *
       * <code>required string protocol = 1;</code>
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
       * Protocol name
       * </pre>
       *
       * <code>required string protocol = 1;</code>
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
       * Protocol name
       * </pre>
       *
       * <code>required string protocol = 1;</code>
       */
      public Builder setProtocol(
          java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        protocol_ = value;
        onChanged();
        return this;
      }

      /**
       * <pre>
       * Protocol name
       * </pre>
       *
       * <code>required string protocol = 1;</code>
       */
      public Builder clearProtocol() {
        bitField0_ = (bitField0_ & ~0x00000001);
        protocol_ = getDefaultInstance().getProtocol();
        onChanged();
        return this;
      }

      /**
       * <pre>
       * Protocol name
       * </pre>
       *
       * <code>required string protocol = 1;</code>
       */
      public Builder setProtocolBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        protocol_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object rpcKind_ = "";

      /**
       * <pre>
       * RPC kind
       * </pre>
       *
       * <code>required string rpcKind = 2;</code>
       */
      public boolean hasRpcKind() {
        return ((bitField0_ & 0x00000002) != 0);
      }

      /**
       * <pre>
       * RPC kind
       * </pre>
       *
       * <code>required string rpcKind = 2;</code>
       */
      public java.lang.String getRpcKind() {
        java.lang.Object ref = rpcKind_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            rpcKind_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <pre>
       * RPC kind
       * </pre>
       *
       * <code>required string rpcKind = 2;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
      getRpcKindBytes() {
        java.lang.Object ref = rpcKind_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b =
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          rpcKind_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }

      /**
       * <pre>
       * RPC kind
       * </pre>
       *
       * <code>required string rpcKind = 2;</code>
       */
      public Builder setRpcKind(
          java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        rpcKind_ = value;
        onChanged();
        return this;
      }

      /**
       * <pre>
       * RPC kind
       * </pre>
       *
       * <code>required string rpcKind = 2;</code>
       */
      public Builder clearRpcKind() {
        bitField0_ = (bitField0_ & ~0x00000002);
        rpcKind_ = getDefaultInstance().getRpcKind();
        onChanged();
        return this;
      }

      /**
       * <pre>
       * RPC kind
       * </pre>
       *
       * <code>required string rpcKind = 2;</code>
       */
      public Builder setRpcKindBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        rpcKind_ = value;
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.GetProtocolSignatureRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.GetProtocolSignatureRequestProto)
    private static final org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto();
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final org.apache.hadoop.thirdparty.protobuf.Parser<GetProtocolSignatureRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<GetProtocolSignatureRequestProto>() {
      @java.lang.Override
      public GetProtocolSignatureRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new GetProtocolSignatureRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<GetProtocolSignatureRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<GetProtocolSignatureRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GetProtocolSignatureResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.GetProtocolSignatureResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .hadoop.common.ProtocolSignatureProto protocolSignature = 1;</code>
     */
    java.util.List<org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto>
    getProtocolSignatureList();

    /**
     * <code>repeated .hadoop.common.ProtocolSignatureProto protocolSignature = 1;</code>
     */
    org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto getProtocolSignature(int index);

    /**
     * <code>repeated .hadoop.common.ProtocolSignatureProto protocolSignature = 1;</code>
     */
    int getProtocolSignatureCount();

    /**
     * <code>repeated .hadoop.common.ProtocolSignatureProto protocolSignature = 1;</code>
     */
    java.util.List<? extends org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProtoOrBuilder>
    getProtocolSignatureOrBuilderList();

    /**
     * <code>repeated .hadoop.common.ProtocolSignatureProto protocolSignature = 1;</code>
     */
    org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProtoOrBuilder getProtocolSignatureOrBuilder(
        int index);
  }

  /**
   * <pre>
   **
   * Get protocol signature response.
   * </pre>
   *
   * Protobuf type {@code hadoop.common.GetProtocolSignatureResponseProto}
   */
  public static final class GetProtocolSignatureResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.GetProtocolSignatureResponseProto)
      GetProtocolSignatureResponseProtoOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use GetProtocolSignatureResponseProto.newBuilder() to construct.
    private GetProtocolSignatureResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private GetProtocolSignatureResponseProto() {
      protocolSignature_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    private GetProtocolSignatureResponseProto(
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
                protocolSignature_ = new java.util.ArrayList<org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto>();
                mutable_bitField0_ |= 0x00000001;
              }
              protocolSignature_.add(
                  input.readMessage(org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto.PARSER, extensionRegistry));
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
          protocolSignature_ = java.util.Collections.unmodifiableList(protocolSignature_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.internal_static_hadoop_common_GetProtocolSignatureResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.internal_static_hadoop_common_GetProtocolSignatureResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto.class, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto.Builder.class);
    }

    public static final int PROTOCOLSIGNATURE_FIELD_NUMBER = 1;
    private java.util.List<org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto> protocolSignature_;

    /**
     * <code>repeated .hadoop.common.ProtocolSignatureProto protocolSignature = 1;</code>
     */
    public java.util.List<org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto> getProtocolSignatureList() {
      return protocolSignature_;
    }

    /**
     * <code>repeated .hadoop.common.ProtocolSignatureProto protocolSignature = 1;</code>
     */
    public java.util.List<? extends org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProtoOrBuilder>
    getProtocolSignatureOrBuilderList() {
      return protocolSignature_;
    }

    /**
     * <code>repeated .hadoop.common.ProtocolSignatureProto protocolSignature = 1;</code>
     */
    public int getProtocolSignatureCount() {
      return protocolSignature_.size();
    }

    /**
     * <code>repeated .hadoop.common.ProtocolSignatureProto protocolSignature = 1;</code>
     */
    public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto getProtocolSignature(int index) {
      return protocolSignature_.get(index);
    }

    /**
     * <code>repeated .hadoop.common.ProtocolSignatureProto protocolSignature = 1;</code>
     */
    public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProtoOrBuilder getProtocolSignatureOrBuilder(
        int index) {
      return protocolSignature_.get(index);
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getProtocolSignatureCount(); i++) {
        if (!getProtocolSignature(i).isInitialized()) {
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
      for (int i = 0; i < protocolSignature_.size(); i++) {
        output.writeMessage(1, protocolSignature_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < protocolSignature_.size(); i++) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
            .computeMessageSize(1, protocolSignature_.get(i));
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
      if (!(obj instanceof org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto other = (org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto) obj;

      if (!getProtocolSignatureList()
          .equals(other.getProtocolSignatureList())) return false;
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
      if (getProtocolSignatureCount() > 0) {
        hash = (37 * hash) + PROTOCOLSIGNATURE_FIELD_NUMBER;
        hash = (53 * hash) + getProtocolSignatureList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto parseFrom(
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

    public static Builder newBuilder(org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto prototype) {
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
     * Get protocol signature response.
     * </pre>
     *
     * Protobuf type {@code hadoop.common.GetProtocolSignatureResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.GetProtocolSignatureResponseProto)
        org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.internal_static_hadoop_common_GetProtocolSignatureResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.internal_static_hadoop_common_GetProtocolSignatureResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto.class, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto.newBuilder()
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
          getProtocolSignatureFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (protocolSignatureBuilder_ == null) {
          protocolSignature_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          protocolSignatureBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.internal_static_hadoop_common_GetProtocolSignatureResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto build() {
        org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto buildPartial() {
        org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto result = new org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto(this);
        int from_bitField0_ = bitField0_;
        if (protocolSignatureBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            protocolSignature_ = java.util.Collections.unmodifiableList(protocolSignature_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.protocolSignature_ = protocolSignature_;
        } else {
          result.protocolSignature_ = protocolSignatureBuilder_.build();
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
        if (other instanceof org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto) {
          return mergeFrom((org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto other) {
        if (other == org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto.getDefaultInstance())
          return this;
        if (protocolSignatureBuilder_ == null) {
          if (!other.protocolSignature_.isEmpty()) {
            if (protocolSignature_.isEmpty()) {
              protocolSignature_ = other.protocolSignature_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureProtocolSignatureIsMutable();
              protocolSignature_.addAll(other.protocolSignature_);
            }
            onChanged();
          }
        } else {
          if (!other.protocolSignature_.isEmpty()) {
            if (protocolSignatureBuilder_.isEmpty()) {
              protocolSignatureBuilder_.dispose();
              protocolSignatureBuilder_ = null;
              protocolSignature_ = other.protocolSignature_;
              bitField0_ = (bitField0_ & ~0x00000001);
              protocolSignatureBuilder_ =
                  org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                      getProtocolSignatureFieldBuilder() : null;
            } else {
              protocolSignatureBuilder_.addAllMessages(other.protocolSignature_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        for (int i = 0; i < getProtocolSignatureCount(); i++) {
          if (!getProtocolSignature(i).isInitialized()) {
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
        org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.util.List<org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto> protocolSignature_ =
          java.util.Collections.emptyList();

      private void ensureProtocolSignatureIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          protocolSignature_ = new java.util.ArrayList<org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto>(protocolSignature_);
          bitField0_ |= 0x00000001;
        }
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto.Builder, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProtoOrBuilder> protocolSignatureBuilder_;

      /**
       * <code>repeated .hadoop.common.ProtocolSignatureProto protocolSignature = 1;</code>
       */
      public java.util.List<org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto> getProtocolSignatureList() {
        if (protocolSignatureBuilder_ == null) {
          return java.util.Collections.unmodifiableList(protocolSignature_);
        } else {
          return protocolSignatureBuilder_.getMessageList();
        }
      }

      /**
       * <code>repeated .hadoop.common.ProtocolSignatureProto protocolSignature = 1;</code>
       */
      public int getProtocolSignatureCount() {
        if (protocolSignatureBuilder_ == null) {
          return protocolSignature_.size();
        } else {
          return protocolSignatureBuilder_.getCount();
        }
      }

      /**
       * <code>repeated .hadoop.common.ProtocolSignatureProto protocolSignature = 1;</code>
       */
      public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto getProtocolSignature(int index) {
        if (protocolSignatureBuilder_ == null) {
          return protocolSignature_.get(index);
        } else {
          return protocolSignatureBuilder_.getMessage(index);
        }
      }

      /**
       * <code>repeated .hadoop.common.ProtocolSignatureProto protocolSignature = 1;</code>
       */
      public Builder setProtocolSignature(
          int index, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto value) {
        if (protocolSignatureBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureProtocolSignatureIsMutable();
          protocolSignature_.set(index, value);
          onChanged();
        } else {
          protocolSignatureBuilder_.setMessage(index, value);
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.ProtocolSignatureProto protocolSignature = 1;</code>
       */
      public Builder setProtocolSignature(
          int index, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto.Builder builderForValue) {
        if (protocolSignatureBuilder_ == null) {
          ensureProtocolSignatureIsMutable();
          protocolSignature_.set(index, builderForValue.build());
          onChanged();
        } else {
          protocolSignatureBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.ProtocolSignatureProto protocolSignature = 1;</code>
       */
      public Builder addProtocolSignature(org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto value) {
        if (protocolSignatureBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureProtocolSignatureIsMutable();
          protocolSignature_.add(value);
          onChanged();
        } else {
          protocolSignatureBuilder_.addMessage(value);
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.ProtocolSignatureProto protocolSignature = 1;</code>
       */
      public Builder addProtocolSignature(
          int index, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto value) {
        if (protocolSignatureBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureProtocolSignatureIsMutable();
          protocolSignature_.add(index, value);
          onChanged();
        } else {
          protocolSignatureBuilder_.addMessage(index, value);
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.ProtocolSignatureProto protocolSignature = 1;</code>
       */
      public Builder addProtocolSignature(
          org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto.Builder builderForValue) {
        if (protocolSignatureBuilder_ == null) {
          ensureProtocolSignatureIsMutable();
          protocolSignature_.add(builderForValue.build());
          onChanged();
        } else {
          protocolSignatureBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.ProtocolSignatureProto protocolSignature = 1;</code>
       */
      public Builder addProtocolSignature(
          int index, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto.Builder builderForValue) {
        if (protocolSignatureBuilder_ == null) {
          ensureProtocolSignatureIsMutable();
          protocolSignature_.add(index, builderForValue.build());
          onChanged();
        } else {
          protocolSignatureBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.ProtocolSignatureProto protocolSignature = 1;</code>
       */
      public Builder addAllProtocolSignature(
          java.lang.Iterable<? extends org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto> values) {
        if (protocolSignatureBuilder_ == null) {
          ensureProtocolSignatureIsMutable();
          org.apache.hadoop.thirdparty.protobuf.AbstractMessageLite.Builder.addAll(
              values, protocolSignature_);
          onChanged();
        } else {
          protocolSignatureBuilder_.addAllMessages(values);
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.ProtocolSignatureProto protocolSignature = 1;</code>
       */
      public Builder clearProtocolSignature() {
        if (protocolSignatureBuilder_ == null) {
          protocolSignature_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          protocolSignatureBuilder_.clear();
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.ProtocolSignatureProto protocolSignature = 1;</code>
       */
      public Builder removeProtocolSignature(int index) {
        if (protocolSignatureBuilder_ == null) {
          ensureProtocolSignatureIsMutable();
          protocolSignature_.remove(index);
          onChanged();
        } else {
          protocolSignatureBuilder_.remove(index);
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.ProtocolSignatureProto protocolSignature = 1;</code>
       */
      public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto.Builder getProtocolSignatureBuilder(
          int index) {
        return getProtocolSignatureFieldBuilder().getBuilder(index);
      }

      /**
       * <code>repeated .hadoop.common.ProtocolSignatureProto protocolSignature = 1;</code>
       */
      public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProtoOrBuilder getProtocolSignatureOrBuilder(
          int index) {
        if (protocolSignatureBuilder_ == null) {
          return protocolSignature_.get(index);
        } else {
          return protocolSignatureBuilder_.getMessageOrBuilder(index);
        }
      }

      /**
       * <code>repeated .hadoop.common.ProtocolSignatureProto protocolSignature = 1;</code>
       */
      public java.util.List<? extends org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProtoOrBuilder>
      getProtocolSignatureOrBuilderList() {
        if (protocolSignatureBuilder_ != null) {
          return protocolSignatureBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(protocolSignature_);
        }
      }

      /**
       * <code>repeated .hadoop.common.ProtocolSignatureProto protocolSignature = 1;</code>
       */
      public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto.Builder addProtocolSignatureBuilder() {
        return getProtocolSignatureFieldBuilder().addBuilder(
            org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto.getDefaultInstance());
      }

      /**
       * <code>repeated .hadoop.common.ProtocolSignatureProto protocolSignature = 1;</code>
       */
      public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto.Builder addProtocolSignatureBuilder(
          int index) {
        return getProtocolSignatureFieldBuilder().addBuilder(
            index, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto.getDefaultInstance());
      }

      /**
       * <code>repeated .hadoop.common.ProtocolSignatureProto protocolSignature = 1;</code>
       */
      public java.util.List<org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto.Builder>
      getProtocolSignatureBuilderList() {
        return getProtocolSignatureFieldBuilder().getBuilderList();
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto.Builder, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProtoOrBuilder>
      getProtocolSignatureFieldBuilder() {
        if (protocolSignatureBuilder_ == null) {
          protocolSignatureBuilder_ = new org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
              org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto.Builder, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProtoOrBuilder>(
              protocolSignature_,
              ((bitField0_ & 0x00000001) != 0),
              getParentForChildren(),
              isClean());
          protocolSignature_ = null;
        }
        return protocolSignatureBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.GetProtocolSignatureResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.GetProtocolSignatureResponseProto)
    private static final org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto();
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final org.apache.hadoop.thirdparty.protobuf.Parser<GetProtocolSignatureResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<GetProtocolSignatureResponseProto>() {
      @java.lang.Override
      public GetProtocolSignatureResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new GetProtocolSignatureResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<GetProtocolSignatureResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<GetProtocolSignatureResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ProtocolSignatureProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.ProtocolSignatureProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required uint64 version = 1;</code>
     */
    boolean hasVersion();

    /**
     * <code>required uint64 version = 1;</code>
     */
    long getVersion();

    /**
     * <code>repeated uint32 methods = 2;</code>
     */
    java.util.List<java.lang.Integer> getMethodsList();

    /**
     * <code>repeated uint32 methods = 2;</code>
     */
    int getMethodsCount();

    /**
     * <code>repeated uint32 methods = 2;</code>
     */
    int getMethods(int index);
  }

  /**
   * Protobuf type {@code hadoop.common.ProtocolSignatureProto}
   */
  public static final class ProtocolSignatureProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.ProtocolSignatureProto)
      ProtocolSignatureProtoOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use ProtocolSignatureProto.newBuilder() to construct.
    private ProtocolSignatureProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ProtocolSignatureProto() {
      methods_ = emptyIntList();
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    private ProtocolSignatureProto(
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
              version_ = input.readUInt64();
              break;
            }
            case 16: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                methods_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              methods_.addInt(input.readUInt32());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                methods_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                methods_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
          methods_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.internal_static_hadoop_common_ProtocolSignatureProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.internal_static_hadoop_common_ProtocolSignatureProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto.class, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto.Builder.class);
    }

    private int bitField0_;
    public static final int VERSION_FIELD_NUMBER = 1;
    private long version_;

    /**
     * <code>required uint64 version = 1;</code>
     */
    public boolean hasVersion() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>required uint64 version = 1;</code>
     */
    public long getVersion() {
      return version_;
    }

    public static final int METHODS_FIELD_NUMBER = 2;
    private org.apache.hadoop.thirdparty.protobuf.Internal.IntList methods_;

    /**
     * <code>repeated uint32 methods = 2;</code>
     */
    public java.util.List<java.lang.Integer>
    getMethodsList() {
      return methods_;
    }

    /**
     * <code>repeated uint32 methods = 2;</code>
     */
    public int getMethodsCount() {
      return methods_.size();
    }

    /**
     * <code>repeated uint32 methods = 2;</code>
     */
    public int getMethods(int index) {
      return methods_.getInt(index);
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasVersion()) {
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
        output.writeUInt64(1, version_);
      }
      for (int i = 0; i < methods_.size(); i++) {
        output.writeUInt32(2, methods_.getInt(i));
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
            .computeUInt64Size(1, version_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < methods_.size(); i++) {
          dataSize += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
              .computeUInt32SizeNoTag(methods_.getInt(i));
        }
        size += dataSize;
        size += 1 * getMethodsList().size();
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
      if (!(obj instanceof org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto other = (org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto) obj;

      if (hasVersion() != other.hasVersion()) return false;
      if (hasVersion()) {
        if (getVersion()
            != other.getVersion()) return false;
      }
      if (!getMethodsList()
          .equals(other.getMethodsList())) return false;
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
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getVersion());
      }
      if (getMethodsCount() > 0) {
        hash = (37 * hash) + METHODS_FIELD_NUMBER;
        hash = (53 * hash) + getMethodsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto parseFrom(
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

    public static Builder newBuilder(org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto prototype) {
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
     * Protobuf type {@code hadoop.common.ProtocolSignatureProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.ProtocolSignatureProto)
        org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.internal_static_hadoop_common_ProtocolSignatureProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.internal_static_hadoop_common_ProtocolSignatureProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto.class, org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto.Builder.class);
      }

      // Construct using org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto.newBuilder()
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
        version_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        methods_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.internal_static_hadoop_common_ProtocolSignatureProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto getDefaultInstanceForType() {
        return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto build() {
        org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto buildPartial() {
        org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto result = new org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.version_ = version_;
          to_bitField0_ |= 0x00000001;
        }
        if (((bitField0_ & 0x00000002) != 0)) {
          methods_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.methods_ = methods_;
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
        if (other instanceof org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto) {
          return mergeFrom((org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto other) {
        if (other == org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto.getDefaultInstance())
          return this;
        if (other.hasVersion()) {
          setVersion(other.getVersion());
        }
        if (!other.methods_.isEmpty()) {
          if (methods_.isEmpty()) {
            methods_ = other.methods_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureMethodsIsMutable();
            methods_.addAll(other.methods_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasVersion()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private long version_;

      /**
       * <code>required uint64 version = 1;</code>
       */
      public boolean hasVersion() {
        return ((bitField0_ & 0x00000001) != 0);
      }

      /**
       * <code>required uint64 version = 1;</code>
       */
      public long getVersion() {
        return version_;
      }

      /**
       * <code>required uint64 version = 1;</code>
       */
      public Builder setVersion(long value) {
        bitField0_ |= 0x00000001;
        version_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required uint64 version = 1;</code>
       */
      public Builder clearVersion() {
        bitField0_ = (bitField0_ & ~0x00000001);
        version_ = 0L;
        onChanged();
        return this;
      }

      private org.apache.hadoop.thirdparty.protobuf.Internal.IntList methods_ = emptyIntList();

      private void ensureMethodsIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          methods_ = mutableCopy(methods_);
          bitField0_ |= 0x00000002;
        }
      }

      /**
       * <code>repeated uint32 methods = 2;</code>
       */
      public java.util.List<java.lang.Integer>
      getMethodsList() {
        return ((bitField0_ & 0x00000002) != 0) ?
            java.util.Collections.unmodifiableList(methods_) : methods_;
      }

      /**
       * <code>repeated uint32 methods = 2;</code>
       */
      public int getMethodsCount() {
        return methods_.size();
      }

      /**
       * <code>repeated uint32 methods = 2;</code>
       */
      public int getMethods(int index) {
        return methods_.getInt(index);
      }

      /**
       * <code>repeated uint32 methods = 2;</code>
       */
      public Builder setMethods(
          int index, int value) {
        ensureMethodsIsMutable();
        methods_.setInt(index, value);
        onChanged();
        return this;
      }

      /**
       * <code>repeated uint32 methods = 2;</code>
       */
      public Builder addMethods(int value) {
        ensureMethodsIsMutable();
        methods_.addInt(value);
        onChanged();
        return this;
      }

      /**
       * <code>repeated uint32 methods = 2;</code>
       */
      public Builder addAllMethods(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureMethodsIsMutable();
        org.apache.hadoop.thirdparty.protobuf.AbstractMessageLite.Builder.addAll(
            values, methods_);
        onChanged();
        return this;
      }

      /**
       * <code>repeated uint32 methods = 2;</code>
       */
      public Builder clearMethods() {
        methods_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.ProtocolSignatureProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.ProtocolSignatureProto)
    private static final org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto();
    }

    public static org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final org.apache.hadoop.thirdparty.protobuf.Parser<ProtocolSignatureProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<ProtocolSignatureProto>() {
      @java.lang.Override
      public ProtocolSignatureProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new ProtocolSignatureProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<ProtocolSignatureProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<ProtocolSignatureProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolSignatureProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  /**
   * <pre>
   **
   * Protocol to get information about protocols.
   * </pre>
   *
   * Protobuf service {@code hadoop.common.ProtocolInfoService}
   */
  public static abstract class ProtocolInfoService
      implements org.apache.hadoop.thirdparty.protobuf.Service {
    protected ProtocolInfoService() {
    }

    public interface Interface {
      /**
       * <pre>
       **
       * Return protocol version corresponding to protocol interface for each
       * supported rpc kind.
       * </pre>
       *
       * <code>rpc getProtocolVersions(.hadoop.common.GetProtocolVersionsRequestProto) returns (.hadoop.common.GetProtocolVersionsResponseProto);</code>
       */
      public abstract void getProtocolVersions(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto> done);

      /**
       * <pre>
       **
       * Return protocol version corresponding to protocol interface.
       * </pre>
       *
       * <code>rpc getProtocolSignature(.hadoop.common.GetProtocolSignatureRequestProto) returns (.hadoop.common.GetProtocolSignatureResponseProto);</code>
       */
      public abstract void getProtocolSignature(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto> done);

    }

    public static org.apache.hadoop.thirdparty.protobuf.Service newReflectiveService(
        final Interface impl) {
      return new ProtocolInfoService() {
        @java.lang.Override
        public void getProtocolVersions(
            org.apache.hadoop.thirdparty.protobuf.RpcController controller,
            org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto request,
            org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto> done) {
          impl.getProtocolVersions(controller, request, done);
        }

        @java.lang.Override
        public void getProtocolSignature(
            org.apache.hadoop.thirdparty.protobuf.RpcController controller,
            org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto request,
            org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto> done) {
          impl.getProtocolSignature(controller, request, done);
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
          switch (method.getIndex()) {
            case 0:
              return impl.getProtocolVersions(controller, (org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto) request);
            case 1:
              return impl.getProtocolSignature(controller, (org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto) request);
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
          switch (method.getIndex()) {
            case 0:
              return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto.getDefaultInstance();
            case 1:
              return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto.getDefaultInstance();
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
          switch (method.getIndex()) {
            case 0:
              return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto.getDefaultInstance();
            case 1:
              return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

      };
    }

    /**
     * <pre>
     **
     * Return protocol version corresponding to protocol interface for each
     * supported rpc kind.
     * </pre>
     *
     * <code>rpc getProtocolVersions(.hadoop.common.GetProtocolVersionsRequestProto) returns (.hadoop.common.GetProtocolVersionsResponseProto);</code>
     */
    public abstract void getProtocolVersions(
        org.apache.hadoop.thirdparty.protobuf.RpcController controller,
        org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto request,
        org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto> done);

    /**
     * <pre>
     **
     * Return protocol version corresponding to protocol interface.
     * </pre>
     *
     * <code>rpc getProtocolSignature(.hadoop.common.GetProtocolSignatureRequestProto) returns (.hadoop.common.GetProtocolSignatureResponseProto);</code>
     */
    public abstract void getProtocolSignature(
        org.apache.hadoop.thirdparty.protobuf.RpcController controller,
        org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto request,
        org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto> done);

    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.ServiceDescriptor
    getDescriptor() {
      return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.getDescriptor().getServices().get(0);
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
      switch (method.getIndex()) {
        case 0:
          this.getProtocolVersions(controller, (org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto) request,
              org.apache.hadoop.thirdparty.protobuf.RpcUtil.<org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto>specializeCallback(
                  done));
          return;
        case 1:
          this.getProtocolSignature(controller, (org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto) request,
              org.apache.hadoop.thirdparty.protobuf.RpcUtil.<org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto>specializeCallback(
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
      switch (method.getIndex()) {
        case 0:
          return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto.getDefaultInstance();
        case 1:
          return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto.getDefaultInstance();
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
      switch (method.getIndex()) {
        case 0:
          return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto.getDefaultInstance();
        case 1:
          return org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public static Stub newStub(
        org.apache.hadoop.thirdparty.protobuf.RpcChannel channel) {
      return new Stub(channel);
    }

    public static final class Stub extends org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.ProtocolInfoService implements Interface {
      private Stub(org.apache.hadoop.thirdparty.protobuf.RpcChannel channel) {
        this.channel = channel;
      }

      private final org.apache.hadoop.thirdparty.protobuf.RpcChannel channel;

      public org.apache.hadoop.thirdparty.protobuf.RpcChannel getChannel() {
        return channel;
      }

      public void getProtocolVersions(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto> done) {
        channel.callMethod(
            getDescriptor().getMethods().get(0),
            controller,
            request,
            org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto.getDefaultInstance(),
            org.apache.hadoop.thirdparty.protobuf.RpcUtil.generalizeCallback(
                done,
                org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto.class,
                org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto.getDefaultInstance()));
      }

      public void getProtocolSignature(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto> done) {
        channel.callMethod(
            getDescriptor().getMethods().get(1),
            controller,
            request,
            org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto.getDefaultInstance(),
            org.apache.hadoop.thirdparty.protobuf.RpcUtil.generalizeCallback(
                done,
                org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto.class,
                org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto.getDefaultInstance()));
      }
    }

    public static BlockingInterface newBlockingStub(
        org.apache.hadoop.thirdparty.protobuf.BlockingRpcChannel channel) {
      return new BlockingStub(channel);
    }

    public interface BlockingInterface {
      public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto getProtocolVersions(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException;

      public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto getProtocolSignature(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException;
    }

    private static final class BlockingStub implements BlockingInterface {
      private BlockingStub(org.apache.hadoop.thirdparty.protobuf.BlockingRpcChannel channel) {
        this.channel = channel;
      }

      private final org.apache.hadoop.thirdparty.protobuf.BlockingRpcChannel channel;

      public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto getProtocolVersions(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException {
        return (org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto) channel.callBlockingMethod(
            getDescriptor().getMethods().get(0),
            controller,
            request,
            org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolVersionsResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto getProtocolSignature(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException {
        return (org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto) channel.callBlockingMethod(
            getDescriptor().getMethods().get(1),
            controller,
            request,
            org.apache.hadoop.ipc.protobuf.ProtocolInfoProtos.GetProtocolSignatureResponseProto.getDefaultInstance());
      }

    }

    // @@protoc_insertion_point(class_scope:hadoop.common.ProtocolInfoService)
  }

  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      internal_static_hadoop_common_GetProtocolVersionsRequestProto_descriptor;
  private static final
  org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_GetProtocolVersionsRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      internal_static_hadoop_common_ProtocolVersionProto_descriptor;
  private static final
  org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_ProtocolVersionProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      internal_static_hadoop_common_GetProtocolVersionsResponseProto_descriptor;
  private static final
  org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_GetProtocolVersionsResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      internal_static_hadoop_common_GetProtocolSignatureRequestProto_descriptor;
  private static final
  org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_GetProtocolSignatureRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      internal_static_hadoop_common_GetProtocolSignatureResponseProto_descriptor;
  private static final
  org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_GetProtocolSignatureResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      internal_static_hadoop_common_ProtocolSignatureProto_descriptor;
  private static final
  org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_ProtocolSignatureProto_fieldAccessorTable;

  public static org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
  getDescriptor() {
    return descriptor;
  }

  private static org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      descriptor;

  static {
    java.lang.String[] descriptorData = {
        "\n\022ProtocolInfo.proto\022\rhadoop.common\"3\n\037G" +
            "etProtocolVersionsRequestProto\022\020\n\010protoc" +
            "ol\030\001 \002(\t\"9\n\024ProtocolVersionProto\022\017\n\007rpcK" +
            "ind\030\001 \002(\t\022\020\n\010versions\030\002 \003(\004\"a\n GetProtoc" +
            "olVersionsResponseProto\022=\n\020protocolVersi" +
            "ons\030\001 \003(\0132#.hadoop.common.ProtocolVersio" +
            "nProto\"E\n GetProtocolSignatureRequestPro" +
            "to\022\020\n\010protocol\030\001 \002(\t\022\017\n\007rpcKind\030\002 \002(\t\"e\n" +
            "!GetProtocolSignatureResponseProto\022@\n\021pr" +
            "otocolSignature\030\001 \003(\0132%.hadoop.common.Pr" +
            "otocolSignatureProto\":\n\026ProtocolSignatur" +
            "eProto\022\017\n\007version\030\001 \002(\004\022\017\n\007methods\030\002 \003(\r" +
            "2\210\002\n\023ProtocolInfoService\022v\n\023getProtocolV" +
            "ersions\022..hadoop.common.GetProtocolVersi" +
            "onsRequestProto\032/.hadoop.common.GetProto" +
            "colVersionsResponseProto\022y\n\024getProtocolS" +
            "ignature\022/.hadoop.common.GetProtocolSign" +
            "atureRequestProto\0320.hadoop.common.GetPro" +
            "tocolSignatureResponseProtoB:\n\036org.apach" +
            "e.hadoop.ipc.protobufB\022ProtocolInfoProto" +
            "s\210\001\001\240\001\001"
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
    internal_static_hadoop_common_GetProtocolVersionsRequestProto_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_hadoop_common_GetProtocolVersionsRequestProto_fieldAccessorTable = new
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_GetProtocolVersionsRequestProto_descriptor,
        new java.lang.String[]{"Protocol",});
    internal_static_hadoop_common_ProtocolVersionProto_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_hadoop_common_ProtocolVersionProto_fieldAccessorTable = new
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_ProtocolVersionProto_descriptor,
        new java.lang.String[]{"RpcKind", "Versions",});
    internal_static_hadoop_common_GetProtocolVersionsResponseProto_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_hadoop_common_GetProtocolVersionsResponseProto_fieldAccessorTable = new
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_GetProtocolVersionsResponseProto_descriptor,
        new java.lang.String[]{"ProtocolVersions",});
    internal_static_hadoop_common_GetProtocolSignatureRequestProto_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_hadoop_common_GetProtocolSignatureRequestProto_fieldAccessorTable = new
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_GetProtocolSignatureRequestProto_descriptor,
        new java.lang.String[]{"Protocol", "RpcKind",});
    internal_static_hadoop_common_GetProtocolSignatureResponseProto_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_hadoop_common_GetProtocolSignatureResponseProto_fieldAccessorTable = new
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_GetProtocolSignatureResponseProto_descriptor,
        new java.lang.String[]{"ProtocolSignature",});
    internal_static_hadoop_common_ProtocolSignatureProto_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_hadoop_common_ProtocolSignatureProto_fieldAccessorTable = new
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_ProtocolSignatureProto_descriptor,
        new java.lang.String[]{"Version", "Methods",});
  }

  // @@protoc_insertion_point(outer_class_scope)
}
