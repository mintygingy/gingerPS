// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FungusFighterPlotInfoNotify.proto

package emu.gingerps.net.proto;

public final class FungusFighterPlotInfoNotifyOuterClass {
  private FungusFighterPlotInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FungusFighterPlotInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FungusFighterPlotInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 dungeon_id = 12;</code>
     * @return The dungeonId.
     */
    int getDungeonId();

    /**
     * <code>repeated uint32 fungus_id_list = 8;</code>
     * @return A list containing the fungusIdList.
     */
    java.util.List<java.lang.Integer> getFungusIdListList();
    /**
     * <code>repeated uint32 fungus_id_list = 8;</code>
     * @return The count of fungusIdList.
     */
    int getFungusIdListCount();
    /**
     * <code>repeated uint32 fungus_id_list = 8;</code>
     * @param index The index of the element to return.
     * @return The fungusIdList at the given index.
     */
    int getFungusIdList(int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 23920;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code FungusFighterPlotInfoNotify}
   */
  public static final class FungusFighterPlotInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FungusFighterPlotInfoNotify)
      FungusFighterPlotInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FungusFighterPlotInfoNotify.newBuilder() to construct.
    private FungusFighterPlotInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FungusFighterPlotInfoNotify() {
      fungusIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FungusFighterPlotInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FungusFighterPlotInfoNotify(
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
            case 64: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                fungusIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              fungusIdList_.addInt(input.readUInt32());
              break;
            }
            case 66: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                fungusIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                fungusIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 96: {

              dungeonId_ = input.readUInt32();
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
          fungusIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.internal_static_FungusFighterPlotInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.internal_static_FungusFighterPlotInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify.class, emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify.Builder.class);
    }

    public static final int DUNGEON_ID_FIELD_NUMBER = 12;
    private int dungeonId_;
    /**
     * <code>uint32 dungeon_id = 12;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
    }

    public static final int FUNGUS_ID_LIST_FIELD_NUMBER = 8;
    private com.google.protobuf.Internal.IntList fungusIdList_;
    /**
     * <code>repeated uint32 fungus_id_list = 8;</code>
     * @return A list containing the fungusIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getFungusIdListList() {
      return fungusIdList_;
    }
    /**
     * <code>repeated uint32 fungus_id_list = 8;</code>
     * @return The count of fungusIdList.
     */
    public int getFungusIdListCount() {
      return fungusIdList_.size();
    }
    /**
     * <code>repeated uint32 fungus_id_list = 8;</code>
     * @param index The index of the element to return.
     * @return The fungusIdList at the given index.
     */
    public int getFungusIdList(int index) {
      return fungusIdList_.getInt(index);
    }
    private int fungusIdListMemoizedSerializedSize = -1;

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
      if (getFungusIdListList().size() > 0) {
        output.writeUInt32NoTag(66);
        output.writeUInt32NoTag(fungusIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < fungusIdList_.size(); i++) {
        output.writeUInt32NoTag(fungusIdList_.getInt(i));
      }
      if (dungeonId_ != 0) {
        output.writeUInt32(12, dungeonId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < fungusIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(fungusIdList_.getInt(i));
        }
        size += dataSize;
        if (!getFungusIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        fungusIdListMemoizedSerializedSize = dataSize;
      }
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, dungeonId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify other = (emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify) obj;

      if (getDungeonId()
          != other.getDungeonId()) return false;
      if (!getFungusIdListList()
          .equals(other.getFungusIdListList())) return false;
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
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      if (getFungusIdListCount() > 0) {
        hash = (37 * hash) + FUNGUS_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getFungusIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify prototype) {
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
     *   CMD_ID = 23920;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code FungusFighterPlotInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FungusFighterPlotInfoNotify)
        emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.internal_static_FungusFighterPlotInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.internal_static_FungusFighterPlotInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify.class, emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify.newBuilder()
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
        dungeonId_ = 0;

        fungusIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.internal_static_FungusFighterPlotInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify build() {
        emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify buildPartial() {
        emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify result = new emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify(this);
        int from_bitField0_ = bitField0_;
        result.dungeonId_ = dungeonId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          fungusIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.fungusIdList_ = fungusIdList_;
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
        if (other instanceof emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify) {
          return mergeFrom((emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify other) {
        if (other == emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify.getDefaultInstance()) return this;
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
        }
        if (!other.fungusIdList_.isEmpty()) {
          if (fungusIdList_.isEmpty()) {
            fungusIdList_ = other.fungusIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFungusIdListIsMutable();
            fungusIdList_.addAll(other.fungusIdList_);
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
        emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeon_id = 12;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeon_id = 12;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        
        dungeonId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList fungusIdList_ = emptyIntList();
      private void ensureFungusIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          fungusIdList_ = mutableCopy(fungusIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 fungus_id_list = 8;</code>
       * @return A list containing the fungusIdList.
       */
      public java.util.List<java.lang.Integer>
          getFungusIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(fungusIdList_) : fungusIdList_;
      }
      /**
       * <code>repeated uint32 fungus_id_list = 8;</code>
       * @return The count of fungusIdList.
       */
      public int getFungusIdListCount() {
        return fungusIdList_.size();
      }
      /**
       * <code>repeated uint32 fungus_id_list = 8;</code>
       * @param index The index of the element to return.
       * @return The fungusIdList at the given index.
       */
      public int getFungusIdList(int index) {
        return fungusIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 fungus_id_list = 8;</code>
       * @param index The index to set the value at.
       * @param value The fungusIdList to set.
       * @return This builder for chaining.
       */
      public Builder setFungusIdList(
          int index, int value) {
        ensureFungusIdListIsMutable();
        fungusIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fungus_id_list = 8;</code>
       * @param value The fungusIdList to add.
       * @return This builder for chaining.
       */
      public Builder addFungusIdList(int value) {
        ensureFungusIdListIsMutable();
        fungusIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fungus_id_list = 8;</code>
       * @param values The fungusIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllFungusIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureFungusIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fungusIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fungus_id_list = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearFungusIdList() {
        fungusIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:FungusFighterPlotInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:FungusFighterPlotInfoNotify)
    private static final emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify();
    }

    public static emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FungusFighterPlotInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<FungusFighterPlotInfoNotify>() {
      @java.lang.Override
      public FungusFighterPlotInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FungusFighterPlotInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FungusFighterPlotInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FungusFighterPlotInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.FungusFighterPlotInfoNotifyOuterClass.FungusFighterPlotInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FungusFighterPlotInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FungusFighterPlotInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!FungusFighterPlotInfoNotify.proto\"I\n\033F" +
      "ungusFighterPlotInfoNotify\022\022\n\ndungeon_id" +
      "\030\014 \001(\r\022\026\n\016fungus_id_list\030\010 \003(\rB\030\n\026emu.gi" +
      "ngerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FungusFighterPlotInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FungusFighterPlotInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FungusFighterPlotInfoNotify_descriptor,
        new java.lang.String[] { "DungeonId", "FungusIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
