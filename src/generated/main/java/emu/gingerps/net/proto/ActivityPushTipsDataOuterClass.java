// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ActivityPushTipsData.proto

package emu.gingerps.net.proto;

public final class ActivityPushTipsDataOuterClass {
  private ActivityPushTipsDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ActivityPushTipsDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ActivityPushTipsData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 activity_push_tips_id = 14;</code>
     * @return The activityPushTipsId.
     */
    int getActivityPushTipsId();

    /**
     * <code>.ActivityPushTipsState state = 3;</code>
     * @return The enum numeric value on the wire for state.
     */
    int getStateValue();
    /**
     * <code>.ActivityPushTipsState state = 3;</code>
     * @return The state.
     */
    emu.gingerps.net.proto.ActivityPushTipsStateOuterClass.ActivityPushTipsState getState();
  }
  /**
   * Protobuf type {@code ActivityPushTipsData}
   */
  public static final class ActivityPushTipsData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ActivityPushTipsData)
      ActivityPushTipsDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ActivityPushTipsData.newBuilder() to construct.
    private ActivityPushTipsData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ActivityPushTipsData() {
      state_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ActivityPushTipsData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ActivityPushTipsData(
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
            case 24: {
              int rawValue = input.readEnum();

              state_ = rawValue;
              break;
            }
            case 112: {

              activityPushTipsId_ = input.readUInt32();
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
      return emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.internal_static_ActivityPushTipsData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.internal_static_ActivityPushTipsData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData.class, emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData.Builder.class);
    }

    public static final int ACTIVITY_PUSH_TIPS_ID_FIELD_NUMBER = 14;
    private int activityPushTipsId_;
    /**
     * <code>uint32 activity_push_tips_id = 14;</code>
     * @return The activityPushTipsId.
     */
    @java.lang.Override
    public int getActivityPushTipsId() {
      return activityPushTipsId_;
    }

    public static final int STATE_FIELD_NUMBER = 3;
    private int state_;
    /**
     * <code>.ActivityPushTipsState state = 3;</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <code>.ActivityPushTipsState state = 3;</code>
     * @return The state.
     */
    @java.lang.Override public emu.gingerps.net.proto.ActivityPushTipsStateOuterClass.ActivityPushTipsState getState() {
      @SuppressWarnings("deprecation")
      emu.gingerps.net.proto.ActivityPushTipsStateOuterClass.ActivityPushTipsState result = emu.gingerps.net.proto.ActivityPushTipsStateOuterClass.ActivityPushTipsState.valueOf(state_);
      return result == null ? emu.gingerps.net.proto.ActivityPushTipsStateOuterClass.ActivityPushTipsState.UNRECOGNIZED : result;
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
      if (state_ != emu.gingerps.net.proto.ActivityPushTipsStateOuterClass.ActivityPushTipsState.ACTIVITY_PUSH_TIPS_STATE_NONE.getNumber()) {
        output.writeEnum(3, state_);
      }
      if (activityPushTipsId_ != 0) {
        output.writeUInt32(14, activityPushTipsId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (state_ != emu.gingerps.net.proto.ActivityPushTipsStateOuterClass.ActivityPushTipsState.ACTIVITY_PUSH_TIPS_STATE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, state_);
      }
      if (activityPushTipsId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, activityPushTipsId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData other = (emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData) obj;

      if (getActivityPushTipsId()
          != other.getActivityPushTipsId()) return false;
      if (state_ != other.state_) return false;
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
      hash = (37 * hash) + ACTIVITY_PUSH_TIPS_ID_FIELD_NUMBER;
      hash = (53 * hash) + getActivityPushTipsId();
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + state_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData prototype) {
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
     * Protobuf type {@code ActivityPushTipsData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ActivityPushTipsData)
        emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.internal_static_ActivityPushTipsData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.internal_static_ActivityPushTipsData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData.class, emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData.newBuilder()
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
        activityPushTipsId_ = 0;

        state_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.internal_static_ActivityPushTipsData_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData getDefaultInstanceForType() {
        return emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData build() {
        emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData buildPartial() {
        emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData result = new emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData(this);
        result.activityPushTipsId_ = activityPushTipsId_;
        result.state_ = state_;
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
        if (other instanceof emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData) {
          return mergeFrom((emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData other) {
        if (other == emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData.getDefaultInstance()) return this;
        if (other.getActivityPushTipsId() != 0) {
          setActivityPushTipsId(other.getActivityPushTipsId());
        }
        if (other.state_ != 0) {
          setStateValue(other.getStateValue());
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
        emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int activityPushTipsId_ ;
      /**
       * <code>uint32 activity_push_tips_id = 14;</code>
       * @return The activityPushTipsId.
       */
      @java.lang.Override
      public int getActivityPushTipsId() {
        return activityPushTipsId_;
      }
      /**
       * <code>uint32 activity_push_tips_id = 14;</code>
       * @param value The activityPushTipsId to set.
       * @return This builder for chaining.
       */
      public Builder setActivityPushTipsId(int value) {
        
        activityPushTipsId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 activity_push_tips_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearActivityPushTipsId() {
        
        activityPushTipsId_ = 0;
        onChanged();
        return this;
      }

      private int state_ = 0;
      /**
       * <code>.ActivityPushTipsState state = 3;</code>
       * @return The enum numeric value on the wire for state.
       */
      @java.lang.Override public int getStateValue() {
        return state_;
      }
      /**
       * <code>.ActivityPushTipsState state = 3;</code>
       * @param value The enum numeric value on the wire for state to set.
       * @return This builder for chaining.
       */
      public Builder setStateValue(int value) {
        
        state_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.ActivityPushTipsState state = 3;</code>
       * @return The state.
       */
      @java.lang.Override
      public emu.gingerps.net.proto.ActivityPushTipsStateOuterClass.ActivityPushTipsState getState() {
        @SuppressWarnings("deprecation")
        emu.gingerps.net.proto.ActivityPushTipsStateOuterClass.ActivityPushTipsState result = emu.gingerps.net.proto.ActivityPushTipsStateOuterClass.ActivityPushTipsState.valueOf(state_);
        return result == null ? emu.gingerps.net.proto.ActivityPushTipsStateOuterClass.ActivityPushTipsState.UNRECOGNIZED : result;
      }
      /**
       * <code>.ActivityPushTipsState state = 3;</code>
       * @param value The state to set.
       * @return This builder for chaining.
       */
      public Builder setState(emu.gingerps.net.proto.ActivityPushTipsStateOuterClass.ActivityPushTipsState value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        state_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.ActivityPushTipsState state = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearState() {
        
        state_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ActivityPushTipsData)
    }

    // @@protoc_insertion_point(class_scope:ActivityPushTipsData)
    private static final emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData();
    }

    public static emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ActivityPushTipsData>
        PARSER = new com.google.protobuf.AbstractParser<ActivityPushTipsData>() {
      @java.lang.Override
      public ActivityPushTipsData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ActivityPushTipsData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ActivityPushTipsData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ActivityPushTipsData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.ActivityPushTipsDataOuterClass.ActivityPushTipsData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActivityPushTipsData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActivityPushTipsData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032ActivityPushTipsData.proto\032\033ActivityPu" +
      "shTipsState.proto\"\\\n\024ActivityPushTipsDat" +
      "a\022\035\n\025activity_push_tips_id\030\016 \001(\r\022%\n\005stat" +
      "e\030\003 \001(\0162\026.ActivityPushTipsStateB\030\n\026emu.g" +
      "ingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.ActivityPushTipsStateOuterClass.getDescriptor(),
        });
    internal_static_ActivityPushTipsData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ActivityPushTipsData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActivityPushTipsData_descriptor,
        new java.lang.String[] { "ActivityPushTipsId", "State", });
    emu.gingerps.net.proto.ActivityPushTipsStateOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
