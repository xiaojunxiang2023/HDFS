// source: TraceAdmin.proto

package org.apache.hadoop.tracing;

public final class TraceAdminPB {
  private TraceAdminPB() {
  }

  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite) registry);
  }

  public interface ListSpanReceiversRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.ListSpanReceiversRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }

  /**
   * Protobuf type {@code hadoop.common.ListSpanReceiversRequestProto}
   */
  public static final class ListSpanReceiversRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.ListSpanReceiversRequestProto)
      ListSpanReceiversRequestProtoOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use ListSpanReceiversRequestProto.newBuilder() to construct.
    private ListSpanReceiversRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ListSpanReceiversRequestProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    private ListSpanReceiversRequestProto(
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
      return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_ListSpanReceiversRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_ListSpanReceiversRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto.class, org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto.Builder.class);
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
      if (!(obj instanceof org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto other = (org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto) obj;

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

    public static org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto parseFrom(
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

    public static Builder newBuilder(org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto prototype) {
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
     * Protobuf type {@code hadoop.common.ListSpanReceiversRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.ListSpanReceiversRequestProto)
        org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_ListSpanReceiversRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_ListSpanReceiversRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto.class, org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto.newBuilder()
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
        return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_ListSpanReceiversRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto build() {
        org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto buildPartial() {
        org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto result = new org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto(this);
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
        if (other instanceof org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto) {
          return mergeFrom((org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto other) {
        if (other == org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto.getDefaultInstance())
          return this;
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
        org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto) e.getUnfinishedMessage();
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.ListSpanReceiversRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.ListSpanReceiversRequestProto)
    private static final org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto();
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final org.apache.hadoop.thirdparty.protobuf.Parser<ListSpanReceiversRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<ListSpanReceiversRequestProto>() {
      @java.lang.Override
      public ListSpanReceiversRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new ListSpanReceiversRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<ListSpanReceiversRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<ListSpanReceiversRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface SpanReceiverListInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.SpanReceiverListInfo)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required int64 id = 1;</code>
     */
    boolean hasId();

    /**
     * <code>required int64 id = 1;</code>
     */
    long getId();

    /**
     * <code>required string className = 2;</code>
     */
    boolean hasClassName();

    /**
     * <code>required string className = 2;</code>
     */
    java.lang.String getClassName();

    /**
     * <code>required string className = 2;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
    getClassNameBytes();
  }

  /**
   * Protobuf type {@code hadoop.common.SpanReceiverListInfo}
   */
  public static final class SpanReceiverListInfo extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.SpanReceiverListInfo)
      SpanReceiverListInfoOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use SpanReceiverListInfo.newBuilder() to construct.
    private SpanReceiverListInfo(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private SpanReceiverListInfo() {
      className_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    private SpanReceiverListInfo(
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
              id_ = input.readInt64();
              break;
            }
            case 18: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              className_ = bs;
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
      return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_SpanReceiverListInfo_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_SpanReceiverListInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo.class, org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo.Builder.class);
    }

    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 1;
    private long id_;

    /**
     * <code>required int64 id = 1;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>required int64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }

    public static final int CLASSNAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object className_;

    /**
     * <code>required string className = 2;</code>
     */
    public boolean hasClassName() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     * <code>required string className = 2;</code>
     */
    public java.lang.String getClassName() {
      java.lang.Object ref = className_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs =
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          className_ = s;
        }
        return s;
      }
    }

    /**
     * <code>required string className = 2;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
    getClassNameBytes() {
      java.lang.Object ref = className_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b =
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        className_ = b;
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

      if (!hasId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasClassName()) {
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
        output.writeInt64(1, id_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 2, className_);
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
            .computeInt64Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(2, className_);
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
      if (!(obj instanceof org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo)) {
        return super.equals(obj);
      }
      org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo other = (org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo) obj;

      if (hasId() != other.hasId()) return false;
      if (hasId()) {
        if (getId()
            != other.getId()) return false;
      }
      if (hasClassName() != other.hasClassName()) return false;
      if (hasClassName()) {
        if (!getClassName()
            .equals(other.getClassName())) return false;
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
      if (hasId()) {
        hash = (37 * hash) + ID_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getId());
      }
      if (hasClassName()) {
        hash = (37 * hash) + CLASSNAME_FIELD_NUMBER;
        hash = (53 * hash) + getClassName().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo parseFrom(
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

    public static Builder newBuilder(org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo prototype) {
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
     * Protobuf type {@code hadoop.common.SpanReceiverListInfo}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.SpanReceiverListInfo)
        org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_SpanReceiverListInfo_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_SpanReceiverListInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo.class, org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo.Builder.class);
      }

      // Construct using org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo.newBuilder()
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
        id_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        className_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_SpanReceiverListInfo_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo getDefaultInstanceForType() {
        return org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo build() {
        org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo buildPartial() {
        org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo result = new org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.id_ = id_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.className_ = className_;
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
        if (other instanceof org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo) {
          return mergeFrom((org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo other) {
        if (other == org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasClassName()) {
          bitField0_ |= 0x00000002;
          className_ = other.className_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasId()) {
          return false;
        }
        if (!hasClassName()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private long id_;

      /**
       * <code>required int64 id = 1;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) != 0);
      }

      /**
       * <code>required int64 id = 1;</code>
       */
      public long getId() {
        return id_;
      }

      /**
       * <code>required int64 id = 1;</code>
       */
      public Builder setId(long value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required int64 id = 1;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object className_ = "";

      /**
       * <code>required string className = 2;</code>
       */
      public boolean hasClassName() {
        return ((bitField0_ & 0x00000002) != 0);
      }

      /**
       * <code>required string className = 2;</code>
       */
      public java.lang.String getClassName() {
        java.lang.Object ref = className_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            className_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>required string className = 2;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
      getClassNameBytes() {
        java.lang.Object ref = className_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b =
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          className_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>required string className = 2;</code>
       */
      public Builder setClassName(
          java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        className_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required string className = 2;</code>
       */
      public Builder clearClassName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        className_ = getDefaultInstance().getClassName();
        onChanged();
        return this;
      }

      /**
       * <code>required string className = 2;</code>
       */
      public Builder setClassNameBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        className_ = value;
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.SpanReceiverListInfo)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.SpanReceiverListInfo)
    private static final org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo();
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final org.apache.hadoop.thirdparty.protobuf.Parser<SpanReceiverListInfo>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<SpanReceiverListInfo>() {
      @java.lang.Override
      public SpanReceiverListInfo parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new SpanReceiverListInfo(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<SpanReceiverListInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<SpanReceiverListInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ListSpanReceiversResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.ListSpanReceiversResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .hadoop.common.SpanReceiverListInfo descriptions = 1;</code>
     */
    java.util.List<org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo>
    getDescriptionsList();

    /**
     * <code>repeated .hadoop.common.SpanReceiverListInfo descriptions = 1;</code>
     */
    org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo getDescriptions(int index);

    /**
     * <code>repeated .hadoop.common.SpanReceiverListInfo descriptions = 1;</code>
     */
    int getDescriptionsCount();

    /**
     * <code>repeated .hadoop.common.SpanReceiverListInfo descriptions = 1;</code>
     */
    java.util.List<? extends org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfoOrBuilder>
    getDescriptionsOrBuilderList();

    /**
     * <code>repeated .hadoop.common.SpanReceiverListInfo descriptions = 1;</code>
     */
    org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfoOrBuilder getDescriptionsOrBuilder(
        int index);
  }

  /**
   * Protobuf type {@code hadoop.common.ListSpanReceiversResponseProto}
   */
  public static final class ListSpanReceiversResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.ListSpanReceiversResponseProto)
      ListSpanReceiversResponseProtoOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use ListSpanReceiversResponseProto.newBuilder() to construct.
    private ListSpanReceiversResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ListSpanReceiversResponseProto() {
      descriptions_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    private ListSpanReceiversResponseProto(
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
                descriptions_ = new java.util.ArrayList<org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              descriptions_.add(
                  input.readMessage(org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo.PARSER, extensionRegistry));
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
          descriptions_ = java.util.Collections.unmodifiableList(descriptions_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_ListSpanReceiversResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_ListSpanReceiversResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto.class, org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto.Builder.class);
    }

    public static final int DESCRIPTIONS_FIELD_NUMBER = 1;
    private java.util.List<org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo> descriptions_;

    /**
     * <code>repeated .hadoop.common.SpanReceiverListInfo descriptions = 1;</code>
     */
    public java.util.List<org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo> getDescriptionsList() {
      return descriptions_;
    }

    /**
     * <code>repeated .hadoop.common.SpanReceiverListInfo descriptions = 1;</code>
     */
    public java.util.List<? extends org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfoOrBuilder>
    getDescriptionsOrBuilderList() {
      return descriptions_;
    }

    /**
     * <code>repeated .hadoop.common.SpanReceiverListInfo descriptions = 1;</code>
     */
    public int getDescriptionsCount() {
      return descriptions_.size();
    }

    /**
     * <code>repeated .hadoop.common.SpanReceiverListInfo descriptions = 1;</code>
     */
    public org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo getDescriptions(int index) {
      return descriptions_.get(index);
    }

    /**
     * <code>repeated .hadoop.common.SpanReceiverListInfo descriptions = 1;</code>
     */
    public org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfoOrBuilder getDescriptionsOrBuilder(
        int index) {
      return descriptions_.get(index);
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getDescriptionsCount(); i++) {
        if (!getDescriptions(i).isInitialized()) {
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
      for (int i = 0; i < descriptions_.size(); i++) {
        output.writeMessage(1, descriptions_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < descriptions_.size(); i++) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
            .computeMessageSize(1, descriptions_.get(i));
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
      if (!(obj instanceof org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto other = (org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto) obj;

      if (!getDescriptionsList()
          .equals(other.getDescriptionsList())) return false;
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
      if (getDescriptionsCount() > 0) {
        hash = (37 * hash) + DESCRIPTIONS_FIELD_NUMBER;
        hash = (53 * hash) + getDescriptionsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto parseFrom(
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

    public static Builder newBuilder(org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto prototype) {
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
     * Protobuf type {@code hadoop.common.ListSpanReceiversResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.ListSpanReceiversResponseProto)
        org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_ListSpanReceiversResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_ListSpanReceiversResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto.class, org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto.newBuilder()
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
          getDescriptionsFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (descriptionsBuilder_ == null) {
          descriptions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          descriptionsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_ListSpanReceiversResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto build() {
        org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto buildPartial() {
        org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto result = new org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto(this);
        int from_bitField0_ = bitField0_;
        if (descriptionsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            descriptions_ = java.util.Collections.unmodifiableList(descriptions_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.descriptions_ = descriptions_;
        } else {
          result.descriptions_ = descriptionsBuilder_.build();
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
        if (other instanceof org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto) {
          return mergeFrom((org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto other) {
        if (other == org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto.getDefaultInstance())
          return this;
        if (descriptionsBuilder_ == null) {
          if (!other.descriptions_.isEmpty()) {
            if (descriptions_.isEmpty()) {
              descriptions_ = other.descriptions_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureDescriptionsIsMutable();
              descriptions_.addAll(other.descriptions_);
            }
            onChanged();
          }
        } else {
          if (!other.descriptions_.isEmpty()) {
            if (descriptionsBuilder_.isEmpty()) {
              descriptionsBuilder_.dispose();
              descriptionsBuilder_ = null;
              descriptions_ = other.descriptions_;
              bitField0_ = (bitField0_ & ~0x00000001);
              descriptionsBuilder_ =
                  org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                      getDescriptionsFieldBuilder() : null;
            } else {
              descriptionsBuilder_.addAllMessages(other.descriptions_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        for (int i = 0; i < getDescriptionsCount(); i++) {
          if (!getDescriptions(i).isInitialized()) {
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
        org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.util.List<org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo> descriptions_ =
          java.util.Collections.emptyList();

      private void ensureDescriptionsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          descriptions_ = new java.util.ArrayList<org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo>(descriptions_);
          bitField0_ |= 0x00000001;
        }
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo, org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo.Builder, org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfoOrBuilder> descriptionsBuilder_;

      /**
       * <code>repeated .hadoop.common.SpanReceiverListInfo descriptions = 1;</code>
       */
      public java.util.List<org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo> getDescriptionsList() {
        if (descriptionsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(descriptions_);
        } else {
          return descriptionsBuilder_.getMessageList();
        }
      }

      /**
       * <code>repeated .hadoop.common.SpanReceiverListInfo descriptions = 1;</code>
       */
      public int getDescriptionsCount() {
        if (descriptionsBuilder_ == null) {
          return descriptions_.size();
        } else {
          return descriptionsBuilder_.getCount();
        }
      }

      /**
       * <code>repeated .hadoop.common.SpanReceiverListInfo descriptions = 1;</code>
       */
      public org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo getDescriptions(int index) {
        if (descriptionsBuilder_ == null) {
          return descriptions_.get(index);
        } else {
          return descriptionsBuilder_.getMessage(index);
        }
      }

      /**
       * <code>repeated .hadoop.common.SpanReceiverListInfo descriptions = 1;</code>
       */
      public Builder setDescriptions(
          int index, org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo value) {
        if (descriptionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDescriptionsIsMutable();
          descriptions_.set(index, value);
          onChanged();
        } else {
          descriptionsBuilder_.setMessage(index, value);
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.SpanReceiverListInfo descriptions = 1;</code>
       */
      public Builder setDescriptions(
          int index, org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo.Builder builderForValue) {
        if (descriptionsBuilder_ == null) {
          ensureDescriptionsIsMutable();
          descriptions_.set(index, builderForValue.build());
          onChanged();
        } else {
          descriptionsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.SpanReceiverListInfo descriptions = 1;</code>
       */
      public Builder addDescriptions(org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo value) {
        if (descriptionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDescriptionsIsMutable();
          descriptions_.add(value);
          onChanged();
        } else {
          descriptionsBuilder_.addMessage(value);
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.SpanReceiverListInfo descriptions = 1;</code>
       */
      public Builder addDescriptions(
          int index, org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo value) {
        if (descriptionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDescriptionsIsMutable();
          descriptions_.add(index, value);
          onChanged();
        } else {
          descriptionsBuilder_.addMessage(index, value);
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.SpanReceiverListInfo descriptions = 1;</code>
       */
      public Builder addDescriptions(
          org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo.Builder builderForValue) {
        if (descriptionsBuilder_ == null) {
          ensureDescriptionsIsMutable();
          descriptions_.add(builderForValue.build());
          onChanged();
        } else {
          descriptionsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.SpanReceiverListInfo descriptions = 1;</code>
       */
      public Builder addDescriptions(
          int index, org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo.Builder builderForValue) {
        if (descriptionsBuilder_ == null) {
          ensureDescriptionsIsMutable();
          descriptions_.add(index, builderForValue.build());
          onChanged();
        } else {
          descriptionsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.SpanReceiverListInfo descriptions = 1;</code>
       */
      public Builder addAllDescriptions(
          java.lang.Iterable<? extends org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo> values) {
        if (descriptionsBuilder_ == null) {
          ensureDescriptionsIsMutable();
          org.apache.hadoop.thirdparty.protobuf.AbstractMessageLite.Builder.addAll(
              values, descriptions_);
          onChanged();
        } else {
          descriptionsBuilder_.addAllMessages(values);
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.SpanReceiverListInfo descriptions = 1;</code>
       */
      public Builder clearDescriptions() {
        if (descriptionsBuilder_ == null) {
          descriptions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          descriptionsBuilder_.clear();
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.SpanReceiverListInfo descriptions = 1;</code>
       */
      public Builder removeDescriptions(int index) {
        if (descriptionsBuilder_ == null) {
          ensureDescriptionsIsMutable();
          descriptions_.remove(index);
          onChanged();
        } else {
          descriptionsBuilder_.remove(index);
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.SpanReceiverListInfo descriptions = 1;</code>
       */
      public org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo.Builder getDescriptionsBuilder(
          int index) {
        return getDescriptionsFieldBuilder().getBuilder(index);
      }

      /**
       * <code>repeated .hadoop.common.SpanReceiverListInfo descriptions = 1;</code>
       */
      public org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfoOrBuilder getDescriptionsOrBuilder(
          int index) {
        if (descriptionsBuilder_ == null) {
          return descriptions_.get(index);
        } else {
          return descriptionsBuilder_.getMessageOrBuilder(index);
        }
      }

      /**
       * <code>repeated .hadoop.common.SpanReceiverListInfo descriptions = 1;</code>
       */
      public java.util.List<? extends org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfoOrBuilder>
      getDescriptionsOrBuilderList() {
        if (descriptionsBuilder_ != null) {
          return descriptionsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(descriptions_);
        }
      }

      /**
       * <code>repeated .hadoop.common.SpanReceiverListInfo descriptions = 1;</code>
       */
      public org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo.Builder addDescriptionsBuilder() {
        return getDescriptionsFieldBuilder().addBuilder(
            org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo.getDefaultInstance());
      }

      /**
       * <code>repeated .hadoop.common.SpanReceiverListInfo descriptions = 1;</code>
       */
      public org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo.Builder addDescriptionsBuilder(
          int index) {
        return getDescriptionsFieldBuilder().addBuilder(
            index, org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo.getDefaultInstance());
      }

      /**
       * <code>repeated .hadoop.common.SpanReceiverListInfo descriptions = 1;</code>
       */
      public java.util.List<org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo.Builder>
      getDescriptionsBuilderList() {
        return getDescriptionsFieldBuilder().getBuilderList();
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo, org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo.Builder, org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfoOrBuilder>
      getDescriptionsFieldBuilder() {
        if (descriptionsBuilder_ == null) {
          descriptionsBuilder_ = new org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
              org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo, org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfo.Builder, org.apache.hadoop.tracing.TraceAdminPB.SpanReceiverListInfoOrBuilder>(
              descriptions_,
              ((bitField0_ & 0x00000001) != 0),
              getParentForChildren(),
              isClean());
          descriptions_ = null;
        }
        return descriptionsBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.ListSpanReceiversResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.ListSpanReceiversResponseProto)
    private static final org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto();
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final org.apache.hadoop.thirdparty.protobuf.Parser<ListSpanReceiversResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<ListSpanReceiversResponseProto>() {
      @java.lang.Override
      public ListSpanReceiversResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new ListSpanReceiversResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<ListSpanReceiversResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<ListSpanReceiversResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ConfigPairOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.ConfigPair)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required string key = 1;</code>
     */
    boolean hasKey();

    /**
     * <code>required string key = 1;</code>
     */
    java.lang.String getKey();

    /**
     * <code>required string key = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
    getKeyBytes();

    /**
     * <code>required string value = 2;</code>
     */
    boolean hasValue();

    /**
     * <code>required string value = 2;</code>
     */
    java.lang.String getValue();

    /**
     * <code>required string value = 2;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
    getValueBytes();
  }

  /**
   * Protobuf type {@code hadoop.common.ConfigPair}
   */
  public static final class ConfigPair extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.ConfigPair)
      ConfigPairOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use ConfigPair.newBuilder() to construct.
    private ConfigPair(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ConfigPair() {
      key_ = "";
      value_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    private ConfigPair(
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
              key_ = bs;
              break;
            }
            case 18: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              value_ = bs;
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
      return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_ConfigPair_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_ConfigPair_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.tracing.TraceAdminPB.ConfigPair.class, org.apache.hadoop.tracing.TraceAdminPB.ConfigPair.Builder.class);
    }

    private int bitField0_;
    public static final int KEY_FIELD_NUMBER = 1;
    private volatile java.lang.Object key_;

    /**
     * <code>required string key = 1;</code>
     */
    public boolean hasKey() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>required string key = 1;</code>
     */
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs =
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          key_ = s;
        }
        return s;
      }
    }

    /**
     * <code>required string key = 1;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
    getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b =
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int VALUE_FIELD_NUMBER = 2;
    private volatile java.lang.Object value_;

    /**
     * <code>required string value = 2;</code>
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     * <code>required string value = 2;</code>
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs =
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          value_ = s;
        }
        return s;
      }
    }

    /**
     * <code>required string value = 2;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
    getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b =
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
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

      if (!hasKey()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasValue()) {
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, key_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 2, value_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, key_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(2, value_);
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
      if (!(obj instanceof org.apache.hadoop.tracing.TraceAdminPB.ConfigPair)) {
        return super.equals(obj);
      }
      org.apache.hadoop.tracing.TraceAdminPB.ConfigPair other = (org.apache.hadoop.tracing.TraceAdminPB.ConfigPair) obj;

      if (hasKey() != other.hasKey()) return false;
      if (hasKey()) {
        if (!getKey()
            .equals(other.getKey())) return false;
      }
      if (hasValue() != other.hasValue()) return false;
      if (hasValue()) {
        if (!getValue()
            .equals(other.getValue())) return false;
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
      if (hasKey()) {
        hash = (37 * hash) + KEY_FIELD_NUMBER;
        hash = (53 * hash) + getKey().hashCode();
      }
      if (hasValue()) {
        hash = (37 * hash) + VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getValue().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ConfigPair parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ConfigPair parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ConfigPair parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ConfigPair parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ConfigPair parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ConfigPair parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ConfigPair parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ConfigPair parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ConfigPair parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ConfigPair parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ConfigPair parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ConfigPair parseFrom(
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

    public static Builder newBuilder(org.apache.hadoop.tracing.TraceAdminPB.ConfigPair prototype) {
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
     * Protobuf type {@code hadoop.common.ConfigPair}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.ConfigPair)
        org.apache.hadoop.tracing.TraceAdminPB.ConfigPairOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_ConfigPair_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_ConfigPair_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.tracing.TraceAdminPB.ConfigPair.class, org.apache.hadoop.tracing.TraceAdminPB.ConfigPair.Builder.class);
      }

      // Construct using org.apache.hadoop.tracing.TraceAdminPB.ConfigPair.newBuilder()
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
        key_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        value_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_ConfigPair_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.tracing.TraceAdminPB.ConfigPair getDefaultInstanceForType() {
        return org.apache.hadoop.tracing.TraceAdminPB.ConfigPair.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.tracing.TraceAdminPB.ConfigPair build() {
        org.apache.hadoop.tracing.TraceAdminPB.ConfigPair result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.tracing.TraceAdminPB.ConfigPair buildPartial() {
        org.apache.hadoop.tracing.TraceAdminPB.ConfigPair result = new org.apache.hadoop.tracing.TraceAdminPB.ConfigPair(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.key_ = key_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.value_ = value_;
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
        if (other instanceof org.apache.hadoop.tracing.TraceAdminPB.ConfigPair) {
          return mergeFrom((org.apache.hadoop.tracing.TraceAdminPB.ConfigPair) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.tracing.TraceAdminPB.ConfigPair other) {
        if (other == org.apache.hadoop.tracing.TraceAdminPB.ConfigPair.getDefaultInstance()) return this;
        if (other.hasKey()) {
          bitField0_ |= 0x00000001;
          key_ = other.key_;
          onChanged();
        }
        if (other.hasValue()) {
          bitField0_ |= 0x00000002;
          value_ = other.value_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasKey()) {
          return false;
        }
        if (!hasValue()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.tracing.TraceAdminPB.ConfigPair parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.tracing.TraceAdminPB.ConfigPair) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object key_ = "";

      /**
       * <code>required string key = 1;</code>
       */
      public boolean hasKey() {
        return ((bitField0_ & 0x00000001) != 0);
      }

      /**
       * <code>required string key = 1;</code>
       */
      public java.lang.String getKey() {
        java.lang.Object ref = key_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            key_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>required string key = 1;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
      getKeyBytes() {
        java.lang.Object ref = key_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b =
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          key_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>required string key = 1;</code>
       */
      public Builder setKey(
          java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        key_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required string key = 1;</code>
       */
      public Builder clearKey() {
        bitField0_ = (bitField0_ & ~0x00000001);
        key_ = getDefaultInstance().getKey();
        onChanged();
        return this;
      }

      /**
       * <code>required string key = 1;</code>
       */
      public Builder setKeyBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        key_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object value_ = "";

      /**
       * <code>required string value = 2;</code>
       */
      public boolean hasValue() {
        return ((bitField0_ & 0x00000002) != 0);
      }

      /**
       * <code>required string value = 2;</code>
       */
      public java.lang.String getValue() {
        java.lang.Object ref = value_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            value_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>required string value = 2;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
      getValueBytes() {
        java.lang.Object ref = value_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b =
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          value_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>required string value = 2;</code>
       */
      public Builder setValue(
          java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        value_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required string value = 2;</code>
       */
      public Builder clearValue() {
        bitField0_ = (bitField0_ & ~0x00000002);
        value_ = getDefaultInstance().getValue();
        onChanged();
        return this;
      }

      /**
       * <code>required string value = 2;</code>
       */
      public Builder setValueBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        value_ = value;
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.ConfigPair)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.ConfigPair)
    private static final org.apache.hadoop.tracing.TraceAdminPB.ConfigPair DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.tracing.TraceAdminPB.ConfigPair();
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.ConfigPair getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final org.apache.hadoop.thirdparty.protobuf.Parser<ConfigPair>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<ConfigPair>() {
      @java.lang.Override
      public ConfigPair parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new ConfigPair(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<ConfigPair> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<ConfigPair> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.tracing.TraceAdminPB.ConfigPair getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface AddSpanReceiverRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.AddSpanReceiverRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required string className = 1;</code>
     */
    boolean hasClassName();

    /**
     * <code>required string className = 1;</code>
     */
    java.lang.String getClassName();

    /**
     * <code>required string className = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
    getClassNameBytes();

    /**
     * <code>repeated .hadoop.common.ConfigPair config = 2;</code>
     */
    java.util.List<org.apache.hadoop.tracing.TraceAdminPB.ConfigPair>
    getConfigList();

    /**
     * <code>repeated .hadoop.common.ConfigPair config = 2;</code>
     */
    org.apache.hadoop.tracing.TraceAdminPB.ConfigPair getConfig(int index);

    /**
     * <code>repeated .hadoop.common.ConfigPair config = 2;</code>
     */
    int getConfigCount();

    /**
     * <code>repeated .hadoop.common.ConfigPair config = 2;</code>
     */
    java.util.List<? extends org.apache.hadoop.tracing.TraceAdminPB.ConfigPairOrBuilder>
    getConfigOrBuilderList();

    /**
     * <code>repeated .hadoop.common.ConfigPair config = 2;</code>
     */
    org.apache.hadoop.tracing.TraceAdminPB.ConfigPairOrBuilder getConfigOrBuilder(
        int index);
  }

  /**
   * Protobuf type {@code hadoop.common.AddSpanReceiverRequestProto}
   */
  public static final class AddSpanReceiverRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.AddSpanReceiverRequestProto)
      AddSpanReceiverRequestProtoOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use AddSpanReceiverRequestProto.newBuilder() to construct.
    private AddSpanReceiverRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private AddSpanReceiverRequestProto() {
      className_ = "";
      config_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    private AddSpanReceiverRequestProto(
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
              className_ = bs;
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                config_ = new java.util.ArrayList<org.apache.hadoop.tracing.TraceAdminPB.ConfigPair>();
                mutable_bitField0_ |= 0x00000002;
              }
              config_.add(
                  input.readMessage(org.apache.hadoop.tracing.TraceAdminPB.ConfigPair.PARSER, extensionRegistry));
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
          config_ = java.util.Collections.unmodifiableList(config_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_AddSpanReceiverRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_AddSpanReceiverRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto.class, org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto.Builder.class);
    }

    private int bitField0_;
    public static final int CLASSNAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object className_;

    /**
     * <code>required string className = 1;</code>
     */
    public boolean hasClassName() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>required string className = 1;</code>
     */
    public java.lang.String getClassName() {
      java.lang.Object ref = className_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs =
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          className_ = s;
        }
        return s;
      }
    }

    /**
     * <code>required string className = 1;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
    getClassNameBytes() {
      java.lang.Object ref = className_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b =
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        className_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int CONFIG_FIELD_NUMBER = 2;
    private java.util.List<org.apache.hadoop.tracing.TraceAdminPB.ConfigPair> config_;

    /**
     * <code>repeated .hadoop.common.ConfigPair config = 2;</code>
     */
    public java.util.List<org.apache.hadoop.tracing.TraceAdminPB.ConfigPair> getConfigList() {
      return config_;
    }

    /**
     * <code>repeated .hadoop.common.ConfigPair config = 2;</code>
     */
    public java.util.List<? extends org.apache.hadoop.tracing.TraceAdminPB.ConfigPairOrBuilder>
    getConfigOrBuilderList() {
      return config_;
    }

    /**
     * <code>repeated .hadoop.common.ConfigPair config = 2;</code>
     */
    public int getConfigCount() {
      return config_.size();
    }

    /**
     * <code>repeated .hadoop.common.ConfigPair config = 2;</code>
     */
    public org.apache.hadoop.tracing.TraceAdminPB.ConfigPair getConfig(int index) {
      return config_.get(index);
    }

    /**
     * <code>repeated .hadoop.common.ConfigPair config = 2;</code>
     */
    public org.apache.hadoop.tracing.TraceAdminPB.ConfigPairOrBuilder getConfigOrBuilder(
        int index) {
      return config_.get(index);
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasClassName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getConfigCount(); i++) {
        if (!getConfig(i).isInitialized()) {
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, className_);
      }
      for (int i = 0; i < config_.size(); i++) {
        output.writeMessage(2, config_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, className_);
      }
      for (int i = 0; i < config_.size(); i++) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
            .computeMessageSize(2, config_.get(i));
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
      if (!(obj instanceof org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto other = (org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto) obj;

      if (hasClassName() != other.hasClassName()) return false;
      if (hasClassName()) {
        if (!getClassName()
            .equals(other.getClassName())) return false;
      }
      if (!getConfigList()
          .equals(other.getConfigList())) return false;
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
      if (hasClassName()) {
        hash = (37 * hash) + CLASSNAME_FIELD_NUMBER;
        hash = (53 * hash) + getClassName().hashCode();
      }
      if (getConfigCount() > 0) {
        hash = (37 * hash) + CONFIG_FIELD_NUMBER;
        hash = (53 * hash) + getConfigList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto parseFrom(
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

    public static Builder newBuilder(org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto prototype) {
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
     * Protobuf type {@code hadoop.common.AddSpanReceiverRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.AddSpanReceiverRequestProto)
        org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_AddSpanReceiverRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_AddSpanReceiverRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto.class, org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto.newBuilder()
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
          getConfigFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        className_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (configBuilder_ == null) {
          config_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          configBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_AddSpanReceiverRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto build() {
        org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto buildPartial() {
        org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto result = new org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.className_ = className_;
        if (configBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            config_ = java.util.Collections.unmodifiableList(config_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.config_ = config_;
        } else {
          result.config_ = configBuilder_.build();
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
        if (other instanceof org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto) {
          return mergeFrom((org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto other) {
        if (other == org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto.getDefaultInstance())
          return this;
        if (other.hasClassName()) {
          bitField0_ |= 0x00000001;
          className_ = other.className_;
          onChanged();
        }
        if (configBuilder_ == null) {
          if (!other.config_.isEmpty()) {
            if (config_.isEmpty()) {
              config_ = other.config_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureConfigIsMutable();
              config_.addAll(other.config_);
            }
            onChanged();
          }
        } else {
          if (!other.config_.isEmpty()) {
            if (configBuilder_.isEmpty()) {
              configBuilder_.dispose();
              configBuilder_ = null;
              config_ = other.config_;
              bitField0_ = (bitField0_ & ~0x00000002);
              configBuilder_ =
                  org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                      getConfigFieldBuilder() : null;
            } else {
              configBuilder_.addAllMessages(other.config_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasClassName()) {
          return false;
        }
        for (int i = 0; i < getConfigCount(); i++) {
          if (!getConfig(i).isInitialized()) {
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
        org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object className_ = "";

      /**
       * <code>required string className = 1;</code>
       */
      public boolean hasClassName() {
        return ((bitField0_ & 0x00000001) != 0);
      }

      /**
       * <code>required string className = 1;</code>
       */
      public java.lang.String getClassName() {
        java.lang.Object ref = className_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            className_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>required string className = 1;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
      getClassNameBytes() {
        java.lang.Object ref = className_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b =
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          className_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>required string className = 1;</code>
       */
      public Builder setClassName(
          java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        className_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required string className = 1;</code>
       */
      public Builder clearClassName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        className_ = getDefaultInstance().getClassName();
        onChanged();
        return this;
      }

      /**
       * <code>required string className = 1;</code>
       */
      public Builder setClassNameBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        className_ = value;
        onChanged();
        return this;
      }

      private java.util.List<org.apache.hadoop.tracing.TraceAdminPB.ConfigPair> config_ =
          java.util.Collections.emptyList();

      private void ensureConfigIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          config_ = new java.util.ArrayList<org.apache.hadoop.tracing.TraceAdminPB.ConfigPair>(config_);
          bitField0_ |= 0x00000002;
        }
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.tracing.TraceAdminPB.ConfigPair, org.apache.hadoop.tracing.TraceAdminPB.ConfigPair.Builder, org.apache.hadoop.tracing.TraceAdminPB.ConfigPairOrBuilder> configBuilder_;

      /**
       * <code>repeated .hadoop.common.ConfigPair config = 2;</code>
       */
      public java.util.List<org.apache.hadoop.tracing.TraceAdminPB.ConfigPair> getConfigList() {
        if (configBuilder_ == null) {
          return java.util.Collections.unmodifiableList(config_);
        } else {
          return configBuilder_.getMessageList();
        }
      }

      /**
       * <code>repeated .hadoop.common.ConfigPair config = 2;</code>
       */
      public int getConfigCount() {
        if (configBuilder_ == null) {
          return config_.size();
        } else {
          return configBuilder_.getCount();
        }
      }

      /**
       * <code>repeated .hadoop.common.ConfigPair config = 2;</code>
       */
      public org.apache.hadoop.tracing.TraceAdminPB.ConfigPair getConfig(int index) {
        if (configBuilder_ == null) {
          return config_.get(index);
        } else {
          return configBuilder_.getMessage(index);
        }
      }

      /**
       * <code>repeated .hadoop.common.ConfigPair config = 2;</code>
       */
      public Builder setConfig(
          int index, org.apache.hadoop.tracing.TraceAdminPB.ConfigPair value) {
        if (configBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureConfigIsMutable();
          config_.set(index, value);
          onChanged();
        } else {
          configBuilder_.setMessage(index, value);
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.ConfigPair config = 2;</code>
       */
      public Builder setConfig(
          int index, org.apache.hadoop.tracing.TraceAdminPB.ConfigPair.Builder builderForValue) {
        if (configBuilder_ == null) {
          ensureConfigIsMutable();
          config_.set(index, builderForValue.build());
          onChanged();
        } else {
          configBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.ConfigPair config = 2;</code>
       */
      public Builder addConfig(org.apache.hadoop.tracing.TraceAdminPB.ConfigPair value) {
        if (configBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureConfigIsMutable();
          config_.add(value);
          onChanged();
        } else {
          configBuilder_.addMessage(value);
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.ConfigPair config = 2;</code>
       */
      public Builder addConfig(
          int index, org.apache.hadoop.tracing.TraceAdminPB.ConfigPair value) {
        if (configBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureConfigIsMutable();
          config_.add(index, value);
          onChanged();
        } else {
          configBuilder_.addMessage(index, value);
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.ConfigPair config = 2;</code>
       */
      public Builder addConfig(
          org.apache.hadoop.tracing.TraceAdminPB.ConfigPair.Builder builderForValue) {
        if (configBuilder_ == null) {
          ensureConfigIsMutable();
          config_.add(builderForValue.build());
          onChanged();
        } else {
          configBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.ConfigPair config = 2;</code>
       */
      public Builder addConfig(
          int index, org.apache.hadoop.tracing.TraceAdminPB.ConfigPair.Builder builderForValue) {
        if (configBuilder_ == null) {
          ensureConfigIsMutable();
          config_.add(index, builderForValue.build());
          onChanged();
        } else {
          configBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.ConfigPair config = 2;</code>
       */
      public Builder addAllConfig(
          java.lang.Iterable<? extends org.apache.hadoop.tracing.TraceAdminPB.ConfigPair> values) {
        if (configBuilder_ == null) {
          ensureConfigIsMutable();
          org.apache.hadoop.thirdparty.protobuf.AbstractMessageLite.Builder.addAll(
              values, config_);
          onChanged();
        } else {
          configBuilder_.addAllMessages(values);
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.ConfigPair config = 2;</code>
       */
      public Builder clearConfig() {
        if (configBuilder_ == null) {
          config_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          configBuilder_.clear();
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.ConfigPair config = 2;</code>
       */
      public Builder removeConfig(int index) {
        if (configBuilder_ == null) {
          ensureConfigIsMutable();
          config_.remove(index);
          onChanged();
        } else {
          configBuilder_.remove(index);
        }
        return this;
      }

      /**
       * <code>repeated .hadoop.common.ConfigPair config = 2;</code>
       */
      public org.apache.hadoop.tracing.TraceAdminPB.ConfigPair.Builder getConfigBuilder(
          int index) {
        return getConfigFieldBuilder().getBuilder(index);
      }

      /**
       * <code>repeated .hadoop.common.ConfigPair config = 2;</code>
       */
      public org.apache.hadoop.tracing.TraceAdminPB.ConfigPairOrBuilder getConfigOrBuilder(
          int index) {
        if (configBuilder_ == null) {
          return config_.get(index);
        } else {
          return configBuilder_.getMessageOrBuilder(index);
        }
      }

      /**
       * <code>repeated .hadoop.common.ConfigPair config = 2;</code>
       */
      public java.util.List<? extends org.apache.hadoop.tracing.TraceAdminPB.ConfigPairOrBuilder>
      getConfigOrBuilderList() {
        if (configBuilder_ != null) {
          return configBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(config_);
        }
      }

      /**
       * <code>repeated .hadoop.common.ConfigPair config = 2;</code>
       */
      public org.apache.hadoop.tracing.TraceAdminPB.ConfigPair.Builder addConfigBuilder() {
        return getConfigFieldBuilder().addBuilder(
            org.apache.hadoop.tracing.TraceAdminPB.ConfigPair.getDefaultInstance());
      }

      /**
       * <code>repeated .hadoop.common.ConfigPair config = 2;</code>
       */
      public org.apache.hadoop.tracing.TraceAdminPB.ConfigPair.Builder addConfigBuilder(
          int index) {
        return getConfigFieldBuilder().addBuilder(
            index, org.apache.hadoop.tracing.TraceAdminPB.ConfigPair.getDefaultInstance());
      }

      /**
       * <code>repeated .hadoop.common.ConfigPair config = 2;</code>
       */
      public java.util.List<org.apache.hadoop.tracing.TraceAdminPB.ConfigPair.Builder>
      getConfigBuilderList() {
        return getConfigFieldBuilder().getBuilderList();
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.tracing.TraceAdminPB.ConfigPair, org.apache.hadoop.tracing.TraceAdminPB.ConfigPair.Builder, org.apache.hadoop.tracing.TraceAdminPB.ConfigPairOrBuilder>
      getConfigFieldBuilder() {
        if (configBuilder_ == null) {
          configBuilder_ = new org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
              org.apache.hadoop.tracing.TraceAdminPB.ConfigPair, org.apache.hadoop.tracing.TraceAdminPB.ConfigPair.Builder, org.apache.hadoop.tracing.TraceAdminPB.ConfigPairOrBuilder>(
              config_,
              ((bitField0_ & 0x00000002) != 0),
              getParentForChildren(),
              isClean());
          config_ = null;
        }
        return configBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.AddSpanReceiverRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.AddSpanReceiverRequestProto)
    private static final org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto();
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final org.apache.hadoop.thirdparty.protobuf.Parser<AddSpanReceiverRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<AddSpanReceiverRequestProto>() {
      @java.lang.Override
      public AddSpanReceiverRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new AddSpanReceiverRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<AddSpanReceiverRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<AddSpanReceiverRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface AddSpanReceiverResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.AddSpanReceiverResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required int64 id = 1;</code>
     */
    boolean hasId();

    /**
     * <code>required int64 id = 1;</code>
     */
    long getId();
  }

  /**
   * Protobuf type {@code hadoop.common.AddSpanReceiverResponseProto}
   */
  public static final class AddSpanReceiverResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.AddSpanReceiverResponseProto)
      AddSpanReceiverResponseProtoOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use AddSpanReceiverResponseProto.newBuilder() to construct.
    private AddSpanReceiverResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private AddSpanReceiverResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    private AddSpanReceiverResponseProto(
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
              id_ = input.readInt64();
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
      return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_AddSpanReceiverResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_AddSpanReceiverResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto.class, org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto.Builder.class);
    }

    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 1;
    private long id_;

    /**
     * <code>required int64 id = 1;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>required int64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasId()) {
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
        output.writeInt64(1, id_);
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
            .computeInt64Size(1, id_);
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
      if (!(obj instanceof org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto other = (org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto) obj;

      if (hasId() != other.hasId()) return false;
      if (hasId()) {
        if (getId()
            != other.getId()) return false;
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
      if (hasId()) {
        hash = (37 * hash) + ID_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getId());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto parseFrom(
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

    public static Builder newBuilder(org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto prototype) {
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
     * Protobuf type {@code hadoop.common.AddSpanReceiverResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.AddSpanReceiverResponseProto)
        org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_AddSpanReceiverResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_AddSpanReceiverResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto.class, org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto.newBuilder()
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
        id_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_AddSpanReceiverResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto build() {
        org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto buildPartial() {
        org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto result = new org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.id_ = id_;
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
        if (other instanceof org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto) {
          return mergeFrom((org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto other) {
        if (other == org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto.getDefaultInstance())
          return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasId()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private long id_;

      /**
       * <code>required int64 id = 1;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) != 0);
      }

      /**
       * <code>required int64 id = 1;</code>
       */
      public long getId() {
        return id_;
      }

      /**
       * <code>required int64 id = 1;</code>
       */
      public Builder setId(long value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required int64 id = 1;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.AddSpanReceiverResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.AddSpanReceiverResponseProto)
    private static final org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto();
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final org.apache.hadoop.thirdparty.protobuf.Parser<AddSpanReceiverResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<AddSpanReceiverResponseProto>() {
      @java.lang.Override
      public AddSpanReceiverResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new AddSpanReceiverResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<AddSpanReceiverResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<AddSpanReceiverResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RemoveSpanReceiverRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.RemoveSpanReceiverRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required int64 id = 1;</code>
     */
    boolean hasId();

    /**
     * <code>required int64 id = 1;</code>
     */
    long getId();
  }

  /**
   * Protobuf type {@code hadoop.common.RemoveSpanReceiverRequestProto}
   */
  public static final class RemoveSpanReceiverRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.RemoveSpanReceiverRequestProto)
      RemoveSpanReceiverRequestProtoOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use RemoveSpanReceiverRequestProto.newBuilder() to construct.
    private RemoveSpanReceiverRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private RemoveSpanReceiverRequestProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    private RemoveSpanReceiverRequestProto(
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
              id_ = input.readInt64();
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
      return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_RemoveSpanReceiverRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_RemoveSpanReceiverRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto.class, org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto.Builder.class);
    }

    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 1;
    private long id_;

    /**
     * <code>required int64 id = 1;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>required int64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasId()) {
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
        output.writeInt64(1, id_);
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
            .computeInt64Size(1, id_);
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
      if (!(obj instanceof org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto other = (org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto) obj;

      if (hasId() != other.hasId()) return false;
      if (hasId()) {
        if (getId()
            != other.getId()) return false;
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
      if (hasId()) {
        hash = (37 * hash) + ID_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getId());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto parseFrom(
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

    public static Builder newBuilder(org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto prototype) {
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
     * Protobuf type {@code hadoop.common.RemoveSpanReceiverRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.RemoveSpanReceiverRequestProto)
        org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_RemoveSpanReceiverRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_RemoveSpanReceiverRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto.class, org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto.newBuilder()
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
        id_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_RemoveSpanReceiverRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto build() {
        org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto buildPartial() {
        org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto result = new org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.id_ = id_;
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
        if (other instanceof org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto) {
          return mergeFrom((org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto other) {
        if (other == org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto.getDefaultInstance())
          return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasId()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private long id_;

      /**
       * <code>required int64 id = 1;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) != 0);
      }

      /**
       * <code>required int64 id = 1;</code>
       */
      public long getId() {
        return id_;
      }

      /**
       * <code>required int64 id = 1;</code>
       */
      public Builder setId(long value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required int64 id = 1;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.RemoveSpanReceiverRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.RemoveSpanReceiverRequestProto)
    private static final org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto();
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final org.apache.hadoop.thirdparty.protobuf.Parser<RemoveSpanReceiverRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<RemoveSpanReceiverRequestProto>() {
      @java.lang.Override
      public RemoveSpanReceiverRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new RemoveSpanReceiverRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<RemoveSpanReceiverRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<RemoveSpanReceiverRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RemoveSpanReceiverResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.RemoveSpanReceiverResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }

  /**
   * Protobuf type {@code hadoop.common.RemoveSpanReceiverResponseProto}
   */
  public static final class RemoveSpanReceiverResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.RemoveSpanReceiverResponseProto)
      RemoveSpanReceiverResponseProtoOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use RemoveSpanReceiverResponseProto.newBuilder() to construct.
    private RemoveSpanReceiverResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private RemoveSpanReceiverResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }

    private RemoveSpanReceiverResponseProto(
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
      return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_RemoveSpanReceiverResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_RemoveSpanReceiverResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto.class, org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto.Builder.class);
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
      if (!(obj instanceof org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto other = (org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto) obj;

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

    public static org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto parseFrom(
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

    public static Builder newBuilder(org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto prototype) {
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
     * Protobuf type {@code hadoop.common.RemoveSpanReceiverResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.RemoveSpanReceiverResponseProto)
        org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_RemoveSpanReceiverResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_RemoveSpanReceiverResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto.class, org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto.newBuilder()
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
        return org.apache.hadoop.tracing.TraceAdminPB.internal_static_hadoop_common_RemoveSpanReceiverResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto build() {
        org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto buildPartial() {
        org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto result = new org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto(this);
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
        if (other instanceof org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto) {
          return mergeFrom((org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto other) {
        if (other == org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto.getDefaultInstance())
          return this;
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
        org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto) e.getUnfinishedMessage();
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.RemoveSpanReceiverResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.RemoveSpanReceiverResponseProto)
    private static final org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto();
    }

    public static org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final org.apache.hadoop.thirdparty.protobuf.Parser<RemoveSpanReceiverResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<RemoveSpanReceiverResponseProto>() {
      @java.lang.Override
      public RemoveSpanReceiverResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new RemoveSpanReceiverResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<RemoveSpanReceiverResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<RemoveSpanReceiverResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  /**
   * Protobuf service {@code hadoop.common.TraceAdminService}
   */
  public static abstract class TraceAdminService
      implements org.apache.hadoop.thirdparty.protobuf.Service {
    protected TraceAdminService() {
    }

    public interface Interface {
      /**
       * <code>rpc listSpanReceivers(.hadoop.common.ListSpanReceiversRequestProto) returns (.hadoop.common.ListSpanReceiversResponseProto);</code>
       */
      public abstract void listSpanReceivers(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto> done);

      /**
       * <code>rpc addSpanReceiver(.hadoop.common.AddSpanReceiverRequestProto) returns (.hadoop.common.AddSpanReceiverResponseProto);</code>
       */
      public abstract void addSpanReceiver(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto> done);

      /**
       * <code>rpc removeSpanReceiver(.hadoop.common.RemoveSpanReceiverRequestProto) returns (.hadoop.common.RemoveSpanReceiverResponseProto);</code>
       */
      public abstract void removeSpanReceiver(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto> done);

    }

    public static org.apache.hadoop.thirdparty.protobuf.Service newReflectiveService(
        final Interface impl) {
      return new TraceAdminService() {
        @java.lang.Override
        public void listSpanReceivers(
            org.apache.hadoop.thirdparty.protobuf.RpcController controller,
            org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto request,
            org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto> done) {
          impl.listSpanReceivers(controller, request, done);
        }

        @java.lang.Override
        public void addSpanReceiver(
            org.apache.hadoop.thirdparty.protobuf.RpcController controller,
            org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto request,
            org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto> done) {
          impl.addSpanReceiver(controller, request, done);
        }

        @java.lang.Override
        public void removeSpanReceiver(
            org.apache.hadoop.thirdparty.protobuf.RpcController controller,
            org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto request,
            org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto> done) {
          impl.removeSpanReceiver(controller, request, done);
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
              return impl.listSpanReceivers(controller, (org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto) request);
            case 1:
              return impl.addSpanReceiver(controller, (org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto) request);
            case 2:
              return impl.removeSpanReceiver(controller, (org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto) request);
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
              return org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto.getDefaultInstance();
            case 1:
              return org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto.getDefaultInstance();
            case 2:
              return org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto.getDefaultInstance();
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
              return org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto.getDefaultInstance();
            case 1:
              return org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto.getDefaultInstance();
            case 2:
              return org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

      };
    }

    /**
     * <code>rpc listSpanReceivers(.hadoop.common.ListSpanReceiversRequestProto) returns (.hadoop.common.ListSpanReceiversResponseProto);</code>
     */
    public abstract void listSpanReceivers(
        org.apache.hadoop.thirdparty.protobuf.RpcController controller,
        org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto request,
        org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto> done);

    /**
     * <code>rpc addSpanReceiver(.hadoop.common.AddSpanReceiverRequestProto) returns (.hadoop.common.AddSpanReceiverResponseProto);</code>
     */
    public abstract void addSpanReceiver(
        org.apache.hadoop.thirdparty.protobuf.RpcController controller,
        org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto request,
        org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto> done);

    /**
     * <code>rpc removeSpanReceiver(.hadoop.common.RemoveSpanReceiverRequestProto) returns (.hadoop.common.RemoveSpanReceiverResponseProto);</code>
     */
    public abstract void removeSpanReceiver(
        org.apache.hadoop.thirdparty.protobuf.RpcController controller,
        org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto request,
        org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto> done);

    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.ServiceDescriptor
    getDescriptor() {
      return org.apache.hadoop.tracing.TraceAdminPB.getDescriptor().getServices().get(0);
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
          this.listSpanReceivers(controller, (org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto) request,
              org.apache.hadoop.thirdparty.protobuf.RpcUtil.<org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto>specializeCallback(
                  done));
          return;
        case 1:
          this.addSpanReceiver(controller, (org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto) request,
              org.apache.hadoop.thirdparty.protobuf.RpcUtil.<org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto>specializeCallback(
                  done));
          return;
        case 2:
          this.removeSpanReceiver(controller, (org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto) request,
              org.apache.hadoop.thirdparty.protobuf.RpcUtil.<org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto>specializeCallback(
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
          return org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto.getDefaultInstance();
        case 1:
          return org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto.getDefaultInstance();
        case 2:
          return org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto.getDefaultInstance();
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
          return org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto.getDefaultInstance();
        case 1:
          return org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto.getDefaultInstance();
        case 2:
          return org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public static Stub newStub(
        org.apache.hadoop.thirdparty.protobuf.RpcChannel channel) {
      return new Stub(channel);
    }

    public static final class Stub extends org.apache.hadoop.tracing.TraceAdminPB.TraceAdminService implements Interface {
      private Stub(org.apache.hadoop.thirdparty.protobuf.RpcChannel channel) {
        this.channel = channel;
      }

      private final org.apache.hadoop.thirdparty.protobuf.RpcChannel channel;

      public org.apache.hadoop.thirdparty.protobuf.RpcChannel getChannel() {
        return channel;
      }

      public void listSpanReceivers(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto> done) {
        channel.callMethod(
            getDescriptor().getMethods().get(0),
            controller,
            request,
            org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto.getDefaultInstance(),
            org.apache.hadoop.thirdparty.protobuf.RpcUtil.generalizeCallback(
                done,
                org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto.class,
                org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto.getDefaultInstance()));
      }

      public void addSpanReceiver(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto> done) {
        channel.callMethod(
            getDescriptor().getMethods().get(1),
            controller,
            request,
            org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto.getDefaultInstance(),
            org.apache.hadoop.thirdparty.protobuf.RpcUtil.generalizeCallback(
                done,
                org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto.class,
                org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto.getDefaultInstance()));
      }

      public void removeSpanReceiver(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto> done) {
        channel.callMethod(
            getDescriptor().getMethods().get(2),
            controller,
            request,
            org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto.getDefaultInstance(),
            org.apache.hadoop.thirdparty.protobuf.RpcUtil.generalizeCallback(
                done,
                org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto.class,
                org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto.getDefaultInstance()));
      }
    }

    public static BlockingInterface newBlockingStub(
        org.apache.hadoop.thirdparty.protobuf.BlockingRpcChannel channel) {
      return new BlockingStub(channel);
    }

    public interface BlockingInterface {
      public org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto listSpanReceivers(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException;

      public org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto addSpanReceiver(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException;

      public org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto removeSpanReceiver(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException;
    }

    private static final class BlockingStub implements BlockingInterface {
      private BlockingStub(org.apache.hadoop.thirdparty.protobuf.BlockingRpcChannel channel) {
        this.channel = channel;
      }

      private final org.apache.hadoop.thirdparty.protobuf.BlockingRpcChannel channel;

      public org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto listSpanReceivers(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException {
        return (org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto) channel.callBlockingMethod(
            getDescriptor().getMethods().get(0),
            controller,
            request,
            org.apache.hadoop.tracing.TraceAdminPB.ListSpanReceiversResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto addSpanReceiver(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException {
        return (org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto) channel.callBlockingMethod(
            getDescriptor().getMethods().get(1),
            controller,
            request,
            org.apache.hadoop.tracing.TraceAdminPB.AddSpanReceiverResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto removeSpanReceiver(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException {
        return (org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto) channel.callBlockingMethod(
            getDescriptor().getMethods().get(2),
            controller,
            request,
            org.apache.hadoop.tracing.TraceAdminPB.RemoveSpanReceiverResponseProto.getDefaultInstance());
      }

    }

    // @@protoc_insertion_point(class_scope:hadoop.common.TraceAdminService)
  }

  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      internal_static_hadoop_common_ListSpanReceiversRequestProto_descriptor;
  private static final
  org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_ListSpanReceiversRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      internal_static_hadoop_common_SpanReceiverListInfo_descriptor;
  private static final
  org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_SpanReceiverListInfo_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      internal_static_hadoop_common_ListSpanReceiversResponseProto_descriptor;
  private static final
  org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_ListSpanReceiversResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      internal_static_hadoop_common_ConfigPair_descriptor;
  private static final
  org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_ConfigPair_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      internal_static_hadoop_common_AddSpanReceiverRequestProto_descriptor;
  private static final
  org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_AddSpanReceiverRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      internal_static_hadoop_common_AddSpanReceiverResponseProto_descriptor;
  private static final
  org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_AddSpanReceiverResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      internal_static_hadoop_common_RemoveSpanReceiverRequestProto_descriptor;
  private static final
  org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_RemoveSpanReceiverRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
      internal_static_hadoop_common_RemoveSpanReceiverResponseProto_descriptor;
  private static final
  org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_RemoveSpanReceiverResponseProto_fieldAccessorTable;

  public static org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
  getDescriptor() {
    return descriptor;
  }

  private static org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      descriptor;

  static {
    java.lang.String[] descriptorData = {
        "\n\020TraceAdmin.proto\022\rhadoop.common\"\037\n\035Lis" +
            "tSpanReceiversRequestProto\"5\n\024SpanReceiv" +
            "erListInfo\022\n\n\002id\030\001 \002(\003\022\021\n\tclassName\030\002 \002(" +
            "\t\"[\n\036ListSpanReceiversResponseProto\0229\n\014d" +
            "escriptions\030\001 \003(\0132#.hadoop.common.SpanRe" +
            "ceiverListInfo\"(\n\nConfigPair\022\013\n\003key\030\001 \002(" +
            "\t\022\r\n\005value\030\002 \002(\t\"[\n\033AddSpanReceiverReque" +
            "stProto\022\021\n\tclassName\030\001 \002(\t\022)\n\006config\030\002 \003" +
            "(\0132\031.hadoop.common.ConfigPair\"*\n\034AddSpan" +
            "ReceiverResponseProto\022\n\n\002id\030\001 \002(\003\",\n\036Rem" +
            "oveSpanReceiverRequestProto\022\n\n\002id\030\001 \002(\003\"" +
            "!\n\037RemoveSpanReceiverResponseProto2\346\002\n\021T" +
            "raceAdminService\022p\n\021listSpanReceivers\022,." +
            "hadoop.common.ListSpanReceiversRequestPr" +
            "oto\032-.hadoop.common.ListSpanReceiversRes" +
            "ponseProto\022j\n\017addSpanReceiver\022*.hadoop.c" +
            "ommon.AddSpanReceiverRequestProto\032+.hado" +
            "op.common.AddSpanReceiverResponseProto\022s" +
            "\n\022removeSpanReceiver\022-.hadoop.common.Rem" +
            "oveSpanReceiverRequestProto\032..hadoop.com" +
            "mon.RemoveSpanReceiverResponseProtoB/\n\031o" +
            "rg.apache.hadoop.tracingB\014TraceAdminPB\210\001" +
            "\001\240\001\001"
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
    internal_static_hadoop_common_ListSpanReceiversRequestProto_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_hadoop_common_ListSpanReceiversRequestProto_fieldAccessorTable = new
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_ListSpanReceiversRequestProto_descriptor,
        new java.lang.String[]{});
    internal_static_hadoop_common_SpanReceiverListInfo_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_hadoop_common_SpanReceiverListInfo_fieldAccessorTable = new
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_SpanReceiverListInfo_descriptor,
        new java.lang.String[]{"Id", "ClassName",});
    internal_static_hadoop_common_ListSpanReceiversResponseProto_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_hadoop_common_ListSpanReceiversResponseProto_fieldAccessorTable = new
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_ListSpanReceiversResponseProto_descriptor,
        new java.lang.String[]{"Descriptions",});
    internal_static_hadoop_common_ConfigPair_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_hadoop_common_ConfigPair_fieldAccessorTable = new
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_ConfigPair_descriptor,
        new java.lang.String[]{"Key", "Value",});
    internal_static_hadoop_common_AddSpanReceiverRequestProto_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_hadoop_common_AddSpanReceiverRequestProto_fieldAccessorTable = new
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_AddSpanReceiverRequestProto_descriptor,
        new java.lang.String[]{"ClassName", "Config",});
    internal_static_hadoop_common_AddSpanReceiverResponseProto_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_hadoop_common_AddSpanReceiverResponseProto_fieldAccessorTable = new
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_AddSpanReceiverResponseProto_descriptor,
        new java.lang.String[]{"Id",});
    internal_static_hadoop_common_RemoveSpanReceiverRequestProto_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_hadoop_common_RemoveSpanReceiverRequestProto_fieldAccessorTable = new
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_RemoveSpanReceiverRequestProto_descriptor,
        new java.lang.String[]{"Id",});
    internal_static_hadoop_common_RemoveSpanReceiverResponseProto_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_hadoop_common_RemoveSpanReceiverResponseProto_fieldAccessorTable = new
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_RemoveSpanReceiverResponseProto_descriptor,
        new java.lang.String[]{});
  }

  // @@protoc_insertion_point(outer_class_scope)
}
