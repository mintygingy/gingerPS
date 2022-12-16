// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FlightActivitySettleNotify.proto

package emu.gingerps.net.proto;

public final class FlightActivitySettleNotifyOuterClass {
  private FlightActivitySettleNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FlightActivitySettleNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FlightActivitySettleNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 left_time = 10;</code>
     * @return The leftTime.
     */
    int getLeftTime();

    /**
     * <code>uint32 total_num = 6;</code>
     * @return The totalNum.
     */
    int getTotalNum();

    /**
     * <code>uint32 group_id = 13;</code>
     * @return The groupId.
     */
    int getGroupId();

    /**
     * <code>uint32 score = 15;</code>
     * @return The score.
     */
    int getScore();

    /**
     * <code>uint32 Unk3300_MEEKFJJIOKE = 9;</code>
     * @return The unk3300MEEKFJJIOKE.
     */
    int getUnk3300MEEKFJJIOKE();

    /**
     * <code>bool is_new_record = 4;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();

    /**
     * <code>bool is_success = 1;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();

    /**
     * <code>uint32 Unk3300_PLFMJPNPPLI = 11;</code>
     * @return The unk3300PLFMJPNPPLI.
     */
    int getUnk3300PLFMJPNPPLI();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 2143;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code FlightActivitySettleNotify}
   */
  public static final class FlightActivitySettleNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FlightActivitySettleNotify)
      FlightActivitySettleNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FlightActivitySettleNotify.newBuilder() to construct.
    private FlightActivitySettleNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FlightActivitySettleNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FlightActivitySettleNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FlightActivitySettleNotify(
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

              isSuccess_ = input.readBool();
              break;
            }
            case 32: {

              isNewRecord_ = input.readBool();
              break;
            }
            case 48: {

              totalNum_ = input.readUInt32();
              break;
            }
            case 72: {

              unk3300MEEKFJJIOKE_ = input.readUInt32();
              break;
            }
            case 80: {

              leftTime_ = input.readUInt32();
              break;
            }
            case 88: {

              unk3300PLFMJPNPPLI_ = input.readUInt32();
              break;
            }
            case 104: {

              groupId_ = input.readUInt32();
              break;
            }
            case 120: {

              score_ = input.readUInt32();
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
      return emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.internal_static_FlightActivitySettleNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.internal_static_FlightActivitySettleNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify.class, emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify.Builder.class);
    }

    public static final int LEFT_TIME_FIELD_NUMBER = 10;
    private int leftTime_;
    /**
     * <code>uint32 left_time = 10;</code>
     * @return The leftTime.
     */
    @java.lang.Override
    public int getLeftTime() {
      return leftTime_;
    }

    public static final int TOTAL_NUM_FIELD_NUMBER = 6;
    private int totalNum_;
    /**
     * <code>uint32 total_num = 6;</code>
     * @return The totalNum.
     */
    @java.lang.Override
    public int getTotalNum() {
      return totalNum_;
    }

    public static final int GROUP_ID_FIELD_NUMBER = 13;
    private int groupId_;
    /**
     * <code>uint32 group_id = 13;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
    }

    public static final int SCORE_FIELD_NUMBER = 15;
    private int score_;
    /**
     * <code>uint32 score = 15;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
    }

    public static final int UNK3300_MEEKFJJIOKE_FIELD_NUMBER = 9;
    private int unk3300MEEKFJJIOKE_;
    /**
     * <code>uint32 Unk3300_MEEKFJJIOKE = 9;</code>
     * @return The unk3300MEEKFJJIOKE.
     */
    @java.lang.Override
    public int getUnk3300MEEKFJJIOKE() {
      return unk3300MEEKFJJIOKE_;
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 4;
    private boolean isNewRecord_;
    /**
     * <code>bool is_new_record = 4;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
    }

    public static final int IS_SUCCESS_FIELD_NUMBER = 1;
    private boolean isSuccess_;
    /**
     * <code>bool is_success = 1;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
    }

    public static final int UNK3300_PLFMJPNPPLI_FIELD_NUMBER = 11;
    private int unk3300PLFMJPNPPLI_;
    /**
     * <code>uint32 Unk3300_PLFMJPNPPLI = 11;</code>
     * @return The unk3300PLFMJPNPPLI.
     */
    @java.lang.Override
    public int getUnk3300PLFMJPNPPLI() {
      return unk3300PLFMJPNPPLI_;
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
      if (isSuccess_ != false) {
        output.writeBool(1, isSuccess_);
      }
      if (isNewRecord_ != false) {
        output.writeBool(4, isNewRecord_);
      }
      if (totalNum_ != 0) {
        output.writeUInt32(6, totalNum_);
      }
      if (unk3300MEEKFJJIOKE_ != 0) {
        output.writeUInt32(9, unk3300MEEKFJJIOKE_);
      }
      if (leftTime_ != 0) {
        output.writeUInt32(10, leftTime_);
      }
      if (unk3300PLFMJPNPPLI_ != 0) {
        output.writeUInt32(11, unk3300PLFMJPNPPLI_);
      }
      if (groupId_ != 0) {
        output.writeUInt32(13, groupId_);
      }
      if (score_ != 0) {
        output.writeUInt32(15, score_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isSuccess_);
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isNewRecord_);
      }
      if (totalNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, totalNum_);
      }
      if (unk3300MEEKFJJIOKE_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, unk3300MEEKFJJIOKE_);
      }
      if (leftTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, leftTime_);
      }
      if (unk3300PLFMJPNPPLI_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, unk3300PLFMJPNPPLI_);
      }
      if (groupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, groupId_);
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, score_);
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
      if (!(obj instanceof emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify other = (emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify) obj;

      if (getLeftTime()
          != other.getLeftTime()) return false;
      if (getTotalNum()
          != other.getTotalNum()) return false;
      if (getGroupId()
          != other.getGroupId()) return false;
      if (getScore()
          != other.getScore()) return false;
      if (getUnk3300MEEKFJJIOKE()
          != other.getUnk3300MEEKFJJIOKE()) return false;
      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
      if (getIsSuccess()
          != other.getIsSuccess()) return false;
      if (getUnk3300PLFMJPNPPLI()
          != other.getUnk3300PLFMJPNPPLI()) return false;
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
      hash = (37 * hash) + LEFT_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getLeftTime();
      hash = (37 * hash) + TOTAL_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getTotalNum();
      hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId();
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      hash = (37 * hash) + UNK3300_MEEKFJJIOKE_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300MEEKFJJIOKE();
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (37 * hash) + UNK3300_PLFMJPNPPLI_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300PLFMJPNPPLI();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify prototype) {
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
     *   CMD_ID = 2143;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code FlightActivitySettleNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FlightActivitySettleNotify)
        emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.internal_static_FlightActivitySettleNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.internal_static_FlightActivitySettleNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify.class, emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify.newBuilder()
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
        leftTime_ = 0;

        totalNum_ = 0;

        groupId_ = 0;

        score_ = 0;

        unk3300MEEKFJJIOKE_ = 0;

        isNewRecord_ = false;

        isSuccess_ = false;

        unk3300PLFMJPNPPLI_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.internal_static_FlightActivitySettleNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify build() {
        emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify buildPartial() {
        emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify result = new emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify(this);
        result.leftTime_ = leftTime_;
        result.totalNum_ = totalNum_;
        result.groupId_ = groupId_;
        result.score_ = score_;
        result.unk3300MEEKFJJIOKE_ = unk3300MEEKFJJIOKE_;
        result.isNewRecord_ = isNewRecord_;
        result.isSuccess_ = isSuccess_;
        result.unk3300PLFMJPNPPLI_ = unk3300PLFMJPNPPLI_;
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
        if (other instanceof emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify) {
          return mergeFrom((emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify other) {
        if (other == emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify.getDefaultInstance()) return this;
        if (other.getLeftTime() != 0) {
          setLeftTime(other.getLeftTime());
        }
        if (other.getTotalNum() != 0) {
          setTotalNum(other.getTotalNum());
        }
        if (other.getGroupId() != 0) {
          setGroupId(other.getGroupId());
        }
        if (other.getScore() != 0) {
          setScore(other.getScore());
        }
        if (other.getUnk3300MEEKFJJIOKE() != 0) {
          setUnk3300MEEKFJJIOKE(other.getUnk3300MEEKFJJIOKE());
        }
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
        }
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
        }
        if (other.getUnk3300PLFMJPNPPLI() != 0) {
          setUnk3300PLFMJPNPPLI(other.getUnk3300PLFMJPNPPLI());
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
        emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int leftTime_ ;
      /**
       * <code>uint32 left_time = 10;</code>
       * @return The leftTime.
       */
      @java.lang.Override
      public int getLeftTime() {
        return leftTime_;
      }
      /**
       * <code>uint32 left_time = 10;</code>
       * @param value The leftTime to set.
       * @return This builder for chaining.
       */
      public Builder setLeftTime(int value) {
        
        leftTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 left_time = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearLeftTime() {
        
        leftTime_ = 0;
        onChanged();
        return this;
      }

      private int totalNum_ ;
      /**
       * <code>uint32 total_num = 6;</code>
       * @return The totalNum.
       */
      @java.lang.Override
      public int getTotalNum() {
        return totalNum_;
      }
      /**
       * <code>uint32 total_num = 6;</code>
       * @param value The totalNum to set.
       * @return This builder for chaining.
       */
      public Builder setTotalNum(int value) {
        
        totalNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 total_num = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalNum() {
        
        totalNum_ = 0;
        onChanged();
        return this;
      }

      private int groupId_ ;
      /**
       * <code>uint32 group_id = 13;</code>
       * @return The groupId.
       */
      @java.lang.Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 group_id = 13;</code>
       * @param value The groupId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {
        
        groupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 group_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupId() {
        
        groupId_ = 0;
        onChanged();
        return this;
      }

      private int score_ ;
      /**
       * <code>uint32 score = 15;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 15;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0;
        onChanged();
        return this;
      }

      private int unk3300MEEKFJJIOKE_ ;
      /**
       * <code>uint32 Unk3300_MEEKFJJIOKE = 9;</code>
       * @return The unk3300MEEKFJJIOKE.
       */
      @java.lang.Override
      public int getUnk3300MEEKFJJIOKE() {
        return unk3300MEEKFJJIOKE_;
      }
      /**
       * <code>uint32 Unk3300_MEEKFJJIOKE = 9;</code>
       * @param value The unk3300MEEKFJJIOKE to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300MEEKFJJIOKE(int value) {
        
        unk3300MEEKFJJIOKE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_MEEKFJJIOKE = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300MEEKFJJIOKE() {
        
        unk3300MEEKFJJIOKE_ = 0;
        onChanged();
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 4;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 4;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        
        isNewRecord_ = false;
        onChanged();
        return this;
      }

      private boolean isSuccess_ ;
      /**
       * <code>bool is_success = 1;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool is_success = 1;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */
      public Builder setIsSuccess(boolean value) {
        
        isSuccess_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_success = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {
        
        isSuccess_ = false;
        onChanged();
        return this;
      }

      private int unk3300PLFMJPNPPLI_ ;
      /**
       * <code>uint32 Unk3300_PLFMJPNPPLI = 11;</code>
       * @return The unk3300PLFMJPNPPLI.
       */
      @java.lang.Override
      public int getUnk3300PLFMJPNPPLI() {
        return unk3300PLFMJPNPPLI_;
      }
      /**
       * <code>uint32 Unk3300_PLFMJPNPPLI = 11;</code>
       * @param value The unk3300PLFMJPNPPLI to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300PLFMJPNPPLI(int value) {
        
        unk3300PLFMJPNPPLI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_PLFMJPNPPLI = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300PLFMJPNPPLI() {
        
        unk3300PLFMJPNPPLI_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FlightActivitySettleNotify)
    }

    // @@protoc_insertion_point(class_scope:FlightActivitySettleNotify)
    private static final emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify();
    }

    public static emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FlightActivitySettleNotify>
        PARSER = new com.google.protobuf.AbstractParser<FlightActivitySettleNotify>() {
      @java.lang.Override
      public FlightActivitySettleNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FlightActivitySettleNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FlightActivitySettleNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FlightActivitySettleNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.FlightActivitySettleNotifyOuterClass.FlightActivitySettleNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FlightActivitySettleNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FlightActivitySettleNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n FlightActivitySettleNotify.proto\"\310\001\n\032F" +
      "lightActivitySettleNotify\022\021\n\tleft_time\030\n" +
      " \001(\r\022\021\n\ttotal_num\030\006 \001(\r\022\020\n\010group_id\030\r \001(" +
      "\r\022\r\n\005score\030\017 \001(\r\022\033\n\023Unk3300_MEEKFJJIOKE\030" +
      "\t \001(\r\022\025\n\ris_new_record\030\004 \001(\010\022\022\n\nis_succe" +
      "ss\030\001 \001(\010\022\033\n\023Unk3300_PLFMJPNPPLI\030\013 \001(\rB\033\n" +
      "\031emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FlightActivitySettleNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FlightActivitySettleNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FlightActivitySettleNotify_descriptor,
        new java.lang.String[] { "LeftTime", "TotalNum", "GroupId", "Score", "Unk3300MEEKFJJIOKE", "IsNewRecord", "IsSuccess", "Unk3300PLFMJPNPPLI", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
