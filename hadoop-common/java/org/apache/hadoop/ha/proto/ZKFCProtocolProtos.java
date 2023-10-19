// source: ZKFCProtocol.proto

package org.apache.hadoop.ha.proto;

public final class ZKFCProtocolProtos {
  private ZKFCProtocolProtos() {}
  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CedeActiveRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.CedeActiveRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required uint32 millisToCede = 1;</code>
     */
    boolean hasMillisToCede();
    /**
     * <code>required uint32 millisToCede = 1;</code>
     */
    int getMillisToCede();
  }
  /**
   * Protobuf type {@code hadoop.common.CedeActiveRequestProto}
   */
  public  static final class CedeActiveRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.CedeActiveRequestProto)
      CedeActiveRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CedeActiveRequestProto.newBuilder() to construct.
    private CedeActiveRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CedeActiveRequestProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CedeActiveRequestProto(
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
              millisToCede_ = input.readUInt32();
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
      return org.apache.hadoop.ha.proto.ZKFCProtocolProtos.internal_static_hadoop_common_CedeActiveRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.ha.proto.ZKFCProtocolProtos.internal_static_hadoop_common_CedeActiveRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto.class, org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto.Builder.class);
    }

    private int bitField0_;
    public static final int MILLISTOCEDE_FIELD_NUMBER = 1;
    private int millisToCede_;
    /**
     * <code>required uint32 millisToCede = 1;</code>
     */
    public boolean hasMillisToCede() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required uint32 millisToCede = 1;</code>
     */
    public int getMillisToCede() {
      return millisToCede_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasMillisToCede()) {
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
        output.writeUInt32(1, millisToCede_);
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
          .computeUInt32Size(1, millisToCede_);
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
      if (!(obj instanceof org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto other = (org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto) obj;

      if (hasMillisToCede() != other.hasMillisToCede()) return false;
      if (hasMillisToCede()) {
        if (getMillisToCede()
            != other.getMillisToCede()) return false;
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
      if (hasMillisToCede()) {
        hash = (37 * hash) + MILLISTOCEDE_FIELD_NUMBER;
        hash = (53 * hash) + getMillisToCede();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto prototype) {
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
     * Protobuf type {@code hadoop.common.CedeActiveRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.CedeActiveRequestProto)
        org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.ha.proto.ZKFCProtocolProtos.internal_static_hadoop_common_CedeActiveRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.ha.proto.ZKFCProtocolProtos.internal_static_hadoop_common_CedeActiveRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto.class, org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto.newBuilder()
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
        millisToCede_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.ha.proto.ZKFCProtocolProtos.internal_static_hadoop_common_CedeActiveRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto build() {
        org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto buildPartial() {
        org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto result = new org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.millisToCede_ = millisToCede_;
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
        if (other instanceof org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto) {
          return mergeFrom((org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto other) {
        if (other == org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto.getDefaultInstance()) return this;
        if (other.hasMillisToCede()) {
          setMillisToCede(other.getMillisToCede());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasMillisToCede()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int millisToCede_ ;
      /**
       * <code>required uint32 millisToCede = 1;</code>
       */
      public boolean hasMillisToCede() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required uint32 millisToCede = 1;</code>
       */
      public int getMillisToCede() {
        return millisToCede_;
      }
      /**
       * <code>required uint32 millisToCede = 1;</code>
       */
      public Builder setMillisToCede(int value) {
        bitField0_ |= 0x00000001;
        millisToCede_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 millisToCede = 1;</code>
       */
      public Builder clearMillisToCede() {
        bitField0_ = (bitField0_ & ~0x00000001);
        millisToCede_ = 0;
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.CedeActiveRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.CedeActiveRequestProto)
    private static final org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto();
    }

    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<CedeActiveRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<CedeActiveRequestProto>() {
      @java.lang.Override
      public CedeActiveRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new CedeActiveRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<CedeActiveRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<CedeActiveRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CedeActiveResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.CedeActiveResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.common.CedeActiveResponseProto}
   */
  public  static final class CedeActiveResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.CedeActiveResponseProto)
      CedeActiveResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CedeActiveResponseProto.newBuilder() to construct.
    private CedeActiveResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CedeActiveResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CedeActiveResponseProto(
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
      return org.apache.hadoop.ha.proto.ZKFCProtocolProtos.internal_static_hadoop_common_CedeActiveResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.ha.proto.ZKFCProtocolProtos.internal_static_hadoop_common_CedeActiveResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto.class, org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto.Builder.class);
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
      if (!(obj instanceof org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto other = (org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto) obj;

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

    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto prototype) {
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
     * Protobuf type {@code hadoop.common.CedeActiveResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.CedeActiveResponseProto)
        org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.ha.proto.ZKFCProtocolProtos.internal_static_hadoop_common_CedeActiveResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.ha.proto.ZKFCProtocolProtos.internal_static_hadoop_common_CedeActiveResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto.class, org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto.newBuilder()
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
        return org.apache.hadoop.ha.proto.ZKFCProtocolProtos.internal_static_hadoop_common_CedeActiveResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto build() {
        org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto buildPartial() {
        org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto result = new org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto(this);
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
        if (other instanceof org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto) {
          return mergeFrom((org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto other) {
        if (other == org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto) e.getUnfinishedMessage();
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.CedeActiveResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.CedeActiveResponseProto)
    private static final org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto();
    }

    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<CedeActiveResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<CedeActiveResponseProto>() {
      @java.lang.Override
      public CedeActiveResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new CedeActiveResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<CedeActiveResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<CedeActiveResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GracefulFailoverRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.GracefulFailoverRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.common.GracefulFailoverRequestProto}
   */
  public  static final class GracefulFailoverRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.GracefulFailoverRequestProto)
      GracefulFailoverRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GracefulFailoverRequestProto.newBuilder() to construct.
    private GracefulFailoverRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GracefulFailoverRequestProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GracefulFailoverRequestProto(
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
      return org.apache.hadoop.ha.proto.ZKFCProtocolProtos.internal_static_hadoop_common_GracefulFailoverRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.ha.proto.ZKFCProtocolProtos.internal_static_hadoop_common_GracefulFailoverRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto.class, org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto.Builder.class);
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
      if (!(obj instanceof org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto other = (org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto) obj;

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

    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto prototype) {
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
     * Protobuf type {@code hadoop.common.GracefulFailoverRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.GracefulFailoverRequestProto)
        org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.ha.proto.ZKFCProtocolProtos.internal_static_hadoop_common_GracefulFailoverRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.ha.proto.ZKFCProtocolProtos.internal_static_hadoop_common_GracefulFailoverRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto.class, org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto.newBuilder()
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
        return org.apache.hadoop.ha.proto.ZKFCProtocolProtos.internal_static_hadoop_common_GracefulFailoverRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto build() {
        org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto buildPartial() {
        org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto result = new org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto(this);
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
        if (other instanceof org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto) {
          return mergeFrom((org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto other) {
        if (other == org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto) e.getUnfinishedMessage();
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.GracefulFailoverRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.GracefulFailoverRequestProto)
    private static final org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto();
    }

    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<GracefulFailoverRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<GracefulFailoverRequestProto>() {
      @java.lang.Override
      public GracefulFailoverRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new GracefulFailoverRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<GracefulFailoverRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<GracefulFailoverRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GracefulFailoverResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.GracefulFailoverResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.common.GracefulFailoverResponseProto}
   */
  public  static final class GracefulFailoverResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.GracefulFailoverResponseProto)
      GracefulFailoverResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GracefulFailoverResponseProto.newBuilder() to construct.
    private GracefulFailoverResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GracefulFailoverResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GracefulFailoverResponseProto(
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
      return org.apache.hadoop.ha.proto.ZKFCProtocolProtos.internal_static_hadoop_common_GracefulFailoverResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.ha.proto.ZKFCProtocolProtos.internal_static_hadoop_common_GracefulFailoverResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto.class, org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto.Builder.class);
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
      if (!(obj instanceof org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto other = (org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto) obj;

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

    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto prototype) {
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
     * Protobuf type {@code hadoop.common.GracefulFailoverResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.GracefulFailoverResponseProto)
        org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.ha.proto.ZKFCProtocolProtos.internal_static_hadoop_common_GracefulFailoverResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.ha.proto.ZKFCProtocolProtos.internal_static_hadoop_common_GracefulFailoverResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto.class, org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto.newBuilder()
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
        return org.apache.hadoop.ha.proto.ZKFCProtocolProtos.internal_static_hadoop_common_GracefulFailoverResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto build() {
        org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto buildPartial() {
        org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto result = new org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto(this);
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
        if (other instanceof org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto) {
          return mergeFrom((org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto other) {
        if (other == org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto) e.getUnfinishedMessage();
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.GracefulFailoverResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.GracefulFailoverResponseProto)
    private static final org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto();
    }

    public static org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<GracefulFailoverResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<GracefulFailoverResponseProto>() {
      @java.lang.Override
      public GracefulFailoverResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new GracefulFailoverResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<GracefulFailoverResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<GracefulFailoverResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  /**
   * <pre>
   **
   * Protocol provides manual control of the ZK Failover Controllers
   * </pre>
   *
   * Protobuf service {@code hadoop.common.ZKFCProtocolService}
   */
  public static abstract class ZKFCProtocolService
      implements org.apache.hadoop.thirdparty.protobuf.Service {
    protected ZKFCProtocolService() {}

    public interface Interface {
      /**
       * <pre>
       **
       * Request that the service cede its active state, and quit the election
       * for some amount of time
       * </pre>
       *
       * <code>rpc cedeActive(.hadoop.common.CedeActiveRequestProto) returns (.hadoop.common.CedeActiveResponseProto);</code>
       */
      public abstract void cedeActive(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto> done);

      /**
       * <code>rpc gracefulFailover(.hadoop.common.GracefulFailoverRequestProto) returns (.hadoop.common.GracefulFailoverResponseProto);</code>
       */
      public abstract void gracefulFailover(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto> done);

    }

    public static org.apache.hadoop.thirdparty.protobuf.Service newReflectiveService(
        final Interface impl) {
      return new ZKFCProtocolService() {
        @java.lang.Override
        public  void cedeActive(
            org.apache.hadoop.thirdparty.protobuf.RpcController controller,
            org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto request,
            org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto> done) {
          impl.cedeActive(controller, request, done);
        }

        @java.lang.Override
        public  void gracefulFailover(
            org.apache.hadoop.thirdparty.protobuf.RpcController controller,
            org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto request,
            org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto> done) {
          impl.gracefulFailover(controller, request, done);
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
              return impl.cedeActive(controller, (org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto)request);
            case 1:
              return impl.gracefulFailover(controller, (org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto)request);
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
              return org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto.getDefaultInstance();
            case 1:
              return org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto.getDefaultInstance();
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
              return org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto.getDefaultInstance();
            case 1:
              return org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

      };
    }

    /**
     * <pre>
     **
     * Request that the service cede its active state, and quit the election
     * for some amount of time
     * </pre>
     *
     * <code>rpc cedeActive(.hadoop.common.CedeActiveRequestProto) returns (.hadoop.common.CedeActiveResponseProto);</code>
     */
    public abstract void cedeActive(
        org.apache.hadoop.thirdparty.protobuf.RpcController controller,
        org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto request,
        org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto> done);

    /**
     * <code>rpc gracefulFailover(.hadoop.common.GracefulFailoverRequestProto) returns (.hadoop.common.GracefulFailoverResponseProto);</code>
     */
    public abstract void gracefulFailover(
        org.apache.hadoop.thirdparty.protobuf.RpcController controller,
        org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto request,
        org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto> done);

    public static final
        org.apache.hadoop.thirdparty.protobuf.Descriptors.ServiceDescriptor
        getDescriptor() {
      return org.apache.hadoop.ha.proto.ZKFCProtocolProtos.getDescriptor().getServices().get(0);
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
          this.cedeActive(controller, (org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto)request,
            org.apache.hadoop.thirdparty.protobuf.RpcUtil.<org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto>specializeCallback(
              done));
          return;
        case 1:
          this.gracefulFailover(controller, (org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto)request,
            org.apache.hadoop.thirdparty.protobuf.RpcUtil.<org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto>specializeCallback(
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
          return org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto.getDefaultInstance();
        case 1:
          return org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto.getDefaultInstance();
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
          return org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto.getDefaultInstance();
        case 1:
          return org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public static Stub newStub(
        org.apache.hadoop.thirdparty.protobuf.RpcChannel channel) {
      return new Stub(channel);
    }

    public static final class Stub extends org.apache.hadoop.ha.proto.ZKFCProtocolProtos.ZKFCProtocolService implements Interface {
      private Stub(org.apache.hadoop.thirdparty.protobuf.RpcChannel channel) {
        this.channel = channel;
      }

      private final org.apache.hadoop.thirdparty.protobuf.RpcChannel channel;

      public org.apache.hadoop.thirdparty.protobuf.RpcChannel getChannel() {
        return channel;
      }

      public  void cedeActive(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto.getDefaultInstance(),
          org.apache.hadoop.thirdparty.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto.class,
            org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto.getDefaultInstance()));
      }

      public  void gracefulFailover(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto.getDefaultInstance(),
          org.apache.hadoop.thirdparty.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto.class,
            org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto.getDefaultInstance()));
      }
    }

    public static BlockingInterface newBlockingStub(
        org.apache.hadoop.thirdparty.protobuf.BlockingRpcChannel channel) {
      return new BlockingStub(channel);
    }

    public interface BlockingInterface {
      public org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto cedeActive(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException;

      public org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto gracefulFailover(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException;
    }

    private static final class BlockingStub implements BlockingInterface {
      private BlockingStub(org.apache.hadoop.thirdparty.protobuf.BlockingRpcChannel channel) {
        this.channel = channel;
      }

      private final org.apache.hadoop.thirdparty.protobuf.BlockingRpcChannel channel;

      public org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto cedeActive(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException {
        return (org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.ha.proto.ZKFCProtocolProtos.CedeActiveResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto gracefulFailover(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException {
        return (org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          org.apache.hadoop.ha.proto.ZKFCProtocolProtos.GracefulFailoverResponseProto.getDefaultInstance());
      }

    }

    // @@protoc_insertion_point(class_scope:hadoop.common.ZKFCProtocolService)
  }

  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_CedeActiveRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_CedeActiveRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_CedeActiveResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_CedeActiveResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_GracefulFailoverRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_GracefulFailoverRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_GracefulFailoverResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_GracefulFailoverResponseProto_fieldAccessorTable;

  public static org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022ZKFCProtocol.proto\022\rhadoop.common\".\n\026C" +
      "edeActiveRequestProto\022\024\n\014millisToCede\030\001 " +
      "\002(\r\"\031\n\027CedeActiveResponseProto\"\036\n\034Gracef" +
      "ulFailoverRequestProto\"\037\n\035GracefulFailov" +
      "erResponseProto2\341\001\n\023ZKFCProtocolService\022" +
      "[\n\ncedeActive\022%.hadoop.common.CedeActive" +
      "RequestProto\032&.hadoop.common.CedeActiveR" +
      "esponseProto\022m\n\020gracefulFailover\022+.hadoo" +
      "p.common.GracefulFailoverRequestProto\032,." +
      "hadoop.common.GracefulFailoverResponsePr" +
      "otoB6\n\032org.apache.hadoop.ha.protoB\022ZKFCP" +
      "rotocolProtos\210\001\001\240\001\001"
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
    internal_static_hadoop_common_CedeActiveRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hadoop_common_CedeActiveRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_CedeActiveRequestProto_descriptor,
        new java.lang.String[] { "MillisToCede", });
    internal_static_hadoop_common_CedeActiveResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hadoop_common_CedeActiveResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_CedeActiveResponseProto_descriptor,
        new java.lang.String[] { });
    internal_static_hadoop_common_GracefulFailoverRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_hadoop_common_GracefulFailoverRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_GracefulFailoverRequestProto_descriptor,
        new java.lang.String[] { });
    internal_static_hadoop_common_GracefulFailoverResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_hadoop_common_GracefulFailoverResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_GracefulFailoverResponseProto_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
