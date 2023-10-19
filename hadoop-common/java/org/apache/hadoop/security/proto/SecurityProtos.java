// source: Security.proto

package org.apache.hadoop.security.proto;

public final class SecurityProtos {
  private SecurityProtos() {}
  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TokenProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.TokenProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required bytes identifier = 1;</code>
     */
    boolean hasIdentifier();
    /**
     * <code>required bytes identifier = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString getIdentifier();

    /**
     * <code>required bytes password = 2;</code>
     */
    boolean hasPassword();
    /**
     * <code>required bytes password = 2;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString getPassword();

    /**
     * <code>required string kind = 3;</code>
     */
    boolean hasKind();
    /**
     * <code>required string kind = 3;</code>
     */
    java.lang.String getKind();
    /**
     * <code>required string kind = 3;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getKindBytes();

    /**
     * <code>required string service = 4;</code>
     */
    boolean hasService();
    /**
     * <code>required string service = 4;</code>
     */
    java.lang.String getService();
    /**
     * <code>required string service = 4;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getServiceBytes();
  }
  /**
   * <pre>
   **
   * Security token identifier
   * </pre>
   *
   * Protobuf type {@code hadoop.common.TokenProto}
   */
  public  static final class TokenProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.TokenProto)
      TokenProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TokenProto.newBuilder() to construct.
    private TokenProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TokenProto() {
      identifier_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
      password_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
      kind_ = "";
      service_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TokenProto(
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
              bitField0_ |= 0x00000001;
              identifier_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              password_ = input.readBytes();
              break;
            }
            case 26: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              kind_ = bs;
              break;
            }
            case 34: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              service_ = bs;
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
      return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_TokenProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_TokenProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.security.proto.SecurityProtos.TokenProto.class, org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder.class);
    }

    private int bitField0_;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    private org.apache.hadoop.thirdparty.protobuf.ByteString identifier_;
    /**
     * <code>required bytes identifier = 1;</code>
     */
    public boolean hasIdentifier() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required bytes identifier = 1;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString getIdentifier() {
      return identifier_;
    }

    public static final int PASSWORD_FIELD_NUMBER = 2;
    private org.apache.hadoop.thirdparty.protobuf.ByteString password_;
    /**
     * <code>required bytes password = 2;</code>
     */
    public boolean hasPassword() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required bytes password = 2;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString getPassword() {
      return password_;
    }

    public static final int KIND_FIELD_NUMBER = 3;
    private volatile java.lang.Object kind_;
    /**
     * <code>required string kind = 3;</code>
     */
    public boolean hasKind() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required string kind = 3;</code>
     */
    public java.lang.String getKind() {
      java.lang.Object ref = kind_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          kind_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string kind = 3;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getKindBytes() {
      java.lang.Object ref = kind_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        kind_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int SERVICE_FIELD_NUMBER = 4;
    private volatile java.lang.Object service_;
    /**
     * <code>required string service = 4;</code>
     */
    public boolean hasService() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>required string service = 4;</code>
     */
    public java.lang.String getService() {
      java.lang.Object ref = service_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          service_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string service = 4;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getServiceBytes() {
      java.lang.Object ref = service_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        service_ = b;
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

      if (!hasIdentifier()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPassword()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasKind()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasService()) {
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
        output.writeBytes(1, identifier_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeBytes(2, password_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 3, kind_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 4, service_);
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
          .computeBytesSize(1, identifier_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeBytesSize(2, password_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(3, kind_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(4, service_);
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
      if (!(obj instanceof org.apache.hadoop.security.proto.SecurityProtos.TokenProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.security.proto.SecurityProtos.TokenProto other = (org.apache.hadoop.security.proto.SecurityProtos.TokenProto) obj;

      if (hasIdentifier() != other.hasIdentifier()) return false;
      if (hasIdentifier()) {
        if (!getIdentifier()
            .equals(other.getIdentifier())) return false;
      }
      if (hasPassword() != other.hasPassword()) return false;
      if (hasPassword()) {
        if (!getPassword()
            .equals(other.getPassword())) return false;
      }
      if (hasKind() != other.hasKind()) return false;
      if (hasKind()) {
        if (!getKind()
            .equals(other.getKind())) return false;
      }
      if (hasService() != other.hasService()) return false;
      if (hasService()) {
        if (!getService()
            .equals(other.getService())) return false;
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
      if (hasIdentifier()) {
        hash = (37 * hash) + IDENTIFIER_FIELD_NUMBER;
        hash = (53 * hash) + getIdentifier().hashCode();
      }
      if (hasPassword()) {
        hash = (37 * hash) + PASSWORD_FIELD_NUMBER;
        hash = (53 * hash) + getPassword().hashCode();
      }
      if (hasKind()) {
        hash = (37 * hash) + KIND_FIELD_NUMBER;
        hash = (53 * hash) + getKind().hashCode();
      }
      if (hasService()) {
        hash = (37 * hash) + SERVICE_FIELD_NUMBER;
        hash = (53 * hash) + getService().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.security.proto.SecurityProtos.TokenProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.TokenProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.TokenProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.TokenProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.TokenProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.TokenProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.TokenProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.TokenProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.TokenProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.TokenProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.TokenProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.TokenProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.security.proto.SecurityProtos.TokenProto prototype) {
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
     * Security token identifier
     * </pre>
     *
     * Protobuf type {@code hadoop.common.TokenProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.TokenProto)
        org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_TokenProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_TokenProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.security.proto.SecurityProtos.TokenProto.class, org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder.class);
      }

      // Construct using org.apache.hadoop.security.proto.SecurityProtos.TokenProto.newBuilder()
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
        identifier_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        password_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        kind_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        service_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_TokenProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.security.proto.SecurityProtos.TokenProto getDefaultInstanceForType() {
        return org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.security.proto.SecurityProtos.TokenProto build() {
        org.apache.hadoop.security.proto.SecurityProtos.TokenProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.security.proto.SecurityProtos.TokenProto buildPartial() {
        org.apache.hadoop.security.proto.SecurityProtos.TokenProto result = new org.apache.hadoop.security.proto.SecurityProtos.TokenProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.identifier_ = identifier_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.password_ = password_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.kind_ = kind_;
        if (((from_bitField0_ & 0x00000008) != 0)) {
          to_bitField0_ |= 0x00000008;
        }
        result.service_ = service_;
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
        if (other instanceof org.apache.hadoop.security.proto.SecurityProtos.TokenProto) {
          return mergeFrom((org.apache.hadoop.security.proto.SecurityProtos.TokenProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.security.proto.SecurityProtos.TokenProto other) {
        if (other == org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance()) return this;
        if (other.hasIdentifier()) {
          setIdentifier(other.getIdentifier());
        }
        if (other.hasPassword()) {
          setPassword(other.getPassword());
        }
        if (other.hasKind()) {
          bitField0_ |= 0x00000004;
          kind_ = other.kind_;
          onChanged();
        }
        if (other.hasService()) {
          bitField0_ |= 0x00000008;
          service_ = other.service_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasIdentifier()) {
          return false;
        }
        if (!hasPassword()) {
          return false;
        }
        if (!hasKind()) {
          return false;
        }
        if (!hasService()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.security.proto.SecurityProtos.TokenProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.security.proto.SecurityProtos.TokenProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private org.apache.hadoop.thirdparty.protobuf.ByteString identifier_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
      /**
       * <code>required bytes identifier = 1;</code>
       */
      public boolean hasIdentifier() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required bytes identifier = 1;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString getIdentifier() {
        return identifier_;
      }
      /**
       * <code>required bytes identifier = 1;</code>
       */
      public Builder setIdentifier(org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        identifier_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bytes identifier = 1;</code>
       */
      public Builder clearIdentifier() {
        bitField0_ = (bitField0_ & ~0x00000001);
        identifier_ = getDefaultInstance().getIdentifier();
        onChanged();
        return this;
      }

      private org.apache.hadoop.thirdparty.protobuf.ByteString password_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
      /**
       * <code>required bytes password = 2;</code>
       */
      public boolean hasPassword() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required bytes password = 2;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString getPassword() {
        return password_;
      }
      /**
       * <code>required bytes password = 2;</code>
       */
      public Builder setPassword(org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        password_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bytes password = 2;</code>
       */
      public Builder clearPassword() {
        bitField0_ = (bitField0_ & ~0x00000002);
        password_ = getDefaultInstance().getPassword();
        onChanged();
        return this;
      }

      private java.lang.Object kind_ = "";
      /**
       * <code>required string kind = 3;</code>
       */
      public boolean hasKind() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>required string kind = 3;</code>
       */
      public java.lang.String getKind() {
        java.lang.Object ref = kind_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            kind_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string kind = 3;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getKindBytes() {
        java.lang.Object ref = kind_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          kind_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string kind = 3;</code>
       */
      public Builder setKind(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        kind_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string kind = 3;</code>
       */
      public Builder clearKind() {
        bitField0_ = (bitField0_ & ~0x00000004);
        kind_ = getDefaultInstance().getKind();
        onChanged();
        return this;
      }
      /**
       * <code>required string kind = 3;</code>
       */
      public Builder setKindBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        kind_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object service_ = "";
      /**
       * <code>required string service = 4;</code>
       */
      public boolean hasService() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>required string service = 4;</code>
       */
      public java.lang.String getService() {
        java.lang.Object ref = service_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            service_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string service = 4;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getServiceBytes() {
        java.lang.Object ref = service_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          service_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string service = 4;</code>
       */
      public Builder setService(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        service_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string service = 4;</code>
       */
      public Builder clearService() {
        bitField0_ = (bitField0_ & ~0x00000008);
        service_ = getDefaultInstance().getService();
        onChanged();
        return this;
      }
      /**
       * <code>required string service = 4;</code>
       */
      public Builder setServiceBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        service_ = value;
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.TokenProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.TokenProto)
    private static final org.apache.hadoop.security.proto.SecurityProtos.TokenProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.security.proto.SecurityProtos.TokenProto();
    }

    public static org.apache.hadoop.security.proto.SecurityProtos.TokenProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<TokenProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<TokenProto>() {
      @java.lang.Override
      public TokenProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new TokenProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<TokenProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<TokenProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.security.proto.SecurityProtos.TokenProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CredentialsKVProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.CredentialsKVProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required string alias = 1;</code>
     */
    boolean hasAlias();
    /**
     * <code>required string alias = 1;</code>
     */
    java.lang.String getAlias();
    /**
     * <code>required string alias = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getAliasBytes();

    /**
     * <code>optional .hadoop.common.TokenProto token = 2;</code>
     */
    boolean hasToken();
    /**
     * <code>optional .hadoop.common.TokenProto token = 2;</code>
     */
    org.apache.hadoop.security.proto.SecurityProtos.TokenProto getToken();
    /**
     * <code>optional .hadoop.common.TokenProto token = 2;</code>
     */
    org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder getTokenOrBuilder();

    /**
     * <code>optional bytes secret = 3;</code>
     */
    boolean hasSecret();
    /**
     * <code>optional bytes secret = 3;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString getSecret();
  }
  /**
   * Protobuf type {@code hadoop.common.CredentialsKVProto}
   */
  public  static final class CredentialsKVProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.CredentialsKVProto)
      CredentialsKVProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CredentialsKVProto.newBuilder() to construct.
    private CredentialsKVProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CredentialsKVProto() {
      alias_ = "";
      secret_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CredentialsKVProto(
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
              alias_ = bs;
              break;
            }
            case 18: {
              org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) != 0)) {
                subBuilder = token_.toBuilder();
              }
              token_ = input.readMessage(org.apache.hadoop.security.proto.SecurityProtos.TokenProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(token_);
                token_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              secret_ = input.readBytes();
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
      return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_CredentialsKVProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_CredentialsKVProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto.class, org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto.Builder.class);
    }

    private int bitField0_;
    public static final int ALIAS_FIELD_NUMBER = 1;
    private volatile java.lang.Object alias_;
    /**
     * <code>required string alias = 1;</code>
     */
    public boolean hasAlias() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string alias = 1;</code>
     */
    public java.lang.String getAlias() {
      java.lang.Object ref = alias_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          alias_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string alias = 1;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getAliasBytes() {
      java.lang.Object ref = alias_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        alias_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int TOKEN_FIELD_NUMBER = 2;
    private org.apache.hadoop.security.proto.SecurityProtos.TokenProto token_;
    /**
     * <code>optional .hadoop.common.TokenProto token = 2;</code>
     */
    public boolean hasToken() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .hadoop.common.TokenProto token = 2;</code>
     */
    public org.apache.hadoop.security.proto.SecurityProtos.TokenProto getToken() {
      return token_ == null ? org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance() : token_;
    }
    /**
     * <code>optional .hadoop.common.TokenProto token = 2;</code>
     */
    public org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder getTokenOrBuilder() {
      return token_ == null ? org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance() : token_;
    }

    public static final int SECRET_FIELD_NUMBER = 3;
    private org.apache.hadoop.thirdparty.protobuf.ByteString secret_;
    /**
     * <code>optional bytes secret = 3;</code>
     */
    public boolean hasSecret() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional bytes secret = 3;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString getSecret() {
      return secret_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasAlias()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasToken()) {
        if (!getToken().isInitialized()) {
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, alias_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeMessage(2, getToken());
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeBytes(3, secret_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, alias_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(2, getToken());
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeBytesSize(3, secret_);
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
      if (!(obj instanceof org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto other = (org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto) obj;

      if (hasAlias() != other.hasAlias()) return false;
      if (hasAlias()) {
        if (!getAlias()
            .equals(other.getAlias())) return false;
      }
      if (hasToken() != other.hasToken()) return false;
      if (hasToken()) {
        if (!getToken()
            .equals(other.getToken())) return false;
      }
      if (hasSecret() != other.hasSecret()) return false;
      if (hasSecret()) {
        if (!getSecret()
            .equals(other.getSecret())) return false;
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
      if (hasAlias()) {
        hash = (37 * hash) + ALIAS_FIELD_NUMBER;
        hash = (53 * hash) + getAlias().hashCode();
      }
      if (hasToken()) {
        hash = (37 * hash) + TOKEN_FIELD_NUMBER;
        hash = (53 * hash) + getToken().hashCode();
      }
      if (hasSecret()) {
        hash = (37 * hash) + SECRET_FIELD_NUMBER;
        hash = (53 * hash) + getSecret().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto prototype) {
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
     * Protobuf type {@code hadoop.common.CredentialsKVProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.CredentialsKVProto)
        org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_CredentialsKVProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_CredentialsKVProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto.class, org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto.Builder.class);
      }

      // Construct using org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto.newBuilder()
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
          getTokenFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        alias_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (tokenBuilder_ == null) {
          token_ = null;
        } else {
          tokenBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        secret_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_CredentialsKVProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto getDefaultInstanceForType() {
        return org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto build() {
        org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto buildPartial() {
        org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto result = new org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.alias_ = alias_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          if (tokenBuilder_ == null) {
            result.token_ = token_;
          } else {
            result.token_ = tokenBuilder_.build();
          }
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.secret_ = secret_;
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
        if (other instanceof org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto) {
          return mergeFrom((org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto other) {
        if (other == org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto.getDefaultInstance()) return this;
        if (other.hasAlias()) {
          bitField0_ |= 0x00000001;
          alias_ = other.alias_;
          onChanged();
        }
        if (other.hasToken()) {
          mergeToken(other.getToken());
        }
        if (other.hasSecret()) {
          setSecret(other.getSecret());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasAlias()) {
          return false;
        }
        if (hasToken()) {
          if (!getToken().isInitialized()) {
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
        org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object alias_ = "";
      /**
       * <code>required string alias = 1;</code>
       */
      public boolean hasAlias() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string alias = 1;</code>
       */
      public java.lang.String getAlias() {
        java.lang.Object ref = alias_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            alias_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string alias = 1;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getAliasBytes() {
        java.lang.Object ref = alias_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          alias_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string alias = 1;</code>
       */
      public Builder setAlias(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        alias_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string alias = 1;</code>
       */
      public Builder clearAlias() {
        bitField0_ = (bitField0_ & ~0x00000001);
        alias_ = getDefaultInstance().getAlias();
        onChanged();
        return this;
      }
      /**
       * <code>required string alias = 1;</code>
       */
      public Builder setAliasBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        alias_ = value;
        onChanged();
        return this;
      }

      private org.apache.hadoop.security.proto.SecurityProtos.TokenProto token_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.security.proto.SecurityProtos.TokenProto, org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder, org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder> tokenBuilder_;
      /**
       * <code>optional .hadoop.common.TokenProto token = 2;</code>
       */
      public boolean hasToken() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional .hadoop.common.TokenProto token = 2;</code>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.TokenProto getToken() {
        if (tokenBuilder_ == null) {
          return token_ == null ? org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance() : token_;
        } else {
          return tokenBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .hadoop.common.TokenProto token = 2;</code>
       */
      public Builder setToken(org.apache.hadoop.security.proto.SecurityProtos.TokenProto value) {
        if (tokenBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          token_ = value;
          onChanged();
        } else {
          tokenBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .hadoop.common.TokenProto token = 2;</code>
       */
      public Builder setToken(
          org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder builderForValue) {
        if (tokenBuilder_ == null) {
          token_ = builderForValue.build();
          onChanged();
        } else {
          tokenBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .hadoop.common.TokenProto token = 2;</code>
       */
      public Builder mergeToken(org.apache.hadoop.security.proto.SecurityProtos.TokenProto value) {
        if (tokenBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
              token_ != null &&
              token_ != org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance()) {
            token_ =
              org.apache.hadoop.security.proto.SecurityProtos.TokenProto.newBuilder(token_).mergeFrom(value).buildPartial();
          } else {
            token_ = value;
          }
          onChanged();
        } else {
          tokenBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .hadoop.common.TokenProto token = 2;</code>
       */
      public Builder clearToken() {
        if (tokenBuilder_ == null) {
          token_ = null;
          onChanged();
        } else {
          tokenBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>optional .hadoop.common.TokenProto token = 2;</code>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder getTokenBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getTokenFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .hadoop.common.TokenProto token = 2;</code>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder getTokenOrBuilder() {
        if (tokenBuilder_ != null) {
          return tokenBuilder_.getMessageOrBuilder();
        } else {
          return token_ == null ?
              org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance() : token_;
        }
      }
      /**
       * <code>optional .hadoop.common.TokenProto token = 2;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.security.proto.SecurityProtos.TokenProto, org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder, org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder> 
          getTokenFieldBuilder() {
        if (tokenBuilder_ == null) {
          tokenBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.security.proto.SecurityProtos.TokenProto, org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder, org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder>(
                  getToken(),
                  getParentForChildren(),
                  isClean());
          token_ = null;
        }
        return tokenBuilder_;
      }

      private org.apache.hadoop.thirdparty.protobuf.ByteString secret_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes secret = 3;</code>
       */
      public boolean hasSecret() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional bytes secret = 3;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString getSecret() {
        return secret_;
      }
      /**
       * <code>optional bytes secret = 3;</code>
       */
      public Builder setSecret(org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        secret_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes secret = 3;</code>
       */
      public Builder clearSecret() {
        bitField0_ = (bitField0_ & ~0x00000004);
        secret_ = getDefaultInstance().getSecret();
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.CredentialsKVProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.CredentialsKVProto)
    private static final org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto();
    }

    public static org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<CredentialsKVProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<CredentialsKVProto>() {
      @java.lang.Override
      public CredentialsKVProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new CredentialsKVProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<CredentialsKVProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<CredentialsKVProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CredentialsProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.CredentialsProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .hadoop.common.CredentialsKVProto tokens = 1;</code>
     */
    java.util.List<org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto> 
        getTokensList();
    /**
     * <code>repeated .hadoop.common.CredentialsKVProto tokens = 1;</code>
     */
    org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto getTokens(int index);
    /**
     * <code>repeated .hadoop.common.CredentialsKVProto tokens = 1;</code>
     */
    int getTokensCount();
    /**
     * <code>repeated .hadoop.common.CredentialsKVProto tokens = 1;</code>
     */
    java.util.List<? extends org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProtoOrBuilder> 
        getTokensOrBuilderList();
    /**
     * <code>repeated .hadoop.common.CredentialsKVProto tokens = 1;</code>
     */
    org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProtoOrBuilder getTokensOrBuilder(
        int index);

    /**
     * <code>repeated .hadoop.common.CredentialsKVProto secrets = 2;</code>
     */
    java.util.List<org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto> 
        getSecretsList();
    /**
     * <code>repeated .hadoop.common.CredentialsKVProto secrets = 2;</code>
     */
    org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto getSecrets(int index);
    /**
     * <code>repeated .hadoop.common.CredentialsKVProto secrets = 2;</code>
     */
    int getSecretsCount();
    /**
     * <code>repeated .hadoop.common.CredentialsKVProto secrets = 2;</code>
     */
    java.util.List<? extends org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProtoOrBuilder> 
        getSecretsOrBuilderList();
    /**
     * <code>repeated .hadoop.common.CredentialsKVProto secrets = 2;</code>
     */
    org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProtoOrBuilder getSecretsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code hadoop.common.CredentialsProto}
   */
  public  static final class CredentialsProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.CredentialsProto)
      CredentialsProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CredentialsProto.newBuilder() to construct.
    private CredentialsProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CredentialsProto() {
      tokens_ = java.util.Collections.emptyList();
      secrets_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CredentialsProto(
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
                tokens_ = new java.util.ArrayList<org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto>();
                mutable_bitField0_ |= 0x00000001;
              }
              tokens_.add(
                  input.readMessage(org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto.PARSER, extensionRegistry));
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                secrets_ = new java.util.ArrayList<org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto>();
                mutable_bitField0_ |= 0x00000002;
              }
              secrets_.add(
                  input.readMessage(org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto.PARSER, extensionRegistry));
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
          tokens_ = java.util.Collections.unmodifiableList(tokens_);
        }
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          secrets_ = java.util.Collections.unmodifiableList(secrets_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_CredentialsProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_CredentialsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto.class, org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto.Builder.class);
    }

    public static final int TOKENS_FIELD_NUMBER = 1;
    private java.util.List<org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto> tokens_;
    /**
     * <code>repeated .hadoop.common.CredentialsKVProto tokens = 1;</code>
     */
    public java.util.List<org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto> getTokensList() {
      return tokens_;
    }
    /**
     * <code>repeated .hadoop.common.CredentialsKVProto tokens = 1;</code>
     */
    public java.util.List<? extends org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProtoOrBuilder> 
        getTokensOrBuilderList() {
      return tokens_;
    }
    /**
     * <code>repeated .hadoop.common.CredentialsKVProto tokens = 1;</code>
     */
    public int getTokensCount() {
      return tokens_.size();
    }
    /**
     * <code>repeated .hadoop.common.CredentialsKVProto tokens = 1;</code>
     */
    public org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto getTokens(int index) {
      return tokens_.get(index);
    }
    /**
     * <code>repeated .hadoop.common.CredentialsKVProto tokens = 1;</code>
     */
    public org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProtoOrBuilder getTokensOrBuilder(
        int index) {
      return tokens_.get(index);
    }

    public static final int SECRETS_FIELD_NUMBER = 2;
    private java.util.List<org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto> secrets_;
    /**
     * <code>repeated .hadoop.common.CredentialsKVProto secrets = 2;</code>
     */
    public java.util.List<org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto> getSecretsList() {
      return secrets_;
    }
    /**
     * <code>repeated .hadoop.common.CredentialsKVProto secrets = 2;</code>
     */
    public java.util.List<? extends org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProtoOrBuilder> 
        getSecretsOrBuilderList() {
      return secrets_;
    }
    /**
     * <code>repeated .hadoop.common.CredentialsKVProto secrets = 2;</code>
     */
    public int getSecretsCount() {
      return secrets_.size();
    }
    /**
     * <code>repeated .hadoop.common.CredentialsKVProto secrets = 2;</code>
     */
    public org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto getSecrets(int index) {
      return secrets_.get(index);
    }
    /**
     * <code>repeated .hadoop.common.CredentialsKVProto secrets = 2;</code>
     */
    public org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProtoOrBuilder getSecretsOrBuilder(
        int index) {
      return secrets_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getTokensCount(); i++) {
        if (!getTokens(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getSecretsCount(); i++) {
        if (!getSecrets(i).isInitialized()) {
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
      for (int i = 0; i < tokens_.size(); i++) {
        output.writeMessage(1, tokens_.get(i));
      }
      for (int i = 0; i < secrets_.size(); i++) {
        output.writeMessage(2, secrets_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < tokens_.size(); i++) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(1, tokens_.get(i));
      }
      for (int i = 0; i < secrets_.size(); i++) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(2, secrets_.get(i));
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
      if (!(obj instanceof org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto other = (org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto) obj;

      if (!getTokensList()
          .equals(other.getTokensList())) return false;
      if (!getSecretsList()
          .equals(other.getSecretsList())) return false;
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
      if (getTokensCount() > 0) {
        hash = (37 * hash) + TOKENS_FIELD_NUMBER;
        hash = (53 * hash) + getTokensList().hashCode();
      }
      if (getSecretsCount() > 0) {
        hash = (37 * hash) + SECRETS_FIELD_NUMBER;
        hash = (53 * hash) + getSecretsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto prototype) {
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
     * Protobuf type {@code hadoop.common.CredentialsProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.CredentialsProto)
        org.apache.hadoop.security.proto.SecurityProtos.CredentialsProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_CredentialsProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_CredentialsProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto.class, org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto.Builder.class);
      }

      // Construct using org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto.newBuilder()
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
          getTokensFieldBuilder();
          getSecretsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (tokensBuilder_ == null) {
          tokens_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          tokensBuilder_.clear();
        }
        if (secretsBuilder_ == null) {
          secrets_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          secretsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_CredentialsProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto getDefaultInstanceForType() {
        return org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto build() {
        org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto buildPartial() {
        org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto result = new org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto(this);
        int from_bitField0_ = bitField0_;
        if (tokensBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            tokens_ = java.util.Collections.unmodifiableList(tokens_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.tokens_ = tokens_;
        } else {
          result.tokens_ = tokensBuilder_.build();
        }
        if (secretsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            secrets_ = java.util.Collections.unmodifiableList(secrets_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.secrets_ = secrets_;
        } else {
          result.secrets_ = secretsBuilder_.build();
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
        if (other instanceof org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto) {
          return mergeFrom((org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto other) {
        if (other == org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto.getDefaultInstance()) return this;
        if (tokensBuilder_ == null) {
          if (!other.tokens_.isEmpty()) {
            if (tokens_.isEmpty()) {
              tokens_ = other.tokens_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureTokensIsMutable();
              tokens_.addAll(other.tokens_);
            }
            onChanged();
          }
        } else {
          if (!other.tokens_.isEmpty()) {
            if (tokensBuilder_.isEmpty()) {
              tokensBuilder_.dispose();
              tokensBuilder_ = null;
              tokens_ = other.tokens_;
              bitField0_ = (bitField0_ & ~0x00000001);
              tokensBuilder_ = 
                org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getTokensFieldBuilder() : null;
            } else {
              tokensBuilder_.addAllMessages(other.tokens_);
            }
          }
        }
        if (secretsBuilder_ == null) {
          if (!other.secrets_.isEmpty()) {
            if (secrets_.isEmpty()) {
              secrets_ = other.secrets_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureSecretsIsMutable();
              secrets_.addAll(other.secrets_);
            }
            onChanged();
          }
        } else {
          if (!other.secrets_.isEmpty()) {
            if (secretsBuilder_.isEmpty()) {
              secretsBuilder_.dispose();
              secretsBuilder_ = null;
              secrets_ = other.secrets_;
              bitField0_ = (bitField0_ & ~0x00000002);
              secretsBuilder_ = 
                org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getSecretsFieldBuilder() : null;
            } else {
              secretsBuilder_.addAllMessages(other.secrets_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        for (int i = 0; i < getTokensCount(); i++) {
          if (!getTokens(i).isInitialized()) {
            return false;
          }
        }
        for (int i = 0; i < getSecretsCount(); i++) {
          if (!getSecrets(i).isInitialized()) {
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
        org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto> tokens_ =
        java.util.Collections.emptyList();
      private void ensureTokensIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          tokens_ = new java.util.ArrayList<org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto>(tokens_);
          bitField0_ |= 0x00000001;
         }
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto, org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto.Builder, org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProtoOrBuilder> tokensBuilder_;

      /**
       * <code>repeated .hadoop.common.CredentialsKVProto tokens = 1;</code>
       */
      public java.util.List<org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto> getTokensList() {
        if (tokensBuilder_ == null) {
          return java.util.Collections.unmodifiableList(tokens_);
        } else {
          return tokensBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto tokens = 1;</code>
       */
      public int getTokensCount() {
        if (tokensBuilder_ == null) {
          return tokens_.size();
        } else {
          return tokensBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto tokens = 1;</code>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto getTokens(int index) {
        if (tokensBuilder_ == null) {
          return tokens_.get(index);
        } else {
          return tokensBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto tokens = 1;</code>
       */
      public Builder setTokens(
          int index, org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto value) {
        if (tokensBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTokensIsMutable();
          tokens_.set(index, value);
          onChanged();
        } else {
          tokensBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto tokens = 1;</code>
       */
      public Builder setTokens(
          int index, org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto.Builder builderForValue) {
        if (tokensBuilder_ == null) {
          ensureTokensIsMutable();
          tokens_.set(index, builderForValue.build());
          onChanged();
        } else {
          tokensBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto tokens = 1;</code>
       */
      public Builder addTokens(org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto value) {
        if (tokensBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTokensIsMutable();
          tokens_.add(value);
          onChanged();
        } else {
          tokensBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto tokens = 1;</code>
       */
      public Builder addTokens(
          int index, org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto value) {
        if (tokensBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTokensIsMutable();
          tokens_.add(index, value);
          onChanged();
        } else {
          tokensBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto tokens = 1;</code>
       */
      public Builder addTokens(
          org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto.Builder builderForValue) {
        if (tokensBuilder_ == null) {
          ensureTokensIsMutable();
          tokens_.add(builderForValue.build());
          onChanged();
        } else {
          tokensBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto tokens = 1;</code>
       */
      public Builder addTokens(
          int index, org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto.Builder builderForValue) {
        if (tokensBuilder_ == null) {
          ensureTokensIsMutable();
          tokens_.add(index, builderForValue.build());
          onChanged();
        } else {
          tokensBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto tokens = 1;</code>
       */
      public Builder addAllTokens(
          java.lang.Iterable<? extends org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto> values) {
        if (tokensBuilder_ == null) {
          ensureTokensIsMutable();
          org.apache.hadoop.thirdparty.protobuf.AbstractMessageLite.Builder.addAll(
              values, tokens_);
          onChanged();
        } else {
          tokensBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto tokens = 1;</code>
       */
      public Builder clearTokens() {
        if (tokensBuilder_ == null) {
          tokens_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          tokensBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto tokens = 1;</code>
       */
      public Builder removeTokens(int index) {
        if (tokensBuilder_ == null) {
          ensureTokensIsMutable();
          tokens_.remove(index);
          onChanged();
        } else {
          tokensBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto tokens = 1;</code>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto.Builder getTokensBuilder(
          int index) {
        return getTokensFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto tokens = 1;</code>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProtoOrBuilder getTokensOrBuilder(
          int index) {
        if (tokensBuilder_ == null) {
          return tokens_.get(index);  } else {
          return tokensBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto tokens = 1;</code>
       */
      public java.util.List<? extends org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProtoOrBuilder> 
           getTokensOrBuilderList() {
        if (tokensBuilder_ != null) {
          return tokensBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(tokens_);
        }
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto tokens = 1;</code>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto.Builder addTokensBuilder() {
        return getTokensFieldBuilder().addBuilder(
            org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto tokens = 1;</code>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto.Builder addTokensBuilder(
          int index) {
        return getTokensFieldBuilder().addBuilder(
            index, org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto tokens = 1;</code>
       */
      public java.util.List<org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto.Builder> 
           getTokensBuilderList() {
        return getTokensFieldBuilder().getBuilderList();
      }
      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto, org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto.Builder, org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProtoOrBuilder> 
          getTokensFieldBuilder() {
        if (tokensBuilder_ == null) {
          tokensBuilder_ = new org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
              org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto, org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto.Builder, org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProtoOrBuilder>(
                  tokens_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          tokens_ = null;
        }
        return tokensBuilder_;
      }

      private java.util.List<org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto> secrets_ =
        java.util.Collections.emptyList();
      private void ensureSecretsIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          secrets_ = new java.util.ArrayList<org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto>(secrets_);
          bitField0_ |= 0x00000002;
         }
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto, org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto.Builder, org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProtoOrBuilder> secretsBuilder_;

      /**
       * <code>repeated .hadoop.common.CredentialsKVProto secrets = 2;</code>
       */
      public java.util.List<org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto> getSecretsList() {
        if (secretsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(secrets_);
        } else {
          return secretsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto secrets = 2;</code>
       */
      public int getSecretsCount() {
        if (secretsBuilder_ == null) {
          return secrets_.size();
        } else {
          return secretsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto secrets = 2;</code>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto getSecrets(int index) {
        if (secretsBuilder_ == null) {
          return secrets_.get(index);
        } else {
          return secretsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto secrets = 2;</code>
       */
      public Builder setSecrets(
          int index, org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto value) {
        if (secretsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSecretsIsMutable();
          secrets_.set(index, value);
          onChanged();
        } else {
          secretsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto secrets = 2;</code>
       */
      public Builder setSecrets(
          int index, org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto.Builder builderForValue) {
        if (secretsBuilder_ == null) {
          ensureSecretsIsMutable();
          secrets_.set(index, builderForValue.build());
          onChanged();
        } else {
          secretsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto secrets = 2;</code>
       */
      public Builder addSecrets(org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto value) {
        if (secretsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSecretsIsMutable();
          secrets_.add(value);
          onChanged();
        } else {
          secretsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto secrets = 2;</code>
       */
      public Builder addSecrets(
          int index, org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto value) {
        if (secretsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSecretsIsMutable();
          secrets_.add(index, value);
          onChanged();
        } else {
          secretsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto secrets = 2;</code>
       */
      public Builder addSecrets(
          org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto.Builder builderForValue) {
        if (secretsBuilder_ == null) {
          ensureSecretsIsMutable();
          secrets_.add(builderForValue.build());
          onChanged();
        } else {
          secretsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto secrets = 2;</code>
       */
      public Builder addSecrets(
          int index, org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto.Builder builderForValue) {
        if (secretsBuilder_ == null) {
          ensureSecretsIsMutable();
          secrets_.add(index, builderForValue.build());
          onChanged();
        } else {
          secretsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto secrets = 2;</code>
       */
      public Builder addAllSecrets(
          java.lang.Iterable<? extends org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto> values) {
        if (secretsBuilder_ == null) {
          ensureSecretsIsMutable();
          org.apache.hadoop.thirdparty.protobuf.AbstractMessageLite.Builder.addAll(
              values, secrets_);
          onChanged();
        } else {
          secretsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto secrets = 2;</code>
       */
      public Builder clearSecrets() {
        if (secretsBuilder_ == null) {
          secrets_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          secretsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto secrets = 2;</code>
       */
      public Builder removeSecrets(int index) {
        if (secretsBuilder_ == null) {
          ensureSecretsIsMutable();
          secrets_.remove(index);
          onChanged();
        } else {
          secretsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto secrets = 2;</code>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto.Builder getSecretsBuilder(
          int index) {
        return getSecretsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto secrets = 2;</code>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProtoOrBuilder getSecretsOrBuilder(
          int index) {
        if (secretsBuilder_ == null) {
          return secrets_.get(index);  } else {
          return secretsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto secrets = 2;</code>
       */
      public java.util.List<? extends org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProtoOrBuilder> 
           getSecretsOrBuilderList() {
        if (secretsBuilder_ != null) {
          return secretsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(secrets_);
        }
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto secrets = 2;</code>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto.Builder addSecretsBuilder() {
        return getSecretsFieldBuilder().addBuilder(
            org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto secrets = 2;</code>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto.Builder addSecretsBuilder(
          int index) {
        return getSecretsFieldBuilder().addBuilder(
            index, org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.common.CredentialsKVProto secrets = 2;</code>
       */
      public java.util.List<org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto.Builder> 
           getSecretsBuilderList() {
        return getSecretsFieldBuilder().getBuilderList();
      }
      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto, org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto.Builder, org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProtoOrBuilder> 
          getSecretsFieldBuilder() {
        if (secretsBuilder_ == null) {
          secretsBuilder_ = new org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
              org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto, org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProto.Builder, org.apache.hadoop.security.proto.SecurityProtos.CredentialsKVProtoOrBuilder>(
                  secrets_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          secrets_ = null;
        }
        return secretsBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.CredentialsProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.CredentialsProto)
    private static final org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto();
    }

    public static org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<CredentialsProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<CredentialsProto>() {
      @java.lang.Override
      public CredentialsProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new CredentialsProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<CredentialsProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<CredentialsProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.security.proto.SecurityProtos.CredentialsProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GetDelegationTokenRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.GetDelegationTokenRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required string renewer = 1;</code>
     */
    boolean hasRenewer();
    /**
     * <code>required string renewer = 1;</code>
     */
    java.lang.String getRenewer();
    /**
     * <code>required string renewer = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getRenewerBytes();
  }
  /**
   * Protobuf type {@code hadoop.common.GetDelegationTokenRequestProto}
   */
  public  static final class GetDelegationTokenRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.GetDelegationTokenRequestProto)
      GetDelegationTokenRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetDelegationTokenRequestProto.newBuilder() to construct.
    private GetDelegationTokenRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetDelegationTokenRequestProto() {
      renewer_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetDelegationTokenRequestProto(
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
              renewer_ = bs;
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
      return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_GetDelegationTokenRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_GetDelegationTokenRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto.class, org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto.Builder.class);
    }

    private int bitField0_;
    public static final int RENEWER_FIELD_NUMBER = 1;
    private volatile java.lang.Object renewer_;
    /**
     * <code>required string renewer = 1;</code>
     */
    public boolean hasRenewer() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string renewer = 1;</code>
     */
    public java.lang.String getRenewer() {
      java.lang.Object ref = renewer_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          renewer_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string renewer = 1;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getRenewerBytes() {
      java.lang.Object ref = renewer_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        renewer_ = b;
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

      if (!hasRenewer()) {
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, renewer_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, renewer_);
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
      if (!(obj instanceof org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto other = (org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto) obj;

      if (hasRenewer() != other.hasRenewer()) return false;
      if (hasRenewer()) {
        if (!getRenewer()
            .equals(other.getRenewer())) return false;
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
      if (hasRenewer()) {
        hash = (37 * hash) + RENEWER_FIELD_NUMBER;
        hash = (53 * hash) + getRenewer().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto prototype) {
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
     * Protobuf type {@code hadoop.common.GetDelegationTokenRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.GetDelegationTokenRequestProto)
        org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_GetDelegationTokenRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_GetDelegationTokenRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto.class, org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto.newBuilder()
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
        renewer_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_GetDelegationTokenRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto build() {
        org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto buildPartial() {
        org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto result = new org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.renewer_ = renewer_;
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
        if (other instanceof org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto) {
          return mergeFrom((org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto other) {
        if (other == org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto.getDefaultInstance()) return this;
        if (other.hasRenewer()) {
          bitField0_ |= 0x00000001;
          renewer_ = other.renewer_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasRenewer()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object renewer_ = "";
      /**
       * <code>required string renewer = 1;</code>
       */
      public boolean hasRenewer() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string renewer = 1;</code>
       */
      public java.lang.String getRenewer() {
        java.lang.Object ref = renewer_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            renewer_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string renewer = 1;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getRenewerBytes() {
        java.lang.Object ref = renewer_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          renewer_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string renewer = 1;</code>
       */
      public Builder setRenewer(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        renewer_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string renewer = 1;</code>
       */
      public Builder clearRenewer() {
        bitField0_ = (bitField0_ & ~0x00000001);
        renewer_ = getDefaultInstance().getRenewer();
        onChanged();
        return this;
      }
      /**
       * <code>required string renewer = 1;</code>
       */
      public Builder setRenewerBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        renewer_ = value;
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.GetDelegationTokenRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.GetDelegationTokenRequestProto)
    private static final org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto();
    }

    public static org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<GetDelegationTokenRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<GetDelegationTokenRequestProto>() {
      @java.lang.Override
      public GetDelegationTokenRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new GetDelegationTokenRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<GetDelegationTokenRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<GetDelegationTokenRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GetDelegationTokenResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.GetDelegationTokenResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>optional .hadoop.common.TokenProto token = 1;</code>
     */
    boolean hasToken();
    /**
     * <code>optional .hadoop.common.TokenProto token = 1;</code>
     */
    org.apache.hadoop.security.proto.SecurityProtos.TokenProto getToken();
    /**
     * <code>optional .hadoop.common.TokenProto token = 1;</code>
     */
    org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder getTokenOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.common.GetDelegationTokenResponseProto}
   */
  public  static final class GetDelegationTokenResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.GetDelegationTokenResponseProto)
      GetDelegationTokenResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetDelegationTokenResponseProto.newBuilder() to construct.
    private GetDelegationTokenResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetDelegationTokenResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetDelegationTokenResponseProto(
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
              org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = token_.toBuilder();
              }
              token_ = input.readMessage(org.apache.hadoop.security.proto.SecurityProtos.TokenProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(token_);
                token_ = subBuilder.buildPartial();
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
      return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_GetDelegationTokenResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_GetDelegationTokenResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto.class, org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto.Builder.class);
    }

    private int bitField0_;
    public static final int TOKEN_FIELD_NUMBER = 1;
    private org.apache.hadoop.security.proto.SecurityProtos.TokenProto token_;
    /**
     * <code>optional .hadoop.common.TokenProto token = 1;</code>
     */
    public boolean hasToken() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .hadoop.common.TokenProto token = 1;</code>
     */
    public org.apache.hadoop.security.proto.SecurityProtos.TokenProto getToken() {
      return token_ == null ? org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance() : token_;
    }
    /**
     * <code>optional .hadoop.common.TokenProto token = 1;</code>
     */
    public org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder getTokenOrBuilder() {
      return token_ == null ? org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance() : token_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (hasToken()) {
        if (!getToken().isInitialized()) {
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
        output.writeMessage(1, getToken());
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
          .computeMessageSize(1, getToken());
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
      if (!(obj instanceof org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto other = (org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto) obj;

      if (hasToken() != other.hasToken()) return false;
      if (hasToken()) {
        if (!getToken()
            .equals(other.getToken())) return false;
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
      if (hasToken()) {
        hash = (37 * hash) + TOKEN_FIELD_NUMBER;
        hash = (53 * hash) + getToken().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto prototype) {
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
     * Protobuf type {@code hadoop.common.GetDelegationTokenResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.GetDelegationTokenResponseProto)
        org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_GetDelegationTokenResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_GetDelegationTokenResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto.class, org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto.newBuilder()
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
          getTokenFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (tokenBuilder_ == null) {
          token_ = null;
        } else {
          tokenBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_GetDelegationTokenResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto build() {
        org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto buildPartial() {
        org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto result = new org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (tokenBuilder_ == null) {
            result.token_ = token_;
          } else {
            result.token_ = tokenBuilder_.build();
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
        if (other instanceof org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto) {
          return mergeFrom((org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto other) {
        if (other == org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto.getDefaultInstance()) return this;
        if (other.hasToken()) {
          mergeToken(other.getToken());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (hasToken()) {
          if (!getToken().isInitialized()) {
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
        org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private org.apache.hadoop.security.proto.SecurityProtos.TokenProto token_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.security.proto.SecurityProtos.TokenProto, org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder, org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder> tokenBuilder_;
      /**
       * <code>optional .hadoop.common.TokenProto token = 1;</code>
       */
      public boolean hasToken() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional .hadoop.common.TokenProto token = 1;</code>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.TokenProto getToken() {
        if (tokenBuilder_ == null) {
          return token_ == null ? org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance() : token_;
        } else {
          return tokenBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .hadoop.common.TokenProto token = 1;</code>
       */
      public Builder setToken(org.apache.hadoop.security.proto.SecurityProtos.TokenProto value) {
        if (tokenBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          token_ = value;
          onChanged();
        } else {
          tokenBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .hadoop.common.TokenProto token = 1;</code>
       */
      public Builder setToken(
          org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder builderForValue) {
        if (tokenBuilder_ == null) {
          token_ = builderForValue.build();
          onChanged();
        } else {
          tokenBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .hadoop.common.TokenProto token = 1;</code>
       */
      public Builder mergeToken(org.apache.hadoop.security.proto.SecurityProtos.TokenProto value) {
        if (tokenBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              token_ != null &&
              token_ != org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance()) {
            token_ =
              org.apache.hadoop.security.proto.SecurityProtos.TokenProto.newBuilder(token_).mergeFrom(value).buildPartial();
          } else {
            token_ = value;
          }
          onChanged();
        } else {
          tokenBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .hadoop.common.TokenProto token = 1;</code>
       */
      public Builder clearToken() {
        if (tokenBuilder_ == null) {
          token_ = null;
          onChanged();
        } else {
          tokenBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>optional .hadoop.common.TokenProto token = 1;</code>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder getTokenBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getTokenFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .hadoop.common.TokenProto token = 1;</code>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder getTokenOrBuilder() {
        if (tokenBuilder_ != null) {
          return tokenBuilder_.getMessageOrBuilder();
        } else {
          return token_ == null ?
              org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance() : token_;
        }
      }
      /**
       * <code>optional .hadoop.common.TokenProto token = 1;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.security.proto.SecurityProtos.TokenProto, org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder, org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder> 
          getTokenFieldBuilder() {
        if (tokenBuilder_ == null) {
          tokenBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.security.proto.SecurityProtos.TokenProto, org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder, org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder>(
                  getToken(),
                  getParentForChildren(),
                  isClean());
          token_ = null;
        }
        return tokenBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.GetDelegationTokenResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.GetDelegationTokenResponseProto)
    private static final org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto();
    }

    public static org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<GetDelegationTokenResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<GetDelegationTokenResponseProto>() {
      @java.lang.Override
      public GetDelegationTokenResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new GetDelegationTokenResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<GetDelegationTokenResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<GetDelegationTokenResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.security.proto.SecurityProtos.GetDelegationTokenResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RenewDelegationTokenRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.RenewDelegationTokenRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required .hadoop.common.TokenProto token = 1;</code>
     */
    boolean hasToken();
    /**
     * <code>required .hadoop.common.TokenProto token = 1;</code>
     */
    org.apache.hadoop.security.proto.SecurityProtos.TokenProto getToken();
    /**
     * <code>required .hadoop.common.TokenProto token = 1;</code>
     */
    org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder getTokenOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.common.RenewDelegationTokenRequestProto}
   */
  public  static final class RenewDelegationTokenRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.RenewDelegationTokenRequestProto)
      RenewDelegationTokenRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RenewDelegationTokenRequestProto.newBuilder() to construct.
    private RenewDelegationTokenRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RenewDelegationTokenRequestProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RenewDelegationTokenRequestProto(
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
              org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = token_.toBuilder();
              }
              token_ = input.readMessage(org.apache.hadoop.security.proto.SecurityProtos.TokenProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(token_);
                token_ = subBuilder.buildPartial();
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
      return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_RenewDelegationTokenRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_RenewDelegationTokenRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto.class, org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto.Builder.class);
    }

    private int bitField0_;
    public static final int TOKEN_FIELD_NUMBER = 1;
    private org.apache.hadoop.security.proto.SecurityProtos.TokenProto token_;
    /**
     * <code>required .hadoop.common.TokenProto token = 1;</code>
     */
    public boolean hasToken() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required .hadoop.common.TokenProto token = 1;</code>
     */
    public org.apache.hadoop.security.proto.SecurityProtos.TokenProto getToken() {
      return token_ == null ? org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance() : token_;
    }
    /**
     * <code>required .hadoop.common.TokenProto token = 1;</code>
     */
    public org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder getTokenOrBuilder() {
      return token_ == null ? org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance() : token_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasToken()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getToken().isInitialized()) {
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
        output.writeMessage(1, getToken());
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
          .computeMessageSize(1, getToken());
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
      if (!(obj instanceof org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto other = (org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto) obj;

      if (hasToken() != other.hasToken()) return false;
      if (hasToken()) {
        if (!getToken()
            .equals(other.getToken())) return false;
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
      if (hasToken()) {
        hash = (37 * hash) + TOKEN_FIELD_NUMBER;
        hash = (53 * hash) + getToken().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto prototype) {
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
     * Protobuf type {@code hadoop.common.RenewDelegationTokenRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.RenewDelegationTokenRequestProto)
        org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_RenewDelegationTokenRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_RenewDelegationTokenRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto.class, org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto.newBuilder()
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
          getTokenFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (tokenBuilder_ == null) {
          token_ = null;
        } else {
          tokenBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_RenewDelegationTokenRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto build() {
        org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto buildPartial() {
        org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto result = new org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (tokenBuilder_ == null) {
            result.token_ = token_;
          } else {
            result.token_ = tokenBuilder_.build();
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
        if (other instanceof org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto) {
          return mergeFrom((org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto other) {
        if (other == org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto.getDefaultInstance()) return this;
        if (other.hasToken()) {
          mergeToken(other.getToken());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasToken()) {
          return false;
        }
        if (!getToken().isInitialized()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private org.apache.hadoop.security.proto.SecurityProtos.TokenProto token_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.security.proto.SecurityProtos.TokenProto, org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder, org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder> tokenBuilder_;
      /**
       * <code>required .hadoop.common.TokenProto token = 1;</code>
       */
      public boolean hasToken() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required .hadoop.common.TokenProto token = 1;</code>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.TokenProto getToken() {
        if (tokenBuilder_ == null) {
          return token_ == null ? org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance() : token_;
        } else {
          return tokenBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.common.TokenProto token = 1;</code>
       */
      public Builder setToken(org.apache.hadoop.security.proto.SecurityProtos.TokenProto value) {
        if (tokenBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          token_ = value;
          onChanged();
        } else {
          tokenBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.common.TokenProto token = 1;</code>
       */
      public Builder setToken(
          org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder builderForValue) {
        if (tokenBuilder_ == null) {
          token_ = builderForValue.build();
          onChanged();
        } else {
          tokenBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.common.TokenProto token = 1;</code>
       */
      public Builder mergeToken(org.apache.hadoop.security.proto.SecurityProtos.TokenProto value) {
        if (tokenBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              token_ != null &&
              token_ != org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance()) {
            token_ =
              org.apache.hadoop.security.proto.SecurityProtos.TokenProto.newBuilder(token_).mergeFrom(value).buildPartial();
          } else {
            token_ = value;
          }
          onChanged();
        } else {
          tokenBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.common.TokenProto token = 1;</code>
       */
      public Builder clearToken() {
        if (tokenBuilder_ == null) {
          token_ = null;
          onChanged();
        } else {
          tokenBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.common.TokenProto token = 1;</code>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder getTokenBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getTokenFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.common.TokenProto token = 1;</code>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder getTokenOrBuilder() {
        if (tokenBuilder_ != null) {
          return tokenBuilder_.getMessageOrBuilder();
        } else {
          return token_ == null ?
              org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance() : token_;
        }
      }
      /**
       * <code>required .hadoop.common.TokenProto token = 1;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.security.proto.SecurityProtos.TokenProto, org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder, org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder> 
          getTokenFieldBuilder() {
        if (tokenBuilder_ == null) {
          tokenBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.security.proto.SecurityProtos.TokenProto, org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder, org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder>(
                  getToken(),
                  getParentForChildren(),
                  isClean());
          token_ = null;
        }
        return tokenBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.RenewDelegationTokenRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.RenewDelegationTokenRequestProto)
    private static final org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto();
    }

    public static org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<RenewDelegationTokenRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<RenewDelegationTokenRequestProto>() {
      @java.lang.Override
      public RenewDelegationTokenRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new RenewDelegationTokenRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<RenewDelegationTokenRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<RenewDelegationTokenRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RenewDelegationTokenResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.RenewDelegationTokenResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required uint64 newExpiryTime = 1;</code>
     */
    boolean hasNewExpiryTime();
    /**
     * <code>required uint64 newExpiryTime = 1;</code>
     */
    long getNewExpiryTime();
  }
  /**
   * Protobuf type {@code hadoop.common.RenewDelegationTokenResponseProto}
   */
  public  static final class RenewDelegationTokenResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.RenewDelegationTokenResponseProto)
      RenewDelegationTokenResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RenewDelegationTokenResponseProto.newBuilder() to construct.
    private RenewDelegationTokenResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RenewDelegationTokenResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RenewDelegationTokenResponseProto(
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
              newExpiryTime_ = input.readUInt64();
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
      return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_RenewDelegationTokenResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_RenewDelegationTokenResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto.class, org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto.Builder.class);
    }

    private int bitField0_;
    public static final int NEWEXPIRYTIME_FIELD_NUMBER = 1;
    private long newExpiryTime_;
    /**
     * <code>required uint64 newExpiryTime = 1;</code>
     */
    public boolean hasNewExpiryTime() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required uint64 newExpiryTime = 1;</code>
     */
    public long getNewExpiryTime() {
      return newExpiryTime_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasNewExpiryTime()) {
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
        output.writeUInt64(1, newExpiryTime_);
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
          .computeUInt64Size(1, newExpiryTime_);
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
      if (!(obj instanceof org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto other = (org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto) obj;

      if (hasNewExpiryTime() != other.hasNewExpiryTime()) return false;
      if (hasNewExpiryTime()) {
        if (getNewExpiryTime()
            != other.getNewExpiryTime()) return false;
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
      if (hasNewExpiryTime()) {
        hash = (37 * hash) + NEWEXPIRYTIME_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getNewExpiryTime());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto prototype) {
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
     * Protobuf type {@code hadoop.common.RenewDelegationTokenResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.RenewDelegationTokenResponseProto)
        org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_RenewDelegationTokenResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_RenewDelegationTokenResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto.class, org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto.newBuilder()
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
        newExpiryTime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_RenewDelegationTokenResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto build() {
        org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto buildPartial() {
        org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto result = new org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.newExpiryTime_ = newExpiryTime_;
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
        if (other instanceof org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto) {
          return mergeFrom((org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto other) {
        if (other == org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto.getDefaultInstance()) return this;
        if (other.hasNewExpiryTime()) {
          setNewExpiryTime(other.getNewExpiryTime());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasNewExpiryTime()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long newExpiryTime_ ;
      /**
       * <code>required uint64 newExpiryTime = 1;</code>
       */
      public boolean hasNewExpiryTime() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required uint64 newExpiryTime = 1;</code>
       */
      public long getNewExpiryTime() {
        return newExpiryTime_;
      }
      /**
       * <code>required uint64 newExpiryTime = 1;</code>
       */
      public Builder setNewExpiryTime(long value) {
        bitField0_ |= 0x00000001;
        newExpiryTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 newExpiryTime = 1;</code>
       */
      public Builder clearNewExpiryTime() {
        bitField0_ = (bitField0_ & ~0x00000001);
        newExpiryTime_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.RenewDelegationTokenResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.RenewDelegationTokenResponseProto)
    private static final org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto();
    }

    public static org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<RenewDelegationTokenResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<RenewDelegationTokenResponseProto>() {
      @java.lang.Override
      public RenewDelegationTokenResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new RenewDelegationTokenResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<RenewDelegationTokenResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<RenewDelegationTokenResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.security.proto.SecurityProtos.RenewDelegationTokenResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CancelDelegationTokenRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.CancelDelegationTokenRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required .hadoop.common.TokenProto token = 1;</code>
     */
    boolean hasToken();
    /**
     * <code>required .hadoop.common.TokenProto token = 1;</code>
     */
    org.apache.hadoop.security.proto.SecurityProtos.TokenProto getToken();
    /**
     * <code>required .hadoop.common.TokenProto token = 1;</code>
     */
    org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder getTokenOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.common.CancelDelegationTokenRequestProto}
   */
  public  static final class CancelDelegationTokenRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.CancelDelegationTokenRequestProto)
      CancelDelegationTokenRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CancelDelegationTokenRequestProto.newBuilder() to construct.
    private CancelDelegationTokenRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CancelDelegationTokenRequestProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CancelDelegationTokenRequestProto(
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
              org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = token_.toBuilder();
              }
              token_ = input.readMessage(org.apache.hadoop.security.proto.SecurityProtos.TokenProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(token_);
                token_ = subBuilder.buildPartial();
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
      return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_CancelDelegationTokenRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_CancelDelegationTokenRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto.class, org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto.Builder.class);
    }

    private int bitField0_;
    public static final int TOKEN_FIELD_NUMBER = 1;
    private org.apache.hadoop.security.proto.SecurityProtos.TokenProto token_;
    /**
     * <code>required .hadoop.common.TokenProto token = 1;</code>
     */
    public boolean hasToken() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required .hadoop.common.TokenProto token = 1;</code>
     */
    public org.apache.hadoop.security.proto.SecurityProtos.TokenProto getToken() {
      return token_ == null ? org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance() : token_;
    }
    /**
     * <code>required .hadoop.common.TokenProto token = 1;</code>
     */
    public org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder getTokenOrBuilder() {
      return token_ == null ? org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance() : token_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasToken()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getToken().isInitialized()) {
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
        output.writeMessage(1, getToken());
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
          .computeMessageSize(1, getToken());
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
      if (!(obj instanceof org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto other = (org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto) obj;

      if (hasToken() != other.hasToken()) return false;
      if (hasToken()) {
        if (!getToken()
            .equals(other.getToken())) return false;
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
      if (hasToken()) {
        hash = (37 * hash) + TOKEN_FIELD_NUMBER;
        hash = (53 * hash) + getToken().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto prototype) {
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
     * Protobuf type {@code hadoop.common.CancelDelegationTokenRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.CancelDelegationTokenRequestProto)
        org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_CancelDelegationTokenRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_CancelDelegationTokenRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto.class, org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto.newBuilder()
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
          getTokenFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (tokenBuilder_ == null) {
          token_ = null;
        } else {
          tokenBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_CancelDelegationTokenRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto build() {
        org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto buildPartial() {
        org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto result = new org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (tokenBuilder_ == null) {
            result.token_ = token_;
          } else {
            result.token_ = tokenBuilder_.build();
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
        if (other instanceof org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto) {
          return mergeFrom((org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto other) {
        if (other == org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto.getDefaultInstance()) return this;
        if (other.hasToken()) {
          mergeToken(other.getToken());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasToken()) {
          return false;
        }
        if (!getToken().isInitialized()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private org.apache.hadoop.security.proto.SecurityProtos.TokenProto token_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.security.proto.SecurityProtos.TokenProto, org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder, org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder> tokenBuilder_;
      /**
       * <code>required .hadoop.common.TokenProto token = 1;</code>
       */
      public boolean hasToken() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required .hadoop.common.TokenProto token = 1;</code>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.TokenProto getToken() {
        if (tokenBuilder_ == null) {
          return token_ == null ? org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance() : token_;
        } else {
          return tokenBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.common.TokenProto token = 1;</code>
       */
      public Builder setToken(org.apache.hadoop.security.proto.SecurityProtos.TokenProto value) {
        if (tokenBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          token_ = value;
          onChanged();
        } else {
          tokenBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.common.TokenProto token = 1;</code>
       */
      public Builder setToken(
          org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder builderForValue) {
        if (tokenBuilder_ == null) {
          token_ = builderForValue.build();
          onChanged();
        } else {
          tokenBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.common.TokenProto token = 1;</code>
       */
      public Builder mergeToken(org.apache.hadoop.security.proto.SecurityProtos.TokenProto value) {
        if (tokenBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              token_ != null &&
              token_ != org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance()) {
            token_ =
              org.apache.hadoop.security.proto.SecurityProtos.TokenProto.newBuilder(token_).mergeFrom(value).buildPartial();
          } else {
            token_ = value;
          }
          onChanged();
        } else {
          tokenBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.common.TokenProto token = 1;</code>
       */
      public Builder clearToken() {
        if (tokenBuilder_ == null) {
          token_ = null;
          onChanged();
        } else {
          tokenBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.common.TokenProto token = 1;</code>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder getTokenBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getTokenFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.common.TokenProto token = 1;</code>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder getTokenOrBuilder() {
        if (tokenBuilder_ != null) {
          return tokenBuilder_.getMessageOrBuilder();
        } else {
          return token_ == null ?
              org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance() : token_;
        }
      }
      /**
       * <code>required .hadoop.common.TokenProto token = 1;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.security.proto.SecurityProtos.TokenProto, org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder, org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder> 
          getTokenFieldBuilder() {
        if (tokenBuilder_ == null) {
          tokenBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.security.proto.SecurityProtos.TokenProto, org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder, org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder>(
                  getToken(),
                  getParentForChildren(),
                  isClean());
          token_ = null;
        }
        return tokenBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.CancelDelegationTokenRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.CancelDelegationTokenRequestProto)
    private static final org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto();
    }

    public static org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<CancelDelegationTokenRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<CancelDelegationTokenRequestProto>() {
      @java.lang.Override
      public CancelDelegationTokenRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new CancelDelegationTokenRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<CancelDelegationTokenRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<CancelDelegationTokenRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CancelDelegationTokenResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.CancelDelegationTokenResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   * void response
   * </pre>
   *
   * Protobuf type {@code hadoop.common.CancelDelegationTokenResponseProto}
   */
  public  static final class CancelDelegationTokenResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.CancelDelegationTokenResponseProto)
      CancelDelegationTokenResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CancelDelegationTokenResponseProto.newBuilder() to construct.
    private CancelDelegationTokenResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CancelDelegationTokenResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CancelDelegationTokenResponseProto(
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
      return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_CancelDelegationTokenResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_CancelDelegationTokenResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto.class, org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto.Builder.class);
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
      if (!(obj instanceof org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto other = (org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto) obj;

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

    public static org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto prototype) {
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
     * void response
     * </pre>
     *
     * Protobuf type {@code hadoop.common.CancelDelegationTokenResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.CancelDelegationTokenResponseProto)
        org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_CancelDelegationTokenResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_CancelDelegationTokenResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto.class, org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto.newBuilder()
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
        return org.apache.hadoop.security.proto.SecurityProtos.internal_static_hadoop_common_CancelDelegationTokenResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto build() {
        org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto buildPartial() {
        org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto result = new org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto(this);
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
        if (other instanceof org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto) {
          return mergeFrom((org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto other) {
        if (other == org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto) e.getUnfinishedMessage();
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.CancelDelegationTokenResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.CancelDelegationTokenResponseProto)
    private static final org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto();
    }

    public static org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<CancelDelegationTokenResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<CancelDelegationTokenResponseProto>() {
      @java.lang.Override
      public CancelDelegationTokenResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new CancelDelegationTokenResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<CancelDelegationTokenResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<CancelDelegationTokenResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.security.proto.SecurityProtos.CancelDelegationTokenResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_TokenProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_TokenProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_CredentialsKVProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_CredentialsKVProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_CredentialsProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_CredentialsProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_GetDelegationTokenRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_GetDelegationTokenRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_GetDelegationTokenResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_GetDelegationTokenResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_RenewDelegationTokenRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_RenewDelegationTokenRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_RenewDelegationTokenResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_RenewDelegationTokenResponseProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_CancelDelegationTokenRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_CancelDelegationTokenRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_CancelDelegationTokenResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_CancelDelegationTokenResponseProto_fieldAccessorTable;

  public static org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016Security.proto\022\rhadoop.common\"Q\n\nToken" +
      "Proto\022\022\n\nidentifier\030\001 \002(\014\022\020\n\010password\030\002 " +
      "\002(\014\022\014\n\004kind\030\003 \002(\t\022\017\n\007service\030\004 \002(\t\"]\n\022Cr" +
      "edentialsKVProto\022\r\n\005alias\030\001 \002(\t\022(\n\005token" +
      "\030\002 \001(\0132\031.hadoop.common.TokenProto\022\016\n\006sec" +
      "ret\030\003 \001(\014\"y\n\020CredentialsProto\0221\n\006tokens\030" +
      "\001 \003(\0132!.hadoop.common.CredentialsKVProto" +
      "\0222\n\007secrets\030\002 \003(\0132!.hadoop.common.Creden" +
      "tialsKVProto\"1\n\036GetDelegationTokenReques" +
      "tProto\022\017\n\007renewer\030\001 \002(\t\"K\n\037GetDelegation" +
      "TokenResponseProto\022(\n\005token\030\001 \001(\0132\031.hado" +
      "op.common.TokenProto\"L\n RenewDelegationT" +
      "okenRequestProto\022(\n\005token\030\001 \002(\0132\031.hadoop" +
      ".common.TokenProto\":\n!RenewDelegationTok" +
      "enResponseProto\022\025\n\rnewExpiryTime\030\001 \002(\004\"M" +
      "\n!CancelDelegationTokenRequestProto\022(\n\005t" +
      "oken\030\001 \002(\0132\031.hadoop.common.TokenProto\"$\n" +
      "\"CancelDelegationTokenResponseProtoB8\n o" +
      "rg.apache.hadoop.security.protoB\016Securit" +
      "yProtos\210\001\001\240\001\001"
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
    internal_static_hadoop_common_TokenProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hadoop_common_TokenProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_TokenProto_descriptor,
        new java.lang.String[] { "Identifier", "Password", "Kind", "Service", });
    internal_static_hadoop_common_CredentialsKVProto_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hadoop_common_CredentialsKVProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_CredentialsKVProto_descriptor,
        new java.lang.String[] { "Alias", "Token", "Secret", });
    internal_static_hadoop_common_CredentialsProto_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_hadoop_common_CredentialsProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_CredentialsProto_descriptor,
        new java.lang.String[] { "Tokens", "Secrets", });
    internal_static_hadoop_common_GetDelegationTokenRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_hadoop_common_GetDelegationTokenRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_GetDelegationTokenRequestProto_descriptor,
        new java.lang.String[] { "Renewer", });
    internal_static_hadoop_common_GetDelegationTokenResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_hadoop_common_GetDelegationTokenResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_GetDelegationTokenResponseProto_descriptor,
        new java.lang.String[] { "Token", });
    internal_static_hadoop_common_RenewDelegationTokenRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_hadoop_common_RenewDelegationTokenRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_RenewDelegationTokenRequestProto_descriptor,
        new java.lang.String[] { "Token", });
    internal_static_hadoop_common_RenewDelegationTokenResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_hadoop_common_RenewDelegationTokenResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_RenewDelegationTokenResponseProto_descriptor,
        new java.lang.String[] { "NewExpiryTime", });
    internal_static_hadoop_common_CancelDelegationTokenRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_hadoop_common_CancelDelegationTokenRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_CancelDelegationTokenRequestProto_descriptor,
        new java.lang.String[] { "Token", });
    internal_static_hadoop_common_CancelDelegationTokenResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_hadoop_common_CancelDelegationTokenResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_CancelDelegationTokenResponseProto_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
