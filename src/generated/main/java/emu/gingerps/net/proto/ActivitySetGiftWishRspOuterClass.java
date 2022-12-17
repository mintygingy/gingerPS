// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ActivitySetGiftWishRsp.proto

package emu.gingerps.net.proto;

public final class ActivitySetGiftWishRspOuterClass {
  private ActivitySetGiftWishRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ActivitySetGiftWishRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ActivitySetGiftWishRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 schedule_id = 4;</code>
     * @return The scheduleId.
     */
    int getScheduleId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8757;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ActivitySetGiftWishRsp}
   */
  public static final class ActivitySetGiftWishRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ActivitySetGiftWishRsp)
      ActivitySetGiftWishRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ActivitySetGiftWishRsp.newBuilder() to construct.
    private ActivitySetGiftWishRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ActivitySetGiftWishRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ActivitySetGiftWishRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.internal_static_ActivitySetGiftWishRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.internal_static_ActivitySetGiftWishRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp.class, emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 9;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int SCHEDULE_ID_FIELD_NUMBER = 4;
    private int scheduleId_ = 0;
    /**
     * <code>uint32 schedule_id = 4;</code>
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
      if (scheduleId_ != 0) {
        output.writeUInt32(4, scheduleId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(9, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, scheduleId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, retcode_);
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
      if (!(obj instanceof emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp other = (emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp prototype) {
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
     *   CMD_ID = 8757;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ActivitySetGiftWishRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ActivitySetGiftWishRsp)
        emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.internal_static_ActivitySetGiftWishRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.internal_static_ActivitySetGiftWishRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp.class, emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp.newBuilder()
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
        scheduleId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.internal_static_ActivitySetGiftWishRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp build() {
        emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp buildPartial() {
        emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp result = new emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.retcode_ = retcode_;
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
        if (other instanceof emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp) {
          return mergeFrom((emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp other) {
        if (other == emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
              case 32: {
                scheduleId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 32
              case 72: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 72
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
       * <code>int32 retcode = 9;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 9;</code>
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
       * <code>int32 retcode = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int scheduleId_ ;
      /**
       * <code>uint32 schedule_id = 4;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 schedule_id = 4;</code>
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
       * <code>uint32 schedule_id = 4;</code>
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


      // @@protoc_insertion_point(builder_scope:ActivitySetGiftWishRsp)
    }

    // @@protoc_insertion_point(class_scope:ActivitySetGiftWishRsp)
    private static final emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp();
    }

    public static emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ActivitySetGiftWishRsp>
        PARSER = new com.google.protobuf.AbstractParser<ActivitySetGiftWishRsp>() {
      @java.lang.Override
      public ActivitySetGiftWishRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<ActivitySetGiftWishRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ActivitySetGiftWishRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.ActivitySetGiftWishRspOuterClass.ActivitySetGiftWishRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActivitySetGiftWishRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActivitySetGiftWishRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034ActivitySetGiftWishRsp.proto\">\n\026Activi" +
      "tySetGiftWishRsp\022\017\n\007retcode\030\t \001(\005\022\023\n\013sch" +
      "edule_id\030\004 \001(\rB\030\n\026emu.gingerps.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ActivitySetGiftWishRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ActivitySetGiftWishRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActivitySetGiftWishRsp_descriptor,
        new java.lang.String[] { "Retcode", "ScheduleId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
