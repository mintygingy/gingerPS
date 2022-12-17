// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VintageMarketTraderInfo.proto

package emu.gingerps.net.proto;

public final class VintageMarketTraderInfoOuterClass {
  private VintageMarketTraderInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VintageMarketTraderInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VintageMarketTraderInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 trader_id = 4;</code>
     * @return The traderId.
     */
    int getTraderId();

    /**
     * <code>repeated .ItemParam available_item_list = 15;</code>
     */
    java.util.List<emu.gingerps.net.proto.ItemParamOuterClass.ItemParam> 
        getAvailableItemListList();
    /**
     * <code>repeated .ItemParam available_item_list = 15;</code>
     */
    emu.gingerps.net.proto.ItemParamOuterClass.ItemParam getAvailableItemList(int index);
    /**
     * <code>repeated .ItemParam available_item_list = 15;</code>
     */
    int getAvailableItemListCount();
    /**
     * <code>repeated .ItemParam available_item_list = 15;</code>
     */
    java.util.List<? extends emu.gingerps.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
        getAvailableItemListOrBuilderList();
    /**
     * <code>repeated .ItemParam available_item_list = 15;</code>
     */
    emu.gingerps.net.proto.ItemParamOuterClass.ItemParamOrBuilder getAvailableItemListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code VintageMarketTraderInfo}
   */
  public static final class VintageMarketTraderInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:VintageMarketTraderInfo)
      VintageMarketTraderInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VintageMarketTraderInfo.newBuilder() to construct.
    private VintageMarketTraderInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VintageMarketTraderInfo() {
      availableItemList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new VintageMarketTraderInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private VintageMarketTraderInfo(
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
            case 32: {

              traderId_ = input.readUInt32();
              break;
            }
            case 122: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                availableItemList_ = new java.util.ArrayList<emu.gingerps.net.proto.ItemParamOuterClass.ItemParam>();
                mutable_bitField0_ |= 0x00000001;
              }
              availableItemList_.add(
                  input.readMessage(emu.gingerps.net.proto.ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
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
          availableItemList_ = java.util.Collections.unmodifiableList(availableItemList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.internal_static_VintageMarketTraderInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.internal_static_VintageMarketTraderInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo.class, emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo.Builder.class);
    }

    public static final int TRADER_ID_FIELD_NUMBER = 4;
    private int traderId_;
    /**
     * <code>uint32 trader_id = 4;</code>
     * @return The traderId.
     */
    @java.lang.Override
    public int getTraderId() {
      return traderId_;
    }

    public static final int AVAILABLE_ITEM_LIST_FIELD_NUMBER = 15;
    private java.util.List<emu.gingerps.net.proto.ItemParamOuterClass.ItemParam> availableItemList_;
    /**
     * <code>repeated .ItemParam available_item_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<emu.gingerps.net.proto.ItemParamOuterClass.ItemParam> getAvailableItemListList() {
      return availableItemList_;
    }
    /**
     * <code>repeated .ItemParam available_item_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.gingerps.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
        getAvailableItemListOrBuilderList() {
      return availableItemList_;
    }
    /**
     * <code>repeated .ItemParam available_item_list = 15;</code>
     */
    @java.lang.Override
    public int getAvailableItemListCount() {
      return availableItemList_.size();
    }
    /**
     * <code>repeated .ItemParam available_item_list = 15;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.ItemParamOuterClass.ItemParam getAvailableItemList(int index) {
      return availableItemList_.get(index);
    }
    /**
     * <code>repeated .ItemParam available_item_list = 15;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.ItemParamOuterClass.ItemParamOrBuilder getAvailableItemListOrBuilder(
        int index) {
      return availableItemList_.get(index);
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
      if (traderId_ != 0) {
        output.writeUInt32(4, traderId_);
      }
      for (int i = 0; i < availableItemList_.size(); i++) {
        output.writeMessage(15, availableItemList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (traderId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, traderId_);
      }
      for (int i = 0; i < availableItemList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, availableItemList_.get(i));
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
      if (!(obj instanceof emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo other = (emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo) obj;

      if (getTraderId()
          != other.getTraderId()) return false;
      if (!getAvailableItemListList()
          .equals(other.getAvailableItemListList())) return false;
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
      hash = (37 * hash) + TRADER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTraderId();
      if (getAvailableItemListCount() > 0) {
        hash = (37 * hash) + AVAILABLE_ITEM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAvailableItemListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo prototype) {
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
     * Protobuf type {@code VintageMarketTraderInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:VintageMarketTraderInfo)
        emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.internal_static_VintageMarketTraderInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.internal_static_VintageMarketTraderInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo.class, emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo.newBuilder()
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
          getAvailableItemListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        traderId_ = 0;

        if (availableItemListBuilder_ == null) {
          availableItemList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          availableItemListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.internal_static_VintageMarketTraderInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo build() {
        emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo buildPartial() {
        emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo result = new emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo(this);
        int from_bitField0_ = bitField0_;
        result.traderId_ = traderId_;
        if (availableItemListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            availableItemList_ = java.util.Collections.unmodifiableList(availableItemList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.availableItemList_ = availableItemList_;
        } else {
          result.availableItemList_ = availableItemListBuilder_.build();
        }
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
        if (other instanceof emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo) {
          return mergeFrom((emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo other) {
        if (other == emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo.getDefaultInstance()) return this;
        if (other.getTraderId() != 0) {
          setTraderId(other.getTraderId());
        }
        if (availableItemListBuilder_ == null) {
          if (!other.availableItemList_.isEmpty()) {
            if (availableItemList_.isEmpty()) {
              availableItemList_ = other.availableItemList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureAvailableItemListIsMutable();
              availableItemList_.addAll(other.availableItemList_);
            }
            onChanged();
          }
        } else {
          if (!other.availableItemList_.isEmpty()) {
            if (availableItemListBuilder_.isEmpty()) {
              availableItemListBuilder_.dispose();
              availableItemListBuilder_ = null;
              availableItemList_ = other.availableItemList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              availableItemListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getAvailableItemListFieldBuilder() : null;
            } else {
              availableItemListBuilder_.addAllMessages(other.availableItemList_);
            }
          }
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
        emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int traderId_ ;
      /**
       * <code>uint32 trader_id = 4;</code>
       * @return The traderId.
       */
      @java.lang.Override
      public int getTraderId() {
        return traderId_;
      }
      /**
       * <code>uint32 trader_id = 4;</code>
       * @param value The traderId to set.
       * @return This builder for chaining.
       */
      public Builder setTraderId(int value) {
        
        traderId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 trader_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearTraderId() {
        
        traderId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.gingerps.net.proto.ItemParamOuterClass.ItemParam> availableItemList_ =
        java.util.Collections.emptyList();
      private void ensureAvailableItemListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          availableItemList_ = new java.util.ArrayList<emu.gingerps.net.proto.ItemParamOuterClass.ItemParam>(availableItemList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.ItemParamOuterClass.ItemParam, emu.gingerps.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.gingerps.net.proto.ItemParamOuterClass.ItemParamOrBuilder> availableItemListBuilder_;

      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public java.util.List<emu.gingerps.net.proto.ItemParamOuterClass.ItemParam> getAvailableItemListList() {
        if (availableItemListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(availableItemList_);
        } else {
          return availableItemListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public int getAvailableItemListCount() {
        if (availableItemListBuilder_ == null) {
          return availableItemList_.size();
        } else {
          return availableItemListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public emu.gingerps.net.proto.ItemParamOuterClass.ItemParam getAvailableItemList(int index) {
        if (availableItemListBuilder_ == null) {
          return availableItemList_.get(index);
        } else {
          return availableItemListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public Builder setAvailableItemList(
          int index, emu.gingerps.net.proto.ItemParamOuterClass.ItemParam value) {
        if (availableItemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAvailableItemListIsMutable();
          availableItemList_.set(index, value);
          onChanged();
        } else {
          availableItemListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public Builder setAvailableItemList(
          int index, emu.gingerps.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (availableItemListBuilder_ == null) {
          ensureAvailableItemListIsMutable();
          availableItemList_.set(index, builderForValue.build());
          onChanged();
        } else {
          availableItemListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public Builder addAvailableItemList(emu.gingerps.net.proto.ItemParamOuterClass.ItemParam value) {
        if (availableItemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAvailableItemListIsMutable();
          availableItemList_.add(value);
          onChanged();
        } else {
          availableItemListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public Builder addAvailableItemList(
          int index, emu.gingerps.net.proto.ItemParamOuterClass.ItemParam value) {
        if (availableItemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAvailableItemListIsMutable();
          availableItemList_.add(index, value);
          onChanged();
        } else {
          availableItemListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public Builder addAvailableItemList(
          emu.gingerps.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (availableItemListBuilder_ == null) {
          ensureAvailableItemListIsMutable();
          availableItemList_.add(builderForValue.build());
          onChanged();
        } else {
          availableItemListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public Builder addAvailableItemList(
          int index, emu.gingerps.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (availableItemListBuilder_ == null) {
          ensureAvailableItemListIsMutable();
          availableItemList_.add(index, builderForValue.build());
          onChanged();
        } else {
          availableItemListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public Builder addAllAvailableItemList(
          java.lang.Iterable<? extends emu.gingerps.net.proto.ItemParamOuterClass.ItemParam> values) {
        if (availableItemListBuilder_ == null) {
          ensureAvailableItemListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, availableItemList_);
          onChanged();
        } else {
          availableItemListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public Builder clearAvailableItemList() {
        if (availableItemListBuilder_ == null) {
          availableItemList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          availableItemListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public Builder removeAvailableItemList(int index) {
        if (availableItemListBuilder_ == null) {
          ensureAvailableItemListIsMutable();
          availableItemList_.remove(index);
          onChanged();
        } else {
          availableItemListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public emu.gingerps.net.proto.ItemParamOuterClass.ItemParam.Builder getAvailableItemListBuilder(
          int index) {
        return getAvailableItemListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public emu.gingerps.net.proto.ItemParamOuterClass.ItemParamOrBuilder getAvailableItemListOrBuilder(
          int index) {
        if (availableItemListBuilder_ == null) {
          return availableItemList_.get(index);  } else {
          return availableItemListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public java.util.List<? extends emu.gingerps.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
           getAvailableItemListOrBuilderList() {
        if (availableItemListBuilder_ != null) {
          return availableItemListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(availableItemList_);
        }
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public emu.gingerps.net.proto.ItemParamOuterClass.ItemParam.Builder addAvailableItemListBuilder() {
        return getAvailableItemListFieldBuilder().addBuilder(
            emu.gingerps.net.proto.ItemParamOuterClass.ItemParam.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public emu.gingerps.net.proto.ItemParamOuterClass.ItemParam.Builder addAvailableItemListBuilder(
          int index) {
        return getAvailableItemListFieldBuilder().addBuilder(
            index, emu.gingerps.net.proto.ItemParamOuterClass.ItemParam.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemParam available_item_list = 15;</code>
       */
      public java.util.List<emu.gingerps.net.proto.ItemParamOuterClass.ItemParam.Builder> 
           getAvailableItemListBuilderList() {
        return getAvailableItemListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.ItemParamOuterClass.ItemParam, emu.gingerps.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.gingerps.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
          getAvailableItemListFieldBuilder() {
        if (availableItemListBuilder_ == null) {
          availableItemListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.gingerps.net.proto.ItemParamOuterClass.ItemParam, emu.gingerps.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.gingerps.net.proto.ItemParamOuterClass.ItemParamOrBuilder>(
                  availableItemList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          availableItemList_ = null;
        }
        return availableItemListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:VintageMarketTraderInfo)
    }

    // @@protoc_insertion_point(class_scope:VintageMarketTraderInfo)
    private static final emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo();
    }

    public static emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VintageMarketTraderInfo>
        PARSER = new com.google.protobuf.AbstractParser<VintageMarketTraderInfo>() {
      @java.lang.Override
      public VintageMarketTraderInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new VintageMarketTraderInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<VintageMarketTraderInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VintageMarketTraderInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.VintageMarketTraderInfoOuterClass.VintageMarketTraderInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VintageMarketTraderInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VintageMarketTraderInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035VintageMarketTraderInfo.proto\032\017ItemPar" +
      "am.proto\"U\n\027VintageMarketTraderInfo\022\021\n\tt" +
      "rader_id\030\004 \001(\r\022\'\n\023available_item_list\030\017 " +
      "\003(\0132\n.ItemParamB\030\n\026emu.gingerps.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.ItemParamOuterClass.getDescriptor(),
        });
    internal_static_VintageMarketTraderInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VintageMarketTraderInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VintageMarketTraderInfo_descriptor,
        new java.lang.String[] { "TraderId", "AvailableItemList", });
    emu.gingerps.net.proto.ItemParamOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
