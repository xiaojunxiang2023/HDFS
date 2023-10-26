// source: RefreshAuthorizationPolicyProtocol.proto

package org.apache.hadoop.security.proto;

public final class RefreshAuthorizationPolicyProtocolProtos {
  private RefreshAuthorizationPolicyProtocolProtos() {}
  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RefreshServiceAclRequestProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.RefreshServiceAclRequestProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   **
   *  Refresh service acl request.
   * </pre>
   *
   * Protobuf type {@code hadoop.common.RefreshServiceAclRequestProto}
   */
  public  static final class RefreshServiceAclRequestProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.RefreshServiceAclRequestProto)
      RefreshServiceAclRequestProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RefreshServiceAclRequestProto.newBuilder() to construct.
    private RefreshServiceAclRequestProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RefreshServiceAclRequestProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RefreshServiceAclRequestProto(
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
      return org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.internal_static_hadoop_common_RefreshServiceAclRequestProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.internal_static_hadoop_common_RefreshServiceAclRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto.class, org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto.Builder.class);
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
      if (!(obj instanceof org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto other = (org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto) obj;

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

    public static org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto prototype) {
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
     *  Refresh service acl request.
     * </pre>
     *
     * Protobuf type {@code hadoop.common.RefreshServiceAclRequestProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.RefreshServiceAclRequestProto)
        org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.internal_static_hadoop_common_RefreshServiceAclRequestProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.internal_static_hadoop_common_RefreshServiceAclRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto.class, org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto.newBuilder()
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
        return org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.internal_static_hadoop_common_RefreshServiceAclRequestProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto build() {
        org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto buildPartial() {
        org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto result = new org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto(this);
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
        if (other instanceof org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto) {
          return mergeFrom((org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto other) {
        if (other == org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto) e.getUnfinishedMessage();
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.RefreshServiceAclRequestProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.RefreshServiceAclRequestProto)
    private static final org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto();
    }

    public static org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<RefreshServiceAclRequestProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<RefreshServiceAclRequestProto>() {
      @java.lang.Override
      public RefreshServiceAclRequestProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new RefreshServiceAclRequestProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<RefreshServiceAclRequestProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<RefreshServiceAclRequestProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RefreshServiceAclResponseProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.common.RefreshServiceAclResponseProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   **
   * void response
   * </pre>
   *
   * Protobuf type {@code hadoop.common.RefreshServiceAclResponseProto}
   */
  public  static final class RefreshServiceAclResponseProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.common.RefreshServiceAclResponseProto)
      RefreshServiceAclResponseProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RefreshServiceAclResponseProto.newBuilder() to construct.
    private RefreshServiceAclResponseProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RefreshServiceAclResponseProto() {
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RefreshServiceAclResponseProto(
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
      return org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.internal_static_hadoop_common_RefreshServiceAclResponseProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.internal_static_hadoop_common_RefreshServiceAclResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto.class, org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto.Builder.class);
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
      if (!(obj instanceof org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto other = (org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto) obj;

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

    public static org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto prototype) {
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
     * Protobuf type {@code hadoop.common.RefreshServiceAclResponseProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.common.RefreshServiceAclResponseProto)
        org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.internal_static_hadoop_common_RefreshServiceAclResponseProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.internal_static_hadoop_common_RefreshServiceAclResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto.class, org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto.newBuilder()
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
        return org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.internal_static_hadoop_common_RefreshServiceAclResponseProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto build() {
        org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto buildPartial() {
        org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto result = new org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto(this);
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
        if (other instanceof org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto) {
          return mergeFrom((org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto other) {
        if (other == org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto) e.getUnfinishedMessage();
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


      // @@protoc_insertion_point(builder_scope:hadoop.common.RefreshServiceAclResponseProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.common.RefreshServiceAclResponseProto)
    private static final org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto();
    }

    public static org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<RefreshServiceAclResponseProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<RefreshServiceAclResponseProto>() {
      @java.lang.Override
      public RefreshServiceAclResponseProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new RefreshServiceAclResponseProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<RefreshServiceAclResponseProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<RefreshServiceAclResponseProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  /**
   * <pre>
   **
   * Protocol which is used to refresh the authorization policy in use currently.
   * </pre>
   *
   * Protobuf service {@code hadoop.common.RefreshAuthorizationPolicyProtocolService}
   */
  public static abstract class RefreshAuthorizationPolicyProtocolService
      implements org.apache.hadoop.thirdparty.protobuf.Service {
    protected RefreshAuthorizationPolicyProtocolService() {}

    public interface Interface {
      /**
       * <pre>
       **
       * Refresh the service-level authorization policy in-effect.
       * </pre>
       *
       * <code>rpc refreshServiceAcl(.hadoop.common.RefreshServiceAclRequestProto) returns (.hadoop.common.RefreshServiceAclResponseProto);</code>
       */
      public abstract void refreshServiceAcl(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto> done);

    }

    public static org.apache.hadoop.thirdparty.protobuf.Service newReflectiveService(
        final Interface impl) {
      return new RefreshAuthorizationPolicyProtocolService() {
        @java.lang.Override
        public  void refreshServiceAcl(
            org.apache.hadoop.thirdparty.protobuf.RpcController controller,
            org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto request,
            org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto> done) {
          impl.refreshServiceAcl(controller, request, done);
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
              return impl.refreshServiceAcl(controller, (org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto)request);
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
              return org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto.getDefaultInstance();
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
              return org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

      };
    }

    /**
     * <pre>
     **
     * Refresh the service-level authorization policy in-effect.
     * </pre>
     *
     * <code>rpc refreshServiceAcl(.hadoop.common.RefreshServiceAclRequestProto) returns (.hadoop.common.RefreshServiceAclResponseProto);</code>
     */
    public abstract void refreshServiceAcl(
        org.apache.hadoop.thirdparty.protobuf.RpcController controller,
        org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto request,
        org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto> done);

    public static final
        org.apache.hadoop.thirdparty.protobuf.Descriptors.ServiceDescriptor
        getDescriptor() {
      return org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.getDescriptor().getServices().get(0);
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
          this.refreshServiceAcl(controller, (org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto)request,
            org.apache.hadoop.thirdparty.protobuf.RpcUtil.<org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto>specializeCallback(
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
          return org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto.getDefaultInstance();
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
          return org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public static Stub newStub(
        org.apache.hadoop.thirdparty.protobuf.RpcChannel channel) {
      return new Stub(channel);
    }

    public static final class Stub extends org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshAuthorizationPolicyProtocolService implements Interface {
      private Stub(org.apache.hadoop.thirdparty.protobuf.RpcChannel channel) {
        this.channel = channel;
      }

      private final org.apache.hadoop.thirdparty.protobuf.RpcChannel channel;

      public org.apache.hadoop.thirdparty.protobuf.RpcChannel getChannel() {
        return channel;
      }

      public  void refreshServiceAcl(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto request,
          org.apache.hadoop.thirdparty.protobuf.RpcCallback<org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto.getDefaultInstance(),
          org.apache.hadoop.thirdparty.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto.class,
            org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto.getDefaultInstance()));
      }
    }

    public static BlockingInterface newBlockingStub(
        org.apache.hadoop.thirdparty.protobuf.BlockingRpcChannel channel) {
      return new BlockingStub(channel);
    }

    public interface BlockingInterface {
      public org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto refreshServiceAcl(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException;
    }

    private static final class BlockingStub implements BlockingInterface {
      private BlockingStub(org.apache.hadoop.thirdparty.protobuf.BlockingRpcChannel channel) {
        this.channel = channel;
      }

      private final org.apache.hadoop.thirdparty.protobuf.BlockingRpcChannel channel;

      public org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto refreshServiceAcl(
          org.apache.hadoop.thirdparty.protobuf.RpcController controller,
          org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclRequestProto request)
          throws org.apache.hadoop.thirdparty.protobuf.ServiceException {
        return (org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.security.proto.RefreshAuthorizationPolicyProtocolProtos.RefreshServiceAclResponseProto.getDefaultInstance());
      }

    }

    // @@protoc_insertion_point(class_scope:hadoop.common.RefreshAuthorizationPolicyProtocolService)
  }

  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_RefreshServiceAclRequestProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_RefreshServiceAclRequestProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_common_RefreshServiceAclResponseProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_common_RefreshServiceAclResponseProto_fieldAccessorTable;

  public static org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(RefreshAuthorizationPolicyProtocol.pro" +
      "to\022\rhadoop.common\"\037\n\035RefreshServiceAclRe" +
      "questProto\" \n\036RefreshServiceAclResponseP" +
      "roto2\235\001\n)RefreshAuthorizationPolicyProto" +
      "colService\022p\n\021refreshServiceAcl\022,.hadoop" +
      ".common.RefreshServiceAclRequestProto\032-." +
      "hadoop.common.RefreshServiceAclResponseP" +
      "rotoBR\n org.apache.hadoop.security.proto" +
      "B(RefreshAuthorizationPolicyProtocolProt" +
      "os\210\001\001\240\001\001"
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
    internal_static_hadoop_common_RefreshServiceAclRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hadoop_common_RefreshServiceAclRequestProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_RefreshServiceAclRequestProto_descriptor,
        new java.lang.String[] { });
    internal_static_hadoop_common_RefreshServiceAclResponseProto_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hadoop_common_RefreshServiceAclResponseProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_common_RefreshServiceAclResponseProto_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}