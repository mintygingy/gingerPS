// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InBattleMechanicusConfirmCardReq.proto

package emu.gingerps.net.proto;

public final class InBattleMechanicusConfirmCardReqOuterClass {
  private InBattleMechanicusConfirmCardReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InBattleMechanicusConfirmCardReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InBattleMechanicusConfirmCardReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 card_id = 3;</code>
     * @return The cardId.
     */
    int getCardId();

    /**
     * <code>uint32 play_index = 8;</code>
     * @return The playIndex.
     */
    int getPlayIndex();

    /**
     * <code>uint32 group_id = 5;</code>
     * @return The groupId.
     */
    int getGroupId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 5327;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code InBattleMechanicusConfirmCardReq}
   */
  public static final class InBattleMechanicusConfirmCardReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InBattleMechanicusConfirmCardReq)
      InBattleMechanicusConfirmCardReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InBattleMechanicusConfirmCardReq.newBuilder() to construct.
    private InBattleMechanicusConfirmCardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InBattleMechanicusConfirmCardReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InBattleMechanicusConfirmCardReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private InBattleMechanicusConfirmCardReq(
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
            case 24: {

              cardId_ = input.readUInt32();
              break;
            }
            case 40: {

              groupId_ = input.readUInt32();
              break;
            }
            case 64: {

              playIndex_ = input.readUInt32();
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
      return emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.internal_static_InBattleMechanicusConfirmCardReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.internal_static_InBattleMechanicusConfirmCardReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq.class, emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq.Builder.class);
    }

    public static final int CARD_ID_FIELD_NUMBER = 3;
    private int cardId_;
    /**
     * <code>uint32 card_id = 3;</code>
     * @return The cardId.
     */
    @java.lang.Override
    public int getCardId() {
      return cardId_;
    }

    public static final int PLAY_INDEX_FIELD_NUMBER = 8;
    private int playIndex_;
    /**
     * <code>uint32 play_index = 8;</code>
     * @return The playIndex.
     */
    @java.lang.Override
    public int getPlayIndex() {
      return playIndex_;
    }

    public static final int GROUP_ID_FIELD_NUMBER = 5;
    private int groupId_;
    /**
     * <code>uint32 group_id = 5;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
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
      if (cardId_ != 0) {
        output.writeUInt32(3, cardId_);
      }
      if (groupId_ != 0) {
        output.writeUInt32(5, groupId_);
      }
      if (playIndex_ != 0) {
        output.writeUInt32(8, playIndex_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, cardId_);
      }
      if (groupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, groupId_);
      }
      if (playIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, playIndex_);
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
      if (!(obj instanceof emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq other = (emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq) obj;

      if (getCardId()
          != other.getCardId()) return false;
      if (getPlayIndex()
          != other.getPlayIndex()) return false;
      if (getGroupId()
          != other.getGroupId()) return false;
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
      hash = (37 * hash) + PLAY_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getPlayIndex();
      hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq prototype) {
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
     *   CMD_ID = 5327;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code InBattleMechanicusConfirmCardReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InBattleMechanicusConfirmCardReq)
        emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.internal_static_InBattleMechanicusConfirmCardReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.internal_static_InBattleMechanicusConfirmCardReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq.class, emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq.newBuilder()
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

        playIndex_ = 0;

        groupId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.internal_static_InBattleMechanicusConfirmCardReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq build() {
        emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq buildPartial() {
        emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq result = new emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq(this);
        result.cardId_ = cardId_;
        result.playIndex_ = playIndex_;
        result.groupId_ = groupId_;
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
        if (other instanceof emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq) {
          return mergeFrom((emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq other) {
        if (other == emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq.getDefaultInstance()) return this;
        if (other.getCardId() != 0) {
          setCardId(other.getCardId());
        }
        if (other.getPlayIndex() != 0) {
          setPlayIndex(other.getPlayIndex());
        }
        if (other.getGroupId() != 0) {
          setGroupId(other.getGroupId());
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
        emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq) e.getUnfinishedMessage();
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
       * <code>uint32 card_id = 3;</code>
       * @return The cardId.
       */
      @java.lang.Override
      public int getCardId() {
        return cardId_;
      }
      /**
       * <code>uint32 card_id = 3;</code>
       * @param value The cardId to set.
       * @return This builder for chaining.
       */
      public Builder setCardId(int value) {
        
        cardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardId() {
        
        cardId_ = 0;
        onChanged();
        return this;
      }

      private int playIndex_ ;
      /**
       * <code>uint32 play_index = 8;</code>
       * @return The playIndex.
       */
      @java.lang.Override
      public int getPlayIndex() {
        return playIndex_;
      }
      /**
       * <code>uint32 play_index = 8;</code>
       * @param value The playIndex to set.
       * @return This builder for chaining.
       */
      public Builder setPlayIndex(int value) {
        
        playIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 play_index = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayIndex() {
        
        playIndex_ = 0;
        onChanged();
        return this;
      }

      private int groupId_ ;
      /**
       * <code>uint32 group_id = 5;</code>
       * @return The groupId.
       */
      @java.lang.Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 group_id = 5;</code>
       * @param value The groupId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {
        
        groupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 group_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupId() {
        
        groupId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:InBattleMechanicusConfirmCardReq)
    }

    // @@protoc_insertion_point(class_scope:InBattleMechanicusConfirmCardReq)
    private static final emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq();
    }

    public static emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InBattleMechanicusConfirmCardReq>
        PARSER = new com.google.protobuf.AbstractParser<InBattleMechanicusConfirmCardReq>() {
      @java.lang.Override
      public InBattleMechanicusConfirmCardReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new InBattleMechanicusConfirmCardReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<InBattleMechanicusConfirmCardReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InBattleMechanicusConfirmCardReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.InBattleMechanicusConfirmCardReqOuterClass.InBattleMechanicusConfirmCardReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InBattleMechanicusConfirmCardReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InBattleMechanicusConfirmCardReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&InBattleMechanicusConfirmCardReq.proto" +
      "\"Y\n InBattleMechanicusConfirmCardReq\022\017\n\007" +
      "card_id\030\003 \001(\r\022\022\n\nplay_index\030\010 \001(\r\022\020\n\010gro" +
      "up_id\030\005 \001(\rB\033\n\031emu.gingerps.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_InBattleMechanicusConfirmCardReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InBattleMechanicusConfirmCardReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InBattleMechanicusConfirmCardReq_descriptor,
        new java.lang.String[] { "CardId", "PlayIndex", "GroupId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
