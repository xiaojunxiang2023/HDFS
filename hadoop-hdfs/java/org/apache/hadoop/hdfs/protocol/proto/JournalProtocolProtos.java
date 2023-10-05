// source: JournalProtocol.proto

package org.apache.hadoop.hdfs.protocol.proto;

public final class JournalProtocolProtos {
  private JournalProtocolProtos() {}
  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite) registry);
  }
  public interface JournalInfoProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.JournalInfoProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * ID of the cluster
     * </pre>
     *
     * <code>required string clusterID = 1;</code>
     */
    boolean hasClusterID();
    /**
     * <pre>
     * ID of the cluster
     * </pre>
     *
     * <code>required string clusterID = 1;</code>
     */
    java.lang.String getClusterID();
    /**
     * <pre>
     * ID of the cluster
     * </pre>
     *
     * <code>required string clusterID = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getClusterIDBytes();

    /**
     * <pre>
     * Layout version
     * </pre>
     *
     * <code>optional uint32 layoutVersion = 2;</code>
     */
    boolean hasLayoutVersion();
    /**
     * <pre>
     * Layout version
     * </pre>
     *
     * <code>optional uint32 layoutVersion = 2;</code>
     */
    int getLayoutVersion();

    /**
     * <pre>
     * Namespace ID
     * </pre>
     *
     * <code>optional uint32 namespaceID = 3;</code>
     */
    boolean hasNamespaceID();
    /**
     * <pre>
     * Namespace ID
     * </pre>
     *
     * <code>optional uint32 namespaceID = 3;</code>
     */
    int getNamespaceID();
  }
  /**
   * <pre>
   **
   * Journal information used by the journal receiver to identify a journal.
   * </pre>
   *
   * Protobuf type {@code hadoop.hdfs.JournalInfoProto}
   */
  public  static final class JournalInfoProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.JournalInfoProto)
      JournalInfoProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use JournalInfoProto.newBuilder() to construct.
    private JournalInfoProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private JournalInfoProto() {
      clusterID_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private JournalInfoProto(
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
              clusterID_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              layoutVersion_ = input.readUInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              namespaceID_ = input.readUInt32();
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
      return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_JournalInfoProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_JournalInfoProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.class, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder.class);
    }

    private int bitField0_;
    public static final int CLUSTERID_FIELD_NUMBER = 1;
    private volatile java.lang.Object clusterID_;
    /**
     * <pre>
     * ID of the cluster
     * </pre>
     *
     * <code>required string clusterID = 1;</code>
     */
    public boolean hasClusterID() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * ID of the cluster
     * </pre>
     *
     * <code>required string clusterID = 1;</code>
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
     * <code>required string clusterID = 1;</code>
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

    public static final int LAYOUTVERSION_FIELD_NUMBER = 2;
    private int layoutVersion_;
    /**
     * <pre>
     * Layout version
     * </pre>
     *
     * <code>optional uint32 layoutVersion = 2;</code>
     */
    public boolean hasLayoutVersion() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Layout version
     * </pre>
     *
     * <code>optional uint32 layoutVersion = 2;</code>
     */
    public int getLayoutVersion() {
      return layoutVersion_;
    }

    public static final int NAMESPACEID_FIELD_NUMBER = 3;
    private int namespaceID_;
    /**
     * <pre>
     * Namespace ID
     * </pre>
     *
     * <code>optional uint32 namespaceID = 3;</code>
     */
    public boolean hasNamespaceID() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Namespace ID
     * </pre>
     *
     * <code>optional uint32 namespaceID = 3;</code>
     */
    public int getNamespaceID() {
      return namespaceID_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasClusterID()) {
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, clusterID_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt32(2, layoutVersion_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeUInt32(3, namespaceID_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, clusterID_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeUInt32Size(2, layoutVersion_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeUInt32Size(3, namespaceID_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto other = (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto) obj;

      if (hasClusterID() != other.hasClusterID()) return false;
      if (hasClusterID()) {
        if (!getClusterID()
            .equals(other.getClusterID())) return false;
      }
      if (hasLayoutVersion() != other.hasLayoutVersion()) return false;
      if (hasLayoutVersion()) {
        if (getLayoutVersion()
            != other.getLayoutVersion()) return false;
      }
      if (hasNamespaceID() != other.hasNamespaceID()) return false;
      if (hasNamespaceID()) {
        if (getNamespaceID()
            != other.getNamespaceID()) return false;
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
      if (hasClusterID()) {
        hash = (37 * hash) + CLUSTERID_FIELD_NUMBER;
        hash = (53 * hash) + getClusterID().hashCode();
      }
      if (hasLayoutVersion()) {
        hash = (37 * hash) + LAYOUTVERSION_FIELD_NUMBER;
        hash = (53 * hash) + getLayoutVersion();
      }
      if (hasNamespaceID()) {
        hash = (37 * hash) + NAMESPACEID_FIELD_NUMBER;
        hash = (53 * hash) + getNamespaceID();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto prototype) {
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
     * Journal information used by the journal receiver to identify a journal.
     * </pre>
     *
     * Protobuf type {@code hadoop.hdfs.JournalInfoProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.JournalInfoProto)
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_JournalInfoProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_JournalInfoProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.class, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.newBuilder()
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
        clusterID_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        layoutVersion_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        namespaceID_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_JournalInfoProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto build() {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto result = new org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.clusterID_ = clusterID_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.layoutVersion_ = layoutVersion_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.namespaceID_ = namespaceID_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance()) return this;
        if (other.hasClusterID()) {
          bitField0_ |= 0x00000001;
          clusterID_ = other.clusterID_;
          onChanged();
        }
        if (other.hasLayoutVersion()) {
          setLayoutVersion(other.getLayoutVersion());
        }
        if (other.hasNamespaceID()) {
          setNamespaceID(other.getNamespaceID());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasClusterID()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object clusterID_ = "";
      /**
       * <pre>
       * ID of the cluster
       * </pre>
       *
       * <code>required string clusterID = 1;</code>
       */
      public boolean hasClusterID() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * ID of the cluster
       * </pre>
       *
       * <code>required string clusterID = 1;</code>
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
       * <code>required string clusterID = 1;</code>
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
       * <code>required string clusterID = 1;</code>
       */
      public Builder setClusterID(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        clusterID_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ID of the cluster
       * </pre>
       *
       * <code>required string clusterID = 1;</code>
       */
      public Builder clearClusterID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        clusterID_ = getDefaultInstance().getClusterID();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ID of the cluster
       * </pre>
       *
       * <code>required string clusterID = 1;</code>
       */
      public Builder setClusterIDBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        clusterID_ = value;
        onChanged();
        return this;
      }

      private int layoutVersion_ ;
      /**
       * <pre>
       * Layout version
       * </pre>
       *
       * <code>optional uint32 layoutVersion = 2;</code>
       */
      public boolean hasLayoutVersion() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * Layout version
       * </pre>
       *
       * <code>optional uint32 layoutVersion = 2;</code>
       */
      public int getLayoutVersion() {
        return layoutVersion_;
      }
      /**
       * <pre>
       * Layout version
       * </pre>
       *
       * <code>optional uint32 layoutVersion = 2;</code>
       */
      public Builder setLayoutVersion(int value) {
        bitField0_ |= 0x00000002;
        layoutVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Layout version
       * </pre>
       *
       * <code>optional uint32 layoutVersion = 2;</code>
       */
      public Builder clearLayoutVersion() {
        bitField0_ = (bitField0_ & ~0x00000002);
        layoutVersion_ = 0;
        onChanged();
        return this;
      }

      private int namespaceID_ ;
      /**
       * <pre>
       * Namespace ID
       * </pre>
       *
       * <code>optional uint32 namespaceID = 3;</code>
       */
      public boolean hasNamespaceID() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * Namespace ID
       * </pre>
       *
       * <code>optional uint32 namespaceID = 3;</code>
       */
      public int getNamespaceID() {
        return namespaceID_;
      }
      /**
       * <pre>
       * Namespace ID
       * </pre>
       *
       * <code>optional uint32 namespaceID = 3;</code>
       */
      public Builder setNamespaceID(int value) {
        bitField0_ |= 0x00000004;
        namespaceID_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Namespace ID
       * </pre>
       *
       * <code>optional uint32 namespaceID = 3;</code>
       */
      public Builder clearNamespaceID() {
        bitField0_ = (bitField0_ & ~0x00000004);
        namespaceID_ = 0;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.JournalInfoProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.JournalInfoProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<JournalInfoProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<JournalInfoProto>() {
      @java.lang.Override
      public JournalInfoProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new JournalInfoProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<JournalInfoProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<JournalInfoProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface JournalRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.JournalRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     */
    boolean hasJournalInfo();
    /**
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto getJournalInfo();
    /**
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder getJournalInfoOrBuilder();

    /**
     * <code>required uint64 firstTxnId = 2;</code>
     */
    boolean hasFirstTxnId();
    /**
     * <code>required uint64 firstTxnId = 2;</code>
     */
    long getFirstTxnId();

    /**
     * <code>required uint32 numTxns = 3;</code>
     */
    boolean hasNumTxns();
    /**
     * <code>required uint32 numTxns = 3;</code>
     */
    int getNumTxns();

    /**
     * <code>required bytes records = 4;</code>
     */
    boolean hasRecords();
    /**
     * <code>required bytes records = 4;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString getRecords();

    /**
     * <code>required uint64 epoch = 5;</code>
     */
    boolean hasEpoch();
    /**
     * <code>required uint64 epoch = 5;</code>
     */
    long getEpoch();
  }
  /**
   * <pre>
   **
   * journalInfo - the information about the journal
   * firstTxnId - the first txid in the journal records
   * numTxns - Number of transactions in editlog
   * records - bytes containing serialized journal records
   * epoch - change to this represents change of journal writer
   * </pre>
   *
   * Protobuf type {@code hadoop.hdfs.JournalRequestProto}
   */
  public  static final class JournalRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.JournalRequestProto)
      JournalRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use JournalRequestProto.newBuilder() to construct.
    private JournalRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private JournalRequestProto() {
      records_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private JournalRequestProto(
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
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = journalInfo_.toBuilder();
              }
              journalInfo_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(journalInfo_);
                journalInfo_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              firstTxnId_ = input.readUInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              numTxns_ = input.readUInt32();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              records_ = input.readBytes();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              epoch_ = input.readUInt64();
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
      return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_JournalRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_JournalRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto.Builder.class);
    }

    private int bitField0_;
    public static final int JOURNALINFO_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto journalInfo_;
    /**
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     */
    public boolean hasJournalInfo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto getJournalInfo() {
      return journalInfo_ == null ? org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance() : journalInfo_;
    }
    /**
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder getJournalInfoOrBuilder() {
      return journalInfo_ == null ? org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance() : journalInfo_;
    }

    public static final int FIRSTTXNID_FIELD_NUMBER = 2;
    private long firstTxnId_;
    /**
     * <code>required uint64 firstTxnId = 2;</code>
     */
    public boolean hasFirstTxnId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required uint64 firstTxnId = 2;</code>
     */
    public long getFirstTxnId() {
      return firstTxnId_;
    }

    public static final int NUMTXNS_FIELD_NUMBER = 3;
    private int numTxns_;
    /**
     * <code>required uint32 numTxns = 3;</code>
     */
    public boolean hasNumTxns() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required uint32 numTxns = 3;</code>
     */
    public int getNumTxns() {
      return numTxns_;
    }

    public static final int RECORDS_FIELD_NUMBER = 4;
    private org.apache.hadoop.thirdparty.protobuf.ByteString records_;
    /**
     * <code>required bytes records = 4;</code>
     */
    public boolean hasRecords() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>required bytes records = 4;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString getRecords() {
      return records_;
    }

    public static final int EPOCH_FIELD_NUMBER = 5;
    private long epoch_;
    /**
     * <code>required uint64 epoch = 5;</code>
     */
    public boolean hasEpoch() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>required uint64 epoch = 5;</code>
     */
    public long getEpoch() {
      return epoch_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasJournalInfo()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasFirstTxnId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasNumTxns()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRecords()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasEpoch()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getJournalInfo().isInitialized()) {
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
        output.writeMessage(1, getJournalInfo());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt64(2, firstTxnId_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeUInt32(3, numTxns_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeBytes(4, records_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        output.writeUInt64(5, epoch_);
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
          .computeMessageSize(1, getJournalInfo());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeUInt64Size(2, firstTxnId_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeUInt32Size(3, numTxns_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeBytesSize(4, records_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeUInt64Size(5, epoch_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto) obj;

      if (hasJournalInfo() != other.hasJournalInfo()) return false;
      if (hasJournalInfo()) {
        if (!getJournalInfo()
            .equals(other.getJournalInfo())) return false;
      }
      if (hasFirstTxnId() != other.hasFirstTxnId()) return false;
      if (hasFirstTxnId()) {
        if (getFirstTxnId()
            != other.getFirstTxnId()) return false;
      }
      if (hasNumTxns() != other.hasNumTxns()) return false;
      if (hasNumTxns()) {
        if (getNumTxns()
            != other.getNumTxns()) return false;
      }
      if (hasRecords() != other.hasRecords()) return false;
      if (hasRecords()) {
        if (!getRecords()
            .equals(other.getRecords())) return false;
      }
      if (hasEpoch() != other.hasEpoch()) return false;
      if (hasEpoch()) {
        if (getEpoch()
            != other.getEpoch()) return false;
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
      if (hasJournalInfo()) {
        hash = (37 * hash) + JOURNALINFO_FIELD_NUMBER;
        hash = (53 * hash) + getJournalInfo().hashCode();
      }
      if (hasFirstTxnId()) {
        hash = (37 * hash) + FIRSTTXNID_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getFirstTxnId());
      }
      if (hasNumTxns()) {
        hash = (37 * hash) + NUMTXNS_FIELD_NUMBER;
        hash = (53 * hash) + getNumTxns();
      }
      if (hasRecords()) {
        hash = (37 * hash) + RECORDS_FIELD_NUMBER;
        hash = (53 * hash) + getRecords().hashCode();
      }
      if (hasEpoch()) {
        hash = (37 * hash) + EPOCH_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getEpoch());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto prototype) {
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
     * journalInfo - the information about the journal
     * firstTxnId - the first txid in the journal records
     * numTxns - Number of transactions in editlog
     * records - bytes containing serialized journal records
     * epoch - change to this represents change of journal writer
     * </pre>
     *
     * Protobuf type {@code hadoop.hdfs.JournalRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.JournalRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_JournalRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_JournalRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto.newBuilder()
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
          getJournalInfoFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (journalInfoBuilder_ == null) {
          journalInfo_ = null;
        } else {
          journalInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        firstTxnId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        numTxns_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        records_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        epoch_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_JournalRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (journalInfoBuilder_ == null) {
            result.journalInfo_ = journalInfo_;
          } else {
            result.journalInfo_ = journalInfoBuilder_.build();
          }
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.firstTxnId_ = firstTxnId_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.numTxns_ = numTxns_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          to_bitField0_ |= 0x00000008;
        }
        result.records_ = records_;
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.epoch_ = epoch_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto.getDefaultInstance()) return this;
        if (other.hasJournalInfo()) {
          mergeJournalInfo(other.getJournalInfo());
        }
        if (other.hasFirstTxnId()) {
          setFirstTxnId(other.getFirstTxnId());
        }
        if (other.hasNumTxns()) {
          setNumTxns(other.getNumTxns());
        }
        if (other.hasRecords()) {
          setRecords(other.getRecords());
        }
        if (other.hasEpoch()) {
          setEpoch(other.getEpoch());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasJournalInfo()) {
          return false;
        }
        if (!hasFirstTxnId()) {
          return false;
        }
        if (!hasNumTxns()) {
          return false;
        }
        if (!hasRecords()) {
          return false;
        }
        if (!hasEpoch()) {
          return false;
        }
        if (!getJournalInfo().isInitialized()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto journalInfo_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder> journalInfoBuilder_;
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      public boolean hasJournalInfo() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto getJournalInfo() {
        if (journalInfoBuilder_ == null) {
          return journalInfo_ == null ? org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance() : journalInfo_;
        } else {
          return journalInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      public Builder setJournalInfo(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto value) {
        if (journalInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          journalInfo_ = value;
          onChanged();
        } else {
          journalInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      public Builder setJournalInfo(
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder builderForValue) {
        if (journalInfoBuilder_ == null) {
          journalInfo_ = builderForValue.build();
          onChanged();
        } else {
          journalInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      public Builder mergeJournalInfo(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto value) {
        if (journalInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              journalInfo_ != null &&
              journalInfo_ != org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance()) {
            journalInfo_ =
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.newBuilder(journalInfo_).mergeFrom(value).buildPartial();
          } else {
            journalInfo_ = value;
          }
          onChanged();
        } else {
          journalInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      public Builder clearJournalInfo() {
        if (journalInfoBuilder_ == null) {
          journalInfo_ = null;
          onChanged();
        } else {
          journalInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder getJournalInfoBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getJournalInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder getJournalInfoOrBuilder() {
        if (journalInfoBuilder_ != null) {
          return journalInfoBuilder_.getMessageOrBuilder();
        } else {
          return journalInfo_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance() : journalInfo_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder> 
          getJournalInfoFieldBuilder() {
        if (journalInfoBuilder_ == null) {
          journalInfoBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder>(
                  getJournalInfo(),
                  getParentForChildren(),
                  isClean());
          journalInfo_ = null;
        }
        return journalInfoBuilder_;
      }

      private long firstTxnId_ ;
      /**
       * <code>required uint64 firstTxnId = 2;</code>
       */
      public boolean hasFirstTxnId() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required uint64 firstTxnId = 2;</code>
       */
      public long getFirstTxnId() {
        return firstTxnId_;
      }
      /**
       * <code>required uint64 firstTxnId = 2;</code>
       */
      public Builder setFirstTxnId(long value) {
        bitField0_ |= 0x00000002;
        firstTxnId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 firstTxnId = 2;</code>
       */
      public Builder clearFirstTxnId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        firstTxnId_ = 0L;
        onChanged();
        return this;
      }

      private int numTxns_ ;
      /**
       * <code>required uint32 numTxns = 3;</code>
       */
      public boolean hasNumTxns() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>required uint32 numTxns = 3;</code>
       */
      public int getNumTxns() {
        return numTxns_;
      }
      /**
       * <code>required uint32 numTxns = 3;</code>
       */
      public Builder setNumTxns(int value) {
        bitField0_ |= 0x00000004;
        numTxns_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 numTxns = 3;</code>
       */
      public Builder clearNumTxns() {
        bitField0_ = (bitField0_ & ~0x00000004);
        numTxns_ = 0;
        onChanged();
        return this;
      }

      private org.apache.hadoop.thirdparty.protobuf.ByteString records_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
      /**
       * <code>required bytes records = 4;</code>
       */
      public boolean hasRecords() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>required bytes records = 4;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString getRecords() {
        return records_;
      }
      /**
       * <code>required bytes records = 4;</code>
       */
      public Builder setRecords(org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        records_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bytes records = 4;</code>
       */
      public Builder clearRecords() {
        bitField0_ = (bitField0_ & ~0x00000008);
        records_ = getDefaultInstance().getRecords();
        onChanged();
        return this;
      }

      private long epoch_ ;
      /**
       * <code>required uint64 epoch = 5;</code>
       */
      public boolean hasEpoch() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <code>required uint64 epoch = 5;</code>
       */
      public long getEpoch() {
        return epoch_;
      }
      /**
       * <code>required uint64 epoch = 5;</code>
       */
      public Builder setEpoch(long value) {
        bitField0_ |= 0x00000010;
        epoch_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 epoch = 5;</code>
       */
      public Builder clearEpoch() {
        bitField0_ = (bitField0_ & ~0x00000010);
        epoch_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.JournalRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.JournalRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<JournalRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<JournalRequestProto>() {
      @java.lang.Override
      public JournalRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new JournalRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<JournalRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<JournalRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface JournalResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.JournalResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   **
   * void response
   * </pre>
   *
   * Protobuf type {@code hadoop.hdfs.JournalResponseProto}
   */
  public  static final class JournalResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.JournalResponseProto)
      JournalResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use JournalResponseProto.newBuilder() to construct.
    private JournalResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private JournalResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private JournalResponseProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_JournalResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_JournalResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto.Builder.class);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto prototype) {
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
     * void response
     * </pre>
     *
     * Protobuf type {@code hadoop.hdfs.JournalResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.JournalResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_JournalResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_JournalResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_JournalResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto(this);
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto) e.getUnfinishedMessage();
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.JournalResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.JournalResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<JournalResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<JournalResponseProto>() {
      @java.lang.Override
      public JournalResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new JournalResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<JournalResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<JournalResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface StartLogSegmentRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.StartLogSegmentRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Info about the journal
     * </pre>
     *
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     */
    boolean hasJournalInfo();
    /**
     * <pre>
     * Info about the journal
     * </pre>
     *
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto getJournalInfo();
    /**
     * <pre>
     * Info about the journal
     * </pre>
     *
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder getJournalInfoOrBuilder();

    /**
     * <pre>
     * Transaction ID
     * </pre>
     *
     * <code>required uint64 txid = 2;</code>
     */
    boolean hasTxid();
    /**
     * <pre>
     * Transaction ID
     * </pre>
     *
     * <code>required uint64 txid = 2;</code>
     */
    long getTxid();

    /**
     * <code>required uint64 epoch = 3;</code>
     */
    boolean hasEpoch();
    /**
     * <code>required uint64 epoch = 3;</code>
     */
    long getEpoch();
  }
  /**
   * <pre>
   **
   * journalInfo - the information about the journal
   * txid - first txid in the new log
   * </pre>
   *
   * Protobuf type {@code hadoop.hdfs.StartLogSegmentRequestProto}
   */
  public  static final class StartLogSegmentRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.StartLogSegmentRequestProto)
      StartLogSegmentRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StartLogSegmentRequestProto.newBuilder() to construct.
    private StartLogSegmentRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StartLogSegmentRequestProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private StartLogSegmentRequestProto(
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
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = journalInfo_.toBuilder();
              }
              journalInfo_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(journalInfo_);
                journalInfo_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              txid_ = input.readUInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              epoch_ = input.readUInt64();
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
      return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_StartLogSegmentRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_StartLogSegmentRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto.Builder.class);
    }

    private int bitField0_;
    public static final int JOURNALINFO_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto journalInfo_;
    /**
     * <pre>
     * Info about the journal
     * </pre>
     *
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     */
    public boolean hasJournalInfo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Info about the journal
     * </pre>
     *
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto getJournalInfo() {
      return journalInfo_ == null ? org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance() : journalInfo_;
    }
    /**
     * <pre>
     * Info about the journal
     * </pre>
     *
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder getJournalInfoOrBuilder() {
      return journalInfo_ == null ? org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance() : journalInfo_;
    }

    public static final int TXID_FIELD_NUMBER = 2;
    private long txid_;
    /**
     * <pre>
     * Transaction ID
     * </pre>
     *
     * <code>required uint64 txid = 2;</code>
     */
    public boolean hasTxid() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Transaction ID
     * </pre>
     *
     * <code>required uint64 txid = 2;</code>
     */
    public long getTxid() {
      return txid_;
    }

    public static final int EPOCH_FIELD_NUMBER = 3;
    private long epoch_;
    /**
     * <code>required uint64 epoch = 3;</code>
     */
    public boolean hasEpoch() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required uint64 epoch = 3;</code>
     */
    public long getEpoch() {
      return epoch_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasJournalInfo()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTxid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasEpoch()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getJournalInfo().isInitialized()) {
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
        output.writeMessage(1, getJournalInfo());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt64(2, txid_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeUInt64(3, epoch_);
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
          .computeMessageSize(1, getJournalInfo());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeUInt64Size(2, txid_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeUInt64Size(3, epoch_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto) obj;

      if (hasJournalInfo() != other.hasJournalInfo()) return false;
      if (hasJournalInfo()) {
        if (!getJournalInfo()
            .equals(other.getJournalInfo())) return false;
      }
      if (hasTxid() != other.hasTxid()) return false;
      if (hasTxid()) {
        if (getTxid()
            != other.getTxid()) return false;
      }
      if (hasEpoch() != other.hasEpoch()) return false;
      if (hasEpoch()) {
        if (getEpoch()
            != other.getEpoch()) return false;
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
      if (hasJournalInfo()) {
        hash = (37 * hash) + JOURNALINFO_FIELD_NUMBER;
        hash = (53 * hash) + getJournalInfo().hashCode();
      }
      if (hasTxid()) {
        hash = (37 * hash) + TXID_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getTxid());
      }
      if (hasEpoch()) {
        hash = (37 * hash) + EPOCH_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getEpoch());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto prototype) {
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
     * journalInfo - the information about the journal
     * txid - first txid in the new log
     * </pre>
     *
     * Protobuf type {@code hadoop.hdfs.StartLogSegmentRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.StartLogSegmentRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_StartLogSegmentRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_StartLogSegmentRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto.newBuilder()
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
          getJournalInfoFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (journalInfoBuilder_ == null) {
          journalInfo_ = null;
        } else {
          journalInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        txid_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        epoch_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_StartLogSegmentRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (journalInfoBuilder_ == null) {
            result.journalInfo_ = journalInfo_;
          } else {
            result.journalInfo_ = journalInfoBuilder_.build();
          }
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.txid_ = txid_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.epoch_ = epoch_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto.getDefaultInstance()) return this;
        if (other.hasJournalInfo()) {
          mergeJournalInfo(other.getJournalInfo());
        }
        if (other.hasTxid()) {
          setTxid(other.getTxid());
        }
        if (other.hasEpoch()) {
          setEpoch(other.getEpoch());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasJournalInfo()) {
          return false;
        }
        if (!hasTxid()) {
          return false;
        }
        if (!hasEpoch()) {
          return false;
        }
        if (!getJournalInfo().isInitialized()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto journalInfo_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder> journalInfoBuilder_;
      /**
       * <pre>
       * Info about the journal
       * </pre>
       *
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      public boolean hasJournalInfo() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Info about the journal
       * </pre>
       *
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto getJournalInfo() {
        if (journalInfoBuilder_ == null) {
          return journalInfo_ == null ? org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance() : journalInfo_;
        } else {
          return journalInfoBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * Info about the journal
       * </pre>
       *
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      public Builder setJournalInfo(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto value) {
        if (journalInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          journalInfo_ = value;
          onChanged();
        } else {
          journalInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <pre>
       * Info about the journal
       * </pre>
       *
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      public Builder setJournalInfo(
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder builderForValue) {
        if (journalInfoBuilder_ == null) {
          journalInfo_ = builderForValue.build();
          onChanged();
        } else {
          journalInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <pre>
       * Info about the journal
       * </pre>
       *
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      public Builder mergeJournalInfo(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto value) {
        if (journalInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              journalInfo_ != null &&
              journalInfo_ != org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance()) {
            journalInfo_ =
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.newBuilder(journalInfo_).mergeFrom(value).buildPartial();
          } else {
            journalInfo_ = value;
          }
          onChanged();
        } else {
          journalInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <pre>
       * Info about the journal
       * </pre>
       *
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      public Builder clearJournalInfo() {
        if (journalInfoBuilder_ == null) {
          journalInfo_ = null;
          onChanged();
        } else {
          journalInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <pre>
       * Info about the journal
       * </pre>
       *
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder getJournalInfoBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getJournalInfoFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * Info about the journal
       * </pre>
       *
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder getJournalInfoOrBuilder() {
        if (journalInfoBuilder_ != null) {
          return journalInfoBuilder_.getMessageOrBuilder();
        } else {
          return journalInfo_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance() : journalInfo_;
        }
      }
      /**
       * <pre>
       * Info about the journal
       * </pre>
       *
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder> 
          getJournalInfoFieldBuilder() {
        if (journalInfoBuilder_ == null) {
          journalInfoBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder>(
                  getJournalInfo(),
                  getParentForChildren(),
                  isClean());
          journalInfo_ = null;
        }
        return journalInfoBuilder_;
      }

      private long txid_ ;
      /**
       * <pre>
       * Transaction ID
       * </pre>
       *
       * <code>required uint64 txid = 2;</code>
       */
      public boolean hasTxid() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * Transaction ID
       * </pre>
       *
       * <code>required uint64 txid = 2;</code>
       */
      public long getTxid() {
        return txid_;
      }
      /**
       * <pre>
       * Transaction ID
       * </pre>
       *
       * <code>required uint64 txid = 2;</code>
       */
      public Builder setTxid(long value) {
        bitField0_ |= 0x00000002;
        txid_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Transaction ID
       * </pre>
       *
       * <code>required uint64 txid = 2;</code>
       */
      public Builder clearTxid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        txid_ = 0L;
        onChanged();
        return this;
      }

      private long epoch_ ;
      /**
       * <code>required uint64 epoch = 3;</code>
       */
      public boolean hasEpoch() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>required uint64 epoch = 3;</code>
       */
      public long getEpoch() {
        return epoch_;
      }
      /**
       * <code>required uint64 epoch = 3;</code>
       */
      public Builder setEpoch(long value) {
        bitField0_ |= 0x00000004;
        epoch_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 epoch = 3;</code>
       */
      public Builder clearEpoch() {
        bitField0_ = (bitField0_ & ~0x00000004);
        epoch_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.StartLogSegmentRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.StartLogSegmentRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<StartLogSegmentRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<StartLogSegmentRequestProto>() {
      @java.lang.Override
      public StartLogSegmentRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new StartLogSegmentRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<StartLogSegmentRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<StartLogSegmentRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface StartLogSegmentResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.StartLogSegmentResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   **
   * void response
   * </pre>
   *
   * Protobuf type {@code hadoop.hdfs.StartLogSegmentResponseProto}
   */
  public  static final class StartLogSegmentResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.StartLogSegmentResponseProto)
      StartLogSegmentResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StartLogSegmentResponseProto.newBuilder() to construct.
    private StartLogSegmentResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StartLogSegmentResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private StartLogSegmentResponseProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_StartLogSegmentResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_StartLogSegmentResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto.Builder.class);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto prototype) {
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
     * void response
     * </pre>
     *
     * Protobuf type {@code hadoop.hdfs.StartLogSegmentResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.StartLogSegmentResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_StartLogSegmentResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_StartLogSegmentResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_StartLogSegmentResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto(this);
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto) e.getUnfinishedMessage();
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.StartLogSegmentResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.StartLogSegmentResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<StartLogSegmentResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<StartLogSegmentResponseProto>() {
      @java.lang.Override
      public StartLogSegmentResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new StartLogSegmentResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<StartLogSegmentResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<StartLogSegmentResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface FenceRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.FenceRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Info about the journal
     * </pre>
     *
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     */
    boolean hasJournalInfo();
    /**
     * <pre>
     * Info about the journal
     * </pre>
     *
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto getJournalInfo();
    /**
     * <pre>
     * Info about the journal
     * </pre>
     *
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder getJournalInfoOrBuilder();

    /**
     * <pre>
     * Epoch - change indicates change in writer
     * </pre>
     *
     * <code>required uint64 epoch = 2;</code>
     */
    boolean hasEpoch();
    /**
     * <pre>
     * Epoch - change indicates change in writer
     * </pre>
     *
     * <code>required uint64 epoch = 2;</code>
     */
    long getEpoch();

    /**
     * <pre>
     * Info about fencer for debugging
     * </pre>
     *
     * <code>optional string fencerInfo = 3;</code>
     */
    boolean hasFencerInfo();
    /**
     * <pre>
     * Info about fencer for debugging
     * </pre>
     *
     * <code>optional string fencerInfo = 3;</code>
     */
    java.lang.String getFencerInfo();
    /**
     * <pre>
     * Info about fencer for debugging
     * </pre>
     *
     * <code>optional string fencerInfo = 3;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getFencerInfoBytes();
  }
  /**
   * <pre>
   **
   * journalInfo - the information about the journal
   * txid - first txid in the new log
   * </pre>
   *
   * Protobuf type {@code hadoop.hdfs.FenceRequestProto}
   */
  public  static final class FenceRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.FenceRequestProto)
      FenceRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FenceRequestProto.newBuilder() to construct.
    private FenceRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FenceRequestProto() {
      fencerInfo_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FenceRequestProto(
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
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = journalInfo_.toBuilder();
              }
              journalInfo_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(journalInfo_);
                journalInfo_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              epoch_ = input.readUInt64();
              break;
            }
            case 26: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              fencerInfo_ = bs;
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
      return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_FenceRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_FenceRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto.Builder.class);
    }

    private int bitField0_;
    public static final int JOURNALINFO_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto journalInfo_;
    /**
     * <pre>
     * Info about the journal
     * </pre>
     *
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     */
    public boolean hasJournalInfo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Info about the journal
     * </pre>
     *
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto getJournalInfo() {
      return journalInfo_ == null ? org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance() : journalInfo_;
    }
    /**
     * <pre>
     * Info about the journal
     * </pre>
     *
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder getJournalInfoOrBuilder() {
      return journalInfo_ == null ? org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance() : journalInfo_;
    }

    public static final int EPOCH_FIELD_NUMBER = 2;
    private long epoch_;
    /**
     * <pre>
     * Epoch - change indicates change in writer
     * </pre>
     *
     * <code>required uint64 epoch = 2;</code>
     */
    public boolean hasEpoch() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Epoch - change indicates change in writer
     * </pre>
     *
     * <code>required uint64 epoch = 2;</code>
     */
    public long getEpoch() {
      return epoch_;
    }

    public static final int FENCERINFO_FIELD_NUMBER = 3;
    private volatile java.lang.Object fencerInfo_;
    /**
     * <pre>
     * Info about fencer for debugging
     * </pre>
     *
     * <code>optional string fencerInfo = 3;</code>
     */
    public boolean hasFencerInfo() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Info about fencer for debugging
     * </pre>
     *
     * <code>optional string fencerInfo = 3;</code>
     */
    public java.lang.String getFencerInfo() {
      java.lang.Object ref = fencerInfo_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          fencerInfo_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * Info about fencer for debugging
     * </pre>
     *
     * <code>optional string fencerInfo = 3;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getFencerInfoBytes() {
      java.lang.Object ref = fencerInfo_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fencerInfo_ = b;
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

      if (!hasJournalInfo()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasEpoch()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getJournalInfo().isInitialized()) {
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
        output.writeMessage(1, getJournalInfo());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt64(2, epoch_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 3, fencerInfo_);
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
          .computeMessageSize(1, getJournalInfo());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeUInt64Size(2, epoch_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(3, fencerInfo_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto) obj;

      if (hasJournalInfo() != other.hasJournalInfo()) return false;
      if (hasJournalInfo()) {
        if (!getJournalInfo()
            .equals(other.getJournalInfo())) return false;
      }
      if (hasEpoch() != other.hasEpoch()) return false;
      if (hasEpoch()) {
        if (getEpoch()
            != other.getEpoch()) return false;
      }
      if (hasFencerInfo() != other.hasFencerInfo()) return false;
      if (hasFencerInfo()) {
        if (!getFencerInfo()
            .equals(other.getFencerInfo())) return false;
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
      if (hasJournalInfo()) {
        hash = (37 * hash) + JOURNALINFO_FIELD_NUMBER;
        hash = (53 * hash) + getJournalInfo().hashCode();
      }
      if (hasEpoch()) {
        hash = (37 * hash) + EPOCH_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getEpoch());
      }
      if (hasFencerInfo()) {
        hash = (37 * hash) + FENCERINFO_FIELD_NUMBER;
        hash = (53 * hash) + getFencerInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto prototype) {
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
     * journalInfo - the information about the journal
     * txid - first txid in the new log
     * </pre>
     *
     * Protobuf type {@code hadoop.hdfs.FenceRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.FenceRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_FenceRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_FenceRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto.newBuilder()
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
          getJournalInfoFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (journalInfoBuilder_ == null) {
          journalInfo_ = null;
        } else {
          journalInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        epoch_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        fencerInfo_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_FenceRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (journalInfoBuilder_ == null) {
            result.journalInfo_ = journalInfo_;
          } else {
            result.journalInfo_ = journalInfoBuilder_.build();
          }
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.epoch_ = epoch_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.fencerInfo_ = fencerInfo_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto.getDefaultInstance()) return this;
        if (other.hasJournalInfo()) {
          mergeJournalInfo(other.getJournalInfo());
        }
        if (other.hasEpoch()) {
          setEpoch(other.getEpoch());
        }
        if (other.hasFencerInfo()) {
          bitField0_ |= 0x00000004;
          fencerInfo_ = other.fencerInfo_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasJournalInfo()) {
          return false;
        }
        if (!hasEpoch()) {
          return false;
        }
        if (!getJournalInfo().isInitialized()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto journalInfo_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder> journalInfoBuilder_;
      /**
       * <pre>
       * Info about the journal
       * </pre>
       *
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      public boolean hasJournalInfo() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Info about the journal
       * </pre>
       *
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto getJournalInfo() {
        if (journalInfoBuilder_ == null) {
          return journalInfo_ == null ? org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance() : journalInfo_;
        } else {
          return journalInfoBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * Info about the journal
       * </pre>
       *
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      public Builder setJournalInfo(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto value) {
        if (journalInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          journalInfo_ = value;
          onChanged();
        } else {
          journalInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <pre>
       * Info about the journal
       * </pre>
       *
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      public Builder setJournalInfo(
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder builderForValue) {
        if (journalInfoBuilder_ == null) {
          journalInfo_ = builderForValue.build();
          onChanged();
        } else {
          journalInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <pre>
       * Info about the journal
       * </pre>
       *
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      public Builder mergeJournalInfo(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto value) {
        if (journalInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              journalInfo_ != null &&
              journalInfo_ != org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance()) {
            journalInfo_ =
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.newBuilder(journalInfo_).mergeFrom(value).buildPartial();
          } else {
            journalInfo_ = value;
          }
          onChanged();
        } else {
          journalInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <pre>
       * Info about the journal
       * </pre>
       *
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      public Builder clearJournalInfo() {
        if (journalInfoBuilder_ == null) {
          journalInfo_ = null;
          onChanged();
        } else {
          journalInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <pre>
       * Info about the journal
       * </pre>
       *
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder getJournalInfoBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getJournalInfoFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * Info about the journal
       * </pre>
       *
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder getJournalInfoOrBuilder() {
        if (journalInfoBuilder_ != null) {
          return journalInfoBuilder_.getMessageOrBuilder();
        } else {
          return journalInfo_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance() : journalInfo_;
        }
      }
      /**
       * <pre>
       * Info about the journal
       * </pre>
       *
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder> 
          getJournalInfoFieldBuilder() {
        if (journalInfoBuilder_ == null) {
          journalInfoBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder>(
                  getJournalInfo(),
                  getParentForChildren(),
                  isClean());
          journalInfo_ = null;
        }
        return journalInfoBuilder_;
      }

      private long epoch_ ;
      /**
       * <pre>
       * Epoch - change indicates change in writer
       * </pre>
       *
       * <code>required uint64 epoch = 2;</code>
       */
      public boolean hasEpoch() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * Epoch - change indicates change in writer
       * </pre>
       *
       * <code>required uint64 epoch = 2;</code>
       */
      public long getEpoch() {
        return epoch_;
      }
      /**
       * <pre>
       * Epoch - change indicates change in writer
       * </pre>
       *
       * <code>required uint64 epoch = 2;</code>
       */
      public Builder setEpoch(long value) {
        bitField0_ |= 0x00000002;
        epoch_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Epoch - change indicates change in writer
       * </pre>
       *
       * <code>required uint64 epoch = 2;</code>
       */
      public Builder clearEpoch() {
        bitField0_ = (bitField0_ & ~0x00000002);
        epoch_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object fencerInfo_ = "";
      /**
       * <pre>
       * Info about fencer for debugging
       * </pre>
       *
       * <code>optional string fencerInfo = 3;</code>
       */
      public boolean hasFencerInfo() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * Info about fencer for debugging
       * </pre>
       *
       * <code>optional string fencerInfo = 3;</code>
       */
      public java.lang.String getFencerInfo() {
        java.lang.Object ref = fencerInfo_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            fencerInfo_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Info about fencer for debugging
       * </pre>
       *
       * <code>optional string fencerInfo = 3;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getFencerInfoBytes() {
        java.lang.Object ref = fencerInfo_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          fencerInfo_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Info about fencer for debugging
       * </pre>
       *
       * <code>optional string fencerInfo = 3;</code>
       */
      public Builder setFencerInfo(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        fencerInfo_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Info about fencer for debugging
       * </pre>
       *
       * <code>optional string fencerInfo = 3;</code>
       */
      public Builder clearFencerInfo() {
        bitField0_ = (bitField0_ & ~0x00000004);
        fencerInfo_ = getDefaultInstance().getFencerInfo();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Info about fencer for debugging
       * </pre>
       *
       * <code>optional string fencerInfo = 3;</code>
       */
      public Builder setFencerInfoBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        fencerInfo_ = value;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.FenceRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.FenceRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<FenceRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<FenceRequestProto>() {
      @java.lang.Override
      public FenceRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new FenceRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<FenceRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<FenceRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface FenceResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.FenceResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>optional uint64 previousEpoch = 1;</code>
     */
    boolean hasPreviousEpoch();
    /**
     * <code>optional uint64 previousEpoch = 1;</code>
     */
    long getPreviousEpoch();

    /**
     * <code>optional uint64 lastTransactionId = 2;</code>
     */
    boolean hasLastTransactionId();
    /**
     * <code>optional uint64 lastTransactionId = 2;</code>
     */
    long getLastTransactionId();

    /**
     * <code>optional bool inSync = 3;</code>
     */
    boolean hasInSync();
    /**
     * <code>optional bool inSync = 3;</code>
     */
    boolean getInSync();
  }
  /**
   * <pre>
   **
   * previousEpoch - previous epoch if any or zero
   * lastTransactionId - last valid transaction Id in the journal
   * inSync - if all journal segments are available and in sync
   * </pre>
   *
   * Protobuf type {@code hadoop.hdfs.FenceResponseProto}
   */
  public  static final class FenceResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.FenceResponseProto)
      FenceResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FenceResponseProto.newBuilder() to construct.
    private FenceResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FenceResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FenceResponseProto(
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
              previousEpoch_ = input.readUInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              lastTransactionId_ = input.readUInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              inSync_ = input.readBool();
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
      return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_FenceResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_FenceResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto.Builder.class);
    }

    private int bitField0_;
    public static final int PREVIOUSEPOCH_FIELD_NUMBER = 1;
    private long previousEpoch_;
    /**
     * <code>optional uint64 previousEpoch = 1;</code>
     */
    public boolean hasPreviousEpoch() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional uint64 previousEpoch = 1;</code>
     */
    public long getPreviousEpoch() {
      return previousEpoch_;
    }

    public static final int LASTTRANSACTIONID_FIELD_NUMBER = 2;
    private long lastTransactionId_;
    /**
     * <code>optional uint64 lastTransactionId = 2;</code>
     */
    public boolean hasLastTransactionId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional uint64 lastTransactionId = 2;</code>
     */
    public long getLastTransactionId() {
      return lastTransactionId_;
    }

    public static final int INSYNC_FIELD_NUMBER = 3;
    private boolean inSync_;
    /**
     * <code>optional bool inSync = 3;</code>
     */
    public boolean hasInSync() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional bool inSync = 3;</code>
     */
    public boolean getInSync() {
      return inSync_;
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
        output.writeUInt64(1, previousEpoch_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt64(2, lastTransactionId_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeBool(3, inSync_);
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
          .computeUInt64Size(1, previousEpoch_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeUInt64Size(2, lastTransactionId_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeBoolSize(3, inSync_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto) obj;

      if (hasPreviousEpoch() != other.hasPreviousEpoch()) return false;
      if (hasPreviousEpoch()) {
        if (getPreviousEpoch()
            != other.getPreviousEpoch()) return false;
      }
      if (hasLastTransactionId() != other.hasLastTransactionId()) return false;
      if (hasLastTransactionId()) {
        if (getLastTransactionId()
            != other.getLastTransactionId()) return false;
      }
      if (hasInSync() != other.hasInSync()) return false;
      if (hasInSync()) {
        if (getInSync()
            != other.getInSync()) return false;
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
      if (hasPreviousEpoch()) {
        hash = (37 * hash) + PREVIOUSEPOCH_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getPreviousEpoch());
      }
      if (hasLastTransactionId()) {
        hash = (37 * hash) + LASTTRANSACTIONID_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getLastTransactionId());
      }
      if (hasInSync()) {
        hash = (37 * hash) + INSYNC_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashBoolean(
            getInSync());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto prototype) {
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
     * previousEpoch - previous epoch if any or zero
     * lastTransactionId - last valid transaction Id in the journal
     * inSync - if all journal segments are available and in sync
     * </pre>
     *
     * Protobuf type {@code hadoop.hdfs.FenceResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.FenceResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_FenceResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_FenceResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto.newBuilder()
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
        previousEpoch_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        lastTransactionId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        inSync_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_FenceResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.previousEpoch_ = previousEpoch_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.lastTransactionId_ = lastTransactionId_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.inSync_ = inSync_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto.getDefaultInstance()) return this;
        if (other.hasPreviousEpoch()) {
          setPreviousEpoch(other.getPreviousEpoch());
        }
        if (other.hasLastTransactionId()) {
          setLastTransactionId(other.getLastTransactionId());
        }
        if (other.hasInSync()) {
          setInSync(other.getInSync());
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
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long previousEpoch_ ;
      /**
       * <code>optional uint64 previousEpoch = 1;</code>
       */
      public boolean hasPreviousEpoch() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional uint64 previousEpoch = 1;</code>
       */
      public long getPreviousEpoch() {
        return previousEpoch_;
      }
      /**
       * <code>optional uint64 previousEpoch = 1;</code>
       */
      public Builder setPreviousEpoch(long value) {
        bitField0_ |= 0x00000001;
        previousEpoch_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 previousEpoch = 1;</code>
       */
      public Builder clearPreviousEpoch() {
        bitField0_ = (bitField0_ & ~0x00000001);
        previousEpoch_ = 0L;
        onChanged();
        return this;
      }

      private long lastTransactionId_ ;
      /**
       * <code>optional uint64 lastTransactionId = 2;</code>
       */
      public boolean hasLastTransactionId() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional uint64 lastTransactionId = 2;</code>
       */
      public long getLastTransactionId() {
        return lastTransactionId_;
      }
      /**
       * <code>optional uint64 lastTransactionId = 2;</code>
       */
      public Builder setLastTransactionId(long value) {
        bitField0_ |= 0x00000002;
        lastTransactionId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 lastTransactionId = 2;</code>
       */
      public Builder clearLastTransactionId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        lastTransactionId_ = 0L;
        onChanged();
        return this;
      }

      private boolean inSync_ ;
      /**
       * <code>optional bool inSync = 3;</code>
       */
      public boolean hasInSync() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional bool inSync = 3;</code>
       */
      public boolean getInSync() {
        return inSync_;
      }
      /**
       * <code>optional bool inSync = 3;</code>
       */
      public Builder setInSync(boolean value) {
        bitField0_ |= 0x00000004;
        inSync_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool inSync = 3;</code>
       */
      public Builder clearInSync() {
        bitField0_ = (bitField0_ & ~0x00000004);
        inSync_ = false;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.FenceResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.FenceResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<FenceResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<FenceResponseProto>() {
      @java.lang.Override
      public FenceResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new FenceResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<FenceResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<FenceResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  /**
   * <pre>
   **
   * Protocol used to journal edits to a remote node. Currently,
   * this is used to publish edits from the NameNode to a BackupNode.
   * See the request and response for details of rpc call.
   * </pre>
   *
   * Protobuf service {@code hadoop.hdfs.JournalProtocolService}
   */
  public static abstract class JournalProtocolService
      implements org.apache.hadoop.thirdparty.protobuf.Service {
    protected JournalProtocolService() {}

    public interface Interface {
      /**
       * <pre>
       **
       * Request sent by active namenode to backup node via 
       * EditLogBackupOutputStream to stream editlog records.
       * </pre>
       *
       * <code>rpc journal(.hadoop.hdfs.JournalRequestProto) returns (.hadoop.hdfs.JournalResponseProto);</code>
       */
      public abstract void journal(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto> done);

      /**
       * <pre>
       **
       * Request sent by active namenode to backup node to notify 
       * that the NameNode has rolled its edit logs and is now writing a 
       * new log segment.
       * </pre>
       *
       * <code>rpc startLogSegment(.hadoop.hdfs.StartLogSegmentRequestProto) returns (.hadoop.hdfs.StartLogSegmentResponseProto);</code>
       */
      public abstract void startLogSegment(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto> done);

      /**
       * <pre>
       **
       * Request to fence a journal receiver.
       * </pre>
       *
       * <code>rpc fence(.hadoop.hdfs.FenceRequestProto) returns (.hadoop.hdfs.FenceResponseProto);</code>
       */
      public abstract void fence(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto> done);

    }

    public static org.apache.hadoop.thirdparty.protobuf.Service newReflectiveService(
        final Interface impl) {
      return new JournalProtocolService() {
        @java.lang.Override
        public  void journal(
            org.apache.hadoop.thirdparty.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto request,
            org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto> done) {
          impl.journal(controller, request, done);
        }

        @java.lang.Override
        public  void startLogSegment(
            org.apache.hadoop.thirdparty.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto request,
            org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto> done) {
          impl.startLogSegment(controller, request, done);
        }

        @java.lang.Override
        public  void fence(
            org.apache.hadoop.thirdparty.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto request,
            org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto> done) {
          impl.fence(controller, request, done);
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
              return impl.journal(controller, (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto)request);
            case 1:
              return impl.startLogSegment(controller, (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto)request);
            case 2:
              return impl.fence(controller, (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto)request);
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
              return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto.getDefaultInstance();
            case 1:
              return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto.getDefaultInstance();
            case 2:
              return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto.getDefaultInstance();
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
              return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto.getDefaultInstance();
            case 1:
              return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto.getDefaultInstance();
            case 2:
              return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

      };
    }

    /**
     * <pre>
     **
     * Request sent by active namenode to backup node via 
     * EditLogBackupOutputStream to stream editlog records.
     * </pre>
     *
     * <code>rpc journal(.hadoop.hdfs.JournalRequestProto) returns (.hadoop.hdfs.JournalResponseProto);</code>
     */
    public abstract void journal(
        org.apache.hadoop.thirdparty.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto request,
        org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto> done);

    /**
     * <pre>
     **
     * Request sent by active namenode to backup node to notify 
     * that the NameNode has rolled its edit logs and is now writing a 
     * new log segment.
     * </pre>
     *
     * <code>rpc startLogSegment(.hadoop.hdfs.StartLogSegmentRequestProto) returns (.hadoop.hdfs.StartLogSegmentResponseProto);</code>
     */
    public abstract void startLogSegment(
        org.apache.hadoop.thirdparty.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto request,
        org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto> done);

    /**
     * <pre>
     **
     * Request to fence a journal receiver.
     * </pre>
     *
     * <code>rpc fence(.hadoop.hdfs.FenceRequestProto) returns (.hadoop.hdfs.FenceResponseProto);</code>
     */
    public abstract void fence(
        org.apache.hadoop.thirdparty.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto request,
        org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto> done);

    public static final
        org.apache.hadoop.thirdparty.protobuf.Descriptors.ServiceDescriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.getDescriptor().getServices().get(0);
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
          this.journal(controller, (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto)request,
            org.apache.hadoop.thirdparty.protobuf.RpcUtil.<org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto>specializeCallback(
              done));
          return;
        case 1:
          this.startLogSegment(controller, (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto)request,
            org.apache.hadoop.thirdparty.protobuf.RpcUtil.<org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto>specializeCallback(
              done));
          return;
        case 2:
          this.fence(controller, (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto)request,
            org.apache.hadoop.thirdparty.protobuf.RpcUtil.<org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto>specializeCallback(
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
          return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto.getDefaultInstance();
        case 1:
          return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto.getDefaultInstance();
        case 2:
          return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto.getDefaultInstance();
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
          return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto.getDefaultInstance();
        case 1:
          return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto.getDefaultInstance();
        case 2:
          return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public static Stub newStub(
        org.apache.hadoop.thirdparty.protobuf.RpcChannel channel) {
      return new Stub(channel);
    }

    public static final class Stub extends org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalProtocolService implements Interface {
      private Stub(org.apache.hadoop.thirdparty.protobuf.RpcChannel channel) {
        this.channel = channel;
      }

      private final org.apache.hadoop.thirdparty.protobuf.RpcChannel channel;

      public org.apache.hadoop.thirdparty.protobuf.RpcChannel getChannel() {
        return channel;
      }

      public  void journal(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto.getDefaultInstance(),
          org.apache.hadoop.thirdparty.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto.class,
            org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto.getDefaultInstance()));
      }

      public  void startLogSegment(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto.getDefaultInstance(),
          org.apache.hadoop.thirdparty.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto.class,
            org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto.getDefaultInstance()));
      }

      public  void fence(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(2),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto.getDefaultInstance(),
          org.apache.hadoop.thirdparty.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto.class,
            org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto.getDefaultInstance()));
      }
    }

    public static BlockingInterface newBlockingStub(
        org.apache.hadoop.thirdparty.protobuf.BlockingRpcChannel channel) {
      return new BlockingStub(channel);
    }

    public interface BlockingInterface {
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto journal(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException;

      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto startLogSegment(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException;

      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto fence(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException;
    }

    private static final class BlockingStub implements BlockingInterface {
      private BlockingStub(org.apache.hadoop.thirdparty.protobuf.BlockingRpcChannel channel) {
        this.channel = channel;
      }

      private final org.apache.hadoop.thirdparty.protobuf.BlockingRpcChannel channel;

      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto journal(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto startLogSegment(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto fence(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(2),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto.getDefaultInstance());
      }

    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.JournalProtocolService)
  }

  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_JournalInfoProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_JournalInfoProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_JournalRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_JournalRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_JournalResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_JournalResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_StartLogSegmentRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_StartLogSegmentRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_StartLogSegmentResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_StartLogSegmentResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_FenceRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_FenceRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_FenceResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_FenceResponseProto_fieldAccessorTable;

  public static org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025JournalProtocol.proto\022\013hadoop.hdfs\032\nhd" +
      "fs.proto\032\020HdfsServer.proto\"Q\n\020JournalInf" +
      "oProto\022\021\n\tclusterID\030\001 \002(\t\022\025\n\rlayoutVersi" +
      "on\030\002 \001(\r\022\023\n\013namespaceID\030\003 \001(\r\"\216\001\n\023Journa" +
      "lRequestProto\0222\n\013journalInfo\030\001 \002(\0132\035.had" +
      "oop.hdfs.JournalInfoProto\022\022\n\nfirstTxnId\030" +
      "\002 \002(\004\022\017\n\007numTxns\030\003 \002(\r\022\017\n\007records\030\004 \002(\014\022" +
      "\r\n\005epoch\030\005 \002(\004\"\026\n\024JournalResponseProto\"n" +
      "\n\033StartLogSegmentRequestProto\0222\n\013journal" +
      "Info\030\001 \002(\0132\035.hadoop.hdfs.JournalInfoProt" +
      "o\022\014\n\004txid\030\002 \002(\004\022\r\n\005epoch\030\003 \002(\004\"\036\n\034StartL" +
      "ogSegmentResponseProto\"j\n\021FenceRequestPr" +
      "oto\0222\n\013journalInfo\030\001 \002(\0132\035.hadoop.hdfs.J" +
      "ournalInfoProto\022\r\n\005epoch\030\002 \002(\004\022\022\n\nfencer" +
      "Info\030\003 \001(\t\"V\n\022FenceResponseProto\022\025\n\rprev" +
      "iousEpoch\030\001 \001(\004\022\031\n\021lastTransactionId\030\002 \001" +
      "(\004\022\016\n\006inSync\030\003 \001(\0102\232\002\n\026JournalProtocolSe" +
      "rvice\022N\n\007journal\022 .hadoop.hdfs.JournalRe" +
      "questProto\032!.hadoop.hdfs.JournalResponse" +
      "Proto\022f\n\017startLogSegment\022(.hadoop.hdfs.S" +
      "tartLogSegmentRequestProto\032).hadoop.hdfs" +
      ".StartLogSegmentResponseProto\022H\n\005fence\022\036" +
      ".hadoop.hdfs.FenceRequestProto\032\037.hadoop." +
      "hdfs.FenceResponseProtoBD\n%org.apache.ha" +
      "doop.hdfs.protocol.protoB\025JournalProtoco" +
      "lProtos\210\001\001\240\001\001"
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
    internal_static_hadoop_hdfs_JournalInfoProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hadoop_hdfs_JournalInfoProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_JournalInfoProto_descriptor,
        new java.lang.String[] { "ClusterID", "LayoutVersion", "NamespaceID", });
    internal_static_hadoop_hdfs_JournalRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hadoop_hdfs_JournalRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_JournalRequestProto_descriptor,
        new java.lang.String[] { "JournalInfo", "FirstTxnId", "NumTxns", "Records", "Epoch", });
    internal_static_hadoop_hdfs_JournalResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_hadoop_hdfs_JournalResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_JournalResponseProto_descriptor,
        new java.lang.String[] { });
    internal_static_hadoop_hdfs_StartLogSegmentRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_hadoop_hdfs_StartLogSegmentRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_StartLogSegmentRequestProto_descriptor,
        new java.lang.String[] { "JournalInfo", "Txid", "Epoch", });
    internal_static_hadoop_hdfs_StartLogSegmentResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_hadoop_hdfs_StartLogSegmentResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_StartLogSegmentResponseProto_descriptor,
        new java.lang.String[] { });
    internal_static_hadoop_hdfs_FenceRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_hadoop_hdfs_FenceRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_FenceRequestProto_descriptor,
        new java.lang.String[] { "JournalInfo", "Epoch", "FencerInfo", });
    internal_static_hadoop_hdfs_FenceResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_hadoop_hdfs_FenceResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_FenceResponseProto_descriptor,
        new java.lang.String[] { "PreviousEpoch", "LastTransactionId", "InSync", });
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.getDescriptor();
    org.apache.hadoop.hdfs.protocol.proto.HdfsServerProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
