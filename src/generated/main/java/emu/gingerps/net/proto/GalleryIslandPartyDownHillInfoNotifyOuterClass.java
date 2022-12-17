// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GalleryIslandPartyDownHillInfoNotify.proto

package emu.gingerps.net.proto;

public final class GalleryIslandPartyDownHillInfoNotifyOuterClass {
  private GalleryIslandPartyDownHillInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GalleryIslandPartyDownHillInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GalleryIslandPartyDownHillInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 coin = 8;</code>
     * @return The coin.
     */
    int getCoin();

    /**
     * <code>uint32 gallery_id = 14;</code>
     * @return The galleryId.
     */
    int getGalleryId();

    /**
     * <code>uint32 total_kill_monster_count = 7;</code>
     * @return The totalKillMonsterCount.
     */
    int getTotalKillMonsterCount();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 5537;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GalleryIslandPartyDownHillInfoNotify}
   */
  public static final class GalleryIslandPartyDownHillInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GalleryIslandPartyDownHillInfoNotify)
      GalleryIslandPartyDownHillInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GalleryIslandPartyDownHillInfoNotify.newBuilder() to construct.
    private GalleryIslandPartyDownHillInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GalleryIslandPartyDownHillInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GalleryIslandPartyDownHillInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.internal_static_GalleryIslandPartyDownHillInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.internal_static_GalleryIslandPartyDownHillInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify.class, emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify.Builder.class);
    }

    public static final int COIN_FIELD_NUMBER = 8;
    private int coin_ = 0;
    /**
     * <code>uint32 coin = 8;</code>
     * @return The coin.
     */
    @java.lang.Override
    public int getCoin() {
      return coin_;
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 14;
    private int galleryId_ = 0;
    /**
     * <code>uint32 gallery_id = 14;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
    }

    public static final int TOTAL_KILL_MONSTER_COUNT_FIELD_NUMBER = 7;
    private int totalKillMonsterCount_ = 0;
    /**
     * <code>uint32 total_kill_monster_count = 7;</code>
     * @return The totalKillMonsterCount.
     */
    @java.lang.Override
    public int getTotalKillMonsterCount() {
      return totalKillMonsterCount_;
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
      if (totalKillMonsterCount_ != 0) {
        output.writeUInt32(7, totalKillMonsterCount_);
      }
      if (coin_ != 0) {
        output.writeUInt32(8, coin_);
      }
      if (galleryId_ != 0) {
        output.writeUInt32(14, galleryId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (totalKillMonsterCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, totalKillMonsterCount_);
      }
      if (coin_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, coin_);
      }
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, galleryId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify other = (emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify) obj;

      if (getCoin()
          != other.getCoin()) return false;
      if (getGalleryId()
          != other.getGalleryId()) return false;
      if (getTotalKillMonsterCount()
          != other.getTotalKillMonsterCount()) return false;
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
      hash = (37 * hash) + COIN_FIELD_NUMBER;
      hash = (53 * hash) + getCoin();
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (37 * hash) + TOTAL_KILL_MONSTER_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getTotalKillMonsterCount();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify prototype) {
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
     *   CMD_ID = 5537;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GalleryIslandPartyDownHillInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GalleryIslandPartyDownHillInfoNotify)
        emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.internal_static_GalleryIslandPartyDownHillInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.internal_static_GalleryIslandPartyDownHillInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify.class, emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify.newBuilder()
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
        coin_ = 0;
        galleryId_ = 0;
        totalKillMonsterCount_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.internal_static_GalleryIslandPartyDownHillInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify build() {
        emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify buildPartial() {
        emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify result = new emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.coin_ = coin_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.galleryId_ = galleryId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.totalKillMonsterCount_ = totalKillMonsterCount_;
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
        if (other instanceof emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify) {
          return mergeFrom((emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify other) {
        if (other == emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify.getDefaultInstance()) return this;
        if (other.getCoin() != 0) {
          setCoin(other.getCoin());
        }
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
        }
        if (other.getTotalKillMonsterCount() != 0) {
          setTotalKillMonsterCount(other.getTotalKillMonsterCount());
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
              case 56: {
                totalKillMonsterCount_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 56
              case 64: {
                coin_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 64
              case 112: {
                galleryId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 112
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

      private int coin_ ;
      /**
       * <code>uint32 coin = 8;</code>
       * @return The coin.
       */
      @java.lang.Override
      public int getCoin() {
        return coin_;
      }
      /**
       * <code>uint32 coin = 8;</code>
       * @param value The coin to set.
       * @return This builder for chaining.
       */
      public Builder setCoin(int value) {
        
        coin_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 coin = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearCoin() {
        bitField0_ = (bitField0_ & ~0x00000001);
        coin_ = 0;
        onChanged();
        return this;
      }

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 14;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 14;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        galleryId_ = 0;
        onChanged();
        return this;
      }

      private int totalKillMonsterCount_ ;
      /**
       * <code>uint32 total_kill_monster_count = 7;</code>
       * @return The totalKillMonsterCount.
       */
      @java.lang.Override
      public int getTotalKillMonsterCount() {
        return totalKillMonsterCount_;
      }
      /**
       * <code>uint32 total_kill_monster_count = 7;</code>
       * @param value The totalKillMonsterCount to set.
       * @return This builder for chaining.
       */
      public Builder setTotalKillMonsterCount(int value) {
        
        totalKillMonsterCount_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 total_kill_monster_count = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalKillMonsterCount() {
        bitField0_ = (bitField0_ & ~0x00000004);
        totalKillMonsterCount_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GalleryIslandPartyDownHillInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:GalleryIslandPartyDownHillInfoNotify)
    private static final emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify();
    }

    public static emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GalleryIslandPartyDownHillInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<GalleryIslandPartyDownHillInfoNotify>() {
      @java.lang.Override
      public GalleryIslandPartyDownHillInfoNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<GalleryIslandPartyDownHillInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GalleryIslandPartyDownHillInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.GalleryIslandPartyDownHillInfoNotifyOuterClass.GalleryIslandPartyDownHillInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GalleryIslandPartyDownHillInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GalleryIslandPartyDownHillInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*GalleryIslandPartyDownHillInfoNotify.p" +
      "roto\"j\n$GalleryIslandPartyDownHillInfoNo" +
      "tify\022\014\n\004coin\030\010 \001(\r\022\022\n\ngallery_id\030\016 \001(\r\022 " +
      "\n\030total_kill_monster_count\030\007 \001(\rB\030\n\026emu." +
      "gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GalleryIslandPartyDownHillInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GalleryIslandPartyDownHillInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GalleryIslandPartyDownHillInfoNotify_descriptor,
        new java.lang.String[] { "Coin", "GalleryId", "TotalKillMonsterCount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
