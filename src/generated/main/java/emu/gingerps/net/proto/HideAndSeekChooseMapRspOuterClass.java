// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HideAndSeekChooseMapRsp.proto

package emu.gingerps.net.proto;

public final class HideAndSeekChooseMapRspOuterClass {
  private HideAndSeekChooseMapRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HideAndSeekChooseMapRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HideAndSeekChooseMapRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 map_list = 11;</code>
     * @return A list containing the mapList.
     */
    java.util.List<java.lang.Integer> getMapListList();
    /**
     * <code>repeated uint32 map_list = 11;</code>
     * @return The count of mapList.
     */
    int getMapListCount();
    /**
     * <code>repeated uint32 map_list = 11;</code>
     * @param index The index of the element to return.
     * @return The mapList at the given index.
     */
    int getMapList(int index);

    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8501;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code HideAndSeekChooseMapRsp}
   */
  public static final class HideAndSeekChooseMapRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HideAndSeekChooseMapRsp)
      HideAndSeekChooseMapRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HideAndSeekChooseMapRsp.newBuilder() to construct.
    private HideAndSeekChooseMapRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HideAndSeekChooseMapRsp() {
      mapList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HideAndSeekChooseMapRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HideAndSeekChooseMapRsp(
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
            case 88: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                mapList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              mapList_.addInt(input.readUInt32());
              break;
            }
            case 90: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                mapList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                mapList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 120: {

              retcode_ = input.readInt32();
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
          mapList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.internal_static_HideAndSeekChooseMapRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.internal_static_HideAndSeekChooseMapRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp.class, emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp.Builder.class);
    }

    public static final int MAP_LIST_FIELD_NUMBER = 11;
    private com.google.protobuf.Internal.IntList mapList_;
    /**
     * <code>repeated uint32 map_list = 11;</code>
     * @return A list containing the mapList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getMapListList() {
      return mapList_;
    }
    /**
     * <code>repeated uint32 map_list = 11;</code>
     * @return The count of mapList.
     */
    public int getMapListCount() {
      return mapList_.size();
    }
    /**
     * <code>repeated uint32 map_list = 11;</code>
     * @param index The index of the element to return.
     * @return The mapList at the given index.
     */
    public int getMapList(int index) {
      return mapList_.getInt(index);
    }
    private int mapListMemoizedSerializedSize = -1;

    public static final int RETCODE_FIELD_NUMBER = 15;
    private int retcode_;
    /**
     * <code>int32 retcode = 15;</code>
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
      if (getMapListList().size() > 0) {
        output.writeUInt32NoTag(90);
        output.writeUInt32NoTag(mapListMemoizedSerializedSize);
      }
      for (int i = 0; i < mapList_.size(); i++) {
        output.writeUInt32NoTag(mapList_.getInt(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(15, retcode_);
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
        for (int i = 0; i < mapList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(mapList_.getInt(i));
        }
        size += dataSize;
        if (!getMapListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        mapListMemoizedSerializedSize = dataSize;
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(15, retcode_);
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
      if (!(obj instanceof emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp other = (emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp) obj;

      if (!getMapListList()
          .equals(other.getMapListList())) return false;
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
      if (getMapListCount() > 0) {
        hash = (37 * hash) + MAP_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMapListList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp prototype) {
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
     *   CMD_ID = 8501;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code HideAndSeekChooseMapRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HideAndSeekChooseMapRsp)
        emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.internal_static_HideAndSeekChooseMapRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.internal_static_HideAndSeekChooseMapRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp.class, emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp.newBuilder()
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
        mapList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.internal_static_HideAndSeekChooseMapRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp build() {
        emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp buildPartial() {
        emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp result = new emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          mapList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.mapList_ = mapList_;
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
        if (other instanceof emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp) {
          return mergeFrom((emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp other) {
        if (other == emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp.getDefaultInstance()) return this;
        if (!other.mapList_.isEmpty()) {
          if (mapList_.isEmpty()) {
            mapList_ = other.mapList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMapListIsMutable();
            mapList_.addAll(other.mapList_);
          }
          onChanged();
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
        emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList mapList_ = emptyIntList();
      private void ensureMapListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          mapList_ = mutableCopy(mapList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 map_list = 11;</code>
       * @return A list containing the mapList.
       */
      public java.util.List<java.lang.Integer>
          getMapListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(mapList_) : mapList_;
      }
      /**
       * <code>repeated uint32 map_list = 11;</code>
       * @return The count of mapList.
       */
      public int getMapListCount() {
        return mapList_.size();
      }
      /**
       * <code>repeated uint32 map_list = 11;</code>
       * @param index The index of the element to return.
       * @return The mapList at the given index.
       */
      public int getMapList(int index) {
        return mapList_.getInt(index);
      }
      /**
       * <code>repeated uint32 map_list = 11;</code>
       * @param index The index to set the value at.
       * @param value The mapList to set.
       * @return This builder for chaining.
       */
      public Builder setMapList(
          int index, int value) {
        ensureMapListIsMutable();
        mapList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 map_list = 11;</code>
       * @param value The mapList to add.
       * @return This builder for chaining.
       */
      public Builder addMapList(int value) {
        ensureMapListIsMutable();
        mapList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 map_list = 11;</code>
       * @param values The mapList to add.
       * @return This builder for chaining.
       */
      public Builder addAllMapList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureMapListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mapList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 map_list = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearMapList() {
        mapList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 15;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 15;</code>
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


      // @@protoc_insertion_point(builder_scope:HideAndSeekChooseMapRsp)
    }

    // @@protoc_insertion_point(class_scope:HideAndSeekChooseMapRsp)
    private static final emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp();
    }

    public static emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HideAndSeekChooseMapRsp>
        PARSER = new com.google.protobuf.AbstractParser<HideAndSeekChooseMapRsp>() {
      @java.lang.Override
      public HideAndSeekChooseMapRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HideAndSeekChooseMapRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HideAndSeekChooseMapRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HideAndSeekChooseMapRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.HideAndSeekChooseMapRspOuterClass.HideAndSeekChooseMapRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HideAndSeekChooseMapRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HideAndSeekChooseMapRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035HideAndSeekChooseMapRsp.proto\"<\n\027HideA" +
      "ndSeekChooseMapRsp\022\020\n\010map_list\030\013 \003(\r\022\017\n\007" +
      "retcode\030\017 \001(\005B\030\n\026emu.gingerps.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HideAndSeekChooseMapRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HideAndSeekChooseMapRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HideAndSeekChooseMapRsp_descriptor,
        new java.lang.String[] { "MapList", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
