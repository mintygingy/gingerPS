// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGStartChallengeReq.proto

package emu.gingerps.net.proto;

public final class GCGStartChallengeReqOuterClass {
  private GCGStartChallengeReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGStartChallengeReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGStartChallengeReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.GCGLevelType level_type = 12;</code>
     * @return The enum numeric value on the wire for levelType.
     */
    int getLevelTypeValue();
    /**
     * <code>.GCGLevelType level_type = 12;</code>
     * @return The levelType.
     */
    emu.gingerps.net.proto.GCGLevelTypeOuterClass.GCGLevelType getLevelType();

    /**
     * <code>uint32 config_id = 7;</code>
     * @return The configId.
     */
    int getConfigId();

    /**
     * <code>uint32 level_id = 2;</code>
     * @return The levelId.
     */
    int getLevelId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 7964;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GCGStartChallengeReq}
   */
  public static final class GCGStartChallengeReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGStartChallengeReq)
      GCGStartChallengeReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGStartChallengeReq.newBuilder() to construct.
    private GCGStartChallengeReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGStartChallengeReq() {
      levelType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGStartChallengeReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGStartChallengeReq(
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
            case 16: {

              levelId_ = input.readUInt32();
              break;
            }
            case 56: {

              configId_ = input.readUInt32();
              break;
            }
            case 96: {
              int rawValue = input.readEnum();

              levelType_ = rawValue;
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
      return emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.internal_static_GCGStartChallengeReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.internal_static_GCGStartChallengeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq.class, emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq.Builder.class);
    }

    public static final int LEVEL_TYPE_FIELD_NUMBER = 12;
    private int levelType_;
    /**
     * <code>.GCGLevelType level_type = 12;</code>
     * @return The enum numeric value on the wire for levelType.
     */
    @java.lang.Override public int getLevelTypeValue() {
      return levelType_;
    }
    /**
     * <code>.GCGLevelType level_type = 12;</code>
     * @return The levelType.
     */
    @java.lang.Override public emu.gingerps.net.proto.GCGLevelTypeOuterClass.GCGLevelType getLevelType() {
      @SuppressWarnings("deprecation")
      emu.gingerps.net.proto.GCGLevelTypeOuterClass.GCGLevelType result = emu.gingerps.net.proto.GCGLevelTypeOuterClass.GCGLevelType.valueOf(levelType_);
      return result == null ? emu.gingerps.net.proto.GCGLevelTypeOuterClass.GCGLevelType.UNRECOGNIZED : result;
    }

    public static final int CONFIG_ID_FIELD_NUMBER = 7;
    private int configId_;
    /**
     * <code>uint32 config_id = 7;</code>
     * @return The configId.
     */
    @java.lang.Override
    public int getConfigId() {
      return configId_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 2;
    private int levelId_;
    /**
     * <code>uint32 level_id = 2;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
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
      if (levelId_ != 0) {
        output.writeUInt32(2, levelId_);
      }
      if (configId_ != 0) {
        output.writeUInt32(7, configId_);
      }
      if (levelType_ != emu.gingerps.net.proto.GCGLevelTypeOuterClass.GCGLevelType.GCG_LEVEL_TYPE_NONE.getNumber()) {
        output.writeEnum(12, levelType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, levelId_);
      }
      if (configId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, configId_);
      }
      if (levelType_ != emu.gingerps.net.proto.GCGLevelTypeOuterClass.GCGLevelType.GCG_LEVEL_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(12, levelType_);
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
      if (!(obj instanceof emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq other = (emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq) obj;

      if (levelType_ != other.levelType_) return false;
      if (getConfigId()
          != other.getConfigId()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
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
      hash = (37 * hash) + LEVEL_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + levelType_;
      hash = (37 * hash) + CONFIG_ID_FIELD_NUMBER;
      hash = (53 * hash) + getConfigId();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq prototype) {
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
     *   CMD_ID = 7964;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GCGStartChallengeReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGStartChallengeReq)
        emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.internal_static_GCGStartChallengeReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.internal_static_GCGStartChallengeReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq.class, emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq.newBuilder()
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
        levelType_ = 0;

        configId_ = 0;

        levelId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.internal_static_GCGStartChallengeReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq build() {
        emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq buildPartial() {
        emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq result = new emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq(this);
        result.levelType_ = levelType_;
        result.configId_ = configId_;
        result.levelId_ = levelId_;
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
        if (other instanceof emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq) {
          return mergeFrom((emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq other) {
        if (other == emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq.getDefaultInstance()) return this;
        if (other.levelType_ != 0) {
          setLevelTypeValue(other.getLevelTypeValue());
        }
        if (other.getConfigId() != 0) {
          setConfigId(other.getConfigId());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
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
        emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int levelType_ = 0;
      /**
       * <code>.GCGLevelType level_type = 12;</code>
       * @return The enum numeric value on the wire for levelType.
       */
      @java.lang.Override public int getLevelTypeValue() {
        return levelType_;
      }
      /**
       * <code>.GCGLevelType level_type = 12;</code>
       * @param value The enum numeric value on the wire for levelType to set.
       * @return This builder for chaining.
       */
      public Builder setLevelTypeValue(int value) {
        
        levelType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GCGLevelType level_type = 12;</code>
       * @return The levelType.
       */
      @java.lang.Override
      public emu.gingerps.net.proto.GCGLevelTypeOuterClass.GCGLevelType getLevelType() {
        @SuppressWarnings("deprecation")
        emu.gingerps.net.proto.GCGLevelTypeOuterClass.GCGLevelType result = emu.gingerps.net.proto.GCGLevelTypeOuterClass.GCGLevelType.valueOf(levelType_);
        return result == null ? emu.gingerps.net.proto.GCGLevelTypeOuterClass.GCGLevelType.UNRECOGNIZED : result;
      }
      /**
       * <code>.GCGLevelType level_type = 12;</code>
       * @param value The levelType to set.
       * @return This builder for chaining.
       */
      public Builder setLevelType(emu.gingerps.net.proto.GCGLevelTypeOuterClass.GCGLevelType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        levelType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GCGLevelType level_type = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelType() {
        
        levelType_ = 0;
        onChanged();
        return this;
      }

      private int configId_ ;
      /**
       * <code>uint32 config_id = 7;</code>
       * @return The configId.
       */
      @java.lang.Override
      public int getConfigId() {
        return configId_;
      }
      /**
       * <code>uint32 config_id = 7;</code>
       * @param value The configId to set.
       * @return This builder for chaining.
       */
      public Builder setConfigId(int value) {
        
        configId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 config_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearConfigId() {
        
        configId_ = 0;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 2;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 2;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGStartChallengeReq)
    }

    // @@protoc_insertion_point(class_scope:GCGStartChallengeReq)
    private static final emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq();
    }

    public static emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGStartChallengeReq>
        PARSER = new com.google.protobuf.AbstractParser<GCGStartChallengeReq>() {
      @java.lang.Override
      public GCGStartChallengeReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGStartChallengeReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGStartChallengeReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGStartChallengeReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.GCGStartChallengeReqOuterClass.GCGStartChallengeReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGStartChallengeReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGStartChallengeReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032GCGStartChallengeReq.proto\032\022GCGLevelTy" +
      "pe.proto\"^\n\024GCGStartChallengeReq\022!\n\nleve" +
      "l_type\030\014 \001(\0162\r.GCGLevelType\022\021\n\tconfig_id" +
      "\030\007 \001(\r\022\020\n\010level_id\030\002 \001(\rB\033\n\031emu.grasscut" +
      "ter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.GCGLevelTypeOuterClass.getDescriptor(),
        });
    internal_static_GCGStartChallengeReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGStartChallengeReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGStartChallengeReq_descriptor,
        new java.lang.String[] { "LevelType", "ConfigId", "LevelId", });
    emu.gingerps.net.proto.GCGLevelTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
