// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LuminanceStoneChallengeGallerySettleInfo.proto

package emu.gingerps.net.proto;

public final class LuminanceStoneChallengeGallerySettleInfoOuterClass {
  private LuminanceStoneChallengeGallerySettleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LuminanceStoneChallengeGallerySettleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LuminanceStoneChallengeGallerySettleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 final_score = 12;</code>
     * @return The finalScore.
     */
    int getFinalScore();

    /**
     * <code>uint32 clean_mud_count = 8;</code>
     * @return The cleanMudCount.
     */
    int getCleanMudCount();

    /**
     * <code>.GalleryStopReason reason = 15;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.GalleryStopReason reason = 15;</code>
     * @return The reason.
     */
    emu.gingerps.net.proto.GalleryStopReasonOuterClass.GalleryStopReason getReason();

    /**
     * <code>uint32 gallery_id = 11;</code>
     * @return The galleryId.
     */
    int getGalleryId();

    /**
     * <code>uint32 kill_special_monster_count = 4;</code>
     * @return The killSpecialMonsterCount.
     */
    int getKillSpecialMonsterCount();

    /**
     * <code>uint32 kill_monster_count = 1;</code>
     * @return The killMonsterCount.
     */
    int getKillMonsterCount();
  }
  /**
   * Protobuf type {@code LuminanceStoneChallengeGallerySettleInfo}
   */
  public static final class LuminanceStoneChallengeGallerySettleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LuminanceStoneChallengeGallerySettleInfo)
      LuminanceStoneChallengeGallerySettleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LuminanceStoneChallengeGallerySettleInfo.newBuilder() to construct.
    private LuminanceStoneChallengeGallerySettleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LuminanceStoneChallengeGallerySettleInfo() {
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LuminanceStoneChallengeGallerySettleInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LuminanceStoneChallengeGallerySettleInfo(
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

              killMonsterCount_ = input.readUInt32();
              break;
            }
            case 32: {

              killSpecialMonsterCount_ = input.readUInt32();
              break;
            }
            case 64: {

              cleanMudCount_ = input.readUInt32();
              break;
            }
            case 88: {

              galleryId_ = input.readUInt32();
              break;
            }
            case 96: {

              finalScore_ = input.readUInt32();
              break;
            }
            case 120: {
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.internal_static_LuminanceStoneChallengeGallerySettleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.internal_static_LuminanceStoneChallengeGallerySettleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo.class, emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo.Builder.class);
    }

    public static final int FINAL_SCORE_FIELD_NUMBER = 12;
    private int finalScore_;
    /**
     * <code>uint32 final_score = 12;</code>
     * @return The finalScore.
     */
    @java.lang.Override
    public int getFinalScore() {
      return finalScore_;
    }

    public static final int CLEAN_MUD_COUNT_FIELD_NUMBER = 8;
    private int cleanMudCount_;
    /**
     * <code>uint32 clean_mud_count = 8;</code>
     * @return The cleanMudCount.
     */
    @java.lang.Override
    public int getCleanMudCount() {
      return cleanMudCount_;
    }

    public static final int REASON_FIELD_NUMBER = 15;
    private int reason_;
    /**
     * <code>.GalleryStopReason reason = 15;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.GalleryStopReason reason = 15;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.gingerps.net.proto.GalleryStopReasonOuterClass.GalleryStopReason getReason() {
      @SuppressWarnings("deprecation")
      emu.gingerps.net.proto.GalleryStopReasonOuterClass.GalleryStopReason result = emu.gingerps.net.proto.GalleryStopReasonOuterClass.GalleryStopReason.valueOf(reason_);
      return result == null ? emu.gingerps.net.proto.GalleryStopReasonOuterClass.GalleryStopReason.UNRECOGNIZED : result;
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 11;
    private int galleryId_;
    /**
     * <code>uint32 gallery_id = 11;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
    }

    public static final int KILL_SPECIAL_MONSTER_COUNT_FIELD_NUMBER = 4;
    private int killSpecialMonsterCount_;
    /**
     * <code>uint32 kill_special_monster_count = 4;</code>
     * @return The killSpecialMonsterCount.
     */
    @java.lang.Override
    public int getKillSpecialMonsterCount() {
      return killSpecialMonsterCount_;
    }

    public static final int KILL_MONSTER_COUNT_FIELD_NUMBER = 1;
    private int killMonsterCount_;
    /**
     * <code>uint32 kill_monster_count = 1;</code>
     * @return The killMonsterCount.
     */
    @java.lang.Override
    public int getKillMonsterCount() {
      return killMonsterCount_;
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
      if (killMonsterCount_ != 0) {
        output.writeUInt32(1, killMonsterCount_);
      }
      if (killSpecialMonsterCount_ != 0) {
        output.writeUInt32(4, killSpecialMonsterCount_);
      }
      if (cleanMudCount_ != 0) {
        output.writeUInt32(8, cleanMudCount_);
      }
      if (galleryId_ != 0) {
        output.writeUInt32(11, galleryId_);
      }
      if (finalScore_ != 0) {
        output.writeUInt32(12, finalScore_);
      }
      if (reason_ != emu.gingerps.net.proto.GalleryStopReasonOuterClass.GalleryStopReason.GALLERY_STOP_REASON_NONE.getNumber()) {
        output.writeEnum(15, reason_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (killMonsterCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, killMonsterCount_);
      }
      if (killSpecialMonsterCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, killSpecialMonsterCount_);
      }
      if (cleanMudCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, cleanMudCount_);
      }
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, galleryId_);
      }
      if (finalScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, finalScore_);
      }
      if (reason_ != emu.gingerps.net.proto.GalleryStopReasonOuterClass.GalleryStopReason.GALLERY_STOP_REASON_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(15, reason_);
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
      if (!(obj instanceof emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo other = (emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo) obj;

      if (getFinalScore()
          != other.getFinalScore()) return false;
      if (getCleanMudCount()
          != other.getCleanMudCount()) return false;
      if (reason_ != other.reason_) return false;
      if (getGalleryId()
          != other.getGalleryId()) return false;
      if (getKillSpecialMonsterCount()
          != other.getKillSpecialMonsterCount()) return false;
      if (getKillMonsterCount()
          != other.getKillMonsterCount()) return false;
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
      hash = (37 * hash) + FINAL_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getFinalScore();
      hash = (37 * hash) + CLEAN_MUD_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCleanMudCount();
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (37 * hash) + KILL_SPECIAL_MONSTER_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getKillSpecialMonsterCount();
      hash = (37 * hash) + KILL_MONSTER_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getKillMonsterCount();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo prototype) {
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
     * Protobuf type {@code LuminanceStoneChallengeGallerySettleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LuminanceStoneChallengeGallerySettleInfo)
        emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.internal_static_LuminanceStoneChallengeGallerySettleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.internal_static_LuminanceStoneChallengeGallerySettleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo.class, emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo.newBuilder()
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
        finalScore_ = 0;

        cleanMudCount_ = 0;

        reason_ = 0;

        galleryId_ = 0;

        killSpecialMonsterCount_ = 0;

        killMonsterCount_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.internal_static_LuminanceStoneChallengeGallerySettleInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo build() {
        emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo buildPartial() {
        emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo result = new emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo(this);
        result.finalScore_ = finalScore_;
        result.cleanMudCount_ = cleanMudCount_;
        result.reason_ = reason_;
        result.galleryId_ = galleryId_;
        result.killSpecialMonsterCount_ = killSpecialMonsterCount_;
        result.killMonsterCount_ = killMonsterCount_;
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
        if (other instanceof emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo) {
          return mergeFrom((emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo other) {
        if (other == emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo.getDefaultInstance()) return this;
        if (other.getFinalScore() != 0) {
          setFinalScore(other.getFinalScore());
        }
        if (other.getCleanMudCount() != 0) {
          setCleanMudCount(other.getCleanMudCount());
        }
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
        }
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
        }
        if (other.getKillSpecialMonsterCount() != 0) {
          setKillSpecialMonsterCount(other.getKillSpecialMonsterCount());
        }
        if (other.getKillMonsterCount() != 0) {
          setKillMonsterCount(other.getKillMonsterCount());
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
        emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int finalScore_ ;
      /**
       * <code>uint32 final_score = 12;</code>
       * @return The finalScore.
       */
      @java.lang.Override
      public int getFinalScore() {
        return finalScore_;
      }
      /**
       * <code>uint32 final_score = 12;</code>
       * @param value The finalScore to set.
       * @return This builder for chaining.
       */
      public Builder setFinalScore(int value) {
        
        finalScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 final_score = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinalScore() {
        
        finalScore_ = 0;
        onChanged();
        return this;
      }

      private int cleanMudCount_ ;
      /**
       * <code>uint32 clean_mud_count = 8;</code>
       * @return The cleanMudCount.
       */
      @java.lang.Override
      public int getCleanMudCount() {
        return cleanMudCount_;
      }
      /**
       * <code>uint32 clean_mud_count = 8;</code>
       * @param value The cleanMudCount to set.
       * @return This builder for chaining.
       */
      public Builder setCleanMudCount(int value) {
        
        cleanMudCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 clean_mud_count = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearCleanMudCount() {
        
        cleanMudCount_ = 0;
        onChanged();
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.GalleryStopReason reason = 15;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.GalleryStopReason reason = 15;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GalleryStopReason reason = 15;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.gingerps.net.proto.GalleryStopReasonOuterClass.GalleryStopReason getReason() {
        @SuppressWarnings("deprecation")
        emu.gingerps.net.proto.GalleryStopReasonOuterClass.GalleryStopReason result = emu.gingerps.net.proto.GalleryStopReasonOuterClass.GalleryStopReason.valueOf(reason_);
        return result == null ? emu.gingerps.net.proto.GalleryStopReasonOuterClass.GalleryStopReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.GalleryStopReason reason = 15;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.gingerps.net.proto.GalleryStopReasonOuterClass.GalleryStopReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GalleryStopReason reason = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
        onChanged();
        return this;
      }

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 11;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 11;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        
        galleryId_ = 0;
        onChanged();
        return this;
      }

      private int killSpecialMonsterCount_ ;
      /**
       * <code>uint32 kill_special_monster_count = 4;</code>
       * @return The killSpecialMonsterCount.
       */
      @java.lang.Override
      public int getKillSpecialMonsterCount() {
        return killSpecialMonsterCount_;
      }
      /**
       * <code>uint32 kill_special_monster_count = 4;</code>
       * @param value The killSpecialMonsterCount to set.
       * @return This builder for chaining.
       */
      public Builder setKillSpecialMonsterCount(int value) {
        
        killSpecialMonsterCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 kill_special_monster_count = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearKillSpecialMonsterCount() {
        
        killSpecialMonsterCount_ = 0;
        onChanged();
        return this;
      }

      private int killMonsterCount_ ;
      /**
       * <code>uint32 kill_monster_count = 1;</code>
       * @return The killMonsterCount.
       */
      @java.lang.Override
      public int getKillMonsterCount() {
        return killMonsterCount_;
      }
      /**
       * <code>uint32 kill_monster_count = 1;</code>
       * @param value The killMonsterCount to set.
       * @return This builder for chaining.
       */
      public Builder setKillMonsterCount(int value) {
        
        killMonsterCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 kill_monster_count = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearKillMonsterCount() {
        
        killMonsterCount_ = 0;
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


      // @@protoc_insertion_point(builder_scope:LuminanceStoneChallengeGallerySettleInfo)
    }

    // @@protoc_insertion_point(class_scope:LuminanceStoneChallengeGallerySettleInfo)
    private static final emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo();
    }

    public static emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LuminanceStoneChallengeGallerySettleInfo>
        PARSER = new com.google.protobuf.AbstractParser<LuminanceStoneChallengeGallerySettleInfo>() {
      @java.lang.Override
      public LuminanceStoneChallengeGallerySettleInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LuminanceStoneChallengeGallerySettleInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LuminanceStoneChallengeGallerySettleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LuminanceStoneChallengeGallerySettleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.LuminanceStoneChallengeGallerySettleInfoOuterClass.LuminanceStoneChallengeGallerySettleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LuminanceStoneChallengeGallerySettleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LuminanceStoneChallengeGallerySettleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.LuminanceStoneChallengeGallerySettleIn" +
      "fo.proto\032\027GalleryStopReason.proto\"\320\001\n(Lu" +
      "minanceStoneChallengeGallerySettleInfo\022\023" +
      "\n\013final_score\030\014 \001(\r\022\027\n\017clean_mud_count\030\010" +
      " \001(\r\022\"\n\006reason\030\017 \001(\0162\022.GalleryStopReason" +
      "\022\022\n\ngallery_id\030\013 \001(\r\022\"\n\032kill_special_mon" +
      "ster_count\030\004 \001(\r\022\032\n\022kill_monster_count\030\001" +
      " \001(\rB\033\n\031emu.gingerps.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.GalleryStopReasonOuterClass.getDescriptor(),
        });
    internal_static_LuminanceStoneChallengeGallerySettleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LuminanceStoneChallengeGallerySettleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LuminanceStoneChallengeGallerySettleInfo_descriptor,
        new java.lang.String[] { "FinalScore", "CleanMudCount", "Reason", "GalleryId", "KillSpecialMonsterCount", "KillMonsterCount", });
    emu.gingerps.net.proto.GalleryStopReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
