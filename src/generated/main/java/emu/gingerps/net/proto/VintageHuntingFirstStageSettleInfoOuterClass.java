// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VintageHuntingFirstStageSettleInfo.proto

package emu.gingerps.net.proto;

public final class VintageHuntingFirstStageSettleInfoOuterClass {
  private VintageHuntingFirstStageSettleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VintageHuntingFirstStageSettleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VintageHuntingFirstStageSettleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3300_HIKADHBLPEB = 2;</code>
     * @return The unk3300HIKADHBLPEB.
     */
    int getUnk3300HIKADHBLPEB();

    /**
     * <code>uint32 score = 1;</code>
     * @return The score.
     */
    int getScore();

    /**
     * <code>uint32 Unk3300_NILGNHOPGLD = 3;</code>
     * @return The unk3300NILGNHOPGLD.
     */
    int getUnk3300NILGNHOPGLD();

    /**
     * <code>uint32 Unk3300_IPAJLKOBDKC = 11;</code>
     * @return The unk3300IPAJLKOBDKC.
     */
    int getUnk3300IPAJLKOBDKC();
  }
  /**
   * Protobuf type {@code VintageHuntingFirstStageSettleInfo}
   */
  public static final class VintageHuntingFirstStageSettleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:VintageHuntingFirstStageSettleInfo)
      VintageHuntingFirstStageSettleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VintageHuntingFirstStageSettleInfo.newBuilder() to construct.
    private VintageHuntingFirstStageSettleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VintageHuntingFirstStageSettleInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new VintageHuntingFirstStageSettleInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private VintageHuntingFirstStageSettleInfo(
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

              score_ = input.readUInt32();
              break;
            }
            case 16: {

              unk3300HIKADHBLPEB_ = input.readUInt32();
              break;
            }
            case 24: {

              unk3300NILGNHOPGLD_ = input.readUInt32();
              break;
            }
            case 88: {

              unk3300IPAJLKOBDKC_ = input.readUInt32();
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
      return emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.internal_static_VintageHuntingFirstStageSettleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.internal_static_VintageHuntingFirstStageSettleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo.class, emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo.Builder.class);
    }

    public static final int UNK3300_HIKADHBLPEB_FIELD_NUMBER = 2;
    private int unk3300HIKADHBLPEB_;
    /**
     * <code>uint32 Unk3300_HIKADHBLPEB = 2;</code>
     * @return The unk3300HIKADHBLPEB.
     */
    @java.lang.Override
    public int getUnk3300HIKADHBLPEB() {
      return unk3300HIKADHBLPEB_;
    }

    public static final int SCORE_FIELD_NUMBER = 1;
    private int score_;
    /**
     * <code>uint32 score = 1;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
    }

    public static final int UNK3300_NILGNHOPGLD_FIELD_NUMBER = 3;
    private int unk3300NILGNHOPGLD_;
    /**
     * <code>uint32 Unk3300_NILGNHOPGLD = 3;</code>
     * @return The unk3300NILGNHOPGLD.
     */
    @java.lang.Override
    public int getUnk3300NILGNHOPGLD() {
      return unk3300NILGNHOPGLD_;
    }

    public static final int UNK3300_IPAJLKOBDKC_FIELD_NUMBER = 11;
    private int unk3300IPAJLKOBDKC_;
    /**
     * <code>uint32 Unk3300_IPAJLKOBDKC = 11;</code>
     * @return The unk3300IPAJLKOBDKC.
     */
    @java.lang.Override
    public int getUnk3300IPAJLKOBDKC() {
      return unk3300IPAJLKOBDKC_;
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
      if (score_ != 0) {
        output.writeUInt32(1, score_);
      }
      if (unk3300HIKADHBLPEB_ != 0) {
        output.writeUInt32(2, unk3300HIKADHBLPEB_);
      }
      if (unk3300NILGNHOPGLD_ != 0) {
        output.writeUInt32(3, unk3300NILGNHOPGLD_);
      }
      if (unk3300IPAJLKOBDKC_ != 0) {
        output.writeUInt32(11, unk3300IPAJLKOBDKC_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, score_);
      }
      if (unk3300HIKADHBLPEB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, unk3300HIKADHBLPEB_);
      }
      if (unk3300NILGNHOPGLD_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, unk3300NILGNHOPGLD_);
      }
      if (unk3300IPAJLKOBDKC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, unk3300IPAJLKOBDKC_);
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
      if (!(obj instanceof emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo other = (emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo) obj;

      if (getUnk3300HIKADHBLPEB()
          != other.getUnk3300HIKADHBLPEB()) return false;
      if (getScore()
          != other.getScore()) return false;
      if (getUnk3300NILGNHOPGLD()
          != other.getUnk3300NILGNHOPGLD()) return false;
      if (getUnk3300IPAJLKOBDKC()
          != other.getUnk3300IPAJLKOBDKC()) return false;
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
      hash = (37 * hash) + UNK3300_HIKADHBLPEB_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300HIKADHBLPEB();
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      hash = (37 * hash) + UNK3300_NILGNHOPGLD_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300NILGNHOPGLD();
      hash = (37 * hash) + UNK3300_IPAJLKOBDKC_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300IPAJLKOBDKC();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo prototype) {
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
     * Protobuf type {@code VintageHuntingFirstStageSettleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:VintageHuntingFirstStageSettleInfo)
        emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.internal_static_VintageHuntingFirstStageSettleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.internal_static_VintageHuntingFirstStageSettleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo.class, emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo.newBuilder()
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
        unk3300HIKADHBLPEB_ = 0;

        score_ = 0;

        unk3300NILGNHOPGLD_ = 0;

        unk3300IPAJLKOBDKC_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.internal_static_VintageHuntingFirstStageSettleInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo build() {
        emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo buildPartial() {
        emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo result = new emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo(this);
        result.unk3300HIKADHBLPEB_ = unk3300HIKADHBLPEB_;
        result.score_ = score_;
        result.unk3300NILGNHOPGLD_ = unk3300NILGNHOPGLD_;
        result.unk3300IPAJLKOBDKC_ = unk3300IPAJLKOBDKC_;
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
        if (other instanceof emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo) {
          return mergeFrom((emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo other) {
        if (other == emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo.getDefaultInstance()) return this;
        if (other.getUnk3300HIKADHBLPEB() != 0) {
          setUnk3300HIKADHBLPEB(other.getUnk3300HIKADHBLPEB());
        }
        if (other.getScore() != 0) {
          setScore(other.getScore());
        }
        if (other.getUnk3300NILGNHOPGLD() != 0) {
          setUnk3300NILGNHOPGLD(other.getUnk3300NILGNHOPGLD());
        }
        if (other.getUnk3300IPAJLKOBDKC() != 0) {
          setUnk3300IPAJLKOBDKC(other.getUnk3300IPAJLKOBDKC());
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
        emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int unk3300HIKADHBLPEB_ ;
      /**
       * <code>uint32 Unk3300_HIKADHBLPEB = 2;</code>
       * @return The unk3300HIKADHBLPEB.
       */
      @java.lang.Override
      public int getUnk3300HIKADHBLPEB() {
        return unk3300HIKADHBLPEB_;
      }
      /**
       * <code>uint32 Unk3300_HIKADHBLPEB = 2;</code>
       * @param value The unk3300HIKADHBLPEB to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300HIKADHBLPEB(int value) {
        
        unk3300HIKADHBLPEB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_HIKADHBLPEB = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300HIKADHBLPEB() {
        
        unk3300HIKADHBLPEB_ = 0;
        onChanged();
        return this;
      }

      private int score_ ;
      /**
       * <code>uint32 score = 1;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 1;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0;
        onChanged();
        return this;
      }

      private int unk3300NILGNHOPGLD_ ;
      /**
       * <code>uint32 Unk3300_NILGNHOPGLD = 3;</code>
       * @return The unk3300NILGNHOPGLD.
       */
      @java.lang.Override
      public int getUnk3300NILGNHOPGLD() {
        return unk3300NILGNHOPGLD_;
      }
      /**
       * <code>uint32 Unk3300_NILGNHOPGLD = 3;</code>
       * @param value The unk3300NILGNHOPGLD to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300NILGNHOPGLD(int value) {
        
        unk3300NILGNHOPGLD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_NILGNHOPGLD = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300NILGNHOPGLD() {
        
        unk3300NILGNHOPGLD_ = 0;
        onChanged();
        return this;
      }

      private int unk3300IPAJLKOBDKC_ ;
      /**
       * <code>uint32 Unk3300_IPAJLKOBDKC = 11;</code>
       * @return The unk3300IPAJLKOBDKC.
       */
      @java.lang.Override
      public int getUnk3300IPAJLKOBDKC() {
        return unk3300IPAJLKOBDKC_;
      }
      /**
       * <code>uint32 Unk3300_IPAJLKOBDKC = 11;</code>
       * @param value The unk3300IPAJLKOBDKC to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300IPAJLKOBDKC(int value) {
        
        unk3300IPAJLKOBDKC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_IPAJLKOBDKC = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300IPAJLKOBDKC() {
        
        unk3300IPAJLKOBDKC_ = 0;
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


      // @@protoc_insertion_point(builder_scope:VintageHuntingFirstStageSettleInfo)
    }

    // @@protoc_insertion_point(class_scope:VintageHuntingFirstStageSettleInfo)
    private static final emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo();
    }

    public static emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VintageHuntingFirstStageSettleInfo>
        PARSER = new com.google.protobuf.AbstractParser<VintageHuntingFirstStageSettleInfo>() {
      @java.lang.Override
      public VintageHuntingFirstStageSettleInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new VintageHuntingFirstStageSettleInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<VintageHuntingFirstStageSettleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VintageHuntingFirstStageSettleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.VintageHuntingFirstStageSettleInfoOuterClass.VintageHuntingFirstStageSettleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VintageHuntingFirstStageSettleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VintageHuntingFirstStageSettleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(VintageHuntingFirstStageSettleInfo.pro" +
      "to\"\212\001\n\"VintageHuntingFirstStageSettleInf" +
      "o\022\033\n\023Unk3300_HIKADHBLPEB\030\002 \001(\r\022\r\n\005score\030" +
      "\001 \001(\r\022\033\n\023Unk3300_NILGNHOPGLD\030\003 \001(\r\022\033\n\023Un" +
      "k3300_IPAJLKOBDKC\030\013 \001(\rB\030\n\026emu.gingerps." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_VintageHuntingFirstStageSettleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VintageHuntingFirstStageSettleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VintageHuntingFirstStageSettleInfo_descriptor,
        new java.lang.String[] { "Unk3300HIKADHBLPEB", "Score", "Unk3300NILGNHOPGLD", "Unk3300IPAJLKOBDKC", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
