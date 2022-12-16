// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerRechargeDataNotify.proto

package emu.gingerps.net.proto;

public final class PlayerRechargeDataNotifyOuterClass {
  private PlayerRechargeDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerRechargeDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerRechargeDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .ProductPriceTier product_price_tier_list = 7;</code>
     */
    java.util.List<emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTier> 
        getProductPriceTierListList();
    /**
     * <code>repeated .ProductPriceTier product_price_tier_list = 7;</code>
     */
    emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTier getProductPriceTierList(int index);
    /**
     * <code>repeated .ProductPriceTier product_price_tier_list = 7;</code>
     */
    int getProductPriceTierListCount();
    /**
     * <code>repeated .ProductPriceTier product_price_tier_list = 7;</code>
     */
    java.util.List<? extends emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTierOrBuilder> 
        getProductPriceTierListOrBuilderList();
    /**
     * <code>repeated .ProductPriceTier product_price_tier_list = 7;</code>
     */
    emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTierOrBuilder getProductPriceTierListOrBuilder(
        int index);

    /**
     * <code>uint32 card_product_remain_days = 6;</code>
     * @return The cardProductRemainDays.
     */
    int getCardProductRemainDays();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4127;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code PlayerRechargeDataNotify}
   */
  public static final class PlayerRechargeDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerRechargeDataNotify)
      PlayerRechargeDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerRechargeDataNotify.newBuilder() to construct.
    private PlayerRechargeDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerRechargeDataNotify() {
      productPriceTierList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerRechargeDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerRechargeDataNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 48: {

              cardProductRemainDays_ = input.readUInt32();
              break;
            }
            case 58: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                productPriceTierList_ = new java.util.ArrayList<emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTier>();
                mutable_bitField0_ |= 0x00000001;
              }
              productPriceTierList_.add(
                  input.readMessage(emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTier.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          productPriceTierList_ = java.util.Collections.unmodifiableList(productPriceTierList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.internal_static_PlayerRechargeDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.internal_static_PlayerRechargeDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify.class, emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify.Builder.class);
    }

    public static final int PRODUCT_PRICE_TIER_LIST_FIELD_NUMBER = 7;
    private java.util.List<emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTier> productPriceTierList_;
    /**
     * <code>repeated .ProductPriceTier product_price_tier_list = 7;</code>
     */
    @java.lang.Override
    public java.util.List<emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTier> getProductPriceTierListList() {
      return productPriceTierList_;
    }
    /**
     * <code>repeated .ProductPriceTier product_price_tier_list = 7;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTierOrBuilder> 
        getProductPriceTierListOrBuilderList() {
      return productPriceTierList_;
    }
    /**
     * <code>repeated .ProductPriceTier product_price_tier_list = 7;</code>
     */
    @java.lang.Override
    public int getProductPriceTierListCount() {
      return productPriceTierList_.size();
    }
    /**
     * <code>repeated .ProductPriceTier product_price_tier_list = 7;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTier getProductPriceTierList(int index) {
      return productPriceTierList_.get(index);
    }
    /**
     * <code>repeated .ProductPriceTier product_price_tier_list = 7;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTierOrBuilder getProductPriceTierListOrBuilder(
        int index) {
      return productPriceTierList_.get(index);
    }

    public static final int CARD_PRODUCT_REMAIN_DAYS_FIELD_NUMBER = 6;
    private int cardProductRemainDays_;
    /**
     * <code>uint32 card_product_remain_days = 6;</code>
     * @return The cardProductRemainDays.
     */
    @java.lang.Override
    public int getCardProductRemainDays() {
      return cardProductRemainDays_;
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
      if (cardProductRemainDays_ != 0) {
        output.writeUInt32(6, cardProductRemainDays_);
      }
      for (int i = 0; i < productPriceTierList_.size(); i++) {
        output.writeMessage(7, productPriceTierList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cardProductRemainDays_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, cardProductRemainDays_);
      }
      for (int i = 0; i < productPriceTierList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, productPriceTierList_.get(i));
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
      if (!(obj instanceof emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify other = (emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify) obj;

      if (!getProductPriceTierListList()
          .equals(other.getProductPriceTierListList())) return false;
      if (getCardProductRemainDays()
          != other.getCardProductRemainDays()) return false;
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
      if (getProductPriceTierListCount() > 0) {
        hash = (37 * hash) + PRODUCT_PRICE_TIER_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getProductPriceTierListList().hashCode();
      }
      hash = (37 * hash) + CARD_PRODUCT_REMAIN_DAYS_FIELD_NUMBER;
      hash = (53 * hash) + getCardProductRemainDays();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify prototype) {
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
     *   CMD_ID = 4127;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code PlayerRechargeDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerRechargeDataNotify)
        emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.internal_static_PlayerRechargeDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.internal_static_PlayerRechargeDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify.class, emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify.newBuilder()
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
          getProductPriceTierListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (productPriceTierListBuilder_ == null) {
          productPriceTierList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          productPriceTierListBuilder_.clear();
        }
        cardProductRemainDays_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.internal_static_PlayerRechargeDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify build() {
        emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify buildPartial() {
        emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify result = new emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify(this);
        int from_bitField0_ = bitField0_;
        if (productPriceTierListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            productPriceTierList_ = java.util.Collections.unmodifiableList(productPriceTierList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.productPriceTierList_ = productPriceTierList_;
        } else {
          result.productPriceTierList_ = productPriceTierListBuilder_.build();
        }
        result.cardProductRemainDays_ = cardProductRemainDays_;
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
        if (other instanceof emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify) {
          return mergeFrom((emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify other) {
        if (other == emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify.getDefaultInstance()) return this;
        if (productPriceTierListBuilder_ == null) {
          if (!other.productPriceTierList_.isEmpty()) {
            if (productPriceTierList_.isEmpty()) {
              productPriceTierList_ = other.productPriceTierList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureProductPriceTierListIsMutable();
              productPriceTierList_.addAll(other.productPriceTierList_);
            }
            onChanged();
          }
        } else {
          if (!other.productPriceTierList_.isEmpty()) {
            if (productPriceTierListBuilder_.isEmpty()) {
              productPriceTierListBuilder_.dispose();
              productPriceTierListBuilder_ = null;
              productPriceTierList_ = other.productPriceTierList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              productPriceTierListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getProductPriceTierListFieldBuilder() : null;
            } else {
              productPriceTierListBuilder_.addAllMessages(other.productPriceTierList_);
            }
          }
        }
        if (other.getCardProductRemainDays() != 0) {
          setCardProductRemainDays(other.getCardProductRemainDays());
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
        emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTier> productPriceTierList_ =
        java.util.Collections.emptyList();
      private void ensureProductPriceTierListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          productPriceTierList_ = new java.util.ArrayList<emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTier>(productPriceTierList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTier, emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTier.Builder, emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTierOrBuilder> productPriceTierListBuilder_;

      /**
       * <code>repeated .ProductPriceTier product_price_tier_list = 7;</code>
       */
      public java.util.List<emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTier> getProductPriceTierListList() {
        if (productPriceTierListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(productPriceTierList_);
        } else {
          return productPriceTierListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ProductPriceTier product_price_tier_list = 7;</code>
       */
      public int getProductPriceTierListCount() {
        if (productPriceTierListBuilder_ == null) {
          return productPriceTierList_.size();
        } else {
          return productPriceTierListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ProductPriceTier product_price_tier_list = 7;</code>
       */
      public emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTier getProductPriceTierList(int index) {
        if (productPriceTierListBuilder_ == null) {
          return productPriceTierList_.get(index);
        } else {
          return productPriceTierListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ProductPriceTier product_price_tier_list = 7;</code>
       */
      public Builder setProductPriceTierList(
          int index, emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTier value) {
        if (productPriceTierListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureProductPriceTierListIsMutable();
          productPriceTierList_.set(index, value);
          onChanged();
        } else {
          productPriceTierListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ProductPriceTier product_price_tier_list = 7;</code>
       */
      public Builder setProductPriceTierList(
          int index, emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTier.Builder builderForValue) {
        if (productPriceTierListBuilder_ == null) {
          ensureProductPriceTierListIsMutable();
          productPriceTierList_.set(index, builderForValue.build());
          onChanged();
        } else {
          productPriceTierListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ProductPriceTier product_price_tier_list = 7;</code>
       */
      public Builder addProductPriceTierList(emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTier value) {
        if (productPriceTierListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureProductPriceTierListIsMutable();
          productPriceTierList_.add(value);
          onChanged();
        } else {
          productPriceTierListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ProductPriceTier product_price_tier_list = 7;</code>
       */
      public Builder addProductPriceTierList(
          int index, emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTier value) {
        if (productPriceTierListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureProductPriceTierListIsMutable();
          productPriceTierList_.add(index, value);
          onChanged();
        } else {
          productPriceTierListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ProductPriceTier product_price_tier_list = 7;</code>
       */
      public Builder addProductPriceTierList(
          emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTier.Builder builderForValue) {
        if (productPriceTierListBuilder_ == null) {
          ensureProductPriceTierListIsMutable();
          productPriceTierList_.add(builderForValue.build());
          onChanged();
        } else {
          productPriceTierListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ProductPriceTier product_price_tier_list = 7;</code>
       */
      public Builder addProductPriceTierList(
          int index, emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTier.Builder builderForValue) {
        if (productPriceTierListBuilder_ == null) {
          ensureProductPriceTierListIsMutable();
          productPriceTierList_.add(index, builderForValue.build());
          onChanged();
        } else {
          productPriceTierListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ProductPriceTier product_price_tier_list = 7;</code>
       */
      public Builder addAllProductPriceTierList(
          java.lang.Iterable<? extends emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTier> values) {
        if (productPriceTierListBuilder_ == null) {
          ensureProductPriceTierListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, productPriceTierList_);
          onChanged();
        } else {
          productPriceTierListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ProductPriceTier product_price_tier_list = 7;</code>
       */
      public Builder clearProductPriceTierList() {
        if (productPriceTierListBuilder_ == null) {
          productPriceTierList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          productPriceTierListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ProductPriceTier product_price_tier_list = 7;</code>
       */
      public Builder removeProductPriceTierList(int index) {
        if (productPriceTierListBuilder_ == null) {
          ensureProductPriceTierListIsMutable();
          productPriceTierList_.remove(index);
          onChanged();
        } else {
          productPriceTierListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ProductPriceTier product_price_tier_list = 7;</code>
       */
      public emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTier.Builder getProductPriceTierListBuilder(
          int index) {
        return getProductPriceTierListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ProductPriceTier product_price_tier_list = 7;</code>
       */
      public emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTierOrBuilder getProductPriceTierListOrBuilder(
          int index) {
        if (productPriceTierListBuilder_ == null) {
          return productPriceTierList_.get(index);  } else {
          return productPriceTierListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ProductPriceTier product_price_tier_list = 7;</code>
       */
      public java.util.List<? extends emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTierOrBuilder> 
           getProductPriceTierListOrBuilderList() {
        if (productPriceTierListBuilder_ != null) {
          return productPriceTierListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(productPriceTierList_);
        }
      }
      /**
       * <code>repeated .ProductPriceTier product_price_tier_list = 7;</code>
       */
      public emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTier.Builder addProductPriceTierListBuilder() {
        return getProductPriceTierListFieldBuilder().addBuilder(
            emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTier.getDefaultInstance());
      }
      /**
       * <code>repeated .ProductPriceTier product_price_tier_list = 7;</code>
       */
      public emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTier.Builder addProductPriceTierListBuilder(
          int index) {
        return getProductPriceTierListFieldBuilder().addBuilder(
            index, emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTier.getDefaultInstance());
      }
      /**
       * <code>repeated .ProductPriceTier product_price_tier_list = 7;</code>
       */
      public java.util.List<emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTier.Builder> 
           getProductPriceTierListBuilderList() {
        return getProductPriceTierListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTier, emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTier.Builder, emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTierOrBuilder> 
          getProductPriceTierListFieldBuilder() {
        if (productPriceTierListBuilder_ == null) {
          productPriceTierListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTier, emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTier.Builder, emu.gingerps.net.proto.ProductPriceTierOuterClass.ProductPriceTierOrBuilder>(
                  productPriceTierList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          productPriceTierList_ = null;
        }
        return productPriceTierListBuilder_;
      }

      private int cardProductRemainDays_ ;
      /**
       * <code>uint32 card_product_remain_days = 6;</code>
       * @return The cardProductRemainDays.
       */
      @java.lang.Override
      public int getCardProductRemainDays() {
        return cardProductRemainDays_;
      }
      /**
       * <code>uint32 card_product_remain_days = 6;</code>
       * @param value The cardProductRemainDays to set.
       * @return This builder for chaining.
       */
      public Builder setCardProductRemainDays(int value) {
        
        cardProductRemainDays_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_product_remain_days = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardProductRemainDays() {
        
        cardProductRemainDays_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerRechargeDataNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerRechargeDataNotify)
    private static final emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify();
    }

    public static emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerRechargeDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerRechargeDataNotify>() {
      @java.lang.Override
      public PlayerRechargeDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerRechargeDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerRechargeDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerRechargeDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.PlayerRechargeDataNotifyOuterClass.PlayerRechargeDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerRechargeDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerRechargeDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036PlayerRechargeDataNotify.proto\032\026Produc" +
      "tPriceTier.proto\"p\n\030PlayerRechargeDataNo" +
      "tify\0222\n\027product_price_tier_list\030\007 \003(\0132\021." +
      "ProductPriceTier\022 \n\030card_product_remain_" +
      "days\030\006 \001(\rB\033\n\031emu.gingerps.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.ProductPriceTierOuterClass.getDescriptor(),
        });
    internal_static_PlayerRechargeDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerRechargeDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerRechargeDataNotify_descriptor,
        new java.lang.String[] { "ProductPriceTierList", "CardProductRemainDays", });
    emu.gingerps.net.proto.ProductPriceTierOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
