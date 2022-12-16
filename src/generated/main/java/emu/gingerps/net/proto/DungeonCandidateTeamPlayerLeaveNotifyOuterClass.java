// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonCandidateTeamPlayerLeaveNotify.proto

package emu.gingerps.net.proto;

public final class DungeonCandidateTeamPlayerLeaveNotifyOuterClass {
  private DungeonCandidateTeamPlayerLeaveNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DungeonCandidateTeamPlayerLeaveNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DungeonCandidateTeamPlayerLeaveNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 player_uid = 7;</code>
     * @return The playerUid.
     */
    int getPlayerUid();

    /**
     * <code>.DungeonCandidateTeamPlayerLeaveReason reason = 1;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.DungeonCandidateTeamPlayerLeaveReason reason = 1;</code>
     * @return The reason.
     */
    emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveReasonOuterClass.DungeonCandidateTeamPlayerLeaveReason getReason();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 972;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code DungeonCandidateTeamPlayerLeaveNotify}
   */
  public static final class DungeonCandidateTeamPlayerLeaveNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DungeonCandidateTeamPlayerLeaveNotify)
      DungeonCandidateTeamPlayerLeaveNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DungeonCandidateTeamPlayerLeaveNotify.newBuilder() to construct.
    private DungeonCandidateTeamPlayerLeaveNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DungeonCandidateTeamPlayerLeaveNotify() {
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DungeonCandidateTeamPlayerLeaveNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DungeonCandidateTeamPlayerLeaveNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
              int rawValue = input.readEnum();

              reason_ = rawValue;
              break;
            }
            case 56: {

              playerUid_ = input.readUInt32();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.internal_static_DungeonCandidateTeamPlayerLeaveNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.internal_static_DungeonCandidateTeamPlayerLeaveNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify.class, emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify.Builder.class);
    }

    public static final int PLAYER_UID_FIELD_NUMBER = 7;
    private int playerUid_;
    /**
     * <code>uint32 player_uid = 7;</code>
     * @return The playerUid.
     */
    @java.lang.Override
    public int getPlayerUid() {
      return playerUid_;
    }

    public static final int REASON_FIELD_NUMBER = 1;
    private int reason_;
    /**
     * <code>.DungeonCandidateTeamPlayerLeaveReason reason = 1;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.DungeonCandidateTeamPlayerLeaveReason reason = 1;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveReasonOuterClass.DungeonCandidateTeamPlayerLeaveReason getReason() {
      @SuppressWarnings("deprecation")
      emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveReasonOuterClass.DungeonCandidateTeamPlayerLeaveReason result = emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveReasonOuterClass.DungeonCandidateTeamPlayerLeaveReason.valueOf(reason_);
      return result == null ? emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveReasonOuterClass.DungeonCandidateTeamPlayerLeaveReason.UNRECOGNIZED : result;
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
      if (reason_ != emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveReasonOuterClass.DungeonCandidateTeamPlayerLeaveReason.DUNGEON_CANDIDATE_TEAM_PLAYER_LEAVE_REASON_TPLR_NORMAL.getNumber()) {
        output.writeEnum(1, reason_);
      }
      if (playerUid_ != 0) {
        output.writeUInt32(7, playerUid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (reason_ != emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveReasonOuterClass.DungeonCandidateTeamPlayerLeaveReason.DUNGEON_CANDIDATE_TEAM_PLAYER_LEAVE_REASON_TPLR_NORMAL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, reason_);
      }
      if (playerUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, playerUid_);
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
      if (!(obj instanceof emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify other = (emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify) obj;

      if (getPlayerUid()
          != other.getPlayerUid()) return false;
      if (reason_ != other.reason_) return false;
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
      hash = (37 * hash) + PLAYER_UID_FIELD_NUMBER;
      hash = (53 * hash) + getPlayerUid();
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify prototype) {
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
     *   CMD_ID = 972;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code DungeonCandidateTeamPlayerLeaveNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DungeonCandidateTeamPlayerLeaveNotify)
        emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.internal_static_DungeonCandidateTeamPlayerLeaveNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.internal_static_DungeonCandidateTeamPlayerLeaveNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify.class, emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify.newBuilder()
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
        playerUid_ = 0;

        reason_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.internal_static_DungeonCandidateTeamPlayerLeaveNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify build() {
        emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify buildPartial() {
        emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify result = new emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify(this);
        result.playerUid_ = playerUid_;
        result.reason_ = reason_;
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
        if (other instanceof emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify) {
          return mergeFrom((emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify other) {
        if (other == emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify.getDefaultInstance()) return this;
        if (other.getPlayerUid() != 0) {
          setPlayerUid(other.getPlayerUid());
        }
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
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
        emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int playerUid_ ;
      /**
       * <code>uint32 player_uid = 7;</code>
       * @return The playerUid.
       */
      @java.lang.Override
      public int getPlayerUid() {
        return playerUid_;
      }
      /**
       * <code>uint32 player_uid = 7;</code>
       * @param value The playerUid to set.
       * @return This builder for chaining.
       */
      public Builder setPlayerUid(int value) {
        
        playerUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 player_uid = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayerUid() {
        
        playerUid_ = 0;
        onChanged();
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.DungeonCandidateTeamPlayerLeaveReason reason = 1;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.DungeonCandidateTeamPlayerLeaveReason reason = 1;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.DungeonCandidateTeamPlayerLeaveReason reason = 1;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveReasonOuterClass.DungeonCandidateTeamPlayerLeaveReason getReason() {
        @SuppressWarnings("deprecation")
        emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveReasonOuterClass.DungeonCandidateTeamPlayerLeaveReason result = emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveReasonOuterClass.DungeonCandidateTeamPlayerLeaveReason.valueOf(reason_);
        return result == null ? emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveReasonOuterClass.DungeonCandidateTeamPlayerLeaveReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.DungeonCandidateTeamPlayerLeaveReason reason = 1;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveReasonOuterClass.DungeonCandidateTeamPlayerLeaveReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.DungeonCandidateTeamPlayerLeaveReason reason = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DungeonCandidateTeamPlayerLeaveNotify)
    }

    // @@protoc_insertion_point(class_scope:DungeonCandidateTeamPlayerLeaveNotify)
    private static final emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify();
    }

    public static emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DungeonCandidateTeamPlayerLeaveNotify>
        PARSER = new com.google.protobuf.AbstractParser<DungeonCandidateTeamPlayerLeaveNotify>() {
      @java.lang.Override
      public DungeonCandidateTeamPlayerLeaveNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DungeonCandidateTeamPlayerLeaveNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DungeonCandidateTeamPlayerLeaveNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DungeonCandidateTeamPlayerLeaveNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveNotifyOuterClass.DungeonCandidateTeamPlayerLeaveNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DungeonCandidateTeamPlayerLeaveNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DungeonCandidateTeamPlayerLeaveNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+DungeonCandidateTeamPlayerLeaveNotify." +
      "proto\032+DungeonCandidateTeamPlayerLeaveRe" +
      "ason.proto\"s\n%DungeonCandidateTeamPlayer" +
      "LeaveNotify\022\022\n\nplayer_uid\030\007 \001(\r\0226\n\006reaso" +
      "n\030\001 \001(\0162&.DungeonCandidateTeamPlayerLeav" +
      "eReasonB\033\n\031emu.gingerps.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveReasonOuterClass.getDescriptor(),
        });
    internal_static_DungeonCandidateTeamPlayerLeaveNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DungeonCandidateTeamPlayerLeaveNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DungeonCandidateTeamPlayerLeaveNotify_descriptor,
        new java.lang.String[] { "PlayerUid", "Reason", });
    emu.gingerps.net.proto.DungeonCandidateTeamPlayerLeaveReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
