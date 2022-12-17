// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonEnterPosInfo.proto

package emu.gingerps.net.proto;

public final class DungeonEnterPosInfoOuterClass {
  private DungeonEnterPosInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DungeonEnterPosInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DungeonEnterPosInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 quest_id = 6;</code>
     * @return The questId.
     */
    int getQuestId();

    /**
     * <code>uint32 point_id = 14;</code>
     * @return The pointId.
     */
    int getPointId();
  }
  /**
   * Protobuf type {@code DungeonEnterPosInfo}
   */
  public static final class DungeonEnterPosInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DungeonEnterPosInfo)
      DungeonEnterPosInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DungeonEnterPosInfo.newBuilder() to construct.
    private DungeonEnterPosInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DungeonEnterPosInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DungeonEnterPosInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.internal_static_DungeonEnterPosInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.internal_static_DungeonEnterPosInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo.class, emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo.Builder.class);
    }

    public static final int QUEST_ID_FIELD_NUMBER = 6;
    private int questId_ = 0;
    /**
     * <code>uint32 quest_id = 6;</code>
     * @return The questId.
     */
    @java.lang.Override
    public int getQuestId() {
      return questId_;
    }

    public static final int POINT_ID_FIELD_NUMBER = 14;
    private int pointId_ = 0;
    /**
     * <code>uint32 point_id = 14;</code>
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
      if (questId_ != 0) {
        output.writeUInt32(6, questId_);
      }
      if (pointId_ != 0) {
        output.writeUInt32(14, pointId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (questId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, questId_);
      }
      if (pointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, pointId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo other = (emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo) obj;

      if (getQuestId()
          != other.getQuestId()) return false;
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
      hash = (37 * hash) + QUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getQuestId();
      hash = (37 * hash) + POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPointId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo prototype) {
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
     * Protobuf type {@code DungeonEnterPosInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DungeonEnterPosInfo)
        emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.internal_static_DungeonEnterPosInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.internal_static_DungeonEnterPosInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo.class, emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo.newBuilder()
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
        questId_ = 0;
        pointId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.internal_static_DungeonEnterPosInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo build() {
        emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo buildPartial() {
        emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo result = new emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.questId_ = questId_;
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
        if (other instanceof emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo) {
          return mergeFrom((emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo other) {
        if (other == emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo.getDefaultInstance()) return this;
        if (other.getQuestId() != 0) {
          setQuestId(other.getQuestId());
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
              case 48: {
                questId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 48
              case 112: {
                pointId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
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

      private int questId_ ;
      /**
       * <code>uint32 quest_id = 6;</code>
       * @return The questId.
       */
      @java.lang.Override
      public int getQuestId() {
        return questId_;
      }
      /**
       * <code>uint32 quest_id = 6;</code>
       * @param value The questId to set.
       * @return This builder for chaining.
       */
      public Builder setQuestId(int value) {
        
        questId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 quest_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearQuestId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        questId_ = 0;
        onChanged();
        return this;
      }

      private int pointId_ ;
      /**
       * <code>uint32 point_id = 14;</code>
       * @return The pointId.
       */
      @java.lang.Override
      public int getPointId() {
        return pointId_;
      }
      /**
       * <code>uint32 point_id = 14;</code>
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
       * <code>uint32 point_id = 14;</code>
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


      // @@protoc_insertion_point(builder_scope:DungeonEnterPosInfo)
    }

    // @@protoc_insertion_point(class_scope:DungeonEnterPosInfo)
    private static final emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo();
    }

    public static emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DungeonEnterPosInfo>
        PARSER = new com.google.protobuf.AbstractParser<DungeonEnterPosInfo>() {
      @java.lang.Override
      public DungeonEnterPosInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<DungeonEnterPosInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DungeonEnterPosInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DungeonEnterPosInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DungeonEnterPosInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031DungeonEnterPosInfo.proto\"9\n\023DungeonEn" +
      "terPosInfo\022\020\n\010quest_id\030\006 \001(\r\022\020\n\010point_id" +
      "\030\016 \001(\rB\030\n\026emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DungeonEnterPosInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DungeonEnterPosInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DungeonEnterPosInfo_descriptor,
        new java.lang.String[] { "QuestId", "PointId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
