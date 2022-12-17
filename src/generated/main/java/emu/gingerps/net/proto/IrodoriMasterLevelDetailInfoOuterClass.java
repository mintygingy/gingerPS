// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IrodoriMasterLevelDetailInfo.proto

package emu.gingerps.net.proto;

public final class IrodoriMasterLevelDetailInfoOuterClass {
  private IrodoriMasterLevelDetailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IrodoriMasterLevelDetailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IrodoriMasterLevelDetailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_finish = 10;</code>
     * @return The isFinish.
     */
    boolean getIsFinish();

    /**
     * <code>uint32 difficulty = 11;</code>
     * @return The difficulty.
     */
    int getDifficulty();

    /**
     * <code>bool is_have_try = 15;</code>
     * @return The isHaveTry.
     */
    boolean getIsHaveTry();

    /**
     * <code>uint32 min_finish_time = 12;</code>
     * @return The minFinishTime.
     */
    int getMinFinishTime();
  }
  /**
   * Protobuf type {@code IrodoriMasterLevelDetailInfo}
   */
  public static final class IrodoriMasterLevelDetailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IrodoriMasterLevelDetailInfo)
      IrodoriMasterLevelDetailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IrodoriMasterLevelDetailInfo.newBuilder() to construct.
    private IrodoriMasterLevelDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IrodoriMasterLevelDetailInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IrodoriMasterLevelDetailInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.internal_static_IrodoriMasterLevelDetailInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.internal_static_IrodoriMasterLevelDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.class, emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.Builder.class);
    }

    public static final int IS_FINISH_FIELD_NUMBER = 10;
    private boolean isFinish_ = false;
    /**
     * <code>bool is_finish = 10;</code>
     * @return The isFinish.
     */
    @java.lang.Override
    public boolean getIsFinish() {
      return isFinish_;
    }

    public static final int DIFFICULTY_FIELD_NUMBER = 11;
    private int difficulty_ = 0;
    /**
     * <code>uint32 difficulty = 11;</code>
     * @return The difficulty.
     */
    @java.lang.Override
    public int getDifficulty() {
      return difficulty_;
    }

    public static final int IS_HAVE_TRY_FIELD_NUMBER = 15;
    private boolean isHaveTry_ = false;
    /**
     * <code>bool is_have_try = 15;</code>
     * @return The isHaveTry.
     */
    @java.lang.Override
    public boolean getIsHaveTry() {
      return isHaveTry_;
    }

    public static final int MIN_FINISH_TIME_FIELD_NUMBER = 12;
    private int minFinishTime_ = 0;
    /**
     * <code>uint32 min_finish_time = 12;</code>
     * @return The minFinishTime.
     */
    @java.lang.Override
    public int getMinFinishTime() {
      return minFinishTime_;
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
      if (isFinish_ != false) {
        output.writeBool(10, isFinish_);
      }
      if (difficulty_ != 0) {
        output.writeUInt32(11, difficulty_);
      }
      if (minFinishTime_ != 0) {
        output.writeUInt32(12, minFinishTime_);
      }
      if (isHaveTry_ != false) {
        output.writeBool(15, isHaveTry_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isFinish_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isFinish_);
      }
      if (difficulty_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, difficulty_);
      }
      if (minFinishTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, minFinishTime_);
      }
      if (isHaveTry_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isHaveTry_);
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
      if (!(obj instanceof emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo other = (emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo) obj;

      if (getIsFinish()
          != other.getIsFinish()) return false;
      if (getDifficulty()
          != other.getDifficulty()) return false;
      if (getIsHaveTry()
          != other.getIsHaveTry()) return false;
      if (getMinFinishTime()
          != other.getMinFinishTime()) return false;
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
      hash = (37 * hash) + IS_FINISH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinish());
      hash = (37 * hash) + DIFFICULTY_FIELD_NUMBER;
      hash = (53 * hash) + getDifficulty();
      hash = (37 * hash) + IS_HAVE_TRY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsHaveTry());
      hash = (37 * hash) + MIN_FINISH_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getMinFinishTime();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo prototype) {
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
     * Protobuf type {@code IrodoriMasterLevelDetailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IrodoriMasterLevelDetailInfo)
        emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.internal_static_IrodoriMasterLevelDetailInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.internal_static_IrodoriMasterLevelDetailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.class, emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.newBuilder()
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
        isFinish_ = false;
        difficulty_ = 0;
        isHaveTry_ = false;
        minFinishTime_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.internal_static_IrodoriMasterLevelDetailInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo build() {
        emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo buildPartial() {
        emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo result = new emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isFinish_ = isFinish_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.difficulty_ = difficulty_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.isHaveTry_ = isHaveTry_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.minFinishTime_ = minFinishTime_;
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
        if (other instanceof emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo) {
          return mergeFrom((emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo other) {
        if (other == emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.getDefaultInstance()) return this;
        if (other.getIsFinish() != false) {
          setIsFinish(other.getIsFinish());
        }
        if (other.getDifficulty() != 0) {
          setDifficulty(other.getDifficulty());
        }
        if (other.getIsHaveTry() != false) {
          setIsHaveTry(other.getIsHaveTry());
        }
        if (other.getMinFinishTime() != 0) {
          setMinFinishTime(other.getMinFinishTime());
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
              case 80: {
                isFinish_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 80
              case 88: {
                difficulty_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 88
              case 96: {
                minFinishTime_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 96
              case 120: {
                isHaveTry_ = input.readBool();
                bitField0_ |= 0x00000004;
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

      private boolean isFinish_ ;
      /**
       * <code>bool is_finish = 10;</code>
       * @return The isFinish.
       */
      @java.lang.Override
      public boolean getIsFinish() {
        return isFinish_;
      }
      /**
       * <code>bool is_finish = 10;</code>
       * @param value The isFinish to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinish(boolean value) {
        
        isFinish_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finish = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinish() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isFinish_ = false;
        onChanged();
        return this;
      }

      private int difficulty_ ;
      /**
       * <code>uint32 difficulty = 11;</code>
       * @return The difficulty.
       */
      @java.lang.Override
      public int getDifficulty() {
        return difficulty_;
      }
      /**
       * <code>uint32 difficulty = 11;</code>
       * @param value The difficulty to set.
       * @return This builder for chaining.
       */
      public Builder setDifficulty(int value) {
        
        difficulty_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 difficulty = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficulty() {
        bitField0_ = (bitField0_ & ~0x00000002);
        difficulty_ = 0;
        onChanged();
        return this;
      }

      private boolean isHaveTry_ ;
      /**
       * <code>bool is_have_try = 15;</code>
       * @return The isHaveTry.
       */
      @java.lang.Override
      public boolean getIsHaveTry() {
        return isHaveTry_;
      }
      /**
       * <code>bool is_have_try = 15;</code>
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
       * <code>bool is_have_try = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsHaveTry() {
        bitField0_ = (bitField0_ & ~0x00000004);
        isHaveTry_ = false;
        onChanged();
        return this;
      }

      private int minFinishTime_ ;
      /**
       * <code>uint32 min_finish_time = 12;</code>
       * @return The minFinishTime.
       */
      @java.lang.Override
      public int getMinFinishTime() {
        return minFinishTime_;
      }
      /**
       * <code>uint32 min_finish_time = 12;</code>
       * @param value The minFinishTime to set.
       * @return This builder for chaining.
       */
      public Builder setMinFinishTime(int value) {
        
        minFinishTime_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 min_finish_time = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearMinFinishTime() {
        bitField0_ = (bitField0_ & ~0x00000008);
        minFinishTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:IrodoriMasterLevelDetailInfo)
    }

    // @@protoc_insertion_point(class_scope:IrodoriMasterLevelDetailInfo)
    private static final emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo();
    }

    public static emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IrodoriMasterLevelDetailInfo>
        PARSER = new com.google.protobuf.AbstractParser<IrodoriMasterLevelDetailInfo>() {
      @java.lang.Override
      public IrodoriMasterLevelDetailInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<IrodoriMasterLevelDetailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IrodoriMasterLevelDetailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IrodoriMasterLevelDetailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IrodoriMasterLevelDetailInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"IrodoriMasterLevelDetailInfo.proto\"s\n\034" +
      "IrodoriMasterLevelDetailInfo\022\021\n\tis_finis" +
      "h\030\n \001(\010\022\022\n\ndifficulty\030\013 \001(\r\022\023\n\013is_have_t" +
      "ry\030\017 \001(\010\022\027\n\017min_finish_time\030\014 \001(\rB\030\n\026emu" +
      ".gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_IrodoriMasterLevelDetailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IrodoriMasterLevelDetailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IrodoriMasterLevelDetailInfo_descriptor,
        new java.lang.String[] { "IsFinish", "Difficulty", "IsHaveTry", "MinFinishTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
