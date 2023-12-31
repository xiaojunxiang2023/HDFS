// source: ProtobufRpcEngine.proto

package org.apache.hadoop.ipc.protobuf;

public final class ProtobufRpcEngineProtos {
  private ProtobufRpcEngineProtos() {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }

  public interface RequestHeaderProtoOrBuilder extends
      com.google.protobuf.GeneratedMessage.
          ExtendableMessageOrBuilder<RequestHeaderProto> {

    // required string methodName = 1;

    /**
     * <code>required string methodName = 1;</code>
     *
     * <pre>
     ** Name of the RPC method 
     * </pre>
     */
    boolean hasMethodName();

    /**
     * <code>required string methodName = 1;</code>
     *
     * <pre>
     ** Name of the RPC method 
     * </pre>
     */
    java.lang.String getMethodName();

    /**
     * <code>required string methodName = 1;</code>
     *
     * <pre>
     ** Name of the RPC method 
     * </pre>
     */
    com.google.protobuf.ByteString
    getMethodNameBytes();

    // required string declaringClassProtocolName = 2;

    /**
     * <code>required string declaringClassProtocolName = 2;</code>
     *
     * <pre>
     **
     * RPCs for a particular interface (ie protocol) are done using a
     * IPC connection that is setup using rpcProxy.
     * The rpcProxy's has a declared protocol name that is 
     * sent form client to server at connection time. 
     *
     * Each Rpc call also sends a protocol name 
     * (called declaringClassprotocolName). This name is usually the same
     * as the connection protocol name except in some cases. 
     * For example metaProtocols such ProtocolInfoProto which get metainfo
     * about the protocol reuse the connection but need to indicate that
     * the actual protocol is different (i.e. the protocol is
     * ProtocolInfoProto) since they reuse the connection; in this case
     * the declaringClassProtocolName field is set to the ProtocolInfoProto
     * </pre>
     */
    boolean hasDeclaringClassProtocolName();

    /**
     * <code>required string declaringClassProtocolName = 2;</code>
     *
     * <pre>
     **
     * RPCs for a particular interface (ie protocol) are done using a
     * IPC connection that is setup using rpcProxy.
     * The rpcProxy's has a declared protocol name that is 
     * sent form client to server at connection time. 
     *
     * Each Rpc call also sends a protocol name 
     * (called declaringClassprotocolName). This name is usually the same
     * as the connection protocol name except in some cases. 
     * For example metaProtocols such ProtocolInfoProto which get metainfo
     * about the protocol reuse the connection but need to indicate that
     * the actual protocol is different (i.e. the protocol is
     * ProtocolInfoProto) since they reuse the connection; in this case
     * the declaringClassProtocolName field is set to the ProtocolInfoProto
     * </pre>
     */
    java.lang.String getDeclaringClassProtocolName();

    /**
     * <code>required string declaringClassProtocolName = 2;</code>
     *
     * <pre>
     **
     * RPCs for a particular interface (ie protocol) are done using a
     * IPC connection that is setup using rpcProxy.
     * The rpcProxy's has a declared protocol name that is 
     * sent form client to server at connection time. 
     *
     * Each Rpc call also sends a protocol name 
     * (called declaringClassprotocolName). This name is usually the same
     * as the connection protocol name except in some cases. 
     * For example metaProtocols such ProtocolInfoProto which get metainfo
     * about the protocol reuse the connection but need to indicate that
     * the actual protocol is different (i.e. the protocol is
     * ProtocolInfoProto) since they reuse the connection; in this case
     * the declaringClassProtocolName field is set to the ProtocolInfoProto
     * </pre>
     */
    com.google.protobuf.ByteString
    getDeclaringClassProtocolNameBytes();

    // required uint64 clientProtocolVersion = 3;

    /**
     * <code>required uint64 clientProtocolVersion = 3;</code>
     *
     * <pre>
     ** protocol version of class declaring the called method 
     * </pre>
     */
    boolean hasClientProtocolVersion();

    /**
     * <code>required uint64 clientProtocolVersion = 3;</code>
     *
     * <pre>
     ** protocol version of class declaring the called method 
     * </pre>
     */
    long getClientProtocolVersion();
  }

