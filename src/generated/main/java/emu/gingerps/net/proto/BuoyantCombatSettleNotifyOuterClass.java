// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BuoyantCombatSettleNotify.proto

package emu.gingerps.net.proto;

public final class BuoyantCombatSettleNotifyOuterClass {
  private BuoyantCombatSettleNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BuoyantCombatSettleNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BuoyantCombatSettleNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gallery_id = 8;</code>
     * @return The galleryId.
     */
    int getGalleryId();

    /**
     * <code>.BuoyantCombatSettleInfo settle_info = 15;</code>
     * @return Whether the settleInfo field is set.
     */
    boolean hasSettleInfo();
    /**
     * <code>.BuoyantCombatSettleInfo settle_info = 15;</code>
     * @return The settleInfo.
     */
    emu.gingerps.net.proto.BuoyantCombatSettleInfoOuterClass.BuoyantCombatSettleInfo getSettleInfo();
    /**
     * <code>.BuoyantCombatSettleInfo settle_info = 15;</code>
     */
    emu.gingerps.net.proto.BuoyantCombatSettleInfoOuterClass.BuoyantCombatSettleInfoOrBuilder getSettleInfoOrBuilder();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8751;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code BuoyantCombatSettleNotify}
   */
  public static final class BuoyantCombatSettleNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BuoyantCombatSettleNotify)
      BuoyantCombatSettleNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BuoyantCombatSettleNotify.newBuilder() to construct.
    private BuoyantCombatSettleNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BuoyantCombatSettleNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BuoyantCombatSettleNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.internal_static_BuoyantCombatSettleNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.internal_static_BuoyantCombatSettleNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify.class, emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify.Builder.class);
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 8;
    private int galleryId_ = 0;
    /**
     * <code>uint32 gallery_id = 8;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
    }

    public static final int SETTLE_INFO_FIELD_NUMBER = 15;
    private emu.gingerps.net.proto.BuoyantCombatSettleInfoOuterClass.BuoyantCombatSettleInfo settleInfo_;
    /**
     * <code>.BuoyantCombatSettleInfo settle_info = 15;</code>
     * @return Whether the settleInfo field is set.
     */
    @java.lang.Override
    public boolean hasSettleInfo() {
      return settleInfo_ != null;
    }
    /**
     * <code>.BuoyantCombatSettleInfo settle_info = 15;</code>
     * @return The settleInfo.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.BuoyantCombatSettleInfoOuterClass.BuoyantCombatSettleInfo getSettleInfo() {
      return settleInfo_ == null ? emu.gingerps.net.proto.BuoyantCombatSettleInfoOuterClass.BuoyantCombatSettleInfo.getDefaultInstance() : settleInfo_;
    }
    /**
     * <code>.BuoyantCombatSettleInfo settle_info = 15;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.BuoyantCombatSettleInfoOuterClass.BuoyantCombatSettleInfoOrBuilder getSettleInfoOrBuilder() {
      return settleInfo_ == null ? emu.gingerps.net.proto.BuoyantCombatSettleInfoOuterClass.BuoyantCombatSettleInfo.getDefaultInstance() : settleInfo_;
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
      if (galleryId_ != 0) {
        output.writeUInt32(8, galleryId_);
      }
      if (settleInfo_ != null) {
        output.writeMessage(15, getSettleInfo());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, galleryId_);
      }
      if (settleInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, getSettleInfo());
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
      if (!(obj instanceof emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify other = (emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify) obj;

      if (getGalleryId()
          != other.getGalleryId()) return false;
      if (hasSettleInfo() != other.hasSettleInfo()) return false;
      if (hasSettleInfo()) {
        if (!getSettleInfo()
            .equals(other.getSettleInfo())) return false;
      }
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
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      if (hasSettleInfo()) {
        hash = (37 * hash) + SETTLE_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getSettleInfo().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify prototype) {
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
     *   CMD_ID = 8751;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code BuoyantCombatSettleNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BuoyantCombatSettleNotify)
        emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.internal_static_BuoyantCombatSettleNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.internal_static_BuoyantCombatSettleNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify.class, emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify.newBuilder()
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
        galleryId_ = 0;
        settleInfo_ = null;
        if (settleInfoBuilder_ != null) {
          settleInfoBuilder_.dispose();
          settleInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.internal_static_BuoyantCombatSettleNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify build() {
        emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify buildPartial() {
        emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify result = new emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.galleryId_ = galleryId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.settleInfo_ = settleInfoBuilder_ == null
              ? settleInfo_
              : settleInfoBuilder_.build();
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
        if (other instanceof emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify) {
          return mergeFrom((emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify other) {
        if (other == emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify.getDefaultInstance()) return this;
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
        }
        if (other.hasSettleInfo()) {
          mergeSettleInfo(other.getSettleInfo());
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
              case 64: {
                galleryId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 64
              case 122: {
                input.readMessage(
                    getSettleInfoFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 122
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

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 8;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 8;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        galleryId_ = 0;
        onChanged();
        return this;
      }

      private emu.gingerps.net.proto.BuoyantCombatSettleInfoOuterClass.BuoyantCombatSettleInfo settleInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.BuoyantCombatSettleInfoOuterClass.BuoyantCombatSettleInfo, emu.gingerps.net.proto.BuoyantCombatSettleInfoOuterClass.BuoyantCombatSettleInfo.Builder, emu.gingerps.net.proto.BuoyantCombatSettleInfoOuterClass.BuoyantCombatSettleInfoOrBuilder> settleInfoBuilder_;
      /**
       * <code>.BuoyantCombatSettleInfo settle_info = 15;</code>
       * @return Whether the settleInfo field is set.
       */
      public boolean hasSettleInfo() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.BuoyantCombatSettleInfo settle_info = 15;</code>
       * @return The settleInfo.
       */
      public emu.gingerps.net.proto.BuoyantCombatSettleInfoOuterClass.BuoyantCombatSettleInfo getSettleInfo() {
        if (settleInfoBuilder_ == null) {
          return settleInfo_ == null ? emu.gingerps.net.proto.BuoyantCombatSettleInfoOuterClass.BuoyantCombatSettleInfo.getDefaultInstance() : settleInfo_;
        } else {
          return settleInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.BuoyantCombatSettleInfo settle_info = 15;</code>
       */
      public Builder setSettleInfo(emu.gingerps.net.proto.BuoyantCombatSettleInfoOuterClass.BuoyantCombatSettleInfo value) {
        if (settleInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          settleInfo_ = value;
        } else {
          settleInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.BuoyantCombatSettleInfo settle_info = 15;</code>
       */
      public Builder setSettleInfo(
          emu.gingerps.net.proto.BuoyantCombatSettleInfoOuterClass.BuoyantCombatSettleInfo.Builder builderForValue) {
        if (settleInfoBuilder_ == null) {
          settleInfo_ = builderForValue.build();
        } else {
          settleInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.BuoyantCombatSettleInfo settle_info = 15;</code>
       */
      public Builder mergeSettleInfo(emu.gingerps.net.proto.BuoyantCombatSettleInfoOuterClass.BuoyantCombatSettleInfo value) {
        if (settleInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            settleInfo_ != null &&
            settleInfo_ != emu.gingerps.net.proto.BuoyantCombatSettleInfoOuterClass.BuoyantCombatSettleInfo.getDefaultInstance()) {
            getSettleInfoBuilder().mergeFrom(value);
          } else {
            settleInfo_ = value;
          }
        } else {
          settleInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.BuoyantCombatSettleInfo settle_info = 15;</code>
       */
      public Builder clearSettleInfo() {
        bitField0_ = (bitField0_ & ~0x00000002);
        settleInfo_ = null;
        if (settleInfoBuilder_ != null) {
          settleInfoBuilder_.dispose();
          settleInfoBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.BuoyantCombatSettleInfo settle_info = 15;</code>
       */
      public emu.gingerps.net.proto.BuoyantCombatSettleInfoOuterClass.BuoyantCombatSettleInfo.Builder getSettleInfoBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSettleInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.BuoyantCombatSettleInfo settle_info = 15;</code>
       */
      public emu.gingerps.net.proto.BuoyantCombatSettleInfoOuterClass.BuoyantCombatSettleInfoOrBuilder getSettleInfoOrBuilder() {
        if (settleInfoBuilder_ != null) {
          return settleInfoBuilder_.getMessageOrBuilder();
        } else {
          return settleInfo_ == null ?
              emu.gingerps.net.proto.BuoyantCombatSettleInfoOuterClass.BuoyantCombatSettleInfo.getDefaultInstance() : settleInfo_;
        }
      }
      /**
       * <code>.BuoyantCombatSettleInfo settle_info = 15;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.BuoyantCombatSettleInfoOuterClass.BuoyantCombatSettleInfo, emu.gingerps.net.proto.BuoyantCombatSettleInfoOuterClass.BuoyantCombatSettleInfo.Builder, emu.gingerps.net.proto.BuoyantCombatSettleInfoOuterClass.BuoyantCombatSettleInfoOrBuilder> 
          getSettleInfoFieldBuilder() {
        if (settleInfoBuilder_ == null) {
          settleInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.BuoyantCombatSettleInfoOuterClass.BuoyantCombatSettleInfo, emu.gingerps.net.proto.BuoyantCombatSettleInfoOuterClass.BuoyantCombatSettleInfo.Builder, emu.gingerps.net.proto.BuoyantCombatSettleInfoOuterClass.BuoyantCombatSettleInfoOrBuilder>(
                  getSettleInfo(),
                  getParentForChildren(),
                  isClean());
          settleInfo_ = null;
        }
        return settleInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:BuoyantCombatSettleNotify)
    }

    // @@protoc_insertion_point(class_scope:BuoyantCombatSettleNotify)
    private static final emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify();
    }

    public static emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BuoyantCombatSettleNotify>
        PARSER = new com.google.protobuf.AbstractParser<BuoyantCombatSettleNotify>() {
      @java.lang.Override
      public BuoyantCombatSettleNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<BuoyantCombatSettleNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BuoyantCombatSettleNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.BuoyantCombatSettleNotifyOuterClass.BuoyantCombatSettleNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BuoyantCombatSettleNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BuoyantCombatSettleNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037BuoyantCombatSettleNotify.proto\032\035Buoya" +
      "ntCombatSettleInfo.proto\"^\n\031BuoyantComba" +
      "tSettleNotify\022\022\n\ngallery_id\030\010 \001(\r\022-\n\013set" +
      "tle_info\030\017 \001(\0132\030.BuoyantCombatSettleInfo" +
      "B\030\n\026emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.BuoyantCombatSettleInfoOuterClass.getDescriptor(),
        });
    internal_static_BuoyantCombatSettleNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BuoyantCombatSettleNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BuoyantCombatSettleNotify_descriptor,
        new java.lang.String[] { "GalleryId", "SettleInfo", });
    emu.gingerps.net.proto.BuoyantCombatSettleInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
