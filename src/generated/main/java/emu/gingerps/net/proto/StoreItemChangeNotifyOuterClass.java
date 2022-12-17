// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StoreItemChangeNotify.proto

package emu.gingerps.net.proto;

public final class StoreItemChangeNotifyOuterClass {
  private StoreItemChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StoreItemChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:StoreItemChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.StoreType store_type = 4;</code>
     * @return The enum numeric value on the wire for storeType.
     */
    int getStoreTypeValue();
    /**
     * <code>.StoreType store_type = 4;</code>
     * @return The storeType.
     */
    emu.gingerps.net.proto.StoreTypeOuterClass.StoreType getStoreType();

    /**
     * <code>repeated .Item item_list = 5;</code>
     */
    java.util.List<emu.gingerps.net.proto.ItemOuterClass.Item> 
        getItemListList();
    /**
     * <code>repeated .Item item_list = 5;</code>
     */
    emu.gingerps.net.proto.ItemOuterClass.Item getItemList(int index);
    /**
     * <code>repeated .Item item_list = 5;</code>
     */
    int getItemListCount();
    /**
     * <code>repeated .Item item_list = 5;</code>
     */
    java.util.List<? extends emu.gingerps.net.proto.ItemOuterClass.ItemOrBuilder> 
        getItemListOrBuilderList();
    /**
     * <code>repeated .Item item_list = 5;</code>
     */
    emu.gingerps.net.proto.ItemOuterClass.ItemOrBuilder getItemListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 656;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code StoreItemChangeNotify}
   */
  public static final class StoreItemChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:StoreItemChangeNotify)
      StoreItemChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StoreItemChangeNotify.newBuilder() to construct.
    private StoreItemChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StoreItemChangeNotify() {
      storeType_ = 0;
      itemList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new StoreItemChangeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.internal_static_StoreItemChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.internal_static_StoreItemChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify.class, emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify.Builder.class);
    }

    public static final int STORE_TYPE_FIELD_NUMBER = 4;
    private int storeType_ = 0;
    /**
     * <code>.StoreType store_type = 4;</code>
     * @return The enum numeric value on the wire for storeType.
     */
    @java.lang.Override public int getStoreTypeValue() {
      return storeType_;
    }
    /**
     * <code>.StoreType store_type = 4;</code>
     * @return The storeType.
     */
    @java.lang.Override public emu.gingerps.net.proto.StoreTypeOuterClass.StoreType getStoreType() {
      emu.gingerps.net.proto.StoreTypeOuterClass.StoreType result = emu.gingerps.net.proto.StoreTypeOuterClass.StoreType.forNumber(storeType_);
      return result == null ? emu.gingerps.net.proto.StoreTypeOuterClass.StoreType.UNRECOGNIZED : result;
    }

    public static final int ITEM_LIST_FIELD_NUMBER = 5;
    @SuppressWarnings("serial")
    private java.util.List<emu.gingerps.net.proto.ItemOuterClass.Item> itemList_;
    /**
     * <code>repeated .Item item_list = 5;</code>
     */
    @java.lang.Override
    public java.util.List<emu.gingerps.net.proto.ItemOuterClass.Item> getItemListList() {
      return itemList_;
    }
    /**
     * <code>repeated .Item item_list = 5;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.gingerps.net.proto.ItemOuterClass.ItemOrBuilder> 
        getItemListOrBuilderList() {
      return itemList_;
    }
    /**
     * <code>repeated .Item item_list = 5;</code>
     */
    @java.lang.Override
    public int getItemListCount() {
      return itemList_.size();
    }
    /**
     * <code>repeated .Item item_list = 5;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.ItemOuterClass.Item getItemList(int index) {
      return itemList_.get(index);
    }
    /**
     * <code>repeated .Item item_list = 5;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.ItemOuterClass.ItemOrBuilder getItemListOrBuilder(
        int index) {
      return itemList_.get(index);
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
      if (storeType_ != emu.gingerps.net.proto.StoreTypeOuterClass.StoreType.STORE_TYPE_NONE.getNumber()) {
        output.writeEnum(4, storeType_);
      }
      for (int i = 0; i < itemList_.size(); i++) {
        output.writeMessage(5, itemList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (storeType_ != emu.gingerps.net.proto.StoreTypeOuterClass.StoreType.STORE_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, storeType_);
      }
      for (int i = 0; i < itemList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, itemList_.get(i));
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
      if (!(obj instanceof emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify other = (emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify) obj;

      if (storeType_ != other.storeType_) return false;
      if (!getItemListList()
          .equals(other.getItemListList())) return false;
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
      hash = (37 * hash) + STORE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + storeType_;
      if (getItemListCount() > 0) {
        hash = (37 * hash) + ITEM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getItemListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify prototype) {
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
     *   CMD_ID = 656;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code StoreItemChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:StoreItemChangeNotify)
        emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.internal_static_StoreItemChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.internal_static_StoreItemChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify.class, emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify.newBuilder()
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
        storeType_ = 0;
        if (itemListBuilder_ == null) {
          itemList_ = java.util.Collections.emptyList();
        } else {
          itemList_ = null;
          itemListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.internal_static_StoreItemChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify build() {
        emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify buildPartial() {
        emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify result = new emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify result) {
        if (itemListBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            itemList_ = java.util.Collections.unmodifiableList(itemList_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.itemList_ = itemList_;
        } else {
          result.itemList_ = itemListBuilder_.build();
        }
      }

      private void buildPartial0(emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.storeType_ = storeType_;
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
        if (other instanceof emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify) {
          return mergeFrom((emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify other) {
        if (other == emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify.getDefaultInstance()) return this;
        if (other.storeType_ != 0) {
          setStoreTypeValue(other.getStoreTypeValue());
        }
        if (itemListBuilder_ == null) {
          if (!other.itemList_.isEmpty()) {
            if (itemList_.isEmpty()) {
              itemList_ = other.itemList_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureItemListIsMutable();
              itemList_.addAll(other.itemList_);
            }
            onChanged();
          }
        } else {
          if (!other.itemList_.isEmpty()) {
            if (itemListBuilder_.isEmpty()) {
              itemListBuilder_.dispose();
              itemListBuilder_ = null;
              itemList_ = other.itemList_;
              bitField0_ = (bitField0_ & ~0x00000002);
              itemListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getItemListFieldBuilder() : null;
            } else {
              itemListBuilder_.addAllMessages(other.itemList_);
            }
          }
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
                storeType_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 32
              case 42: {
                emu.gingerps.net.proto.ItemOuterClass.Item m =
                    input.readMessage(
                        emu.gingerps.net.proto.ItemOuterClass.Item.parser(),
                        extensionRegistry);
                if (itemListBuilder_ == null) {
                  ensureItemListIsMutable();
                  itemList_.add(m);
                } else {
                  itemListBuilder_.addMessage(m);
                }
                break;
              } // case 42
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

      private int storeType_ = 0;
      /**
       * <code>.StoreType store_type = 4;</code>
       * @return The enum numeric value on the wire for storeType.
       */
      @java.lang.Override public int getStoreTypeValue() {
        return storeType_;
      }
      /**
       * <code>.StoreType store_type = 4;</code>
       * @param value The enum numeric value on the wire for storeType to set.
       * @return This builder for chaining.
       */
      public Builder setStoreTypeValue(int value) {
        storeType_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.StoreType store_type = 4;</code>
       * @return The storeType.
       */
      @java.lang.Override
      public emu.gingerps.net.proto.StoreTypeOuterClass.StoreType getStoreType() {
        emu.gingerps.net.proto.StoreTypeOuterClass.StoreType result = emu.gingerps.net.proto.StoreTypeOuterClass.StoreType.forNumber(storeType_);
        return result == null ? emu.gingerps.net.proto.StoreTypeOuterClass.StoreType.UNRECOGNIZED : result;
      }
      /**
       * <code>.StoreType store_type = 4;</code>
       * @param value The storeType to set.
       * @return This builder for chaining.
       */
      public Builder setStoreType(emu.gingerps.net.proto.StoreTypeOuterClass.StoreType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        storeType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.StoreType store_type = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearStoreType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        storeType_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.gingerps.net.proto.ItemOuterClass.Item> itemList_ =
        java.util.Collections.emptyList();
      private void ensureItemListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          itemList_ = new java.util.ArrayList<emu.gingerps.net.proto.ItemOuterClass.Item>(itemList_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.ItemOuterClass.Item, emu.gingerps.net.proto.ItemOuterClass.Item.Builder, emu.gingerps.net.proto.ItemOuterClass.ItemOrBuilder> itemListBuilder_;

      /**
       * <code>repeated .Item item_list = 5;</code>
       */
      public java.util.List<emu.gingerps.net.proto.ItemOuterClass.Item> getItemListList() {
        if (itemListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(itemList_);
        } else {
          return itemListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Item item_list = 5;</code>
       */
      public int getItemListCount() {
        if (itemListBuilder_ == null) {
          return itemList_.size();
        } else {
          return itemListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Item item_list = 5;</code>
       */
      public emu.gingerps.net.proto.ItemOuterClass.Item getItemList(int index) {
        if (itemListBuilder_ == null) {
          return itemList_.get(index);
        } else {
          return itemListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Item item_list = 5;</code>
       */
      public Builder setItemList(
          int index, emu.gingerps.net.proto.ItemOuterClass.Item value) {
        if (itemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemListIsMutable();
          itemList_.set(index, value);
          onChanged();
        } else {
          itemListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Item item_list = 5;</code>
       */
      public Builder setItemList(
          int index, emu.gingerps.net.proto.ItemOuterClass.Item.Builder builderForValue) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          itemList_.set(index, builderForValue.build());
          onChanged();
        } else {
          itemListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Item item_list = 5;</code>
       */
      public Builder addItemList(emu.gingerps.net.proto.ItemOuterClass.Item value) {
        if (itemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemListIsMutable();
          itemList_.add(value);
          onChanged();
        } else {
          itemListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Item item_list = 5;</code>
       */
      public Builder addItemList(
          int index, emu.gingerps.net.proto.ItemOuterClass.Item value) {
        if (itemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemListIsMutable();
          itemList_.add(index, value);
          onChanged();
        } else {
          itemListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Item item_list = 5;</code>
       */
      public Builder addItemList(
          emu.gingerps.net.proto.ItemOuterClass.Item.Builder builderForValue) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          itemList_.add(builderForValue.build());
          onChanged();
        } else {
          itemListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Item item_list = 5;</code>
       */
      public Builder addItemList(
          int index, emu.gingerps.net.proto.ItemOuterClass.Item.Builder builderForValue) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          itemList_.add(index, builderForValue.build());
          onChanged();
        } else {
          itemListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Item item_list = 5;</code>
       */
      public Builder addAllItemList(
          java.lang.Iterable<? extends emu.gingerps.net.proto.ItemOuterClass.Item> values) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, itemList_);
          onChanged();
        } else {
          itemListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Item item_list = 5;</code>
       */
      public Builder clearItemList() {
        if (itemListBuilder_ == null) {
          itemList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          itemListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Item item_list = 5;</code>
       */
      public Builder removeItemList(int index) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          itemList_.remove(index);
          onChanged();
        } else {
          itemListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Item item_list = 5;</code>
       */
      public emu.gingerps.net.proto.ItemOuterClass.Item.Builder getItemListBuilder(
          int index) {
        return getItemListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Item item_list = 5;</code>
       */
      public emu.gingerps.net.proto.ItemOuterClass.ItemOrBuilder getItemListOrBuilder(
          int index) {
        if (itemListBuilder_ == null) {
          return itemList_.get(index);  } else {
          return itemListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Item item_list = 5;</code>
       */
      public java.util.List<? extends emu.gingerps.net.proto.ItemOuterClass.ItemOrBuilder> 
           getItemListOrBuilderList() {
        if (itemListBuilder_ != null) {
          return itemListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(itemList_);
        }
      }
      /**
       * <code>repeated .Item item_list = 5;</code>
       */
      public emu.gingerps.net.proto.ItemOuterClass.Item.Builder addItemListBuilder() {
        return getItemListFieldBuilder().addBuilder(
            emu.gingerps.net.proto.ItemOuterClass.Item.getDefaultInstance());
      }
      /**
       * <code>repeated .Item item_list = 5;</code>
       */
      public emu.gingerps.net.proto.ItemOuterClass.Item.Builder addItemListBuilder(
          int index) {
        return getItemListFieldBuilder().addBuilder(
            index, emu.gingerps.net.proto.ItemOuterClass.Item.getDefaultInstance());
      }
      /**
       * <code>repeated .Item item_list = 5;</code>
       */
      public java.util.List<emu.gingerps.net.proto.ItemOuterClass.Item.Builder> 
           getItemListBuilderList() {
        return getItemListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.ItemOuterClass.Item, emu.gingerps.net.proto.ItemOuterClass.Item.Builder, emu.gingerps.net.proto.ItemOuterClass.ItemOrBuilder> 
          getItemListFieldBuilder() {
        if (itemListBuilder_ == null) {
          itemListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.gingerps.net.proto.ItemOuterClass.Item, emu.gingerps.net.proto.ItemOuterClass.Item.Builder, emu.gingerps.net.proto.ItemOuterClass.ItemOrBuilder>(
                  itemList_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          itemList_ = null;
        }
        return itemListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:StoreItemChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:StoreItemChangeNotify)
    private static final emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify();
    }

    public static emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StoreItemChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<StoreItemChangeNotify>() {
      @java.lang.Override
      public StoreItemChangeNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<StoreItemChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StoreItemChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.StoreItemChangeNotifyOuterClass.StoreItemChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StoreItemChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StoreItemChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033StoreItemChangeNotify.proto\032\nItem.prot" +
      "o\032\017StoreType.proto\"Q\n\025StoreItemChangeNot" +
      "ify\022\036\n\nstore_type\030\004 \001(\0162\n.StoreType\022\030\n\ti" +
      "tem_list\030\005 \003(\0132\005.ItemB\030\n\026emu.gingerps.ne" +
      "t.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.ItemOuterClass.getDescriptor(),
          emu.gingerps.net.proto.StoreTypeOuterClass.getDescriptor(),
        });
    internal_static_StoreItemChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_StoreItemChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StoreItemChangeNotify_descriptor,
        new java.lang.String[] { "StoreType", "ItemList", });
    emu.gingerps.net.proto.ItemOuterClass.getDescriptor();
    emu.gingerps.net.proto.StoreTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
