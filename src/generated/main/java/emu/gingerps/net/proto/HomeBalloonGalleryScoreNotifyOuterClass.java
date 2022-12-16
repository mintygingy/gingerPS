// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeBalloonGalleryScoreNotify.proto

package emu.gingerps.net.proto;

public final class HomeBalloonGalleryScoreNotifyOuterClass {
  private HomeBalloonGalleryScoreNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeBalloonGalleryScoreNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeBalloonGalleryScoreNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gallery_id = 1;</code>
     * @return The galleryId.
     */
    int getGalleryId();

    /**
     * <code>uint32 trigger_entity_id = 3;</code>
     * @return The triggerEntityId.
     */
    int getTriggerEntityId();

    /**
     * <code>uint32 add_score = 4;</code>
     * @return The addScore.
     */
    int getAddScore();

    /**
     * <code>uint32 cur_score = 14;</code>
     * @return The curScore.
     */
    int getCurScore();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4734;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code HomeBalloonGalleryScoreNotify}
   */
  public static final class HomeBalloonGalleryScoreNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeBalloonGalleryScoreNotify)
      HomeBalloonGalleryScoreNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeBalloonGalleryScoreNotify.newBuilder() to construct.
    private HomeBalloonGalleryScoreNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeBalloonGalleryScoreNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeBalloonGalleryScoreNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeBalloonGalleryScoreNotify(
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

              galleryId_ = input.readUInt32();
              break;
            }
            case 24: {

              triggerEntityId_ = input.readUInt32();
              break;
            }
            case 32: {

              addScore_ = input.readUInt32();
              break;
            }
            case 112: {

              curScore_ = input.readUInt32();
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
      return emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.internal_static_HomeBalloonGalleryScoreNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.internal_static_HomeBalloonGalleryScoreNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify.class, emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify.Builder.class);
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 1;
    private int galleryId_;
    /**
     * <code>uint32 gallery_id = 1;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
    }

    public static final int TRIGGER_ENTITY_ID_FIELD_NUMBER = 3;
    private int triggerEntityId_;
    /**
     * <code>uint32 trigger_entity_id = 3;</code>
     * @return The triggerEntityId.
     */
    @java.lang.Override
    public int getTriggerEntityId() {
      return triggerEntityId_;
    }

    public static final int ADD_SCORE_FIELD_NUMBER = 4;
    private int addScore_;
    /**
     * <code>uint32 add_score = 4;</code>
     * @return The addScore.
     */
    @java.lang.Override
    public int getAddScore() {
      return addScore_;
    }

    public static final int CUR_SCORE_FIELD_NUMBER = 14;
    private int curScore_;
    /**
     * <code>uint32 cur_score = 14;</code>
     * @return The curScore.
     */
    @java.lang.Override
    public int getCurScore() {
      return curScore_;
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
      if (galleryId_ != 0) {
        output.writeUInt32(1, galleryId_);
      }
      if (triggerEntityId_ != 0) {
        output.writeUInt32(3, triggerEntityId_);
      }
      if (addScore_ != 0) {
        output.writeUInt32(4, addScore_);
      }
      if (curScore_ != 0) {
        output.writeUInt32(14, curScore_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, galleryId_);
      }
      if (triggerEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, triggerEntityId_);
      }
      if (addScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, addScore_);
      }
      if (curScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, curScore_);
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
      if (!(obj instanceof emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify other = (emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify) obj;

      if (getGalleryId()
          != other.getGalleryId()) return false;
      if (getTriggerEntityId()
          != other.getTriggerEntityId()) return false;
      if (getAddScore()
          != other.getAddScore()) return false;
      if (getCurScore()
          != other.getCurScore()) return false;
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
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (37 * hash) + TRIGGER_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTriggerEntityId();
      hash = (37 * hash) + ADD_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getAddScore();
      hash = (37 * hash) + CUR_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getCurScore();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify prototype) {
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
     *   CMD_ID = 4734;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code HomeBalloonGalleryScoreNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeBalloonGalleryScoreNotify)
        emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.internal_static_HomeBalloonGalleryScoreNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.internal_static_HomeBalloonGalleryScoreNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify.class, emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify.newBuilder()
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
        galleryId_ = 0;

        triggerEntityId_ = 0;

        addScore_ = 0;

        curScore_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.internal_static_HomeBalloonGalleryScoreNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify build() {
        emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify buildPartial() {
        emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify result = new emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify(this);
        result.galleryId_ = galleryId_;
        result.triggerEntityId_ = triggerEntityId_;
        result.addScore_ = addScore_;
        result.curScore_ = curScore_;
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
        if (other instanceof emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify) {
          return mergeFrom((emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify other) {
        if (other == emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify.getDefaultInstance()) return this;
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
        }
        if (other.getTriggerEntityId() != 0) {
          setTriggerEntityId(other.getTriggerEntityId());
        }
        if (other.getAddScore() != 0) {
          setAddScore(other.getAddScore());
        }
        if (other.getCurScore() != 0) {
          setCurScore(other.getCurScore());
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
        emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 1;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 1;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        
        galleryId_ = 0;
        onChanged();
        return this;
      }

      private int triggerEntityId_ ;
      /**
       * <code>uint32 trigger_entity_id = 3;</code>
       * @return The triggerEntityId.
       */
      @java.lang.Override
      public int getTriggerEntityId() {
        return triggerEntityId_;
      }
      /**
       * <code>uint32 trigger_entity_id = 3;</code>
       * @param value The triggerEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setTriggerEntityId(int value) {
        
        triggerEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 trigger_entity_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearTriggerEntityId() {
        
        triggerEntityId_ = 0;
        onChanged();
        return this;
      }

      private int addScore_ ;
      /**
       * <code>uint32 add_score = 4;</code>
       * @return The addScore.
       */
      @java.lang.Override
      public int getAddScore() {
        return addScore_;
      }
      /**
       * <code>uint32 add_score = 4;</code>
       * @param value The addScore to set.
       * @return This builder for chaining.
       */
      public Builder setAddScore(int value) {
        
        addScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 add_score = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearAddScore() {
        
        addScore_ = 0;
        onChanged();
        return this;
      }

      private int curScore_ ;
      /**
       * <code>uint32 cur_score = 14;</code>
       * @return The curScore.
       */
      @java.lang.Override
      public int getCurScore() {
        return curScore_;
      }
      /**
       * <code>uint32 cur_score = 14;</code>
       * @param value The curScore to set.
       * @return This builder for chaining.
       */
      public Builder setCurScore(int value) {
        
        curScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_score = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurScore() {
        
        curScore_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomeBalloonGalleryScoreNotify)
    }

    // @@protoc_insertion_point(class_scope:HomeBalloonGalleryScoreNotify)
    private static final emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify();
    }

    public static emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeBalloonGalleryScoreNotify>
        PARSER = new com.google.protobuf.AbstractParser<HomeBalloonGalleryScoreNotify>() {
      @java.lang.Override
      public HomeBalloonGalleryScoreNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeBalloonGalleryScoreNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeBalloonGalleryScoreNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeBalloonGalleryScoreNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.HomeBalloonGalleryScoreNotifyOuterClass.HomeBalloonGalleryScoreNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeBalloonGalleryScoreNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeBalloonGalleryScoreNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#HomeBalloonGalleryScoreNotify.proto\"t\n" +
      "\035HomeBalloonGalleryScoreNotify\022\022\n\ngaller" +
      "y_id\030\001 \001(\r\022\031\n\021trigger_entity_id\030\003 \001(\r\022\021\n" +
      "\tadd_score\030\004 \001(\r\022\021\n\tcur_score\030\016 \001(\rB\033\n\031e" +
      "mu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeBalloonGalleryScoreNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeBalloonGalleryScoreNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeBalloonGalleryScoreNotify_descriptor,
        new java.lang.String[] { "GalleryId", "TriggerEntityId", "AddScore", "CurScore", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}