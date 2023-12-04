// source: ProtobufRpcEngine2.proto

package org.apache.hadoop.ipc.protobuf;

public final class ProtobufRpcEngine2Protos {
  private ProtobufRpcEngine2Protos() {
  }

  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite) registry);
  }

  public interface RequestHeaderProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.RequestHeaderProto)
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.
          ExtendableMessageOrBuilder<RequestHeaderProto> {

    /**
     * <pre>
     ** Name of the RPC method 
     * </pre>
     *
     * <code>required string methodName = 1;</code>
     */
    boolean hasMethodName();

    /**
     * <pre>
     ** Name of the RPC method 
     * </pre>
     *
     * <code>required string methodName = 1;</code>
     */
    java.lang.String getMethodName();

    /**
     * <pre>
     ** Name of the RPC method 
     * </pre>
     *
     * <code>required string methodName = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
    getMethodNameBytes();

    /**
     * <pre>
     **
     * RPCs for a particular interface (ie protocol) are done using a
     * IPC connection that is setup using rpcProxy.
     * The rpcProxy's has a declared protocol name that is
     * sent form client to server at connection time.
     * Each Rpc call also sends a protocol name
     * (called declaringClassprotocolName). This name is usually the same
     * as the connection protocol name except in some cases.
     * For example metaProtocols such ProtocolInfoProto which get metainfo
     * about the protocol reuse the connection but need to indicate that
     * the actual protocol is different (i.e. the protocol is
     * ProtocolInfoProto) since they reuse the connection; in this case
     * the declaringClassProtocolName field is set to the ProtocolInfoProto
     * </pre>
     *
     * <code>required string declaringClassProtocolName = 2;</code>
     */
    boolean hasDeclaringClassProtocolName();

    /**
     * <pre>
     **
     * RPCs for a particular interface (ie protocol) are done using a
     * IPC connection that is setup using rpcProxy.
     * The rpcProxy's has a declared protocol name that is
     * sent form client to server at connection time.
     * Each Rpc call also sends a protocol name
     * (called declaringClassprotocolName). This name is usually the same
     * as the connection protocol name except in some cases.
     * For example metaProtocols such ProtocolInfoProto which get metainfo
     * about the protocol reuse the connection but need to indicate that
     * the actual protocol is different (i.e. the protocol is
     * ProtocolInfoProto) since they reuse the connection; in this case
     * the declaringClassProtocolName field is set to the ProtocolInfoProto
     * </pre>
     *
     * <code>required string declaringClassProtocolName = 2;</code>
     */
    java.lang.String getDeclaringClassProtocolName();

    /**
     * <pre>
     **
     * RPCs for a particular interface (ie protocol) are done using a
     * IPC connection that is setup using rpcProxy.
     * The rpcProxy's has a declared protocol name that is
     * sent form client to server at connection time.
     * Each Rpc call also sends a protocol name
     * (called declaringClassprotocolName). This name is usually the same
     * as the connection protocol name except in some cases.
     * For example metaProtocols such ProtocolInfoProto which get metainfo
     * about the protocol reuse the connection but need to indicate that
     * the actual protocol is different (i.e. the protocol is
     * ProtocolInfoProto) since they reuse the connection; in this case
     * the declaringClassProtocolName field is set to the ProtocolInfoProto
     * </pre>
     *
     * <code>required string declaringClassProtocolName = 2;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
    getDeclaringClassProtocolNameBytes();

    /**
     * <pre>
     ** protocol version of class declaring the called method 
     * </pre>
     *
     * <code>required uint64 clientProtocolVersion = 3;</code>
     */
    boolean hasClientProtocolVersion();

    /**
     * <pre>
     ** protocol version of class declaring the called method 
     * </pre>
     *
     * <code>required uint64 clientProtocolVersion = 3;</code>
     */
    long getClientProtocolVersion();
  }

  /**
   * <pre>
   **
   * This message is the header for the Protobuf Rpc Engine
   * when sending a RPC request from  RPC client to the RPC server.
   * The actual request (serialized as protobuf) follows this request.
   * No special header is needed for the Rpc Response for Protobuf Rpc Engine.
   * The normal RPC response header (see RpcHeader.proto) are sufficient.
   * </pre>
   *
   * Protobuf type {@code hadoop.common.RequestHeaderProto}
   */
  public static final class RequestHeaderProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.ExtendableMessage<
          RequestHeaderProto> implements
      // @@protoc_insertion_point(message_implements:hadoop.common.RequestHeaderProto)
      RequestHeaderProtoOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use RequestHeaderProto.newBuilder() to construct.
    private RequestHeaderProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.ExtendableBuilder<org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto, ?> builder) {
      super(builder);
    }

    private RequestHeaderProto() {
      methodName_ = "";
      declaringClassProtocolName_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    private RequestHeaderProto(
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
              methodName_ = bs;
              break;
            }
            case 18: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              declaringClassProtocolName_ = bs;
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              clientProtocolVersion_ = input.readUInt64();
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
      return org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.internal_static_hadoop_common_RequestHeaderProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.internal_static_hadoop_common_RequestHeaderProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto.class, org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto.Builder.class);
    }

    private int bitField0_;
    public static final int METHODNAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object methodName_;

    /**
     * <pre>
     ** Name of the RPC method 
     * </pre>
     *
     * <code>required string methodName = 1;</code>
     */
    public boolean hasMethodName() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <pre>
     ** Name of the RPC method 
     * </pre>
     *
     * <code>required string methodName = 1;</code>
     */
    public java.lang.String getMethodName() {
      java.lang.Object ref = methodName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs =
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          methodName_ = s;
        }
        return s;
      }
    }

    /**
     * <pre>
     ** Name of the RPC method 
     * </pre>
     *
     * <code>required string methodName = 1;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
    getMethodNameBytes() {
      java.lang.Object ref = methodName_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b =
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        methodName_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int DECLARINGCLASSPROTOCOLNAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object declaringClassProtocolName_;

    /**
     * <pre>
     **
     * RPCs for a particular interface (ie protocol) are done using a
     * IPC connection that is setup using rpcProxy.
     * The rpcProxy's has a declared protocol name that is
     * sent form client to server at connection time.
     * Each Rpc call also sends a protocol name
     * (called declaringClassprotocolName). This name is usually the same
     * as the connection protocol name except in some cases.
     * For example metaProtocols such ProtocolInfoProto which get metainfo
     * about the protocol reuse the connection but need to indicate that
     * the actual protocol is different (i.e. the protocol is
     * ProtocolInfoProto) since they reuse the connection; in this case
     * the declaringClassProtocolName field is set to the ProtocolInfoProto
     * </pre>
     *
     * <code>required string declaringClassProtocolName = 2;</code>
     */
    public boolean hasDeclaringClassProtocolName() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     * <pre>
     **
     * RPCs for a particular interface (ie protocol) are done using a
     * IPC connection that is setup using rpcProxy.
     * The rpcProxy's has a declared protocol name that is
     * sent form client to server at connection time.
     * Each Rpc call also sends a protocol name
     * (called declaringClassprotocolName). This name is usually the same
     * as the connection protocol name except in some cases.
     * For example metaProtocols such ProtocolInfoProto which get metainfo
     * about the protocol reuse the connection but need to indicate that
     * the actual protocol is different (i.e. the protocol is
     * ProtocolInfoProto) since they reuse the connection; in this case
     * the declaringClassProtocolName field is set to the ProtocolInfoProto
     * </pre>
     *
     * <code>required string declaringClassProtocolName = 2;</code>
     */
    public java.lang.String getDeclaringClassProtocolName() {
      java.lang.Object ref = declaringClassProtocolName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs =
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          declaringClassProtocolName_ = s;
        }
        return s;
      }
    }

    /**
     * <pre>
     **
     * RPCs for a particular interface (ie protocol) are done using a
     * IPC connection that is setup using rpcProxy.
     * The rpcProxy's has a declared protocol name that is
     * sent form client to server at connection time.
     * Each Rpc call also sends a protocol name
     * (called declaringClassprotocolName). This name is usually the same
     * as the connection protocol name except in some cases.
     * For example metaProtocols such ProtocolInfoProto which get metainfo
     * about the protocol reuse the connection but need to indicate that
     * the actual protocol is different (i.e. the protocol is
     * ProtocolInfoProto) since they reuse the connection; in this case
     * the declaringClassProtocolName field is set to the ProtocolInfoProto
     * </pre>
     *
     * <code>required string declaringClassProtocolName = 2;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
    getDeclaringClassProtocolNameBytes() {
      java.lang.Object ref = declaringClassProtocolName_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b =
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        declaringClassProtocolName_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int CLIENTPROTOCOLVERSION_FIELD_NUMBER = 3;
    private long clientProtocolVersion_;

    /**
     * <pre>
     ** protocol version of class declaring the called method 
     * </pre>
     *
     * <code>required uint64 clientProtocolVersion = 3;</code>
     */
    public boolean hasClientProtocolVersion() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     * <pre>
     ** protocol version of class declaring the called method 
     * </pre>
     *
     * <code>required uint64 clientProtocolVersion = 3;</code>
     */
    public long getClientProtocolVersion() {
      return clientProtocolVersion_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

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

    @java.lang.Override
    public void writeTo(org.apache.hadoop.thirdparty.protobuf.CodedOutputStream output)
        throws java.io.IOException {
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .ExtendableMessage<org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto>.ExtensionWriter
          extensionWriter = newExtensionWriter();
      if (((bitField0_ & 0x00000001) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, methodName_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 2, declaringClassProtocolName_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeUInt64(3, clientProtocolVersion_);
      }
      extensionWriter.writeUntil(536870912, output);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, methodName_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(2, declaringClassProtocolName_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
            .computeUInt64Size(3, clientProtocolVersion_);
      }
      size += extensionsSerializedSize();
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto other = (org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto) obj;

      if (hasMethodName() != other.hasMethodName()) return false;
      if (hasMethodName()) {
        if (!getMethodName()
            .equals(other.getMethodName())) return false;
      }
      if (hasDeclaringClassProtocolName() != other.hasDeclaringClassProtocolName()) return false;
      if (hasDeclaringClassProtocolName()) {
        if (!getDeclaringClassProtocolName()
            .equals(other.getDeclaringClassProtocolName())) return false;
      }
      if (hasClientProtocolVersion() != other.hasClientProtocolVersion()) return false;
      if (hasClientProtocolVersion()) {
        if (getClientProtocolVersion()
            != other.getClientProtocolVersion()) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      if (!getExtensionFields().equals(other.getExtensionFields()))
        return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
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
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getClientProtocolVersion());
      }
      hash = hashFields(hash, getExtensionFields());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto parseFrom(
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

    public static Builder newBuilder(org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto prototype) {
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
     * This message is the header for the Protobuf Rpc Engine
     * when sending a RPC request from  RPC client to the RPC server.
     * The actual request (serialized as protobuf) follows this request.
     * No special header is needed for the Rpc Response for Protobuf Rpc Engine.
     * The normal RPC response header (see RpcHeader.proto) are sufficient.
     * </pre>
     *
     * Protobuf type {@code hadoop.common.RequestHeaderProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.ExtendableBuilder<
            org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto, Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.RequestHeaderProto)
        org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.internal_static_hadoop_common_RequestHeaderProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.internal_static_hadoop_common_RequestHeaderProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto.class, org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto.Builder.class);
      }

      // Construct using org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto.newBuilder()
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
        methodName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        declaringClassProtocolName_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        clientProtocolVersion_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.internal_static_hadoop_common_RequestHeaderProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto getDefaultInstanceForType() {
        return org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto build() {
        org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto buildPartial() {
        org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto result = new org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.methodName_ = methodName_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.declaringClassProtocolName_ = declaringClassProtocolName_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.clientProtocolVersion_ = clientProtocolVersion_;
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
      public <Type> Builder setExtension(
          org.apache.hadoop.thirdparty.protobuf.GeneratedMessage.GeneratedExtension<
              org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto, Type> extension,
          Type value) {
        return super.setExtension(extension, value);
      }

      @java.lang.Override
      public <Type> Builder setExtension(
          org.apache.hadoop.thirdparty.protobuf.GeneratedMessage.GeneratedExtension<
              org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto, java.util.List<Type>> extension,
          int index, Type value) {
        return super.setExtension(extension, index, value);
      }

      @java.lang.Override
      public <Type> Builder addExtension(
          org.apache.hadoop.thirdparty.protobuf.GeneratedMessage.GeneratedExtension<
              org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto, java.util.List<Type>> extension,
          Type value) {
        return super.addExtension(extension, value);
      }

      @java.lang.Override
      public <Type> Builder clearExtension(
          org.apache.hadoop.thirdparty.protobuf.GeneratedMessage.GeneratedExtension<
              org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto, ?> extension) {
        return super.clearExtension(extension);
      }

      @java.lang.Override
      public Builder mergeFrom(org.apache.hadoop.thirdparty.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto) {
          return mergeFrom((org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto other) {
        if (other == org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto.getDefaultInstance())
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
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
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

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object methodName_ = "";

      /**
       * <pre>
       ** Name of the RPC method 
       * </pre>
       *
       * <code>required string methodName = 1;</code>
       */
      public boolean hasMethodName() {
        return ((bitField0_ & 0x00000001) != 0);
      }

      /**
       * <pre>
       ** Name of the RPC method 
       * </pre>
       *
       * <code>required string methodName = 1;</code>
       */
      public java.lang.String getMethodName() {
        java.lang.Object ref = methodName_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            methodName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <pre>
       ** Name of the RPC method 
       * </pre>
       *
       * <code>required string methodName = 1;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
      getMethodNameBytes() {
        java.lang.Object ref = methodName_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b =
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          methodName_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }

      /**
       * <pre>
       ** Name of the RPC method 
       * </pre>
       *
       * <code>required string methodName = 1;</code>
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
       * <pre>
       ** Name of the RPC method 
       * </pre>
       *
       * <code>required string methodName = 1;</code>
       */
      public Builder clearMethodName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        methodName_ = getDefaultInstance().getMethodName();
        onChanged();
        return this;
      }

      /**
       * <pre>
       ** Name of the RPC method 
       * </pre>
       *
       * <code>required string methodName = 1;</code>
       */
      public Builder setMethodNameBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        methodName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object declaringClassProtocolName_ = "";

      /**
       * <pre>
       **
       * RPCs for a particular interface (ie protocol) are done using a
       * IPC connection that is setup using rpcProxy.
       * The rpcProxy's has a declared protocol name that is
       * sent form client to server at connection time.
       * Each Rpc call also sends a protocol name
       * (called declaringClassprotocolName). This name is usually the same
       * as the connection protocol name except in some cases.
       * For example metaProtocols such ProtocolInfoProto which get metainfo
       * about the protocol reuse the connection but need to indicate that
       * the actual protocol is different (i.e. the protocol is
       * ProtocolInfoProto) since they reuse the connection; in this case
       * the declaringClassProtocolName field is set to the ProtocolInfoProto
       * </pre>
       *
       * <code>required string declaringClassProtocolName = 2;</code>
       */
      public boolean hasDeclaringClassProtocolName() {
        return ((bitField0_ & 0x00000002) != 0);
      }

      /**
       * <pre>
       **
       * RPCs for a particular interface (ie protocol) are done using a
       * IPC connection that is setup using rpcProxy.
       * The rpcProxy's has a declared protocol name that is
       * sent form client to server at connection time.
       * Each Rpc call also sends a protocol name
       * (called declaringClassprotocolName). This name is usually the same
       * as the connection protocol name except in some cases.
       * For example metaProtocols such ProtocolInfoProto which get metainfo
       * about the protocol reuse the connection but need to indicate that
       * the actual protocol is different (i.e. the protocol is
       * ProtocolInfoProto) since they reuse the connection; in this case
       * the declaringClassProtocolName field is set to the ProtocolInfoProto
       * </pre>
       *
       * <code>required string declaringClassProtocolName = 2;</code>
       */
      public java.lang.String getDeclaringClassProtocolName() {
        java.lang.Object ref = declaringClassProtocolName_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            declaringClassProtocolName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <pre>
       **
       * RPCs for a particular interface (ie protocol) are done using a
       * IPC connection that is setup using rpcProxy.
       * The rpcProxy's has a declared protocol name that is
       * sent form client to server at connection time.
       * Each Rpc call also sends a protocol name
       * (called declaringClassprotocolName). This name is usually the same
       * as the connection protocol name except in some cases.
       * For example metaProtocols such ProtocolInfoProto which get metainfo
       * about the protocol reuse the connection but need to indicate that
       * the actual protocol is different (i.e. the protocol is
       * ProtocolInfoProto) since they reuse the connection; in this case
       * the declaringClassProtocolName field is set to the ProtocolInfoProto
       * </pre>
       *
       * <code>required string declaringClassProtocolName = 2;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
      getDeclaringClassProtocolNameBytes() {
        java.lang.Object ref = declaringClassProtocolName_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b =
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          declaringClassProtocolName_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }

      /**
       * <pre>
       **
       * RPCs for a particular interface (ie protocol) are done using a
       * IPC connection that is setup using rpcProxy.
       * The rpcProxy's has a declared protocol name that is
       * sent form client to server at connection time.
       * Each Rpc call also sends a protocol name
       * (called declaringClassprotocolName). This name is usually the same
       * as the connection protocol name except in some cases.
       * For example metaProtocols such ProtocolInfoProto which get metainfo
       * about the protocol reuse the connection but need to indicate that
       * the actual protocol is different (i.e. the protocol is
       * ProtocolInfoProto) since they reuse the connection; in this case
       * the declaringClassProtocolName field is set to the ProtocolInfoProto
       * </pre>
       *
       * <code>required string declaringClassProtocolName = 2;</code>
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
       * <pre>
       **
       * RPCs for a particular interface (ie protocol) are done using a
       * IPC connection that is setup using rpcProxy.
       * The rpcProxy's has a declared protocol name that is
       * sent form client to server at connection time.
       * Each Rpc call also sends a protocol name
       * (called declaringClassprotocolName). This name is usually the same
       * as the connection protocol name except in some cases.
       * For example metaProtocols such ProtocolInfoProto which get metainfo
       * about the protocol reuse the connection but need to indicate that
       * the actual protocol is different (i.e. the protocol is
       * ProtocolInfoProto) since they reuse the connection; in this case
       * the declaringClassProtocolName field is set to the ProtocolInfoProto
       * </pre>
       *
       * <code>required string declaringClassProtocolName = 2;</code>
       */
      public Builder clearDeclaringClassProtocolName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        declaringClassProtocolName_ = getDefaultInstance().getDeclaringClassProtocolName();
        onChanged();
        return this;
      }

      /**
       * <pre>
       **
       * RPCs for a particular interface (ie protocol) are done using a
       * IPC connection that is setup using rpcProxy.
       * The rpcProxy's has a declared protocol name that is
       * sent form client to server at connection time.
       * Each Rpc call also sends a protocol name
       * (called declaringClassprotocolName). This name is usually the same
       * as the connection protocol name except in some cases.
       * For example metaProtocols such ProtocolInfoProto which get metainfo
       * about the protocol reuse the connection but need to indicate that
       * the actual protocol is different (i.e. the protocol is
       * ProtocolInfoProto) since they reuse the connection; in this case
       * the declaringClassProtocolName field is set to the ProtocolInfoProto
       * </pre>
       *
       * <code>required string declaringClassProtocolName = 2;</code>
       */
      public Builder setDeclaringClassProtocolNameBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        declaringClassProtocolName_ = value;
        onChanged();
        return this;
      }

      private long clientProtocolVersion_;

      /**
       * <pre>
       ** protocol version of class declaring the called method 
       * </pre>
       *
       * <code>required uint64 clientProtocolVersion = 3;</code>
       */
      public boolean hasClientProtocolVersion() {
        return ((bitField0_ & 0x00000004) != 0);
      }

      /**
       * <pre>
       ** protocol version of class declaring the called method 
       * </pre>
       *
       * <code>required uint64 clientProtocolVersion = 3;</code>
       */
      public long getClientProtocolVersion() {
        return clientProtocolVersion_;
      }

      /**
       * <pre>
       ** protocol version of class declaring the called method 
       * </pre>
       *
       * <code>required uint64 clientProtocolVersion = 3;</code>
       */
      public Builder setClientProtocolVersion(long value) {
        bitField0_ |= 0x00000004;
        clientProtocolVersion_ = value;
        onChanged();
        return this;
      }

      /**
       * <pre>
       ** protocol version of class declaring the called method 
       * </pre>
       *
       * <code>required uint64 clientProtocolVersion = 3;</code>
       */
      public Builder clearClientProtocolVersion() {
        bitField0_ = (bitField0_ & ~0x00000004);
        clientProtocolVersion_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.RequestHeaderProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.RequestHeaderProto)
    private static final org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto();
    }

    public static org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final org.apache.hadoop.thirdparty.protobuf.Parser<RequestHeaderProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<RequestHeaderProto>() {
      @java.lang.Override
      public RequestHeaderProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new RequestHeaderProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<RequestHeaderProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<RequestHeaderProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.ipc.protobuf.ProtobufRpcEngine2Protos.RequestHeaderProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      internal_static_hadoop_common_RequestHeaderProto_descriptor;
  private static final
  org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_RequestHeaderProto_fieldAccessorTable;

  public static org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
  getDescriptor() {
    return descriptor;
  }

  private static org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      descriptor;

  static {
    java.lang.String[] descriptorData = {
        "\n\030ProtobufRpcEngine2.proto\022\rhadoop.commo" +
            "n\"v\n\022RequestHeaderProto\022\022\n\nmethodName\030\001 " +
            "\002(\t\022\"\n\032declaringClassProtocolName\030\002 \002(\t\022" +
            "\035\n\025clientProtocolVersion\030\003 \002(\004*\t\010\350\007\020\200\200\200\200" +
            "\002B=\n\036org.apache.hadoop.ipc.protobufB\030Pro" +
            "tobufRpcEngine2Protos\240\001\001"
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
    internal_static_hadoop_common_RequestHeaderProto_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_hadoop_common_RequestHeaderProto_fieldAccessorTable = new
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_RequestHeaderProto_descriptor,
        new java.lang.String[]{"MethodName", "DeclaringClassProtocolName", "ClientProtocolVersion",});
  }

  // @@protoc_insertion_point(outer_class_scope)
}
