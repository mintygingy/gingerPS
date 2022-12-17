// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonCandidateTeamCreateReq.proto

package emu.gingerps.net.proto;

public final class DungeonCandidateTeamCreateReqOuterClass {
  private DungeonCandidateTeamCreateReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DungeonCandidateTeamCreateReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DungeonCandidateTeamCreateReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 dungeon_id = 3;</code>
     * @return The dungeonId.
     */
    int getDungeonId();

    /**
     * <code>uint32 point_id = 1;</code>
     * @return The pointId.
     */
    int getPointId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 933;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code DungeonCandidateTeamCreateReq}
   */
  public static final class DungeonCandidateTeamCreateReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DungeonCandidateTeamCreateReq)
      DungeonCandidateTeamCreateReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DungeonCandidateTeamCreateReq.newBuilder() to construct.
    private DungeonCandidateTeamCreateReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DungeonCandidateTeamCreateReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DungeonCandidateTeamCreateReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.internal_static_DungeonCandidateTeamCreateReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.internal_static_DungeonCandidateTeamCreateReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq.class, emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq.Builder.class);
    }

    public static final int DUNGEON_ID_FIELD_NUMBER = 3;
    private int dungeonId_ = 0;
    /**
     * <code>uint32 dungeon_id = 3;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
    }

    public static final int POINT_ID_FIELD_NUMBER = 1;
    private int pointId_ = 0;
    /**
     * <code>uint32 point_id = 1;</code>
     * @return The pointId.
     */
    @java.lang.Override
    public int getPointId() {
      return pointId_;
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
      if (pointId_ != 0) {
        output.writeUInt32(1, pointId_);
      }
      if (dungeonId_ != 0) {
        output.writeUInt32(3, dungeonId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (pointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, pointId_);
      }
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, dungeonId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq other = (emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq) obj;

      if (getDungeonId()
          != other.getDungeonId()) return false;
      if (getPointId()
          != other.getPointId()) return false;
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
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (37 * hash) + POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPointId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq prototype) {
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
     *   CMD_ID = 933;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code DungeonCandidateTeamCreateReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DungeonCandidateTeamCreateReq)
        emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.internal_static_DungeonCandidateTeamCreateReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.internal_static_DungeonCandidateTeamCreateReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq.class, emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq.newBuilder()
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
        dungeonId_ = 0;
        pointId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.internal_static_DungeonCandidateTeamCreateReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq build() {
        emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq buildPartial() {
        emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq result = new emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.dungeonId_ = dungeonId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.pointId_ = pointId_;
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
        if (other instanceof emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq) {
          return mergeFrom((emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq other) {
        if (other == emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq.getDefaultInstance()) return this;
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
        }
        if (other.getPointId() != 0) {
          setPointId(other.getPointId());
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
                pointId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 8
              case 24: {
                dungeonId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 24
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

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeon_id = 3;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeon_id = 3;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        dungeonId_ = 0;
        onChanged();
        return this;
      }

      private int pointId_ ;
      /**
       * <code>uint32 point_id = 1;</code>
       * @return The pointId.
       */
      @java.lang.Override
      public int getPointId() {
        return pointId_;
      }
      /**
       * <code>uint32 point_id = 1;</code>
       * @param value The pointId to set.
       * @return This builder for chaining.
       */
      public Builder setPointId(int value) {
        
        pointId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 point_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPointId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        pointId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DungeonCandidateTeamCreateReq)
    }

    // @@protoc_insertion_point(class_scope:DungeonCandidateTeamCreateReq)
    private static final emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq();
    }

    public static emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DungeonCandidateTeamCreateReq>
        PARSER = new com.google.protobuf.AbstractParser<DungeonCandidateTeamCreateReq>() {
      @java.lang.Override
      public DungeonCandidateTeamCreateReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<DungeonCandidateTeamCreateReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DungeonCandidateTeamCreateReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.DungeonCandidateTeamCreateReqOuterClass.DungeonCandidateTeamCreateReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DungeonCandidateTeamCreateReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DungeonCandidateTeamCreateReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#DungeonCandidateTeamCreateReq.proto\"E\n" +
      "\035DungeonCandidateTeamCreateReq\022\022\n\ndungeo" +
      "n_id\030\003 \001(\r\022\020\n\010point_id\030\001 \001(\rB\030\n\026emu.ging" +
      "erps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DungeonCandidateTeamCreateReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DungeonCandidateTeamCreateReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DungeonCandidateTeamCreateReq_descriptor,
        new java.lang.String[] { "DungeonId", "PointId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
