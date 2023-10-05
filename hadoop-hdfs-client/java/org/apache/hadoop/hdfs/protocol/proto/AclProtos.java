// source: acl.proto

package org.apache.hadoop.hdfs.protocol.proto;

public final class AclProtos {
  private AclProtos() {}
  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FsPermissionProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.FsPermissionProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Actually a short - only 16bits used
     * </pre>
     *
     * <code>required uint32 perm = 1;</code>
     */
    boolean hasPerm();
    /**
     * <pre>
     * Actually a short - only 16bits used
     * </pre>
     *
     * <code>required uint32 perm = 1;</code>
     */
    int getPerm();
  }
  /**
   * <pre>
   **
   * File or Directory permision - same spec as posix
   * </pre>
   *
   * Protobuf type {@code hadoop.hdfs.FsPermissionProto}
   */
  public  static final class FsPermissionProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.FsPermissionProto)
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
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_FsPermissionProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_FsPermissionProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.Builder.class);
    }

    private int bitField0_;
    public static final int PERM_FIELD_NUMBER = 1;
    private int perm_;
    /**
     * <pre>
     * Actually a short - only 16bits used
     * </pre>
     *
     * <code>required uint32 perm = 1;</code>
     */
    public boolean hasPerm() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Actually a short - only 16bits used
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto other = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto prototype) {
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
     * File or Directory permision - same spec as posix
     * </pre>
     *
     * Protobuf type {@code hadoop.hdfs.FsPermissionProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.FsPermissionProto)
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_FsPermissionProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_FsPermissionProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_FsPermissionProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto result = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto(this);
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int perm_ ;
      /**
       * <pre>
       * Actually a short - only 16bits used
       * </pre>
       *
       * <code>required uint32 perm = 1;</code>
       */
      public boolean hasPerm() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Actually a short - only 16bits used
       * </pre>
       *
       * <code>required uint32 perm = 1;</code>
       */
      public int getPerm() {
        return perm_;
      }
      /**
       * <pre>
       * Actually a short - only 16bits used
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
       * Actually a short - only 16bits used
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.FsPermissionProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.FsPermissionProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<FsPermissionProto>
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
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface AclEntryProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.AclEntryProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required .hadoop.hdfs.AclEntryProto.AclEntryTypeProto type = 1;</code>
     */
    boolean hasType();
    /**
     * <code>required .hadoop.hdfs.AclEntryProto.AclEntryTypeProto type = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryTypeProto getType();

    /**
     * <code>required .hadoop.hdfs.AclEntryProto.AclEntryScopeProto scope = 2;</code>
     */
    boolean hasScope();
    /**
     * <code>required .hadoop.hdfs.AclEntryProto.AclEntryScopeProto scope = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryScopeProto getScope();

    /**
     * <code>required .hadoop.hdfs.AclEntryProto.FsActionProto permissions = 3;</code>
     */
    boolean hasPermissions();
    /**
     * <code>required .hadoop.hdfs.AclEntryProto.FsActionProto permissions = 3;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.FsActionProto getPermissions();

    /**
     * <code>optional string name = 4;</code>
     */
    boolean hasName();
    /**
     * <code>optional string name = 4;</code>
     */
    java.lang.String getName();
    /**
     * <code>optional string name = 4;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getNameBytes();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.AclEntryProto}
   */
  public  static final class AclEntryProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.AclEntryProto)
      AclEntryProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AclEntryProto.newBuilder() to construct.
    private AclEntryProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AclEntryProto() {
      type_ = 0;
      scope_ = 0;
      permissions_ = 0;
      name_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AclEntryProto(
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
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryTypeProto value = org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryTypeProto.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                type_ = rawValue;
              }
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryScopeProto value = org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryScopeProto.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                scope_ = rawValue;
              }
              break;
            }
            case 24: {
              int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.FsActionProto value = org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.FsActionProto.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(3, rawValue);
              } else {
                bitField0_ |= 0x00000004;
                permissions_ = rawValue;
              }
              break;
            }
            case 34: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              name_ = bs;
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
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_AclEntryProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_AclEntryProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder.class);
    }

    /**
     * Protobuf enum {@code hadoop.hdfs.AclEntryProto.AclEntryScopeProto}
     */
    public enum AclEntryScopeProto
        implements org.apache.hadoop.thirdparty.protobuf.ProtocolMessageEnum {
      /**
       * <code>ACCESS = 0;</code>
       */
      ACCESS(0),
      /**
       * <code>DEFAULT = 1;</code>
       */
      DEFAULT(1),
      ;

      /**
       * <code>ACCESS = 0;</code>
       */
      public static final int ACCESS_VALUE = 0;
      /**
       * <code>DEFAULT = 1;</code>
       */
      public static final int DEFAULT_VALUE = 1;


      public final int getNumber() {
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static AclEntryScopeProto valueOf(int value) {
        return forNumber(value);
      }

      public static AclEntryScopeProto forNumber(int value) {
        switch (value) {
          case 0: return ACCESS;
          case 1: return DEFAULT;
          default: return null;
        }
      }

      public static org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<AclEntryScopeProto>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<
          AclEntryScopeProto> internalValueMap =
            new org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<AclEntryScopeProto>() {
              public AclEntryScopeProto findValueByNumber(int number) {
                return AclEntryScopeProto.forNumber(number);
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
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.getDescriptor().getEnumTypes().get(0);
      }

      private static final AclEntryScopeProto[] VALUES = values();

      public static AclEntryScopeProto valueOf(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private AclEntryScopeProto(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:hadoop.hdfs.AclEntryProto.AclEntryScopeProto)
    }

    /**
     * Protobuf enum {@code hadoop.hdfs.AclEntryProto.AclEntryTypeProto}
     */
    public enum AclEntryTypeProto
        implements org.apache.hadoop.thirdparty.protobuf.ProtocolMessageEnum {
      /**
       * <code>USER = 0;</code>
       */
      USER(0),
      /**
       * <code>GROUP = 1;</code>
       */
      GROUP(1),
      /**
       * <code>MASK = 2;</code>
       */
      MASK(2),
      /**
       * <code>OTHER = 3;</code>
       */
      OTHER(3),
      ;

      /**
       * <code>USER = 0;</code>
       */
      public static final int USER_VALUE = 0;
      /**
       * <code>GROUP = 1;</code>
       */
      public static final int GROUP_VALUE = 1;
      /**
       * <code>MASK = 2;</code>
       */
      public static final int MASK_VALUE = 2;
      /**
       * <code>OTHER = 3;</code>
       */
      public static final int OTHER_VALUE = 3;


      public final int getNumber() {
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static AclEntryTypeProto valueOf(int value) {
        return forNumber(value);
      }

      public static AclEntryTypeProto forNumber(int value) {
        switch (value) {
          case 0: return USER;
          case 1: return GROUP;
          case 2: return MASK;
          case 3: return OTHER;
          default: return null;
        }
      }

      public static org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<AclEntryTypeProto>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<
          AclEntryTypeProto> internalValueMap =
            new org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<AclEntryTypeProto>() {
              public AclEntryTypeProto findValueByNumber(int number) {
                return AclEntryTypeProto.forNumber(number);
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
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.getDescriptor().getEnumTypes().get(1);
      }

      private static final AclEntryTypeProto[] VALUES = values();

      public static AclEntryTypeProto valueOf(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private AclEntryTypeProto(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:hadoop.hdfs.AclEntryProto.AclEntryTypeProto)
    }

    /**
     * Protobuf enum {@code hadoop.hdfs.AclEntryProto.FsActionProto}
     */
    public enum FsActionProto
        implements org.apache.hadoop.thirdparty.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0),
      /**
       * <code>EXECUTE = 1;</code>
       */
      EXECUTE(1),
      /**
       * <code>WRITE = 2;</code>
       */
      WRITE(2),
      /**
       * <code>WRITE_EXECUTE = 3;</code>
       */
      WRITE_EXECUTE(3),
      /**
       * <code>READ = 4;</code>
       */
      READ(4),
      /**
       * <code>READ_EXECUTE = 5;</code>
       */
      READ_EXECUTE(5),
      /**
       * <code>READ_WRITE = 6;</code>
       */
      READ_WRITE(6),
      /**
       * <code>PERM_ALL = 7;</code>
       */
      PERM_ALL(7),
      ;

      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>EXECUTE = 1;</code>
       */
      public static final int EXECUTE_VALUE = 1;
      /**
       * <code>WRITE = 2;</code>
       */
      public static final int WRITE_VALUE = 2;
      /**
       * <code>WRITE_EXECUTE = 3;</code>
       */
      public static final int WRITE_EXECUTE_VALUE = 3;
      /**
       * <code>READ = 4;</code>
       */
      public static final int READ_VALUE = 4;
      /**
       * <code>READ_EXECUTE = 5;</code>
       */
      public static final int READ_EXECUTE_VALUE = 5;
      /**
       * <code>READ_WRITE = 6;</code>
       */
      public static final int READ_WRITE_VALUE = 6;
      /**
       * <code>PERM_ALL = 7;</code>
       */
      public static final int PERM_ALL_VALUE = 7;


      public final int getNumber() {
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static FsActionProto valueOf(int value) {
        return forNumber(value);
      }

      public static FsActionProto forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 1: return EXECUTE;
          case 2: return WRITE;
          case 3: return WRITE_EXECUTE;
          case 4: return READ;
          case 5: return READ_EXECUTE;
          case 6: return READ_WRITE;
          case 7: return PERM_ALL;
          default: return null;
        }
      }

      public static org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<FsActionProto>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<
          FsActionProto> internalValueMap =
            new org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<FsActionProto>() {
              public FsActionProto findValueByNumber(int number) {
                return FsActionProto.forNumber(number);
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
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.getDescriptor().getEnumTypes().get(2);
      }

      private static final FsActionProto[] VALUES = values();

      public static FsActionProto valueOf(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private FsActionProto(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:hadoop.hdfs.AclEntryProto.FsActionProto)
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>required .hadoop.hdfs.AclEntryProto.AclEntryTypeProto type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required .hadoop.hdfs.AclEntryProto.AclEntryTypeProto type = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryTypeProto getType() {
      @SuppressWarnings("deprecation")
      org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryTypeProto result = org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryTypeProto.valueOf(type_);
      return result == null ? org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryTypeProto.USER : result;
    }

    public static final int SCOPE_FIELD_NUMBER = 2;
    private int scope_;
    /**
     * <code>required .hadoop.hdfs.AclEntryProto.AclEntryScopeProto scope = 2;</code>
     */
    public boolean hasScope() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required .hadoop.hdfs.AclEntryProto.AclEntryScopeProto scope = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryScopeProto getScope() {
      @SuppressWarnings("deprecation")
      org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryScopeProto result = org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryScopeProto.valueOf(scope_);
      return result == null ? org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryScopeProto.ACCESS : result;
    }

    public static final int PERMISSIONS_FIELD_NUMBER = 3;
    private int permissions_;
    /**
     * <code>required .hadoop.hdfs.AclEntryProto.FsActionProto permissions = 3;</code>
     */
    public boolean hasPermissions() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required .hadoop.hdfs.AclEntryProto.FsActionProto permissions = 3;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.FsActionProto getPermissions() {
      @SuppressWarnings("deprecation")
      org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.FsActionProto result = org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.FsActionProto.valueOf(permissions_);
      return result == null ? org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.FsActionProto.NONE : result;
    }

    public static final int NAME_FIELD_NUMBER = 4;
    private volatile java.lang.Object name_;
    /**
     * <code>optional string name = 4;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional string name = 4;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string name = 4;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
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

      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasScope()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPermissions()) {
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
        output.writeEnum(1, type_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeEnum(2, scope_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeEnum(3, permissions_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 4, name_);
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
          .computeEnumSize(1, type_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeEnumSize(2, scope_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeEnumSize(3, permissions_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(4, name_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto other = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto) obj;

      if (hasType() != other.hasType()) return false;
      if (hasType()) {
        if (type_ != other.type_) return false;
      }
      if (hasScope() != other.hasScope()) return false;
      if (hasScope()) {
        if (scope_ != other.scope_) return false;
      }
      if (hasPermissions() != other.hasPermissions()) return false;
      if (hasPermissions()) {
        if (permissions_ != other.permissions_) return false;
      }
      if (hasName() != other.hasName()) return false;
      if (hasName()) {
        if (!getName()
            .equals(other.getName())) return false;
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
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + type_;
      }
      if (hasScope()) {
        hash = (37 * hash) + SCOPE_FIELD_NUMBER;
        hash = (53 * hash) + scope_;
      }
      if (hasPermissions()) {
        hash = (37 * hash) + PERMISSIONS_FIELD_NUMBER;
        hash = (53 * hash) + permissions_;
      }
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.AclEntryProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.AclEntryProto)
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_AclEntryProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_AclEntryProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.newBuilder()
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
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        scope_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        permissions_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_AclEntryProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto result = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.scope_ = scope_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.permissions_ = permissions_;
        if (((from_bitField0_ & 0x00000008) != 0)) {
          to_bitField0_ |= 0x00000008;
        }
        result.name_ = name_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasScope()) {
          setScope(other.getScope());
        }
        if (other.hasPermissions()) {
          setPermissions(other.getPermissions());
        }
        if (other.hasName()) {
          bitField0_ |= 0x00000008;
          name_ = other.name_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasType()) {
          return false;
        }
        if (!hasScope()) {
          return false;
        }
        if (!hasPermissions()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int type_ = 0;
      /**
       * <code>required .hadoop.hdfs.AclEntryProto.AclEntryTypeProto type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required .hadoop.hdfs.AclEntryProto.AclEntryTypeProto type = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryTypeProto getType() {
        @SuppressWarnings("deprecation")
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryTypeProto result = org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryTypeProto.valueOf(type_);
        return result == null ? org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryTypeProto.USER : result;
      }
      /**
       * <code>required .hadoop.hdfs.AclEntryProto.AclEntryTypeProto type = 1;</code>
       */
      public Builder setType(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryTypeProto value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.AclEntryProto.AclEntryTypeProto type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = 0;
        onChanged();
        return this;
      }

      private int scope_ = 0;
      /**
       * <code>required .hadoop.hdfs.AclEntryProto.AclEntryScopeProto scope = 2;</code>
       */
      public boolean hasScope() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required .hadoop.hdfs.AclEntryProto.AclEntryScopeProto scope = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryScopeProto getScope() {
        @SuppressWarnings("deprecation")
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryScopeProto result = org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryScopeProto.valueOf(scope_);
        return result == null ? org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryScopeProto.ACCESS : result;
      }
      /**
       * <code>required .hadoop.hdfs.AclEntryProto.AclEntryScopeProto scope = 2;</code>
       */
      public Builder setScope(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryScopeProto value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        scope_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.AclEntryProto.AclEntryScopeProto scope = 2;</code>
       */
      public Builder clearScope() {
        bitField0_ = (bitField0_ & ~0x00000002);
        scope_ = 0;
        onChanged();
        return this;
      }

      private int permissions_ = 0;
      /**
       * <code>required .hadoop.hdfs.AclEntryProto.FsActionProto permissions = 3;</code>
       */
      public boolean hasPermissions() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>required .hadoop.hdfs.AclEntryProto.FsActionProto permissions = 3;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.FsActionProto getPermissions() {
        @SuppressWarnings("deprecation")
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.FsActionProto result = org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.FsActionProto.valueOf(permissions_);
        return result == null ? org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.FsActionProto.NONE : result;
      }
      /**
       * <code>required .hadoop.hdfs.AclEntryProto.FsActionProto permissions = 3;</code>
       */
      public Builder setPermissions(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.FsActionProto value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        permissions_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.AclEntryProto.FsActionProto permissions = 3;</code>
       */
      public Builder clearPermissions() {
        bitField0_ = (bitField0_ & ~0x00000004);
        permissions_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>optional string name = 4;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>optional string name = 4;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string name = 4;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string name = 4;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 4;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000008);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 4;</code>
       */
      public Builder setNameBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        name_ = value;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.AclEntryProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.AclEntryProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<AclEntryProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<AclEntryProto>() {
      @java.lang.Override
      public AclEntryProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new AclEntryProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<AclEntryProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<AclEntryProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface AclStatusProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.AclStatusProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required string owner = 1;</code>
     */
    boolean hasOwner();
    /**
     * <code>required string owner = 1;</code>
     */
    java.lang.String getOwner();
    /**
     * <code>required string owner = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getOwnerBytes();

    /**
     * <code>required string group = 2;</code>
     */
    boolean hasGroup();
    /**
     * <code>required string group = 2;</code>
     */
    java.lang.String getGroup();
    /**
     * <code>required string group = 2;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getGroupBytes();

    /**
     * <code>required bool sticky = 3;</code>
     */
    boolean hasSticky();
    /**
     * <code>required bool sticky = 3;</code>
     */
    boolean getSticky();

    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
     */
    java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> 
        getEntriesList();
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getEntries(int index);
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
     */
    int getEntriesCount();
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
     */
    java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
        getEntriesOrBuilderList();
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder getEntriesOrBuilder(
        int index);

    /**
     * <code>optional .hadoop.hdfs.FsPermissionProto permission = 5;</code>
     */
    boolean hasPermission();
    /**
     * <code>optional .hadoop.hdfs.FsPermissionProto permission = 5;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto getPermission();
    /**
     * <code>optional .hadoop.hdfs.FsPermissionProto permission = 5;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProtoOrBuilder getPermissionOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.AclStatusProto}
   */
  public  static final class AclStatusProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.AclStatusProto)
      AclStatusProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AclStatusProto.newBuilder() to construct.
    private AclStatusProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AclStatusProto() {
      owner_ = "";
      group_ = "";
      entries_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AclStatusProto(
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
              owner_ = bs;
              break;
            }
            case 18: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              group_ = bs;
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              sticky_ = input.readBool();
              break;
            }
            case 34: {
              if (!((mutable_bitField0_ & 0x00000008) != 0)) {
                entries_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto>();
                mutable_bitField0_ |= 0x00000008;
              }
              entries_.add(
                  input.readMessage(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.PARSER, extensionRegistry));
              break;
            }
            case 42: {
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000008) != 0)) {
                subBuilder = permission_.toBuilder();
              }
              permission_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(permission_);
                permission_ = subBuilder.buildPartial();
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
        if (((mutable_bitField0_ & 0x00000008) != 0)) {
          entries_ = java.util.Collections.unmodifiableList(entries_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_AclStatusProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_AclStatusProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.Builder.class);
    }

    private int bitField0_;
    public static final int OWNER_FIELD_NUMBER = 1;
    private volatile java.lang.Object owner_;
    /**
     * <code>required string owner = 1;</code>
     */
    public boolean hasOwner() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string owner = 1;</code>
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
     * <code>required string owner = 1;</code>
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

    public static final int GROUP_FIELD_NUMBER = 2;
    private volatile java.lang.Object group_;
    /**
     * <code>required string group = 2;</code>
     */
    public boolean hasGroup() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required string group = 2;</code>
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
     * <code>required string group = 2;</code>
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

    public static final int STICKY_FIELD_NUMBER = 3;
    private boolean sticky_;
    /**
     * <code>required bool sticky = 3;</code>
     */
    public boolean hasSticky() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required bool sticky = 3;</code>
     */
    public boolean getSticky() {
      return sticky_;
    }

    public static final int ENTRIES_FIELD_NUMBER = 4;
    private java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> entries_;
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
     */
    public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> getEntriesList() {
      return entries_;
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
     */
    public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
        getEntriesOrBuilderList() {
      return entries_;
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
     */
    public int getEntriesCount() {
      return entries_.size();
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getEntries(int index) {
      return entries_.get(index);
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder getEntriesOrBuilder(
        int index) {
      return entries_.get(index);
    }

    public static final int PERMISSION_FIELD_NUMBER = 5;
    private org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto permission_;
    /**
     * <code>optional .hadoop.hdfs.FsPermissionProto permission = 5;</code>
     */
    public boolean hasPermission() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional .hadoop.hdfs.FsPermissionProto permission = 5;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto getPermission() {
      return permission_ == null ? org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.getDefaultInstance() : permission_;
    }
    /**
     * <code>optional .hadoop.hdfs.FsPermissionProto permission = 5;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProtoOrBuilder getPermissionOrBuilder() {
      return permission_ == null ? org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.getDefaultInstance() : permission_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasOwner()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasGroup()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSticky()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getEntriesCount(); i++) {
        if (!getEntries(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, owner_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 2, group_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeBool(3, sticky_);
      }
      for (int i = 0; i < entries_.size(); i++) {
        output.writeMessage(4, entries_.get(i));
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeMessage(5, getPermission());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, owner_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(2, group_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeBoolSize(3, sticky_);
      }
      for (int i = 0; i < entries_.size(); i++) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(4, entries_.get(i));
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(5, getPermission());
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto other = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto) obj;

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
      if (hasSticky() != other.hasSticky()) return false;
      if (hasSticky()) {
        if (getSticky()
            != other.getSticky()) return false;
      }
      if (!getEntriesList()
          .equals(other.getEntriesList())) return false;
      if (hasPermission() != other.hasPermission()) return false;
      if (hasPermission()) {
        if (!getPermission()
            .equals(other.getPermission())) return false;
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
      if (hasOwner()) {
        hash = (37 * hash) + OWNER_FIELD_NUMBER;
        hash = (53 * hash) + getOwner().hashCode();
      }
      if (hasGroup()) {
        hash = (37 * hash) + GROUP_FIELD_NUMBER;
        hash = (53 * hash) + getGroup().hashCode();
      }
      if (hasSticky()) {
        hash = (37 * hash) + STICKY_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashBoolean(
            getSticky());
      }
      if (getEntriesCount() > 0) {
        hash = (37 * hash) + ENTRIES_FIELD_NUMBER;
        hash = (53 * hash) + getEntriesList().hashCode();
      }
      if (hasPermission()) {
        hash = (37 * hash) + PERMISSION_FIELD_NUMBER;
        hash = (53 * hash) + getPermission().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.AclStatusProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.AclStatusProto)
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_AclStatusProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_AclStatusProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.newBuilder()
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
          getEntriesFieldBuilder();
          getPermissionFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        owner_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        group_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        sticky_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        if (entriesBuilder_ == null) {
          entries_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          entriesBuilder_.clear();
        }
        if (permissionBuilder_ == null) {
          permission_ = null;
        } else {
          permissionBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_AclStatusProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto result = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.owner_ = owner_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.group_ = group_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.sticky_ = sticky_;
          to_bitField0_ |= 0x00000004;
        }
        if (entriesBuilder_ == null) {
          if (((bitField0_ & 0x00000008) != 0)) {
            entries_ = java.util.Collections.unmodifiableList(entries_);
            bitField0_ = (bitField0_ & ~0x00000008);
          }
          result.entries_ = entries_;
        } else {
          result.entries_ = entriesBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          if (permissionBuilder_ == null) {
            result.permission_ = permission_;
          } else {
            result.permission_ = permissionBuilder_.build();
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.getDefaultInstance()) return this;
        if (other.hasOwner()) {
          bitField0_ |= 0x00000001;
          owner_ = other.owner_;
          onChanged();
        }
        if (other.hasGroup()) {
          bitField0_ |= 0x00000002;
          group_ = other.group_;
          onChanged();
        }
        if (other.hasSticky()) {
          setSticky(other.getSticky());
        }
        if (entriesBuilder_ == null) {
          if (!other.entries_.isEmpty()) {
            if (entries_.isEmpty()) {
              entries_ = other.entries_;
              bitField0_ = (bitField0_ & ~0x00000008);
            } else {
              ensureEntriesIsMutable();
              entries_.addAll(other.entries_);
            }
            onChanged();
          }
        } else {
          if (!other.entries_.isEmpty()) {
            if (entriesBuilder_.isEmpty()) {
              entriesBuilder_.dispose();
              entriesBuilder_ = null;
              entries_ = other.entries_;
              bitField0_ = (bitField0_ & ~0x00000008);
              entriesBuilder_ = 
                org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getEntriesFieldBuilder() : null;
            } else {
              entriesBuilder_.addAllMessages(other.entries_);
            }
          }
        }
        if (other.hasPermission()) {
          mergePermission(other.getPermission());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasOwner()) {
          return false;
        }
        if (!hasGroup()) {
          return false;
        }
        if (!hasSticky()) {
          return false;
        }
        for (int i = 0; i < getEntriesCount(); i++) {
          if (!getEntries(i).isInitialized()) {
            return false;
          }
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
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object owner_ = "";
      /**
       * <code>required string owner = 1;</code>
       */
      public boolean hasOwner() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string owner = 1;</code>
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
       * <code>required string owner = 1;</code>
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
       * <code>required string owner = 1;</code>
       */
      public Builder setOwner(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        owner_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string owner = 1;</code>
       */
      public Builder clearOwner() {
        bitField0_ = (bitField0_ & ~0x00000001);
        owner_ = getDefaultInstance().getOwner();
        onChanged();
        return this;
      }
      /**
       * <code>required string owner = 1;</code>
       */
      public Builder setOwnerBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        owner_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object group_ = "";
      /**
       * <code>required string group = 2;</code>
       */
      public boolean hasGroup() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required string group = 2;</code>
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
       * <code>required string group = 2;</code>
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
       * <code>required string group = 2;</code>
       */
      public Builder setGroup(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        group_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string group = 2;</code>
       */
      public Builder clearGroup() {
        bitField0_ = (bitField0_ & ~0x00000002);
        group_ = getDefaultInstance().getGroup();
        onChanged();
        return this;
      }
      /**
       * <code>required string group = 2;</code>
       */
      public Builder setGroupBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        group_ = value;
        onChanged();
        return this;
      }

      private boolean sticky_ ;
      /**
       * <code>required bool sticky = 3;</code>
       */
      public boolean hasSticky() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>required bool sticky = 3;</code>
       */
      public boolean getSticky() {
        return sticky_;
      }
      /**
       * <code>required bool sticky = 3;</code>
       */
      public Builder setSticky(boolean value) {
        bitField0_ |= 0x00000004;
        sticky_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool sticky = 3;</code>
       */
      public Builder clearSticky() {
        bitField0_ = (bitField0_ & ~0x00000004);
        sticky_ = false;
        onChanged();
        return this;
      }

      private java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> entries_ =
        java.util.Collections.emptyList();
      private void ensureEntriesIsMutable() {
        if (!((bitField0_ & 0x00000008) != 0)) {
          entries_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto>(entries_);
          bitField0_ |= 0x00000008;
         }
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> entriesBuilder_;

      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> getEntriesList() {
        if (entriesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(entries_);
        } else {
          return entriesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public int getEntriesCount() {
        if (entriesBuilder_ == null) {
          return entries_.size();
        } else {
          return entriesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getEntries(int index) {
        if (entriesBuilder_ == null) {
          return entries_.get(index);
        } else {
          return entriesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public Builder setEntries(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto value) {
        if (entriesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntriesIsMutable();
          entries_.set(index, value);
          onChanged();
        } else {
          entriesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public Builder setEntries(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder builderForValue) {
        if (entriesBuilder_ == null) {
          ensureEntriesIsMutable();
          entries_.set(index, builderForValue.build());
          onChanged();
        } else {
          entriesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public Builder addEntries(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto value) {
        if (entriesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntriesIsMutable();
          entries_.add(value);
          onChanged();
        } else {
          entriesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public Builder addEntries(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto value) {
        if (entriesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntriesIsMutable();
          entries_.add(index, value);
          onChanged();
        } else {
          entriesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public Builder addEntries(
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder builderForValue) {
        if (entriesBuilder_ == null) {
          ensureEntriesIsMutable();
          entries_.add(builderForValue.build());
          onChanged();
        } else {
          entriesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public Builder addEntries(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder builderForValue) {
        if (entriesBuilder_ == null) {
          ensureEntriesIsMutable();
          entries_.add(index, builderForValue.build());
          onChanged();
        } else {
          entriesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public Builder addAllEntries(
          java.lang.Iterable<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> values) {
        if (entriesBuilder_ == null) {
          ensureEntriesIsMutable();
          org.apache.hadoop.thirdparty.protobuf.AbstractMessageLite.Builder.addAll(
              values, entries_);
          onChanged();
        } else {
          entriesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public Builder clearEntries() {
        if (entriesBuilder_ == null) {
          entries_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
          onChanged();
        } else {
          entriesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public Builder removeEntries(int index) {
        if (entriesBuilder_ == null) {
          ensureEntriesIsMutable();
          entries_.remove(index);
          onChanged();
        } else {
          entriesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder getEntriesBuilder(
          int index) {
        return getEntriesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder getEntriesOrBuilder(
          int index) {
        if (entriesBuilder_ == null) {
          return entries_.get(index);  } else {
          return entriesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
           getEntriesOrBuilderList() {
        if (entriesBuilder_ != null) {
          return entriesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(entries_);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder addEntriesBuilder() {
        return getEntriesFieldBuilder().addBuilder(
            org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder addEntriesBuilder(
          int index) {
        return getEntriesFieldBuilder().addBuilder(
            index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder> 
           getEntriesBuilderList() {
        return getEntriesFieldBuilder().getBuilderList();
      }
      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
          getEntriesFieldBuilder() {
        if (entriesBuilder_ == null) {
          entriesBuilder_ = new org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder>(
                  entries_,
                  ((bitField0_ & 0x00000008) != 0),
                  getParentForChildren(),
                  isClean());
          entries_ = null;
        }
        return entriesBuilder_;
      }

      private org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto permission_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProtoOrBuilder> permissionBuilder_;
      /**
       * <code>optional .hadoop.hdfs.FsPermissionProto permission = 5;</code>
       */
      public boolean hasPermission() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <code>optional .hadoop.hdfs.FsPermissionProto permission = 5;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto getPermission() {
        if (permissionBuilder_ == null) {
          return permission_ == null ? org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.getDefaultInstance() : permission_;
        } else {
          return permissionBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .hadoop.hdfs.FsPermissionProto permission = 5;</code>
       */
      public Builder setPermission(org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto value) {
        if (permissionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          permission_ = value;
          onChanged();
        } else {
          permissionBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.FsPermissionProto permission = 5;</code>
       */
      public Builder setPermission(
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.Builder builderForValue) {
        if (permissionBuilder_ == null) {
          permission_ = builderForValue.build();
          onChanged();
        } else {
          permissionBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.FsPermissionProto permission = 5;</code>
       */
      public Builder mergePermission(org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto value) {
        if (permissionBuilder_ == null) {
          if (((bitField0_ & 0x00000010) != 0) &&
              permission_ != null &&
              permission_ != org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.getDefaultInstance()) {
            permission_ =
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.newBuilder(permission_).mergeFrom(value).buildPartial();
          } else {
            permission_ = value;
          }
          onChanged();
        } else {
          permissionBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.FsPermissionProto permission = 5;</code>
       */
      public Builder clearPermission() {
        if (permissionBuilder_ == null) {
          permission_ = null;
          onChanged();
        } else {
          permissionBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.FsPermissionProto permission = 5;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.Builder getPermissionBuilder() {
        bitField0_ |= 0x00000010;
        onChanged();
        return getPermissionFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .hadoop.hdfs.FsPermissionProto permission = 5;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProtoOrBuilder getPermissionOrBuilder() {
        if (permissionBuilder_ != null) {
          return permissionBuilder_.getMessageOrBuilder();
        } else {
          return permission_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.getDefaultInstance() : permission_;
        }
      }
      /**
       * <code>optional .hadoop.hdfs.FsPermissionProto permission = 5;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProtoOrBuilder> 
          getPermissionFieldBuilder() {
        if (permissionBuilder_ == null) {
          permissionBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProtoOrBuilder>(
                  getPermission(),
                  getParentForChildren(),
                  isClean());
          permission_ = null;
        }
        return permissionBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.AclStatusProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.AclStatusProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<AclStatusProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<AclStatusProto>() {
      @java.lang.Override
      public AclStatusProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new AclStatusProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<AclStatusProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<AclStatusProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ModifyAclEntriesRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.ModifyAclEntriesRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required string src = 1;</code>
     */
    boolean hasSrc();
    /**
     * <code>required string src = 1;</code>
     */
    java.lang.String getSrc();
    /**
     * <code>required string src = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getSrcBytes();

    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> 
        getAclSpecList();
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getAclSpec(int index);
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    int getAclSpecCount();
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
        getAclSpecOrBuilderList();
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder getAclSpecOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code hadoop.hdfs.ModifyAclEntriesRequestProto}
   */
  public  static final class ModifyAclEntriesRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.ModifyAclEntriesRequestProto)
      ModifyAclEntriesRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ModifyAclEntriesRequestProto.newBuilder() to construct.
    private ModifyAclEntriesRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ModifyAclEntriesRequestProto() {
      src_ = "";
      aclSpec_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ModifyAclEntriesRequestProto(
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
              src_ = bs;
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                aclSpec_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto>();
                mutable_bitField0_ |= 0x00000002;
              }
              aclSpec_.add(
                  input.readMessage(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.PARSER, extensionRegistry));
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
          aclSpec_ = java.util.Collections.unmodifiableList(aclSpec_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_ModifyAclEntriesRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_ModifyAclEntriesRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto.Builder.class);
    }

    private int bitField0_;
    public static final int SRC_FIELD_NUMBER = 1;
    private volatile java.lang.Object src_;
    /**
     * <code>required string src = 1;</code>
     */
    public boolean hasSrc() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string src = 1;</code>
     */
    public java.lang.String getSrc() {
      java.lang.Object ref = src_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          src_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string src = 1;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getSrcBytes() {
      java.lang.Object ref = src_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        src_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int ACLSPEC_FIELD_NUMBER = 2;
    private java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> aclSpec_;
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> getAclSpecList() {
      return aclSpec_;
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
        getAclSpecOrBuilderList() {
      return aclSpec_;
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    public int getAclSpecCount() {
      return aclSpec_.size();
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getAclSpec(int index) {
      return aclSpec_.get(index);
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder getAclSpecOrBuilder(
        int index) {
      return aclSpec_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasSrc()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getAclSpecCount(); i++) {
        if (!getAclSpec(i).isInitialized()) {
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, src_);
      }
      for (int i = 0; i < aclSpec_.size(); i++) {
        output.writeMessage(2, aclSpec_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, src_);
      }
      for (int i = 0; i < aclSpec_.size(); i++) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(2, aclSpec_.get(i));
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto) obj;

      if (hasSrc() != other.hasSrc()) return false;
      if (hasSrc()) {
        if (!getSrc()
            .equals(other.getSrc())) return false;
      }
      if (!getAclSpecList()
          .equals(other.getAclSpecList())) return false;
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
      if (hasSrc()) {
        hash = (37 * hash) + SRC_FIELD_NUMBER;
        hash = (53 * hash) + getSrc().hashCode();
      }
      if (getAclSpecCount() > 0) {
        hash = (37 * hash) + ACLSPEC_FIELD_NUMBER;
        hash = (53 * hash) + getAclSpecList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.ModifyAclEntriesRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.ModifyAclEntriesRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_ModifyAclEntriesRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_ModifyAclEntriesRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto.newBuilder()
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
          getAclSpecFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        src_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (aclSpecBuilder_ == null) {
          aclSpec_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          aclSpecBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_ModifyAclEntriesRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.src_ = src_;
        if (aclSpecBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            aclSpec_ = java.util.Collections.unmodifiableList(aclSpec_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.aclSpec_ = aclSpec_;
        } else {
          result.aclSpec_ = aclSpecBuilder_.build();
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto.getDefaultInstance()) return this;
        if (other.hasSrc()) {
          bitField0_ |= 0x00000001;
          src_ = other.src_;
          onChanged();
        }
        if (aclSpecBuilder_ == null) {
          if (!other.aclSpec_.isEmpty()) {
            if (aclSpec_.isEmpty()) {
              aclSpec_ = other.aclSpec_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureAclSpecIsMutable();
              aclSpec_.addAll(other.aclSpec_);
            }
            onChanged();
          }
        } else {
          if (!other.aclSpec_.isEmpty()) {
            if (aclSpecBuilder_.isEmpty()) {
              aclSpecBuilder_.dispose();
              aclSpecBuilder_ = null;
              aclSpec_ = other.aclSpec_;
              bitField0_ = (bitField0_ & ~0x00000002);
              aclSpecBuilder_ = 
                org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getAclSpecFieldBuilder() : null;
            } else {
              aclSpecBuilder_.addAllMessages(other.aclSpec_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasSrc()) {
          return false;
        }
        for (int i = 0; i < getAclSpecCount(); i++) {
          if (!getAclSpec(i).isInitialized()) {
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
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object src_ = "";
      /**
       * <code>required string src = 1;</code>
       */
      public boolean hasSrc() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string src = 1;</code>
       */
      public java.lang.String getSrc() {
        java.lang.Object ref = src_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            src_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string src = 1;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getSrcBytes() {
        java.lang.Object ref = src_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          src_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder setSrc(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        src_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder clearSrc() {
        bitField0_ = (bitField0_ & ~0x00000001);
        src_ = getDefaultInstance().getSrc();
        onChanged();
        return this;
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder setSrcBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        src_ = value;
        onChanged();
        return this;
      }

      private java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> aclSpec_ =
        java.util.Collections.emptyList();
      private void ensureAclSpecIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          aclSpec_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto>(aclSpec_);
          bitField0_ |= 0x00000002;
         }
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> aclSpecBuilder_;

      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> getAclSpecList() {
        if (aclSpecBuilder_ == null) {
          return java.util.Collections.unmodifiableList(aclSpec_);
        } else {
          return aclSpecBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public int getAclSpecCount() {
        if (aclSpecBuilder_ == null) {
          return aclSpec_.size();
        } else {
          return aclSpecBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getAclSpec(int index) {
        if (aclSpecBuilder_ == null) {
          return aclSpec_.get(index);
        } else {
          return aclSpecBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder setAclSpec(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto value) {
        if (aclSpecBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAclSpecIsMutable();
          aclSpec_.set(index, value);
          onChanged();
        } else {
          aclSpecBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder setAclSpec(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder builderForValue) {
        if (aclSpecBuilder_ == null) {
          ensureAclSpecIsMutable();
          aclSpec_.set(index, builderForValue.build());
          onChanged();
        } else {
          aclSpecBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder addAclSpec(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto value) {
        if (aclSpecBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAclSpecIsMutable();
          aclSpec_.add(value);
          onChanged();
        } else {
          aclSpecBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder addAclSpec(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto value) {
        if (aclSpecBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAclSpecIsMutable();
          aclSpec_.add(index, value);
          onChanged();
        } else {
          aclSpecBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder addAclSpec(
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder builderForValue) {
        if (aclSpecBuilder_ == null) {
          ensureAclSpecIsMutable();
          aclSpec_.add(builderForValue.build());
          onChanged();
        } else {
          aclSpecBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder addAclSpec(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder builderForValue) {
        if (aclSpecBuilder_ == null) {
          ensureAclSpecIsMutable();
          aclSpec_.add(index, builderForValue.build());
          onChanged();
        } else {
          aclSpecBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder addAllAclSpec(
          java.lang.Iterable<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> values) {
        if (aclSpecBuilder_ == null) {
          ensureAclSpecIsMutable();
          org.apache.hadoop.thirdparty.protobuf.AbstractMessageLite.Builder.addAll(
              values, aclSpec_);
          onChanged();
        } else {
          aclSpecBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder clearAclSpec() {
        if (aclSpecBuilder_ == null) {
          aclSpec_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          aclSpecBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder removeAclSpec(int index) {
        if (aclSpecBuilder_ == null) {
          ensureAclSpecIsMutable();
          aclSpec_.remove(index);
          onChanged();
        } else {
          aclSpecBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder getAclSpecBuilder(
          int index) {
        return getAclSpecFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder getAclSpecOrBuilder(
          int index) {
        if (aclSpecBuilder_ == null) {
          return aclSpec_.get(index);  } else {
          return aclSpecBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
           getAclSpecOrBuilderList() {
        if (aclSpecBuilder_ != null) {
          return aclSpecBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(aclSpec_);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder addAclSpecBuilder() {
        return getAclSpecFieldBuilder().addBuilder(
            org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder addAclSpecBuilder(
          int index) {
        return getAclSpecFieldBuilder().addBuilder(
            index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder> 
           getAclSpecBuilderList() {
        return getAclSpecFieldBuilder().getBuilderList();
      }
      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
          getAclSpecFieldBuilder() {
        if (aclSpecBuilder_ == null) {
          aclSpecBuilder_ = new org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder>(
                  aclSpec_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          aclSpec_ = null;
        }
        return aclSpecBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.ModifyAclEntriesRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ModifyAclEntriesRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<ModifyAclEntriesRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<ModifyAclEntriesRequestProto>() {
      @java.lang.Override
      public ModifyAclEntriesRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new ModifyAclEntriesRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<ModifyAclEntriesRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<ModifyAclEntriesRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ModifyAclEntriesResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.ModifyAclEntriesResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.ModifyAclEntriesResponseProto}
   */
  public  static final class ModifyAclEntriesResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.ModifyAclEntriesResponseProto)
      ModifyAclEntriesResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ModifyAclEntriesResponseProto.newBuilder() to construct.
    private ModifyAclEntriesResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ModifyAclEntriesResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ModifyAclEntriesResponseProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_ModifyAclEntriesResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_ModifyAclEntriesResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto.Builder.class);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.ModifyAclEntriesResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.ModifyAclEntriesResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_ModifyAclEntriesResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_ModifyAclEntriesResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_ModifyAclEntriesResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto(this);
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto) e.getUnfinishedMessage();
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.ModifyAclEntriesResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ModifyAclEntriesResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<ModifyAclEntriesResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<ModifyAclEntriesResponseProto>() {
      @java.lang.Override
      public ModifyAclEntriesResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new ModifyAclEntriesResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<ModifyAclEntriesResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<ModifyAclEntriesResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RemoveAclRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.RemoveAclRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required string src = 1;</code>
     */
    boolean hasSrc();
    /**
     * <code>required string src = 1;</code>
     */
    java.lang.String getSrc();
    /**
     * <code>required string src = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getSrcBytes();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.RemoveAclRequestProto}
   */
  public  static final class RemoveAclRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.RemoveAclRequestProto)
      RemoveAclRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RemoveAclRequestProto.newBuilder() to construct.
    private RemoveAclRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RemoveAclRequestProto() {
      src_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RemoveAclRequestProto(
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
              src_ = bs;
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
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto.Builder.class);
    }

    private int bitField0_;
    public static final int SRC_FIELD_NUMBER = 1;
    private volatile java.lang.Object src_;
    /**
     * <code>required string src = 1;</code>
     */
    public boolean hasSrc() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string src = 1;</code>
     */
    public java.lang.String getSrc() {
      java.lang.Object ref = src_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          src_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string src = 1;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getSrcBytes() {
      java.lang.Object ref = src_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        src_ = b;
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

      if (!hasSrc()) {
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, src_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, src_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto) obj;

      if (hasSrc() != other.hasSrc()) return false;
      if (hasSrc()) {
        if (!getSrc()
            .equals(other.getSrc())) return false;
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
      if (hasSrc()) {
        hash = (37 * hash) + SRC_FIELD_NUMBER;
        hash = (53 * hash) + getSrc().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.RemoveAclRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.RemoveAclRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto.newBuilder()
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
        src_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.src_ = src_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto.getDefaultInstance()) return this;
        if (other.hasSrc()) {
          bitField0_ |= 0x00000001;
          src_ = other.src_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasSrc()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object src_ = "";
      /**
       * <code>required string src = 1;</code>
       */
      public boolean hasSrc() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string src = 1;</code>
       */
      public java.lang.String getSrc() {
        java.lang.Object ref = src_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            src_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string src = 1;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getSrcBytes() {
        java.lang.Object ref = src_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          src_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder setSrc(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        src_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder clearSrc() {
        bitField0_ = (bitField0_ & ~0x00000001);
        src_ = getDefaultInstance().getSrc();
        onChanged();
        return this;
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder setSrcBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        src_ = value;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.RemoveAclRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.RemoveAclRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<RemoveAclRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<RemoveAclRequestProto>() {
      @java.lang.Override
      public RemoveAclRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new RemoveAclRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<RemoveAclRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<RemoveAclRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RemoveAclResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.RemoveAclResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.RemoveAclResponseProto}
   */
  public  static final class RemoveAclResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.RemoveAclResponseProto)
      RemoveAclResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RemoveAclResponseProto.newBuilder() to construct.
    private RemoveAclResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RemoveAclResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RemoveAclResponseProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto.Builder.class);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.RemoveAclResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.RemoveAclResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto(this);
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto) e.getUnfinishedMessage();
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.RemoveAclResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.RemoveAclResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<RemoveAclResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<RemoveAclResponseProto>() {
      @java.lang.Override
      public RemoveAclResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new RemoveAclResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<RemoveAclResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<RemoveAclResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RemoveAclEntriesRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.RemoveAclEntriesRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required string src = 1;</code>
     */
    boolean hasSrc();
    /**
     * <code>required string src = 1;</code>
     */
    java.lang.String getSrc();
    /**
     * <code>required string src = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getSrcBytes();

    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> 
        getAclSpecList();
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getAclSpec(int index);
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    int getAclSpecCount();
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
        getAclSpecOrBuilderList();
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder getAclSpecOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code hadoop.hdfs.RemoveAclEntriesRequestProto}
   */
  public  static final class RemoveAclEntriesRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.RemoveAclEntriesRequestProto)
      RemoveAclEntriesRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RemoveAclEntriesRequestProto.newBuilder() to construct.
    private RemoveAclEntriesRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RemoveAclEntriesRequestProto() {
      src_ = "";
      aclSpec_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RemoveAclEntriesRequestProto(
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
              src_ = bs;
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                aclSpec_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto>();
                mutable_bitField0_ |= 0x00000002;
              }
              aclSpec_.add(
                  input.readMessage(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.PARSER, extensionRegistry));
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
          aclSpec_ = java.util.Collections.unmodifiableList(aclSpec_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclEntriesRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclEntriesRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto.Builder.class);
    }

    private int bitField0_;
    public static final int SRC_FIELD_NUMBER = 1;
    private volatile java.lang.Object src_;
    /**
     * <code>required string src = 1;</code>
     */
    public boolean hasSrc() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string src = 1;</code>
     */
    public java.lang.String getSrc() {
      java.lang.Object ref = src_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          src_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string src = 1;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getSrcBytes() {
      java.lang.Object ref = src_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        src_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int ACLSPEC_FIELD_NUMBER = 2;
    private java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> aclSpec_;
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> getAclSpecList() {
      return aclSpec_;
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
        getAclSpecOrBuilderList() {
      return aclSpec_;
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    public int getAclSpecCount() {
      return aclSpec_.size();
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getAclSpec(int index) {
      return aclSpec_.get(index);
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder getAclSpecOrBuilder(
        int index) {
      return aclSpec_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasSrc()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getAclSpecCount(); i++) {
        if (!getAclSpec(i).isInitialized()) {
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, src_);
      }
      for (int i = 0; i < aclSpec_.size(); i++) {
        output.writeMessage(2, aclSpec_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, src_);
      }
      for (int i = 0; i < aclSpec_.size(); i++) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(2, aclSpec_.get(i));
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto) obj;

      if (hasSrc() != other.hasSrc()) return false;
      if (hasSrc()) {
        if (!getSrc()
            .equals(other.getSrc())) return false;
      }
      if (!getAclSpecList()
          .equals(other.getAclSpecList())) return false;
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
      if (hasSrc()) {
        hash = (37 * hash) + SRC_FIELD_NUMBER;
        hash = (53 * hash) + getSrc().hashCode();
      }
      if (getAclSpecCount() > 0) {
        hash = (37 * hash) + ACLSPEC_FIELD_NUMBER;
        hash = (53 * hash) + getAclSpecList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.RemoveAclEntriesRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.RemoveAclEntriesRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclEntriesRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclEntriesRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto.newBuilder()
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
          getAclSpecFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        src_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (aclSpecBuilder_ == null) {
          aclSpec_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          aclSpecBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclEntriesRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.src_ = src_;
        if (aclSpecBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            aclSpec_ = java.util.Collections.unmodifiableList(aclSpec_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.aclSpec_ = aclSpec_;
        } else {
          result.aclSpec_ = aclSpecBuilder_.build();
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto.getDefaultInstance()) return this;
        if (other.hasSrc()) {
          bitField0_ |= 0x00000001;
          src_ = other.src_;
          onChanged();
        }
        if (aclSpecBuilder_ == null) {
          if (!other.aclSpec_.isEmpty()) {
            if (aclSpec_.isEmpty()) {
              aclSpec_ = other.aclSpec_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureAclSpecIsMutable();
              aclSpec_.addAll(other.aclSpec_);
            }
            onChanged();
          }
        } else {
          if (!other.aclSpec_.isEmpty()) {
            if (aclSpecBuilder_.isEmpty()) {
              aclSpecBuilder_.dispose();
              aclSpecBuilder_ = null;
              aclSpec_ = other.aclSpec_;
              bitField0_ = (bitField0_ & ~0x00000002);
              aclSpecBuilder_ = 
                org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getAclSpecFieldBuilder() : null;
            } else {
              aclSpecBuilder_.addAllMessages(other.aclSpec_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasSrc()) {
          return false;
        }
        for (int i = 0; i < getAclSpecCount(); i++) {
          if (!getAclSpec(i).isInitialized()) {
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
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object src_ = "";
      /**
       * <code>required string src = 1;</code>
       */
      public boolean hasSrc() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string src = 1;</code>
       */
      public java.lang.String getSrc() {
        java.lang.Object ref = src_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            src_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string src = 1;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getSrcBytes() {
        java.lang.Object ref = src_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          src_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder setSrc(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        src_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder clearSrc() {
        bitField0_ = (bitField0_ & ~0x00000001);
        src_ = getDefaultInstance().getSrc();
        onChanged();
        return this;
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder setSrcBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        src_ = value;
        onChanged();
        return this;
      }

      private java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> aclSpec_ =
        java.util.Collections.emptyList();
      private void ensureAclSpecIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          aclSpec_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto>(aclSpec_);
          bitField0_ |= 0x00000002;
         }
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> aclSpecBuilder_;

      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> getAclSpecList() {
        if (aclSpecBuilder_ == null) {
          return java.util.Collections.unmodifiableList(aclSpec_);
        } else {
          return aclSpecBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public int getAclSpecCount() {
        if (aclSpecBuilder_ == null) {
          return aclSpec_.size();
        } else {
          return aclSpecBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getAclSpec(int index) {
        if (aclSpecBuilder_ == null) {
          return aclSpec_.get(index);
        } else {
          return aclSpecBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder setAclSpec(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto value) {
        if (aclSpecBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAclSpecIsMutable();
          aclSpec_.set(index, value);
          onChanged();
        } else {
          aclSpecBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder setAclSpec(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder builderForValue) {
        if (aclSpecBuilder_ == null) {
          ensureAclSpecIsMutable();
          aclSpec_.set(index, builderForValue.build());
          onChanged();
        } else {
          aclSpecBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder addAclSpec(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto value) {
        if (aclSpecBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAclSpecIsMutable();
          aclSpec_.add(value);
          onChanged();
        } else {
          aclSpecBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder addAclSpec(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto value) {
        if (aclSpecBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAclSpecIsMutable();
          aclSpec_.add(index, value);
          onChanged();
        } else {
          aclSpecBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder addAclSpec(
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder builderForValue) {
        if (aclSpecBuilder_ == null) {
          ensureAclSpecIsMutable();
          aclSpec_.add(builderForValue.build());
          onChanged();
        } else {
          aclSpecBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder addAclSpec(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder builderForValue) {
        if (aclSpecBuilder_ == null) {
          ensureAclSpecIsMutable();
          aclSpec_.add(index, builderForValue.build());
          onChanged();
        } else {
          aclSpecBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder addAllAclSpec(
          java.lang.Iterable<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> values) {
        if (aclSpecBuilder_ == null) {
          ensureAclSpecIsMutable();
          org.apache.hadoop.thirdparty.protobuf.AbstractMessageLite.Builder.addAll(
              values, aclSpec_);
          onChanged();
        } else {
          aclSpecBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder clearAclSpec() {
        if (aclSpecBuilder_ == null) {
          aclSpec_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          aclSpecBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder removeAclSpec(int index) {
        if (aclSpecBuilder_ == null) {
          ensureAclSpecIsMutable();
          aclSpec_.remove(index);
          onChanged();
        } else {
          aclSpecBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder getAclSpecBuilder(
          int index) {
        return getAclSpecFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder getAclSpecOrBuilder(
          int index) {
        if (aclSpecBuilder_ == null) {
          return aclSpec_.get(index);  } else {
          return aclSpecBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
           getAclSpecOrBuilderList() {
        if (aclSpecBuilder_ != null) {
          return aclSpecBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(aclSpec_);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder addAclSpecBuilder() {
        return getAclSpecFieldBuilder().addBuilder(
            org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder addAclSpecBuilder(
          int index) {
        return getAclSpecFieldBuilder().addBuilder(
            index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder> 
           getAclSpecBuilderList() {
        return getAclSpecFieldBuilder().getBuilderList();
      }
      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
          getAclSpecFieldBuilder() {
        if (aclSpecBuilder_ == null) {
          aclSpecBuilder_ = new org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder>(
                  aclSpec_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          aclSpec_ = null;
        }
        return aclSpecBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.RemoveAclEntriesRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.RemoveAclEntriesRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<RemoveAclEntriesRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<RemoveAclEntriesRequestProto>() {
      @java.lang.Override
      public RemoveAclEntriesRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new RemoveAclEntriesRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<RemoveAclEntriesRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<RemoveAclEntriesRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RemoveAclEntriesResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.RemoveAclEntriesResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.RemoveAclEntriesResponseProto}
   */
  public  static final class RemoveAclEntriesResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.RemoveAclEntriesResponseProto)
      RemoveAclEntriesResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RemoveAclEntriesResponseProto.newBuilder() to construct.
    private RemoveAclEntriesResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RemoveAclEntriesResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RemoveAclEntriesResponseProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclEntriesResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclEntriesResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto.Builder.class);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.RemoveAclEntriesResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.RemoveAclEntriesResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclEntriesResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclEntriesResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclEntriesResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto(this);
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto) e.getUnfinishedMessage();
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.RemoveAclEntriesResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.RemoveAclEntriesResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<RemoveAclEntriesResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<RemoveAclEntriesResponseProto>() {
      @java.lang.Override
      public RemoveAclEntriesResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new RemoveAclEntriesResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<RemoveAclEntriesResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<RemoveAclEntriesResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RemoveDefaultAclRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.RemoveDefaultAclRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required string src = 1;</code>
     */
    boolean hasSrc();
    /**
     * <code>required string src = 1;</code>
     */
    java.lang.String getSrc();
    /**
     * <code>required string src = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getSrcBytes();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.RemoveDefaultAclRequestProto}
   */
  public  static final class RemoveDefaultAclRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.RemoveDefaultAclRequestProto)
      RemoveDefaultAclRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RemoveDefaultAclRequestProto.newBuilder() to construct.
    private RemoveDefaultAclRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RemoveDefaultAclRequestProto() {
      src_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RemoveDefaultAclRequestProto(
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
              src_ = bs;
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
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveDefaultAclRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveDefaultAclRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto.Builder.class);
    }

    private int bitField0_;
    public static final int SRC_FIELD_NUMBER = 1;
    private volatile java.lang.Object src_;
    /**
     * <code>required string src = 1;</code>
     */
    public boolean hasSrc() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string src = 1;</code>
     */
    public java.lang.String getSrc() {
      java.lang.Object ref = src_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          src_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string src = 1;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getSrcBytes() {
      java.lang.Object ref = src_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        src_ = b;
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

      if (!hasSrc()) {
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, src_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, src_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto) obj;

      if (hasSrc() != other.hasSrc()) return false;
      if (hasSrc()) {
        if (!getSrc()
            .equals(other.getSrc())) return false;
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
      if (hasSrc()) {
        hash = (37 * hash) + SRC_FIELD_NUMBER;
        hash = (53 * hash) + getSrc().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.RemoveDefaultAclRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.RemoveDefaultAclRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveDefaultAclRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveDefaultAclRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto.newBuilder()
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
        src_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveDefaultAclRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.src_ = src_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto.getDefaultInstance()) return this;
        if (other.hasSrc()) {
          bitField0_ |= 0x00000001;
          src_ = other.src_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasSrc()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object src_ = "";
      /**
       * <code>required string src = 1;</code>
       */
      public boolean hasSrc() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string src = 1;</code>
       */
      public java.lang.String getSrc() {
        java.lang.Object ref = src_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            src_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string src = 1;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getSrcBytes() {
        java.lang.Object ref = src_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          src_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder setSrc(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        src_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder clearSrc() {
        bitField0_ = (bitField0_ & ~0x00000001);
        src_ = getDefaultInstance().getSrc();
        onChanged();
        return this;
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder setSrcBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        src_ = value;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.RemoveDefaultAclRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.RemoveDefaultAclRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<RemoveDefaultAclRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<RemoveDefaultAclRequestProto>() {
      @java.lang.Override
      public RemoveDefaultAclRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new RemoveDefaultAclRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<RemoveDefaultAclRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<RemoveDefaultAclRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RemoveDefaultAclResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.RemoveDefaultAclResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.RemoveDefaultAclResponseProto}
   */
  public  static final class RemoveDefaultAclResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.RemoveDefaultAclResponseProto)
      RemoveDefaultAclResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RemoveDefaultAclResponseProto.newBuilder() to construct.
    private RemoveDefaultAclResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RemoveDefaultAclResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RemoveDefaultAclResponseProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveDefaultAclResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveDefaultAclResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto.Builder.class);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.RemoveDefaultAclResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.RemoveDefaultAclResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveDefaultAclResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveDefaultAclResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveDefaultAclResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto(this);
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto) e.getUnfinishedMessage();
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.RemoveDefaultAclResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.RemoveDefaultAclResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<RemoveDefaultAclResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<RemoveDefaultAclResponseProto>() {
      @java.lang.Override
      public RemoveDefaultAclResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new RemoveDefaultAclResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<RemoveDefaultAclResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<RemoveDefaultAclResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface SetAclRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.SetAclRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required string src = 1;</code>
     */
    boolean hasSrc();
    /**
     * <code>required string src = 1;</code>
     */
    java.lang.String getSrc();
    /**
     * <code>required string src = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getSrcBytes();

    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> 
        getAclSpecList();
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getAclSpec(int index);
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    int getAclSpecCount();
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
        getAclSpecOrBuilderList();
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder getAclSpecOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code hadoop.hdfs.SetAclRequestProto}
   */
  public  static final class SetAclRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.SetAclRequestProto)
      SetAclRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetAclRequestProto.newBuilder() to construct.
    private SetAclRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetAclRequestProto() {
      src_ = "";
      aclSpec_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SetAclRequestProto(
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
              src_ = bs;
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                aclSpec_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto>();
                mutable_bitField0_ |= 0x00000002;
              }
              aclSpec_.add(
                  input.readMessage(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.PARSER, extensionRegistry));
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
          aclSpec_ = java.util.Collections.unmodifiableList(aclSpec_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_SetAclRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_SetAclRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto.Builder.class);
    }

    private int bitField0_;
    public static final int SRC_FIELD_NUMBER = 1;
    private volatile java.lang.Object src_;
    /**
     * <code>required string src = 1;</code>
     */
    public boolean hasSrc() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string src = 1;</code>
     */
    public java.lang.String getSrc() {
      java.lang.Object ref = src_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          src_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string src = 1;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getSrcBytes() {
      java.lang.Object ref = src_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        src_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int ACLSPEC_FIELD_NUMBER = 2;
    private java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> aclSpec_;
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> getAclSpecList() {
      return aclSpec_;
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
        getAclSpecOrBuilderList() {
      return aclSpec_;
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    public int getAclSpecCount() {
      return aclSpec_.size();
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getAclSpec(int index) {
      return aclSpec_.get(index);
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder getAclSpecOrBuilder(
        int index) {
      return aclSpec_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasSrc()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getAclSpecCount(); i++) {
        if (!getAclSpec(i).isInitialized()) {
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, src_);
      }
      for (int i = 0; i < aclSpec_.size(); i++) {
        output.writeMessage(2, aclSpec_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, src_);
      }
      for (int i = 0; i < aclSpec_.size(); i++) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(2, aclSpec_.get(i));
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto) obj;

      if (hasSrc() != other.hasSrc()) return false;
      if (hasSrc()) {
        if (!getSrc()
            .equals(other.getSrc())) return false;
      }
      if (!getAclSpecList()
          .equals(other.getAclSpecList())) return false;
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
      if (hasSrc()) {
        hash = (37 * hash) + SRC_FIELD_NUMBER;
        hash = (53 * hash) + getSrc().hashCode();
      }
      if (getAclSpecCount() > 0) {
        hash = (37 * hash) + ACLSPEC_FIELD_NUMBER;
        hash = (53 * hash) + getAclSpecList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.SetAclRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.SetAclRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_SetAclRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_SetAclRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto.newBuilder()
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
          getAclSpecFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        src_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (aclSpecBuilder_ == null) {
          aclSpec_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          aclSpecBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_SetAclRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.src_ = src_;
        if (aclSpecBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            aclSpec_ = java.util.Collections.unmodifiableList(aclSpec_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.aclSpec_ = aclSpec_;
        } else {
          result.aclSpec_ = aclSpecBuilder_.build();
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto.getDefaultInstance()) return this;
        if (other.hasSrc()) {
          bitField0_ |= 0x00000001;
          src_ = other.src_;
          onChanged();
        }
        if (aclSpecBuilder_ == null) {
          if (!other.aclSpec_.isEmpty()) {
            if (aclSpec_.isEmpty()) {
              aclSpec_ = other.aclSpec_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureAclSpecIsMutable();
              aclSpec_.addAll(other.aclSpec_);
            }
            onChanged();
          }
        } else {
          if (!other.aclSpec_.isEmpty()) {
            if (aclSpecBuilder_.isEmpty()) {
              aclSpecBuilder_.dispose();
              aclSpecBuilder_ = null;
              aclSpec_ = other.aclSpec_;
              bitField0_ = (bitField0_ & ~0x00000002);
              aclSpecBuilder_ = 
                org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getAclSpecFieldBuilder() : null;
            } else {
              aclSpecBuilder_.addAllMessages(other.aclSpec_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasSrc()) {
          return false;
        }
        for (int i = 0; i < getAclSpecCount(); i++) {
          if (!getAclSpec(i).isInitialized()) {
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
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object src_ = "";
      /**
       * <code>required string src = 1;</code>
       */
      public boolean hasSrc() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string src = 1;</code>
       */
      public java.lang.String getSrc() {
        java.lang.Object ref = src_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            src_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string src = 1;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getSrcBytes() {
        java.lang.Object ref = src_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          src_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder setSrc(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        src_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder clearSrc() {
        bitField0_ = (bitField0_ & ~0x00000001);
        src_ = getDefaultInstance().getSrc();
        onChanged();
        return this;
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder setSrcBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        src_ = value;
        onChanged();
        return this;
      }

      private java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> aclSpec_ =
        java.util.Collections.emptyList();
      private void ensureAclSpecIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          aclSpec_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto>(aclSpec_);
          bitField0_ |= 0x00000002;
         }
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> aclSpecBuilder_;

      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> getAclSpecList() {
        if (aclSpecBuilder_ == null) {
          return java.util.Collections.unmodifiableList(aclSpec_);
        } else {
          return aclSpecBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public int getAclSpecCount() {
        if (aclSpecBuilder_ == null) {
          return aclSpec_.size();
        } else {
          return aclSpecBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getAclSpec(int index) {
        if (aclSpecBuilder_ == null) {
          return aclSpec_.get(index);
        } else {
          return aclSpecBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder setAclSpec(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto value) {
        if (aclSpecBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAclSpecIsMutable();
          aclSpec_.set(index, value);
          onChanged();
        } else {
          aclSpecBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder setAclSpec(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder builderForValue) {
        if (aclSpecBuilder_ == null) {
          ensureAclSpecIsMutable();
          aclSpec_.set(index, builderForValue.build());
          onChanged();
        } else {
          aclSpecBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder addAclSpec(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto value) {
        if (aclSpecBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAclSpecIsMutable();
          aclSpec_.add(value);
          onChanged();
        } else {
          aclSpecBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder addAclSpec(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto value) {
        if (aclSpecBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAclSpecIsMutable();
          aclSpec_.add(index, value);
          onChanged();
        } else {
          aclSpecBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder addAclSpec(
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder builderForValue) {
        if (aclSpecBuilder_ == null) {
          ensureAclSpecIsMutable();
          aclSpec_.add(builderForValue.build());
          onChanged();
        } else {
          aclSpecBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder addAclSpec(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder builderForValue) {
        if (aclSpecBuilder_ == null) {
          ensureAclSpecIsMutable();
          aclSpec_.add(index, builderForValue.build());
          onChanged();
        } else {
          aclSpecBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder addAllAclSpec(
          java.lang.Iterable<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> values) {
        if (aclSpecBuilder_ == null) {
          ensureAclSpecIsMutable();
          org.apache.hadoop.thirdparty.protobuf.AbstractMessageLite.Builder.addAll(
              values, aclSpec_);
          onChanged();
        } else {
          aclSpecBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder clearAclSpec() {
        if (aclSpecBuilder_ == null) {
          aclSpec_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          aclSpecBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder removeAclSpec(int index) {
        if (aclSpecBuilder_ == null) {
          ensureAclSpecIsMutable();
          aclSpec_.remove(index);
          onChanged();
        } else {
          aclSpecBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder getAclSpecBuilder(
          int index) {
        return getAclSpecFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder getAclSpecOrBuilder(
          int index) {
        if (aclSpecBuilder_ == null) {
          return aclSpec_.get(index);  } else {
          return aclSpecBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
           getAclSpecOrBuilderList() {
        if (aclSpecBuilder_ != null) {
          return aclSpecBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(aclSpec_);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder addAclSpecBuilder() {
        return getAclSpecFieldBuilder().addBuilder(
            org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder addAclSpecBuilder(
          int index) {
        return getAclSpecFieldBuilder().addBuilder(
            index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder> 
           getAclSpecBuilderList() {
        return getAclSpecFieldBuilder().getBuilderList();
      }
      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
          getAclSpecFieldBuilder() {
        if (aclSpecBuilder_ == null) {
          aclSpecBuilder_ = new org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder>(
                  aclSpec_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          aclSpec_ = null;
        }
        return aclSpecBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.SetAclRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.SetAclRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<SetAclRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<SetAclRequestProto>() {
      @java.lang.Override
      public SetAclRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new SetAclRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<SetAclRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<SetAclRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface SetAclResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.SetAclResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.SetAclResponseProto}
   */
  public  static final class SetAclResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.SetAclResponseProto)
      SetAclResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetAclResponseProto.newBuilder() to construct.
    private SetAclResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetAclResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SetAclResponseProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_SetAclResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_SetAclResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto.Builder.class);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.SetAclResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.SetAclResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_SetAclResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_SetAclResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_SetAclResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto(this);
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto) e.getUnfinishedMessage();
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.SetAclResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.SetAclResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<SetAclResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<SetAclResponseProto>() {
      @java.lang.Override
      public SetAclResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new SetAclResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<SetAclResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<SetAclResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GetAclStatusRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.GetAclStatusRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required string src = 1;</code>
     */
    boolean hasSrc();
    /**
     * <code>required string src = 1;</code>
     */
    java.lang.String getSrc();
    /**
     * <code>required string src = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getSrcBytes();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.GetAclStatusRequestProto}
   */
  public  static final class GetAclStatusRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.GetAclStatusRequestProto)
      GetAclStatusRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetAclStatusRequestProto.newBuilder() to construct.
    private GetAclStatusRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetAclStatusRequestProto() {
      src_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetAclStatusRequestProto(
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
              src_ = bs;
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
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_GetAclStatusRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_GetAclStatusRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto.Builder.class);
    }

    private int bitField0_;
    public static final int SRC_FIELD_NUMBER = 1;
    private volatile java.lang.Object src_;
    /**
     * <code>required string src = 1;</code>
     */
    public boolean hasSrc() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string src = 1;</code>
     */
    public java.lang.String getSrc() {
      java.lang.Object ref = src_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          src_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string src = 1;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getSrcBytes() {
      java.lang.Object ref = src_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        src_ = b;
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

      if (!hasSrc()) {
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, src_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, src_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto) obj;

      if (hasSrc() != other.hasSrc()) return false;
      if (hasSrc()) {
        if (!getSrc()
            .equals(other.getSrc())) return false;
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
      if (hasSrc()) {
        hash = (37 * hash) + SRC_FIELD_NUMBER;
        hash = (53 * hash) + getSrc().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.GetAclStatusRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.GetAclStatusRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_GetAclStatusRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_GetAclStatusRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto.newBuilder()
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
        src_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_GetAclStatusRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.src_ = src_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto.getDefaultInstance()) return this;
        if (other.hasSrc()) {
          bitField0_ |= 0x00000001;
          src_ = other.src_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasSrc()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object src_ = "";
      /**
       * <code>required string src = 1;</code>
       */
      public boolean hasSrc() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string src = 1;</code>
       */
      public java.lang.String getSrc() {
        java.lang.Object ref = src_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            src_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string src = 1;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getSrcBytes() {
        java.lang.Object ref = src_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          src_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder setSrc(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        src_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder clearSrc() {
        bitField0_ = (bitField0_ & ~0x00000001);
        src_ = getDefaultInstance().getSrc();
        onChanged();
        return this;
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder setSrcBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        src_ = value;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetAclStatusRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetAclStatusRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<GetAclStatusRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<GetAclStatusRequestProto>() {
      @java.lang.Override
      public GetAclStatusRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new GetAclStatusRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<GetAclStatusRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<GetAclStatusRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GetAclStatusResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.GetAclStatusResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required .hadoop.hdfs.AclStatusProto result = 1;</code>
     */
    boolean hasResult();
    /**
     * <code>required .hadoop.hdfs.AclStatusProto result = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto getResult();
    /**
     * <code>required .hadoop.hdfs.AclStatusProto result = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProtoOrBuilder getResultOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.GetAclStatusResponseProto}
   */
  public  static final class GetAclStatusResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.GetAclStatusResponseProto)
      GetAclStatusResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetAclStatusResponseProto.newBuilder() to construct.
    private GetAclStatusResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetAclStatusResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetAclStatusResponseProto(
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
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = result_.toBuilder();
              }
              result_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(result_);
                result_ = subBuilder.buildPartial();
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
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_GetAclStatusResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_GetAclStatusResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto.Builder.class);
    }

    private int bitField0_;
    public static final int RESULT_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto result_;
    /**
     * <code>required .hadoop.hdfs.AclStatusProto result = 1;</code>
     */
    public boolean hasResult() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required .hadoop.hdfs.AclStatusProto result = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto getResult() {
      return result_ == null ? org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.getDefaultInstance() : result_;
    }
    /**
     * <code>required .hadoop.hdfs.AclStatusProto result = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProtoOrBuilder getResultOrBuilder() {
      return result_ == null ? org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.getDefaultInstance() : result_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasResult()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getResult().isInitialized()) {
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
        output.writeMessage(1, getResult());
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
          .computeMessageSize(1, getResult());
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto) obj;

      if (hasResult() != other.hasResult()) return false;
      if (hasResult()) {
        if (!getResult()
            .equals(other.getResult())) return false;
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
      if (hasResult()) {
        hash = (37 * hash) + RESULT_FIELD_NUMBER;
        hash = (53 * hash) + getResult().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.GetAclStatusResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.GetAclStatusResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_GetAclStatusResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_GetAclStatusResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto.newBuilder()
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
          getResultFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (resultBuilder_ == null) {
          result_ = null;
        } else {
          resultBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_GetAclStatusResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (resultBuilder_ == null) {
            result.result_ = result_;
          } else {
            result.result_ = resultBuilder_.build();
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto.getDefaultInstance()) return this;
        if (other.hasResult()) {
          mergeResult(other.getResult());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasResult()) {
          return false;
        }
        if (!getResult().isInitialized()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto result_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProtoOrBuilder> resultBuilder_;
      /**
       * <code>required .hadoop.hdfs.AclStatusProto result = 1;</code>
       */
      public boolean hasResult() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required .hadoop.hdfs.AclStatusProto result = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto getResult() {
        if (resultBuilder_ == null) {
          return result_ == null ? org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.getDefaultInstance() : result_;
        } else {
          return resultBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.AclStatusProto result = 1;</code>
       */
      public Builder setResult(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto value) {
        if (resultBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          result_ = value;
          onChanged();
        } else {
          resultBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.AclStatusProto result = 1;</code>
       */
      public Builder setResult(
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.Builder builderForValue) {
        if (resultBuilder_ == null) {
          result_ = builderForValue.build();
          onChanged();
        } else {
          resultBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.AclStatusProto result = 1;</code>
       */
      public Builder mergeResult(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto value) {
        if (resultBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              result_ != null &&
              result_ != org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.getDefaultInstance()) {
            result_ =
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.newBuilder(result_).mergeFrom(value).buildPartial();
          } else {
            result_ = value;
          }
          onChanged();
        } else {
          resultBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.AclStatusProto result = 1;</code>
       */
      public Builder clearResult() {
        if (resultBuilder_ == null) {
          result_ = null;
          onChanged();
        } else {
          resultBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.AclStatusProto result = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.Builder getResultBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getResultFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.AclStatusProto result = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProtoOrBuilder getResultOrBuilder() {
        if (resultBuilder_ != null) {
          return resultBuilder_.getMessageOrBuilder();
        } else {
          return result_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.getDefaultInstance() : result_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.AclStatusProto result = 1;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProtoOrBuilder> 
          getResultFieldBuilder() {
        if (resultBuilder_ == null) {
          resultBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProtoOrBuilder>(
                  getResult(),
                  getParentForChildren(),
                  isClean());
          result_ = null;
        }
        return resultBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetAclStatusResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetAclStatusResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<GetAclStatusResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<GetAclStatusResponseProto>() {
      @java.lang.Override
      public GetAclStatusResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new GetAclStatusResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<GetAclStatusResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<GetAclStatusResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_FsPermissionProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_FsPermissionProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_AclEntryProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_AclEntryProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_AclStatusProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_AclStatusProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_ModifyAclEntriesRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_ModifyAclEntriesRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_ModifyAclEntriesResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_ModifyAclEntriesResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_RemoveAclRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_RemoveAclRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_RemoveAclResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_RemoveAclResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_RemoveAclEntriesRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_RemoveAclEntriesRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_RemoveAclEntriesResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_RemoveAclEntriesResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_RemoveDefaultAclRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_RemoveDefaultAclRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_RemoveDefaultAclResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_RemoveDefaultAclResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_SetAclRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_SetAclRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_SetAclResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_SetAclResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetAclStatusRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_GetAclStatusRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetAclStatusResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_GetAclStatusResponseProto_fieldAccessorTable;

  public static org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tacl.proto\022\013hadoop.hdfs\"!\n\021FsPermission" +
      "Proto\022\014\n\004perm\030\001 \002(\r\"\304\003\n\rAclEntryProto\022:\n" +
      "\004type\030\001 \002(\0162,.hadoop.hdfs.AclEntryProto." +
      "AclEntryTypeProto\022<\n\005scope\030\002 \002(\0162-.hadoo" +
      "p.hdfs.AclEntryProto.AclEntryScopeProto\022" +
      "=\n\013permissions\030\003 \002(\0162(.hadoop.hdfs.AclEn" +
      "tryProto.FsActionProto\022\014\n\004name\030\004 \001(\t\"-\n\022" +
      "AclEntryScopeProto\022\n\n\006ACCESS\020\000\022\013\n\007DEFAUL" +
      "T\020\001\"=\n\021AclEntryTypeProto\022\010\n\004USER\020\000\022\t\n\005GR" +
      "OUP\020\001\022\010\n\004MASK\020\002\022\t\n\005OTHER\020\003\"~\n\rFsActionPr" +
      "oto\022\010\n\004NONE\020\000\022\013\n\007EXECUTE\020\001\022\t\n\005WRITE\020\002\022\021\n" +
      "\rWRITE_EXECUTE\020\003\022\010\n\004READ\020\004\022\020\n\014READ_EXECU" +
      "TE\020\005\022\016\n\nREAD_WRITE\020\006\022\014\n\010PERM_ALL\020\007\"\237\001\n\016A" +
      "clStatusProto\022\r\n\005owner\030\001 \002(\t\022\r\n\005group\030\002 " +
      "\002(\t\022\016\n\006sticky\030\003 \002(\010\022+\n\007entries\030\004 \003(\0132\032.h" +
      "adoop.hdfs.AclEntryProto\0222\n\npermission\030\005" +
      " \001(\0132\036.hadoop.hdfs.FsPermissionProto\"X\n\034" +
      "ModifyAclEntriesRequestProto\022\013\n\003src\030\001 \002(" +
      "\t\022+\n\007aclSpec\030\002 \003(\0132\032.hadoop.hdfs.AclEntr" +
      "yProto\"\037\n\035ModifyAclEntriesResponseProto\"" +
      "$\n\025RemoveAclRequestProto\022\013\n\003src\030\001 \002(\t\"\030\n" +
      "\026RemoveAclResponseProto\"X\n\034RemoveAclEntr" +
      "iesRequestProto\022\013\n\003src\030\001 \002(\t\022+\n\007aclSpec\030" +
      "\002 \003(\0132\032.hadoop.hdfs.AclEntryProto\"\037\n\035Rem" +
      "oveAclEntriesResponseProto\"+\n\034RemoveDefa" +
      "ultAclRequestProto\022\013\n\003src\030\001 \002(\t\"\037\n\035Remov" +
      "eDefaultAclResponseProto\"N\n\022SetAclReques" +
      "tProto\022\013\n\003src\030\001 \002(\t\022+\n\007aclSpec\030\002 \003(\0132\032.h" +
      "adoop.hdfs.AclEntryProto\"\025\n\023SetAclRespon" +
      "seProto\"\'\n\030GetAclStatusRequestProto\022\013\n\003s" +
      "rc\030\001 \002(\t\"H\n\031GetAclStatusResponseProto\022+\n" +
      "\006result\030\001 \002(\0132\033.hadoop.hdfs.AclStatusPro" +
      "toB5\n%org.apache.hadoop.hdfs.protocol.pr" +
      "otoB\tAclProtos\240\001\001"
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
    internal_static_hadoop_hdfs_FsPermissionProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hadoop_hdfs_FsPermissionProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_FsPermissionProto_descriptor,
        new java.lang.String[] { "Perm", });
    internal_static_hadoop_hdfs_AclEntryProto_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hadoop_hdfs_AclEntryProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_AclEntryProto_descriptor,
        new java.lang.String[] { "Type", "Scope", "Permissions", "Name", });
    internal_static_hadoop_hdfs_AclStatusProto_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_hadoop_hdfs_AclStatusProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_AclStatusProto_descriptor,
        new java.lang.String[] { "Owner", "Group", "Sticky", "Entries", "Permission", });
    internal_static_hadoop_hdfs_ModifyAclEntriesRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_hadoop_hdfs_ModifyAclEntriesRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_ModifyAclEntriesRequestProto_descriptor,
        new java.lang.String[] { "Src", "AclSpec", });
    internal_static_hadoop_hdfs_ModifyAclEntriesResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_hadoop_hdfs_ModifyAclEntriesResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_ModifyAclEntriesResponseProto_descriptor,
        new java.lang.String[] { });
    internal_static_hadoop_hdfs_RemoveAclRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_hadoop_hdfs_RemoveAclRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_RemoveAclRequestProto_descriptor,
        new java.lang.String[] { "Src", });
    internal_static_hadoop_hdfs_RemoveAclResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_hadoop_hdfs_RemoveAclResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_RemoveAclResponseProto_descriptor,
        new java.lang.String[] { });
    internal_static_hadoop_hdfs_RemoveAclEntriesRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_hadoop_hdfs_RemoveAclEntriesRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_RemoveAclEntriesRequestProto_descriptor,
        new java.lang.String[] { "Src", "AclSpec", });
    internal_static_hadoop_hdfs_RemoveAclEntriesResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_hadoop_hdfs_RemoveAclEntriesResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_RemoveAclEntriesResponseProto_descriptor,
        new java.lang.String[] { });
    internal_static_hadoop_hdfs_RemoveDefaultAclRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_hadoop_hdfs_RemoveDefaultAclRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_RemoveDefaultAclRequestProto_descriptor,
        new java.lang.String[] { "Src", });
    internal_static_hadoop_hdfs_RemoveDefaultAclResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_hadoop_hdfs_RemoveDefaultAclResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_RemoveDefaultAclResponseProto_descriptor,
        new java.lang.String[] { });
    internal_static_hadoop_hdfs_SetAclRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_hadoop_hdfs_SetAclRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_SetAclRequestProto_descriptor,
        new java.lang.String[] { "Src", "AclSpec", });
    internal_static_hadoop_hdfs_SetAclResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_hadoop_hdfs_SetAclResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_SetAclResponseProto_descriptor,
        new java.lang.String[] { });
    internal_static_hadoop_hdfs_GetAclStatusRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_hadoop_hdfs_GetAclStatusRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_GetAclStatusRequestProto_descriptor,
        new java.lang.String[] { "Src", });
    internal_static_hadoop_hdfs_GetAclStatusResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_hadoop_hdfs_GetAclStatusResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_GetAclStatusResponseProto_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
