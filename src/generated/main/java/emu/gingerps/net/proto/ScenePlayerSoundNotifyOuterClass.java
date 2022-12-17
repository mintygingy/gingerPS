// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ScenePlayerSoundNotify.proto

package emu.gingerps.net.proto;

public final class ScenePlayerSoundNotifyOuterClass {
  private ScenePlayerSoundNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ScenePlayerSoundNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ScenePlayerSoundNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector play_pos = 6;</code>
     * @return Whether the playPos field is set.
     */
    boolean hasPlayPos();
    /**
     * <code>.Vector play_pos = 6;</code>
     * @return The playPos.
     */
    emu.gingerps.net.proto.VectorOuterClass.Vector getPlayPos();
    /**
     * <code>.Vector play_pos = 6;</code>
     */
    emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getPlayPosOrBuilder();

    /**
     * <code>.ScenePlayerSoundNotify.PlaySoundType play_type = 15;</code>
     * @return The enum numeric value on the wire for playType.
     */
    int getPlayTypeValue();
    /**
     * <code>.ScenePlayerSoundNotify.PlaySoundType play_type = 15;</code>
     * @return The playType.
     */
    emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.PlaySoundType getPlayType();

    /**
     * <code>string sound_name = 14;</code>
     * @return The soundName.
     */
    java.lang.String getSoundName();
    /**
     * <code>string sound_name = 14;</code>
     * @return The bytes for soundName.
     */
    com.google.protobuf.ByteString
        getSoundNameBytes();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 266;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ScenePlayerSoundNotify}
   */
  public static final class ScenePlayerSoundNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ScenePlayerSoundNotify)
      ScenePlayerSoundNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ScenePlayerSoundNotify.newBuilder() to construct.
    private ScenePlayerSoundNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ScenePlayerSoundNotify() {
      playType_ = 0;
      soundName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ScenePlayerSoundNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ScenePlayerSoundNotify(
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
            case 50: {
              emu.gingerps.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (playPos_ != null) {
                subBuilder = playPos_.toBuilder();
              }
              playPos_ = input.readMessage(emu.gingerps.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(playPos_);
                playPos_ = subBuilder.buildPartial();
              }

              break;
            }
            case 114: {
              java.lang.String s = input.readStringRequireUtf8();

              soundName_ = s;
              break;
            }
            case 120: {
              int rawValue = input.readEnum();

              playType_ = rawValue;
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
      return emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.internal_static_ScenePlayerSoundNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.internal_static_ScenePlayerSoundNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.class, emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code ScenePlayerSoundNotify.PlaySoundType}
     */
    public enum PlaySoundType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>PLAY_SOUND_TYPE_NONE = 0;</code>
       */
      PLAY_SOUND_TYPE_NONE(0),
      /**
       * <code>PLAY_SOUND_TYPE_START = 1;</code>
       */
      PLAY_SOUND_TYPE_START(1),
      /**
       * <code>PLAY_SOUND_TYPE_STOP = 2;</code>
       */
      PLAY_SOUND_TYPE_STOP(2),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>PLAY_SOUND_TYPE_NONE = 0;</code>
       */
      public static final int PLAY_SOUND_TYPE_NONE_VALUE = 0;
      /**
       * <code>PLAY_SOUND_TYPE_START = 1;</code>
       */
      public static final int PLAY_SOUND_TYPE_START_VALUE = 1;
      /**
       * <code>PLAY_SOUND_TYPE_STOP = 2;</code>
       */
      public static final int PLAY_SOUND_TYPE_STOP_VALUE = 2;


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
      public static PlaySoundType valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static PlaySoundType forNumber(int value) {
        switch (value) {
          case 0: return PLAY_SOUND_TYPE_NONE;
          case 1: return PLAY_SOUND_TYPE_START;
          case 2: return PLAY_SOUND_TYPE_STOP;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<PlaySoundType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          PlaySoundType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<PlaySoundType>() {
              public PlaySoundType findValueByNumber(int number) {
                return PlaySoundType.forNumber(number);
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
        return emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final PlaySoundType[] VALUES = values();

      public static PlaySoundType valueOf(
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

      private PlaySoundType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:ScenePlayerSoundNotify.PlaySoundType)
    }

    public static final int PLAY_POS_FIELD_NUMBER = 6;
    private emu.gingerps.net.proto.VectorOuterClass.Vector playPos_;
    /**
     * <code>.Vector play_pos = 6;</code>
     * @return Whether the playPos field is set.
     */
    @java.lang.Override
    public boolean hasPlayPos() {
      return playPos_ != null;
    }
    /**
     * <code>.Vector play_pos = 6;</code>
     * @return The playPos.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.VectorOuterClass.Vector getPlayPos() {
      return playPos_ == null ? emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : playPos_;
    }
    /**
     * <code>.Vector play_pos = 6;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getPlayPosOrBuilder() {
      return getPlayPos();
    }

    public static final int PLAY_TYPE_FIELD_NUMBER = 15;
    private int playType_;
    /**
     * <code>.ScenePlayerSoundNotify.PlaySoundType play_type = 15;</code>
     * @return The enum numeric value on the wire for playType.
     */
    @java.lang.Override public int getPlayTypeValue() {
      return playType_;
    }
    /**
     * <code>.ScenePlayerSoundNotify.PlaySoundType play_type = 15;</code>
     * @return The playType.
     */
    @java.lang.Override public emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.PlaySoundType getPlayType() {
      @SuppressWarnings("deprecation")
      emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.PlaySoundType result = emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.PlaySoundType.valueOf(playType_);
      return result == null ? emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.PlaySoundType.UNRECOGNIZED : result;
    }

    public static final int SOUND_NAME_FIELD_NUMBER = 14;
    private volatile java.lang.Object soundName_;
    /**
     * <code>string sound_name = 14;</code>
     * @return The soundName.
     */
    @java.lang.Override
    public java.lang.String getSoundName() {
      java.lang.Object ref = soundName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        soundName_ = s;
        return s;
      }
    }
    /**
     * <code>string sound_name = 14;</code>
     * @return The bytes for soundName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSoundNameBytes() {
      java.lang.Object ref = soundName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        soundName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (playPos_ != null) {
        output.writeMessage(6, getPlayPos());
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(soundName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 14, soundName_);
      }
      if (playType_ != emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.PlaySoundType.PLAY_SOUND_TYPE_NONE.getNumber()) {
        output.writeEnum(15, playType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (playPos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getPlayPos());
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(soundName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(14, soundName_);
      }
      if (playType_ != emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.PlaySoundType.PLAY_SOUND_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(15, playType_);
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
      if (!(obj instanceof emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify other = (emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify) obj;

      if (hasPlayPos() != other.hasPlayPos()) return false;
      if (hasPlayPos()) {
        if (!getPlayPos()
            .equals(other.getPlayPos())) return false;
      }
      if (playType_ != other.playType_) return false;
      if (!getSoundName()
          .equals(other.getSoundName())) return false;
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
      if (hasPlayPos()) {
        hash = (37 * hash) + PLAY_POS_FIELD_NUMBER;
        hash = (53 * hash) + getPlayPos().hashCode();
      }
      hash = (37 * hash) + PLAY_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + playType_;
      hash = (37 * hash) + SOUND_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getSoundName().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify prototype) {
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
     *   CMD_ID = 266;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ScenePlayerSoundNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ScenePlayerSoundNotify)
        emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.internal_static_ScenePlayerSoundNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.internal_static_ScenePlayerSoundNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.class, emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.newBuilder()
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
        if (playPosBuilder_ == null) {
          playPos_ = null;
        } else {
          playPos_ = null;
          playPosBuilder_ = null;
        }
        playType_ = 0;

        soundName_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.internal_static_ScenePlayerSoundNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify build() {
        emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify buildPartial() {
        emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify result = new emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify(this);
        if (playPosBuilder_ == null) {
          result.playPos_ = playPos_;
        } else {
          result.playPos_ = playPosBuilder_.build();
        }
        result.playType_ = playType_;
        result.soundName_ = soundName_;
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
        if (other instanceof emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify) {
          return mergeFrom((emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify other) {
        if (other == emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.getDefaultInstance()) return this;
        if (other.hasPlayPos()) {
          mergePlayPos(other.getPlayPos());
        }
        if (other.playType_ != 0) {
          setPlayTypeValue(other.getPlayTypeValue());
        }
        if (!other.getSoundName().isEmpty()) {
          soundName_ = other.soundName_;
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
        emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.gingerps.net.proto.VectorOuterClass.Vector playPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder> playPosBuilder_;
      /**
       * <code>.Vector play_pos = 6;</code>
       * @return Whether the playPos field is set.
       */
      public boolean hasPlayPos() {
        return playPosBuilder_ != null || playPos_ != null;
      }
      /**
       * <code>.Vector play_pos = 6;</code>
       * @return The playPos.
       */
      public emu.gingerps.net.proto.VectorOuterClass.Vector getPlayPos() {
        if (playPosBuilder_ == null) {
          return playPos_ == null ? emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : playPos_;
        } else {
          return playPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector play_pos = 6;</code>
       */
      public Builder setPlayPos(emu.gingerps.net.proto.VectorOuterClass.Vector value) {
        if (playPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          playPos_ = value;
          onChanged();
        } else {
          playPosBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector play_pos = 6;</code>
       */
      public Builder setPlayPos(
          emu.gingerps.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (playPosBuilder_ == null) {
          playPos_ = builderForValue.build();
          onChanged();
        } else {
          playPosBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector play_pos = 6;</code>
       */
      public Builder mergePlayPos(emu.gingerps.net.proto.VectorOuterClass.Vector value) {
        if (playPosBuilder_ == null) {
          if (playPos_ != null) {
            playPos_ =
              emu.gingerps.net.proto.VectorOuterClass.Vector.newBuilder(playPos_).mergeFrom(value).buildPartial();
          } else {
            playPos_ = value;
          }
          onChanged();
        } else {
          playPosBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector play_pos = 6;</code>
       */
      public Builder clearPlayPos() {
        if (playPosBuilder_ == null) {
          playPos_ = null;
          onChanged();
        } else {
          playPos_ = null;
          playPosBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector play_pos = 6;</code>
       */
      public emu.gingerps.net.proto.VectorOuterClass.Vector.Builder getPlayPosBuilder() {
        
        onChanged();
        return getPlayPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector play_pos = 6;</code>
       */
      public emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getPlayPosOrBuilder() {
        if (playPosBuilder_ != null) {
          return playPosBuilder_.getMessageOrBuilder();
        } else {
          return playPos_ == null ?
              emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : playPos_;
        }
      }
      /**
       * <code>.Vector play_pos = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder> 
          getPlayPosFieldBuilder() {
        if (playPosBuilder_ == null) {
          playPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getPlayPos(),
                  getParentForChildren(),
                  isClean());
          playPos_ = null;
        }
        return playPosBuilder_;
      }

      private int playType_ = 0;
      /**
       * <code>.ScenePlayerSoundNotify.PlaySoundType play_type = 15;</code>
       * @return The enum numeric value on the wire for playType.
       */
      @java.lang.Override public int getPlayTypeValue() {
        return playType_;
      }
      /**
       * <code>.ScenePlayerSoundNotify.PlaySoundType play_type = 15;</code>
       * @param value The enum numeric value on the wire for playType to set.
       * @return This builder for chaining.
       */
      public Builder setPlayTypeValue(int value) {
        
        playType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.ScenePlayerSoundNotify.PlaySoundType play_type = 15;</code>
       * @return The playType.
       */
      @java.lang.Override
      public emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.PlaySoundType getPlayType() {
        @SuppressWarnings("deprecation")
        emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.PlaySoundType result = emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.PlaySoundType.valueOf(playType_);
        return result == null ? emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.PlaySoundType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ScenePlayerSoundNotify.PlaySoundType play_type = 15;</code>
       * @param value The playType to set.
       * @return This builder for chaining.
       */
      public Builder setPlayType(emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify.PlaySoundType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        playType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.ScenePlayerSoundNotify.PlaySoundType play_type = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayType() {
        
        playType_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object soundName_ = "";
      /**
       * <code>string sound_name = 14;</code>
       * @return The soundName.
       */
      public java.lang.String getSoundName() {
        java.lang.Object ref = soundName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          soundName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string sound_name = 14;</code>
       * @return The bytes for soundName.
       */
      public com.google.protobuf.ByteString
          getSoundNameBytes() {
        java.lang.Object ref = soundName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          soundName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string sound_name = 14;</code>
       * @param value The soundName to set.
       * @return This builder for chaining.
       */
      public Builder setSoundName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        soundName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string sound_name = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearSoundName() {
        
        soundName_ = getDefaultInstance().getSoundName();
        onChanged();
        return this;
      }
      /**
       * <code>string sound_name = 14;</code>
       * @param value The bytes for soundName to set.
       * @return This builder for chaining.
       */
      public Builder setSoundNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        soundName_ = value;
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


      // @@protoc_insertion_point(builder_scope:ScenePlayerSoundNotify)
    }

    // @@protoc_insertion_point(class_scope:ScenePlayerSoundNotify)
    private static final emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify();
    }

    public static emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ScenePlayerSoundNotify>
        PARSER = new com.google.protobuf.AbstractParser<ScenePlayerSoundNotify>() {
      @java.lang.Override
      public ScenePlayerSoundNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ScenePlayerSoundNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ScenePlayerSoundNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ScenePlayerSoundNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.ScenePlayerSoundNotifyOuterClass.ScenePlayerSoundNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ScenePlayerSoundNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ScenePlayerSoundNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034ScenePlayerSoundNotify.proto\032\014Vector.p" +
      "roto\"\341\001\n\026ScenePlayerSoundNotify\022\031\n\010play_" +
      "pos\030\006 \001(\0132\007.Vector\0228\n\tplay_type\030\017 \001(\0162%." +
      "ScenePlayerSoundNotify.PlaySoundType\022\022\n\n" +
      "sound_name\030\016 \001(\t\"^\n\rPlaySoundType\022\030\n\024PLA" +
      "Y_SOUND_TYPE_NONE\020\000\022\031\n\025PLAY_SOUND_TYPE_S" +
      "TART\020\001\022\030\n\024PLAY_SOUND_TYPE_STOP\020\002B\030\n\026emu." +
      "gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_ScenePlayerSoundNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ScenePlayerSoundNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ScenePlayerSoundNotify_descriptor,
        new java.lang.String[] { "PlayPos", "PlayType", "SoundName", });
    emu.gingerps.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
