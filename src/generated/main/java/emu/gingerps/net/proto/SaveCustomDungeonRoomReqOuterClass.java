// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SaveCustomDungeonRoomReq.proto

package emu.gingerps.net.proto;

public final class SaveCustomDungeonRoomReqOuterClass {
  private SaveCustomDungeonRoomReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SaveCustomDungeonRoomReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SaveCustomDungeonRoomReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.CustomDungeonSetting setting = 1;</code>
     * @return Whether the setting field is set.
     */
    boolean hasSetting();
    /**
     * <code>.CustomDungeonSetting setting = 1;</code>
     * @return The setting.
     */
    emu.gingerps.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting getSetting();
    /**
     * <code>.CustomDungeonSetting setting = 1;</code>
     */
    emu.gingerps.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSettingOrBuilder getSettingOrBuilder();

    /**
     * <code>.CustomDungeonRoom custom_dungeon_room = 4;</code>
     * @return Whether the customDungeonRoom field is set.
     */
    boolean hasCustomDungeonRoom();
    /**
     * <code>.CustomDungeonRoom custom_dungeon_room = 4;</code>
     * @return The customDungeonRoom.
     */
    emu.gingerps.net.proto.CustomDungeonRoomOuterClass.CustomDungeonRoom getCustomDungeonRoom();
    /**
     * <code>.CustomDungeonRoom custom_dungeon_room = 4;</code>
     */
    emu.gingerps.net.proto.CustomDungeonRoomOuterClass.CustomDungeonRoomOrBuilder getCustomDungeonRoomOrBuilder();