  /**
   * Protobuf type {@code hadoop.common.RequestHeaderProto}
   *
   * <pre>
   **
   * This message is the header for the Protobuf Rpc Engine
   * when sending a RPC request from  RPC client to the RPC server.
   * The actual request (serialized as protobuf) follows this request.
   *
   * No special header is needed for the Rpc Response for Protobuf Rpc Engine.
   * The normal RPC response header (see RpcHeader.proto) are sufficient. 
   * </pre>
   */
  public static final class RequestHeaderProto extends
      com.google.protobuf.GeneratedMessage.ExtendableMessage<
          RequestHeaderProto> implements RequestHeaderProtoOrBuilder {
    // Use RequestHeaderProto.newBuilder() to construct.
    private RequestHeaderProto(com.google.protobuf.GeneratedMessage.ExtendableBuilder<org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto, ?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }

    private RequestHeaderProto(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private static final RequestHeaderProto defaultInstance;

    public static RequestHeaderProto getDefaultInstance() {
      return defaultInstance;
    }

    public RequestHeaderProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    private RequestHeaderProto(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                  extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              methodName_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              declaringClassProtocolName_ = input.readBytes();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              clientProtocolVersion_ = input.readUInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.internal_static_hadoop_common_RequestHeaderProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.internal_static_hadoop_common_RequestHeaderProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto.class, org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto.Builder.class);
    }

    public static com.google.protobuf.Parser<RequestHeaderProto> PARSER =
        new com.google.protobuf.AbstractParser<RequestHeaderProto>() {
          public RequestHeaderProto parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new RequestHeaderProto(input, extensionRegistry);
          }
        };

    @java.lang.Override
    public com.google.protobuf.Parser<RequestHeaderProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string methodName = 1;
    public static final int METHODNAME_FIELD_NUMBER = 1;
    private java.lang.Object methodName_;

