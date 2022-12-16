// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ActivitySelectAvatarCardReq.proto

package emu.gingerps.net.proto;

public final class ActivitySelectAvatarCardReqOuterClass {
  private ActivitySelectAvatarCardReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ActivitySelectAvatarCardReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ActivitySelectAvatarCardReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 reward_id = 14;</code>
     * @return The rewardId.
     */
    int getRewardId();

    /**
     * <code>uint32 activity_id = 6;</code>
     * @return The activityId.
     */
    int getActivityId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 2052;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ActivitySelectAvatarCardReq}
   */
  public static final class ActivitySelectAvatarCardReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ActivitySelectAvatarCardReq)
      ActivitySelectAvatarCardReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ActivitySelectAvatarCardReq.newBuilder() to construct.
    private ActivitySelectAvatarCardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ActivitySelectAvatarCardReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ActivitySelectAvatarCardReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ActivitySelectAvatarCardReq(
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
            case 48: {

              activityId_ = input.readUInt32();
              break;
            }
            case 112: {

              rewardId_ = input.readUInt32();
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
      return emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.internal_static_ActivitySelectAvatarCardReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.internal_static_ActivitySelectAvatarCardReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq.class, emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq.Builder.class);
    }

    public static final int REWARD_ID_FIELD_NUMBER = 14;
    private int rewardId_;
    /**
     * <code>uint32 reward_id = 14;</code>
     * @return The rewardId.
     */
    @java.lang.Override
    public int getRewardId() {
      return rewardId_;
    }

    public static final int ACTIVITY_ID_FIELD_NUMBER = 6;
    private int activityId_;
    /**
     * <code>uint32 activity_id = 6;</code>
     * @return The activityId.
     */
    @java.lang.Override
    public int getActivityId() {
      return activityId_;
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
      if (activityId_ != 0) {
        output.writeUInt32(6, activityId_);
      }
      if (rewardId_ != 0) {
        output.writeUInt32(14, rewardId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (activityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, activityId_);
      }
      if (rewardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, rewardId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq other = (emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq) obj;

      if (getRewardId()
          != other.getRewardId()) return false;
      if (getActivityId()
          != other.getActivityId()) return false;
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
      hash = (37 * hash) + REWARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRewardId();
      hash = (37 * hash) + ACTIVITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getActivityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq prototype) {
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
     *   CMD_ID = 2052;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ActivitySelectAvatarCardReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ActivitySelectAvatarCardReq)
        emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.internal_static_ActivitySelectAvatarCardReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.internal_static_ActivitySelectAvatarCardReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq.class, emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq.newBuilder()
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
        rewardId_ = 0;

        activityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.internal_static_ActivitySelectAvatarCardReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq build() {
        emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq buildPartial() {
        emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq result = new emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq(this);
        result.rewardId_ = rewardId_;
        result.activityId_ = activityId_;
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
        if (other instanceof emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq) {
          return mergeFrom((emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq other) {
        if (other == emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq.getDefaultInstance()) return this;
        if (other.getRewardId() != 0) {
          setRewardId(other.getRewardId());
        }
        if (other.getActivityId() != 0) {
          setActivityId(other.getActivityId());
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
        emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int rewardId_ ;
      /**
       * <code>uint32 reward_id = 14;</code>
       * @return The rewardId.
       */
      @java.lang.Override
      public int getRewardId() {
        return rewardId_;
      }
      /**
       * <code>uint32 reward_id = 14;</code>
       * @param value The rewardId to set.
       * @return This builder for chaining.
       */
      public Builder setRewardId(int value) {
        
        rewardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 reward_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRewardId() {
        
        rewardId_ = 0;
        onChanged();
        return this;
      }

      private int activityId_ ;
      /**
       * <code>uint32 activity_id = 6;</code>
       * @return The activityId.
       */
      @java.lang.Override
      public int getActivityId() {
        return activityId_;
      }
      /**
       * <code>uint32 activity_id = 6;</code>
       * @param value The activityId to set.
       * @return This builder for chaining.
       */
      public Builder setActivityId(int value) {
        
        activityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 activity_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearActivityId() {
        
        activityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ActivitySelectAvatarCardReq)
    }

    // @@protoc_insertion_point(class_scope:ActivitySelectAvatarCardReq)
    private static final emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq();
    }

    public static emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ActivitySelectAvatarCardReq>
        PARSER = new com.google.protobuf.AbstractParser<ActivitySelectAvatarCardReq>() {
      @java.lang.Override
      public ActivitySelectAvatarCardReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ActivitySelectAvatarCardReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ActivitySelectAvatarCardReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ActivitySelectAvatarCardReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.ActivitySelectAvatarCardReqOuterClass.ActivitySelectAvatarCardReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActivitySelectAvatarCardReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActivitySelectAvatarCardReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!ActivitySelectAvatarCardReq.proto\"E\n\033A" +
      "ctivitySelectAvatarCardReq\022\021\n\treward_id\030" +
      "\016 \001(\r\022\023\n\013activity_id\030\006 \001(\rB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ActivitySelectAvatarCardReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ActivitySelectAvatarCardReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActivitySelectAvatarCardReq_descriptor,
        new java.lang.String[] { "RewardId", "ActivityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
