// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IrodoriChessEquipCardRsp.proto

package emu.gingerps.net.proto;

public final class IrodoriChessEquipCardRspOuterClass {
  private IrodoriChessEquipCardRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IrodoriChessEquipCardRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IrodoriChessEquipCardRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 card_id = 9;</code>
     * @return The cardId.
     */
    int getCardId();

    /**
     * <code>uint32 level_id = 2;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>bool is_hard_map = 8;</code>
     * @return The isHardMap.
     */
    boolean getIsHardMap();

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
   *   CMD_ID = 8884;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code IrodoriChessEquipCardRsp}
   */
  public static final class IrodoriChessEquipCardRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IrodoriChessEquipCardRsp)
      IrodoriChessEquipCardRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IrodoriChessEquipCardRsp.newBuilder() to construct.
    private IrodoriChessEquipCardRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IrodoriChessEquipCardRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IrodoriChessEquipCardRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private IrodoriChessEquipCardRsp(
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
            case 16: {

              levelId_ = input.readUInt32();
              break;
            }
            case 64: {

              isHardMap_ = input.readBool();
              break;
            }
            case 72: {

              cardId_ = input.readUInt32();
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
      return emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.internal_static_IrodoriChessEquipCardRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.internal_static_IrodoriChessEquipCardRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp.class, emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp.Builder.class);
    }

    public static final int CARD_ID_FIELD_NUMBER = 9;
    private int cardId_;
    /**
     * <code>uint32 card_id = 9;</code>
     * @return The cardId.
     */
    @java.lang.Override
    public int getCardId() {
      return cardId_;
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

    public static final int IS_HARD_MAP_FIELD_NUMBER = 8;
    private boolean isHardMap_;
    /**
     * <code>bool is_hard_map = 8;</code>
     * @return The isHardMap.
     */
    @java.lang.Override
    public boolean getIsHardMap() {
      return isHardMap_;
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
        output.writeUInt32(2, levelId_);
      }
      if (isHardMap_ != false) {
        output.writeBool(8, isHardMap_);
      }
      if (cardId_ != 0) {
        output.writeUInt32(9, cardId_);
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
          .computeUInt32Size(2, levelId_);
      }
      if (isHardMap_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, isHardMap_);
      }
      if (cardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, cardId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp other = (emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp) obj;

      if (getCardId()
          != other.getCardId()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getIsHardMap()
          != other.getIsHardMap()) return false;
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
      hash = (37 * hash) + CARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCardId();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + IS_HARD_MAP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsHardMap());
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp prototype) {
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
     *   CMD_ID = 8884;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code IrodoriChessEquipCardRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IrodoriChessEquipCardRsp)
        emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.internal_static_IrodoriChessEquipCardRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.internal_static_IrodoriChessEquipCardRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp.class, emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp.newBuilder()
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
        cardId_ = 0;

        levelId_ = 0;

        isHardMap_ = false;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.internal_static_IrodoriChessEquipCardRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp build() {
        emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp buildPartial() {
        emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp result = new emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp(this);
        result.cardId_ = cardId_;
        result.levelId_ = levelId_;
        result.isHardMap_ = isHardMap_;
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
        if (other instanceof emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp) {
          return mergeFrom((emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp other) {
        if (other == emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp.getDefaultInstance()) return this;
        if (other.getCardId() != 0) {
          setCardId(other.getCardId());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getIsHardMap() != false) {
          setIsHardMap(other.getIsHardMap());
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
        emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int cardId_ ;
      /**
       * <code>uint32 card_id = 9;</code>
       * @return The cardId.
       */
      @java.lang.Override
      public int getCardId() {
        return cardId_;
      }
      /**
       * <code>uint32 card_id = 9;</code>
       * @param value The cardId to set.
       * @return This builder for chaining.
       */
      public Builder setCardId(int value) {
        
        cardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardId() {
        
        cardId_ = 0;
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

      private boolean isHardMap_ ;
      /**
       * <code>bool is_hard_map = 8;</code>
       * @return The isHardMap.
       */
      @java.lang.Override
      public boolean getIsHardMap() {
        return isHardMap_;
      }
      /**
       * <code>bool is_hard_map = 8;</code>
       * @param value The isHardMap to set.
       * @return This builder for chaining.
       */
      public Builder setIsHardMap(boolean value) {
        
        isHardMap_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_hard_map = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsHardMap() {
        
        isHardMap_ = false;
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


      // @@protoc_insertion_point(builder_scope:IrodoriChessEquipCardRsp)
    }

    // @@protoc_insertion_point(class_scope:IrodoriChessEquipCardRsp)
    private static final emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp();
    }

    public static emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IrodoriChessEquipCardRsp>
        PARSER = new com.google.protobuf.AbstractParser<IrodoriChessEquipCardRsp>() {
      @java.lang.Override
      public IrodoriChessEquipCardRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new IrodoriChessEquipCardRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<IrodoriChessEquipCardRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IrodoriChessEquipCardRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.IrodoriChessEquipCardRspOuterClass.IrodoriChessEquipCardRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IrodoriChessEquipCardRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IrodoriChessEquipCardRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036IrodoriChessEquipCardRsp.proto\"c\n\030Irod" +
      "oriChessEquipCardRsp\022\017\n\007card_id\030\t \001(\r\022\020\n" +
      "\010level_id\030\002 \001(\r\022\023\n\013is_hard_map\030\010 \001(\010\022\017\n\007" +
      "retcode\030\001 \001(\005B\033\n\031emu.gingerps.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_IrodoriChessEquipCardRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IrodoriChessEquipCardRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IrodoriChessEquipCardRsp_descriptor,
        new java.lang.String[] { "CardId", "LevelId", "IsHardMap", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
