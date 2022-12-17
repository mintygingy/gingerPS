// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RoguelikeSelectAvatarAndEnterDungeonReq.proto

package emu.gingerps.net.proto;

public final class RoguelikeSelectAvatarAndEnterDungeonReqOuterClass {
  private RoguelikeSelectAvatarAndEnterDungeonReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RoguelikeSelectAvatarAndEnterDungeonReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RoguelikeSelectAvatarAndEnterDungeonReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 stage_id = 1;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>repeated uint64 onstage_avatar_guid_list = 12;</code>
     * @return A list containing the onstageAvatarGuidList.
     */
    java.util.List<java.lang.Long> getOnstageAvatarGuidListList();
    /**
     * <code>repeated uint64 onstage_avatar_guid_list = 12;</code>
     * @return The count of onstageAvatarGuidList.
     */
    int getOnstageAvatarGuidListCount();
    /**
     * <code>repeated uint64 onstage_avatar_guid_list = 12;</code>
     * @param index The index of the element to return.
     * @return The onstageAvatarGuidList at the given index.
     */
    long getOnstageAvatarGuidList(int index);

    /**
     * <code>repeated uint64 backstage_avatar_guid_list = 4;</code>
     * @return A list containing the backstageAvatarGuidList.
     */
    java.util.List<java.lang.Long> getBackstageAvatarGuidListList();
    /**
     * <code>repeated uint64 backstage_avatar_guid_list = 4;</code>
     * @return The count of backstageAvatarGuidList.
     */
    int getBackstageAvatarGuidListCount();
    /**
     * <code>repeated uint64 backstage_avatar_guid_list = 4;</code>
     * @param index The index of the element to return.
     * @return The backstageAvatarGuidList at the given index.
     */
    long getBackstageAvatarGuidList(int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8988;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code RoguelikeSelectAvatarAndEnterDungeonReq}
   */
  public static final class RoguelikeSelectAvatarAndEnterDungeonReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RoguelikeSelectAvatarAndEnterDungeonReq)
      RoguelikeSelectAvatarAndEnterDungeonReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RoguelikeSelectAvatarAndEnterDungeonReq.newBuilder() to construct.
    private RoguelikeSelectAvatarAndEnterDungeonReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RoguelikeSelectAvatarAndEnterDungeonReq() {
      onstageAvatarGuidList_ = emptyLongList();
      backstageAvatarGuidList_ = emptyLongList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RoguelikeSelectAvatarAndEnterDungeonReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RoguelikeSelectAvatarAndEnterDungeonReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              stageId_ = input.readUInt32();
              break;
            }
            case 32: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                backstageAvatarGuidList_ = newLongList();
                mutable_bitField0_ |= 0x00000002;
              }
              backstageAvatarGuidList_.addLong(input.readUInt64());
              break;
            }
            case 34: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                backstageAvatarGuidList_ = newLongList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                backstageAvatarGuidList_.addLong(input.readUInt64());
              }
              input.popLimit(limit);
              break;
            }
            case 96: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                onstageAvatarGuidList_ = newLongList();
                mutable_bitField0_ |= 0x00000001;
              }
              onstageAvatarGuidList_.addLong(input.readUInt64());
              break;
            }
            case 98: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                onstageAvatarGuidList_ = newLongList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                onstageAvatarGuidList_.addLong(input.readUInt64());
              }
              input.popLimit(limit);
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
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          backstageAvatarGuidList_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          onstageAvatarGuidList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.internal_static_RoguelikeSelectAvatarAndEnterDungeonReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.internal_static_RoguelikeSelectAvatarAndEnterDungeonReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq.class, emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq.Builder.class);
    }

    public static final int STAGE_ID_FIELD_NUMBER = 1;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 1;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int ONSTAGE_AVATAR_GUID_LIST_FIELD_NUMBER = 12;
    private com.google.protobuf.Internal.LongList onstageAvatarGuidList_;
    /**
     * <code>repeated uint64 onstage_avatar_guid_list = 12;</code>
     * @return A list containing the onstageAvatarGuidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Long>
        getOnstageAvatarGuidListList() {
      return onstageAvatarGuidList_;
    }
    /**
     * <code>repeated uint64 onstage_avatar_guid_list = 12;</code>
     * @return The count of onstageAvatarGuidList.
     */
    public int getOnstageAvatarGuidListCount() {
      return onstageAvatarGuidList_.size();
    }
    /**
     * <code>repeated uint64 onstage_avatar_guid_list = 12;</code>
     * @param index The index of the element to return.
     * @return The onstageAvatarGuidList at the given index.
     */
    public long getOnstageAvatarGuidList(int index) {
      return onstageAvatarGuidList_.getLong(index);
    }
    private int onstageAvatarGuidListMemoizedSerializedSize = -1;

    public static final int BACKSTAGE_AVATAR_GUID_LIST_FIELD_NUMBER = 4;
    private com.google.protobuf.Internal.LongList backstageAvatarGuidList_;
    /**
     * <code>repeated uint64 backstage_avatar_guid_list = 4;</code>
     * @return A list containing the backstageAvatarGuidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Long>
        getBackstageAvatarGuidListList() {
      return backstageAvatarGuidList_;
    }
    /**
     * <code>repeated uint64 backstage_avatar_guid_list = 4;</code>
     * @return The count of backstageAvatarGuidList.
     */
    public int getBackstageAvatarGuidListCount() {
      return backstageAvatarGuidList_.size();
    }
    /**
     * <code>repeated uint64 backstage_avatar_guid_list = 4;</code>
     * @param index The index of the element to return.
     * @return The backstageAvatarGuidList at the given index.
     */
    public long getBackstageAvatarGuidList(int index) {
      return backstageAvatarGuidList_.getLong(index);
    }
    private int backstageAvatarGuidListMemoizedSerializedSize = -1;

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
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (stageId_ != 0) {
        output.writeUInt32(1, stageId_);
      }
      if (getBackstageAvatarGuidListList().size() > 0) {
        output.writeUInt32NoTag(34);
        output.writeUInt32NoTag(backstageAvatarGuidListMemoizedSerializedSize);
      }
      for (int i = 0; i < backstageAvatarGuidList_.size(); i++) {
        output.writeUInt64NoTag(backstageAvatarGuidList_.getLong(i));
      }
      if (getOnstageAvatarGuidListList().size() > 0) {
        output.writeUInt32NoTag(98);
        output.writeUInt32NoTag(onstageAvatarGuidListMemoizedSerializedSize);
      }
      for (int i = 0; i < onstageAvatarGuidList_.size(); i++) {
        output.writeUInt64NoTag(onstageAvatarGuidList_.getLong(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, stageId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < backstageAvatarGuidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(backstageAvatarGuidList_.getLong(i));
        }
        size += dataSize;
        if (!getBackstageAvatarGuidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        backstageAvatarGuidListMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < onstageAvatarGuidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(onstageAvatarGuidList_.getLong(i));
        }
        size += dataSize;
        if (!getOnstageAvatarGuidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        onstageAvatarGuidListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq other = (emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq) obj;

      if (getStageId()
          != other.getStageId()) return false;
      if (!getOnstageAvatarGuidListList()
          .equals(other.getOnstageAvatarGuidListList())) return false;
      if (!getBackstageAvatarGuidListList()
          .equals(other.getBackstageAvatarGuidListList())) return false;
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
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      if (getOnstageAvatarGuidListCount() > 0) {
        hash = (37 * hash) + ONSTAGE_AVATAR_GUID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getOnstageAvatarGuidListList().hashCode();
      }
      if (getBackstageAvatarGuidListCount() > 0) {
        hash = (37 * hash) + BACKSTAGE_AVATAR_GUID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getBackstageAvatarGuidListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * enum CmdId {
     *   option allow_alias = true;
     *   NONE = 0;
     *   CMD_ID = 8988;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code RoguelikeSelectAvatarAndEnterDungeonReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RoguelikeSelectAvatarAndEnterDungeonReq)
        emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.internal_static_RoguelikeSelectAvatarAndEnterDungeonReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.internal_static_RoguelikeSelectAvatarAndEnterDungeonReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq.class, emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        stageId_ = 0;

        onstageAvatarGuidList_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
        backstageAvatarGuidList_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.internal_static_RoguelikeSelectAvatarAndEnterDungeonReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq build() {
        emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq buildPartial() {
        emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq result = new emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq(this);
        int from_bitField0_ = bitField0_;
        result.stageId_ = stageId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          onstageAvatarGuidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.onstageAvatarGuidList_ = onstageAvatarGuidList_;
        if (((bitField0_ & 0x00000002) != 0)) {
          backstageAvatarGuidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.backstageAvatarGuidList_ = backstageAvatarGuidList_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq) {
          return mergeFrom((emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq other) {
        if (other == emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq.getDefaultInstance()) return this;
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (!other.onstageAvatarGuidList_.isEmpty()) {
          if (onstageAvatarGuidList_.isEmpty()) {
            onstageAvatarGuidList_ = other.onstageAvatarGuidList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOnstageAvatarGuidListIsMutable();
            onstageAvatarGuidList_.addAll(other.onstageAvatarGuidList_);
          }
          onChanged();
        }
        if (!other.backstageAvatarGuidList_.isEmpty()) {
          if (backstageAvatarGuidList_.isEmpty()) {
            backstageAvatarGuidList_ = other.backstageAvatarGuidList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureBackstageAvatarGuidListIsMutable();
            backstageAvatarGuidList_.addAll(other.backstageAvatarGuidList_);
          }
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
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 1;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 1;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.LongList onstageAvatarGuidList_ = emptyLongList();
      private void ensureOnstageAvatarGuidListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          onstageAvatarGuidList_ = mutableCopy(onstageAvatarGuidList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint64 onstage_avatar_guid_list = 12;</code>
       * @return A list containing the onstageAvatarGuidList.
       */
      public java.util.List<java.lang.Long>
          getOnstageAvatarGuidListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(onstageAvatarGuidList_) : onstageAvatarGuidList_;
      }
      /**
       * <code>repeated uint64 onstage_avatar_guid_list = 12;</code>
       * @return The count of onstageAvatarGuidList.
       */
      public int getOnstageAvatarGuidListCount() {
        return onstageAvatarGuidList_.size();
      }
      /**
       * <code>repeated uint64 onstage_avatar_guid_list = 12;</code>
       * @param index The index of the element to return.
       * @return The onstageAvatarGuidList at the given index.
       */
      public long getOnstageAvatarGuidList(int index) {
        return onstageAvatarGuidList_.getLong(index);
      }
      /**
       * <code>repeated uint64 onstage_avatar_guid_list = 12;</code>
       * @param index The index to set the value at.
       * @param value The onstageAvatarGuidList to set.
       * @return This builder for chaining.
       */
      public Builder setOnstageAvatarGuidList(
          int index, long value) {
        ensureOnstageAvatarGuidListIsMutable();
        onstageAvatarGuidList_.setLong(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 onstage_avatar_guid_list = 12;</code>
       * @param value The onstageAvatarGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addOnstageAvatarGuidList(long value) {
        ensureOnstageAvatarGuidListIsMutable();
        onstageAvatarGuidList_.addLong(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 onstage_avatar_guid_list = 12;</code>
       * @param values The onstageAvatarGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllOnstageAvatarGuidList(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureOnstageAvatarGuidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, onstageAvatarGuidList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 onstage_avatar_guid_list = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearOnstageAvatarGuidList() {
        onstageAvatarGuidList_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.LongList backstageAvatarGuidList_ = emptyLongList();
      private void ensureBackstageAvatarGuidListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          backstageAvatarGuidList_ = mutableCopy(backstageAvatarGuidList_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint64 backstage_avatar_guid_list = 4;</code>
       * @return A list containing the backstageAvatarGuidList.
       */
      public java.util.List<java.lang.Long>
          getBackstageAvatarGuidListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(backstageAvatarGuidList_) : backstageAvatarGuidList_;
      }
      /**
       * <code>repeated uint64 backstage_avatar_guid_list = 4;</code>
       * @return The count of backstageAvatarGuidList.
       */
      public int getBackstageAvatarGuidListCount() {
        return backstageAvatarGuidList_.size();
      }
      /**
       * <code>repeated uint64 backstage_avatar_guid_list = 4;</code>
       * @param index The index of the element to return.
       * @return The backstageAvatarGuidList at the given index.
       */
      public long getBackstageAvatarGuidList(int index) {
        return backstageAvatarGuidList_.getLong(index);
      }
      /**
       * <code>repeated uint64 backstage_avatar_guid_list = 4;</code>
       * @param index The index to set the value at.
       * @param value The backstageAvatarGuidList to set.
       * @return This builder for chaining.
       */
      public Builder setBackstageAvatarGuidList(
          int index, long value) {
        ensureBackstageAvatarGuidListIsMutable();
        backstageAvatarGuidList_.setLong(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 backstage_avatar_guid_list = 4;</code>
       * @param value The backstageAvatarGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addBackstageAvatarGuidList(long value) {
        ensureBackstageAvatarGuidListIsMutable();
        backstageAvatarGuidList_.addLong(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 backstage_avatar_guid_list = 4;</code>
       * @param values The backstageAvatarGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllBackstageAvatarGuidList(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureBackstageAvatarGuidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, backstageAvatarGuidList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 backstage_avatar_guid_list = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearBackstageAvatarGuidList() {
        backstageAvatarGuidList_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:RoguelikeSelectAvatarAndEnterDungeonReq)
    }

    // @@protoc_insertion_point(class_scope:RoguelikeSelectAvatarAndEnterDungeonReq)
    private static final emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq();
    }

    public static emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RoguelikeSelectAvatarAndEnterDungeonReq>
        PARSER = new com.google.protobuf.AbstractParser<RoguelikeSelectAvatarAndEnterDungeonReq>() {
      @java.lang.Override
      public RoguelikeSelectAvatarAndEnterDungeonReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RoguelikeSelectAvatarAndEnterDungeonReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RoguelikeSelectAvatarAndEnterDungeonReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RoguelikeSelectAvatarAndEnterDungeonReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RoguelikeSelectAvatarAndEnterDungeonReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RoguelikeSelectAvatarAndEnterDungeonReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-RoguelikeSelectAvatarAndEnterDungeonRe" +
      "q.proto\"\201\001\n\'RoguelikeSelectAvatarAndEnte" +
      "rDungeonReq\022\020\n\010stage_id\030\001 \001(\r\022 \n\030onstage" +
      "_avatar_guid_list\030\014 \003(\004\022\"\n\032backstage_ava" +
      "tar_guid_list\030\004 \003(\004B\030\n\026emu.gingerps.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RoguelikeSelectAvatarAndEnterDungeonReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RoguelikeSelectAvatarAndEnterDungeonReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RoguelikeSelectAvatarAndEnterDungeonReq_descriptor,
        new java.lang.String[] { "StageId", "OnstageAvatarGuidList", "BackstageAvatarGuidList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
