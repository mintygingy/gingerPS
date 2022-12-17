// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeAvatarSummonEventRsp.proto

package emu.gingerps.net.proto;

public final class HomeAvatarSummonEventRspOuterClass {
  private HomeAvatarSummonEventRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeAvatarSummonEventRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeAvatarSummonEventRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 event_id = 9;</code>
     * @return The eventId.
     */
    int getEventId();

    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4562;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code HomeAvatarSummonEventRsp}
   */
  public static final class HomeAvatarSummonEventRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeAvatarSummonEventRsp)
      HomeAvatarSummonEventRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeAvatarSummonEventRsp.newBuilder() to construct.
    private HomeAvatarSummonEventRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeAvatarSummonEventRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeAvatarSummonEventRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.internal_static_HomeAvatarSummonEventRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.internal_static_HomeAvatarSummonEventRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp.class, emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp.Builder.class);
    }

    public static final int EVENT_ID_FIELD_NUMBER = 9;
    private int eventId_ = 0;
    /**
     * <code>uint32 event_id = 9;</code>
     * @return The eventId.
     */
    @java.lang.Override
    public int getEventId() {
      return eventId_;
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
      if (eventId_ != 0) {
        output.writeUInt32(9, eventId_);
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
      if (eventId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, eventId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp other = (emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp) obj;

      if (getEventId()
          != other.getEventId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + EVENT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEventId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp prototype) {
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
     *   CMD_ID = 4562;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code HomeAvatarSummonEventRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeAvatarSummonEventRsp)
        emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.internal_static_HomeAvatarSummonEventRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.internal_static_HomeAvatarSummonEventRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp.class, emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp.newBuilder()
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
        eventId_ = 0;
        retcode_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.internal_static_HomeAvatarSummonEventRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp build() {
        emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp buildPartial() {
        emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp result = new emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.eventId_ = eventId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.retcode_ = retcode_;
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
        if (other instanceof emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp) {
          return mergeFrom((emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp other) {
        if (other == emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp.getDefaultInstance()) return this;
        if (other.getEventId() != 0) {
          setEventId(other.getEventId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
                bitField0_ |= 0x00000002;
                break;
              } // case 32
              case 72: {
                eventId_ = input.readUInt32();
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

      private int eventId_ ;
      /**
       * <code>uint32 event_id = 9;</code>
       * @return The eventId.
       */
      @java.lang.Override
      public int getEventId() {
        return eventId_;
      }
      /**
       * <code>uint32 event_id = 9;</code>
       * @param value The eventId to set.
       * @return This builder for chaining.
       */
      public Builder setEventId(int value) {
        
        eventId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 event_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearEventId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        eventId_ = 0;
        onChanged();
        return this;
      }

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
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomeAvatarSummonEventRsp)
    }

    // @@protoc_insertion_point(class_scope:HomeAvatarSummonEventRsp)
    private static final emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp();
    }

    public static emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeAvatarSummonEventRsp>
        PARSER = new com.google.protobuf.AbstractParser<HomeAvatarSummonEventRsp>() {
      @java.lang.Override
      public HomeAvatarSummonEventRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeAvatarSummonEventRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeAvatarSummonEventRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.HomeAvatarSummonEventRspOuterClass.HomeAvatarSummonEventRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeAvatarSummonEventRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeAvatarSummonEventRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036HomeAvatarSummonEventRsp.proto\"=\n\030Home" +
      "AvatarSummonEventRsp\022\020\n\010event_id\030\t \001(\r\022\017" +
      "\n\007retcode\030\004 \001(\005B\030\n\026emu.gingerps.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeAvatarSummonEventRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeAvatarSummonEventRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeAvatarSummonEventRsp_descriptor,
        new java.lang.String[] { "EventId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
