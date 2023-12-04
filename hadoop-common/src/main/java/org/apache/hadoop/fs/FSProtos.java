// source: FSProtos.proto

package org.apache.hadoop.fs;

public final class FSProtos {
  private FSProtos() {
  }

  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite) registry);
  }

  public interface FsPermissionProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.fs.FsPermissionProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * UNIX-style mode bits
     * </pre>
     *
     * <code>required uint32 perm = 1;</code>
     */
    boolean hasPerm();

    /**
     * <pre>
     * UNIX-style mode bits
     * </pre>
     *
     * <code>required uint32 perm = 1;</code>
     */
    int getPerm();
  }

  /**
   * Protobuf type {@code hadoop.fs.FsPermissionProto}
   */
  public static final class FsPermissionProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.fs.FsPermissionProto)
      FsPermissionProtoOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use FsPermissionProto.newBuilder() to construct.
    private FsPermissionProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private FsPermissionProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    private FsPermissionProto(
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
              perm_ = input.readUInt32();
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
      return org.apache.hadoop.fs.FSProtos.internal_static_hadoop_fs_FsPermissionProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return org.apache.hadoop.fs.FSProtos.internal_static_hadoop_fs_FsPermissionProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.fs.FSProtos.FsPermissionProto.class, org.apache.hadoop.fs.FSProtos.FsPermissionProto.Builder.class);
    }

    private int bitField0_;
    public static final int PERM_FIELD_NUMBER = 1;
    private int perm_;

    /**
     * <pre>
     * UNIX-style mode bits
     * </pre>
     *
     * <code>required uint32 perm = 1;</code>
     */
    public boolean hasPerm() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <pre>
     * UNIX-style mode bits
     * </pre>
     *
     * <code>required uint32 perm = 1;</code>
     */
    public int getPerm() {
      return perm_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasPerm()) {
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
        output.writeUInt32(1, perm_);
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
            .computeUInt32Size(1, perm_);
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
      if (!(obj instanceof org.apache.hadoop.fs.FSProtos.FsPermissionProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.fs.FSProtos.FsPermissionProto other = (org.apache.hadoop.fs.FSProtos.FsPermissionProto) obj;

      if (hasPerm() != other.hasPerm()) return false;
      if (hasPerm()) {
        if (getPerm()
            != other.getPerm()) return false;
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
      if (hasPerm()) {
        hash = (37 * hash) + PERM_FIELD_NUMBER;
        hash = (53 * hash) + getPerm();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.fs.FSProtos.FsPermissionProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.fs.FSProtos.FsPermissionProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.fs.FSProtos.FsPermissionProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.fs.FSProtos.FsPermissionProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.fs.FSProtos.FsPermissionProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.fs.FSProtos.FsPermissionProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.fs.FSProtos.FsPermissionProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.fs.FSProtos.FsPermissionProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.fs.FSProtos.FsPermissionProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.fs.FSProtos.FsPermissionProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.fs.FSProtos.FsPermissionProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.fs.FSProtos.FsPermissionProto parseFrom(
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

    public static Builder newBuilder(org.apache.hadoop.fs.FSProtos.FsPermissionProto prototype) {
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
     * Protobuf type {@code hadoop.fs.FsPermissionProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.fs.FsPermissionProto)
        org.apache.hadoop.fs.FSProtos.FsPermissionProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return org.apache.hadoop.fs.FSProtos.internal_static_hadoop_fs_FsPermissionProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return org.apache.hadoop.fs.FSProtos.internal_static_hadoop_fs_FsPermissionProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.fs.FSProtos.FsPermissionProto.class, org.apache.hadoop.fs.FSProtos.FsPermissionProto.Builder.class);
      }

      // Construct using org.apache.hadoop.fs.FSProtos.FsPermissionProto.newBuilder()
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
        perm_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return org.apache.hadoop.fs.FSProtos.internal_static_hadoop_fs_FsPermissionProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.fs.FSProtos.FsPermissionProto getDefaultInstanceForType() {
        return org.apache.hadoop.fs.FSProtos.FsPermissionProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.fs.FSProtos.FsPermissionProto build() {
        org.apache.hadoop.fs.FSProtos.FsPermissionProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.fs.FSProtos.FsPermissionProto buildPartial() {
        org.apache.hadoop.fs.FSProtos.FsPermissionProto result = new org.apache.hadoop.fs.FSProtos.FsPermissionProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.perm_ = perm_;
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
        if (other instanceof org.apache.hadoop.fs.FSProtos.FsPermissionProto) {
          return mergeFrom((org.apache.hadoop.fs.FSProtos.FsPermissionProto) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.fs.FSProtos.FsPermissionProto other) {
        if (other == org.apache.hadoop.fs.FSProtos.FsPermissionProto.getDefaultInstance()) return this;
        if (other.hasPerm()) {
          setPerm(other.getPerm());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasPerm()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.fs.FSProtos.FsPermissionProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.fs.FSProtos.FsPermissionProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private int perm_;

      /**
       * <pre>
       * UNIX-style mode bits
       * </pre>
       *
       * <code>required uint32 perm = 1;</code>
       */
      public boolean hasPerm() {
        return ((bitField0_ & 0x00000001) != 0);
      }

      /**
       * <pre>
       * UNIX-style mode bits
       * </pre>
       *
       * <code>required uint32 perm = 1;</code>
       */
      public int getPerm() {
        return perm_;
      }

      /**
       * <pre>
       * UNIX-style mode bits
       * </pre>
       *
       * <code>required uint32 perm = 1;</code>
       */
      public Builder setPerm(int value) {
        bitField0_ |= 0x00000001;
        perm_ = value;
        onChanged();
        return this;
      }

      /**
       * <pre>
       * UNIX-style mode bits
       * </pre>
       *
       * <code>required uint32 perm = 1;</code>
       */
      public Builder clearPerm() {
        bitField0_ = (bitField0_ & ~0x00000001);
        perm_ = 0;
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


      // @@protoc_insertion_point(builder_scope:hadoop.fs.FsPermissionProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.fs.FsPermissionProto)
    private static final org.apache.hadoop.fs.FSProtos.FsPermissionProto DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.fs.FSProtos.FsPermissionProto();
    }

    public static org.apache.hadoop.fs.FSProtos.FsPermissionProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final org.apache.hadoop.thirdparty.protobuf.Parser<FsPermissionProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<FsPermissionProto>() {
      @java.lang.Override
      public FsPermissionProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new FsPermissionProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<FsPermissionProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<FsPermissionProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.fs.FSProtos.FsPermissionProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface FileStatusProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.fs.FileStatusProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required .hadoop.fs.FileStatusProto.FileType fileType = 1;</code>
     */
    boolean hasFileType();

    /**
     * <code>required .hadoop.fs.FileStatusProto.FileType fileType = 1;</code>
     */
    org.apache.hadoop.fs.FSProtos.FileStatusProto.FileType getFileType();

    /**
     * <code>required string path = 2;</code>
     */
    boolean hasPath();

    /**
     * <code>required string path = 2;</code>
     */
    java.lang.String getPath();

    /**
     * <code>required string path = 2;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
    getPathBytes();

    /**
     * <code>optional uint64 length = 3;</code>
     */
    boolean hasLength();

    /**
     * <code>optional uint64 length = 3;</code>
     */
    long getLength();

    /**
     * <code>optional .hadoop.fs.FsPermissionProto permission = 4;</code>
     */
    boolean hasPermission();

    /**
     * <code>optional .hadoop.fs.FsPermissionProto permission = 4;</code>
     */
    org.apache.hadoop.fs.FSProtos.FsPermissionProto getPermission();

    /**
     * <code>optional .hadoop.fs.FsPermissionProto permission = 4;</code>
     */
    org.apache.hadoop.fs.FSProtos.FsPermissionProtoOrBuilder getPermissionOrBuilder();

    /**
     * <code>optional string owner = 5;</code>
     */
    boolean hasOwner();

    /**
     * <code>optional string owner = 5;</code>
     */
    java.lang.String getOwner();

    /**
     * <code>optional string owner = 5;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
    getOwnerBytes();

    /**
     * <code>optional string group = 6;</code>
     */
    boolean hasGroup();

    /**
     * <code>optional string group = 6;</code>
     */
    java.lang.String getGroup();

    /**
     * <code>optional string group = 6;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
    getGroupBytes();

    /**
     * <code>optional uint64 modification_time = 7;</code>
     */
    boolean hasModificationTime();

    /**
     * <code>optional uint64 modification_time = 7;</code>
     */
    long getModificationTime();

    /**
     * <code>optional uint64 access_time = 8;</code>
     */
    boolean hasAccessTime();

    /**
     * <code>optional uint64 access_time = 8;</code>
     */
    long getAccessTime();

    /**
     * <code>optional string symlink = 9;</code>
     */
    boolean hasSymlink();

    /**
     * <code>optional string symlink = 9;</code>
     */
    java.lang.String getSymlink();

    /**
     * <code>optional string symlink = 9;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
    getSymlinkBytes();

    /**
     * <code>optional uint32 block_replication = 10;</code>
     */
    boolean hasBlockReplication();

    /**
     * <code>optional uint32 block_replication = 10;</code>
     */
    int getBlockReplication();

    /**
     * <code>optional uint64 block_size = 11;</code>
     */
    boolean hasBlockSize();

    /**
     * <code>optional uint64 block_size = 11;</code>
     */
    long getBlockSize();

    /**
     * <pre>
     * locations                          = 12
     * alias                              = 13
     * childrenNum                        = 14
     * </pre>
     *
     * <code>optional bytes encryption_data = 15;</code>
     */
    boolean hasEncryptionData();

    /**
     * <pre>
     * locations                          = 12
     * alias                              = 13
     * childrenNum                        = 14
     * </pre>
     *
     * <code>optional bytes encryption_data = 15;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString getEncryptionData();

    /**
     * <pre>
     * storagePolicy                      = 16
     * </pre>
     *
     * <code>optional bytes ec_data = 17;</code>
     */
    boolean hasEcData();

    /**
     * <pre>
     * storagePolicy                      = 16
     * </pre>
     *
     * <code>optional bytes ec_data = 17;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString getEcData();

    /**
     * <code>optional uint32 flags = 18 [default = 0];</code>
     */
    boolean hasFlags();

    /**
     * <code>optional uint32 flags = 18 [default = 0];</code>
     */
    int getFlags();
  }

  /**
   * <pre>
   * FileStatus encoding. Field IDs match those from HdfsFileStatusProto, but
   * cross-serialization is not an explicitly supported use case. Unlike HDFS,
   * most fields are optional and do not define defaults.
   * </pre>
   *
   * Protobuf type {@code hadoop.fs.FileStatusProto}
   */
  public static final class FileStatusProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.fs.FileStatusProto)
      FileStatusProtoOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use FileStatusProto.newBuilder() to construct.
    private FileStatusProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private FileStatusProto() {
      fileType_ = 1;
      path_ = "";
      owner_ = "";
      group_ = "";
      symlink_ = "";
      encryptionData_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
      ecData_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    private FileStatusProto(
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
              org.apache.hadoop.fs.FSProtos.FileStatusProto.FileType value = org.apache.hadoop.fs.FSProtos.FileStatusProto.FileType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                fileType_ = rawValue;
              }
              break;
            }
            case 18: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              path_ = bs;
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              length_ = input.readUInt64();
              break;
            }
            case 34: {
              org.apache.hadoop.fs.FSProtos.FsPermissionProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000008) != 0)) {
                subBuilder = permission_.toBuilder();
              }
              permission_ = input.readMessage(org.apache.hadoop.fs.FSProtos.FsPermissionProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(permission_);
                permission_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000008;
              break;
            }
            case 42: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000010;
              owner_ = bs;
              break;
            }
            case 50: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000020;
              group_ = bs;
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              modificationTime_ = input.readUInt64();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000080;
              accessTime_ = input.readUInt64();
              break;
            }
            case 74: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000100;
              symlink_ = bs;
              break;
            }
            case 80: {
              bitField0_ |= 0x00000200;
              blockReplication_ = input.readUInt32();
              break;
            }
            case 88: {
              bitField0_ |= 0x00000400;
              blockSize_ = input.readUInt64();
              break;
            }
            case 122: {
              bitField0_ |= 0x00000800;
              encryptionData_ = input.readBytes();
              break;
            }
            case 138: {
              bitField0_ |= 0x00001000;
              ecData_ = input.readBytes();
              break;
            }
            case 144: {
              bitField0_ |= 0x00002000;
              flags_ = input.readUInt32();
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
      return org.apache.hadoop.fs.FSProtos.internal_static_hadoop_fs_FileStatusProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return org.apache.hadoop.fs.FSProtos.internal_static_hadoop_fs_FileStatusProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.fs.FSProtos.FileStatusProto.class, org.apache.hadoop.fs.FSProtos.FileStatusProto.Builder.class);
    }

    /**
     * Protobuf enum {@code hadoop.fs.FileStatusProto.FileType}
     */
    public enum FileType
        implements org.apache.hadoop.thirdparty.protobuf.ProtocolMessageEnum {
      /**
       * <code>FT_DIR = 1;</code>
       */
      FT_DIR(1),
      /**
       * <code>FT_FILE = 2;</code>
       */
      FT_FILE(2),
      /**
       * <code>FT_SYMLINK = 3;</code>
       */
      FT_SYMLINK(3),
      ;

      /**
       * <code>FT_DIR = 1;</code>
       */
      public static final int FT_DIR_VALUE = 1;
      /**
       * <code>FT_FILE = 2;</code>
       */
      public static final int FT_FILE_VALUE = 2;
      /**
       * <code>FT_SYMLINK = 3;</code>
       */
      public static final int FT_SYMLINK_VALUE = 3;


      public final int getNumber() {
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static FileType valueOf(int value) {
        return forNumber(value);
      }

      public static FileType forNumber(int value) {
        switch (value) {
          case 1:
            return FT_DIR;
          case 2:
            return FT_FILE;
          case 3:
            return FT_SYMLINK;
          default:
            return null;
        }
      }

      public static org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<FileType>
      internalGetValueMap() {
        return internalValueMap;
      }

      private static final org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<
          FileType> internalValueMap =
          new org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<FileType>() {
            public FileType findValueByNumber(int number) {
              return FileType.forNumber(number);
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
        return org.apache.hadoop.fs.FSProtos.FileStatusProto.getDescriptor().getEnumTypes().get(0);
      }

      private static final FileType[] VALUES = values();

      public static FileType valueOf(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
              "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private FileType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:hadoop.fs.FileStatusProto.FileType)
    }

    /**
     * Protobuf enum {@code hadoop.fs.FileStatusProto.Flags}
     */
    public enum Flags
        implements org.apache.hadoop.thirdparty.protobuf.ProtocolMessageEnum {
      /**
       * <pre>
       * has ACLs
       * </pre>
       *
       * <code>HAS_ACL = 1;</code>
       */
      HAS_ACL(1),
      /**
       * <pre>
       * encrypted
       * </pre>
       *
       * <code>HAS_CRYPT = 2;</code>
       */
      HAS_CRYPT(2),
      /**
       * <pre>
       * erasure coded
       * </pre>
       *
       * <code>HAS_EC = 4;</code>
       */
      HAS_EC(4),
      /**
       * <pre>
       * snapshot enabled
       * </pre>
       *
       * <code>SNAPSHOT_ENABLED = 8;</code>
       */
      SNAPSHOT_ENABLED(8),
      ;

      /**
       * <pre>
       * has ACLs
       * </pre>
       *
       * <code>HAS_ACL = 1;</code>
       */
      public static final int HAS_ACL_VALUE = 1;
      /**
       * <pre>
       * encrypted
       * </pre>
       *
       * <code>HAS_CRYPT = 2;</code>
       */
      public static final int HAS_CRYPT_VALUE = 2;
      /**
       * <pre>
       * erasure coded
       * </pre>
       *
       * <code>HAS_EC = 4;</code>
       */
      public static final int HAS_EC_VALUE = 4;
      /**
       * <pre>
       * snapshot enabled
       * </pre>
       *
       * <code>SNAPSHOT_ENABLED = 8;</code>
       */
      public static final int SNAPSHOT_ENABLED_VALUE = 8;


      public final int getNumber() {
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static Flags valueOf(int value) {
        return forNumber(value);
      }

      public static Flags forNumber(int value) {
        switch (value) {
          case 1:
            return HAS_ACL;
          case 2:
            return HAS_CRYPT;
          case 4:
            return HAS_EC;
          case 8:
            return SNAPSHOT_ENABLED;
          default:
            return null;
        }
      }

      public static org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<Flags>
      internalGetValueMap() {
        return internalValueMap;
      }

      private static final org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<
          Flags> internalValueMap =
          new org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<Flags>() {
            public Flags findValueByNumber(int number) {
              return Flags.forNumber(number);
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
        return org.apache.hadoop.fs.FSProtos.FileStatusProto.getDescriptor().getEnumTypes().get(1);
      }

      private static final Flags[] VALUES = values();

      public static Flags valueOf(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
              "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private Flags(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:hadoop.fs.FileStatusProto.Flags)
    }

    private int bitField0_;
    public static final int FILETYPE_FIELD_NUMBER = 1;
    private int fileType_;

    /**
     * <code>required .hadoop.fs.FileStatusProto.FileType fileType = 1;</code>
     */
    public boolean hasFileType() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>required .hadoop.fs.FileStatusProto.FileType fileType = 1;</code>
     */
    public org.apache.hadoop.fs.FSProtos.FileStatusProto.FileType getFileType() {
      @SuppressWarnings("deprecation")
      org.apache.hadoop.fs.FSProtos.FileStatusProto.FileType result = org.apache.hadoop.fs.FSProtos.FileStatusProto.FileType.valueOf(fileType_);
      return result == null ? org.apache.hadoop.fs.FSProtos.FileStatusProto.FileType.FT_DIR : result;
    }

    public static final int PATH_FIELD_NUMBER = 2;
    private volatile java.lang.Object path_;

    /**
     * <code>required string path = 2;</code>
     */
    public boolean hasPath() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     * <code>required string path = 2;</code>
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs =
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          path_ = s;
        }
        return s;
      }
    }

    /**
     * <code>required string path = 2;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
    getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b =
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int LENGTH_FIELD_NUMBER = 3;
    private long length_;

    /**
     * <code>optional uint64 length = 3;</code>
     */
    public boolean hasLength() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     * <code>optional uint64 length = 3;</code>
     */
    public long getLength() {
      return length_;
    }

    public static final int PERMISSION_FIELD_NUMBER = 4;
    private org.apache.hadoop.fs.FSProtos.FsPermissionProto permission_;

    /**
     * <code>optional .hadoop.fs.FsPermissionProto permission = 4;</code>
     */
    public boolean hasPermission() {
      return ((bitField0_ & 0x00000008) != 0);
    }

    /**
     * <code>optional .hadoop.fs.FsPermissionProto permission = 4;</code>
     */
    public org.apache.hadoop.fs.FSProtos.FsPermissionProto getPermission() {
      return permission_ == null ? org.apache.hadoop.fs.FSProtos.FsPermissionProto.getDefaultInstance() : permission_;
    }

    /**
     * <code>optional .hadoop.fs.FsPermissionProto permission = 4;</code>
     */
    public org.apache.hadoop.fs.FSProtos.FsPermissionProtoOrBuilder getPermissionOrBuilder() {
      return permission_ == null ? org.apache.hadoop.fs.FSProtos.FsPermissionProto.getDefaultInstance() : permission_;
    }

    public static final int OWNER_FIELD_NUMBER = 5;
    private volatile java.lang.Object owner_;

    /**
     * <code>optional string owner = 5;</code>
     */
    public boolean hasOwner() {
      return ((bitField0_ & 0x00000010) != 0);
    }

    /**
     * <code>optional string owner = 5;</code>
     */
    public java.lang.String getOwner() {
      java.lang.Object ref = owner_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs =
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          owner_ = s;
        }
        return s;
      }
    }

    /**
     * <code>optional string owner = 5;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
    getOwnerBytes() {
      java.lang.Object ref = owner_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b =
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        owner_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int GROUP_FIELD_NUMBER = 6;
    private volatile java.lang.Object group_;

    /**
     * <code>optional string group = 6;</code>
     */
    public boolean hasGroup() {
      return ((bitField0_ & 0x00000020) != 0);
    }

    /**
     * <code>optional string group = 6;</code>
     */
    public java.lang.String getGroup() {
      java.lang.Object ref = group_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs =
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          group_ = s;
        }
        return s;
      }
    }

    /**
     * <code>optional string group = 6;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
    getGroupBytes() {
      java.lang.Object ref = group_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b =
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        group_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int MODIFICATION_TIME_FIELD_NUMBER = 7;
    private long modificationTime_;

    /**
     * <code>optional uint64 modification_time = 7;</code>
     */
    public boolean hasModificationTime() {
      return ((bitField0_ & 0x00000040) != 0);
    }

    /**
     * <code>optional uint64 modification_time = 7;</code>
     */
    public long getModificationTime() {
      return modificationTime_;
    }

    public static final int ACCESS_TIME_FIELD_NUMBER = 8;
    private long accessTime_;

    /**
     * <code>optional uint64 access_time = 8;</code>
     */
    public boolean hasAccessTime() {
      return ((bitField0_ & 0x00000080) != 0);
    }

    /**
     * <code>optional uint64 access_time = 8;</code>
     */
    public long getAccessTime() {
      return accessTime_;
    }

    public static final int SYMLINK_FIELD_NUMBER = 9;
    private volatile java.lang.Object symlink_;

    /**
     * <code>optional string symlink = 9;</code>
     */
    public boolean hasSymlink() {
      return ((bitField0_ & 0x00000100) != 0);
    }

    /**
     * <code>optional string symlink = 9;</code>
     */
    public java.lang.String getSymlink() {
      java.lang.Object ref = symlink_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs =
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          symlink_ = s;
        }
        return s;
      }
    }

    /**
     * <code>optional string symlink = 9;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
    getSymlinkBytes() {
      java.lang.Object ref = symlink_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b =
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        symlink_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int BLOCK_REPLICATION_FIELD_NUMBER = 10;
    private int blockReplication_;

    /**
     * <code>optional uint32 block_replication = 10;</code>
     */
    public boolean hasBlockReplication() {
      return ((bitField0_ & 0x00000200) != 0);
    }

    /**
     * <code>optional uint32 block_replication = 10;</code>
     */
    public int getBlockReplication() {
      return blockReplication_;
    }

    public static final int BLOCK_SIZE_FIELD_NUMBER = 11;
    private long blockSize_;

    /**
     * <code>optional uint64 block_size = 11;</code>
     */
    public boolean hasBlockSize() {
      return ((bitField0_ & 0x00000400) != 0);
    }

    /**
     * <code>optional uint64 block_size = 11;</code>
     */
    public long getBlockSize() {
      return blockSize_;
    }

    public static final int ENCRYPTION_DATA_FIELD_NUMBER = 15;
    private org.apache.hadoop.thirdparty.protobuf.ByteString encryptionData_;

    /**
     * <pre>
     * locations                          = 12
     * alias                              = 13
     * childrenNum                        = 14
     * </pre>
     *
     * <code>optional bytes encryption_data = 15;</code>
     */
    public boolean hasEncryptionData() {
      return ((bitField0_ & 0x00000800) != 0);
    }

    /**
     * <pre>
     * locations                          = 12
     * alias                              = 13
     * childrenNum                        = 14
     * </pre>
     *
     * <code>optional bytes encryption_data = 15;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString getEncryptionData() {
      return encryptionData_;
    }

    public static final int EC_DATA_FIELD_NUMBER = 17;
    private org.apache.hadoop.thirdparty.protobuf.ByteString ecData_;

    /**
     * <pre>
     * storagePolicy                      = 16
     * </pre>
     *
     * <code>optional bytes ec_data = 17;</code>
     */
    public boolean hasEcData() {
      return ((bitField0_ & 0x00001000) != 0);
    }

    /**
     * <pre>
     * storagePolicy                      = 16
     * </pre>
     *
     * <code>optional bytes ec_data = 17;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString getEcData() {
      return ecData_;
    }

    public static final int FLAGS_FIELD_NUMBER = 18;
    private int flags_;

    /**
     * <code>optional uint32 flags = 18 [default = 0];</code>
     */
    public boolean hasFlags() {
      return ((bitField0_ & 0x00002000) != 0);
    }

    /**
     * <code>optional uint32 flags = 18 [default = 0];</code>
     */
    public int getFlags() {
      return flags_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasFileType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPath()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasPermission()) {
        if (!getPermission().isInitialized()) {
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
        output.writeEnum(1, fileType_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 2, path_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeUInt64(3, length_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeMessage(4, getPermission());
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 5, owner_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 6, group_);
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        output.writeUInt64(7, modificationTime_);
      }
      if (((bitField0_ & 0x00000080) != 0)) {
        output.writeUInt64(8, accessTime_);
      }
      if (((bitField0_ & 0x00000100) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 9, symlink_);
      }
      if (((bitField0_ & 0x00000200) != 0)) {
        output.writeUInt32(10, blockReplication_);
      }
      if (((bitField0_ & 0x00000400) != 0)) {
        output.writeUInt64(11, blockSize_);
      }
      if (((bitField0_ & 0x00000800) != 0)) {
        output.writeBytes(15, encryptionData_);
      }
      if (((bitField0_ & 0x00001000) != 0)) {
        output.writeBytes(17, ecData_);
      }
      if (((bitField0_ & 0x00002000) != 0)) {
        output.writeUInt32(18, flags_);
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
            .computeEnumSize(1, fileType_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(2, path_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
            .computeUInt64Size(3, length_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
            .computeMessageSize(4, getPermission());
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(5, owner_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(6, group_);
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
            .computeUInt64Size(7, modificationTime_);
      }
      if (((bitField0_ & 0x00000080) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
            .computeUInt64Size(8, accessTime_);
      }
      if (((bitField0_ & 0x00000100) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(9, symlink_);
      }
      if (((bitField0_ & 0x00000200) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
            .computeUInt32Size(10, blockReplication_);
      }
      if (((bitField0_ & 0x00000400) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
            .computeUInt64Size(11, blockSize_);
      }
      if (((bitField0_ & 0x00000800) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
            .computeBytesSize(15, encryptionData_);
      }
      if (((bitField0_ & 0x00001000) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
            .computeBytesSize(17, ecData_);
      }
      if (((bitField0_ & 0x00002000) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
            .computeUInt32Size(18, flags_);
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
      if (!(obj instanceof org.apache.hadoop.fs.FSProtos.FileStatusProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.fs.FSProtos.FileStatusProto other = (org.apache.hadoop.fs.FSProtos.FileStatusProto) obj;

      if (hasFileType() != other.hasFileType()) return false;
      if (hasFileType()) {
        if (fileType_ != other.fileType_) return false;
      }
      if (hasPath() != other.hasPath()) return false;
      if (hasPath()) {
        if (!getPath()
            .equals(other.getPath())) return false;
      }
      if (hasLength() != other.hasLength()) return false;
      if (hasLength()) {
        if (getLength()
            != other.getLength()) return false;
      }
      if (hasPermission() != other.hasPermission()) return false;
      if (hasPermission()) {
        if (!getPermission()
            .equals(other.getPermission())) return false;
      }
      if (hasOwner() != other.hasOwner()) return false;
      if (hasOwner()) {
        if (!getOwner()
            .equals(other.getOwner())) return false;
      }
      if (hasGroup() != other.hasGroup()) return false;
      if (hasGroup()) {
        if (!getGroup()
            .equals(other.getGroup())) return false;
      }
      if (hasModificationTime() != other.hasModificationTime()) return false;
      if (hasModificationTime()) {
        if (getModificationTime()
            != other.getModificationTime()) return false;
      }
      if (hasAccessTime() != other.hasAccessTime()) return false;
      if (hasAccessTime()) {
        if (getAccessTime()
            != other.getAccessTime()) return false;
      }
      if (hasSymlink() != other.hasSymlink()) return false;
      if (hasSymlink()) {
        if (!getSymlink()
            .equals(other.getSymlink())) return false;
      }
      if (hasBlockReplication() != other.hasBlockReplication()) return false;
      if (hasBlockReplication()) {
        if (getBlockReplication()
            != other.getBlockReplication()) return false;
      }
      if (hasBlockSize() != other.hasBlockSize()) return false;
      if (hasBlockSize()) {
        if (getBlockSize()
            != other.getBlockSize()) return false;
      }
      if (hasEncryptionData() != other.hasEncryptionData()) return false;
      if (hasEncryptionData()) {
        if (!getEncryptionData()
            .equals(other.getEncryptionData())) return false;
      }
      if (hasEcData() != other.hasEcData()) return false;
      if (hasEcData()) {
        if (!getEcData()
            .equals(other.getEcData())) return false;
      }
      if (hasFlags() != other.hasFlags()) return false;
      if (hasFlags()) {
        if (getFlags()
            != other.getFlags()) return false;
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
      if (hasFileType()) {
        hash = (37 * hash) + FILETYPE_FIELD_NUMBER;
        hash = (53 * hash) + fileType_;
      }
      if (hasPath()) {
        hash = (37 * hash) + PATH_FIELD_NUMBER;
        hash = (53 * hash) + getPath().hashCode();
      }
      if (hasLength()) {
        hash = (37 * hash) + LENGTH_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getLength());
      }
      if (hasPermission()) {
        hash = (37 * hash) + PERMISSION_FIELD_NUMBER;
        hash = (53 * hash) + getPermission().hashCode();
      }
      if (hasOwner()) {
        hash = (37 * hash) + OWNER_FIELD_NUMBER;
        hash = (53 * hash) + getOwner().hashCode();
      }
      if (hasGroup()) {
        hash = (37 * hash) + GROUP_FIELD_NUMBER;
        hash = (53 * hash) + getGroup().hashCode();
      }
      if (hasModificationTime()) {
        hash = (37 * hash) + MODIFICATION_TIME_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getModificationTime());
      }
      if (hasAccessTime()) {
        hash = (37 * hash) + ACCESS_TIME_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getAccessTime());
      }
      if (hasSymlink()) {
        hash = (37 * hash) + SYMLINK_FIELD_NUMBER;
        hash = (53 * hash) + getSymlink().hashCode();
      }
      if (hasBlockReplication()) {
        hash = (37 * hash) + BLOCK_REPLICATION_FIELD_NUMBER;
        hash = (53 * hash) + getBlockReplication();
      }
      if (hasBlockSize()) {
        hash = (37 * hash) + BLOCK_SIZE_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getBlockSize());
      }
      if (hasEncryptionData()) {
        hash = (37 * hash) + ENCRYPTION_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getEncryptionData().hashCode();
      }
      if (hasEcData()) {
        hash = (37 * hash) + EC_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getEcData().hashCode();
      }
      if (hasFlags()) {
        hash = (37 * hash) + FLAGS_FIELD_NUMBER;
        hash = (53 * hash) + getFlags();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.fs.FSProtos.FileStatusProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.fs.FSProtos.FileStatusProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.fs.FSProtos.FileStatusProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.fs.FSProtos.FileStatusProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.fs.FSProtos.FileStatusProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.fs.FSProtos.FileStatusProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.fs.FSProtos.FileStatusProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.fs.FSProtos.FileStatusProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.fs.FSProtos.FileStatusProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.fs.FSProtos.FileStatusProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.fs.FSProtos.FileStatusProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.fs.FSProtos.FileStatusProto parseFrom(
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

    public static Builder newBuilder(org.apache.hadoop.fs.FSProtos.FileStatusProto prototype) {
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
     * FileStatus encoding. Field IDs match those from HdfsFileStatusProto, but
     * cross-serialization is not an explicitly supported use case. Unlike HDFS,
     * most fields are optional and do not define defaults.
     * </pre>
     *
     * Protobuf type {@code hadoop.fs.FileStatusProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.fs.FileStatusProto)
        org.apache.hadoop.fs.FSProtos.FileStatusProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return org.apache.hadoop.fs.FSProtos.internal_static_hadoop_fs_FileStatusProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return org.apache.hadoop.fs.FSProtos.internal_static_hadoop_fs_FileStatusProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.fs.FSProtos.FileStatusProto.class, org.apache.hadoop.fs.FSProtos.FileStatusProto.Builder.class);
      }

      // Construct using org.apache.hadoop.fs.FSProtos.FileStatusProto.newBuilder()
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
          getPermissionFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        fileType_ = 1;
        bitField0_ = (bitField0_ & ~0x00000001);
        path_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        length_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        if (permissionBuilder_ == null) {
          permission_ = null;
        } else {
          permissionBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        owner_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        group_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        modificationTime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000040);
        accessTime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000080);
        symlink_ = "";
        bitField0_ = (bitField0_ & ~0x00000100);
        blockReplication_ = 0;
        bitField0_ = (bitField0_ & ~0x00000200);
        blockSize_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000400);
        encryptionData_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000800);
        ecData_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00001000);
        flags_ = 0;
        bitField0_ = (bitField0_ & ~0x00002000);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return org.apache.hadoop.fs.FSProtos.internal_static_hadoop_fs_FileStatusProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.fs.FSProtos.FileStatusProto getDefaultInstanceForType() {
        return org.apache.hadoop.fs.FSProtos.FileStatusProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.fs.FSProtos.FileStatusProto build() {
        org.apache.hadoop.fs.FSProtos.FileStatusProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.fs.FSProtos.FileStatusProto buildPartial() {
        org.apache.hadoop.fs.FSProtos.FileStatusProto result = new org.apache.hadoop.fs.FSProtos.FileStatusProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.fileType_ = fileType_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.path_ = path_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.length_ = length_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          if (permissionBuilder_ == null) {
            result.permission_ = permission_;
          } else {
            result.permission_ = permissionBuilder_.build();
          }
          to_bitField0_ |= 0x00000008;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          to_bitField0_ |= 0x00000010;
        }
        result.owner_ = owner_;
        if (((from_bitField0_ & 0x00000020) != 0)) {
          to_bitField0_ |= 0x00000020;
        }
        result.group_ = group_;
        if (((from_bitField0_ & 0x00000040) != 0)) {
          result.modificationTime_ = modificationTime_;
          to_bitField0_ |= 0x00000040;
        }
        if (((from_bitField0_ & 0x00000080) != 0)) {
          result.accessTime_ = accessTime_;
          to_bitField0_ |= 0x00000080;
        }
        if (((from_bitField0_ & 0x00000100) != 0)) {
          to_bitField0_ |= 0x00000100;
        }
        result.symlink_ = symlink_;
        if (((from_bitField0_ & 0x00000200) != 0)) {
          result.blockReplication_ = blockReplication_;
          to_bitField0_ |= 0x00000200;
        }
        if (((from_bitField0_ & 0x00000400) != 0)) {
          result.blockSize_ = blockSize_;
          to_bitField0_ |= 0x00000400;
        }
        if (((from_bitField0_ & 0x00000800) != 0)) {
          to_bitField0_ |= 0x00000800;
        }
        result.encryptionData_ = encryptionData_;
        if (((from_bitField0_ & 0x00001000) != 0)) {
          to_bitField0_ |= 0x00001000;
        }
        result.ecData_ = ecData_;
        if (((from_bitField0_ & 0x00002000) != 0)) {
          result.flags_ = flags_;
          to_bitField0_ |= 0x00002000;
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
        if (other instanceof org.apache.hadoop.fs.FSProtos.FileStatusProto) {
          return mergeFrom((org.apache.hadoop.fs.FSProtos.FileStatusProto) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.fs.FSProtos.FileStatusProto other) {
        if (other == org.apache.hadoop.fs.FSProtos.FileStatusProto.getDefaultInstance()) return this;
        if (other.hasFileType()) {
          setFileType(other.getFileType());
        }
        if (other.hasPath()) {
          bitField0_ |= 0x00000002;
          path_ = other.path_;
          onChanged();
        }
        if (other.hasLength()) {
          setLength(other.getLength());
        }
        if (other.hasPermission()) {
          mergePermission(other.getPermission());
        }
        if (other.hasOwner()) {
          bitField0_ |= 0x00000010;
          owner_ = other.owner_;
          onChanged();
        }
        if (other.hasGroup()) {
          bitField0_ |= 0x00000020;
          group_ = other.group_;
          onChanged();
        }
        if (other.hasModificationTime()) {
          setModificationTime(other.getModificationTime());
        }
        if (other.hasAccessTime()) {
          setAccessTime(other.getAccessTime());
        }
        if (other.hasSymlink()) {
          bitField0_ |= 0x00000100;
          symlink_ = other.symlink_;
          onChanged();
        }
        if (other.hasBlockReplication()) {
          setBlockReplication(other.getBlockReplication());
        }
        if (other.hasBlockSize()) {
          setBlockSize(other.getBlockSize());
        }
        if (other.hasEncryptionData()) {
          setEncryptionData(other.getEncryptionData());
        }
        if (other.hasEcData()) {
          setEcData(other.getEcData());
        }
        if (other.hasFlags()) {
          setFlags(other.getFlags());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasFileType()) {
          return false;
        }
        if (!hasPath()) {
          return false;
        }
        if (hasPermission()) {
          if (!getPermission().isInitialized()) {
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
        org.apache.hadoop.fs.FSProtos.FileStatusProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.fs.FSProtos.FileStatusProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private int fileType_ = 1;

      /**
       * <code>required .hadoop.fs.FileStatusProto.FileType fileType = 1;</code>
       */
      public boolean hasFileType() {
        return ((bitField0_ & 0x00000001) != 0);
      }

      /**
       * <code>required .hadoop.fs.FileStatusProto.FileType fileType = 1;</code>
       */
      public org.apache.hadoop.fs.FSProtos.FileStatusProto.FileType getFileType() {
        @SuppressWarnings("deprecation")
        org.apache.hadoop.fs.FSProtos.FileStatusProto.FileType result = org.apache.hadoop.fs.FSProtos.FileStatusProto.FileType.valueOf(fileType_);
        return result == null ? org.apache.hadoop.fs.FSProtos.FileStatusProto.FileType.FT_DIR : result;
      }

      /**
       * <code>required .hadoop.fs.FileStatusProto.FileType fileType = 1;</code>
       */
      public Builder setFileType(org.apache.hadoop.fs.FSProtos.FileStatusProto.FileType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        fileType_ = value.getNumber();
        onChanged();
        return this;
      }

      /**
       * <code>required .hadoop.fs.FileStatusProto.FileType fileType = 1;</code>
       */
      public Builder clearFileType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        fileType_ = 1;
        onChanged();
        return this;
      }

      private java.lang.Object path_ = "";

      /**
       * <code>required string path = 2;</code>
       */
      public boolean hasPath() {
        return ((bitField0_ & 0x00000002) != 0);
      }

      /**
       * <code>required string path = 2;</code>
       */
      public java.lang.String getPath() {
        java.lang.Object ref = path_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            path_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>required string path = 2;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
      getPathBytes() {
        java.lang.Object ref = path_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b =
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          path_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>required string path = 2;</code>
       */
      public Builder setPath(
          java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        path_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required string path = 2;</code>
       */
      public Builder clearPath() {
        bitField0_ = (bitField0_ & ~0x00000002);
        path_ = getDefaultInstance().getPath();
        onChanged();
        return this;
      }

      /**
       * <code>required string path = 2;</code>
       */
      public Builder setPathBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        path_ = value;
        onChanged();
        return this;
      }

      private long length_;

      /**
       * <code>optional uint64 length = 3;</code>
       */
      public boolean hasLength() {
        return ((bitField0_ & 0x00000004) != 0);
      }

      /**
       * <code>optional uint64 length = 3;</code>
       */
      public long getLength() {
        return length_;
      }

      /**
       * <code>optional uint64 length = 3;</code>
       */
      public Builder setLength(long value) {
        bitField0_ |= 0x00000004;
        length_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint64 length = 3;</code>
       */
      public Builder clearLength() {
        bitField0_ = (bitField0_ & ~0x00000004);
        length_ = 0L;
        onChanged();
        return this;
      }

      private org.apache.hadoop.fs.FSProtos.FsPermissionProto permission_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.fs.FSProtos.FsPermissionProto, org.apache.hadoop.fs.FSProtos.FsPermissionProto.Builder, org.apache.hadoop.fs.FSProtos.FsPermissionProtoOrBuilder> permissionBuilder_;

      /**
       * <code>optional .hadoop.fs.FsPermissionProto permission = 4;</code>
       */
      public boolean hasPermission() {
        return ((bitField0_ & 0x00000008) != 0);
      }

      /**
       * <code>optional .hadoop.fs.FsPermissionProto permission = 4;</code>
       */
      public org.apache.hadoop.fs.FSProtos.FsPermissionProto getPermission() {
        if (permissionBuilder_ == null) {
          return permission_ == null ? org.apache.hadoop.fs.FSProtos.FsPermissionProto.getDefaultInstance() : permission_;
        } else {
          return permissionBuilder_.getMessage();
        }
      }

      /**
       * <code>optional .hadoop.fs.FsPermissionProto permission = 4;</code>
       */
      public Builder setPermission(org.apache.hadoop.fs.FSProtos.FsPermissionProto value) {
        if (permissionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          permission_ = value;
          onChanged();
        } else {
          permissionBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }

      /**
       * <code>optional .hadoop.fs.FsPermissionProto permission = 4;</code>
       */
      public Builder setPermission(
          org.apache.hadoop.fs.FSProtos.FsPermissionProto.Builder builderForValue) {
        if (permissionBuilder_ == null) {
          permission_ = builderForValue.build();
          onChanged();
        } else {
          permissionBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }

      /**
       * <code>optional .hadoop.fs.FsPermissionProto permission = 4;</code>
       */
      public Builder mergePermission(org.apache.hadoop.fs.FSProtos.FsPermissionProto value) {
        if (permissionBuilder_ == null) {
          if (((bitField0_ & 0x00000008) != 0) &&
              permission_ != null &&
              permission_ != org.apache.hadoop.fs.FSProtos.FsPermissionProto.getDefaultInstance()) {
            permission_ =
                org.apache.hadoop.fs.FSProtos.FsPermissionProto.newBuilder(permission_).mergeFrom(value).buildPartial();
          } else {
            permission_ = value;
          }
          onChanged();
        } else {
          permissionBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }

      /**
       * <code>optional .hadoop.fs.FsPermissionProto permission = 4;</code>
       */
      public Builder clearPermission() {
        if (permissionBuilder_ == null) {
          permission_ = null;
          onChanged();
        } else {
          permissionBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      /**
       * <code>optional .hadoop.fs.FsPermissionProto permission = 4;</code>
       */
      public org.apache.hadoop.fs.FSProtos.FsPermissionProto.Builder getPermissionBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getPermissionFieldBuilder().getBuilder();
      }

      /**
       * <code>optional .hadoop.fs.FsPermissionProto permission = 4;</code>
       */
      public org.apache.hadoop.fs.FSProtos.FsPermissionProtoOrBuilder getPermissionOrBuilder() {
        if (permissionBuilder_ != null) {
          return permissionBuilder_.getMessageOrBuilder();
        } else {
          return permission_ == null ?
              org.apache.hadoop.fs.FSProtos.FsPermissionProto.getDefaultInstance() : permission_;
        }
      }

      /**
       * <code>optional .hadoop.fs.FsPermissionProto permission = 4;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.fs.FSProtos.FsPermissionProto, org.apache.hadoop.fs.FSProtos.FsPermissionProto.Builder, org.apache.hadoop.fs.FSProtos.FsPermissionProtoOrBuilder>
      getPermissionFieldBuilder() {
        if (permissionBuilder_ == null) {
          permissionBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.fs.FSProtos.FsPermissionProto, org.apache.hadoop.fs.FSProtos.FsPermissionProto.Builder, org.apache.hadoop.fs.FSProtos.FsPermissionProtoOrBuilder>(
              getPermission(),
              getParentForChildren(),
              isClean());
          permission_ = null;
        }
        return permissionBuilder_;
      }

      private java.lang.Object owner_ = "";

      /**
       * <code>optional string owner = 5;</code>
       */
      public boolean hasOwner() {
        return ((bitField0_ & 0x00000010) != 0);
      }

      /**
       * <code>optional string owner = 5;</code>
       */
      public java.lang.String getOwner() {
        java.lang.Object ref = owner_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            owner_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>optional string owner = 5;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
      getOwnerBytes() {
        java.lang.Object ref = owner_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b =
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          owner_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>optional string owner = 5;</code>
       */
      public Builder setOwner(
          java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        owner_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional string owner = 5;</code>
       */
      public Builder clearOwner() {
        bitField0_ = (bitField0_ & ~0x00000010);
        owner_ = getDefaultInstance().getOwner();
        onChanged();
        return this;
      }

      /**
       * <code>optional string owner = 5;</code>
       */
      public Builder setOwnerBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        owner_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object group_ = "";

      /**
       * <code>optional string group = 6;</code>
       */
      public boolean hasGroup() {
        return ((bitField0_ & 0x00000020) != 0);
      }

      /**
       * <code>optional string group = 6;</code>
       */
      public java.lang.String getGroup() {
        java.lang.Object ref = group_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            group_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>optional string group = 6;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
      getGroupBytes() {
        java.lang.Object ref = group_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b =
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          group_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>optional string group = 6;</code>
       */
      public Builder setGroup(
          java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000020;
        group_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional string group = 6;</code>
       */
      public Builder clearGroup() {
        bitField0_ = (bitField0_ & ~0x00000020);
        group_ = getDefaultInstance().getGroup();
        onChanged();
        return this;
      }

      /**
       * <code>optional string group = 6;</code>
       */
      public Builder setGroupBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000020;
        group_ = value;
        onChanged();
        return this;
      }

      private long modificationTime_;

      /**
       * <code>optional uint64 modification_time = 7;</code>
       */
      public boolean hasModificationTime() {
        return ((bitField0_ & 0x00000040) != 0);
      }

      /**
       * <code>optional uint64 modification_time = 7;</code>
       */
      public long getModificationTime() {
        return modificationTime_;
      }

      /**
       * <code>optional uint64 modification_time = 7;</code>
       */
      public Builder setModificationTime(long value) {
        bitField0_ |= 0x00000040;
        modificationTime_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint64 modification_time = 7;</code>
       */
      public Builder clearModificationTime() {
        bitField0_ = (bitField0_ & ~0x00000040);
        modificationTime_ = 0L;
        onChanged();
        return this;
      }

      private long accessTime_;

      /**
       * <code>optional uint64 access_time = 8;</code>
       */
      public boolean hasAccessTime() {
        return ((bitField0_ & 0x00000080) != 0);
      }

      /**
       * <code>optional uint64 access_time = 8;</code>
       */
      public long getAccessTime() {
        return accessTime_;
      }

      /**
       * <code>optional uint64 access_time = 8;</code>
       */
      public Builder setAccessTime(long value) {
        bitField0_ |= 0x00000080;
        accessTime_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint64 access_time = 8;</code>
       */
      public Builder clearAccessTime() {
        bitField0_ = (bitField0_ & ~0x00000080);
        accessTime_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object symlink_ = "";

      /**
       * <code>optional string symlink = 9;</code>
       */
      public boolean hasSymlink() {
        return ((bitField0_ & 0x00000100) != 0);
      }

      /**
       * <code>optional string symlink = 9;</code>
       */
      public java.lang.String getSymlink() {
        java.lang.Object ref = symlink_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            symlink_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>optional string symlink = 9;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
      getSymlinkBytes() {
        java.lang.Object ref = symlink_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b =
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          symlink_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>optional string symlink = 9;</code>
       */
      public Builder setSymlink(
          java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000100;
        symlink_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional string symlink = 9;</code>
       */
      public Builder clearSymlink() {
        bitField0_ = (bitField0_ & ~0x00000100);
        symlink_ = getDefaultInstance().getSymlink();
        onChanged();
        return this;
      }

      /**
       * <code>optional string symlink = 9;</code>
       */
      public Builder setSymlinkBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000100;
        symlink_ = value;
        onChanged();
        return this;
      }

      private int blockReplication_;

      /**
       * <code>optional uint32 block_replication = 10;</code>
       */
      public boolean hasBlockReplication() {
        return ((bitField0_ & 0x00000200) != 0);
      }

      /**
       * <code>optional uint32 block_replication = 10;</code>
       */
      public int getBlockReplication() {
        return blockReplication_;
      }

      /**
       * <code>optional uint32 block_replication = 10;</code>
       */
      public Builder setBlockReplication(int value) {
        bitField0_ |= 0x00000200;
        blockReplication_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint32 block_replication = 10;</code>
       */
      public Builder clearBlockReplication() {
        bitField0_ = (bitField0_ & ~0x00000200);
        blockReplication_ = 0;
        onChanged();
        return this;
      }

      private long blockSize_;

      /**
       * <code>optional uint64 block_size = 11;</code>
       */
      public boolean hasBlockSize() {
        return ((bitField0_ & 0x00000400) != 0);
      }

      /**
       * <code>optional uint64 block_size = 11;</code>
       */
      public long getBlockSize() {
        return blockSize_;
      }

      /**
       * <code>optional uint64 block_size = 11;</code>
       */
      public Builder setBlockSize(long value) {
        bitField0_ |= 0x00000400;
        blockSize_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint64 block_size = 11;</code>
       */
      public Builder clearBlockSize() {
        bitField0_ = (bitField0_ & ~0x00000400);
        blockSize_ = 0L;
        onChanged();
        return this;
      }

      private org.apache.hadoop.thirdparty.protobuf.ByteString encryptionData_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;

      /**
       * <pre>
       * locations                          = 12
       * alias                              = 13
       * childrenNum                        = 14
       * </pre>
       *
       * <code>optional bytes encryption_data = 15;</code>
       */
      public boolean hasEncryptionData() {
        return ((bitField0_ & 0x00000800) != 0);
      }

      /**
       * <pre>
       * locations                          = 12
       * alias                              = 13
       * childrenNum                        = 14
       * </pre>
       *
       * <code>optional bytes encryption_data = 15;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString getEncryptionData() {
        return encryptionData_;
      }

      /**
       * <pre>
       * locations                          = 12
       * alias                              = 13
       * childrenNum                        = 14
       * </pre>
       *
       * <code>optional bytes encryption_data = 15;</code>
       */
      public Builder setEncryptionData(org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000800;
        encryptionData_ = value;
        onChanged();
        return this;
      }

      /**
       * <pre>
       * locations                          = 12
       * alias                              = 13
       * childrenNum                        = 14
       * </pre>
       *
       * <code>optional bytes encryption_data = 15;</code>
       */
      public Builder clearEncryptionData() {
        bitField0_ = (bitField0_ & ~0x00000800);
        encryptionData_ = getDefaultInstance().getEncryptionData();
        onChanged();
        return this;
      }

      private org.apache.hadoop.thirdparty.protobuf.ByteString ecData_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;

      /**
       * <pre>
       * storagePolicy                      = 16
       * </pre>
       *
       * <code>optional bytes ec_data = 17;</code>
       */
      public boolean hasEcData() {
        return ((bitField0_ & 0x00001000) != 0);
      }

      /**
       * <pre>
       * storagePolicy                      = 16
       * </pre>
       *
       * <code>optional bytes ec_data = 17;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString getEcData() {
        return ecData_;
      }

      /**
       * <pre>
       * storagePolicy                      = 16
       * </pre>
       *
       * <code>optional bytes ec_data = 17;</code>
       */
      public Builder setEcData(org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00001000;
        ecData_ = value;
        onChanged();
        return this;
      }

      /**
       * <pre>
       * storagePolicy                      = 16
       * </pre>
       *
       * <code>optional bytes ec_data = 17;</code>
       */
      public Builder clearEcData() {
        bitField0_ = (bitField0_ & ~0x00001000);
        ecData_ = getDefaultInstance().getEcData();
        onChanged();
        return this;
      }

      private int flags_;

      /**
       * <code>optional uint32 flags = 18 [default = 0];</code>
       */
      public boolean hasFlags() {
        return ((bitField0_ & 0x00002000) != 0);
      }

      /**
       * <code>optional uint32 flags = 18 [default = 0];</code>
       */
      public int getFlags() {
        return flags_;
      }

      /**
       * <code>optional uint32 flags = 18 [default = 0];</code>
       */
      public Builder setFlags(int value) {
        bitField0_ |= 0x00002000;
        flags_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint32 flags = 18 [default = 0];</code>
       */
      public Builder clearFlags() {
        bitField0_ = (bitField0_ & ~0x00002000);
        flags_ = 0;
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


      // @@protoc_insertion_point(builder_scope:hadoop.fs.FileStatusProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.fs.FileStatusProto)
    private static final org.apache.hadoop.fs.FSProtos.FileStatusProto DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.fs.FSProtos.FileStatusProto();
    }

    public static org.apache.hadoop.fs.FSProtos.FileStatusProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final org.apache.hadoop.thirdparty.protobuf.Parser<FileStatusProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<FileStatusProto>() {
      @java.lang.Override
      public FileStatusProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new FileStatusProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<FileStatusProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<FileStatusProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.fs.FSProtos.FileStatusProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface LocalFileSystemPathHandleProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.fs.LocalFileSystemPathHandleProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>optional uint64 mtime = 1;</code>
     */
    boolean hasMtime();

    /**
     * <code>optional uint64 mtime = 1;</code>
     */
    long getMtime();

    /**
     * <code>optional string path = 2;</code>
     */
    boolean hasPath();

    /**
     * <code>optional string path = 2;</code>
     */
    java.lang.String getPath();

    /**
     * <code>optional string path = 2;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
    getPathBytes();
  }

  /**
   * <pre>
   **
   * Placeholder type for consistent basic FileSystem operations.
   * </pre>
   *
   * Protobuf type {@code hadoop.fs.LocalFileSystemPathHandleProto}
   */
  public static final class LocalFileSystemPathHandleProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.fs.LocalFileSystemPathHandleProto)
      LocalFileSystemPathHandleProtoOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use LocalFileSystemPathHandleProto.newBuilder() to construct.
    private LocalFileSystemPathHandleProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private LocalFileSystemPathHandleProto() {
      path_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    private LocalFileSystemPathHandleProto(
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
              mtime_ = input.readUInt64();
              break;
            }
            case 18: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              path_ = bs;
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
      return org.apache.hadoop.fs.FSProtos.internal_static_hadoop_fs_LocalFileSystemPathHandleProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return org.apache.hadoop.fs.FSProtos.internal_static_hadoop_fs_LocalFileSystemPathHandleProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto.class, org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto.Builder.class);
    }

    private int bitField0_;
    public static final int MTIME_FIELD_NUMBER = 1;
    private long mtime_;

    /**
     * <code>optional uint64 mtime = 1;</code>
     */
    public boolean hasMtime() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>optional uint64 mtime = 1;</code>
     */
    public long getMtime() {
      return mtime_;
    }

    public static final int PATH_FIELD_NUMBER = 2;
    private volatile java.lang.Object path_;

    /**
     * <code>optional string path = 2;</code>
     */
    public boolean hasPath() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     * <code>optional string path = 2;</code>
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs =
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          path_ = s;
        }
        return s;
      }
    }

    /**
     * <code>optional string path = 2;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
    getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b =
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        path_ = b;
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
        output.writeUInt64(1, mtime_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 2, path_);
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
            .computeUInt64Size(1, mtime_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(2, path_);
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
      if (!(obj instanceof org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto other = (org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto) obj;

      if (hasMtime() != other.hasMtime()) return false;
      if (hasMtime()) {
        if (getMtime()
            != other.getMtime()) return false;
      }
      if (hasPath() != other.hasPath()) return false;
      if (hasPath()) {
        if (!getPath()
            .equals(other.getPath())) return false;
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
      if (hasMtime()) {
        hash = (37 * hash) + MTIME_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getMtime());
      }
      if (hasPath()) {
        hash = (37 * hash) + PATH_FIELD_NUMBER;
        hash = (53 * hash) + getPath().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto parseFrom(
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

    public static Builder newBuilder(org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto prototype) {
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
     * Placeholder type for consistent basic FileSystem operations.
     * </pre>
     *
     * Protobuf type {@code hadoop.fs.LocalFileSystemPathHandleProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.fs.LocalFileSystemPathHandleProto)
        org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return org.apache.hadoop.fs.FSProtos.internal_static_hadoop_fs_LocalFileSystemPathHandleProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return org.apache.hadoop.fs.FSProtos.internal_static_hadoop_fs_LocalFileSystemPathHandleProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto.class, org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto.Builder.class);
      }

      // Construct using org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto.newBuilder()
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
        mtime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        path_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return org.apache.hadoop.fs.FSProtos.internal_static_hadoop_fs_LocalFileSystemPathHandleProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto getDefaultInstanceForType() {
        return org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto build() {
        org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto buildPartial() {
        org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto result = new org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.mtime_ = mtime_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.path_ = path_;
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
        if (other instanceof org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto) {
          return mergeFrom((org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto other) {
        if (other == org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto.getDefaultInstance()) return this;
        if (other.hasMtime()) {
          setMtime(other.getMtime());
        }
        if (other.hasPath()) {
          bitField0_ |= 0x00000002;
          path_ = other.path_;
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
        org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private long mtime_;

      /**
       * <code>optional uint64 mtime = 1;</code>
       */
      public boolean hasMtime() {
        return ((bitField0_ & 0x00000001) != 0);
      }

      /**
       * <code>optional uint64 mtime = 1;</code>
       */
      public long getMtime() {
        return mtime_;
      }

      /**
       * <code>optional uint64 mtime = 1;</code>
       */
      public Builder setMtime(long value) {
        bitField0_ |= 0x00000001;
        mtime_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint64 mtime = 1;</code>
       */
      public Builder clearMtime() {
        bitField0_ = (bitField0_ & ~0x00000001);
        mtime_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object path_ = "";

      /**
       * <code>optional string path = 2;</code>
       */
      public boolean hasPath() {
        return ((bitField0_ & 0x00000002) != 0);
      }

      /**
       * <code>optional string path = 2;</code>
       */
      public java.lang.String getPath() {
        java.lang.Object ref = path_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            path_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>optional string path = 2;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
      getPathBytes() {
        java.lang.Object ref = path_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b =
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          path_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>optional string path = 2;</code>
       */
      public Builder setPath(
          java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        path_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional string path = 2;</code>
       */
      public Builder clearPath() {
        bitField0_ = (bitField0_ & ~0x00000002);
        path_ = getDefaultInstance().getPath();
        onChanged();
        return this;
      }

      /**
       * <code>optional string path = 2;</code>
       */
      public Builder setPathBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        path_ = value;
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


      // @@protoc_insertion_point(builder_scope:hadoop.fs.LocalFileSystemPathHandleProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.fs.LocalFileSystemPathHandleProto)
    private static final org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto();
    }

    public static org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final org.apache.hadoop.thirdparty.protobuf.Parser<LocalFileSystemPathHandleProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<LocalFileSystemPathHandleProto>() {
      @java.lang.Override
      public LocalFileSystemPathHandleProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new LocalFileSystemPathHandleProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<LocalFileSystemPathHandleProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<LocalFileSystemPathHandleProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.fs.FSProtos.LocalFileSystemPathHandleProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      internal_static_hadoop_fs_FsPermissionProto_descriptor;
  private static final
  org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_fs_FsPermissionProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      internal_static_hadoop_fs_FileStatusProto_descriptor;
  private static final
  org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_fs_FileStatusProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      internal_static_hadoop_fs_LocalFileSystemPathHandleProto_descriptor;
  private static final
  org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_fs_LocalFileSystemPathHandleProto_fieldAccessorTable;

  public static org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
  getDescriptor() {
    return descriptor;
  }

  private static org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      descriptor;

  static {
    java.lang.String[] descriptorData = {
        "\n\016FSProtos.proto\022\thadoop.fs\"!\n\021FsPermiss" +
            "ionProto\022\014\n\004perm\030\001 \002(\r\"\336\003\n\017FileStatusPro" +
            "to\0225\n\010fileType\030\001 \002(\0162#.hadoop.fs.FileSta" +
            "tusProto.FileType\022\014\n\004path\030\002 \002(\t\022\016\n\006lengt" +
            "h\030\003 \001(\004\0220\n\npermission\030\004 \001(\0132\034.hadoop.fs." +
            "FsPermissionProto\022\r\n\005owner\030\005 \001(\t\022\r\n\005grou" +
            "p\030\006 \001(\t\022\031\n\021modification_time\030\007 \001(\004\022\023\n\013ac" +
            "cess_time\030\010 \001(\004\022\017\n\007symlink\030\t \001(\t\022\031\n\021bloc" +
            "k_replication\030\n \001(\r\022\022\n\nblock_size\030\013 \001(\004\022" +
            "\027\n\017encryption_data\030\017 \001(\014\022\017\n\007ec_data\030\021 \001(" +
            "\014\022\020\n\005flags\030\022 \001(\r:\0010\"3\n\010FileType\022\n\n\006FT_DI" +
            "R\020\001\022\013\n\007FT_FILE\020\002\022\016\n\nFT_SYMLINK\020\003\"E\n\005Flag" +
            "s\022\013\n\007HAS_ACL\020\001\022\r\n\tHAS_CRYPT\020\002\022\n\n\006HAS_EC\020" +
            "\004\022\024\n\020SNAPSHOT_ENABLED\020\010\"=\n\036LocalFileSyst" +
            "emPathHandleProto\022\r\n\005mtime\030\001 \001(\004\022\014\n\004path" +
            "\030\002 \001(\tB&\n\024org.apache.hadoop.fsB\010FSProtos" +
            "\210\001\001\240\001\001"
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
    internal_static_hadoop_fs_FsPermissionProto_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_hadoop_fs_FsPermissionProto_fieldAccessorTable = new
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_fs_FsPermissionProto_descriptor,
        new java.lang.String[]{"Perm",});
    internal_static_hadoop_fs_FileStatusProto_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_hadoop_fs_FileStatusProto_fieldAccessorTable = new
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_fs_FileStatusProto_descriptor,
        new java.lang.String[]{"FileType", "Path", "Length", "Permission", "Owner", "Group", "ModificationTime", "AccessTime", "Symlink", "BlockReplication", "BlockSize", "EncryptionData", "EcData", "Flags",});
    internal_static_hadoop_fs_LocalFileSystemPathHandleProto_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_hadoop_fs_LocalFileSystemPathHandleProto_fieldAccessorTable = new
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_fs_LocalFileSystemPathHandleProto_descriptor,
        new java.lang.String[]{"Mtime", "Path",});
  }

  // @@protoc_insertion_point(outer_class_scope)
}
