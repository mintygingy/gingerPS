// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeFishFarmingInfo.proto

package emu.gingerps.net.proto;

public final class HomeFishFarmingInfoOuterClass {
  private HomeFishFarmingInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeFishFarmingInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeFishFarmingInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 fish_id_list = 13;</code>
     * @return A list containing the fishIdList.
     */
    java.util.List<java.lang.Integer> getFishIdListList();
    /**
     * <code>repeated uint32 fish_id_list = 13;</code>
     * @return The count of fishIdList.
     */
    int getFishIdListCount();
    /**
     * <code>repeated uint32 fish_id_list = 13;</code>
     * @param index The index of the element to return.
     * @return The fishIdList at the given index.
     */
    int getFishIdList(int index);

    /**
     * <code>uint32 fishpond_guid = 5;</code>
     * @return The fishpondGuid.
     */
    int getFishpondGuid();
  }
  /**
   * Protobuf type {@code HomeFishFarmingInfo}
   */
  public static final class HomeFishFarmingInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeFishFarmingInfo)
      HomeFishFarmingInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeFishFarmingInfo.newBuilder() to construct.
    private HomeFishFarmingInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeFishFarmingInfo() {
      fishIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeFishFarmingInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeFishFarmingInfo(
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
            case 40: {

              fishpondGuid_ = input.readUInt32();
              break;
            }
            case 104: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                fishIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              fishIdList_.addInt(input.readUInt32());
              break;
            }
            case 106: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                fishIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                fishIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
          fishIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.internal_static_HomeFishFarmingInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.internal_static_HomeFishFarmingInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo.class, emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo.Builder.class);
    }

    public static final int FISH_ID_LIST_FIELD_NUMBER = 13;
    private com.google.protobuf.Internal.IntList fishIdList_;
    /**
     * <code>repeated uint32 fish_id_list = 13;</code>
     * @return A list containing the fishIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getFishIdListList() {
      return fishIdList_;
    }
    /**
     * <code>repeated uint32 fish_id_list = 13;</code>
     * @return The count of fishIdList.
     */
    public int getFishIdListCount() {
      return fishIdList_.size();
    }
    /**
     * <code>repeated uint32 fish_id_list = 13;</code>
     * @param index The index of the element to return.
     * @return The fishIdList at the given index.
     */
    public int getFishIdList(int index) {
      return fishIdList_.getInt(index);
    }
    private int fishIdListMemoizedSerializedSize = -1;

    public static final int FISHPOND_GUID_FIELD_NUMBER = 5;
    private int fishpondGuid_;
    /**
     * <code>uint32 fishpond_guid = 5;</code>
     * @return The fishpondGuid.
     */
    @java.lang.Override
    public int getFishpondGuid() {
      return fishpondGuid_;
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
      if (fishpondGuid_ != 0) {
        output.writeUInt32(5, fishpondGuid_);
      }
      if (getFishIdListList().size() > 0) {
        output.writeUInt32NoTag(106);
        output.writeUInt32NoTag(fishIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < fishIdList_.size(); i++) {
        output.writeUInt32NoTag(fishIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (fishpondGuid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, fishpondGuid_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < fishIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(fishIdList_.getInt(i));
        }
        size += dataSize;
        if (!getFishIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        fishIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo other = (emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo) obj;

      if (!getFishIdListList()
          .equals(other.getFishIdListList())) return false;
      if (getFishpondGuid()
          != other.getFishpondGuid()) return false;
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
      if (getFishIdListCount() > 0) {
        hash = (37 * hash) + FISH_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getFishIdListList().hashCode();
      }
      hash = (37 * hash) + FISHPOND_GUID_FIELD_NUMBER;
      hash = (53 * hash) + getFishpondGuid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo prototype) {
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
     * Protobuf type {@code HomeFishFarmingInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeFishFarmingInfo)
        emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.internal_static_HomeFishFarmingInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.internal_static_HomeFishFarmingInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo.class, emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo.newBuilder()
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
        fishIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        fishpondGuid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.internal_static_HomeFishFarmingInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo build() {
        emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo buildPartial() {
        emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo result = new emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          fishIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.fishIdList_ = fishIdList_;
        result.fishpondGuid_ = fishpondGuid_;
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
        if (other instanceof emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo) {
          return mergeFrom((emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo other) {
        if (other == emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo.getDefaultInstance()) return this;
        if (!other.fishIdList_.isEmpty()) {
          if (fishIdList_.isEmpty()) {
            fishIdList_ = other.fishIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFishIdListIsMutable();
            fishIdList_.addAll(other.fishIdList_);
          }
          onChanged();
        }
        if (other.getFishpondGuid() != 0) {
          setFishpondGuid(other.getFishpondGuid());
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
        emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList fishIdList_ = emptyIntList();
      private void ensureFishIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          fishIdList_ = mutableCopy(fishIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 fish_id_list = 13;</code>
       * @return A list containing the fishIdList.
       */
      public java.util.List<java.lang.Integer>
          getFishIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(fishIdList_) : fishIdList_;
      }
      /**
       * <code>repeated uint32 fish_id_list = 13;</code>
       * @return The count of fishIdList.
       */
      public int getFishIdListCount() {
        return fishIdList_.size();
      }
      /**
       * <code>repeated uint32 fish_id_list = 13;</code>
       * @param index The index of the element to return.
       * @return The fishIdList at the given index.
       */
      public int getFishIdList(int index) {
        return fishIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 fish_id_list = 13;</code>
       * @param index The index to set the value at.
       * @param value The fishIdList to set.
       * @return This builder for chaining.
       */
      public Builder setFishIdList(
          int index, int value) {
        ensureFishIdListIsMutable();
        fishIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fish_id_list = 13;</code>
       * @param value The fishIdList to add.
       * @return This builder for chaining.
       */
      public Builder addFishIdList(int value) {
        ensureFishIdListIsMutable();
        fishIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fish_id_list = 13;</code>
       * @param values The fishIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllFishIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureFishIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fishIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fish_id_list = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearFishIdList() {
        fishIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int fishpondGuid_ ;
      /**
       * <code>uint32 fishpond_guid = 5;</code>
       * @return The fishpondGuid.
       */
      @java.lang.Override
      public int getFishpondGuid() {
        return fishpondGuid_;
      }
      /**
       * <code>uint32 fishpond_guid = 5;</code>
       * @param value The fishpondGuid to set.
       * @return This builder for chaining.
       */
      public Builder setFishpondGuid(int value) {
        
        fishpondGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 fishpond_guid = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearFishpondGuid() {
        
        fishpondGuid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomeFishFarmingInfo)
    }

    // @@protoc_insertion_point(class_scope:HomeFishFarmingInfo)
    private static final emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo();
    }

    public static emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeFishFarmingInfo>
        PARSER = new com.google.protobuf.AbstractParser<HomeFishFarmingInfo>() {
      @java.lang.Override
      public HomeFishFarmingInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeFishFarmingInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeFishFarmingInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeFishFarmingInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.HomeFishFarmingInfoOuterClass.HomeFishFarmingInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeFishFarmingInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeFishFarmingInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031HomeFishFarmingInfo.proto\"B\n\023HomeFishF" +
      "armingInfo\022\024\n\014fish_id_list\030\r \003(\r\022\025\n\rfish" +
      "pond_guid\030\005 \001(\rB\030\n\026emu.gingerps.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeFishFarmingInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeFishFarmingInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeFishFarmingInfo_descriptor,
        new java.lang.String[] { "FishIdList", "FishpondGuid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
