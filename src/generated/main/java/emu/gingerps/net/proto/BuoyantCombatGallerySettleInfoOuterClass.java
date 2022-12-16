// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BuoyantCombatGallerySettleInfo.proto

package emu.gingerps.net.proto;

public final class BuoyantCombatGallerySettleInfoOuterClass {
  private BuoyantCombatGallerySettleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BuoyantCombatGallerySettleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BuoyantCombatGallerySettleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gallery_level = 11;</code>
     * @return The galleryLevel.
     */
    int getGalleryLevel();

    /**
     * <code>uint32 kill_monster_count = 1;</code>
     * @return The killMonsterCount.
     */
    int getKillMonsterCount();

    /**
     * <code>uint32 kill_special_monster_count = 9;</code>
     * @return The killSpecialMonsterCount.
     */
    int getKillSpecialMonsterCount();

    /**
     * <code>uint32 Unk3300_HLFHLPEKOML = 7;</code>
     * @return The unk3300HLFHLPEKOML.
     */
    int getUnk3300HLFHLPEKOML();

    /**
     * <code>uint32 gallery_id = 2;</code>
     * @return The galleryId.
     */
    int getGalleryId();

    /**
     * <code>uint32 Unk3300_KPCJBOOGEMG = 10;</code>
     * @return The unk3300KPCJBOOGEMG.
     */
    int getUnk3300KPCJBOOGEMG();

