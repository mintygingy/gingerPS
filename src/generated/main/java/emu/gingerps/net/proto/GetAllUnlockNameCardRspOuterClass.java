// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetAllUnlockNameCardRsp.proto

package emu.gingerps.net.proto;

public final class GetAllUnlockNameCardRspOuterClass {
  private GetAllUnlockNameCardRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetAllUnlockNameCardRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetAllUnlockNameCardRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 name_card_list = 11;</code>
     * @return A list containing the nameCardList.
     */
    java.util.List<java.lang.Integer> getNameCardListList();
    /**
     * <code>repeated uint32 name_card_list = 11;</code>
     * @return The count of nameCardList.
     */
    int getNameCardListCount();
    /**
     * <code>repeated uint32 name_card_list = 11;</code>
     * @param index The index of the element to return.
     * @return The nameCardList at the given index.
     */
    int getNameCardList(int index);

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
   *   CMD_ID = 4005;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GetAllUnlockNameCardRsp}
   */
  public static final class GetAllUnlockNameCardRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetAllUnlockNameCardRsp)
      GetAllUnlockNameCardRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetAllUnlockNameCardRsp.newBuilder() to construct.
    private GetAllUnlockNameCardRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetAllUnlockNameCardRsp() {
      nameCardList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetAllUnlockNameCardRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.internal_static_GetAllUnlockNameCardRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.internal_static_GetAllUnlockNameCardRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp.class, emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp.Builder.class);
    }

    public static final int NAME_CARD_LIST_FIELD_NUMBER = 11;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList nameCardList_;
    /**
     * <code>repeated uint32 name_card_list = 11;</code>
     * @return A list containing the nameCardList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getNameCardListList() {
      return nameCardList_;
    }
    /**
     * <code>repeated uint32 name_card_list = 11;</code>
     * @return The count of nameCardList.
     */
    public int getNameCardListCount() {
      return nameCardList_.size();
    }
    /**
     * <code>repeated uint32 name_card_list = 11;</code>
     * @param index The index of the element to return.
     * @return The nameCardList at the given index.
     */
    public int getNameCardList(int index) {
      return nameCardList_.getInt(index);
    }
    private int nameCardListMemoizedSerializedSize = -1;

    public static final int RETCODE_FIELD_NUMBER = 14;
    private int retcode_ = 0;
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
      if (getNameCardListList().size() > 0) {
        output.writeUInt32NoTag(90);
        output.writeUInt32NoTag(nameCardListMemoizedSerializedSize);
      }
      for (int i = 0; i < nameCardList_.size(); i++) {
        output.writeUInt32NoTag(nameCardList_.getInt(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(14, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < nameCardList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(nameCardList_.getInt(i));
        }
        size += dataSize;
        if (!getNameCardListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        nameCardListMemoizedSerializedSize = dataSize;
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, retcode_);
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
      if (!(obj instanceof emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp other = (emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp) obj;

      if (!getNameCardListList()
          .equals(other.getNameCardListList())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      if (getNameCardListCount() > 0) {
        hash = (37 * hash) + NAME_CARD_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getNameCardListList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp prototype) {
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
     *   CMD_ID = 4005;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GetAllUnlockNameCardRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetAllUnlockNameCardRsp)
        emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.internal_static_GetAllUnlockNameCardRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.internal_static_GetAllUnlockNameCardRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp.class, emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp.newBuilder()
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
        nameCardList_ = emptyIntList();
        retcode_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.internal_static_GetAllUnlockNameCardRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp build() {
        emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp buildPartial() {
        emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp result = new emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp result) {
        if (((bitField0_ & 0x00000001) != 0)) {
          nameCardList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.nameCardList_ = nameCardList_;
      }

      private void buildPartial0(emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.retcode_ = retcode_;
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
        if (other instanceof emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp) {
          return mergeFrom((emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp other) {
        if (other == emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp.getDefaultInstance()) return this;
        if (!other.nameCardList_.isEmpty()) {
          if (nameCardList_.isEmpty()) {
            nameCardList_ = other.nameCardList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNameCardListIsMutable();
            nameCardList_.addAll(other.nameCardList_);
          }
          onChanged();
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
              case 88: {
                int v = input.readUInt32();
                ensureNameCardListIsMutable();
                nameCardList_.addInt(v);
                break;
              } // case 88
              case 90: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureNameCardListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  nameCardList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 90
              case 112: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 112
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

      private com.google.protobuf.Internal.IntList nameCardList_ = emptyIntList();
      private void ensureNameCardListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          nameCardList_ = mutableCopy(nameCardList_);
          bitField0_ |= 0x00000001;
        }
      }
      /**
       * <code>repeated uint32 name_card_list = 11;</code>
       * @return A list containing the nameCardList.
       */
      public java.util.List<java.lang.Integer>
          getNameCardListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(nameCardList_) : nameCardList_;
      }
      /**
       * <code>repeated uint32 name_card_list = 11;</code>
       * @return The count of nameCardList.
       */
      public int getNameCardListCount() {
        return nameCardList_.size();
      }
      /**
       * <code>repeated uint32 name_card_list = 11;</code>
       * @param index The index of the element to return.
       * @return The nameCardList at the given index.
       */
      public int getNameCardList(int index) {
        return nameCardList_.getInt(index);
      }
      /**
       * <code>repeated uint32 name_card_list = 11;</code>
       * @param index The index to set the value at.
       * @param value The nameCardList to set.
       * @return This builder for chaining.
       */
      public Builder setNameCardList(
          int index, int value) {
        
        ensureNameCardListIsMutable();
        nameCardList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 name_card_list = 11;</code>
       * @param value The nameCardList to add.
       * @return This builder for chaining.
       */
      public Builder addNameCardList(int value) {
        
        ensureNameCardListIsMutable();
        nameCardList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 name_card_list = 11;</code>
       * @param values The nameCardList to add.
       * @return This builder for chaining.
       */
      public Builder addAllNameCardList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureNameCardListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, nameCardList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 name_card_list = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearNameCardList() {
        nameCardList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:GetAllUnlockNameCardRsp)
    }

    // @@protoc_insertion_point(class_scope:GetAllUnlockNameCardRsp)
    private static final emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp();
    }

    public static emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetAllUnlockNameCardRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetAllUnlockNameCardRsp>() {
      @java.lang.Override
      public GetAllUnlockNameCardRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetAllUnlockNameCardRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetAllUnlockNameCardRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.GetAllUnlockNameCardRspOuterClass.GetAllUnlockNameCardRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetAllUnlockNameCardRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetAllUnlockNameCardRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035GetAllUnlockNameCardRsp.proto\"B\n\027GetAl" +
      "lUnlockNameCardRsp\022\026\n\016name_card_list\030\013 \003" +
      "(\r\022\017\n\007retcode\030\016 \001(\005B\030\n\026emu.gingerps.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetAllUnlockNameCardRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetAllUnlockNameCardRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetAllUnlockNameCardRsp_descriptor,
        new java.lang.String[] { "NameCardList", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
