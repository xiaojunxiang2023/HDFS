// source: HdfsServer.proto

package org.apache.hadoop.hdfs.protocol.proto;

public final class HdfsServerProtos {
  private HdfsServerProtos() {}
  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   **
   * State of a block replica at a datanode
   * </pre>
   *
   * Protobuf enum {@code hadoop.hdfs.ReplicaStateProto}
   */
  public enum ReplicaStateProto
      implements org.apache.hadoop.thirdparty.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * State of a replica when it is not modified
     * </pre>
     *
     * <code>FINALIZED = 0;</code>
     */
    FINALIZED(0),
    /**
     * <pre>
     * State of replica that is being written to
     * </pre>
     *
     * <code>RBW = 1;</code>
     */
    RBW(1),
    /**
     * <pre>
     * State of replica that is waiting to be recovered
     * </pre>
     *
     * <code>RWR = 2;</code>
     */
    RWR(2),
    /**
     * <pre>
     * State of replica that is under recovery
     * </pre>
     *
     * <code>RUR = 3;</code>
     */
    RUR(3),
    /**
     * <pre>
     * State of replica that is created for replication
     * </pre>
     *
     * <code>TEMPORARY = 4;</code>
     */
    TEMPORARY(4),
    ;

    /**
     * <pre>
     * State of a replica when it is not modified
     * </pre>
     *
     * <code>FINALIZED = 0;</code>
     */
    public static final int FINALIZED_VALUE = 0;
    /**
     * <pre>
     * State of replica that is being written to
     * </pre>
     *
     * <code>RBW = 1;</code>
     */
    public static final int RBW_VALUE = 1;
    /**
     * <pre>
     * State of replica that is waiting to be recovered
     * </pre>
     *
     * <code>RWR = 2;</code>
     */
    public static final int RWR_VALUE = 2;
    /**
     * <pre>
     * State of replica that is under recovery
     * </pre>
     *
     * <code>RUR = 3;</code>
     */
    public static final int RUR_VALUE = 3;
    /**
     * <pre>
     * State of replica that is created for replication
     * </pre>
     *
     * <code>TEMPORARY = 4;</code>
     */
    public static final int TEMPORARY_VALUE = 4;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ReplicaStateProto valueOf(int value) {
      return forNumber(value);
    }

    public static ReplicaStateProto forNumber(int value) {
      switch (value) {
        case 0: return FINALIZED;
        case 1: return RBW;
        case 2: return RWR;
        case 3: return RUR;
        case 4: return TEMPORARY;
        default: return null;
      }
    }

    public static org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<ReplicaStateProto>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<
        ReplicaStateProto> internalValueMap =
          new org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<ReplicaStateProto>() {
            public ReplicaStateProto findValueByNumber(int number) {
              return ReplicaStateProto.forNumber(number);
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
      return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.getDescriptor().getEnumTypes().get(0);
    }

    private static final ReplicaStateProto[] VALUES = values();

    public static ReplicaStateProto valueOf(
        org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ReplicaStateProto(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:hadoop.hdfs.ReplicaStateProto)
  }

  public interface BlockKeyProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.BlockKeyProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Key identifier
     * </pre>
     *
     * <code>required uint32 keyId = 1;</code>
     */
    boolean hasKeyId();
    /**
     * <pre>
     * Key identifier
     * </pre>
     *
     * <code>required uint32 keyId = 1;</code>
     */
    int getKeyId();

    /**
     * <pre>
     * Expiry time in milliseconds
     * </pre>
     *
     * <code>required uint64 expiryDate = 2;</code>
     */
    boolean hasExpiryDate();
    /**
     * <pre>
     * Expiry time in milliseconds
     * </pre>
     *
     * <code>required uint64 expiryDate = 2;</code>
     */
    long getExpiryDate();

    /**
     * <pre>
     * Key secret
     * </pre>
     *
     * <code>optional bytes keyBytes = 3;</code>
     */
    boolean hasKeyBytes();
    /**
     * <pre>
     * Key secret
     * </pre>
     *
     * <code>optional bytes keyBytes = 3;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString getKeyBytes();
  }
  /**
   * <pre>
   **
   * Block access token information
   * </pre>
   *
   * Protobuf type {@code hadoop.hdfs.BlockKeyProto}
   */
  public  static final class BlockKeyProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.BlockKeyProto)
      BlockKeyProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BlockKeyProto.newBuilder() to construct.
    private BlockKeyProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BlockKeyProto() {
      keyBytes_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BlockKeyProto(
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
              keyId_ = input.readUInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              expiryDate_ = input.readUInt64();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              keyBytes_ = input.readBytes();
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
      return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_BlockKeyProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_BlockKeyProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto.class, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto.Builder.class);
    }

    private int bitField0_;
    public static final int KEYID_FIELD_NUMBER = 1;
    private int keyId_;
    /**
     * <pre>
     * Key identifier
     * </pre>
     *
     * <code>required uint32 keyId = 1;</code>
     */
    public boolean hasKeyId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Key identifier
     * </pre>
     *
     * <code>required uint32 keyId = 1;</code>
     */
    public int getKeyId() {
      return keyId_;
    }

    public static final int EXPIRYDATE_FIELD_NUMBER = 2;
    private long expiryDate_;
    /**
     * <pre>
     * Expiry time in milliseconds
     * </pre>
     *
     * <code>required uint64 expiryDate = 2;</code>
     */
    public boolean hasExpiryDate() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Expiry time in milliseconds
     * </pre>
     *
     * <code>required uint64 expiryDate = 2;</code>
     */
    public long getExpiryDate() {
      return expiryDate_;
    }