    /**
     * <code>uint32 final_score = 12;</code>
     * @return The finalScore.
     */
    int getFinalScore();
  }
  /**
   * Protobuf type {@code BuoyantCombatGallerySettleInfo}
   */
  public static final class BuoyantCombatGallerySettleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BuoyantCombatGallerySettleInfo)
      BuoyantCombatGallerySettleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BuoyantCombatGallerySettleInfo.newBuilder() to construct.
    private BuoyantCombatGallerySettleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BuoyantCombatGallerySettleInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BuoyantCombatGallerySettleInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BuoyantCombatGallerySettleInfo(
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
            case 16: {

              galleryId_ = input.readUInt32();
              break;
            }
            case 56: {

              unk3300HLFHLPEKOML_ = input.readUInt32();
              break;
            }
            case 72: {

              killSpecialMonsterCount_ = input.readUInt32();
              break;
            }
            case 80: {

              unk3300KPCJBOOGEMG_ = input.readUInt32();
              break;
            }
            case 88: {

              galleryLevel_ = input.readUInt32();
              break;
            }
            case 96: {

              finalScore_ = input.readUInt32();
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
      return emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.internal_static_BuoyantCombatGallerySettleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.internal_static_BuoyantCombatGallerySettleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo.class, emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo.Builder.class);
    }

    public static final int GALLERY_LEVEL_FIELD_NUMBER = 11;
    private int galleryLevel_;
    /**
     * <code>uint32 gallery_level = 11;</code>
     * @return The galleryLevel.
     */
    @java.lang.Override
    public int getGalleryLevel() {
      return galleryLevel_;
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

    public static final int KILL_SPECIAL_MONSTER_COUNT_FIELD_NUMBER = 9;
    private int killSpecialMonsterCount_;
    /**
     * <code>uint32 kill_special_monster_count = 9;</code>
     * @return The killSpecialMonsterCount.
     */
    @java.lang.Override
    public int getKillSpecialMonsterCount() {
      return killSpecialMonsterCount_;
    }

    public static final int UNK3300_HLFHLPEKOML_FIELD_NUMBER = 7;
    private int unk3300HLFHLPEKOML_;
    /**
     * <code>uint32 Unk3300_HLFHLPEKOML = 7;</code>
     * @return The unk3300HLFHLPEKOML.
     */
    @java.lang.Override
    public int getUnk3300HLFHLPEKOML() {
      return unk3300HLFHLPEKOML_;
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 2;
    private int galleryId_;
    /**
     * <code>uint32 gallery_id = 2;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
    }

    public static final int UNK3300_KPCJBOOGEMG_FIELD_NUMBER = 10;
    private int unk3300KPCJBOOGEMG_;
    /**
     * <code>uint32 Unk3300_KPCJBOOGEMG = 10;</code>
     * @return The unk3300KPCJBOOGEMG.
     */
    @java.lang.Override
    public int getUnk3300KPCJBOOGEMG() {
      return unk3300KPCJBOOGEMG_;
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
      if (galleryId_ != 0) {
        output.writeUInt32(2, galleryId_);
      }
      if (unk3300HLFHLPEKOML_ != 0) {
        output.writeUInt32(7, unk3300HLFHLPEKOML_);
      }
      if (killSpecialMonsterCount_ != 0) {
        output.writeUInt32(9, killSpecialMonsterCount_);
      }
      if (unk3300KPCJBOOGEMG_ != 0) {
        output.writeUInt32(10, unk3300KPCJBOOGEMG_);
      }
      if (galleryLevel_ != 0) {
        output.writeUInt32(11, galleryLevel_);
      }
      if (finalScore_ != 0) {
        output.writeUInt32(12, finalScore_);
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
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, galleryId_);
      }
      if (unk3300HLFHLPEKOML_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, unk3300HLFHLPEKOML_);
      }
      if (killSpecialMonsterCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, killSpecialMonsterCount_);
      }
      if (unk3300KPCJBOOGEMG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, unk3300KPCJBOOGEMG_);
      }
      if (galleryLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, galleryLevel_);
      }
      if (finalScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, finalScore_);
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
      if (!(obj instanceof emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo other = (emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo) obj;

      if (getGalleryLevel()
          != other.getGalleryLevel()) return false;
      if (getKillMonsterCount()
          != other.getKillMonsterCount()) return false;
      if (getKillSpecialMonsterCount()
          != other.getKillSpecialMonsterCount()) return false;
      if (getUnk3300HLFHLPEKOML()
          != other.getUnk3300HLFHLPEKOML()) return false;
      if (getGalleryId()
          != other.getGalleryId()) return false;
      if (getUnk3300KPCJBOOGEMG()
          != other.getUnk3300KPCJBOOGEMG()) return false;
      if (getFinalScore()
          != other.getFinalScore()) return false;
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
      hash = (37 * hash) + GALLERY_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryLevel();
      hash = (37 * hash) + KILL_MONSTER_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getKillMonsterCount();
      hash = (37 * hash) + KILL_SPECIAL_MONSTER_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getKillSpecialMonsterCount();
      hash = (37 * hash) + UNK3300_HLFHLPEKOML_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300HLFHLPEKOML();
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (37 * hash) + UNK3300_KPCJBOOGEMG_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300KPCJBOOGEMG();
      hash = (37 * hash) + FINAL_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getFinalScore();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo prototype) {
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
     * Protobuf type {@code BuoyantCombatGallerySettleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BuoyantCombatGallerySettleInfo)
        emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.internal_static_BuoyantCombatGallerySettleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.internal_static_BuoyantCombatGallerySettleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo.class, emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo.newBuilder()
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
        galleryLevel_ = 0;

        killMonsterCount_ = 0;

        killSpecialMonsterCount_ = 0;

        unk3300HLFHLPEKOML_ = 0;

        galleryId_ = 0;

        unk3300KPCJBOOGEMG_ = 0;

        finalScore_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.internal_static_BuoyantCombatGallerySettleInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo build() {
        emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo buildPartial() {
        emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo result = new emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo(this);
        result.galleryLevel_ = galleryLevel_;
        result.killMonsterCount_ = killMonsterCount_;
        result.killSpecialMonsterCount_ = killSpecialMonsterCount_;
        result.unk3300HLFHLPEKOML_ = unk3300HLFHLPEKOML_;
        result.galleryId_ = galleryId_;
        result.unk3300KPCJBOOGEMG_ = unk3300KPCJBOOGEMG_;
        result.finalScore_ = finalScore_;
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
        if (other instanceof emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo) {
          return mergeFrom((emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo other) {
        if (other == emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo.getDefaultInstance()) return this;
        if (other.getGalleryLevel() != 0) {
          setGalleryLevel(other.getGalleryLevel());
        }
        if (other.getKillMonsterCount() != 0) {
          setKillMonsterCount(other.getKillMonsterCount());
        }
        if (other.getKillSpecialMonsterCount() != 0) {
          setKillSpecialMonsterCount(other.getKillSpecialMonsterCount());
        }
        if (other.getUnk3300HLFHLPEKOML() != 0) {
          setUnk3300HLFHLPEKOML(other.getUnk3300HLFHLPEKOML());
        }
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
        }
        if (other.getUnk3300KPCJBOOGEMG() != 0) {
          setUnk3300KPCJBOOGEMG(other.getUnk3300KPCJBOOGEMG());
        }
        if (other.getFinalScore() != 0) {
          setFinalScore(other.getFinalScore());
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
        emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int galleryLevel_ ;
      /**
       * <code>uint32 gallery_level = 11;</code>
       * @return The galleryLevel.
       */
      @java.lang.Override
      public int getGalleryLevel() {
        return galleryLevel_;
      }
      /**
       * <code>uint32 gallery_level = 11;</code>
       * @param value The galleryLevel to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryLevel(int value) {
        
        galleryLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_level = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryLevel() {
        
        galleryLevel_ = 0;
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

      private int killSpecialMonsterCount_ ;
      /**
       * <code>uint32 kill_special_monster_count = 9;</code>
       * @return The killSpecialMonsterCount.
       */
      @java.lang.Override
      public int getKillSpecialMonsterCount() {
        return killSpecialMonsterCount_;
      }
      /**
       * <code>uint32 kill_special_monster_count = 9;</code>
       * @param value The killSpecialMonsterCount to set.
       * @return This builder for chaining.
       */
      public Builder setKillSpecialMonsterCount(int value) {
        
        killSpecialMonsterCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 kill_special_monster_count = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearKillSpecialMonsterCount() {
        
        killSpecialMonsterCount_ = 0;
        onChanged();
        return this;
      }

      private int unk3300HLFHLPEKOML_ ;
      /**
       * <code>uint32 Unk3300_HLFHLPEKOML = 7;</code>
       * @return The unk3300HLFHLPEKOML.
       */
      @java.lang.Override
      public int getUnk3300HLFHLPEKOML() {
        return unk3300HLFHLPEKOML_;
      }
      /**
       * <code>uint32 Unk3300_HLFHLPEKOML = 7;</code>
       * @param value The unk3300HLFHLPEKOML to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300HLFHLPEKOML(int value) {
        
        unk3300HLFHLPEKOML_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_HLFHLPEKOML = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300HLFHLPEKOML() {
        
        unk3300HLFHLPEKOML_ = 0;
        onChanged();
        return this;
      }

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 2;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 2;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        
        galleryId_ = 0;
        onChanged();
        return this;
      }

      private int unk3300KPCJBOOGEMG_ ;
      /**
       * <code>uint32 Unk3300_KPCJBOOGEMG = 10;</code>
       * @return The unk3300KPCJBOOGEMG.
       */
      @java.lang.Override
      public int getUnk3300KPCJBOOGEMG() {
        return unk3300KPCJBOOGEMG_;
      }
      /**
       * <code>uint32 Unk3300_KPCJBOOGEMG = 10;</code>
       * @param value The unk3300KPCJBOOGEMG to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300KPCJBOOGEMG(int value) {
        
        unk3300KPCJBOOGEMG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_KPCJBOOGEMG = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300KPCJBOOGEMG() {
        
        unk3300KPCJBOOGEMG_ = 0;
        onChanged();
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


      // @@protoc_insertion_point(builder_scope:BuoyantCombatGallerySettleInfo)
    }

    // @@protoc_insertion_point(class_scope:BuoyantCombatGallerySettleInfo)
    private static final emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo();
    }

    public static emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BuoyantCombatGallerySettleInfo>
        PARSER = new com.google.protobuf.AbstractParser<BuoyantCombatGallerySettleInfo>() {
      @java.lang.Override
      public BuoyantCombatGallerySettleInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BuoyantCombatGallerySettleInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BuoyantCombatGallerySettleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BuoyantCombatGallerySettleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.BuoyantCombatGallerySettleInfoOuterClass.BuoyantCombatGallerySettleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BuoyantCombatGallerySettleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BuoyantCombatGallerySettleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$BuoyantCombatGallerySettleInfo.proto\"\332" +
      "\001\n\036BuoyantCombatGallerySettleInfo\022\025\n\rgal" +
      "lery_level\030\013 \001(\r\022\032\n\022kill_monster_count\030\001" +
      " \001(\r\022\"\n\032kill_special_monster_count\030\t \001(\r" +
      "\022\033\n\023Unk3300_HLFHLPEKOML\030\007 \001(\r\022\022\n\ngallery" +
      "_id\030\002 \001(\r\022\033\n\023Unk3300_KPCJBOOGEMG\030\n \001(\r\022\023" +
      "\n\013final_score\030\014 \001(\rB\033\n\031emu.gingerps.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BuoyantCombatGallerySettleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BuoyantCombatGallerySettleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BuoyantCombatGallerySettleInfo_descriptor,
        new java.lang.String[] { "GalleryLevel", "KillMonsterCount", "KillSpecialMonsterCount", "Unk3300HLFHLPEKOML", "GalleryId", "Unk3300KPCJBOOGEMG", "FinalScore", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
