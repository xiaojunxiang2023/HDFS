// source: editlog.proto

package org.apache.hadoop.hdfs.protocol.proto;

public final class EditLogProtos {
  private EditLogProtos() {}
  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AclEditLogProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.AclEditLogProto)
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
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
     */
    java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> 
        getEntriesList();
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getEntries(int index);
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
     */
    int getEntriesCount();
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
     */
    java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
        getEntriesOrBuilderList();
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder getEntriesOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code hadoop.hdfs.AclEditLogProto}
   */
  public  static final class AclEditLogProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.AclEditLogProto)
      AclEditLogProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AclEditLogProto.newBuilder() to construct.
    private AclEditLogProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AclEditLogProto() {
      src_ = "";
      entries_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AclEditLogProto(
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
                entries_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto>();
                mutable_bitField0_ |= 0x00000002;
              }
              entries_.add(
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
          entries_ = java.util.Collections.unmodifiableList(entries_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.internal_static_hadoop_hdfs_AclEditLogProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.internal_static_hadoop_hdfs_AclEditLogProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto.class, org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto.Builder.class);
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

    public static final int ENTRIES_FIELD_NUMBER = 2;
    private java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> entries_;
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
     */
    public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> getEntriesList() {
      return entries_;
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
     */
    public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
        getEntriesOrBuilderList() {
      return entries_;
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
     */
    public int getEntriesCount() {
      return entries_.size();
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getEntries(int index) {
      return entries_.get(index);
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder getEntriesOrBuilder(
        int index) {
      return entries_.get(index);
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
      for (int i = 0; i < getEntriesCount(); i++) {
        if (!getEntries(i).isInitialized()) {
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
      for (int i = 0; i < entries_.size(); i++) {
        output.writeMessage(2, entries_.get(i));
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
      for (int i = 0; i < entries_.size(); i++) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(2, entries_.get(i));
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto other = (org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto) obj;

      if (hasSrc() != other.hasSrc()) return false;
      if (hasSrc()) {
        if (!getSrc()
            .equals(other.getSrc())) return false;
      }
      if (!getEntriesList()
          .equals(other.getEntriesList())) return false;
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
      if (getEntriesCount() > 0) {
        hash = (37 * hash) + ENTRIES_FIELD_NUMBER;
        hash = (53 * hash) + getEntriesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.AclEditLogProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.AclEditLogProto)
        org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.internal_static_hadoop_hdfs_AclEditLogProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.internal_static_hadoop_hdfs_AclEditLogProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto.class, org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto.newBuilder()
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
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        src_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (entriesBuilder_ == null) {
          entries_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          entriesBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.internal_static_hadoop_hdfs_AclEditLogProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto build() {
        org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto result = new org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.src_ = src_;
        if (entriesBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            entries_ = java.util.Collections.unmodifiableList(entries_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.entries_ = entries_;
        } else {
          result.entries_ = entriesBuilder_.build();
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto.getDefaultInstance()) return this;
        if (other.hasSrc()) {
          bitField0_ |= 0x00000001;
          src_ = other.src_;
          onChanged();
        }
        if (entriesBuilder_ == null) {
          if (!other.entries_.isEmpty()) {
            if (entries_.isEmpty()) {
              entries_ = other.entries_;
              bitField0_ = (bitField0_ & ~0x00000002);
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
              bitField0_ = (bitField0_ & ~0x00000002);
              entriesBuilder_ = 
                org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getEntriesFieldBuilder() : null;
            } else {
              entriesBuilder_.addAllMessages(other.entries_);
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
        for (int i = 0; i < getEntriesCount(); i++) {
          if (!getEntries(i).isInitialized()) {
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
        org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto) e.getUnfinishedMessage();
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

      private java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> entries_ =
        java.util.Collections.emptyList();
      private void ensureEntriesIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          entries_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto>(entries_);
          bitField0_ |= 0x00000002;
         }
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> entriesBuilder_;

      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> getEntriesList() {
        if (entriesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(entries_);
        } else {
          return entriesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
       */
      public int getEntriesCount() {
        if (entriesBuilder_ == null) {
          return entries_.size();
        } else {
          return entriesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getEntries(int index) {
        if (entriesBuilder_ == null) {
          return entries_.get(index);
        } else {
          return entriesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
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
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
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
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
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
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
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
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
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
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
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
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
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
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
       */
      public Builder clearEntries() {
        if (entriesBuilder_ == null) {
          entries_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          entriesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
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
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder getEntriesBuilder(
          int index) {
        return getEntriesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder getEntriesOrBuilder(
          int index) {
        if (entriesBuilder_ == null) {
          return entries_.get(index);  } else {
          return entriesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
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
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder addEntriesBuilder() {
        return getEntriesFieldBuilder().addBuilder(
            org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder addEntriesBuilder(
          int index) {
        return getEntriesFieldBuilder().addBuilder(
            index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
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
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          entries_ = null;
        }
        return entriesBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.AclEditLogProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.AclEditLogProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<AclEditLogProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<AclEditLogProto>() {
      @java.lang.Override
      public AclEditLogProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new AclEditLogProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<AclEditLogProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<AclEditLogProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.AclEditLogProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface XAttrEditLogProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.XAttrEditLogProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>optional string src = 1;</code>
     */
    boolean hasSrc();
    /**
     * <code>optional string src = 1;</code>
     */
    java.lang.String getSrc();
    /**
     * <code>optional string src = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getSrcBytes();

    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 2;</code>
     */
    java.util.List<org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto> 
        getXAttrsList();
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto getXAttrs(int index);
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 2;</code>
     */
    int getXAttrsCount();
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 2;</code>
     */
    java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder> 
        getXAttrsOrBuilderList();
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder getXAttrsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code hadoop.hdfs.XAttrEditLogProto}
   */
  public  static final class XAttrEditLogProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.XAttrEditLogProto)
      XAttrEditLogProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use XAttrEditLogProto.newBuilder() to construct.
    private XAttrEditLogProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private XAttrEditLogProto() {
      src_ = "";
      xAttrs_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private XAttrEditLogProto(
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
                xAttrs_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto>();
                mutable_bitField0_ |= 0x00000002;
              }
              xAttrs_.add(
                  input.readMessage(org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.PARSER, extensionRegistry));
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
          xAttrs_ = java.util.Collections.unmodifiableList(xAttrs_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.internal_static_hadoop_hdfs_XAttrEditLogProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.internal_static_hadoop_hdfs_XAttrEditLogProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto.class, org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto.Builder.class);
    }

    private int bitField0_;
    public static final int SRC_FIELD_NUMBER = 1;
    private volatile java.lang.Object src_;
    /**
     * <code>optional string src = 1;</code>
     */
    public boolean hasSrc() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string src = 1;</code>
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
     * <code>optional string src = 1;</code>
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

    public static final int XATTRS_FIELD_NUMBER = 2;
    private java.util.List<org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto> xAttrs_;
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 2;</code>
     */
    public java.util.List<org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto> getXAttrsList() {
      return xAttrs_;
    }
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 2;</code>
     */
    public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder> 
        getXAttrsOrBuilderList() {
      return xAttrs_;
    }
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 2;</code>
     */
    public int getXAttrsCount() {
      return xAttrs_.size();
    }
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto getXAttrs(int index) {
      return xAttrs_.get(index);
    }
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder getXAttrsOrBuilder(
        int index) {
      return xAttrs_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getXAttrsCount(); i++) {
        if (!getXAttrs(i).isInitialized()) {
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
      for (int i = 0; i < xAttrs_.size(); i++) {
        output.writeMessage(2, xAttrs_.get(i));
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
      for (int i = 0; i < xAttrs_.size(); i++) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(2, xAttrs_.get(i));
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto other = (org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto) obj;

      if (hasSrc() != other.hasSrc()) return false;
      if (hasSrc()) {
        if (!getSrc()
            .equals(other.getSrc())) return false;
      }
      if (!getXAttrsList()
          .equals(other.getXAttrsList())) return false;
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
      if (getXAttrsCount() > 0) {
        hash = (37 * hash) + XATTRS_FIELD_NUMBER;
        hash = (53 * hash) + getXAttrsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.XAttrEditLogProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.XAttrEditLogProto)
        org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.internal_static_hadoop_hdfs_XAttrEditLogProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.internal_static_hadoop_hdfs_XAttrEditLogProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto.class, org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto.newBuilder()
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
          getXAttrsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        src_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (xAttrsBuilder_ == null) {
          xAttrs_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          xAttrsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.internal_static_hadoop_hdfs_XAttrEditLogProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto build() {
        org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto result = new org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.src_ = src_;
        if (xAttrsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            xAttrs_ = java.util.Collections.unmodifiableList(xAttrs_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.xAttrs_ = xAttrs_;
        } else {
          result.xAttrs_ = xAttrsBuilder_.build();
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto.getDefaultInstance()) return this;
        if (other.hasSrc()) {
          bitField0_ |= 0x00000001;
          src_ = other.src_;
          onChanged();
        }
        if (xAttrsBuilder_ == null) {
          if (!other.xAttrs_.isEmpty()) {
            if (xAttrs_.isEmpty()) {
              xAttrs_ = other.xAttrs_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureXAttrsIsMutable();
              xAttrs_.addAll(other.xAttrs_);
            }
            onChanged();
          }
        } else {
          if (!other.xAttrs_.isEmpty()) {
            if (xAttrsBuilder_.isEmpty()) {
              xAttrsBuilder_.dispose();
              xAttrsBuilder_ = null;
              xAttrs_ = other.xAttrs_;
              bitField0_ = (bitField0_ & ~0x00000002);
              xAttrsBuilder_ = 
                org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getXAttrsFieldBuilder() : null;
            } else {
              xAttrsBuilder_.addAllMessages(other.xAttrs_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        for (int i = 0; i < getXAttrsCount(); i++) {
          if (!getXAttrs(i).isInitialized()) {
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
        org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto) e.getUnfinishedMessage();
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
       * <code>optional string src = 1;</code>
       */
      public boolean hasSrc() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional string src = 1;</code>
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
       * <code>optional string src = 1;</code>
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
       * <code>optional string src = 1;</code>
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
       * <code>optional string src = 1;</code>
       */
      public Builder clearSrc() {
        bitField0_ = (bitField0_ & ~0x00000001);
        src_ = getDefaultInstance().getSrc();
        onChanged();
        return this;
      }
      /**
       * <code>optional string src = 1;</code>
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

      private java.util.List<org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto> xAttrs_ =
        java.util.Collections.emptyList();
      private void ensureXAttrsIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          xAttrs_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto>(xAttrs_);
          bitField0_ |= 0x00000002;
         }
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder> xAttrsBuilder_;

      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 2;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto> getXAttrsList() {
        if (xAttrsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(xAttrs_);
        } else {
          return xAttrsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 2;</code>
       */
      public int getXAttrsCount() {
        if (xAttrsBuilder_ == null) {
          return xAttrs_.size();
        } else {
          return xAttrsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto getXAttrs(int index) {
        if (xAttrsBuilder_ == null) {
          return xAttrs_.get(index);
        } else {
          return xAttrsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 2;</code>
       */
      public Builder setXAttrs(
          int index, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto value) {
        if (xAttrsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureXAttrsIsMutable();
          xAttrs_.set(index, value);
          onChanged();
        } else {
          xAttrsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 2;</code>
       */
      public Builder setXAttrs(
          int index, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder builderForValue) {
        if (xAttrsBuilder_ == null) {
          ensureXAttrsIsMutable();
          xAttrs_.set(index, builderForValue.build());
          onChanged();
        } else {
          xAttrsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 2;</code>
       */
      public Builder addXAttrs(org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto value) {
        if (xAttrsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureXAttrsIsMutable();
          xAttrs_.add(value);
          onChanged();
        } else {
          xAttrsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 2;</code>
       */
      public Builder addXAttrs(
          int index, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto value) {
        if (xAttrsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureXAttrsIsMutable();
          xAttrs_.add(index, value);
          onChanged();
        } else {
          xAttrsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 2;</code>
       */
      public Builder addXAttrs(
          org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder builderForValue) {
        if (xAttrsBuilder_ == null) {
          ensureXAttrsIsMutable();
          xAttrs_.add(builderForValue.build());
          onChanged();
        } else {
          xAttrsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 2;</code>
       */
      public Builder addXAttrs(
          int index, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder builderForValue) {
        if (xAttrsBuilder_ == null) {
          ensureXAttrsIsMutable();
          xAttrs_.add(index, builderForValue.build());
          onChanged();
        } else {
          xAttrsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 2;</code>
       */
      public Builder addAllXAttrs(
          java.lang.Iterable<? extends org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto> values) {
        if (xAttrsBuilder_ == null) {
          ensureXAttrsIsMutable();
          org.apache.hadoop.thirdparty.protobuf.AbstractMessageLite.Builder.addAll(
              values, xAttrs_);
          onChanged();
        } else {
          xAttrsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 2;</code>
       */
      public Builder clearXAttrs() {
        if (xAttrsBuilder_ == null) {
          xAttrs_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          xAttrsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 2;</code>
       */
      public Builder removeXAttrs(int index) {
        if (xAttrsBuilder_ == null) {
          ensureXAttrsIsMutable();
          xAttrs_.remove(index);
          onChanged();
        } else {
          xAttrsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder getXAttrsBuilder(
          int index) {
        return getXAttrsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder getXAttrsOrBuilder(
          int index) {
        if (xAttrsBuilder_ == null) {
          return xAttrs_.get(index);  } else {
          return xAttrsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 2;</code>
       */
      public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder> 
           getXAttrsOrBuilderList() {
        if (xAttrsBuilder_ != null) {
          return xAttrsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(xAttrs_);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder addXAttrsBuilder() {
        return getXAttrsFieldBuilder().addBuilder(
            org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder addXAttrsBuilder(
          int index) {
        return getXAttrsFieldBuilder().addBuilder(
            index, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 2;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder> 
           getXAttrsBuilderList() {
        return getXAttrsFieldBuilder().getBuilderList();
      }
      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder> 
          getXAttrsFieldBuilder() {
        if (xAttrsBuilder_ == null) {
          xAttrsBuilder_ = new org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder>(
                  xAttrs_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          xAttrs_ = null;
        }
        return xAttrsBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.XAttrEditLogProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.XAttrEditLogProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<XAttrEditLogProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<XAttrEditLogProto>() {
      @java.lang.Override
      public XAttrEditLogProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new XAttrEditLogProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<XAttrEditLogProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<XAttrEditLogProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.EditLogProtos.XAttrEditLogProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_AclEditLogProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_AclEditLogProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_XAttrEditLogProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_XAttrEditLogProto_fieldAccessorTable;

  public static org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\reditlog.proto\022\013hadoop.hdfs\032\tacl.proto\032" +
      "\013xattr.proto\"K\n\017AclEditLogProto\022\013\n\003src\030\001" +
      " \002(\t\022+\n\007entries\030\002 \003(\0132\032.hadoop.hdfs.AclE" +
      "ntryProto\"I\n\021XAttrEditLogProto\022\013\n\003src\030\001 " +
      "\001(\t\022\'\n\006xAttrs\030\002 \003(\0132\027.hadoop.hdfs.XAttrP" +
      "rotoB9\n%org.apache.hadoop.hdfs.protocol." +
      "protoB\rEditLogProtos\240\001\001"
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
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.getDescriptor(),
          org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.getDescriptor(),
        }, assigner);
    internal_static_hadoop_hdfs_AclEditLogProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hadoop_hdfs_AclEditLogProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_AclEditLogProto_descriptor,
        new java.lang.String[] { "Src", "Entries", });
    internal_static_hadoop_hdfs_XAttrEditLogProto_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hadoop_hdfs_XAttrEditLogProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_XAttrEditLogProto_descriptor,
        new java.lang.String[] { "Src", "XAttrs", });
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.getDescriptor();
    org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
