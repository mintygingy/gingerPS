// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BuyGoodsReq.proto

package emu.gingerps.net.proto;

public final class BuyGoodsReqOuterClass {
  private BuyGoodsReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BuyGoodsReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BuyGoodsReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 shop_type = 9;</code>
     * @return The shopType.
     */
    int getShopType();

    /**
     * <code>.ShopGoods goods = 10;</code>
     * @return Whether the goods field is set.
     */
    boolean hasGoods();
    /**
     * <code>.ShopGoods goods = 10;</code>
     * @return The goods.
     */
    emu.gingerps.net.proto.ShopGoodsOuterClass.ShopGoods getGoods();
    /**
     * <code>.ShopGoods goods = 10;</code>
     */
    emu.gingerps.net.proto.ShopGoodsOuterClass.ShopGoodsOrBuilder getGoodsOrBuilder();

    /**
     * <code>uint32 buy_count = 13;</code>
     * @return The buyCount.
     */
    int getBuyCount();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 756;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code BuyGoodsReq}
   */
  public static final class BuyGoodsReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BuyGoodsReq)
      BuyGoodsReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BuyGoodsReq.newBuilder() to construct.
    private BuyGoodsReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BuyGoodsReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BuyGoodsReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.BuyGoodsReqOuterClass.internal_static_BuyGoodsReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.BuyGoodsReqOuterClass.internal_static_BuyGoodsReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq.class, emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq.Builder.class);
    }

    public static final int SHOP_TYPE_FIELD_NUMBER = 9;
    private int shopType_ = 0;
    /**
     * <code>uint32 shop_type = 9;</code>
     * @return The shopType.
     */
    @java.lang.Override
    public int getShopType() {
      return shopType_;
    }

    public static final int GOODS_FIELD_NUMBER = 10;
    private emu.gingerps.net.proto.ShopGoodsOuterClass.ShopGoods goods_;
    /**
     * <code>.ShopGoods goods = 10;</code>
     * @return Whether the goods field is set.
     */
    @java.lang.Override
    public boolean hasGoods() {
      return goods_ != null;
    }
    /**
     * <code>.ShopGoods goods = 10;</code>
     * @return The goods.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.ShopGoodsOuterClass.ShopGoods getGoods() {
      return goods_ == null ? emu.gingerps.net.proto.ShopGoodsOuterClass.ShopGoods.getDefaultInstance() : goods_;
    }
    /**
     * <code>.ShopGoods goods = 10;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.ShopGoodsOuterClass.ShopGoodsOrBuilder getGoodsOrBuilder() {
      return goods_ == null ? emu.gingerps.net.proto.ShopGoodsOuterClass.ShopGoods.getDefaultInstance() : goods_;
    }

    public static final int BUY_COUNT_FIELD_NUMBER = 13;
    private int buyCount_ = 0;
    /**
     * <code>uint32 buy_count = 13;</code>
     * @return The buyCount.
     */
    @java.lang.Override
    public int getBuyCount() {
      return buyCount_;
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
      if (shopType_ != 0) {
        output.writeUInt32(9, shopType_);
      }
      if (goods_ != null) {
        output.writeMessage(10, getGoods());
      }
      if (buyCount_ != 0) {
        output.writeUInt32(13, buyCount_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (shopType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, shopType_);
      }
      if (goods_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, getGoods());
      }
      if (buyCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, buyCount_);
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
      if (!(obj instanceof emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq other = (emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq) obj;

      if (getShopType()
          != other.getShopType()) return false;
      if (hasGoods() != other.hasGoods()) return false;
      if (hasGoods()) {
        if (!getGoods()
            .equals(other.getGoods())) return false;
      }
      if (getBuyCount()
          != other.getBuyCount()) return false;
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
      hash = (37 * hash) + SHOP_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getShopType();
      if (hasGoods()) {
        hash = (37 * hash) + GOODS_FIELD_NUMBER;
        hash = (53 * hash) + getGoods().hashCode();
      }
      hash = (37 * hash) + BUY_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getBuyCount();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq prototype) {
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
     *   CMD_ID = 756;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code BuyGoodsReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BuyGoodsReq)
        emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.BuyGoodsReqOuterClass.internal_static_BuyGoodsReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.BuyGoodsReqOuterClass.internal_static_BuyGoodsReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq.class, emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq.newBuilder()
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
        shopType_ = 0;
        goods_ = null;
        if (goodsBuilder_ != null) {
          goodsBuilder_.dispose();
          goodsBuilder_ = null;
        }
        buyCount_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.BuyGoodsReqOuterClass.internal_static_BuyGoodsReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq build() {
        emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq buildPartial() {
        emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq result = new emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.shopType_ = shopType_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.goods_ = goodsBuilder_ == null
              ? goods_
              : goodsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.buyCount_ = buyCount_;
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
        if (other instanceof emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq) {
          return mergeFrom((emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq other) {
        if (other == emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq.getDefaultInstance()) return this;
        if (other.getShopType() != 0) {
          setShopType(other.getShopType());
        }
        if (other.hasGoods()) {
          mergeGoods(other.getGoods());
        }
        if (other.getBuyCount() != 0) {
          setBuyCount(other.getBuyCount());
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
              case 72: {
                shopType_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 72
              case 82: {
                input.readMessage(
                    getGoodsFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 82
              case 104: {
                buyCount_ = input.readUInt32();
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

      private int shopType_ ;
      /**
       * <code>uint32 shop_type = 9;</code>
       * @return The shopType.
       */
      @java.lang.Override
      public int getShopType() {
        return shopType_;
      }
      /**
       * <code>uint32 shop_type = 9;</code>
       * @param value The shopType to set.
       * @return This builder for chaining.
       */
      public Builder setShopType(int value) {
        
        shopType_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 shop_type = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearShopType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        shopType_ = 0;
        onChanged();
        return this;
      }

      private emu.gingerps.net.proto.ShopGoodsOuterClass.ShopGoods goods_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.ShopGoodsOuterClass.ShopGoods, emu.gingerps.net.proto.ShopGoodsOuterClass.ShopGoods.Builder, emu.gingerps.net.proto.ShopGoodsOuterClass.ShopGoodsOrBuilder> goodsBuilder_;
      /**
       * <code>.ShopGoods goods = 10;</code>
       * @return Whether the goods field is set.
       */
      public boolean hasGoods() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.ShopGoods goods = 10;</code>
       * @return The goods.
       */
      public emu.gingerps.net.proto.ShopGoodsOuterClass.ShopGoods getGoods() {
        if (goodsBuilder_ == null) {
          return goods_ == null ? emu.gingerps.net.proto.ShopGoodsOuterClass.ShopGoods.getDefaultInstance() : goods_;
        } else {
          return goodsBuilder_.getMessage();
        }
      }
      /**
       * <code>.ShopGoods goods = 10;</code>
       */
      public Builder setGoods(emu.gingerps.net.proto.ShopGoodsOuterClass.ShopGoods value) {
        if (goodsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          goods_ = value;
        } else {
          goodsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.ShopGoods goods = 10;</code>
       */
      public Builder setGoods(
          emu.gingerps.net.proto.ShopGoodsOuterClass.ShopGoods.Builder builderForValue) {
        if (goodsBuilder_ == null) {
          goods_ = builderForValue.build();
        } else {
          goodsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.ShopGoods goods = 10;</code>
       */
      public Builder mergeGoods(emu.gingerps.net.proto.ShopGoodsOuterClass.ShopGoods value) {
        if (goodsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            goods_ != null &&
            goods_ != emu.gingerps.net.proto.ShopGoodsOuterClass.ShopGoods.getDefaultInstance()) {
            getGoodsBuilder().mergeFrom(value);
          } else {
            goods_ = value;
          }
        } else {
          goodsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.ShopGoods goods = 10;</code>
       */
      public Builder clearGoods() {
        bitField0_ = (bitField0_ & ~0x00000002);
        goods_ = null;
        if (goodsBuilder_ != null) {
          goodsBuilder_.dispose();
          goodsBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.ShopGoods goods = 10;</code>
       */
      public emu.gingerps.net.proto.ShopGoodsOuterClass.ShopGoods.Builder getGoodsBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getGoodsFieldBuilder().getBuilder();
      }
      /**
       * <code>.ShopGoods goods = 10;</code>
       */
      public emu.gingerps.net.proto.ShopGoodsOuterClass.ShopGoodsOrBuilder getGoodsOrBuilder() {
        if (goodsBuilder_ != null) {
          return goodsBuilder_.getMessageOrBuilder();
        } else {
          return goods_ == null ?
              emu.gingerps.net.proto.ShopGoodsOuterClass.ShopGoods.getDefaultInstance() : goods_;
        }
      }
      /**
       * <code>.ShopGoods goods = 10;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.ShopGoodsOuterClass.ShopGoods, emu.gingerps.net.proto.ShopGoodsOuterClass.ShopGoods.Builder, emu.gingerps.net.proto.ShopGoodsOuterClass.ShopGoodsOrBuilder> 
          getGoodsFieldBuilder() {
        if (goodsBuilder_ == null) {
          goodsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.ShopGoodsOuterClass.ShopGoods, emu.gingerps.net.proto.ShopGoodsOuterClass.ShopGoods.Builder, emu.gingerps.net.proto.ShopGoodsOuterClass.ShopGoodsOrBuilder>(
                  getGoods(),
                  getParentForChildren(),
                  isClean());
          goods_ = null;
        }
        return goodsBuilder_;
      }

      private int buyCount_ ;
      /**
       * <code>uint32 buy_count = 13;</code>
       * @return The buyCount.
       */
      @java.lang.Override
      public int getBuyCount() {
        return buyCount_;
      }
      /**
       * <code>uint32 buy_count = 13;</code>
       * @param value The buyCount to set.
       * @return This builder for chaining.
       */
      public Builder setBuyCount(int value) {
        
        buyCount_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 buy_count = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearBuyCount() {
        bitField0_ = (bitField0_ & ~0x00000004);
        buyCount_ = 0;
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


      // @@protoc_insertion_point(builder_scope:BuyGoodsReq)
    }

    // @@protoc_insertion_point(class_scope:BuyGoodsReq)
    private static final emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq();
    }

    public static emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BuyGoodsReq>
        PARSER = new com.google.protobuf.AbstractParser<BuyGoodsReq>() {
      @java.lang.Override
      public BuyGoodsReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<BuyGoodsReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BuyGoodsReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.BuyGoodsReqOuterClass.BuyGoodsReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BuyGoodsReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BuyGoodsReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021BuyGoodsReq.proto\032\017ShopGoods.proto\"N\n\013" +
      "BuyGoodsReq\022\021\n\tshop_type\030\t \001(\r\022\031\n\005goods\030" +
      "\n \001(\0132\n.ShopGoods\022\021\n\tbuy_count\030\r \001(\rB\030\n\026" +
      "emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.ShopGoodsOuterClass.getDescriptor(),
        });
    internal_static_BuyGoodsReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BuyGoodsReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BuyGoodsReq_descriptor,
        new java.lang.String[] { "ShopType", "Goods", "BuyCount", });
    emu.gingerps.net.proto.ShopGoodsOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
