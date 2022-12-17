// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GadgetPlayStartNotify.proto

package emu.gingerps.net.proto;

public final class GadgetPlayStartNotifyOuterClass {
  private GadgetPlayStartNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GadgetPlayStartNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GadgetPlayStartNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 start_time = 12;</code>
     * @return The startTime.
     */
    int getStartTime();

    /**
     * <code>uint32 play_type = 13;</code>
     * @return The playType.
     */
    int getPlayType();

    /**
     * <code>uint32 entity_id = 10;</code>
     * @return The entityId.
     */
    int getEntityId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 878;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GadgetPlayStartNotify}
   */
  public static final class GadgetPlayStartNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GadgetPlayStartNotify)
      GadgetPlayStartNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GadgetPlayStartNotify.newBuilder() to construct.
    private GadgetPlayStartNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GadgetPlayStartNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GadgetPlayStartNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.internal_static_GadgetPlayStartNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.internal_static_GadgetPlayStartNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify.class, emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify.Builder.class);
    }

    public static final int START_TIME_FIELD_NUMBER = 12;
    private int startTime_ = 0;
    /**
     * <code>uint32 start_time = 12;</code>
     * @return The startTime.
     */
    @java.lang.Override
    public int getStartTime() {
      return startTime_;
    }

    public static final int PLAY_TYPE_FIELD_NUMBER = 13;
    private int playType_ = 0;
    /**
     * <code>uint32 play_type = 13;</code>
     * @return The playType.
     */
    @java.lang.Override
    public int getPlayType() {
      return playType_;
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 10;
    private int entityId_ = 0;
    /**
     * <code>uint32 entity_id = 10;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
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
      if (entityId_ != 0) {
        output.writeUInt32(10, entityId_);
      }
      if (startTime_ != 0) {
        output.writeUInt32(12, startTime_);
      }
      if (playType_ != 0) {
        output.writeUInt32(13, playType_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, entityId_);
      }
      if (startTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, startTime_);
      }
      if (playType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, playType_);
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
      if (!(obj instanceof emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify other = (emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify) obj;

      if (getStartTime()
          != other.getStartTime()) return false;
      if (getPlayType()
          != other.getPlayType()) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
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
      hash = (37 * hash) + START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartTime();
      hash = (37 * hash) + PLAY_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getPlayType();
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify prototype) {
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
     *   CMD_ID = 878;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GadgetPlayStartNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GadgetPlayStartNotify)
        emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.internal_static_GadgetPlayStartNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.internal_static_GadgetPlayStartNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify.class, emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify.newBuilder()
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
        startTime_ = 0;
        playType_ = 0;
        entityId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.internal_static_GadgetPlayStartNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify build() {
        emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify buildPartial() {
        emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify result = new emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.startTime_ = startTime_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.playType_ = playType_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.entityId_ = entityId_;
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
        if (other instanceof emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify) {
          return mergeFrom((emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify other) {
        if (other == emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify.getDefaultInstance()) return this;
        if (other.getStartTime() != 0) {
          setStartTime(other.getStartTime());
        }
        if (other.getPlayType() != 0) {
          setPlayType(other.getPlayType());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
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
                entityId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 80
              case 96: {
                startTime_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 96
              case 104: {
                playType_ = input.readUInt32();
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

      private int startTime_ ;
      /**
       * <code>uint32 start_time = 12;</code>
       * @return The startTime.
       */
      @java.lang.Override
      public int getStartTime() {
        return startTime_;
      }
      /**
       * <code>uint32 start_time = 12;</code>
       * @param value The startTime to set.
       * @return This builder for chaining.
       */
      public Builder setStartTime(int value) {
        
        startTime_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 start_time = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearStartTime() {
        bitField0_ = (bitField0_ & ~0x00000001);
        startTime_ = 0;
        onChanged();
        return this;
      }

      private int playType_ ;
      /**
       * <code>uint32 play_type = 13;</code>
       * @return The playType.
       */
      @java.lang.Override
      public int getPlayType() {
        return playType_;
      }
      /**
       * <code>uint32 play_type = 13;</code>
       * @param value The playType to set.
       * @return This builder for chaining.
       */
      public Builder setPlayType(int value) {
        
        playType_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 play_type = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        playType_ = 0;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 10;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 10;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        entityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GadgetPlayStartNotify)
    }

    // @@protoc_insertion_point(class_scope:GadgetPlayStartNotify)
    private static final emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify();
    }

    public static emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GadgetPlayStartNotify>
        PARSER = new com.google.protobuf.AbstractParser<GadgetPlayStartNotify>() {
      @java.lang.Override
      public GadgetPlayStartNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<GadgetPlayStartNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GadgetPlayStartNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.GadgetPlayStartNotifyOuterClass.GadgetPlayStartNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GadgetPlayStartNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GadgetPlayStartNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033GadgetPlayStartNotify.proto\"Q\n\025GadgetP" +
      "layStartNotify\022\022\n\nstart_time\030\014 \001(\r\022\021\n\tpl" +
      "ay_type\030\r \001(\r\022\021\n\tentity_id\030\n \001(\rB\030\n\026emu." +
      "gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GadgetPlayStartNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GadgetPlayStartNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GadgetPlayStartNotify_descriptor,
        new java.lang.String[] { "StartTime", "PlayType", "EntityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
