// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SelectEffigyChallengeConditionReq.proto

package emu.gingerps.net.proto;

public final class SelectEffigyChallengeConditionReqOuterClass {
  private SelectEffigyChallengeConditionReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SelectEffigyChallengeConditionReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SelectEffigyChallengeConditionReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 challenge_id = 6;</code>
     * @return The challengeId.
     */
    int getChallengeId();

    /**
     * <code>repeated uint32 condition_id_list = 1;</code>
     * @return A list containing the conditionIdList.
     */
    java.util.List<java.lang.Integer> getConditionIdListList();
    /**
     * <code>repeated uint32 condition_id_list = 1;</code>
     * @return The count of conditionIdList.
     */
    int getConditionIdListCount();
    /**
     * <code>repeated uint32 condition_id_list = 1;</code>
     * @param index The index of the element to return.
     * @return The conditionIdList at the given index.
     */
    int getConditionIdList(int index);

    /**
     * <code>uint32 difficulty_id = 11;</code>
     * @return The difficultyId.
     */
    int getDifficultyId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 2131;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code SelectEffigyChallengeConditionReq}
   */
  public static final class SelectEffigyChallengeConditionReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SelectEffigyChallengeConditionReq)
      SelectEffigyChallengeConditionReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SelectEffigyChallengeConditionReq.newBuilder() to construct.
    private SelectEffigyChallengeConditionReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SelectEffigyChallengeConditionReq() {
      conditionIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SelectEffigyChallengeConditionReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SelectEffigyChallengeConditionReq(
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
            case 8: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                conditionIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              conditionIdList_.addInt(input.readUInt32());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                conditionIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                conditionIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 48: {

              challengeId_ = input.readUInt32();
              break;
            }
            case 88: {

              difficultyId_ = input.readUInt32();
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
          conditionIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.internal_static_SelectEffigyChallengeConditionReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.internal_static_SelectEffigyChallengeConditionReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq.class, emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq.Builder.class);
    }

    public static final int CHALLENGE_ID_FIELD_NUMBER = 6;
    private int challengeId_;
    /**
     * <code>uint32 challenge_id = 6;</code>
     * @return The challengeId.
     */
    @java.lang.Override
    public int getChallengeId() {
      return challengeId_;
    }

    public static final int CONDITION_ID_LIST_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.IntList conditionIdList_;
    /**
     * <code>repeated uint32 condition_id_list = 1;</code>
     * @return A list containing the conditionIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getConditionIdListList() {
      return conditionIdList_;
    }
    /**
     * <code>repeated uint32 condition_id_list = 1;</code>
     * @return The count of conditionIdList.
     */
    public int getConditionIdListCount() {
      return conditionIdList_.size();
    }
    /**
     * <code>repeated uint32 condition_id_list = 1;</code>
     * @param index The index of the element to return.
     * @return The conditionIdList at the given index.
     */
    public int getConditionIdList(int index) {
      return conditionIdList_.getInt(index);
    }
    private int conditionIdListMemoizedSerializedSize = -1;

    public static final int DIFFICULTY_ID_FIELD_NUMBER = 11;
    private int difficultyId_;
    /**
     * <code>uint32 difficulty_id = 11;</code>
     * @return The difficultyId.
     */
    @java.lang.Override
    public int getDifficultyId() {
      return difficultyId_;
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
      if (getConditionIdListList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(conditionIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < conditionIdList_.size(); i++) {
        output.writeUInt32NoTag(conditionIdList_.getInt(i));
      }
      if (challengeId_ != 0) {
        output.writeUInt32(6, challengeId_);
      }
      if (difficultyId_ != 0) {
        output.writeUInt32(11, difficultyId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < conditionIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(conditionIdList_.getInt(i));
        }
        size += dataSize;
        if (!getConditionIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        conditionIdListMemoizedSerializedSize = dataSize;
      }
      if (challengeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, challengeId_);
      }
      if (difficultyId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, difficultyId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq other = (emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq) obj;

      if (getChallengeId()
          != other.getChallengeId()) return false;
      if (!getConditionIdListList()
          .equals(other.getConditionIdListList())) return false;
      if (getDifficultyId()
          != other.getDifficultyId()) return false;
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
      hash = (37 * hash) + CHALLENGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeId();
      if (getConditionIdListCount() > 0) {
        hash = (37 * hash) + CONDITION_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getConditionIdListList().hashCode();
      }
      hash = (37 * hash) + DIFFICULTY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDifficultyId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq prototype) {
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
     *   CMD_ID = 2131;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code SelectEffigyChallengeConditionReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SelectEffigyChallengeConditionReq)
        emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.internal_static_SelectEffigyChallengeConditionReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.internal_static_SelectEffigyChallengeConditionReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq.class, emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq.newBuilder()
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
        challengeId_ = 0;

        conditionIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        difficultyId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.internal_static_SelectEffigyChallengeConditionReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq build() {
        emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq buildPartial() {
        emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq result = new emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq(this);
        int from_bitField0_ = bitField0_;
        result.challengeId_ = challengeId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          conditionIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.conditionIdList_ = conditionIdList_;
        result.difficultyId_ = difficultyId_;
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
        if (other instanceof emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq) {
          return mergeFrom((emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq other) {
        if (other == emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq.getDefaultInstance()) return this;
        if (other.getChallengeId() != 0) {
          setChallengeId(other.getChallengeId());
        }
        if (!other.conditionIdList_.isEmpty()) {
          if (conditionIdList_.isEmpty()) {
            conditionIdList_ = other.conditionIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureConditionIdListIsMutable();
            conditionIdList_.addAll(other.conditionIdList_);
          }
          onChanged();
        }
        if (other.getDifficultyId() != 0) {
          setDifficultyId(other.getDifficultyId());
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
        emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int challengeId_ ;
      /**
       * <code>uint32 challenge_id = 6;</code>
       * @return The challengeId.
       */
      @java.lang.Override
      public int getChallengeId() {
        return challengeId_;
      }
      /**
       * <code>uint32 challenge_id = 6;</code>
       * @param value The challengeId to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeId(int value) {
        
        challengeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeId() {
        
        challengeId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList conditionIdList_ = emptyIntList();
      private void ensureConditionIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          conditionIdList_ = mutableCopy(conditionIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 condition_id_list = 1;</code>
       * @return A list containing the conditionIdList.
       */
      public java.util.List<java.lang.Integer>
          getConditionIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(conditionIdList_) : conditionIdList_;
      }
      /**
       * <code>repeated uint32 condition_id_list = 1;</code>
       * @return The count of conditionIdList.
       */
      public int getConditionIdListCount() {
        return conditionIdList_.size();
      }
      /**
       * <code>repeated uint32 condition_id_list = 1;</code>
       * @param index The index of the element to return.
       * @return The conditionIdList at the given index.
       */
      public int getConditionIdList(int index) {
        return conditionIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 condition_id_list = 1;</code>
       * @param index The index to set the value at.
       * @param value The conditionIdList to set.
       * @return This builder for chaining.
       */
      public Builder setConditionIdList(
          int index, int value) {
        ensureConditionIdListIsMutable();
        conditionIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 condition_id_list = 1;</code>
       * @param value The conditionIdList to add.
       * @return This builder for chaining.
       */
      public Builder addConditionIdList(int value) {
        ensureConditionIdListIsMutable();
        conditionIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 condition_id_list = 1;</code>
       * @param values The conditionIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllConditionIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureConditionIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, conditionIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 condition_id_list = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearConditionIdList() {
        conditionIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int difficultyId_ ;
      /**
       * <code>uint32 difficulty_id = 11;</code>
       * @return The difficultyId.
       */
      @java.lang.Override
      public int getDifficultyId() {
        return difficultyId_;
      }
      /**
       * <code>uint32 difficulty_id = 11;</code>
       * @param value The difficultyId to set.
       * @return This builder for chaining.
       */
      public Builder setDifficultyId(int value) {
        
        difficultyId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 difficulty_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficultyId() {
        
        difficultyId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SelectEffigyChallengeConditionReq)
    }

    // @@protoc_insertion_point(class_scope:SelectEffigyChallengeConditionReq)
    private static final emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq();
    }

    public static emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SelectEffigyChallengeConditionReq>
        PARSER = new com.google.protobuf.AbstractParser<SelectEffigyChallengeConditionReq>() {
      @java.lang.Override
      public SelectEffigyChallengeConditionReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SelectEffigyChallengeConditionReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SelectEffigyChallengeConditionReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SelectEffigyChallengeConditionReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SelectEffigyChallengeConditionReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SelectEffigyChallengeConditionReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'SelectEffigyChallengeConditionReq.prot" +
      "o\"k\n!SelectEffigyChallengeConditionReq\022\024" +
      "\n\014challenge_id\030\006 \001(\r\022\031\n\021condition_id_lis" +
      "t\030\001 \003(\r\022\025\n\rdifficulty_id\030\013 \001(\rB\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SelectEffigyChallengeConditionReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SelectEffigyChallengeConditionReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SelectEffigyChallengeConditionReq_descriptor,
        new java.lang.String[] { "ChallengeId", "ConditionIdList", "DifficultyId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}