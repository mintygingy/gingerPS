// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGDSTakeCardProficiencyRewardReq.proto

package emu.gingerps.net.proto;

public final class GCGDSTakeCardProficiencyRewardReqOuterClass {
  private GCGDSTakeCardProficiencyRewardReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGDSTakeCardProficiencyRewardReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGDSTakeCardProficiencyRewardReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 reward_index = 15;</code>
     * @return The rewardIndex.
     */
    int getRewardIndex();

    /**
     * <code>uint32 card_id = 3;</code>
     * @return The cardId.
     */
    int getCardId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 7001;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GCGDSTakeCardProficiencyRewardReq}
   */
  public static final class GCGDSTakeCardProficiencyRewardReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGDSTakeCardProficiencyRewardReq)
      GCGDSTakeCardProficiencyRewardReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGDSTakeCardProficiencyRewardReq.newBuilder() to construct.
    private GCGDSTakeCardProficiencyRewardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGDSTakeCardProficiencyRewardReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGDSTakeCardProficiencyRewardReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGDSTakeCardProficiencyRewardReq(
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
            case 120: {

              rewardIndex_ = input.readUInt32();
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
      return emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.internal_static_GCGDSTakeCardProficiencyRewardReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.internal_static_GCGDSTakeCardProficiencyRewardReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq.class, emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq.Builder.class);
    }

    public static final int REWARD_INDEX_FIELD_NUMBER = 15;
    private int rewardIndex_;
    /**
     * <code>uint32 reward_index = 15;</code>
     * @return The rewardIndex.
     */
    @java.lang.Override
    public int getRewardIndex() {
      return rewardIndex_;
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
      if (rewardIndex_ != 0) {
        output.writeUInt32(15, rewardIndex_);
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
      if (rewardIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, rewardIndex_);
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
      if (!(obj instanceof emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq other = (emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq) obj;

      if (getRewardIndex()
          != other.getRewardIndex()) return false;
      if (getCardId()
          != other.getCardId()) return false;
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
      hash = (37 * hash) + REWARD_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getRewardIndex();
      hash = (37 * hash) + CARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCardId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq prototype) {
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
     *   CMD_ID = 7001;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GCGDSTakeCardProficiencyRewardReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGDSTakeCardProficiencyRewardReq)
        emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.internal_static_GCGDSTakeCardProficiencyRewardReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.internal_static_GCGDSTakeCardProficiencyRewardReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq.class, emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq.newBuilder()
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
        rewardIndex_ = 0;

        cardId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.internal_static_GCGDSTakeCardProficiencyRewardReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq build() {
        emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq buildPartial() {
        emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq result = new emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq(this);
        result.rewardIndex_ = rewardIndex_;
        result.cardId_ = cardId_;
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
        if (other instanceof emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq) {
          return mergeFrom((emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq other) {
        if (other == emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq.getDefaultInstance()) return this;
        if (other.getRewardIndex() != 0) {
          setRewardIndex(other.getRewardIndex());
        }
        if (other.getCardId() != 0) {
          setCardId(other.getCardId());
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
        emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int rewardIndex_ ;
      /**
       * <code>uint32 reward_index = 15;</code>
       * @return The rewardIndex.
       */
      @java.lang.Override
      public int getRewardIndex() {
        return rewardIndex_;
      }
      /**
       * <code>uint32 reward_index = 15;</code>
       * @param value The rewardIndex to set.
       * @return This builder for chaining.
       */
      public Builder setRewardIndex(int value) {
        
        rewardIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 reward_index = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearRewardIndex() {
        
        rewardIndex_ = 0;
        onChanged();
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


      // @@protoc_insertion_point(builder_scope:GCGDSTakeCardProficiencyRewardReq)
    }

    // @@protoc_insertion_point(class_scope:GCGDSTakeCardProficiencyRewardReq)
    private static final emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq();
    }

    public static emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGDSTakeCardProficiencyRewardReq>
        PARSER = new com.google.protobuf.AbstractParser<GCGDSTakeCardProficiencyRewardReq>() {
      @java.lang.Override
      public GCGDSTakeCardProficiencyRewardReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGDSTakeCardProficiencyRewardReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGDSTakeCardProficiencyRewardReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGDSTakeCardProficiencyRewardReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGDSTakeCardProficiencyRewardReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGDSTakeCardProficiencyRewardReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'GCGDSTakeCardProficiencyRewardReq.prot" +
      "o\"J\n!GCGDSTakeCardProficiencyRewardReq\022\024" +
      "\n\014reward_index\030\017 \001(\r\022\017\n\007card_id\030\003 \001(\rB\030\n" +
      "\026emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGDSTakeCardProficiencyRewardReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGDSTakeCardProficiencyRewardReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGDSTakeCardProficiencyRewardReq_descriptor,
        new java.lang.String[] { "RewardIndex", "CardId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
