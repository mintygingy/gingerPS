// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RogueDiaryStageInfo.proto

package emu.gingerps.net.proto;

public final class RogueDiaryStageInfoOuterClass {
  private RogueDiaryStageInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RogueDiaryStageInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RogueDiaryStageInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 stage_id = 15;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>.RogueDiaryDungeonRecord best_record = 9;</code>
     * @return Whether the bestRecord field is set.
     */
    boolean hasBestRecord();
    /**
     * <code>.RogueDiaryDungeonRecord best_record = 9;</code>
     * @return The bestRecord.
     */
    emu.gingerps.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord getBestRecord();
    /**
     * <code>.RogueDiaryDungeonRecord best_record = 9;</code>
     */
    emu.gingerps.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecordOrBuilder getBestRecordOrBuilder();

    /**
     * <code>bool is_have_try = 11;</code>
     * @return The isHaveTry.
     */
    boolean getIsHaveTry();
  }
  /**
   * Protobuf type {@code RogueDiaryStageInfo}
   */
  public static final class RogueDiaryStageInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RogueDiaryStageInfo)
      RogueDiaryStageInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RogueDiaryStageInfo.newBuilder() to construct.
    private RogueDiaryStageInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RogueDiaryStageInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RogueDiaryStageInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.internal_static_RogueDiaryStageInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.internal_static_RogueDiaryStageInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo.class, emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo.Builder.class);
    }

    public static final int STAGE_ID_FIELD_NUMBER = 15;
    private int stageId_ = 0;
    /**
     * <code>uint32 stage_id = 15;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int BEST_RECORD_FIELD_NUMBER = 9;
    private emu.gingerps.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord bestRecord_;
    /**
     * <code>.RogueDiaryDungeonRecord best_record = 9;</code>
     * @return Whether the bestRecord field is set.
     */
    @java.lang.Override
    public boolean hasBestRecord() {
      return bestRecord_ != null;
    }
    /**
     * <code>.RogueDiaryDungeonRecord best_record = 9;</code>
     * @return The bestRecord.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord getBestRecord() {
      return bestRecord_ == null ? emu.gingerps.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord.getDefaultInstance() : bestRecord_;
    }
    /**
     * <code>.RogueDiaryDungeonRecord best_record = 9;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecordOrBuilder getBestRecordOrBuilder() {
      return bestRecord_ == null ? emu.gingerps.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord.getDefaultInstance() : bestRecord_;
    }

    public static final int IS_HAVE_TRY_FIELD_NUMBER = 11;
    private boolean isHaveTry_ = false;
    /**
     * <code>bool is_have_try = 11;</code>
     * @return The isHaveTry.
     */
    @java.lang.Override
    public boolean getIsHaveTry() {
      return isHaveTry_;
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
      if (bestRecord_ != null) {
        output.writeMessage(9, getBestRecord());
      }
      if (isHaveTry_ != false) {
        output.writeBool(11, isHaveTry_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(15, stageId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (bestRecord_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, getBestRecord());
      }
      if (isHaveTry_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, isHaveTry_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, stageId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo other = (emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo) obj;

      if (getStageId()
          != other.getStageId()) return false;
      if (hasBestRecord() != other.hasBestRecord()) return false;
      if (hasBestRecord()) {
        if (!getBestRecord()
            .equals(other.getBestRecord())) return false;
      }
      if (getIsHaveTry()
          != other.getIsHaveTry()) return false;
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
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      if (hasBestRecord()) {
        hash = (37 * hash) + BEST_RECORD_FIELD_NUMBER;
        hash = (53 * hash) + getBestRecord().hashCode();
      }
      hash = (37 * hash) + IS_HAVE_TRY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsHaveTry());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo prototype) {
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
     * Protobuf type {@code RogueDiaryStageInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RogueDiaryStageInfo)
        emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.internal_static_RogueDiaryStageInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.internal_static_RogueDiaryStageInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo.class, emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo.newBuilder()
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
        stageId_ = 0;
        bestRecord_ = null;
        if (bestRecordBuilder_ != null) {
          bestRecordBuilder_.dispose();
          bestRecordBuilder_ = null;
        }
        isHaveTry_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.internal_static_RogueDiaryStageInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo build() {
        emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo buildPartial() {
        emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo result = new emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.stageId_ = stageId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.bestRecord_ = bestRecordBuilder_ == null
              ? bestRecord_
              : bestRecordBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.isHaveTry_ = isHaveTry_;
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
        if (other instanceof emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo) {
          return mergeFrom((emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo other) {
        if (other == emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo.getDefaultInstance()) return this;
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.hasBestRecord()) {
          mergeBestRecord(other.getBestRecord());
        }
        if (other.getIsHaveTry() != false) {
          setIsHaveTry(other.getIsHaveTry());
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
              case 74: {
                input.readMessage(
                    getBestRecordFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 74
              case 88: {
                isHaveTry_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 88
              case 120: {
                stageId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 120
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

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 15;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 15;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        stageId_ = 0;
        onChanged();
        return this;
      }

      private emu.gingerps.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord bestRecord_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord, emu.gingerps.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord.Builder, emu.gingerps.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecordOrBuilder> bestRecordBuilder_;
      /**
       * <code>.RogueDiaryDungeonRecord best_record = 9;</code>
       * @return Whether the bestRecord field is set.
       */
      public boolean hasBestRecord() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.RogueDiaryDungeonRecord best_record = 9;</code>
       * @return The bestRecord.
       */
      public emu.gingerps.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord getBestRecord() {
        if (bestRecordBuilder_ == null) {
          return bestRecord_ == null ? emu.gingerps.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord.getDefaultInstance() : bestRecord_;
        } else {
          return bestRecordBuilder_.getMessage();
        }
      }
      /**
       * <code>.RogueDiaryDungeonRecord best_record = 9;</code>
       */
      public Builder setBestRecord(emu.gingerps.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord value) {
        if (bestRecordBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          bestRecord_ = value;
        } else {
          bestRecordBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.RogueDiaryDungeonRecord best_record = 9;</code>
       */
      public Builder setBestRecord(
          emu.gingerps.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord.Builder builderForValue) {
        if (bestRecordBuilder_ == null) {
          bestRecord_ = builderForValue.build();
        } else {
          bestRecordBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.RogueDiaryDungeonRecord best_record = 9;</code>
       */
      public Builder mergeBestRecord(emu.gingerps.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord value) {
        if (bestRecordBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            bestRecord_ != null &&
            bestRecord_ != emu.gingerps.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord.getDefaultInstance()) {
            getBestRecordBuilder().mergeFrom(value);
          } else {
            bestRecord_ = value;
          }
        } else {
          bestRecordBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.RogueDiaryDungeonRecord best_record = 9;</code>
       */
      public Builder clearBestRecord() {
        bitField0_ = (bitField0_ & ~0x00000002);
        bestRecord_ = null;
        if (bestRecordBuilder_ != null) {
          bestRecordBuilder_.dispose();
          bestRecordBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.RogueDiaryDungeonRecord best_record = 9;</code>
       */
      public emu.gingerps.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord.Builder getBestRecordBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getBestRecordFieldBuilder().getBuilder();
      }
      /**
       * <code>.RogueDiaryDungeonRecord best_record = 9;</code>
       */
      public emu.gingerps.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecordOrBuilder getBestRecordOrBuilder() {
        if (bestRecordBuilder_ != null) {
          return bestRecordBuilder_.getMessageOrBuilder();
        } else {
          return bestRecord_ == null ?
              emu.gingerps.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord.getDefaultInstance() : bestRecord_;
        }
      }
      /**
       * <code>.RogueDiaryDungeonRecord best_record = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord, emu.gingerps.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord.Builder, emu.gingerps.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecordOrBuilder> 
          getBestRecordFieldBuilder() {
        if (bestRecordBuilder_ == null) {
          bestRecordBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord, emu.gingerps.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecord.Builder, emu.gingerps.net.proto.RogueDiaryDungeonRecordOuterClass.RogueDiaryDungeonRecordOrBuilder>(
                  getBestRecord(),
                  getParentForChildren(),
                  isClean());
          bestRecord_ = null;
        }
        return bestRecordBuilder_;
      }

      private boolean isHaveTry_ ;
      /**
       * <code>bool is_have_try = 11;</code>
       * @return The isHaveTry.
       */
      @java.lang.Override
      public boolean getIsHaveTry() {
        return isHaveTry_;
      }
      /**
       * <code>bool is_have_try = 11;</code>
       * @param value The isHaveTry to set.
       * @return This builder for chaining.
       */
      public Builder setIsHaveTry(boolean value) {
        
        isHaveTry_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_have_try = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsHaveTry() {
        bitField0_ = (bitField0_ & ~0x00000004);
        isHaveTry_ = false;
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


      // @@protoc_insertion_point(builder_scope:RogueDiaryStageInfo)
    }

    // @@protoc_insertion_point(class_scope:RogueDiaryStageInfo)
    private static final emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo();
    }

    public static emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RogueDiaryStageInfo>
        PARSER = new com.google.protobuf.AbstractParser<RogueDiaryStageInfo>() {
      @java.lang.Override
      public RogueDiaryStageInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<RogueDiaryStageInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RogueDiaryStageInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.RogueDiaryStageInfoOuterClass.RogueDiaryStageInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RogueDiaryStageInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RogueDiaryStageInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031RogueDiaryStageInfo.proto\032\035RogueDiaryD" +
      "ungeonRecord.proto\"k\n\023RogueDiaryStageInf" +
      "o\022\020\n\010stage_id\030\017 \001(\r\022-\n\013best_record\030\t \001(\013" +
      "2\030.RogueDiaryDungeonRecord\022\023\n\013is_have_tr" +
      "y\030\013 \001(\010B\030\n\026emu.gingerps.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.RogueDiaryDungeonRecordOuterClass.getDescriptor(),
        });
    internal_static_RogueDiaryStageInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RogueDiaryStageInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RogueDiaryStageInfo_descriptor,
        new java.lang.String[] { "StageId", "BestRecord", "IsHaveTry", });
    emu.gingerps.net.proto.RogueDiaryDungeonRecordOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
