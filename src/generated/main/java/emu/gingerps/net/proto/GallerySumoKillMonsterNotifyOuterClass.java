// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GallerySumoKillMonsterNotify.proto

package emu.gingerps.net.proto;

public final class GallerySumoKillMonsterNotifyOuterClass {
  private GallerySumoKillMonsterNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GallerySumoKillMonsterNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GallerySumoKillMonsterNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 score = 6;</code>
     * @return The score.
     */
    int getScore();

    /**
     * <code>uint32 gallery_id = 11;</code>
     * @return The galleryId.
     */
    int getGalleryId();

    /**
     * <code>uint32 kill_elite_monster_num = 14;</code>
     * @return The killEliteMonsterNum.
     */
    int getKillEliteMonsterNum();

    /**
     * <code>uint32 kill_normal_monster_num = 4;</code>
     * @return The killNormalMonsterNum.
     */
    int getKillNormalMonsterNum();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 5590;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GallerySumoKillMonsterNotify}
   */
  public static final class GallerySumoKillMonsterNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GallerySumoKillMonsterNotify)
      GallerySumoKillMonsterNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GallerySumoKillMonsterNotify.newBuilder() to construct.
    private GallerySumoKillMonsterNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GallerySumoKillMonsterNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GallerySumoKillMonsterNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GallerySumoKillMonsterNotify(
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
            case 32: {

              killNormalMonsterNum_ = input.readUInt32();
              break;
            }
            case 48: {

              score_ = input.readUInt32();
              break;
            }
            case 88: {

              galleryId_ = input.readUInt32();
              break;
            }
            case 112: {

              killEliteMonsterNum_ = input.readUInt32();
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
      return emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.internal_static_GallerySumoKillMonsterNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.internal_static_GallerySumoKillMonsterNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify.class, emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify.Builder.class);
    }

    public static final int SCORE_FIELD_NUMBER = 6;
    private int score_;
    /**
     * <code>uint32 score = 6;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
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

    public static final int KILL_ELITE_MONSTER_NUM_FIELD_NUMBER = 14;
    private int killEliteMonsterNum_;
    /**
     * <code>uint32 kill_elite_monster_num = 14;</code>
     * @return The killEliteMonsterNum.
     */
    @java.lang.Override
    public int getKillEliteMonsterNum() {
      return killEliteMonsterNum_;
    }

    public static final int KILL_NORMAL_MONSTER_NUM_FIELD_NUMBER = 4;
    private int killNormalMonsterNum_;
    /**
     * <code>uint32 kill_normal_monster_num = 4;</code>
     * @return The killNormalMonsterNum.
     */
    @java.lang.Override
    public int getKillNormalMonsterNum() {
      return killNormalMonsterNum_;
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
      if (killNormalMonsterNum_ != 0) {
        output.writeUInt32(4, killNormalMonsterNum_);
      }
      if (score_ != 0) {
        output.writeUInt32(6, score_);
      }
      if (galleryId_ != 0) {
        output.writeUInt32(11, galleryId_);
      }
      if (killEliteMonsterNum_ != 0) {
        output.writeUInt32(14, killEliteMonsterNum_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (killNormalMonsterNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, killNormalMonsterNum_);
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, score_);
      }
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, galleryId_);
      }
      if (killEliteMonsterNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, killEliteMonsterNum_);
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
      if (!(obj instanceof emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify other = (emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify) obj;

      if (getScore()
          != other.getScore()) return false;
      if (getGalleryId()
          != other.getGalleryId()) return false;
      if (getKillEliteMonsterNum()
          != other.getKillEliteMonsterNum()) return false;
      if (getKillNormalMonsterNum()
          != other.getKillNormalMonsterNum()) return false;
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
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (37 * hash) + KILL_ELITE_MONSTER_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getKillEliteMonsterNum();
      hash = (37 * hash) + KILL_NORMAL_MONSTER_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getKillNormalMonsterNum();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify prototype) {
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
     *   CMD_ID = 5590;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GallerySumoKillMonsterNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GallerySumoKillMonsterNotify)
        emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.internal_static_GallerySumoKillMonsterNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.internal_static_GallerySumoKillMonsterNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify.class, emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify.newBuilder()
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
        score_ = 0;

        galleryId_ = 0;

        killEliteMonsterNum_ = 0;

        killNormalMonsterNum_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.internal_static_GallerySumoKillMonsterNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify build() {
        emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify buildPartial() {
        emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify result = new emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify(this);
        result.score_ = score_;
        result.galleryId_ = galleryId_;
        result.killEliteMonsterNum_ = killEliteMonsterNum_;
        result.killNormalMonsterNum_ = killNormalMonsterNum_;
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
        if (other instanceof emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify) {
          return mergeFrom((emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify other) {
        if (other == emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify.getDefaultInstance()) return this;
        if (other.getScore() != 0) {
          setScore(other.getScore());
        }
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
        }
        if (other.getKillEliteMonsterNum() != 0) {
          setKillEliteMonsterNum(other.getKillEliteMonsterNum());
        }
        if (other.getKillNormalMonsterNum() != 0) {
          setKillNormalMonsterNum(other.getKillNormalMonsterNum());
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
        emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int score_ ;
      /**
       * <code>uint32 score = 6;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 6;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0;
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

      private int killEliteMonsterNum_ ;
      /**
       * <code>uint32 kill_elite_monster_num = 14;</code>
       * @return The killEliteMonsterNum.
       */
      @java.lang.Override
      public int getKillEliteMonsterNum() {
        return killEliteMonsterNum_;
      }
      /**
       * <code>uint32 kill_elite_monster_num = 14;</code>
       * @param value The killEliteMonsterNum to set.
       * @return This builder for chaining.
       */
      public Builder setKillEliteMonsterNum(int value) {
        
        killEliteMonsterNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 kill_elite_monster_num = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearKillEliteMonsterNum() {
        
        killEliteMonsterNum_ = 0;
        onChanged();
        return this;
      }

      private int killNormalMonsterNum_ ;
      /**
       * <code>uint32 kill_normal_monster_num = 4;</code>
       * @return The killNormalMonsterNum.
       */
      @java.lang.Override
      public int getKillNormalMonsterNum() {
        return killNormalMonsterNum_;
      }
      /**
       * <code>uint32 kill_normal_monster_num = 4;</code>
       * @param value The killNormalMonsterNum to set.
       * @return This builder for chaining.
       */
      public Builder setKillNormalMonsterNum(int value) {
        
        killNormalMonsterNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 kill_normal_monster_num = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearKillNormalMonsterNum() {
        
        killNormalMonsterNum_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GallerySumoKillMonsterNotify)
    }

    // @@protoc_insertion_point(class_scope:GallerySumoKillMonsterNotify)
    private static final emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify();
    }

    public static emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GallerySumoKillMonsterNotify>
        PARSER = new com.google.protobuf.AbstractParser<GallerySumoKillMonsterNotify>() {
      @java.lang.Override
      public GallerySumoKillMonsterNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GallerySumoKillMonsterNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GallerySumoKillMonsterNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GallerySumoKillMonsterNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GallerySumoKillMonsterNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GallerySumoKillMonsterNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"GallerySumoKillMonsterNotify.proto\"\202\001\n" +
      "\034GallerySumoKillMonsterNotify\022\r\n\005score\030\006" +
      " \001(\r\022\022\n\ngallery_id\030\013 \001(\r\022\036\n\026kill_elite_m" +
      "onster_num\030\016 \001(\r\022\037\n\027kill_normal_monster_" +
      "num\030\004 \001(\rB\033\n\031emu.gingerps.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GallerySumoKillMonsterNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GallerySumoKillMonsterNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GallerySumoKillMonsterNotify_descriptor,
        new java.lang.String[] { "Score", "GalleryId", "KillEliteMonsterNum", "KillNormalMonsterNum", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
