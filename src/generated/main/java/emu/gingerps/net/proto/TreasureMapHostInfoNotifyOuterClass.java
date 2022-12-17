// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TreasureMapHostInfoNotify.proto

package emu.gingerps.net.proto;

public final class TreasureMapHostInfoNotifyOuterClass {
  private TreasureMapHostInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TreasureMapHostInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TreasureMapHostInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 mp_challenge_region_list = 1;</code>
     * @return A list containing the mpChallengeRegionList.
     */
    java.util.List<java.lang.Integer> getMpChallengeRegionListList();
    /**
     * <code>repeated uint32 mp_challenge_region_list = 1;</code>
     * @return The count of mpChallengeRegionList.
     */
    int getMpChallengeRegionListCount();
    /**
     * <code>repeated uint32 mp_challenge_region_list = 1;</code>
     * @param index The index of the element to return.
     * @return The mpChallengeRegionList at the given index.
     */
    int getMpChallengeRegionList(int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8296;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code TreasureMapHostInfoNotify}
   */
  public static final class TreasureMapHostInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TreasureMapHostInfoNotify)
      TreasureMapHostInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TreasureMapHostInfoNotify.newBuilder() to construct.
    private TreasureMapHostInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TreasureMapHostInfoNotify() {
      mpChallengeRegionList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TreasureMapHostInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TreasureMapHostInfoNotify(
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
            case 8: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                mpChallengeRegionList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              mpChallengeRegionList_.addInt(input.readUInt32());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                mpChallengeRegionList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                mpChallengeRegionList_.addInt(input.readUInt32());
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
          mpChallengeRegionList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.internal_static_TreasureMapHostInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.internal_static_TreasureMapHostInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify.class, emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify.Builder.class);
    }

    public static final int MP_CHALLENGE_REGION_LIST_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.IntList mpChallengeRegionList_;
    /**
     * <code>repeated uint32 mp_challenge_region_list = 1;</code>
     * @return A list containing the mpChallengeRegionList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getMpChallengeRegionListList() {
      return mpChallengeRegionList_;
    }
    /**
     * <code>repeated uint32 mp_challenge_region_list = 1;</code>
     * @return The count of mpChallengeRegionList.
     */
    public int getMpChallengeRegionListCount() {
      return mpChallengeRegionList_.size();
    }
    /**
     * <code>repeated uint32 mp_challenge_region_list = 1;</code>
     * @param index The index of the element to return.
     * @return The mpChallengeRegionList at the given index.
     */
    public int getMpChallengeRegionList(int index) {
      return mpChallengeRegionList_.getInt(index);
    }
    private int mpChallengeRegionListMemoizedSerializedSize = -1;

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
      if (getMpChallengeRegionListList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(mpChallengeRegionListMemoizedSerializedSize);
      }
      for (int i = 0; i < mpChallengeRegionList_.size(); i++) {
        output.writeUInt32NoTag(mpChallengeRegionList_.getInt(i));
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
        for (int i = 0; i < mpChallengeRegionList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(mpChallengeRegionList_.getInt(i));
        }
        size += dataSize;
        if (!getMpChallengeRegionListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        mpChallengeRegionListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify other = (emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify) obj;

      if (!getMpChallengeRegionListList()
          .equals(other.getMpChallengeRegionListList())) return false;
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
      if (getMpChallengeRegionListCount() > 0) {
        hash = (37 * hash) + MP_CHALLENGE_REGION_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMpChallengeRegionListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify prototype) {
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
     *   CMD_ID = 8296;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code TreasureMapHostInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TreasureMapHostInfoNotify)
        emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.internal_static_TreasureMapHostInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.internal_static_TreasureMapHostInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify.class, emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify.newBuilder()
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
        mpChallengeRegionList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.internal_static_TreasureMapHostInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify build() {
        emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify buildPartial() {
        emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify result = new emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          mpChallengeRegionList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.mpChallengeRegionList_ = mpChallengeRegionList_;
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
        if (other instanceof emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify) {
          return mergeFrom((emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify other) {
        if (other == emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify.getDefaultInstance()) return this;
        if (!other.mpChallengeRegionList_.isEmpty()) {
          if (mpChallengeRegionList_.isEmpty()) {
            mpChallengeRegionList_ = other.mpChallengeRegionList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMpChallengeRegionListIsMutable();
            mpChallengeRegionList_.addAll(other.mpChallengeRegionList_);
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
        emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList mpChallengeRegionList_ = emptyIntList();
      private void ensureMpChallengeRegionListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          mpChallengeRegionList_ = mutableCopy(mpChallengeRegionList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 mp_challenge_region_list = 1;</code>
       * @return A list containing the mpChallengeRegionList.
       */
      public java.util.List<java.lang.Integer>
          getMpChallengeRegionListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(mpChallengeRegionList_) : mpChallengeRegionList_;
      }
      /**
       * <code>repeated uint32 mp_challenge_region_list = 1;</code>
       * @return The count of mpChallengeRegionList.
       */
      public int getMpChallengeRegionListCount() {
        return mpChallengeRegionList_.size();
      }
      /**
       * <code>repeated uint32 mp_challenge_region_list = 1;</code>
       * @param index The index of the element to return.
       * @return The mpChallengeRegionList at the given index.
       */
      public int getMpChallengeRegionList(int index) {
        return mpChallengeRegionList_.getInt(index);
      }
      /**
       * <code>repeated uint32 mp_challenge_region_list = 1;</code>
       * @param index The index to set the value at.
       * @param value The mpChallengeRegionList to set.
       * @return This builder for chaining.
       */
      public Builder setMpChallengeRegionList(
          int index, int value) {
        ensureMpChallengeRegionListIsMutable();
        mpChallengeRegionList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 mp_challenge_region_list = 1;</code>
       * @param value The mpChallengeRegionList to add.
       * @return This builder for chaining.
       */
      public Builder addMpChallengeRegionList(int value) {
        ensureMpChallengeRegionListIsMutable();
        mpChallengeRegionList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 mp_challenge_region_list = 1;</code>
       * @param values The mpChallengeRegionList to add.
       * @return This builder for chaining.
       */
      public Builder addAllMpChallengeRegionList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureMpChallengeRegionListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mpChallengeRegionList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 mp_challenge_region_list = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMpChallengeRegionList() {
        mpChallengeRegionList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:TreasureMapHostInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:TreasureMapHostInfoNotify)
    private static final emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify();
    }

    public static emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TreasureMapHostInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<TreasureMapHostInfoNotify>() {
      @java.lang.Override
      public TreasureMapHostInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TreasureMapHostInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TreasureMapHostInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TreasureMapHostInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.TreasureMapHostInfoNotifyOuterClass.TreasureMapHostInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TreasureMapHostInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TreasureMapHostInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037TreasureMapHostInfoNotify.proto\"=\n\031Tre" +
      "asureMapHostInfoNotify\022 \n\030mp_challenge_r" +
      "egion_list\030\001 \003(\rB\030\n\026emu.gingerps.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TreasureMapHostInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TreasureMapHostInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TreasureMapHostInfoNotify_descriptor,
        new java.lang.String[] { "MpChallengeRegionList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
