// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WinterCampGetFriendWishListRsp.proto

package emu.gingerps.net.proto;

public final class WinterCampGetFriendWishListRspOuterClass {
  private WinterCampGetFriendWishListRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WinterCampGetFriendWishListRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WinterCampGetFriendWishListRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .WinterCampFriendWishData wish_data_list = 3;</code>
     */
    java.util.List<emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishData> 
        getWishDataListList();
    /**
     * <code>repeated .WinterCampFriendWishData wish_data_list = 3;</code>
     */
    emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishData getWishDataList(int index);
    /**
     * <code>repeated .WinterCampFriendWishData wish_data_list = 3;</code>
     */
    int getWishDataListCount();
    /**
     * <code>repeated .WinterCampFriendWishData wish_data_list = 3;</code>
     */
    java.util.List<? extends emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishDataOrBuilder> 
        getWishDataListOrBuilderList();
    /**
     * <code>repeated .WinterCampFriendWishData wish_data_list = 3;</code>
     */
    emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishDataOrBuilder getWishDataListOrBuilder(
        int index);

    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8208;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code WinterCampGetFriendWishListRsp}
   */
  public static final class WinterCampGetFriendWishListRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WinterCampGetFriendWishListRsp)
      WinterCampGetFriendWishListRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WinterCampGetFriendWishListRsp.newBuilder() to construct.
    private WinterCampGetFriendWishListRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WinterCampGetFriendWishListRsp() {
      wishDataList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WinterCampGetFriendWishListRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WinterCampGetFriendWishListRsp(
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
            case 26: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                wishDataList_ = new java.util.ArrayList<emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishData>();
                mutable_bitField0_ |= 0x00000001;
              }
              wishDataList_.add(
                  input.readMessage(emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishData.parser(), extensionRegistry));
              break;
            }
            case 120: {

              retcode_ = input.readInt32();
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
          wishDataList_ = java.util.Collections.unmodifiableList(wishDataList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.internal_static_WinterCampGetFriendWishListRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.internal_static_WinterCampGetFriendWishListRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp.class, emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp.Builder.class);
    }

    public static final int WISH_DATA_LIST_FIELD_NUMBER = 3;
    private java.util.List<emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishData> wishDataList_;
    /**
     * <code>repeated .WinterCampFriendWishData wish_data_list = 3;</code>
     */
    @java.lang.Override
    public java.util.List<emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishData> getWishDataListList() {
      return wishDataList_;
    }
    /**
     * <code>repeated .WinterCampFriendWishData wish_data_list = 3;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishDataOrBuilder> 
        getWishDataListOrBuilderList() {
      return wishDataList_;
    }
    /**
     * <code>repeated .WinterCampFriendWishData wish_data_list = 3;</code>
     */
    @java.lang.Override
    public int getWishDataListCount() {
      return wishDataList_.size();
    }
    /**
     * <code>repeated .WinterCampFriendWishData wish_data_list = 3;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishData getWishDataList(int index) {
      return wishDataList_.get(index);
    }
    /**
     * <code>repeated .WinterCampFriendWishData wish_data_list = 3;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishDataOrBuilder getWishDataListOrBuilder(
        int index) {
      return wishDataList_.get(index);
    }

    public static final int RETCODE_FIELD_NUMBER = 15;
    private int retcode_;
    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      for (int i = 0; i < wishDataList_.size(); i++) {
        output.writeMessage(3, wishDataList_.get(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(15, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < wishDataList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, wishDataList_.get(i));
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(15, retcode_);
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
      if (!(obj instanceof emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp other = (emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp) obj;

      if (!getWishDataListList()
          .equals(other.getWishDataListList())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      if (getWishDataListCount() > 0) {
        hash = (37 * hash) + WISH_DATA_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getWishDataListList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp prototype) {
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
     *   CMD_ID = 8208;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code WinterCampGetFriendWishListRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WinterCampGetFriendWishListRsp)
        emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.internal_static_WinterCampGetFriendWishListRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.internal_static_WinterCampGetFriendWishListRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp.class, emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp.newBuilder()
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
          getWishDataListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (wishDataListBuilder_ == null) {
          wishDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          wishDataListBuilder_.clear();
        }
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.internal_static_WinterCampGetFriendWishListRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp build() {
        emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp buildPartial() {
        emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp result = new emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp(this);
        int from_bitField0_ = bitField0_;
        if (wishDataListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            wishDataList_ = java.util.Collections.unmodifiableList(wishDataList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.wishDataList_ = wishDataList_;
        } else {
          result.wishDataList_ = wishDataListBuilder_.build();
        }
        result.retcode_ = retcode_;
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
        if (other instanceof emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp) {
          return mergeFrom((emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp other) {
        if (other == emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp.getDefaultInstance()) return this;
        if (wishDataListBuilder_ == null) {
          if (!other.wishDataList_.isEmpty()) {
            if (wishDataList_.isEmpty()) {
              wishDataList_ = other.wishDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureWishDataListIsMutable();
              wishDataList_.addAll(other.wishDataList_);
            }
            onChanged();
          }
        } else {
          if (!other.wishDataList_.isEmpty()) {
            if (wishDataListBuilder_.isEmpty()) {
              wishDataListBuilder_.dispose();
              wishDataListBuilder_ = null;
              wishDataList_ = other.wishDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              wishDataListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getWishDataListFieldBuilder() : null;
            } else {
              wishDataListBuilder_.addAllMessages(other.wishDataList_);
            }
          }
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishData> wishDataList_ =
        java.util.Collections.emptyList();
      private void ensureWishDataListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          wishDataList_ = new java.util.ArrayList<emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishData>(wishDataList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishData, emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishData.Builder, emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishDataOrBuilder> wishDataListBuilder_;

      /**
       * <code>repeated .WinterCampFriendWishData wish_data_list = 3;</code>
       */
      public java.util.List<emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishData> getWishDataListList() {
        if (wishDataListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(wishDataList_);
        } else {
          return wishDataListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .WinterCampFriendWishData wish_data_list = 3;</code>
       */
      public int getWishDataListCount() {
        if (wishDataListBuilder_ == null) {
          return wishDataList_.size();
        } else {
          return wishDataListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .WinterCampFriendWishData wish_data_list = 3;</code>
       */
      public emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishData getWishDataList(int index) {
        if (wishDataListBuilder_ == null) {
          return wishDataList_.get(index);
        } else {
          return wishDataListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .WinterCampFriendWishData wish_data_list = 3;</code>
       */
      public Builder setWishDataList(
          int index, emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishData value) {
        if (wishDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureWishDataListIsMutable();
          wishDataList_.set(index, value);
          onChanged();
        } else {
          wishDataListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .WinterCampFriendWishData wish_data_list = 3;</code>
       */
      public Builder setWishDataList(
          int index, emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishData.Builder builderForValue) {
        if (wishDataListBuilder_ == null) {
          ensureWishDataListIsMutable();
          wishDataList_.set(index, builderForValue.build());
          onChanged();
        } else {
          wishDataListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WinterCampFriendWishData wish_data_list = 3;</code>
       */
      public Builder addWishDataList(emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishData value) {
        if (wishDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureWishDataListIsMutable();
          wishDataList_.add(value);
          onChanged();
        } else {
          wishDataListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .WinterCampFriendWishData wish_data_list = 3;</code>
       */
      public Builder addWishDataList(
          int index, emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishData value) {
        if (wishDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureWishDataListIsMutable();
          wishDataList_.add(index, value);
          onChanged();
        } else {
          wishDataListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .WinterCampFriendWishData wish_data_list = 3;</code>
       */
      public Builder addWishDataList(
          emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishData.Builder builderForValue) {
        if (wishDataListBuilder_ == null) {
          ensureWishDataListIsMutable();
          wishDataList_.add(builderForValue.build());
          onChanged();
        } else {
          wishDataListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WinterCampFriendWishData wish_data_list = 3;</code>
       */
      public Builder addWishDataList(
          int index, emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishData.Builder builderForValue) {
        if (wishDataListBuilder_ == null) {
          ensureWishDataListIsMutable();
          wishDataList_.add(index, builderForValue.build());
          onChanged();
        } else {
          wishDataListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .WinterCampFriendWishData wish_data_list = 3;</code>
       */
      public Builder addAllWishDataList(
          java.lang.Iterable<? extends emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishData> values) {
        if (wishDataListBuilder_ == null) {
          ensureWishDataListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, wishDataList_);
          onChanged();
        } else {
          wishDataListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .WinterCampFriendWishData wish_data_list = 3;</code>
       */
      public Builder clearWishDataList() {
        if (wishDataListBuilder_ == null) {
          wishDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          wishDataListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .WinterCampFriendWishData wish_data_list = 3;</code>
       */
      public Builder removeWishDataList(int index) {
        if (wishDataListBuilder_ == null) {
          ensureWishDataListIsMutable();
          wishDataList_.remove(index);
          onChanged();
        } else {
          wishDataListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .WinterCampFriendWishData wish_data_list = 3;</code>
       */
      public emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishData.Builder getWishDataListBuilder(
          int index) {
        return getWishDataListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .WinterCampFriendWishData wish_data_list = 3;</code>
       */
      public emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishDataOrBuilder getWishDataListOrBuilder(
          int index) {
        if (wishDataListBuilder_ == null) {
          return wishDataList_.get(index);  } else {
          return wishDataListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .WinterCampFriendWishData wish_data_list = 3;</code>
       */
      public java.util.List<? extends emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishDataOrBuilder> 
           getWishDataListOrBuilderList() {
        if (wishDataListBuilder_ != null) {
          return wishDataListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(wishDataList_);
        }
      }
      /**
       * <code>repeated .WinterCampFriendWishData wish_data_list = 3;</code>
       */
      public emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishData.Builder addWishDataListBuilder() {
        return getWishDataListFieldBuilder().addBuilder(
            emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishData.getDefaultInstance());
      }
      /**
       * <code>repeated .WinterCampFriendWishData wish_data_list = 3;</code>
       */
      public emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishData.Builder addWishDataListBuilder(
          int index) {
        return getWishDataListFieldBuilder().addBuilder(
            index, emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishData.getDefaultInstance());
      }
      /**
       * <code>repeated .WinterCampFriendWishData wish_data_list = 3;</code>
       */
      public java.util.List<emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishData.Builder> 
           getWishDataListBuilderList() {
        return getWishDataListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishData, emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishData.Builder, emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishDataOrBuilder> 
          getWishDataListFieldBuilder() {
        if (wishDataListBuilder_ == null) {
          wishDataListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishData, emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishData.Builder, emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.WinterCampFriendWishDataOrBuilder>(
                  wishDataList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          wishDataList_ = null;
        }
        return wishDataListBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 15;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:WinterCampGetFriendWishListRsp)
    }

    // @@protoc_insertion_point(class_scope:WinterCampGetFriendWishListRsp)
    private static final emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp();
    }

    public static emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WinterCampGetFriendWishListRsp>
        PARSER = new com.google.protobuf.AbstractParser<WinterCampGetFriendWishListRsp>() {
      @java.lang.Override
      public WinterCampGetFriendWishListRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WinterCampGetFriendWishListRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WinterCampGetFriendWishListRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WinterCampGetFriendWishListRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.WinterCampGetFriendWishListRspOuterClass.WinterCampGetFriendWishListRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WinterCampGetFriendWishListRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WinterCampGetFriendWishListRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$WinterCampGetFriendWishListRsp.proto\032\036" +
      "WinterCampFriendWishData.proto\"d\n\036Winter" +
      "CampGetFriendWishListRsp\0221\n\016wish_data_li" +
      "st\030\003 \003(\0132\031.WinterCampFriendWishData\022\017\n\007r" +
      "etcode\030\017 \001(\005B\030\n\026emu.gingerps.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.getDescriptor(),
        });
    internal_static_WinterCampGetFriendWishListRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WinterCampGetFriendWishListRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WinterCampGetFriendWishListRsp_descriptor,
        new java.lang.String[] { "WishDataList", "Retcode", });
    emu.gingerps.net.proto.WinterCampFriendWishDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
