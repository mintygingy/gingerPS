// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGStartChallengeRsp.proto

package emu.gingerps.net.proto;

public final class GCGStartChallengeRspOuterClass {
  private GCGStartChallengeRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGStartChallengeRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGStartChallengeRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 config_id = 8;</code>
     * @return The configId.
     */
    int getConfigId();

    /**
     * <code>uint32 level_id = 5;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>.GCGLevelType level_type = 11;</code>
     * @return The enum numeric value on the wire for levelType.
     */
    int getLevelTypeValue();
    /**
     * <code>.GCGLevelType level_type = 11;</code>
     * @return The levelType.
     */
    emu.gingerps.net.proto.GCGLevelTypeOuterClass.GCGLevelType getLevelType();

    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 7999;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GCGStartChallengeRsp}
   */
  public static final class GCGStartChallengeRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGStartChallengeRsp)
      GCGStartChallengeRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGStartChallengeRsp.newBuilder() to construct.
    private GCGStartChallengeRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGStartChallengeRsp() {
      levelType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGStartChallengeRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGStartChallengeRsp(
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

              retcode_ = input.readInt32();
              break;
            }
            case 40: {

              levelId_ = input.readUInt32();
              break;
            }
            case 64: {

              configId_ = input.readUInt32();
              break;
            }
            case 88: {
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
      return emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.internal_static_GCGStartChallengeRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.internal_static_GCGStartChallengeRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp.class, emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp.Builder.class);
    }

    public static final int CONFIG_ID_FIELD_NUMBER = 8;
    private int configId_;
    /**
     * <code>uint32 config_id = 8;</code>
     * @return The configId.
     */
    @java.lang.Override
    public int getConfigId() {
      return configId_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 5;
    private int levelId_;
    /**
     * <code>uint32 level_id = 5;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int LEVEL_TYPE_FIELD_NUMBER = 11;
    private int levelType_;
    /**
     * <code>.GCGLevelType level_type = 11;</code>
     * @return The enum numeric value on the wire for levelType.
     */
    @java.lang.Override public int getLevelTypeValue() {
      return levelType_;
    }
    /**
     * <code>.GCGLevelType level_type = 11;</code>
     * @return The levelType.
     */
    @java.lang.Override public emu.gingerps.net.proto.GCGLevelTypeOuterClass.GCGLevelType getLevelType() {
      @SuppressWarnings("deprecation")
      emu.gingerps.net.proto.GCGLevelTypeOuterClass.GCGLevelType result = emu.gingerps.net.proto.GCGLevelTypeOuterClass.GCGLevelType.valueOf(levelType_);
      return result == null ? emu.gingerps.net.proto.GCGLevelTypeOuterClass.GCGLevelType.UNRECOGNIZED : result;
    }

    public static final int RETCODE_FIELD_NUMBER = 1;
    private int retcode_;
    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (retcode_ != 0) {
        output.writeInt32(1, retcode_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(5, levelId_);
      }
      if (configId_ != 0) {
        output.writeUInt32(8, configId_);
      }
      if (levelType_ != emu.gingerps.net.proto.GCGLevelTypeOuterClass.GCGLevelType.GCG_LEVEL_TYPE_NONE.getNumber()) {
        output.writeEnum(11, levelType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, retcode_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, levelId_);
      }
      if (configId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, configId_);
      }
      if (levelType_ != emu.gingerps.net.proto.GCGLevelTypeOuterClass.GCGLevelType.GCG_LEVEL_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(11, levelType_);
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
      if (!(obj instanceof emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp other = (emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp) obj;

      if (getConfigId()
          != other.getConfigId()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (levelType_ != other.levelType_) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + CONFIG_ID_FIELD_NUMBER;
      hash = (53 * hash) + getConfigId();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + LEVEL_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + levelType_;
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp prototype) {
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
     *   CMD_ID = 7999;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GCGStartChallengeRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGStartChallengeRsp)
        emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.internal_static_GCGStartChallengeRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.internal_static_GCGStartChallengeRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp.class, emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp.newBuilder()
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
        configId_ = 0;

        levelId_ = 0;

        levelType_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.internal_static_GCGStartChallengeRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp build() {
        emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp buildPartial() {
        emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp result = new emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp(this);
        result.configId_ = configId_;
        result.levelId_ = levelId_;
        result.levelType_ = levelType_;
        result.retcode_ = retcode_;
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
        if (other instanceof emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp) {
          return mergeFrom((emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp other) {
        if (other == emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp.getDefaultInstance()) return this;
        if (other.getConfigId() != 0) {
          setConfigId(other.getConfigId());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.levelType_ != 0) {
          setLevelTypeValue(other.getLevelTypeValue());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int configId_ ;
      /**
       * <code>uint32 config_id = 8;</code>
       * @return The configId.
       */
      @java.lang.Override
      public int getConfigId() {
        return configId_;
      }
      /**
       * <code>uint32 config_id = 8;</code>
       * @param value The configId to set.
       * @return This builder for chaining.
       */
      public Builder setConfigId(int value) {
        
        configId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 config_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearConfigId() {
        
        configId_ = 0;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 5;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 5;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int levelType_ = 0;
      /**
       * <code>.GCGLevelType level_type = 11;</code>
       * @return The enum numeric value on the wire for levelType.
       */
      @java.lang.Override public int getLevelTypeValue() {
        return levelType_;
      }
      /**
       * <code>.GCGLevelType level_type = 11;</code>
       * @param value The enum numeric value on the wire for levelType to set.
       * @return This builder for chaining.
       */
      public Builder setLevelTypeValue(int value) {
        
        levelType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GCGLevelType level_type = 11;</code>
       * @return The levelType.
       */
      @java.lang.Override
      public emu.gingerps.net.proto.GCGLevelTypeOuterClass.GCGLevelType getLevelType() {
        @SuppressWarnings("deprecation")
        emu.gingerps.net.proto.GCGLevelTypeOuterClass.GCGLevelType result = emu.gingerps.net.proto.GCGLevelTypeOuterClass.GCGLevelType.valueOf(levelType_);
        return result == null ? emu.gingerps.net.proto.GCGLevelTypeOuterClass.GCGLevelType.UNRECOGNIZED : result;
      }
      /**
       * <code>.GCGLevelType level_type = 11;</code>
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
       * <code>.GCGLevelType level_type = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelType() {
        
        levelType_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 1;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGStartChallengeRsp)
    }

    // @@protoc_insertion_point(class_scope:GCGStartChallengeRsp)
    private static final emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp();
    }

    public static emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGStartChallengeRsp>
        PARSER = new com.google.protobuf.AbstractParser<GCGStartChallengeRsp>() {
      @java.lang.Override
      public GCGStartChallengeRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGStartChallengeRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGStartChallengeRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGStartChallengeRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.GCGStartChallengeRspOuterClass.GCGStartChallengeRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGStartChallengeRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGStartChallengeRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032GCGStartChallengeRsp.proto\032\022GCGLevelTy" +
      "pe.proto\"o\n\024GCGStartChallengeRsp\022\021\n\tconf" +
      "ig_id\030\010 \001(\r\022\020\n\010level_id\030\005 \001(\r\022!\n\nlevel_t" +
      "ype\030\013 \001(\0162\r.GCGLevelType\022\017\n\007retcode\030\001 \001(" +
      "\005B\033\n\031emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.GCGLevelTypeOuterClass.getDescriptor(),
        });
    internal_static_GCGStartChallengeRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGStartChallengeRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGStartChallengeRsp_descriptor,
        new java.lang.String[] { "ConfigId", "LevelId", "LevelType", "Retcode", });
    emu.gingerps.net.proto.GCGLevelTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}