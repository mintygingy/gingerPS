// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UpdatePlayerShowAvatarListRsp.proto

package emu.gingerps.net.proto;

public final class UpdatePlayerShowAvatarListRspOuterClass {
  private UpdatePlayerShowAvatarListRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UpdatePlayerShowAvatarListRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UpdatePlayerShowAvatarListRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated uint32 show_avatar_id_list = 11;</code>
     * @return A list containing the showAvatarIdList.
     */
    java.util.List<java.lang.Integer> getShowAvatarIdListList();
    /**
     * <code>repeated uint32 show_avatar_id_list = 11;</code>
     * @return The count of showAvatarIdList.
     */
    int getShowAvatarIdListCount();
    /**
     * <code>repeated uint32 show_avatar_id_list = 11;</code>
     * @param index The index of the element to return.
     * @return The showAvatarIdList at the given index.
     */
    int getShowAvatarIdList(int index);

    /**
     * <code>bool is_show_avatar = 2;</code>
     * @return The isShowAvatar.
     */
    boolean getIsShowAvatar();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4024;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code UpdatePlayerShowAvatarListRsp}
   */
  public static final class UpdatePlayerShowAvatarListRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UpdatePlayerShowAvatarListRsp)
      UpdatePlayerShowAvatarListRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UpdatePlayerShowAvatarListRsp.newBuilder() to construct.
    private UpdatePlayerShowAvatarListRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UpdatePlayerShowAvatarListRsp() {
      showAvatarIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UpdatePlayerShowAvatarListRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.internal_static_UpdatePlayerShowAvatarListRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.internal_static_UpdatePlayerShowAvatarListRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp.class, emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 8;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int SHOW_AVATAR_ID_LIST_FIELD_NUMBER = 11;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList showAvatarIdList_;
    /**
     * <code>repeated uint32 show_avatar_id_list = 11;</code>
     * @return A list containing the showAvatarIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getShowAvatarIdListList() {
      return showAvatarIdList_;
    }
    /**
     * <code>repeated uint32 show_avatar_id_list = 11;</code>
     * @return The count of showAvatarIdList.
     */
    public int getShowAvatarIdListCount() {
      return showAvatarIdList_.size();
    }
    /**
     * <code>repeated uint32 show_avatar_id_list = 11;</code>
     * @param index The index of the element to return.
     * @return The showAvatarIdList at the given index.
     */
    public int getShowAvatarIdList(int index) {
      return showAvatarIdList_.getInt(index);
    }
    private int showAvatarIdListMemoizedSerializedSize = -1;

    public static final int IS_SHOW_AVATAR_FIELD_NUMBER = 2;
    private boolean isShowAvatar_ = false;
    /**
     * <code>bool is_show_avatar = 2;</code>
     * @return The isShowAvatar.
     */
    @java.lang.Override
    public boolean getIsShowAvatar() {
      return isShowAvatar_;
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
      if (isShowAvatar_ != false) {
        output.writeBool(2, isShowAvatar_);
      }
      if (retcode_ != 0) {
        output.writeInt32(8, retcode_);
      }
      if (getShowAvatarIdListList().size() > 0) {
        output.writeUInt32NoTag(90);
        output.writeUInt32NoTag(showAvatarIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < showAvatarIdList_.size(); i++) {
        output.writeUInt32NoTag(showAvatarIdList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isShowAvatar_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isShowAvatar_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, retcode_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < showAvatarIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(showAvatarIdList_.getInt(i));
        }
        size += dataSize;
        if (!getShowAvatarIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        showAvatarIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp other = (emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getShowAvatarIdListList()
          .equals(other.getShowAvatarIdListList())) return false;
      if (getIsShowAvatar()
          != other.getIsShowAvatar()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (getShowAvatarIdListCount() > 0) {
        hash = (37 * hash) + SHOW_AVATAR_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getShowAvatarIdListList().hashCode();
      }
      hash = (37 * hash) + IS_SHOW_AVATAR_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsShowAvatar());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp prototype) {
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
     *   CMD_ID = 4024;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code UpdatePlayerShowAvatarListRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UpdatePlayerShowAvatarListRsp)
        emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.internal_static_UpdatePlayerShowAvatarListRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.internal_static_UpdatePlayerShowAvatarListRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp.class, emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp.newBuilder()
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
        retcode_ = 0;
        showAvatarIdList_ = emptyIntList();
        isShowAvatar_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.internal_static_UpdatePlayerShowAvatarListRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp build() {
        emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp buildPartial() {
        emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp result = new emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp result) {
        if (((bitField0_ & 0x00000002) != 0)) {
          showAvatarIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.showAvatarIdList_ = showAvatarIdList_;
      }

      private void buildPartial0(emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.isShowAvatar_ = isShowAvatar_;
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
        if (other instanceof emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp) {
          return mergeFrom((emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp other) {
        if (other == emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (!other.showAvatarIdList_.isEmpty()) {
          if (showAvatarIdList_.isEmpty()) {
            showAvatarIdList_ = other.showAvatarIdList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureShowAvatarIdListIsMutable();
            showAvatarIdList_.addAll(other.showAvatarIdList_);
          }
          onChanged();
        }
        if (other.getIsShowAvatar() != false) {
          setIsShowAvatar(other.getIsShowAvatar());
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
              case 16: {
                isShowAvatar_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 16
              case 64: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 64
              case 88: {
                int v = input.readUInt32();
                ensureShowAvatarIdListIsMutable();
                showAvatarIdList_.addInt(v);
                break;
              } // case 88
              case 90: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureShowAvatarIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  showAvatarIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 90
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 8;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList showAvatarIdList_ = emptyIntList();
      private void ensureShowAvatarIdListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          showAvatarIdList_ = mutableCopy(showAvatarIdList_);
          bitField0_ |= 0x00000002;
        }
      }
      /**
       * <code>repeated uint32 show_avatar_id_list = 11;</code>
       * @return A list containing the showAvatarIdList.
       */
      public java.util.List<java.lang.Integer>
          getShowAvatarIdListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(showAvatarIdList_) : showAvatarIdList_;
      }
      /**
       * <code>repeated uint32 show_avatar_id_list = 11;</code>
       * @return The count of showAvatarIdList.
       */
      public int getShowAvatarIdListCount() {
        return showAvatarIdList_.size();
      }
      /**
       * <code>repeated uint32 show_avatar_id_list = 11;</code>
       * @param index The index of the element to return.
       * @return The showAvatarIdList at the given index.
       */
      public int getShowAvatarIdList(int index) {
        return showAvatarIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 show_avatar_id_list = 11;</code>
       * @param index The index to set the value at.
       * @param value The showAvatarIdList to set.
       * @return This builder for chaining.
       */
      public Builder setShowAvatarIdList(
          int index, int value) {
        
        ensureShowAvatarIdListIsMutable();
        showAvatarIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 show_avatar_id_list = 11;</code>
       * @param value The showAvatarIdList to add.
       * @return This builder for chaining.
       */
      public Builder addShowAvatarIdList(int value) {
        
        ensureShowAvatarIdListIsMutable();
        showAvatarIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 show_avatar_id_list = 11;</code>
       * @param values The showAvatarIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllShowAvatarIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureShowAvatarIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, showAvatarIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 show_avatar_id_list = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearShowAvatarIdList() {
        showAvatarIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      private boolean isShowAvatar_ ;
      /**
       * <code>bool is_show_avatar = 2;</code>
       * @return The isShowAvatar.
       */
      @java.lang.Override
      public boolean getIsShowAvatar() {
        return isShowAvatar_;
      }
      /**
       * <code>bool is_show_avatar = 2;</code>
       * @param value The isShowAvatar to set.
       * @return This builder for chaining.
       */
      public Builder setIsShowAvatar(boolean value) {
        
        isShowAvatar_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_show_avatar = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsShowAvatar() {
        bitField0_ = (bitField0_ & ~0x00000004);
        isShowAvatar_ = false;
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


      // @@protoc_insertion_point(builder_scope:UpdatePlayerShowAvatarListRsp)
    }

    // @@protoc_insertion_point(class_scope:UpdatePlayerShowAvatarListRsp)
    private static final emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp();
    }

    public static emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UpdatePlayerShowAvatarListRsp>
        PARSER = new com.google.protobuf.AbstractParser<UpdatePlayerShowAvatarListRsp>() {
      @java.lang.Override
      public UpdatePlayerShowAvatarListRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<UpdatePlayerShowAvatarListRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UpdatePlayerShowAvatarListRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UpdatePlayerShowAvatarListRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UpdatePlayerShowAvatarListRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#UpdatePlayerShowAvatarListRsp.proto\"e\n" +
      "\035UpdatePlayerShowAvatarListRsp\022\017\n\007retcod" +
      "e\030\010 \001(\005\022\033\n\023show_avatar_id_list\030\013 \003(\r\022\026\n\016" +
      "is_show_avatar\030\002 \001(\010B\030\n\026emu.gingerps.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UpdatePlayerShowAvatarListRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UpdatePlayerShowAvatarListRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UpdatePlayerShowAvatarListRsp_descriptor,
        new java.lang.String[] { "Retcode", "ShowAvatarIdList", "IsShowAvatar", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
