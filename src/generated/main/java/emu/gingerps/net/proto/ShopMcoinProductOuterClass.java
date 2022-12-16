// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ShopMcoinProduct.proto

package emu.gingerps.net.proto;

public final class ShopMcoinProductOuterClass {
  private ShopMcoinProductOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ShopMcoinProductOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ShopMcoinProduct)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string product_id = 1;</code>
     * @return The productId.
     */
    java.lang.String getProductId();
    /**
     * <code>string product_id = 1;</code>
     * @return The bytes for productId.
     */
    com.google.protobuf.ByteString
        getProductIdBytes();

    /**
     * <code>string price_tier = 2;</code>
     * @return The priceTier.
     */
    java.lang.String getPriceTier();
    /**
     * <code>string price_tier = 2;</code>
     * @return The bytes for priceTier.
     */
    com.google.protobuf.ByteString
        getPriceTierBytes();

    /**
     * <code>uint32 mcoin_base = 3;</code>
     * @return The mcoinBase.
     */
    int getMcoinBase();

    /**
     * <code>uint32 mcoin_non_first = 4;</code>
     * @return The mcoinNonFirst.
     */
    int getMcoinNonFirst();

    /**
     * <code>uint32 mcoin_first = 5;</code>
     * @return The mcoinFirst.
     */
    int getMcoinFirst();

    /**
     * <code>uint32 bought_num = 6;</code>
     * @return The boughtNum.
     */
    int getBoughtNum();

    /**
     * <code>bool is_audit = 7;</code>
     * @return The isAudit.
     */
    boolean getIsAudit();
  }
  /**
   * Protobuf type {@code ShopMcoinProduct}
   */
  public static final class ShopMcoinProduct extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ShopMcoinProduct)
      ShopMcoinProductOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ShopMcoinProduct.newBuilder() to construct.
    private ShopMcoinProduct(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ShopMcoinProduct() {
      productId_ = "";
      priceTier_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ShopMcoinProduct();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ShopMcoinProduct(
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              productId_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              priceTier_ = s;
              break;
            }
            case 24: {

              mcoinBase_ = input.readUInt32();
              break;
            }
            case 32: {

              mcoinNonFirst_ = input.readUInt32();
              break;
            }
            case 40: {

              mcoinFirst_ = input.readUInt32();
              break;
            }
            case 48: {

              boughtNum_ = input.readUInt32();
              break;
            }
            case 56: {

              isAudit_ = input.readBool();
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
      return emu.gingerps.net.proto.ShopMcoinProductOuterClass.internal_static_ShopMcoinProduct_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.ShopMcoinProductOuterClass.internal_static_ShopMcoinProduct_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct.class, emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct.Builder.class);
    }

    public static final int PRODUCT_ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object productId_;
    /**
     * <code>string product_id = 1;</code>
     * @return The productId.
     */
    @java.lang.Override
    public java.lang.String getProductId() {
      java.lang.Object ref = productId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        productId_ = s;
        return s;
      }
    }
    /**
     * <code>string product_id = 1;</code>
     * @return The bytes for productId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getProductIdBytes() {
      java.lang.Object ref = productId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        productId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PRICE_TIER_FIELD_NUMBER = 2;
    private volatile java.lang.Object priceTier_;
    /**
     * <code>string price_tier = 2;</code>
     * @return The priceTier.
     */
    @java.lang.Override
    public java.lang.String getPriceTier() {
      java.lang.Object ref = priceTier_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        priceTier_ = s;
        return s;
      }
    }
    /**
     * <code>string price_tier = 2;</code>
     * @return The bytes for priceTier.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPriceTierBytes() {
      java.lang.Object ref = priceTier_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        priceTier_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MCOIN_BASE_FIELD_NUMBER = 3;
    private int mcoinBase_;
    /**
     * <code>uint32 mcoin_base = 3;</code>
     * @return The mcoinBase.
     */
    @java.lang.Override
    public int getMcoinBase() {
      return mcoinBase_;
    }

    public static final int MCOIN_NON_FIRST_FIELD_NUMBER = 4;
    private int mcoinNonFirst_;
    /**
     * <code>uint32 mcoin_non_first = 4;</code>
     * @return The mcoinNonFirst.
     */
    @java.lang.Override
    public int getMcoinNonFirst() {
      return mcoinNonFirst_;
    }

    public static final int MCOIN_FIRST_FIELD_NUMBER = 5;
    private int mcoinFirst_;
    /**
     * <code>uint32 mcoin_first = 5;</code>
     * @return The mcoinFirst.
     */
    @java.lang.Override
    public int getMcoinFirst() {
      return mcoinFirst_;
    }

    public static final int BOUGHT_NUM_FIELD_NUMBER = 6;
    private int boughtNum_;
    /**
     * <code>uint32 bought_num = 6;</code>
     * @return The boughtNum.
     */
    @java.lang.Override
    public int getBoughtNum() {
      return boughtNum_;
    }

    public static final int IS_AUDIT_FIELD_NUMBER = 7;
    private boolean isAudit_;
    /**
     * <code>bool is_audit = 7;</code>
     * @return The isAudit.
     */
    @java.lang.Override
    public boolean getIsAudit() {
      return isAudit_;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(productId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, productId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(priceTier_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, priceTier_);
      }
      if (mcoinBase_ != 0) {
        output.writeUInt32(3, mcoinBase_);
      }
      if (mcoinNonFirst_ != 0) {
        output.writeUInt32(4, mcoinNonFirst_);
      }
      if (mcoinFirst_ != 0) {
        output.writeUInt32(5, mcoinFirst_);
      }
      if (boughtNum_ != 0) {
        output.writeUInt32(6, boughtNum_);
      }
      if (isAudit_ != false) {
        output.writeBool(7, isAudit_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(productId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, productId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(priceTier_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, priceTier_);
      }
      if (mcoinBase_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, mcoinBase_);
      }
      if (mcoinNonFirst_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, mcoinNonFirst_);
      }
      if (mcoinFirst_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, mcoinFirst_);
      }
      if (boughtNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, boughtNum_);
      }
      if (isAudit_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isAudit_);
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
      if (!(obj instanceof emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct other = (emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct) obj;

      if (!getProductId()
          .equals(other.getProductId())) return false;
      if (!getPriceTier()
          .equals(other.getPriceTier())) return false;
      if (getMcoinBase()
          != other.getMcoinBase()) return false;
      if (getMcoinNonFirst()
          != other.getMcoinNonFirst()) return false;
      if (getMcoinFirst()
          != other.getMcoinFirst()) return false;
      if (getBoughtNum()
          != other.getBoughtNum()) return false;
      if (getIsAudit()
          != other.getIsAudit()) return false;
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
      hash = (37 * hash) + PRODUCT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getProductId().hashCode();
      hash = (37 * hash) + PRICE_TIER_FIELD_NUMBER;
      hash = (53 * hash) + getPriceTier().hashCode();
      hash = (37 * hash) + MCOIN_BASE_FIELD_NUMBER;
      hash = (53 * hash) + getMcoinBase();
      hash = (37 * hash) + MCOIN_NON_FIRST_FIELD_NUMBER;
      hash = (53 * hash) + getMcoinNonFirst();
      hash = (37 * hash) + MCOIN_FIRST_FIELD_NUMBER;
      hash = (53 * hash) + getMcoinFirst();
      hash = (37 * hash) + BOUGHT_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getBoughtNum();
      hash = (37 * hash) + IS_AUDIT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAudit());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct prototype) {
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
     * Protobuf type {@code ShopMcoinProduct}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ShopMcoinProduct)
        emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProductOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.ShopMcoinProductOuterClass.internal_static_ShopMcoinProduct_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.ShopMcoinProductOuterClass.internal_static_ShopMcoinProduct_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct.class, emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct.newBuilder()
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
        productId_ = "";

        priceTier_ = "";

        mcoinBase_ = 0;

        mcoinNonFirst_ = 0;

        mcoinFirst_ = 0;

        boughtNum_ = 0;

        isAudit_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.ShopMcoinProductOuterClass.internal_static_ShopMcoinProduct_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct getDefaultInstanceForType() {
        return emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct build() {
        emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct buildPartial() {
        emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct result = new emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct(this);
        result.productId_ = productId_;
        result.priceTier_ = priceTier_;
        result.mcoinBase_ = mcoinBase_;
        result.mcoinNonFirst_ = mcoinNonFirst_;
        result.mcoinFirst_ = mcoinFirst_;
        result.boughtNum_ = boughtNum_;
        result.isAudit_ = isAudit_;
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
        if (other instanceof emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct) {
          return mergeFrom((emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct other) {
        if (other == emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct.getDefaultInstance()) return this;
        if (!other.getProductId().isEmpty()) {
          productId_ = other.productId_;
          onChanged();
        }
        if (!other.getPriceTier().isEmpty()) {
          priceTier_ = other.priceTier_;
          onChanged();
        }
        if (other.getMcoinBase() != 0) {
          setMcoinBase(other.getMcoinBase());
        }
        if (other.getMcoinNonFirst() != 0) {
          setMcoinNonFirst(other.getMcoinNonFirst());
        }
        if (other.getMcoinFirst() != 0) {
          setMcoinFirst(other.getMcoinFirst());
        }
        if (other.getBoughtNum() != 0) {
          setBoughtNum(other.getBoughtNum());
        }
        if (other.getIsAudit() != false) {
          setIsAudit(other.getIsAudit());
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
        emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object productId_ = "";
      /**
       * <code>string product_id = 1;</code>
       * @return The productId.
       */
      public java.lang.String getProductId() {
        java.lang.Object ref = productId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          productId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string product_id = 1;</code>
       * @return The bytes for productId.
       */
      public com.google.protobuf.ByteString
          getProductIdBytes() {
        java.lang.Object ref = productId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          productId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string product_id = 1;</code>
       * @param value The productId to set.
       * @return This builder for chaining.
       */
      public Builder setProductId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        productId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string product_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearProductId() {
        
        productId_ = getDefaultInstance().getProductId();
        onChanged();
        return this;
      }
      /**
       * <code>string product_id = 1;</code>
       * @param value The bytes for productId to set.
       * @return This builder for chaining.
       */
      public Builder setProductIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        productId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object priceTier_ = "";
      /**
       * <code>string price_tier = 2;</code>
       * @return The priceTier.
       */
      public java.lang.String getPriceTier() {
        java.lang.Object ref = priceTier_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          priceTier_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string price_tier = 2;</code>
       * @return The bytes for priceTier.
       */
      public com.google.protobuf.ByteString
          getPriceTierBytes() {
        java.lang.Object ref = priceTier_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          priceTier_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string price_tier = 2;</code>
       * @param value The priceTier to set.
       * @return This builder for chaining.
       */
      public Builder setPriceTier(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        priceTier_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string price_tier = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPriceTier() {
        
        priceTier_ = getDefaultInstance().getPriceTier();
        onChanged();
        return this;
      }
      /**
       * <code>string price_tier = 2;</code>
       * @param value The bytes for priceTier to set.
       * @return This builder for chaining.
       */
      public Builder setPriceTierBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        priceTier_ = value;
        onChanged();
        return this;
      }

      private int mcoinBase_ ;
      /**
       * <code>uint32 mcoin_base = 3;</code>
       * @return The mcoinBase.
       */
      @java.lang.Override
      public int getMcoinBase() {
        return mcoinBase_;
      }
      /**
       * <code>uint32 mcoin_base = 3;</code>
       * @param value The mcoinBase to set.
       * @return This builder for chaining.
       */
      public Builder setMcoinBase(int value) {
        
        mcoinBase_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 mcoin_base = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMcoinBase() {
        
        mcoinBase_ = 0;
        onChanged();
        return this;
      }

      private int mcoinNonFirst_ ;
      /**
       * <code>uint32 mcoin_non_first = 4;</code>
       * @return The mcoinNonFirst.
       */
      @java.lang.Override
      public int getMcoinNonFirst() {
        return mcoinNonFirst_;
      }
      /**
       * <code>uint32 mcoin_non_first = 4;</code>
       * @param value The mcoinNonFirst to set.
       * @return This builder for chaining.
       */
      public Builder setMcoinNonFirst(int value) {
        
        mcoinNonFirst_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 mcoin_non_first = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearMcoinNonFirst() {
        
        mcoinNonFirst_ = 0;
        onChanged();
        return this;
      }

      private int mcoinFirst_ ;
      /**
       * <code>uint32 mcoin_first = 5;</code>
       * @return The mcoinFirst.
       */
      @java.lang.Override
      public int getMcoinFirst() {
        return mcoinFirst_;
      }
      /**
       * <code>uint32 mcoin_first = 5;</code>
       * @param value The mcoinFirst to set.
       * @return This builder for chaining.
       */
      public Builder setMcoinFirst(int value) {
        
        mcoinFirst_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 mcoin_first = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearMcoinFirst() {
        
        mcoinFirst_ = 0;
        onChanged();
        return this;
      }

      private int boughtNum_ ;
      /**
       * <code>uint32 bought_num = 6;</code>
       * @return The boughtNum.
       */
      @java.lang.Override
      public int getBoughtNum() {
        return boughtNum_;
      }
      /**
       * <code>uint32 bought_num = 6;</code>
       * @param value The boughtNum to set.
       * @return This builder for chaining.
       */
      public Builder setBoughtNum(int value) {
        
        boughtNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 bought_num = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearBoughtNum() {
        
        boughtNum_ = 0;
        onChanged();
        return this;
      }

      private boolean isAudit_ ;
      /**
       * <code>bool is_audit = 7;</code>
       * @return The isAudit.
       */
      @java.lang.Override
      public boolean getIsAudit() {
        return isAudit_;
      }
      /**
       * <code>bool is_audit = 7;</code>
       * @param value The isAudit to set.
       * @return This builder for chaining.
       */
      public Builder setIsAudit(boolean value) {
        
        isAudit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_audit = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAudit() {
        
        isAudit_ = false;
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


      // @@protoc_insertion_point(builder_scope:ShopMcoinProduct)
    }

    // @@protoc_insertion_point(class_scope:ShopMcoinProduct)
    private static final emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct();
    }

    public static emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ShopMcoinProduct>
        PARSER = new com.google.protobuf.AbstractParser<ShopMcoinProduct>() {
      @java.lang.Override
      public ShopMcoinProduct parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ShopMcoinProduct(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ShopMcoinProduct> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ShopMcoinProduct> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.ShopMcoinProductOuterClass.ShopMcoinProduct getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ShopMcoinProduct_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ShopMcoinProduct_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026ShopMcoinProduct.proto\"\242\001\n\020ShopMcoinPr" +
      "oduct\022\022\n\nproduct_id\030\001 \001(\t\022\022\n\nprice_tier\030" +
      "\002 \001(\t\022\022\n\nmcoin_base\030\003 \001(\r\022\027\n\017mcoin_non_f" +
      "irst\030\004 \001(\r\022\023\n\013mcoin_first\030\005 \001(\r\022\022\n\nbough" +
      "t_num\030\006 \001(\r\022\020\n\010is_audit\030\007 \001(\010B\033\n\031emu.gra" +
      "sscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ShopMcoinProduct_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ShopMcoinProduct_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ShopMcoinProduct_descriptor,
        new java.lang.String[] { "ProductId", "PriceTier", "McoinBase", "McoinNonFirst", "McoinFirst", "BoughtNum", "IsAudit", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
