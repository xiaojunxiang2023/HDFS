// source: encryption.proto

package org.apache.hadoop.hdfs.protocol.proto;

public final class EncryptionZonesProtos {
  private EncryptionZonesProtos() {}
  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code hadoop.hdfs.ReencryptActionProto}
   */
  public enum ReencryptActionProto
      implements org.apache.hadoop.thirdparty.protobuf.ProtocolMessageEnum {
    /**
     * <code>CANCEL_REENCRYPT = 1;</code>
     */
    CANCEL_REENCRYPT(1),
    /**
     * <code>START_REENCRYPT = 2;</code>
     */
    START_REENCRYPT(2),
    ;

    /**
     * <code>CANCEL_REENCRYPT = 1;</code>
     */
    public static final int CANCEL_REENCRYPT_VALUE = 1;
    /**
     * <code>START_REENCRYPT = 2;</code>
     */
    public static final int START_REENCRYPT_VALUE = 2;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ReencryptActionProto valueOf(int value) {
      return forNumber(value);
    }

    public static ReencryptActionProto forNumber(int value) {
      switch (value) {
        case 1: return CANCEL_REENCRYPT;
        case 2: return START_REENCRYPT;
        default: return null;
      }
    }

    public static org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<ReencryptActionProto>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<
        ReencryptActionProto> internalValueMap =
          new org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<ReencryptActionProto>() {
            public ReencryptActionProto findValueByNumber(int number) {
              return ReencryptActionProto.forNumber(number);
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
      return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.getDescriptor().getEnumTypes().get(0);
    }

    private static final ReencryptActionProto[] VALUES = values();

    public static ReencryptActionProto valueOf(
        org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ReencryptActionProto(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:hadoop.hdfs.ReencryptActionProto)
  }

  /**
   * Protobuf enum {@code hadoop.hdfs.ReencryptionStateProto}
   */
  public enum ReencryptionStateProto
      implements org.apache.hadoop.thirdparty.protobuf.ProtocolMessageEnum {
    /**
     * <code>SUBMITTED = 1;</code>
     */
    SUBMITTED(1),
    /**
     * <code>PROCESSING = 2;</code>
     */
    PROCESSING(2),
    /**
     * <code>COMPLETED = 3;</code>
     */
    COMPLETED(3),
    ;

    /**
     * <code>SUBMITTED = 1;</code>
     */
    public static final int SUBMITTED_VALUE = 1;
    /**
     * <code>PROCESSING = 2;</code>
     */
    public static final int PROCESSING_VALUE = 2;
    /**
     * <code>COMPLETED = 3;</code>
     */
    public static final int COMPLETED_VALUE = 3;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ReencryptionStateProto valueOf(int value) {
      return forNumber(value);
    }

    public static ReencryptionStateProto forNumber(int value) {
      switch (value) {
        case 1: return SUBMITTED;
        case 2: return PROCESSING;
        case 3: return COMPLETED;
        default: return null;
      }
    }

    public static org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<ReencryptionStateProto>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<
        ReencryptionStateProto> internalValueMap =
          new org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<ReencryptionStateProto>() {
            public ReencryptionStateProto findValueByNumber(int number) {
              return ReencryptionStateProto.forNumber(number);
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
      return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.getDescriptor().getEnumTypes().get(1);
    }

    private static final ReencryptionStateProto[] VALUES = values();

    public static ReencryptionStateProto valueOf(
        org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ReencryptionStateProto(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:hadoop.hdfs.ReencryptionStateProto)
  }

  public interface CreateEncryptionZoneRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.CreateEncryptionZoneRequestProto)
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
     * <code>optional string keyName = 2;</code>
     */
    boolean hasKeyName();
    /**
     * <code>optional string keyName = 2;</code>
     */
    java.lang.String getKeyName();
    /**
     * <code>optional string keyName = 2;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getKeyNameBytes();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.CreateEncryptionZoneRequestProto}
   */
  public  static final class CreateEncryptionZoneRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.CreateEncryptionZoneRequestProto)
      CreateEncryptionZoneRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CreateEncryptionZoneRequestProto.newBuilder() to construct.
    private CreateEncryptionZoneRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CreateEncryptionZoneRequestProto() {
      src_ = "";
      keyName_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CreateEncryptionZoneRequestProto(
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
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              keyName_ = bs;
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
      return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_CreateEncryptionZoneRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_CreateEncryptionZoneRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto.Builder.class);
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

    public static final int KEYNAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object keyName_;
    /**
     * <code>optional string keyName = 2;</code>
     */
    public boolean hasKeyName() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string keyName = 2;</code>
     */
    public java.lang.String getKeyName() {
      java.lang.Object ref = keyName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          keyName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string keyName = 2;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getKeyNameBytes() {
      java.lang.Object ref = keyName_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        keyName_ = b;
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
      if (((bitField0_ & 0x00000002) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 2, keyName_);
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
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(2, keyName_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto) obj;

      if (hasSrc() != other.hasSrc()) return false;
      if (hasSrc()) {
        if (!getSrc()
            .equals(other.getSrc())) return false;
      }
      if (hasKeyName() != other.hasKeyName()) return false;
      if (hasKeyName()) {
        if (!getKeyName()
            .equals(other.getKeyName())) return false;
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
      if (hasKeyName()) {
        hash = (37 * hash) + KEYNAME_FIELD_NUMBER;
        hash = (53 * hash) + getKeyName().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.CreateEncryptionZoneRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.CreateEncryptionZoneRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_CreateEncryptionZoneRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_CreateEncryptionZoneRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto.newBuilder()
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
        keyName_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_CreateEncryptionZoneRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.src_ = src_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.keyName_ = keyName_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto.getDefaultInstance()) return this;
        if (other.hasSrc()) {
          bitField0_ |= 0x00000001;
          src_ = other.src_;
          onChanged();
        }
        if (other.hasKeyName()) {
          bitField0_ |= 0x00000002;
          keyName_ = other.keyName_;
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
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto) e.getUnfinishedMessage();
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

      private java.lang.Object keyName_ = "";
      /**
       * <code>optional string keyName = 2;</code>
       */
      public boolean hasKeyName() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional string keyName = 2;</code>
       */
      public java.lang.String getKeyName() {
        java.lang.Object ref = keyName_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            keyName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string keyName = 2;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getKeyNameBytes() {
        java.lang.Object ref = keyName_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          keyName_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string keyName = 2;</code>
       */
      public Builder setKeyName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        keyName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string keyName = 2;</code>
       */
      public Builder clearKeyName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        keyName_ = getDefaultInstance().getKeyName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string keyName = 2;</code>
       */
      public Builder setKeyNameBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        keyName_ = value;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.CreateEncryptionZoneRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.CreateEncryptionZoneRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<CreateEncryptionZoneRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<CreateEncryptionZoneRequestProto>() {
      @java.lang.Override
      public CreateEncryptionZoneRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new CreateEncryptionZoneRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<CreateEncryptionZoneRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<CreateEncryptionZoneRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CreateEncryptionZoneResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.CreateEncryptionZoneResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.CreateEncryptionZoneResponseProto}
   */
  public  static final class CreateEncryptionZoneResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.CreateEncryptionZoneResponseProto)
      CreateEncryptionZoneResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CreateEncryptionZoneResponseProto.newBuilder() to construct.
    private CreateEncryptionZoneResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CreateEncryptionZoneResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CreateEncryptionZoneResponseProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_CreateEncryptionZoneResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_CreateEncryptionZoneResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto.Builder.class);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.CreateEncryptionZoneResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.CreateEncryptionZoneResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_CreateEncryptionZoneResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_CreateEncryptionZoneResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_CreateEncryptionZoneResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto(this);
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto) e.getUnfinishedMessage();
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.CreateEncryptionZoneResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.CreateEncryptionZoneResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<CreateEncryptionZoneResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<CreateEncryptionZoneResponseProto>() {
      @java.lang.Override
      public CreateEncryptionZoneResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new CreateEncryptionZoneResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<CreateEncryptionZoneResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<CreateEncryptionZoneResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.CreateEncryptionZoneResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ListEncryptionZonesRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.ListEncryptionZonesRequestProto)
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
   * Protobuf type {@code hadoop.hdfs.ListEncryptionZonesRequestProto}
   */
  public  static final class ListEncryptionZonesRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.ListEncryptionZonesRequestProto)
      ListEncryptionZonesRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ListEncryptionZonesRequestProto.newBuilder() to construct.
    private ListEncryptionZonesRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ListEncryptionZonesRequestProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ListEncryptionZonesRequestProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ListEncryptionZonesRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ListEncryptionZonesRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto.Builder.class);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.ListEncryptionZonesRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.ListEncryptionZonesRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ListEncryptionZonesRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ListEncryptionZonesRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ListEncryptionZonesRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto(this);
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long id_ ;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.ListEncryptionZonesRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ListEncryptionZonesRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<ListEncryptionZonesRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<ListEncryptionZonesRequestProto>() {
      @java.lang.Override
      public ListEncryptionZonesRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new ListEncryptionZonesRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<ListEncryptionZonesRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<ListEncryptionZonesRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface EncryptionZoneProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.EncryptionZoneProto)
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
     * <code>required .hadoop.hdfs.CipherSuiteProto suite = 3;</code>
     */
    boolean hasSuite();
    /**
     * <code>required .hadoop.hdfs.CipherSuiteProto suite = 3;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CipherSuiteProto getSuite();

    /**
     * <code>required .hadoop.hdfs.CryptoProtocolVersionProto cryptoProtocolVersion = 4;</code>
     */
    boolean hasCryptoProtocolVersion();
    /**
     * <code>required .hadoop.hdfs.CryptoProtocolVersionProto cryptoProtocolVersion = 4;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CryptoProtocolVersionProto getCryptoProtocolVersion();

    /**
     * <code>required string keyName = 5;</code>
     */
    boolean hasKeyName();
    /**
     * <code>required string keyName = 5;</code>
     */
    java.lang.String getKeyName();
    /**
     * <code>required string keyName = 5;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getKeyNameBytes();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.EncryptionZoneProto}
   */
  public  static final class EncryptionZoneProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.EncryptionZoneProto)
      EncryptionZoneProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EncryptionZoneProto.newBuilder() to construct.
    private EncryptionZoneProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EncryptionZoneProto() {
      path_ = "";
      suite_ = 1;
      cryptoProtocolVersion_ = 1;
      keyName_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EncryptionZoneProto(
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
              path_ = bs;
              break;
            }
            case 24: {
              int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CipherSuiteProto value = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CipherSuiteProto.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(3, rawValue);
              } else {
                bitField0_ |= 0x00000004;
                suite_ = rawValue;
              }
              break;
            }
            case 32: {
              int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CryptoProtocolVersionProto value = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CryptoProtocolVersionProto.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(4, rawValue);
              } else {
                bitField0_ |= 0x00000008;
                cryptoProtocolVersion_ = rawValue;
              }
              break;
            }
            case 42: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000010;
              keyName_ = bs;
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
      return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_EncryptionZoneProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_EncryptionZoneProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto.class, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto.Builder.class);
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

    public static final int SUITE_FIELD_NUMBER = 3;
    private int suite_;
    /**
     * <code>required .hadoop.hdfs.CipherSuiteProto suite = 3;</code>
     */
    public boolean hasSuite() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required .hadoop.hdfs.CipherSuiteProto suite = 3;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CipherSuiteProto getSuite() {
      @SuppressWarnings("deprecation")
      org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CipherSuiteProto result = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CipherSuiteProto.valueOf(suite_);
      return result == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CipherSuiteProto.UNKNOWN : result;
    }

    public static final int CRYPTOPROTOCOLVERSION_FIELD_NUMBER = 4;
    private int cryptoProtocolVersion_;
    /**
     * <code>required .hadoop.hdfs.CryptoProtocolVersionProto cryptoProtocolVersion = 4;</code>
     */
    public boolean hasCryptoProtocolVersion() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>required .hadoop.hdfs.CryptoProtocolVersionProto cryptoProtocolVersion = 4;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CryptoProtocolVersionProto getCryptoProtocolVersion() {
      @SuppressWarnings("deprecation")
      org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CryptoProtocolVersionProto result = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CryptoProtocolVersionProto.valueOf(cryptoProtocolVersion_);
      return result == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CryptoProtocolVersionProto.UNKNOWN_PROTOCOL_VERSION : result;
    }

    public static final int KEYNAME_FIELD_NUMBER = 5;
    private volatile java.lang.Object keyName_;
    /**
     * <code>required string keyName = 5;</code>
     */
    public boolean hasKeyName() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>required string keyName = 5;</code>
     */
    public java.lang.String getKeyName() {
      java.lang.Object ref = keyName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          keyName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string keyName = 5;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getKeyNameBytes() {
      java.lang.Object ref = keyName_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        keyName_ = b;
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
      if (!hasPath()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSuite()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCryptoProtocolVersion()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasKeyName()) {
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 2, path_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeEnum(3, suite_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeEnum(4, cryptoProtocolVersion_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 5, keyName_);
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
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(2, path_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeEnumSize(3, suite_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeEnumSize(4, cryptoProtocolVersion_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(5, keyName_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto other = (org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto) obj;

      if (hasId() != other.hasId()) return false;
      if (hasId()) {
        if (getId()
            != other.getId()) return false;
      }
      if (hasPath() != other.hasPath()) return false;
      if (hasPath()) {
        if (!getPath()
            .equals(other.getPath())) return false;
      }
      if (hasSuite() != other.hasSuite()) return false;
      if (hasSuite()) {
        if (suite_ != other.suite_) return false;
      }
      if (hasCryptoProtocolVersion() != other.hasCryptoProtocolVersion()) return false;
      if (hasCryptoProtocolVersion()) {
        if (cryptoProtocolVersion_ != other.cryptoProtocolVersion_) return false;
      }
      if (hasKeyName() != other.hasKeyName()) return false;
      if (hasKeyName()) {
        if (!getKeyName()
            .equals(other.getKeyName())) return false;
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
      if (hasPath()) {
        hash = (37 * hash) + PATH_FIELD_NUMBER;
        hash = (53 * hash) + getPath().hashCode();
      }
      if (hasSuite()) {
        hash = (37 * hash) + SUITE_FIELD_NUMBER;
        hash = (53 * hash) + suite_;
      }
      if (hasCryptoProtocolVersion()) {
        hash = (37 * hash) + CRYPTOPROTOCOLVERSION_FIELD_NUMBER;
        hash = (53 * hash) + cryptoProtocolVersion_;
      }
      if (hasKeyName()) {
        hash = (37 * hash) + KEYNAME_FIELD_NUMBER;
        hash = (53 * hash) + getKeyName().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.EncryptionZoneProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.EncryptionZoneProto)
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_EncryptionZoneProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_EncryptionZoneProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto.class, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto.newBuilder()
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
        path_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        suite_ = 1;
        bitField0_ = (bitField0_ & ~0x00000004);
        cryptoProtocolVersion_ = 1;
        bitField0_ = (bitField0_ & ~0x00000008);
        keyName_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_EncryptionZoneProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto build() {
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto result = new org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.id_ = id_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.path_ = path_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.suite_ = suite_;
        if (((from_bitField0_ & 0x00000008) != 0)) {
          to_bitField0_ |= 0x00000008;
        }
        result.cryptoProtocolVersion_ = cryptoProtocolVersion_;
        if (((from_bitField0_ & 0x00000010) != 0)) {
          to_bitField0_ |= 0x00000010;
        }
        result.keyName_ = keyName_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasPath()) {
          bitField0_ |= 0x00000002;
          path_ = other.path_;
          onChanged();
        }
        if (other.hasSuite()) {
          setSuite(other.getSuite());
        }
        if (other.hasCryptoProtocolVersion()) {
          setCryptoProtocolVersion(other.getCryptoProtocolVersion());
        }
        if (other.hasKeyName()) {
          bitField0_ |= 0x00000010;
          keyName_ = other.keyName_;
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
        if (!hasPath()) {
          return false;
        }
        if (!hasSuite()) {
          return false;
        }
        if (!hasCryptoProtocolVersion()) {
          return false;
        }
        if (!hasKeyName()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long id_ ;
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

      private int suite_ = 1;
      /**
       * <code>required .hadoop.hdfs.CipherSuiteProto suite = 3;</code>
       */
      public boolean hasSuite() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>required .hadoop.hdfs.CipherSuiteProto suite = 3;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CipherSuiteProto getSuite() {
        @SuppressWarnings("deprecation")
        org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CipherSuiteProto result = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CipherSuiteProto.valueOf(suite_);
        return result == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CipherSuiteProto.UNKNOWN : result;
      }
      /**
       * <code>required .hadoop.hdfs.CipherSuiteProto suite = 3;</code>
       */
      public Builder setSuite(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CipherSuiteProto value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        suite_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.CipherSuiteProto suite = 3;</code>
       */
      public Builder clearSuite() {
        bitField0_ = (bitField0_ & ~0x00000004);
        suite_ = 1;
        onChanged();
        return this;
      }

      private int cryptoProtocolVersion_ = 1;
      /**
       * <code>required .hadoop.hdfs.CryptoProtocolVersionProto cryptoProtocolVersion = 4;</code>
       */
      public boolean hasCryptoProtocolVersion() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>required .hadoop.hdfs.CryptoProtocolVersionProto cryptoProtocolVersion = 4;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CryptoProtocolVersionProto getCryptoProtocolVersion() {
        @SuppressWarnings("deprecation")
        org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CryptoProtocolVersionProto result = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CryptoProtocolVersionProto.valueOf(cryptoProtocolVersion_);
        return result == null ? org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CryptoProtocolVersionProto.UNKNOWN_PROTOCOL_VERSION : result;
      }
      /**
       * <code>required .hadoop.hdfs.CryptoProtocolVersionProto cryptoProtocolVersion = 4;</code>
       */
      public Builder setCryptoProtocolVersion(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CryptoProtocolVersionProto value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        cryptoProtocolVersion_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.CryptoProtocolVersionProto cryptoProtocolVersion = 4;</code>
       */
      public Builder clearCryptoProtocolVersion() {
        bitField0_ = (bitField0_ & ~0x00000008);
        cryptoProtocolVersion_ = 1;
        onChanged();
        return this;
      }

      private java.lang.Object keyName_ = "";
      /**
       * <code>required string keyName = 5;</code>
       */
      public boolean hasKeyName() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <code>required string keyName = 5;</code>
       */
      public java.lang.String getKeyName() {
        java.lang.Object ref = keyName_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            keyName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string keyName = 5;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getKeyNameBytes() {
        java.lang.Object ref = keyName_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          keyName_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string keyName = 5;</code>
       */
      public Builder setKeyName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        keyName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string keyName = 5;</code>
       */
      public Builder clearKeyName() {
        bitField0_ = (bitField0_ & ~0x00000010);
        keyName_ = getDefaultInstance().getKeyName();
        onChanged();
        return this;
      }
      /**
       * <code>required string keyName = 5;</code>
       */
      public Builder setKeyNameBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        keyName_ = value;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.EncryptionZoneProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.EncryptionZoneProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<EncryptionZoneProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<EncryptionZoneProto>() {
      @java.lang.Override
      public EncryptionZoneProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new EncryptionZoneProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<EncryptionZoneProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<EncryptionZoneProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ListEncryptionZonesResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.ListEncryptionZonesResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .hadoop.hdfs.EncryptionZoneProto zones = 1;</code>
     */
    java.util.List<org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto> 
        getZonesList();
    /**
     * <code>repeated .hadoop.hdfs.EncryptionZoneProto zones = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto getZones(int index);
    /**
     * <code>repeated .hadoop.hdfs.EncryptionZoneProto zones = 1;</code>
     */
    int getZonesCount();
    /**
     * <code>repeated .hadoop.hdfs.EncryptionZoneProto zones = 1;</code>
     */
    java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProtoOrBuilder> 
        getZonesOrBuilderList();
    /**
     * <code>repeated .hadoop.hdfs.EncryptionZoneProto zones = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProtoOrBuilder getZonesOrBuilder(
        int index);

    /**
     * <code>required bool hasMore = 2;</code>
     */
    boolean hasHasMore();
    /**
     * <code>required bool hasMore = 2;</code>
     */
    boolean getHasMore();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.ListEncryptionZonesResponseProto}
   */
  public  static final class ListEncryptionZonesResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.ListEncryptionZonesResponseProto)
      ListEncryptionZonesResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ListEncryptionZonesResponseProto.newBuilder() to construct.
    private ListEncryptionZonesResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ListEncryptionZonesResponseProto() {
      zones_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ListEncryptionZonesResponseProto(
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
                zones_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto>();
                mutable_bitField0_ |= 0x00000001;
              }
              zones_.add(
                  input.readMessage(org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto.PARSER, extensionRegistry));
              break;
            }
            case 16: {
              bitField0_ |= 0x00000001;
              hasMore_ = input.readBool();
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
          zones_ = java.util.Collections.unmodifiableList(zones_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ListEncryptionZonesResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ListEncryptionZonesResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto.Builder.class);
    }

    private int bitField0_;
    public static final int ZONES_FIELD_NUMBER = 1;
    private java.util.List<org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto> zones_;
    /**
     * <code>repeated .hadoop.hdfs.EncryptionZoneProto zones = 1;</code>
     */
    public java.util.List<org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto> getZonesList() {
      return zones_;
    }
    /**
     * <code>repeated .hadoop.hdfs.EncryptionZoneProto zones = 1;</code>
     */
    public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProtoOrBuilder> 
        getZonesOrBuilderList() {
      return zones_;
    }
    /**
     * <code>repeated .hadoop.hdfs.EncryptionZoneProto zones = 1;</code>
     */
    public int getZonesCount() {
      return zones_.size();
    }
    /**
     * <code>repeated .hadoop.hdfs.EncryptionZoneProto zones = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto getZones(int index) {
      return zones_.get(index);
    }
    /**
     * <code>repeated .hadoop.hdfs.EncryptionZoneProto zones = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProtoOrBuilder getZonesOrBuilder(
        int index) {
      return zones_.get(index);
    }

    public static final int HASMORE_FIELD_NUMBER = 2;
    private boolean hasMore_;
    /**
     * <code>required bool hasMore = 2;</code>
     */
    public boolean hasHasMore() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required bool hasMore = 2;</code>
     */
    public boolean getHasMore() {
      return hasMore_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasHasMore()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getZonesCount(); i++) {
        if (!getZones(i).isInitialized()) {
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
      for (int i = 0; i < zones_.size(); i++) {
        output.writeMessage(1, zones_.get(i));
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeBool(2, hasMore_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < zones_.size(); i++) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(1, zones_.get(i));
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeBoolSize(2, hasMore_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto) obj;

      if (!getZonesList()
          .equals(other.getZonesList())) return false;
      if (hasHasMore() != other.hasHasMore()) return false;
      if (hasHasMore()) {
        if (getHasMore()
            != other.getHasMore()) return false;
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
      if (getZonesCount() > 0) {
        hash = (37 * hash) + ZONES_FIELD_NUMBER;
        hash = (53 * hash) + getZonesList().hashCode();
      }
      if (hasHasMore()) {
        hash = (37 * hash) + HASMORE_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashBoolean(
            getHasMore());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.ListEncryptionZonesResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.ListEncryptionZonesResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ListEncryptionZonesResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ListEncryptionZonesResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto.newBuilder()
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
          getZonesFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (zonesBuilder_ == null) {
          zones_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          zonesBuilder_.clear();
        }
        hasMore_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ListEncryptionZonesResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (zonesBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            zones_ = java.util.Collections.unmodifiableList(zones_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.zones_ = zones_;
        } else {
          result.zones_ = zonesBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.hasMore_ = hasMore_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto.getDefaultInstance()) return this;
        if (zonesBuilder_ == null) {
          if (!other.zones_.isEmpty()) {
            if (zones_.isEmpty()) {
              zones_ = other.zones_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureZonesIsMutable();
              zones_.addAll(other.zones_);
            }
            onChanged();
          }
        } else {
          if (!other.zones_.isEmpty()) {
            if (zonesBuilder_.isEmpty()) {
              zonesBuilder_.dispose();
              zonesBuilder_ = null;
              zones_ = other.zones_;
              bitField0_ = (bitField0_ & ~0x00000001);
              zonesBuilder_ = 
                org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getZonesFieldBuilder() : null;
            } else {
              zonesBuilder_.addAllMessages(other.zones_);
            }
          }
        }
        if (other.hasHasMore()) {
          setHasMore(other.getHasMore());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasHasMore()) {
          return false;
        }
        for (int i = 0; i < getZonesCount(); i++) {
          if (!getZones(i).isInitialized()) {
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
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto> zones_ =
        java.util.Collections.emptyList();
      private void ensureZonesIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          zones_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto>(zones_);
          bitField0_ |= 0x00000001;
         }
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto.Builder, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProtoOrBuilder> zonesBuilder_;

      /**
       * <code>repeated .hadoop.hdfs.EncryptionZoneProto zones = 1;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto> getZonesList() {
        if (zonesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(zones_);
        } else {
          return zonesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.EncryptionZoneProto zones = 1;</code>
       */
      public int getZonesCount() {
        if (zonesBuilder_ == null) {
          return zones_.size();
        } else {
          return zonesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.EncryptionZoneProto zones = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto getZones(int index) {
        if (zonesBuilder_ == null) {
          return zones_.get(index);
        } else {
          return zonesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.EncryptionZoneProto zones = 1;</code>
       */
      public Builder setZones(
          int index, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto value) {
        if (zonesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureZonesIsMutable();
          zones_.set(index, value);
          onChanged();
        } else {
          zonesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.EncryptionZoneProto zones = 1;</code>
       */
      public Builder setZones(
          int index, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto.Builder builderForValue) {
        if (zonesBuilder_ == null) {
          ensureZonesIsMutable();
          zones_.set(index, builderForValue.build());
          onChanged();
        } else {
          zonesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.EncryptionZoneProto zones = 1;</code>
       */
      public Builder addZones(org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto value) {
        if (zonesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureZonesIsMutable();
          zones_.add(value);
          onChanged();
        } else {
          zonesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.EncryptionZoneProto zones = 1;</code>
       */
      public Builder addZones(
          int index, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto value) {
        if (zonesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureZonesIsMutable();
          zones_.add(index, value);
          onChanged();
        } else {
          zonesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.EncryptionZoneProto zones = 1;</code>
       */
      public Builder addZones(
          org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto.Builder builderForValue) {
        if (zonesBuilder_ == null) {
          ensureZonesIsMutable();
          zones_.add(builderForValue.build());
          onChanged();
        } else {
          zonesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.EncryptionZoneProto zones = 1;</code>
       */
      public Builder addZones(
          int index, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto.Builder builderForValue) {
        if (zonesBuilder_ == null) {
          ensureZonesIsMutable();
          zones_.add(index, builderForValue.build());
          onChanged();
        } else {
          zonesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.EncryptionZoneProto zones = 1;</code>
       */
      public Builder addAllZones(
          java.lang.Iterable<? extends org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto> values) {
        if (zonesBuilder_ == null) {
          ensureZonesIsMutable();
          org.apache.hadoop.thirdparty.protobuf.AbstractMessageLite.Builder.addAll(
              values, zones_);
          onChanged();
        } else {
          zonesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.EncryptionZoneProto zones = 1;</code>
       */
      public Builder clearZones() {
        if (zonesBuilder_ == null) {
          zones_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          zonesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.EncryptionZoneProto zones = 1;</code>
       */
      public Builder removeZones(int index) {
        if (zonesBuilder_ == null) {
          ensureZonesIsMutable();
          zones_.remove(index);
          onChanged();
        } else {
          zonesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.EncryptionZoneProto zones = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto.Builder getZonesBuilder(
          int index) {
        return getZonesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.hdfs.EncryptionZoneProto zones = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProtoOrBuilder getZonesOrBuilder(
          int index) {
        if (zonesBuilder_ == null) {
          return zones_.get(index);  } else {
          return zonesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.EncryptionZoneProto zones = 1;</code>
       */
      public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProtoOrBuilder> 
           getZonesOrBuilderList() {
        if (zonesBuilder_ != null) {
          return zonesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(zones_);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.EncryptionZoneProto zones = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto.Builder addZonesBuilder() {
        return getZonesFieldBuilder().addBuilder(
            org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.EncryptionZoneProto zones = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto.Builder addZonesBuilder(
          int index) {
        return getZonesFieldBuilder().addBuilder(
            index, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.EncryptionZoneProto zones = 1;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto.Builder> 
           getZonesBuilderList() {
        return getZonesFieldBuilder().getBuilderList();
      }
      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto.Builder, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProtoOrBuilder> 
          getZonesFieldBuilder() {
        if (zonesBuilder_ == null) {
          zonesBuilder_ = new org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto.Builder, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProtoOrBuilder>(
                  zones_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          zones_ = null;
        }
        return zonesBuilder_;
      }

      private boolean hasMore_ ;
      /**
       * <code>required bool hasMore = 2;</code>
       */
      public boolean hasHasMore() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required bool hasMore = 2;</code>
       */
      public boolean getHasMore() {
        return hasMore_;
      }
      /**
       * <code>required bool hasMore = 2;</code>
       */
      public Builder setHasMore(boolean value) {
        bitField0_ |= 0x00000002;
        hasMore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool hasMore = 2;</code>
       */
      public Builder clearHasMore() {
        bitField0_ = (bitField0_ & ~0x00000002);
        hasMore_ = false;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.ListEncryptionZonesResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ListEncryptionZonesResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<ListEncryptionZonesResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<ListEncryptionZonesResponseProto>() {
      @java.lang.Override
      public ListEncryptionZonesResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new ListEncryptionZonesResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<ListEncryptionZonesResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<ListEncryptionZonesResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListEncryptionZonesResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ReencryptEncryptionZoneRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.ReencryptEncryptionZoneRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required .hadoop.hdfs.ReencryptActionProto action = 1;</code>
     */
    boolean hasAction();
    /**
     * <code>required .hadoop.hdfs.ReencryptActionProto action = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptActionProto getAction();

    /**
     * <code>required string zone = 2;</code>
     */
    boolean hasZone();
    /**
     * <code>required string zone = 2;</code>
     */
    java.lang.String getZone();
    /**
     * <code>required string zone = 2;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getZoneBytes();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.ReencryptEncryptionZoneRequestProto}
   */
  public  static final class ReencryptEncryptionZoneRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.ReencryptEncryptionZoneRequestProto)
      ReencryptEncryptionZoneRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReencryptEncryptionZoneRequestProto.newBuilder() to construct.
    private ReencryptEncryptionZoneRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReencryptEncryptionZoneRequestProto() {
      action_ = 1;
      zone_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReencryptEncryptionZoneRequestProto(
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
              org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptActionProto value = org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptActionProto.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                action_ = rawValue;
              }
              break;
            }
            case 18: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              zone_ = bs;
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
      return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ReencryptEncryptionZoneRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ReencryptEncryptionZoneRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto.Builder.class);
    }

    private int bitField0_;
    public static final int ACTION_FIELD_NUMBER = 1;
    private int action_;
    /**
     * <code>required .hadoop.hdfs.ReencryptActionProto action = 1;</code>
     */
    public boolean hasAction() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required .hadoop.hdfs.ReencryptActionProto action = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptActionProto getAction() {
      @SuppressWarnings("deprecation")
      org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptActionProto result = org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptActionProto.valueOf(action_);
      return result == null ? org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptActionProto.CANCEL_REENCRYPT : result;
    }

    public static final int ZONE_FIELD_NUMBER = 2;
    private volatile java.lang.Object zone_;
    /**
     * <code>required string zone = 2;</code>
     */
    public boolean hasZone() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required string zone = 2;</code>
     */
    public java.lang.String getZone() {
      java.lang.Object ref = zone_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          zone_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string zone = 2;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getZoneBytes() {
      java.lang.Object ref = zone_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        zone_ = b;
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

      if (!hasAction()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasZone()) {
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
        output.writeEnum(1, action_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 2, zone_);
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
          .computeEnumSize(1, action_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(2, zone_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto) obj;

      if (hasAction() != other.hasAction()) return false;
      if (hasAction()) {
        if (action_ != other.action_) return false;
      }
      if (hasZone() != other.hasZone()) return false;
      if (hasZone()) {
        if (!getZone()
            .equals(other.getZone())) return false;
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
        hash = (53 * hash) + action_;
      }
      if (hasZone()) {
        hash = (37 * hash) + ZONE_FIELD_NUMBER;
        hash = (53 * hash) + getZone().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.ReencryptEncryptionZoneRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.ReencryptEncryptionZoneRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ReencryptEncryptionZoneRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ReencryptEncryptionZoneRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto.newBuilder()
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
        action_ = 1;
        bitField0_ = (bitField0_ & ~0x00000001);
        zone_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ReencryptEncryptionZoneRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.action_ = action_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.zone_ = zone_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto.getDefaultInstance()) return this;
        if (other.hasAction()) {
          setAction(other.getAction());
        }
        if (other.hasZone()) {
          bitField0_ |= 0x00000002;
          zone_ = other.zone_;
          onChanged();
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
        if (!hasZone()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int action_ = 1;
      /**
       * <code>required .hadoop.hdfs.ReencryptActionProto action = 1;</code>
       */
      public boolean hasAction() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required .hadoop.hdfs.ReencryptActionProto action = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptActionProto getAction() {
        @SuppressWarnings("deprecation")
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptActionProto result = org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptActionProto.valueOf(action_);
        return result == null ? org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptActionProto.CANCEL_REENCRYPT : result;
      }
      /**
       * <code>required .hadoop.hdfs.ReencryptActionProto action = 1;</code>
       */
      public Builder setAction(org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptActionProto value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        action_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ReencryptActionProto action = 1;</code>
       */
      public Builder clearAction() {
        bitField0_ = (bitField0_ & ~0x00000001);
        action_ = 1;
        onChanged();
        return this;
      }

      private java.lang.Object zone_ = "";
      /**
       * <code>required string zone = 2;</code>
       */
      public boolean hasZone() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required string zone = 2;</code>
       */
      public java.lang.String getZone() {
        java.lang.Object ref = zone_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            zone_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string zone = 2;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getZoneBytes() {
        java.lang.Object ref = zone_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          zone_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string zone = 2;</code>
       */
      public Builder setZone(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        zone_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string zone = 2;</code>
       */
      public Builder clearZone() {
        bitField0_ = (bitField0_ & ~0x00000002);
        zone_ = getDefaultInstance().getZone();
        onChanged();
        return this;
      }
      /**
       * <code>required string zone = 2;</code>
       */
      public Builder setZoneBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        zone_ = value;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.ReencryptEncryptionZoneRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ReencryptEncryptionZoneRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<ReencryptEncryptionZoneRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<ReencryptEncryptionZoneRequestProto>() {
      @java.lang.Override
      public ReencryptEncryptionZoneRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new ReencryptEncryptionZoneRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<ReencryptEncryptionZoneRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<ReencryptEncryptionZoneRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ReencryptEncryptionZoneResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.ReencryptEncryptionZoneResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.ReencryptEncryptionZoneResponseProto}
   */
  public  static final class ReencryptEncryptionZoneResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.ReencryptEncryptionZoneResponseProto)
      ReencryptEncryptionZoneResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReencryptEncryptionZoneResponseProto.newBuilder() to construct.
    private ReencryptEncryptionZoneResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReencryptEncryptionZoneResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReencryptEncryptionZoneResponseProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ReencryptEncryptionZoneResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ReencryptEncryptionZoneResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto.Builder.class);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.ReencryptEncryptionZoneResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.ReencryptEncryptionZoneResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ReencryptEncryptionZoneResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ReencryptEncryptionZoneResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ReencryptEncryptionZoneResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto(this);
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto) e.getUnfinishedMessage();
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.ReencryptEncryptionZoneResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ReencryptEncryptionZoneResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<ReencryptEncryptionZoneResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<ReencryptEncryptionZoneResponseProto>() {
      @java.lang.Override
      public ReencryptEncryptionZoneResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new ReencryptEncryptionZoneResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<ReencryptEncryptionZoneResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<ReencryptEncryptionZoneResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptEncryptionZoneResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ListReencryptionStatusRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.ListReencryptionStatusRequestProto)
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
   * Protobuf type {@code hadoop.hdfs.ListReencryptionStatusRequestProto}
   */
  public  static final class ListReencryptionStatusRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.ListReencryptionStatusRequestProto)
      ListReencryptionStatusRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ListReencryptionStatusRequestProto.newBuilder() to construct.
    private ListReencryptionStatusRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ListReencryptionStatusRequestProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ListReencryptionStatusRequestProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ListReencryptionStatusRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ListReencryptionStatusRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto.Builder.class);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.ListReencryptionStatusRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.ListReencryptionStatusRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ListReencryptionStatusRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ListReencryptionStatusRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ListReencryptionStatusRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto(this);
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long id_ ;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.ListReencryptionStatusRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ListReencryptionStatusRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<ListReencryptionStatusRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<ListReencryptionStatusRequestProto>() {
      @java.lang.Override
      public ListReencryptionStatusRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new ListReencryptionStatusRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<ListReencryptionStatusRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<ListReencryptionStatusRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ZoneReencryptionStatusProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.ZoneReencryptionStatusProto)
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
     * <code>required .hadoop.hdfs.ReencryptionStateProto state = 3;</code>
     */
    boolean hasState();
    /**
     * <code>required .hadoop.hdfs.ReencryptionStateProto state = 3;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptionStateProto getState();

    /**
     * <code>required string ezKeyVersionName = 4;</code>
     */
    boolean hasEzKeyVersionName();
    /**
     * <code>required string ezKeyVersionName = 4;</code>
     */
    java.lang.String getEzKeyVersionName();
    /**
     * <code>required string ezKeyVersionName = 4;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getEzKeyVersionNameBytes();

    /**
     * <code>required int64 submissionTime = 5;</code>
     */
    boolean hasSubmissionTime();
    /**
     * <code>required int64 submissionTime = 5;</code>
     */
    long getSubmissionTime();

    /**
     * <code>required bool canceled = 6;</code>
     */
    boolean hasCanceled();
    /**
     * <code>required bool canceled = 6;</code>
     */
    boolean getCanceled();

    /**
     * <code>required int64 numReencrypted = 7;</code>
     */
    boolean hasNumReencrypted();
    /**
     * <code>required int64 numReencrypted = 7;</code>
     */
    long getNumReencrypted();

    /**
     * <code>required int64 numFailures = 8;</code>
     */
    boolean hasNumFailures();
    /**
     * <code>required int64 numFailures = 8;</code>
     */
    long getNumFailures();

    /**
     * <code>optional int64 completionTime = 9;</code>
     */
    boolean hasCompletionTime();
    /**
     * <code>optional int64 completionTime = 9;</code>
     */
    long getCompletionTime();

    /**
     * <code>optional string lastFile = 10;</code>
     */
    boolean hasLastFile();
    /**
     * <code>optional string lastFile = 10;</code>
     */
    java.lang.String getLastFile();
    /**
     * <code>optional string lastFile = 10;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getLastFileBytes();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.ZoneReencryptionStatusProto}
   */
  public  static final class ZoneReencryptionStatusProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.ZoneReencryptionStatusProto)
      ZoneReencryptionStatusProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ZoneReencryptionStatusProto.newBuilder() to construct.
    private ZoneReencryptionStatusProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ZoneReencryptionStatusProto() {
      path_ = "";
      state_ = 1;
      ezKeyVersionName_ = "";
      lastFile_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ZoneReencryptionStatusProto(
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
              path_ = bs;
              break;
            }
            case 24: {
              int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
              org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptionStateProto value = org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptionStateProto.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(3, rawValue);
              } else {
                bitField0_ |= 0x00000004;
                state_ = rawValue;
              }
              break;
            }
            case 34: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              ezKeyVersionName_ = bs;
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              submissionTime_ = input.readInt64();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              canceled_ = input.readBool();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              numReencrypted_ = input.readInt64();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000080;
              numFailures_ = input.readInt64();
              break;
            }
            case 72: {
              bitField0_ |= 0x00000100;
              completionTime_ = input.readInt64();
              break;
            }
            case 82: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000200;
              lastFile_ = bs;
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
      return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ZoneReencryptionStatusProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ZoneReencryptionStatusProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto.class, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto.Builder.class);
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

    public static final int STATE_FIELD_NUMBER = 3;
    private int state_;
    /**
     * <code>required .hadoop.hdfs.ReencryptionStateProto state = 3;</code>
     */
    public boolean hasState() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required .hadoop.hdfs.ReencryptionStateProto state = 3;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptionStateProto getState() {
      @SuppressWarnings("deprecation")
      org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptionStateProto result = org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptionStateProto.valueOf(state_);
      return result == null ? org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptionStateProto.SUBMITTED : result;
    }

    public static final int EZKEYVERSIONNAME_FIELD_NUMBER = 4;
    private volatile java.lang.Object ezKeyVersionName_;
    /**
     * <code>required string ezKeyVersionName = 4;</code>
     */
    public boolean hasEzKeyVersionName() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>required string ezKeyVersionName = 4;</code>
     */
    public java.lang.String getEzKeyVersionName() {
      java.lang.Object ref = ezKeyVersionName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          ezKeyVersionName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string ezKeyVersionName = 4;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getEzKeyVersionNameBytes() {
      java.lang.Object ref = ezKeyVersionName_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ezKeyVersionName_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int SUBMISSIONTIME_FIELD_NUMBER = 5;
    private long submissionTime_;
    /**
     * <code>required int64 submissionTime = 5;</code>
     */
    public boolean hasSubmissionTime() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>required int64 submissionTime = 5;</code>
     */
    public long getSubmissionTime() {
      return submissionTime_;
    }

    public static final int CANCELED_FIELD_NUMBER = 6;
    private boolean canceled_;
    /**
     * <code>required bool canceled = 6;</code>
     */
    public boolean hasCanceled() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <code>required bool canceled = 6;</code>
     */
    public boolean getCanceled() {
      return canceled_;
    }

    public static final int NUMREENCRYPTED_FIELD_NUMBER = 7;
    private long numReencrypted_;
    /**
     * <code>required int64 numReencrypted = 7;</code>
     */
    public boolean hasNumReencrypted() {
      return ((bitField0_ & 0x00000040) != 0);
    }
    /**
     * <code>required int64 numReencrypted = 7;</code>
     */
    public long getNumReencrypted() {
      return numReencrypted_;
    }

    public static final int NUMFAILURES_FIELD_NUMBER = 8;
    private long numFailures_;
    /**
     * <code>required int64 numFailures = 8;</code>
     */
    public boolean hasNumFailures() {
      return ((bitField0_ & 0x00000080) != 0);
    }
    /**
     * <code>required int64 numFailures = 8;</code>
     */
    public long getNumFailures() {
      return numFailures_;
    }

    public static final int COMPLETIONTIME_FIELD_NUMBER = 9;
    private long completionTime_;
    /**
     * <code>optional int64 completionTime = 9;</code>
     */
    public boolean hasCompletionTime() {
      return ((bitField0_ & 0x00000100) != 0);
    }
    /**
     * <code>optional int64 completionTime = 9;</code>
     */
    public long getCompletionTime() {
      return completionTime_;
    }

    public static final int LASTFILE_FIELD_NUMBER = 10;
    private volatile java.lang.Object lastFile_;
    /**
     * <code>optional string lastFile = 10;</code>
     */
    public boolean hasLastFile() {
      return ((bitField0_ & 0x00000200) != 0);
    }
    /**
     * <code>optional string lastFile = 10;</code>
     */
    public java.lang.String getLastFile() {
      java.lang.Object ref = lastFile_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          lastFile_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string lastFile = 10;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getLastFileBytes() {
      java.lang.Object ref = lastFile_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lastFile_ = b;
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
      if (!hasPath()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasState()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasEzKeyVersionName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSubmissionTime()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCanceled()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasNumReencrypted()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasNumFailures()) {
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 2, path_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeEnum(3, state_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 4, ezKeyVersionName_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        output.writeInt64(5, submissionTime_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        output.writeBool(6, canceled_);
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        output.writeInt64(7, numReencrypted_);
      }
      if (((bitField0_ & 0x00000080) != 0)) {
        output.writeInt64(8, numFailures_);
      }
      if (((bitField0_ & 0x00000100) != 0)) {
        output.writeInt64(9, completionTime_);
      }
      if (((bitField0_ & 0x00000200) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 10, lastFile_);
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
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(2, path_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeEnumSize(3, state_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(4, ezKeyVersionName_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeInt64Size(5, submissionTime_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeBoolSize(6, canceled_);
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeInt64Size(7, numReencrypted_);
      }
      if (((bitField0_ & 0x00000080) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeInt64Size(8, numFailures_);
      }
      if (((bitField0_ & 0x00000100) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeInt64Size(9, completionTime_);
      }
      if (((bitField0_ & 0x00000200) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(10, lastFile_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto other = (org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto) obj;

      if (hasId() != other.hasId()) return false;
      if (hasId()) {
        if (getId()
            != other.getId()) return false;
      }
      if (hasPath() != other.hasPath()) return false;
      if (hasPath()) {
        if (!getPath()
            .equals(other.getPath())) return false;
      }
      if (hasState() != other.hasState()) return false;
      if (hasState()) {
        if (state_ != other.state_) return false;
      }
      if (hasEzKeyVersionName() != other.hasEzKeyVersionName()) return false;
      if (hasEzKeyVersionName()) {
        if (!getEzKeyVersionName()
            .equals(other.getEzKeyVersionName())) return false;
      }
      if (hasSubmissionTime() != other.hasSubmissionTime()) return false;
      if (hasSubmissionTime()) {
        if (getSubmissionTime()
            != other.getSubmissionTime()) return false;
      }
      if (hasCanceled() != other.hasCanceled()) return false;
      if (hasCanceled()) {
        if (getCanceled()
            != other.getCanceled()) return false;
      }
      if (hasNumReencrypted() != other.hasNumReencrypted()) return false;
      if (hasNumReencrypted()) {
        if (getNumReencrypted()
            != other.getNumReencrypted()) return false;
      }
      if (hasNumFailures() != other.hasNumFailures()) return false;
      if (hasNumFailures()) {
        if (getNumFailures()
            != other.getNumFailures()) return false;
      }
      if (hasCompletionTime() != other.hasCompletionTime()) return false;
      if (hasCompletionTime()) {
        if (getCompletionTime()
            != other.getCompletionTime()) return false;
      }
      if (hasLastFile() != other.hasLastFile()) return false;
      if (hasLastFile()) {
        if (!getLastFile()
            .equals(other.getLastFile())) return false;
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
      if (hasPath()) {
        hash = (37 * hash) + PATH_FIELD_NUMBER;
        hash = (53 * hash) + getPath().hashCode();
      }
      if (hasState()) {
        hash = (37 * hash) + STATE_FIELD_NUMBER;
        hash = (53 * hash) + state_;
      }
      if (hasEzKeyVersionName()) {
        hash = (37 * hash) + EZKEYVERSIONNAME_FIELD_NUMBER;
        hash = (53 * hash) + getEzKeyVersionName().hashCode();
      }
      if (hasSubmissionTime()) {
        hash = (37 * hash) + SUBMISSIONTIME_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getSubmissionTime());
      }
      if (hasCanceled()) {
        hash = (37 * hash) + CANCELED_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashBoolean(
            getCanceled());
      }
      if (hasNumReencrypted()) {
        hash = (37 * hash) + NUMREENCRYPTED_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getNumReencrypted());
      }
      if (hasNumFailures()) {
        hash = (37 * hash) + NUMFAILURES_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getNumFailures());
      }
      if (hasCompletionTime()) {
        hash = (37 * hash) + COMPLETIONTIME_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getCompletionTime());
      }
      if (hasLastFile()) {
        hash = (37 * hash) + LASTFILE_FIELD_NUMBER;
        hash = (53 * hash) + getLastFile().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.ZoneReencryptionStatusProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.ZoneReencryptionStatusProto)
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ZoneReencryptionStatusProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ZoneReencryptionStatusProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto.class, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto.newBuilder()
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
        path_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        state_ = 1;
        bitField0_ = (bitField0_ & ~0x00000004);
        ezKeyVersionName_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        submissionTime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000010);
        canceled_ = false;
        bitField0_ = (bitField0_ & ~0x00000020);
        numReencrypted_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000040);
        numFailures_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000080);
        completionTime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000100);
        lastFile_ = "";
        bitField0_ = (bitField0_ & ~0x00000200);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ZoneReencryptionStatusProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto build() {
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto result = new org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.id_ = id_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.path_ = path_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.state_ = state_;
        if (((from_bitField0_ & 0x00000008) != 0)) {
          to_bitField0_ |= 0x00000008;
        }
        result.ezKeyVersionName_ = ezKeyVersionName_;
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.submissionTime_ = submissionTime_;
          to_bitField0_ |= 0x00000010;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.canceled_ = canceled_;
          to_bitField0_ |= 0x00000020;
        }
        if (((from_bitField0_ & 0x00000040) != 0)) {
          result.numReencrypted_ = numReencrypted_;
          to_bitField0_ |= 0x00000040;
        }
        if (((from_bitField0_ & 0x00000080) != 0)) {
          result.numFailures_ = numFailures_;
          to_bitField0_ |= 0x00000080;
        }
        if (((from_bitField0_ & 0x00000100) != 0)) {
          result.completionTime_ = completionTime_;
          to_bitField0_ |= 0x00000100;
        }
        if (((from_bitField0_ & 0x00000200) != 0)) {
          to_bitField0_ |= 0x00000200;
        }
        result.lastFile_ = lastFile_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasPath()) {
          bitField0_ |= 0x00000002;
          path_ = other.path_;
          onChanged();
        }
        if (other.hasState()) {
          setState(other.getState());
        }
        if (other.hasEzKeyVersionName()) {
          bitField0_ |= 0x00000008;
          ezKeyVersionName_ = other.ezKeyVersionName_;
          onChanged();
        }
        if (other.hasSubmissionTime()) {
          setSubmissionTime(other.getSubmissionTime());
        }
        if (other.hasCanceled()) {
          setCanceled(other.getCanceled());
        }
        if (other.hasNumReencrypted()) {
          setNumReencrypted(other.getNumReencrypted());
        }
        if (other.hasNumFailures()) {
          setNumFailures(other.getNumFailures());
        }
        if (other.hasCompletionTime()) {
          setCompletionTime(other.getCompletionTime());
        }
        if (other.hasLastFile()) {
          bitField0_ |= 0x00000200;
          lastFile_ = other.lastFile_;
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
        if (!hasPath()) {
          return false;
        }
        if (!hasState()) {
          return false;
        }
        if (!hasEzKeyVersionName()) {
          return false;
        }
        if (!hasSubmissionTime()) {
          return false;
        }
        if (!hasCanceled()) {
          return false;
        }
        if (!hasNumReencrypted()) {
          return false;
        }
        if (!hasNumFailures()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long id_ ;
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

      private int state_ = 1;
      /**
       * <code>required .hadoop.hdfs.ReencryptionStateProto state = 3;</code>
       */
      public boolean hasState() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>required .hadoop.hdfs.ReencryptionStateProto state = 3;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptionStateProto getState() {
        @SuppressWarnings("deprecation")
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptionStateProto result = org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptionStateProto.valueOf(state_);
        return result == null ? org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptionStateProto.SUBMITTED : result;
      }
      /**
       * <code>required .hadoop.hdfs.ReencryptionStateProto state = 3;</code>
       */
      public Builder setState(org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ReencryptionStateProto value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        state_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ReencryptionStateProto state = 3;</code>
       */
      public Builder clearState() {
        bitField0_ = (bitField0_ & ~0x00000004);
        state_ = 1;
        onChanged();
        return this;
      }

      private java.lang.Object ezKeyVersionName_ = "";
      /**
       * <code>required string ezKeyVersionName = 4;</code>
       */
      public boolean hasEzKeyVersionName() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>required string ezKeyVersionName = 4;</code>
       */
      public java.lang.String getEzKeyVersionName() {
        java.lang.Object ref = ezKeyVersionName_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            ezKeyVersionName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string ezKeyVersionName = 4;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getEzKeyVersionNameBytes() {
        java.lang.Object ref = ezKeyVersionName_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          ezKeyVersionName_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string ezKeyVersionName = 4;</code>
       */
      public Builder setEzKeyVersionName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        ezKeyVersionName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string ezKeyVersionName = 4;</code>
       */
      public Builder clearEzKeyVersionName() {
        bitField0_ = (bitField0_ & ~0x00000008);
        ezKeyVersionName_ = getDefaultInstance().getEzKeyVersionName();
        onChanged();
        return this;
      }
      /**
       * <code>required string ezKeyVersionName = 4;</code>
       */
      public Builder setEzKeyVersionNameBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        ezKeyVersionName_ = value;
        onChanged();
        return this;
      }

      private long submissionTime_ ;
      /**
       * <code>required int64 submissionTime = 5;</code>
       */
      public boolean hasSubmissionTime() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <code>required int64 submissionTime = 5;</code>
       */
      public long getSubmissionTime() {
        return submissionTime_;
      }
      /**
       * <code>required int64 submissionTime = 5;</code>
       */
      public Builder setSubmissionTime(long value) {
        bitField0_ |= 0x00000010;
        submissionTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 submissionTime = 5;</code>
       */
      public Builder clearSubmissionTime() {
        bitField0_ = (bitField0_ & ~0x00000010);
        submissionTime_ = 0L;
        onChanged();
        return this;
      }

      private boolean canceled_ ;
      /**
       * <code>required bool canceled = 6;</code>
       */
      public boolean hasCanceled() {
        return ((bitField0_ & 0x00000020) != 0);
      }
      /**
       * <code>required bool canceled = 6;</code>
       */
      public boolean getCanceled() {
        return canceled_;
      }
      /**
       * <code>required bool canceled = 6;</code>
       */
      public Builder setCanceled(boolean value) {
        bitField0_ |= 0x00000020;
        canceled_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool canceled = 6;</code>
       */
      public Builder clearCanceled() {
        bitField0_ = (bitField0_ & ~0x00000020);
        canceled_ = false;
        onChanged();
        return this;
      }

      private long numReencrypted_ ;
      /**
       * <code>required int64 numReencrypted = 7;</code>
       */
      public boolean hasNumReencrypted() {
        return ((bitField0_ & 0x00000040) != 0);
      }
      /**
       * <code>required int64 numReencrypted = 7;</code>
       */
      public long getNumReencrypted() {
        return numReencrypted_;
      }
      /**
       * <code>required int64 numReencrypted = 7;</code>
       */
      public Builder setNumReencrypted(long value) {
        bitField0_ |= 0x00000040;
        numReencrypted_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 numReencrypted = 7;</code>
       */
      public Builder clearNumReencrypted() {
        bitField0_ = (bitField0_ & ~0x00000040);
        numReencrypted_ = 0L;
        onChanged();
        return this;
      }

      private long numFailures_ ;
      /**
       * <code>required int64 numFailures = 8;</code>
       */
      public boolean hasNumFailures() {
        return ((bitField0_ & 0x00000080) != 0);
      }
      /**
       * <code>required int64 numFailures = 8;</code>
       */
      public long getNumFailures() {
        return numFailures_;
      }
      /**
       * <code>required int64 numFailures = 8;</code>
       */
      public Builder setNumFailures(long value) {
        bitField0_ |= 0x00000080;
        numFailures_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 numFailures = 8;</code>
       */
      public Builder clearNumFailures() {
        bitField0_ = (bitField0_ & ~0x00000080);
        numFailures_ = 0L;
        onChanged();
        return this;
      }

      private long completionTime_ ;
      /**
       * <code>optional int64 completionTime = 9;</code>
       */
      public boolean hasCompletionTime() {
        return ((bitField0_ & 0x00000100) != 0);
      }
      /**
       * <code>optional int64 completionTime = 9;</code>
       */
      public long getCompletionTime() {
        return completionTime_;
      }
      /**
       * <code>optional int64 completionTime = 9;</code>
       */
      public Builder setCompletionTime(long value) {
        bitField0_ |= 0x00000100;
        completionTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 completionTime = 9;</code>
       */
      public Builder clearCompletionTime() {
        bitField0_ = (bitField0_ & ~0x00000100);
        completionTime_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object lastFile_ = "";
      /**
       * <code>optional string lastFile = 10;</code>
       */
      public boolean hasLastFile() {
        return ((bitField0_ & 0x00000200) != 0);
      }
      /**
       * <code>optional string lastFile = 10;</code>
       */
      public java.lang.String getLastFile() {
        java.lang.Object ref = lastFile_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            lastFile_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string lastFile = 10;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getLastFileBytes() {
        java.lang.Object ref = lastFile_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          lastFile_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string lastFile = 10;</code>
       */
      public Builder setLastFile(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000200;
        lastFile_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string lastFile = 10;</code>
       */
      public Builder clearLastFile() {
        bitField0_ = (bitField0_ & ~0x00000200);
        lastFile_ = getDefaultInstance().getLastFile();
        onChanged();
        return this;
      }
      /**
       * <code>optional string lastFile = 10;</code>
       */
      public Builder setLastFileBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000200;
        lastFile_ = value;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.ZoneReencryptionStatusProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ZoneReencryptionStatusProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<ZoneReencryptionStatusProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<ZoneReencryptionStatusProto>() {
      @java.lang.Override
      public ZoneReencryptionStatusProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new ZoneReencryptionStatusProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<ZoneReencryptionStatusProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<ZoneReencryptionStatusProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ListReencryptionStatusResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.ListReencryptionStatusResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .hadoop.hdfs.ZoneReencryptionStatusProto statuses = 1;</code>
     */
    java.util.List<org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto> 
        getStatusesList();
    /**
     * <code>repeated .hadoop.hdfs.ZoneReencryptionStatusProto statuses = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto getStatuses(int index);
    /**
     * <code>repeated .hadoop.hdfs.ZoneReencryptionStatusProto statuses = 1;</code>
     */
    int getStatusesCount();
    /**
     * <code>repeated .hadoop.hdfs.ZoneReencryptionStatusProto statuses = 1;</code>
     */
    java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProtoOrBuilder> 
        getStatusesOrBuilderList();
    /**
     * <code>repeated .hadoop.hdfs.ZoneReencryptionStatusProto statuses = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProtoOrBuilder getStatusesOrBuilder(
        int index);

    /**
     * <code>required bool hasMore = 2;</code>
     */
    boolean hasHasMore();
    /**
     * <code>required bool hasMore = 2;</code>
     */
    boolean getHasMore();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.ListReencryptionStatusResponseProto}
   */
  public  static final class ListReencryptionStatusResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.ListReencryptionStatusResponseProto)
      ListReencryptionStatusResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ListReencryptionStatusResponseProto.newBuilder() to construct.
    private ListReencryptionStatusResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ListReencryptionStatusResponseProto() {
      statuses_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ListReencryptionStatusResponseProto(
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
                statuses_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto>();
                mutable_bitField0_ |= 0x00000001;
              }
              statuses_.add(
                  input.readMessage(org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto.PARSER, extensionRegistry));
              break;
            }
            case 16: {
              bitField0_ |= 0x00000001;
              hasMore_ = input.readBool();
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
          statuses_ = java.util.Collections.unmodifiableList(statuses_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ListReencryptionStatusResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ListReencryptionStatusResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto.Builder.class);
    }

    private int bitField0_;
    public static final int STATUSES_FIELD_NUMBER = 1;
    private java.util.List<org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto> statuses_;
    /**
     * <code>repeated .hadoop.hdfs.ZoneReencryptionStatusProto statuses = 1;</code>
     */
    public java.util.List<org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto> getStatusesList() {
      return statuses_;
    }
    /**
     * <code>repeated .hadoop.hdfs.ZoneReencryptionStatusProto statuses = 1;</code>
     */
    public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProtoOrBuilder> 
        getStatusesOrBuilderList() {
      return statuses_;
    }
    /**
     * <code>repeated .hadoop.hdfs.ZoneReencryptionStatusProto statuses = 1;</code>
     */
    public int getStatusesCount() {
      return statuses_.size();
    }
    /**
     * <code>repeated .hadoop.hdfs.ZoneReencryptionStatusProto statuses = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto getStatuses(int index) {
      return statuses_.get(index);
    }
    /**
     * <code>repeated .hadoop.hdfs.ZoneReencryptionStatusProto statuses = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProtoOrBuilder getStatusesOrBuilder(
        int index) {
      return statuses_.get(index);
    }

    public static final int HASMORE_FIELD_NUMBER = 2;
    private boolean hasMore_;
    /**
     * <code>required bool hasMore = 2;</code>
     */
    public boolean hasHasMore() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required bool hasMore = 2;</code>
     */
    public boolean getHasMore() {
      return hasMore_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasHasMore()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getStatusesCount(); i++) {
        if (!getStatuses(i).isInitialized()) {
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
      for (int i = 0; i < statuses_.size(); i++) {
        output.writeMessage(1, statuses_.get(i));
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeBool(2, hasMore_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < statuses_.size(); i++) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(1, statuses_.get(i));
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeBoolSize(2, hasMore_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto) obj;

      if (!getStatusesList()
          .equals(other.getStatusesList())) return false;
      if (hasHasMore() != other.hasHasMore()) return false;
      if (hasHasMore()) {
        if (getHasMore()
            != other.getHasMore()) return false;
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
      if (getStatusesCount() > 0) {
        hash = (37 * hash) + STATUSES_FIELD_NUMBER;
        hash = (53 * hash) + getStatusesList().hashCode();
      }
      if (hasHasMore()) {
        hash = (37 * hash) + HASMORE_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashBoolean(
            getHasMore());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.ListReencryptionStatusResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.ListReencryptionStatusResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ListReencryptionStatusResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ListReencryptionStatusResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto.newBuilder()
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
          getStatusesFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (statusesBuilder_ == null) {
          statuses_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          statusesBuilder_.clear();
        }
        hasMore_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_ListReencryptionStatusResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (statusesBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            statuses_ = java.util.Collections.unmodifiableList(statuses_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.statuses_ = statuses_;
        } else {
          result.statuses_ = statusesBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.hasMore_ = hasMore_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto.getDefaultInstance()) return this;
        if (statusesBuilder_ == null) {
          if (!other.statuses_.isEmpty()) {
            if (statuses_.isEmpty()) {
              statuses_ = other.statuses_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureStatusesIsMutable();
              statuses_.addAll(other.statuses_);
            }
            onChanged();
          }
        } else {
          if (!other.statuses_.isEmpty()) {
            if (statusesBuilder_.isEmpty()) {
              statusesBuilder_.dispose();
              statusesBuilder_ = null;
              statuses_ = other.statuses_;
              bitField0_ = (bitField0_ & ~0x00000001);
              statusesBuilder_ = 
                org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getStatusesFieldBuilder() : null;
            } else {
              statusesBuilder_.addAllMessages(other.statuses_);
            }
          }
        }
        if (other.hasHasMore()) {
          setHasMore(other.getHasMore());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasHasMore()) {
          return false;
        }
        for (int i = 0; i < getStatusesCount(); i++) {
          if (!getStatuses(i).isInitialized()) {
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
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto> statuses_ =
        java.util.Collections.emptyList();
      private void ensureStatusesIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          statuses_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto>(statuses_);
          bitField0_ |= 0x00000001;
         }
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto.Builder, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProtoOrBuilder> statusesBuilder_;

      /**
       * <code>repeated .hadoop.hdfs.ZoneReencryptionStatusProto statuses = 1;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto> getStatusesList() {
        if (statusesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(statuses_);
        } else {
          return statusesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.ZoneReencryptionStatusProto statuses = 1;</code>
       */
      public int getStatusesCount() {
        if (statusesBuilder_ == null) {
          return statuses_.size();
        } else {
          return statusesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.ZoneReencryptionStatusProto statuses = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto getStatuses(int index) {
        if (statusesBuilder_ == null) {
          return statuses_.get(index);
        } else {
          return statusesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.ZoneReencryptionStatusProto statuses = 1;</code>
       */
      public Builder setStatuses(
          int index, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto value) {
        if (statusesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStatusesIsMutable();
          statuses_.set(index, value);
          onChanged();
        } else {
          statusesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.ZoneReencryptionStatusProto statuses = 1;</code>
       */
      public Builder setStatuses(
          int index, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto.Builder builderForValue) {
        if (statusesBuilder_ == null) {
          ensureStatusesIsMutable();
          statuses_.set(index, builderForValue.build());
          onChanged();
        } else {
          statusesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.ZoneReencryptionStatusProto statuses = 1;</code>
       */
      public Builder addStatuses(org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto value) {
        if (statusesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStatusesIsMutable();
          statuses_.add(value);
          onChanged();
        } else {
          statusesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.ZoneReencryptionStatusProto statuses = 1;</code>
       */
      public Builder addStatuses(
          int index, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto value) {
        if (statusesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStatusesIsMutable();
          statuses_.add(index, value);
          onChanged();
        } else {
          statusesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.ZoneReencryptionStatusProto statuses = 1;</code>
       */
      public Builder addStatuses(
          org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto.Builder builderForValue) {
        if (statusesBuilder_ == null) {
          ensureStatusesIsMutable();
          statuses_.add(builderForValue.build());
          onChanged();
        } else {
          statusesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.ZoneReencryptionStatusProto statuses = 1;</code>
       */
      public Builder addStatuses(
          int index, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto.Builder builderForValue) {
        if (statusesBuilder_ == null) {
          ensureStatusesIsMutable();
          statuses_.add(index, builderForValue.build());
          onChanged();
        } else {
          statusesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.ZoneReencryptionStatusProto statuses = 1;</code>
       */
      public Builder addAllStatuses(
          java.lang.Iterable<? extends org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto> values) {
        if (statusesBuilder_ == null) {
          ensureStatusesIsMutable();
          org.apache.hadoop.thirdparty.protobuf.AbstractMessageLite.Builder.addAll(
              values, statuses_);
          onChanged();
        } else {
          statusesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.ZoneReencryptionStatusProto statuses = 1;</code>
       */
      public Builder clearStatuses() {
        if (statusesBuilder_ == null) {
          statuses_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          statusesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.ZoneReencryptionStatusProto statuses = 1;</code>
       */
      public Builder removeStatuses(int index) {
        if (statusesBuilder_ == null) {
          ensureStatusesIsMutable();
          statuses_.remove(index);
          onChanged();
        } else {
          statusesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.ZoneReencryptionStatusProto statuses = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto.Builder getStatusesBuilder(
          int index) {
        return getStatusesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.hdfs.ZoneReencryptionStatusProto statuses = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProtoOrBuilder getStatusesOrBuilder(
          int index) {
        if (statusesBuilder_ == null) {
          return statuses_.get(index);  } else {
          return statusesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.ZoneReencryptionStatusProto statuses = 1;</code>
       */
      public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProtoOrBuilder> 
           getStatusesOrBuilderList() {
        if (statusesBuilder_ != null) {
          return statusesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(statuses_);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.ZoneReencryptionStatusProto statuses = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto.Builder addStatusesBuilder() {
        return getStatusesFieldBuilder().addBuilder(
            org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.ZoneReencryptionStatusProto statuses = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto.Builder addStatusesBuilder(
          int index) {
        return getStatusesFieldBuilder().addBuilder(
            index, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.ZoneReencryptionStatusProto statuses = 1;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto.Builder> 
           getStatusesBuilderList() {
        return getStatusesFieldBuilder().getBuilderList();
      }
      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto.Builder, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProtoOrBuilder> 
          getStatusesFieldBuilder() {
        if (statusesBuilder_ == null) {
          statusesBuilder_ = new org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProto.Builder, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ZoneReencryptionStatusProtoOrBuilder>(
                  statuses_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          statuses_ = null;
        }
        return statusesBuilder_;
      }

      private boolean hasMore_ ;
      /**
       * <code>required bool hasMore = 2;</code>
       */
      public boolean hasHasMore() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required bool hasMore = 2;</code>
       */
      public boolean getHasMore() {
        return hasMore_;
      }
      /**
       * <code>required bool hasMore = 2;</code>
       */
      public Builder setHasMore(boolean value) {
        bitField0_ |= 0x00000002;
        hasMore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool hasMore = 2;</code>
       */
      public Builder clearHasMore() {
        bitField0_ = (bitField0_ & ~0x00000002);
        hasMore_ = false;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.ListReencryptionStatusResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ListReencryptionStatusResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<ListReencryptionStatusResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<ListReencryptionStatusResponseProto>() {
      @java.lang.Override
      public ListReencryptionStatusResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new ListReencryptionStatusResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<ListReencryptionStatusResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<ListReencryptionStatusResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.ListReencryptionStatusResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GetEZForPathRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.GetEZForPathRequestProto)
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
   * Protobuf type {@code hadoop.hdfs.GetEZForPathRequestProto}
   */
  public  static final class GetEZForPathRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.GetEZForPathRequestProto)
      GetEZForPathRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetEZForPathRequestProto.newBuilder() to construct.
    private GetEZForPathRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetEZForPathRequestProto() {
      src_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetEZForPathRequestProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_GetEZForPathRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_GetEZForPathRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto.Builder.class);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.GetEZForPathRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.GetEZForPathRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_GetEZForPathRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_GetEZForPathRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_GetEZForPathRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto(this);
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto) e.getUnfinishedMessage();
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetEZForPathRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetEZForPathRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<GetEZForPathRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<GetEZForPathRequestProto>() {
      @java.lang.Override
      public GetEZForPathRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new GetEZForPathRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<GetEZForPathRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<GetEZForPathRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GetEZForPathResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.GetEZForPathResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>optional .hadoop.hdfs.EncryptionZoneProto zone = 1;</code>
     */
    boolean hasZone();
    /**
     * <code>optional .hadoop.hdfs.EncryptionZoneProto zone = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto getZone();
    /**
     * <code>optional .hadoop.hdfs.EncryptionZoneProto zone = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProtoOrBuilder getZoneOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.GetEZForPathResponseProto}
   */
  public  static final class GetEZForPathResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.GetEZForPathResponseProto)
      GetEZForPathResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetEZForPathResponseProto.newBuilder() to construct.
    private GetEZForPathResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetEZForPathResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetEZForPathResponseProto(
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
              org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = zone_.toBuilder();
              }
              zone_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(zone_);
                zone_ = subBuilder.buildPartial();
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
      return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_GetEZForPathResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_GetEZForPathResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto.Builder.class);
    }

    private int bitField0_;
    public static final int ZONE_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto zone_;
    /**
     * <code>optional .hadoop.hdfs.EncryptionZoneProto zone = 1;</code>
     */
    public boolean hasZone() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .hadoop.hdfs.EncryptionZoneProto zone = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto getZone() {
      return zone_ == null ? org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto.getDefaultInstance() : zone_;
    }
    /**
     * <code>optional .hadoop.hdfs.EncryptionZoneProto zone = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProtoOrBuilder getZoneOrBuilder() {
      return zone_ == null ? org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto.getDefaultInstance() : zone_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (hasZone()) {
        if (!getZone().isInitialized()) {
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
        output.writeMessage(1, getZone());
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
          .computeMessageSize(1, getZone());
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto) obj;

      if (hasZone() != other.hasZone()) return false;
      if (hasZone()) {
        if (!getZone()
            .equals(other.getZone())) return false;
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
      if (hasZone()) {
        hash = (37 * hash) + ZONE_FIELD_NUMBER;
        hash = (53 * hash) + getZone().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.GetEZForPathResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.GetEZForPathResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_GetEZForPathResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_GetEZForPathResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto.newBuilder()
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
          getZoneFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (zoneBuilder_ == null) {
          zone_ = null;
        } else {
          zoneBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.internal_static_hadoop_hdfs_GetEZForPathResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (zoneBuilder_ == null) {
            result.zone_ = zone_;
          } else {
            result.zone_ = zoneBuilder_.build();
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto.getDefaultInstance()) return this;
        if (other.hasZone()) {
          mergeZone(other.getZone());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (hasZone()) {
          if (!getZone().isInitialized()) {
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
        org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto zone_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto.Builder, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProtoOrBuilder> zoneBuilder_;
      /**
       * <code>optional .hadoop.hdfs.EncryptionZoneProto zone = 1;</code>
       */
      public boolean hasZone() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional .hadoop.hdfs.EncryptionZoneProto zone = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto getZone() {
        if (zoneBuilder_ == null) {
          return zone_ == null ? org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto.getDefaultInstance() : zone_;
        } else {
          return zoneBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .hadoop.hdfs.EncryptionZoneProto zone = 1;</code>
       */
      public Builder setZone(org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto value) {
        if (zoneBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          zone_ = value;
          onChanged();
        } else {
          zoneBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.EncryptionZoneProto zone = 1;</code>
       */
      public Builder setZone(
          org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto.Builder builderForValue) {
        if (zoneBuilder_ == null) {
          zone_ = builderForValue.build();
          onChanged();
        } else {
          zoneBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.EncryptionZoneProto zone = 1;</code>
       */
      public Builder mergeZone(org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto value) {
        if (zoneBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              zone_ != null &&
              zone_ != org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto.getDefaultInstance()) {
            zone_ =
              org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto.newBuilder(zone_).mergeFrom(value).buildPartial();
          } else {
            zone_ = value;
          }
          onChanged();
        } else {
          zoneBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.EncryptionZoneProto zone = 1;</code>
       */
      public Builder clearZone() {
        if (zoneBuilder_ == null) {
          zone_ = null;
          onChanged();
        } else {
          zoneBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.EncryptionZoneProto zone = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto.Builder getZoneBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getZoneFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .hadoop.hdfs.EncryptionZoneProto zone = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProtoOrBuilder getZoneOrBuilder() {
        if (zoneBuilder_ != null) {
          return zoneBuilder_.getMessageOrBuilder();
        } else {
          return zone_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto.getDefaultInstance() : zone_;
        }
      }
      /**
       * <code>optional .hadoop.hdfs.EncryptionZoneProto zone = 1;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto.Builder, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProtoOrBuilder> 
          getZoneFieldBuilder() {
        if (zoneBuilder_ == null) {
          zoneBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProto.Builder, org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.EncryptionZoneProtoOrBuilder>(
                  getZone(),
                  getParentForChildren(),
                  isClean());
          zone_ = null;
        }
        return zoneBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetEZForPathResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetEZForPathResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<GetEZForPathResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<GetEZForPathResponseProto>() {
      @java.lang.Override
      public GetEZForPathResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new GetEZForPathResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<GetEZForPathResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<GetEZForPathResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.EncryptionZonesProtos.GetEZForPathResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_CreateEncryptionZoneRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_CreateEncryptionZoneRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_CreateEncryptionZoneResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_CreateEncryptionZoneResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_ListEncryptionZonesRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_ListEncryptionZonesRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_EncryptionZoneProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_EncryptionZoneProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_ListEncryptionZonesResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_ListEncryptionZonesResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_ReencryptEncryptionZoneRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_ReencryptEncryptionZoneRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_ReencryptEncryptionZoneResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_ReencryptEncryptionZoneResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_ListReencryptionStatusRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_ListReencryptionStatusRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_ZoneReencryptionStatusProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_ZoneReencryptionStatusProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_ListReencryptionStatusResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_ListReencryptionStatusResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetEZForPathRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_GetEZForPathRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetEZForPathResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_GetEZForPathResponseProto_fieldAccessorTable;

  public static org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020encryption.proto\022\013hadoop.hdfs\032\nhdfs.pr" +
      "oto\"@\n CreateEncryptionZoneRequestProto\022" +
      "\013\n\003src\030\001 \002(\t\022\017\n\007keyName\030\002 \001(\t\"#\n!CreateE" +
      "ncryptionZoneResponseProto\"-\n\037ListEncryp" +
      "tionZonesRequestProto\022\n\n\002id\030\001 \002(\003\"\266\001\n\023En" +
      "cryptionZoneProto\022\n\n\002id\030\001 \002(\003\022\014\n\004path\030\002 " +
      "\002(\t\022,\n\005suite\030\003 \002(\0162\035.hadoop.hdfs.CipherS" +
      "uiteProto\022F\n\025cryptoProtocolVersion\030\004 \002(\016" +
      "2\'.hadoop.hdfs.CryptoProtocolVersionProt" +
      "o\022\017\n\007keyName\030\005 \002(\t\"d\n ListEncryptionZone" +
      "sResponseProto\022/\n\005zones\030\001 \003(\0132 .hadoop.h" +
      "dfs.EncryptionZoneProto\022\017\n\007hasMore\030\002 \002(\010" +
      "\"f\n#ReencryptEncryptionZoneRequestProto\022" +
      "1\n\006action\030\001 \002(\0162!.hadoop.hdfs.ReencryptA" +
      "ctionProto\022\014\n\004zone\030\002 \002(\t\"&\n$ReencryptEnc" +
      "ryptionZoneResponseProto\"0\n\"ListReencryp" +
      "tionStatusRequestProto\022\n\n\002id\030\001 \002(\003\"\206\002\n\033Z" +
      "oneReencryptionStatusProto\022\n\n\002id\030\001 \002(\003\022\014" +
      "\n\004path\030\002 \002(\t\0222\n\005state\030\003 \002(\0162#.hadoop.hdf" +
      "s.ReencryptionStateProto\022\030\n\020ezKeyVersion" +
      "Name\030\004 \002(\t\022\026\n\016submissionTime\030\005 \002(\003\022\020\n\010ca" +
      "nceled\030\006 \002(\010\022\026\n\016numReencrypted\030\007 \002(\003\022\023\n\013" +
      "numFailures\030\010 \002(\003\022\026\n\016completionTime\030\t \001(" +
      "\003\022\020\n\010lastFile\030\n \001(\t\"r\n#ListReencryptionS" +
      "tatusResponseProto\022:\n\010statuses\030\001 \003(\0132(.h" +
      "adoop.hdfs.ZoneReencryptionStatusProto\022\017" +
      "\n\007hasMore\030\002 \002(\010\"\'\n\030GetEZForPathRequestPr" +
      "oto\022\013\n\003src\030\001 \002(\t\"K\n\031GetEZForPathResponse" +
      "Proto\022.\n\004zone\030\001 \001(\0132 .hadoop.hdfs.Encryp" +
      "tionZoneProto*A\n\024ReencryptActionProto\022\024\n" +
      "\020CANCEL_REENCRYPT\020\001\022\023\n\017START_REENCRYPT\020\002" +
      "*F\n\026ReencryptionStateProto\022\r\n\tSUBMITTED\020" +
      "\001\022\016\n\nPROCESSING\020\002\022\r\n\tCOMPLETED\020\003BA\n%org." +
      "apache.hadoop.hdfs.protocol.protoB\025Encry" +
      "ptionZonesProtos\240\001\001"
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
        }, assigner);
    internal_static_hadoop_hdfs_CreateEncryptionZoneRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hadoop_hdfs_CreateEncryptionZoneRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_CreateEncryptionZoneRequestProto_descriptor,
        new java.lang.String[] { "Src", "KeyName", });
    internal_static_hadoop_hdfs_CreateEncryptionZoneResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hadoop_hdfs_CreateEncryptionZoneResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_CreateEncryptionZoneResponseProto_descriptor,
        new java.lang.String[] { });
    internal_static_hadoop_hdfs_ListEncryptionZonesRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_hadoop_hdfs_ListEncryptionZonesRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_ListEncryptionZonesRequestProto_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_hadoop_hdfs_EncryptionZoneProto_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_hadoop_hdfs_EncryptionZoneProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_EncryptionZoneProto_descriptor,
        new java.lang.String[] { "Id", "Path", "Suite", "CryptoProtocolVersion", "KeyName", });
    internal_static_hadoop_hdfs_ListEncryptionZonesResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_hadoop_hdfs_ListEncryptionZonesResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_ListEncryptionZonesResponseProto_descriptor,
        new java.lang.String[] { "Zones", "HasMore", });
    internal_static_hadoop_hdfs_ReencryptEncryptionZoneRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_hadoop_hdfs_ReencryptEncryptionZoneRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_ReencryptEncryptionZoneRequestProto_descriptor,
        new java.lang.String[] { "Action", "Zone", });
    internal_static_hadoop_hdfs_ReencryptEncryptionZoneResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_hadoop_hdfs_ReencryptEncryptionZoneResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_ReencryptEncryptionZoneResponseProto_descriptor,
        new java.lang.String[] { });
    internal_static_hadoop_hdfs_ListReencryptionStatusRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_hadoop_hdfs_ListReencryptionStatusRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_ListReencryptionStatusRequestProto_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_hadoop_hdfs_ZoneReencryptionStatusProto_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_hadoop_hdfs_ZoneReencryptionStatusProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_ZoneReencryptionStatusProto_descriptor,
        new java.lang.String[] { "Id", "Path", "State", "EzKeyVersionName", "SubmissionTime", "Canceled", "NumReencrypted", "NumFailures", "CompletionTime", "LastFile", });
    internal_static_hadoop_hdfs_ListReencryptionStatusResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_hadoop_hdfs_ListReencryptionStatusResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_ListReencryptionStatusResponseProto_descriptor,
        new java.lang.String[] { "Statuses", "HasMore", });
    internal_static_hadoop_hdfs_GetEZForPathRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_hadoop_hdfs_GetEZForPathRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_GetEZForPathRequestProto_descriptor,
        new java.lang.String[] { "Src", });
    internal_static_hadoop_hdfs_GetEZForPathResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_hadoop_hdfs_GetEZForPathResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_GetEZForPathResponseProto_descriptor,
        new java.lang.String[] { "Zone", });
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
