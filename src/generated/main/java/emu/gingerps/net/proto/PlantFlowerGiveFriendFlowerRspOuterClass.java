// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlantFlowerGiveFriendFlowerRsp.proto

package emu.gingerps.net.proto;

public final class PlantFlowerGiveFriendFlowerRspOuterClass {
  private PlantFlowerGiveFriendFlowerRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlantFlowerGiveFriendFlowerRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlantFlowerGiveFriendFlowerRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 limit_flower_list = 12;</code>
     * @return A list containing the limitFlowerList.
     */
    java.util.List<java.lang.Integer> getLimitFlowerListList();
    /**
     * <code>repeated uint32 limit_flower_list = 12;</code>
     * @return The count of limitFlowerList.
     */
    int getLimitFlowerListCount();
    /**
     * <code>repeated uint32 limit_flower_list = 12;</code>
     * @param index The index of the element to return.
     * @return The limitFlowerList at the given index.
     */
    int getLimitFlowerList(int index);

    /**
     * <code>uint32 schedule_id = 10;</code>
     * @return The scheduleId.
     */
    int getScheduleId();

    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8559;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code PlantFlowerGiveFriendFlowerRsp}
   */
  public static final class PlantFlowerGiveFriendFlowerRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlantFlowerGiveFriendFlowerRsp)
      PlantFlowerGiveFriendFlowerRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlantFlowerGiveFriendFlowerRsp.newBuilder() to construct.
    private PlantFlowerGiveFriendFlowerRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlantFlowerGiveFriendFlowerRsp() {
      limitFlowerList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlantFlowerGiveFriendFlowerRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlantFlowerGiveFriendFlowerRsp(
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
            case 80: {

              scheduleId_ = input.readUInt32();
              break;
            }
            case 96: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                limitFlowerList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              limitFlowerList_.addInt(input.readUInt32());
              break;
            }
            case 98: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                limitFlowerList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                limitFlowerList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 112: {

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
          limitFlowerList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.internal_static_PlantFlowerGiveFriendFlowerRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.internal_static_PlantFlowerGiveFriendFlowerRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp.class, emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp.Builder.class);
    }

    public static final int LIMIT_FLOWER_LIST_FIELD_NUMBER = 12;
    private com.google.protobuf.Internal.IntList limitFlowerList_;
    /**
     * <code>repeated uint32 limit_flower_list = 12;</code>
     * @return A list containing the limitFlowerList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getLimitFlowerListList() {
      return limitFlowerList_;
    }
    /**
     * <code>repeated uint32 limit_flower_list = 12;</code>
     * @return The count of limitFlowerList.
     */
    public int getLimitFlowerListCount() {
      return limitFlowerList_.size();
    }
    /**
     * <code>repeated uint32 limit_flower_list = 12;</code>
     * @param index The index of the element to return.
     * @return The limitFlowerList at the given index.
     */
    public int getLimitFlowerList(int index) {
      return limitFlowerList_.getInt(index);
    }
    private int limitFlowerListMemoizedSerializedSize = -1;

    public static final int SCHEDULE_ID_FIELD_NUMBER = 10;
    private int scheduleId_;
    /**
     * <code>uint32 schedule_id = 10;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 14;
    private int retcode_;
    /**
     * <code>int32 retcode = 14;</code>
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
      if (scheduleId_ != 0) {
        output.writeUInt32(10, scheduleId_);
      }
      if (getLimitFlowerListList().size() > 0) {
        output.writeUInt32NoTag(98);
        output.writeUInt32NoTag(limitFlowerListMemoizedSerializedSize);
      }
      for (int i = 0; i < limitFlowerList_.size(); i++) {
        output.writeUInt32NoTag(limitFlowerList_.getInt(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(14, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, scheduleId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < limitFlowerList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(limitFlowerList_.getInt(i));
        }
        size += dataSize;
        if (!getLimitFlowerListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        limitFlowerListMemoizedSerializedSize = dataSize;
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, retcode_);
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
      if (!(obj instanceof emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp other = (emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp) obj;

      if (!getLimitFlowerListList()
          .equals(other.getLimitFlowerListList())) return false;
      if (getScheduleId()
          != other.getScheduleId()) return false;
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
      if (getLimitFlowerListCount() > 0) {
        hash = (37 * hash) + LIMIT_FLOWER_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getLimitFlowerListList().hashCode();
      }
      hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp prototype) {
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
     *   CMD_ID = 8559;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code PlantFlowerGiveFriendFlowerRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlantFlowerGiveFriendFlowerRsp)
        emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.internal_static_PlantFlowerGiveFriendFlowerRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.internal_static_PlantFlowerGiveFriendFlowerRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp.class, emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp.newBuilder()
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
        limitFlowerList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        scheduleId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.internal_static_PlantFlowerGiveFriendFlowerRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp build() {
        emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp buildPartial() {
        emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp result = new emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          limitFlowerList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.limitFlowerList_ = limitFlowerList_;
        result.scheduleId_ = scheduleId_;
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
        if (other instanceof emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp) {
          return mergeFrom((emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp other) {
        if (other == emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp.getDefaultInstance()) return this;
        if (!other.limitFlowerList_.isEmpty()) {
          if (limitFlowerList_.isEmpty()) {
            limitFlowerList_ = other.limitFlowerList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLimitFlowerListIsMutable();
            limitFlowerList_.addAll(other.limitFlowerList_);
          }
          onChanged();
        }
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
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
        emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList limitFlowerList_ = emptyIntList();
      private void ensureLimitFlowerListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          limitFlowerList_ = mutableCopy(limitFlowerList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 limit_flower_list = 12;</code>
       * @return A list containing the limitFlowerList.
       */
      public java.util.List<java.lang.Integer>
          getLimitFlowerListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(limitFlowerList_) : limitFlowerList_;
      }
      /**
       * <code>repeated uint32 limit_flower_list = 12;</code>
       * @return The count of limitFlowerList.
       */
      public int getLimitFlowerListCount() {
        return limitFlowerList_.size();
      }
      /**
       * <code>repeated uint32 limit_flower_list = 12;</code>
       * @param index The index of the element to return.
       * @return The limitFlowerList at the given index.
       */
      public int getLimitFlowerList(int index) {
        return limitFlowerList_.getInt(index);
      }
      /**
       * <code>repeated uint32 limit_flower_list = 12;</code>
       * @param index The index to set the value at.
       * @param value The limitFlowerList to set.
       * @return This builder for chaining.
       */
      public Builder setLimitFlowerList(
          int index, int value) {
        ensureLimitFlowerListIsMutable();
        limitFlowerList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 limit_flower_list = 12;</code>
       * @param value The limitFlowerList to add.
       * @return This builder for chaining.
       */
      public Builder addLimitFlowerList(int value) {
        ensureLimitFlowerListIsMutable();
        limitFlowerList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 limit_flower_list = 12;</code>
       * @param values The limitFlowerList to add.
       * @return This builder for chaining.
       */
      public Builder addAllLimitFlowerList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureLimitFlowerListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, limitFlowerList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 limit_flower_list = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearLimitFlowerList() {
        limitFlowerList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int scheduleId_ ;
      /**
       * <code>uint32 schedule_id = 10;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 schedule_id = 10;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {
        
        scheduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 schedule_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        
        scheduleId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 14;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 14;</code>
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


      // @@protoc_insertion_point(builder_scope:PlantFlowerGiveFriendFlowerRsp)
    }

    // @@protoc_insertion_point(class_scope:PlantFlowerGiveFriendFlowerRsp)
    private static final emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp();
    }

    public static emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlantFlowerGiveFriendFlowerRsp>
        PARSER = new com.google.protobuf.AbstractParser<PlantFlowerGiveFriendFlowerRsp>() {
      @java.lang.Override
      public PlantFlowerGiveFriendFlowerRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlantFlowerGiveFriendFlowerRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlantFlowerGiveFriendFlowerRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlantFlowerGiveFriendFlowerRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.PlantFlowerGiveFriendFlowerRspOuterClass.PlantFlowerGiveFriendFlowerRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlantFlowerGiveFriendFlowerRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlantFlowerGiveFriendFlowerRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$PlantFlowerGiveFriendFlowerRsp.proto\"a" +
      "\n\036PlantFlowerGiveFriendFlowerRsp\022\031\n\021limi" +
      "t_flower_list\030\014 \003(\r\022\023\n\013schedule_id\030\n \001(\r" +
      "\022\017\n\007retcode\030\016 \001(\005B\030\n\026emu.gingerps.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlantFlowerGiveFriendFlowerRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlantFlowerGiveFriendFlowerRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlantFlowerGiveFriendFlowerRsp_descriptor,
        new java.lang.String[] { "LimitFlowerList", "ScheduleId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