    public static final int KEYBYTES_FIELD_NUMBER = 3;
    private org.apache.hadoop.thirdparty.protobuf.ByteString keyBytes_;
    /**
     * <pre>
     * Key secret
     * </pre>
     *
     * <code>optional bytes keyBytes = 3;</code>
     */
    public boolean hasKeyBytes() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Key secret
     * </pre>
     *
     * <code>optional bytes keyBytes = 3;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString getKeyBytes() {
      return keyBytes_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasKeyId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasExpiryDate()) {
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
        output.writeUInt32(1, keyId_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt64(2, expiryDate_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeBytes(3, keyBytes_);
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
          .computeUInt32Size(1, keyId_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeUInt64Size(2, expiryDate_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeBytesSize(3, keyBytes_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto other = (org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto) obj;

      if (hasKeyId() != other.hasKeyId()) return false;
      if (hasKeyId()) {
        if (getKeyId()
            != other.getKeyId()) return false;
      }
      if (hasExpiryDate() != other.hasExpiryDate()) return false;
      if (hasExpiryDate()) {
        if (getExpiryDate()
            != other.getExpiryDate()) return false;
      }
      if (hasKeyBytes() != other.hasKeyBytes()) return false;
      if (hasKeyBytes()) {
        if (!getKeyBytes()
            .equals(other.getKeyBytes())) return false;
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
      if (hasKeyId()) {
        hash = (37 * hash) + KEYID_FIELD_NUMBER;
        hash = (53 * hash) + getKeyId();
      }
      if (hasExpiryDate()) {
        hash = (37 * hash) + EXPIRYDATE_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getExpiryDate());
      }
      if (hasKeyBytes()) {
        hash = (37 * hash) + KEYBYTES_FIELD_NUMBER;
        hash = (53 * hash) + getKeyBytes().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto prototype) {
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
     * Block access token information
     * </pre>
     *
     * Protobuf type {@code hadoop.hdfs.BlockKeyProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.BlockKeyProto)
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_BlockKeyProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_BlockKeyProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto.class, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto.newBuilder()
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
        keyId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        expiryDate_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        keyBytes_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_BlockKeyProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto build() {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto result = new org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.keyId_ = keyId_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.expiryDate_ = expiryDate_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.keyBytes_ = keyBytes_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto.getDefaultInstance()) return this;
        if (other.hasKeyId()) {
          setKeyId(other.getKeyId());
        }
        if (other.hasExpiryDate()) {
          setExpiryDate(other.getExpiryDate());
        }
        if (other.hasKeyBytes()) {
          setKeyBytes(other.getKeyBytes());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasKeyId()) {
          return false;
        }
        if (!hasExpiryDate()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int keyId_ ;
      /**
       * <pre>
       * Key identifier
       * </pre>
       *
       * <code>required uint32 keyId = 1;</code>
       */
      public boolean hasKeyId() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Key identifier
       * </pre>
       *
       * <code>required uint32 keyId = 1;</code>
       */
      public int getKeyId() {
        return keyId_;
      }
      /**
       * <pre>
       * Key identifier
       * </pre>
       *
       * <code>required uint32 keyId = 1;</code>
       */
      public Builder setKeyId(int value) {
        bitField0_ |= 0x00000001;
        keyId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Key identifier
       * </pre>
       *
       * <code>required uint32 keyId = 1;</code>
       */
      public Builder clearKeyId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        keyId_ = 0;
        onChanged();
        return this;
      }

      private long expiryDate_ ;
      /**
       * <pre>
       * Expiry time in milliseconds
       * </pre>
       *
       * <code>required uint64 expiryDate = 2;</code>
       */
      public boolean hasExpiryDate() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * Expiry time in milliseconds
       * </pre>
       *
       * <code>required uint64 expiryDate = 2;</code>
       */
      public long getExpiryDate() {
        return expiryDate_;
      }
      /**
       * <pre>
       * Expiry time in milliseconds
       * </pre>
       *
       * <code>required uint64 expiryDate = 2;</code>
       */
      public Builder setExpiryDate(long value) {
        bitField0_ |= 0x00000002;
        expiryDate_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Expiry time in milliseconds
       * </pre>
       *
       * <code>required uint64 expiryDate = 2;</code>
       */
      public Builder clearExpiryDate() {
        bitField0_ = (bitField0_ & ~0x00000002);
        expiryDate_ = 0L;
        onChanged();
        return this;
      }

      private org.apache.hadoop.thirdparty.protobuf.ByteString keyBytes_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       * Key secret
       * </pre>
       *
       * <code>optional bytes keyBytes = 3;</code>
       */
      public boolean hasKeyBytes() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * Key secret
       * </pre>
       *
       * <code>optional bytes keyBytes = 3;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString getKeyBytes() {
        return keyBytes_;
      }
      /**
       * <pre>
       * Key secret
       * </pre>
       *
       * <code>optional bytes keyBytes = 3;</code>
       */
      public Builder setKeyBytes(org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        keyBytes_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Key secret
       * </pre>
       *
       * <code>optional bytes keyBytes = 3;</code>
       */
      public Builder clearKeyBytes() {
        bitField0_ = (bitField0_ & ~0x00000004);
        keyBytes_ = getDefaultInstance().getKeyBytes();
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.BlockKeyProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.BlockKeyProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<BlockKeyProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<BlockKeyProto>() {
      @java.lang.Override
      public BlockKeyProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new BlockKeyProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<BlockKeyProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<BlockKeyProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ExportedBlockKeysProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.ExportedBlockKeysProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required bool isBlockTokenEnabled = 1;</code>
     */
    boolean hasIsBlockTokenEnabled();
    /**
     * <code>required bool isBlockTokenEnabled = 1;</code>
     */
    boolean getIsBlockTokenEnabled();

    /**
     * <code>required uint64 keyUpdateInterval = 2;</code>
     */
    boolean hasKeyUpdateInterval();
    /**
     * <code>required uint64 keyUpdateInterval = 2;</code>
     */
    long getKeyUpdateInterval();

    /**
     * <code>required uint64 tokenLifeTime = 3;</code>
     */
    boolean hasTokenLifeTime();
    /**
     * <code>required uint64 tokenLifeTime = 3;</code>
     */
    long getTokenLifeTime();

    /**
     * <code>required .hadoop.hdfs.BlockKeyProto currentKey = 4;</code>
     */
    boolean hasCurrentKey();
    /**
     * <code>required .hadoop.hdfs.BlockKeyProto currentKey = 4;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto getCurrentKey();
    /**
     * <code>required .hadoop.hdfs.BlockKeyProto currentKey = 4;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProtoOrBuilder getCurrentKeyOrBuilder();

    /**
     * <code>repeated .hadoop.hdfs.BlockKeyProto allKeys = 5;</code>
     */
    java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto> 
        getAllKeysList();
    /**
     * <code>repeated .hadoop.hdfs.BlockKeyProto allKeys = 5;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto getAllKeys(int index);
    /**
     * <code>repeated .hadoop.hdfs.BlockKeyProto allKeys = 5;</code>
     */
    int getAllKeysCount();
    /**
     * <code>repeated .hadoop.hdfs.BlockKeyProto allKeys = 5;</code>
     */
    java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProtoOrBuilder> 
        getAllKeysOrBuilderList();
    /**
     * <code>repeated .hadoop.hdfs.BlockKeyProto allKeys = 5;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProtoOrBuilder getAllKeysOrBuilder(
        int index);
  }
  /**
   * <pre>
   **
   * Current key and set of block keys at the namenode.
   * </pre>
   *
   * Protobuf type {@code hadoop.hdfs.ExportedBlockKeysProto}
   */
  public  static final class ExportedBlockKeysProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.ExportedBlockKeysProto)
      ExportedBlockKeysProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ExportedBlockKeysProto.newBuilder() to construct.
    private ExportedBlockKeysProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ExportedBlockKeysProto() {
      allKeys_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ExportedBlockKeysProto(
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
              isBlockTokenEnabled_ = input.readBool();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              keyUpdateInterval_ = input.readUInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              tokenLifeTime_ = input.readUInt64();
              break;
            }
            case 34: {
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000008) != 0)) {
                subBuilder = currentKey_.toBuilder();
              }
              currentKey_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(currentKey_);
                currentKey_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000008;
              break;
            }
            case 42: {
              if (!((mutable_bitField0_ & 0x00000010) != 0)) {
                allKeys_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto>();
                mutable_bitField0_ |= 0x00000010;
              }
              allKeys_.add(
                  input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto.PARSER, extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000010) != 0)) {
          allKeys_ = java.util.Collections.unmodifiableList(allKeys_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_ExportedBlockKeysProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_ExportedBlockKeysProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto.class, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto.Builder.class);
    }

    private int bitField0_;
    public static final int ISBLOCKTOKENENABLED_FIELD_NUMBER = 1;
    private boolean isBlockTokenEnabled_;
    /**
     * <code>required bool isBlockTokenEnabled = 1;</code>
     */
    public boolean hasIsBlockTokenEnabled() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required bool isBlockTokenEnabled = 1;</code>
     */
    public boolean getIsBlockTokenEnabled() {
      return isBlockTokenEnabled_;
    }

    public static final int KEYUPDATEINTERVAL_FIELD_NUMBER = 2;
    private long keyUpdateInterval_;
    /**
     * <code>required uint64 keyUpdateInterval = 2;</code>
     */
    public boolean hasKeyUpdateInterval() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required uint64 keyUpdateInterval = 2;</code>
     */
    public long getKeyUpdateInterval() {
      return keyUpdateInterval_;
    }

    public static final int TOKENLIFETIME_FIELD_NUMBER = 3;
    private long tokenLifeTime_;
    /**
     * <code>required uint64 tokenLifeTime = 3;</code>
     */
    public boolean hasTokenLifeTime() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required uint64 tokenLifeTime = 3;</code>
     */
    public long getTokenLifeTime() {
      return tokenLifeTime_;
    }

    public static final int CURRENTKEY_FIELD_NUMBER = 4;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto currentKey_;
    /**
     * <code>required .hadoop.hdfs.BlockKeyProto currentKey = 4;</code>
     */
    public boolean hasCurrentKey() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>required .hadoop.hdfs.BlockKeyProto currentKey = 4;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto getCurrentKey() {
      return currentKey_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto.getDefaultInstance() : currentKey_;
    }
    /**
     * <code>required .hadoop.hdfs.BlockKeyProto currentKey = 4;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProtoOrBuilder getCurrentKeyOrBuilder() {
      return currentKey_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto.getDefaultInstance() : currentKey_;
    }

    public static final int ALLKEYS_FIELD_NUMBER = 5;
    private java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto> allKeys_;
    /**
     * <code>repeated .hadoop.hdfs.BlockKeyProto allKeys = 5;</code>
     */
    public java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto> getAllKeysList() {
      return allKeys_;
    }
    /**
     * <code>repeated .hadoop.hdfs.BlockKeyProto allKeys = 5;</code>
     */
    public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProtoOrBuilder> 
        getAllKeysOrBuilderList() {
      return allKeys_;
    }
    /**
     * <code>repeated .hadoop.hdfs.BlockKeyProto allKeys = 5;</code>
     */
    public int getAllKeysCount() {
      return allKeys_.size();
    }
    /**
     * <code>repeated .hadoop.hdfs.BlockKeyProto allKeys = 5;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto getAllKeys(int index) {
      return allKeys_.get(index);
    }
    /**
     * <code>repeated .hadoop.hdfs.BlockKeyProto allKeys = 5;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProtoOrBuilder getAllKeysOrBuilder(
        int index) {
      return allKeys_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasIsBlockTokenEnabled()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasKeyUpdateInterval()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTokenLifeTime()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCurrentKey()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getCurrentKey().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getAllKeysCount(); i++) {
        if (!getAllKeys(i).isInitialized()) {
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
        output.writeBool(1, isBlockTokenEnabled_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt64(2, keyUpdateInterval_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeUInt64(3, tokenLifeTime_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeMessage(4, getCurrentKey());
      }
      for (int i = 0; i < allKeys_.size(); i++) {
        output.writeMessage(5, allKeys_.get(i));
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
          .computeBoolSize(1, isBlockTokenEnabled_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeUInt64Size(2, keyUpdateInterval_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeUInt64Size(3, tokenLifeTime_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(4, getCurrentKey());
      }
      for (int i = 0; i < allKeys_.size(); i++) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(5, allKeys_.get(i));
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto other = (org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto) obj;

      if (hasIsBlockTokenEnabled() != other.hasIsBlockTokenEnabled()) return false;
      if (hasIsBlockTokenEnabled()) {
        if (getIsBlockTokenEnabled()
            != other.getIsBlockTokenEnabled()) return false;
      }
      if (hasKeyUpdateInterval() != other.hasKeyUpdateInterval()) return false;
      if (hasKeyUpdateInterval()) {
        if (getKeyUpdateInterval()
            != other.getKeyUpdateInterval()) return false;
      }
      if (hasTokenLifeTime() != other.hasTokenLifeTime()) return false;
      if (hasTokenLifeTime()) {
        if (getTokenLifeTime()
            != other.getTokenLifeTime()) return false;
      }
      if (hasCurrentKey() != other.hasCurrentKey()) return false;
      if (hasCurrentKey()) {
        if (!getCurrentKey()
            .equals(other.getCurrentKey())) return false;
      }
      if (!getAllKeysList()
          .equals(other.getAllKeysList())) return false;
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
      if (hasIsBlockTokenEnabled()) {
        hash = (37 * hash) + ISBLOCKTOKENENABLED_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashBoolean(
            getIsBlockTokenEnabled());
      }
      if (hasKeyUpdateInterval()) {
        hash = (37 * hash) + KEYUPDATEINTERVAL_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getKeyUpdateInterval());
      }
      if (hasTokenLifeTime()) {
        hash = (37 * hash) + TOKENLIFETIME_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getTokenLifeTime());
      }
      if (hasCurrentKey()) {
        hash = (37 * hash) + CURRENTKEY_FIELD_NUMBER;
        hash = (53 * hash) + getCurrentKey().hashCode();
      }
      if (getAllKeysCount() > 0) {
        hash = (37 * hash) + ALLKEYS_FIELD_NUMBER;
        hash = (53 * hash) + getAllKeysList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto prototype) {
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
     * Current key and set of block keys at the namenode.
     * </pre>
     *
     * Protobuf type {@code hadoop.hdfs.ExportedBlockKeysProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.ExportedBlockKeysProto)
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_ExportedBlockKeysProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_ExportedBlockKeysProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto.class, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto.newBuilder()
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
          getCurrentKeyFieldBuilder();
          getAllKeysFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isBlockTokenEnabled_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        keyUpdateInterval_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        tokenLifeTime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        if (currentKeyBuilder_ == null) {
          currentKey_ = null;
        } else {
          currentKeyBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        if (allKeysBuilder_ == null) {
          allKeys_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          allKeysBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_ExportedBlockKeysProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto build() {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto result = new org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isBlockTokenEnabled_ = isBlockTokenEnabled_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.keyUpdateInterval_ = keyUpdateInterval_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.tokenLifeTime_ = tokenLifeTime_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          if (currentKeyBuilder_ == null) {
            result.currentKey_ = currentKey_;
          } else {
            result.currentKey_ = currentKeyBuilder_.build();
          }
          to_bitField0_ |= 0x00000008;
        }
        if (allKeysBuilder_ == null) {
          if (((bitField0_ & 0x00000010) != 0)) {
            allKeys_ = java.util.Collections.unmodifiableList(allKeys_);
            bitField0_ = (bitField0_ & ~0x00000010);
          }
          result.allKeys_ = allKeys_;
        } else {
          result.allKeys_ = allKeysBuilder_.build();
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto.getDefaultInstance()) return this;
        if (other.hasIsBlockTokenEnabled()) {
          setIsBlockTokenEnabled(other.getIsBlockTokenEnabled());
        }
        if (other.hasKeyUpdateInterval()) {
          setKeyUpdateInterval(other.getKeyUpdateInterval());
        }
        if (other.hasTokenLifeTime()) {
          setTokenLifeTime(other.getTokenLifeTime());
        }
        if (other.hasCurrentKey()) {
          mergeCurrentKey(other.getCurrentKey());
        }
        if (allKeysBuilder_ == null) {
          if (!other.allKeys_.isEmpty()) {
            if (allKeys_.isEmpty()) {
              allKeys_ = other.allKeys_;
              bitField0_ = (bitField0_ & ~0x00000010);
            } else {
              ensureAllKeysIsMutable();
              allKeys_.addAll(other.allKeys_);
            }
            onChanged();
          }
        } else {
          if (!other.allKeys_.isEmpty()) {
            if (allKeysBuilder_.isEmpty()) {
              allKeysBuilder_.dispose();
              allKeysBuilder_ = null;
              allKeys_ = other.allKeys_;
              bitField0_ = (bitField0_ & ~0x00000010);
              allKeysBuilder_ = 
                org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getAllKeysFieldBuilder() : null;
            } else {
              allKeysBuilder_.addAllMessages(other.allKeys_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasIsBlockTokenEnabled()) {
          return false;
        }
        if (!hasKeyUpdateInterval()) {
          return false;
        }
        if (!hasTokenLifeTime()) {
          return false;
        }
        if (!hasCurrentKey()) {
          return false;
        }
        if (!getCurrentKey().isInitialized()) {
          return false;
        }
        for (int i = 0; i < getAllKeysCount(); i++) {
          if (!getAllKeys(i).isInitialized()) {
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
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean isBlockTokenEnabled_ ;
      /**
       * <code>required bool isBlockTokenEnabled = 1;</code>
       */
      public boolean hasIsBlockTokenEnabled() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required bool isBlockTokenEnabled = 1;</code>
       */
      public boolean getIsBlockTokenEnabled() {
        return isBlockTokenEnabled_;
      }
      /**
       * <code>required bool isBlockTokenEnabled = 1;</code>
       */
      public Builder setIsBlockTokenEnabled(boolean value) {
        bitField0_ |= 0x00000001;
        isBlockTokenEnabled_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool isBlockTokenEnabled = 1;</code>
       */
      public Builder clearIsBlockTokenEnabled() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isBlockTokenEnabled_ = false;
        onChanged();
        return this;
      }

      private long keyUpdateInterval_ ;
      /**
       * <code>required uint64 keyUpdateInterval = 2;</code>
       */
      public boolean hasKeyUpdateInterval() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required uint64 keyUpdateInterval = 2;</code>
       */
      public long getKeyUpdateInterval() {
        return keyUpdateInterval_;
      }
      /**
       * <code>required uint64 keyUpdateInterval = 2;</code>
       */
      public Builder setKeyUpdateInterval(long value) {
        bitField0_ |= 0x00000002;
        keyUpdateInterval_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 keyUpdateInterval = 2;</code>
       */
      public Builder clearKeyUpdateInterval() {
        bitField0_ = (bitField0_ & ~0x00000002);
        keyUpdateInterval_ = 0L;
        onChanged();
        return this;
      }

      private long tokenLifeTime_ ;
      /**
       * <code>required uint64 tokenLifeTime = 3;</code>
       */
      public boolean hasTokenLifeTime() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>required uint64 tokenLifeTime = 3;</code>
       */
      public long getTokenLifeTime() {
        return tokenLifeTime_;
      }
      /**
       * <code>required uint64 tokenLifeTime = 3;</code>
       */
      public Builder setTokenLifeTime(long value) {
        bitField0_ |= 0x00000004;
        tokenLifeTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 tokenLifeTime = 3;</code>
       */
      public Builder clearTokenLifeTime() {
        bitField0_ = (bitField0_ & ~0x00000004);
        tokenLifeTime_ = 0L;
        onChanged();
        return this;
      }

      private org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto currentKey_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProtoOrBuilder> currentKeyBuilder_;
      /**
       * <code>required .hadoop.hdfs.BlockKeyProto currentKey = 4;</code>
       */
      public boolean hasCurrentKey() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>required .hadoop.hdfs.BlockKeyProto currentKey = 4;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto getCurrentKey() {
        if (currentKeyBuilder_ == null) {
          return currentKey_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto.getDefaultInstance() : currentKey_;
        } else {
          return currentKeyBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.BlockKeyProto currentKey = 4;</code>
       */
      public Builder setCurrentKey(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto value) {
        if (currentKeyBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          currentKey_ = value;
          onChanged();
        } else {
          currentKeyBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.BlockKeyProto currentKey = 4;</code>
       */
      public Builder setCurrentKey(
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto.Builder builderForValue) {
        if (currentKeyBuilder_ == null) {
          currentKey_ = builderForValue.build();
          onChanged();
        } else {
          currentKeyBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.BlockKeyProto currentKey = 4;</code>
       */
      public Builder mergeCurrentKey(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto value) {
        if (currentKeyBuilder_ == null) {
          if (((bitField0_ & 0x00000008) != 0) &&
              currentKey_ != null &&
              currentKey_ != org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto.getDefaultInstance()) {
            currentKey_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto.newBuilder(currentKey_).mergeFrom(value).buildPartial();
          } else {
            currentKey_ = value;
          }
          onChanged();
        } else {
          currentKeyBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.BlockKeyProto currentKey = 4;</code>
       */
      public Builder clearCurrentKey() {
        if (currentKeyBuilder_ == null) {
          currentKey_ = null;
          onChanged();
        } else {
          currentKeyBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.BlockKeyProto currentKey = 4;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto.Builder getCurrentKeyBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getCurrentKeyFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.BlockKeyProto currentKey = 4;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProtoOrBuilder getCurrentKeyOrBuilder() {
        if (currentKeyBuilder_ != null) {
          return currentKeyBuilder_.getMessageOrBuilder();
        } else {
          return currentKey_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto.getDefaultInstance() : currentKey_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.BlockKeyProto currentKey = 4;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProtoOrBuilder> 
          getCurrentKeyFieldBuilder() {
        if (currentKeyBuilder_ == null) {
          currentKeyBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProtoOrBuilder>(
                  getCurrentKey(),
                  getParentForChildren(),
                  isClean());
          currentKey_ = null;
        }
        return currentKeyBuilder_;
      }

      private java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto> allKeys_ =
        java.util.Collections.emptyList();
      private void ensureAllKeysIsMutable() {
        if (!((bitField0_ & 0x00000010) != 0)) {
          allKeys_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto>(allKeys_);
          bitField0_ |= 0x00000010;
         }
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProtoOrBuilder> allKeysBuilder_;

      /**
       * <code>repeated .hadoop.hdfs.BlockKeyProto allKeys = 5;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto> getAllKeysList() {
        if (allKeysBuilder_ == null) {
          return java.util.Collections.unmodifiableList(allKeys_);
        } else {
          return allKeysBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockKeyProto allKeys = 5;</code>
       */
      public int getAllKeysCount() {
        if (allKeysBuilder_ == null) {
          return allKeys_.size();
        } else {
          return allKeysBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockKeyProto allKeys = 5;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto getAllKeys(int index) {
        if (allKeysBuilder_ == null) {
          return allKeys_.get(index);
        } else {
          return allKeysBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockKeyProto allKeys = 5;</code>
       */
      public Builder setAllKeys(
          int index, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto value) {
        if (allKeysBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAllKeysIsMutable();
          allKeys_.set(index, value);
          onChanged();
        } else {
          allKeysBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockKeyProto allKeys = 5;</code>
       */
      public Builder setAllKeys(
          int index, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto.Builder builderForValue) {
        if (allKeysBuilder_ == null) {
          ensureAllKeysIsMutable();
          allKeys_.set(index, builderForValue.build());
          onChanged();
        } else {
          allKeysBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockKeyProto allKeys = 5;</code>
       */
      public Builder addAllKeys(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto value) {
        if (allKeysBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAllKeysIsMutable();
          allKeys_.add(value);
          onChanged();
        } else {
          allKeysBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockKeyProto allKeys = 5;</code>
       */
      public Builder addAllKeys(
          int index, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto value) {
        if (allKeysBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAllKeysIsMutable();
          allKeys_.add(index, value);
          onChanged();
        } else {
          allKeysBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockKeyProto allKeys = 5;</code>
       */
      public Builder addAllKeys(
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto.Builder builderForValue) {
        if (allKeysBuilder_ == null) {
          ensureAllKeysIsMutable();
          allKeys_.add(builderForValue.build());
          onChanged();
        } else {
          allKeysBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockKeyProto allKeys = 5;</code>
       */
      public Builder addAllKeys(
          int index, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto.Builder builderForValue) {
        if (allKeysBuilder_ == null) {
          ensureAllKeysIsMutable();
          allKeys_.add(index, builderForValue.build());
          onChanged();
        } else {
          allKeysBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockKeyProto allKeys = 5;</code>
       */
      public Builder addAllAllKeys(
          java.lang.Iterable<? extends org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto> values) {
        if (allKeysBuilder_ == null) {
          ensureAllKeysIsMutable();
          org.apache.hadoop.thirdparty.protobuf.AbstractMessageLite.Builder.addAll(
              values, allKeys_);
          onChanged();
        } else {
          allKeysBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockKeyProto allKeys = 5;</code>
       */
      public Builder clearAllKeys() {
        if (allKeysBuilder_ == null) {
          allKeys_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
          onChanged();
        } else {
          allKeysBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockKeyProto allKeys = 5;</code>
       */
      public Builder removeAllKeys(int index) {
        if (allKeysBuilder_ == null) {
          ensureAllKeysIsMutable();
          allKeys_.remove(index);
          onChanged();
        } else {
          allKeysBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockKeyProto allKeys = 5;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto.Builder getAllKeysBuilder(
          int index) {
        return getAllKeysFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockKeyProto allKeys = 5;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProtoOrBuilder getAllKeysOrBuilder(
          int index) {
        if (allKeysBuilder_ == null) {
          return allKeys_.get(index);  } else {
          return allKeysBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockKeyProto allKeys = 5;</code>
       */
      public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProtoOrBuilder> 
           getAllKeysOrBuilderList() {
        if (allKeysBuilder_ != null) {
          return allKeysBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(allKeys_);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockKeyProto allKeys = 5;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto.Builder addAllKeysBuilder() {
        return getAllKeysFieldBuilder().addBuilder(
            org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockKeyProto allKeys = 5;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto.Builder addAllKeysBuilder(
          int index) {
        return getAllKeysFieldBuilder().addBuilder(
            index, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockKeyProto allKeys = 5;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto.Builder> 
           getAllKeysBuilderList() {
        return getAllKeysFieldBuilder().getBuilderList();
      }
      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProtoOrBuilder> 
          getAllKeysFieldBuilder() {
        if (allKeysBuilder_ == null) {
          allKeysBuilder_ = new org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockKeyProtoOrBuilder>(
                  allKeys_,
                  ((bitField0_ & 0x00000010) != 0),
                  getParentForChildren(),
                  isClean());
          allKeys_ = null;
        }
        return allKeysBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.ExportedBlockKeysProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ExportedBlockKeysProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<ExportedBlockKeysProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<ExportedBlockKeysProto>() {
      @java.lang.Override
      public ExportedBlockKeysProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new ExportedBlockKeysProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<ExportedBlockKeysProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<ExportedBlockKeysProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.ExportedBlockKeysProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface BlockWithLocationsProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.BlockWithLocationsProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Block
     * </pre>
     *
     * <code>required .hadoop.hdfs.BlockProto block = 1;</code>
     */
    boolean hasBlock();
    /**
     * <pre>
     * Block
     * </pre>
     *
     * <code>required .hadoop.hdfs.BlockProto block = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto getBlock();
    /**
     * <pre>
     * Block
     * </pre>
     *
     * <code>required .hadoop.hdfs.BlockProto block = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder getBlockOrBuilder();

    /**
     * <pre>
     * Datanodes with replicas of the block
     * </pre>
     *
     * <code>repeated string datanodeUuids = 2;</code>
     */
    java.util.List<java.lang.String>
        getDatanodeUuidsList();
    /**
     * <pre>
     * Datanodes with replicas of the block
     * </pre>
     *
     * <code>repeated string datanodeUuids = 2;</code>
     */
    int getDatanodeUuidsCount();
    /**
     * <pre>
     * Datanodes with replicas of the block
     * </pre>
     *
     * <code>repeated string datanodeUuids = 2;</code>
     */
    java.lang.String getDatanodeUuids(int index);
    /**
     * <pre>
     * Datanodes with replicas of the block
     * </pre>
     *
     * <code>repeated string datanodeUuids = 2;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getDatanodeUuidsBytes(int index);

    /**
     * <pre>
     * Storages with replicas of the block
     * </pre>
     *
     * <code>repeated string storageUuids = 3;</code>
     */
    java.util.List<java.lang.String>
        getStorageUuidsList();
    /**
     * <pre>
     * Storages with replicas of the block
     * </pre>
     *
     * <code>repeated string storageUuids = 3;</code>
     */
    int getStorageUuidsCount();
    /**
     * <pre>
     * Storages with replicas of the block
     * </pre>
     *
     * <code>repeated string storageUuids = 3;</code>
     */
    java.lang.String getStorageUuids(int index);
    /**
     * <pre>
     * Storages with replicas of the block
     * </pre>
     *
     * <code>repeated string storageUuids = 3;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getStorageUuidsBytes(int index);

    /**
     * <code>repeated .hadoop.hdfs.StorageTypeProto storageTypes = 4;</code>
     */
    java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypeProto> getStorageTypesList();
    /**
     * <code>repeated .hadoop.hdfs.StorageTypeProto storageTypes = 4;</code>
     */
    int getStorageTypesCount();
    /**
     * <code>repeated .hadoop.hdfs.StorageTypeProto storageTypes = 4;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypeProto getStorageTypes(int index);

    /**
     * <code>optional bytes indices = 5;</code>
     */
    boolean hasIndices();
    /**
     * <code>optional bytes indices = 5;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString getIndices();

    /**
     * <code>optional uint32 dataBlockNum = 6;</code>
     */
    boolean hasDataBlockNum();
    /**
     * <code>optional uint32 dataBlockNum = 6;</code>
     */
    int getDataBlockNum();

    /**
     * <code>optional uint32 cellSize = 7;</code>
     */
    boolean hasCellSize();
    /**
     * <code>optional uint32 cellSize = 7;</code>
     */
    int getCellSize();
  }
  /**
   * <pre>
   **
   * Block and datanodes where is it located
   * </pre>
   *
   * Protobuf type {@code hadoop.hdfs.BlockWithLocationsProto}
   */
  public  static final class BlockWithLocationsProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.BlockWithLocationsProto)
      BlockWithLocationsProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BlockWithLocationsProto.newBuilder() to construct.
    private BlockWithLocationsProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BlockWithLocationsProto() {
      datanodeUuids_ = org.apache.hadoop.thirdparty.protobuf.LazyStringArrayList.EMPTY;
      storageUuids_ = org.apache.hadoop.thirdparty.protobuf.LazyStringArrayList.EMPTY;
      storageTypes_ = java.util.Collections.emptyList();
      indices_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BlockWithLocationsProto(
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
                subBuilder = block_.toBuilder();
              }
              block_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(block_);
                block_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                datanodeUuids_ = new org.apache.hadoop.thirdparty.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000002;
              }
              datanodeUuids_.add(bs);
              break;
            }
            case 26: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              if (!((mutable_bitField0_ & 0x00000004) != 0)) {
                storageUuids_ = new org.apache.hadoop.thirdparty.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000004;
              }
              storageUuids_.add(bs);
              break;
            }
            case 32: {
              int rawValue = input.readEnum();
              @SuppressWarnings("deprecation")
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypeProto value = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypeProto.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(4, rawValue);
              } else {
                if (!((mutable_bitField0_ & 0x00000008) != 0)) {
                  storageTypes_ = new java.util.ArrayList<java.lang.Integer>();
                  mutable_bitField0_ |= 0x00000008;
                }
                storageTypes_.add(rawValue);
              }
              break;
            }
            case 34: {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while(input.getBytesUntilLimit() > 0) {
                int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
                org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypeProto value = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypeProto.valueOf(rawValue);
                if (value == null) {
                  unknownFields.mergeVarintField(4, rawValue);
                } else {
                  if (!((mutable_bitField0_ & 0x00000008) != 0)) {
                    storageTypes_ = new java.util.ArrayList<java.lang.Integer>();
                    mutable_bitField0_ |= 0x00000008;
                  }
                  storageTypes_.add(rawValue);
                }
              }
              input.popLimit(oldLimit);
              break;
            }
            case 42: {
              bitField0_ |= 0x00000002;
              indices_ = input.readBytes();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000004;
              dataBlockNum_ = input.readUInt32();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000008;
              cellSize_ = input.readUInt32();
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
          datanodeUuids_ = datanodeUuids_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000004) != 0)) {
          storageUuids_ = storageUuids_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000008) != 0)) {
          storageTypes_ = java.util.Collections.unmodifiableList(storageTypes_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_BlockWithLocationsProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_BlockWithLocationsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto.class, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto.Builder.class);
    }

    private int bitField0_;
    public static final int BLOCK_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto block_;
    /**
     * <pre>
     * Block
     * </pre>
     *
     * <code>required .hadoop.hdfs.BlockProto block = 1;</code>
     */
    public boolean hasBlock() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Block
     * </pre>
     *
     * <code>required .hadoop.hdfs.BlockProto block = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto getBlock() {
      return block_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance() : block_;
    }
    /**
     * <pre>
     * Block
     * </pre>
     *
     * <code>required .hadoop.hdfs.BlockProto block = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder getBlockOrBuilder() {
      return block_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance() : block_;
    }

    public static final int DATANODEUUIDS_FIELD_NUMBER = 2;
    private org.apache.hadoop.thirdparty.protobuf.LazyStringList datanodeUuids_;
    /**
     * <pre>
     * Datanodes with replicas of the block
     * </pre>
     *
     * <code>repeated string datanodeUuids = 2;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ProtocolStringList
        getDatanodeUuidsList() {
      return datanodeUuids_;
    }
    /**
     * <pre>
     * Datanodes with replicas of the block
     * </pre>
     *
     * <code>repeated string datanodeUuids = 2;</code>
     */
    public int getDatanodeUuidsCount() {
      return datanodeUuids_.size();
    }
    /**
     * <pre>
     * Datanodes with replicas of the block
     * </pre>
     *
     * <code>repeated string datanodeUuids = 2;</code>
     */
    public java.lang.String getDatanodeUuids(int index) {
      return datanodeUuids_.get(index);
    }
    /**
     * <pre>
     * Datanodes with replicas of the block
     * </pre>
     *
     * <code>repeated string datanodeUuids = 2;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getDatanodeUuidsBytes(int index) {
      return datanodeUuids_.getByteString(index);
    }

    public static final int STORAGEUUIDS_FIELD_NUMBER = 3;
    private org.apache.hadoop.thirdparty.protobuf.LazyStringList storageUuids_;
    /**
     * <pre>
     * Storages with replicas of the block
     * </pre>
     *
     * <code>repeated string storageUuids = 3;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ProtocolStringList
        getStorageUuidsList() {
      return storageUuids_;
    }
    /**
     * <pre>
     * Storages with replicas of the block
     * </pre>
     *
     * <code>repeated string storageUuids = 3;</code>
     */
    public int getStorageUuidsCount() {
      return storageUuids_.size();
    }
    /**
     * <pre>
     * Storages with replicas of the block
     * </pre>
     *
     * <code>repeated string storageUuids = 3;</code>
     */
    public java.lang.String getStorageUuids(int index) {
      return storageUuids_.get(index);
    }
    /**
     * <pre>
     * Storages with replicas of the block
     * </pre>
     *
     * <code>repeated string storageUuids = 3;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getStorageUuidsBytes(int index) {
      return storageUuids_.getByteString(index);
    }

    public static final int STORAGETYPES_FIELD_NUMBER = 4;
    private java.util.List<java.lang.Integer> storageTypes_;
    private static final org.apache.hadoop.thirdparty.protobuf.Internal.ListAdapter.Converter<
        java.lang.Integer, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypeProto> storageTypes_converter_ =
            new org.apache.hadoop.thirdparty.protobuf.Internal.ListAdapter.Converter<
                java.lang.Integer, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypeProto>() {
              public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypeProto convert(java.lang.Integer from) {
                @SuppressWarnings("deprecation")
                org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypeProto result = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypeProto.valueOf(from);
                return result == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypeProto.DISK : result;
              }
            };
    /**
     * <code>repeated .hadoop.hdfs.StorageTypeProto storageTypes = 4;</code>
     */
    public java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypeProto> getStorageTypesList() {
      return new org.apache.hadoop.thirdparty.protobuf.Internal.ListAdapter<
          java.lang.Integer, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypeProto>(storageTypes_, storageTypes_converter_);
    }
    /**
     * <code>repeated .hadoop.hdfs.StorageTypeProto storageTypes = 4;</code>
     */
    public int getStorageTypesCount() {
      return storageTypes_.size();
    }
    /**
     * <code>repeated .hadoop.hdfs.StorageTypeProto storageTypes = 4;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypeProto getStorageTypes(int index) {
      return storageTypes_converter_.convert(storageTypes_.get(index));
    }

    public static final int INDICES_FIELD_NUMBER = 5;
    private org.apache.hadoop.thirdparty.protobuf.ByteString indices_;
    /**
     * <code>optional bytes indices = 5;</code>
     */
    public boolean hasIndices() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional bytes indices = 5;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString getIndices() {
      return indices_;
    }

    public static final int DATABLOCKNUM_FIELD_NUMBER = 6;
    private int dataBlockNum_;
    /**
     * <code>optional uint32 dataBlockNum = 6;</code>
     */
    public boolean hasDataBlockNum() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional uint32 dataBlockNum = 6;</code>
     */
    public int getDataBlockNum() {
      return dataBlockNum_;
    }

    public static final int CELLSIZE_FIELD_NUMBER = 7;
    private int cellSize_;
    /**
     * <code>optional uint32 cellSize = 7;</code>
     */
    public boolean hasCellSize() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional uint32 cellSize = 7;</code>
     */
    public int getCellSize() {
      return cellSize_;
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
      for (int i = 0; i < datanodeUuids_.size(); i++) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 2, datanodeUuids_.getRaw(i));
      }
      for (int i = 0; i < storageUuids_.size(); i++) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 3, storageUuids_.getRaw(i));
      }
      for (int i = 0; i < storageTypes_.size(); i++) {
        output.writeEnum(4, storageTypes_.get(i));
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeBytes(5, indices_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeUInt32(6, dataBlockNum_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeUInt32(7, cellSize_);
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
      {
        int dataSize = 0;
        for (int i = 0; i < datanodeUuids_.size(); i++) {
          dataSize += computeStringSizeNoTag(datanodeUuids_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getDatanodeUuidsList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < storageUuids_.size(); i++) {
          dataSize += computeStringSizeNoTag(storageUuids_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getStorageUuidsList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < storageTypes_.size(); i++) {
          dataSize += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
            .computeEnumSizeNoTag(storageTypes_.get(i));
        }
        size += dataSize;
        size += 1 * storageTypes_.size();
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeBytesSize(5, indices_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeUInt32Size(6, dataBlockNum_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeUInt32Size(7, cellSize_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto other = (org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto) obj;

      if (hasBlock() != other.hasBlock()) return false;
      if (hasBlock()) {
        if (!getBlock()
            .equals(other.getBlock())) return false;
      }
      if (!getDatanodeUuidsList()
          .equals(other.getDatanodeUuidsList())) return false;
      if (!getStorageUuidsList()
          .equals(other.getStorageUuidsList())) return false;
      if (!storageTypes_.equals(other.storageTypes_)) return false;
      if (hasIndices() != other.hasIndices()) return false;
      if (hasIndices()) {
        if (!getIndices()
            .equals(other.getIndices())) return false;
      }
      if (hasDataBlockNum() != other.hasDataBlockNum()) return false;
      if (hasDataBlockNum()) {
        if (getDataBlockNum()
            != other.getDataBlockNum()) return false;
      }
      if (hasCellSize() != other.hasCellSize()) return false;
      if (hasCellSize()) {
        if (getCellSize()
            != other.getCellSize()) return false;
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
      if (getDatanodeUuidsCount() > 0) {
        hash = (37 * hash) + DATANODEUUIDS_FIELD_NUMBER;
        hash = (53 * hash) + getDatanodeUuidsList().hashCode();
      }
      if (getStorageUuidsCount() > 0) {
        hash = (37 * hash) + STORAGEUUIDS_FIELD_NUMBER;
        hash = (53 * hash) + getStorageUuidsList().hashCode();
      }
      if (getStorageTypesCount() > 0) {
        hash = (37 * hash) + STORAGETYPES_FIELD_NUMBER;
        hash = (53 * hash) + storageTypes_.hashCode();
      }
      if (hasIndices()) {
        hash = (37 * hash) + INDICES_FIELD_NUMBER;
        hash = (53 * hash) + getIndices().hashCode();
      }
      if (hasDataBlockNum()) {
        hash = (37 * hash) + DATABLOCKNUM_FIELD_NUMBER;
        hash = (53 * hash) + getDataBlockNum();
      }
      if (hasCellSize()) {
        hash = (37 * hash) + CELLSIZE_FIELD_NUMBER;
        hash = (53 * hash) + getCellSize();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto prototype) {
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
     * Block and datanodes where is it located
     * </pre>
     *
     * Protobuf type {@code hadoop.hdfs.BlockWithLocationsProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.BlockWithLocationsProto)
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_BlockWithLocationsProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_BlockWithLocationsProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto.class, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto.newBuilder()
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
        datanodeUuids_ = org.apache.hadoop.thirdparty.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        storageUuids_ = org.apache.hadoop.thirdparty.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        storageTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        indices_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000010);
        dataBlockNum_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        cellSize_ = 0;
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_BlockWithLocationsProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto build() {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto result = new org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto(this);
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
        if (((bitField0_ & 0x00000002) != 0)) {
          datanodeUuids_ = datanodeUuids_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.datanodeUuids_ = datanodeUuids_;
        if (((bitField0_ & 0x00000004) != 0)) {
          storageUuids_ = storageUuids_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.storageUuids_ = storageUuids_;
        if (((bitField0_ & 0x00000008) != 0)) {
          storageTypes_ = java.util.Collections.unmodifiableList(storageTypes_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.storageTypes_ = storageTypes_;
        if (((from_bitField0_ & 0x00000010) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.indices_ = indices_;
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.dataBlockNum_ = dataBlockNum_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000040) != 0)) {
          result.cellSize_ = cellSize_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto.getDefaultInstance()) return this;
        if (other.hasBlock()) {
          mergeBlock(other.getBlock());
        }
        if (!other.datanodeUuids_.isEmpty()) {
          if (datanodeUuids_.isEmpty()) {
            datanodeUuids_ = other.datanodeUuids_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureDatanodeUuidsIsMutable();
            datanodeUuids_.addAll(other.datanodeUuids_);
          }
          onChanged();
        }
        if (!other.storageUuids_.isEmpty()) {
          if (storageUuids_.isEmpty()) {
            storageUuids_ = other.storageUuids_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureStorageUuidsIsMutable();
            storageUuids_.addAll(other.storageUuids_);
          }
          onChanged();
        }
        if (!other.storageTypes_.isEmpty()) {
          if (storageTypes_.isEmpty()) {
            storageTypes_ = other.storageTypes_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureStorageTypesIsMutable();
            storageTypes_.addAll(other.storageTypes_);
          }
          onChanged();
        }
        if (other.hasIndices()) {
          setIndices(other.getIndices());
        }
        if (other.hasDataBlockNum()) {
          setDataBlockNum(other.getDataBlockNum());
        }
        if (other.hasCellSize()) {
          setCellSize(other.getCellSize());
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
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto block_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder> blockBuilder_;
      /**
       * <pre>
       * Block
       * </pre>
       *
       * <code>required .hadoop.hdfs.BlockProto block = 1;</code>
       */
      public boolean hasBlock() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Block
       * </pre>
       *
       * <code>required .hadoop.hdfs.BlockProto block = 1;</code>
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
       * Block
       * </pre>
       *
       * <code>required .hadoop.hdfs.BlockProto block = 1;</code>
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
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <pre>
       * Block
       * </pre>
       *
       * <code>required .hadoop.hdfs.BlockProto block = 1;</code>
       */
      public Builder setBlock(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder builderForValue) {
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
       * Block
       * </pre>
       *
       * <code>required .hadoop.hdfs.BlockProto block = 1;</code>
       */
      public Builder mergeBlock(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto value) {
        if (blockBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
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
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <pre>
       * Block
       * </pre>
       *
       * <code>required .hadoop.hdfs.BlockProto block = 1;</code>
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
       * Block
       * </pre>
       *
       * <code>required .hadoop.hdfs.BlockProto block = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder getBlockBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getBlockFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * Block
       * </pre>
       *
       * <code>required .hadoop.hdfs.BlockProto block = 1;</code>
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
       * Block
       * </pre>
       *
       * <code>required .hadoop.hdfs.BlockProto block = 1;</code>
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

      private org.apache.hadoop.thirdparty.protobuf.LazyStringList datanodeUuids_ = org.apache.hadoop.thirdparty.protobuf.LazyStringArrayList.EMPTY;
      private void ensureDatanodeUuidsIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          datanodeUuids_ = new org.apache.hadoop.thirdparty.protobuf.LazyStringArrayList(datanodeUuids_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <pre>
       * Datanodes with replicas of the block
       * </pre>
       *
       * <code>repeated string datanodeUuids = 2;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ProtocolStringList
          getDatanodeUuidsList() {
        return datanodeUuids_.getUnmodifiableView();
      }
      /**
       * <pre>
       * Datanodes with replicas of the block
       * </pre>
       *
       * <code>repeated string datanodeUuids = 2;</code>
       */
      public int getDatanodeUuidsCount() {
        return datanodeUuids_.size();
      }
      /**
       * <pre>
       * Datanodes with replicas of the block
       * </pre>
       *
       * <code>repeated string datanodeUuids = 2;</code>
       */
      public java.lang.String getDatanodeUuids(int index) {
        return datanodeUuids_.get(index);
      }
      /**
       * <pre>
       * Datanodes with replicas of the block
       * </pre>
       *
       * <code>repeated string datanodeUuids = 2;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getDatanodeUuidsBytes(int index) {
        return datanodeUuids_.getByteString(index);
      }
      /**
       * <pre>
       * Datanodes with replicas of the block
       * </pre>
       *
       * <code>repeated string datanodeUuids = 2;</code>
       */
      public Builder setDatanodeUuids(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureDatanodeUuidsIsMutable();
        datanodeUuids_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Datanodes with replicas of the block
       * </pre>
       *
       * <code>repeated string datanodeUuids = 2;</code>
       */
      public Builder addDatanodeUuids(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureDatanodeUuidsIsMutable();
        datanodeUuids_.add(value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Datanodes with replicas of the block
       * </pre>
       *
       * <code>repeated string datanodeUuids = 2;</code>
       */
      public Builder addAllDatanodeUuids(
          java.lang.Iterable<java.lang.String> values) {
        ensureDatanodeUuidsIsMutable();
        org.apache.hadoop.thirdparty.protobuf.AbstractMessageLite.Builder.addAll(
            values, datanodeUuids_);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Datanodes with replicas of the block
       * </pre>
       *
       * <code>repeated string datanodeUuids = 2;</code>
       */
      public Builder clearDatanodeUuids() {
        datanodeUuids_ = org.apache.hadoop.thirdparty.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Datanodes with replicas of the block
       * </pre>
       *
       * <code>repeated string datanodeUuids = 2;</code>
       */
      public Builder addDatanodeUuidsBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureDatanodeUuidsIsMutable();
        datanodeUuids_.add(value);
        onChanged();
        return this;
      }

      private org.apache.hadoop.thirdparty.protobuf.LazyStringList storageUuids_ = org.apache.hadoop.thirdparty.protobuf.LazyStringArrayList.EMPTY;
      private void ensureStorageUuidsIsMutable() {
        if (!((bitField0_ & 0x00000004) != 0)) {
          storageUuids_ = new org.apache.hadoop.thirdparty.protobuf.LazyStringArrayList(storageUuids_);
          bitField0_ |= 0x00000004;
         }
      }
      /**
       * <pre>
       * Storages with replicas of the block
       * </pre>
       *
       * <code>repeated string storageUuids = 3;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ProtocolStringList
          getStorageUuidsList() {
        return storageUuids_.getUnmodifiableView();
      }
      /**
       * <pre>
       * Storages with replicas of the block
       * </pre>
       *
       * <code>repeated string storageUuids = 3;</code>
       */
      public int getStorageUuidsCount() {
        return storageUuids_.size();
      }
      /**
       * <pre>
       * Storages with replicas of the block
       * </pre>
       *
       * <code>repeated string storageUuids = 3;</code>
       */
      public java.lang.String getStorageUuids(int index) {
        return storageUuids_.get(index);
      }
      /**
       * <pre>
       * Storages with replicas of the block
       * </pre>
       *
       * <code>repeated string storageUuids = 3;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getStorageUuidsBytes(int index) {
        return storageUuids_.getByteString(index);
      }
      /**
       * <pre>
       * Storages with replicas of the block
       * </pre>
       *
       * <code>repeated string storageUuids = 3;</code>
       */
      public Builder setStorageUuids(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureStorageUuidsIsMutable();
        storageUuids_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Storages with replicas of the block
       * </pre>
       *
       * <code>repeated string storageUuids = 3;</code>
       */
      public Builder addStorageUuids(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureStorageUuidsIsMutable();
        storageUuids_.add(value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Storages with replicas of the block
       * </pre>
       *
       * <code>repeated string storageUuids = 3;</code>
       */
      public Builder addAllStorageUuids(
          java.lang.Iterable<java.lang.String> values) {
        ensureStorageUuidsIsMutable();
        org.apache.hadoop.thirdparty.protobuf.AbstractMessageLite.Builder.addAll(
            values, storageUuids_);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Storages with replicas of the block
       * </pre>
       *
       * <code>repeated string storageUuids = 3;</code>
       */
      public Builder clearStorageUuids() {
        storageUuids_ = org.apache.hadoop.thirdparty.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Storages with replicas of the block
       * </pre>
       *
       * <code>repeated string storageUuids = 3;</code>
       */
      public Builder addStorageUuidsBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureStorageUuidsIsMutable();
        storageUuids_.add(value);
        onChanged();
        return this;
      }

      private java.util.List<java.lang.Integer> storageTypes_ =
        java.util.Collections.emptyList();
      private void ensureStorageTypesIsMutable() {
        if (!((bitField0_ & 0x00000008) != 0)) {
          storageTypes_ = new java.util.ArrayList<java.lang.Integer>(storageTypes_);
          bitField0_ |= 0x00000008;
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.StorageTypeProto storageTypes = 4;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypeProto> getStorageTypesList() {
        return new org.apache.hadoop.thirdparty.protobuf.Internal.ListAdapter<
            java.lang.Integer, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypeProto>(storageTypes_, storageTypes_converter_);
      }
      /**
       * <code>repeated .hadoop.hdfs.StorageTypeProto storageTypes = 4;</code>
       */
      public int getStorageTypesCount() {
        return storageTypes_.size();
      }
      /**
       * <code>repeated .hadoop.hdfs.StorageTypeProto storageTypes = 4;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypeProto getStorageTypes(int index) {
        return storageTypes_converter_.convert(storageTypes_.get(index));
      }
      /**
       * <code>repeated .hadoop.hdfs.StorageTypeProto storageTypes = 4;</code>
       */
      public Builder setStorageTypes(
          int index, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypeProto value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStorageTypesIsMutable();
        storageTypes_.set(index, value.getNumber());
        onChanged();
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.StorageTypeProto storageTypes = 4;</code>
       */
      public Builder addStorageTypes(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypeProto value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStorageTypesIsMutable();
        storageTypes_.add(value.getNumber());
        onChanged();
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.StorageTypeProto storageTypes = 4;</code>
       */
      public Builder addAllStorageTypes(
          java.lang.Iterable<? extends org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypeProto> values) {
        ensureStorageTypesIsMutable();
        for (org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.StorageTypeProto value : values) {
          storageTypes_.add(value.getNumber());
        }
        onChanged();
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.StorageTypeProto storageTypes = 4;</code>
       */
      public Builder clearStorageTypes() {
        storageTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }

      private org.apache.hadoop.thirdparty.protobuf.ByteString indices_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes indices = 5;</code>
       */
      public boolean hasIndices() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <code>optional bytes indices = 5;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString getIndices() {
        return indices_;
      }
      /**
       * <code>optional bytes indices = 5;</code>
       */
      public Builder setIndices(org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        indices_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes indices = 5;</code>
       */
      public Builder clearIndices() {
        bitField0_ = (bitField0_ & ~0x00000010);
        indices_ = getDefaultInstance().getIndices();
        onChanged();
        return this;
      }

      private int dataBlockNum_ ;
      /**
       * <code>optional uint32 dataBlockNum = 6;</code>
       */
      public boolean hasDataBlockNum() {
        return ((bitField0_ & 0x00000020) != 0);
      }
      /**
       * <code>optional uint32 dataBlockNum = 6;</code>
       */
      public int getDataBlockNum() {
        return dataBlockNum_;
      }
      /**
       * <code>optional uint32 dataBlockNum = 6;</code>
       */
      public Builder setDataBlockNum(int value) {
        bitField0_ |= 0x00000020;
        dataBlockNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 dataBlockNum = 6;</code>
       */
      public Builder clearDataBlockNum() {
        bitField0_ = (bitField0_ & ~0x00000020);
        dataBlockNum_ = 0;
        onChanged();
        return this;
      }

      private int cellSize_ ;
      /**
       * <code>optional uint32 cellSize = 7;</code>
       */
      public boolean hasCellSize() {
        return ((bitField0_ & 0x00000040) != 0);
      }
      /**
       * <code>optional uint32 cellSize = 7;</code>
       */
      public int getCellSize() {
        return cellSize_;
      }
      /**
       * <code>optional uint32 cellSize = 7;</code>
       */
      public Builder setCellSize(int value) {
        bitField0_ |= 0x00000040;
        cellSize_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 cellSize = 7;</code>
       */
      public Builder clearCellSize() {
        bitField0_ = (bitField0_ & ~0x00000040);
        cellSize_ = 0;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.BlockWithLocationsProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.BlockWithLocationsProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<BlockWithLocationsProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<BlockWithLocationsProto>() {
      @java.lang.Override
      public BlockWithLocationsProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new BlockWithLocationsProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<BlockWithLocationsProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<BlockWithLocationsProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface BlocksWithLocationsProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.BlocksWithLocationsProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .hadoop.hdfs.BlockWithLocationsProto blocks = 1;</code>
     */
    java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto> 
        getBlocksList();
    /**
     * <code>repeated .hadoop.hdfs.BlockWithLocationsProto blocks = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto getBlocks(int index);
    /**
     * <code>repeated .hadoop.hdfs.BlockWithLocationsProto blocks = 1;</code>
     */
    int getBlocksCount();
    /**
     * <code>repeated .hadoop.hdfs.BlockWithLocationsProto blocks = 1;</code>
     */
    java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProtoOrBuilder> 
        getBlocksOrBuilderList();
    /**
     * <code>repeated .hadoop.hdfs.BlockWithLocationsProto blocks = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProtoOrBuilder getBlocksOrBuilder(
        int index);
  }
  /**
   * <pre>
   **
   * List of block with locations
   * </pre>
   *
   * Protobuf type {@code hadoop.hdfs.BlocksWithLocationsProto}
   */
  public  static final class BlocksWithLocationsProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.BlocksWithLocationsProto)
      BlocksWithLocationsProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BlocksWithLocationsProto.newBuilder() to construct.
    private BlocksWithLocationsProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BlocksWithLocationsProto() {
      blocks_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BlocksWithLocationsProto(
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
                blocks_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto>();
                mutable_bitField0_ |= 0x00000001;
              }
              blocks_.add(
                  input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto.PARSER, extensionRegistry));
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
          blocks_ = java.util.Collections.unmodifiableList(blocks_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_BlocksWithLocationsProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_BlocksWithLocationsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto.class, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto.Builder.class);
    }

    public static final int BLOCKS_FIELD_NUMBER = 1;
    private java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto> blocks_;
    /**
     * <code>repeated .hadoop.hdfs.BlockWithLocationsProto blocks = 1;</code>
     */
    public java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto> getBlocksList() {
      return blocks_;
    }
    /**
     * <code>repeated .hadoop.hdfs.BlockWithLocationsProto blocks = 1;</code>
     */
    public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProtoOrBuilder> 
        getBlocksOrBuilderList() {
      return blocks_;
    }
    /**
     * <code>repeated .hadoop.hdfs.BlockWithLocationsProto blocks = 1;</code>
     */
    public int getBlocksCount() {
      return blocks_.size();
    }
    /**
     * <code>repeated .hadoop.hdfs.BlockWithLocationsProto blocks = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto getBlocks(int index) {
      return blocks_.get(index);
    }
    /**
     * <code>repeated .hadoop.hdfs.BlockWithLocationsProto blocks = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProtoOrBuilder getBlocksOrBuilder(
        int index) {
      return blocks_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getBlocksCount(); i++) {
        if (!getBlocks(i).isInitialized()) {
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
      for (int i = 0; i < blocks_.size(); i++) {
        output.writeMessage(1, blocks_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < blocks_.size(); i++) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(1, blocks_.get(i));
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto other = (org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto) obj;

      if (!getBlocksList()
          .equals(other.getBlocksList())) return false;
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
      if (getBlocksCount() > 0) {
        hash = (37 * hash) + BLOCKS_FIELD_NUMBER;
        hash = (53 * hash) + getBlocksList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto prototype) {
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
     * List of block with locations
     * </pre>
     *
     * Protobuf type {@code hadoop.hdfs.BlocksWithLocationsProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.BlocksWithLocationsProto)
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_BlocksWithLocationsProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_BlocksWithLocationsProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto.class, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto.newBuilder()
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
          getBlocksFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (blocksBuilder_ == null) {
          blocks_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          blocksBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_BlocksWithLocationsProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto build() {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto result = new org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto(this);
        int from_bitField0_ = bitField0_;
        if (blocksBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            blocks_ = java.util.Collections.unmodifiableList(blocks_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.blocks_ = blocks_;
        } else {
          result.blocks_ = blocksBuilder_.build();
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto.getDefaultInstance()) return this;
        if (blocksBuilder_ == null) {
          if (!other.blocks_.isEmpty()) {
            if (blocks_.isEmpty()) {
              blocks_ = other.blocks_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureBlocksIsMutable();
              blocks_.addAll(other.blocks_);
            }
            onChanged();
          }
        } else {
          if (!other.blocks_.isEmpty()) {
            if (blocksBuilder_.isEmpty()) {
              blocksBuilder_.dispose();
              blocksBuilder_ = null;
              blocks_ = other.blocks_;
              bitField0_ = (bitField0_ & ~0x00000001);
              blocksBuilder_ = 
                org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getBlocksFieldBuilder() : null;
            } else {
              blocksBuilder_.addAllMessages(other.blocks_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        for (int i = 0; i < getBlocksCount(); i++) {
          if (!getBlocks(i).isInitialized()) {
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
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto> blocks_ =
        java.util.Collections.emptyList();
      private void ensureBlocksIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          blocks_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto>(blocks_);
          bitField0_ |= 0x00000001;
         }
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProtoOrBuilder> blocksBuilder_;

      /**
       * <code>repeated .hadoop.hdfs.BlockWithLocationsProto blocks = 1;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto> getBlocksList() {
        if (blocksBuilder_ == null) {
          return java.util.Collections.unmodifiableList(blocks_);
        } else {
          return blocksBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockWithLocationsProto blocks = 1;</code>
       */
      public int getBlocksCount() {
        if (blocksBuilder_ == null) {
          return blocks_.size();
        } else {
          return blocksBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockWithLocationsProto blocks = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto getBlocks(int index) {
        if (blocksBuilder_ == null) {
          return blocks_.get(index);
        } else {
          return blocksBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockWithLocationsProto blocks = 1;</code>
       */
      public Builder setBlocks(
          int index, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto value) {
        if (blocksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBlocksIsMutable();
          blocks_.set(index, value);
          onChanged();
        } else {
          blocksBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockWithLocationsProto blocks = 1;</code>
       */
      public Builder setBlocks(
          int index, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto.Builder builderForValue) {
        if (blocksBuilder_ == null) {
          ensureBlocksIsMutable();
          blocks_.set(index, builderForValue.build());
          onChanged();
        } else {
          blocksBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockWithLocationsProto blocks = 1;</code>
       */
      public Builder addBlocks(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto value) {
        if (blocksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBlocksIsMutable();
          blocks_.add(value);
          onChanged();
        } else {
          blocksBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockWithLocationsProto blocks = 1;</code>
       */
      public Builder addBlocks(
          int index, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto value) {
        if (blocksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBlocksIsMutable();
          blocks_.add(index, value);
          onChanged();
        } else {
          blocksBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockWithLocationsProto blocks = 1;</code>
       */
      public Builder addBlocks(
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto.Builder builderForValue) {
        if (blocksBuilder_ == null) {
          ensureBlocksIsMutable();
          blocks_.add(builderForValue.build());
          onChanged();
        } else {
          blocksBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockWithLocationsProto blocks = 1;</code>
       */
      public Builder addBlocks(
          int index, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto.Builder builderForValue) {
        if (blocksBuilder_ == null) {
          ensureBlocksIsMutable();
          blocks_.add(index, builderForValue.build());
          onChanged();
        } else {
          blocksBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockWithLocationsProto blocks = 1;</code>
       */
      public Builder addAllBlocks(
          java.lang.Iterable<? extends org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto> values) {
        if (blocksBuilder_ == null) {
          ensureBlocksIsMutable();
          org.apache.hadoop.thirdparty.protobuf.AbstractMessageLite.Builder.addAll(
              values, blocks_);
          onChanged();
        } else {
          blocksBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockWithLocationsProto blocks = 1;</code>
       */
      public Builder clearBlocks() {
        if (blocksBuilder_ == null) {
          blocks_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          blocksBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockWithLocationsProto blocks = 1;</code>
       */
      public Builder removeBlocks(int index) {
        if (blocksBuilder_ == null) {
          ensureBlocksIsMutable();
          blocks_.remove(index);
          onChanged();
        } else {
          blocksBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockWithLocationsProto blocks = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto.Builder getBlocksBuilder(
          int index) {
        return getBlocksFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockWithLocationsProto blocks = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProtoOrBuilder getBlocksOrBuilder(
          int index) {
        if (blocksBuilder_ == null) {
          return blocks_.get(index);  } else {
          return blocksBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockWithLocationsProto blocks = 1;</code>
       */
      public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProtoOrBuilder> 
           getBlocksOrBuilderList() {
        if (blocksBuilder_ != null) {
          return blocksBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(blocks_);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockWithLocationsProto blocks = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto.Builder addBlocksBuilder() {
        return getBlocksFieldBuilder().addBuilder(
            org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockWithLocationsProto blocks = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto.Builder addBlocksBuilder(
          int index) {
        return getBlocksFieldBuilder().addBuilder(
            index, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.BlockWithLocationsProto blocks = 1;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto.Builder> 
           getBlocksBuilderList() {
        return getBlocksFieldBuilder().getBuilderList();
      }
      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProtoOrBuilder> 
          getBlocksFieldBuilder() {
        if (blocksBuilder_ == null) {
          blocksBuilder_ = new org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlockWithLocationsProtoOrBuilder>(
                  blocks_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          blocks_ = null;
        }
        return blocksBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.BlocksWithLocationsProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.BlocksWithLocationsProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<BlocksWithLocationsProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<BlocksWithLocationsProto>() {
      @java.lang.Override
      public BlocksWithLocationsProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new BlocksWithLocationsProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<BlocksWithLocationsProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<BlocksWithLocationsProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.BlocksWithLocationsProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RemoteEditLogProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.RemoteEditLogProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Starting available edit log transaction
     * </pre>
     *
     * <code>required uint64 startTxId = 1;</code>
     */
    boolean hasStartTxId();
    /**
     * <pre>
     * Starting available edit log transaction
     * </pre>
     *
     * <code>required uint64 startTxId = 1;</code>
     */
    long getStartTxId();

    /**
     * <pre>
     * Ending available edit log transaction
     * </pre>
     *
     * <code>required uint64 endTxId = 2;</code>
     */
    boolean hasEndTxId();
    /**
     * <pre>
     * Ending available edit log transaction
     * </pre>
     *
     * <code>required uint64 endTxId = 2;</code>
     */
    long getEndTxId();

    /**
     * <code>optional bool isInProgress = 3 [default = false];</code>
     */
    boolean hasIsInProgress();
    /**
     * <code>optional bool isInProgress = 3 [default = false];</code>
     */
    boolean getIsInProgress();
  }
  /**
   * <pre>
   **
   * Editlog information with available transactions
   * </pre>
   *
   * Protobuf type {@code hadoop.hdfs.RemoteEditLogProto}
   */
  public  static final class RemoteEditLogProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.RemoteEditLogProto)
      RemoteEditLogProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RemoteEditLogProto.newBuilder() to construct.
    private RemoteEditLogProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RemoteEditLogProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RemoteEditLogProto(
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
              startTxId_ = input.readUInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              endTxId_ = input.readUInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              isInProgress_ = input.readBool();
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
      return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_RemoteEditLogProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_RemoteEditLogProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto.class, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto.Builder.class);
    }

    private int bitField0_;
    public static final int STARTTXID_FIELD_NUMBER = 1;
    private long startTxId_;
    /**
     * <pre>
     * Starting available edit log transaction
     * </pre>
     *
     * <code>required uint64 startTxId = 1;</code>
     */
    public boolean hasStartTxId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Starting available edit log transaction
     * </pre>
     *
     * <code>required uint64 startTxId = 1;</code>
     */
    public long getStartTxId() {
      return startTxId_;
    }

    public static final int ENDTXID_FIELD_NUMBER = 2;
    private long endTxId_;
    /**
     * <pre>
     * Ending available edit log transaction
     * </pre>
     *
     * <code>required uint64 endTxId = 2;</code>
     */
    public boolean hasEndTxId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Ending available edit log transaction
     * </pre>
     *
     * <code>required uint64 endTxId = 2;</code>
     */
    public long getEndTxId() {
      return endTxId_;
    }

    public static final int ISINPROGRESS_FIELD_NUMBER = 3;
    private boolean isInProgress_;
    /**
     * <code>optional bool isInProgress = 3 [default = false];</code>
     */
    public boolean hasIsInProgress() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional bool isInProgress = 3 [default = false];</code>
     */
    public boolean getIsInProgress() {
      return isInProgress_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasStartTxId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasEndTxId()) {
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
        output.writeUInt64(1, startTxId_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt64(2, endTxId_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeBool(3, isInProgress_);
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
          .computeUInt64Size(1, startTxId_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeUInt64Size(2, endTxId_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeBoolSize(3, isInProgress_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto other = (org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto) obj;

      if (hasStartTxId() != other.hasStartTxId()) return false;
      if (hasStartTxId()) {
        if (getStartTxId()
            != other.getStartTxId()) return false;
      }
      if (hasEndTxId() != other.hasEndTxId()) return false;
      if (hasEndTxId()) {
        if (getEndTxId()
            != other.getEndTxId()) return false;
      }
      if (hasIsInProgress() != other.hasIsInProgress()) return false;
      if (hasIsInProgress()) {
        if (getIsInProgress()
            != other.getIsInProgress()) return false;
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
      if (hasStartTxId()) {
        hash = (37 * hash) + STARTTXID_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getStartTxId());
      }
      if (hasEndTxId()) {
        hash = (37 * hash) + ENDTXID_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getEndTxId());
      }
      if (hasIsInProgress()) {
        hash = (37 * hash) + ISINPROGRESS_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashBoolean(
            getIsInProgress());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto prototype) {
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
     * Editlog information with available transactions
     * </pre>
     *
     * Protobuf type {@code hadoop.hdfs.RemoteEditLogProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.RemoteEditLogProto)
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_RemoteEditLogProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_RemoteEditLogProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto.class, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto.newBuilder()
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
        startTxId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        endTxId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        isInProgress_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_RemoteEditLogProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto build() {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto result = new org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.startTxId_ = startTxId_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.endTxId_ = endTxId_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.isInProgress_ = isInProgress_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto.getDefaultInstance()) return this;
        if (other.hasStartTxId()) {
          setStartTxId(other.getStartTxId());
        }
        if (other.hasEndTxId()) {
          setEndTxId(other.getEndTxId());
        }
        if (other.hasIsInProgress()) {
          setIsInProgress(other.getIsInProgress());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasStartTxId()) {
          return false;
        }
        if (!hasEndTxId()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long startTxId_ ;
      /**
       * <pre>
       * Starting available edit log transaction
       * </pre>
       *
       * <code>required uint64 startTxId = 1;</code>
       */
      public boolean hasStartTxId() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Starting available edit log transaction
       * </pre>
       *
       * <code>required uint64 startTxId = 1;</code>
       */
      public long getStartTxId() {
        return startTxId_;
      }
      /**
       * <pre>
       * Starting available edit log transaction
       * </pre>
       *
       * <code>required uint64 startTxId = 1;</code>
       */
      public Builder setStartTxId(long value) {
        bitField0_ |= 0x00000001;
        startTxId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Starting available edit log transaction
       * </pre>
       *
       * <code>required uint64 startTxId = 1;</code>
       */
      public Builder clearStartTxId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        startTxId_ = 0L;
        onChanged();
        return this;
      }

      private long endTxId_ ;
      /**
       * <pre>
       * Ending available edit log transaction
       * </pre>
       *
       * <code>required uint64 endTxId = 2;</code>
       */
      public boolean hasEndTxId() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * Ending available edit log transaction
       * </pre>
       *
       * <code>required uint64 endTxId = 2;</code>
       */
      public long getEndTxId() {
        return endTxId_;
      }
      /**
       * <pre>
       * Ending available edit log transaction
       * </pre>
       *
       * <code>required uint64 endTxId = 2;</code>
       */
      public Builder setEndTxId(long value) {
        bitField0_ |= 0x00000002;
        endTxId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Ending available edit log transaction
       * </pre>
       *
       * <code>required uint64 endTxId = 2;</code>
       */
      public Builder clearEndTxId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        endTxId_ = 0L;
        onChanged();
        return this;
      }

      private boolean isInProgress_ ;
      /**
       * <code>optional bool isInProgress = 3 [default = false];</code>
       */
      public boolean hasIsInProgress() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional bool isInProgress = 3 [default = false];</code>
       */
      public boolean getIsInProgress() {
        return isInProgress_;
      }
      /**
       * <code>optional bool isInProgress = 3 [default = false];</code>
       */
      public Builder setIsInProgress(boolean value) {
        bitField0_ |= 0x00000004;
        isInProgress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool isInProgress = 3 [default = false];</code>
       */
      public Builder clearIsInProgress() {
        bitField0_ = (bitField0_ & ~0x00000004);
        isInProgress_ = false;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.RemoteEditLogProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.RemoteEditLogProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<RemoteEditLogProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<RemoteEditLogProto>() {
      @java.lang.Override
      public RemoteEditLogProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new RemoteEditLogProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<RemoteEditLogProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<RemoteEditLogProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RemoteEditLogManifestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.RemoteEditLogManifestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .hadoop.hdfs.RemoteEditLogProto logs = 1;</code>
     */
    java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto> 
        getLogsList();
    /**
     * <code>repeated .hadoop.hdfs.RemoteEditLogProto logs = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto getLogs(int index);
    /**
     * <code>repeated .hadoop.hdfs.RemoteEditLogProto logs = 1;</code>
     */
    int getLogsCount();
    /**
     * <code>repeated .hadoop.hdfs.RemoteEditLogProto logs = 1;</code>
     */
    java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProtoOrBuilder> 
        getLogsOrBuilderList();
    /**
     * <code>repeated .hadoop.hdfs.RemoteEditLogProto logs = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProtoOrBuilder getLogsOrBuilder(
        int index);

    /**
     * <code>optional uint64 committedTxnId = 2;</code>
     */
    boolean hasCommittedTxnId();
    /**
     * <code>optional uint64 committedTxnId = 2;</code>
     */
    long getCommittedTxnId();
  }
  /**
   * <pre>
   **
   * Enumeration of editlogs available on a remote namenode
   * </pre>
   *
   * Protobuf type {@code hadoop.hdfs.RemoteEditLogManifestProto}
   */
  public  static final class RemoteEditLogManifestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.RemoteEditLogManifestProto)
      RemoteEditLogManifestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RemoteEditLogManifestProto.newBuilder() to construct.
    private RemoteEditLogManifestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RemoteEditLogManifestProto() {
      logs_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RemoteEditLogManifestProto(
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
                logs_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto>();
                mutable_bitField0_ |= 0x00000001;
              }
              logs_.add(
                  input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto.PARSER, extensionRegistry));
              break;
            }
            case 16: {
              bitField0_ |= 0x00000001;
              committedTxnId_ = input.readUInt64();
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
          logs_ = java.util.Collections.unmodifiableList(logs_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_RemoteEditLogManifestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_RemoteEditLogManifestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto.class, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto.Builder.class);
    }

    private int bitField0_;
    public static final int LOGS_FIELD_NUMBER = 1;
    private java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto> logs_;
    /**
     * <code>repeated .hadoop.hdfs.RemoteEditLogProto logs = 1;</code>
     */
    public java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto> getLogsList() {
      return logs_;
    }
    /**
     * <code>repeated .hadoop.hdfs.RemoteEditLogProto logs = 1;</code>
     */
    public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProtoOrBuilder> 
        getLogsOrBuilderList() {
      return logs_;
    }
    /**
     * <code>repeated .hadoop.hdfs.RemoteEditLogProto logs = 1;</code>
     */
    public int getLogsCount() {
      return logs_.size();
    }
    /**
     * <code>repeated .hadoop.hdfs.RemoteEditLogProto logs = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto getLogs(int index) {
      return logs_.get(index);
    }
    /**
     * <code>repeated .hadoop.hdfs.RemoteEditLogProto logs = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProtoOrBuilder getLogsOrBuilder(
        int index) {
      return logs_.get(index);
    }

    public static final int COMMITTEDTXNID_FIELD_NUMBER = 2;
    private long committedTxnId_;
    /**
     * <code>optional uint64 committedTxnId = 2;</code>
     */
    public boolean hasCommittedTxnId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional uint64 committedTxnId = 2;</code>
     */
    public long getCommittedTxnId() {
      return committedTxnId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getLogsCount(); i++) {
        if (!getLogs(i).isInitialized()) {
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
      for (int i = 0; i < logs_.size(); i++) {
        output.writeMessage(1, logs_.get(i));
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeUInt64(2, committedTxnId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < logs_.size(); i++) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(1, logs_.get(i));
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeUInt64Size(2, committedTxnId_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto other = (org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto) obj;

      if (!getLogsList()
          .equals(other.getLogsList())) return false;
      if (hasCommittedTxnId() != other.hasCommittedTxnId()) return false;
      if (hasCommittedTxnId()) {
        if (getCommittedTxnId()
            != other.getCommittedTxnId()) return false;
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
      if (getLogsCount() > 0) {
        hash = (37 * hash) + LOGS_FIELD_NUMBER;
        hash = (53 * hash) + getLogsList().hashCode();
      }
      if (hasCommittedTxnId()) {
        hash = (37 * hash) + COMMITTEDTXNID_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getCommittedTxnId());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto prototype) {
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
     * Enumeration of editlogs available on a remote namenode
     * </pre>
     *
     * Protobuf type {@code hadoop.hdfs.RemoteEditLogManifestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.RemoteEditLogManifestProto)
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_RemoteEditLogManifestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_RemoteEditLogManifestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto.class, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto.newBuilder()
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
          getLogsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (logsBuilder_ == null) {
          logs_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          logsBuilder_.clear();
        }
        committedTxnId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_RemoteEditLogManifestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto result = new org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (logsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            logs_ = java.util.Collections.unmodifiableList(logs_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.logs_ = logs_;
        } else {
          result.logs_ = logsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.committedTxnId_ = committedTxnId_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto.getDefaultInstance()) return this;
        if (logsBuilder_ == null) {
          if (!other.logs_.isEmpty()) {
            if (logs_.isEmpty()) {
              logs_ = other.logs_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureLogsIsMutable();
              logs_.addAll(other.logs_);
            }
            onChanged();
          }
        } else {
          if (!other.logs_.isEmpty()) {
            if (logsBuilder_.isEmpty()) {
              logsBuilder_.dispose();
              logsBuilder_ = null;
              logs_ = other.logs_;
              bitField0_ = (bitField0_ & ~0x00000001);
              logsBuilder_ = 
                org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getLogsFieldBuilder() : null;
            } else {
              logsBuilder_.addAllMessages(other.logs_);
            }
          }
        }
        if (other.hasCommittedTxnId()) {
          setCommittedTxnId(other.getCommittedTxnId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        for (int i = 0; i < getLogsCount(); i++) {
          if (!getLogs(i).isInitialized()) {
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
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto> logs_ =
        java.util.Collections.emptyList();
      private void ensureLogsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          logs_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto>(logs_);
          bitField0_ |= 0x00000001;
         }
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProtoOrBuilder> logsBuilder_;

      /**
       * <code>repeated .hadoop.hdfs.RemoteEditLogProto logs = 1;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto> getLogsList() {
        if (logsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(logs_);
        } else {
          return logsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.RemoteEditLogProto logs = 1;</code>
       */
      public int getLogsCount() {
        if (logsBuilder_ == null) {
          return logs_.size();
        } else {
          return logsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.RemoteEditLogProto logs = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto getLogs(int index) {
        if (logsBuilder_ == null) {
          return logs_.get(index);
        } else {
          return logsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.RemoteEditLogProto logs = 1;</code>
       */
      public Builder setLogs(
          int index, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto value) {
        if (logsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLogsIsMutable();
          logs_.set(index, value);
          onChanged();
        } else {
          logsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.RemoteEditLogProto logs = 1;</code>
       */
      public Builder setLogs(
          int index, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto.Builder builderForValue) {
        if (logsBuilder_ == null) {
          ensureLogsIsMutable();
          logs_.set(index, builderForValue.build());
          onChanged();
        } else {
          logsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.RemoteEditLogProto logs = 1;</code>
       */
      public Builder addLogs(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto value) {
        if (logsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLogsIsMutable();
          logs_.add(value);
          onChanged();
        } else {
          logsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.RemoteEditLogProto logs = 1;</code>
       */
      public Builder addLogs(
          int index, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto value) {
        if (logsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLogsIsMutable();
          logs_.add(index, value);
          onChanged();
        } else {
          logsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.RemoteEditLogProto logs = 1;</code>
       */
      public Builder addLogs(
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto.Builder builderForValue) {
        if (logsBuilder_ == null) {
          ensureLogsIsMutable();
          logs_.add(builderForValue.build());
          onChanged();
        } else {
          logsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.RemoteEditLogProto logs = 1;</code>
       */
      public Builder addLogs(
          int index, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto.Builder builderForValue) {
        if (logsBuilder_ == null) {
          ensureLogsIsMutable();
          logs_.add(index, builderForValue.build());
          onChanged();
        } else {
          logsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.RemoteEditLogProto logs = 1;</code>
       */
      public Builder addAllLogs(
          java.lang.Iterable<? extends org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto> values) {
        if (logsBuilder_ == null) {
          ensureLogsIsMutable();
          org.apache.hadoop.thirdparty.protobuf.AbstractMessageLite.Builder.addAll(
              values, logs_);
          onChanged();
        } else {
          logsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.RemoteEditLogProto logs = 1;</code>
       */
      public Builder clearLogs() {
        if (logsBuilder_ == null) {
          logs_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          logsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.RemoteEditLogProto logs = 1;</code>
       */
      public Builder removeLogs(int index) {
        if (logsBuilder_ == null) {
          ensureLogsIsMutable();
          logs_.remove(index);
          onChanged();
        } else {
          logsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.RemoteEditLogProto logs = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto.Builder getLogsBuilder(
          int index) {
        return getLogsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.hdfs.RemoteEditLogProto logs = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProtoOrBuilder getLogsOrBuilder(
          int index) {
        if (logsBuilder_ == null) {
          return logs_.get(index);  } else {
          return logsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.RemoteEditLogProto logs = 1;</code>
       */
      public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProtoOrBuilder> 
           getLogsOrBuilderList() {
        if (logsBuilder_ != null) {
          return logsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(logs_);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.RemoteEditLogProto logs = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto.Builder addLogsBuilder() {
        return getLogsFieldBuilder().addBuilder(
            org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.RemoteEditLogProto logs = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto.Builder addLogsBuilder(
          int index) {
        return getLogsFieldBuilder().addBuilder(
            index, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.RemoteEditLogProto logs = 1;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto.Builder> 
           getLogsBuilderList() {
        return getLogsFieldBuilder().getBuilderList();
      }
      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProtoOrBuilder> 
          getLogsFieldBuilder() {
        if (logsBuilder_ == null) {
          logsBuilder_ = new org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogProtoOrBuilder>(
                  logs_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          logs_ = null;
        }
        return logsBuilder_;
      }

      private long committedTxnId_ ;
      /**
       * <code>optional uint64 committedTxnId = 2;</code>
       */
      public boolean hasCommittedTxnId() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional uint64 committedTxnId = 2;</code>
       */
      public long getCommittedTxnId() {
        return committedTxnId_;
      }
      /**
       * <code>optional uint64 committedTxnId = 2;</code>
       */
      public Builder setCommittedTxnId(long value) {
        bitField0_ |= 0x00000002;
        committedTxnId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 committedTxnId = 2;</code>
       */
      public Builder clearCommittedTxnId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        committedTxnId_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.RemoteEditLogManifestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.RemoteEditLogManifestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<RemoteEditLogManifestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<RemoteEditLogManifestProto>() {
      @java.lang.Override
      public RemoteEditLogManifestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new RemoteEditLogManifestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<RemoteEditLogManifestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<RemoteEditLogManifestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RemoteEditLogManifestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface NamespaceInfoProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.NamespaceInfoProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Software revision version (e.g. an svn or git revision)
     * </pre>
     *
     * <code>required string buildVersion = 1;</code>
     */
    boolean hasBuildVersion();
    /**
     * <pre>
     * Software revision version (e.g. an svn or git revision)
     * </pre>
     *
     * <code>required string buildVersion = 1;</code>
     */
    java.lang.String getBuildVersion();
    /**
     * <pre>
     * Software revision version (e.g. an svn or git revision)
     * </pre>
     *
     * <code>required string buildVersion = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getBuildVersionBytes();

    /**
     * <pre>
     * Retained for backward compatibility
     * </pre>
     *
     * <code>required uint32 unused = 2;</code>
     */
    boolean hasUnused();
    /**
     * <pre>
     * Retained for backward compatibility
     * </pre>
     *
     * <code>required uint32 unused = 2;</code>
     */
    int getUnused();

    /**
     * <pre>
     * block pool used by the namespace
     * </pre>
     *
     * <code>required string blockPoolID = 3;</code>
     */
    boolean hasBlockPoolID();
    /**
     * <pre>
     * block pool used by the namespace
     * </pre>
     *
     * <code>required string blockPoolID = 3;</code>
     */
    java.lang.String getBlockPoolID();
    /**
     * <pre>
     * block pool used by the namespace
     * </pre>
     *
     * <code>required string blockPoolID = 3;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getBlockPoolIDBytes();

    /**
     * <pre>
     * Node information
     * </pre>
     *
     * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 4;</code>
     */
    boolean hasStorageInfo();
    /**
     * <pre>
     * Node information
     * </pre>
     *
     * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 4;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto getStorageInfo();
    /**
     * <pre>
     * Node information
     * </pre>
     *
     * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 4;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProtoOrBuilder getStorageInfoOrBuilder();

    /**
     * <pre>
     * Software version number (e.g. 2.0.0)
     * </pre>
     *
     * <code>required string softwareVersion = 5;</code>
     */
    boolean hasSoftwareVersion();
    /**
     * <pre>
     * Software version number (e.g. 2.0.0)
     * </pre>
     *
     * <code>required string softwareVersion = 5;</code>
     */
    java.lang.String getSoftwareVersion();
    /**
     * <pre>
     * Software version number (e.g. 2.0.0)
     * </pre>
     *
     * <code>required string softwareVersion = 5;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getSoftwareVersionBytes();

    /**
     * <pre>
     * feature flags
     * </pre>
     *
     * <code>optional uint64 capabilities = 6 [default = 0];</code>
     */
    boolean hasCapabilities();
    /**
     * <pre>
     * feature flags
     * </pre>
     *
     * <code>optional uint64 capabilities = 6 [default = 0];</code>
     */
    long getCapabilities();

    /**
     * <code>optional .hadoop.hdfs.NNHAStatusHeartbeatProto.State state = 7;</code>
     */
    boolean hasState();
    /**
     * <code>optional .hadoop.hdfs.NNHAStatusHeartbeatProto.State state = 7;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto.State getState();
  }
  /**
   * <pre>
   **
   * Namespace information that describes namespace on a namenode
   * </pre>
   *
   * Protobuf type {@code hadoop.hdfs.NamespaceInfoProto}
   */
  public  static final class NamespaceInfoProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.NamespaceInfoProto)
      NamespaceInfoProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NamespaceInfoProto.newBuilder() to construct.
    private NamespaceInfoProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NamespaceInfoProto() {
      buildVersion_ = "";
      blockPoolID_ = "";
      softwareVersion_ = "";
      state_ = 0;
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private NamespaceInfoProto(
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
              buildVersion_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              unused_ = input.readUInt32();
              break;
            }
            case 26: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              blockPoolID_ = bs;
              break;
            }
            case 34: {
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000008) != 0)) {
                subBuilder = storageInfo_.toBuilder();
              }
              storageInfo_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(storageInfo_);
                storageInfo_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000008;
              break;
            }
            case 42: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000010;
              softwareVersion_ = bs;
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              capabilities_ = input.readUInt64();
              break;
            }
            case 56: {
              int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto.State value = org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto.State.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(7, rawValue);
              } else {
                bitField0_ |= 0x00000040;
                state_ = rawValue;
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
      return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_NamespaceInfoProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_NamespaceInfoProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto.class, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto.Builder.class);
    }

    private int bitField0_;
    public static final int BUILDVERSION_FIELD_NUMBER = 1;
    private volatile java.lang.Object buildVersion_;
    /**
     * <pre>
     * Software revision version (e.g. an svn or git revision)
     * </pre>
     *
     * <code>required string buildVersion = 1;</code>
     */
    public boolean hasBuildVersion() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Software revision version (e.g. an svn or git revision)
     * </pre>
     *
     * <code>required string buildVersion = 1;</code>
     */
    public java.lang.String getBuildVersion() {
      java.lang.Object ref = buildVersion_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          buildVersion_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * Software revision version (e.g. an svn or git revision)
     * </pre>
     *
     * <code>required string buildVersion = 1;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getBuildVersionBytes() {
      java.lang.Object ref = buildVersion_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        buildVersion_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int UNUSED_FIELD_NUMBER = 2;
    private int unused_;
    /**
     * <pre>
     * Retained for backward compatibility
     * </pre>
     *
     * <code>required uint32 unused = 2;</code>
     */
    public boolean hasUnused() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Retained for backward compatibility
     * </pre>
     *
     * <code>required uint32 unused = 2;</code>
     */
    public int getUnused() {
      return unused_;
    }

    public static final int BLOCKPOOLID_FIELD_NUMBER = 3;
    private volatile java.lang.Object blockPoolID_;
    /**
     * <pre>
     * block pool used by the namespace
     * </pre>
     *
     * <code>required string blockPoolID = 3;</code>
     */
    public boolean hasBlockPoolID() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * block pool used by the namespace
     * </pre>
     *
     * <code>required string blockPoolID = 3;</code>
     */
    public java.lang.String getBlockPoolID() {
      java.lang.Object ref = blockPoolID_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          blockPoolID_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * block pool used by the namespace
     * </pre>
     *
     * <code>required string blockPoolID = 3;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getBlockPoolIDBytes() {
      java.lang.Object ref = blockPoolID_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        blockPoolID_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int STORAGEINFO_FIELD_NUMBER = 4;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto storageInfo_;
    /**
     * <pre>
     * Node information
     * </pre>
     *
     * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 4;</code>
     */
    public boolean hasStorageInfo() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Node information
     * </pre>
     *
     * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 4;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto getStorageInfo() {
      return storageInfo_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.getDefaultInstance() : storageInfo_;
    }
    /**
     * <pre>
     * Node information
     * </pre>
     *
     * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 4;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProtoOrBuilder getStorageInfoOrBuilder() {
      return storageInfo_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.getDefaultInstance() : storageInfo_;
    }

    public static final int SOFTWAREVERSION_FIELD_NUMBER = 5;
    private volatile java.lang.Object softwareVersion_;
    /**
     * <pre>
     * Software version number (e.g. 2.0.0)
     * </pre>
     *
     * <code>required string softwareVersion = 5;</code>
     */
    public boolean hasSoftwareVersion() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * Software version number (e.g. 2.0.0)
     * </pre>
     *
     * <code>required string softwareVersion = 5;</code>
     */
    public java.lang.String getSoftwareVersion() {
      java.lang.Object ref = softwareVersion_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          softwareVersion_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * Software version number (e.g. 2.0.0)
     * </pre>
     *
     * <code>required string softwareVersion = 5;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getSoftwareVersionBytes() {
      java.lang.Object ref = softwareVersion_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        softwareVersion_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int CAPABILITIES_FIELD_NUMBER = 6;
    private long capabilities_;
    /**
     * <pre>
     * feature flags
     * </pre>
     *
     * <code>optional uint64 capabilities = 6 [default = 0];</code>
     */
    public boolean hasCapabilities() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <pre>
     * feature flags
     * </pre>
     *
     * <code>optional uint64 capabilities = 6 [default = 0];</code>
     */
    public long getCapabilities() {
      return capabilities_;
    }

    public static final int STATE_FIELD_NUMBER = 7;
    private int state_;
    /**
     * <code>optional .hadoop.hdfs.NNHAStatusHeartbeatProto.State state = 7;</code>
     */
    public boolean hasState() {
      return ((bitField0_ & 0x00000040) != 0);
    }
    /**
     * <code>optional .hadoop.hdfs.NNHAStatusHeartbeatProto.State state = 7;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto.State getState() {
      @SuppressWarnings("deprecation")
      org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto.State result = org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto.State.valueOf(state_);
      return result == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto.State.ACTIVE : result;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasBuildVersion()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasUnused()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasBlockPoolID()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasStorageInfo()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSoftwareVersion()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getStorageInfo().isInitialized()) {
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, buildVersion_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt32(2, unused_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 3, blockPoolID_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeMessage(4, getStorageInfo());
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 5, softwareVersion_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        output.writeUInt64(6, capabilities_);
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        output.writeEnum(7, state_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, buildVersion_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeUInt32Size(2, unused_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(3, blockPoolID_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(4, getStorageInfo());
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(5, softwareVersion_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeUInt64Size(6, capabilities_);
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeEnumSize(7, state_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto other = (org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto) obj;

      if (hasBuildVersion() != other.hasBuildVersion()) return false;
      if (hasBuildVersion()) {
        if (!getBuildVersion()
            .equals(other.getBuildVersion())) return false;
      }
      if (hasUnused() != other.hasUnused()) return false;
      if (hasUnused()) {
        if (getUnused()
            != other.getUnused()) return false;
      }
      if (hasBlockPoolID() != other.hasBlockPoolID()) return false;
      if (hasBlockPoolID()) {
        if (!getBlockPoolID()
            .equals(other.getBlockPoolID())) return false;
      }
      if (hasStorageInfo() != other.hasStorageInfo()) return false;
      if (hasStorageInfo()) {
        if (!getStorageInfo()
            .equals(other.getStorageInfo())) return false;
      }
      if (hasSoftwareVersion() != other.hasSoftwareVersion()) return false;
      if (hasSoftwareVersion()) {
        if (!getSoftwareVersion()
            .equals(other.getSoftwareVersion())) return false;
      }
      if (hasCapabilities() != other.hasCapabilities()) return false;
      if (hasCapabilities()) {
        if (getCapabilities()
            != other.getCapabilities()) return false;
      }
      if (hasState() != other.hasState()) return false;
      if (hasState()) {
        if (state_ != other.state_) return false;
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
      if (hasBuildVersion()) {
        hash = (37 * hash) + BUILDVERSION_FIELD_NUMBER;
        hash = (53 * hash) + getBuildVersion().hashCode();
      }
      if (hasUnused()) {
        hash = (37 * hash) + UNUSED_FIELD_NUMBER;
        hash = (53 * hash) + getUnused();
      }
      if (hasBlockPoolID()) {
        hash = (37 * hash) + BLOCKPOOLID_FIELD_NUMBER;
        hash = (53 * hash) + getBlockPoolID().hashCode();
      }
      if (hasStorageInfo()) {
        hash = (37 * hash) + STORAGEINFO_FIELD_NUMBER;
        hash = (53 * hash) + getStorageInfo().hashCode();
      }
      if (hasSoftwareVersion()) {
        hash = (37 * hash) + SOFTWAREVERSION_FIELD_NUMBER;
        hash = (53 * hash) + getSoftwareVersion().hashCode();
      }
      if (hasCapabilities()) {
        hash = (37 * hash) + CAPABILITIES_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getCapabilities());
      }
      if (hasState()) {
        hash = (37 * hash) + STATE_FIELD_NUMBER;
        hash = (53 * hash) + state_;
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto prototype) {
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
     * Namespace information that describes namespace on a namenode
     * </pre>
     *
     * Protobuf type {@code hadoop.hdfs.NamespaceInfoProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.NamespaceInfoProto)
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_NamespaceInfoProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_NamespaceInfoProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto.class, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto.newBuilder()
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
          getStorageInfoFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        buildVersion_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        unused_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        blockPoolID_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        if (storageInfoBuilder_ == null) {
          storageInfo_ = null;
        } else {
          storageInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        softwareVersion_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        capabilities_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000020);
        state_ = 0;
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_NamespaceInfoProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto build() {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto result = new org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.buildVersion_ = buildVersion_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.unused_ = unused_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.blockPoolID_ = blockPoolID_;
        if (((from_bitField0_ & 0x00000008) != 0)) {
          if (storageInfoBuilder_ == null) {
            result.storageInfo_ = storageInfo_;
          } else {
            result.storageInfo_ = storageInfoBuilder_.build();
          }
          to_bitField0_ |= 0x00000008;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          to_bitField0_ |= 0x00000010;
        }
        result.softwareVersion_ = softwareVersion_;
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.capabilities_ = capabilities_;
          to_bitField0_ |= 0x00000020;
        }
        if (((from_bitField0_ & 0x00000040) != 0)) {
          to_bitField0_ |= 0x00000040;
        }
        result.state_ = state_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto.getDefaultInstance()) return this;
        if (other.hasBuildVersion()) {
          bitField0_ |= 0x00000001;
          buildVersion_ = other.buildVersion_;
          onChanged();
        }
        if (other.hasUnused()) {
          setUnused(other.getUnused());
        }
        if (other.hasBlockPoolID()) {
          bitField0_ |= 0x00000004;
          blockPoolID_ = other.blockPoolID_;
          onChanged();
        }
        if (other.hasStorageInfo()) {
          mergeStorageInfo(other.getStorageInfo());
        }
        if (other.hasSoftwareVersion()) {
          bitField0_ |= 0x00000010;
          softwareVersion_ = other.softwareVersion_;
          onChanged();
        }
        if (other.hasCapabilities()) {
          setCapabilities(other.getCapabilities());
        }
        if (other.hasState()) {
          setState(other.getState());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasBuildVersion()) {
          return false;
        }
        if (!hasUnused()) {
          return false;
        }
        if (!hasBlockPoolID()) {
          return false;
        }
        if (!hasStorageInfo()) {
          return false;
        }
        if (!hasSoftwareVersion()) {
          return false;
        }
        if (!getStorageInfo().isInitialized()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object buildVersion_ = "";
      /**
       * <pre>
       * Software revision version (e.g. an svn or git revision)
       * </pre>
       *
       * <code>required string buildVersion = 1;</code>
       */
      public boolean hasBuildVersion() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Software revision version (e.g. an svn or git revision)
       * </pre>
       *
       * <code>required string buildVersion = 1;</code>
       */
      public java.lang.String getBuildVersion() {
        java.lang.Object ref = buildVersion_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            buildVersion_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Software revision version (e.g. an svn or git revision)
       * </pre>
       *
       * <code>required string buildVersion = 1;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getBuildVersionBytes() {
        java.lang.Object ref = buildVersion_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          buildVersion_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Software revision version (e.g. an svn or git revision)
       * </pre>
       *
       * <code>required string buildVersion = 1;</code>
       */
      public Builder setBuildVersion(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        buildVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Software revision version (e.g. an svn or git revision)
       * </pre>
       *
       * <code>required string buildVersion = 1;</code>
       */
      public Builder clearBuildVersion() {
        bitField0_ = (bitField0_ & ~0x00000001);
        buildVersion_ = getDefaultInstance().getBuildVersion();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Software revision version (e.g. an svn or git revision)
       * </pre>
       *
       * <code>required string buildVersion = 1;</code>
       */
      public Builder setBuildVersionBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        buildVersion_ = value;
        onChanged();
        return this;
      }

      private int unused_ ;
      /**
       * <pre>
       * Retained for backward compatibility
       * </pre>
       *
       * <code>required uint32 unused = 2;</code>
       */
      public boolean hasUnused() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * Retained for backward compatibility
       * </pre>
       *
       * <code>required uint32 unused = 2;</code>
       */
      public int getUnused() {
        return unused_;
      }
      /**
       * <pre>
       * Retained for backward compatibility
       * </pre>
       *
       * <code>required uint32 unused = 2;</code>
       */
      public Builder setUnused(int value) {
        bitField0_ |= 0x00000002;
        unused_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Retained for backward compatibility
       * </pre>
       *
       * <code>required uint32 unused = 2;</code>
       */
      public Builder clearUnused() {
        bitField0_ = (bitField0_ & ~0x00000002);
        unused_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object blockPoolID_ = "";
      /**
       * <pre>
       * block pool used by the namespace
       * </pre>
       *
       * <code>required string blockPoolID = 3;</code>
       */
      public boolean hasBlockPoolID() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * block pool used by the namespace
       * </pre>
       *
       * <code>required string blockPoolID = 3;</code>
       */
      public java.lang.String getBlockPoolID() {
        java.lang.Object ref = blockPoolID_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            blockPoolID_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * block pool used by the namespace
       * </pre>
       *
       * <code>required string blockPoolID = 3;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getBlockPoolIDBytes() {
        java.lang.Object ref = blockPoolID_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          blockPoolID_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * block pool used by the namespace
       * </pre>
       *
       * <code>required string blockPoolID = 3;</code>
       */
      public Builder setBlockPoolID(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        blockPoolID_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * block pool used by the namespace
       * </pre>
       *
       * <code>required string blockPoolID = 3;</code>
       */
      public Builder clearBlockPoolID() {
        bitField0_ = (bitField0_ & ~0x00000004);
        blockPoolID_ = getDefaultInstance().getBlockPoolID();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * block pool used by the namespace
       * </pre>
       *
       * <code>required string blockPoolID = 3;</code>
       */
      public Builder setBlockPoolIDBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        blockPoolID_ = value;
        onChanged();
        return this;
      }

      private org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto storageInfo_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProtoOrBuilder> storageInfoBuilder_;
      /**
       * <pre>
       * Node information
       * </pre>
       *
       * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 4;</code>
       */
      public boolean hasStorageInfo() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <pre>
       * Node information
       * </pre>
       *
       * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 4;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto getStorageInfo() {
        if (storageInfoBuilder_ == null) {
          return storageInfo_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.getDefaultInstance() : storageInfo_;
        } else {
          return storageInfoBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * Node information
       * </pre>
       *
       * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 4;</code>
       */
      public Builder setStorageInfo(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto value) {
        if (storageInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          storageInfo_ = value;
          onChanged();
        } else {
          storageInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <pre>
       * Node information
       * </pre>
       *
       * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 4;</code>
       */
      public Builder setStorageInfo(
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.Builder builderForValue) {
        if (storageInfoBuilder_ == null) {
          storageInfo_ = builderForValue.build();
          onChanged();
        } else {
          storageInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <pre>
       * Node information
       * </pre>
       *
       * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 4;</code>
       */
      public Builder mergeStorageInfo(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto value) {
        if (storageInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000008) != 0) &&
              storageInfo_ != null &&
              storageInfo_ != org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.getDefaultInstance()) {
            storageInfo_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.newBuilder(storageInfo_).mergeFrom(value).buildPartial();
          } else {
            storageInfo_ = value;
          }
          onChanged();
        } else {
          storageInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <pre>
       * Node information
       * </pre>
       *
       * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 4;</code>
       */
      public Builder clearStorageInfo() {
        if (storageInfoBuilder_ == null) {
          storageInfo_ = null;
          onChanged();
        } else {
          storageInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      /**
       * <pre>
       * Node information
       * </pre>
       *
       * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 4;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.Builder getStorageInfoBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getStorageInfoFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * Node information
       * </pre>
       *
       * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 4;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProtoOrBuilder getStorageInfoOrBuilder() {
        if (storageInfoBuilder_ != null) {
          return storageInfoBuilder_.getMessageOrBuilder();
        } else {
          return storageInfo_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.getDefaultInstance() : storageInfo_;
        }
      }
      /**
       * <pre>
       * Node information
       * </pre>
       *
       * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 4;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProtoOrBuilder> 
          getStorageInfoFieldBuilder() {
        if (storageInfoBuilder_ == null) {
          storageInfoBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProtoOrBuilder>(
                  getStorageInfo(),
                  getParentForChildren(),
                  isClean());
          storageInfo_ = null;
        }
        return storageInfoBuilder_;
      }

      private java.lang.Object softwareVersion_ = "";
      /**
       * <pre>
       * Software version number (e.g. 2.0.0)
       * </pre>
       *
       * <code>required string softwareVersion = 5;</code>
       */
      public boolean hasSoftwareVersion() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <pre>
       * Software version number (e.g. 2.0.0)
       * </pre>
       *
       * <code>required string softwareVersion = 5;</code>
       */
      public java.lang.String getSoftwareVersion() {
        java.lang.Object ref = softwareVersion_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            softwareVersion_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Software version number (e.g. 2.0.0)
       * </pre>
       *
       * <code>required string softwareVersion = 5;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getSoftwareVersionBytes() {
        java.lang.Object ref = softwareVersion_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          softwareVersion_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Software version number (e.g. 2.0.0)
       * </pre>
       *
       * <code>required string softwareVersion = 5;</code>
       */
      public Builder setSoftwareVersion(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        softwareVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Software version number (e.g. 2.0.0)
       * </pre>
       *
       * <code>required string softwareVersion = 5;</code>
       */
      public Builder clearSoftwareVersion() {
        bitField0_ = (bitField0_ & ~0x00000010);
        softwareVersion_ = getDefaultInstance().getSoftwareVersion();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Software version number (e.g. 2.0.0)
       * </pre>
       *
       * <code>required string softwareVersion = 5;</code>
       */
      public Builder setSoftwareVersionBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        softwareVersion_ = value;
        onChanged();
        return this;
      }

      private long capabilities_ ;
      /**
       * <pre>
       * feature flags
       * </pre>
       *
       * <code>optional uint64 capabilities = 6 [default = 0];</code>
       */
      public boolean hasCapabilities() {
        return ((bitField0_ & 0x00000020) != 0);
      }
      /**
       * <pre>
       * feature flags
       * </pre>
       *
       * <code>optional uint64 capabilities = 6 [default = 0];</code>
       */
      public long getCapabilities() {
        return capabilities_;
      }
      /**
       * <pre>
       * feature flags
       * </pre>
       *
       * <code>optional uint64 capabilities = 6 [default = 0];</code>
       */
      public Builder setCapabilities(long value) {
        bitField0_ |= 0x00000020;
        capabilities_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * feature flags
       * </pre>
       *
       * <code>optional uint64 capabilities = 6 [default = 0];</code>
       */
      public Builder clearCapabilities() {
        bitField0_ = (bitField0_ & ~0x00000020);
        capabilities_ = 0L;
        onChanged();
        return this;
      }

      private int state_ = 0;
      /**
       * <code>optional .hadoop.hdfs.NNHAStatusHeartbeatProto.State state = 7;</code>
       */
      public boolean hasState() {
        return ((bitField0_ & 0x00000040) != 0);
      }
      /**
       * <code>optional .hadoop.hdfs.NNHAStatusHeartbeatProto.State state = 7;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto.State getState() {
        @SuppressWarnings("deprecation")
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto.State result = org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto.State.valueOf(state_);
        return result == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto.State.ACTIVE : result;
      }
      /**
       * <code>optional .hadoop.hdfs.NNHAStatusHeartbeatProto.State state = 7;</code>
       */
      public Builder setState(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto.State value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000040;
        state_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.NNHAStatusHeartbeatProto.State state = 7;</code>
       */
      public Builder clearState() {
        bitField0_ = (bitField0_ & ~0x00000040);
        state_ = 0;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.NamespaceInfoProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.NamespaceInfoProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<NamespaceInfoProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<NamespaceInfoProto>() {
      @java.lang.Override
      public NamespaceInfoProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new NamespaceInfoProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<NamespaceInfoProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<NamespaceInfoProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RecoveringBlockProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.RecoveringBlockProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * New genstamp post recovery
     * </pre>
     *
     * <code>required uint64 newGenStamp = 1;</code>
     */
    boolean hasNewGenStamp();
    /**
     * <pre>
     * New genstamp post recovery
     * </pre>
     *
     * <code>required uint64 newGenStamp = 1;</code>
     */
    long getNewGenStamp();

    /**
     * <pre>
     * Block to be recovered
     * </pre>
     *
     * <code>required .hadoop.hdfs.LocatedBlockProto block = 2;</code>
     */
    boolean hasBlock();
    /**
     * <pre>
     * Block to be recovered
     * </pre>
     *
     * <code>required .hadoop.hdfs.LocatedBlockProto block = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.LocatedBlockProto getBlock();
    /**
     * <pre>
     * Block to be recovered
     * </pre>
     *
     * <code>required .hadoop.hdfs.LocatedBlockProto block = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.LocatedBlockProtoOrBuilder getBlockOrBuilder();

    /**
     * <pre>
     * New block for recovery (truncate)
     * </pre>
     *
     * <code>optional .hadoop.hdfs.BlockProto truncateBlock = 3;</code>
     */
    boolean hasTruncateBlock();
    /**
     * <pre>
     * New block for recovery (truncate)
     * </pre>
     *
     * <code>optional .hadoop.hdfs.BlockProto truncateBlock = 3;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto getTruncateBlock();
    /**
     * <pre>
     * New block for recovery (truncate)
     * </pre>
     *
     * <code>optional .hadoop.hdfs.BlockProto truncateBlock = 3;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder getTruncateBlockOrBuilder();

    /**
     * <code>optional .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 4;</code>
     */
    boolean hasEcPolicy();
    /**
     * <code>optional .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 4;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto getEcPolicy();
    /**
     * <code>optional .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 4;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProtoOrBuilder getEcPolicyOrBuilder();

    /**
     * <pre>
     * block indices of striped internal blocks for each storage in LocatedBlock
     * </pre>
     *
     * <code>optional bytes blockIndices = 5;</code>
     */
    boolean hasBlockIndices();
    /**
     * <pre>
     * block indices of striped internal blocks for each storage in LocatedBlock
     * </pre>
     *
     * <code>optional bytes blockIndices = 5;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString getBlockIndices();
  }
  /**
   * <pre>
   **
   * Block that needs to be recovered with at a given location
   * </pre>
   *
   * Protobuf type {@code hadoop.hdfs.RecoveringBlockProto}
   */
  public  static final class RecoveringBlockProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.RecoveringBlockProto)
      RecoveringBlockProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RecoveringBlockProto.newBuilder() to construct.
    private RecoveringBlockProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RecoveringBlockProto() {
      blockIndices_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RecoveringBlockProto(
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
              newGenStamp_ = input.readUInt64();
              break;
            }
            case 18: {
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.LocatedBlockProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) != 0)) {
                subBuilder = block_.toBuilder();
              }
              block_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.LocatedBlockProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(block_);
                block_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
            case 26: {
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) != 0)) {
                subBuilder = truncateBlock_.toBuilder();
              }
              truncateBlock_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(truncateBlock_);
                truncateBlock_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
            case 34: {
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000008) != 0)) {
                subBuilder = ecPolicy_.toBuilder();
              }
              ecPolicy_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(ecPolicy_);
                ecPolicy_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000008;
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              blockIndices_ = input.readBytes();
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
      return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_RecoveringBlockProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_RecoveringBlockProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto.class, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto.Builder.class);
    }

    private int bitField0_;
    public static final int NEWGENSTAMP_FIELD_NUMBER = 1;
    private long newGenStamp_;
    /**
     * <pre>
     * New genstamp post recovery
     * </pre>
     *
     * <code>required uint64 newGenStamp = 1;</code>
     */
    public boolean hasNewGenStamp() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * New genstamp post recovery
     * </pre>
     *
     * <code>required uint64 newGenStamp = 1;</code>
     */
    public long getNewGenStamp() {
      return newGenStamp_;
    }

    public static final int BLOCK_FIELD_NUMBER = 2;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.LocatedBlockProto block_;
    /**
     * <pre>
     * Block to be recovered
     * </pre>
     *
     * <code>required .hadoop.hdfs.LocatedBlockProto block = 2;</code>
     */
    public boolean hasBlock() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Block to be recovered
     * </pre>
     *
     * <code>required .hadoop.hdfs.LocatedBlockProto block = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.LocatedBlockProto getBlock() {
      return block_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.LocatedBlockProto.getDefaultInstance() : block_;
    }
    /**
     * <pre>
     * Block to be recovered
     * </pre>
     *
     * <code>required .hadoop.hdfs.LocatedBlockProto block = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.LocatedBlockProtoOrBuilder getBlockOrBuilder() {
      return block_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.LocatedBlockProto.getDefaultInstance() : block_;
    }

    public static final int TRUNCATEBLOCK_FIELD_NUMBER = 3;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto truncateBlock_;
    /**
     * <pre>
     * New block for recovery (truncate)
     * </pre>
     *
     * <code>optional .hadoop.hdfs.BlockProto truncateBlock = 3;</code>
     */
    public boolean hasTruncateBlock() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * New block for recovery (truncate)
     * </pre>
     *
     * <code>optional .hadoop.hdfs.BlockProto truncateBlock = 3;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto getTruncateBlock() {
      return truncateBlock_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance() : truncateBlock_;
    }
    /**
     * <pre>
     * New block for recovery (truncate)
     * </pre>
     *
     * <code>optional .hadoop.hdfs.BlockProto truncateBlock = 3;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder getTruncateBlockOrBuilder() {
      return truncateBlock_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance() : truncateBlock_;
    }

    public static final int ECPOLICY_FIELD_NUMBER = 4;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto ecPolicy_;
    /**
     * <code>optional .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 4;</code>
     */
    public boolean hasEcPolicy() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 4;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto getEcPolicy() {
      return ecPolicy_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.getDefaultInstance() : ecPolicy_;
    }
    /**
     * <code>optional .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 4;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProtoOrBuilder getEcPolicyOrBuilder() {
      return ecPolicy_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.getDefaultInstance() : ecPolicy_;
    }

    public static final int BLOCKINDICES_FIELD_NUMBER = 5;
    private org.apache.hadoop.thirdparty.protobuf.ByteString blockIndices_;
    /**
     * <pre>
     * block indices of striped internal blocks for each storage in LocatedBlock
     * </pre>
     *
     * <code>optional bytes blockIndices = 5;</code>
     */
    public boolean hasBlockIndices() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * block indices of striped internal blocks for each storage in LocatedBlock
     * </pre>
     *
     * <code>optional bytes blockIndices = 5;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString getBlockIndices() {
      return blockIndices_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasNewGenStamp()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasBlock()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getBlock().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasTruncateBlock()) {
        if (!getTruncateBlock().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
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
        output.writeUInt64(1, newGenStamp_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeMessage(2, getBlock());
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeMessage(3, getTruncateBlock());
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeMessage(4, getEcPolicy());
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        output.writeBytes(5, blockIndices_);
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
          .computeUInt64Size(1, newGenStamp_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(2, getBlock());
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(3, getTruncateBlock());
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(4, getEcPolicy());
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeBytesSize(5, blockIndices_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto other = (org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto) obj;

      if (hasNewGenStamp() != other.hasNewGenStamp()) return false;
      if (hasNewGenStamp()) {
        if (getNewGenStamp()
            != other.getNewGenStamp()) return false;
      }
      if (hasBlock() != other.hasBlock()) return false;
      if (hasBlock()) {
        if (!getBlock()
            .equals(other.getBlock())) return false;
      }
      if (hasTruncateBlock() != other.hasTruncateBlock()) return false;
      if (hasTruncateBlock()) {
        if (!getTruncateBlock()
            .equals(other.getTruncateBlock())) return false;
      }
      if (hasEcPolicy() != other.hasEcPolicy()) return false;
      if (hasEcPolicy()) {
        if (!getEcPolicy()
            .equals(other.getEcPolicy())) return false;
      }
      if (hasBlockIndices() != other.hasBlockIndices()) return false;
      if (hasBlockIndices()) {
        if (!getBlockIndices()
            .equals(other.getBlockIndices())) return false;
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
      if (hasNewGenStamp()) {
        hash = (37 * hash) + NEWGENSTAMP_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getNewGenStamp());
      }
      if (hasBlock()) {
        hash = (37 * hash) + BLOCK_FIELD_NUMBER;
        hash = (53 * hash) + getBlock().hashCode();
      }
      if (hasTruncateBlock()) {
        hash = (37 * hash) + TRUNCATEBLOCK_FIELD_NUMBER;
        hash = (53 * hash) + getTruncateBlock().hashCode();
      }
      if (hasEcPolicy()) {
        hash = (37 * hash) + ECPOLICY_FIELD_NUMBER;
        hash = (53 * hash) + getEcPolicy().hashCode();
      }
      if (hasBlockIndices()) {
        hash = (37 * hash) + BLOCKINDICES_FIELD_NUMBER;
        hash = (53 * hash) + getBlockIndices().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto prototype) {
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
     * Block that needs to be recovered with at a given location
     * </pre>
     *
     * Protobuf type {@code hadoop.hdfs.RecoveringBlockProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.RecoveringBlockProto)
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_RecoveringBlockProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_RecoveringBlockProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto.class, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto.newBuilder()
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
          getTruncateBlockFieldBuilder();
          getEcPolicyFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        newGenStamp_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (blockBuilder_ == null) {
          block_ = null;
        } else {
          blockBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (truncateBlockBuilder_ == null) {
          truncateBlock_ = null;
        } else {
          truncateBlockBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        if (ecPolicyBuilder_ == null) {
          ecPolicy_ = null;
        } else {
          ecPolicyBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        blockIndices_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_RecoveringBlockProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto build() {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto result = new org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.newGenStamp_ = newGenStamp_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          if (blockBuilder_ == null) {
            result.block_ = block_;
          } else {
            result.block_ = blockBuilder_.build();
          }
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          if (truncateBlockBuilder_ == null) {
            result.truncateBlock_ = truncateBlock_;
          } else {
            result.truncateBlock_ = truncateBlockBuilder_.build();
          }
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          if (ecPolicyBuilder_ == null) {
            result.ecPolicy_ = ecPolicy_;
          } else {
            result.ecPolicy_ = ecPolicyBuilder_.build();
          }
          to_bitField0_ |= 0x00000008;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          to_bitField0_ |= 0x00000010;
        }
        result.blockIndices_ = blockIndices_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto.getDefaultInstance()) return this;
        if (other.hasNewGenStamp()) {
          setNewGenStamp(other.getNewGenStamp());
        }
        if (other.hasBlock()) {
          mergeBlock(other.getBlock());
        }
        if (other.hasTruncateBlock()) {
          mergeTruncateBlock(other.getTruncateBlock());
        }
        if (other.hasEcPolicy()) {
          mergeEcPolicy(other.getEcPolicy());
        }
        if (other.hasBlockIndices()) {
          setBlockIndices(other.getBlockIndices());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasNewGenStamp()) {
          return false;
        }
        if (!hasBlock()) {
          return false;
        }
        if (!getBlock().isInitialized()) {
          return false;
        }
        if (hasTruncateBlock()) {
          if (!getTruncateBlock().isInitialized()) {
            return false;
          }
        }
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
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long newGenStamp_ ;
      /**
       * <pre>
       * New genstamp post recovery
       * </pre>
       *
       * <code>required uint64 newGenStamp = 1;</code>
       */
      public boolean hasNewGenStamp() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * New genstamp post recovery
       * </pre>
       *
       * <code>required uint64 newGenStamp = 1;</code>
       */
      public long getNewGenStamp() {
        return newGenStamp_;
      }
      /**
       * <pre>
       * New genstamp post recovery
       * </pre>
       *
       * <code>required uint64 newGenStamp = 1;</code>
       */
      public Builder setNewGenStamp(long value) {
        bitField0_ |= 0x00000001;
        newGenStamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * New genstamp post recovery
       * </pre>
       *
       * <code>required uint64 newGenStamp = 1;</code>
       */
      public Builder clearNewGenStamp() {
        bitField0_ = (bitField0_ & ~0x00000001);
        newGenStamp_ = 0L;
        onChanged();
        return this;
      }

      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.LocatedBlockProto block_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.LocatedBlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.LocatedBlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.LocatedBlockProtoOrBuilder> blockBuilder_;
      /**
       * <pre>
       * Block to be recovered
       * </pre>
       *
       * <code>required .hadoop.hdfs.LocatedBlockProto block = 2;</code>
       */
      public boolean hasBlock() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * Block to be recovered
       * </pre>
       *
       * <code>required .hadoop.hdfs.LocatedBlockProto block = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.LocatedBlockProto getBlock() {
        if (blockBuilder_ == null) {
          return block_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.LocatedBlockProto.getDefaultInstance() : block_;
        } else {
          return blockBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * Block to be recovered
       * </pre>
       *
       * <code>required .hadoop.hdfs.LocatedBlockProto block = 2;</code>
       */
      public Builder setBlock(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.LocatedBlockProto value) {
        if (blockBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          block_ = value;
          onChanged();
        } else {
          blockBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <pre>
       * Block to be recovered
       * </pre>
       *
       * <code>required .hadoop.hdfs.LocatedBlockProto block = 2;</code>
       */
      public Builder setBlock(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.LocatedBlockProto.Builder builderForValue) {
        if (blockBuilder_ == null) {
          block_ = builderForValue.build();
          onChanged();
        } else {
          blockBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <pre>
       * Block to be recovered
       * </pre>
       *
       * <code>required .hadoop.hdfs.LocatedBlockProto block = 2;</code>
       */
      public Builder mergeBlock(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.LocatedBlockProto value) {
        if (blockBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
              block_ != null &&
              block_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.LocatedBlockProto.getDefaultInstance()) {
            block_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.LocatedBlockProto.newBuilder(block_).mergeFrom(value).buildPartial();
          } else {
            block_ = value;
          }
          onChanged();
        } else {
          blockBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <pre>
       * Block to be recovered
       * </pre>
       *
       * <code>required .hadoop.hdfs.LocatedBlockProto block = 2;</code>
       */
      public Builder clearBlock() {
        if (blockBuilder_ == null) {
          block_ = null;
          onChanged();
        } else {
          blockBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <pre>
       * Block to be recovered
       * </pre>
       *
       * <code>required .hadoop.hdfs.LocatedBlockProto block = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.LocatedBlockProto.Builder getBlockBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getBlockFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * Block to be recovered
       * </pre>
       *
       * <code>required .hadoop.hdfs.LocatedBlockProto block = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.LocatedBlockProtoOrBuilder getBlockOrBuilder() {
        if (blockBuilder_ != null) {
          return blockBuilder_.getMessageOrBuilder();
        } else {
          return block_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.LocatedBlockProto.getDefaultInstance() : block_;
        }
      }
      /**
       * <pre>
       * Block to be recovered
       * </pre>
       *
       * <code>required .hadoop.hdfs.LocatedBlockProto block = 2;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.LocatedBlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.LocatedBlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.LocatedBlockProtoOrBuilder> 
          getBlockFieldBuilder() {
        if (blockBuilder_ == null) {
          blockBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.LocatedBlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.LocatedBlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.LocatedBlockProtoOrBuilder>(
                  getBlock(),
                  getParentForChildren(),
                  isClean());
          block_ = null;
        }
        return blockBuilder_;
      }

      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto truncateBlock_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder> truncateBlockBuilder_;
      /**
       * <pre>
       * New block for recovery (truncate)
       * </pre>
       *
       * <code>optional .hadoop.hdfs.BlockProto truncateBlock = 3;</code>
       */
      public boolean hasTruncateBlock() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * New block for recovery (truncate)
       * </pre>
       *
       * <code>optional .hadoop.hdfs.BlockProto truncateBlock = 3;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto getTruncateBlock() {
        if (truncateBlockBuilder_ == null) {
          return truncateBlock_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance() : truncateBlock_;
        } else {
          return truncateBlockBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * New block for recovery (truncate)
       * </pre>
       *
       * <code>optional .hadoop.hdfs.BlockProto truncateBlock = 3;</code>
       */
      public Builder setTruncateBlock(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto value) {
        if (truncateBlockBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          truncateBlock_ = value;
          onChanged();
        } else {
          truncateBlockBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <pre>
       * New block for recovery (truncate)
       * </pre>
       *
       * <code>optional .hadoop.hdfs.BlockProto truncateBlock = 3;</code>
       */
      public Builder setTruncateBlock(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder builderForValue) {
        if (truncateBlockBuilder_ == null) {
          truncateBlock_ = builderForValue.build();
          onChanged();
        } else {
          truncateBlockBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <pre>
       * New block for recovery (truncate)
       * </pre>
       *
       * <code>optional .hadoop.hdfs.BlockProto truncateBlock = 3;</code>
       */
      public Builder mergeTruncateBlock(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto value) {
        if (truncateBlockBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0) &&
              truncateBlock_ != null &&
              truncateBlock_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance()) {
            truncateBlock_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.newBuilder(truncateBlock_).mergeFrom(value).buildPartial();
          } else {
            truncateBlock_ = value;
          }
          onChanged();
        } else {
          truncateBlockBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <pre>
       * New block for recovery (truncate)
       * </pre>
       *
       * <code>optional .hadoop.hdfs.BlockProto truncateBlock = 3;</code>
       */
      public Builder clearTruncateBlock() {
        if (truncateBlockBuilder_ == null) {
          truncateBlock_ = null;
          onChanged();
        } else {
          truncateBlockBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <pre>
       * New block for recovery (truncate)
       * </pre>
       *
       * <code>optional .hadoop.hdfs.BlockProto truncateBlock = 3;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder getTruncateBlockBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getTruncateBlockFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * New block for recovery (truncate)
       * </pre>
       *
       * <code>optional .hadoop.hdfs.BlockProto truncateBlock = 3;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder getTruncateBlockOrBuilder() {
        if (truncateBlockBuilder_ != null) {
          return truncateBlockBuilder_.getMessageOrBuilder();
        } else {
          return truncateBlock_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance() : truncateBlock_;
        }
      }
      /**
       * <pre>
       * New block for recovery (truncate)
       * </pre>
       *
       * <code>optional .hadoop.hdfs.BlockProto truncateBlock = 3;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder> 
          getTruncateBlockFieldBuilder() {
        if (truncateBlockBuilder_ == null) {
          truncateBlockBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder>(
                  getTruncateBlock(),
                  getParentForChildren(),
                  isClean());
          truncateBlock_ = null;
        }
        return truncateBlockBuilder_;
      }

      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto ecPolicy_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProtoOrBuilder> ecPolicyBuilder_;
      /**
       * <code>optional .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 4;</code>
       */
      public boolean hasEcPolicy() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>optional .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 4;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto getEcPolicy() {
        if (ecPolicyBuilder_ == null) {
          return ecPolicy_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.getDefaultInstance() : ecPolicy_;
        } else {
          return ecPolicyBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 4;</code>
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
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 4;</code>
       */
      public Builder setEcPolicy(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder builderForValue) {
        if (ecPolicyBuilder_ == null) {
          ecPolicy_ = builderForValue.build();
          onChanged();
        } else {
          ecPolicyBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 4;</code>
       */
      public Builder mergeEcPolicy(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto value) {
        if (ecPolicyBuilder_ == null) {
          if (((bitField0_ & 0x00000008) != 0) &&
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
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 4;</code>
       */
      public Builder clearEcPolicy() {
        if (ecPolicyBuilder_ == null) {
          ecPolicy_ = null;
          onChanged();
        } else {
          ecPolicyBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 4;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ErasureCodingPolicyProto.Builder getEcPolicyBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getEcPolicyFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 4;</code>
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
       * <code>optional .hadoop.hdfs.ErasureCodingPolicyProto ecPolicy = 4;</code>
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

      private org.apache.hadoop.thirdparty.protobuf.ByteString blockIndices_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       * block indices of striped internal blocks for each storage in LocatedBlock
       * </pre>
       *
       * <code>optional bytes blockIndices = 5;</code>
       */
      public boolean hasBlockIndices() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <pre>
       * block indices of striped internal blocks for each storage in LocatedBlock
       * </pre>
       *
       * <code>optional bytes blockIndices = 5;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString getBlockIndices() {
        return blockIndices_;
      }
      /**
       * <pre>
       * block indices of striped internal blocks for each storage in LocatedBlock
       * </pre>
       *
       * <code>optional bytes blockIndices = 5;</code>
       */
      public Builder setBlockIndices(org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        blockIndices_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * block indices of striped internal blocks for each storage in LocatedBlock
       * </pre>
       *
       * <code>optional bytes blockIndices = 5;</code>
       */
      public Builder clearBlockIndices() {
        bitField0_ = (bitField0_ & ~0x00000010);
        blockIndices_ = getDefaultInstance().getBlockIndices();
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.RecoveringBlockProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.RecoveringBlockProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<RecoveringBlockProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<RecoveringBlockProto>() {
      @java.lang.Override
      public RecoveringBlockProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new RecoveringBlockProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<RecoveringBlockProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<RecoveringBlockProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.RecoveringBlockProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CheckpointSignatureProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.CheckpointSignatureProto)
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

    /**
     * <code>required uint64 mostRecentCheckpointTxId = 2;</code>
     */
    boolean hasMostRecentCheckpointTxId();
    /**
     * <code>required uint64 mostRecentCheckpointTxId = 2;</code>
     */
    long getMostRecentCheckpointTxId();

    /**
     * <code>required uint64 curSegmentTxId = 3;</code>
     */
    boolean hasCurSegmentTxId();
    /**
     * <code>required uint64 curSegmentTxId = 3;</code>
     */
    long getCurSegmentTxId();

    /**
     * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 4;</code>
     */
    boolean hasStorageInfo();
    /**
     * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 4;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto getStorageInfo();
    /**
     * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 4;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProtoOrBuilder getStorageInfoOrBuilder();
  }
  /**
   * <pre>
   **
   * Unique signature to identify checkpoint transactions.
   * </pre>
   *
   * Protobuf type {@code hadoop.hdfs.CheckpointSignatureProto}
   */
  public  static final class CheckpointSignatureProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.CheckpointSignatureProto)
      CheckpointSignatureProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CheckpointSignatureProto.newBuilder() to construct.
    private CheckpointSignatureProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CheckpointSignatureProto() {
      blockPoolId_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CheckpointSignatureProto(
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
            case 16: {
              bitField0_ |= 0x00000002;
              mostRecentCheckpointTxId_ = input.readUInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              curSegmentTxId_ = input.readUInt64();
              break;
            }
            case 34: {
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000008) != 0)) {
                subBuilder = storageInfo_.toBuilder();
              }
              storageInfo_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(storageInfo_);
                storageInfo_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000008;
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
      return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_CheckpointSignatureProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_CheckpointSignatureProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto.class, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto.Builder.class);
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

    public static final int MOSTRECENTCHECKPOINTTXID_FIELD_NUMBER = 2;
    private long mostRecentCheckpointTxId_;
    /**
     * <code>required uint64 mostRecentCheckpointTxId = 2;</code>
     */
    public boolean hasMostRecentCheckpointTxId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required uint64 mostRecentCheckpointTxId = 2;</code>
     */
    public long getMostRecentCheckpointTxId() {
      return mostRecentCheckpointTxId_;
    }

    public static final int CURSEGMENTTXID_FIELD_NUMBER = 3;
    private long curSegmentTxId_;
    /**
     * <code>required uint64 curSegmentTxId = 3;</code>
     */
    public boolean hasCurSegmentTxId() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required uint64 curSegmentTxId = 3;</code>
     */
    public long getCurSegmentTxId() {
      return curSegmentTxId_;
    }

    public static final int STORAGEINFO_FIELD_NUMBER = 4;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto storageInfo_;
    /**
     * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 4;</code>
     */
    public boolean hasStorageInfo() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 4;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto getStorageInfo() {
      return storageInfo_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.getDefaultInstance() : storageInfo_;
    }
    /**
     * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 4;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProtoOrBuilder getStorageInfoOrBuilder() {
      return storageInfo_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.getDefaultInstance() : storageInfo_;
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
      if (!hasMostRecentCheckpointTxId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCurSegmentTxId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasStorageInfo()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getStorageInfo().isInitialized()) {
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
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt64(2, mostRecentCheckpointTxId_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeUInt64(3, curSegmentTxId_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeMessage(4, getStorageInfo());
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
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeUInt64Size(2, mostRecentCheckpointTxId_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeUInt64Size(3, curSegmentTxId_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(4, getStorageInfo());
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto other = (org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto) obj;

      if (hasBlockPoolId() != other.hasBlockPoolId()) return false;
      if (hasBlockPoolId()) {
        if (!getBlockPoolId()
            .equals(other.getBlockPoolId())) return false;
      }
      if (hasMostRecentCheckpointTxId() != other.hasMostRecentCheckpointTxId()) return false;
      if (hasMostRecentCheckpointTxId()) {
        if (getMostRecentCheckpointTxId()
            != other.getMostRecentCheckpointTxId()) return false;
      }
      if (hasCurSegmentTxId() != other.hasCurSegmentTxId()) return false;
      if (hasCurSegmentTxId()) {
        if (getCurSegmentTxId()
            != other.getCurSegmentTxId()) return false;
      }
      if (hasStorageInfo() != other.hasStorageInfo()) return false;
      if (hasStorageInfo()) {
        if (!getStorageInfo()
            .equals(other.getStorageInfo())) return false;
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
      if (hasMostRecentCheckpointTxId()) {
        hash = (37 * hash) + MOSTRECENTCHECKPOINTTXID_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getMostRecentCheckpointTxId());
      }
      if (hasCurSegmentTxId()) {
        hash = (37 * hash) + CURSEGMENTTXID_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getCurSegmentTxId());
      }
      if (hasStorageInfo()) {
        hash = (37 * hash) + STORAGEINFO_FIELD_NUMBER;
        hash = (53 * hash) + getStorageInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto prototype) {
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
     * Unique signature to identify checkpoint transactions.
     * </pre>
     *
     * Protobuf type {@code hadoop.hdfs.CheckpointSignatureProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.CheckpointSignatureProto)
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_CheckpointSignatureProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_CheckpointSignatureProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto.class, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto.newBuilder()
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
          getStorageInfoFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        blockPoolId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        mostRecentCheckpointTxId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        curSegmentTxId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        if (storageInfoBuilder_ == null) {
          storageInfo_ = null;
        } else {
          storageInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_CheckpointSignatureProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto build() {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto result = new org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.blockPoolId_ = blockPoolId_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.mostRecentCheckpointTxId_ = mostRecentCheckpointTxId_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.curSegmentTxId_ = curSegmentTxId_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          if (storageInfoBuilder_ == null) {
            result.storageInfo_ = storageInfo_;
          } else {
            result.storageInfo_ = storageInfoBuilder_.build();
          }
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto.getDefaultInstance()) return this;
        if (other.hasBlockPoolId()) {
          bitField0_ |= 0x00000001;
          blockPoolId_ = other.blockPoolId_;
          onChanged();
        }
        if (other.hasMostRecentCheckpointTxId()) {
          setMostRecentCheckpointTxId(other.getMostRecentCheckpointTxId());
        }
        if (other.hasCurSegmentTxId()) {
          setCurSegmentTxId(other.getCurSegmentTxId());
        }
        if (other.hasStorageInfo()) {
          mergeStorageInfo(other.getStorageInfo());
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
        if (!hasMostRecentCheckpointTxId()) {
          return false;
        }
        if (!hasCurSegmentTxId()) {
          return false;
        }
        if (!hasStorageInfo()) {
          return false;
        }
        if (!getStorageInfo().isInitialized()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto) e.getUnfinishedMessage();
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

      private long mostRecentCheckpointTxId_ ;
      /**
       * <code>required uint64 mostRecentCheckpointTxId = 2;</code>
       */
      public boolean hasMostRecentCheckpointTxId() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required uint64 mostRecentCheckpointTxId = 2;</code>
       */
      public long getMostRecentCheckpointTxId() {
        return mostRecentCheckpointTxId_;
      }
      /**
       * <code>required uint64 mostRecentCheckpointTxId = 2;</code>
       */
      public Builder setMostRecentCheckpointTxId(long value) {
        bitField0_ |= 0x00000002;
        mostRecentCheckpointTxId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 mostRecentCheckpointTxId = 2;</code>
       */
      public Builder clearMostRecentCheckpointTxId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        mostRecentCheckpointTxId_ = 0L;
        onChanged();
        return this;
      }

      private long curSegmentTxId_ ;
      /**
       * <code>required uint64 curSegmentTxId = 3;</code>
       */
      public boolean hasCurSegmentTxId() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>required uint64 curSegmentTxId = 3;</code>
       */
      public long getCurSegmentTxId() {
        return curSegmentTxId_;
      }
      /**
       * <code>required uint64 curSegmentTxId = 3;</code>
       */
      public Builder setCurSegmentTxId(long value) {
        bitField0_ |= 0x00000004;
        curSegmentTxId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 curSegmentTxId = 3;</code>
       */
      public Builder clearCurSegmentTxId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        curSegmentTxId_ = 0L;
        onChanged();
        return this;
      }

      private org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto storageInfo_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProtoOrBuilder> storageInfoBuilder_;
      /**
       * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 4;</code>
       */
      public boolean hasStorageInfo() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 4;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto getStorageInfo() {
        if (storageInfoBuilder_ == null) {
          return storageInfo_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.getDefaultInstance() : storageInfo_;
        } else {
          return storageInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 4;</code>
       */
      public Builder setStorageInfo(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto value) {
        if (storageInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          storageInfo_ = value;
          onChanged();
        } else {
          storageInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 4;</code>
       */
      public Builder setStorageInfo(
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.Builder builderForValue) {
        if (storageInfoBuilder_ == null) {
          storageInfo_ = builderForValue.build();
          onChanged();
        } else {
          storageInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 4;</code>
       */
      public Builder mergeStorageInfo(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto value) {
        if (storageInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000008) != 0) &&
              storageInfo_ != null &&
              storageInfo_ != org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.getDefaultInstance()) {
            storageInfo_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.newBuilder(storageInfo_).mergeFrom(value).buildPartial();
          } else {
            storageInfo_ = value;
          }
          onChanged();
        } else {
          storageInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 4;</code>
       */
      public Builder clearStorageInfo() {
        if (storageInfoBuilder_ == null) {
          storageInfo_ = null;
          onChanged();
        } else {
          storageInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 4;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.Builder getStorageInfoBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getStorageInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 4;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProtoOrBuilder getStorageInfoOrBuilder() {
        if (storageInfoBuilder_ != null) {
          return storageInfoBuilder_.getMessageOrBuilder();
        } else {
          return storageInfo_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.getDefaultInstance() : storageInfo_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 4;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProtoOrBuilder> 
          getStorageInfoFieldBuilder() {
        if (storageInfoBuilder_ == null) {
          storageInfoBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProtoOrBuilder>(
                  getStorageInfo(),
                  getParentForChildren(),
                  isClean());
          storageInfo_ = null;
        }
        return storageInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.CheckpointSignatureProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.CheckpointSignatureProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<CheckpointSignatureProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<CheckpointSignatureProto>() {
      @java.lang.Override
      public CheckpointSignatureProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new CheckpointSignatureProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<CheckpointSignatureProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<CheckpointSignatureProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CheckpointCommandProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.CheckpointCommandProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Unique signature to identify checkpoint transation
     * </pre>
     *
     * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 1;</code>
     */
    boolean hasSignature();
    /**
     * <pre>
     * Unique signature to identify checkpoint transation
     * </pre>
     *
     * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto getSignature();
    /**
     * <pre>
     * Unique signature to identify checkpoint transation
     * </pre>
     *
     * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProtoOrBuilder getSignatureOrBuilder();

    /**
     * <pre>
     * If true, return transfer image to primary upon the completion of checkpoint
     * </pre>
     *
     * <code>required bool needToReturnImage = 2;</code>
     */
    boolean hasNeedToReturnImage();
    /**
     * <pre>
     * If true, return transfer image to primary upon the completion of checkpoint
     * </pre>
     *
     * <code>required bool needToReturnImage = 2;</code>
     */
    boolean getNeedToReturnImage();
  }
  /**
   * <pre>
   **
   * Command returned from primary to checkpointing namenode.
   * This command has checkpoint signature that identifies
   * checkpoint transaction and is needed for further
   * communication related to checkpointing.
   * </pre>
   *
   * Protobuf type {@code hadoop.hdfs.CheckpointCommandProto}
   */
  public  static final class CheckpointCommandProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.CheckpointCommandProto)
      CheckpointCommandProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CheckpointCommandProto.newBuilder() to construct.
    private CheckpointCommandProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CheckpointCommandProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CheckpointCommandProto(
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
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = signature_.toBuilder();
              }
              signature_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(signature_);
                signature_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              needToReturnImage_ = input.readBool();
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
      return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_CheckpointCommandProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_CheckpointCommandProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto.class, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto.Builder.class);
    }

    private int bitField0_;
    public static final int SIGNATURE_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto signature_;
    /**
     * <pre>
     * Unique signature to identify checkpoint transation
     * </pre>
     *
     * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 1;</code>
     */
    public boolean hasSignature() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Unique signature to identify checkpoint transation
     * </pre>
     *
     * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto getSignature() {
      return signature_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto.getDefaultInstance() : signature_;
    }
    /**
     * <pre>
     * Unique signature to identify checkpoint transation
     * </pre>
     *
     * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProtoOrBuilder getSignatureOrBuilder() {
      return signature_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto.getDefaultInstance() : signature_;
    }

    public static final int NEEDTORETURNIMAGE_FIELD_NUMBER = 2;
    private boolean needToReturnImage_;
    /**
     * <pre>
     * If true, return transfer image to primary upon the completion of checkpoint
     * </pre>
     *
     * <code>required bool needToReturnImage = 2;</code>
     */
    public boolean hasNeedToReturnImage() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * If true, return transfer image to primary upon the completion of checkpoint
     * </pre>
     *
     * <code>required bool needToReturnImage = 2;</code>
     */
    public boolean getNeedToReturnImage() {
      return needToReturnImage_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasSignature()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasNeedToReturnImage()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getSignature().isInitialized()) {
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
        output.writeMessage(1, getSignature());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeBool(2, needToReturnImage_);
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
          .computeMessageSize(1, getSignature());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeBoolSize(2, needToReturnImage_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto other = (org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto) obj;

      if (hasSignature() != other.hasSignature()) return false;
      if (hasSignature()) {
        if (!getSignature()
            .equals(other.getSignature())) return false;
      }
      if (hasNeedToReturnImage() != other.hasNeedToReturnImage()) return false;
      if (hasNeedToReturnImage()) {
        if (getNeedToReturnImage()
            != other.getNeedToReturnImage()) return false;
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
      if (hasSignature()) {
        hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
        hash = (53 * hash) + getSignature().hashCode();
      }
      if (hasNeedToReturnImage()) {
        hash = (37 * hash) + NEEDTORETURNIMAGE_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashBoolean(
            getNeedToReturnImage());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto prototype) {
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
     * Command returned from primary to checkpointing namenode.
     * This command has checkpoint signature that identifies
     * checkpoint transaction and is needed for further
     * communication related to checkpointing.
     * </pre>
     *
     * Protobuf type {@code hadoop.hdfs.CheckpointCommandProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.CheckpointCommandProto)
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_CheckpointCommandProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_CheckpointCommandProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto.class, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto.newBuilder()
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
          getSignatureFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (signatureBuilder_ == null) {
          signature_ = null;
        } else {
          signatureBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        needToReturnImage_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_CheckpointCommandProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto build() {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto result = new org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (signatureBuilder_ == null) {
            result.signature_ = signature_;
          } else {
            result.signature_ = signatureBuilder_.build();
          }
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.needToReturnImage_ = needToReturnImage_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto.getDefaultInstance()) return this;
        if (other.hasSignature()) {
          mergeSignature(other.getSignature());
        }
        if (other.hasNeedToReturnImage()) {
          setNeedToReturnImage(other.getNeedToReturnImage());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasSignature()) {
          return false;
        }
        if (!hasNeedToReturnImage()) {
          return false;
        }
        if (!getSignature().isInitialized()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto signature_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProtoOrBuilder> signatureBuilder_;
      /**
       * <pre>
       * Unique signature to identify checkpoint transation
       * </pre>
       *
       * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 1;</code>
       */
      public boolean hasSignature() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Unique signature to identify checkpoint transation
       * </pre>
       *
       * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto getSignature() {
        if (signatureBuilder_ == null) {
          return signature_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto.getDefaultInstance() : signature_;
        } else {
          return signatureBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * Unique signature to identify checkpoint transation
       * </pre>
       *
       * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 1;</code>
       */
      public Builder setSignature(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto value) {
        if (signatureBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          signature_ = value;
          onChanged();
        } else {
          signatureBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <pre>
       * Unique signature to identify checkpoint transation
       * </pre>
       *
       * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 1;</code>
       */
      public Builder setSignature(
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto.Builder builderForValue) {
        if (signatureBuilder_ == null) {
          signature_ = builderForValue.build();
          onChanged();
        } else {
          signatureBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <pre>
       * Unique signature to identify checkpoint transation
       * </pre>
       *
       * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 1;</code>
       */
      public Builder mergeSignature(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto value) {
        if (signatureBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              signature_ != null &&
              signature_ != org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto.getDefaultInstance()) {
            signature_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto.newBuilder(signature_).mergeFrom(value).buildPartial();
          } else {
            signature_ = value;
          }
          onChanged();
        } else {
          signatureBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <pre>
       * Unique signature to identify checkpoint transation
       * </pre>
       *
       * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 1;</code>
       */
      public Builder clearSignature() {
        if (signatureBuilder_ == null) {
          signature_ = null;
          onChanged();
        } else {
          signatureBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <pre>
       * Unique signature to identify checkpoint transation
       * </pre>
       *
       * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto.Builder getSignatureBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getSignatureFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * Unique signature to identify checkpoint transation
       * </pre>
       *
       * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProtoOrBuilder getSignatureOrBuilder() {
        if (signatureBuilder_ != null) {
          return signatureBuilder_.getMessageOrBuilder();
        } else {
          return signature_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto.getDefaultInstance() : signature_;
        }
      }
      /**
       * <pre>
       * Unique signature to identify checkpoint transation
       * </pre>
       *
       * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 1;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProtoOrBuilder> 
          getSignatureFieldBuilder() {
        if (signatureBuilder_ == null) {
          signatureBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointSignatureProtoOrBuilder>(
                  getSignature(),
                  getParentForChildren(),
                  isClean());
          signature_ = null;
        }
        return signatureBuilder_;
      }

      private boolean needToReturnImage_ ;
      /**
       * <pre>
       * If true, return transfer image to primary upon the completion of checkpoint
       * </pre>
       *
       * <code>required bool needToReturnImage = 2;</code>
       */
      public boolean hasNeedToReturnImage() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * If true, return transfer image to primary upon the completion of checkpoint
       * </pre>
       *
       * <code>required bool needToReturnImage = 2;</code>
       */
      public boolean getNeedToReturnImage() {
        return needToReturnImage_;
      }
      /**
       * <pre>
       * If true, return transfer image to primary upon the completion of checkpoint
       * </pre>
       *
       * <code>required bool needToReturnImage = 2;</code>
       */
      public Builder setNeedToReturnImage(boolean value) {
        bitField0_ |= 0x00000002;
        needToReturnImage_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * If true, return transfer image to primary upon the completion of checkpoint
       * </pre>
       *
       * <code>required bool needToReturnImage = 2;</code>
       */
      public Builder clearNeedToReturnImage() {
        bitField0_ = (bitField0_ & ~0x00000002);
        needToReturnImage_ = false;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.CheckpointCommandProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.CheckpointCommandProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<CheckpointCommandProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<CheckpointCommandProto>() {
      @java.lang.Override
      public CheckpointCommandProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new CheckpointCommandProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<CheckpointCommandProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<CheckpointCommandProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface NamenodeCommandProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.NamenodeCommandProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required uint32 action = 1;</code>
     */
    boolean hasAction();
    /**
     * <code>required uint32 action = 1;</code>
     */
    int getAction();

    /**
     * <code>required .hadoop.hdfs.NamenodeCommandProto.Type type = 2;</code>
     */
    boolean hasType();
    /**
     * <code>required .hadoop.hdfs.NamenodeCommandProto.Type type = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto.Type getType();

    /**
     * <code>optional .hadoop.hdfs.CheckpointCommandProto checkpointCmd = 3;</code>
     */
    boolean hasCheckpointCmd();
    /**
     * <code>optional .hadoop.hdfs.CheckpointCommandProto checkpointCmd = 3;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto getCheckpointCmd();
    /**
     * <code>optional .hadoop.hdfs.CheckpointCommandProto checkpointCmd = 3;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProtoOrBuilder getCheckpointCmdOrBuilder();
  }
  /**
   * <pre>
   **
   * Command sent from one namenode to another namenode.
   * </pre>
   *
   * Protobuf type {@code hadoop.hdfs.NamenodeCommandProto}
   */
  public  static final class NamenodeCommandProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.NamenodeCommandProto)
      NamenodeCommandProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NamenodeCommandProto.newBuilder() to construct.
    private NamenodeCommandProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NamenodeCommandProto() {
      type_ = 0;
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private NamenodeCommandProto(
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
              action_ = input.readUInt32();
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto.Type value = org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto.Type.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                type_ = rawValue;
              }
              break;
            }
            case 26: {
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) != 0)) {
                subBuilder = checkpointCmd_.toBuilder();
              }
              checkpointCmd_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(checkpointCmd_);
                checkpointCmd_ = subBuilder.buildPartial();
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
      return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_NamenodeCommandProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_NamenodeCommandProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto.class, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto.Builder.class);
    }

    /**
     * Protobuf enum {@code hadoop.hdfs.NamenodeCommandProto.Type}
     */
    public enum Type
        implements org.apache.hadoop.thirdparty.protobuf.ProtocolMessageEnum {
      /**
       * <pre>
       * Base command
       * </pre>
       *
       * <code>NamenodeCommand = 0;</code>
       */
      NamenodeCommand(0),
      /**
       * <pre>
       * Check point command
       * </pre>
       *
       * <code>CheckPointCommand = 1;</code>
       */
      CheckPointCommand(1),
      ;

      /**
       * <pre>
       * Base command
       * </pre>
       *
       * <code>NamenodeCommand = 0;</code>
       */
      public static final int NamenodeCommand_VALUE = 0;
      /**
       * <pre>
       * Check point command
       * </pre>
       *
       * <code>CheckPointCommand = 1;</code>
       */
      public static final int CheckPointCommand_VALUE = 1;


      public final int getNumber() {
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static Type valueOf(int value) {
        return forNumber(value);
      }

      public static Type forNumber(int value) {
        switch (value) {
          case 0: return NamenodeCommand;
          case 1: return CheckPointCommand;
          default: return null;
        }
      }

      public static org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<Type>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<
          Type> internalValueMap =
            new org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<Type>() {
              public Type findValueByNumber(int number) {
                return Type.forNumber(number);
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
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto.getDescriptor().getEnumTypes().get(0);
      }

      private static final Type[] VALUES = values();

      public static Type valueOf(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private Type(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:hadoop.hdfs.NamenodeCommandProto.Type)
    }

    private int bitField0_;
    public static final int ACTION_FIELD_NUMBER = 1;
    private int action_;
    /**
     * <code>required uint32 action = 1;</code>
     */
    public boolean hasAction() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required uint32 action = 1;</code>
     */
    public int getAction() {
      return action_;
    }

    public static final int TYPE_FIELD_NUMBER = 2;
    private int type_;
    /**
     * <code>required .hadoop.hdfs.NamenodeCommandProto.Type type = 2;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required .hadoop.hdfs.NamenodeCommandProto.Type type = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto.Type getType() {
      @SuppressWarnings("deprecation")
      org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto.Type result = org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto.Type.valueOf(type_);
      return result == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto.Type.NamenodeCommand : result;
    }

    public static final int CHECKPOINTCMD_FIELD_NUMBER = 3;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto checkpointCmd_;
    /**
     * <code>optional .hadoop.hdfs.CheckpointCommandProto checkpointCmd = 3;</code>
     */
    public boolean hasCheckpointCmd() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional .hadoop.hdfs.CheckpointCommandProto checkpointCmd = 3;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto getCheckpointCmd() {
      return checkpointCmd_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto.getDefaultInstance() : checkpointCmd_;
    }
    /**
     * <code>optional .hadoop.hdfs.CheckpointCommandProto checkpointCmd = 3;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProtoOrBuilder getCheckpointCmdOrBuilder() {
      return checkpointCmd_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto.getDefaultInstance() : checkpointCmd_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasAction()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasCheckpointCmd()) {
        if (!getCheckpointCmd().isInitialized()) {
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
        output.writeUInt32(1, action_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeEnum(2, type_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeMessage(3, getCheckpointCmd());
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
          .computeUInt32Size(1, action_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeEnumSize(2, type_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(3, getCheckpointCmd());
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto other = (org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto) obj;

      if (hasAction() != other.hasAction()) return false;
      if (hasAction()) {
        if (getAction()
            != other.getAction()) return false;
      }
      if (hasType() != other.hasType()) return false;
      if (hasType()) {
        if (type_ != other.type_) return false;
      }
      if (hasCheckpointCmd() != other.hasCheckpointCmd()) return false;
      if (hasCheckpointCmd()) {
        if (!getCheckpointCmd()
            .equals(other.getCheckpointCmd())) return false;
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
      if (hasAction()) {
        hash = (37 * hash) + ACTION_FIELD_NUMBER;
        hash = (53 * hash) + getAction();
      }
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + type_;
      }
      if (hasCheckpointCmd()) {
        hash = (37 * hash) + CHECKPOINTCMD_FIELD_NUMBER;
        hash = (53 * hash) + getCheckpointCmd().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto prototype) {
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
     * Command sent from one namenode to another namenode.
     * </pre>
     *
     * Protobuf type {@code hadoop.hdfs.NamenodeCommandProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.NamenodeCommandProto)
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_NamenodeCommandProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_NamenodeCommandProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto.class, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto.newBuilder()
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
          getCheckpointCmdFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        action_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (checkpointCmdBuilder_ == null) {
          checkpointCmd_ = null;
        } else {
          checkpointCmdBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_NamenodeCommandProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto build() {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto result = new org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.action_ = action_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          if (checkpointCmdBuilder_ == null) {
            result.checkpointCmd_ = checkpointCmd_;
          } else {
            result.checkpointCmd_ = checkpointCmdBuilder_.build();
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto.getDefaultInstance()) return this;
        if (other.hasAction()) {
          setAction(other.getAction());
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasCheckpointCmd()) {
          mergeCheckpointCmd(other.getCheckpointCmd());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasAction()) {
          return false;
        }
        if (!hasType()) {
          return false;
        }
        if (hasCheckpointCmd()) {
          if (!getCheckpointCmd().isInitialized()) {
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
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int action_ ;
      /**
       * <code>required uint32 action = 1;</code>
       */
      public boolean hasAction() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required uint32 action = 1;</code>
       */
      public int getAction() {
        return action_;
      }
      /**
       * <code>required uint32 action = 1;</code>
       */
      public Builder setAction(int value) {
        bitField0_ |= 0x00000001;
        action_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 action = 1;</code>
       */
      public Builder clearAction() {
        bitField0_ = (bitField0_ & ~0x00000001);
        action_ = 0;
        onChanged();
        return this;
      }

      private int type_ = 0;
      /**
       * <code>required .hadoop.hdfs.NamenodeCommandProto.Type type = 2;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeCommandProto.Type type = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto.Type getType() {
        @SuppressWarnings("deprecation")
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto.Type result = org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto.Type.valueOf(type_);
        return result == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto.Type.NamenodeCommand : result;
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeCommandProto.Type type = 2;</code>
       */
      public Builder setType(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto.Type value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeCommandProto.Type type = 2;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        type_ = 0;
        onChanged();
        return this;
      }

      private org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto checkpointCmd_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProtoOrBuilder> checkpointCmdBuilder_;
      /**
       * <code>optional .hadoop.hdfs.CheckpointCommandProto checkpointCmd = 3;</code>
       */
      public boolean hasCheckpointCmd() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional .hadoop.hdfs.CheckpointCommandProto checkpointCmd = 3;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto getCheckpointCmd() {
        if (checkpointCmdBuilder_ == null) {
          return checkpointCmd_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto.getDefaultInstance() : checkpointCmd_;
        } else {
          return checkpointCmdBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .hadoop.hdfs.CheckpointCommandProto checkpointCmd = 3;</code>
       */
      public Builder setCheckpointCmd(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto value) {
        if (checkpointCmdBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          checkpointCmd_ = value;
          onChanged();
        } else {
          checkpointCmdBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.CheckpointCommandProto checkpointCmd = 3;</code>
       */
      public Builder setCheckpointCmd(
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto.Builder builderForValue) {
        if (checkpointCmdBuilder_ == null) {
          checkpointCmd_ = builderForValue.build();
          onChanged();
        } else {
          checkpointCmdBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.CheckpointCommandProto checkpointCmd = 3;</code>
       */
      public Builder mergeCheckpointCmd(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto value) {
        if (checkpointCmdBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0) &&
              checkpointCmd_ != null &&
              checkpointCmd_ != org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto.getDefaultInstance()) {
            checkpointCmd_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto.newBuilder(checkpointCmd_).mergeFrom(value).buildPartial();
          } else {
            checkpointCmd_ = value;
          }
          onChanged();
        } else {
          checkpointCmdBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.CheckpointCommandProto checkpointCmd = 3;</code>
       */
      public Builder clearCheckpointCmd() {
        if (checkpointCmdBuilder_ == null) {
          checkpointCmd_ = null;
          onChanged();
        } else {
          checkpointCmdBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.CheckpointCommandProto checkpointCmd = 3;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto.Builder getCheckpointCmdBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getCheckpointCmdFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .hadoop.hdfs.CheckpointCommandProto checkpointCmd = 3;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProtoOrBuilder getCheckpointCmdOrBuilder() {
        if (checkpointCmdBuilder_ != null) {
          return checkpointCmdBuilder_.getMessageOrBuilder();
        } else {
          return checkpointCmd_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto.getDefaultInstance() : checkpointCmd_;
        }
      }
      /**
       * <code>optional .hadoop.hdfs.CheckpointCommandProto checkpointCmd = 3;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProtoOrBuilder> 
          getCheckpointCmdFieldBuilder() {
        if (checkpointCmdBuilder_ == null) {
          checkpointCmdBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.CheckpointCommandProtoOrBuilder>(
                  getCheckpointCmd(),
                  getParentForChildren(),
                  isClean());
          checkpointCmd_ = null;
        }
        return checkpointCmdBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.NamenodeCommandProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.NamenodeCommandProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<NamenodeCommandProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<NamenodeCommandProto>() {
      @java.lang.Override
      public NamenodeCommandProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new NamenodeCommandProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<NamenodeCommandProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<NamenodeCommandProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeCommandProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface VersionRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.VersionRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   **
   * void request
   * </pre>
   *
   * Protobuf type {@code hadoop.hdfs.VersionRequestProto}
   */
  public  static final class VersionRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.VersionRequestProto)
      VersionRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VersionRequestProto.newBuilder() to construct.
    private VersionRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VersionRequestProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private VersionRequestProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_VersionRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_VersionRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto.Builder.class);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.VersionRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.VersionRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_VersionRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_VersionRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_VersionRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto(this);
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto) e.getUnfinishedMessage();
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.VersionRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.VersionRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<VersionRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<VersionRequestProto>() {
      @java.lang.Override
      public VersionRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new VersionRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<VersionRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<VersionRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface VersionResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.VersionResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required .hadoop.hdfs.NamespaceInfoProto info = 1;</code>
     */
    boolean hasInfo();
    /**
     * <code>required .hadoop.hdfs.NamespaceInfoProto info = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto getInfo();
    /**
     * <code>required .hadoop.hdfs.NamespaceInfoProto info = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProtoOrBuilder getInfoOrBuilder();
  }
  /**
   * <pre>
   **
   * Version response from namenode.
   * </pre>
   *
   * Protobuf type {@code hadoop.hdfs.VersionResponseProto}
   */
  public  static final class VersionResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.VersionResponseProto)
      VersionResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VersionResponseProto.newBuilder() to construct.
    private VersionResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VersionResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private VersionResponseProto(
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
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = info_.toBuilder();
              }
              info_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(info_);
                info_ = subBuilder.buildPartial();
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
      return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_VersionResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_VersionResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto.Builder.class);
    }

    private int bitField0_;
    public static final int INFO_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto info_;
    /**
     * <code>required .hadoop.hdfs.NamespaceInfoProto info = 1;</code>
     */
    public boolean hasInfo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required .hadoop.hdfs.NamespaceInfoProto info = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto getInfo() {
      return info_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto.getDefaultInstance() : info_;
    }
    /**
     * <code>required .hadoop.hdfs.NamespaceInfoProto info = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProtoOrBuilder getInfoOrBuilder() {
      return info_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto.getDefaultInstance() : info_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasInfo()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getInfo().isInitialized()) {
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
        output.writeMessage(1, getInfo());
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
          .computeMessageSize(1, getInfo());
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto) obj;

      if (hasInfo() != other.hasInfo()) return false;
      if (hasInfo()) {
        if (!getInfo()
            .equals(other.getInfo())) return false;
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
      if (hasInfo()) {
        hash = (37 * hash) + INFO_FIELD_NUMBER;
        hash = (53 * hash) + getInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto prototype) {
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
     * Version response from namenode.
     * </pre>
     *
     * Protobuf type {@code hadoop.hdfs.VersionResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.VersionResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_VersionResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_VersionResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto.newBuilder()
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
          getInfoFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (infoBuilder_ == null) {
          info_ = null;
        } else {
          infoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_VersionResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (infoBuilder_ == null) {
            result.info_ = info_;
          } else {
            result.info_ = infoBuilder_.build();
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto.getDefaultInstance()) return this;
        if (other.hasInfo()) {
          mergeInfo(other.getInfo());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasInfo()) {
          return false;
        }
        if (!getInfo().isInitialized()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto info_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProtoOrBuilder> infoBuilder_;
      /**
       * <code>required .hadoop.hdfs.NamespaceInfoProto info = 1;</code>
       */
      public boolean hasInfo() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required .hadoop.hdfs.NamespaceInfoProto info = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto getInfo() {
        if (infoBuilder_ == null) {
          return info_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto.getDefaultInstance() : info_;
        } else {
          return infoBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.NamespaceInfoProto info = 1;</code>
       */
      public Builder setInfo(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto value) {
        if (infoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          info_ = value;
          onChanged();
        } else {
          infoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.NamespaceInfoProto info = 1;</code>
       */
      public Builder setInfo(
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto.Builder builderForValue) {
        if (infoBuilder_ == null) {
          info_ = builderForValue.build();
          onChanged();
        } else {
          infoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.NamespaceInfoProto info = 1;</code>
       */
      public Builder mergeInfo(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto value) {
        if (infoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              info_ != null &&
              info_ != org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto.getDefaultInstance()) {
            info_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto.newBuilder(info_).mergeFrom(value).buildPartial();
          } else {
            info_ = value;
          }
          onChanged();
        } else {
          infoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.NamespaceInfoProto info = 1;</code>
       */
      public Builder clearInfo() {
        if (infoBuilder_ == null) {
          info_ = null;
          onChanged();
        } else {
          infoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.NamespaceInfoProto info = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto.Builder getInfoBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.NamespaceInfoProto info = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProtoOrBuilder getInfoOrBuilder() {
        if (infoBuilder_ != null) {
          return infoBuilder_.getMessageOrBuilder();
        } else {
          return info_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto.getDefaultInstance() : info_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.NamespaceInfoProto info = 1;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProtoOrBuilder> 
          getInfoFieldBuilder() {
        if (infoBuilder_ == null) {
          infoBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamespaceInfoProtoOrBuilder>(
                  getInfo(),
                  getParentForChildren(),
                  isClean());
          info_ = null;
        }
        return infoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.VersionResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.VersionResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<VersionResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<VersionResponseProto>() {
      @java.lang.Override
      public VersionResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new VersionResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<VersionResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<VersionResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.VersionResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface StorageInfoProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.StorageInfoProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Layout version of the file system
     * </pre>
     *
     * <code>required uint32 layoutVersion = 1;</code>
     */
    boolean hasLayoutVersion();
    /**
     * <pre>
     * Layout version of the file system
     * </pre>
     *
     * <code>required uint32 layoutVersion = 1;</code>
     */
    int getLayoutVersion();

    /**
     * <pre>
     * File system namespace ID
     * </pre>
     *
     * <code>required uint32 namespceID = 2;</code>
     */
    boolean hasNamespceID();
    /**
     * <pre>
     * File system namespace ID
     * </pre>
     *
     * <code>required uint32 namespceID = 2;</code>
     */
    int getNamespceID();

    /**
     * <pre>
     * ID of the cluster
     * </pre>
     *
     * <code>required string clusterID = 3;</code>
     */
    boolean hasClusterID();
    /**
     * <pre>
     * ID of the cluster
     * </pre>
     *
     * <code>required string clusterID = 3;</code>
     */
    java.lang.String getClusterID();
    /**
     * <pre>
     * ID of the cluster
     * </pre>
     *
     * <code>required string clusterID = 3;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getClusterIDBytes();

    /**
     * <pre>
     * File system creation time
     * </pre>
     *
     * <code>required uint64 cTime = 4;</code>
     */
    boolean hasCTime();
    /**
     * <pre>
     * File system creation time
     * </pre>
     *
     * <code>required uint64 cTime = 4;</code>
     */
    long getCTime();
  }
  /**
   * <pre>
   **
   * Common node information shared by all the nodes in the cluster
   * </pre>
   *
   * Protobuf type {@code hadoop.hdfs.StorageInfoProto}
   */
  public  static final class StorageInfoProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.StorageInfoProto)
      StorageInfoProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StorageInfoProto.newBuilder() to construct.
    private StorageInfoProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StorageInfoProto() {
      clusterID_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private StorageInfoProto(
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
              layoutVersion_ = input.readUInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              namespceID_ = input.readUInt32();
              break;
            }
            case 26: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              clusterID_ = bs;
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              cTime_ = input.readUInt64();
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
      return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_StorageInfoProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_StorageInfoProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.class, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.Builder.class);
    }

    private int bitField0_;
    public static final int LAYOUTVERSION_FIELD_NUMBER = 1;
    private int layoutVersion_;
    /**
     * <pre>
     * Layout version of the file system
     * </pre>
     *
     * <code>required uint32 layoutVersion = 1;</code>
     */
    public boolean hasLayoutVersion() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Layout version of the file system
     * </pre>
     *
     * <code>required uint32 layoutVersion = 1;</code>
     */
    public int getLayoutVersion() {
      return layoutVersion_;
    }

    public static final int NAMESPCEID_FIELD_NUMBER = 2;
    private int namespceID_;
    /**
     * <pre>
     * File system namespace ID
     * </pre>
     *
     * <code>required uint32 namespceID = 2;</code>
     */
    public boolean hasNamespceID() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * File system namespace ID
     * </pre>
     *
     * <code>required uint32 namespceID = 2;</code>
     */
    public int getNamespceID() {
      return namespceID_;
    }

    public static final int CLUSTERID_FIELD_NUMBER = 3;
    private volatile java.lang.Object clusterID_;
    /**
     * <pre>
     * ID of the cluster
     * </pre>
     *
     * <code>required string clusterID = 3;</code>
     */
    public boolean hasClusterID() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * ID of the cluster
     * </pre>
     *
     * <code>required string clusterID = 3;</code>
     */
    public java.lang.String getClusterID() {
      java.lang.Object ref = clusterID_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          clusterID_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * ID of the cluster
     * </pre>
     *
     * <code>required string clusterID = 3;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getClusterIDBytes() {
      java.lang.Object ref = clusterID_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clusterID_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int CTIME_FIELD_NUMBER = 4;
    private long cTime_;
    /**
     * <pre>
     * File system creation time
     * </pre>
     *
     * <code>required uint64 cTime = 4;</code>
     */
    public boolean hasCTime() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * File system creation time
     * </pre>
     *
     * <code>required uint64 cTime = 4;</code>
     */
    public long getCTime() {
      return cTime_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasLayoutVersion()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasNamespceID()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasClusterID()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCTime()) {
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
        output.writeUInt32(1, layoutVersion_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt32(2, namespceID_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 3, clusterID_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeUInt64(4, cTime_);
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
          .computeUInt32Size(1, layoutVersion_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeUInt32Size(2, namespceID_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(3, clusterID_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeUInt64Size(4, cTime_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto other = (org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto) obj;

      if (hasLayoutVersion() != other.hasLayoutVersion()) return false;
      if (hasLayoutVersion()) {
        if (getLayoutVersion()
            != other.getLayoutVersion()) return false;
      }
      if (hasNamespceID() != other.hasNamespceID()) return false;
      if (hasNamespceID()) {
        if (getNamespceID()
            != other.getNamespceID()) return false;
      }
      if (hasClusterID() != other.hasClusterID()) return false;
      if (hasClusterID()) {
        if (!getClusterID()
            .equals(other.getClusterID())) return false;
      }
      if (hasCTime() != other.hasCTime()) return false;
      if (hasCTime()) {
        if (getCTime()
            != other.getCTime()) return false;
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
      if (hasLayoutVersion()) {
        hash = (37 * hash) + LAYOUTVERSION_FIELD_NUMBER;
        hash = (53 * hash) + getLayoutVersion();
      }
      if (hasNamespceID()) {
        hash = (37 * hash) + NAMESPCEID_FIELD_NUMBER;
        hash = (53 * hash) + getNamespceID();
      }
      if (hasClusterID()) {
        hash = (37 * hash) + CLUSTERID_FIELD_NUMBER;
        hash = (53 * hash) + getClusterID().hashCode();
      }
      if (hasCTime()) {
        hash = (37 * hash) + CTIME_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getCTime());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto prototype) {
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
     * Common node information shared by all the nodes in the cluster
     * </pre>
     *
     * Protobuf type {@code hadoop.hdfs.StorageInfoProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.StorageInfoProto)
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_StorageInfoProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_StorageInfoProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.class, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.newBuilder()
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
        layoutVersion_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        namespceID_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        clusterID_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        cTime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_StorageInfoProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto build() {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto result = new org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.layoutVersion_ = layoutVersion_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.namespceID_ = namespceID_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.clusterID_ = clusterID_;
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.cTime_ = cTime_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.getDefaultInstance()) return this;
        if (other.hasLayoutVersion()) {
          setLayoutVersion(other.getLayoutVersion());
        }
        if (other.hasNamespceID()) {
          setNamespceID(other.getNamespceID());
        }
        if (other.hasClusterID()) {
          bitField0_ |= 0x00000004;
          clusterID_ = other.clusterID_;
          onChanged();
        }
        if (other.hasCTime()) {
          setCTime(other.getCTime());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasLayoutVersion()) {
          return false;
        }
        if (!hasNamespceID()) {
          return false;
        }
        if (!hasClusterID()) {
          return false;
        }
        if (!hasCTime()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int layoutVersion_ ;
      /**
       * <pre>
       * Layout version of the file system
       * </pre>
       *
       * <code>required uint32 layoutVersion = 1;</code>
       */
      public boolean hasLayoutVersion() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Layout version of the file system
       * </pre>
       *
       * <code>required uint32 layoutVersion = 1;</code>
       */
      public int getLayoutVersion() {
        return layoutVersion_;
      }
      /**
       * <pre>
       * Layout version of the file system
       * </pre>
       *
       * <code>required uint32 layoutVersion = 1;</code>
       */
      public Builder setLayoutVersion(int value) {
        bitField0_ |= 0x00000001;
        layoutVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Layout version of the file system
       * </pre>
       *
       * <code>required uint32 layoutVersion = 1;</code>
       */
      public Builder clearLayoutVersion() {
        bitField0_ = (bitField0_ & ~0x00000001);
        layoutVersion_ = 0;
        onChanged();
        return this;
      }

      private int namespceID_ ;
      /**
       * <pre>
       * File system namespace ID
       * </pre>
       *
       * <code>required uint32 namespceID = 2;</code>
       */
      public boolean hasNamespceID() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * File system namespace ID
       * </pre>
       *
       * <code>required uint32 namespceID = 2;</code>
       */
      public int getNamespceID() {
        return namespceID_;
      }
      /**
       * <pre>
       * File system namespace ID
       * </pre>
       *
       * <code>required uint32 namespceID = 2;</code>
       */
      public Builder setNamespceID(int value) {
        bitField0_ |= 0x00000002;
        namespceID_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * File system namespace ID
       * </pre>
       *
       * <code>required uint32 namespceID = 2;</code>
       */
      public Builder clearNamespceID() {
        bitField0_ = (bitField0_ & ~0x00000002);
        namespceID_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object clusterID_ = "";
      /**
       * <pre>
       * ID of the cluster
       * </pre>
       *
       * <code>required string clusterID = 3;</code>
       */
      public boolean hasClusterID() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * ID of the cluster
       * </pre>
       *
       * <code>required string clusterID = 3;</code>
       */
      public java.lang.String getClusterID() {
        java.lang.Object ref = clusterID_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            clusterID_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * ID of the cluster
       * </pre>
       *
       * <code>required string clusterID = 3;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getClusterIDBytes() {
        java.lang.Object ref = clusterID_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          clusterID_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * ID of the cluster
       * </pre>
       *
       * <code>required string clusterID = 3;</code>
       */
      public Builder setClusterID(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        clusterID_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ID of the cluster
       * </pre>
       *
       * <code>required string clusterID = 3;</code>
       */
      public Builder clearClusterID() {
        bitField0_ = (bitField0_ & ~0x00000004);
        clusterID_ = getDefaultInstance().getClusterID();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ID of the cluster
       * </pre>
       *
       * <code>required string clusterID = 3;</code>
       */
      public Builder setClusterIDBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        clusterID_ = value;
        onChanged();
        return this;
      }

      private long cTime_ ;
      /**
       * <pre>
       * File system creation time
       * </pre>
       *
       * <code>required uint64 cTime = 4;</code>
       */
      public boolean hasCTime() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <pre>
       * File system creation time
       * </pre>
       *
       * <code>required uint64 cTime = 4;</code>
       */
      public long getCTime() {
        return cTime_;
      }
      /**
       * <pre>
       * File system creation time
       * </pre>
       *
       * <code>required uint64 cTime = 4;</code>
       */
      public Builder setCTime(long value) {
        bitField0_ |= 0x00000008;
        cTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * File system creation time
       * </pre>
       *
       * <code>required uint64 cTime = 4;</code>
       */
      public Builder clearCTime() {
        bitField0_ = (bitField0_ & ~0x00000008);
        cTime_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.StorageInfoProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.StorageInfoProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<StorageInfoProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<StorageInfoProto>() {
      @java.lang.Override
      public StorageInfoProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new StorageInfoProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<StorageInfoProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<StorageInfoProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface NamenodeRegistrationProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.NamenodeRegistrationProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * host:port of the namenode RPC address
     * </pre>
     *
     * <code>required string rpcAddress = 1;</code>
     */
    boolean hasRpcAddress();
    /**
     * <pre>
     * host:port of the namenode RPC address
     * </pre>
     *
     * <code>required string rpcAddress = 1;</code>
     */
    java.lang.String getRpcAddress();
    /**
     * <pre>
     * host:port of the namenode RPC address
     * </pre>
     *
     * <code>required string rpcAddress = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getRpcAddressBytes();

    /**
     * <pre>
     * host:port of the namenode http server
     * </pre>
     *
     * <code>required string httpAddress = 2;</code>
     */
    boolean hasHttpAddress();
    /**
     * <pre>
     * host:port of the namenode http server
     * </pre>
     *
     * <code>required string httpAddress = 2;</code>
     */
    java.lang.String getHttpAddress();
    /**
     * <pre>
     * host:port of the namenode http server
     * </pre>
     *
     * <code>required string httpAddress = 2;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getHttpAddressBytes();

    /**
     * <pre>
     * Node information
     * </pre>
     *
     * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 3;</code>
     */
    boolean hasStorageInfo();
    /**
     * <pre>
     * Node information
     * </pre>
     *
     * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 3;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto getStorageInfo();
    /**
     * <pre>
     * Node information
     * </pre>
     *
     * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 3;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProtoOrBuilder getStorageInfoOrBuilder();

    /**
     * <pre>
     * Namenode role
     * </pre>
     *
     * <code>optional .hadoop.hdfs.NamenodeRegistrationProto.NamenodeRoleProto role = 4 [default = NAMENODE];</code>
     */
    boolean hasRole();
    /**
     * <pre>
     * Namenode role
     * </pre>
     *
     * <code>optional .hadoop.hdfs.NamenodeRegistrationProto.NamenodeRoleProto role = 4 [default = NAMENODE];</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto.NamenodeRoleProto getRole();
  }
  /**
   * <pre>
   **
   * Information sent by a namenode to identify itself to the primary namenode.
   * </pre>
   *
   * Protobuf type {@code hadoop.hdfs.NamenodeRegistrationProto}
   */
  public  static final class NamenodeRegistrationProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.NamenodeRegistrationProto)
      NamenodeRegistrationProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NamenodeRegistrationProto.newBuilder() to construct.
    private NamenodeRegistrationProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NamenodeRegistrationProto() {
      rpcAddress_ = "";
      httpAddress_ = "";
      role_ = 1;
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private NamenodeRegistrationProto(
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
              rpcAddress_ = bs;
              break;
            }
            case 18: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              httpAddress_ = bs;
              break;
            }
            case 26: {
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) != 0)) {
                subBuilder = storageInfo_.toBuilder();
              }
              storageInfo_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(storageInfo_);
                storageInfo_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
            case 32: {
              int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto.NamenodeRoleProto value = org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto.NamenodeRoleProto.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(4, rawValue);
              } else {
                bitField0_ |= 0x00000008;
                role_ = rawValue;
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
      return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_NamenodeRegistrationProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_NamenodeRegistrationProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto.class, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto.Builder.class);
    }

    /**
     * Protobuf enum {@code hadoop.hdfs.NamenodeRegistrationProto.NamenodeRoleProto}
     */
    public enum NamenodeRoleProto
        implements org.apache.hadoop.thirdparty.protobuf.ProtocolMessageEnum {
      /**
       * <code>NAMENODE = 1;</code>
       */
      NAMENODE(1),
      /**
       * <code>BACKUP = 2;</code>
       */
      BACKUP(2),
      /**
       * <code>CHECKPOINT = 3;</code>
       */
      CHECKPOINT(3),
      ;

      /**
       * <code>NAMENODE = 1;</code>
       */
      public static final int NAMENODE_VALUE = 1;
      /**
       * <code>BACKUP = 2;</code>
       */
      public static final int BACKUP_VALUE = 2;
      /**
       * <code>CHECKPOINT = 3;</code>
       */
      public static final int CHECKPOINT_VALUE = 3;


      public final int getNumber() {
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static NamenodeRoleProto valueOf(int value) {
        return forNumber(value);
      }

      public static NamenodeRoleProto forNumber(int value) {
        switch (value) {
          case 1: return NAMENODE;
          case 2: return BACKUP;
          case 3: return CHECKPOINT;
          default: return null;
        }
      }

      public static org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<NamenodeRoleProto>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<
          NamenodeRoleProto> internalValueMap =
            new org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<NamenodeRoleProto>() {
              public NamenodeRoleProto findValueByNumber(int number) {
                return NamenodeRoleProto.forNumber(number);
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
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto.getDescriptor().getEnumTypes().get(0);
      }

      private static final NamenodeRoleProto[] VALUES = values();

      public static NamenodeRoleProto valueOf(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private NamenodeRoleProto(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:hadoop.hdfs.NamenodeRegistrationProto.NamenodeRoleProto)
    }

    private int bitField0_;
    public static final int RPCADDRESS_FIELD_NUMBER = 1;
    private volatile java.lang.Object rpcAddress_;
    /**
     * <pre>
     * host:port of the namenode RPC address
     * </pre>
     *
     * <code>required string rpcAddress = 1;</code>
     */
    public boolean hasRpcAddress() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * host:port of the namenode RPC address
     * </pre>
     *
     * <code>required string rpcAddress = 1;</code>
     */
    public java.lang.String getRpcAddress() {
      java.lang.Object ref = rpcAddress_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          rpcAddress_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * host:port of the namenode RPC address
     * </pre>
     *
     * <code>required string rpcAddress = 1;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getRpcAddressBytes() {
      java.lang.Object ref = rpcAddress_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rpcAddress_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int HTTPADDRESS_FIELD_NUMBER = 2;
    private volatile java.lang.Object httpAddress_;
    /**
     * <pre>
     * host:port of the namenode http server
     * </pre>
     *
     * <code>required string httpAddress = 2;</code>
     */
    public boolean hasHttpAddress() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * host:port of the namenode http server
     * </pre>
     *
     * <code>required string httpAddress = 2;</code>
     */
    public java.lang.String getHttpAddress() {
      java.lang.Object ref = httpAddress_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          httpAddress_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * host:port of the namenode http server
     * </pre>
     *
     * <code>required string httpAddress = 2;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getHttpAddressBytes() {
      java.lang.Object ref = httpAddress_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        httpAddress_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int STORAGEINFO_FIELD_NUMBER = 3;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto storageInfo_;
    /**
     * <pre>
     * Node information
     * </pre>
     *
     * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 3;</code>
     */
    public boolean hasStorageInfo() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Node information
     * </pre>
     *
     * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 3;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto getStorageInfo() {
      return storageInfo_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.getDefaultInstance() : storageInfo_;
    }
    /**
     * <pre>
     * Node information
     * </pre>
     *
     * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 3;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProtoOrBuilder getStorageInfoOrBuilder() {
      return storageInfo_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.getDefaultInstance() : storageInfo_;
    }

    public static final int ROLE_FIELD_NUMBER = 4;
    private int role_;
    /**
     * <pre>
     * Namenode role
     * </pre>
     *
     * <code>optional .hadoop.hdfs.NamenodeRegistrationProto.NamenodeRoleProto role = 4 [default = NAMENODE];</code>
     */
    public boolean hasRole() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Namenode role
     * </pre>
     *
     * <code>optional .hadoop.hdfs.NamenodeRegistrationProto.NamenodeRoleProto role = 4 [default = NAMENODE];</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto.NamenodeRoleProto getRole() {
      @SuppressWarnings("deprecation")
      org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto.NamenodeRoleProto result = org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto.NamenodeRoleProto.valueOf(role_);
      return result == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto.NamenodeRoleProto.NAMENODE : result;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasRpcAddress()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasHttpAddress()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasStorageInfo()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getStorageInfo().isInitialized()) {
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, rpcAddress_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 2, httpAddress_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeMessage(3, getStorageInfo());
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeEnum(4, role_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, rpcAddress_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(2, httpAddress_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(3, getStorageInfo());
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeEnumSize(4, role_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto other = (org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto) obj;

      if (hasRpcAddress() != other.hasRpcAddress()) return false;
      if (hasRpcAddress()) {
        if (!getRpcAddress()
            .equals(other.getRpcAddress())) return false;
      }
      if (hasHttpAddress() != other.hasHttpAddress()) return false;
      if (hasHttpAddress()) {
        if (!getHttpAddress()
            .equals(other.getHttpAddress())) return false;
      }
      if (hasStorageInfo() != other.hasStorageInfo()) return false;
      if (hasStorageInfo()) {
        if (!getStorageInfo()
            .equals(other.getStorageInfo())) return false;
      }
      if (hasRole() != other.hasRole()) return false;
      if (hasRole()) {
        if (role_ != other.role_) return false;
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
      if (hasRpcAddress()) {
        hash = (37 * hash) + RPCADDRESS_FIELD_NUMBER;
        hash = (53 * hash) + getRpcAddress().hashCode();
      }
      if (hasHttpAddress()) {
        hash = (37 * hash) + HTTPADDRESS_FIELD_NUMBER;
        hash = (53 * hash) + getHttpAddress().hashCode();
      }
      if (hasStorageInfo()) {
        hash = (37 * hash) + STORAGEINFO_FIELD_NUMBER;
        hash = (53 * hash) + getStorageInfo().hashCode();
      }
      if (hasRole()) {
        hash = (37 * hash) + ROLE_FIELD_NUMBER;
        hash = (53 * hash) + role_;
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto prototype) {
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
     * Information sent by a namenode to identify itself to the primary namenode.
     * </pre>
     *
     * Protobuf type {@code hadoop.hdfs.NamenodeRegistrationProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.NamenodeRegistrationProto)
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_NamenodeRegistrationProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_NamenodeRegistrationProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto.class, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto.newBuilder()
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
          getStorageInfoFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        rpcAddress_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        httpAddress_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        if (storageInfoBuilder_ == null) {
          storageInfo_ = null;
        } else {
          storageInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        role_ = 1;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_NamenodeRegistrationProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto build() {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto result = new org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.rpcAddress_ = rpcAddress_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.httpAddress_ = httpAddress_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          if (storageInfoBuilder_ == null) {
            result.storageInfo_ = storageInfo_;
          } else {
            result.storageInfo_ = storageInfoBuilder_.build();
          }
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          to_bitField0_ |= 0x00000008;
        }
        result.role_ = role_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto.getDefaultInstance()) return this;
        if (other.hasRpcAddress()) {
          bitField0_ |= 0x00000001;
          rpcAddress_ = other.rpcAddress_;
          onChanged();
        }
        if (other.hasHttpAddress()) {
          bitField0_ |= 0x00000002;
          httpAddress_ = other.httpAddress_;
          onChanged();
        }
        if (other.hasStorageInfo()) {
          mergeStorageInfo(other.getStorageInfo());
        }
        if (other.hasRole()) {
          setRole(other.getRole());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasRpcAddress()) {
          return false;
        }
        if (!hasHttpAddress()) {
          return false;
        }
        if (!hasStorageInfo()) {
          return false;
        }
        if (!getStorageInfo().isInitialized()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object rpcAddress_ = "";
      /**
       * <pre>
       * host:port of the namenode RPC address
       * </pre>
       *
       * <code>required string rpcAddress = 1;</code>
       */
      public boolean hasRpcAddress() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * host:port of the namenode RPC address
       * </pre>
       *
       * <code>required string rpcAddress = 1;</code>
       */
      public java.lang.String getRpcAddress() {
        java.lang.Object ref = rpcAddress_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            rpcAddress_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * host:port of the namenode RPC address
       * </pre>
       *
       * <code>required string rpcAddress = 1;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getRpcAddressBytes() {
        java.lang.Object ref = rpcAddress_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          rpcAddress_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * host:port of the namenode RPC address
       * </pre>
       *
       * <code>required string rpcAddress = 1;</code>
       */
      public Builder setRpcAddress(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        rpcAddress_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * host:port of the namenode RPC address
       * </pre>
       *
       * <code>required string rpcAddress = 1;</code>
       */
      public Builder clearRpcAddress() {
        bitField0_ = (bitField0_ & ~0x00000001);
        rpcAddress_ = getDefaultInstance().getRpcAddress();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * host:port of the namenode RPC address
       * </pre>
       *
       * <code>required string rpcAddress = 1;</code>
       */
      public Builder setRpcAddressBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        rpcAddress_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object httpAddress_ = "";
      /**
       * <pre>
       * host:port of the namenode http server
       * </pre>
       *
       * <code>required string httpAddress = 2;</code>
       */
      public boolean hasHttpAddress() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * host:port of the namenode http server
       * </pre>
       *
       * <code>required string httpAddress = 2;</code>
       */
      public java.lang.String getHttpAddress() {
        java.lang.Object ref = httpAddress_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            httpAddress_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * host:port of the namenode http server
       * </pre>
       *
       * <code>required string httpAddress = 2;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getHttpAddressBytes() {
        java.lang.Object ref = httpAddress_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          httpAddress_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * host:port of the namenode http server
       * </pre>
       *
       * <code>required string httpAddress = 2;</code>
       */
      public Builder setHttpAddress(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        httpAddress_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * host:port of the namenode http server
       * </pre>
       *
       * <code>required string httpAddress = 2;</code>
       */
      public Builder clearHttpAddress() {
        bitField0_ = (bitField0_ & ~0x00000002);
        httpAddress_ = getDefaultInstance().getHttpAddress();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * host:port of the namenode http server
       * </pre>
       *
       * <code>required string httpAddress = 2;</code>
       */
      public Builder setHttpAddressBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        httpAddress_ = value;
        onChanged();
        return this;
      }

      private org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto storageInfo_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProtoOrBuilder> storageInfoBuilder_;
      /**
       * <pre>
       * Node information
       * </pre>
       *
       * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 3;</code>
       */
      public boolean hasStorageInfo() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * Node information
       * </pre>
       *
       * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 3;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto getStorageInfo() {
        if (storageInfoBuilder_ == null) {
          return storageInfo_ == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.getDefaultInstance() : storageInfo_;
        } else {
          return storageInfoBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * Node information
       * </pre>
       *
       * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 3;</code>
       */
      public Builder setStorageInfo(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto value) {
        if (storageInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          storageInfo_ = value;
          onChanged();
        } else {
          storageInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <pre>
       * Node information
       * </pre>
       *
       * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 3;</code>
       */
      public Builder setStorageInfo(
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.Builder builderForValue) {
        if (storageInfoBuilder_ == null) {
          storageInfo_ = builderForValue.build();
          onChanged();
        } else {
          storageInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <pre>
       * Node information
       * </pre>
       *
       * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 3;</code>
       */
      public Builder mergeStorageInfo(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto value) {
        if (storageInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0) &&
              storageInfo_ != null &&
              storageInfo_ != org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.getDefaultInstance()) {
            storageInfo_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.newBuilder(storageInfo_).mergeFrom(value).buildPartial();
          } else {
            storageInfo_ = value;
          }
          onChanged();
        } else {
          storageInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <pre>
       * Node information
       * </pre>
       *
       * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 3;</code>
       */
      public Builder clearStorageInfo() {
        if (storageInfoBuilder_ == null) {
          storageInfo_ = null;
          onChanged();
        } else {
          storageInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <pre>
       * Node information
       * </pre>
       *
       * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 3;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.Builder getStorageInfoBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getStorageInfoFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * Node information
       * </pre>
       *
       * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 3;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProtoOrBuilder getStorageInfoOrBuilder() {
        if (storageInfoBuilder_ != null) {
          return storageInfoBuilder_.getMessageOrBuilder();
        } else {
          return storageInfo_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.getDefaultInstance() : storageInfo_;
        }
      }
      /**
       * <pre>
       * Node information
       * </pre>
       *
       * <code>required .hadoop.hdfs.StorageInfoProto storageInfo = 3;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProtoOrBuilder> 
          getStorageInfoFieldBuilder() {
        if (storageInfoBuilder_ == null) {
          storageInfoBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.StorageInfoProtoOrBuilder>(
                  getStorageInfo(),
                  getParentForChildren(),
                  isClean());
          storageInfo_ = null;
        }
        return storageInfoBuilder_;
      }

      private int role_ = 1;
      /**
       * <pre>
       * Namenode role
       * </pre>
       *
       * <code>optional .hadoop.hdfs.NamenodeRegistrationProto.NamenodeRoleProto role = 4 [default = NAMENODE];</code>
       */
      public boolean hasRole() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <pre>
       * Namenode role
       * </pre>
       *
       * <code>optional .hadoop.hdfs.NamenodeRegistrationProto.NamenodeRoleProto role = 4 [default = NAMENODE];</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto.NamenodeRoleProto getRole() {
        @SuppressWarnings("deprecation")
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto.NamenodeRoleProto result = org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto.NamenodeRoleProto.valueOf(role_);
        return result == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto.NamenodeRoleProto.NAMENODE : result;
      }
      /**
       * <pre>
       * Namenode role
       * </pre>
       *
       * <code>optional .hadoop.hdfs.NamenodeRegistrationProto.NamenodeRoleProto role = 4 [default = NAMENODE];</code>
       */
      public Builder setRole(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto.NamenodeRoleProto value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        role_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Namenode role
       * </pre>
       *
       * <code>optional .hadoop.hdfs.NamenodeRegistrationProto.NamenodeRoleProto role = 4 [default = NAMENODE];</code>
       */
      public Builder clearRole() {
        bitField0_ = (bitField0_ & ~0x00000008);
        role_ = 1;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.NamenodeRegistrationProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.NamenodeRegistrationProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<NamenodeRegistrationProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<NamenodeRegistrationProto>() {
      @java.lang.Override
      public NamenodeRegistrationProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new NamenodeRegistrationProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<NamenodeRegistrationProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<NamenodeRegistrationProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NamenodeRegistrationProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface NNHAStatusHeartbeatProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.NNHAStatusHeartbeatProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required .hadoop.hdfs.NNHAStatusHeartbeatProto.State state = 1;</code>
     */
    boolean hasState();
    /**
     * <code>required .hadoop.hdfs.NNHAStatusHeartbeatProto.State state = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto.State getState();

    /**
     * <code>required uint64 txid = 2;</code>
     */
    boolean hasTxid();
    /**
     * <code>required uint64 txid = 2;</code>
     */
    long getTxid();
  }
  /**
   * <pre>
   **
   * state - State the NN is in when returning response to the DN
   * txid - Highest transaction ID this NN has seen
   * </pre>
   *
   * Protobuf type {@code hadoop.hdfs.NNHAStatusHeartbeatProto}
   */
  public  static final class NNHAStatusHeartbeatProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.NNHAStatusHeartbeatProto)
      NNHAStatusHeartbeatProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NNHAStatusHeartbeatProto.newBuilder() to construct.
    private NNHAStatusHeartbeatProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NNHAStatusHeartbeatProto() {
      state_ = 0;
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private NNHAStatusHeartbeatProto(
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
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto.State value = org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto.State.valueOf(rawValue);
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
              txid_ = input.readUInt64();
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
      return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_NNHAStatusHeartbeatProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_NNHAStatusHeartbeatProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto.class, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto.Builder.class);
    }

    /**
     * Protobuf enum {@code hadoop.hdfs.NNHAStatusHeartbeatProto.State}
     */
    public enum State
        implements org.apache.hadoop.thirdparty.protobuf.ProtocolMessageEnum {
      /**
       * <code>ACTIVE = 0;</code>
       */
      ACTIVE(0),
      /**
       * <code>STANDBY = 1;</code>
       */
      STANDBY(1),
      /**
       * <code>OBSERVER = 2;</code>
       */
      OBSERVER(2),
      ;

      /**
       * <code>ACTIVE = 0;</code>
       */
      public static final int ACTIVE_VALUE = 0;
      /**
       * <code>STANDBY = 1;</code>
       */
      public static final int STANDBY_VALUE = 1;
      /**
       * <code>OBSERVER = 2;</code>
       */
      public static final int OBSERVER_VALUE = 2;


      public final int getNumber() {
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static State valueOf(int value) {
        return forNumber(value);
      }

      public static State forNumber(int value) {
        switch (value) {
          case 0: return ACTIVE;
          case 1: return STANDBY;
          case 2: return OBSERVER;
          default: return null;
        }
      }

      public static org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<State>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<
          State> internalValueMap =
            new org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<State>() {
              public State findValueByNumber(int number) {
                return State.forNumber(number);
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
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto.getDescriptor().getEnumTypes().get(0);
      }

      private static final State[] VALUES = values();

      public static State valueOf(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private State(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:hadoop.hdfs.NNHAStatusHeartbeatProto.State)
    }

    private int bitField0_;
    public static final int STATE_FIELD_NUMBER = 1;
    private int state_;
    /**
     * <code>required .hadoop.hdfs.NNHAStatusHeartbeatProto.State state = 1;</code>
     */
    public boolean hasState() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required .hadoop.hdfs.NNHAStatusHeartbeatProto.State state = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto.State getState() {
      @SuppressWarnings("deprecation")
      org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto.State result = org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto.State.valueOf(state_);
      return result == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto.State.ACTIVE : result;
    }

    public static final int TXID_FIELD_NUMBER = 2;
    private long txid_;
    /**
     * <code>required uint64 txid = 2;</code>
     */
    public boolean hasTxid() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required uint64 txid = 2;</code>
     */
    public long getTxid() {
      return txid_;
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
      if (!hasTxid()) {
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
        output.writeUInt64(2, txid_);
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
          .computeUInt64Size(2, txid_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto other = (org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto) obj;

      if (hasState() != other.hasState()) return false;
      if (hasState()) {
        if (state_ != other.state_) return false;
      }
      if (hasTxid() != other.hasTxid()) return false;
      if (hasTxid()) {
        if (getTxid()
            != other.getTxid()) return false;
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
      if (hasTxid()) {
        hash = (37 * hash) + TXID_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getTxid());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto prototype) {
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
     * state - State the NN is in when returning response to the DN
     * txid - Highest transaction ID this NN has seen
     * </pre>
     *
     * Protobuf type {@code hadoop.hdfs.NNHAStatusHeartbeatProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.NNHAStatusHeartbeatProto)
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_NNHAStatusHeartbeatProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_NNHAStatusHeartbeatProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto.class, org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto.newBuilder()
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
        txid_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.internal_static_hadoop_hdfs_NNHAStatusHeartbeatProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto build() {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto result = new org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.state_ = state_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.txid_ = txid_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto.getDefaultInstance()) return this;
        if (other.hasState()) {
          setState(other.getState());
        }
        if (other.hasTxid()) {
          setTxid(other.getTxid());
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
        if (!hasTxid()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto) e.getUnfinishedMessage();
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
       * <code>required .hadoop.hdfs.NNHAStatusHeartbeatProto.State state = 1;</code>
       */
      public boolean hasState() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required .hadoop.hdfs.NNHAStatusHeartbeatProto.State state = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto.State getState() {
        @SuppressWarnings("deprecation")
        org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto.State result = org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto.State.valueOf(state_);
        return result == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto.State.ACTIVE : result;
      }
      /**
       * <code>required .hadoop.hdfs.NNHAStatusHeartbeatProto.State state = 1;</code>
       */
      public Builder setState(org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto.State value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        state_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.NNHAStatusHeartbeatProto.State state = 1;</code>
       */
      public Builder clearState() {
        bitField0_ = (bitField0_ & ~0x00000001);
        state_ = 0;
        onChanged();
        return this;
      }

      private long txid_ ;
      /**
       * <code>required uint64 txid = 2;</code>
       */
      public boolean hasTxid() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required uint64 txid = 2;</code>
       */
      public long getTxid() {
        return txid_;
      }
      /**
       * <code>required uint64 txid = 2;</code>
       */
      public Builder setTxid(long value) {
        bitField0_ |= 0x00000002;
        txid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 txid = 2;</code>
       */
      public Builder clearTxid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        txid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.NNHAStatusHeartbeatProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.NNHAStatusHeartbeatProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<NNHAStatusHeartbeatProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<NNHAStatusHeartbeatProto>() {
      @java.lang.Override
      public NNHAStatusHeartbeatProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new NNHAStatusHeartbeatProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<NNHAStatusHeartbeatProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<NNHAStatusHeartbeatProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.NNHAStatusHeartbeatProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_BlockKeyProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_BlockKeyProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_ExportedBlockKeysProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_ExportedBlockKeysProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_BlockWithLocationsProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_BlockWithLocationsProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_BlocksWithLocationsProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_BlocksWithLocationsProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_RemoteEditLogProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_RemoteEditLogProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_RemoteEditLogManifestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_RemoteEditLogManifestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_NamespaceInfoProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_NamespaceInfoProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_RecoveringBlockProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_RecoveringBlockProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_CheckpointSignatureProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_CheckpointSignatureProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_CheckpointCommandProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_CheckpointCommandProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_NamenodeCommandProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_NamenodeCommandProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_VersionRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_VersionRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_VersionResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_VersionResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_StorageInfoProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_StorageInfoProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_NamenodeRegistrationProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_NamenodeRegistrationProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_NNHAStatusHeartbeatProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_NNHAStatusHeartbeatProto_fieldAccessorTable;

  public static org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020HdfsServer.proto\022\013hadoop.hdfs\032\nhdfs.pr" +
      "oto\032\027HAServiceProtocol.proto\"D\n\rBlockKey" +
      "Proto\022\r\n\005keyId\030\001 \002(\r\022\022\n\nexpiryDate\030\002 \002(\004" +
      "\022\020\n\010keyBytes\030\003 \001(\014\"\304\001\n\026ExportedBlockKeys" +
      "Proto\022\033\n\023isBlockTokenEnabled\030\001 \002(\010\022\031\n\021ke" +
      "yUpdateInterval\030\002 \002(\004\022\025\n\rtokenLifeTime\030\003" +
      " \002(\004\022.\n\ncurrentKey\030\004 \002(\0132\032.hadoop.hdfs.B" +
      "lockKeyProto\022+\n\007allKeys\030\005 \003(\0132\032.hadoop.h" +
      "dfs.BlockKeyProto\"\334\001\n\027BlockWithLocations" +
      "Proto\022&\n\005block\030\001 \002(\0132\027.hadoop.hdfs.Block" +
      "Proto\022\025\n\rdatanodeUuids\030\002 \003(\t\022\024\n\014storageU" +
      "uids\030\003 \003(\t\0223\n\014storageTypes\030\004 \003(\0162\035.hadoo" +
      "p.hdfs.StorageTypeProto\022\017\n\007indices\030\005 \001(\014" +
      "\022\024\n\014dataBlockNum\030\006 \001(\r\022\020\n\010cellSize\030\007 \001(\r" +
      "\"P\n\030BlocksWithLocationsProto\0224\n\006blocks\030\001" +
      " \003(\0132$.hadoop.hdfs.BlockWithLocationsPro" +
      "to\"U\n\022RemoteEditLogProto\022\021\n\tstartTxId\030\001 " +
      "\002(\004\022\017\n\007endTxId\030\002 \002(\004\022\033\n\014isInProgress\030\003 \001" +
      "(\010:\005false\"c\n\032RemoteEditLogManifestProto\022" +
      "-\n\004logs\030\001 \003(\0132\037.hadoop.hdfs.RemoteEditLo" +
      "gProto\022\026\n\016committedTxnId\030\002 \001(\004\"\361\001\n\022Names" +
      "paceInfoProto\022\024\n\014buildVersion\030\001 \002(\t\022\016\n\006u" +
      "nused\030\002 \002(\r\022\023\n\013blockPoolID\030\003 \002(\t\0222\n\013stor" +
      "ageInfo\030\004 \002(\0132\035.hadoop.hdfs.StorageInfoP" +
      "roto\022\027\n\017softwareVersion\030\005 \002(\t\022\027\n\014capabil" +
      "ities\030\006 \001(\004:\0010\022:\n\005state\030\007 \001(\0162+.hadoop.h" +
      "dfs.NNHAStatusHeartbeatProto.State\"\331\001\n\024R" +
      "ecoveringBlockProto\022\023\n\013newGenStamp\030\001 \002(\004" +
      "\022-\n\005block\030\002 \002(\0132\036.hadoop.hdfs.LocatedBlo" +
      "ckProto\022.\n\rtruncateBlock\030\003 \001(\0132\027.hadoop." +
      "hdfs.BlockProto\0227\n\010ecPolicy\030\004 \001(\0132%.hado" +
      "op.hdfs.ErasureCodingPolicyProto\022\024\n\014bloc" +
      "kIndices\030\005 \001(\014\"\235\001\n\030CheckpointSignaturePr" +
      "oto\022\023\n\013blockPoolId\030\001 \002(\t\022 \n\030mostRecentCh" +
      "eckpointTxId\030\002 \002(\004\022\026\n\016curSegmentTxId\030\003 \002" +
      "(\004\0222\n\013storageInfo\030\004 \002(\0132\035.hadoop.hdfs.St" +
      "orageInfoProto\"m\n\026CheckpointCommandProto" +
      "\0228\n\tsignature\030\001 \002(\0132%.hadoop.hdfs.Checkp" +
      "ointSignatureProto\022\031\n\021needToReturnImage\030" +
      "\002 \002(\010\"\314\001\n\024NamenodeCommandProto\022\016\n\006action" +
      "\030\001 \002(\r\0224\n\004type\030\002 \002(\0162&.hadoop.hdfs.Namen" +
      "odeCommandProto.Type\022:\n\rcheckpointCmd\030\003 " +
      "\001(\0132#.hadoop.hdfs.CheckpointCommandProto" +
      "\"2\n\004Type\022\023\n\017NamenodeCommand\020\000\022\025\n\021CheckPo" +
      "intCommand\020\001\"\025\n\023VersionRequestProto\"E\n\024V" +
      "ersionResponseProto\022-\n\004info\030\001 \002(\0132\037.hado" +
      "op.hdfs.NamespaceInfoProto\"_\n\020StorageInf" +
      "oProto\022\025\n\rlayoutVersion\030\001 \002(\r\022\022\n\nnamespc" +
      "eID\030\002 \002(\r\022\021\n\tclusterID\030\003 \002(\t\022\r\n\005cTime\030\004 " +
      "\002(\004\"\211\002\n\031NamenodeRegistrationProto\022\022\n\nrpc" +
      "Address\030\001 \002(\t\022\023\n\013httpAddress\030\002 \002(\t\0222\n\013st" +
      "orageInfo\030\003 \002(\0132\035.hadoop.hdfs.StorageInf" +
      "oProto\022P\n\004role\030\004 \001(\01628.hadoop.hdfs.Namen" +
      "odeRegistrationProto.NamenodeRoleProto:\010" +
      "NAMENODE\"=\n\021NamenodeRoleProto\022\014\n\010NAMENOD" +
      "E\020\001\022\n\n\006BACKUP\020\002\022\016\n\nCHECKPOINT\020\003\"\224\001\n\030NNHA" +
      "StatusHeartbeatProto\022:\n\005state\030\001 \002(\0162+.ha" +
      "doop.hdfs.NNHAStatusHeartbeatProto.State" +
      "\022\014\n\004txid\030\002 \002(\004\".\n\005State\022\n\n\006ACTIVE\020\000\022\013\n\007S" +
      "TANDBY\020\001\022\014\n\010OBSERVER\020\002*L\n\021ReplicaStatePr" +
      "oto\022\r\n\tFINALIZED\020\000\022\007\n\003RBW\020\001\022\007\n\003RWR\020\002\022\007\n\003" +
      "RUR\020\003\022\r\n\tTEMPORARY\020\004B<\n%org.apache.hadoo" +
      "p.hdfs.protocol.protoB\020HdfsServerProtos\240" +
      "\001\001"
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
          org.apache.hadoop.ha.proto.HAServiceProtocolProtos.getDescriptor(),
        }, assigner);
    internal_static_hadoop_hdfs_BlockKeyProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hadoop_hdfs_BlockKeyProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_BlockKeyProto_descriptor,
        new java.lang.String[] { "KeyId", "ExpiryDate", "KeyBytes", });
    internal_static_hadoop_hdfs_ExportedBlockKeysProto_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hadoop_hdfs_ExportedBlockKeysProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_ExportedBlockKeysProto_descriptor,
        new java.lang.String[] { "IsBlockTokenEnabled", "KeyUpdateInterval", "TokenLifeTime", "CurrentKey", "AllKeys", });
    internal_static_hadoop_hdfs_BlockWithLocationsProto_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_hadoop_hdfs_BlockWithLocationsProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_BlockWithLocationsProto_descriptor,
        new java.lang.String[] { "Block", "DatanodeUuids", "StorageUuids", "StorageTypes", "Indices", "DataBlockNum", "CellSize", });
    internal_static_hadoop_hdfs_BlocksWithLocationsProto_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_hadoop_hdfs_BlocksWithLocationsProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_BlocksWithLocationsProto_descriptor,
        new java.lang.String[] { "Blocks", });
    internal_static_hadoop_hdfs_RemoteEditLogProto_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_hadoop_hdfs_RemoteEditLogProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_RemoteEditLogProto_descriptor,
        new java.lang.String[] { "StartTxId", "EndTxId", "IsInProgress", });
    internal_static_hadoop_hdfs_RemoteEditLogManifestProto_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_hadoop_hdfs_RemoteEditLogManifestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_RemoteEditLogManifestProto_descriptor,
        new java.lang.String[] { "Logs", "CommittedTxnId", });
    internal_static_hadoop_hdfs_NamespaceInfoProto_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_hadoop_hdfs_NamespaceInfoProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_NamespaceInfoProto_descriptor,
        new java.lang.String[] { "BuildVersion", "Unused", "BlockPoolID", "StorageInfo", "SoftwareVersion", "Capabilities", "State", });
    internal_static_hadoop_hdfs_RecoveringBlockProto_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_hadoop_hdfs_RecoveringBlockProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_RecoveringBlockProto_descriptor,
        new java.lang.String[] { "NewGenStamp", "Block", "TruncateBlock", "EcPolicy", "BlockIndices", });
    internal_static_hadoop_hdfs_CheckpointSignatureProto_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_hadoop_hdfs_CheckpointSignatureProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_CheckpointSignatureProto_descriptor,
        new java.lang.String[] { "BlockPoolId", "MostRecentCheckpointTxId", "CurSegmentTxId", "StorageInfo", });
    internal_static_hadoop_hdfs_CheckpointCommandProto_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_hadoop_hdfs_CheckpointCommandProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_CheckpointCommandProto_descriptor,
        new java.lang.String[] { "Signature", "NeedToReturnImage", });
    internal_static_hadoop_hdfs_NamenodeCommandProto_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_hadoop_hdfs_NamenodeCommandProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_NamenodeCommandProto_descriptor,
        new java.lang.String[] { "Action", "Type", "CheckpointCmd", });
    internal_static_hadoop_hdfs_VersionRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_hadoop_hdfs_VersionRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_VersionRequestProto_descriptor,
        new java.lang.String[] { });
    internal_static_hadoop_hdfs_VersionResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_hadoop_hdfs_VersionResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_VersionResponseProto_descriptor,
        new java.lang.String[] { "Info", });
    internal_static_hadoop_hdfs_StorageInfoProto_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_hadoop_hdfs_StorageInfoProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_StorageInfoProto_descriptor,
        new java.lang.String[] { "LayoutVersion", "NamespceID", "ClusterID", "CTime", });
    internal_static_hadoop_hdfs_NamenodeRegistrationProto_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_hadoop_hdfs_NamenodeRegistrationProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_NamenodeRegistrationProto_descriptor,
        new java.lang.String[] { "RpcAddress", "HttpAddress", "StorageInfo", "Role", });
    internal_static_hadoop_hdfs_NNHAStatusHeartbeatProto_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_hadoop_hdfs_NNHAStatusHeartbeatProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_NNHAStatusHeartbeatProto_descriptor,
        new java.lang.String[] { "State", "Txid", });
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.getDescriptor();
    org.apache.hadoop.ha.proto.HAServiceProtocolProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
