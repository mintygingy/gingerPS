// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MistTrialFloorLevelNotify.proto

package emu.gingerps.net.proto;

public final class MistTrialFloorLevelNotifyOuterClass {
  private MistTrialFloorLevelNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MistTrialFloorLevelNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MistTrialFloorLevelNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 dungeon_scene_id = 6;</code>
     * @return The dungeonSceneId.
     */
    int getDungeonSceneId();

    /**
     * <code>uint32 floor_level = 7;</code>
     * @return The floorLevel.
     */
    int getFloorLevel();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 988;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code MistTrialFloorLevelNotify}
   */
  public static final class MistTrialFloorLevelNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MistTrialFloorLevelNotify)
      MistTrialFloorLevelNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MistTrialFloorLevelNotify.newBuilder() to construct.
    private MistTrialFloorLevelNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MistTrialFloorLevelNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MistTrialFloorLevelNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.internal_static_MistTrialFloorLevelNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.internal_static_MistTrialFloorLevelNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify.class, emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify.Builder.class);
    }

    public static final int DUNGEON_SCENE_ID_FIELD_NUMBER = 6;
    private int dungeonSceneId_ = 0;
    /**
     * <code>uint32 dungeon_scene_id = 6;</code>
     * @return The dungeonSceneId.
     */
    @java.lang.Override
    public int getDungeonSceneId() {
      return dungeonSceneId_;
    }

    public static final int FLOOR_LEVEL_FIELD_NUMBER = 7;
    private int floorLevel_ = 0;
    /**
     * <code>uint32 floor_level = 7;</code>
     * @return The floorLevel.
     */
    @java.lang.Override
    public int getFloorLevel() {
      return floorLevel_;
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
      if (dungeonSceneId_ != 0) {
        output.writeUInt32(6, dungeonSceneId_);
      }
      if (floorLevel_ != 0) {
        output.writeUInt32(7, floorLevel_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dungeonSceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, dungeonSceneId_);
      }
      if (floorLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, floorLevel_);
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
      if (!(obj instanceof emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify other = (emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify) obj;

      if (getDungeonSceneId()
          != other.getDungeonSceneId()) return false;
      if (getFloorLevel()
          != other.getFloorLevel()) return false;
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
      hash = (37 * hash) + DUNGEON_SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonSceneId();
      hash = (37 * hash) + FLOOR_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getFloorLevel();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify prototype) {
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
     *   CMD_ID = 988;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code MistTrialFloorLevelNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MistTrialFloorLevelNotify)
        emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.internal_static_MistTrialFloorLevelNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.internal_static_MistTrialFloorLevelNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify.class, emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify.newBuilder()
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
        dungeonSceneId_ = 0;
        floorLevel_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.internal_static_MistTrialFloorLevelNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify build() {
        emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify buildPartial() {
        emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify result = new emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.dungeonSceneId_ = dungeonSceneId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.floorLevel_ = floorLevel_;
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
        if (other instanceof emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify) {
          return mergeFrom((emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify other) {
        if (other == emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify.getDefaultInstance()) return this;
        if (other.getDungeonSceneId() != 0) {
          setDungeonSceneId(other.getDungeonSceneId());
        }
        if (other.getFloorLevel() != 0) {
          setFloorLevel(other.getFloorLevel());
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
              case 48: {
                dungeonSceneId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 48
              case 56: {
                floorLevel_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 56
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

      private int dungeonSceneId_ ;
      /**
       * <code>uint32 dungeon_scene_id = 6;</code>
       * @return The dungeonSceneId.
       */
      @java.lang.Override
      public int getDungeonSceneId() {
        return dungeonSceneId_;
      }
      /**
       * <code>uint32 dungeon_scene_id = 6;</code>
       * @param value The dungeonSceneId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonSceneId(int value) {
        
        dungeonSceneId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_scene_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonSceneId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        dungeonSceneId_ = 0;
        onChanged();
        return this;
      }

      private int floorLevel_ ;
      /**
       * <code>uint32 floor_level = 7;</code>
       * @return The floorLevel.
       */
      @java.lang.Override
      public int getFloorLevel() {
        return floorLevel_;
      }
      /**
       * <code>uint32 floor_level = 7;</code>
       * @param value The floorLevel to set.
       * @return This builder for chaining.
       */
      public Builder setFloorLevel(int value) {
        
        floorLevel_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 floor_level = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearFloorLevel() {
        bitField0_ = (bitField0_ & ~0x00000002);
        floorLevel_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MistTrialFloorLevelNotify)
    }

    // @@protoc_insertion_point(class_scope:MistTrialFloorLevelNotify)
    private static final emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify();
    }

    public static emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MistTrialFloorLevelNotify>
        PARSER = new com.google.protobuf.AbstractParser<MistTrialFloorLevelNotify>() {
      @java.lang.Override
      public MistTrialFloorLevelNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<MistTrialFloorLevelNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MistTrialFloorLevelNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MistTrialFloorLevelNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MistTrialFloorLevelNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037MistTrialFloorLevelNotify.proto\"J\n\031Mis" +
      "tTrialFloorLevelNotify\022\030\n\020dungeon_scene_" +
      "id\030\006 \001(\r\022\023\n\013floor_level\030\007 \001(\rB\030\n\026emu.gin" +
      "gerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MistTrialFloorLevelNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MistTrialFloorLevelNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MistTrialFloorLevelNotify_descriptor,
        new java.lang.String[] { "DungeonSceneId", "FloorLevel", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
