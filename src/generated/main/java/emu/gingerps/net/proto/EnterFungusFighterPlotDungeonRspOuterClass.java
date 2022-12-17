// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EnterFungusFighterPlotDungeonRsp.proto

package emu.gingerps.net.proto;

public final class EnterFungusFighterPlotDungeonRspOuterClass {
  private EnterFungusFighterPlotDungeonRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EnterFungusFighterPlotDungeonRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EnterFungusFighterPlotDungeonRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 fungus_id_list = 14;</code>
     * @return A list containing the fungusIdList.
     */
    java.util.List<java.lang.Integer> getFungusIdListList();
    /**
     * <code>repeated uint32 fungus_id_list = 14;</code>
     * @return The count of fungusIdList.
     */
    int getFungusIdListCount();
    /**
     * <code>repeated uint32 fungus_id_list = 14;</code>
     * @param index The index of the element to return.
     * @return The fungusIdList at the given index.
     */
    int getFungusIdList(int index);

    /**
     * <code>uint32 dungeon_id = 8;</code>
     * @return The dungeonId.
     */
    int getDungeonId();

    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 20791;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code EnterFungusFighterPlotDungeonRsp}
   */
  public static final class EnterFungusFighterPlotDungeonRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EnterFungusFighterPlotDungeonRsp)
      EnterFungusFighterPlotDungeonRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EnterFungusFighterPlotDungeonRsp.newBuilder() to construct.
    private EnterFungusFighterPlotDungeonRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EnterFungusFighterPlotDungeonRsp() {
      fungusIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EnterFungusFighterPlotDungeonRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EnterFungusFighterPlotDungeonRsp(
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

              retcode_ = input.readInt32();
              break;
            }
            case 64: {

              dungeonId_ = input.readUInt32();
              break;
            }
            case 112: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                fungusIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              fungusIdList_.addInt(input.readUInt32());
              break;
            }
            case 114: {
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
      return emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.internal_static_EnterFungusFighterPlotDungeonRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.internal_static_EnterFungusFighterPlotDungeonRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp.class, emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp.Builder.class);
    }

    public static final int FUNGUS_ID_LIST_FIELD_NUMBER = 14;
    private com.google.protobuf.Internal.IntList fungusIdList_;
    /**
     * <code>repeated uint32 fungus_id_list = 14;</code>
     * @return A list containing the fungusIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getFungusIdListList() {
      return fungusIdList_;
    }
    /**
     * <code>repeated uint32 fungus_id_list = 14;</code>
     * @return The count of fungusIdList.
     */
    public int getFungusIdListCount() {
      return fungusIdList_.size();
    }
    /**
     * <code>repeated uint32 fungus_id_list = 14;</code>
     * @param index The index of the element to return.
     * @return The fungusIdList at the given index.
     */
    public int getFungusIdList(int index) {
      return fungusIdList_.getInt(index);
    }
    private int fungusIdListMemoizedSerializedSize = -1;

    public static final int DUNGEON_ID_FIELD_NUMBER = 8;
    private int dungeonId_;
    /**
     * <code>uint32 dungeon_id = 8;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 4;
    private int retcode_;
    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (retcode_ != 0) {
        output.writeInt32(4, retcode_);
      }
      if (dungeonId_ != 0) {
        output.writeUInt32(8, dungeonId_);
      }
      if (getFungusIdListList().size() > 0) {
        output.writeUInt32NoTag(114);
        output.writeUInt32NoTag(fungusIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < fungusIdList_.size(); i++) {
        output.writeUInt32NoTag(fungusIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, retcode_);
      }
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, dungeonId_);
      }
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
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp other = (emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp) obj;

      if (!getFungusIdListList()
          .equals(other.getFungusIdListList())) return false;
      if (getDungeonId()
          != other.getDungeonId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      if (getFungusIdListCount() > 0) {
        hash = (37 * hash) + FUNGUS_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getFungusIdListList().hashCode();
      }
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp prototype) {
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
     *   CMD_ID = 20791;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code EnterFungusFighterPlotDungeonRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EnterFungusFighterPlotDungeonRsp)
        emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.internal_static_EnterFungusFighterPlotDungeonRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.internal_static_EnterFungusFighterPlotDungeonRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp.class, emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp.newBuilder()
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
        fungusIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        dungeonId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.internal_static_EnterFungusFighterPlotDungeonRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp build() {
        emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp buildPartial() {
        emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp result = new emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          fungusIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.fungusIdList_ = fungusIdList_;
        result.dungeonId_ = dungeonId_;
        result.retcode_ = retcode_;
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
        if (other instanceof emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp) {
          return mergeFrom((emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp other) {
        if (other == emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp.getDefaultInstance()) return this;
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
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList fungusIdList_ = emptyIntList();
      private void ensureFungusIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          fungusIdList_ = mutableCopy(fungusIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 fungus_id_list = 14;</code>
       * @return A list containing the fungusIdList.
       */
      public java.util.List<java.lang.Integer>
          getFungusIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(fungusIdList_) : fungusIdList_;
      }
      /**
       * <code>repeated uint32 fungus_id_list = 14;</code>
       * @return The count of fungusIdList.
       */
      public int getFungusIdListCount() {
        return fungusIdList_.size();
      }
      /**
       * <code>repeated uint32 fungus_id_list = 14;</code>
       * @param index The index of the element to return.
       * @return The fungusIdList at the given index.
       */
      public int getFungusIdList(int index) {
        return fungusIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 fungus_id_list = 14;</code>
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
       * <code>repeated uint32 fungus_id_list = 14;</code>
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
       * <code>repeated uint32 fungus_id_list = 14;</code>
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
       * <code>repeated uint32 fungus_id_list = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearFungusIdList() {
        fungusIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeon_id = 8;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeon_id = 8;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        
        dungeonId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 4;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EnterFungusFighterPlotDungeonRsp)
    }

    // @@protoc_insertion_point(class_scope:EnterFungusFighterPlotDungeonRsp)
    private static final emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp();
    }

    public static emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EnterFungusFighterPlotDungeonRsp>
        PARSER = new com.google.protobuf.AbstractParser<EnterFungusFighterPlotDungeonRsp>() {
      @java.lang.Override
      public EnterFungusFighterPlotDungeonRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EnterFungusFighterPlotDungeonRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EnterFungusFighterPlotDungeonRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EnterFungusFighterPlotDungeonRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.EnterFungusFighterPlotDungeonRspOuterClass.EnterFungusFighterPlotDungeonRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnterFungusFighterPlotDungeonRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnterFungusFighterPlotDungeonRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&EnterFungusFighterPlotDungeonRsp.proto" +
      "\"_\n EnterFungusFighterPlotDungeonRsp\022\026\n\016" +
      "fungus_id_list\030\016 \003(\r\022\022\n\ndungeon_id\030\010 \001(\r" +
      "\022\017\n\007retcode\030\004 \001(\005B\030\n\026emu.gingerps.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EnterFungusFighterPlotDungeonRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EnterFungusFighterPlotDungeonRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnterFungusFighterPlotDungeonRsp_descriptor,
        new java.lang.String[] { "FungusIdList", "DungeonId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
