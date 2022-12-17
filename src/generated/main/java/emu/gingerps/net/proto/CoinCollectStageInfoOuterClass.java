// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CoinCollectStageInfo.proto

package emu.gingerps.net.proto;

public final class CoinCollectStageInfoOuterClass {
  private CoinCollectStageInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CoinCollectStageInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CoinCollectStageInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 play_index = 9;</code>
     * @return The playIndex.
     */
    int getPlayIndex();

    /**
     * <code>repeated .CoinCollectPlayerInfo player_info_list = 11;</code>
     */
    java.util.List<emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfo> 
        getPlayerInfoListList();
    /**
     * <code>repeated .CoinCollectPlayerInfo player_info_list = 11;</code>
     */
    emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfo getPlayerInfoList(int index);
    /**
     * <code>repeated .CoinCollectPlayerInfo player_info_list = 11;</code>
     */
    int getPlayerInfoListCount();
    /**
     * <code>repeated .CoinCollectPlayerInfo player_info_list = 11;</code>
     */
    java.util.List<? extends emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfoOrBuilder> 
        getPlayerInfoListOrBuilderList();
    /**
     * <code>repeated .CoinCollectPlayerInfo player_info_list = 11;</code>
     */
    emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfoOrBuilder getPlayerInfoListOrBuilder(
        int index);

