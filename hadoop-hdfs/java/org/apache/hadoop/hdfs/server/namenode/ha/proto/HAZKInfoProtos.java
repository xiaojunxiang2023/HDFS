// source: HAZKInfo.proto

package org.apache.hadoop.hdfs.server.namenode.ha.proto;

public final class HAZKInfoProtos {
  private HAZKInfoProtos() {}
  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ActiveNodeInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.ActiveNodeInfo)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required string nameserviceId = 1;</code>
     */
    boolean hasNameserviceId();
    /**
     * <code>required string nameserviceId = 1;</code>
     */
    java.lang.String getNameserviceId();
    /**
     * <code>required string nameserviceId = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getNameserviceIdBytes();

    /**
     * <code>required string namenodeId = 2;</code>
     */
    boolean hasNamenodeId();
    /**
     * <code>required string namenodeId = 2;</code>
     */
    java.lang.String getNamenodeId();
    /**
     * <code>required string namenodeId = 2;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getNamenodeIdBytes();

    /**
     * <code>required string hostname = 3;</code>
     */
    boolean hasHostname();
    /**
     * <code>required string hostname = 3;</code>
     */
    java.lang.String getHostname();
    /**
     * <code>required string hostname = 3;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getHostnameBytes();

    /**
     * <code>required int32 port = 4;</code>
     */
    boolean hasPort();
    /**
     * <code>required int32 port = 4;</code>
     */
    int getPort();

    /**
     * <code>required int32 zkfcPort = 5;</code>
     */
    boolean hasZkfcPort();
    /**
     * <code>required int32 zkfcPort = 5;</code>
     */
    int getZkfcPort();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.ActiveNodeInfo}
   */
  public  static final class ActiveNodeInfo extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.ActiveNodeInfo)
      ActiveNodeInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ActiveNodeInfo.newBuilder() to construct.
    private ActiveNodeInfo(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ActiveNodeInfo() {
      nameserviceId_ = "";
      namenodeId_ = "";
      hostname_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ActiveNodeInfo(
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
              nameserviceId_ = bs;
              break;
            }
            case 18: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              namenodeId_ = bs;
              break;
            }
            case 26: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              hostname_ = bs;
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              port_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              zkfcPort_ = input.readInt32();
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
      return org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.internal_static_hadoop_hdfs_ActiveNodeInfo_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.internal_static_hadoop_hdfs_ActiveNodeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo.class, org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo.Builder.class);
    }

    private int bitField0_;
    public static final int NAMESERVICEID_FIELD_NUMBER = 1;
    private volatile java.lang.Object nameserviceId_;
    /**
     * <code>required string nameserviceId = 1;</code>
     */
    public boolean hasNameserviceId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string nameserviceId = 1;</code>
     */
    public java.lang.String getNameserviceId() {
      java.lang.Object ref = nameserviceId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          nameserviceId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string nameserviceId = 1;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getNameserviceIdBytes() {
      java.lang.Object ref = nameserviceId_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nameserviceId_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int NAMENODEID_FIELD_NUMBER = 2;
    private volatile java.lang.Object namenodeId_;
    /**
     * <code>required string namenodeId = 2;</code>
     */
    public boolean hasNamenodeId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required string namenodeId = 2;</code>
     */
    public java.lang.String getNamenodeId() {
      java.lang.Object ref = namenodeId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          namenodeId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string namenodeId = 2;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getNamenodeIdBytes() {
      java.lang.Object ref = namenodeId_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        namenodeId_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int HOSTNAME_FIELD_NUMBER = 3;
    private volatile java.lang.Object hostname_;
    /**
     * <code>required string hostname = 3;</code>
     */
    public boolean hasHostname() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required string hostname = 3;</code>
     */
    public java.lang.String getHostname() {
      java.lang.Object ref = hostname_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          hostname_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string hostname = 3;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getHostnameBytes() {
      java.lang.Object ref = hostname_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hostname_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int PORT_FIELD_NUMBER = 4;
    private int port_;
    /**
     * <code>required int32 port = 4;</code>
     */
    public boolean hasPort() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>required int32 port = 4;</code>
     */
    public int getPort() {
      return port_;
    }

    public static final int ZKFCPORT_FIELD_NUMBER = 5;
    private int zkfcPort_;
    /**
     * <code>required int32 zkfcPort = 5;</code>
     */
    public boolean hasZkfcPort() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>required int32 zkfcPort = 5;</code>
     */
    public int getZkfcPort() {
      return zkfcPort_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasNameserviceId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasNamenodeId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasHostname()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPort()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasZkfcPort()) {
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, nameserviceId_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 2, namenodeId_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 3, hostname_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeInt32(4, port_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        output.writeInt32(5, zkfcPort_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, nameserviceId_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(2, namenodeId_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(3, hostname_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeInt32Size(4, port_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeInt32Size(5, zkfcPort_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo other = (org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo) obj;

      if (hasNameserviceId() != other.hasNameserviceId()) return false;
      if (hasNameserviceId()) {
        if (!getNameserviceId()
            .equals(other.getNameserviceId())) return false;
      }
      if (hasNamenodeId() != other.hasNamenodeId()) return false;
      if (hasNamenodeId()) {
        if (!getNamenodeId()
            .equals(other.getNamenodeId())) return false;
      }
      if (hasHostname() != other.hasHostname()) return false;
      if (hasHostname()) {
        if (!getHostname()
            .equals(other.getHostname())) return false;
      }
      if (hasPort() != other.hasPort()) return false;
      if (hasPort()) {
        if (getPort()
            != other.getPort()) return false;
      }
      if (hasZkfcPort() != other.hasZkfcPort()) return false;
      if (hasZkfcPort()) {
        if (getZkfcPort()
            != other.getZkfcPort()) return false;
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
      if (hasNameserviceId()) {
        hash = (37 * hash) + NAMESERVICEID_FIELD_NUMBER;
        hash = (53 * hash) + getNameserviceId().hashCode();
      }
      if (hasNamenodeId()) {
        hash = (37 * hash) + NAMENODEID_FIELD_NUMBER;
        hash = (53 * hash) + getNamenodeId().hashCode();
      }
      if (hasHostname()) {
        hash = (37 * hash) + HOSTNAME_FIELD_NUMBER;
        hash = (53 * hash) + getHostname().hashCode();
      }
      if (hasPort()) {
        hash = (37 * hash) + PORT_FIELD_NUMBER;
        hash = (53 * hash) + getPort();
      }
      if (hasZkfcPort()) {
        hash = (37 * hash) + ZKFCPORT_FIELD_NUMBER;
        hash = (53 * hash) + getZkfcPort();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo prototype) {
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
     * Protobuf type {@code hadoop.hdfs.ActiveNodeInfo}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.ActiveNodeInfo)
        org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.internal_static_hadoop_hdfs_ActiveNodeInfo_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.internal_static_hadoop_hdfs_ActiveNodeInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo.class, org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo.newBuilder()
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
        nameserviceId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        namenodeId_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        hostname_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        port_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        zkfcPort_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.internal_static_hadoop_hdfs_ActiveNodeInfo_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo build() {
        org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo buildPartial() {
        org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo result = new org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.nameserviceId_ = nameserviceId_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.namenodeId_ = namenodeId_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.hostname_ = hostname_;
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.port_ = port_;
          to_bitField0_ |= 0x00000008;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.zkfcPort_ = zkfcPort_;
          to_bitField0_ |= 0x00000010;
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
        if (other instanceof org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo) {
          return mergeFrom((org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo other) {
        if (other == org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo.getDefaultInstance()) return this;
        if (other.hasNameserviceId()) {
          bitField0_ |= 0x00000001;
          nameserviceId_ = other.nameserviceId_;
          onChanged();
        }
        if (other.hasNamenodeId()) {
          bitField0_ |= 0x00000002;
          namenodeId_ = other.namenodeId_;
          onChanged();
        }
        if (other.hasHostname()) {
          bitField0_ |= 0x00000004;
          hostname_ = other.hostname_;
          onChanged();
        }
        if (other.hasPort()) {
          setPort(other.getPort());
        }
        if (other.hasZkfcPort()) {
          setZkfcPort(other.getZkfcPort());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasNameserviceId()) {
          return false;
        }
        if (!hasNamenodeId()) {
          return false;
        }
        if (!hasHostname()) {
          return false;
        }
        if (!hasPort()) {
          return false;
        }
        if (!hasZkfcPort()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object nameserviceId_ = "";
      /**
       * <code>required string nameserviceId = 1;</code>
       */
      public boolean hasNameserviceId() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string nameserviceId = 1;</code>
       */
      public java.lang.String getNameserviceId() {
        java.lang.Object ref = nameserviceId_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            nameserviceId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string nameserviceId = 1;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getNameserviceIdBytes() {
        java.lang.Object ref = nameserviceId_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          nameserviceId_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string nameserviceId = 1;</code>
       */
      public Builder setNameserviceId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        nameserviceId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string nameserviceId = 1;</code>
       */
      public Builder clearNameserviceId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        nameserviceId_ = getDefaultInstance().getNameserviceId();
        onChanged();
        return this;
      }
      /**
       * <code>required string nameserviceId = 1;</code>
       */
      public Builder setNameserviceIdBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        nameserviceId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object namenodeId_ = "";
      /**
       * <code>required string namenodeId = 2;</code>
       */
      public boolean hasNamenodeId() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required string namenodeId = 2;</code>
       */
      public java.lang.String getNamenodeId() {
        java.lang.Object ref = namenodeId_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            namenodeId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string namenodeId = 2;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getNamenodeIdBytes() {
        java.lang.Object ref = namenodeId_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          namenodeId_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string namenodeId = 2;</code>
       */
      public Builder setNamenodeId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        namenodeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string namenodeId = 2;</code>
       */
      public Builder clearNamenodeId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        namenodeId_ = getDefaultInstance().getNamenodeId();
        onChanged();
        return this;
      }
      /**
       * <code>required string namenodeId = 2;</code>
       */
      public Builder setNamenodeIdBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        namenodeId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object hostname_ = "";
      /**
       * <code>required string hostname = 3;</code>
       */
      public boolean hasHostname() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>required string hostname = 3;</code>
       */
      public java.lang.String getHostname() {
        java.lang.Object ref = hostname_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            hostname_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string hostname = 3;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getHostnameBytes() {
        java.lang.Object ref = hostname_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          hostname_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string hostname = 3;</code>
       */
      public Builder setHostname(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        hostname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string hostname = 3;</code>
       */
      public Builder clearHostname() {
        bitField0_ = (bitField0_ & ~0x00000004);
        hostname_ = getDefaultInstance().getHostname();
        onChanged();
        return this;
      }
      /**
       * <code>required string hostname = 3;</code>
       */
      public Builder setHostnameBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        hostname_ = value;
        onChanged();
        return this;
      }

      private int port_ ;
      /**
       * <code>required int32 port = 4;</code>
       */
      public boolean hasPort() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>required int32 port = 4;</code>
       */
      public int getPort() {
        return port_;
      }
      /**
       * <code>required int32 port = 4;</code>
       */
      public Builder setPort(int value) {
        bitField0_ |= 0x00000008;
        port_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 port = 4;</code>
       */
      public Builder clearPort() {
        bitField0_ = (bitField0_ & ~0x00000008);
        port_ = 0;
        onChanged();
        return this;
      }

      private int zkfcPort_ ;
      /**
       * <code>required int32 zkfcPort = 5;</code>
       */
      public boolean hasZkfcPort() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <code>required int32 zkfcPort = 5;</code>
       */
      public int getZkfcPort() {
        return zkfcPort_;
      }
      /**
       * <code>required int32 zkfcPort = 5;</code>
       */
      public Builder setZkfcPort(int value) {
        bitField0_ |= 0x00000010;
        zkfcPort_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 zkfcPort = 5;</code>
       */
      public Builder clearZkfcPort() {
        bitField0_ = (bitField0_ & ~0x00000010);
        zkfcPort_ = 0;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.ActiveNodeInfo)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ActiveNodeInfo)
    private static final org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo();
    }

    public static org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<ActiveNodeInfo>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<ActiveNodeInfo>() {
      @java.lang.Override
      public ActiveNodeInfo parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new ActiveNodeInfo(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<ActiveNodeInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<ActiveNodeInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.server.namenode.ha.proto.HAZKInfoProtos.ActiveNodeInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_ActiveNodeInfo_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_ActiveNodeInfo_fieldAccessorTable;

  public static org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016HAZKInfo.proto\022\013hadoop.hdfs\"m\n\016ActiveN" +
      "odeInfo\022\025\n\rnameserviceId\030\001 \002(\t\022\022\n\nnameno" +
      "deId\030\002 \002(\t\022\020\n\010hostname\030\003 \002(\t\022\014\n\004port\030\004 \002" +
      "(\005\022\020\n\010zkfcPort\030\005 \002(\005BA\n/org.apache.hadoo" +
      "p.hdfs.server.namenode.ha.protoB\016HAZKInf" +
      "oProtos"
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
    internal_static_hadoop_hdfs_ActiveNodeInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hadoop_hdfs_ActiveNodeInfo_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_ActiveNodeInfo_descriptor,
        new java.lang.String[] { "NameserviceId", "NamenodeId", "Hostname", "Port", "ZkfcPort", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
