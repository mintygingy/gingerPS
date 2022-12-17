// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChannelerSlabStageOneoffDungeonNotify.proto

package emu.gingerps.net.proto;

public final class ChannelerSlabStageOneoffDungeonNotifyOuterClass {
  private ChannelerSlabStageOneoffDungeonNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChannelerSlabStageOneoffDungeonNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChannelerSlabStageOneoffDungeonNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_done = 6;</code>
     * @return The isDone.
     */
    boolean getIsDone();

    /**
     * <code>uint32 stage_id = 13;</code>
     * @return The stageId.
     */
    int getStageId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8692;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ChannelerSlabStageOneoffDungeonNotify}
   */
  public static final class ChannelerSlabStageOneoffDungeonNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChannelerSlabStageOneoffDungeonNotify)
      ChannelerSlabStageOneoffDungeonNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChannelerSlabStageOneoffDungeonNotify.newBuilder() to construct.
    private ChannelerSlabStageOneoffDungeonNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChannelerSlabStageOneoffDungeonNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChannelerSlabStageOneoffDungeonNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.internal_static_ChannelerSlabStageOneoffDungeonNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.internal_static_ChannelerSlabStageOneoffDungeonNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify.class, emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify.Builder.class);
    }

    public static final int IS_DONE_FIELD_NUMBER = 6;
    private boolean isDone_ = false;
    /**
     * <code>bool is_done = 6;</code>
     * @return The isDone.
     */
    @java.lang.Override
    public boolean getIsDone() {
      return isDone_;
    }

    public static final int STAGE_ID_FIELD_NUMBER = 13;
    private int stageId_ = 0;
    /**
     * <code>uint32 stage_id = 13;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
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
      if (isDone_ != false) {
        output.writeBool(6, isDone_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(13, stageId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isDone_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isDone_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, stageId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify other = (emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify) obj;

      if (getIsDone()
          != other.getIsDone()) return false;
      if (getStageId()
          != other.getStageId()) return false;
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
      hash = (37 * hash) + IS_DONE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsDone());
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify prototype) {
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
     *   CMD_ID = 8692;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ChannelerSlabStageOneoffDungeonNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChannelerSlabStageOneoffDungeonNotify)
        emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.internal_static_ChannelerSlabStageOneoffDungeonNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.internal_static_ChannelerSlabStageOneoffDungeonNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify.class, emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify.newBuilder()
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
        isDone_ = false;
        stageId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.internal_static_ChannelerSlabStageOneoffDungeonNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify build() {
        emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify buildPartial() {
        emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify result = new emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isDone_ = isDone_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.stageId_ = stageId_;
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
        if (other instanceof emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify) {
          return mergeFrom((emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify other) {
        if (other == emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify.getDefaultInstance()) return this;
        if (other.getIsDone() != false) {
          setIsDone(other.getIsDone());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
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
                isDone_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 48
              case 104: {
                stageId_ = input.readUInt32();
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

      private boolean isDone_ ;
      /**
       * <code>bool is_done = 6;</code>
       * @return The isDone.
       */
      @java.lang.Override
      public boolean getIsDone() {
        return isDone_;
      }
      /**
       * <code>bool is_done = 6;</code>
       * @param value The isDone to set.
       * @return This builder for chaining.
       */
      public Builder setIsDone(boolean value) {
        
        isDone_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_done = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsDone() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isDone_ = false;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 13;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 13;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        stageId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ChannelerSlabStageOneoffDungeonNotify)
    }

    // @@protoc_insertion_point(class_scope:ChannelerSlabStageOneoffDungeonNotify)
    private static final emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify();
    }

    public static emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChannelerSlabStageOneoffDungeonNotify>
        PARSER = new com.google.protobuf.AbstractParser<ChannelerSlabStageOneoffDungeonNotify>() {
      @java.lang.Override
      public ChannelerSlabStageOneoffDungeonNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<ChannelerSlabStageOneoffDungeonNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChannelerSlabStageOneoffDungeonNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.ChannelerSlabStageOneoffDungeonNotifyOuterClass.ChannelerSlabStageOneoffDungeonNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChannelerSlabStageOneoffDungeonNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChannelerSlabStageOneoffDungeonNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+ChannelerSlabStageOneoffDungeonNotify." +
      "proto\"J\n%ChannelerSlabStageOneoffDungeon" +
      "Notify\022\017\n\007is_done\030\006 \001(\010\022\020\n\010stage_id\030\r \001(" +
      "\rB\030\n\026emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChannelerSlabStageOneoffDungeonNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChannelerSlabStageOneoffDungeonNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChannelerSlabStageOneoffDungeonNotify_descriptor,
        new java.lang.String[] { "IsDone", "StageId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
