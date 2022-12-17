// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ExpeditionTakeRewardRsp.proto

package emu.gingerps.net.proto;

public final class ExpeditionTakeRewardRspOuterClass {
  private ExpeditionTakeRewardRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ExpeditionTakeRewardRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ExpeditionTakeRewardRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 reward_level = 13;</code>
     * @return The rewardLevel.
     */
    int getRewardLevel();

    /**
     * <code>uint32 path_id = 12;</code>
     * @return The pathId.
     */
    int getPathId();

    /**
     * <code>bool is_bonus = 10;</code>
     * @return The isBonus.
     */
    boolean getIsBonus();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 2197;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ExpeditionTakeRewardRsp}
   */
  public static final class ExpeditionTakeRewardRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ExpeditionTakeRewardRsp)
      ExpeditionTakeRewardRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ExpeditionTakeRewardRsp.newBuilder() to construct.
    private ExpeditionTakeRewardRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ExpeditionTakeRewardRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ExpeditionTakeRewardRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.internal_static_ExpeditionTakeRewardRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.internal_static_ExpeditionTakeRewardRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp.class, emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 4;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int REWARD_LEVEL_FIELD_NUMBER = 13;
    private int rewardLevel_ = 0;
    /**
     * <code>uint32 reward_level = 13;</code>
     * @return The rewardLevel.
     */
    @java.lang.Override
    public int getRewardLevel() {
      return rewardLevel_;
    }

    public static final int PATH_ID_FIELD_NUMBER = 12;
    private int pathId_ = 0;
    /**
     * <code>uint32 path_id = 12;</code>
     * @return The pathId.
     */
    @java.lang.Override
    public int getPathId() {
      return pathId_;
    }

    public static final int IS_BONUS_FIELD_NUMBER = 10;
    private boolean isBonus_ = false;
    /**
     * <code>bool is_bonus = 10;</code>
     * @return The isBonus.
     */
    @java.lang.Override
    public boolean getIsBonus() {
      return isBonus_;
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
      if (retcode_ != 0) {
        output.writeInt32(4, retcode_);
      }
      if (isBonus_ != false) {
        output.writeBool(10, isBonus_);
      }
      if (pathId_ != 0) {
        output.writeUInt32(12, pathId_);
      }
      if (rewardLevel_ != 0) {
        output.writeUInt32(13, rewardLevel_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, retcode_);
      }
      if (isBonus_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isBonus_);
      }
      if (pathId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, pathId_);
      }
      if (rewardLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, rewardLevel_);
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
      if (!(obj instanceof emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp other = (emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getRewardLevel()
          != other.getRewardLevel()) return false;
      if (getPathId()
          != other.getPathId()) return false;
      if (getIsBonus()
          != other.getIsBonus()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + REWARD_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getRewardLevel();
      hash = (37 * hash) + PATH_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPathId();
      hash = (37 * hash) + IS_BONUS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsBonus());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp prototype) {
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
     *   CMD_ID = 2197;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ExpeditionTakeRewardRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ExpeditionTakeRewardRsp)
        emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.internal_static_ExpeditionTakeRewardRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.internal_static_ExpeditionTakeRewardRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp.class, emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp.newBuilder()
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
        retcode_ = 0;
        rewardLevel_ = 0;
        pathId_ = 0;
        isBonus_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.internal_static_ExpeditionTakeRewardRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp build() {
        emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp buildPartial() {
        emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp result = new emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.rewardLevel_ = rewardLevel_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.pathId_ = pathId_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.isBonus_ = isBonus_;
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
        if (other instanceof emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp) {
          return mergeFrom((emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp other) {
        if (other == emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getRewardLevel() != 0) {
          setRewardLevel(other.getRewardLevel());
        }
        if (other.getPathId() != 0) {
          setPathId(other.getPathId());
        }
        if (other.getIsBonus() != false) {
          setIsBonus(other.getIsBonus());
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
              case 32: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 32
              case 80: {
                isBonus_ = input.readBool();
                bitField0_ |= 0x00000008;
                break;
              } // case 80
              case 96: {
                pathId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 96
              case 104: {
                rewardLevel_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 104
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 4;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int rewardLevel_ ;
      /**
       * <code>uint32 reward_level = 13;</code>
       * @return The rewardLevel.
       */
      @java.lang.Override
      public int getRewardLevel() {
        return rewardLevel_;
      }
      /**
       * <code>uint32 reward_level = 13;</code>
       * @param value The rewardLevel to set.
       * @return This builder for chaining.
       */
      public Builder setRewardLevel(int value) {
        
        rewardLevel_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 reward_level = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearRewardLevel() {
        bitField0_ = (bitField0_ & ~0x00000002);
        rewardLevel_ = 0;
        onChanged();
        return this;
      }

      private int pathId_ ;
      /**
       * <code>uint32 path_id = 12;</code>
       * @return The pathId.
       */
      @java.lang.Override
      public int getPathId() {
        return pathId_;
      }
      /**
       * <code>uint32 path_id = 12;</code>
       * @param value The pathId to set.
       * @return This builder for chaining.
       */
      public Builder setPathId(int value) {
        
        pathId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 path_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearPathId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        pathId_ = 0;
        onChanged();
        return this;
      }

      private boolean isBonus_ ;
      /**
       * <code>bool is_bonus = 10;</code>
       * @return The isBonus.
       */
      @java.lang.Override
      public boolean getIsBonus() {
        return isBonus_;
      }
      /**
       * <code>bool is_bonus = 10;</code>
       * @param value The isBonus to set.
       * @return This builder for chaining.
       */
      public Builder setIsBonus(boolean value) {
        
        isBonus_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_bonus = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsBonus() {
        bitField0_ = (bitField0_ & ~0x00000008);
        isBonus_ = false;
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


      // @@protoc_insertion_point(builder_scope:ExpeditionTakeRewardRsp)
    }

    // @@protoc_insertion_point(class_scope:ExpeditionTakeRewardRsp)
    private static final emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp();
    }

    public static emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ExpeditionTakeRewardRsp>
        PARSER = new com.google.protobuf.AbstractParser<ExpeditionTakeRewardRsp>() {
      @java.lang.Override
      public ExpeditionTakeRewardRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<ExpeditionTakeRewardRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ExpeditionTakeRewardRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.ExpeditionTakeRewardRspOuterClass.ExpeditionTakeRewardRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ExpeditionTakeRewardRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ExpeditionTakeRewardRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035ExpeditionTakeRewardRsp.proto\"c\n\027Exped" +
      "itionTakeRewardRsp\022\017\n\007retcode\030\004 \001(\005\022\024\n\014r" +
      "eward_level\030\r \001(\r\022\017\n\007path_id\030\014 \001(\r\022\020\n\010is" +
      "_bonus\030\n \001(\010B\030\n\026emu.gingerps.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ExpeditionTakeRewardRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ExpeditionTakeRewardRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ExpeditionTakeRewardRsp_descriptor,
        new java.lang.String[] { "Retcode", "RewardLevel", "PathId", "IsBonus", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
