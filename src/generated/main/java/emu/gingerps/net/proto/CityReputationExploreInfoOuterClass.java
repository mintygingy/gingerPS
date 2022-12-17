// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CityReputationExploreInfo.proto

package emu.gingerps.net.proto;

public final class CityReputationExploreInfoOuterClass {
  private CityReputationExploreInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CityReputationExploreInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CityReputationExploreInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 explore_percent = 1;</code>
     * @return The explorePercent.
     */
    int getExplorePercent();

    /**
     * <code>repeated uint32 taken_explore_reward_list = 15;</code>
     * @return A list containing the takenExploreRewardList.
     */
    java.util.List<java.lang.Integer> getTakenExploreRewardListList();
    /**
     * <code>repeated uint32 taken_explore_reward_list = 15;</code>
     * @return The count of takenExploreRewardList.
     */
    int getTakenExploreRewardListCount();
    /**
     * <code>repeated uint32 taken_explore_reward_list = 15;</code>
     * @param index The index of the element to return.
     * @return The takenExploreRewardList at the given index.
     */
    int getTakenExploreRewardList(int index);

    /**
     * <code>bool is_open = 13;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();
  }
  /**
   * Protobuf type {@code CityReputationExploreInfo}
   */
  public static final class CityReputationExploreInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CityReputationExploreInfo)
      CityReputationExploreInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CityReputationExploreInfo.newBuilder() to construct.
    private CityReputationExploreInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CityReputationExploreInfo() {
      takenExploreRewardList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CityReputationExploreInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.internal_static_CityReputationExploreInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.internal_static_CityReputationExploreInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo.class, emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo.Builder.class);
    }

    public static final int EXPLORE_PERCENT_FIELD_NUMBER = 1;
    private int explorePercent_ = 0;
    /**
     * <code>uint32 explore_percent = 1;</code>
     * @return The explorePercent.
     */
    @java.lang.Override
    public int getExplorePercent() {
      return explorePercent_;
    }

    public static final int TAKEN_EXPLORE_REWARD_LIST_FIELD_NUMBER = 15;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList takenExploreRewardList_;
    /**
     * <code>repeated uint32 taken_explore_reward_list = 15;</code>
     * @return A list containing the takenExploreRewardList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getTakenExploreRewardListList() {
      return takenExploreRewardList_;
    }
    /**
     * <code>repeated uint32 taken_explore_reward_list = 15;</code>
     * @return The count of takenExploreRewardList.
     */
    public int getTakenExploreRewardListCount() {
      return takenExploreRewardList_.size();
    }
    /**
     * <code>repeated uint32 taken_explore_reward_list = 15;</code>
     * @param index The index of the element to return.
     * @return The takenExploreRewardList at the given index.
     */
    public int getTakenExploreRewardList(int index) {
      return takenExploreRewardList_.getInt(index);
    }
    private int takenExploreRewardListMemoizedSerializedSize = -1;

    public static final int IS_OPEN_FIELD_NUMBER = 13;
    private boolean isOpen_ = false;
    /**
     * <code>bool is_open = 13;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
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
      if (explorePercent_ != 0) {
        output.writeUInt32(1, explorePercent_);
      }
      if (isOpen_ != false) {
        output.writeBool(13, isOpen_);
      }
      if (getTakenExploreRewardListList().size() > 0) {
        output.writeUInt32NoTag(122);
        output.writeUInt32NoTag(takenExploreRewardListMemoizedSerializedSize);
      }
      for (int i = 0; i < takenExploreRewardList_.size(); i++) {
        output.writeUInt32NoTag(takenExploreRewardList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (explorePercent_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, explorePercent_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, isOpen_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < takenExploreRewardList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(takenExploreRewardList_.getInt(i));
        }
        size += dataSize;
        if (!getTakenExploreRewardListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        takenExploreRewardListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo other = (emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo) obj;

      if (getExplorePercent()
          != other.getExplorePercent()) return false;
      if (!getTakenExploreRewardListList()
          .equals(other.getTakenExploreRewardListList())) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
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
      hash = (37 * hash) + EXPLORE_PERCENT_FIELD_NUMBER;
      hash = (53 * hash) + getExplorePercent();
      if (getTakenExploreRewardListCount() > 0) {
        hash = (37 * hash) + TAKEN_EXPLORE_REWARD_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getTakenExploreRewardListList().hashCode();
      }
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo prototype) {
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
     * Protobuf type {@code CityReputationExploreInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CityReputationExploreInfo)
        emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.internal_static_CityReputationExploreInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.internal_static_CityReputationExploreInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo.class, emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo.newBuilder()
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
        explorePercent_ = 0;
        takenExploreRewardList_ = emptyIntList();
        isOpen_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.internal_static_CityReputationExploreInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo build() {
        emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo buildPartial() {
        emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo result = new emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo result) {
        if (((bitField0_ & 0x00000002) != 0)) {
          takenExploreRewardList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.takenExploreRewardList_ = takenExploreRewardList_;
      }

      private void buildPartial0(emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.explorePercent_ = explorePercent_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.isOpen_ = isOpen_;
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
        if (other instanceof emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo) {
          return mergeFrom((emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo other) {
        if (other == emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo.getDefaultInstance()) return this;
        if (other.getExplorePercent() != 0) {
          setExplorePercent(other.getExplorePercent());
        }
        if (!other.takenExploreRewardList_.isEmpty()) {
          if (takenExploreRewardList_.isEmpty()) {
            takenExploreRewardList_ = other.takenExploreRewardList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureTakenExploreRewardListIsMutable();
            takenExploreRewardList_.addAll(other.takenExploreRewardList_);
          }
          onChanged();
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
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
              case 8: {
                explorePercent_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 104: {
                isOpen_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 104
              case 120: {
                int v = input.readUInt32();
                ensureTakenExploreRewardListIsMutable();
                takenExploreRewardList_.addInt(v);
                break;
              } // case 120
              case 122: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureTakenExploreRewardListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  takenExploreRewardList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 122
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

      private int explorePercent_ ;
      /**
       * <code>uint32 explore_percent = 1;</code>
       * @return The explorePercent.
       */
      @java.lang.Override
      public int getExplorePercent() {
        return explorePercent_;
      }
      /**
       * <code>uint32 explore_percent = 1;</code>
       * @param value The explorePercent to set.
       * @return This builder for chaining.
       */
      public Builder setExplorePercent(int value) {
        
        explorePercent_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 explore_percent = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearExplorePercent() {
        bitField0_ = (bitField0_ & ~0x00000001);
        explorePercent_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList takenExploreRewardList_ = emptyIntList();
      private void ensureTakenExploreRewardListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          takenExploreRewardList_ = mutableCopy(takenExploreRewardList_);
          bitField0_ |= 0x00000002;
        }
      }
      /**
       * <code>repeated uint32 taken_explore_reward_list = 15;</code>
       * @return A list containing the takenExploreRewardList.
       */
      public java.util.List<java.lang.Integer>
          getTakenExploreRewardListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(takenExploreRewardList_) : takenExploreRewardList_;
      }
      /**
       * <code>repeated uint32 taken_explore_reward_list = 15;</code>
       * @return The count of takenExploreRewardList.
       */
      public int getTakenExploreRewardListCount() {
        return takenExploreRewardList_.size();
      }
      /**
       * <code>repeated uint32 taken_explore_reward_list = 15;</code>
       * @param index The index of the element to return.
       * @return The takenExploreRewardList at the given index.
       */
      public int getTakenExploreRewardList(int index) {
        return takenExploreRewardList_.getInt(index);
      }
      /**
       * <code>repeated uint32 taken_explore_reward_list = 15;</code>
       * @param index The index to set the value at.
       * @param value The takenExploreRewardList to set.
       * @return This builder for chaining.
       */
      public Builder setTakenExploreRewardList(
          int index, int value) {
        
        ensureTakenExploreRewardListIsMutable();
        takenExploreRewardList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 taken_explore_reward_list = 15;</code>
       * @param value The takenExploreRewardList to add.
       * @return This builder for chaining.
       */
      public Builder addTakenExploreRewardList(int value) {
        
        ensureTakenExploreRewardListIsMutable();
        takenExploreRewardList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 taken_explore_reward_list = 15;</code>
       * @param values The takenExploreRewardList to add.
       * @return This builder for chaining.
       */
      public Builder addAllTakenExploreRewardList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureTakenExploreRewardListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, takenExploreRewardList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 taken_explore_reward_list = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearTakenExploreRewardList() {
        takenExploreRewardList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 13;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 13;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        bitField0_ = (bitField0_ & ~0x00000004);
        isOpen_ = false;
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


      // @@protoc_insertion_point(builder_scope:CityReputationExploreInfo)
    }

    // @@protoc_insertion_point(class_scope:CityReputationExploreInfo)
    private static final emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo();
    }

    public static emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CityReputationExploreInfo>
        PARSER = new com.google.protobuf.AbstractParser<CityReputationExploreInfo>() {
      @java.lang.Override
      public CityReputationExploreInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<CityReputationExploreInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CityReputationExploreInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.CityReputationExploreInfoOuterClass.CityReputationExploreInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CityReputationExploreInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CityReputationExploreInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037CityReputationExploreInfo.proto\"h\n\031Cit" +
      "yReputationExploreInfo\022\027\n\017explore_percen" +
      "t\030\001 \001(\r\022!\n\031taken_explore_reward_list\030\017 \003" +
      "(\r\022\017\n\007is_open\030\r \001(\010B\030\n\026emu.gingerps.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CityReputationExploreInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CityReputationExploreInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CityReputationExploreInfo_descriptor,
        new java.lang.String[] { "ExplorePercent", "TakenExploreRewardList", "IsOpen", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
