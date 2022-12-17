// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TriggerRoguelikeRuneRsp.proto

package emu.gingerps.net.proto;

public final class TriggerRoguelikeRuneRspOuterClass {
  private TriggerRoguelikeRuneRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TriggerRoguelikeRuneRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TriggerRoguelikeRuneRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 available_count = 15;</code>
     * @return The availableCount.
     */
    int getAvailableCount();

    /**
     * <code>uint32 rune_id = 10;</code>
     * @return The runeId.
     */
    int getRuneId();

    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8133;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code TriggerRoguelikeRuneRsp}
   */
  public static final class TriggerRoguelikeRuneRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TriggerRoguelikeRuneRsp)
      TriggerRoguelikeRuneRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TriggerRoguelikeRuneRsp.newBuilder() to construct.
    private TriggerRoguelikeRuneRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TriggerRoguelikeRuneRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TriggerRoguelikeRuneRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TriggerRoguelikeRuneRsp(
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

              retcode_ = input.readInt32();
              break;
            }
            case 80: {

              runeId_ = input.readUInt32();
              break;
            }
            case 120: {

              availableCount_ = input.readUInt32();
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
      return emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.internal_static_TriggerRoguelikeRuneRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.internal_static_TriggerRoguelikeRuneRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp.class, emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp.Builder.class);
    }

    public static final int AVAILABLE_COUNT_FIELD_NUMBER = 15;
    private int availableCount_;
    /**
     * <code>uint32 available_count = 15;</code>
     * @return The availableCount.
     */
    @java.lang.Override
    public int getAvailableCount() {
      return availableCount_;
    }

    public static final int RUNE_ID_FIELD_NUMBER = 10;
    private int runeId_;
    /**
     * <code>uint32 rune_id = 10;</code>
     * @return The runeId.
     */
    @java.lang.Override
    public int getRuneId() {
      return runeId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 4;
    private int retcode_;
    /**
     * <code>int32 retcode = 4;</code>
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
        output.writeInt32(4, retcode_);
      }
      if (runeId_ != 0) {
        output.writeUInt32(10, runeId_);
      }
      if (availableCount_ != 0) {
        output.writeUInt32(15, availableCount_);
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
          .computeInt32Size(4, retcode_);
      }
      if (runeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, runeId_);
      }
      if (availableCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, availableCount_);
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
      if (!(obj instanceof emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp other = (emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp) obj;

      if (getAvailableCount()
          != other.getAvailableCount()) return false;
      if (getRuneId()
          != other.getRuneId()) return false;
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
      hash = (37 * hash) + AVAILABLE_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getAvailableCount();
      hash = (37 * hash) + RUNE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRuneId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp prototype) {
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
     *   CMD_ID = 8133;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code TriggerRoguelikeRuneRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TriggerRoguelikeRuneRsp)
        emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.internal_static_TriggerRoguelikeRuneRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.internal_static_TriggerRoguelikeRuneRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp.class, emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp.newBuilder()
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
        availableCount_ = 0;

        runeId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.internal_static_TriggerRoguelikeRuneRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp build() {
        emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp buildPartial() {
        emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp result = new emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp(this);
        result.availableCount_ = availableCount_;
        result.runeId_ = runeId_;
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
        if (other instanceof emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp) {
          return mergeFrom((emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp other) {
        if (other == emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp.getDefaultInstance()) return this;
        if (other.getAvailableCount() != 0) {
          setAvailableCount(other.getAvailableCount());
        }
        if (other.getRuneId() != 0) {
          setRuneId(other.getRuneId());
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
        emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int availableCount_ ;
      /**
       * <code>uint32 available_count = 15;</code>
       * @return The availableCount.
       */
      @java.lang.Override
      public int getAvailableCount() {
        return availableCount_;
      }
      /**
       * <code>uint32 available_count = 15;</code>
       * @param value The availableCount to set.
       * @return This builder for chaining.
       */
      public Builder setAvailableCount(int value) {
        
        availableCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 available_count = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvailableCount() {
        
        availableCount_ = 0;
        onChanged();
        return this;
      }

      private int runeId_ ;
      /**
       * <code>uint32 rune_id = 10;</code>
       * @return The runeId.
       */
      @java.lang.Override
      public int getRuneId() {
        return runeId_;
      }
      /**
       * <code>uint32 rune_id = 10;</code>
       * @param value The runeId to set.
       * @return This builder for chaining.
       */
      public Builder setRuneId(int value) {
        
        runeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 rune_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearRuneId() {
        
        runeId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 4;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 4;</code>
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


      // @@protoc_insertion_point(builder_scope:TriggerRoguelikeRuneRsp)
    }

    // @@protoc_insertion_point(class_scope:TriggerRoguelikeRuneRsp)
    private static final emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp();
    }

    public static emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TriggerRoguelikeRuneRsp>
        PARSER = new com.google.protobuf.AbstractParser<TriggerRoguelikeRuneRsp>() {
      @java.lang.Override
      public TriggerRoguelikeRuneRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TriggerRoguelikeRuneRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TriggerRoguelikeRuneRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TriggerRoguelikeRuneRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.TriggerRoguelikeRuneRspOuterClass.TriggerRoguelikeRuneRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TriggerRoguelikeRuneRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TriggerRoguelikeRuneRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035TriggerRoguelikeRuneRsp.proto\"T\n\027Trigg" +
      "erRoguelikeRuneRsp\022\027\n\017available_count\030\017 " +
      "\001(\r\022\017\n\007rune_id\030\n \001(\r\022\017\n\007retcode\030\004 \001(\005B\030\n" +
      "\026emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TriggerRoguelikeRuneRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TriggerRoguelikeRuneRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TriggerRoguelikeRuneRsp_descriptor,
        new java.lang.String[] { "AvailableCount", "RuneId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
