// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LunaRiteSacrificeRsp.proto

package emu.gingerps.net.proto;

public final class LunaRiteSacrificeRspOuterClass {
  private LunaRiteSacrificeRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LunaRiteSacrificeRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LunaRiteSacrificeRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 sacrifice_list = 11;</code>
     * @return A list containing the sacrificeList.
     */
    java.util.List<java.lang.Integer> getSacrificeListList();
    /**
     * <code>repeated uint32 sacrifice_list = 11;</code>
     * @return The count of sacrificeList.
     */
    int getSacrificeListCount();
    /**
     * <code>repeated uint32 sacrifice_list = 11;</code>
     * @param index The index of the element to return.
     * @return The sacrificeList at the given index.
     */
    int getSacrificeList(int index);

    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 index = 3;</code>
     * @return The index.
     */
    int getIndex();

    /**
     * <code>uint32 area_id = 14;</code>
     * @return The areaId.
     */
    int getAreaId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8215;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code LunaRiteSacrificeRsp}
   */
  public static final class LunaRiteSacrificeRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LunaRiteSacrificeRsp)
      LunaRiteSacrificeRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LunaRiteSacrificeRsp.newBuilder() to construct.
    private LunaRiteSacrificeRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LunaRiteSacrificeRsp() {
      sacrificeList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LunaRiteSacrificeRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LunaRiteSacrificeRsp(
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
            case 24: {

              index_ = input.readUInt32();
              break;
            }
            case 88: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                sacrificeList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              sacrificeList_.addInt(input.readUInt32());
              break;
            }
            case 90: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                sacrificeList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                sacrificeList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 96: {

              retcode_ = input.readInt32();
              break;
            }
            case 112: {

              areaId_ = input.readUInt32();
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
          sacrificeList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.internal_static_LunaRiteSacrificeRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.internal_static_LunaRiteSacrificeRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp.class, emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp.Builder.class);
    }

    public static final int SACRIFICE_LIST_FIELD_NUMBER = 11;
    private com.google.protobuf.Internal.IntList sacrificeList_;
    /**
     * <code>repeated uint32 sacrifice_list = 11;</code>
     * @return A list containing the sacrificeList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getSacrificeListList() {
      return sacrificeList_;
    }
    /**
     * <code>repeated uint32 sacrifice_list = 11;</code>
     * @return The count of sacrificeList.
     */
    public int getSacrificeListCount() {
      return sacrificeList_.size();
    }
    /**
     * <code>repeated uint32 sacrifice_list = 11;</code>
     * @param index The index of the element to return.
     * @return The sacrificeList at the given index.
     */
    public int getSacrificeList(int index) {
      return sacrificeList_.getInt(index);
    }
    private int sacrificeListMemoizedSerializedSize = -1;

    public static final int RETCODE_FIELD_NUMBER = 12;
    private int retcode_;
    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int INDEX_FIELD_NUMBER = 3;
    private int index_;
    /**
     * <code>uint32 index = 3;</code>
     * @return The index.
     */
    @java.lang.Override
    public int getIndex() {
      return index_;
    }

    public static final int AREA_ID_FIELD_NUMBER = 14;
    private int areaId_;
    /**
     * <code>uint32 area_id = 14;</code>
     * @return The areaId.
     */
    @java.lang.Override
    public int getAreaId() {
      return areaId_;
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
      if (index_ != 0) {
        output.writeUInt32(3, index_);
      }
      if (getSacrificeListList().size() > 0) {
        output.writeUInt32NoTag(90);
        output.writeUInt32NoTag(sacrificeListMemoizedSerializedSize);
      }
      for (int i = 0; i < sacrificeList_.size(); i++) {
        output.writeUInt32NoTag(sacrificeList_.getInt(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(12, retcode_);
      }
      if (areaId_ != 0) {
        output.writeUInt32(14, areaId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (index_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, index_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < sacrificeList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(sacrificeList_.getInt(i));
        }
        size += dataSize;
        if (!getSacrificeListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        sacrificeListMemoizedSerializedSize = dataSize;
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12, retcode_);
      }
      if (areaId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, areaId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp other = (emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp) obj;

      if (!getSacrificeListList()
          .equals(other.getSacrificeListList())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getIndex()
          != other.getIndex()) return false;
      if (getAreaId()
          != other.getAreaId()) return false;
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
      if (getSacrificeListCount() > 0) {
        hash = (37 * hash) + SACRIFICE_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSacrificeListList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getIndex();
      hash = (37 * hash) + AREA_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAreaId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp prototype) {
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
     *   CMD_ID = 8215;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code LunaRiteSacrificeRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LunaRiteSacrificeRsp)
        emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.internal_static_LunaRiteSacrificeRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.internal_static_LunaRiteSacrificeRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp.class, emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp.newBuilder()
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
        sacrificeList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;

        index_ = 0;

        areaId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.internal_static_LunaRiteSacrificeRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp build() {
        emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp buildPartial() {
        emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp result = new emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          sacrificeList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.sacrificeList_ = sacrificeList_;
        result.retcode_ = retcode_;
        result.index_ = index_;
        result.areaId_ = areaId_;
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
        if (other instanceof emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp) {
          return mergeFrom((emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp other) {
        if (other == emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp.getDefaultInstance()) return this;
        if (!other.sacrificeList_.isEmpty()) {
          if (sacrificeList_.isEmpty()) {
            sacrificeList_ = other.sacrificeList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSacrificeListIsMutable();
            sacrificeList_.addAll(other.sacrificeList_);
          }
          onChanged();
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getIndex() != 0) {
          setIndex(other.getIndex());
        }
        if (other.getAreaId() != 0) {
          setAreaId(other.getAreaId());
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
        emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList sacrificeList_ = emptyIntList();
      private void ensureSacrificeListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          sacrificeList_ = mutableCopy(sacrificeList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 sacrifice_list = 11;</code>
       * @return A list containing the sacrificeList.
       */
      public java.util.List<java.lang.Integer>
          getSacrificeListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(sacrificeList_) : sacrificeList_;
      }
      /**
       * <code>repeated uint32 sacrifice_list = 11;</code>
       * @return The count of sacrificeList.
       */
      public int getSacrificeListCount() {
        return sacrificeList_.size();
      }
      /**
       * <code>repeated uint32 sacrifice_list = 11;</code>
       * @param index The index of the element to return.
       * @return The sacrificeList at the given index.
       */
      public int getSacrificeList(int index) {
        return sacrificeList_.getInt(index);
      }
      /**
       * <code>repeated uint32 sacrifice_list = 11;</code>
       * @param index The index to set the value at.
       * @param value The sacrificeList to set.
       * @return This builder for chaining.
       */
      public Builder setSacrificeList(
          int index, int value) {
        ensureSacrificeListIsMutable();
        sacrificeList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 sacrifice_list = 11;</code>
       * @param value The sacrificeList to add.
       * @return This builder for chaining.
       */
      public Builder addSacrificeList(int value) {
        ensureSacrificeListIsMutable();
        sacrificeList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 sacrifice_list = 11;</code>
       * @param values The sacrificeList to add.
       * @return This builder for chaining.
       */
      public Builder addAllSacrificeList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureSacrificeListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, sacrificeList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 sacrifice_list = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearSacrificeList() {
        sacrificeList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 12;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int index_ ;
      /**
       * <code>uint32 index = 3;</code>
       * @return The index.
       */
      @java.lang.Override
      public int getIndex() {
        return index_;
      }
      /**
       * <code>uint32 index = 3;</code>
       * @param value The index to set.
       * @return This builder for chaining.
       */
      public Builder setIndex(int value) {
        
        index_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 index = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIndex() {
        
        index_ = 0;
        onChanged();
        return this;
      }

      private int areaId_ ;
      /**
       * <code>uint32 area_id = 14;</code>
       * @return The areaId.
       */
      @java.lang.Override
      public int getAreaId() {
        return areaId_;
      }
      /**
       * <code>uint32 area_id = 14;</code>
       * @param value The areaId to set.
       * @return This builder for chaining.
       */
      public Builder setAreaId(int value) {
        
        areaId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 area_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearAreaId() {
        
        areaId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:LunaRiteSacrificeRsp)
    }

    // @@protoc_insertion_point(class_scope:LunaRiteSacrificeRsp)
    private static final emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp();
    }

    public static emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LunaRiteSacrificeRsp>
        PARSER = new com.google.protobuf.AbstractParser<LunaRiteSacrificeRsp>() {
      @java.lang.Override
      public LunaRiteSacrificeRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LunaRiteSacrificeRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LunaRiteSacrificeRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LunaRiteSacrificeRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.LunaRiteSacrificeRspOuterClass.LunaRiteSacrificeRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LunaRiteSacrificeRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LunaRiteSacrificeRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032LunaRiteSacrificeRsp.proto\"_\n\024LunaRite" +
      "SacrificeRsp\022\026\n\016sacrifice_list\030\013 \003(\r\022\017\n\007" +
      "retcode\030\014 \001(\005\022\r\n\005index\030\003 \001(\r\022\017\n\007area_id\030" +
      "\016 \001(\rB\030\n\026emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LunaRiteSacrificeRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LunaRiteSacrificeRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LunaRiteSacrificeRsp_descriptor,
        new java.lang.String[] { "SacrificeList", "Retcode", "Index", "AreaId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
