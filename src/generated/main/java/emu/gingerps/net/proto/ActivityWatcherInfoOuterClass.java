// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ActivityWatcherInfo.proto

package emu.gingerps.net.proto;

public final class ActivityWatcherInfoOuterClass {
  private ActivityWatcherInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ActivityWatcherInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ActivityWatcherInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_taken_reward = 2;</code>
     * @return The isTakenReward.
     */
    boolean getIsTakenReward();

    /**
     * <code>uint32 total_progress = 1;</code>
     * @return The totalProgress.
     */
    int getTotalProgress();

    /**
     * <code>uint32 cur_progress = 8;</code>
     * @return The curProgress.
     */
    int getCurProgress();

    /**
     * <code>uint32 watcher_id = 14;</code>
     * @return The watcherId.
     */
    int getWatcherId();
  }
  /**
   * Protobuf type {@code ActivityWatcherInfo}
   */
  public static final class ActivityWatcherInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ActivityWatcherInfo)
      ActivityWatcherInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ActivityWatcherInfo.newBuilder() to construct.
    private ActivityWatcherInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ActivityWatcherInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ActivityWatcherInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.internal_static_ActivityWatcherInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.internal_static_ActivityWatcherInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo.class, emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo.Builder.class);
    }

    public static final int IS_TAKEN_REWARD_FIELD_NUMBER = 2;
    private boolean isTakenReward_ = false;
    /**
     * <code>bool is_taken_reward = 2;</code>
     * @return The isTakenReward.
     */
    @java.lang.Override
    public boolean getIsTakenReward() {
      return isTakenReward_;
    }

    public static final int TOTAL_PROGRESS_FIELD_NUMBER = 1;
    private int totalProgress_ = 0;
    /**
     * <code>uint32 total_progress = 1;</code>
     * @return The totalProgress.
     */
    @java.lang.Override
    public int getTotalProgress() {
      return totalProgress_;
    }

    public static final int CUR_PROGRESS_FIELD_NUMBER = 8;
    private int curProgress_ = 0;
    /**
     * <code>uint32 cur_progress = 8;</code>
     * @return The curProgress.
     */
    @java.lang.Override
    public int getCurProgress() {
      return curProgress_;
    }

    public static final int WATCHER_ID_FIELD_NUMBER = 14;
    private int watcherId_ = 0;
    /**
     * <code>uint32 watcher_id = 14;</code>
     * @return The watcherId.
     */
    @java.lang.Override
    public int getWatcherId() {
      return watcherId_;
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
      if (totalProgress_ != 0) {
        output.writeUInt32(1, totalProgress_);
      }
      if (isTakenReward_ != false) {
        output.writeBool(2, isTakenReward_);
      }
      if (curProgress_ != 0) {
        output.writeUInt32(8, curProgress_);
      }
      if (watcherId_ != 0) {
        output.writeUInt32(14, watcherId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (totalProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, totalProgress_);
      }
      if (isTakenReward_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isTakenReward_);
      }
      if (curProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, curProgress_);
      }
      if (watcherId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, watcherId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo other = (emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo) obj;

      if (getIsTakenReward()
          != other.getIsTakenReward()) return false;
      if (getTotalProgress()
          != other.getTotalProgress()) return false;
      if (getCurProgress()
          != other.getCurProgress()) return false;
      if (getWatcherId()
          != other.getWatcherId()) return false;
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
      hash = (37 * hash) + IS_TAKEN_REWARD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsTakenReward());
      hash = (37 * hash) + TOTAL_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getTotalProgress();
      hash = (37 * hash) + CUR_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getCurProgress();
      hash = (37 * hash) + WATCHER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getWatcherId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo prototype) {
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
     * Protobuf type {@code ActivityWatcherInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ActivityWatcherInfo)
        emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.internal_static_ActivityWatcherInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.internal_static_ActivityWatcherInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo.class, emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo.newBuilder()
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
        isTakenReward_ = false;
        totalProgress_ = 0;
        curProgress_ = 0;
        watcherId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.internal_static_ActivityWatcherInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo build() {
        emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo buildPartial() {
        emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo result = new emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isTakenReward_ = isTakenReward_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.totalProgress_ = totalProgress_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.curProgress_ = curProgress_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.watcherId_ = watcherId_;
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
        if (other instanceof emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo) {
          return mergeFrom((emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo other) {
        if (other == emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo.getDefaultInstance()) return this;
        if (other.getIsTakenReward() != false) {
          setIsTakenReward(other.getIsTakenReward());
        }
        if (other.getTotalProgress() != 0) {
          setTotalProgress(other.getTotalProgress());
        }
        if (other.getCurProgress() != 0) {
          setCurProgress(other.getCurProgress());
        }
        if (other.getWatcherId() != 0) {
          setWatcherId(other.getWatcherId());
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
                totalProgress_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 8
              case 16: {
                isTakenReward_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 16
              case 64: {
                curProgress_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 64
              case 112: {
                watcherId_ = input.readUInt32();
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

      private boolean isTakenReward_ ;
      /**
       * <code>bool is_taken_reward = 2;</code>
       * @return The isTakenReward.
       */
      @java.lang.Override
      public boolean getIsTakenReward() {
        return isTakenReward_;
      }
      /**
       * <code>bool is_taken_reward = 2;</code>
       * @param value The isTakenReward to set.
       * @return This builder for chaining.
       */
      public Builder setIsTakenReward(boolean value) {
        
        isTakenReward_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_taken_reward = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsTakenReward() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isTakenReward_ = false;
        onChanged();
        return this;
      }

      private int totalProgress_ ;
      /**
       * <code>uint32 total_progress = 1;</code>
       * @return The totalProgress.
       */
      @java.lang.Override
      public int getTotalProgress() {
        return totalProgress_;
      }
      /**
       * <code>uint32 total_progress = 1;</code>
       * @param value The totalProgress to set.
       * @return This builder for chaining.
       */
      public Builder setTotalProgress(int value) {
        
        totalProgress_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 total_progress = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalProgress() {
        bitField0_ = (bitField0_ & ~0x00000002);
        totalProgress_ = 0;
        onChanged();
        return this;
      }

      private int curProgress_ ;
      /**
       * <code>uint32 cur_progress = 8;</code>
       * @return The curProgress.
       */
      @java.lang.Override
      public int getCurProgress() {
        return curProgress_;
      }
      /**
       * <code>uint32 cur_progress = 8;</code>
       * @param value The curProgress to set.
       * @return This builder for chaining.
       */
      public Builder setCurProgress(int value) {
        
        curProgress_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_progress = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurProgress() {
        bitField0_ = (bitField0_ & ~0x00000004);
        curProgress_ = 0;
        onChanged();
        return this;
      }

      private int watcherId_ ;
      /**
       * <code>uint32 watcher_id = 14;</code>
       * @return The watcherId.
       */
      @java.lang.Override
      public int getWatcherId() {
        return watcherId_;
      }
      /**
       * <code>uint32 watcher_id = 14;</code>
       * @param value The watcherId to set.
       * @return This builder for chaining.
       */
      public Builder setWatcherId(int value) {
        
        watcherId_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 watcher_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearWatcherId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        watcherId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ActivityWatcherInfo)
    }

    // @@protoc_insertion_point(class_scope:ActivityWatcherInfo)
    private static final emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo();
    }

    public static emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ActivityWatcherInfo>
        PARSER = new com.google.protobuf.AbstractParser<ActivityWatcherInfo>() {
      @java.lang.Override
      public ActivityWatcherInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<ActivityWatcherInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ActivityWatcherInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.ActivityWatcherInfoOuterClass.ActivityWatcherInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActivityWatcherInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActivityWatcherInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031ActivityWatcherInfo.proto\"p\n\023ActivityW" +
      "atcherInfo\022\027\n\017is_taken_reward\030\002 \001(\010\022\026\n\016t" +
      "otal_progress\030\001 \001(\r\022\024\n\014cur_progress\030\010 \001(" +
      "\r\022\022\n\nwatcher_id\030\016 \001(\rB\030\n\026emu.gingerps.ne" +
      "t.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ActivityWatcherInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ActivityWatcherInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActivityWatcherInfo_descriptor,
        new java.lang.String[] { "IsTakenReward", "TotalProgress", "CurProgress", "WatcherId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
