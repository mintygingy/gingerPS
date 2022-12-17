// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerOfferingDataNotify.proto

package emu.gingerps.net.proto;

public final class PlayerOfferingDataNotifyOuterClass {
  private PlayerOfferingDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerOfferingDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerOfferingDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .PlayerOfferingData offering_data_list = 11;</code>
     */
    java.util.List<emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData> 
        getOfferingDataListList();
    /**
     * <code>repeated .PlayerOfferingData offering_data_list = 11;</code>
     */
    emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData getOfferingDataList(int index);
    /**
     * <code>repeated .PlayerOfferingData offering_data_list = 11;</code>
     */
    int getOfferingDataListCount();
    /**
     * <code>repeated .PlayerOfferingData offering_data_list = 11;</code>
     */
    java.util.List<? extends emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder> 
        getOfferingDataListOrBuilderList();
    /**
     * <code>repeated .PlayerOfferingData offering_data_list = 11;</code>
     */
    emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder getOfferingDataListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 2911;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code PlayerOfferingDataNotify}
   */
  public static final class PlayerOfferingDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerOfferingDataNotify)
      PlayerOfferingDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerOfferingDataNotify.newBuilder() to construct.
    private PlayerOfferingDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerOfferingDataNotify() {
      offeringDataList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerOfferingDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerOfferingDataNotify(
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
            case 90: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                offeringDataList_ = new java.util.ArrayList<emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData>();
                mutable_bitField0_ |= 0x00000001;
              }
              offeringDataList_.add(
                  input.readMessage(emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.parser(), extensionRegistry));
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
          offeringDataList_ = java.util.Collections.unmodifiableList(offeringDataList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.internal_static_PlayerOfferingDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.internal_static_PlayerOfferingDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify.class, emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify.Builder.class);
    }

    public static final int OFFERING_DATA_LIST_FIELD_NUMBER = 11;
    private java.util.List<emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData> offeringDataList_;
    /**
     * <code>repeated .PlayerOfferingData offering_data_list = 11;</code>
     */
    @java.lang.Override
    public java.util.List<emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData> getOfferingDataListList() {
      return offeringDataList_;
    }
    /**
     * <code>repeated .PlayerOfferingData offering_data_list = 11;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder> 
        getOfferingDataListOrBuilderList() {
      return offeringDataList_;
    }
    /**
     * <code>repeated .PlayerOfferingData offering_data_list = 11;</code>
     */
    @java.lang.Override
    public int getOfferingDataListCount() {
      return offeringDataList_.size();
    }
    /**
     * <code>repeated .PlayerOfferingData offering_data_list = 11;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData getOfferingDataList(int index) {
      return offeringDataList_.get(index);
    }
    /**
     * <code>repeated .PlayerOfferingData offering_data_list = 11;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder getOfferingDataListOrBuilder(
        int index) {
      return offeringDataList_.get(index);
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
      for (int i = 0; i < offeringDataList_.size(); i++) {
        output.writeMessage(11, offeringDataList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < offeringDataList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, offeringDataList_.get(i));
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
      if (!(obj instanceof emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify other = (emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify) obj;

      if (!getOfferingDataListList()
          .equals(other.getOfferingDataListList())) return false;
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
      if (getOfferingDataListCount() > 0) {
        hash = (37 * hash) + OFFERING_DATA_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getOfferingDataListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify prototype) {
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
     *   CMD_ID = 2911;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code PlayerOfferingDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerOfferingDataNotify)
        emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.internal_static_PlayerOfferingDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.internal_static_PlayerOfferingDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify.class, emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify.newBuilder()
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
          getOfferingDataListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (offeringDataListBuilder_ == null) {
          offeringDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          offeringDataListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.internal_static_PlayerOfferingDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify build() {
        emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify buildPartial() {
        emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify result = new emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify(this);
        int from_bitField0_ = bitField0_;
        if (offeringDataListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            offeringDataList_ = java.util.Collections.unmodifiableList(offeringDataList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.offeringDataList_ = offeringDataList_;
        } else {
          result.offeringDataList_ = offeringDataListBuilder_.build();
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
        if (other instanceof emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify) {
          return mergeFrom((emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify other) {
        if (other == emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify.getDefaultInstance()) return this;
        if (offeringDataListBuilder_ == null) {
          if (!other.offeringDataList_.isEmpty()) {
            if (offeringDataList_.isEmpty()) {
              offeringDataList_ = other.offeringDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureOfferingDataListIsMutable();
              offeringDataList_.addAll(other.offeringDataList_);
            }
            onChanged();
          }
        } else {
          if (!other.offeringDataList_.isEmpty()) {
            if (offeringDataListBuilder_.isEmpty()) {
              offeringDataListBuilder_.dispose();
              offeringDataListBuilder_ = null;
              offeringDataList_ = other.offeringDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              offeringDataListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getOfferingDataListFieldBuilder() : null;
            } else {
              offeringDataListBuilder_.addAllMessages(other.offeringDataList_);
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
        emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData> offeringDataList_ =
        java.util.Collections.emptyList();
      private void ensureOfferingDataListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          offeringDataList_ = new java.util.ArrayList<emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData>(offeringDataList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData, emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder, emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder> offeringDataListBuilder_;

      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 11;</code>
       */
      public java.util.List<emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData> getOfferingDataListList() {
        if (offeringDataListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(offeringDataList_);
        } else {
          return offeringDataListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 11;</code>
       */
      public int getOfferingDataListCount() {
        if (offeringDataListBuilder_ == null) {
          return offeringDataList_.size();
        } else {
          return offeringDataListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 11;</code>
       */
      public emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData getOfferingDataList(int index) {
        if (offeringDataListBuilder_ == null) {
          return offeringDataList_.get(index);
        } else {
          return offeringDataListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 11;</code>
       */
      public Builder setOfferingDataList(
          int index, emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData value) {
        if (offeringDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOfferingDataListIsMutable();
          offeringDataList_.set(index, value);
          onChanged();
        } else {
          offeringDataListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 11;</code>
       */
      public Builder setOfferingDataList(
          int index, emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder builderForValue) {
        if (offeringDataListBuilder_ == null) {
          ensureOfferingDataListIsMutable();
          offeringDataList_.set(index, builderForValue.build());
          onChanged();
        } else {
          offeringDataListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 11;</code>
       */
      public Builder addOfferingDataList(emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData value) {
        if (offeringDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOfferingDataListIsMutable();
          offeringDataList_.add(value);
          onChanged();
        } else {
          offeringDataListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 11;</code>
       */
      public Builder addOfferingDataList(
          int index, emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData value) {
        if (offeringDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOfferingDataListIsMutable();
          offeringDataList_.add(index, value);
          onChanged();
        } else {
          offeringDataListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 11;</code>
       */
      public Builder addOfferingDataList(
          emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder builderForValue) {
        if (offeringDataListBuilder_ == null) {
          ensureOfferingDataListIsMutable();
          offeringDataList_.add(builderForValue.build());
          onChanged();
        } else {
          offeringDataListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 11;</code>
       */
      public Builder addOfferingDataList(
          int index, emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder builderForValue) {
        if (offeringDataListBuilder_ == null) {
          ensureOfferingDataListIsMutable();
          offeringDataList_.add(index, builderForValue.build());
          onChanged();
        } else {
          offeringDataListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 11;</code>
       */
      public Builder addAllOfferingDataList(
          java.lang.Iterable<? extends emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData> values) {
        if (offeringDataListBuilder_ == null) {
          ensureOfferingDataListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, offeringDataList_);
          onChanged();
        } else {
          offeringDataListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 11;</code>
       */
      public Builder clearOfferingDataList() {
        if (offeringDataListBuilder_ == null) {
          offeringDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          offeringDataListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 11;</code>
       */
      public Builder removeOfferingDataList(int index) {
        if (offeringDataListBuilder_ == null) {
          ensureOfferingDataListIsMutable();
          offeringDataList_.remove(index);
          onChanged();
        } else {
          offeringDataListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 11;</code>
       */
      public emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder getOfferingDataListBuilder(
          int index) {
        return getOfferingDataListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 11;</code>
       */
      public emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder getOfferingDataListOrBuilder(
          int index) {
        if (offeringDataListBuilder_ == null) {
          return offeringDataList_.get(index);  } else {
          return offeringDataListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 11;</code>
       */
      public java.util.List<? extends emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder> 
           getOfferingDataListOrBuilderList() {
        if (offeringDataListBuilder_ != null) {
          return offeringDataListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(offeringDataList_);
        }
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 11;</code>
       */
      public emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder addOfferingDataListBuilder() {
        return getOfferingDataListFieldBuilder().addBuilder(
            emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.getDefaultInstance());
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 11;</code>
       */
      public emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder addOfferingDataListBuilder(
          int index) {
        return getOfferingDataListFieldBuilder().addBuilder(
            index, emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.getDefaultInstance());
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 11;</code>
       */
      public java.util.List<emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder> 
           getOfferingDataListBuilderList() {
        return getOfferingDataListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData, emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder, emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder> 
          getOfferingDataListFieldBuilder() {
        if (offeringDataListBuilder_ == null) {
          offeringDataListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData, emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder, emu.gingerps.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder>(
                  offeringDataList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          offeringDataList_ = null;
        }
        return offeringDataListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:PlayerOfferingDataNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerOfferingDataNotify)
    private static final emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify();
    }

    public static emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerOfferingDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerOfferingDataNotify>() {
      @java.lang.Override
      public PlayerOfferingDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerOfferingDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerOfferingDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerOfferingDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerOfferingDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerOfferingDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036PlayerOfferingDataNotify.proto\032\030Player" +
      "OfferingData.proto\"K\n\030PlayerOfferingData" +
      "Notify\022/\n\022offering_data_list\030\013 \003(\0132\023.Pla" +
      "yerOfferingDataB\030\n\026emu.gingerps.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.PlayerOfferingDataOuterClass.getDescriptor(),
        });
    internal_static_PlayerOfferingDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerOfferingDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerOfferingDataNotify_descriptor,
        new java.lang.String[] { "OfferingDataList", });
    emu.gingerps.net.proto.PlayerOfferingDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
