// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeModuleComfortInfo.proto

package emu.gingerps.net.proto;

public final class HomeModuleComfortInfoOuterClass {
  private HomeModuleComfortInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeModuleComfortInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeModuleComfortInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 room_scene_comfort_value = 5;</code>
     * @return The roomSceneComfortValue.
     */
    int getRoomSceneComfortValue();

    /**
     * <code>repeated uint32 world_scene_block_comfort_value_list = 10;</code>
     * @return A list containing the worldSceneBlockComfortValueList.
     */
    java.util.List<java.lang.Integer> getWorldSceneBlockComfortValueListList();
    /**
     * <code>repeated uint32 world_scene_block_comfort_value_list = 10;</code>
     * @return The count of worldSceneBlockComfortValueList.
     */
    int getWorldSceneBlockComfortValueListCount();
    /**
     * <code>repeated uint32 world_scene_block_comfort_value_list = 10;</code>
     * @param index The index of the element to return.
     * @return The worldSceneBlockComfortValueList at the given index.
     */
    int getWorldSceneBlockComfortValueList(int index);

    /**
     * <code>uint32 module_id = 15;</code>
     * @return The moduleId.
     */
    int getModuleId();
  }
  /**
   * Protobuf type {@code HomeModuleComfortInfo}
   */
  public static final class HomeModuleComfortInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeModuleComfortInfo)
      HomeModuleComfortInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeModuleComfortInfo.newBuilder() to construct.
    private HomeModuleComfortInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeModuleComfortInfo() {
      worldSceneBlockComfortValueList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeModuleComfortInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.internal_static_HomeModuleComfortInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.internal_static_HomeModuleComfortInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo.class, emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo.Builder.class);
    }

    public static final int ROOM_SCENE_COMFORT_VALUE_FIELD_NUMBER = 5;
    private int roomSceneComfortValue_ = 0;
    /**
     * <code>uint32 room_scene_comfort_value = 5;</code>
     * @return The roomSceneComfortValue.
     */
    @java.lang.Override
    public int getRoomSceneComfortValue() {
      return roomSceneComfortValue_;
    }

    public static final int WORLD_SCENE_BLOCK_COMFORT_VALUE_LIST_FIELD_NUMBER = 10;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList worldSceneBlockComfortValueList_;
    /**
     * <code>repeated uint32 world_scene_block_comfort_value_list = 10;</code>
     * @return A list containing the worldSceneBlockComfortValueList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getWorldSceneBlockComfortValueListList() {
      return worldSceneBlockComfortValueList_;
    }
    /**
     * <code>repeated uint32 world_scene_block_comfort_value_list = 10;</code>
     * @return The count of worldSceneBlockComfortValueList.
     */
    public int getWorldSceneBlockComfortValueListCount() {
      return worldSceneBlockComfortValueList_.size();
    }
    /**
     * <code>repeated uint32 world_scene_block_comfort_value_list = 10;</code>
     * @param index The index of the element to return.
     * @return The worldSceneBlockComfortValueList at the given index.
     */
    public int getWorldSceneBlockComfortValueList(int index) {
      return worldSceneBlockComfortValueList_.getInt(index);
    }
    private int worldSceneBlockComfortValueListMemoizedSerializedSize = -1;

    public static final int MODULE_ID_FIELD_NUMBER = 15;
    private int moduleId_ = 0;
    /**
     * <code>uint32 module_id = 15;</code>
     * @return The moduleId.
     */
    @java.lang.Override
    public int getModuleId() {
      return moduleId_;
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
      if (roomSceneComfortValue_ != 0) {
        output.writeUInt32(5, roomSceneComfortValue_);
      }
      if (getWorldSceneBlockComfortValueListList().size() > 0) {
        output.writeUInt32NoTag(82);
        output.writeUInt32NoTag(worldSceneBlockComfortValueListMemoizedSerializedSize);
      }
      for (int i = 0; i < worldSceneBlockComfortValueList_.size(); i++) {
        output.writeUInt32NoTag(worldSceneBlockComfortValueList_.getInt(i));
      }
      if (moduleId_ != 0) {
        output.writeUInt32(15, moduleId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (roomSceneComfortValue_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, roomSceneComfortValue_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < worldSceneBlockComfortValueList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(worldSceneBlockComfortValueList_.getInt(i));
        }
        size += dataSize;
        if (!getWorldSceneBlockComfortValueListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        worldSceneBlockComfortValueListMemoizedSerializedSize = dataSize;
      }
      if (moduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, moduleId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo other = (emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo) obj;

      if (getRoomSceneComfortValue()
          != other.getRoomSceneComfortValue()) return false;
      if (!getWorldSceneBlockComfortValueListList()
          .equals(other.getWorldSceneBlockComfortValueListList())) return false;
      if (getModuleId()
          != other.getModuleId()) return false;
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
      hash = (37 * hash) + ROOM_SCENE_COMFORT_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getRoomSceneComfortValue();
      if (getWorldSceneBlockComfortValueListCount() > 0) {
        hash = (37 * hash) + WORLD_SCENE_BLOCK_COMFORT_VALUE_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getWorldSceneBlockComfortValueListList().hashCode();
      }
      hash = (37 * hash) + MODULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getModuleId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo prototype) {
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
     * Protobuf type {@code HomeModuleComfortInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeModuleComfortInfo)
        emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.internal_static_HomeModuleComfortInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.internal_static_HomeModuleComfortInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo.class, emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo.newBuilder()
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
        roomSceneComfortValue_ = 0;
        worldSceneBlockComfortValueList_ = emptyIntList();
        moduleId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.internal_static_HomeModuleComfortInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo build() {
        emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo buildPartial() {
        emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo result = new emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo result) {
        if (((bitField0_ & 0x00000002) != 0)) {
          worldSceneBlockComfortValueList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.worldSceneBlockComfortValueList_ = worldSceneBlockComfortValueList_;
      }

      private void buildPartial0(emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.roomSceneComfortValue_ = roomSceneComfortValue_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.moduleId_ = moduleId_;
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
        if (other instanceof emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo) {
          return mergeFrom((emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo other) {
        if (other == emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo.getDefaultInstance()) return this;
        if (other.getRoomSceneComfortValue() != 0) {
          setRoomSceneComfortValue(other.getRoomSceneComfortValue());
        }
        if (!other.worldSceneBlockComfortValueList_.isEmpty()) {
          if (worldSceneBlockComfortValueList_.isEmpty()) {
            worldSceneBlockComfortValueList_ = other.worldSceneBlockComfortValueList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureWorldSceneBlockComfortValueListIsMutable();
            worldSceneBlockComfortValueList_.addAll(other.worldSceneBlockComfortValueList_);
          }
          onChanged();
        }
        if (other.getModuleId() != 0) {
          setModuleId(other.getModuleId());
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
              case 40: {
                roomSceneComfortValue_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 40
              case 80: {
                int v = input.readUInt32();
                ensureWorldSceneBlockComfortValueListIsMutable();
                worldSceneBlockComfortValueList_.addInt(v);
                break;
              } // case 80
              case 82: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureWorldSceneBlockComfortValueListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  worldSceneBlockComfortValueList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 82
              case 120: {
                moduleId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 120
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

      private int roomSceneComfortValue_ ;
      /**
       * <code>uint32 room_scene_comfort_value = 5;</code>
       * @return The roomSceneComfortValue.
       */
      @java.lang.Override
      public int getRoomSceneComfortValue() {
        return roomSceneComfortValue_;
      }
      /**
       * <code>uint32 room_scene_comfort_value = 5;</code>
       * @param value The roomSceneComfortValue to set.
       * @return This builder for chaining.
       */
      public Builder setRoomSceneComfortValue(int value) {
        
        roomSceneComfortValue_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 room_scene_comfort_value = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearRoomSceneComfortValue() {
        bitField0_ = (bitField0_ & ~0x00000001);
        roomSceneComfortValue_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList worldSceneBlockComfortValueList_ = emptyIntList();
      private void ensureWorldSceneBlockComfortValueListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          worldSceneBlockComfortValueList_ = mutableCopy(worldSceneBlockComfortValueList_);
          bitField0_ |= 0x00000002;
        }
      }
      /**
       * <code>repeated uint32 world_scene_block_comfort_value_list = 10;</code>
       * @return A list containing the worldSceneBlockComfortValueList.
       */
      public java.util.List<java.lang.Integer>
          getWorldSceneBlockComfortValueListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(worldSceneBlockComfortValueList_) : worldSceneBlockComfortValueList_;
      }
      /**
       * <code>repeated uint32 world_scene_block_comfort_value_list = 10;</code>
       * @return The count of worldSceneBlockComfortValueList.
       */
      public int getWorldSceneBlockComfortValueListCount() {
        return worldSceneBlockComfortValueList_.size();
      }
      /**
       * <code>repeated uint32 world_scene_block_comfort_value_list = 10;</code>
       * @param index The index of the element to return.
       * @return The worldSceneBlockComfortValueList at the given index.
       */
      public int getWorldSceneBlockComfortValueList(int index) {
        return worldSceneBlockComfortValueList_.getInt(index);
      }
      /**
       * <code>repeated uint32 world_scene_block_comfort_value_list = 10;</code>
       * @param index The index to set the value at.
       * @param value The worldSceneBlockComfortValueList to set.
       * @return This builder for chaining.
       */
      public Builder setWorldSceneBlockComfortValueList(
          int index, int value) {
        
        ensureWorldSceneBlockComfortValueListIsMutable();
        worldSceneBlockComfortValueList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 world_scene_block_comfort_value_list = 10;</code>
       * @param value The worldSceneBlockComfortValueList to add.
       * @return This builder for chaining.
       */
      public Builder addWorldSceneBlockComfortValueList(int value) {
        
        ensureWorldSceneBlockComfortValueListIsMutable();
        worldSceneBlockComfortValueList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 world_scene_block_comfort_value_list = 10;</code>
       * @param values The worldSceneBlockComfortValueList to add.
       * @return This builder for chaining.
       */
      public Builder addAllWorldSceneBlockComfortValueList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureWorldSceneBlockComfortValueListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, worldSceneBlockComfortValueList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 world_scene_block_comfort_value_list = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearWorldSceneBlockComfortValueList() {
        worldSceneBlockComfortValueList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      private int moduleId_ ;
      /**
       * <code>uint32 module_id = 15;</code>
       * @return The moduleId.
       */
      @java.lang.Override
      public int getModuleId() {
        return moduleId_;
      }
      /**
       * <code>uint32 module_id = 15;</code>
       * @param value The moduleId to set.
       * @return This builder for chaining.
       */
      public Builder setModuleId(int value) {
        
        moduleId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 module_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearModuleId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        moduleId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomeModuleComfortInfo)
    }

    // @@protoc_insertion_point(class_scope:HomeModuleComfortInfo)
    private static final emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo();
    }

    public static emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeModuleComfortInfo>
        PARSER = new com.google.protobuf.AbstractParser<HomeModuleComfortInfo>() {
      @java.lang.Override
      public HomeModuleComfortInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeModuleComfortInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeModuleComfortInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.HomeModuleComfortInfoOuterClass.HomeModuleComfortInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeModuleComfortInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeModuleComfortInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033HomeModuleComfortInfo.proto\"z\n\025HomeMod" +
      "uleComfortInfo\022 \n\030room_scene_comfort_val" +
      "ue\030\005 \001(\r\022,\n$world_scene_block_comfort_va" +
      "lue_list\030\n \003(\r\022\021\n\tmodule_id\030\017 \001(\rB\030\n\026emu" +
      ".gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeModuleComfortInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeModuleComfortInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeModuleComfortInfo_descriptor,
        new java.lang.String[] { "RoomSceneComfortValue", "WorldSceneBlockComfortValueList", "ModuleId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
