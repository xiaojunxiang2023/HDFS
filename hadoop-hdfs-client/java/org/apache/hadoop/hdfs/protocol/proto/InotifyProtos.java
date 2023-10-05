// source: inotify.proto

package org.apache.hadoop.hdfs.protocol.proto;

public final class InotifyProtos {
  private InotifyProtos() {}
  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.hadoop.thirdparty.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code hadoop.hdfs.EventType}
   */
  public enum EventType
      implements org.apache.hadoop.thirdparty.protobuf.ProtocolMessageEnum {
    /**
     * <code>EVENT_CREATE = 0;</code>
     */
    EVENT_CREATE(0),
    /**
     * <code>EVENT_CLOSE = 1;</code>
     */
    EVENT_CLOSE(1),
    /**
     * <code>EVENT_APPEND = 2;</code>
     */
    EVENT_APPEND(2),
    /**
     * <code>EVENT_RENAME = 3;</code>
     */
    EVENT_RENAME(3),
    /**
     * <code>EVENT_METADATA = 4;</code>
     */
    EVENT_METADATA(4),
    /**
     * <code>EVENT_UNLINK = 5;</code>
     */
    EVENT_UNLINK(5),
    /**
     * <code>EVENT_TRUNCATE = 6;</code>
     */
    EVENT_TRUNCATE(6),
    ;

    /**
     * <code>EVENT_CREATE = 0;</code>
     */
    public static final int EVENT_CREATE_VALUE = 0;
    /**
     * <code>EVENT_CLOSE = 1;</code>
     */
    public static final int EVENT_CLOSE_VALUE = 1;
    /**
     * <code>EVENT_APPEND = 2;</code>
     */
    public static final int EVENT_APPEND_VALUE = 2;
    /**
     * <code>EVENT_RENAME = 3;</code>
     */
    public static final int EVENT_RENAME_VALUE = 3;
    /**
     * <code>EVENT_METADATA = 4;</code>
     */
    public static final int EVENT_METADATA_VALUE = 4;
    /**
     * <code>EVENT_UNLINK = 5;</code>
     */
    public static final int EVENT_UNLINK_VALUE = 5;
    /**
     * <code>EVENT_TRUNCATE = 6;</code>
     */
    public static final int EVENT_TRUNCATE_VALUE = 6;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static EventType valueOf(int value) {
      return forNumber(value);
    }

    public static EventType forNumber(int value) {
      switch (value) {
        case 0: return EVENT_CREATE;
        case 1: return EVENT_CLOSE;
        case 2: return EVENT_APPEND;
        case 3: return EVENT_RENAME;
        case 4: return EVENT_METADATA;
        case 5: return EVENT_UNLINK;
        case 6: return EVENT_TRUNCATE;
        default: return null;
      }
    }

    public static org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<EventType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<
        EventType> internalValueMap =
          new org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<EventType>() {
            public EventType findValueByNumber(int number) {
              return EventType.forNumber(number);
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
      return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.getDescriptor().getEnumTypes().get(0);
    }

    private static final EventType[] VALUES = values();

    public static EventType valueOf(
        org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private EventType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:hadoop.hdfs.EventType)
  }

  /**
   * Protobuf enum {@code hadoop.hdfs.INodeType}
   */
  public enum INodeType
      implements org.apache.hadoop.thirdparty.protobuf.ProtocolMessageEnum {
    /**
     * <code>I_TYPE_FILE = 0;</code>
     */
    I_TYPE_FILE(0),
    /**
     * <code>I_TYPE_DIRECTORY = 1;</code>
     */
    I_TYPE_DIRECTORY(1),
    /**
     * <code>I_TYPE_SYMLINK = 2;</code>
     */
    I_TYPE_SYMLINK(2),
    ;

    /**
     * <code>I_TYPE_FILE = 0;</code>
     */
    public static final int I_TYPE_FILE_VALUE = 0;
    /**
     * <code>I_TYPE_DIRECTORY = 1;</code>
     */
    public static final int I_TYPE_DIRECTORY_VALUE = 1;
    /**
     * <code>I_TYPE_SYMLINK = 2;</code>
     */
    public static final int I_TYPE_SYMLINK_VALUE = 2;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static INodeType valueOf(int value) {
      return forNumber(value);
    }

    public static INodeType forNumber(int value) {
      switch (value) {
        case 0: return I_TYPE_FILE;
        case 1: return I_TYPE_DIRECTORY;
        case 2: return I_TYPE_SYMLINK;
        default: return null;
      }
    }

    public static org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<INodeType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<
        INodeType> internalValueMap =
          new org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<INodeType>() {
            public INodeType findValueByNumber(int number) {
              return INodeType.forNumber(number);
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
      return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.getDescriptor().getEnumTypes().get(1);
    }

    private static final INodeType[] VALUES = values();

    public static INodeType valueOf(
        org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private INodeType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:hadoop.hdfs.INodeType)
  }

  /**
   * Protobuf enum {@code hadoop.hdfs.MetadataUpdateType}
   */
  public enum MetadataUpdateType
      implements org.apache.hadoop.thirdparty.protobuf.ProtocolMessageEnum {
    /**
     * <code>META_TYPE_TIMES = 0;</code>
     */
    META_TYPE_TIMES(0),
    /**
     * <code>META_TYPE_REPLICATION = 1;</code>
     */
    META_TYPE_REPLICATION(1),
    /**
     * <code>META_TYPE_OWNER = 2;</code>
     */
    META_TYPE_OWNER(2),
    /**
     * <code>META_TYPE_PERMS = 3;</code>
     */
    META_TYPE_PERMS(3),
    /**
     * <code>META_TYPE_ACLS = 4;</code>
     */
    META_TYPE_ACLS(4),
    /**
     * <code>META_TYPE_XATTRS = 5;</code>
     */
    META_TYPE_XATTRS(5),
    ;

    /**
     * <code>META_TYPE_TIMES = 0;</code>
     */
    public static final int META_TYPE_TIMES_VALUE = 0;
    /**
     * <code>META_TYPE_REPLICATION = 1;</code>
     */
    public static final int META_TYPE_REPLICATION_VALUE = 1;
    /**
     * <code>META_TYPE_OWNER = 2;</code>
     */
    public static final int META_TYPE_OWNER_VALUE = 2;
    /**
     * <code>META_TYPE_PERMS = 3;</code>
     */
    public static final int META_TYPE_PERMS_VALUE = 3;
    /**
     * <code>META_TYPE_ACLS = 4;</code>
     */
    public static final int META_TYPE_ACLS_VALUE = 4;
    /**
     * <code>META_TYPE_XATTRS = 5;</code>
     */
    public static final int META_TYPE_XATTRS_VALUE = 5;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MetadataUpdateType valueOf(int value) {
      return forNumber(value);
    }

    public static MetadataUpdateType forNumber(int value) {
      switch (value) {
        case 0: return META_TYPE_TIMES;
        case 1: return META_TYPE_REPLICATION;
        case 2: return META_TYPE_OWNER;
        case 3: return META_TYPE_PERMS;
        case 4: return META_TYPE_ACLS;
        case 5: return META_TYPE_XATTRS;
        default: return null;
      }
    }

    public static org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<MetadataUpdateType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<
        MetadataUpdateType> internalValueMap =
          new org.apache.hadoop.thirdparty.protobuf.Internal.EnumLiteMap<MetadataUpdateType>() {
            public MetadataUpdateType findValueByNumber(int number) {
              return MetadataUpdateType.forNumber(number);
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
      return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.getDescriptor().getEnumTypes().get(2);
    }

    private static final MetadataUpdateType[] VALUES = values();

    public static MetadataUpdateType valueOf(
        org.apache.hadoop.thirdparty.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private MetadataUpdateType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:hadoop.hdfs.MetadataUpdateType)
  }

  public interface EventProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.EventProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required .hadoop.hdfs.EventType type = 1;</code>
     */
    boolean hasType();
    /**
     * <code>required .hadoop.hdfs.EventType type = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventType getType();

    /**
     * <code>required bytes contents = 2;</code>
     */
    boolean hasContents();
    /**
     * <code>required bytes contents = 2;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString getContents();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.EventProto}
   */
  public  static final class EventProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.EventProto)
      EventProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EventProto.newBuilder() to construct.
    private EventProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EventProto() {
      type_ = 0;
      contents_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EventProto(
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
              org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventType value = org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                type_ = rawValue;
              }
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              contents_ = input.readBytes();
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
      return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_EventProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_EventProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto.class, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto.Builder.class);
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>required .hadoop.hdfs.EventType type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required .hadoop.hdfs.EventType type = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventType getType() {
      @SuppressWarnings("deprecation")
      org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventType result = org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventType.valueOf(type_);
      return result == null ? org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventType.EVENT_CREATE : result;
    }

    public static final int CONTENTS_FIELD_NUMBER = 2;
    private org.apache.hadoop.thirdparty.protobuf.ByteString contents_;
    /**
     * <code>required bytes contents = 2;</code>
     */
    public boolean hasContents() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required bytes contents = 2;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString getContents() {
      return contents_;
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
      if (!hasContents()) {
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
        output.writeBytes(2, contents_);
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
          .computeBytesSize(2, contents_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto other = (org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto) obj;

      if (hasType() != other.hasType()) return false;
      if (hasType()) {
        if (type_ != other.type_) return false;
      }
      if (hasContents() != other.hasContents()) return false;
      if (hasContents()) {
        if (!getContents()
            .equals(other.getContents())) return false;
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
      if (hasContents()) {
        hash = (37 * hash) + CONTENTS_FIELD_NUMBER;
        hash = (53 * hash) + getContents().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.EventProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.EventProto)
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_EventProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_EventProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto.class, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto.newBuilder()
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
        contents_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_EventProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto build() {
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto result = new org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.contents_ = contents_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasContents()) {
          setContents(other.getContents());
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
        if (!hasContents()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto) e.getUnfinishedMessage();
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
       * <code>required .hadoop.hdfs.EventType type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required .hadoop.hdfs.EventType type = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventType getType() {
        @SuppressWarnings("deprecation")
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventType result = org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventType.valueOf(type_);
        return result == null ? org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventType.EVENT_CREATE : result;
      }
      /**
       * <code>required .hadoop.hdfs.EventType type = 1;</code>
       */
      public Builder setType(org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.EventType type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = 0;
        onChanged();
        return this;
      }

      private org.apache.hadoop.thirdparty.protobuf.ByteString contents_ = org.apache.hadoop.thirdparty.protobuf.ByteString.EMPTY;
      /**
       * <code>required bytes contents = 2;</code>
       */
      public boolean hasContents() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required bytes contents = 2;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString getContents() {
        return contents_;
      }
      /**
       * <code>required bytes contents = 2;</code>
       */
      public Builder setContents(org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        contents_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bytes contents = 2;</code>
       */
      public Builder clearContents() {
        bitField0_ = (bitField0_ & ~0x00000002);
        contents_ = getDefaultInstance().getContents();
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.EventProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.EventProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<EventProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<EventProto>() {
      @java.lang.Override
      public EventProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new EventProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<EventProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<EventProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface EventBatchProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.EventBatchProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required int64 txid = 1;</code>
     */
    boolean hasTxid();
    /**
     * <code>required int64 txid = 1;</code>
     */
    long getTxid();

    /**
     * <code>repeated .hadoop.hdfs.EventProto events = 2;</code>
     */
    java.util.List<org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto> 
        getEventsList();
    /**
     * <code>repeated .hadoop.hdfs.EventProto events = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto getEvents(int index);
    /**
     * <code>repeated .hadoop.hdfs.EventProto events = 2;</code>
     */
    int getEventsCount();
    /**
     * <code>repeated .hadoop.hdfs.EventProto events = 2;</code>
     */
    java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProtoOrBuilder> 
        getEventsOrBuilderList();
    /**
     * <code>repeated .hadoop.hdfs.EventProto events = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProtoOrBuilder getEventsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code hadoop.hdfs.EventBatchProto}
   */
  public  static final class EventBatchProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.EventBatchProto)
      EventBatchProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EventBatchProto.newBuilder() to construct.
    private EventBatchProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EventBatchProto() {
      events_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EventBatchProto(
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
              txid_ = input.readInt64();
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                events_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto>();
                mutable_bitField0_ |= 0x00000002;
              }
              events_.add(
                  input.readMessage(org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto.PARSER, extensionRegistry));
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
          events_ = java.util.Collections.unmodifiableList(events_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_EventBatchProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_EventBatchProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto.class, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto.Builder.class);
    }

    private int bitField0_;
    public static final int TXID_FIELD_NUMBER = 1;
    private long txid_;
    /**
     * <code>required int64 txid = 1;</code>
     */
    public boolean hasTxid() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required int64 txid = 1;</code>
     */
    public long getTxid() {
      return txid_;
    }

    public static final int EVENTS_FIELD_NUMBER = 2;
    private java.util.List<org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto> events_;
    /**
     * <code>repeated .hadoop.hdfs.EventProto events = 2;</code>
     */
    public java.util.List<org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto> getEventsList() {
      return events_;
    }
    /**
     * <code>repeated .hadoop.hdfs.EventProto events = 2;</code>
     */
    public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProtoOrBuilder> 
        getEventsOrBuilderList() {
      return events_;
    }
    /**
     * <code>repeated .hadoop.hdfs.EventProto events = 2;</code>
     */
    public int getEventsCount() {
      return events_.size();
    }
    /**
     * <code>repeated .hadoop.hdfs.EventProto events = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto getEvents(int index) {
      return events_.get(index);
    }
    /**
     * <code>repeated .hadoop.hdfs.EventProto events = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProtoOrBuilder getEventsOrBuilder(
        int index) {
      return events_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasTxid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getEventsCount(); i++) {
        if (!getEvents(i).isInitialized()) {
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
        output.writeInt64(1, txid_);
      }
      for (int i = 0; i < events_.size(); i++) {
        output.writeMessage(2, events_.get(i));
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
          .computeInt64Size(1, txid_);
      }
      for (int i = 0; i < events_.size(); i++) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(2, events_.get(i));
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto other = (org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto) obj;

      if (hasTxid() != other.hasTxid()) return false;
      if (hasTxid()) {
        if (getTxid()
            != other.getTxid()) return false;
      }
      if (!getEventsList()
          .equals(other.getEventsList())) return false;
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
      if (hasTxid()) {
        hash = (37 * hash) + TXID_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getTxid());
      }
      if (getEventsCount() > 0) {
        hash = (37 * hash) + EVENTS_FIELD_NUMBER;
        hash = (53 * hash) + getEventsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.EventBatchProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.EventBatchProto)
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_EventBatchProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_EventBatchProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto.class, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto.newBuilder()
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
          getEventsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        txid_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (eventsBuilder_ == null) {
          events_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          eventsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_EventBatchProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto build() {
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto result = new org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.txid_ = txid_;
          to_bitField0_ |= 0x00000001;
        }
        if (eventsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            events_ = java.util.Collections.unmodifiableList(events_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.events_ = events_;
        } else {
          result.events_ = eventsBuilder_.build();
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto.getDefaultInstance()) return this;
        if (other.hasTxid()) {
          setTxid(other.getTxid());
        }
        if (eventsBuilder_ == null) {
          if (!other.events_.isEmpty()) {
            if (events_.isEmpty()) {
              events_ = other.events_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureEventsIsMutable();
              events_.addAll(other.events_);
            }
            onChanged();
          }
        } else {
          if (!other.events_.isEmpty()) {
            if (eventsBuilder_.isEmpty()) {
              eventsBuilder_.dispose();
              eventsBuilder_ = null;
              events_ = other.events_;
              bitField0_ = (bitField0_ & ~0x00000002);
              eventsBuilder_ = 
                org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getEventsFieldBuilder() : null;
            } else {
              eventsBuilder_.addAllMessages(other.events_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasTxid()) {
          return false;
        }
        for (int i = 0; i < getEventsCount(); i++) {
          if (!getEvents(i).isInitialized()) {
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
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long txid_ ;
      /**
       * <code>required int64 txid = 1;</code>
       */
      public boolean hasTxid() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required int64 txid = 1;</code>
       */
      public long getTxid() {
        return txid_;
      }
      /**
       * <code>required int64 txid = 1;</code>
       */
      public Builder setTxid(long value) {
        bitField0_ |= 0x00000001;
        txid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 txid = 1;</code>
       */
      public Builder clearTxid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        txid_ = 0L;
        onChanged();
        return this;
      }

      private java.util.List<org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto> events_ =
        java.util.Collections.emptyList();
      private void ensureEventsIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          events_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto>(events_);
          bitField0_ |= 0x00000002;
         }
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto.Builder, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProtoOrBuilder> eventsBuilder_;

      /**
       * <code>repeated .hadoop.hdfs.EventProto events = 2;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto> getEventsList() {
        if (eventsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(events_);
        } else {
          return eventsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.EventProto events = 2;</code>
       */
      public int getEventsCount() {
        if (eventsBuilder_ == null) {
          return events_.size();
        } else {
          return eventsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.EventProto events = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto getEvents(int index) {
        if (eventsBuilder_ == null) {
          return events_.get(index);
        } else {
          return eventsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.EventProto events = 2;</code>
       */
      public Builder setEvents(
          int index, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto value) {
        if (eventsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEventsIsMutable();
          events_.set(index, value);
          onChanged();
        } else {
          eventsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.EventProto events = 2;</code>
       */
      public Builder setEvents(
          int index, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto.Builder builderForValue) {
        if (eventsBuilder_ == null) {
          ensureEventsIsMutable();
          events_.set(index, builderForValue.build());
          onChanged();
        } else {
          eventsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.EventProto events = 2;</code>
       */
      public Builder addEvents(org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto value) {
        if (eventsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEventsIsMutable();
          events_.add(value);
          onChanged();
        } else {
          eventsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.EventProto events = 2;</code>
       */
      public Builder addEvents(
          int index, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto value) {
        if (eventsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEventsIsMutable();
          events_.add(index, value);
          onChanged();
        } else {
          eventsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.EventProto events = 2;</code>
       */
      public Builder addEvents(
          org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto.Builder builderForValue) {
        if (eventsBuilder_ == null) {
          ensureEventsIsMutable();
          events_.add(builderForValue.build());
          onChanged();
        } else {
          eventsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.EventProto events = 2;</code>
       */
      public Builder addEvents(
          int index, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto.Builder builderForValue) {
        if (eventsBuilder_ == null) {
          ensureEventsIsMutable();
          events_.add(index, builderForValue.build());
          onChanged();
        } else {
          eventsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.EventProto events = 2;</code>
       */
      public Builder addAllEvents(
          java.lang.Iterable<? extends org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto> values) {
        if (eventsBuilder_ == null) {
          ensureEventsIsMutable();
          org.apache.hadoop.thirdparty.protobuf.AbstractMessageLite.Builder.addAll(
              values, events_);
          onChanged();
        } else {
          eventsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.EventProto events = 2;</code>
       */
      public Builder clearEvents() {
        if (eventsBuilder_ == null) {
          events_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          eventsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.EventProto events = 2;</code>
       */
      public Builder removeEvents(int index) {
        if (eventsBuilder_ == null) {
          ensureEventsIsMutable();
          events_.remove(index);
          onChanged();
        } else {
          eventsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.EventProto events = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto.Builder getEventsBuilder(
          int index) {
        return getEventsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.hdfs.EventProto events = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProtoOrBuilder getEventsOrBuilder(
          int index) {
        if (eventsBuilder_ == null) {
          return events_.get(index);  } else {
          return eventsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.EventProto events = 2;</code>
       */
      public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProtoOrBuilder> 
           getEventsOrBuilderList() {
        if (eventsBuilder_ != null) {
          return eventsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(events_);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.EventProto events = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto.Builder addEventsBuilder() {
        return getEventsFieldBuilder().addBuilder(
            org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.EventProto events = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto.Builder addEventsBuilder(
          int index) {
        return getEventsFieldBuilder().addBuilder(
            index, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.EventProto events = 2;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto.Builder> 
           getEventsBuilderList() {
        return getEventsFieldBuilder().getBuilderList();
      }
      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto.Builder, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProtoOrBuilder> 
          getEventsFieldBuilder() {
        if (eventsBuilder_ == null) {
          eventsBuilder_ = new org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto.Builder, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProtoOrBuilder>(
                  events_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          events_ = null;
        }
        return eventsBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.EventBatchProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.EventBatchProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<EventBatchProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<EventBatchProto>() {
      @java.lang.Override
      public EventBatchProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new EventBatchProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<EventBatchProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<EventBatchProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CreateEventProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.CreateEventProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required .hadoop.hdfs.INodeType type = 1;</code>
     */
    boolean hasType();
    /**
     * <code>required .hadoop.hdfs.INodeType type = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.INodeType getType();

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
     * <code>required int64 ctime = 3;</code>
     */
    boolean hasCtime();
    /**
     * <code>required int64 ctime = 3;</code>
     */
    long getCtime();

    /**
     * <code>required string ownerName = 4;</code>
     */
    boolean hasOwnerName();
    /**
     * <code>required string ownerName = 4;</code>
     */
    java.lang.String getOwnerName();
    /**
     * <code>required string ownerName = 4;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getOwnerNameBytes();

    /**
     * <code>required string groupName = 5;</code>
     */
    boolean hasGroupName();
    /**
     * <code>required string groupName = 5;</code>
     */
    java.lang.String getGroupName();
    /**
     * <code>required string groupName = 5;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getGroupNameBytes();

    /**
     * <code>required .hadoop.hdfs.FsPermissionProto perms = 6;</code>
     */
    boolean hasPerms();
    /**
     * <code>required .hadoop.hdfs.FsPermissionProto perms = 6;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto getPerms();
    /**
     * <code>required .hadoop.hdfs.FsPermissionProto perms = 6;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProtoOrBuilder getPermsOrBuilder();

    /**
     * <code>optional int32 replication = 7;</code>
     */
    boolean hasReplication();
    /**
     * <code>optional int32 replication = 7;</code>
     */
    int getReplication();

    /**
     * <code>optional string symlinkTarget = 8;</code>
     */
    boolean hasSymlinkTarget();
    /**
     * <code>optional string symlinkTarget = 8;</code>
     */
    java.lang.String getSymlinkTarget();
    /**
     * <code>optional string symlinkTarget = 8;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getSymlinkTargetBytes();

    /**
     * <code>optional bool overwrite = 9;</code>
     */
    boolean hasOverwrite();
    /**
     * <code>optional bool overwrite = 9;</code>
     */
    boolean getOverwrite();

    /**
     * <code>optional int64 defaultBlockSize = 10 [default = 0];</code>
     */
    boolean hasDefaultBlockSize();
    /**
     * <code>optional int64 defaultBlockSize = 10 [default = 0];</code>
     */
    long getDefaultBlockSize();

    /**
     * <code>optional bool erasureCoded = 11;</code>
     */
    boolean hasErasureCoded();
    /**
     * <code>optional bool erasureCoded = 11;</code>
     */
    boolean getErasureCoded();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.CreateEventProto}
   */
  public  static final class CreateEventProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.CreateEventProto)
      CreateEventProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CreateEventProto.newBuilder() to construct.
    private CreateEventProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CreateEventProto() {
      type_ = 0;
      path_ = "";
      ownerName_ = "";
      groupName_ = "";
      symlinkTarget_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CreateEventProto(
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
              org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.INodeType value = org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.INodeType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                type_ = rawValue;
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
              ctime_ = input.readInt64();
              break;
            }
            case 34: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              ownerName_ = bs;
              break;
            }
            case 42: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000010;
              groupName_ = bs;
              break;
            }
            case 50: {
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000020) != 0)) {
                subBuilder = perms_.toBuilder();
              }
              perms_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(perms_);
                perms_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000020;
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              replication_ = input.readInt32();
              break;
            }
            case 66: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000080;
              symlinkTarget_ = bs;
              break;
            }
            case 72: {
              bitField0_ |= 0x00000100;
              overwrite_ = input.readBool();
              break;
            }
            case 80: {
              bitField0_ |= 0x00000200;
              defaultBlockSize_ = input.readInt64();
              break;
            }
            case 88: {
              bitField0_ |= 0x00000400;
              erasureCoded_ = input.readBool();
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
      return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_CreateEventProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_CreateEventProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto.class, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto.Builder.class);
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>required .hadoop.hdfs.INodeType type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required .hadoop.hdfs.INodeType type = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.INodeType getType() {
      @SuppressWarnings("deprecation")
      org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.INodeType result = org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.INodeType.valueOf(type_);
      return result == null ? org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.INodeType.I_TYPE_FILE : result;
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

    public static final int CTIME_FIELD_NUMBER = 3;
    private long ctime_;
    /**
     * <code>required int64 ctime = 3;</code>
     */
    public boolean hasCtime() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required int64 ctime = 3;</code>
     */
    public long getCtime() {
      return ctime_;
    }

    public static final int OWNERNAME_FIELD_NUMBER = 4;
    private volatile java.lang.Object ownerName_;
    /**
     * <code>required string ownerName = 4;</code>
     */
    public boolean hasOwnerName() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>required string ownerName = 4;</code>
     */
    public java.lang.String getOwnerName() {
      java.lang.Object ref = ownerName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          ownerName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string ownerName = 4;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getOwnerNameBytes() {
      java.lang.Object ref = ownerName_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ownerName_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int GROUPNAME_FIELD_NUMBER = 5;
    private volatile java.lang.Object groupName_;
    /**
     * <code>required string groupName = 5;</code>
     */
    public boolean hasGroupName() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>required string groupName = 5;</code>
     */
    public java.lang.String getGroupName() {
      java.lang.Object ref = groupName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          groupName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string groupName = 5;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getGroupNameBytes() {
      java.lang.Object ref = groupName_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        groupName_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int PERMS_FIELD_NUMBER = 6;
    private org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto perms_;
    /**
     * <code>required .hadoop.hdfs.FsPermissionProto perms = 6;</code>
     */
    public boolean hasPerms() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <code>required .hadoop.hdfs.FsPermissionProto perms = 6;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto getPerms() {
      return perms_ == null ? org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.getDefaultInstance() : perms_;
    }
    /**
     * <code>required .hadoop.hdfs.FsPermissionProto perms = 6;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProtoOrBuilder getPermsOrBuilder() {
      return perms_ == null ? org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.getDefaultInstance() : perms_;
    }

    public static final int REPLICATION_FIELD_NUMBER = 7;
    private int replication_;
    /**
     * <code>optional int32 replication = 7;</code>
     */
    public boolean hasReplication() {
      return ((bitField0_ & 0x00000040) != 0);
    }
    /**
     * <code>optional int32 replication = 7;</code>
     */
    public int getReplication() {
      return replication_;
    }

    public static final int SYMLINKTARGET_FIELD_NUMBER = 8;
    private volatile java.lang.Object symlinkTarget_;
    /**
     * <code>optional string symlinkTarget = 8;</code>
     */
    public boolean hasSymlinkTarget() {
      return ((bitField0_ & 0x00000080) != 0);
    }
    /**
     * <code>optional string symlinkTarget = 8;</code>
     */
    public java.lang.String getSymlinkTarget() {
      java.lang.Object ref = symlinkTarget_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          symlinkTarget_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string symlinkTarget = 8;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getSymlinkTargetBytes() {
      java.lang.Object ref = symlinkTarget_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        symlinkTarget_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int OVERWRITE_FIELD_NUMBER = 9;
    private boolean overwrite_;
    /**
     * <code>optional bool overwrite = 9;</code>
     */
    public boolean hasOverwrite() {
      return ((bitField0_ & 0x00000100) != 0);
    }
    /**
     * <code>optional bool overwrite = 9;</code>
     */
    public boolean getOverwrite() {
      return overwrite_;
    }

    public static final int DEFAULTBLOCKSIZE_FIELD_NUMBER = 10;
    private long defaultBlockSize_;
    /**
     * <code>optional int64 defaultBlockSize = 10 [default = 0];</code>
     */
    public boolean hasDefaultBlockSize() {
      return ((bitField0_ & 0x00000200) != 0);
    }
    /**
     * <code>optional int64 defaultBlockSize = 10 [default = 0];</code>
     */
    public long getDefaultBlockSize() {
      return defaultBlockSize_;
    }

    public static final int ERASURECODED_FIELD_NUMBER = 11;
    private boolean erasureCoded_;
    /**
     * <code>optional bool erasureCoded = 11;</code>
     */
    public boolean hasErasureCoded() {
      return ((bitField0_ & 0x00000400) != 0);
    }
    /**
     * <code>optional bool erasureCoded = 11;</code>
     */
    public boolean getErasureCoded() {
      return erasureCoded_;
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
      if (!hasPath()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCtime()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasOwnerName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasGroupName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPerms()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getPerms().isInitialized()) {
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 2, path_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeInt64(3, ctime_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 4, ownerName_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 5, groupName_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        output.writeMessage(6, getPerms());
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        output.writeInt32(7, replication_);
      }
      if (((bitField0_ & 0x00000080) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 8, symlinkTarget_);
      }
      if (((bitField0_ & 0x00000100) != 0)) {
        output.writeBool(9, overwrite_);
      }
      if (((bitField0_ & 0x00000200) != 0)) {
        output.writeInt64(10, defaultBlockSize_);
      }
      if (((bitField0_ & 0x00000400) != 0)) {
        output.writeBool(11, erasureCoded_);
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
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(2, path_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeInt64Size(3, ctime_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(4, ownerName_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(5, groupName_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(6, getPerms());
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeInt32Size(7, replication_);
      }
      if (((bitField0_ & 0x00000080) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(8, symlinkTarget_);
      }
      if (((bitField0_ & 0x00000100) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeBoolSize(9, overwrite_);
      }
      if (((bitField0_ & 0x00000200) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeInt64Size(10, defaultBlockSize_);
      }
      if (((bitField0_ & 0x00000400) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeBoolSize(11, erasureCoded_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto other = (org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto) obj;

      if (hasType() != other.hasType()) return false;
      if (hasType()) {
        if (type_ != other.type_) return false;
      }
      if (hasPath() != other.hasPath()) return false;
      if (hasPath()) {
        if (!getPath()
            .equals(other.getPath())) return false;
      }
      if (hasCtime() != other.hasCtime()) return false;
      if (hasCtime()) {
        if (getCtime()
            != other.getCtime()) return false;
      }
      if (hasOwnerName() != other.hasOwnerName()) return false;
      if (hasOwnerName()) {
        if (!getOwnerName()
            .equals(other.getOwnerName())) return false;
      }
      if (hasGroupName() != other.hasGroupName()) return false;
      if (hasGroupName()) {
        if (!getGroupName()
            .equals(other.getGroupName())) return false;
      }
      if (hasPerms() != other.hasPerms()) return false;
      if (hasPerms()) {
        if (!getPerms()
            .equals(other.getPerms())) return false;
      }
      if (hasReplication() != other.hasReplication()) return false;
      if (hasReplication()) {
        if (getReplication()
            != other.getReplication()) return false;
      }
      if (hasSymlinkTarget() != other.hasSymlinkTarget()) return false;
      if (hasSymlinkTarget()) {
        if (!getSymlinkTarget()
            .equals(other.getSymlinkTarget())) return false;
      }
      if (hasOverwrite() != other.hasOverwrite()) return false;
      if (hasOverwrite()) {
        if (getOverwrite()
            != other.getOverwrite()) return false;
      }
      if (hasDefaultBlockSize() != other.hasDefaultBlockSize()) return false;
      if (hasDefaultBlockSize()) {
        if (getDefaultBlockSize()
            != other.getDefaultBlockSize()) return false;
      }
      if (hasErasureCoded() != other.hasErasureCoded()) return false;
      if (hasErasureCoded()) {
        if (getErasureCoded()
            != other.getErasureCoded()) return false;
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
      if (hasPath()) {
        hash = (37 * hash) + PATH_FIELD_NUMBER;
        hash = (53 * hash) + getPath().hashCode();
      }
      if (hasCtime()) {
        hash = (37 * hash) + CTIME_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getCtime());
      }
      if (hasOwnerName()) {
        hash = (37 * hash) + OWNERNAME_FIELD_NUMBER;
        hash = (53 * hash) + getOwnerName().hashCode();
      }
      if (hasGroupName()) {
        hash = (37 * hash) + GROUPNAME_FIELD_NUMBER;
        hash = (53 * hash) + getGroupName().hashCode();
      }
      if (hasPerms()) {
        hash = (37 * hash) + PERMS_FIELD_NUMBER;
        hash = (53 * hash) + getPerms().hashCode();
      }
      if (hasReplication()) {
        hash = (37 * hash) + REPLICATION_FIELD_NUMBER;
        hash = (53 * hash) + getReplication();
      }
      if (hasSymlinkTarget()) {
        hash = (37 * hash) + SYMLINKTARGET_FIELD_NUMBER;
        hash = (53 * hash) + getSymlinkTarget().hashCode();
      }
      if (hasOverwrite()) {
        hash = (37 * hash) + OVERWRITE_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashBoolean(
            getOverwrite());
      }
      if (hasDefaultBlockSize()) {
        hash = (37 * hash) + DEFAULTBLOCKSIZE_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getDefaultBlockSize());
      }
      if (hasErasureCoded()) {
        hash = (37 * hash) + ERASURECODED_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashBoolean(
            getErasureCoded());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.CreateEventProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.CreateEventProto)
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_CreateEventProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_CreateEventProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto.class, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto.newBuilder()
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
          getPermsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        path_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        ctime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        ownerName_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        groupName_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        if (permsBuilder_ == null) {
          perms_ = null;
        } else {
          permsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000020);
        replication_ = 0;
        bitField0_ = (bitField0_ & ~0x00000040);
        symlinkTarget_ = "";
        bitField0_ = (bitField0_ & ~0x00000080);
        overwrite_ = false;
        bitField0_ = (bitField0_ & ~0x00000100);
        defaultBlockSize_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000200);
        erasureCoded_ = false;
        bitField0_ = (bitField0_ & ~0x00000400);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_CreateEventProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto build() {
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto result = new org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.path_ = path_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.ctime_ = ctime_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          to_bitField0_ |= 0x00000008;
        }
        result.ownerName_ = ownerName_;
        if (((from_bitField0_ & 0x00000010) != 0)) {
          to_bitField0_ |= 0x00000010;
        }
        result.groupName_ = groupName_;
        if (((from_bitField0_ & 0x00000020) != 0)) {
          if (permsBuilder_ == null) {
            result.perms_ = perms_;
          } else {
            result.perms_ = permsBuilder_.build();
          }
          to_bitField0_ |= 0x00000020;
        }
        if (((from_bitField0_ & 0x00000040) != 0)) {
          result.replication_ = replication_;
          to_bitField0_ |= 0x00000040;
        }
        if (((from_bitField0_ & 0x00000080) != 0)) {
          to_bitField0_ |= 0x00000080;
        }
        result.symlinkTarget_ = symlinkTarget_;
        if (((from_bitField0_ & 0x00000100) != 0)) {
          result.overwrite_ = overwrite_;
          to_bitField0_ |= 0x00000100;
        }
        if (((from_bitField0_ & 0x00000200) != 0)) {
          result.defaultBlockSize_ = defaultBlockSize_;
          to_bitField0_ |= 0x00000200;
        }
        if (((from_bitField0_ & 0x00000400) != 0)) {
          result.erasureCoded_ = erasureCoded_;
          to_bitField0_ |= 0x00000400;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasPath()) {
          bitField0_ |= 0x00000002;
          path_ = other.path_;
          onChanged();
        }
        if (other.hasCtime()) {
          setCtime(other.getCtime());
        }
        if (other.hasOwnerName()) {
          bitField0_ |= 0x00000008;
          ownerName_ = other.ownerName_;
          onChanged();
        }
        if (other.hasGroupName()) {
          bitField0_ |= 0x00000010;
          groupName_ = other.groupName_;
          onChanged();
        }
        if (other.hasPerms()) {
          mergePerms(other.getPerms());
        }
        if (other.hasReplication()) {
          setReplication(other.getReplication());
        }
        if (other.hasSymlinkTarget()) {
          bitField0_ |= 0x00000080;
          symlinkTarget_ = other.symlinkTarget_;
          onChanged();
        }
        if (other.hasOverwrite()) {
          setOverwrite(other.getOverwrite());
        }
        if (other.hasDefaultBlockSize()) {
          setDefaultBlockSize(other.getDefaultBlockSize());
        }
        if (other.hasErasureCoded()) {
          setErasureCoded(other.getErasureCoded());
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
        if (!hasPath()) {
          return false;
        }
        if (!hasCtime()) {
          return false;
        }
        if (!hasOwnerName()) {
          return false;
        }
        if (!hasGroupName()) {
          return false;
        }
        if (!hasPerms()) {
          return false;
        }
        if (!getPerms().isInitialized()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto) e.getUnfinishedMessage();
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
       * <code>required .hadoop.hdfs.INodeType type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required .hadoop.hdfs.INodeType type = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.INodeType getType() {
        @SuppressWarnings("deprecation")
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.INodeType result = org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.INodeType.valueOf(type_);
        return result == null ? org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.INodeType.I_TYPE_FILE : result;
      }
      /**
       * <code>required .hadoop.hdfs.INodeType type = 1;</code>
       */
      public Builder setType(org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.INodeType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.INodeType type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = 0;
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

      private long ctime_ ;
      /**
       * <code>required int64 ctime = 3;</code>
       */
      public boolean hasCtime() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>required int64 ctime = 3;</code>
       */
      public long getCtime() {
        return ctime_;
      }
      /**
       * <code>required int64 ctime = 3;</code>
       */
      public Builder setCtime(long value) {
        bitField0_ |= 0x00000004;
        ctime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 ctime = 3;</code>
       */
      public Builder clearCtime() {
        bitField0_ = (bitField0_ & ~0x00000004);
        ctime_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object ownerName_ = "";
      /**
       * <code>required string ownerName = 4;</code>
       */
      public boolean hasOwnerName() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>required string ownerName = 4;</code>
       */
      public java.lang.String getOwnerName() {
        java.lang.Object ref = ownerName_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            ownerName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string ownerName = 4;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getOwnerNameBytes() {
        java.lang.Object ref = ownerName_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          ownerName_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string ownerName = 4;</code>
       */
      public Builder setOwnerName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        ownerName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string ownerName = 4;</code>
       */
      public Builder clearOwnerName() {
        bitField0_ = (bitField0_ & ~0x00000008);
        ownerName_ = getDefaultInstance().getOwnerName();
        onChanged();
        return this;
      }
      /**
       * <code>required string ownerName = 4;</code>
       */
      public Builder setOwnerNameBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        ownerName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object groupName_ = "";
      /**
       * <code>required string groupName = 5;</code>
       */
      public boolean hasGroupName() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <code>required string groupName = 5;</code>
       */
      public java.lang.String getGroupName() {
        java.lang.Object ref = groupName_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            groupName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string groupName = 5;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getGroupNameBytes() {
        java.lang.Object ref = groupName_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          groupName_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string groupName = 5;</code>
       */
      public Builder setGroupName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        groupName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string groupName = 5;</code>
       */
      public Builder clearGroupName() {
        bitField0_ = (bitField0_ & ~0x00000010);
        groupName_ = getDefaultInstance().getGroupName();
        onChanged();
        return this;
      }
      /**
       * <code>required string groupName = 5;</code>
       */
      public Builder setGroupNameBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        groupName_ = value;
        onChanged();
        return this;
      }

      private org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto perms_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProtoOrBuilder> permsBuilder_;
      /**
       * <code>required .hadoop.hdfs.FsPermissionProto perms = 6;</code>
       */
      public boolean hasPerms() {
        return ((bitField0_ & 0x00000020) != 0);
      }
      /**
       * <code>required .hadoop.hdfs.FsPermissionProto perms = 6;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto getPerms() {
        if (permsBuilder_ == null) {
          return perms_ == null ? org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.getDefaultInstance() : perms_;
        } else {
          return permsBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.FsPermissionProto perms = 6;</code>
       */
      public Builder setPerms(org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto value) {
        if (permsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          perms_ = value;
          onChanged();
        } else {
          permsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000020;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.FsPermissionProto perms = 6;</code>
       */
      public Builder setPerms(
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.Builder builderForValue) {
        if (permsBuilder_ == null) {
          perms_ = builderForValue.build();
          onChanged();
        } else {
          permsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000020;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.FsPermissionProto perms = 6;</code>
       */
      public Builder mergePerms(org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto value) {
        if (permsBuilder_ == null) {
          if (((bitField0_ & 0x00000020) != 0) &&
              perms_ != null &&
              perms_ != org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.getDefaultInstance()) {
            perms_ =
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.newBuilder(perms_).mergeFrom(value).buildPartial();
          } else {
            perms_ = value;
          }
          onChanged();
        } else {
          permsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000020;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.FsPermissionProto perms = 6;</code>
       */
      public Builder clearPerms() {
        if (permsBuilder_ == null) {
          perms_ = null;
          onChanged();
        } else {
          permsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.FsPermissionProto perms = 6;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.Builder getPermsBuilder() {
        bitField0_ |= 0x00000020;
        onChanged();
        return getPermsFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.FsPermissionProto perms = 6;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProtoOrBuilder getPermsOrBuilder() {
        if (permsBuilder_ != null) {
          return permsBuilder_.getMessageOrBuilder();
        } else {
          return perms_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.getDefaultInstance() : perms_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.FsPermissionProto perms = 6;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProtoOrBuilder> 
          getPermsFieldBuilder() {
        if (permsBuilder_ == null) {
          permsBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProtoOrBuilder>(
                  getPerms(),
                  getParentForChildren(),
                  isClean());
          perms_ = null;
        }
        return permsBuilder_;
      }

      private int replication_ ;
      /**
       * <code>optional int32 replication = 7;</code>
       */
      public boolean hasReplication() {
        return ((bitField0_ & 0x00000040) != 0);
      }
      /**
       * <code>optional int32 replication = 7;</code>
       */
      public int getReplication() {
        return replication_;
      }
      /**
       * <code>optional int32 replication = 7;</code>
       */
      public Builder setReplication(int value) {
        bitField0_ |= 0x00000040;
        replication_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 replication = 7;</code>
       */
      public Builder clearReplication() {
        bitField0_ = (bitField0_ & ~0x00000040);
        replication_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object symlinkTarget_ = "";
      /**
       * <code>optional string symlinkTarget = 8;</code>
       */
      public boolean hasSymlinkTarget() {
        return ((bitField0_ & 0x00000080) != 0);
      }
      /**
       * <code>optional string symlinkTarget = 8;</code>
       */
      public java.lang.String getSymlinkTarget() {
        java.lang.Object ref = symlinkTarget_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            symlinkTarget_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string symlinkTarget = 8;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getSymlinkTargetBytes() {
        java.lang.Object ref = symlinkTarget_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          symlinkTarget_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string symlinkTarget = 8;</code>
       */
      public Builder setSymlinkTarget(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
        symlinkTarget_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string symlinkTarget = 8;</code>
       */
      public Builder clearSymlinkTarget() {
        bitField0_ = (bitField0_ & ~0x00000080);
        symlinkTarget_ = getDefaultInstance().getSymlinkTarget();
        onChanged();
        return this;
      }
      /**
       * <code>optional string symlinkTarget = 8;</code>
       */
      public Builder setSymlinkTargetBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000080;
        symlinkTarget_ = value;
        onChanged();
        return this;
      }

      private boolean overwrite_ ;
      /**
       * <code>optional bool overwrite = 9;</code>
       */
      public boolean hasOverwrite() {
        return ((bitField0_ & 0x00000100) != 0);
      }
      /**
       * <code>optional bool overwrite = 9;</code>
       */
      public boolean getOverwrite() {
        return overwrite_;
      }
      /**
       * <code>optional bool overwrite = 9;</code>
       */
      public Builder setOverwrite(boolean value) {
        bitField0_ |= 0x00000100;
        overwrite_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool overwrite = 9;</code>
       */
      public Builder clearOverwrite() {
        bitField0_ = (bitField0_ & ~0x00000100);
        overwrite_ = false;
        onChanged();
        return this;
      }

      private long defaultBlockSize_ ;
      /**
       * <code>optional int64 defaultBlockSize = 10 [default = 0];</code>
       */
      public boolean hasDefaultBlockSize() {
        return ((bitField0_ & 0x00000200) != 0);
      }
      /**
       * <code>optional int64 defaultBlockSize = 10 [default = 0];</code>
       */
      public long getDefaultBlockSize() {
        return defaultBlockSize_;
      }
      /**
       * <code>optional int64 defaultBlockSize = 10 [default = 0];</code>
       */
      public Builder setDefaultBlockSize(long value) {
        bitField0_ |= 0x00000200;
        defaultBlockSize_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 defaultBlockSize = 10 [default = 0];</code>
       */
      public Builder clearDefaultBlockSize() {
        bitField0_ = (bitField0_ & ~0x00000200);
        defaultBlockSize_ = 0L;
        onChanged();
        return this;
      }

      private boolean erasureCoded_ ;
      /**
       * <code>optional bool erasureCoded = 11;</code>
       */
      public boolean hasErasureCoded() {
        return ((bitField0_ & 0x00000400) != 0);
      }
      /**
       * <code>optional bool erasureCoded = 11;</code>
       */
      public boolean getErasureCoded() {
        return erasureCoded_;
      }
      /**
       * <code>optional bool erasureCoded = 11;</code>
       */
      public Builder setErasureCoded(boolean value) {
        bitField0_ |= 0x00000400;
        erasureCoded_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool erasureCoded = 11;</code>
       */
      public Builder clearErasureCoded() {
        bitField0_ = (bitField0_ & ~0x00000400);
        erasureCoded_ = false;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.CreateEventProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.CreateEventProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<CreateEventProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<CreateEventProto>() {
      @java.lang.Override
      public CreateEventProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new CreateEventProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<CreateEventProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<CreateEventProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CreateEventProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CloseEventProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.CloseEventProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required string path = 1;</code>
     */
    boolean hasPath();
    /**
     * <code>required string path = 1;</code>
     */
    java.lang.String getPath();
    /**
     * <code>required string path = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getPathBytes();

    /**
     * <code>required int64 fileSize = 2;</code>
     */
    boolean hasFileSize();
    /**
     * <code>required int64 fileSize = 2;</code>
     */
    long getFileSize();

    /**
     * <code>required int64 timestamp = 3;</code>
     */
    boolean hasTimestamp();
    /**
     * <code>required int64 timestamp = 3;</code>
     */
    long getTimestamp();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.CloseEventProto}
   */
  public  static final class CloseEventProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.CloseEventProto)
      CloseEventProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CloseEventProto.newBuilder() to construct.
    private CloseEventProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CloseEventProto() {
      path_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CloseEventProto(
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
              path_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              fileSize_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              timestamp_ = input.readInt64();
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
      return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_CloseEventProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_CloseEventProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto.class, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto.Builder.class);
    }

    private int bitField0_;
    public static final int PATH_FIELD_NUMBER = 1;
    private volatile java.lang.Object path_;
    /**
     * <code>required string path = 1;</code>
     */
    public boolean hasPath() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string path = 1;</code>
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
     * <code>required string path = 1;</code>
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

    public static final int FILESIZE_FIELD_NUMBER = 2;
    private long fileSize_;
    /**
     * <code>required int64 fileSize = 2;</code>
     */
    public boolean hasFileSize() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required int64 fileSize = 2;</code>
     */
    public long getFileSize() {
      return fileSize_;
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 3;
    private long timestamp_;
    /**
     * <code>required int64 timestamp = 3;</code>
     */
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required int64 timestamp = 3;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasPath()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasFileSize()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTimestamp()) {
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, path_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeInt64(2, fileSize_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeInt64(3, timestamp_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, path_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeInt64Size(2, fileSize_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeInt64Size(3, timestamp_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto other = (org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto) obj;

      if (hasPath() != other.hasPath()) return false;
      if (hasPath()) {
        if (!getPath()
            .equals(other.getPath())) return false;
      }
      if (hasFileSize() != other.hasFileSize()) return false;
      if (hasFileSize()) {
        if (getFileSize()
            != other.getFileSize()) return false;
      }
      if (hasTimestamp() != other.hasTimestamp()) return false;
      if (hasTimestamp()) {
        if (getTimestamp()
            != other.getTimestamp()) return false;
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
      if (hasPath()) {
        hash = (37 * hash) + PATH_FIELD_NUMBER;
        hash = (53 * hash) + getPath().hashCode();
      }
      if (hasFileSize()) {
        hash = (37 * hash) + FILESIZE_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getFileSize());
      }
      if (hasTimestamp()) {
        hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getTimestamp());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.CloseEventProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.CloseEventProto)
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_CloseEventProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_CloseEventProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto.class, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto.newBuilder()
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
        path_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        fileSize_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        timestamp_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_CloseEventProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto build() {
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto result = new org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.path_ = path_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.fileSize_ = fileSize_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.timestamp_ = timestamp_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto.getDefaultInstance()) return this;
        if (other.hasPath()) {
          bitField0_ |= 0x00000001;
          path_ = other.path_;
          onChanged();
        }
        if (other.hasFileSize()) {
          setFileSize(other.getFileSize());
        }
        if (other.hasTimestamp()) {
          setTimestamp(other.getTimestamp());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasPath()) {
          return false;
        }
        if (!hasFileSize()) {
          return false;
        }
        if (!hasTimestamp()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object path_ = "";
      /**
       * <code>required string path = 1;</code>
       */
      public boolean hasPath() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string path = 1;</code>
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
       * <code>required string path = 1;</code>
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
       * <code>required string path = 1;</code>
       */
      public Builder setPath(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        path_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string path = 1;</code>
       */
      public Builder clearPath() {
        bitField0_ = (bitField0_ & ~0x00000001);
        path_ = getDefaultInstance().getPath();
        onChanged();
        return this;
      }
      /**
       * <code>required string path = 1;</code>
       */
      public Builder setPathBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        path_ = value;
        onChanged();
        return this;
      }

      private long fileSize_ ;
      /**
       * <code>required int64 fileSize = 2;</code>
       */
      public boolean hasFileSize() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required int64 fileSize = 2;</code>
       */
      public long getFileSize() {
        return fileSize_;
      }
      /**
       * <code>required int64 fileSize = 2;</code>
       */
      public Builder setFileSize(long value) {
        bitField0_ |= 0x00000002;
        fileSize_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 fileSize = 2;</code>
       */
      public Builder clearFileSize() {
        bitField0_ = (bitField0_ & ~0x00000002);
        fileSize_ = 0L;
        onChanged();
        return this;
      }

      private long timestamp_ ;
      /**
       * <code>required int64 timestamp = 3;</code>
       */
      public boolean hasTimestamp() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>required int64 timestamp = 3;</code>
       */
      public long getTimestamp() {
        return timestamp_;
      }
      /**
       * <code>required int64 timestamp = 3;</code>
       */
      public Builder setTimestamp(long value) {
        bitField0_ |= 0x00000004;
        timestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 timestamp = 3;</code>
       */
      public Builder clearTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000004);
        timestamp_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.CloseEventProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.CloseEventProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<CloseEventProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<CloseEventProto>() {
      @java.lang.Override
      public CloseEventProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new CloseEventProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<CloseEventProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<CloseEventProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.CloseEventProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface TruncateEventProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.TruncateEventProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required string path = 1;</code>
     */
    boolean hasPath();
    /**
     * <code>required string path = 1;</code>
     */
    java.lang.String getPath();
    /**
     * <code>required string path = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getPathBytes();

    /**
     * <code>required int64 fileSize = 2;</code>
     */
    boolean hasFileSize();
    /**
     * <code>required int64 fileSize = 2;</code>
     */
    long getFileSize();

    /**
     * <code>required int64 timestamp = 3;</code>
     */
    boolean hasTimestamp();
    /**
     * <code>required int64 timestamp = 3;</code>
     */
    long getTimestamp();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.TruncateEventProto}
   */
  public  static final class TruncateEventProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.TruncateEventProto)
      TruncateEventProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TruncateEventProto.newBuilder() to construct.
    private TruncateEventProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TruncateEventProto() {
      path_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TruncateEventProto(
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
              path_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              fileSize_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              timestamp_ = input.readInt64();
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
      return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_TruncateEventProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_TruncateEventProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto.class, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto.Builder.class);
    }

    private int bitField0_;
    public static final int PATH_FIELD_NUMBER = 1;
    private volatile java.lang.Object path_;
    /**
     * <code>required string path = 1;</code>
     */
    public boolean hasPath() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string path = 1;</code>
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
     * <code>required string path = 1;</code>
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

    public static final int FILESIZE_FIELD_NUMBER = 2;
    private long fileSize_;
    /**
     * <code>required int64 fileSize = 2;</code>
     */
    public boolean hasFileSize() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required int64 fileSize = 2;</code>
     */
    public long getFileSize() {
      return fileSize_;
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 3;
    private long timestamp_;
    /**
     * <code>required int64 timestamp = 3;</code>
     */
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required int64 timestamp = 3;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasPath()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasFileSize()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTimestamp()) {
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, path_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeInt64(2, fileSize_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeInt64(3, timestamp_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, path_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeInt64Size(2, fileSize_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeInt64Size(3, timestamp_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto other = (org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto) obj;

      if (hasPath() != other.hasPath()) return false;
      if (hasPath()) {
        if (!getPath()
            .equals(other.getPath())) return false;
      }
      if (hasFileSize() != other.hasFileSize()) return false;
      if (hasFileSize()) {
        if (getFileSize()
            != other.getFileSize()) return false;
      }
      if (hasTimestamp() != other.hasTimestamp()) return false;
      if (hasTimestamp()) {
        if (getTimestamp()
            != other.getTimestamp()) return false;
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
      if (hasPath()) {
        hash = (37 * hash) + PATH_FIELD_NUMBER;
        hash = (53 * hash) + getPath().hashCode();
      }
      if (hasFileSize()) {
        hash = (37 * hash) + FILESIZE_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getFileSize());
      }
      if (hasTimestamp()) {
        hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getTimestamp());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.TruncateEventProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.TruncateEventProto)
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_TruncateEventProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_TruncateEventProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto.class, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto.newBuilder()
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
        path_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        fileSize_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        timestamp_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_TruncateEventProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto build() {
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto result = new org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.path_ = path_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.fileSize_ = fileSize_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.timestamp_ = timestamp_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto.getDefaultInstance()) return this;
        if (other.hasPath()) {
          bitField0_ |= 0x00000001;
          path_ = other.path_;
          onChanged();
        }
        if (other.hasFileSize()) {
          setFileSize(other.getFileSize());
        }
        if (other.hasTimestamp()) {
          setTimestamp(other.getTimestamp());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasPath()) {
          return false;
        }
        if (!hasFileSize()) {
          return false;
        }
        if (!hasTimestamp()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object path_ = "";
      /**
       * <code>required string path = 1;</code>
       */
      public boolean hasPath() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string path = 1;</code>
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
       * <code>required string path = 1;</code>
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
       * <code>required string path = 1;</code>
       */
      public Builder setPath(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        path_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string path = 1;</code>
       */
      public Builder clearPath() {
        bitField0_ = (bitField0_ & ~0x00000001);
        path_ = getDefaultInstance().getPath();
        onChanged();
        return this;
      }
      /**
       * <code>required string path = 1;</code>
       */
      public Builder setPathBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        path_ = value;
        onChanged();
        return this;
      }

      private long fileSize_ ;
      /**
       * <code>required int64 fileSize = 2;</code>
       */
      public boolean hasFileSize() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required int64 fileSize = 2;</code>
       */
      public long getFileSize() {
        return fileSize_;
      }
      /**
       * <code>required int64 fileSize = 2;</code>
       */
      public Builder setFileSize(long value) {
        bitField0_ |= 0x00000002;
        fileSize_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 fileSize = 2;</code>
       */
      public Builder clearFileSize() {
        bitField0_ = (bitField0_ & ~0x00000002);
        fileSize_ = 0L;
        onChanged();
        return this;
      }

      private long timestamp_ ;
      /**
       * <code>required int64 timestamp = 3;</code>
       */
      public boolean hasTimestamp() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>required int64 timestamp = 3;</code>
       */
      public long getTimestamp() {
        return timestamp_;
      }
      /**
       * <code>required int64 timestamp = 3;</code>
       */
      public Builder setTimestamp(long value) {
        bitField0_ |= 0x00000004;
        timestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 timestamp = 3;</code>
       */
      public Builder clearTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000004);
        timestamp_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.TruncateEventProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.TruncateEventProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<TruncateEventProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<TruncateEventProto>() {
      @java.lang.Override
      public TruncateEventProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new TruncateEventProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<TruncateEventProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<TruncateEventProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.TruncateEventProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface AppendEventProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.AppendEventProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required string path = 1;</code>
     */
    boolean hasPath();
    /**
     * <code>required string path = 1;</code>
     */
    java.lang.String getPath();
    /**
     * <code>required string path = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getPathBytes();

    /**
     * <code>optional bool newBlock = 2 [default = false];</code>
     */
    boolean hasNewBlock();
    /**
     * <code>optional bool newBlock = 2 [default = false];</code>
     */
    boolean getNewBlock();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.AppendEventProto}
   */
  public  static final class AppendEventProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.AppendEventProto)
      AppendEventProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AppendEventProto.newBuilder() to construct.
    private AppendEventProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AppendEventProto() {
      path_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AppendEventProto(
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
              path_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              newBlock_ = input.readBool();
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
      return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_AppendEventProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_AppendEventProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto.class, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto.Builder.class);
    }

    private int bitField0_;
    public static final int PATH_FIELD_NUMBER = 1;
    private volatile java.lang.Object path_;
    /**
     * <code>required string path = 1;</code>
     */
    public boolean hasPath() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string path = 1;</code>
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
     * <code>required string path = 1;</code>
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

    public static final int NEWBLOCK_FIELD_NUMBER = 2;
    private boolean newBlock_;
    /**
     * <code>optional bool newBlock = 2 [default = false];</code>
     */
    public boolean hasNewBlock() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional bool newBlock = 2 [default = false];</code>
     */
    public boolean getNewBlock() {
      return newBlock_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasPath()) {
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, path_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeBool(2, newBlock_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, path_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeBoolSize(2, newBlock_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto other = (org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto) obj;

      if (hasPath() != other.hasPath()) return false;
      if (hasPath()) {
        if (!getPath()
            .equals(other.getPath())) return false;
      }
      if (hasNewBlock() != other.hasNewBlock()) return false;
      if (hasNewBlock()) {
        if (getNewBlock()
            != other.getNewBlock()) return false;
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
      if (hasPath()) {
        hash = (37 * hash) + PATH_FIELD_NUMBER;
        hash = (53 * hash) + getPath().hashCode();
      }
      if (hasNewBlock()) {
        hash = (37 * hash) + NEWBLOCK_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashBoolean(
            getNewBlock());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.AppendEventProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.AppendEventProto)
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_AppendEventProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_AppendEventProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto.class, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto.newBuilder()
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
        path_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        newBlock_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_AppendEventProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto build() {
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto result = new org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.path_ = path_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.newBlock_ = newBlock_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto.getDefaultInstance()) return this;
        if (other.hasPath()) {
          bitField0_ |= 0x00000001;
          path_ = other.path_;
          onChanged();
        }
        if (other.hasNewBlock()) {
          setNewBlock(other.getNewBlock());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasPath()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object path_ = "";
      /**
       * <code>required string path = 1;</code>
       */
      public boolean hasPath() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string path = 1;</code>
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
       * <code>required string path = 1;</code>
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
       * <code>required string path = 1;</code>
       */
      public Builder setPath(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        path_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string path = 1;</code>
       */
      public Builder clearPath() {
        bitField0_ = (bitField0_ & ~0x00000001);
        path_ = getDefaultInstance().getPath();
        onChanged();
        return this;
      }
      /**
       * <code>required string path = 1;</code>
       */
      public Builder setPathBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        path_ = value;
        onChanged();
        return this;
      }

      private boolean newBlock_ ;
      /**
       * <code>optional bool newBlock = 2 [default = false];</code>
       */
      public boolean hasNewBlock() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional bool newBlock = 2 [default = false];</code>
       */
      public boolean getNewBlock() {
        return newBlock_;
      }
      /**
       * <code>optional bool newBlock = 2 [default = false];</code>
       */
      public Builder setNewBlock(boolean value) {
        bitField0_ |= 0x00000002;
        newBlock_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool newBlock = 2 [default = false];</code>
       */
      public Builder clearNewBlock() {
        bitField0_ = (bitField0_ & ~0x00000002);
        newBlock_ = false;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.AppendEventProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.AppendEventProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<AppendEventProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<AppendEventProto>() {
      @java.lang.Override
      public AppendEventProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new AppendEventProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<AppendEventProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<AppendEventProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.AppendEventProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RenameEventProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.RenameEventProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required string srcPath = 1;</code>
     */
    boolean hasSrcPath();
    /**
     * <code>required string srcPath = 1;</code>
     */
    java.lang.String getSrcPath();
    /**
     * <code>required string srcPath = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getSrcPathBytes();

    /**
     * <code>required string destPath = 2;</code>
     */
    boolean hasDestPath();
    /**
     * <code>required string destPath = 2;</code>
     */
    java.lang.String getDestPath();
    /**
     * <code>required string destPath = 2;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getDestPathBytes();

    /**
     * <code>required int64 timestamp = 3;</code>
     */
    boolean hasTimestamp();
    /**
     * <code>required int64 timestamp = 3;</code>
     */
    long getTimestamp();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.RenameEventProto}
   */
  public  static final class RenameEventProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.RenameEventProto)
      RenameEventProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RenameEventProto.newBuilder() to construct.
    private RenameEventProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RenameEventProto() {
      srcPath_ = "";
      destPath_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RenameEventProto(
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
              srcPath_ = bs;
              break;
            }
            case 18: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              destPath_ = bs;
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              timestamp_ = input.readInt64();
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
      return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_RenameEventProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_RenameEventProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto.class, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto.Builder.class);
    }

    private int bitField0_;
    public static final int SRCPATH_FIELD_NUMBER = 1;
    private volatile java.lang.Object srcPath_;
    /**
     * <code>required string srcPath = 1;</code>
     */
    public boolean hasSrcPath() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string srcPath = 1;</code>
     */
    public java.lang.String getSrcPath() {
      java.lang.Object ref = srcPath_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          srcPath_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string srcPath = 1;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getSrcPathBytes() {
      java.lang.Object ref = srcPath_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        srcPath_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int DESTPATH_FIELD_NUMBER = 2;
    private volatile java.lang.Object destPath_;
    /**
     * <code>required string destPath = 2;</code>
     */
    public boolean hasDestPath() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required string destPath = 2;</code>
     */
    public java.lang.String getDestPath() {
      java.lang.Object ref = destPath_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          destPath_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string destPath = 2;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getDestPathBytes() {
      java.lang.Object ref = destPath_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        destPath_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 3;
    private long timestamp_;
    /**
     * <code>required int64 timestamp = 3;</code>
     */
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required int64 timestamp = 3;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasSrcPath()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasDestPath()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTimestamp()) {
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, srcPath_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 2, destPath_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeInt64(3, timestamp_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, srcPath_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(2, destPath_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeInt64Size(3, timestamp_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto other = (org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto) obj;

      if (hasSrcPath() != other.hasSrcPath()) return false;
      if (hasSrcPath()) {
        if (!getSrcPath()
            .equals(other.getSrcPath())) return false;
      }
      if (hasDestPath() != other.hasDestPath()) return false;
      if (hasDestPath()) {
        if (!getDestPath()
            .equals(other.getDestPath())) return false;
      }
      if (hasTimestamp() != other.hasTimestamp()) return false;
      if (hasTimestamp()) {
        if (getTimestamp()
            != other.getTimestamp()) return false;
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
      if (hasSrcPath()) {
        hash = (37 * hash) + SRCPATH_FIELD_NUMBER;
        hash = (53 * hash) + getSrcPath().hashCode();
      }
      if (hasDestPath()) {
        hash = (37 * hash) + DESTPATH_FIELD_NUMBER;
        hash = (53 * hash) + getDestPath().hashCode();
      }
      if (hasTimestamp()) {
        hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getTimestamp());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.RenameEventProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.RenameEventProto)
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_RenameEventProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_RenameEventProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto.class, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto.newBuilder()
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
        srcPath_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        destPath_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        timestamp_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_RenameEventProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto build() {
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto result = new org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.srcPath_ = srcPath_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.destPath_ = destPath_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.timestamp_ = timestamp_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto.getDefaultInstance()) return this;
        if (other.hasSrcPath()) {
          bitField0_ |= 0x00000001;
          srcPath_ = other.srcPath_;
          onChanged();
        }
        if (other.hasDestPath()) {
          bitField0_ |= 0x00000002;
          destPath_ = other.destPath_;
          onChanged();
        }
        if (other.hasTimestamp()) {
          setTimestamp(other.getTimestamp());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasSrcPath()) {
          return false;
        }
        if (!hasDestPath()) {
          return false;
        }
        if (!hasTimestamp()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object srcPath_ = "";
      /**
       * <code>required string srcPath = 1;</code>
       */
      public boolean hasSrcPath() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string srcPath = 1;</code>
       */
      public java.lang.String getSrcPath() {
        java.lang.Object ref = srcPath_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            srcPath_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string srcPath = 1;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getSrcPathBytes() {
        java.lang.Object ref = srcPath_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          srcPath_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string srcPath = 1;</code>
       */
      public Builder setSrcPath(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        srcPath_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string srcPath = 1;</code>
       */
      public Builder clearSrcPath() {
        bitField0_ = (bitField0_ & ~0x00000001);
        srcPath_ = getDefaultInstance().getSrcPath();
        onChanged();
        return this;
      }
      /**
       * <code>required string srcPath = 1;</code>
       */
      public Builder setSrcPathBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        srcPath_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object destPath_ = "";
      /**
       * <code>required string destPath = 2;</code>
       */
      public boolean hasDestPath() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required string destPath = 2;</code>
       */
      public java.lang.String getDestPath() {
        java.lang.Object ref = destPath_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            destPath_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string destPath = 2;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getDestPathBytes() {
        java.lang.Object ref = destPath_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          destPath_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string destPath = 2;</code>
       */
      public Builder setDestPath(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        destPath_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string destPath = 2;</code>
       */
      public Builder clearDestPath() {
        bitField0_ = (bitField0_ & ~0x00000002);
        destPath_ = getDefaultInstance().getDestPath();
        onChanged();
        return this;
      }
      /**
       * <code>required string destPath = 2;</code>
       */
      public Builder setDestPathBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        destPath_ = value;
        onChanged();
        return this;
      }

      private long timestamp_ ;
      /**
       * <code>required int64 timestamp = 3;</code>
       */
      public boolean hasTimestamp() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>required int64 timestamp = 3;</code>
       */
      public long getTimestamp() {
        return timestamp_;
      }
      /**
       * <code>required int64 timestamp = 3;</code>
       */
      public Builder setTimestamp(long value) {
        bitField0_ |= 0x00000004;
        timestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 timestamp = 3;</code>
       */
      public Builder clearTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000004);
        timestamp_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.RenameEventProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.RenameEventProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<RenameEventProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<RenameEventProto>() {
      @java.lang.Override
      public RenameEventProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new RenameEventProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<RenameEventProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<RenameEventProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.RenameEventProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface MetadataUpdateEventProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.MetadataUpdateEventProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required string path = 1;</code>
     */
    boolean hasPath();
    /**
     * <code>required string path = 1;</code>
     */
    java.lang.String getPath();
    /**
     * <code>required string path = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getPathBytes();

    /**
     * <code>required .hadoop.hdfs.MetadataUpdateType type = 2;</code>
     */
    boolean hasType();
    /**
     * <code>required .hadoop.hdfs.MetadataUpdateType type = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateType getType();

    /**
     * <code>optional int64 mtime = 3;</code>
     */
    boolean hasMtime();
    /**
     * <code>optional int64 mtime = 3;</code>
     */
    long getMtime();

    /**
     * <code>optional int64 atime = 4;</code>
     */
    boolean hasAtime();
    /**
     * <code>optional int64 atime = 4;</code>
     */
    long getAtime();

    /**
     * <code>optional int32 replication = 5;</code>
     */
    boolean hasReplication();
    /**
     * <code>optional int32 replication = 5;</code>
     */
    int getReplication();

    /**
     * <code>optional string ownerName = 6;</code>
     */
    boolean hasOwnerName();
    /**
     * <code>optional string ownerName = 6;</code>
     */
    java.lang.String getOwnerName();
    /**
     * <code>optional string ownerName = 6;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getOwnerNameBytes();

    /**
     * <code>optional string groupName = 7;</code>
     */
    boolean hasGroupName();
    /**
     * <code>optional string groupName = 7;</code>
     */
    java.lang.String getGroupName();
    /**
     * <code>optional string groupName = 7;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getGroupNameBytes();

    /**
     * <code>optional .hadoop.hdfs.FsPermissionProto perms = 8;</code>
     */
    boolean hasPerms();
    /**
     * <code>optional .hadoop.hdfs.FsPermissionProto perms = 8;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto getPerms();
    /**
     * <code>optional .hadoop.hdfs.FsPermissionProto perms = 8;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProtoOrBuilder getPermsOrBuilder();

    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto acls = 9;</code>
     */
    java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> 
        getAclsList();
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto acls = 9;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getAcls(int index);
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto acls = 9;</code>
     */
    int getAclsCount();
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto acls = 9;</code>
     */
    java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
        getAclsOrBuilderList();
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto acls = 9;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder getAclsOrBuilder(
        int index);

    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 10;</code>
     */
    java.util.List<org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto> 
        getXAttrsList();
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 10;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto getXAttrs(int index);
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 10;</code>
     */
    int getXAttrsCount();
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 10;</code>
     */
    java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder> 
        getXAttrsOrBuilderList();
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 10;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder getXAttrsOrBuilder(
        int index);

    /**
     * <code>optional bool xAttrsRemoved = 11;</code>
     */
    boolean hasXAttrsRemoved();
    /**
     * <code>optional bool xAttrsRemoved = 11;</code>
     */
    boolean getXAttrsRemoved();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.MetadataUpdateEventProto}
   */
  public  static final class MetadataUpdateEventProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.MetadataUpdateEventProto)
      MetadataUpdateEventProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MetadataUpdateEventProto.newBuilder() to construct.
    private MetadataUpdateEventProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MetadataUpdateEventProto() {
      path_ = "";
      type_ = 0;
      ownerName_ = "";
      groupName_ = "";
      acls_ = java.util.Collections.emptyList();
      xAttrs_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MetadataUpdateEventProto(
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
              path_ = bs;
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
              org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateType value = org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                type_ = rawValue;
              }
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              mtime_ = input.readInt64();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              atime_ = input.readInt64();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              replication_ = input.readInt32();
              break;
            }
            case 50: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000020;
              ownerName_ = bs;
              break;
            }
            case 58: {
              org.apache.hadoop.thirdparty.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000040;
              groupName_ = bs;
              break;
            }
            case 66: {
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000080) != 0)) {
                subBuilder = perms_.toBuilder();
              }
              perms_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(perms_);
                perms_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000080;
              break;
            }
            case 74: {
              if (!((mutable_bitField0_ & 0x00000100) != 0)) {
                acls_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto>();
                mutable_bitField0_ |= 0x00000100;
              }
              acls_.add(
                  input.readMessage(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.PARSER, extensionRegistry));
              break;
            }
            case 82: {
              if (!((mutable_bitField0_ & 0x00000200) != 0)) {
                xAttrs_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto>();
                mutable_bitField0_ |= 0x00000200;
              }
              xAttrs_.add(
                  input.readMessage(org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.PARSER, extensionRegistry));
              break;
            }
            case 88: {
              bitField0_ |= 0x00000100;
              xAttrsRemoved_ = input.readBool();
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
        if (((mutable_bitField0_ & 0x00000100) != 0)) {
          acls_ = java.util.Collections.unmodifiableList(acls_);
        }
        if (((mutable_bitField0_ & 0x00000200) != 0)) {
          xAttrs_ = java.util.Collections.unmodifiableList(xAttrs_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_MetadataUpdateEventProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_MetadataUpdateEventProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto.class, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto.Builder.class);
    }

    private int bitField0_;
    public static final int PATH_FIELD_NUMBER = 1;
    private volatile java.lang.Object path_;
    /**
     * <code>required string path = 1;</code>
     */
    public boolean hasPath() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string path = 1;</code>
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
     * <code>required string path = 1;</code>
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

    public static final int TYPE_FIELD_NUMBER = 2;
    private int type_;
    /**
     * <code>required .hadoop.hdfs.MetadataUpdateType type = 2;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required .hadoop.hdfs.MetadataUpdateType type = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateType getType() {
      @SuppressWarnings("deprecation")
      org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateType result = org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateType.valueOf(type_);
      return result == null ? org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateType.META_TYPE_TIMES : result;
    }

    public static final int MTIME_FIELD_NUMBER = 3;
    private long mtime_;
    /**
     * <code>optional int64 mtime = 3;</code>
     */
    public boolean hasMtime() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional int64 mtime = 3;</code>
     */
    public long getMtime() {
      return mtime_;
    }

    public static final int ATIME_FIELD_NUMBER = 4;
    private long atime_;
    /**
     * <code>optional int64 atime = 4;</code>
     */
    public boolean hasAtime() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional int64 atime = 4;</code>
     */
    public long getAtime() {
      return atime_;
    }

    public static final int REPLICATION_FIELD_NUMBER = 5;
    private int replication_;
    /**
     * <code>optional int32 replication = 5;</code>
     */
    public boolean hasReplication() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>optional int32 replication = 5;</code>
     */
    public int getReplication() {
      return replication_;
    }

    public static final int OWNERNAME_FIELD_NUMBER = 6;
    private volatile java.lang.Object ownerName_;
    /**
     * <code>optional string ownerName = 6;</code>
     */
    public boolean hasOwnerName() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <code>optional string ownerName = 6;</code>
     */
    public java.lang.String getOwnerName() {
      java.lang.Object ref = ownerName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          ownerName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string ownerName = 6;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getOwnerNameBytes() {
      java.lang.Object ref = ownerName_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ownerName_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int GROUPNAME_FIELD_NUMBER = 7;
    private volatile java.lang.Object groupName_;
    /**
     * <code>optional string groupName = 7;</code>
     */
    public boolean hasGroupName() {
      return ((bitField0_ & 0x00000040) != 0);
    }
    /**
     * <code>optional string groupName = 7;</code>
     */
    public java.lang.String getGroupName() {
      java.lang.Object ref = groupName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        org.apache.hadoop.thirdparty.protobuf.ByteString bs = 
            (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          groupName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string groupName = 7;</code>
     */
    public org.apache.hadoop.thirdparty.protobuf.ByteString
        getGroupNameBytes() {
      java.lang.Object ref = groupName_;
      if (ref instanceof java.lang.String) {
        org.apache.hadoop.thirdparty.protobuf.ByteString b = 
            org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        groupName_ = b;
        return b;
      } else {
        return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
      }
    }

    public static final int PERMS_FIELD_NUMBER = 8;
    private org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto perms_;
    /**
     * <code>optional .hadoop.hdfs.FsPermissionProto perms = 8;</code>
     */
    public boolean hasPerms() {
      return ((bitField0_ & 0x00000080) != 0);
    }
    /**
     * <code>optional .hadoop.hdfs.FsPermissionProto perms = 8;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto getPerms() {
      return perms_ == null ? org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.getDefaultInstance() : perms_;
    }
    /**
     * <code>optional .hadoop.hdfs.FsPermissionProto perms = 8;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProtoOrBuilder getPermsOrBuilder() {
      return perms_ == null ? org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.getDefaultInstance() : perms_;
    }

    public static final int ACLS_FIELD_NUMBER = 9;
    private java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> acls_;
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto acls = 9;</code>
     */
    public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> getAclsList() {
      return acls_;
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto acls = 9;</code>
     */
    public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
        getAclsOrBuilderList() {
      return acls_;
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto acls = 9;</code>
     */
    public int getAclsCount() {
      return acls_.size();
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto acls = 9;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getAcls(int index) {
      return acls_.get(index);
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto acls = 9;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder getAclsOrBuilder(
        int index) {
      return acls_.get(index);
    }

    public static final int XATTRS_FIELD_NUMBER = 10;
    private java.util.List<org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto> xAttrs_;
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 10;</code>
     */
    public java.util.List<org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto> getXAttrsList() {
      return xAttrs_;
    }
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 10;</code>
     */
    public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder> 
        getXAttrsOrBuilderList() {
      return xAttrs_;
    }
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 10;</code>
     */
    public int getXAttrsCount() {
      return xAttrs_.size();
    }
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 10;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto getXAttrs(int index) {
      return xAttrs_.get(index);
    }
    /**
     * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 10;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder getXAttrsOrBuilder(
        int index) {
      return xAttrs_.get(index);
    }

    public static final int XATTRSREMOVED_FIELD_NUMBER = 11;
    private boolean xAttrsRemoved_;
    /**
     * <code>optional bool xAttrsRemoved = 11;</code>
     */
    public boolean hasXAttrsRemoved() {
      return ((bitField0_ & 0x00000100) != 0);
    }
    /**
     * <code>optional bool xAttrsRemoved = 11;</code>
     */
    public boolean getXAttrsRemoved() {
      return xAttrsRemoved_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasPath()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasPerms()) {
        if (!getPerms().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getAclsCount(); i++) {
        if (!getAcls(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, path_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeEnum(2, type_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeInt64(3, mtime_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeInt64(4, atime_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        output.writeInt32(5, replication_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 6, ownerName_);
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 7, groupName_);
      }
      if (((bitField0_ & 0x00000080) != 0)) {
        output.writeMessage(8, getPerms());
      }
      for (int i = 0; i < acls_.size(); i++) {
        output.writeMessage(9, acls_.get(i));
      }
      for (int i = 0; i < xAttrs_.size(); i++) {
        output.writeMessage(10, xAttrs_.get(i));
      }
      if (((bitField0_ & 0x00000100) != 0)) {
        output.writeBool(11, xAttrsRemoved_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, path_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeEnumSize(2, type_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeInt64Size(3, mtime_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeInt64Size(4, atime_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeInt32Size(5, replication_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(6, ownerName_);
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(7, groupName_);
      }
      if (((bitField0_ & 0x00000080) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(8, getPerms());
      }
      for (int i = 0; i < acls_.size(); i++) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(9, acls_.get(i));
      }
      for (int i = 0; i < xAttrs_.size(); i++) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(10, xAttrs_.get(i));
      }
      if (((bitField0_ & 0x00000100) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeBoolSize(11, xAttrsRemoved_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto other = (org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto) obj;

      if (hasPath() != other.hasPath()) return false;
      if (hasPath()) {
        if (!getPath()
            .equals(other.getPath())) return false;
      }
      if (hasType() != other.hasType()) return false;
      if (hasType()) {
        if (type_ != other.type_) return false;
      }
      if (hasMtime() != other.hasMtime()) return false;
      if (hasMtime()) {
        if (getMtime()
            != other.getMtime()) return false;
      }
      if (hasAtime() != other.hasAtime()) return false;
      if (hasAtime()) {
        if (getAtime()
            != other.getAtime()) return false;
      }
      if (hasReplication() != other.hasReplication()) return false;
      if (hasReplication()) {
        if (getReplication()
            != other.getReplication()) return false;
      }
      if (hasOwnerName() != other.hasOwnerName()) return false;
      if (hasOwnerName()) {
        if (!getOwnerName()
            .equals(other.getOwnerName())) return false;
      }
      if (hasGroupName() != other.hasGroupName()) return false;
      if (hasGroupName()) {
        if (!getGroupName()
            .equals(other.getGroupName())) return false;
      }
      if (hasPerms() != other.hasPerms()) return false;
      if (hasPerms()) {
        if (!getPerms()
            .equals(other.getPerms())) return false;
      }
      if (!getAclsList()
          .equals(other.getAclsList())) return false;
      if (!getXAttrsList()
          .equals(other.getXAttrsList())) return false;
      if (hasXAttrsRemoved() != other.hasXAttrsRemoved()) return false;
      if (hasXAttrsRemoved()) {
        if (getXAttrsRemoved()
            != other.getXAttrsRemoved()) return false;
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
      if (hasPath()) {
        hash = (37 * hash) + PATH_FIELD_NUMBER;
        hash = (53 * hash) + getPath().hashCode();
      }
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + type_;
      }
      if (hasMtime()) {
        hash = (37 * hash) + MTIME_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getMtime());
      }
      if (hasAtime()) {
        hash = (37 * hash) + ATIME_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getAtime());
      }
      if (hasReplication()) {
        hash = (37 * hash) + REPLICATION_FIELD_NUMBER;
        hash = (53 * hash) + getReplication();
      }
      if (hasOwnerName()) {
        hash = (37 * hash) + OWNERNAME_FIELD_NUMBER;
        hash = (53 * hash) + getOwnerName().hashCode();
      }
      if (hasGroupName()) {
        hash = (37 * hash) + GROUPNAME_FIELD_NUMBER;
        hash = (53 * hash) + getGroupName().hashCode();
      }
      if (hasPerms()) {
        hash = (37 * hash) + PERMS_FIELD_NUMBER;
        hash = (53 * hash) + getPerms().hashCode();
      }
      if (getAclsCount() > 0) {
        hash = (37 * hash) + ACLS_FIELD_NUMBER;
        hash = (53 * hash) + getAclsList().hashCode();
      }
      if (getXAttrsCount() > 0) {
        hash = (37 * hash) + XATTRS_FIELD_NUMBER;
        hash = (53 * hash) + getXAttrsList().hashCode();
      }
      if (hasXAttrsRemoved()) {
        hash = (37 * hash) + XATTRSREMOVED_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashBoolean(
            getXAttrsRemoved());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.MetadataUpdateEventProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.MetadataUpdateEventProto)
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_MetadataUpdateEventProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_MetadataUpdateEventProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto.class, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto.newBuilder()
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
          getPermsFieldBuilder();
          getAclsFieldBuilder();
          getXAttrsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        path_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        mtime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        atime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000008);
        replication_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        ownerName_ = "";
        bitField0_ = (bitField0_ & ~0x00000020);
        groupName_ = "";
        bitField0_ = (bitField0_ & ~0x00000040);
        if (permsBuilder_ == null) {
          perms_ = null;
        } else {
          permsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000080);
        if (aclsBuilder_ == null) {
          acls_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000100);
        } else {
          aclsBuilder_.clear();
        }
        if (xAttrsBuilder_ == null) {
          xAttrs_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000200);
        } else {
          xAttrsBuilder_.clear();
        }
        xAttrsRemoved_ = false;
        bitField0_ = (bitField0_ & ~0x00000400);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_MetadataUpdateEventProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto build() {
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto result = new org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.path_ = path_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.mtime_ = mtime_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.atime_ = atime_;
          to_bitField0_ |= 0x00000008;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.replication_ = replication_;
          to_bitField0_ |= 0x00000010;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          to_bitField0_ |= 0x00000020;
        }
        result.ownerName_ = ownerName_;
        if (((from_bitField0_ & 0x00000040) != 0)) {
          to_bitField0_ |= 0x00000040;
        }
        result.groupName_ = groupName_;
        if (((from_bitField0_ & 0x00000080) != 0)) {
          if (permsBuilder_ == null) {
            result.perms_ = perms_;
          } else {
            result.perms_ = permsBuilder_.build();
          }
          to_bitField0_ |= 0x00000080;
        }
        if (aclsBuilder_ == null) {
          if (((bitField0_ & 0x00000100) != 0)) {
            acls_ = java.util.Collections.unmodifiableList(acls_);
            bitField0_ = (bitField0_ & ~0x00000100);
          }
          result.acls_ = acls_;
        } else {
          result.acls_ = aclsBuilder_.build();
        }
        if (xAttrsBuilder_ == null) {
          if (((bitField0_ & 0x00000200) != 0)) {
            xAttrs_ = java.util.Collections.unmodifiableList(xAttrs_);
            bitField0_ = (bitField0_ & ~0x00000200);
          }
          result.xAttrs_ = xAttrs_;
        } else {
          result.xAttrs_ = xAttrsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000400) != 0)) {
          result.xAttrsRemoved_ = xAttrsRemoved_;
          to_bitField0_ |= 0x00000100;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto.getDefaultInstance()) return this;
        if (other.hasPath()) {
          bitField0_ |= 0x00000001;
          path_ = other.path_;
          onChanged();
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasMtime()) {
          setMtime(other.getMtime());
        }
        if (other.hasAtime()) {
          setAtime(other.getAtime());
        }
        if (other.hasReplication()) {
          setReplication(other.getReplication());
        }
        if (other.hasOwnerName()) {
          bitField0_ |= 0x00000020;
          ownerName_ = other.ownerName_;
          onChanged();
        }
        if (other.hasGroupName()) {
          bitField0_ |= 0x00000040;
          groupName_ = other.groupName_;
          onChanged();
        }
        if (other.hasPerms()) {
          mergePerms(other.getPerms());
        }
        if (aclsBuilder_ == null) {
          if (!other.acls_.isEmpty()) {
            if (acls_.isEmpty()) {
              acls_ = other.acls_;
              bitField0_ = (bitField0_ & ~0x00000100);
            } else {
              ensureAclsIsMutable();
              acls_.addAll(other.acls_);
            }
            onChanged();
          }
        } else {
          if (!other.acls_.isEmpty()) {
            if (aclsBuilder_.isEmpty()) {
              aclsBuilder_.dispose();
              aclsBuilder_ = null;
              acls_ = other.acls_;
              bitField0_ = (bitField0_ & ~0x00000100);
              aclsBuilder_ = 
                org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getAclsFieldBuilder() : null;
            } else {
              aclsBuilder_.addAllMessages(other.acls_);
            }
          }
        }
        if (xAttrsBuilder_ == null) {
          if (!other.xAttrs_.isEmpty()) {
            if (xAttrs_.isEmpty()) {
              xAttrs_ = other.xAttrs_;
              bitField0_ = (bitField0_ & ~0x00000200);
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
              bitField0_ = (bitField0_ & ~0x00000200);
              xAttrsBuilder_ = 
                org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getXAttrsFieldBuilder() : null;
            } else {
              xAttrsBuilder_.addAllMessages(other.xAttrs_);
            }
          }
        }
        if (other.hasXAttrsRemoved()) {
          setXAttrsRemoved(other.getXAttrsRemoved());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasPath()) {
          return false;
        }
        if (!hasType()) {
          return false;
        }
        if (hasPerms()) {
          if (!getPerms().isInitialized()) {
            return false;
          }
        }
        for (int i = 0; i < getAclsCount(); i++) {
          if (!getAcls(i).isInitialized()) {
            return false;
          }
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
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object path_ = "";
      /**
       * <code>required string path = 1;</code>
       */
      public boolean hasPath() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string path = 1;</code>
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
       * <code>required string path = 1;</code>
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
       * <code>required string path = 1;</code>
       */
      public Builder setPath(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        path_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string path = 1;</code>
       */
      public Builder clearPath() {
        bitField0_ = (bitField0_ & ~0x00000001);
        path_ = getDefaultInstance().getPath();
        onChanged();
        return this;
      }
      /**
       * <code>required string path = 1;</code>
       */
      public Builder setPathBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        path_ = value;
        onChanged();
        return this;
      }

      private int type_ = 0;
      /**
       * <code>required .hadoop.hdfs.MetadataUpdateType type = 2;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required .hadoop.hdfs.MetadataUpdateType type = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateType getType() {
        @SuppressWarnings("deprecation")
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateType result = org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateType.valueOf(type_);
        return result == null ? org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateType.META_TYPE_TIMES : result;
      }
      /**
       * <code>required .hadoop.hdfs.MetadataUpdateType type = 2;</code>
       */
      public Builder setType(org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.MetadataUpdateType type = 2;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        type_ = 0;
        onChanged();
        return this;
      }

      private long mtime_ ;
      /**
       * <code>optional int64 mtime = 3;</code>
       */
      public boolean hasMtime() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional int64 mtime = 3;</code>
       */
      public long getMtime() {
        return mtime_;
      }
      /**
       * <code>optional int64 mtime = 3;</code>
       */
      public Builder setMtime(long value) {
        bitField0_ |= 0x00000004;
        mtime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 mtime = 3;</code>
       */
      public Builder clearMtime() {
        bitField0_ = (bitField0_ & ~0x00000004);
        mtime_ = 0L;
        onChanged();
        return this;
      }

      private long atime_ ;
      /**
       * <code>optional int64 atime = 4;</code>
       */
      public boolean hasAtime() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>optional int64 atime = 4;</code>
       */
      public long getAtime() {
        return atime_;
      }
      /**
       * <code>optional int64 atime = 4;</code>
       */
      public Builder setAtime(long value) {
        bitField0_ |= 0x00000008;
        atime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 atime = 4;</code>
       */
      public Builder clearAtime() {
        bitField0_ = (bitField0_ & ~0x00000008);
        atime_ = 0L;
        onChanged();
        return this;
      }

      private int replication_ ;
      /**
       * <code>optional int32 replication = 5;</code>
       */
      public boolean hasReplication() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <code>optional int32 replication = 5;</code>
       */
      public int getReplication() {
        return replication_;
      }
      /**
       * <code>optional int32 replication = 5;</code>
       */
      public Builder setReplication(int value) {
        bitField0_ |= 0x00000010;
        replication_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 replication = 5;</code>
       */
      public Builder clearReplication() {
        bitField0_ = (bitField0_ & ~0x00000010);
        replication_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object ownerName_ = "";
      /**
       * <code>optional string ownerName = 6;</code>
       */
      public boolean hasOwnerName() {
        return ((bitField0_ & 0x00000020) != 0);
      }
      /**
       * <code>optional string ownerName = 6;</code>
       */
      public java.lang.String getOwnerName() {
        java.lang.Object ref = ownerName_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            ownerName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string ownerName = 6;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getOwnerNameBytes() {
        java.lang.Object ref = ownerName_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          ownerName_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string ownerName = 6;</code>
       */
      public Builder setOwnerName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        ownerName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string ownerName = 6;</code>
       */
      public Builder clearOwnerName() {
        bitField0_ = (bitField0_ & ~0x00000020);
        ownerName_ = getDefaultInstance().getOwnerName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string ownerName = 6;</code>
       */
      public Builder setOwnerNameBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000020;
        ownerName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object groupName_ = "";
      /**
       * <code>optional string groupName = 7;</code>
       */
      public boolean hasGroupName() {
        return ((bitField0_ & 0x00000040) != 0);
      }
      /**
       * <code>optional string groupName = 7;</code>
       */
      public java.lang.String getGroupName() {
        java.lang.Object ref = groupName_;
        if (!(ref instanceof java.lang.String)) {
          org.apache.hadoop.thirdparty.protobuf.ByteString bs =
              (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            groupName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string groupName = 7;</code>
       */
      public org.apache.hadoop.thirdparty.protobuf.ByteString
          getGroupNameBytes() {
        java.lang.Object ref = groupName_;
        if (ref instanceof String) {
          org.apache.hadoop.thirdparty.protobuf.ByteString b = 
              org.apache.hadoop.thirdparty.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          groupName_ = b;
          return b;
        } else {
          return (org.apache.hadoop.thirdparty.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string groupName = 7;</code>
       */
      public Builder setGroupName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        groupName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string groupName = 7;</code>
       */
      public Builder clearGroupName() {
        bitField0_ = (bitField0_ & ~0x00000040);
        groupName_ = getDefaultInstance().getGroupName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string groupName = 7;</code>
       */
      public Builder setGroupNameBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000040;
        groupName_ = value;
        onChanged();
        return this;
      }

      private org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto perms_;
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProtoOrBuilder> permsBuilder_;
      /**
       * <code>optional .hadoop.hdfs.FsPermissionProto perms = 8;</code>
       */
      public boolean hasPerms() {
        return ((bitField0_ & 0x00000080) != 0);
      }
      /**
       * <code>optional .hadoop.hdfs.FsPermissionProto perms = 8;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto getPerms() {
        if (permsBuilder_ == null) {
          return perms_ == null ? org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.getDefaultInstance() : perms_;
        } else {
          return permsBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .hadoop.hdfs.FsPermissionProto perms = 8;</code>
       */
      public Builder setPerms(org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto value) {
        if (permsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          perms_ = value;
          onChanged();
        } else {
          permsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000080;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.FsPermissionProto perms = 8;</code>
       */
      public Builder setPerms(
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.Builder builderForValue) {
        if (permsBuilder_ == null) {
          perms_ = builderForValue.build();
          onChanged();
        } else {
          permsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000080;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.FsPermissionProto perms = 8;</code>
       */
      public Builder mergePerms(org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto value) {
        if (permsBuilder_ == null) {
          if (((bitField0_ & 0x00000080) != 0) &&
              perms_ != null &&
              perms_ != org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.getDefaultInstance()) {
            perms_ =
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.newBuilder(perms_).mergeFrom(value).buildPartial();
          } else {
            perms_ = value;
          }
          onChanged();
        } else {
          permsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000080;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.FsPermissionProto perms = 8;</code>
       */
      public Builder clearPerms() {
        if (permsBuilder_ == null) {
          perms_ = null;
          onChanged();
        } else {
          permsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000080);
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.FsPermissionProto perms = 8;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.Builder getPermsBuilder() {
        bitField0_ |= 0x00000080;
        onChanged();
        return getPermsFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .hadoop.hdfs.FsPermissionProto perms = 8;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProtoOrBuilder getPermsOrBuilder() {
        if (permsBuilder_ != null) {
          return permsBuilder_.getMessageOrBuilder();
        } else {
          return perms_ == null ?
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.getDefaultInstance() : perms_;
        }
      }
      /**
       * <code>optional .hadoop.hdfs.FsPermissionProto perms = 8;</code>
       */
      private org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProtoOrBuilder> 
          getPermsFieldBuilder() {
        if (permsBuilder_ == null) {
          permsBuilder_ = new org.apache.hadoop.thirdparty.protobuf.SingleFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProtoOrBuilder>(
                  getPerms(),
                  getParentForChildren(),
                  isClean());
          perms_ = null;
        }
        return permsBuilder_;
      }

      private java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> acls_ =
        java.util.Collections.emptyList();
      private void ensureAclsIsMutable() {
        if (!((bitField0_ & 0x00000100) != 0)) {
          acls_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto>(acls_);
          bitField0_ |= 0x00000100;
         }
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> aclsBuilder_;

      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto acls = 9;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> getAclsList() {
        if (aclsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(acls_);
        } else {
          return aclsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto acls = 9;</code>
       */
      public int getAclsCount() {
        if (aclsBuilder_ == null) {
          return acls_.size();
        } else {
          return aclsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto acls = 9;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getAcls(int index) {
        if (aclsBuilder_ == null) {
          return acls_.get(index);
        } else {
          return aclsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto acls = 9;</code>
       */
      public Builder setAcls(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto value) {
        if (aclsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAclsIsMutable();
          acls_.set(index, value);
          onChanged();
        } else {
          aclsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto acls = 9;</code>
       */
      public Builder setAcls(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder builderForValue) {
        if (aclsBuilder_ == null) {
          ensureAclsIsMutable();
          acls_.set(index, builderForValue.build());
          onChanged();
        } else {
          aclsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto acls = 9;</code>
       */
      public Builder addAcls(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto value) {
        if (aclsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAclsIsMutable();
          acls_.add(value);
          onChanged();
        } else {
          aclsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto acls = 9;</code>
       */
      public Builder addAcls(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto value) {
        if (aclsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAclsIsMutable();
          acls_.add(index, value);
          onChanged();
        } else {
          aclsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto acls = 9;</code>
       */
      public Builder addAcls(
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder builderForValue) {
        if (aclsBuilder_ == null) {
          ensureAclsIsMutable();
          acls_.add(builderForValue.build());
          onChanged();
        } else {
          aclsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto acls = 9;</code>
       */
      public Builder addAcls(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder builderForValue) {
        if (aclsBuilder_ == null) {
          ensureAclsIsMutable();
          acls_.add(index, builderForValue.build());
          onChanged();
        } else {
          aclsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto acls = 9;</code>
       */
      public Builder addAllAcls(
          java.lang.Iterable<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> values) {
        if (aclsBuilder_ == null) {
          ensureAclsIsMutable();
          org.apache.hadoop.thirdparty.protobuf.AbstractMessageLite.Builder.addAll(
              values, acls_);
          onChanged();
        } else {
          aclsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto acls = 9;</code>
       */
      public Builder clearAcls() {
        if (aclsBuilder_ == null) {
          acls_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000100);
          onChanged();
        } else {
          aclsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto acls = 9;</code>
       */
      public Builder removeAcls(int index) {
        if (aclsBuilder_ == null) {
          ensureAclsIsMutable();
          acls_.remove(index);
          onChanged();
        } else {
          aclsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto acls = 9;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder getAclsBuilder(
          int index) {
        return getAclsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto acls = 9;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder getAclsOrBuilder(
          int index) {
        if (aclsBuilder_ == null) {
          return acls_.get(index);  } else {
          return aclsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto acls = 9;</code>
       */
      public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
           getAclsOrBuilderList() {
        if (aclsBuilder_ != null) {
          return aclsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(acls_);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto acls = 9;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder addAclsBuilder() {
        return getAclsFieldBuilder().addBuilder(
            org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto acls = 9;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder addAclsBuilder(
          int index) {
        return getAclsFieldBuilder().addBuilder(
            index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto acls = 9;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder> 
           getAclsBuilderList() {
        return getAclsFieldBuilder().getBuilderList();
      }
      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
          getAclsFieldBuilder() {
        if (aclsBuilder_ == null) {
          aclsBuilder_ = new org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder>(
                  acls_,
                  ((bitField0_ & 0x00000100) != 0),
                  getParentForChildren(),
                  isClean());
          acls_ = null;
        }
        return aclsBuilder_;
      }

      private java.util.List<org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto> xAttrs_ =
        java.util.Collections.emptyList();
      private void ensureXAttrsIsMutable() {
        if (!((bitField0_ & 0x00000200) != 0)) {
          xAttrs_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto>(xAttrs_);
          bitField0_ |= 0x00000200;
         }
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder> xAttrsBuilder_;

      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 10;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto> getXAttrsList() {
        if (xAttrsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(xAttrs_);
        } else {
          return xAttrsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 10;</code>
       */
      public int getXAttrsCount() {
        if (xAttrsBuilder_ == null) {
          return xAttrs_.size();
        } else {
          return xAttrsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 10;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto getXAttrs(int index) {
        if (xAttrsBuilder_ == null) {
          return xAttrs_.get(index);
        } else {
          return xAttrsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 10;</code>
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
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 10;</code>
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
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 10;</code>
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
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 10;</code>
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
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 10;</code>
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
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 10;</code>
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
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 10;</code>
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
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 10;</code>
       */
      public Builder clearXAttrs() {
        if (xAttrsBuilder_ == null) {
          xAttrs_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000200);
          onChanged();
        } else {
          xAttrsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 10;</code>
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
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 10;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder getXAttrsBuilder(
          int index) {
        return getXAttrsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 10;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProtoOrBuilder getXAttrsOrBuilder(
          int index) {
        if (xAttrsBuilder_ == null) {
          return xAttrs_.get(index);  } else {
          return xAttrsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 10;</code>
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
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 10;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder addXAttrsBuilder() {
        return getXAttrsFieldBuilder().addBuilder(
            org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 10;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.Builder addXAttrsBuilder(
          int index) {
        return getXAttrsFieldBuilder().addBuilder(
            index, org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.XAttrProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.XAttrProto xAttrs = 10;</code>
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
                  ((bitField0_ & 0x00000200) != 0),
                  getParentForChildren(),
                  isClean());
          xAttrs_ = null;
        }
        return xAttrsBuilder_;
      }

      private boolean xAttrsRemoved_ ;
      /**
       * <code>optional bool xAttrsRemoved = 11;</code>
       */
      public boolean hasXAttrsRemoved() {
        return ((bitField0_ & 0x00000400) != 0);
      }
      /**
       * <code>optional bool xAttrsRemoved = 11;</code>
       */
      public boolean getXAttrsRemoved() {
        return xAttrsRemoved_;
      }
      /**
       * <code>optional bool xAttrsRemoved = 11;</code>
       */
      public Builder setXAttrsRemoved(boolean value) {
        bitField0_ |= 0x00000400;
        xAttrsRemoved_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool xAttrsRemoved = 11;</code>
       */
      public Builder clearXAttrsRemoved() {
        bitField0_ = (bitField0_ & ~0x00000400);
        xAttrsRemoved_ = false;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.MetadataUpdateEventProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.MetadataUpdateEventProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<MetadataUpdateEventProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<MetadataUpdateEventProto>() {
      @java.lang.Override
      public MetadataUpdateEventProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new MetadataUpdateEventProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<MetadataUpdateEventProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<MetadataUpdateEventProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.MetadataUpdateEventProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface UnlinkEventProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.UnlinkEventProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <code>required string path = 1;</code>
     */
    boolean hasPath();
    /**
     * <code>required string path = 1;</code>
     */
    java.lang.String getPath();
    /**
     * <code>required string path = 1;</code>
     */
    org.apache.hadoop.thirdparty.protobuf.ByteString
        getPathBytes();

    /**
     * <code>required int64 timestamp = 2;</code>
     */
    boolean hasTimestamp();
    /**
     * <code>required int64 timestamp = 2;</code>
     */
    long getTimestamp();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.UnlinkEventProto}
   */
  public  static final class UnlinkEventProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.UnlinkEventProto)
      UnlinkEventProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UnlinkEventProto.newBuilder() to construct.
    private UnlinkEventProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UnlinkEventProto() {
      path_ = "";
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UnlinkEventProto(
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
              path_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              timestamp_ = input.readInt64();
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
      return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_UnlinkEventProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_UnlinkEventProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto.class, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto.Builder.class);
    }

    private int bitField0_;
    public static final int PATH_FIELD_NUMBER = 1;
    private volatile java.lang.Object path_;
    /**
     * <code>required string path = 1;</code>
     */
    public boolean hasPath() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string path = 1;</code>
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
     * <code>required string path = 1;</code>
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

    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    private long timestamp_;
    /**
     * <code>required int64 timestamp = 2;</code>
     */
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required int64 timestamp = 2;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasPath()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTimestamp()) {
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
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.writeString(output, 1, path_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeInt64(2, timestamp_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.computeStringSize(1, path_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeInt64Size(2, timestamp_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto other = (org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto) obj;

      if (hasPath() != other.hasPath()) return false;
      if (hasPath()) {
        if (!getPath()
            .equals(other.getPath())) return false;
      }
      if (hasTimestamp() != other.hasTimestamp()) return false;
      if (hasTimestamp()) {
        if (getTimestamp()
            != other.getTimestamp()) return false;
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
      if (hasPath()) {
        hash = (37 * hash) + PATH_FIELD_NUMBER;
        hash = (53 * hash) + getPath().hashCode();
      }
      if (hasTimestamp()) {
        hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getTimestamp());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.UnlinkEventProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.UnlinkEventProto)
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_UnlinkEventProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_UnlinkEventProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto.class, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto.newBuilder()
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
        path_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        timestamp_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_UnlinkEventProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto build() {
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto result = new org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.path_ = path_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.timestamp_ = timestamp_;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto.getDefaultInstance()) return this;
        if (other.hasPath()) {
          bitField0_ |= 0x00000001;
          path_ = other.path_;
          onChanged();
        }
        if (other.hasTimestamp()) {
          setTimestamp(other.getTimestamp());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasPath()) {
          return false;
        }
        if (!hasTimestamp()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object path_ = "";
      /**
       * <code>required string path = 1;</code>
       */
      public boolean hasPath() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string path = 1;</code>
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
       * <code>required string path = 1;</code>
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
       * <code>required string path = 1;</code>
       */
      public Builder setPath(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        path_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string path = 1;</code>
       */
      public Builder clearPath() {
        bitField0_ = (bitField0_ & ~0x00000001);
        path_ = getDefaultInstance().getPath();
        onChanged();
        return this;
      }
      /**
       * <code>required string path = 1;</code>
       */
      public Builder setPathBytes(
          org.apache.hadoop.thirdparty.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        path_ = value;
        onChanged();
        return this;
      }

      private long timestamp_ ;
      /**
       * <code>required int64 timestamp = 2;</code>
       */
      public boolean hasTimestamp() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required int64 timestamp = 2;</code>
       */
      public long getTimestamp() {
        return timestamp_;
      }
      /**
       * <code>required int64 timestamp = 2;</code>
       */
      public Builder setTimestamp(long value) {
        bitField0_ |= 0x00000002;
        timestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 timestamp = 2;</code>
       */
      public Builder clearTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000002);
        timestamp_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.UnlinkEventProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.UnlinkEventProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<UnlinkEventProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<UnlinkEventProto>() {
      @java.lang.Override
      public UnlinkEventProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new UnlinkEventProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<UnlinkEventProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<UnlinkEventProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.UnlinkEventProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface EventsListProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hadoop.hdfs.EventsListProto)
      org.apache.hadoop.thirdparty.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * deprecated
     * </pre>
     *
     * <code>repeated .hadoop.hdfs.EventProto events = 1;</code>
     */
    java.util.List<org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto> 
        getEventsList();
    /**
     * <pre>
     * deprecated
     * </pre>
     *
     * <code>repeated .hadoop.hdfs.EventProto events = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto getEvents(int index);
    /**
     * <pre>
     * deprecated
     * </pre>
     *
     * <code>repeated .hadoop.hdfs.EventProto events = 1;</code>
     */
    int getEventsCount();
    /**
     * <pre>
     * deprecated
     * </pre>
     *
     * <code>repeated .hadoop.hdfs.EventProto events = 1;</code>
     */
    java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProtoOrBuilder> 
        getEventsOrBuilderList();
    /**
     * <pre>
     * deprecated
     * </pre>
     *
     * <code>repeated .hadoop.hdfs.EventProto events = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProtoOrBuilder getEventsOrBuilder(
        int index);

    /**
     * <code>required int64 firstTxid = 2;</code>
     */
    boolean hasFirstTxid();
    /**
     * <code>required int64 firstTxid = 2;</code>
     */
    long getFirstTxid();

    /**
     * <code>required int64 lastTxid = 3;</code>
     */
    boolean hasLastTxid();
    /**
     * <code>required int64 lastTxid = 3;</code>
     */
    long getLastTxid();

    /**
     * <code>required int64 syncTxid = 4;</code>
     */
    boolean hasSyncTxid();
    /**
     * <code>required int64 syncTxid = 4;</code>
     */
    long getSyncTxid();

    /**
     * <code>repeated .hadoop.hdfs.EventBatchProto batch = 5;</code>
     */
    java.util.List<org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto> 
        getBatchList();
    /**
     * <code>repeated .hadoop.hdfs.EventBatchProto batch = 5;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto getBatch(int index);
    /**
     * <code>repeated .hadoop.hdfs.EventBatchProto batch = 5;</code>
     */
    int getBatchCount();
    /**
     * <code>repeated .hadoop.hdfs.EventBatchProto batch = 5;</code>
     */
    java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProtoOrBuilder> 
        getBatchOrBuilderList();
    /**
     * <code>repeated .hadoop.hdfs.EventBatchProto batch = 5;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProtoOrBuilder getBatchOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code hadoop.hdfs.EventsListProto}
   */
  public  static final class EventsListProto extends
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hadoop.hdfs.EventsListProto)
      EventsListProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EventsListProto.newBuilder() to construct.
    private EventsListProto(org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EventsListProto() {
      events_ = java.util.Collections.emptyList();
      batch_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final org.apache.hadoop.thirdparty.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EventsListProto(
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
                events_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto>();
                mutable_bitField0_ |= 0x00000001;
              }
              events_.add(
                  input.readMessage(org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto.PARSER, extensionRegistry));
              break;
            }
            case 16: {
              bitField0_ |= 0x00000001;
              firstTxid_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000002;
              lastTxid_ = input.readInt64();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000004;
              syncTxid_ = input.readInt64();
              break;
            }
            case 42: {
              if (!((mutable_bitField0_ & 0x00000010) != 0)) {
                batch_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto>();
                mutable_bitField0_ |= 0x00000010;
              }
              batch_.add(
                  input.readMessage(org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto.PARSER, extensionRegistry));
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
          events_ = java.util.Collections.unmodifiableList(events_);
        }
        if (((mutable_bitField0_ & 0x00000010) != 0)) {
          batch_ = java.util.Collections.unmodifiableList(batch_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_EventsListProto_descriptor;
    }

    @java.lang.Override
    protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_EventsListProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto.class, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto.Builder.class);
    }

    private int bitField0_;
    public static final int EVENTS_FIELD_NUMBER = 1;
    private java.util.List<org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto> events_;
    /**
     * <pre>
     * deprecated
     * </pre>
     *
     * <code>repeated .hadoop.hdfs.EventProto events = 1;</code>
     */
    public java.util.List<org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto> getEventsList() {
      return events_;
    }
    /**
     * <pre>
     * deprecated
     * </pre>
     *
     * <code>repeated .hadoop.hdfs.EventProto events = 1;</code>
     */
    public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProtoOrBuilder> 
        getEventsOrBuilderList() {
      return events_;
    }
    /**
     * <pre>
     * deprecated
     * </pre>
     *
     * <code>repeated .hadoop.hdfs.EventProto events = 1;</code>
     */
    public int getEventsCount() {
      return events_.size();
    }
    /**
     * <pre>
     * deprecated
     * </pre>
     *
     * <code>repeated .hadoop.hdfs.EventProto events = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto getEvents(int index) {
      return events_.get(index);
    }
    /**
     * <pre>
     * deprecated
     * </pre>
     *
     * <code>repeated .hadoop.hdfs.EventProto events = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProtoOrBuilder getEventsOrBuilder(
        int index) {
      return events_.get(index);
    }

    public static final int FIRSTTXID_FIELD_NUMBER = 2;
    private long firstTxid_;
    /**
     * <code>required int64 firstTxid = 2;</code>
     */
    public boolean hasFirstTxid() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required int64 firstTxid = 2;</code>
     */
    public long getFirstTxid() {
      return firstTxid_;
    }

    public static final int LASTTXID_FIELD_NUMBER = 3;
    private long lastTxid_;
    /**
     * <code>required int64 lastTxid = 3;</code>
     */
    public boolean hasLastTxid() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required int64 lastTxid = 3;</code>
     */
    public long getLastTxid() {
      return lastTxid_;
    }

    public static final int SYNCTXID_FIELD_NUMBER = 4;
    private long syncTxid_;
    /**
     * <code>required int64 syncTxid = 4;</code>
     */
    public boolean hasSyncTxid() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required int64 syncTxid = 4;</code>
     */
    public long getSyncTxid() {
      return syncTxid_;
    }

    public static final int BATCH_FIELD_NUMBER = 5;
    private java.util.List<org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto> batch_;
    /**
     * <code>repeated .hadoop.hdfs.EventBatchProto batch = 5;</code>
     */
    public java.util.List<org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto> getBatchList() {
      return batch_;
    }
    /**
     * <code>repeated .hadoop.hdfs.EventBatchProto batch = 5;</code>
     */
    public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProtoOrBuilder> 
        getBatchOrBuilderList() {
      return batch_;
    }
    /**
     * <code>repeated .hadoop.hdfs.EventBatchProto batch = 5;</code>
     */
    public int getBatchCount() {
      return batch_.size();
    }
    /**
     * <code>repeated .hadoop.hdfs.EventBatchProto batch = 5;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto getBatch(int index) {
      return batch_.get(index);
    }
    /**
     * <code>repeated .hadoop.hdfs.EventBatchProto batch = 5;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProtoOrBuilder getBatchOrBuilder(
        int index) {
      return batch_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasFirstTxid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLastTxid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSyncTxid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getEventsCount(); i++) {
        if (!getEvents(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getBatchCount(); i++) {
        if (!getBatch(i).isInitialized()) {
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
      for (int i = 0; i < events_.size(); i++) {
        output.writeMessage(1, events_.get(i));
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeInt64(2, firstTxid_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeInt64(3, lastTxid_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeInt64(4, syncTxid_);
      }
      for (int i = 0; i < batch_.size(); i++) {
        output.writeMessage(5, batch_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < events_.size(); i++) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(1, events_.get(i));
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeInt64Size(2, firstTxid_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeInt64Size(3, lastTxid_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeInt64Size(4, syncTxid_);
      }
      for (int i = 0; i < batch_.size(); i++) {
        size += org.apache.hadoop.thirdparty.protobuf.CodedOutputStream
          .computeMessageSize(5, batch_.get(i));
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto other = (org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto) obj;

      if (!getEventsList()
          .equals(other.getEventsList())) return false;
      if (hasFirstTxid() != other.hasFirstTxid()) return false;
      if (hasFirstTxid()) {
        if (getFirstTxid()
            != other.getFirstTxid()) return false;
      }
      if (hasLastTxid() != other.hasLastTxid()) return false;
      if (hasLastTxid()) {
        if (getLastTxid()
            != other.getLastTxid()) return false;
      }
      if (hasSyncTxid() != other.hasSyncTxid()) return false;
      if (hasSyncTxid()) {
        if (getSyncTxid()
            != other.getSyncTxid()) return false;
      }
      if (!getBatchList()
          .equals(other.getBatchList())) return false;
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
      if (getEventsCount() > 0) {
        hash = (37 * hash) + EVENTS_FIELD_NUMBER;
        hash = (53 * hash) + getEventsList().hashCode();
      }
      if (hasFirstTxid()) {
        hash = (37 * hash) + FIRSTTXID_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getFirstTxid());
      }
      if (hasLastTxid()) {
        hash = (37 * hash) + LASTTXID_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getLastTxid());
      }
      if (hasSyncTxid()) {
        hash = (37 * hash) + SYNCTXID_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hadoop.thirdparty.protobuf.Internal.hashLong(
            getSyncTxid());
      }
      if (getBatchCount() > 0) {
        hash = (37 * hash) + BATCH_FIELD_NUMBER;
        hash = (53 * hash) + getBatchList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.ByteString data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto parseFrom(byte[] data)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto parseFrom(
        byte[] data,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto parseFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto parseFrom(
        org.apache.hadoop.thirdparty.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.EventsListProto}
     */
    public static final class Builder extends
        org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hadoop.hdfs.EventsListProto)
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProtoOrBuilder {
      public static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_EventsListProto_descriptor;
      }

      @java.lang.Override
      protected org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_EventsListProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto.class, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto.newBuilder()
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
          getEventsFieldBuilder();
          getBatchFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (eventsBuilder_ == null) {
          events_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          eventsBuilder_.clear();
        }
        firstTxid_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        lastTxid_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        syncTxid_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000008);
        if (batchBuilder_ == null) {
          batch_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          batchBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.internal_static_hadoop_hdfs_EventsListProto_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto build() {
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto result = new org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (eventsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            events_ = java.util.Collections.unmodifiableList(events_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.events_ = events_;
        } else {
          result.events_ = eventsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.firstTxid_ = firstTxid_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.lastTxid_ = lastTxid_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.syncTxid_ = syncTxid_;
          to_bitField0_ |= 0x00000004;
        }
        if (batchBuilder_ == null) {
          if (((bitField0_ & 0x00000010) != 0)) {
            batch_ = java.util.Collections.unmodifiableList(batch_);
            bitField0_ = (bitField0_ & ~0x00000010);
          }
          result.batch_ = batch_;
        } else {
          result.batch_ = batchBuilder_.build();
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto.getDefaultInstance()) return this;
        if (eventsBuilder_ == null) {
          if (!other.events_.isEmpty()) {
            if (events_.isEmpty()) {
              events_ = other.events_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureEventsIsMutable();
              events_.addAll(other.events_);
            }
            onChanged();
          }
        } else {
          if (!other.events_.isEmpty()) {
            if (eventsBuilder_.isEmpty()) {
              eventsBuilder_.dispose();
              eventsBuilder_ = null;
              events_ = other.events_;
              bitField0_ = (bitField0_ & ~0x00000001);
              eventsBuilder_ = 
                org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getEventsFieldBuilder() : null;
            } else {
              eventsBuilder_.addAllMessages(other.events_);
            }
          }
        }
        if (other.hasFirstTxid()) {
          setFirstTxid(other.getFirstTxid());
        }
        if (other.hasLastTxid()) {
          setLastTxid(other.getLastTxid());
        }
        if (other.hasSyncTxid()) {
          setSyncTxid(other.getSyncTxid());
        }
        if (batchBuilder_ == null) {
          if (!other.batch_.isEmpty()) {
            if (batch_.isEmpty()) {
              batch_ = other.batch_;
              bitField0_ = (bitField0_ & ~0x00000010);
            } else {
              ensureBatchIsMutable();
              batch_.addAll(other.batch_);
            }
            onChanged();
          }
        } else {
          if (!other.batch_.isEmpty()) {
            if (batchBuilder_.isEmpty()) {
              batchBuilder_.dispose();
              batchBuilder_ = null;
              batch_ = other.batch_;
              bitField0_ = (bitField0_ & ~0x00000010);
              batchBuilder_ = 
                org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getBatchFieldBuilder() : null;
            } else {
              batchBuilder_.addAllMessages(other.batch_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasFirstTxid()) {
          return false;
        }
        if (!hasLastTxid()) {
          return false;
        }
        if (!hasSyncTxid()) {
          return false;
        }
        for (int i = 0; i < getEventsCount(); i++) {
          if (!getEvents(i).isInitialized()) {
            return false;
          }
        }
        for (int i = 0; i < getBatchCount(); i++) {
          if (!getBatch(i).isInitialized()) {
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
        org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto> events_ =
        java.util.Collections.emptyList();
      private void ensureEventsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          events_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto>(events_);
          bitField0_ |= 0x00000001;
         }
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto.Builder, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProtoOrBuilder> eventsBuilder_;

      /**
       * <pre>
       * deprecated
       * </pre>
       *
       * <code>repeated .hadoop.hdfs.EventProto events = 1;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto> getEventsList() {
        if (eventsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(events_);
        } else {
          return eventsBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       * deprecated
       * </pre>
       *
       * <code>repeated .hadoop.hdfs.EventProto events = 1;</code>
       */
      public int getEventsCount() {
        if (eventsBuilder_ == null) {
          return events_.size();
        } else {
          return eventsBuilder_.getCount();
        }
      }
      /**
       * <pre>
       * deprecated
       * </pre>
       *
       * <code>repeated .hadoop.hdfs.EventProto events = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto getEvents(int index) {
        if (eventsBuilder_ == null) {
          return events_.get(index);
        } else {
          return eventsBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       * deprecated
       * </pre>
       *
       * <code>repeated .hadoop.hdfs.EventProto events = 1;</code>
       */
      public Builder setEvents(
          int index, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto value) {
        if (eventsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEventsIsMutable();
          events_.set(index, value);
          onChanged();
        } else {
          eventsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * deprecated
       * </pre>
       *
       * <code>repeated .hadoop.hdfs.EventProto events = 1;</code>
       */
      public Builder setEvents(
          int index, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto.Builder builderForValue) {
        if (eventsBuilder_ == null) {
          ensureEventsIsMutable();
          events_.set(index, builderForValue.build());
          onChanged();
        } else {
          eventsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * deprecated
       * </pre>
       *
       * <code>repeated .hadoop.hdfs.EventProto events = 1;</code>
       */
      public Builder addEvents(org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto value) {
        if (eventsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEventsIsMutable();
          events_.add(value);
          onChanged();
        } else {
          eventsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       * deprecated
       * </pre>
       *
       * <code>repeated .hadoop.hdfs.EventProto events = 1;</code>
       */
      public Builder addEvents(
          int index, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto value) {
        if (eventsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEventsIsMutable();
          events_.add(index, value);
          onChanged();
        } else {
          eventsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * deprecated
       * </pre>
       *
       * <code>repeated .hadoop.hdfs.EventProto events = 1;</code>
       */
      public Builder addEvents(
          org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto.Builder builderForValue) {
        if (eventsBuilder_ == null) {
          ensureEventsIsMutable();
          events_.add(builderForValue.build());
          onChanged();
        } else {
          eventsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * deprecated
       * </pre>
       *
       * <code>repeated .hadoop.hdfs.EventProto events = 1;</code>
       */
      public Builder addEvents(
          int index, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto.Builder builderForValue) {
        if (eventsBuilder_ == null) {
          ensureEventsIsMutable();
          events_.add(index, builderForValue.build());
          onChanged();
        } else {
          eventsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * deprecated
       * </pre>
       *
       * <code>repeated .hadoop.hdfs.EventProto events = 1;</code>
       */
      public Builder addAllEvents(
          java.lang.Iterable<? extends org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto> values) {
        if (eventsBuilder_ == null) {
          ensureEventsIsMutable();
          org.apache.hadoop.thirdparty.protobuf.AbstractMessageLite.Builder.addAll(
              values, events_);
          onChanged();
        } else {
          eventsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       * deprecated
       * </pre>
       *
       * <code>repeated .hadoop.hdfs.EventProto events = 1;</code>
       */
      public Builder clearEvents() {
        if (eventsBuilder_ == null) {
          events_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          eventsBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       * deprecated
       * </pre>
       *
       * <code>repeated .hadoop.hdfs.EventProto events = 1;</code>
       */
      public Builder removeEvents(int index) {
        if (eventsBuilder_ == null) {
          ensureEventsIsMutable();
          events_.remove(index);
          onChanged();
        } else {
          eventsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       * deprecated
       * </pre>
       *
       * <code>repeated .hadoop.hdfs.EventProto events = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto.Builder getEventsBuilder(
          int index) {
        return getEventsFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       * deprecated
       * </pre>
       *
       * <code>repeated .hadoop.hdfs.EventProto events = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProtoOrBuilder getEventsOrBuilder(
          int index) {
        if (eventsBuilder_ == null) {
          return events_.get(index);  } else {
          return eventsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       * deprecated
       * </pre>
       *
       * <code>repeated .hadoop.hdfs.EventProto events = 1;</code>
       */
      public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProtoOrBuilder> 
           getEventsOrBuilderList() {
        if (eventsBuilder_ != null) {
          return eventsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(events_);
        }
      }
      /**
       * <pre>
       * deprecated
       * </pre>
       *
       * <code>repeated .hadoop.hdfs.EventProto events = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto.Builder addEventsBuilder() {
        return getEventsFieldBuilder().addBuilder(
            org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto.getDefaultInstance());
      }
      /**
       * <pre>
       * deprecated
       * </pre>
       *
       * <code>repeated .hadoop.hdfs.EventProto events = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto.Builder addEventsBuilder(
          int index) {
        return getEventsFieldBuilder().addBuilder(
            index, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto.getDefaultInstance());
      }
      /**
       * <pre>
       * deprecated
       * </pre>
       *
       * <code>repeated .hadoop.hdfs.EventProto events = 1;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto.Builder> 
           getEventsBuilderList() {
        return getEventsFieldBuilder().getBuilderList();
      }
      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto.Builder, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProtoOrBuilder> 
          getEventsFieldBuilder() {
        if (eventsBuilder_ == null) {
          eventsBuilder_ = new org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProto.Builder, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventProtoOrBuilder>(
                  events_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          events_ = null;
        }
        return eventsBuilder_;
      }

      private long firstTxid_ ;
      /**
       * <code>required int64 firstTxid = 2;</code>
       */
      public boolean hasFirstTxid() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required int64 firstTxid = 2;</code>
       */
      public long getFirstTxid() {
        return firstTxid_;
      }
      /**
       * <code>required int64 firstTxid = 2;</code>
       */
      public Builder setFirstTxid(long value) {
        bitField0_ |= 0x00000002;
        firstTxid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 firstTxid = 2;</code>
       */
      public Builder clearFirstTxid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        firstTxid_ = 0L;
        onChanged();
        return this;
      }

      private long lastTxid_ ;
      /**
       * <code>required int64 lastTxid = 3;</code>
       */
      public boolean hasLastTxid() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>required int64 lastTxid = 3;</code>
       */
      public long getLastTxid() {
        return lastTxid_;
      }
      /**
       * <code>required int64 lastTxid = 3;</code>
       */
      public Builder setLastTxid(long value) {
        bitField0_ |= 0x00000004;
        lastTxid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 lastTxid = 3;</code>
       */
      public Builder clearLastTxid() {
        bitField0_ = (bitField0_ & ~0x00000004);
        lastTxid_ = 0L;
        onChanged();
        return this;
      }

      private long syncTxid_ ;
      /**
       * <code>required int64 syncTxid = 4;</code>
       */
      public boolean hasSyncTxid() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>required int64 syncTxid = 4;</code>
       */
      public long getSyncTxid() {
        return syncTxid_;
      }
      /**
       * <code>required int64 syncTxid = 4;</code>
       */
      public Builder setSyncTxid(long value) {
        bitField0_ |= 0x00000008;
        syncTxid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 syncTxid = 4;</code>
       */
      public Builder clearSyncTxid() {
        bitField0_ = (bitField0_ & ~0x00000008);
        syncTxid_ = 0L;
        onChanged();
        return this;
      }

      private java.util.List<org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto> batch_ =
        java.util.Collections.emptyList();
      private void ensureBatchIsMutable() {
        if (!((bitField0_ & 0x00000010) != 0)) {
          batch_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto>(batch_);
          bitField0_ |= 0x00000010;
         }
      }

      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto.Builder, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProtoOrBuilder> batchBuilder_;

      /**
       * <code>repeated .hadoop.hdfs.EventBatchProto batch = 5;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto> getBatchList() {
        if (batchBuilder_ == null) {
          return java.util.Collections.unmodifiableList(batch_);
        } else {
          return batchBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.EventBatchProto batch = 5;</code>
       */
      public int getBatchCount() {
        if (batchBuilder_ == null) {
          return batch_.size();
        } else {
          return batchBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.EventBatchProto batch = 5;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto getBatch(int index) {
        if (batchBuilder_ == null) {
          return batch_.get(index);
        } else {
          return batchBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.EventBatchProto batch = 5;</code>
       */
      public Builder setBatch(
          int index, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto value) {
        if (batchBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBatchIsMutable();
          batch_.set(index, value);
          onChanged();
        } else {
          batchBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.EventBatchProto batch = 5;</code>
       */
      public Builder setBatch(
          int index, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto.Builder builderForValue) {
        if (batchBuilder_ == null) {
          ensureBatchIsMutable();
          batch_.set(index, builderForValue.build());
          onChanged();
        } else {
          batchBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.EventBatchProto batch = 5;</code>
       */
      public Builder addBatch(org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto value) {
        if (batchBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBatchIsMutable();
          batch_.add(value);
          onChanged();
        } else {
          batchBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.EventBatchProto batch = 5;</code>
       */
      public Builder addBatch(
          int index, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto value) {
        if (batchBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBatchIsMutable();
          batch_.add(index, value);
          onChanged();
        } else {
          batchBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.EventBatchProto batch = 5;</code>
       */
      public Builder addBatch(
          org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto.Builder builderForValue) {
        if (batchBuilder_ == null) {
          ensureBatchIsMutable();
          batch_.add(builderForValue.build());
          onChanged();
        } else {
          batchBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.EventBatchProto batch = 5;</code>
       */
      public Builder addBatch(
          int index, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto.Builder builderForValue) {
        if (batchBuilder_ == null) {
          ensureBatchIsMutable();
          batch_.add(index, builderForValue.build());
          onChanged();
        } else {
          batchBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.EventBatchProto batch = 5;</code>
       */
      public Builder addAllBatch(
          java.lang.Iterable<? extends org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto> values) {
        if (batchBuilder_ == null) {
          ensureBatchIsMutable();
          org.apache.hadoop.thirdparty.protobuf.AbstractMessageLite.Builder.addAll(
              values, batch_);
          onChanged();
        } else {
          batchBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.EventBatchProto batch = 5;</code>
       */
      public Builder clearBatch() {
        if (batchBuilder_ == null) {
          batch_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
          onChanged();
        } else {
          batchBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.EventBatchProto batch = 5;</code>
       */
      public Builder removeBatch(int index) {
        if (batchBuilder_ == null) {
          ensureBatchIsMutable();
          batch_.remove(index);
          onChanged();
        } else {
          batchBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.EventBatchProto batch = 5;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto.Builder getBatchBuilder(
          int index) {
        return getBatchFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.hdfs.EventBatchProto batch = 5;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProtoOrBuilder getBatchOrBuilder(
          int index) {
        if (batchBuilder_ == null) {
          return batch_.get(index);  } else {
          return batchBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.EventBatchProto batch = 5;</code>
       */
      public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProtoOrBuilder> 
           getBatchOrBuilderList() {
        if (batchBuilder_ != null) {
          return batchBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(batch_);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.EventBatchProto batch = 5;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto.Builder addBatchBuilder() {
        return getBatchFieldBuilder().addBuilder(
            org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.EventBatchProto batch = 5;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto.Builder addBatchBuilder(
          int index) {
        return getBatchFieldBuilder().addBuilder(
            index, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.EventBatchProto batch = 5;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto.Builder> 
           getBatchBuilderList() {
        return getBatchFieldBuilder().getBuilderList();
      }
      private org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
          org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto.Builder, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProtoOrBuilder> 
          getBatchFieldBuilder() {
        if (batchBuilder_ == null) {
          batchBuilder_ = new org.apache.hadoop.thirdparty.protobuf.RepeatedFieldBuilderV3<
              org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProto.Builder, org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventBatchProtoOrBuilder>(
                  batch_,
                  ((bitField0_ & 0x00000010) != 0),
                  getParentForChildren(),
                  isClean());
          batch_ = null;
        }
        return batchBuilder_;
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


      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.EventsListProto)
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.EventsListProto)
    private static final org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto();
    }

    public static org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hadoop.thirdparty.protobuf.Parser<EventsListProto>
        PARSER = new org.apache.hadoop.thirdparty.protobuf.AbstractParser<EventsListProto>() {
      @java.lang.Override
      public EventsListProto parsePartialFrom(
          org.apache.hadoop.thirdparty.protobuf.CodedInputStream input,
          org.apache.hadoop.thirdparty.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException {
        return new EventsListProto(input, extensionRegistry);
      }
    };

    public static org.apache.hadoop.thirdparty.protobuf.Parser<EventsListProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.thirdparty.protobuf.Parser<EventsListProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hdfs.protocol.proto.InotifyProtos.EventsListProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_EventProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_EventProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_EventBatchProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_EventBatchProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_CreateEventProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_CreateEventProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_CloseEventProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_CloseEventProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_TruncateEventProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_TruncateEventProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_AppendEventProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_AppendEventProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_RenameEventProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_RenameEventProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_MetadataUpdateEventProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_MetadataUpdateEventProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_UnlinkEventProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_UnlinkEventProto_fieldAccessorTable;
  private static final org.apache.hadoop.thirdparty.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_EventsListProto_descriptor;
  private static final 
    org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hadoop_hdfs_EventsListProto_fieldAccessorTable;

  public static org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.hadoop.thirdparty.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rinotify.proto\022\013hadoop.hdfs\032\tacl.proto\032" +
      "\013xattr.proto\"D\n\nEventProto\022$\n\004type\030\001 \002(\016" +
      "2\026.hadoop.hdfs.EventType\022\020\n\010contents\030\002 \002" +
      "(\014\"H\n\017EventBatchProto\022\014\n\004txid\030\001 \002(\003\022\'\n\006e" +
      "vents\030\002 \003(\0132\027.hadoop.hdfs.EventProto\"\234\002\n" +
      "\020CreateEventProto\022$\n\004type\030\001 \002(\0162\026.hadoop" +
      ".hdfs.INodeType\022\014\n\004path\030\002 \002(\t\022\r\n\005ctime\030\003" +
      " \002(\003\022\021\n\townerName\030\004 \002(\t\022\021\n\tgroupName\030\005 \002" +
      "(\t\022-\n\005perms\030\006 \002(\0132\036.hadoop.hdfs.FsPermis" +
      "sionProto\022\023\n\013replication\030\007 \001(\005\022\025\n\rsymlin" +
      "kTarget\030\010 \001(\t\022\021\n\toverwrite\030\t \001(\010\022\033\n\020defa" +
      "ultBlockSize\030\n \001(\003:\0010\022\024\n\014erasureCoded\030\013 " +
      "\001(\010\"D\n\017CloseEventProto\022\014\n\004path\030\001 \002(\t\022\020\n\010" +
      "fileSize\030\002 \002(\003\022\021\n\ttimestamp\030\003 \002(\003\"G\n\022Tru" +
      "ncateEventProto\022\014\n\004path\030\001 \002(\t\022\020\n\010fileSiz" +
      "e\030\002 \002(\003\022\021\n\ttimestamp\030\003 \002(\003\"9\n\020AppendEven" +
      "tProto\022\014\n\004path\030\001 \002(\t\022\027\n\010newBlock\030\002 \001(\010:\005" +
      "false\"H\n\020RenameEventProto\022\017\n\007srcPath\030\001 \002" +
      "(\t\022\020\n\010destPath\030\002 \002(\t\022\021\n\ttimestamp\030\003 \002(\003\"" +
      "\311\002\n\030MetadataUpdateEventProto\022\014\n\004path\030\001 \002" +
      "(\t\022-\n\004type\030\002 \002(\0162\037.hadoop.hdfs.MetadataU" +
      "pdateType\022\r\n\005mtime\030\003 \001(\003\022\r\n\005atime\030\004 \001(\003\022" +
      "\023\n\013replication\030\005 \001(\005\022\021\n\townerName\030\006 \001(\t\022" +
      "\021\n\tgroupName\030\007 \001(\t\022-\n\005perms\030\010 \001(\0132\036.hado" +
      "op.hdfs.FsPermissionProto\022(\n\004acls\030\t \003(\0132" +
      "\032.hadoop.hdfs.AclEntryProto\022\'\n\006xAttrs\030\n " +
      "\003(\0132\027.hadoop.hdfs.XAttrProto\022\025\n\rxAttrsRe" +
      "moved\030\013 \001(\010\"3\n\020UnlinkEventProto\022\014\n\004path\030" +
      "\001 \002(\t\022\021\n\ttimestamp\030\002 \002(\003\"\236\001\n\017EventsListP" +
      "roto\022\'\n\006events\030\001 \003(\0132\027.hadoop.hdfs.Event" +
      "Proto\022\021\n\tfirstTxid\030\002 \002(\003\022\020\n\010lastTxid\030\003 \002" +
      "(\003\022\020\n\010syncTxid\030\004 \002(\003\022+\n\005batch\030\005 \003(\0132\034.ha" +
      "doop.hdfs.EventBatchProto*\214\001\n\tEventType\022" +
      "\020\n\014EVENT_CREATE\020\000\022\017\n\013EVENT_CLOSE\020\001\022\020\n\014EV" +
      "ENT_APPEND\020\002\022\020\n\014EVENT_RENAME\020\003\022\022\n\016EVENT_" +
      "METADATA\020\004\022\020\n\014EVENT_UNLINK\020\005\022\022\n\016EVENT_TR" +
      "UNCATE\020\006*F\n\tINodeType\022\017\n\013I_TYPE_FILE\020\000\022\024" +
      "\n\020I_TYPE_DIRECTORY\020\001\022\022\n\016I_TYPE_SYMLINK\020\002" +
      "*\230\001\n\022MetadataUpdateType\022\023\n\017META_TYPE_TIM" +
      "ES\020\000\022\031\n\025META_TYPE_REPLICATION\020\001\022\023\n\017META_" +
      "TYPE_OWNER\020\002\022\023\n\017META_TYPE_PERMS\020\003\022\022\n\016MET" +
      "A_TYPE_ACLS\020\004\022\024\n\020META_TYPE_XATTRS\020\005B9\n%o" +
      "rg.apache.hadoop.hdfs.protocol.protoB\rIn" +
      "otifyProtos\240\001\001"
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
    internal_static_hadoop_hdfs_EventProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hadoop_hdfs_EventProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_EventProto_descriptor,
        new java.lang.String[] { "Type", "Contents", });
    internal_static_hadoop_hdfs_EventBatchProto_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hadoop_hdfs_EventBatchProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_EventBatchProto_descriptor,
        new java.lang.String[] { "Txid", "Events", });
    internal_static_hadoop_hdfs_CreateEventProto_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_hadoop_hdfs_CreateEventProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_CreateEventProto_descriptor,
        new java.lang.String[] { "Type", "Path", "Ctime", "OwnerName", "GroupName", "Perms", "Replication", "SymlinkTarget", "Overwrite", "DefaultBlockSize", "ErasureCoded", });
    internal_static_hadoop_hdfs_CloseEventProto_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_hadoop_hdfs_CloseEventProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_CloseEventProto_descriptor,
        new java.lang.String[] { "Path", "FileSize", "Timestamp", });
    internal_static_hadoop_hdfs_TruncateEventProto_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_hadoop_hdfs_TruncateEventProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_TruncateEventProto_descriptor,
        new java.lang.String[] { "Path", "FileSize", "Timestamp", });
    internal_static_hadoop_hdfs_AppendEventProto_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_hadoop_hdfs_AppendEventProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_AppendEventProto_descriptor,
        new java.lang.String[] { "Path", "NewBlock", });
    internal_static_hadoop_hdfs_RenameEventProto_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_hadoop_hdfs_RenameEventProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_RenameEventProto_descriptor,
        new java.lang.String[] { "SrcPath", "DestPath", "Timestamp", });
    internal_static_hadoop_hdfs_MetadataUpdateEventProto_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_hadoop_hdfs_MetadataUpdateEventProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_MetadataUpdateEventProto_descriptor,
        new java.lang.String[] { "Path", "Type", "Mtime", "Atime", "Replication", "OwnerName", "GroupName", "Perms", "Acls", "XAttrs", "XAttrsRemoved", });
    internal_static_hadoop_hdfs_UnlinkEventProto_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_hadoop_hdfs_UnlinkEventProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_UnlinkEventProto_descriptor,
        new java.lang.String[] { "Path", "Timestamp", });
    internal_static_hadoop_hdfs_EventsListProto_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_hadoop_hdfs_EventsListProto_fieldAccessorTable = new
      org.apache.hadoop.thirdparty.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hadoop_hdfs_EventsListProto_descriptor,
        new java.lang.String[] { "Events", "FirstTxid", "LastTxid", "SyncTxid", "Batch", });
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.getDescriptor();
    org.apache.hadoop.hdfs.protocol.proto.XAttrProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
