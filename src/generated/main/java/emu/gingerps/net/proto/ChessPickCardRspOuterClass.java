// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChessPickCardRsp.proto

package emu.gingerps.net.proto;

public final class ChessPickCardRspOuterClass {
  private ChessPickCardRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChessPickCardRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChessPickCardRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 card_index = 4;</code>
     * @return The cardIndex.
     */
    int getCardIndex();

    /**
     * <code>uint32 card_id = 13;</code>
     * @return The cardId.
     */
    int getCardId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 5352;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ChessPickCardRsp}
   */
  public static final class ChessPickCardRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChessPickCardRsp)
      ChessPickCardRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChessPickCardRsp.newBuilder() to construct.
    private ChessPickCardRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChessPickCardRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChessPickCardRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.ChessPickCardRspOuterClass.internal_static_ChessPickCardRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.ChessPickCardRspOuterClass.internal_static_ChessPickCardRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp.class, emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 11;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int CARD_INDEX_FIELD_NUMBER = 4;
    private int cardIndex_ = 0;
    /**
     * <code>uint32 card_index = 4;</code>
     * @return The cardIndex.
     */
    @java.lang.Override
    public int getCardIndex() {
      return cardIndex_;
    }

    public static final int CARD_ID_FIELD_NUMBER = 13;
    private int cardId_ = 0;
    /**
     * <code>uint32 card_id = 13;</code>
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
      if (cardIndex_ != 0) {
        output.writeUInt32(4, cardIndex_);
      }
      if (retcode_ != 0) {
        output.writeInt32(11, retcode_);
      }
      if (cardId_ != 0) {
        output.writeUInt32(13, cardId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cardIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, cardIndex_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, retcode_);
      }
      if (cardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, cardId_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp other = (emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getCardIndex()
          != other.getCardIndex()) return false;
      if (getCardId()
          != other.getCardId()) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + CARD_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getCardIndex();
      hash = (37 * hash) + CARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCardId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp prototype) {
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
     *   CMD_ID = 5352;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ChessPickCardRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChessPickCardRsp)
        emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.ChessPickCardRspOuterClass.internal_static_ChessPickCardRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.ChessPickCardRspOuterClass.internal_static_ChessPickCardRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp.class, emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        retcode_ = 0;
        cardIndex_ = 0;
        cardId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.ChessPickCardRspOuterClass.internal_static_ChessPickCardRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp build() {
        emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp buildPartial() {
        emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp result = new emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.cardIndex_ = cardIndex_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.cardId_ = cardId_;
        }
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
        if (other instanceof emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp) {
          return mergeFrom((emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp other) {
        if (other == emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getCardIndex() != 0) {
          setCardIndex(other.getCardIndex());
        }
        if (other.getCardId() != 0) {
          setCardId(other.getCardId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 32: {
                cardIndex_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 32
              case 88: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 88
              case 104: {
                cardId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 104
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int retcode_ ;
      /**
       * <code>int32 retcode = 11;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int cardIndex_ ;
      /**
       * <code>uint32 card_index = 4;</code>
       * @return The cardIndex.
       */
      @java.lang.Override
      public int getCardIndex() {
        return cardIndex_;
      }
      /**
       * <code>uint32 card_index = 4;</code>
       * @param value The cardIndex to set.
       * @return This builder for chaining.
       */
      public Builder setCardIndex(int value) {
        
        cardIndex_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_index = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardIndex() {
        bitField0_ = (bitField0_ & ~0x00000002);
        cardIndex_ = 0;
        onChanged();
        return this;
      }

      private int cardId_ ;
      /**
       * <code>uint32 card_id = 13;</code>
       * @return The cardId.
       */
      @java.lang.Override
      public int getCardId() {
        return cardId_;
      }
      /**
       * <code>uint32 card_id = 13;</code>
       * @param value The cardId to set.
       * @return This builder for chaining.
       */
      public Builder setCardId(int value) {
        
        cardId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardId() {
        bitField0_ = (bitField0_ & ~0x00000004);
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


      // @@protoc_insertion_point(builder_scope:ChessPickCardRsp)
    }

    // @@protoc_insertion_point(class_scope:ChessPickCardRsp)
    private static final emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp();
    }

    public static emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChessPickCardRsp>
        PARSER = new com.google.protobuf.AbstractParser<ChessPickCardRsp>() {
      @java.lang.Override
      public ChessPickCardRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<ChessPickCardRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChessPickCardRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.ChessPickCardRspOuterClass.ChessPickCardRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChessPickCardRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChessPickCardRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026ChessPickCardRsp.proto\"H\n\020ChessPickCar" +
      "dRsp\022\017\n\007retcode\030\013 \001(\005\022\022\n\ncard_index\030\004 \001(" +
      "\r\022\017\n\007card_id\030\r \001(\rB\030\n\026emu.gingerps.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChessPickCardRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChessPickCardRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChessPickCardRsp_descriptor,
        new java.lang.String[] { "Retcode", "CardIndex", "CardId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