    /**
     * <code>bool is_update_setting = 12;</code>
     * @return The isUpdateSetting.
     */
    boolean getIsUpdateSetting();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 6222;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code SaveCustomDungeonRoomReq}
   */
  public static final class SaveCustomDungeonRoomReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SaveCustomDungeonRoomReq)
      SaveCustomDungeonRoomReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SaveCustomDungeonRoomReq.newBuilder() to construct.
    private SaveCustomDungeonRoomReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SaveCustomDungeonRoomReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SaveCustomDungeonRoomReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SaveCustomDungeonRoomReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 10: {
              emu.gingerps.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting.Builder subBuilder = null;
              if (setting_ != null) {
                subBuilder = setting_.toBuilder();
              }
              setting_ = input.readMessage(emu.gingerps.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(setting_);
                setting_ = subBuilder.buildPartial();
              }

              break;
            }
            case 34: {
              emu.gingerps.net.proto.CustomDungeonRoomOuterClass.CustomDungeonRoom.Builder subBuilder = null;
              if (customDungeonRoom_ != null) {
                subBuilder = customDungeonRoom_.toBuilder();
              }
              customDungeonRoom_ = input.readMessage(emu.gingerps.net.proto.CustomDungeonRoomOuterClass.CustomDungeonRoom.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(customDungeonRoom_);
                customDungeonRoom_ = subBuilder.buildPartial();
              }

              break;
            }
            case 96: {

              isUpdateSetting_ = input.readBool();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.internal_static_SaveCustomDungeonRoomReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.internal_static_SaveCustomDungeonRoomReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq.class, emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq.Builder.class);
    }

    public static final int SETTING_FIELD_NUMBER = 1;
    private emu.gingerps.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting setting_;
    /**
     * <code>.CustomDungeonSetting setting = 1;</code>
     * @return Whether the setting field is set.
     */
    @java.lang.Override
    public boolean hasSetting() {
      return setting_ != null;
    }
    /**
     * <code>.CustomDungeonSetting setting = 1;</code>
     * @return The setting.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting getSetting() {
      return setting_ == null ? emu.gingerps.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting.getDefaultInstance() : setting_;
    }
    /**
     * <code>.CustomDungeonSetting setting = 1;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSettingOrBuilder getSettingOrBuilder() {
      return getSetting();
    }

    public static final int CUSTOM_DUNGEON_ROOM_FIELD_NUMBER = 4;
    private emu.gingerps.net.proto.CustomDungeonRoomOuterClass.CustomDungeonRoom customDungeonRoom_;
    /**
     * <code>.CustomDungeonRoom custom_dungeon_room = 4;</code>
     * @return Whether the customDungeonRoom field is set.
     */
    @java.lang.Override
    public boolean hasCustomDungeonRoom() {
      return customDungeonRoom_ != null;
    }
    /**
     * <code>.CustomDungeonRoom custom_dungeon_room = 4;</code>
     * @return The customDungeonRoom.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.CustomDungeonRoomOuterClass.CustomDungeonRoom getCustomDungeonRoom() {
      return customDungeonRoom_ == null ? emu.gingerps.net.proto.CustomDungeonRoomOuterClass.CustomDungeonRoom.getDefaultInstance() : customDungeonRoom_;
    }
    /**
     * <code>.CustomDungeonRoom custom_dungeon_room = 4;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.CustomDungeonRoomOuterClass.CustomDungeonRoomOrBuilder getCustomDungeonRoomOrBuilder() {
      return getCustomDungeonRoom();
    }

    public static final int IS_UPDATE_SETTING_FIELD_NUMBER = 12;
    private boolean isUpdateSetting_;
    /**
     * <code>bool is_update_setting = 12;</code>
     * @return The isUpdateSetting.
     */
    @java.lang.Override
    public boolean getIsUpdateSetting() {
      return isUpdateSetting_;
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
      if (setting_ != null) {
        output.writeMessage(1, getSetting());
      }
      if (customDungeonRoom_ != null) {
        output.writeMessage(4, getCustomDungeonRoom());
      }
      if (isUpdateSetting_ != false) {
        output.writeBool(12, isUpdateSetting_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (setting_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getSetting());
      }
      if (customDungeonRoom_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getCustomDungeonRoom());
      }
      if (isUpdateSetting_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isUpdateSetting_);
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
      if (!(obj instanceof emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq other = (emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq) obj;

      if (hasSetting() != other.hasSetting()) return false;
      if (hasSetting()) {
        if (!getSetting()
            .equals(other.getSetting())) return false;
      }
      if (hasCustomDungeonRoom() != other.hasCustomDungeonRoom()) return false;
      if (hasCustomDungeonRoom()) {
        if (!getCustomDungeonRoom()
            .equals(other.getCustomDungeonRoom())) return false;
      }
      if (getIsUpdateSetting()
          != other.getIsUpdateSetting()) return false;
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
      if (hasSetting()) {
        hash = (37 * hash) + SETTING_FIELD_NUMBER;
        hash = (53 * hash) + getSetting().hashCode();
      }
      if (hasCustomDungeonRoom()) {
        hash = (37 * hash) + CUSTOM_DUNGEON_ROOM_FIELD_NUMBER;
        hash = (53 * hash) + getCustomDungeonRoom().hashCode();
      }
      hash = (37 * hash) + IS_UPDATE_SETTING_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsUpdateSetting());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq prototype) {
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
     *   CMD_ID = 6222;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code SaveCustomDungeonRoomReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SaveCustomDungeonRoomReq)
        emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.internal_static_SaveCustomDungeonRoomReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.internal_static_SaveCustomDungeonRoomReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq.class, emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq.newBuilder()
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
        if (settingBuilder_ == null) {
          setting_ = null;
        } else {
          setting_ = null;
          settingBuilder_ = null;
        }
        if (customDungeonRoomBuilder_ == null) {
          customDungeonRoom_ = null;
        } else {
          customDungeonRoom_ = null;
          customDungeonRoomBuilder_ = null;
        }
        isUpdateSetting_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.internal_static_SaveCustomDungeonRoomReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq build() {
        emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq buildPartial() {
        emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq result = new emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq(this);
        if (settingBuilder_ == null) {
          result.setting_ = setting_;
        } else {
          result.setting_ = settingBuilder_.build();
        }
        if (customDungeonRoomBuilder_ == null) {
          result.customDungeonRoom_ = customDungeonRoom_;
        } else {
          result.customDungeonRoom_ = customDungeonRoomBuilder_.build();
        }
        result.isUpdateSetting_ = isUpdateSetting_;
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
        if (other instanceof emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq) {
          return mergeFrom((emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq other) {
        if (other == emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq.getDefaultInstance()) return this;
        if (other.hasSetting()) {
          mergeSetting(other.getSetting());
        }
        if (other.hasCustomDungeonRoom()) {
          mergeCustomDungeonRoom(other.getCustomDungeonRoom());
        }
        if (other.getIsUpdateSetting() != false) {
          setIsUpdateSetting(other.getIsUpdateSetting());
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
        emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.gingerps.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting setting_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting, emu.gingerps.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting.Builder, emu.gingerps.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSettingOrBuilder> settingBuilder_;
      /**
       * <code>.CustomDungeonSetting setting = 1;</code>
       * @return Whether the setting field is set.
       */
      public boolean hasSetting() {
        return settingBuilder_ != null || setting_ != null;
      }
      /**
       * <code>.CustomDungeonSetting setting = 1;</code>
       * @return The setting.
       */
      public emu.gingerps.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting getSetting() {
        if (settingBuilder_ == null) {
          return setting_ == null ? emu.gingerps.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting.getDefaultInstance() : setting_;
        } else {
          return settingBuilder_.getMessage();
        }
      }
      /**
       * <code>.CustomDungeonSetting setting = 1;</code>
       */
      public Builder setSetting(emu.gingerps.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting value) {
        if (settingBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          setting_ = value;
          onChanged();
        } else {
          settingBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.CustomDungeonSetting setting = 1;</code>
       */
      public Builder setSetting(
          emu.gingerps.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting.Builder builderForValue) {
        if (settingBuilder_ == null) {
          setting_ = builderForValue.build();
          onChanged();
        } else {
          settingBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.CustomDungeonSetting setting = 1;</code>
       */
      public Builder mergeSetting(emu.gingerps.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting value) {
        if (settingBuilder_ == null) {
          if (setting_ != null) {
            setting_ =
              emu.gingerps.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting.newBuilder(setting_).mergeFrom(value).buildPartial();
          } else {
            setting_ = value;
          }
          onChanged();
        } else {
          settingBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.CustomDungeonSetting setting = 1;</code>
       */
      public Builder clearSetting() {
        if (settingBuilder_ == null) {
          setting_ = null;
          onChanged();
        } else {
          setting_ = null;
          settingBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.CustomDungeonSetting setting = 1;</code>
       */
      public emu.gingerps.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting.Builder getSettingBuilder() {
        
        onChanged();
        return getSettingFieldBuilder().getBuilder();
      }
      /**
       * <code>.CustomDungeonSetting setting = 1;</code>
       */
      public emu.gingerps.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSettingOrBuilder getSettingOrBuilder() {
        if (settingBuilder_ != null) {
          return settingBuilder_.getMessageOrBuilder();
        } else {
          return setting_ == null ?
              emu.gingerps.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting.getDefaultInstance() : setting_;
        }
      }
      /**
       * <code>.CustomDungeonSetting setting = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting, emu.gingerps.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting.Builder, emu.gingerps.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSettingOrBuilder> 
          getSettingFieldBuilder() {
        if (settingBuilder_ == null) {
          settingBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting, emu.gingerps.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSetting.Builder, emu.gingerps.net.proto.CustomDungeonSettingOuterClass.CustomDungeonSettingOrBuilder>(
                  getSetting(),
                  getParentForChildren(),
                  isClean());
          setting_ = null;
        }
        return settingBuilder_;
      }

      private emu.gingerps.net.proto.CustomDungeonRoomOuterClass.CustomDungeonRoom customDungeonRoom_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.CustomDungeonRoomOuterClass.CustomDungeonRoom, emu.gingerps.net.proto.CustomDungeonRoomOuterClass.CustomDungeonRoom.Builder, emu.gingerps.net.proto.CustomDungeonRoomOuterClass.CustomDungeonRoomOrBuilder> customDungeonRoomBuilder_;
      /**
       * <code>.CustomDungeonRoom custom_dungeon_room = 4;</code>
       * @return Whether the customDungeonRoom field is set.
       */
      public boolean hasCustomDungeonRoom() {
        return customDungeonRoomBuilder_ != null || customDungeonRoom_ != null;
      }
      /**
       * <code>.CustomDungeonRoom custom_dungeon_room = 4;</code>
       * @return The customDungeonRoom.
       */
      public emu.gingerps.net.proto.CustomDungeonRoomOuterClass.CustomDungeonRoom getCustomDungeonRoom() {
        if (customDungeonRoomBuilder_ == null) {
          return customDungeonRoom_ == null ? emu.gingerps.net.proto.CustomDungeonRoomOuterClass.CustomDungeonRoom.getDefaultInstance() : customDungeonRoom_;
        } else {
          return customDungeonRoomBuilder_.getMessage();
        }
      }
      /**
       * <code>.CustomDungeonRoom custom_dungeon_room = 4;</code>
       */
      public Builder setCustomDungeonRoom(emu.gingerps.net.proto.CustomDungeonRoomOuterClass.CustomDungeonRoom value) {
        if (customDungeonRoomBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          customDungeonRoom_ = value;
          onChanged();
        } else {
          customDungeonRoomBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.CustomDungeonRoom custom_dungeon_room = 4;</code>
       */
      public Builder setCustomDungeonRoom(
          emu.gingerps.net.proto.CustomDungeonRoomOuterClass.CustomDungeonRoom.Builder builderForValue) {
        if (customDungeonRoomBuilder_ == null) {
          customDungeonRoom_ = builderForValue.build();
          onChanged();
        } else {
          customDungeonRoomBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.CustomDungeonRoom custom_dungeon_room = 4;</code>
       */
      public Builder mergeCustomDungeonRoom(emu.gingerps.net.proto.CustomDungeonRoomOuterClass.CustomDungeonRoom value) {
        if (customDungeonRoomBuilder_ == null) {
          if (customDungeonRoom_ != null) {
            customDungeonRoom_ =
              emu.gingerps.net.proto.CustomDungeonRoomOuterClass.CustomDungeonRoom.newBuilder(customDungeonRoom_).mergeFrom(value).buildPartial();
          } else {
            customDungeonRoom_ = value;
          }
          onChanged();
        } else {
          customDungeonRoomBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.CustomDungeonRoom custom_dungeon_room = 4;</code>
       */
      public Builder clearCustomDungeonRoom() {
        if (customDungeonRoomBuilder_ == null) {
          customDungeonRoom_ = null;
          onChanged();
        } else {
          customDungeonRoom_ = null;
          customDungeonRoomBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.CustomDungeonRoom custom_dungeon_room = 4;</code>
       */
      public emu.gingerps.net.proto.CustomDungeonRoomOuterClass.CustomDungeonRoom.Builder getCustomDungeonRoomBuilder() {
        
        onChanged();
        return getCustomDungeonRoomFieldBuilder().getBuilder();
      }
      /**
       * <code>.CustomDungeonRoom custom_dungeon_room = 4;</code>
       */
      public emu.gingerps.net.proto.CustomDungeonRoomOuterClass.CustomDungeonRoomOrBuilder getCustomDungeonRoomOrBuilder() {
        if (customDungeonRoomBuilder_ != null) {
          return customDungeonRoomBuilder_.getMessageOrBuilder();
        } else {
          return customDungeonRoom_ == null ?
              emu.gingerps.net.proto.CustomDungeonRoomOuterClass.CustomDungeonRoom.getDefaultInstance() : customDungeonRoom_;
        }
      }
      /**
       * <code>.CustomDungeonRoom custom_dungeon_room = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.CustomDungeonRoomOuterClass.CustomDungeonRoom, emu.gingerps.net.proto.CustomDungeonRoomOuterClass.CustomDungeonRoom.Builder, emu.gingerps.net.proto.CustomDungeonRoomOuterClass.CustomDungeonRoomOrBuilder> 
          getCustomDungeonRoomFieldBuilder() {
        if (customDungeonRoomBuilder_ == null) {
          customDungeonRoomBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.CustomDungeonRoomOuterClass.CustomDungeonRoom, emu.gingerps.net.proto.CustomDungeonRoomOuterClass.CustomDungeonRoom.Builder, emu.gingerps.net.proto.CustomDungeonRoomOuterClass.CustomDungeonRoomOrBuilder>(
                  getCustomDungeonRoom(),
                  getParentForChildren(),
                  isClean());
          customDungeonRoom_ = null;
        }
        return customDungeonRoomBuilder_;
      }

      private boolean isUpdateSetting_ ;
      /**
       * <code>bool is_update_setting = 12;</code>
       * @return The isUpdateSetting.
       */
      @java.lang.Override
      public boolean getIsUpdateSetting() {
        return isUpdateSetting_;
      }
      /**
       * <code>bool is_update_setting = 12;</code>
       * @param value The isUpdateSetting to set.
       * @return This builder for chaining.
       */
      public Builder setIsUpdateSetting(boolean value) {
        
        isUpdateSetting_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_update_setting = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsUpdateSetting() {
        
        isUpdateSetting_ = false;
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


      // @@protoc_insertion_point(builder_scope:SaveCustomDungeonRoomReq)
    }

    // @@protoc_insertion_point(class_scope:SaveCustomDungeonRoomReq)
    private static final emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq();
    }

    public static emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SaveCustomDungeonRoomReq>
        PARSER = new com.google.protobuf.AbstractParser<SaveCustomDungeonRoomReq>() {
      @java.lang.Override
      public SaveCustomDungeonRoomReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SaveCustomDungeonRoomReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SaveCustomDungeonRoomReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SaveCustomDungeonRoomReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.SaveCustomDungeonRoomReqOuterClass.SaveCustomDungeonRoomReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SaveCustomDungeonRoomReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SaveCustomDungeonRoomReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036SaveCustomDungeonRoomReq.proto\032\027Custom" +
      "DungeonRoom.proto\032\032CustomDungeonSetting." +
      "proto\"\216\001\n\030SaveCustomDungeonRoomReq\022&\n\007se" +
      "tting\030\001 \001(\0132\025.CustomDungeonSetting\022/\n\023cu" +
      "stom_dungeon_room\030\004 \001(\0132\022.CustomDungeonR" +
      "oom\022\031\n\021is_update_setting\030\014 \001(\010B\030\n\026emu.gi" +
      "ngerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.CustomDungeonRoomOuterClass.getDescriptor(),
          emu.gingerps.net.proto.CustomDungeonSettingOuterClass.getDescriptor(),
        });
    internal_static_SaveCustomDungeonRoomReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SaveCustomDungeonRoomReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SaveCustomDungeonRoomReq_descriptor,
        new java.lang.String[] { "Setting", "CustomDungeonRoom", "IsUpdateSetting", });
    emu.gingerps.net.proto.CustomDungeonRoomOuterClass.getDescriptor();
    emu.gingerps.net.proto.CustomDungeonSettingOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
