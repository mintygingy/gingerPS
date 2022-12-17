// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerApplyEnterHomeResultNotify.proto

package emu.gingerps.net.proto;

public final class PlayerApplyEnterHomeResultNotifyOuterClass {
  private PlayerApplyEnterHomeResultNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerApplyEnterHomeResultNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerApplyEnterHomeResultNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 target_uid = 9;</code>
     * @return The targetUid.
     */
    int getTargetUid();

    /**
     * <code>string target_nickname = 2;</code>
     * @return The targetNickname.
     */
    java.lang.String getTargetNickname();
    /**
     * <code>string target_nickname = 2;</code>
     * @return The bytes for targetNickname.
     */
    com.google.protobuf.ByteString
        getTargetNicknameBytes();

    /**
     * <code>bool is_agreed = 13;</code>
     * @return The isAgreed.
     */
    boolean getIsAgreed();

    /**
     * <code>.PlayerApplyEnterHomeResultNotify.Reason reason = 5;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.PlayerApplyEnterHomeResultNotify.Reason reason = 5;</code>
     * @return The reason.
     */
    emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify.Reason getReason();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4793;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code PlayerApplyEnterHomeResultNotify}
   */
  public static final class PlayerApplyEnterHomeResultNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerApplyEnterHomeResultNotify)
      PlayerApplyEnterHomeResultNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerApplyEnterHomeResultNotify.newBuilder() to construct.
    private PlayerApplyEnterHomeResultNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerApplyEnterHomeResultNotify() {
      targetNickname_ = "";
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerApplyEnterHomeResultNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerApplyEnterHomeResultNotify(
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
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              targetNickname_ = s;
              break;
            }
            case 40: {
              int rawValue = input.readEnum();

              reason_ = rawValue;
              break;
            }
            case 72: {

              targetUid_ = input.readUInt32();
              break;
            }
            case 104: {

              isAgreed_ = input.readBool();
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
      return emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.internal_static_PlayerApplyEnterHomeResultNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.internal_static_PlayerApplyEnterHomeResultNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify.class, emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code PlayerApplyEnterHomeResultNotify.Reason}
     */
    public enum Reason
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>REASON_PLAYER_JUDGE = 0;</code>
       */
      REASON_PLAYER_JUDGE(0),
      /**
       * <code>REASON_PLAYER_ENTER_OPTION_REFUSE = 1;</code>
       */
      REASON_PLAYER_ENTER_OPTION_REFUSE(1),
      /**
       * <code>REASON_PLAYER_ENTER_OPTION_DIRECT = 2;</code>
       */
      REASON_PLAYER_ENTER_OPTION_DIRECT(2),
      /**
       * <code>REASON_SYSTEM_JUDGE = 3;</code>
       */
      REASON_SYSTEM_JUDGE(3),
      /**
       * <code>REASON_HOST_IN_MATCH = 4;</code>
       */
      REASON_HOST_IN_MATCH(4),
      /**
       * <code>REASON_PS_PLAYER_NOT_ACCEPT_OTHERS = 5;</code>
       */
      REASON_PS_PLAYER_NOT_ACCEPT_OTHERS(5),
      /**
       * <code>REASON_OPEN_STATE_NOT_OPEN = 6;</code>
       */
      REASON_OPEN_STATE_NOT_OPEN(6),
      /**
       * <code>REASON_HOST_IN_EDIT_MODE = 7;</code>
       */
      REASON_HOST_IN_EDIT_MODE(7),
      /**
       * <code>REASON_PRIOR_CHECK = 8;</code>
       */
      REASON_PRIOR_CHECK(8),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>REASON_PLAYER_JUDGE = 0;</code>
       */
      public static final int REASON_PLAYER_JUDGE_VALUE = 0;
      /**
       * <code>REASON_PLAYER_ENTER_OPTION_REFUSE = 1;</code>
       */
      public static final int REASON_PLAYER_ENTER_OPTION_REFUSE_VALUE = 1;
      /**
       * <code>REASON_PLAYER_ENTER_OPTION_DIRECT = 2;</code>
       */
      public static final int REASON_PLAYER_ENTER_OPTION_DIRECT_VALUE = 2;
      /**
       * <code>REASON_SYSTEM_JUDGE = 3;</code>
       */
      public static final int REASON_SYSTEM_JUDGE_VALUE = 3;
      /**
       * <code>REASON_HOST_IN_MATCH = 4;</code>
       */
      public static final int REASON_HOST_IN_MATCH_VALUE = 4;
      /**
       * <code>REASON_PS_PLAYER_NOT_ACCEPT_OTHERS = 5;</code>
       */
      public static final int REASON_PS_PLAYER_NOT_ACCEPT_OTHERS_VALUE = 5;
      /**
       * <code>REASON_OPEN_STATE_NOT_OPEN = 6;</code>
       */
      public static final int REASON_OPEN_STATE_NOT_OPEN_VALUE = 6;
      /**
       * <code>REASON_HOST_IN_EDIT_MODE = 7;</code>
       */
      public static final int REASON_HOST_IN_EDIT_MODE_VALUE = 7;
      /**
       * <code>REASON_PRIOR_CHECK = 8;</code>
       */
      public static final int REASON_PRIOR_CHECK_VALUE = 8;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static Reason valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static Reason forNumber(int value) {
        switch (value) {
          case 0: return REASON_PLAYER_JUDGE;
          case 1: return REASON_PLAYER_ENTER_OPTION_REFUSE;
          case 2: return REASON_PLAYER_ENTER_OPTION_DIRECT;
          case 3: return REASON_SYSTEM_JUDGE;
          case 4: return REASON_HOST_IN_MATCH;
          case 5: return REASON_PS_PLAYER_NOT_ACCEPT_OTHERS;
          case 6: return REASON_OPEN_STATE_NOT_OPEN;
          case 7: return REASON_HOST_IN_EDIT_MODE;
          case 8: return REASON_PRIOR_CHECK;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Reason>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Reason> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Reason>() {
              public Reason findValueByNumber(int number) {
                return Reason.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final Reason[] VALUES = values();

      public static Reason valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private Reason(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:PlayerApplyEnterHomeResultNotify.Reason)
    }

    public static final int TARGET_UID_FIELD_NUMBER = 9;
    private int targetUid_;
    /**
     * <code>uint32 target_uid = 9;</code>
     * @return The targetUid.
     */
    @java.lang.Override
    public int getTargetUid() {
      return targetUid_;
    }

    public static final int TARGET_NICKNAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object targetNickname_;
    /**
     * <code>string target_nickname = 2;</code>
     * @return The targetNickname.
     */
    @java.lang.Override
    public java.lang.String getTargetNickname() {
      java.lang.Object ref = targetNickname_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        targetNickname_ = s;
        return s;
      }
    }
    /**
     * <code>string target_nickname = 2;</code>
     * @return The bytes for targetNickname.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTargetNicknameBytes() {
      java.lang.Object ref = targetNickname_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        targetNickname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int IS_AGREED_FIELD_NUMBER = 13;
    private boolean isAgreed_;
    /**
     * <code>bool is_agreed = 13;</code>
     * @return The isAgreed.
     */
    @java.lang.Override
    public boolean getIsAgreed() {
      return isAgreed_;
    }

    public static final int REASON_FIELD_NUMBER = 5;
    private int reason_;
    /**
     * <code>.PlayerApplyEnterHomeResultNotify.Reason reason = 5;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.PlayerApplyEnterHomeResultNotify.Reason reason = 5;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify.Reason getReason() {
      @SuppressWarnings("deprecation")
      emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify.Reason result = emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify.Reason.valueOf(reason_);
      return result == null ? emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify.Reason.UNRECOGNIZED : result;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetNickname_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, targetNickname_);
      }
      if (reason_ != emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify.Reason.REASON_PLAYER_JUDGE.getNumber()) {
        output.writeEnum(5, reason_);
      }
      if (targetUid_ != 0) {
        output.writeUInt32(9, targetUid_);
      }
      if (isAgreed_ != false) {
        output.writeBool(13, isAgreed_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetNickname_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, targetNickname_);
      }
      if (reason_ != emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify.Reason.REASON_PLAYER_JUDGE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, reason_);
      }
      if (targetUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, targetUid_);
      }
      if (isAgreed_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, isAgreed_);
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
      if (!(obj instanceof emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify other = (emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify) obj;

      if (getTargetUid()
          != other.getTargetUid()) return false;
      if (!getTargetNickname()
          .equals(other.getTargetNickname())) return false;
      if (getIsAgreed()
          != other.getIsAgreed()) return false;
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
      hash = (37 * hash) + TARGET_UID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetUid();
      hash = (37 * hash) + TARGET_NICKNAME_FIELD_NUMBER;
      hash = (53 * hash) + getTargetNickname().hashCode();
      hash = (37 * hash) + IS_AGREED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAgreed());
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify prototype) {
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
     *   CMD_ID = 4793;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code PlayerApplyEnterHomeResultNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerApplyEnterHomeResultNotify)
        emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.internal_static_PlayerApplyEnterHomeResultNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.internal_static_PlayerApplyEnterHomeResultNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify.class, emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify.newBuilder()
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
        targetUid_ = 0;

        targetNickname_ = "";

        isAgreed_ = false;

        reason_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.internal_static_PlayerApplyEnterHomeResultNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify build() {
        emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify buildPartial() {
        emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify result = new emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify(this);
        result.targetUid_ = targetUid_;
        result.targetNickname_ = targetNickname_;
        result.isAgreed_ = isAgreed_;
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
        if (other instanceof emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify) {
          return mergeFrom((emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify other) {
        if (other == emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify.getDefaultInstance()) return this;
        if (other.getTargetUid() != 0) {
          setTargetUid(other.getTargetUid());
        }
        if (!other.getTargetNickname().isEmpty()) {
          targetNickname_ = other.targetNickname_;
          onChanged();
        }
        if (other.getIsAgreed() != false) {
          setIsAgreed(other.getIsAgreed());
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
        emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int targetUid_ ;
      /**
       * <code>uint32 target_uid = 9;</code>
       * @return The targetUid.
       */
      @java.lang.Override
      public int getTargetUid() {
        return targetUid_;
      }
      /**
       * <code>uint32 target_uid = 9;</code>
       * @param value The targetUid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetUid(int value) {
        
        targetUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_uid = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetUid() {
        
        targetUid_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object targetNickname_ = "";
      /**
       * <code>string target_nickname = 2;</code>
       * @return The targetNickname.
       */
      public java.lang.String getTargetNickname() {
        java.lang.Object ref = targetNickname_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          targetNickname_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string target_nickname = 2;</code>
       * @return The bytes for targetNickname.
       */
      public com.google.protobuf.ByteString
          getTargetNicknameBytes() {
        java.lang.Object ref = targetNickname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          targetNickname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string target_nickname = 2;</code>
       * @param value The targetNickname to set.
       * @return This builder for chaining.
       */
      public Builder setTargetNickname(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        targetNickname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string target_nickname = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetNickname() {
        
        targetNickname_ = getDefaultInstance().getTargetNickname();
        onChanged();
        return this;
      }
      /**
       * <code>string target_nickname = 2;</code>
       * @param value The bytes for targetNickname to set.
       * @return This builder for chaining.
       */
      public Builder setTargetNicknameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        targetNickname_ = value;
        onChanged();
        return this;
      }

      private boolean isAgreed_ ;
      /**
       * <code>bool is_agreed = 13;</code>
       * @return The isAgreed.
       */
      @java.lang.Override
      public boolean getIsAgreed() {
        return isAgreed_;
      }
      /**
       * <code>bool is_agreed = 13;</code>
       * @param value The isAgreed to set.
       * @return This builder for chaining.
       */
      public Builder setIsAgreed(boolean value) {
        
        isAgreed_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_agreed = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAgreed() {
        
        isAgreed_ = false;
        onChanged();
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.PlayerApplyEnterHomeResultNotify.Reason reason = 5;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.PlayerApplyEnterHomeResultNotify.Reason reason = 5;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.PlayerApplyEnterHomeResultNotify.Reason reason = 5;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify.Reason getReason() {
        @SuppressWarnings("deprecation")
        emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify.Reason result = emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify.Reason.valueOf(reason_);
        return result == null ? emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify.Reason.UNRECOGNIZED : result;
      }
      /**
       * <code>.PlayerApplyEnterHomeResultNotify.Reason reason = 5;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify.Reason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.PlayerApplyEnterHomeResultNotify.Reason reason = 5;</code>
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


      // @@protoc_insertion_point(builder_scope:PlayerApplyEnterHomeResultNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerApplyEnterHomeResultNotify)
    private static final emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify();
    }

    public static emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerApplyEnterHomeResultNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerApplyEnterHomeResultNotify>() {
      @java.lang.Override
      public PlayerApplyEnterHomeResultNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerApplyEnterHomeResultNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerApplyEnterHomeResultNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerApplyEnterHomeResultNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerApplyEnterHomeResultNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerApplyEnterHomeResultNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&PlayerApplyEnterHomeResultNotify.proto" +
      "\"\277\003\n PlayerApplyEnterHomeResultNotify\022\022\n" +
      "\ntarget_uid\030\t \001(\r\022\027\n\017target_nickname\030\002 \001" +
      "(\t\022\021\n\tis_agreed\030\r \001(\010\0228\n\006reason\030\005 \001(\0162(." +
      "PlayerApplyEnterHomeResultNotify.Reason\"" +
      "\240\002\n\006Reason\022\027\n\023REASON_PLAYER_JUDGE\020\000\022%\n!R" +
      "EASON_PLAYER_ENTER_OPTION_REFUSE\020\001\022%\n!RE" +
      "ASON_PLAYER_ENTER_OPTION_DIRECT\020\002\022\027\n\023REA" +
      "SON_SYSTEM_JUDGE\020\003\022\030\n\024REASON_HOST_IN_MAT" +
      "CH\020\004\022&\n\"REASON_PS_PLAYER_NOT_ACCEPT_OTHE" +
      "RS\020\005\022\036\n\032REASON_OPEN_STATE_NOT_OPEN\020\006\022\034\n\030" +
      "REASON_HOST_IN_EDIT_MODE\020\007\022\026\n\022REASON_PRI" +
      "OR_CHECK\020\010B\030\n\026emu.gingerps.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlayerApplyEnterHomeResultNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerApplyEnterHomeResultNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerApplyEnterHomeResultNotify_descriptor,
        new java.lang.String[] { "TargetUid", "TargetNickname", "IsAgreed", "Reason", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
