// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AsterLittleDetailInfo.proto

package emu.gingerps.net.proto;

public final class AsterLittleDetailInfoOuterClass {
  private AsterLittleDetailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AsterLittleDetailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AsterLittleDetailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 stage_begin_time = 9;</code>
     * @return The stageBeginTime.
     */
    int getStageBeginTime();

    /**
     * <code>bool is_open = 8;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>.AsterLittleStageState stage_state = 5;</code>
     * @return The enum numeric value on the wire for stageState.
     */
    int getStageStateValue();
    /**
     * <code>.AsterLittleStageState stage_state = 5;</code>
     * @return The stageState.
     */
    emu.gingerps.net.proto.AsterLittleStageStateOuterClass.AsterLittleStageState getStageState();

    /**
     * <code>uint32 stage_id = 14;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>uint32 begin_time = 6;</code>
     * @return The beginTime.
     */
    int getBeginTime();
  }
  /**
   * Protobuf type {@code AsterLittleDetailInfo}
   */
  public static final class AsterLittleDetailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AsterLittleDetailInfo)
      AsterLittleDetailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AsterLittleDetailInfo.newBuilder() to construct.
    private AsterLittleDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AsterLittleDetailInfo() {
      stageState_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AsterLittleDetailInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.internal_static_AsterLittleDetailInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.internal_static_AsterLittleDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo.class, emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo.Builder.class);
    }

    public static final int STAGE_BEGIN_TIME_FIELD_NUMBER = 9;
    private int stageBeginTime_ = 0;
    /**
     * <code>uint32 stage_begin_time = 9;</code>
     * @return The stageBeginTime.
     */
    @java.lang.Override
    public int getStageBeginTime() {
      return stageBeginTime_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 8;
    private boolean isOpen_ = false;
    /**
     * <code>bool is_open = 8;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int STAGE_STATE_FIELD_NUMBER = 5;
    private int stageState_ = 0;
    /**
     * <code>.AsterLittleStageState stage_state = 5;</code>
     * @return The enum numeric value on the wire for stageState.
     */
    @java.lang.Override public int getStageStateValue() {
      return stageState_;
    }
    /**
     * <code>.AsterLittleStageState stage_state = 5;</code>
     * @return The stageState.
     */
    @java.lang.Override public emu.gingerps.net.proto.AsterLittleStageStateOuterClass.AsterLittleStageState getStageState() {
      emu.gingerps.net.proto.AsterLittleStageStateOuterClass.AsterLittleStageState result = emu.gingerps.net.proto.AsterLittleStageStateOuterClass.AsterLittleStageState.forNumber(stageState_);
      return result == null ? emu.gingerps.net.proto.AsterLittleStageStateOuterClass.AsterLittleStageState.UNRECOGNIZED : result;
    }

    public static final int STAGE_ID_FIELD_NUMBER = 14;
    private int stageId_ = 0;
    /**
     * <code>uint32 stage_id = 14;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int BEGIN_TIME_FIELD_NUMBER = 6;
    private int beginTime_ = 0;
    /**
     * <code>uint32 begin_time = 6;</code>
     * @return The beginTime.
     */
    @java.lang.Override
    public int getBeginTime() {
      return beginTime_;
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
      if (stageState_ != emu.gingerps.net.proto.AsterLittleStageStateOuterClass.AsterLittleStageState.ASTER_LITTLE_STAGE_STATE_NONE.getNumber()) {
        output.writeEnum(5, stageState_);
      }
      if (beginTime_ != 0) {
        output.writeUInt32(6, beginTime_);
      }
      if (isOpen_ != false) {
        output.writeBool(8, isOpen_);
      }
      if (stageBeginTime_ != 0) {
        output.writeUInt32(9, stageBeginTime_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(14, stageId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (stageState_ != emu.gingerps.net.proto.AsterLittleStageStateOuterClass.AsterLittleStageState.ASTER_LITTLE_STAGE_STATE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, stageState_);
      }
      if (beginTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, beginTime_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, isOpen_);
      }
      if (stageBeginTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, stageBeginTime_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, stageId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo other = (emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo) obj;

      if (getStageBeginTime()
          != other.getStageBeginTime()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (stageState_ != other.stageState_) return false;
      if (getStageId()
          != other.getStageId()) return false;
      if (getBeginTime()
          != other.getBeginTime()) return false;
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
      hash = (37 * hash) + STAGE_BEGIN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStageBeginTime();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + STAGE_STATE_FIELD_NUMBER;
      hash = (53 * hash) + stageState_;
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + BEGIN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getBeginTime();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo prototype) {
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
     * Protobuf type {@code AsterLittleDetailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AsterLittleDetailInfo)
        emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.internal_static_AsterLittleDetailInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.internal_static_AsterLittleDetailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo.class, emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo.newBuilder()
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
        stageBeginTime_ = 0;
        isOpen_ = false;
        stageState_ = 0;
        stageId_ = 0;
        beginTime_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.internal_static_AsterLittleDetailInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo build() {
        emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo buildPartial() {
        emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo result = new emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.stageBeginTime_ = stageBeginTime_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isOpen_ = isOpen_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.stageState_ = stageState_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.stageId_ = stageId_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.beginTime_ = beginTime_;
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
        if (other instanceof emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo) {
          return mergeFrom((emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo other) {
        if (other == emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo.getDefaultInstance()) return this;
        if (other.getStageBeginTime() != 0) {
          setStageBeginTime(other.getStageBeginTime());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.stageState_ != 0) {
          setStageStateValue(other.getStageStateValue());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getBeginTime() != 0) {
          setBeginTime(other.getBeginTime());
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
              case 40: {
                stageState_ = input.readEnum();
                bitField0_ |= 0x00000004;
                break;
              } // case 40
              case 48: {
                beginTime_ = input.readUInt32();
                bitField0_ |= 0x00000010;
                break;
              } // case 48
              case 64: {
                isOpen_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 64
              case 72: {
                stageBeginTime_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 72
              case 112: {
                stageId_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 112
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

      private int stageBeginTime_ ;
      /**
       * <code>uint32 stage_begin_time = 9;</code>
       * @return The stageBeginTime.
       */
      @java.lang.Override
      public int getStageBeginTime() {
        return stageBeginTime_;
      }
      /**
       * <code>uint32 stage_begin_time = 9;</code>
       * @param value The stageBeginTime to set.
       * @return This builder for chaining.
       */
      public Builder setStageBeginTime(int value) {
        
        stageBeginTime_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_begin_time = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageBeginTime() {
        bitField0_ = (bitField0_ & ~0x00000001);
        stageBeginTime_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 8;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 8;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isOpen_ = false;
        onChanged();
        return this;
      }

      private int stageState_ = 0;
      /**
       * <code>.AsterLittleStageState stage_state = 5;</code>
       * @return The enum numeric value on the wire for stageState.
       */
      @java.lang.Override public int getStageStateValue() {
        return stageState_;
      }
      /**
       * <code>.AsterLittleStageState stage_state = 5;</code>
       * @param value The enum numeric value on the wire for stageState to set.
       * @return This builder for chaining.
       */
      public Builder setStageStateValue(int value) {
        stageState_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.AsterLittleStageState stage_state = 5;</code>
       * @return The stageState.
       */
      @java.lang.Override
      public emu.gingerps.net.proto.AsterLittleStageStateOuterClass.AsterLittleStageState getStageState() {
        emu.gingerps.net.proto.AsterLittleStageStateOuterClass.AsterLittleStageState result = emu.gingerps.net.proto.AsterLittleStageStateOuterClass.AsterLittleStageState.forNumber(stageState_);
        return result == null ? emu.gingerps.net.proto.AsterLittleStageStateOuterClass.AsterLittleStageState.UNRECOGNIZED : result;
      }
      /**
       * <code>.AsterLittleStageState stage_state = 5;</code>
       * @param value The stageState to set.
       * @return This builder for chaining.
       */
      public Builder setStageState(emu.gingerps.net.proto.AsterLittleStageStateOuterClass.AsterLittleStageState value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        stageState_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.AsterLittleStageState stage_state = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageState() {
        bitField0_ = (bitField0_ & ~0x00000004);
        stageState_ = 0;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 14;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 14;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        stageId_ = 0;
        onChanged();
        return this;
      }

      private int beginTime_ ;
      /**
       * <code>uint32 begin_time = 6;</code>
       * @return The beginTime.
       */
      @java.lang.Override
      public int getBeginTime() {
        return beginTime_;
      }
      /**
       * <code>uint32 begin_time = 6;</code>
       * @param value The beginTime to set.
       * @return This builder for chaining.
       */
      public Builder setBeginTime(int value) {
        
        beginTime_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 begin_time = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearBeginTime() {
        bitField0_ = (bitField0_ & ~0x00000010);
        beginTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AsterLittleDetailInfo)
    }

    // @@protoc_insertion_point(class_scope:AsterLittleDetailInfo)
    private static final emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo();
    }

    public static emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AsterLittleDetailInfo>
        PARSER = new com.google.protobuf.AbstractParser<AsterLittleDetailInfo>() {
      @java.lang.Override
      public AsterLittleDetailInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<AsterLittleDetailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AsterLittleDetailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.AsterLittleDetailInfoOuterClass.AsterLittleDetailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AsterLittleDetailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AsterLittleDetailInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033AsterLittleDetailInfo.proto\032\033AsterLitt" +
      "leStageState.proto\"\225\001\n\025AsterLittleDetail" +
      "Info\022\030\n\020stage_begin_time\030\t \001(\r\022\017\n\007is_ope" +
      "n\030\010 \001(\010\022+\n\013stage_state\030\005 \001(\0162\026.AsterLitt" +
      "leStageState\022\020\n\010stage_id\030\016 \001(\r\022\022\n\nbegin_" +
      "time\030\006 \001(\rB\030\n\026emu.gingerps.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.AsterLittleStageStateOuterClass.getDescriptor(),
        });
    internal_static_AsterLittleDetailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AsterLittleDetailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AsterLittleDetailInfo_descriptor,
        new java.lang.String[] { "StageBeginTime", "IsOpen", "StageState", "StageId", "BeginTime", });
    emu.gingerps.net.proto.AsterLittleStageStateOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
