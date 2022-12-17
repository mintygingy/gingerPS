// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RestartCoinCollectPlaySingleModeReq.proto

package emu.gingerps.net.proto;

public final class RestartCoinCollectPlaySingleModeReqOuterClass {
  private RestartCoinCollectPlaySingleModeReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RestartCoinCollectPlaySingleModeReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RestartCoinCollectPlaySingleModeReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level_id = 2;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 multistage_play_index = 3;</code>
     * @return The multistagePlayIndex.
     */
    int getMultistagePlayIndex();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 21382;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code RestartCoinCollectPlaySingleModeReq}
   */
  public static final class RestartCoinCollectPlaySingleModeReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RestartCoinCollectPlaySingleModeReq)
      RestartCoinCollectPlaySingleModeReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RestartCoinCollectPlaySingleModeReq.newBuilder() to construct.
    private RestartCoinCollectPlaySingleModeReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RestartCoinCollectPlaySingleModeReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RestartCoinCollectPlaySingleModeReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.internal_static_RestartCoinCollectPlaySingleModeReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.internal_static_RestartCoinCollectPlaySingleModeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq.class, emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq.Builder.class);
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 2;
    private int levelId_ = 0;
    /**
     * <code>uint32 level_id = 2;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int MULTISTAGE_PLAY_INDEX_FIELD_NUMBER = 3;
    private int multistagePlayIndex_ = 0;
    /**
     * <code>uint32 multistage_play_index = 3;</code>
     * @return The multistagePlayIndex.
     */
    @java.lang.Override
    public int getMultistagePlayIndex() {
      return multistagePlayIndex_;
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
      if (multistagePlayIndex_ != 0) {
        output.writeUInt32(3, multistagePlayIndex_);
      }
      getUnknownFields().writeTo(output);
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
      if (multistagePlayIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, multistagePlayIndex_);
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
      if (!(obj instanceof emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq other = (emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq) obj;

      if (getLevelId()
          != other.getLevelId()) return false;
      if (getMultistagePlayIndex()
          != other.getMultistagePlayIndex()) return false;
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
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + MULTISTAGE_PLAY_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getMultistagePlayIndex();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq prototype) {
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
     *   CMD_ID = 21382;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code RestartCoinCollectPlaySingleModeReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RestartCoinCollectPlaySingleModeReq)
        emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.internal_static_RestartCoinCollectPlaySingleModeReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.internal_static_RestartCoinCollectPlaySingleModeReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq.class, emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq.newBuilder()
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
        levelId_ = 0;
        multistagePlayIndex_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.internal_static_RestartCoinCollectPlaySingleModeReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq build() {
        emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq buildPartial() {
        emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq result = new emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.levelId_ = levelId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.multistagePlayIndex_ = multistagePlayIndex_;
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
        if (other instanceof emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq) {
          return mergeFrom((emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq other) {
        if (other == emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq.getDefaultInstance()) return this;
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getMultistagePlayIndex() != 0) {
          setMultistagePlayIndex(other.getMultistagePlayIndex());
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
              case 16: {
                levelId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 16
              case 24: {
                multistagePlayIndex_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 24
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
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int multistagePlayIndex_ ;
      /**
       * <code>uint32 multistage_play_index = 3;</code>
       * @return The multistagePlayIndex.
       */
      @java.lang.Override
      public int getMultistagePlayIndex() {
        return multistagePlayIndex_;
      }
      /**
       * <code>uint32 multistage_play_index = 3;</code>
       * @param value The multistagePlayIndex to set.
       * @return This builder for chaining.
       */
      public Builder setMultistagePlayIndex(int value) {
        
        multistagePlayIndex_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 multistage_play_index = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMultistagePlayIndex() {
        bitField0_ = (bitField0_ & ~0x00000002);
        multistagePlayIndex_ = 0;
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


      // @@protoc_insertion_point(builder_scope:RestartCoinCollectPlaySingleModeReq)
    }

    // @@protoc_insertion_point(class_scope:RestartCoinCollectPlaySingleModeReq)
    private static final emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq();
    }

    public static emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RestartCoinCollectPlaySingleModeReq>
        PARSER = new com.google.protobuf.AbstractParser<RestartCoinCollectPlaySingleModeReq>() {
      @java.lang.Override
      public RestartCoinCollectPlaySingleModeReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<RestartCoinCollectPlaySingleModeReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RestartCoinCollectPlaySingleModeReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.RestartCoinCollectPlaySingleModeReqOuterClass.RestartCoinCollectPlaySingleModeReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RestartCoinCollectPlaySingleModeReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RestartCoinCollectPlaySingleModeReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)RestartCoinCollectPlaySingleModeReq.pr" +
      "oto\"V\n#RestartCoinCollectPlaySingleModeR" +
      "eq\022\020\n\010level_id\030\002 \001(\r\022\035\n\025multistage_play_" +
      "index\030\003 \001(\rB\030\n\026emu.gingerps.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RestartCoinCollectPlaySingleModeReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RestartCoinCollectPlaySingleModeReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RestartCoinCollectPlaySingleModeReq_descriptor,
        new java.lang.String[] { "LevelId", "MultistagePlayIndex", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
