// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ResinCardDataUpdateNotify.proto

package emu.gingerps.net.proto;

public final class ResinCardDataUpdateNotifyOuterClass {
  private ResinCardDataUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ResinCardDataUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ResinCardDataUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 today_start_time = 4;</code>
     * @return The todayStartTime.
     */
    int getTodayStartTime();

    /**
     * <code>repeated .ResinCardData card_data_list = 14;</code>
     */
    java.util.List<emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardData> 
        getCardDataListList();
    /**
     * <code>repeated .ResinCardData card_data_list = 14;</code>
     */
    emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardData getCardDataList(int index);
    /**
     * <code>repeated .ResinCardData card_data_list = 14;</code>
     */
    int getCardDataListCount();
    /**
     * <code>repeated .ResinCardData card_data_list = 14;</code>
     */
    java.util.List<? extends emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardDataOrBuilder> 
        getCardDataListOrBuilderList();
    /**
     * <code>repeated .ResinCardData card_data_list = 14;</code>
     */
    emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardDataOrBuilder getCardDataListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4134;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ResinCardDataUpdateNotify}
   */
  public static final class ResinCardDataUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ResinCardDataUpdateNotify)
      ResinCardDataUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ResinCardDataUpdateNotify.newBuilder() to construct.
    private ResinCardDataUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ResinCardDataUpdateNotify() {
      cardDataList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ResinCardDataUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.internal_static_ResinCardDataUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.internal_static_ResinCardDataUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify.class, emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify.Builder.class);
    }

    public static final int TODAY_START_TIME_FIELD_NUMBER = 4;
    private int todayStartTime_ = 0;
    /**
     * <code>uint32 today_start_time = 4;</code>
     * @return The todayStartTime.
     */
    @java.lang.Override
    public int getTodayStartTime() {
      return todayStartTime_;
    }

    public static final int CARD_DATA_LIST_FIELD_NUMBER = 14;
    @SuppressWarnings("serial")
    private java.util.List<emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardData> cardDataList_;
    /**
     * <code>repeated .ResinCardData card_data_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardData> getCardDataListList() {
      return cardDataList_;
    }
    /**
     * <code>repeated .ResinCardData card_data_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardDataOrBuilder> 
        getCardDataListOrBuilderList() {
      return cardDataList_;
    }
    /**
     * <code>repeated .ResinCardData card_data_list = 14;</code>
     */
    @java.lang.Override
    public int getCardDataListCount() {
      return cardDataList_.size();
    }
    /**
     * <code>repeated .ResinCardData card_data_list = 14;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardData getCardDataList(int index) {
      return cardDataList_.get(index);
    }
    /**
     * <code>repeated .ResinCardData card_data_list = 14;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardDataOrBuilder getCardDataListOrBuilder(
        int index) {
      return cardDataList_.get(index);
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
      if (todayStartTime_ != 0) {
        output.writeUInt32(4, todayStartTime_);
      }
      for (int i = 0; i < cardDataList_.size(); i++) {
        output.writeMessage(14, cardDataList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (todayStartTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, todayStartTime_);
      }
      for (int i = 0; i < cardDataList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, cardDataList_.get(i));
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
      if (!(obj instanceof emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify other = (emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify) obj;

      if (getTodayStartTime()
          != other.getTodayStartTime()) return false;
      if (!getCardDataListList()
          .equals(other.getCardDataListList())) return false;
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
      hash = (37 * hash) + TODAY_START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getTodayStartTime();
      if (getCardDataListCount() > 0) {
        hash = (37 * hash) + CARD_DATA_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getCardDataListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify prototype) {
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
     *   CMD_ID = 4134;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ResinCardDataUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ResinCardDataUpdateNotify)
        emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.internal_static_ResinCardDataUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.internal_static_ResinCardDataUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify.class, emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify.newBuilder()
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
        todayStartTime_ = 0;
        if (cardDataListBuilder_ == null) {
          cardDataList_ = java.util.Collections.emptyList();
        } else {
          cardDataList_ = null;
          cardDataListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.internal_static_ResinCardDataUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify build() {
        emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify buildPartial() {
        emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify result = new emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify result) {
        if (cardDataListBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            cardDataList_ = java.util.Collections.unmodifiableList(cardDataList_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.cardDataList_ = cardDataList_;
        } else {
          result.cardDataList_ = cardDataListBuilder_.build();
        }
      }

      private void buildPartial0(emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.todayStartTime_ = todayStartTime_;
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
        if (other instanceof emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify) {
          return mergeFrom((emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify other) {
        if (other == emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify.getDefaultInstance()) return this;
        if (other.getTodayStartTime() != 0) {
          setTodayStartTime(other.getTodayStartTime());
        }
        if (cardDataListBuilder_ == null) {
          if (!other.cardDataList_.isEmpty()) {
            if (cardDataList_.isEmpty()) {
              cardDataList_ = other.cardDataList_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureCardDataListIsMutable();
              cardDataList_.addAll(other.cardDataList_);
            }
            onChanged();
          }
        } else {
          if (!other.cardDataList_.isEmpty()) {
            if (cardDataListBuilder_.isEmpty()) {
              cardDataListBuilder_.dispose();
              cardDataListBuilder_ = null;
              cardDataList_ = other.cardDataList_;
              bitField0_ = (bitField0_ & ~0x00000002);
              cardDataListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getCardDataListFieldBuilder() : null;
            } else {
              cardDataListBuilder_.addAllMessages(other.cardDataList_);
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
                todayStartTime_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 32
              case 114: {
                emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardData m =
                    input.readMessage(
                        emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardData.parser(),
                        extensionRegistry);
                if (cardDataListBuilder_ == null) {
                  ensureCardDataListIsMutable();
                  cardDataList_.add(m);
                } else {
                  cardDataListBuilder_.addMessage(m);
                }
                break;
              } // case 114
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

      private int todayStartTime_ ;
      /**
       * <code>uint32 today_start_time = 4;</code>
       * @return The todayStartTime.
       */
      @java.lang.Override
      public int getTodayStartTime() {
        return todayStartTime_;
      }
      /**
       * <code>uint32 today_start_time = 4;</code>
       * @param value The todayStartTime to set.
       * @return This builder for chaining.
       */
      public Builder setTodayStartTime(int value) {
        
        todayStartTime_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 today_start_time = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearTodayStartTime() {
        bitField0_ = (bitField0_ & ~0x00000001);
        todayStartTime_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardData> cardDataList_ =
        java.util.Collections.emptyList();
      private void ensureCardDataListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          cardDataList_ = new java.util.ArrayList<emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardData>(cardDataList_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardData, emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardData.Builder, emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardDataOrBuilder> cardDataListBuilder_;

      /**
       * <code>repeated .ResinCardData card_data_list = 14;</code>
       */
      public java.util.List<emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardData> getCardDataListList() {
        if (cardDataListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(cardDataList_);
        } else {
          return cardDataListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 14;</code>
       */
      public int getCardDataListCount() {
        if (cardDataListBuilder_ == null) {
          return cardDataList_.size();
        } else {
          return cardDataListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 14;</code>
       */
      public emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardData getCardDataList(int index) {
        if (cardDataListBuilder_ == null) {
          return cardDataList_.get(index);
        } else {
          return cardDataListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 14;</code>
       */
      public Builder setCardDataList(
          int index, emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardData value) {
        if (cardDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCardDataListIsMutable();
          cardDataList_.set(index, value);
          onChanged();
        } else {
          cardDataListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 14;</code>
       */
      public Builder setCardDataList(
          int index, emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardData.Builder builderForValue) {
        if (cardDataListBuilder_ == null) {
          ensureCardDataListIsMutable();
          cardDataList_.set(index, builderForValue.build());
          onChanged();
        } else {
          cardDataListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 14;</code>
       */
      public Builder addCardDataList(emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardData value) {
        if (cardDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCardDataListIsMutable();
          cardDataList_.add(value);
          onChanged();
        } else {
          cardDataListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 14;</code>
       */
      public Builder addCardDataList(
          int index, emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardData value) {
        if (cardDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCardDataListIsMutable();
          cardDataList_.add(index, value);
          onChanged();
        } else {
          cardDataListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 14;</code>
       */
      public Builder addCardDataList(
          emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardData.Builder builderForValue) {
        if (cardDataListBuilder_ == null) {
          ensureCardDataListIsMutable();
          cardDataList_.add(builderForValue.build());
          onChanged();
        } else {
          cardDataListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 14;</code>
       */
      public Builder addCardDataList(
          int index, emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardData.Builder builderForValue) {
        if (cardDataListBuilder_ == null) {
          ensureCardDataListIsMutable();
          cardDataList_.add(index, builderForValue.build());
          onChanged();
        } else {
          cardDataListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 14;</code>
       */
      public Builder addAllCardDataList(
          java.lang.Iterable<? extends emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardData> values) {
        if (cardDataListBuilder_ == null) {
          ensureCardDataListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, cardDataList_);
          onChanged();
        } else {
          cardDataListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 14;</code>
       */
      public Builder clearCardDataList() {
        if (cardDataListBuilder_ == null) {
          cardDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          cardDataListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 14;</code>
       */
      public Builder removeCardDataList(int index) {
        if (cardDataListBuilder_ == null) {
          ensureCardDataListIsMutable();
          cardDataList_.remove(index);
          onChanged();
        } else {
          cardDataListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 14;</code>
       */
      public emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardData.Builder getCardDataListBuilder(
          int index) {
        return getCardDataListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 14;</code>
       */
      public emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardDataOrBuilder getCardDataListOrBuilder(
          int index) {
        if (cardDataListBuilder_ == null) {
          return cardDataList_.get(index);  } else {
          return cardDataListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 14;</code>
       */
      public java.util.List<? extends emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardDataOrBuilder> 
           getCardDataListOrBuilderList() {
        if (cardDataListBuilder_ != null) {
          return cardDataListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(cardDataList_);
        }
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 14;</code>
       */
      public emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardData.Builder addCardDataListBuilder() {
        return getCardDataListFieldBuilder().addBuilder(
            emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardData.getDefaultInstance());
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 14;</code>
       */
      public emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardData.Builder addCardDataListBuilder(
          int index) {
        return getCardDataListFieldBuilder().addBuilder(
            index, emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardData.getDefaultInstance());
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 14;</code>
       */
      public java.util.List<emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardData.Builder> 
           getCardDataListBuilderList() {
        return getCardDataListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardData, emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardData.Builder, emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardDataOrBuilder> 
          getCardDataListFieldBuilder() {
        if (cardDataListBuilder_ == null) {
          cardDataListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardData, emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardData.Builder, emu.gingerps.net.proto.ResinCardDataOuterClass.ResinCardDataOrBuilder>(
                  cardDataList_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          cardDataList_ = null;
        }
        return cardDataListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:ResinCardDataUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:ResinCardDataUpdateNotify)
    private static final emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify();
    }

    public static emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ResinCardDataUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<ResinCardDataUpdateNotify>() {
      @java.lang.Override
      public ResinCardDataUpdateNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<ResinCardDataUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ResinCardDataUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResinCardDataUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResinCardDataUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037ResinCardDataUpdateNotify.proto\032\023Resin" +
      "CardData.proto\"]\n\031ResinCardDataUpdateNot" +
      "ify\022\030\n\020today_start_time\030\004 \001(\r\022&\n\016card_da" +
      "ta_list\030\016 \003(\0132\016.ResinCardDataB\030\n\026emu.gin" +
      "gerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.ResinCardDataOuterClass.getDescriptor(),
        });
    internal_static_ResinCardDataUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ResinCardDataUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResinCardDataUpdateNotify_descriptor,
        new java.lang.String[] { "TodayStartTime", "CardDataList", });
    emu.gingerps.net.proto.ResinCardDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