    /**
     * <code>required string methodName = 1;</code>
     *
     * <pre>
     ** Name of the RPC method 
     * </pre>
     */
    public boolean hasMethodName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>required string methodName = 1;</code>
     *
     * <pre>
     ** Name of the RPC method 
     * </pre>
     */
    public java.lang.String getMethodName() {
      java.lang.Object ref = methodName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          methodName_ = s;
        }
        return s;
      }
    }

    /**
     * <code>required string methodName = 1;</code>
     *
     * <pre>
     ** Name of the RPC method 
     * </pre>
     */
    public com.google.protobuf.ByteString
    getMethodNameBytes() {
      java.lang.Object ref = methodName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        methodName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required string declaringClassProtocolName = 2;
    public static final int DECLARINGCLASSPROTOCOLNAME_FIELD_NUMBER = 2;
    private java.lang.Object declaringClassProtocolName_;

    /**
     * <code>required string declaringClassProtocolName = 2;</code>
     *
     * <pre>
     **
     * RPCs for a particular interface (ie protocol) are done using a
     * IPC connection that is setup using rpcProxy.
     * The rpcProxy's has a declared protocol name that is 
     * sent form client to server at connection time. 
     *
     * Each Rpc call also sends a protocol name 
     * (called declaringClassprotocolName). This name is usually the same
     * as the connection protocol name except in some cases. 
     * For example metaProtocols such ProtocolInfoProto which get metainfo
     * about the protocol reuse the connection but need to indicate that
     * the actual protocol is different (i.e. the protocol is
     * ProtocolInfoProto) since they reuse the connection; in this case
     * the declaringClassProtocolName field is set to the ProtocolInfoProto
     * </pre>
     */
    public boolean hasDeclaringClassProtocolName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>required string declaringClassProtocolName = 2;</code>
     *
     * <pre>
     **
     * RPCs for a particular interface (ie protocol) are done using a
     * IPC connection that is setup using rpcProxy.
     * The rpcProxy's has a declared protocol name that is 
     * sent form client to server at connection time. 
     *
     * Each Rpc call also sends a protocol name 
     * (called declaringClassprotocolName). This name is usually the same
     * as the connection protocol name except in some cases. 
     * For example metaProtocols such ProtocolInfoProto which get metainfo
     * about the protocol reuse the connection but need to indicate that
     * the actual protocol is different (i.e. the protocol is
     * ProtocolInfoProto) since they reuse the connection; in this case
     * the declaringClassProtocolName field is set to the ProtocolInfoProto
     * </pre>
     */
    public java.lang.String getDeclaringClassProtocolName() {
      java.lang.Object ref = declaringClassProtocolName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          declaringClassProtocolName_ = s;
        }
        return s;
      }
    }

    /**
     * <code>required string declaringClassProtocolName = 2;</code>
     *
     * <pre>
     **
     * RPCs for a particular interface (ie protocol) are done using a
     * IPC connection that is setup using rpcProxy.
     * The rpcProxy's has a declared protocol name that is 
     * sent form client to server at connection time. 
     *
     * Each Rpc call also sends a protocol name 
     * (called declaringClassprotocolName). This name is usually the same
     * as the connection protocol name except in some cases. 
     * For example metaProtocols such ProtocolInfoProto which get metainfo
     * about the protocol reuse the connection but need to indicate that
     * the actual protocol is different (i.e. the protocol is
     * ProtocolInfoProto) since they reuse the connection; in this case
     * the declaringClassProtocolName field is set to the ProtocolInfoProto
     * </pre>
     */
    public com.google.protobuf.ByteString
    getDeclaringClassProtocolNameBytes() {
      java.lang.Object ref = declaringClassProtocolName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        declaringClassProtocolName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required uint64 clientProtocolVersion = 3;
    public static final int CLIENTPROTOCOLVERSION_FIELD_NUMBER = 3;
    private long clientProtocolVersion_;

    /**
     * <code>required uint64 clientProtocolVersion = 3;</code>
     *
     * <pre>
     ** protocol version of class declaring the called method 
     * </pre>
     */
    public boolean hasClientProtocolVersion() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>required uint64 clientProtocolVersion = 3;</code>
     *
     * <pre>
     ** protocol version of class declaring the called method 
     * </pre>
     */
    public long getClientProtocolVersion() {
      return clientProtocolVersion_;
    }

    private void initFields() {
      methodName_ = "";
      declaringClassProtocolName_ = "";
      clientProtocolVersion_ = 0L;
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasMethodName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasDeclaringClassProtocolName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasClientProtocolVersion()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!extensionsAreInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
        throws java.io.IOException {
      getSerializedSize();
      com.google.protobuf.GeneratedMessage
          .ExtendableMessage<org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto>.ExtensionWriter extensionWriter =
          newExtensionWriter();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getMethodNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getDeclaringClassProtocolNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt64(3, clientProtocolVersion_);
      }
      extensionWriter.writeUntil(536870912, output);
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
            .computeBytesSize(1, getMethodNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
            .computeBytesSize(2, getDeclaringClassProtocolNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
            .computeUInt64Size(3, clientProtocolVersion_);
      }
      size += extensionsSerializedSize();
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;

    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto other = (org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto) obj;

      boolean result = true;
      result = result && (hasMethodName() == other.hasMethodName());
      if (hasMethodName()) {
        result = result && getMethodName()
            .equals(other.getMethodName());
      }
      result = result && (hasDeclaringClassProtocolName() == other.hasDeclaringClassProtocolName());
      if (hasDeclaringClassProtocolName()) {
        result = result && getDeclaringClassProtocolName()
            .equals(other.getDeclaringClassProtocolName());
      }
      result = result && (hasClientProtocolVersion() == other.hasClientProtocolVersion());
      if (hasClientProtocolVersion()) {
        result = result && (getClientProtocolVersion()
            == other.getClientProtocolVersion());
      }
      result = result &&
          getUnknownFields().equals(other.getUnknownFields());
      result = result &&
          getExtensionFields().equals(other.getExtensionFields());
      return result;
    }

    private int memoizedHashCode = 0;

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasMethodName()) {
        hash = (37 * hash) + METHODNAME_FIELD_NUMBER;
        hash = (53 * hash) + getMethodName().hashCode();
      }
      if (hasDeclaringClassProtocolName()) {
        hash = (37 * hash) + DECLARINGCLASSPROTOCOLNAME_FIELD_NUMBER;
        hash = (53 * hash) + getDeclaringClassProtocolName().hashCode();
      }
      if (hasClientProtocolVersion()) {
        hash = (37 * hash) + CLIENTPROTOCOLVERSION_FIELD_NUMBER;
        hash = (53 * hash) + hashLong(getClientProtocolVersion());
      }
      hash = hashFields(hash, getExtensionFields());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return Builder.create();
    }

    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder(org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
      return newBuilder(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code hadoop.common.RequestHeaderProto}
     *
     * <pre>
     **
     * This message is the header for the Protobuf Rpc Engine
     * when sending a RPC request from  RPC client to the RPC server.
     * The actual request (serialized as protobuf) follows this request.
     *
     * No special header is needed for the Rpc Response for Protobuf Rpc Engine.
     * The normal RPC response header (see RpcHeader.proto) are sufficient. 
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.ExtendableBuilder<
            org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto, Builder> implements org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.internal_static_hadoop_common_RequestHeaderProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.internal_static_hadoop_common_RequestHeaderProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto.class, org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto.Builder.class);
      }

      // Construct using org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }

      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        methodName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        declaringClassProtocolName_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        clientProtocolVersion_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.internal_static_hadoop_common_RequestHeaderProto_descriptor;
      }

      public org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto getDefaultInstanceForType() {
        return org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto.getDefaultInstance();
      }

      public org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto build() {
        org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto buildPartial() {
        org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto result = new org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.methodName_ = methodName_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.declaringClassProtocolName_ = declaringClassProtocolName_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.clientProtocolVersion_ = clientProtocolVersion_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto) {
          return mergeFrom((org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto other) {
        if (other == org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto.getDefaultInstance())
          return this;
        if (other.hasMethodName()) {
          bitField0_ |= 0x00000001;
          methodName_ = other.methodName_;
          onChanged();
        }
        if (other.hasDeclaringClassProtocolName()) {
          bitField0_ |= 0x00000002;
          declaringClassProtocolName_ = other.declaringClassProtocolName_;
          onChanged();
        }
        if (other.hasClientProtocolVersion()) {
          setClientProtocolVersion(other.getClientProtocolVersion());
        }
        this.mergeExtensionFields(other);
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasMethodName()) {

          return false;
        }
        if (!hasDeclaringClassProtocolName()) {

          return false;
        }
        if (!hasClientProtocolVersion()) {

          return false;
        }
        if (!extensionsAreInitialized()) {

          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.ipc.protobuf.ProtobufRpcEngineProtos.RequestHeaderProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      // required string methodName = 1;
      private java.lang.Object methodName_ = "";

      /**
       * <code>required string methodName = 1;</code>
       *
       * <pre>
       ** Name of the RPC method 
       * </pre>
       */
      public boolean hasMethodName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>required string methodName = 1;</code>
       *
       * <pre>
       ** Name of the RPC method 
       * </pre>
       */
      public java.lang.String getMethodName() {
        java.lang.Object ref = methodName_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          methodName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>required string methodName = 1;</code>
       *
       * <pre>
       ** Name of the RPC method 
       * </pre>
       */
      public com.google.protobuf.ByteString
      getMethodNameBytes() {
        java.lang.Object ref = methodName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          methodName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>required string methodName = 1;</code>
       *
       * <pre>
       ** Name of the RPC method 
       * </pre>
       */
      public Builder setMethodName(
          java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        methodName_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required string methodName = 1;</code>
       *
       * <pre>
       ** Name of the RPC method 
       * </pre>
       */
      public Builder clearMethodName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        methodName_ = getDefaultInstance().getMethodName();
        onChanged();
        return this;
      }

      /**
       * <code>required string methodName = 1;</code>
       *
       * <pre>
       ** Name of the RPC method 
       * </pre>
       */
      public Builder setMethodNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        methodName_ = value;
        onChanged();
        return this;
      }

      // required string declaringClassProtocolName = 2;
      private java.lang.Object declaringClassProtocolName_ = "";

      /**
       * <code>required string declaringClassProtocolName = 2;</code>
       *
       * <pre>
       **
       * RPCs for a particular interface (ie protocol) are done using a
       * IPC connection that is setup using rpcProxy.
       * The rpcProxy's has a declared protocol name that is 
       * sent form client to server at connection time. 
       *
       * Each Rpc call also sends a protocol name 
       * (called declaringClassprotocolName). This name is usually the same
       * as the connection protocol name except in some cases. 
       * For example metaProtocols such ProtocolInfoProto which get metainfo
       * about the protocol reuse the connection but need to indicate that
       * the actual protocol is different (i.e. the protocol is
       * ProtocolInfoProto) since they reuse the connection; in this case
       * the declaringClassProtocolName field is set to the ProtocolInfoProto
       * </pre>
       */
      public boolean hasDeclaringClassProtocolName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>required string declaringClassProtocolName = 2;</code>
       *
       * <pre>
       **
       * RPCs for a particular interface (ie protocol) are done using a
       * IPC connection that is setup using rpcProxy.
       * The rpcProxy's has a declared protocol name that is 
       * sent form client to server at connection time. 
       *
       * Each Rpc call also sends a protocol name 
       * (called declaringClassprotocolName). This name is usually the same
       * as the connection protocol name except in some cases. 
       * For example metaProtocols such ProtocolInfoProto which get metainfo
       * about the protocol reuse the connection but need to indicate that
       * the actual protocol is different (i.e. the protocol is
       * ProtocolInfoProto) since they reuse the connection; in this case
       * the declaringClassProtocolName field is set to the ProtocolInfoProto
       * </pre>
       */
      public java.lang.String getDeclaringClassProtocolName() {
        java.lang.Object ref = declaringClassProtocolName_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          declaringClassProtocolName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>required string declaringClassProtocolName = 2;</code>
       *
       * <pre>
       **
       * RPCs for a particular interface (ie protocol) are done using a
       * IPC connection that is setup using rpcProxy.
       * The rpcProxy's has a declared protocol name that is 
       * sent form client to server at connection time. 
       *
       * Each Rpc call also sends a protocol name 
       * (called declaringClassprotocolName). This name is usually the same
       * as the connection protocol name except in some cases. 
       * For example metaProtocols such ProtocolInfoProto which get metainfo
       * about the protocol reuse the connection but need to indicate that
       * the actual protocol is different (i.e. the protocol is
       * ProtocolInfoProto) since they reuse the connection; in this case
       * the declaringClassProtocolName field is set to the ProtocolInfoProto
       * </pre>
       */
      public com.google.protobuf.ByteString
      getDeclaringClassProtocolNameBytes() {
        java.lang.Object ref = declaringClassProtocolName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          declaringClassProtocolName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>required string declaringClassProtocolName = 2;</code>
       *
       * <pre>
       **
       * RPCs for a particular interface (ie protocol) are done using a
       * IPC connection that is setup using rpcProxy.
       * The rpcProxy's has a declared protocol name that is 
       * sent form client to server at connection time. 
       *
       * Each Rpc call also sends a protocol name 
       * (called declaringClassprotocolName). This name is usually the same
       * as the connection protocol name except in some cases. 
       * For example metaProtocols such ProtocolInfoProto which get metainfo
       * about the protocol reuse the connection but need to indicate that
       * the actual protocol is different (i.e. the protocol is
       * ProtocolInfoProto) since they reuse the connection; in this case
       * the declaringClassProtocolName field is set to the ProtocolInfoProto
       * </pre>
       */
      public Builder setDeclaringClassProtocolName(
          java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        declaringClassProtocolName_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required string declaringClassProtocolName = 2;</code>
       *
       * <pre>
       **
       * RPCs for a particular interface (ie protocol) are done using a
       * IPC connection that is setup using rpcProxy.
       * The rpcProxy's has a declared protocol name that is 
       * sent form client to server at connection time. 
       *
       * Each Rpc call also sends a protocol name 
       * (called declaringClassprotocolName). This name is usually the same
       * as the connection protocol name except in some cases. 
       * For example metaProtocols such ProtocolInfoProto which get metainfo
       * about the protocol reuse the connection but need to indicate that
       * the actual protocol is different (i.e. the protocol is
       * ProtocolInfoProto) since they reuse the connection; in this case
       * the declaringClassProtocolName field is set to the ProtocolInfoProto
       * </pre>
       */
      public Builder clearDeclaringClassProtocolName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        declaringClassProtocolName_ = getDefaultInstance().getDeclaringClassProtocolName();
        onChanged();
        return this;
      }

      /**
       * <code>required string declaringClassProtocolName = 2;</code>
       *
       * <pre>
       **
       * RPCs for a particular interface (ie protocol) are done using a
       * IPC connection that is setup using rpcProxy.
       * The rpcProxy's has a declared protocol name that is 
       * sent form client to server at connection time. 
       *
       * Each Rpc call also sends a protocol name 
       * (called declaringClassprotocolName). This name is usually the same
       * as the connection protocol name except in some cases. 
       * For example metaProtocols such ProtocolInfoProto which get metainfo
       * about the protocol reuse the connection but need to indicate that
       * the actual protocol is different (i.e. the protocol is
       * ProtocolInfoProto) since they reuse the connection; in this case
       * the declaringClassProtocolName field is set to the ProtocolInfoProto
       * </pre>
       */
      public Builder setDeclaringClassProtocolNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        declaringClassProtocolName_ = value;
        onChanged();
        return this;
      }

      // required uint64 clientProtocolVersion = 3;
      private long clientProtocolVersion_;

      /**
       * <code>required uint64 clientProtocolVersion = 3;</code>
       *
       * <pre>
       ** protocol version of class declaring the called method 
       * </pre>
       */
      public boolean hasClientProtocolVersion() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>required uint64 clientProtocolVersion = 3;</code>
       *
       * <pre>
       ** protocol version of class declaring the called method 
       * </pre>
       */
      public long getClientProtocolVersion() {
        return clientProtocolVersion_;
      }

      /**
       * <code>required uint64 clientProtocolVersion = 3;</code>
       *
       * <pre>
       ** protocol version of class declaring the called method 
       * </pre>
       */
      public Builder setClientProtocolVersion(long value) {
        bitField0_ |= 0x00000004;
        clientProtocolVersion_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required uint64 clientProtocolVersion = 3;</code>
       *
       * <pre>
       ** protocol version of class declaring the called method 
       * </pre>
       */
      public Builder clearClientProtocolVersion() {
        bitField0_ = (bitField0_ & ~0x00000004);
        clientProtocolVersion_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.common.RequestHeaderProto)
    }

    static {
      defaultInstance = new RequestHeaderProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.RequestHeaderProto)
  }

  private static com.google.protobuf.Descriptors.Descriptor
      internal_static_hadoop_common_RequestHeaderProto_descriptor;
  private static
  com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_common_RequestHeaderProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
  getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;

  static {
    java.lang.String[] descriptorData = {
        "\n\027ProtobufRpcEngine.proto\022\rhadoop.common" +
            "\"v\n\022RequestHeaderProto\022\022\n\nmethodName\030\001 \002" +
            "(\t\022\"\n\032declaringClassProtocolName\030\002 \002(\t\022\035" +
            "\n\025clientProtocolVersion\030\003 \002(\004*\t\010\350\007\020\200\200\200\200\002" +
            "B<\n\036org.apache.hadoop.ipc.protobufB\027Prot" +
            "obufRpcEngineProtos\240\001\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            internal_static_hadoop_common_RequestHeaderProto_descriptor =
                getDescriptor().getMessageTypes().get(0);
            internal_static_hadoop_common_RequestHeaderProto_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                internal_static_hadoop_common_RequestHeaderProto_descriptor,
                new java.lang.String[]{"MethodName", "DeclaringClassProtocolName", "ClientProtocolVersion",});
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
        .internalBuildGeneratedFileFrom(descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[]{
            }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
