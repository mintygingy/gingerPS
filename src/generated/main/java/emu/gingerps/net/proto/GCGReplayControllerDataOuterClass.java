// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGReplayControllerData.proto

package emu.gingerps.net.proto;

public final class GCGReplayControllerDataOuterClass {
  private GCGReplayControllerDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGReplayControllerDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGReplayControllerData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 card_id_list = 12;</code>
     * @return A list containing the cardIdList.
     */
    java.util.List<java.lang.Integer> getCardIdListList();
    /**
     * <code>repeated uint32 card_id_list = 12;</code>
     * @return The count of cardIdList.
     */
    int getCardIdListCount();
    /**
     * <code>repeated uint32 card_id_list = 12;</code>
     * @param index The index of the element to return.
     * @return The cardIdList at the given index.
     */
    int getCardIdList(int index);

    /**
     * <code>uint32 controller_id = 6;</code>
     * @return The controllerId.
     */
    int getControllerId();
  }
  /**
   * Protobuf type {@code GCGReplayControllerData}
   */
  public static final class GCGReplayControllerData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGReplayControllerData)
      GCGReplayControllerDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGReplayControllerData.newBuilder() to construct.
    private GCGReplayControllerData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGReplayControllerData() {
      cardIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGReplayControllerData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.internal_static_GCGReplayControllerData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.internal_static_GCGReplayControllerData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData.class, emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData.Builder.class);
    }

    public static final int CARD_ID_LIST_FIELD_NUMBER = 12;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList cardIdList_;
    /**
     * <code>repeated uint32 card_id_list = 12;</code>
     * @return A list containing the cardIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getCardIdListList() {
      return cardIdList_;
    }
    /**
     * <code>repeated uint32 card_id_list = 12;</code>
     * @return The count of cardIdList.
     */
    public int getCardIdListCount() {
      return cardIdList_.size();
    }
    /**
     * <code>repeated uint32 card_id_list = 12;</code>
     * @param index The index of the element to return.
     * @return The cardIdList at the given index.
     */
    public int getCardIdList(int index) {
      return cardIdList_.getInt(index);
    }
    private int cardIdListMemoizedSerializedSize = -1;

    public static final int CONTROLLER_ID_FIELD_NUMBER = 6;
    private int controllerId_ = 0;
    /**
     * <code>uint32 controller_id = 6;</code>
     * @return The controllerId.
     */
    @java.lang.Override
    public int getControllerId() {
      return controllerId_;
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
      getSerializedSize();
      if (controllerId_ != 0) {
        output.writeUInt32(6, controllerId_);
      }
      if (getCardIdListList().size() > 0) {
        output.writeUInt32NoTag(98);
        output.writeUInt32NoTag(cardIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < cardIdList_.size(); i++) {
        output.writeUInt32NoTag(cardIdList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (controllerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, controllerId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < cardIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(cardIdList_.getInt(i));
        }
        size += dataSize;
        if (!getCardIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        cardIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData other = (emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData) obj;

      if (!getCardIdListList()
          .equals(other.getCardIdListList())) return false;
      if (getControllerId()
          != other.getControllerId()) return false;
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
      if (getCardIdListCount() > 0) {
        hash = (37 * hash) + CARD_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getCardIdListList().hashCode();
      }
      hash = (37 * hash) + CONTROLLER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getControllerId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData prototype) {
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
     * Protobuf type {@code GCGReplayControllerData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGReplayControllerData)
        emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.internal_static_GCGReplayControllerData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.internal_static_GCGReplayControllerData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData.class, emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData.newBuilder()
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
        cardIdList_ = emptyIntList();
        controllerId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.internal_static_GCGReplayControllerData_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData getDefaultInstanceForType() {
        return emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData build() {
        emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData buildPartial() {
        emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData result = new emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData result) {
        if (((bitField0_ & 0x00000001) != 0)) {
          cardIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cardIdList_ = cardIdList_;
      }

      private void buildPartial0(emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.controllerId_ = controllerId_;
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
        if (other instanceof emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData) {
          return mergeFrom((emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData other) {
        if (other == emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData.getDefaultInstance()) return this;
        if (!other.cardIdList_.isEmpty()) {
          if (cardIdList_.isEmpty()) {
            cardIdList_ = other.cardIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCardIdListIsMutable();
            cardIdList_.addAll(other.cardIdList_);
          }
          onChanged();
        }
        if (other.getControllerId() != 0) {
          setControllerId(other.getControllerId());
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
              case 48: {
                controllerId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 48
              case 96: {
                int v = input.readUInt32();
                ensureCardIdListIsMutable();
                cardIdList_.addInt(v);
                break;
              } // case 96
              case 98: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureCardIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  cardIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 98
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

      private com.google.protobuf.Internal.IntList cardIdList_ = emptyIntList();
      private void ensureCardIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          cardIdList_ = mutableCopy(cardIdList_);
          bitField0_ |= 0x00000001;
        }
      }
      /**
       * <code>repeated uint32 card_id_list = 12;</code>
       * @return A list containing the cardIdList.
       */
      public java.util.List<java.lang.Integer>
          getCardIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(cardIdList_) : cardIdList_;
      }
      /**
       * <code>repeated uint32 card_id_list = 12;</code>
       * @return The count of cardIdList.
       */
      public int getCardIdListCount() {
        return cardIdList_.size();
      }
      /**
       * <code>repeated uint32 card_id_list = 12;</code>
       * @param index The index of the element to return.
       * @return The cardIdList at the given index.
       */
      public int getCardIdList(int index) {
        return cardIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 card_id_list = 12;</code>
       * @param index The index to set the value at.
       * @param value The cardIdList to set.
       * @return This builder for chaining.
       */
      public Builder setCardIdList(
          int index, int value) {
        
        ensureCardIdListIsMutable();
        cardIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 card_id_list = 12;</code>
       * @param value The cardIdList to add.
       * @return This builder for chaining.
       */
      public Builder addCardIdList(int value) {
        
        ensureCardIdListIsMutable();
        cardIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 card_id_list = 12;</code>
       * @param values The cardIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllCardIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureCardIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, cardIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 card_id_list = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardIdList() {
        cardIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int controllerId_ ;
      /**
       * <code>uint32 controller_id = 6;</code>
       * @return The controllerId.
       */
      @java.lang.Override
      public int getControllerId() {
        return controllerId_;
      }
      /**
       * <code>uint32 controller_id = 6;</code>
       * @param value The controllerId to set.
       * @return This builder for chaining.
       */
      public Builder setControllerId(int value) {
        
        controllerId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 controller_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearControllerId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        controllerId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGReplayControllerData)
    }

    // @@protoc_insertion_point(class_scope:GCGReplayControllerData)
    private static final emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData();
    }

    public static emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGReplayControllerData>
        PARSER = new com.google.protobuf.AbstractParser<GCGReplayControllerData>() {
      @java.lang.Override
      public GCGReplayControllerData parsePartialFrom(
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

    public static com.google.protobuf.Parser<GCGReplayControllerData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGReplayControllerData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.GCGReplayControllerDataOuterClass.GCGReplayControllerData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGReplayControllerData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGReplayControllerData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035GCGReplayControllerData.proto\"F\n\027GCGRe" +
      "playControllerData\022\024\n\014card_id_list\030\014 \003(\r" +
      "\022\025\n\rcontroller_id\030\006 \001(\rB\030\n\026emu.gingerps." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGReplayControllerData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGReplayControllerData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGReplayControllerData_descriptor,
        new java.lang.String[] { "CardIdList", "ControllerId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
