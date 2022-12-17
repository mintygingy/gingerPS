// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ActivityAcceptGiveGiftReq.proto

package emu.gingerps.net.proto;

public final class ActivityAcceptGiveGiftReqOuterClass {
  private ActivityAcceptGiveGiftReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ActivityAcceptGiveGiftReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ActivityAcceptGiveGiftReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 uid = 9;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>uint32 schedule_id = 12;</code>
     * @return The scheduleId.
     */
    int getScheduleId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8827;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ActivityAcceptGiveGiftReq}
   */
  public static final class ActivityAcceptGiveGiftReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ActivityAcceptGiveGiftReq)
      ActivityAcceptGiveGiftReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ActivityAcceptGiveGiftReq.newBuilder() to construct.
    private ActivityAcceptGiveGiftReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ActivityAcceptGiveGiftReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ActivityAcceptGiveGiftReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.internal_static_ActivityAcceptGiveGiftReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.internal_static_ActivityAcceptGiveGiftReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq.class, emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq.Builder.class);
    }

    public static final int UID_FIELD_NUMBER = 9;
    private int uid_ = 0;
    /**
     * <code>uint32 uid = 9;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int SCHEDULE_ID_FIELD_NUMBER = 12;
    private int scheduleId_ = 0;
    /**
     * <code>uint32 schedule_id = 12;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
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
      if (uid_ != 0) {
        output.writeUInt32(9, uid_);
      }
      if (scheduleId_ != 0) {
        output.writeUInt32(12, scheduleId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, uid_);
      }
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, scheduleId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq other = (emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq) obj;

      if (getUid()
          != other.getUid()) return false;
      if (getScheduleId()
          != other.getScheduleId()) return false;
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
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq prototype) {
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
     *   CMD_ID = 8827;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ActivityAcceptGiveGiftReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ActivityAcceptGiveGiftReq)
        emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.internal_static_ActivityAcceptGiveGiftReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.internal_static_ActivityAcceptGiveGiftReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq.class, emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq.newBuilder()
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
        uid_ = 0;
        scheduleId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.internal_static_ActivityAcceptGiveGiftReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq build() {
        emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq buildPartial() {
        emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq result = new emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.uid_ = uid_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.scheduleId_ = scheduleId_;
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
        if (other instanceof emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq) {
          return mergeFrom((emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq other) {
        if (other == emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
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
              case 72: {
                uid_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 72
              case 96: {
                scheduleId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 96
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

      private int uid_ ;
      /**
       * <code>uint32 uid = 9;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 9;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        uid_ = 0;
        onChanged();
        return this;
      }

      private int scheduleId_ ;
      /**
       * <code>uint32 schedule_id = 12;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 schedule_id = 12;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {
        
        scheduleId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 schedule_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        scheduleId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ActivityAcceptGiveGiftReq)
    }

    // @@protoc_insertion_point(class_scope:ActivityAcceptGiveGiftReq)
    private static final emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq();
    }

    public static emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ActivityAcceptGiveGiftReq>
        PARSER = new com.google.protobuf.AbstractParser<ActivityAcceptGiveGiftReq>() {
      @java.lang.Override
      public ActivityAcceptGiveGiftReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<ActivityAcceptGiveGiftReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ActivityAcceptGiveGiftReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.ActivityAcceptGiveGiftReqOuterClass.ActivityAcceptGiveGiftReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActivityAcceptGiveGiftReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActivityAcceptGiveGiftReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037ActivityAcceptGiveGiftReq.proto\"=\n\031Act" +
      "ivityAcceptGiveGiftReq\022\013\n\003uid\030\t \001(\r\022\023\n\013s" +
      "chedule_id\030\014 \001(\rB\030\n\026emu.gingerps.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ActivityAcceptGiveGiftReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ActivityAcceptGiveGiftReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActivityAcceptGiveGiftReq_descriptor,
        new java.lang.String[] { "Uid", "ScheduleId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
