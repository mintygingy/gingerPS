// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EffigyChallengeDungeonResultInfo.proto

package emu.gingerps.net.proto;

public final class EffigyChallengeDungeonResultInfoOuterClass {
  private EffigyChallengeDungeonResultInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EffigyChallengeDungeonResultInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EffigyChallengeDungeonResultInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 challenge_score = 12;</code>
     * @return The challengeScore.
     */
    int getChallengeScore();

    /**
     * <code>uint32 challenge_max_score = 8;</code>
     * @return The challengeMaxScore.
     */
    int getChallengeMaxScore();

    /**
     * <code>bool is_success = 2;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();

    /**
     * <code>bool is_in_time_limit = 1;</code>
     * @return The isInTimeLimit.
     */
    boolean getIsInTimeLimit();

    /**
     * <code>uint32 challenge_id = 15;</code>
     * @return The challengeId.
     */
    int getChallengeId();
  }
  /**
   * Protobuf type {@code EffigyChallengeDungeonResultInfo}
   */
  public static final class EffigyChallengeDungeonResultInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EffigyChallengeDungeonResultInfo)
      EffigyChallengeDungeonResultInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EffigyChallengeDungeonResultInfo.newBuilder() to construct.
    private EffigyChallengeDungeonResultInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EffigyChallengeDungeonResultInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EffigyChallengeDungeonResultInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EffigyChallengeDungeonResultInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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

              isInTimeLimit_ = input.readBool();
              break;
            }
            case 16: {

              isSuccess_ = input.readBool();
              break;
            }
            case 64: {

              challengeMaxScore_ = input.readUInt32();
              break;
            }
            case 96: {

              challengeScore_ = input.readUInt32();
              break;
            }
            case 120: {

              challengeId_ = input.readUInt32();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.internal_static_EffigyChallengeDungeonResultInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.internal_static_EffigyChallengeDungeonResultInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.class, emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.Builder.class);
    }

    public static final int CHALLENGE_SCORE_FIELD_NUMBER = 12;
    private int challengeScore_;
    /**
     * <code>uint32 challenge_score = 12;</code>
     * @return The challengeScore.
     */
    @java.lang.Override
    public int getChallengeScore() {
      return challengeScore_;
    }

    public static final int CHALLENGE_MAX_SCORE_FIELD_NUMBER = 8;
    private int challengeMaxScore_;
    /**
     * <code>uint32 challenge_max_score = 8;</code>
     * @return The challengeMaxScore.
     */
    @java.lang.Override
    public int getChallengeMaxScore() {
      return challengeMaxScore_;
    }

    public static final int IS_SUCCESS_FIELD_NUMBER = 2;
    private boolean isSuccess_;
    /**
     * <code>bool is_success = 2;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
    }

    public static final int IS_IN_TIME_LIMIT_FIELD_NUMBER = 1;
    private boolean isInTimeLimit_;
    /**
     * <code>bool is_in_time_limit = 1;</code>
     * @return The isInTimeLimit.
     */
    @java.lang.Override
    public boolean getIsInTimeLimit() {
      return isInTimeLimit_;
    }

    public static final int CHALLENGE_ID_FIELD_NUMBER = 15;
    private int challengeId_;
    /**
     * <code>uint32 challenge_id = 15;</code>
     * @return The challengeId.
     */
    @java.lang.Override
    public int getChallengeId() {
      return challengeId_;
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
      if (isInTimeLimit_ != false) {
        output.writeBool(1, isInTimeLimit_);
      }
      if (isSuccess_ != false) {
        output.writeBool(2, isSuccess_);
      }
      if (challengeMaxScore_ != 0) {
        output.writeUInt32(8, challengeMaxScore_);
      }
      if (challengeScore_ != 0) {
        output.writeUInt32(12, challengeScore_);
      }
      if (challengeId_ != 0) {
        output.writeUInt32(15, challengeId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isInTimeLimit_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isInTimeLimit_);
      }
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isSuccess_);
      }
      if (challengeMaxScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, challengeMaxScore_);
      }
      if (challengeScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, challengeScore_);
      }
      if (challengeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, challengeId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo other = (emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo) obj;

      if (getChallengeScore()
          != other.getChallengeScore()) return false;
      if (getChallengeMaxScore()
          != other.getChallengeMaxScore()) return false;
      if (getIsSuccess()
          != other.getIsSuccess()) return false;
      if (getIsInTimeLimit()
          != other.getIsInTimeLimit()) return false;
      if (getChallengeId()
          != other.getChallengeId()) return false;
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
      hash = (37 * hash) + CHALLENGE_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeScore();
      hash = (37 * hash) + CHALLENGE_MAX_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeMaxScore();
      hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (37 * hash) + IS_IN_TIME_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsInTimeLimit());
      hash = (37 * hash) + CHALLENGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo prototype) {
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
     * Protobuf type {@code EffigyChallengeDungeonResultInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EffigyChallengeDungeonResultInfo)
        emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.internal_static_EffigyChallengeDungeonResultInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.internal_static_EffigyChallengeDungeonResultInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.class, emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.newBuilder()
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
        challengeScore_ = 0;

        challengeMaxScore_ = 0;

        isSuccess_ = false;

        isInTimeLimit_ = false;

        challengeId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.internal_static_EffigyChallengeDungeonResultInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo build() {
        emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo buildPartial() {
        emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo result = new emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo(this);
        result.challengeScore_ = challengeScore_;
        result.challengeMaxScore_ = challengeMaxScore_;
        result.isSuccess_ = isSuccess_;
        result.isInTimeLimit_ = isInTimeLimit_;
        result.challengeId_ = challengeId_;
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
        if (other instanceof emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo) {
          return mergeFrom((emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo other) {
        if (other == emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.getDefaultInstance()) return this;
        if (other.getChallengeScore() != 0) {
          setChallengeScore(other.getChallengeScore());
        }
        if (other.getChallengeMaxScore() != 0) {
          setChallengeMaxScore(other.getChallengeMaxScore());
        }
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
        }
        if (other.getIsInTimeLimit() != false) {
          setIsInTimeLimit(other.getIsInTimeLimit());
        }
        if (other.getChallengeId() != 0) {
          setChallengeId(other.getChallengeId());
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
        emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int challengeScore_ ;
      /**
       * <code>uint32 challenge_score = 12;</code>
       * @return The challengeScore.
       */
      @java.lang.Override
      public int getChallengeScore() {
        return challengeScore_;
      }
      /**
       * <code>uint32 challenge_score = 12;</code>
       * @param value The challengeScore to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeScore(int value) {
        
        challengeScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_score = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeScore() {
        
        challengeScore_ = 0;
        onChanged();
        return this;
      }

      private int challengeMaxScore_ ;
      /**
       * <code>uint32 challenge_max_score = 8;</code>
       * @return The challengeMaxScore.
       */
      @java.lang.Override
      public int getChallengeMaxScore() {
        return challengeMaxScore_;
      }
      /**
       * <code>uint32 challenge_max_score = 8;</code>
       * @param value The challengeMaxScore to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeMaxScore(int value) {
        
        challengeMaxScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_max_score = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeMaxScore() {
        
        challengeMaxScore_ = 0;
        onChanged();
        return this;
      }

      private boolean isSuccess_ ;
      /**
       * <code>bool is_success = 2;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool is_success = 2;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */
      public Builder setIsSuccess(boolean value) {
        
        isSuccess_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_success = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {
        
        isSuccess_ = false;
        onChanged();
        return this;
      }

      private boolean isInTimeLimit_ ;
      /**
       * <code>bool is_in_time_limit = 1;</code>
       * @return The isInTimeLimit.
       */
      @java.lang.Override
      public boolean getIsInTimeLimit() {
        return isInTimeLimit_;
      }
      /**
       * <code>bool is_in_time_limit = 1;</code>
       * @param value The isInTimeLimit to set.
       * @return This builder for chaining.
       */
      public Builder setIsInTimeLimit(boolean value) {
        
        isInTimeLimit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_in_time_limit = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsInTimeLimit() {
        
        isInTimeLimit_ = false;
        onChanged();
        return this;
      }

      private int challengeId_ ;
      /**
       * <code>uint32 challenge_id = 15;</code>
       * @return The challengeId.
       */
      @java.lang.Override
      public int getChallengeId() {
        return challengeId_;
      }
      /**
       * <code>uint32 challenge_id = 15;</code>
       * @param value The challengeId to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeId(int value) {
        
        challengeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeId() {
        
        challengeId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EffigyChallengeDungeonResultInfo)
    }

    // @@protoc_insertion_point(class_scope:EffigyChallengeDungeonResultInfo)
    private static final emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo();
    }

    public static emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EffigyChallengeDungeonResultInfo>
        PARSER = new com.google.protobuf.AbstractParser<EffigyChallengeDungeonResultInfo>() {
      @java.lang.Override
      public EffigyChallengeDungeonResultInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EffigyChallengeDungeonResultInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EffigyChallengeDungeonResultInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EffigyChallengeDungeonResultInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EffigyChallengeDungeonResultInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EffigyChallengeDungeonResultInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&EffigyChallengeDungeonResultInfo.proto" +
      "\"\234\001\n EffigyChallengeDungeonResultInfo\022\027\n" +
      "\017challenge_score\030\014 \001(\r\022\033\n\023challenge_max_" +
      "score\030\010 \001(\r\022\022\n\nis_success\030\002 \001(\010\022\030\n\020is_in" +
      "_time_limit\030\001 \001(\010\022\024\n\014challenge_id\030\017 \001(\rB" +
      "\033\n\031emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EffigyChallengeDungeonResultInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EffigyChallengeDungeonResultInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EffigyChallengeDungeonResultInfo_descriptor,
        new java.lang.String[] { "ChallengeScore", "ChallengeMaxScore", "IsSuccess", "IsInTimeLimit", "ChallengeId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
