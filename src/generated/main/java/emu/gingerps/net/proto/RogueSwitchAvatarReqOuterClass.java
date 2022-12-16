// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RogueSwitchAvatarReq.proto

package emu.gingerps.net.proto;

public final class RogueSwitchAvatarReqOuterClass {
  private RogueSwitchAvatarReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RogueSwitchAvatarReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RogueSwitchAvatarReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint64 onstage_avatar_guid_list = 8;</code>
     * @return A list containing the onstageAvatarGuidList.
     */
    java.util.List<java.lang.Long> getOnstageAvatarGuidListList();
    /**
     * <code>repeated uint64 onstage_avatar_guid_list = 8;</code>
     * @return The count of onstageAvatarGuidList.
     */
    int getOnstageAvatarGuidListCount();
    /**
     * <code>repeated uint64 onstage_avatar_guid_list = 8;</code>
     * @param index The index of the element to return.
     * @return The onstageAvatarGuidList at the given index.
     */
    long getOnstageAvatarGuidList(int index);

    /**
     * <code>uint32 dungeon_id = 10;</code>
     * @return The dungeonId.
     */
    int getDungeonId();

    /**
     * <code>uint32 cell_id = 11;</code>
     * @return The cellId.
     */
    int getCellId();

    /**
     * <code>uint64 cur_avatar_guid = 4;</code>
     * @return The curAvatarGuid.
     */
    long getCurAvatarGuid();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8399;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code RogueSwitchAvatarReq}
   */
  public static final class RogueSwitchAvatarReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RogueSwitchAvatarReq)
      RogueSwitchAvatarReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RogueSwitchAvatarReq.newBuilder() to construct.
    private RogueSwitchAvatarReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RogueSwitchAvatarReq() {
      onstageAvatarGuidList_ = emptyLongList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RogueSwitchAvatarReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RogueSwitchAvatarReq(
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
            case 32: {

              curAvatarGuid_ = input.readUInt64();
              break;
            }
            case 64: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                onstageAvatarGuidList_ = newLongList();
                mutable_bitField0_ |= 0x00000001;
              }
              onstageAvatarGuidList_.addLong(input.readUInt64());
              break;
            }
            case 66: {
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
            case 80: {

              dungeonId_ = input.readUInt32();
              break;
            }
            case 88: {

              cellId_ = input.readUInt32();
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          onstageAvatarGuidList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.internal_static_RogueSwitchAvatarReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.internal_static_RogueSwitchAvatarReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq.class, emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq.Builder.class);
    }

    public static final int ONSTAGE_AVATAR_GUID_LIST_FIELD_NUMBER = 8;
    private com.google.protobuf.Internal.LongList onstageAvatarGuidList_;
    /**
     * <code>repeated uint64 onstage_avatar_guid_list = 8;</code>
     * @return A list containing the onstageAvatarGuidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Long>
        getOnstageAvatarGuidListList() {
      return onstageAvatarGuidList_;
    }
    /**
     * <code>repeated uint64 onstage_avatar_guid_list = 8;</code>
     * @return The count of onstageAvatarGuidList.
     */
    public int getOnstageAvatarGuidListCount() {
      return onstageAvatarGuidList_.size();
    }
    /**
     * <code>repeated uint64 onstage_avatar_guid_list = 8;</code>
     * @param index The index of the element to return.
     * @return The onstageAvatarGuidList at the given index.
     */
    public long getOnstageAvatarGuidList(int index) {
      return onstageAvatarGuidList_.getLong(index);
    }
    private int onstageAvatarGuidListMemoizedSerializedSize = -1;

    public static final int DUNGEON_ID_FIELD_NUMBER = 10;
    private int dungeonId_;
    /**
     * <code>uint32 dungeon_id = 10;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
    }

    public static final int CELL_ID_FIELD_NUMBER = 11;
    private int cellId_;
    /**
     * <code>uint32 cell_id = 11;</code>
     * @return The cellId.
     */
    @java.lang.Override
    public int getCellId() {
      return cellId_;
    }

    public static final int CUR_AVATAR_GUID_FIELD_NUMBER = 4;
    private long curAvatarGuid_;
    /**
     * <code>uint64 cur_avatar_guid = 4;</code>
     * @return The curAvatarGuid.
     */
    @java.lang.Override
    public long getCurAvatarGuid() {
      return curAvatarGuid_;
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
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (curAvatarGuid_ != 0L) {
        output.writeUInt64(4, curAvatarGuid_);
      }
      if (getOnstageAvatarGuidListList().size() > 0) {
        output.writeUInt32NoTag(66);
        output.writeUInt32NoTag(onstageAvatarGuidListMemoizedSerializedSize);
      }
      for (int i = 0; i < onstageAvatarGuidList_.size(); i++) {
        output.writeUInt64NoTag(onstageAvatarGuidList_.getLong(i));
      }
      if (dungeonId_ != 0) {
        output.writeUInt32(10, dungeonId_);
      }
      if (cellId_ != 0) {
        output.writeUInt32(11, cellId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (curAvatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, curAvatarGuid_);
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
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, dungeonId_);
      }
      if (cellId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, cellId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq other = (emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq) obj;

      if (!getOnstageAvatarGuidListList()
          .equals(other.getOnstageAvatarGuidListList())) return false;
      if (getDungeonId()
          != other.getDungeonId()) return false;
      if (getCellId()
          != other.getCellId()) return false;
      if (getCurAvatarGuid()
          != other.getCurAvatarGuid()) return false;
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
      if (getOnstageAvatarGuidListCount() > 0) {
        hash = (37 * hash) + ONSTAGE_AVATAR_GUID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getOnstageAvatarGuidListList().hashCode();
      }
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (37 * hash) + CELL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCellId();
      hash = (37 * hash) + CUR_AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCurAvatarGuid());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq prototype) {
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
     *   CMD_ID = 8399;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code RogueSwitchAvatarReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RogueSwitchAvatarReq)
        emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.internal_static_RogueSwitchAvatarReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.internal_static_RogueSwitchAvatarReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq.class, emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq.newBuilder()
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
        onstageAvatarGuidList_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
        dungeonId_ = 0;

        cellId_ = 0;

        curAvatarGuid_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.internal_static_RogueSwitchAvatarReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq build() {
        emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq buildPartial() {
        emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq result = new emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          onstageAvatarGuidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.onstageAvatarGuidList_ = onstageAvatarGuidList_;
        result.dungeonId_ = dungeonId_;
        result.cellId_ = cellId_;
        result.curAvatarGuid_ = curAvatarGuid_;
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
        if (other instanceof emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq) {
          return mergeFrom((emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq other) {
        if (other == emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq.getDefaultInstance()) return this;
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
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
        }
        if (other.getCellId() != 0) {
          setCellId(other.getCellId());
        }
        if (other.getCurAvatarGuid() != 0L) {
          setCurAvatarGuid(other.getCurAvatarGuid());
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
        emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.LongList onstageAvatarGuidList_ = emptyLongList();
      private void ensureOnstageAvatarGuidListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          onstageAvatarGuidList_ = mutableCopy(onstageAvatarGuidList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint64 onstage_avatar_guid_list = 8;</code>
       * @return A list containing the onstageAvatarGuidList.
       */
      public java.util.List<java.lang.Long>
          getOnstageAvatarGuidListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(onstageAvatarGuidList_) : onstageAvatarGuidList_;
      }
      /**
       * <code>repeated uint64 onstage_avatar_guid_list = 8;</code>
       * @return The count of onstageAvatarGuidList.
       */
      public int getOnstageAvatarGuidListCount() {
        return onstageAvatarGuidList_.size();
      }
      /**
       * <code>repeated uint64 onstage_avatar_guid_list = 8;</code>
       * @param index The index of the element to return.
       * @return The onstageAvatarGuidList at the given index.
       */
      public long getOnstageAvatarGuidList(int index) {
        return onstageAvatarGuidList_.getLong(index);
      }
      /**
       * <code>repeated uint64 onstage_avatar_guid_list = 8;</code>
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
       * <code>repeated uint64 onstage_avatar_guid_list = 8;</code>
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
       * <code>repeated uint64 onstage_avatar_guid_list = 8;</code>
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
       * <code>repeated uint64 onstage_avatar_guid_list = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearOnstageAvatarGuidList() {
        onstageAvatarGuidList_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeon_id = 10;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeon_id = 10;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        
        dungeonId_ = 0;
        onChanged();
        return this;
      }

      private int cellId_ ;
      /**
       * <code>uint32 cell_id = 11;</code>
       * @return The cellId.
       */
      @java.lang.Override
      public int getCellId() {
        return cellId_;
      }
      /**
       * <code>uint32 cell_id = 11;</code>
       * @param value The cellId to set.
       * @return This builder for chaining.
       */
      public Builder setCellId(int value) {
        
        cellId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cell_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearCellId() {
        
        cellId_ = 0;
        onChanged();
        return this;
      }

      private long curAvatarGuid_ ;
      /**
       * <code>uint64 cur_avatar_guid = 4;</code>
       * @return The curAvatarGuid.
       */
      @java.lang.Override
      public long getCurAvatarGuid() {
        return curAvatarGuid_;
      }
      /**
       * <code>uint64 cur_avatar_guid = 4;</code>
       * @param value The curAvatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setCurAvatarGuid(long value) {
        
        curAvatarGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 cur_avatar_guid = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurAvatarGuid() {
        
        curAvatarGuid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:RogueSwitchAvatarReq)
    }

    // @@protoc_insertion_point(class_scope:RogueSwitchAvatarReq)
    private static final emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq();
    }

    public static emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RogueSwitchAvatarReq>
        PARSER = new com.google.protobuf.AbstractParser<RogueSwitchAvatarReq>() {
      @java.lang.Override
      public RogueSwitchAvatarReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RogueSwitchAvatarReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RogueSwitchAvatarReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RogueSwitchAvatarReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.RogueSwitchAvatarReqOuterClass.RogueSwitchAvatarReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RogueSwitchAvatarReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RogueSwitchAvatarReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032RogueSwitchAvatarReq.proto\"v\n\024RogueSwi" +
      "tchAvatarReq\022 \n\030onstage_avatar_guid_list" +
      "\030\010 \003(\004\022\022\n\ndungeon_id\030\n \001(\r\022\017\n\007cell_id\030\013 " +
      "\001(\r\022\027\n\017cur_avatar_guid\030\004 \001(\004B\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RogueSwitchAvatarReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RogueSwitchAvatarReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RogueSwitchAvatarReq_descriptor,
        new java.lang.String[] { "OnstageAvatarGuidList", "DungeonId", "CellId", "CurAvatarGuid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
