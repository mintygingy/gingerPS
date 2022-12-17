// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientGadgetInfo.proto

package emu.gingerps.net.proto;

public final class ClientGadgetInfoOuterClass {
  private ClientGadgetInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ClientGadgetInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ClientGadgetInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 camp_id = 1;</code>
     * @return The campId.
     */
    int getCampId();

    /**
     * <code>uint32 camp_type = 2;</code>
     * @return The campType.
     */
    int getCampType();

    /**
     * <code>uint64 guid = 3;</code>
     * @return The guid.
     */
    long getGuid();

    /**
     * <code>uint32 owner_entity_id = 4;</code>
     * @return The ownerEntityId.
     */
    int getOwnerEntityId();

    /**
     * <code>uint32 target_entity_id = 5;</code>
     * @return The targetEntityId.
     */
    int getTargetEntityId();

    /**
     * <code>bool async_load = 6;</code>
     * @return The asyncLoad.
     */
    boolean getAsyncLoad();

    /**
     * <code>bool is_peer_id_from_player = 7;</code>
     * @return The isPeerIdFromPlayer.
     */
    boolean getIsPeerIdFromPlayer();

    /**
     * <code>repeated uint32 target_entity_id_list = 8;</code>
     * @return A list containing the targetEntityIdList.
     */
    java.util.List<java.lang.Integer> getTargetEntityIdListList();
    /**
     * <code>repeated uint32 target_entity_id_list = 8;</code>
     * @return The count of targetEntityIdList.
     */
    int getTargetEntityIdListCount();
    /**
     * <code>repeated uint32 target_entity_id_list = 8;</code>
     * @param index The index of the element to return.
     * @return The targetEntityIdList at the given index.
     */
    int getTargetEntityIdList(int index);
  }
  /**
   * Protobuf type {@code ClientGadgetInfo}
   */
  public static final class ClientGadgetInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ClientGadgetInfo)
      ClientGadgetInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ClientGadgetInfo.newBuilder() to construct.
    private ClientGadgetInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ClientGadgetInfo() {
      targetEntityIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ClientGadgetInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.ClientGadgetInfoOuterClass.internal_static_ClientGadgetInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.ClientGadgetInfoOuterClass.internal_static_ClientGadgetInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo.class, emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo.Builder.class);
    }

    public static final int CAMP_ID_FIELD_NUMBER = 1;
    private int campId_ = 0;
    /**
     * <code>uint32 camp_id = 1;</code>
     * @return The campId.
     */
    @java.lang.Override
    public int getCampId() {
      return campId_;
    }

    public static final int CAMP_TYPE_FIELD_NUMBER = 2;
    private int campType_ = 0;
    /**
     * <code>uint32 camp_type = 2;</code>
     * @return The campType.
     */
    @java.lang.Override
    public int getCampType() {
      return campType_;
    }

    public static final int GUID_FIELD_NUMBER = 3;
    private long guid_ = 0L;
    /**
     * <code>uint64 guid = 3;</code>
     * @return The guid.
     */
    @java.lang.Override
    public long getGuid() {
      return guid_;
    }

    public static final int OWNER_ENTITY_ID_FIELD_NUMBER = 4;
    private int ownerEntityId_ = 0;
    /**
     * <code>uint32 owner_entity_id = 4;</code>
     * @return The ownerEntityId.
     */
    @java.lang.Override
    public int getOwnerEntityId() {
      return ownerEntityId_;
    }

    public static final int TARGET_ENTITY_ID_FIELD_NUMBER = 5;
    private int targetEntityId_ = 0;
    /**
     * <code>uint32 target_entity_id = 5;</code>
     * @return The targetEntityId.
     */
    @java.lang.Override
    public int getTargetEntityId() {
      return targetEntityId_;
    }

    public static final int ASYNC_LOAD_FIELD_NUMBER = 6;
    private boolean asyncLoad_ = false;
    /**
     * <code>bool async_load = 6;</code>
     * @return The asyncLoad.
     */
    @java.lang.Override
    public boolean getAsyncLoad() {
      return asyncLoad_;
    }

    public static final int IS_PEER_ID_FROM_PLAYER_FIELD_NUMBER = 7;
    private boolean isPeerIdFromPlayer_ = false;
    /**
     * <code>bool is_peer_id_from_player = 7;</code>
     * @return The isPeerIdFromPlayer.
     */
    @java.lang.Override
    public boolean getIsPeerIdFromPlayer() {
      return isPeerIdFromPlayer_;
    }

    public static final int TARGET_ENTITY_ID_LIST_FIELD_NUMBER = 8;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList targetEntityIdList_;
    /**
     * <code>repeated uint32 target_entity_id_list = 8;</code>
     * @return A list containing the targetEntityIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getTargetEntityIdListList() {
      return targetEntityIdList_;
    }
    /**
     * <code>repeated uint32 target_entity_id_list = 8;</code>
     * @return The count of targetEntityIdList.
     */
    public int getTargetEntityIdListCount() {
      return targetEntityIdList_.size();
    }
    /**
     * <code>repeated uint32 target_entity_id_list = 8;</code>
     * @param index The index of the element to return.
     * @return The targetEntityIdList at the given index.
     */
    public int getTargetEntityIdList(int index) {
      return targetEntityIdList_.getInt(index);
    }
    private int targetEntityIdListMemoizedSerializedSize = -1;

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
      if (campId_ != 0) {
        output.writeUInt32(1, campId_);
      }
      if (campType_ != 0) {
        output.writeUInt32(2, campType_);
      }
      if (guid_ != 0L) {
        output.writeUInt64(3, guid_);
      }
      if (ownerEntityId_ != 0) {
        output.writeUInt32(4, ownerEntityId_);
      }
      if (targetEntityId_ != 0) {
        output.writeUInt32(5, targetEntityId_);
      }
      if (asyncLoad_ != false) {
        output.writeBool(6, asyncLoad_);
      }
      if (isPeerIdFromPlayer_ != false) {
        output.writeBool(7, isPeerIdFromPlayer_);
      }
      if (getTargetEntityIdListList().size() > 0) {
        output.writeUInt32NoTag(66);
        output.writeUInt32NoTag(targetEntityIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < targetEntityIdList_.size(); i++) {
        output.writeUInt32NoTag(targetEntityIdList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (campId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, campId_);
      }
      if (campType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, campType_);
      }
      if (guid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, guid_);
      }
      if (ownerEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, ownerEntityId_);
      }
      if (targetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, targetEntityId_);
      }
      if (asyncLoad_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, asyncLoad_);
      }
      if (isPeerIdFromPlayer_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isPeerIdFromPlayer_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < targetEntityIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(targetEntityIdList_.getInt(i));
        }
        size += dataSize;
        if (!getTargetEntityIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        targetEntityIdListMemoizedSerializedSize = dataSize;
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo other = (emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo) obj;

      if (getCampId()
          != other.getCampId()) return false;
      if (getCampType()
          != other.getCampType()) return false;
      if (getGuid()
          != other.getGuid()) return false;
      if (getOwnerEntityId()
          != other.getOwnerEntityId()) return false;
      if (getTargetEntityId()
          != other.getTargetEntityId()) return false;
      if (getAsyncLoad()
          != other.getAsyncLoad()) return false;
      if (getIsPeerIdFromPlayer()
          != other.getIsPeerIdFromPlayer()) return false;
      if (!getTargetEntityIdListList()
          .equals(other.getTargetEntityIdListList())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + CAMP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCampId();
      hash = (37 * hash) + CAMP_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getCampType();
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getGuid());
      hash = (37 * hash) + OWNER_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getOwnerEntityId();
      hash = (37 * hash) + TARGET_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetEntityId();
      hash = (37 * hash) + ASYNC_LOAD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getAsyncLoad());
      hash = (37 * hash) + IS_PEER_ID_FROM_PLAYER_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsPeerIdFromPlayer());
      if (getTargetEntityIdListCount() > 0) {
        hash = (37 * hash) + TARGET_ENTITY_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getTargetEntityIdListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo prototype) {
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
     * Protobuf type {@code ClientGadgetInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ClientGadgetInfo)
        emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.ClientGadgetInfoOuterClass.internal_static_ClientGadgetInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.ClientGadgetInfoOuterClass.internal_static_ClientGadgetInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo.class, emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        campId_ = 0;
        campType_ = 0;
        guid_ = 0L;
        ownerEntityId_ = 0;
        targetEntityId_ = 0;
        asyncLoad_ = false;
        isPeerIdFromPlayer_ = false;
        targetEntityIdList_ = emptyIntList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.ClientGadgetInfoOuterClass.internal_static_ClientGadgetInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo build() {
        emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo buildPartial() {
        emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo result = new emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo result) {
        if (((bitField0_ & 0x00000080) != 0)) {
          targetEntityIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000080);
        }
        result.targetEntityIdList_ = targetEntityIdList_;
      }

      private void buildPartial0(emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.campId_ = campId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.campType_ = campType_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.guid_ = guid_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.ownerEntityId_ = ownerEntityId_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.targetEntityId_ = targetEntityId_;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.asyncLoad_ = asyncLoad_;
        }
        if (((from_bitField0_ & 0x00000040) != 0)) {
          result.isPeerIdFromPlayer_ = isPeerIdFromPlayer_;
        }
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
        if (other instanceof emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo) {
          return mergeFrom((emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo other) {
        if (other == emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo.getDefaultInstance()) return this;
        if (other.getCampId() != 0) {
          setCampId(other.getCampId());
        }
        if (other.getCampType() != 0) {
          setCampType(other.getCampType());
        }
        if (other.getGuid() != 0L) {
          setGuid(other.getGuid());
        }
        if (other.getOwnerEntityId() != 0) {
          setOwnerEntityId(other.getOwnerEntityId());
        }
        if (other.getTargetEntityId() != 0) {
          setTargetEntityId(other.getTargetEntityId());
        }
        if (other.getAsyncLoad() != false) {
          setAsyncLoad(other.getAsyncLoad());
        }
        if (other.getIsPeerIdFromPlayer() != false) {
          setIsPeerIdFromPlayer(other.getIsPeerIdFromPlayer());
        }
        if (!other.targetEntityIdList_.isEmpty()) {
          if (targetEntityIdList_.isEmpty()) {
            targetEntityIdList_ = other.targetEntityIdList_;
            bitField0_ = (bitField0_ & ~0x00000080);
          } else {
            ensureTargetEntityIdListIsMutable();
            targetEntityIdList_.addAll(other.targetEntityIdList_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                campId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                campType_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                guid_ = input.readUInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 32: {
                ownerEntityId_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
              case 40: {
                targetEntityId_ = input.readUInt32();
                bitField0_ |= 0x00000010;
                break;
              } // case 40
              case 48: {
                asyncLoad_ = input.readBool();
                bitField0_ |= 0x00000020;
                break;
              } // case 48
              case 56: {
                isPeerIdFromPlayer_ = input.readBool();
                bitField0_ |= 0x00000040;
                break;
              } // case 56
              case 64: {
                int v = input.readUInt32();
                ensureTargetEntityIdListIsMutable();
                targetEntityIdList_.addInt(v);
                break;
              } // case 64
              case 66: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureTargetEntityIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  targetEntityIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 66
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int campId_ ;
      /**
       * <code>uint32 camp_id = 1;</code>
       * @return The campId.
       */
      @java.lang.Override
      public int getCampId() {
        return campId_;
      }
      /**
       * <code>uint32 camp_id = 1;</code>
       * @param value The campId to set.
       * @return This builder for chaining.
       */
      public Builder setCampId(int value) {
        
        campId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 camp_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCampId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        campId_ = 0;
        onChanged();
        return this;
      }

      private int campType_ ;
      /**
       * <code>uint32 camp_type = 2;</code>
       * @return The campType.
       */
      @java.lang.Override
      public int getCampType() {
        return campType_;
      }
      /**
       * <code>uint32 camp_type = 2;</code>
       * @param value The campType to set.
       * @return This builder for chaining.
       */
      public Builder setCampType(int value) {
        
        campType_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 camp_type = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCampType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        campType_ = 0;
        onChanged();
        return this;
      }

      private long guid_ ;
      /**
       * <code>uint64 guid = 3;</code>
       * @return The guid.
       */
      @java.lang.Override
      public long getGuid() {
        return guid_;
      }
      /**
       * <code>uint64 guid = 3;</code>
       * @param value The guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuid(long value) {
        
        guid_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 guid = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuid() {
        bitField0_ = (bitField0_ & ~0x00000004);
        guid_ = 0L;
        onChanged();
        return this;
      }

      private int ownerEntityId_ ;
      /**
       * <code>uint32 owner_entity_id = 4;</code>
       * @return The ownerEntityId.
       */
      @java.lang.Override
      public int getOwnerEntityId() {
        return ownerEntityId_;
      }
      /**
       * <code>uint32 owner_entity_id = 4;</code>
       * @param value The ownerEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setOwnerEntityId(int value) {
        
        ownerEntityId_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 owner_entity_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearOwnerEntityId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        ownerEntityId_ = 0;
        onChanged();
        return this;
      }

      private int targetEntityId_ ;
      /**
       * <code>uint32 target_entity_id = 5;</code>
       * @return The targetEntityId.
       */
      @java.lang.Override
      public int getTargetEntityId() {
        return targetEntityId_;
      }
      /**
       * <code>uint32 target_entity_id = 5;</code>
       * @param value The targetEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setTargetEntityId(int value) {
        
        targetEntityId_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_entity_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetEntityId() {
        bitField0_ = (bitField0_ & ~0x00000010);
        targetEntityId_ = 0;
        onChanged();
        return this;
      }

      private boolean asyncLoad_ ;
      /**
       * <code>bool async_load = 6;</code>
       * @return The asyncLoad.
       */
      @java.lang.Override
      public boolean getAsyncLoad() {
        return asyncLoad_;
      }
      /**
       * <code>bool async_load = 6;</code>
       * @param value The asyncLoad to set.
       * @return This builder for chaining.
       */
      public Builder setAsyncLoad(boolean value) {
        
        asyncLoad_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <code>bool async_load = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearAsyncLoad() {
        bitField0_ = (bitField0_ & ~0x00000020);
        asyncLoad_ = false;
        onChanged();
        return this;
      }

      private boolean isPeerIdFromPlayer_ ;
      /**
       * <code>bool is_peer_id_from_player = 7;</code>
       * @return The isPeerIdFromPlayer.
       */
      @java.lang.Override
      public boolean getIsPeerIdFromPlayer() {
        return isPeerIdFromPlayer_;
      }
      /**
       * <code>bool is_peer_id_from_player = 7;</code>
       * @param value The isPeerIdFromPlayer to set.
       * @return This builder for chaining.
       */
      public Builder setIsPeerIdFromPlayer(boolean value) {
        
        isPeerIdFromPlayer_ = value;
        bitField0_ |= 0x00000040;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_peer_id_from_player = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsPeerIdFromPlayer() {
        bitField0_ = (bitField0_ & ~0x00000040);
        isPeerIdFromPlayer_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList targetEntityIdList_ = emptyIntList();
      private void ensureTargetEntityIdListIsMutable() {
        if (!((bitField0_ & 0x00000080) != 0)) {
          targetEntityIdList_ = mutableCopy(targetEntityIdList_);
          bitField0_ |= 0x00000080;
        }
      }
      /**
       * <code>repeated uint32 target_entity_id_list = 8;</code>
       * @return A list containing the targetEntityIdList.
       */
      public java.util.List<java.lang.Integer>
          getTargetEntityIdListList() {
        return ((bitField0_ & 0x00000080) != 0) ?
                 java.util.Collections.unmodifiableList(targetEntityIdList_) : targetEntityIdList_;
      }
      /**
       * <code>repeated uint32 target_entity_id_list = 8;</code>
       * @return The count of targetEntityIdList.
       */
      public int getTargetEntityIdListCount() {
        return targetEntityIdList_.size();
      }
      /**
       * <code>repeated uint32 target_entity_id_list = 8;</code>
       * @param index The index of the element to return.
       * @return The targetEntityIdList at the given index.
       */
      public int getTargetEntityIdList(int index) {
        return targetEntityIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 target_entity_id_list = 8;</code>
       * @param index The index to set the value at.
       * @param value The targetEntityIdList to set.
       * @return This builder for chaining.
       */
      public Builder setTargetEntityIdList(
          int index, int value) {
        
        ensureTargetEntityIdListIsMutable();
        targetEntityIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 target_entity_id_list = 8;</code>
       * @param value The targetEntityIdList to add.
       * @return This builder for chaining.
       */
      public Builder addTargetEntityIdList(int value) {
        
        ensureTargetEntityIdListIsMutable();
        targetEntityIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 target_entity_id_list = 8;</code>
       * @param values The targetEntityIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllTargetEntityIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureTargetEntityIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, targetEntityIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 target_entity_id_list = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetEntityIdList() {
        targetEntityIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000080);
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


      // @@protoc_insertion_point(builder_scope:ClientGadgetInfo)
    }

    // @@protoc_insertion_point(class_scope:ClientGadgetInfo)
    private static final emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo();
    }

    public static emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ClientGadgetInfo>
        PARSER = new com.google.protobuf.AbstractParser<ClientGadgetInfo>() {
      @java.lang.Override
      public ClientGadgetInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<ClientGadgetInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ClientGadgetInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.ClientGadgetInfoOuterClass.ClientGadgetInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientGadgetInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientGadgetInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026ClientGadgetInfo.proto\"\312\001\n\020ClientGadge" +
      "tInfo\022\017\n\007camp_id\030\001 \001(\r\022\021\n\tcamp_type\030\002 \001(" +
      "\r\022\014\n\004guid\030\003 \001(\004\022\027\n\017owner_entity_id\030\004 \001(\r" +
      "\022\030\n\020target_entity_id\030\005 \001(\r\022\022\n\nasync_load" +
      "\030\006 \001(\010\022\036\n\026is_peer_id_from_player\030\007 \001(\010\022\035" +
      "\n\025target_entity_id_list\030\010 \003(\rB\030\n\026emu.gin" +
      "gerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ClientGadgetInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ClientGadgetInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientGadgetInfo_descriptor,
        new java.lang.String[] { "CampId", "CampType", "Guid", "OwnerEntityId", "TargetEntityId", "AsyncLoad", "IsPeerIdFromPlayer", "TargetEntityIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
