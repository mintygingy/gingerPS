// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BrickBreakerSelectAvatarRsp.proto

package emu.gingerps.net.proto;

public final class BrickBreakerSelectAvatarRspOuterClass {
  private BrickBreakerSelectAvatarRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BrickBreakerSelectAvatarRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BrickBreakerSelectAvatarRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated uint32 avatar_id = 9;</code>
     * @return A list containing the avatarId.
     */
    java.util.List<java.lang.Integer> getAvatarIdList();
    /**
     * <code>repeated uint32 avatar_id = 9;</code>
     * @return The count of avatarId.
     */
    int getAvatarIdCount();
    /**
     * <code>repeated uint32 avatar_id = 9;</code>
     * @param index The index of the element to return.
     * @return The avatarId at the given index.
     */
    int getAvatarId(int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 5359;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code BrickBreakerSelectAvatarRsp}
   */
  public static final class BrickBreakerSelectAvatarRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BrickBreakerSelectAvatarRsp)
      BrickBreakerSelectAvatarRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BrickBreakerSelectAvatarRsp.newBuilder() to construct.
    private BrickBreakerSelectAvatarRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BrickBreakerSelectAvatarRsp() {
      avatarId_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BrickBreakerSelectAvatarRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.internal_static_BrickBreakerSelectAvatarRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.internal_static_BrickBreakerSelectAvatarRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp.class, emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp.Builder.class);
    }

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

    public static final int AVATAR_ID_FIELD_NUMBER = 9;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList avatarId_;
    /**
     * <code>repeated uint32 avatar_id = 9;</code>
     * @return A list containing the avatarId.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getAvatarIdList() {
      return avatarId_;
    }
    /**
     * <code>repeated uint32 avatar_id = 9;</code>
     * @return The count of avatarId.
     */
    public int getAvatarIdCount() {
      return avatarId_.size();
    }
    /**
     * <code>repeated uint32 avatar_id = 9;</code>
     * @param index The index of the element to return.
     * @return The avatarId at the given index.
     */
    public int getAvatarId(int index) {
      return avatarId_.getInt(index);
    }
    private int avatarIdMemoizedSerializedSize = -1;

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
      if (getAvatarIdList().size() > 0) {
        output.writeUInt32NoTag(74);
        output.writeUInt32NoTag(avatarIdMemoizedSerializedSize);
      }
      for (int i = 0; i < avatarId_.size(); i++) {
        output.writeUInt32NoTag(avatarId_.getInt(i));
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
        for (int i = 0; i < avatarId_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(avatarId_.getInt(i));
        }
        size += dataSize;
        if (!getAvatarIdList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        avatarIdMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp other = (emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getAvatarIdList()
          .equals(other.getAvatarIdList())) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (getAvatarIdCount() > 0) {
        hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
        hash = (53 * hash) + getAvatarIdList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp prototype) {
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
     *   CMD_ID = 5359;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code BrickBreakerSelectAvatarRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BrickBreakerSelectAvatarRsp)
        emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.internal_static_BrickBreakerSelectAvatarRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.internal_static_BrickBreakerSelectAvatarRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp.class, emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp.newBuilder()
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
        retcode_ = 0;
        avatarId_ = emptyIntList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.internal_static_BrickBreakerSelectAvatarRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp build() {
        emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp buildPartial() {
        emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp result = new emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp result) {
        if (((bitField0_ & 0x00000002) != 0)) {
          avatarId_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.avatarId_ = avatarId_;
      }

      private void buildPartial0(emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
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
        if (other instanceof emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp) {
          return mergeFrom((emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp other) {
        if (other == emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (!other.avatarId_.isEmpty()) {
          if (avatarId_.isEmpty()) {
            avatarId_ = other.avatarId_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureAvatarIdIsMutable();
            avatarId_.addAll(other.avatarId_);
          }
          onChanged();
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
              case 72: {
                int v = input.readUInt32();
                ensureAvatarIdIsMutable();
                avatarId_.addInt(v);
                break;
              } // case 72
              case 74: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureAvatarIdIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  avatarId_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 74
              case 112: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000001;
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
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList avatarId_ = emptyIntList();
      private void ensureAvatarIdIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          avatarId_ = mutableCopy(avatarId_);
          bitField0_ |= 0x00000002;
        }
      }
      /**
       * <code>repeated uint32 avatar_id = 9;</code>
       * @return A list containing the avatarId.
       */
      public java.util.List<java.lang.Integer>
          getAvatarIdList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(avatarId_) : avatarId_;
      }
      /**
       * <code>repeated uint32 avatar_id = 9;</code>
       * @return The count of avatarId.
       */
      public int getAvatarIdCount() {
        return avatarId_.size();
      }
      /**
       * <code>repeated uint32 avatar_id = 9;</code>
       * @param index The index of the element to return.
       * @return The avatarId at the given index.
       */
      public int getAvatarId(int index) {
        return avatarId_.getInt(index);
      }
      /**
       * <code>repeated uint32 avatar_id = 9;</code>
       * @param index The index to set the value at.
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(
          int index, int value) {
        
        ensureAvatarIdIsMutable();
        avatarId_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 avatar_id = 9;</code>
       * @param value The avatarId to add.
       * @return This builder for chaining.
       */
      public Builder addAvatarId(int value) {
        
        ensureAvatarIdIsMutable();
        avatarId_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 avatar_id = 9;</code>
       * @param values The avatarId to add.
       * @return This builder for chaining.
       */
      public Builder addAllAvatarId(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureAvatarIdIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, avatarId_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 avatar_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        avatarId_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:BrickBreakerSelectAvatarRsp)
    }

    // @@protoc_insertion_point(class_scope:BrickBreakerSelectAvatarRsp)
    private static final emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp();
    }

    public static emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BrickBreakerSelectAvatarRsp>
        PARSER = new com.google.protobuf.AbstractParser<BrickBreakerSelectAvatarRsp>() {
      @java.lang.Override
      public BrickBreakerSelectAvatarRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<BrickBreakerSelectAvatarRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BrickBreakerSelectAvatarRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.BrickBreakerSelectAvatarRspOuterClass.BrickBreakerSelectAvatarRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BrickBreakerSelectAvatarRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BrickBreakerSelectAvatarRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!BrickBreakerSelectAvatarRsp.proto\"A\n\033B" +
      "rickBreakerSelectAvatarRsp\022\017\n\007retcode\030\016 " +
      "\001(\005\022\021\n\tavatar_id\030\t \003(\rB\030\n\026emu.gingerps.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BrickBreakerSelectAvatarRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BrickBreakerSelectAvatarRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BrickBreakerSelectAvatarRsp_descriptor,
        new java.lang.String[] { "Retcode", "AvatarId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
