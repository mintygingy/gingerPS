// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerGeneralMatchDismissNotify.proto

package emu.gingerps.net.proto;

public final class PlayerGeneralMatchDismissNotifyOuterClass {
  private PlayerGeneralMatchDismissNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerGeneralMatchDismissNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerGeneralMatchDismissNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.MatchReason reason = 11;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.MatchReason reason = 11;</code>
     * @return The reason.
     */
    emu.gingerps.net.proto.MatchReasonOuterClass.MatchReason getReason();

    /**
     * <code>repeated uint32 uid_list = 10;</code>
     * @return A list containing the uidList.
     */
    java.util.List<java.lang.Integer> getUidListList();
    /**
     * <code>repeated uint32 uid_list = 10;</code>
     * @return The count of uidList.
     */
    int getUidListCount();
    /**
     * <code>repeated uint32 uid_list = 10;</code>
     * @param index The index of the element to return.
     * @return The uidList at the given index.
     */
    int getUidList(int index);

    /**
     * <code>uint32 match_id = 3;</code>
     * @return The matchId.
     */
    int getMatchId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4158;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code PlayerGeneralMatchDismissNotify}
   */
  public static final class PlayerGeneralMatchDismissNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerGeneralMatchDismissNotify)
      PlayerGeneralMatchDismissNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerGeneralMatchDismissNotify.newBuilder() to construct.
    private PlayerGeneralMatchDismissNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerGeneralMatchDismissNotify() {
      reason_ = 0;
      uidList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerGeneralMatchDismissNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerGeneralMatchDismissNotify(
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

              matchId_ = input.readUInt32();
              break;
            }
            case 80: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                uidList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              uidList_.addInt(input.readUInt32());
              break;
            }
            case 82: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                uidList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                uidList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 88: {
              int rawValue = input.readEnum();

              reason_ = rawValue;
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
          uidList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.internal_static_PlayerGeneralMatchDismissNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.internal_static_PlayerGeneralMatchDismissNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify.class, emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify.Builder.class);
    }

    public static final int REASON_FIELD_NUMBER = 11;
    private int reason_;
    /**
     * <code>.MatchReason reason = 11;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.MatchReason reason = 11;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.gingerps.net.proto.MatchReasonOuterClass.MatchReason getReason() {
      @SuppressWarnings("deprecation")
      emu.gingerps.net.proto.MatchReasonOuterClass.MatchReason result = emu.gingerps.net.proto.MatchReasonOuterClass.MatchReason.valueOf(reason_);
      return result == null ? emu.gingerps.net.proto.MatchReasonOuterClass.MatchReason.UNRECOGNIZED : result;
    }

    public static final int UID_LIST_FIELD_NUMBER = 10;
    private com.google.protobuf.Internal.IntList uidList_;
    /**
     * <code>repeated uint32 uid_list = 10;</code>
     * @return A list containing the uidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUidListList() {
      return uidList_;
    }
    /**
     * <code>repeated uint32 uid_list = 10;</code>
     * @return The count of uidList.
     */
    public int getUidListCount() {
      return uidList_.size();
    }
    /**
     * <code>repeated uint32 uid_list = 10;</code>
     * @param index The index of the element to return.
     * @return The uidList at the given index.
     */
    public int getUidList(int index) {
      return uidList_.getInt(index);
    }
    private int uidListMemoizedSerializedSize = -1;

    public static final int MATCH_ID_FIELD_NUMBER = 3;
    private int matchId_;
    /**
     * <code>uint32 match_id = 3;</code>
     * @return The matchId.
     */
    @java.lang.Override
    public int getMatchId() {
      return matchId_;
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
      if (matchId_ != 0) {
        output.writeUInt32(3, matchId_);
      }
      if (getUidListList().size() > 0) {
        output.writeUInt32NoTag(82);
        output.writeUInt32NoTag(uidListMemoizedSerializedSize);
      }
      for (int i = 0; i < uidList_.size(); i++) {
        output.writeUInt32NoTag(uidList_.getInt(i));
      }
      if (reason_ != emu.gingerps.net.proto.MatchReasonOuterClass.MatchReason.MATCH_REASON_NONE.getNumber()) {
        output.writeEnum(11, reason_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (matchId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, matchId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < uidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(uidList_.getInt(i));
        }
        size += dataSize;
        if (!getUidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        uidListMemoizedSerializedSize = dataSize;
      }
      if (reason_ != emu.gingerps.net.proto.MatchReasonOuterClass.MatchReason.MATCH_REASON_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(11, reason_);
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
      if (!(obj instanceof emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify other = (emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify) obj;

      if (reason_ != other.reason_) return false;
      if (!getUidListList()
          .equals(other.getUidListList())) return false;
      if (getMatchId()
          != other.getMatchId()) return false;
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
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      if (getUidListCount() > 0) {
        hash = (37 * hash) + UID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getUidListList().hashCode();
      }
      hash = (37 * hash) + MATCH_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMatchId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify prototype) {
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
     *   CMD_ID = 4158;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code PlayerGeneralMatchDismissNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerGeneralMatchDismissNotify)
        emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.internal_static_PlayerGeneralMatchDismissNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.internal_static_PlayerGeneralMatchDismissNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify.class, emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify.newBuilder()
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
        reason_ = 0;

        uidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        matchId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.internal_static_PlayerGeneralMatchDismissNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify build() {
        emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify buildPartial() {
        emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify result = new emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify(this);
        int from_bitField0_ = bitField0_;
        result.reason_ = reason_;
        if (((bitField0_ & 0x00000001) != 0)) {
          uidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.uidList_ = uidList_;
        result.matchId_ = matchId_;
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
        if (other instanceof emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify) {
          return mergeFrom((emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify other) {
        if (other == emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify.getDefaultInstance()) return this;
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
        }
        if (!other.uidList_.isEmpty()) {
          if (uidList_.isEmpty()) {
            uidList_ = other.uidList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUidListIsMutable();
            uidList_.addAll(other.uidList_);
          }
          onChanged();
        }
        if (other.getMatchId() != 0) {
          setMatchId(other.getMatchId());
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
        emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int reason_ = 0;
      /**
       * <code>.MatchReason reason = 11;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.MatchReason reason = 11;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.MatchReason reason = 11;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.gingerps.net.proto.MatchReasonOuterClass.MatchReason getReason() {
        @SuppressWarnings("deprecation")
        emu.gingerps.net.proto.MatchReasonOuterClass.MatchReason result = emu.gingerps.net.proto.MatchReasonOuterClass.MatchReason.valueOf(reason_);
        return result == null ? emu.gingerps.net.proto.MatchReasonOuterClass.MatchReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.MatchReason reason = 11;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.gingerps.net.proto.MatchReasonOuterClass.MatchReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.MatchReason reason = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList uidList_ = emptyIntList();
      private void ensureUidListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          uidList_ = mutableCopy(uidList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 uid_list = 10;</code>
       * @return A list containing the uidList.
       */
      public java.util.List<java.lang.Integer>
          getUidListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(uidList_) : uidList_;
      }
      /**
       * <code>repeated uint32 uid_list = 10;</code>
       * @return The count of uidList.
       */
      public int getUidListCount() {
        return uidList_.size();
      }
      /**
       * <code>repeated uint32 uid_list = 10;</code>
       * @param index The index of the element to return.
       * @return The uidList at the given index.
       */
      public int getUidList(int index) {
        return uidList_.getInt(index);
      }
      /**
       * <code>repeated uint32 uid_list = 10;</code>
       * @param index The index to set the value at.
       * @param value The uidList to set.
       * @return This builder for chaining.
       */
      public Builder setUidList(
          int index, int value) {
        ensureUidListIsMutable();
        uidList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 uid_list = 10;</code>
       * @param value The uidList to add.
       * @return This builder for chaining.
       */
      public Builder addUidList(int value) {
        ensureUidListIsMutable();
        uidList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 uid_list = 10;</code>
       * @param values The uidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllUidList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, uidList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 uid_list = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUidList() {
        uidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int matchId_ ;
      /**
       * <code>uint32 match_id = 3;</code>
       * @return The matchId.
       */
      @java.lang.Override
      public int getMatchId() {
        return matchId_;
      }
      /**
       * <code>uint32 match_id = 3;</code>
       * @param value The matchId to set.
       * @return This builder for chaining.
       */
      public Builder setMatchId(int value) {
        
        matchId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 match_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMatchId() {
        
        matchId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerGeneralMatchDismissNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerGeneralMatchDismissNotify)
    private static final emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify();
    }

    public static emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerGeneralMatchDismissNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerGeneralMatchDismissNotify>() {
      @java.lang.Override
      public PlayerGeneralMatchDismissNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerGeneralMatchDismissNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerGeneralMatchDismissNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerGeneralMatchDismissNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.PlayerGeneralMatchDismissNotifyOuterClass.PlayerGeneralMatchDismissNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerGeneralMatchDismissNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerGeneralMatchDismissNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%PlayerGeneralMatchDismissNotify.proto\032" +
      "\021MatchReason.proto\"c\n\037PlayerGeneralMatch" +
      "DismissNotify\022\034\n\006reason\030\013 \001(\0162\014.MatchRea" +
      "son\022\020\n\010uid_list\030\n \003(\r\022\020\n\010match_id\030\003 \001(\rB" +
      "\030\n\026emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.MatchReasonOuterClass.getDescriptor(),
        });
    internal_static_PlayerGeneralMatchDismissNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerGeneralMatchDismissNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerGeneralMatchDismissNotify_descriptor,
        new java.lang.String[] { "Reason", "UidList", "MatchId", });
    emu.gingerps.net.proto.MatchReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
