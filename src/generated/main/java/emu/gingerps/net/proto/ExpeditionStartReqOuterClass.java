// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ExpeditionStartReq.proto

package emu.gingerps.net.proto;

public final class ExpeditionStartReqOuterClass {
  private ExpeditionStartReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ExpeditionStartReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ExpeditionStartReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3300_AIEJKADFLKG = 10;</code>
     * @return The unk3300AIEJKADFLKG.
     */
    int getUnk3300AIEJKADFLKG();

    /**
     * <code>uint32 path_id = 3;</code>
     * @return The pathId.
     */
    int getPathId();

    /**
     * <code>uint32 Unk3300_AFGPGIIGAKA = 14;</code>
     * @return The unk3300AFGPGIIGAKA.
     */
    int getUnk3300AFGPGIIGAKA();

    /**
     * <code>repeated uint32 avatar_id_list = 7;</code>
     * @return A list containing the avatarIdList.
     */
    java.util.List<java.lang.Integer> getAvatarIdListList();
    /**
     * <code>repeated uint32 avatar_id_list = 7;</code>
     * @return The count of avatarIdList.
     */
    int getAvatarIdListCount();
    /**
     * <code>repeated uint32 avatar_id_list = 7;</code>
     * @param index The index of the element to return.
     * @return The avatarIdList at the given index.
     */
    int getAvatarIdList(int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 2016;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ExpeditionStartReq}
   */
  public static final class ExpeditionStartReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ExpeditionStartReq)
      ExpeditionStartReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ExpeditionStartReq.newBuilder() to construct.
    private ExpeditionStartReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ExpeditionStartReq() {
      avatarIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ExpeditionStartReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ExpeditionStartReq(
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

              pathId_ = input.readUInt32();
              break;
            }
            case 56: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                avatarIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              avatarIdList_.addInt(input.readUInt32());
              break;
            }
            case 58: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                avatarIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                avatarIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 80: {

              unk3300AIEJKADFLKG_ = input.readUInt32();
              break;
            }
            case 112: {

              unk3300AFGPGIIGAKA_ = input.readUInt32();
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
          avatarIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.ExpeditionStartReqOuterClass.internal_static_ExpeditionStartReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.ExpeditionStartReqOuterClass.internal_static_ExpeditionStartReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq.class, emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq.Builder.class);
    }

    public static final int UNK3300_AIEJKADFLKG_FIELD_NUMBER = 10;
    private int unk3300AIEJKADFLKG_;
    /**
     * <code>uint32 Unk3300_AIEJKADFLKG = 10;</code>
     * @return The unk3300AIEJKADFLKG.
     */
    @java.lang.Override
    public int getUnk3300AIEJKADFLKG() {
      return unk3300AIEJKADFLKG_;
    }

    public static final int PATH_ID_FIELD_NUMBER = 3;
    private int pathId_;
    /**
     * <code>uint32 path_id = 3;</code>
     * @return The pathId.
     */
    @java.lang.Override
    public int getPathId() {
      return pathId_;
    }

    public static final int UNK3300_AFGPGIIGAKA_FIELD_NUMBER = 14;
    private int unk3300AFGPGIIGAKA_;
    /**
     * <code>uint32 Unk3300_AFGPGIIGAKA = 14;</code>
     * @return The unk3300AFGPGIIGAKA.
     */
    @java.lang.Override
    public int getUnk3300AFGPGIIGAKA() {
      return unk3300AFGPGIIGAKA_;
    }

    public static final int AVATAR_ID_LIST_FIELD_NUMBER = 7;
    private com.google.protobuf.Internal.IntList avatarIdList_;
    /**
     * <code>repeated uint32 avatar_id_list = 7;</code>
     * @return A list containing the avatarIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getAvatarIdListList() {
      return avatarIdList_;
    }
    /**
     * <code>repeated uint32 avatar_id_list = 7;</code>
     * @return The count of avatarIdList.
     */
    public int getAvatarIdListCount() {
      return avatarIdList_.size();
    }
    /**
     * <code>repeated uint32 avatar_id_list = 7;</code>
     * @param index The index of the element to return.
     * @return The avatarIdList at the given index.
     */
    public int getAvatarIdList(int index) {
      return avatarIdList_.getInt(index);
    }
    private int avatarIdListMemoizedSerializedSize = -1;

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
      if (pathId_ != 0) {
        output.writeUInt32(3, pathId_);
      }
      if (getAvatarIdListList().size() > 0) {
        output.writeUInt32NoTag(58);
        output.writeUInt32NoTag(avatarIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < avatarIdList_.size(); i++) {
        output.writeUInt32NoTag(avatarIdList_.getInt(i));
      }
      if (unk3300AIEJKADFLKG_ != 0) {
        output.writeUInt32(10, unk3300AIEJKADFLKG_);
      }
      if (unk3300AFGPGIIGAKA_ != 0) {
        output.writeUInt32(14, unk3300AFGPGIIGAKA_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (pathId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, pathId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < avatarIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(avatarIdList_.getInt(i));
        }
        size += dataSize;
        if (!getAvatarIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        avatarIdListMemoizedSerializedSize = dataSize;
      }
      if (unk3300AIEJKADFLKG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, unk3300AIEJKADFLKG_);
      }
      if (unk3300AFGPGIIGAKA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, unk3300AFGPGIIGAKA_);
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
      if (!(obj instanceof emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq other = (emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq) obj;

      if (getUnk3300AIEJKADFLKG()
          != other.getUnk3300AIEJKADFLKG()) return false;
      if (getPathId()
          != other.getPathId()) return false;
      if (getUnk3300AFGPGIIGAKA()
          != other.getUnk3300AFGPGIIGAKA()) return false;
      if (!getAvatarIdListList()
          .equals(other.getAvatarIdListList())) return false;
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
      hash = (37 * hash) + UNK3300_AIEJKADFLKG_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300AIEJKADFLKG();
      hash = (37 * hash) + PATH_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPathId();
      hash = (37 * hash) + UNK3300_AFGPGIIGAKA_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300AFGPGIIGAKA();
      if (getAvatarIdListCount() > 0) {
        hash = (37 * hash) + AVATAR_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAvatarIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq prototype) {
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
     *   CMD_ID = 2016;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ExpeditionStartReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ExpeditionStartReq)
        emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.ExpeditionStartReqOuterClass.internal_static_ExpeditionStartReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.ExpeditionStartReqOuterClass.internal_static_ExpeditionStartReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq.class, emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq.newBuilder()
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
        unk3300AIEJKADFLKG_ = 0;

        pathId_ = 0;

        unk3300AFGPGIIGAKA_ = 0;

        avatarIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.ExpeditionStartReqOuterClass.internal_static_ExpeditionStartReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq build() {
        emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq buildPartial() {
        emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq result = new emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq(this);
        int from_bitField0_ = bitField0_;
        result.unk3300AIEJKADFLKG_ = unk3300AIEJKADFLKG_;
        result.pathId_ = pathId_;
        result.unk3300AFGPGIIGAKA_ = unk3300AFGPGIIGAKA_;
        if (((bitField0_ & 0x00000001) != 0)) {
          avatarIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.avatarIdList_ = avatarIdList_;
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
        if (other instanceof emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq) {
          return mergeFrom((emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq other) {
        if (other == emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq.getDefaultInstance()) return this;
        if (other.getUnk3300AIEJKADFLKG() != 0) {
          setUnk3300AIEJKADFLKG(other.getUnk3300AIEJKADFLKG());
        }
        if (other.getPathId() != 0) {
          setPathId(other.getPathId());
        }
        if (other.getUnk3300AFGPGIIGAKA() != 0) {
          setUnk3300AFGPGIIGAKA(other.getUnk3300AFGPGIIGAKA());
        }
        if (!other.avatarIdList_.isEmpty()) {
          if (avatarIdList_.isEmpty()) {
            avatarIdList_ = other.avatarIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAvatarIdListIsMutable();
            avatarIdList_.addAll(other.avatarIdList_);
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
        emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int unk3300AIEJKADFLKG_ ;
      /**
       * <code>uint32 Unk3300_AIEJKADFLKG = 10;</code>
       * @return The unk3300AIEJKADFLKG.
       */
      @java.lang.Override
      public int getUnk3300AIEJKADFLKG() {
        return unk3300AIEJKADFLKG_;
      }
      /**
       * <code>uint32 Unk3300_AIEJKADFLKG = 10;</code>
       * @param value The unk3300AIEJKADFLKG to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300AIEJKADFLKG(int value) {
        
        unk3300AIEJKADFLKG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_AIEJKADFLKG = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300AIEJKADFLKG() {
        
        unk3300AIEJKADFLKG_ = 0;
        onChanged();
        return this;
      }

      private int pathId_ ;
      /**
       * <code>uint32 path_id = 3;</code>
       * @return The pathId.
       */
      @java.lang.Override
      public int getPathId() {
        return pathId_;
      }
      /**
       * <code>uint32 path_id = 3;</code>
       * @param value The pathId to set.
       * @return This builder for chaining.
       */
      public Builder setPathId(int value) {
        
        pathId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 path_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearPathId() {
        
        pathId_ = 0;
        onChanged();
        return this;
      }

      private int unk3300AFGPGIIGAKA_ ;
      /**
       * <code>uint32 Unk3300_AFGPGIIGAKA = 14;</code>
       * @return The unk3300AFGPGIIGAKA.
       */
      @java.lang.Override
      public int getUnk3300AFGPGIIGAKA() {
        return unk3300AFGPGIIGAKA_;
      }
      /**
       * <code>uint32 Unk3300_AFGPGIIGAKA = 14;</code>
       * @param value The unk3300AFGPGIIGAKA to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300AFGPGIIGAKA(int value) {
        
        unk3300AFGPGIIGAKA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_AFGPGIIGAKA = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300AFGPGIIGAKA() {
        
        unk3300AFGPGIIGAKA_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList avatarIdList_ = emptyIntList();
      private void ensureAvatarIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          avatarIdList_ = mutableCopy(avatarIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 avatar_id_list = 7;</code>
       * @return A list containing the avatarIdList.
       */
      public java.util.List<java.lang.Integer>
          getAvatarIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(avatarIdList_) : avatarIdList_;
      }
      /**
       * <code>repeated uint32 avatar_id_list = 7;</code>
       * @return The count of avatarIdList.
       */
      public int getAvatarIdListCount() {
        return avatarIdList_.size();
      }
      /**
       * <code>repeated uint32 avatar_id_list = 7;</code>
       * @param index The index of the element to return.
       * @return The avatarIdList at the given index.
       */
      public int getAvatarIdList(int index) {
        return avatarIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 avatar_id_list = 7;</code>
       * @param index The index to set the value at.
       * @param value The avatarIdList to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarIdList(
          int index, int value) {
        ensureAvatarIdListIsMutable();
        avatarIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 avatar_id_list = 7;</code>
       * @param value The avatarIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAvatarIdList(int value) {
        ensureAvatarIdListIsMutable();
        avatarIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 avatar_id_list = 7;</code>
       * @param values The avatarIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllAvatarIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureAvatarIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, avatarIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 avatar_id_list = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarIdList() {
        avatarIdList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:ExpeditionStartReq)
    }

    // @@protoc_insertion_point(class_scope:ExpeditionStartReq)
    private static final emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq();
    }

    public static emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ExpeditionStartReq>
        PARSER = new com.google.protobuf.AbstractParser<ExpeditionStartReq>() {
      @java.lang.Override
      public ExpeditionStartReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ExpeditionStartReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ExpeditionStartReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ExpeditionStartReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.ExpeditionStartReqOuterClass.ExpeditionStartReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ExpeditionStartReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ExpeditionStartReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030ExpeditionStartReq.proto\"w\n\022Expedition" +
      "StartReq\022\033\n\023Unk3300_AIEJKADFLKG\030\n \001(\r\022\017\n" +
      "\007path_id\030\003 \001(\r\022\033\n\023Unk3300_AFGPGIIGAKA\030\016 " +
      "\001(\r\022\026\n\016avatar_id_list\030\007 \003(\rB\033\n\031emu.grass" +
      "cutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ExpeditionStartReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ExpeditionStartReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ExpeditionStartReq_descriptor,
        new java.lang.String[] { "Unk3300AIEJKADFLKG", "PathId", "Unk3300AFGPGIIGAKA", "AvatarIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
