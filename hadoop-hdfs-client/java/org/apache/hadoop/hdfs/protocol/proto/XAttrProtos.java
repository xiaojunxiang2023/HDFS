// source: xattr.proto

package org.apache.hadoop.hdfs.protocol.proto;

public final class XAttrProtos {
  private XAttrProtos() {}
  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code hadoop.hdfs.XAttrSetFlagProto}
   */
  public enum XAttrSetFlagProto
      implements org.apache.hadoop.thirdparty.protobuf.ProtocolMessageEnum {
    /**
     * <code>XATTR_CREATE = 1;</code>
     */
    XATTR_CREATE(1),
    /**
     * <code>XATTR_REPLACE = 2;</code>
     */
    XATTR_REPLACE(2),
    ;

    /**
     * <code>XATTR_CREATE = 1;</code>
     */
    public static final int XATTR_CREATE_VALUE = 1;
    /**
     * <code>XATTR_REPLACE = 2;</code>
     */
    public static final int XATTR_REPLACE_VALUE = 2;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static XAttrSetFlagProto valueOf(int value) {
      return forNumber(value);
    }

    public static XAttrSetFlagProto forNumber(int value) {
      switch (value) {
        case 1: return XATTR_CREATE;
        case 2: return XATTR_REPLACE;
        default: return null;
      }
    }

    public static org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<XAttrSetFlagProto>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<
        XAttrSetFlagProto> internalValueMap =
          new org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<XAttrSetFlagProto>() {
            public XAttrSetFlagProto findValueByNumber(int number) {
              return XAttrSetFlagProto.forNumber(number);
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
      return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.getDescriptor().getEnumTypes().get(0);
    }

    private static final XAttrSetFlagProto[] VALUES = values();

    public static XAttrSetFlagProto valueOf(
        org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private XAttrSetFlagProto(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:hadoop.hdfs.XAttrSetFlagProto)
  }

  public interface XAttrProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.XAttrProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required .hadoop.hdfs.XAttrProto.XAttrNamespaceProto namespace = 1;</code>
     */
    boolean hasNamespace();
    /**
     * <code>required .hadoop.hdfs.XAttrProto.XAttrNamespaceProto namespace = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.XAttrNamespaceProto getNamespace();

    /**
     * <code>required string name = 2;</code>
     */
    boolean hasName();
    /**
     * <code>required string name = 2;</code>
     */
    java.lang.String getName();
    /**
     * <code>required string name = 2;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getNameBytes();

    /**
     * <code>optional bytes value = 3;</code>
     */
    boolean hasValue();
    /**
     * <code>optional bytes value = 3;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString getValue();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.XAttrProto}
   */
  public  static final class XAttrProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.XAttrProto)
      XAttrProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use XAttrProto.newBuilder() to construct.
    private XAttrProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private XAttrProto() {
      namespace_ = 0;
      name_ = "";
      value_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private XAttrProto(
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
              org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.XAttrNamespaceProto value = org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.XAttrNamespaceProto.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                namespace_ = rawValue;
              }
              break;
            }
            case 18: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              name_ = bs;
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              value_ = input.readBytes();
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
      return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_XAttrProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_XAttrProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.class, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder.class);
    }

    /**
     * Protobuf enum {@code hadoop.hdfs.XAttrProto.XAttrNamespaceProto}
     */
    public enum XAttrNamespaceProto
        implements org.apache.hadoop.thirdparty.protobuf.ProtocolMessageEnum {
      /**
       * <code>USER = 0;</code>
       */
      USER(0),
      /**
       * <code>TRUSTED = 1;</code>
       */
      TRUSTED(1),
      /**
       * <code>SECURITY = 2;</code>
       */
      SECURITY(2),
      /**
       * <code>SYSTEM = 3;</code>
       */
      SYSTEM(3),
      /**
       * <code>RAW = 4;</code>
       */
      RAW(4),
      ;

      /**
       * <code>USER = 0;</code>
       */
      public static final int USER_VALUE = 0;
      /**
       * <code>TRUSTED = 1;</code>
       */
      public static final int TRUSTED_VALUE = 1;
      /**
       * <code>SECURITY = 2;</code>
       */
      public static final int SECURITY_VALUE = 2;
      /**
       * <code>SYSTEM = 3;</code>
       */
      public static final int SYSTEM_VALUE = 3;
      /**
       * <code>RAW = 4;</code>
       */
      public static final int RAW_VALUE = 4;


      public final int getNumber() {
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static XAttrNamespaceProto valueOf(int value) {
        return forNumber(value);
      }

      public static XAttrNamespaceProto forNumber(int value) {
        switch (value) {
          case 0: return USER;
          case 1: return TRUSTED;
          case 2: return SECURITY;
          case 3: return SYSTEM;
          case 4: return RAW;
          default: return null;
        }
      }

      public static org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<XAttrNamespaceProto>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<
          XAttrNamespaceProto> internalValueMap =
            new org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<XAttrNamespaceProto>() {
              public XAttrNamespaceProto findValueByNumber(int number) {
                return XAttrNamespaceProto.forNumber(number);
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
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.getDescriptor().getEnumTypes().get(0);
      }

      private static final XAttrNamespaceProto[] VALUES = values();

      public static XAttrNamespaceProto valueOf(
          org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private XAttrNamespaceProto(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:hadoop.hdfs.XAttrProto.XAttrNamespaceProto)
    }

    private int bitField0_;
    public static final int NAMESPACE_FIELD_NUMBER = 1;
    private int namespace_;
    /**
     * <code>required .hadoop.hdfs.XAttrProto.XAttrNamespaceProto namespace = 1;</code>
     */
    public boolean hasNamespace() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required .hadoop.hdfs.XAttrProto.XAttrNamespaceProto namespace = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.XAttrNamespaceProto getNamespace() {
      @SuppressWarnings("deprecation")
      org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.XAttrNamespaceProto result = org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.XAttrNamespaceProto.valueOf(namespace_);
      return result == null ? org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.XAttrNamespaceProto.USER : result;
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object name_;
    /**
     * <code>required string name = 2;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required string name = 2;</code>
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
     * <code>required string name = 2;</code>
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

    public static final int VALUE_FIELD_NUMBER = 3;
    private org.apache.hadoop.thirdparty.protobuf.ByteString value_;
    /**
     * <code>optional bytes value = 3;</code>
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional bytes value = 3;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString getValue() {
      return value_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasNamespace()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasName()) {
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
        output.writeEnum(1, namespace_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeBytes(3, value_);
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
          .computeEnumSize(1, namespace_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeBytesSize(3, value_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto other = (org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto) obj;

      if (hasNamespace() != other.hasNamespace()) return false;
      if (hasNamespace()) {
        if (namespace_ != other.namespace_) return false;
      }
      if (hasName() != other.hasName()) return false;
      if (hasName()) {
        if (!getName()
            .equals(other.getName())) return false;
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
      if (hasNamespace()) {
        hash = (37 * hash) + NAMESPACE_FIELD_NUMBER;
        hash = (53 * hash) + namespace_;
      }
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasValue()) {
        hash = (37 * hash) + VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getValue().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.XAttrProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.XAttrProto)
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_XAttrProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_XAttrProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.class, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.newBuilder()
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
        namespace_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        value_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_XAttrProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto build() {
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto result = new org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.namespace_ = namespace_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.getDefaultInstance()) return this;
        if (other.hasNamespace()) {
          setNamespace(other.getNamespace());
        }
        if (other.hasName()) {
          bitField0_ |= 0x00000002;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasValue()) {
          setValue(other.getValue());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasNamespace()) {
          return false;
        }
        if (!hasName()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int namespace_ = 0;
      /**
       * <code>required .hadoop.hdfs.XAttrProto.XAttrNamespaceProto namespace = 1;</code>
       */
      public boolean hasNamespace() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required .hadoop.hdfs.XAttrProto.XAttrNamespaceProto namespace = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.XAttrNamespaceProto getNamespace() {
        @SuppressWarnings("deprecation")
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.XAttrNamespaceProto result = org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.XAttrNamespaceProto.valueOf(namespace_);
        return result == null ? org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.XAttrNamespaceProto.USER : result;
      }
      /**
       * <code>required .hadoop.hdfs.XAttrProto.XAttrNamespaceProto namespace = 1;</code>
       */
      public Builder setNamespace(org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.XAttrNamespaceProto value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        namespace_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.XAttrProto.XAttrNamespaceProto namespace = 1;</code>
       */
      public Builder clearNamespace() {
        bitField0_ = (bitField0_ & ~0x00000001);
        namespace_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>required string name = 2;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required string name = 2;</code>
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
       * <code>required string name = 2;</code>
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
       * <code>required string name = 2;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 2;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 2;</code>
       */
      public Builder setNameBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }

      private org.apache.hadoop.thirdparty.protobuf.ByteString value_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes value = 3;</code>
       */
      public boolean hasValue() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional bytes value = 3;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString getValue() {
        return value_;
      }
      /**
       * <code>optional bytes value = 3;</code>
       */
      public Builder setValue(org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes value = 3;</code>
       */
      public Builder clearValue() {
        bitField0_ = (bitField0_ & ~0x00000004);
        value_ = getDefaultInstance().getValue();
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.XAttrProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.XAttrProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<XAttrProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<XAttrProto>() {
      @java.lang.Override
      public XAttrProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new XAttrProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<XAttrProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<XAttrProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface SetXAttrRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.SetXAttrRequestProto)
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
     * <code>optional .hadoop.hdfs.XAttrProto xAttr = 2;</code>
     */
    boolean hasXAttr();
    /**
     * <code>optional .hadoop.hdfs.XAttrProto xAttr = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto getXAttr();
    /**
     * <code>optional .hadoop.hdfs.XAttrProto xAttr = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder getXAttrOrBuilder();

    /**
     * <pre>
     *bits set using XAttrSetFlagProto
     * </pre>
     *
     * <code>optional uint32 flag = 3;</code>
     */
    boolean hasFlag();
    /**
     * <pre>
     *bits set using XAttrSetFlagProto
     * </pre>
     *
     * <code>optional uint32 flag = 3;</code>
     */
    int getFlag();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.SetXAttrRequestProto}
   */
  public  static final class SetXAttrRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.SetXAttrRequestProto)
      SetXAttrRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetXAttrRequestProto.newBuilder() to construct.
    private SetXAttrRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetXAttrRequestProto() {
      src_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SetXAttrRequestProto(
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
              org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) != 0)) {
                subBuilder = xAttr_.toBuilder();
              }
              xAttr_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(xAttr_);
                xAttr_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              flag_ = input.readUInt32();
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
      return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_SetXAttrRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_SetXAttrRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto.Builder.class);
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

    public static final int XATTR_FIELD_NUMBER = 2;
    private org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto xAttr_;
    /**
     * <code>optional .hadoop.hdfs.XAttrProto xAttr = 2;</code>
     */
    public boolean hasXAttr() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .hadoop.hdfs.XAttrProto xAttr = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto getXAttr() {
      return xAttr_ == null ? org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.getDefaultInstance() : xAttr_;
    }
    /**
     * <code>optional .hadoop.hdfs.XAttrProto xAttr = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder getXAttrOrBuilder() {
      return xAttr_ == null ? org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.getDefaultInstance() : xAttr_;
    }

    public static final int FLAG_FIELD_NUMBER = 3;
    private int flag_;
    /**
     * <pre>
     *bits set using XAttrSetFlagProto
     * </pre>
     *
     * <code>optional uint32 flag = 3;</code>
     */
    public boolean hasFlag() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     *bits set using XAttrSetFlagProto
     * </pre>
     *
     * <code>optional uint32 flag = 3;</code>
     */
    public int getFlag() {
      return flag_;
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
      if (hasXAttr()) {
        if (!getXAttr().isInitialized()) {
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
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeMessage(2, getXAttr());
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeUInt32(3, flag_);
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
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(2, getXAttr());
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeUInt32Size(3, flag_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto) obj;

      if (hasSrc() != other.hasSrc()) return false;
      if (hasSrc()) {
        if (!getSrc()
            .equals(other.getSrc())) return false;
      }
      if (hasXAttr() != other.hasXAttr()) return false;
      if (hasXAttr()) {
        if (!getXAttr()
            .equals(other.getXAttr())) return false;
      }
      if (hasFlag() != other.hasFlag()) return false;
      if (hasFlag()) {
        if (getFlag()
            != other.getFlag()) return false;
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
      if (hasXAttr()) {
        hash = (37 * hash) + XATTR_FIELD_NUMBER;
        hash = (53 * hash) + getXAttr().hashCode();
      }
      if (hasFlag()) {
        hash = (37 * hash) + FLAG_FIELD_NUMBER;
        hash = (53 * hash) + getFlag();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.SetXAttrRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.SetXAttrRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_SetXAttrRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_SetXAttrRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto.newBuilder()
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
          getXAttrFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        src_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (xAttrBuilder_ == null) {
          xAttr_ = null;
        } else {
          xAttrBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        flag_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_SetXAttrRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.src_ = src_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          if (xAttrBuilder_ == null) {
            result.xAttr_ = xAttr_;
          } else {
            result.xAttr_ = xAttrBuilder_.build();
          }
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.flag_ = flag_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto.getDefaultInstance()) return this;
        if (other.hasSrc()) {
          bitField0_ |= 0x00000001;
          src_ = other.src_;
          onChanged();
        }
        if (other.hasXAttr()) {
          mergeXAttr(other.getXAttr());
        }
        if (other.hasFlag()) {
          setFlag(other.getFlag());
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
        if (hasXAttr()) {
          if (!getXAttr().isInitialized()) {
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
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto) e.getUnfinishedMessage();
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

      private org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto xAttr_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder> xAttrBuilder_;
      /**
       * <code>optional .hadoop.hdfs.XAttrProto xAttr = 2;</code>
       */
      public boolean hasXAttr() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional .hadoop.hdfs.XAttrProto xAttr = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto getXAttr() {
        if (xAttrBuilder_ == null) {
          return xAttr_ == null ? org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.getDefaultInstance() : xAttr_;
        } else {
          return xAttrBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .hadoop.hdfs.XAttrProto xAttr = 2;</code>
       */
      public Builder setXAttr(org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto value) {
        if (xAttrBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          xAttr_ = value;
          onChanged();
        } else {
          xAttrBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.XAttrProto xAttr = 2;</code>
       */
      public Builder setXAttr(
          org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder builderForValue) {
        if (xAttrBuilder_ == null) {
          xAttr_ = builderForValue.build();
          onChanged();
        } else {
          xAttrBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.XAttrProto xAttr = 2;</code>
       */
      public Builder mergeXAttr(org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto value) {
        if (xAttrBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
              xAttr_ != null &&
              xAttr_ != org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.getDefaultInstance()) {
            xAttr_ =
              org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.newBuilder(xAttr_).mergeFrom(value).buildPartial();
          } else {
            xAttr_ = value;
          }
          onChanged();
        } else {
          xAttrBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.XAttrProto xAttr = 2;</code>
       */
      public Builder clearXAttr() {
        if (xAttrBuilder_ == null) {
          xAttr_ = null;
          onChanged();
        } else {
          xAttrBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.XAttrProto xAttr = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder getXAttrBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getXAttrFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .hadoop.hdfs.XAttrProto xAttr = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder getXAttrOrBuilder() {
        if (xAttrBuilder_ != null) {
          return xAttrBuilder_.getMessageOrBuilder();
        } else {
          return xAttr_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.getDefaultInstance() : xAttr_;
        }
      }
      /**
       * <code>optional .hadoop.hdfs.XAttrProto xAttr = 2;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder> 
          getXAttrFieldBuilder() {
        if (xAttrBuilder_ == null) {
          xAttrBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder>(
                  getXAttr(),
                  getParentForChildren(),
                  isClean());
          xAttr_ = null;
        }
        return xAttrBuilder_;
      }

      private int flag_ ;
      /**
       * <pre>
       *bits set using XAttrSetFlagProto
       * </pre>
       *
       * <code>optional uint32 flag = 3;</code>
       */
      public boolean hasFlag() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       *bits set using XAttrSetFlagProto
       * </pre>
       *
       * <code>optional uint32 flag = 3;</code>
       */
      public int getFlag() {
        return flag_;
      }
      /**
       * <pre>
       *bits set using XAttrSetFlagProto
       * </pre>
       *
       * <code>optional uint32 flag = 3;</code>
       */
      public Builder setFlag(int value) {
        bitField0_ |= 0x00000004;
        flag_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *bits set using XAttrSetFlagProto
       * </pre>
       *
       * <code>optional uint32 flag = 3;</code>
       */
      public Builder clearFlag() {
        bitField0_ = (bitField0_ & ~0x00000004);
        flag_ = 0;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.SetXAttrRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.SetXAttrRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<SetXAttrRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<SetXAttrRequestProto>() {
      @java.lang.Override
      public SetXAttrRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new SetXAttrRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<SetXAttrRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<SetXAttrRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface SetXAttrResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.SetXAttrResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.SetXAttrResponseProto}
   */
  public  static final class SetXAttrResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.SetXAttrResponseProto)
      SetXAttrResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetXAttrResponseProto.newBuilder() to construct.
    private SetXAttrResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetXAttrResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SetXAttrResponseProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_SetXAttrResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_SetXAttrResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto.Builder.class);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.SetXAttrResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.SetXAttrResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_SetXAttrResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_SetXAttrResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_SetXAttrResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto(this);
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto) e.getUnfinishedMessage();
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.SetXAttrResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.SetXAttrResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<SetXAttrResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<SetXAttrResponseProto>() {
      @java.lang.Override
      public SetXAttrResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new SetXAttrResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<SetXAttrResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<SetXAttrResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.SetXAttrResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GetXAttrsRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.GetXAttrsRequestProto)
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
   * Protobuf type {@code hadoop.hdfs.GetXAttrsRequestProto}
   */
  public  static final class GetXAttrsRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.GetXAttrsRequestProto)
      GetXAttrsRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetXAttrsRequestProto.newBuilder() to construct.
    private GetXAttrsRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetXAttrsRequestProto() {
      src_ = "";
      xAttrs_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetXAttrsRequestProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_GetXAttrsRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_GetXAttrsRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto.Builder.class);
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

      if (!hasSrc()) {
        memoizedIsInitialized = 0;
        return false;
      }
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.GetXAttrsRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.GetXAttrsRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_GetXAttrsRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_GetXAttrsRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_GetXAttrsRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto(this);
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto.getDefaultInstance()) return this;
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
        if (!hasSrc()) {
          return false;
        }
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
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto) e.getUnfinishedMessage();
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetXAttrsRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetXAttrsRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<GetXAttrsRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<GetXAttrsRequestProto>() {
      @java.lang.Override
      public GetXAttrsRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new GetXAttrsRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<GetXAttrsRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<GetXAttrsRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GetXAttrsResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.GetXAttrsResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
     */
    java.util.List<org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto> 
        getXAttrsList();
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto getXAttrs(int index);
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
     */
    int getXAttrsCount();
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
     */
    java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder> 
        getXAttrsOrBuilderList();
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder getXAttrsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code hadoop.hdfs.GetXAttrsResponseProto}
   */
  public  static final class GetXAttrsResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.GetXAttrsResponseProto)
      GetXAttrsResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetXAttrsResponseProto.newBuilder() to construct.
    private GetXAttrsResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetXAttrsResponseProto() {
      xAttrs_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetXAttrsResponseProto(
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
                xAttrs_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto>();
                mutable_bitField0_ |= 0x00000001;
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          xAttrs_ = java.util.Collections.unmodifiableList(xAttrs_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_GetXAttrsResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_GetXAttrsResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto.Builder.class);
    }

    public static final int XATTRS_FIELD_NUMBER = 1;
    private java.util.List<org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto> xAttrs_;
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
     */
    public java.util.List<org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto> getXAttrsList() {
      return xAttrs_;
    }
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
     */
    public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder> 
        getXAttrsOrBuilderList() {
      return xAttrs_;
    }
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
     */
    public int getXAttrsCount() {
      return xAttrs_.size();
    }
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto getXAttrs(int index) {
      return xAttrs_.get(index);
    }
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
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
      for (int i = 0; i < xAttrs_.size(); i++) {
        output.writeMessage(1, xAttrs_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < xAttrs_.size(); i++) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(1, xAttrs_.get(i));
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto) obj;

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
      if (getXAttrsCount() > 0) {
        hash = (37 * hash) + XATTRS_FIELD_NUMBER;
        hash = (53 * hash) + getXAttrsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.GetXAttrsResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.GetXAttrsResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_GetXAttrsResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_GetXAttrsResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto.newBuilder()
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
        if (xAttrsBuilder_ == null) {
          xAttrs_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          xAttrsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_GetXAttrsResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto(this);
        int from_bitField0_ = bitField0_;
        if (xAttrsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            xAttrs_ = java.util.Collections.unmodifiableList(xAttrs_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.xAttrs_ = xAttrs_;
        } else {
          result.xAttrs_ = xAttrsBuilder_.build();
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto.getDefaultInstance()) return this;
        if (xAttrsBuilder_ == null) {
          if (!other.xAttrs_.isEmpty()) {
            if (xAttrs_.isEmpty()) {
              xAttrs_ = other.xAttrs_;
              bitField0_ = (bitField0_ & ~0x00000001);
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
              bitField0_ = (bitField0_ & ~0x00000001);
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
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto> xAttrs_ =
        java.util.Collections.emptyList();
      private void ensureXAttrsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          xAttrs_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto>(xAttrs_);
          bitField0_ |= 0x00000001;
         }
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder> xAttrsBuilder_;

      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto> getXAttrsList() {
        if (xAttrsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(xAttrs_);
        } else {
          return xAttrsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
       */
      public int getXAttrsCount() {
        if (xAttrsBuilder_ == null) {
          return xAttrs_.size();
        } else {
          return xAttrsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto getXAttrs(int index) {
        if (xAttrsBuilder_ == null) {
          return xAttrs_.get(index);
        } else {
          return xAttrsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
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
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
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
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
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
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
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
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
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
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
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
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
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
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
       */
      public Builder clearXAttrs() {
        if (xAttrsBuilder_ == null) {
          xAttrs_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          xAttrsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
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
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder getXAttrsBuilder(
          int index) {
        return getXAttrsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder getXAttrsOrBuilder(
          int index) {
        if (xAttrsBuilder_ == null) {
          return xAttrs_.get(index);  } else {
          return xAttrsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
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
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder addXAttrsBuilder() {
        return getXAttrsFieldBuilder().addBuilder(
            org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder addXAttrsBuilder(
          int index) {
        return getXAttrsFieldBuilder().addBuilder(
            index, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
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
                  ((bitField0_ & 0x00000001) != 0),
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetXAttrsResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetXAttrsResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<GetXAttrsResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<GetXAttrsResponseProto>() {
      @java.lang.Override
      public GetXAttrsResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new GetXAttrsResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<GetXAttrsResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<GetXAttrsResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.GetXAttrsResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ListXAttrsRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.ListXAttrsRequestProto)
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
   * Protobuf type {@code hadoop.hdfs.ListXAttrsRequestProto}
   */
  public  static final class ListXAttrsRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.ListXAttrsRequestProto)
      ListXAttrsRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ListXAttrsRequestProto.newBuilder() to construct.
    private ListXAttrsRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ListXAttrsRequestProto() {
      src_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ListXAttrsRequestProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_ListXAttrsRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_ListXAttrsRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto.Builder.class);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.ListXAttrsRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.ListXAttrsRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_ListXAttrsRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_ListXAttrsRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_ListXAttrsRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto(this);
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto) e.getUnfinishedMessage();
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.ListXAttrsRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ListXAttrsRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<ListXAttrsRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<ListXAttrsRequestProto>() {
      @java.lang.Override
      public ListXAttrsRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new ListXAttrsRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<ListXAttrsRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<ListXAttrsRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ListXAttrsResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.ListXAttrsResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
     */
    java.util.List<org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto> 
        getXAttrsList();
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto getXAttrs(int index);
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
     */
    int getXAttrsCount();
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
     */
    java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder> 
        getXAttrsOrBuilderList();
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder getXAttrsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code hadoop.hdfs.ListXAttrsResponseProto}
   */
  public  static final class ListXAttrsResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.ListXAttrsResponseProto)
      ListXAttrsResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ListXAttrsResponseProto.newBuilder() to construct.
    private ListXAttrsResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ListXAttrsResponseProto() {
      xAttrs_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ListXAttrsResponseProto(
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
                xAttrs_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto>();
                mutable_bitField0_ |= 0x00000001;
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          xAttrs_ = java.util.Collections.unmodifiableList(xAttrs_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_ListXAttrsResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_ListXAttrsResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto.Builder.class);
    }

    public static final int XATTRS_FIELD_NUMBER = 1;
    private java.util.List<org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto> xAttrs_;
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
     */
    public java.util.List<org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto> getXAttrsList() {
      return xAttrs_;
    }
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
     */
    public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder> 
        getXAttrsOrBuilderList() {
      return xAttrs_;
    }
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
     */
    public int getXAttrsCount() {
      return xAttrs_.size();
    }
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto getXAttrs(int index) {
      return xAttrs_.get(index);
    }
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
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
      for (int i = 0; i < xAttrs_.size(); i++) {
        output.writeMessage(1, xAttrs_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < xAttrs_.size(); i++) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(1, xAttrs_.get(i));
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto) obj;

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
      if (getXAttrsCount() > 0) {
        hash = (37 * hash) + XATTRS_FIELD_NUMBER;
        hash = (53 * hash) + getXAttrsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.ListXAttrsResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.ListXAttrsResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_ListXAttrsResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_ListXAttrsResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto.newBuilder()
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
        if (xAttrsBuilder_ == null) {
          xAttrs_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          xAttrsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_ListXAttrsResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto(this);
        int from_bitField0_ = bitField0_;
        if (xAttrsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            xAttrs_ = java.util.Collections.unmodifiableList(xAttrs_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.xAttrs_ = xAttrs_;
        } else {
          result.xAttrs_ = xAttrsBuilder_.build();
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto.getDefaultInstance()) return this;
        if (xAttrsBuilder_ == null) {
          if (!other.xAttrs_.isEmpty()) {
            if (xAttrs_.isEmpty()) {
              xAttrs_ = other.xAttrs_;
              bitField0_ = (bitField0_ & ~0x00000001);
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
              bitField0_ = (bitField0_ & ~0x00000001);
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
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto> xAttrs_ =
        java.util.Collections.emptyList();
      private void ensureXAttrsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          xAttrs_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto>(xAttrs_);
          bitField0_ |= 0x00000001;
         }
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder> xAttrsBuilder_;

      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto> getXAttrsList() {
        if (xAttrsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(xAttrs_);
        } else {
          return xAttrsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
       */
      public int getXAttrsCount() {
        if (xAttrsBuilder_ == null) {
          return xAttrs_.size();
        } else {
          return xAttrsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto getXAttrs(int index) {
        if (xAttrsBuilder_ == null) {
          return xAttrs_.get(index);
        } else {
          return xAttrsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
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
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
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
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
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
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
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
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
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
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
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
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
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
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
       */
      public Builder clearXAttrs() {
        if (xAttrsBuilder_ == null) {
          xAttrs_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          xAttrsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
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
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder getXAttrsBuilder(
          int index) {
        return getXAttrsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder getXAttrsOrBuilder(
          int index) {
        if (xAttrsBuilder_ == null) {
          return xAttrs_.get(index);  } else {
          return xAttrsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
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
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder addXAttrsBuilder() {
        return getXAttrsFieldBuilder().addBuilder(
            org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder addXAttrsBuilder(
          int index) {
        return getXAttrsFieldBuilder().addBuilder(
            index, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 1;</code>
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
                  ((bitField0_ & 0x00000001) != 0),
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.ListXAttrsResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ListXAttrsResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<ListXAttrsResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<ListXAttrsResponseProto>() {
      @java.lang.Override
      public ListXAttrsResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new ListXAttrsResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<ListXAttrsResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<ListXAttrsResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.ListXAttrsResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RemoveXAttrRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.RemoveXAttrRequestProto)
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
     * <code>optional .hadoop.hdfs.XAttrProto xAttr = 2;</code>
     */
    boolean hasXAttr();
    /**
     * <code>optional .hadoop.hdfs.XAttrProto xAttr = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto getXAttr();
    /**
     * <code>optional .hadoop.hdfs.XAttrProto xAttr = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder getXAttrOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.RemoveXAttrRequestProto}
   */
  public  static final class RemoveXAttrRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.RemoveXAttrRequestProto)
      RemoveXAttrRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RemoveXAttrRequestProto.newBuilder() to construct.
    private RemoveXAttrRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RemoveXAttrRequestProto() {
      src_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RemoveXAttrRequestProto(
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
              org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) != 0)) {
                subBuilder = xAttr_.toBuilder();
              }
              xAttr_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(xAttr_);
                xAttr_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
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
      return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_RemoveXAttrRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_RemoveXAttrRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto.Builder.class);
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

    public static final int XATTR_FIELD_NUMBER = 2;
    private org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto xAttr_;
    /**
     * <code>optional .hadoop.hdfs.XAttrProto xAttr = 2;</code>
     */
    public boolean hasXAttr() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .hadoop.hdfs.XAttrProto xAttr = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto getXAttr() {
      return xAttr_ == null ? org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.getDefaultInstance() : xAttr_;
    }
    /**
     * <code>optional .hadoop.hdfs.XAttrProto xAttr = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder getXAttrOrBuilder() {
      return xAttr_ == null ? org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.getDefaultInstance() : xAttr_;
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
      if (hasXAttr()) {
        if (!getXAttr().isInitialized()) {
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
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeMessage(2, getXAttr());
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
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(2, getXAttr());
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto) obj;

      if (hasSrc() != other.hasSrc()) return false;
      if (hasSrc()) {
        if (!getSrc()
            .equals(other.getSrc())) return false;
      }
      if (hasXAttr() != other.hasXAttr()) return false;
      if (hasXAttr()) {
        if (!getXAttr()
            .equals(other.getXAttr())) return false;
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
      if (hasXAttr()) {
        hash = (37 * hash) + XATTR_FIELD_NUMBER;
        hash = (53 * hash) + getXAttr().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.RemoveXAttrRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.RemoveXAttrRequestProto)
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_RemoveXAttrRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_RemoveXAttrRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto.newBuilder()
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
          getXAttrFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        src_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (xAttrBuilder_ == null) {
          xAttr_ = null;
        } else {
          xAttrBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_RemoveXAttrRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.src_ = src_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          if (xAttrBuilder_ == null) {
            result.xAttr_ = xAttr_;
          } else {
            result.xAttr_ = xAttrBuilder_.build();
          }
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto.getDefaultInstance()) return this;
        if (other.hasSrc()) {
          bitField0_ |= 0x00000001;
          src_ = other.src_;
          onChanged();
        }
        if (other.hasXAttr()) {
          mergeXAttr(other.getXAttr());
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
        if (hasXAttr()) {
          if (!getXAttr().isInitialized()) {
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
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto) e.getUnfinishedMessage();
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

      private org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto xAttr_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder> xAttrBuilder_;
      /**
       * <code>optional .hadoop.hdfs.XAttrProto xAttr = 2;</code>
       */
      public boolean hasXAttr() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional .hadoop.hdfs.XAttrProto xAttr = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto getXAttr() {
        if (xAttrBuilder_ == null) {
          return xAttr_ == null ? org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.getDefaultInstance() : xAttr_;
        } else {
          return xAttrBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .hadoop.hdfs.XAttrProto xAttr = 2;</code>
       */
      public Builder setXAttr(org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto value) {
        if (xAttrBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          xAttr_ = value;
          onChanged();
        } else {
          xAttrBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.XAttrProto xAttr = 2;</code>
       */
      public Builder setXAttr(
          org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder builderForValue) {
        if (xAttrBuilder_ == null) {
          xAttr_ = builderForValue.build();
          onChanged();
        } else {
          xAttrBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.XAttrProto xAttr = 2;</code>
       */
      public Builder mergeXAttr(org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto value) {
        if (xAttrBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
              xAttr_ != null &&
              xAttr_ != org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.getDefaultInstance()) {
            xAttr_ =
              org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.newBuilder(xAttr_).mergeFrom(value).buildPartial();
          } else {
            xAttr_ = value;
          }
          onChanged();
        } else {
          xAttrBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.XAttrProto xAttr = 2;</code>
       */
      public Builder clearXAttr() {
        if (xAttrBuilder_ == null) {
          xAttr_ = null;
          onChanged();
        } else {
          xAttrBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.XAttrProto xAttr = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder getXAttrBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getXAttrFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .hadoop.hdfs.XAttrProto xAttr = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder getXAttrOrBuilder() {
        if (xAttrBuilder_ != null) {
          return xAttrBuilder_.getMessageOrBuilder();
        } else {
          return xAttr_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.getDefaultInstance() : xAttr_;
        }
      }
      /**
       * <code>optional .hadoop.hdfs.XAttrProto xAttr = 2;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder> 
          getXAttrFieldBuilder() {
        if (xAttrBuilder_ == null) {
          xAttrBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder>(
                  getXAttr(),
                  getParentForChildren(),
                  isClean());
          xAttr_ = null;
        }
        return xAttrBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.RemoveXAttrRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.RemoveXAttrRequestProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<RemoveXAttrRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<RemoveXAttrRequestProto>() {
      @java.lang.Override
      public RemoveXAttrRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new RemoveXAttrRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<RemoveXAttrRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<RemoveXAttrRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RemoveXAttrResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.RemoveXAttrResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.RemoveXAttrResponseProto}
   */
  public  static final class RemoveXAttrResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.RemoveXAttrResponseProto)
      RemoveXAttrResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RemoveXAttrResponseProto.newBuilder() to construct.
    private RemoveXAttrResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RemoveXAttrResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RemoveXAttrResponseProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_RemoveXAttrResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_RemoveXAttrResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto.Builder.class);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.RemoveXAttrResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.RemoveXAttrResponseProto)
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_RemoveXAttrResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_RemoveXAttrResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.internal_static_hadoop_hdfs_RemoveXAttrResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto(this);
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto) e.getUnfinishedMessage();
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.RemoveXAttrResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.RemoveXAttrResponseProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<RemoveXAttrResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<RemoveXAttrResponseProto>() {
      @java.lang.Override
      public RemoveXAttrResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new RemoveXAttrResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<RemoveXAttrResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<RemoveXAttrResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.RemoveXAttrResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_XAttrProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_XAttrProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_SetXAttrRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_SetXAttrRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_SetXAttrResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_SetXAttrResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetXAttrsRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_GetXAttrsRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetXAttrsResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_GetXAttrsResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_ListXAttrsRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_ListXAttrsRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_ListXAttrsResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_ListXAttrsResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_RemoveXAttrRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_RemoveXAttrRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_RemoveXAttrResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_RemoveXAttrResponseProto_fieldAccessorTable;

  public static org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013xattr.proto\022\013hadoop.hdfs\"\272\001\n\nXAttrProt" +
      "o\022>\n\tnamespace\030\001 \002(\0162+.hadoop.hdfs.XAttr" +
      "Proto.XAttrNamespaceProto\022\014\n\004name\030\002 \002(\t\022" +
      "\r\n\005value\030\003 \001(\014\"O\n\023XAttrNamespaceProto\022\010\n" +
      "\004USER\020\000\022\013\n\007TRUSTED\020\001\022\014\n\010SECURITY\020\002\022\n\n\006SY" +
      "STEM\020\003\022\007\n\003RAW\020\004\"Y\n\024SetXAttrRequestProto\022" +
      "\013\n\003src\030\001 \002(\t\022&\n\005xAttr\030\002 \001(\0132\027.hadoop.hdf" +
      "s.XAttrProto\022\014\n\004flag\030\003 \001(\r\"\027\n\025SetXAttrRe" +
      "sponseProto\"M\n\025GetXAttrsRequestProto\022\013\n\003" +
      "src\030\001 \002(\t\022\'\n\006xAttrs\030\002 \003(\0132\027.hadoop.hdfs." +
      "XAttrProto\"A\n\026GetXAttrsResponseProto\022\'\n\006" +
      "xAttrs\030\001 \003(\0132\027.hadoop.hdfs.XAttrProto\"%\n" +
      "\026ListXAttrsRequestProto\022\013\n\003src\030\001 \002(\t\"B\n\027" +
      "ListXAttrsResponseProto\022\'\n\006xAttrs\030\001 \003(\0132" +
      "\027.hadoop.hdfs.XAttrProto\"N\n\027RemoveXAttrR" +
      "equestProto\022\013\n\003src\030\001 \002(\t\022&\n\005xAttr\030\002 \001(\0132" +
      "\027.hadoop.hdfs.XAttrProto\"\032\n\030RemoveXAttrR" +
      "esponseProto*8\n\021XAttrSetFlagProto\022\020\n\014XAT" +
      "TR_CREATE\020\001\022\021\n\rXATTR_REPLACE\020\002B7\n%org.ap" +
      "ache.hadoop.hdfs.protocol.protoB\013XAttrPr" +
      "otos\240\001\001"
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
    internal_static_hadoop_hdfs_XAttrProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hadoop_hdfs_XAttrProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_XAttrProto_descriptor,
        new java.lang.String[] { "Namespace", "Name", "Value", });
    internal_static_hadoop_hdfs_SetXAttrRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hadoop_hdfs_SetXAttrRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_SetXAttrRequestProto_descriptor,
        new java.lang.String[] { "Src", "XAttr", "Flag", });
    internal_static_hadoop_hdfs_SetXAttrResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_hadoop_hdfs_SetXAttrResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_SetXAttrResponseProto_descriptor,
        new java.lang.String[] { });
    internal_static_hadoop_hdfs_GetXAttrsRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_hadoop_hdfs_GetXAttrsRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_GetXAttrsRequestProto_descriptor,
        new java.lang.String[] { "Src", "XAttrs", });
    internal_static_hadoop_hdfs_GetXAttrsResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_hadoop_hdfs_GetXAttrsResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_GetXAttrsResponseProto_descriptor,
        new java.lang.String[] { "XAttrs", });
    internal_static_hadoop_hdfs_ListXAttrsRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_hadoop_hdfs_ListXAttrsRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_ListXAttrsRequestProto_descriptor,
        new java.lang.String[] { "Src", });
    internal_static_hadoop_hdfs_ListXAttrsResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_hadoop_hdfs_ListXAttrsResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_ListXAttrsResponseProto_descriptor,
        new java.lang.String[] { "XAttrs", });
    internal_static_hadoop_hdfs_RemoveXAttrRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_hadoop_hdfs_RemoveXAttrRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_RemoveXAttrRequestProto_descriptor,
        new java.lang.String[] { "Src", "XAttr", });
    internal_static_hadoop_hdfs_RemoveXAttrResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_hadoop_hdfs_RemoveXAttrResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_RemoveXAttrResponseProto_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
