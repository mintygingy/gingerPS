// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGChallengeData.proto

package emu.gingerps.net.proto;

public final class GCGChallengeDataOuterClass {
  private GCGChallengeDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGChallengeDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGChallengeData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 challenge_id = 1;</code>
     * @return The challengeId.
     */
    int getChallengeId();

    /**
     * <code>uint32 challenge_type = 2;</code>
     * @return The challengeType.
     */
    int getChallengeType();

    /**
     * <code>repeated uint32 param_list = 3;</code>
     * @return A list containing the paramList.
     */
    java.util.List<java.lang.Integer> getParamListList();
    /**
     * <code>repeated uint32 param_list = 3;</code>
     * @return The count of paramList.
     */
    int getParamListCount();
    /**
     * <code>repeated uint32 param_list = 3;</code>
     * @param index The index of the element to return.
     * @return The paramList at the given index.
     */
    int getParamList(int index);

    /**
     * <code>uint32 progress = 4;</code>
     * @return The progress.
     */
    int getProgress();
  }
  /**
   * Protobuf type {@code GCGChallengeData}
   */
  public static final class GCGChallengeData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGChallengeData)
      GCGChallengeDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGChallengeData.newBuilder() to construct.
    private GCGChallengeData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGChallengeData() {
      paramList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGChallengeData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGChallengeData(
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

              challengeId_ = input.readUInt32();
              break;
            }
            case 16: {

              challengeType_ = input.readUInt32();
              break;
            }
            case 24: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                paramList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              paramList_.addInt(input.readUInt32());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                paramList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                paramList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 32: {

              progress_ = input.readUInt32();
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
          paramList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.GCGChallengeDataOuterClass.internal_static_GCGChallengeData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.GCGChallengeDataOuterClass.internal_static_GCGChallengeData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData.class, emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData.Builder.class);
    }

    public static final int CHALLENGE_ID_FIELD_NUMBER = 1;
    private int challengeId_;
    /**
     * <code>uint32 challenge_id = 1;</code>
     * @return The challengeId.
     */
    @java.lang.Override
    public int getChallengeId() {
      return challengeId_;
    }

    public static final int CHALLENGE_TYPE_FIELD_NUMBER = 2;
    private int challengeType_;
    /**
     * <code>uint32 challenge_type = 2;</code>
     * @return The challengeType.
     */
    @java.lang.Override
    public int getChallengeType() {
      return challengeType_;
    }

    public static final int PARAM_LIST_FIELD_NUMBER = 3;
    private com.google.protobuf.Internal.IntList paramList_;
    /**
     * <code>repeated uint32 param_list = 3;</code>
     * @return A list containing the paramList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getParamListList() {
      return paramList_;
    }
    /**
     * <code>repeated uint32 param_list = 3;</code>
     * @return The count of paramList.
     */
    public int getParamListCount() {
      return paramList_.size();
    }
    /**
     * <code>repeated uint32 param_list = 3;</code>
     * @param index The index of the element to return.
     * @return The paramList at the given index.
     */
    public int getParamList(int index) {
      return paramList_.getInt(index);
    }
    private int paramListMemoizedSerializedSize = -1;

    public static final int PROGRESS_FIELD_NUMBER = 4;
    private int progress_;
    /**
     * <code>uint32 progress = 4;</code>
     * @return The progress.
     */
    @java.lang.Override
    public int getProgress() {
      return progress_;
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
      if (challengeId_ != 0) {
        output.writeUInt32(1, challengeId_);
      }
      if (challengeType_ != 0) {
        output.writeUInt32(2, challengeType_);
      }
      if (getParamListList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(paramListMemoizedSerializedSize);
      }
      for (int i = 0; i < paramList_.size(); i++) {
        output.writeUInt32NoTag(paramList_.getInt(i));
      }
      if (progress_ != 0) {
        output.writeUInt32(4, progress_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (challengeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, challengeId_);
      }
      if (challengeType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, challengeType_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < paramList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(paramList_.getInt(i));
        }
        size += dataSize;
        if (!getParamListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        paramListMemoizedSerializedSize = dataSize;
      }
      if (progress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, progress_);
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
      if (!(obj instanceof emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData other = (emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData) obj;

      if (getChallengeId()
          != other.getChallengeId()) return false;
      if (getChallengeType()
          != other.getChallengeType()) return false;
      if (!getParamListList()
          .equals(other.getParamListList())) return false;
      if (getProgress()
          != other.getProgress()) return false;
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
      hash = (37 * hash) + CHALLENGE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeType();
      if (getParamListCount() > 0) {
        hash = (37 * hash) + PARAM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getParamListList().hashCode();
      }
      hash = (37 * hash) + PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getProgress();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData prototype) {
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
     * Protobuf type {@code GCGChallengeData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGChallengeData)
        emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.GCGChallengeDataOuterClass.internal_static_GCGChallengeData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.GCGChallengeDataOuterClass.internal_static_GCGChallengeData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData.class, emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData.newBuilder()
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

        challengeType_ = 0;

        paramList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        progress_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.GCGChallengeDataOuterClass.internal_static_GCGChallengeData_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData getDefaultInstanceForType() {
        return emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData build() {
        emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData buildPartial() {
        emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData result = new emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData(this);
        int from_bitField0_ = bitField0_;
        result.challengeId_ = challengeId_;
        result.challengeType_ = challengeType_;
        if (((bitField0_ & 0x00000001) != 0)) {
          paramList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.paramList_ = paramList_;
        result.progress_ = progress_;
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
        if (other instanceof emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData) {
          return mergeFrom((emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData other) {
        if (other == emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData.getDefaultInstance()) return this;
        if (other.getChallengeId() != 0) {
          setChallengeId(other.getChallengeId());
        }
        if (other.getChallengeType() != 0) {
          setChallengeType(other.getChallengeType());
        }
        if (!other.paramList_.isEmpty()) {
          if (paramList_.isEmpty()) {
            paramList_ = other.paramList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureParamListIsMutable();
            paramList_.addAll(other.paramList_);
          }
          onChanged();
        }
        if (other.getProgress() != 0) {
          setProgress(other.getProgress());
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
        emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData) e.getUnfinishedMessage();
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
       * <code>uint32 challenge_id = 1;</code>
       * @return The challengeId.
       */
      @java.lang.Override
      public int getChallengeId() {
        return challengeId_;
      }
      /**
       * <code>uint32 challenge_id = 1;</code>
       * @param value The challengeId to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeId(int value) {
        
        challengeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeId() {
        
        challengeId_ = 0;
        onChanged();
        return this;
      }

      private int challengeType_ ;
      /**
       * <code>uint32 challenge_type = 2;</code>
       * @return The challengeType.
       */
      @java.lang.Override
      public int getChallengeType() {
        return challengeType_;
      }
      /**
       * <code>uint32 challenge_type = 2;</code>
       * @param value The challengeType to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeType(int value) {
        
        challengeType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_type = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeType() {
        
        challengeType_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList paramList_ = emptyIntList();
      private void ensureParamListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          paramList_ = mutableCopy(paramList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 param_list = 3;</code>
       * @return A list containing the paramList.
       */
      public java.util.List<java.lang.Integer>
          getParamListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(paramList_) : paramList_;
      }
      /**
       * <code>repeated uint32 param_list = 3;</code>
       * @return The count of paramList.
       */
      public int getParamListCount() {
        return paramList_.size();
      }
      /**
       * <code>repeated uint32 param_list = 3;</code>
       * @param index The index of the element to return.
       * @return The paramList at the given index.
       */
      public int getParamList(int index) {
        return paramList_.getInt(index);
      }
      /**
       * <code>repeated uint32 param_list = 3;</code>
       * @param index The index to set the value at.
       * @param value The paramList to set.
       * @return This builder for chaining.
       */
      public Builder setParamList(
          int index, int value) {
        ensureParamListIsMutable();
        paramList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 param_list = 3;</code>
       * @param value The paramList to add.
       * @return This builder for chaining.
       */
      public Builder addParamList(int value) {
        ensureParamListIsMutable();
        paramList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 param_list = 3;</code>
       * @param values The paramList to add.
       * @return This builder for chaining.
       */
      public Builder addAllParamList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureParamListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, paramList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 param_list = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearParamList() {
        paramList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int progress_ ;
      /**
       * <code>uint32 progress = 4;</code>
       * @return The progress.
       */
      @java.lang.Override
      public int getProgress() {
        return progress_;
      }
      /**
       * <code>uint32 progress = 4;</code>
       * @param value The progress to set.
       * @return This builder for chaining.
       */
      public Builder setProgress(int value) {
        
        progress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 progress = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearProgress() {
        
        progress_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGChallengeData)
    }

    // @@protoc_insertion_point(class_scope:GCGChallengeData)
    private static final emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData();
    }

    public static emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGChallengeData>
        PARSER = new com.google.protobuf.AbstractParser<GCGChallengeData>() {
      @java.lang.Override
      public GCGChallengeData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGChallengeData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGChallengeData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGChallengeData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.GCGChallengeDataOuterClass.GCGChallengeData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGChallengeData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGChallengeData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026GCGChallengeData.proto\"f\n\020GCGChallenge" +
      "Data\022\024\n\014challenge_id\030\001 \001(\r\022\026\n\016challenge_" +
      "type\030\002 \001(\r\022\022\n\nparam_list\030\003 \003(\r\022\020\n\010progre" +
      "ss\030\004 \001(\rB\033\n\031emu.gingerps.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGChallengeData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGChallengeData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGChallengeData_descriptor,
        new java.lang.String[] { "ChallengeId", "ChallengeType", "ParamList", "Progress", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}