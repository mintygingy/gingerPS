// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FungusFighterTrainingSelectFungusReq.proto

package emu.gingerps.net.proto;

public final class FungusFighterTrainingSelectFungusReqOuterClass {
  private FungusFighterTrainingSelectFungusReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FungusFighterTrainingSelectFungusReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FungusFighterTrainingSelectFungusReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 backup_fungus_id_list = 3;</code>
     * @return A list containing the backupFungusIdList.
     */
    java.util.List<java.lang.Integer> getBackupFungusIdListList();
    /**
     * <code>repeated uint32 backup_fungus_id_list = 3;</code>
     * @return The count of backupFungusIdList.
     */
    int getBackupFungusIdListCount();
    /**
     * <code>repeated uint32 backup_fungus_id_list = 3;</code>
     * @param index The index of the element to return.
     * @return The backupFungusIdList at the given index.
     */
    int getBackupFungusIdList(int index);

    /**
     * <code>repeated uint32 fight_fungus_id_list = 9;</code>
     * @return A list containing the fightFungusIdList.
     */
    java.util.List<java.lang.Integer> getFightFungusIdListList();
    /**
     * <code>repeated uint32 fight_fungus_id_list = 9;</code>
     * @return The count of fightFungusIdList.
     */
    int getFightFungusIdListCount();
    /**
     * <code>repeated uint32 fight_fungus_id_list = 9;</code>
     * @param index The index of the element to return.
     * @return The fightFungusIdList at the given index.
     */
    int getFightFungusIdList(int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 24249;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code FungusFighterTrainingSelectFungusReq}
   */
  public static final class FungusFighterTrainingSelectFungusReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FungusFighterTrainingSelectFungusReq)
      FungusFighterTrainingSelectFungusReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FungusFighterTrainingSelectFungusReq.newBuilder() to construct.
    private FungusFighterTrainingSelectFungusReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FungusFighterTrainingSelectFungusReq() {
      backupFungusIdList_ = emptyIntList();
      fightFungusIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FungusFighterTrainingSelectFungusReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.internal_static_FungusFighterTrainingSelectFungusReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.internal_static_FungusFighterTrainingSelectFungusReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq.class, emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq.Builder.class);
    }

    public static final int BACKUP_FUNGUS_ID_LIST_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList backupFungusIdList_;
    /**
     * <code>repeated uint32 backup_fungus_id_list = 3;</code>
     * @return A list containing the backupFungusIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getBackupFungusIdListList() {
      return backupFungusIdList_;
    }
    /**
     * <code>repeated uint32 backup_fungus_id_list = 3;</code>
     * @return The count of backupFungusIdList.
     */
    public int getBackupFungusIdListCount() {
      return backupFungusIdList_.size();
    }
    /**
     * <code>repeated uint32 backup_fungus_id_list = 3;</code>
     * @param index The index of the element to return.
     * @return The backupFungusIdList at the given index.
     */
    public int getBackupFungusIdList(int index) {
      return backupFungusIdList_.getInt(index);
    }
    private int backupFungusIdListMemoizedSerializedSize = -1;

    public static final int FIGHT_FUNGUS_ID_LIST_FIELD_NUMBER = 9;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList fightFungusIdList_;
    /**
     * <code>repeated uint32 fight_fungus_id_list = 9;</code>
     * @return A list containing the fightFungusIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getFightFungusIdListList() {
      return fightFungusIdList_;
    }
    /**
     * <code>repeated uint32 fight_fungus_id_list = 9;</code>
     * @return The count of fightFungusIdList.
     */
    public int getFightFungusIdListCount() {
      return fightFungusIdList_.size();
    }
    /**
     * <code>repeated uint32 fight_fungus_id_list = 9;</code>
     * @param index The index of the element to return.
     * @return The fightFungusIdList at the given index.
     */
    public int getFightFungusIdList(int index) {
      return fightFungusIdList_.getInt(index);
    }
    private int fightFungusIdListMemoizedSerializedSize = -1;

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
      if (getBackupFungusIdListList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(backupFungusIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < backupFungusIdList_.size(); i++) {
        output.writeUInt32NoTag(backupFungusIdList_.getInt(i));
      }
      if (getFightFungusIdListList().size() > 0) {
        output.writeUInt32NoTag(74);
        output.writeUInt32NoTag(fightFungusIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < fightFungusIdList_.size(); i++) {
        output.writeUInt32NoTag(fightFungusIdList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < backupFungusIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(backupFungusIdList_.getInt(i));
        }
        size += dataSize;
        if (!getBackupFungusIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        backupFungusIdListMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < fightFungusIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(fightFungusIdList_.getInt(i));
        }
        size += dataSize;
        if (!getFightFungusIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        fightFungusIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq other = (emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq) obj;

      if (!getBackupFungusIdListList()
          .equals(other.getBackupFungusIdListList())) return false;
      if (!getFightFungusIdListList()
          .equals(other.getFightFungusIdListList())) return false;
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
      if (getBackupFungusIdListCount() > 0) {
        hash = (37 * hash) + BACKUP_FUNGUS_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getBackupFungusIdListList().hashCode();
      }
      if (getFightFungusIdListCount() > 0) {
        hash = (37 * hash) + FIGHT_FUNGUS_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getFightFungusIdListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq prototype) {
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
     *   CMD_ID = 24249;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code FungusFighterTrainingSelectFungusReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FungusFighterTrainingSelectFungusReq)
        emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.internal_static_FungusFighterTrainingSelectFungusReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.internal_static_FungusFighterTrainingSelectFungusReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq.class, emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq.newBuilder()
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
        backupFungusIdList_ = emptyIntList();
        fightFungusIdList_ = emptyIntList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.internal_static_FungusFighterTrainingSelectFungusReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq build() {
        emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq buildPartial() {
        emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq result = new emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq result) {
        if (((bitField0_ & 0x00000001) != 0)) {
          backupFungusIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.backupFungusIdList_ = backupFungusIdList_;
        if (((bitField0_ & 0x00000002) != 0)) {
          fightFungusIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.fightFungusIdList_ = fightFungusIdList_;
      }

      private void buildPartial0(emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq result) {
        int from_bitField0_ = bitField0_;
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
        if (other instanceof emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq) {
          return mergeFrom((emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq other) {
        if (other == emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq.getDefaultInstance()) return this;
        if (!other.backupFungusIdList_.isEmpty()) {
          if (backupFungusIdList_.isEmpty()) {
            backupFungusIdList_ = other.backupFungusIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBackupFungusIdListIsMutable();
            backupFungusIdList_.addAll(other.backupFungusIdList_);
          }
          onChanged();
        }
        if (!other.fightFungusIdList_.isEmpty()) {
          if (fightFungusIdList_.isEmpty()) {
            fightFungusIdList_ = other.fightFungusIdList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureFightFungusIdListIsMutable();
            fightFungusIdList_.addAll(other.fightFungusIdList_);
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
              case 24: {
                int v = input.readUInt32();
                ensureBackupFungusIdListIsMutable();
                backupFungusIdList_.addInt(v);
                break;
              } // case 24
              case 26: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureBackupFungusIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  backupFungusIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 26
              case 72: {
                int v = input.readUInt32();
                ensureFightFungusIdListIsMutable();
                fightFungusIdList_.addInt(v);
                break;
              } // case 72
              case 74: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureFightFungusIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  fightFungusIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 74
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

      private com.google.protobuf.Internal.IntList backupFungusIdList_ = emptyIntList();
      private void ensureBackupFungusIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          backupFungusIdList_ = mutableCopy(backupFungusIdList_);
          bitField0_ |= 0x00000001;
        }
      }
      /**
       * <code>repeated uint32 backup_fungus_id_list = 3;</code>
       * @return A list containing the backupFungusIdList.
       */
      public java.util.List<java.lang.Integer>
          getBackupFungusIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(backupFungusIdList_) : backupFungusIdList_;
      }
      /**
       * <code>repeated uint32 backup_fungus_id_list = 3;</code>
       * @return The count of backupFungusIdList.
       */
      public int getBackupFungusIdListCount() {
        return backupFungusIdList_.size();
      }
      /**
       * <code>repeated uint32 backup_fungus_id_list = 3;</code>
       * @param index The index of the element to return.
       * @return The backupFungusIdList at the given index.
       */
      public int getBackupFungusIdList(int index) {
        return backupFungusIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 backup_fungus_id_list = 3;</code>
       * @param index The index to set the value at.
       * @param value The backupFungusIdList to set.
       * @return This builder for chaining.
       */
      public Builder setBackupFungusIdList(
          int index, int value) {
        
        ensureBackupFungusIdListIsMutable();
        backupFungusIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 backup_fungus_id_list = 3;</code>
       * @param value The backupFungusIdList to add.
       * @return This builder for chaining.
       */
      public Builder addBackupFungusIdList(int value) {
        
        ensureBackupFungusIdListIsMutable();
        backupFungusIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 backup_fungus_id_list = 3;</code>
       * @param values The backupFungusIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllBackupFungusIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureBackupFungusIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, backupFungusIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 backup_fungus_id_list = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearBackupFungusIdList() {
        backupFungusIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList fightFungusIdList_ = emptyIntList();
      private void ensureFightFungusIdListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          fightFungusIdList_ = mutableCopy(fightFungusIdList_);
          bitField0_ |= 0x00000002;
        }
      }
      /**
       * <code>repeated uint32 fight_fungus_id_list = 9;</code>
       * @return A list containing the fightFungusIdList.
       */
      public java.util.List<java.lang.Integer>
          getFightFungusIdListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(fightFungusIdList_) : fightFungusIdList_;
      }
      /**
       * <code>repeated uint32 fight_fungus_id_list = 9;</code>
       * @return The count of fightFungusIdList.
       */
      public int getFightFungusIdListCount() {
        return fightFungusIdList_.size();
      }
      /**
       * <code>repeated uint32 fight_fungus_id_list = 9;</code>
       * @param index The index of the element to return.
       * @return The fightFungusIdList at the given index.
       */
      public int getFightFungusIdList(int index) {
        return fightFungusIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 fight_fungus_id_list = 9;</code>
       * @param index The index to set the value at.
       * @param value The fightFungusIdList to set.
       * @return This builder for chaining.
       */
      public Builder setFightFungusIdList(
          int index, int value) {
        
        ensureFightFungusIdListIsMutable();
        fightFungusIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fight_fungus_id_list = 9;</code>
       * @param value The fightFungusIdList to add.
       * @return This builder for chaining.
       */
      public Builder addFightFungusIdList(int value) {
        
        ensureFightFungusIdListIsMutable();
        fightFungusIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fight_fungus_id_list = 9;</code>
       * @param values The fightFungusIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllFightFungusIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureFightFungusIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fightFungusIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fight_fungus_id_list = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearFightFungusIdList() {
        fightFungusIdList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:FungusFighterTrainingSelectFungusReq)
    }

    // @@protoc_insertion_point(class_scope:FungusFighterTrainingSelectFungusReq)
    private static final emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq();
    }

    public static emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FungusFighterTrainingSelectFungusReq>
        PARSER = new com.google.protobuf.AbstractParser<FungusFighterTrainingSelectFungusReq>() {
      @java.lang.Override
      public FungusFighterTrainingSelectFungusReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<FungusFighterTrainingSelectFungusReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FungusFighterTrainingSelectFungusReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.FungusFighterTrainingSelectFungusReqOuterClass.FungusFighterTrainingSelectFungusReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FungusFighterTrainingSelectFungusReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FungusFighterTrainingSelectFungusReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*FungusFighterTrainingSelectFungusReq.p" +
      "roto\"c\n$FungusFighterTrainingSelectFungu" +
      "sReq\022\035\n\025backup_fungus_id_list\030\003 \003(\r\022\034\n\024f" +
      "ight_fungus_id_list\030\t \003(\rB\030\n\026emu.gingerp" +
      "s.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FungusFighterTrainingSelectFungusReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FungusFighterTrainingSelectFungusReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FungusFighterTrainingSelectFungusReq_descriptor,
        new java.lang.String[] { "BackupFungusIdList", "FightFungusIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