    /**
     * <code>uint32 level_id = 5;</code>
     * @return The levelId.
     */
    int getLevelId();
  }
  /**
   * Protobuf type {@code CoinCollectStageInfo}
   */
  public static final class CoinCollectStageInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CoinCollectStageInfo)
      CoinCollectStageInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CoinCollectStageInfo.newBuilder() to construct.
    private CoinCollectStageInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CoinCollectStageInfo() {
      playerInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CoinCollectStageInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CoinCollectStageInfo(
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
            case 40: {

              levelId_ = input.readUInt32();
              break;
            }
            case 72: {

              playIndex_ = input.readUInt32();
              break;
            }
            case 90: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                playerInfoList_ = new java.util.ArrayList<emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              playerInfoList_.add(
                  input.readMessage(emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfo.parser(), extensionRegistry));
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
          playerInfoList_ = java.util.Collections.unmodifiableList(playerInfoList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.internal_static_CoinCollectStageInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.internal_static_CoinCollectStageInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo.class, emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo.Builder.class);
    }

    public static final int PLAY_INDEX_FIELD_NUMBER = 9;
    private int playIndex_;
    /**
     * <code>uint32 play_index = 9;</code>
     * @return The playIndex.
     */
    @java.lang.Override
    public int getPlayIndex() {
      return playIndex_;
    }

    public static final int PLAYER_INFO_LIST_FIELD_NUMBER = 11;
    private java.util.List<emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfo> playerInfoList_;
    /**
     * <code>repeated .CoinCollectPlayerInfo player_info_list = 11;</code>
     */
    @java.lang.Override
    public java.util.List<emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfo> getPlayerInfoListList() {
      return playerInfoList_;
    }
    /**
     * <code>repeated .CoinCollectPlayerInfo player_info_list = 11;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfoOrBuilder> 
        getPlayerInfoListOrBuilderList() {
      return playerInfoList_;
    }
    /**
     * <code>repeated .CoinCollectPlayerInfo player_info_list = 11;</code>
     */
    @java.lang.Override
    public int getPlayerInfoListCount() {
      return playerInfoList_.size();
    }
    /**
     * <code>repeated .CoinCollectPlayerInfo player_info_list = 11;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfo getPlayerInfoList(int index) {
      return playerInfoList_.get(index);
    }
    /**
     * <code>repeated .CoinCollectPlayerInfo player_info_list = 11;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfoOrBuilder getPlayerInfoListOrBuilder(
        int index) {
      return playerInfoList_.get(index);
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 5;
    private int levelId_;
    /**
     * <code>uint32 level_id = 5;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
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
      if (levelId_ != 0) {
        output.writeUInt32(5, levelId_);
      }
      if (playIndex_ != 0) {
        output.writeUInt32(9, playIndex_);
      }
      for (int i = 0; i < playerInfoList_.size(); i++) {
        output.writeMessage(11, playerInfoList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, levelId_);
      }
      if (playIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, playIndex_);
      }
      for (int i = 0; i < playerInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, playerInfoList_.get(i));
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
      if (!(obj instanceof emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo other = (emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo) obj;

      if (getPlayIndex()
          != other.getPlayIndex()) return false;
      if (!getPlayerInfoListList()
          .equals(other.getPlayerInfoListList())) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
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
      hash = (37 * hash) + PLAY_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getPlayIndex();
      if (getPlayerInfoListCount() > 0) {
        hash = (37 * hash) + PLAYER_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getPlayerInfoListList().hashCode();
      }
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo prototype) {
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
     * Protobuf type {@code CoinCollectStageInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CoinCollectStageInfo)
        emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.internal_static_CoinCollectStageInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.internal_static_CoinCollectStageInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo.class, emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo.newBuilder()
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
          getPlayerInfoListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        playIndex_ = 0;

        if (playerInfoListBuilder_ == null) {
          playerInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          playerInfoListBuilder_.clear();
        }
        levelId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.internal_static_CoinCollectStageInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo build() {
        emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo buildPartial() {
        emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo result = new emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo(this);
        int from_bitField0_ = bitField0_;
        result.playIndex_ = playIndex_;
        if (playerInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            playerInfoList_ = java.util.Collections.unmodifiableList(playerInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.playerInfoList_ = playerInfoList_;
        } else {
          result.playerInfoList_ = playerInfoListBuilder_.build();
        }
        result.levelId_ = levelId_;
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
        if (other instanceof emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo) {
          return mergeFrom((emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo other) {
        if (other == emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo.getDefaultInstance()) return this;
        if (other.getPlayIndex() != 0) {
          setPlayIndex(other.getPlayIndex());
        }
        if (playerInfoListBuilder_ == null) {
          if (!other.playerInfoList_.isEmpty()) {
            if (playerInfoList_.isEmpty()) {
              playerInfoList_ = other.playerInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePlayerInfoListIsMutable();
              playerInfoList_.addAll(other.playerInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.playerInfoList_.isEmpty()) {
            if (playerInfoListBuilder_.isEmpty()) {
              playerInfoListBuilder_.dispose();
              playerInfoListBuilder_ = null;
              playerInfoList_ = other.playerInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              playerInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPlayerInfoListFieldBuilder() : null;
            } else {
              playerInfoListBuilder_.addAllMessages(other.playerInfoList_);
            }
          }
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
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
        emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int playIndex_ ;
      /**
       * <code>uint32 play_index = 9;</code>
       * @return The playIndex.
       */
      @java.lang.Override
      public int getPlayIndex() {
        return playIndex_;
      }
      /**
       * <code>uint32 play_index = 9;</code>
       * @param value The playIndex to set.
       * @return This builder for chaining.
       */
      public Builder setPlayIndex(int value) {
        
        playIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 play_index = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayIndex() {
        
        playIndex_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfo> playerInfoList_ =
        java.util.Collections.emptyList();
      private void ensurePlayerInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          playerInfoList_ = new java.util.ArrayList<emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfo>(playerInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfo, emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfo.Builder, emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfoOrBuilder> playerInfoListBuilder_;

      /**
       * <code>repeated .CoinCollectPlayerInfo player_info_list = 11;</code>
       */
      public java.util.List<emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfo> getPlayerInfoListList() {
        if (playerInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(playerInfoList_);
        } else {
          return playerInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .CoinCollectPlayerInfo player_info_list = 11;</code>
       */
      public int getPlayerInfoListCount() {
        if (playerInfoListBuilder_ == null) {
          return playerInfoList_.size();
        } else {
          return playerInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .CoinCollectPlayerInfo player_info_list = 11;</code>
       */
      public emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfo getPlayerInfoList(int index) {
        if (playerInfoListBuilder_ == null) {
          return playerInfoList_.get(index);
        } else {
          return playerInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .CoinCollectPlayerInfo player_info_list = 11;</code>
       */
      public Builder setPlayerInfoList(
          int index, emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfo value) {
        if (playerInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerInfoListIsMutable();
          playerInfoList_.set(index, value);
          onChanged();
        } else {
          playerInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CoinCollectPlayerInfo player_info_list = 11;</code>
       */
      public Builder setPlayerInfoList(
          int index, emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfo.Builder builderForValue) {
        if (playerInfoListBuilder_ == null) {
          ensurePlayerInfoListIsMutable();
          playerInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          playerInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CoinCollectPlayerInfo player_info_list = 11;</code>
       */
      public Builder addPlayerInfoList(emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfo value) {
        if (playerInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerInfoListIsMutable();
          playerInfoList_.add(value);
          onChanged();
        } else {
          playerInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .CoinCollectPlayerInfo player_info_list = 11;</code>
       */
      public Builder addPlayerInfoList(
          int index, emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfo value) {
        if (playerInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerInfoListIsMutable();
          playerInfoList_.add(index, value);
          onChanged();
        } else {
          playerInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CoinCollectPlayerInfo player_info_list = 11;</code>
       */
      public Builder addPlayerInfoList(
          emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfo.Builder builderForValue) {
        if (playerInfoListBuilder_ == null) {
          ensurePlayerInfoListIsMutable();
          playerInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          playerInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CoinCollectPlayerInfo player_info_list = 11;</code>
       */
      public Builder addPlayerInfoList(
          int index, emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfo.Builder builderForValue) {
        if (playerInfoListBuilder_ == null) {
          ensurePlayerInfoListIsMutable();
          playerInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          playerInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CoinCollectPlayerInfo player_info_list = 11;</code>
       */
      public Builder addAllPlayerInfoList(
          java.lang.Iterable<? extends emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfo> values) {
        if (playerInfoListBuilder_ == null) {
          ensurePlayerInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, playerInfoList_);
          onChanged();
        } else {
          playerInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .CoinCollectPlayerInfo player_info_list = 11;</code>
       */
      public Builder clearPlayerInfoList() {
        if (playerInfoListBuilder_ == null) {
          playerInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          playerInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .CoinCollectPlayerInfo player_info_list = 11;</code>
       */
      public Builder removePlayerInfoList(int index) {
        if (playerInfoListBuilder_ == null) {
          ensurePlayerInfoListIsMutable();
          playerInfoList_.remove(index);
          onChanged();
        } else {
          playerInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .CoinCollectPlayerInfo player_info_list = 11;</code>
       */
      public emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfo.Builder getPlayerInfoListBuilder(
          int index) {
        return getPlayerInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .CoinCollectPlayerInfo player_info_list = 11;</code>
       */
      public emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfoOrBuilder getPlayerInfoListOrBuilder(
          int index) {
        if (playerInfoListBuilder_ == null) {
          return playerInfoList_.get(index);  } else {
          return playerInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .CoinCollectPlayerInfo player_info_list = 11;</code>
       */
      public java.util.List<? extends emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfoOrBuilder> 
           getPlayerInfoListOrBuilderList() {
        if (playerInfoListBuilder_ != null) {
          return playerInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(playerInfoList_);
        }
      }
      /**
       * <code>repeated .CoinCollectPlayerInfo player_info_list = 11;</code>
       */
      public emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfo.Builder addPlayerInfoListBuilder() {
        return getPlayerInfoListFieldBuilder().addBuilder(
            emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .CoinCollectPlayerInfo player_info_list = 11;</code>
       */
      public emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfo.Builder addPlayerInfoListBuilder(
          int index) {
        return getPlayerInfoListFieldBuilder().addBuilder(
            index, emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .CoinCollectPlayerInfo player_info_list = 11;</code>
       */
      public java.util.List<emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfo.Builder> 
           getPlayerInfoListBuilderList() {
        return getPlayerInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfo, emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfo.Builder, emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfoOrBuilder> 
          getPlayerInfoListFieldBuilder() {
        if (playerInfoListBuilder_ == null) {
          playerInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfo, emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfo.Builder, emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.CoinCollectPlayerInfoOrBuilder>(
                  playerInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          playerInfoList_ = null;
        }
        return playerInfoListBuilder_;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 5;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 5;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CoinCollectStageInfo)
    }

    // @@protoc_insertion_point(class_scope:CoinCollectStageInfo)
    private static final emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo();
    }

    public static emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CoinCollectStageInfo>
        PARSER = new com.google.protobuf.AbstractParser<CoinCollectStageInfo>() {
      @java.lang.Override
      public CoinCollectStageInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CoinCollectStageInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CoinCollectStageInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CoinCollectStageInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.CoinCollectStageInfoOuterClass.CoinCollectStageInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CoinCollectStageInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CoinCollectStageInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032CoinCollectStageInfo.proto\032\033CoinCollec" +
      "tPlayerInfo.proto\"n\n\024CoinCollectStageInf" +
      "o\022\022\n\nplay_index\030\t \001(\r\0220\n\020player_info_lis" +
      "t\030\013 \003(\0132\026.CoinCollectPlayerInfo\022\020\n\010level" +
      "_id\030\005 \001(\rB\030\n\026emu.gingerps.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.getDescriptor(),
        });
    internal_static_CoinCollectStageInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CoinCollectStageInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CoinCollectStageInfo_descriptor,
        new java.lang.String[] { "PlayIndex", "PlayerInfoList", "LevelId", });
    emu.gingerps.net.proto.CoinCollectPlayerInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
