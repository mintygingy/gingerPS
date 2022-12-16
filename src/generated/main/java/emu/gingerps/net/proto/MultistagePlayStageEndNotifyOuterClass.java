// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MultistagePlayStageEndNotify.proto

package emu.gingerps.net.proto;

public final class MultistagePlayStageEndNotifyOuterClass {
  private MultistagePlayStageEndNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MultistagePlayStageEndNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MultistagePlayStageEndNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 group_id = 3;</code>
     * @return The groupId.
     */
    int getGroupId();

    /**
     * <code>uint32 play_index = 1;</code>
     * @return The playIndex.
     */
    int getPlayIndex();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 5392;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code MultistagePlayStageEndNotify}
   */
  public static final class MultistagePlayStageEndNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MultistagePlayStageEndNotify)
      MultistagePlayStageEndNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MultistagePlayStageEndNotify.newBuilder() to construct.
    private MultistagePlayStageEndNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MultistagePlayStageEndNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MultistagePlayStageEndNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MultistagePlayStageEndNotify(
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
            case 8: {

              playIndex_ = input.readUInt32();
              break;
            }
            case 24: {

              groupId_ = input.readUInt32();
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
      return emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.internal_static_MultistagePlayStageEndNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.internal_static_MultistagePlayStageEndNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify.class, emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify.Builder.class);
    }

    public static final int GROUP_ID_FIELD_NUMBER = 3;
    private int groupId_;
    /**
     * <code>uint32 group_id = 3;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
    }

    public static final int PLAY_INDEX_FIELD_NUMBER = 1;
    private int playIndex_;
    /**
     * <code>uint32 play_index = 1;</code>
     * @return The playIndex.
     */
    @java.lang.Override
    public int getPlayIndex() {
      return playIndex_;
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
      if (playIndex_ != 0) {
        output.writeUInt32(1, playIndex_);
      }
      if (groupId_ != 0) {
        output.writeUInt32(3, groupId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (playIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, playIndex_);
      }
      if (groupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, groupId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify other = (emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify) obj;

      if (getGroupId()
          != other.getGroupId()) return false;
      if (getPlayIndex()
          != other.getPlayIndex()) return false;
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
      hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId();
      hash = (37 * hash) + PLAY_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getPlayIndex();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify prototype) {
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
     *   CMD_ID = 5392;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code MultistagePlayStageEndNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MultistagePlayStageEndNotify)
        emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.internal_static_MultistagePlayStageEndNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.internal_static_MultistagePlayStageEndNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify.class, emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify.newBuilder()
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
        groupId_ = 0;

        playIndex_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.internal_static_MultistagePlayStageEndNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify build() {
        emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify buildPartial() {
        emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify result = new emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify(this);
        result.groupId_ = groupId_;
        result.playIndex_ = playIndex_;
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
        if (other instanceof emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify) {
          return mergeFrom((emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify other) {
        if (other == emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify.getDefaultInstance()) return this;
        if (other.getGroupId() != 0) {
          setGroupId(other.getGroupId());
        }
        if (other.getPlayIndex() != 0) {
          setPlayIndex(other.getPlayIndex());
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
        emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int groupId_ ;
      /**
       * <code>uint32 group_id = 3;</code>
       * @return The groupId.
       */
      @java.lang.Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 group_id = 3;</code>
       * @param value The groupId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {
        
        groupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 group_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupId() {
        
        groupId_ = 0;
        onChanged();
        return this;
      }

      private int playIndex_ ;
      /**
       * <code>uint32 play_index = 1;</code>
       * @return The playIndex.
       */
      @java.lang.Override
      public int getPlayIndex() {
        return playIndex_;
      }
      /**
       * <code>uint32 play_index = 1;</code>
       * @param value The playIndex to set.
       * @return This builder for chaining.
       */
      public Builder setPlayIndex(int value) {
        
        playIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 play_index = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayIndex() {
        
        playIndex_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MultistagePlayStageEndNotify)
    }

    // @@protoc_insertion_point(class_scope:MultistagePlayStageEndNotify)
    private static final emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify();
    }

    public static emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MultistagePlayStageEndNotify>
        PARSER = new com.google.protobuf.AbstractParser<MultistagePlayStageEndNotify>() {
      @java.lang.Override
      public MultistagePlayStageEndNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MultistagePlayStageEndNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MultistagePlayStageEndNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MultistagePlayStageEndNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.MultistagePlayStageEndNotifyOuterClass.MultistagePlayStageEndNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MultistagePlayStageEndNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MultistagePlayStageEndNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"MultistagePlayStageEndNotify.proto\"D\n\034" +
      "MultistagePlayStageEndNotify\022\020\n\010group_id" +
      "\030\003 \001(\r\022\022\n\nplay_index\030\001 \001(\rB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MultistagePlayStageEndNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MultistagePlayStageEndNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MultistagePlayStageEndNotify_descriptor,
        new java.lang.String[] { "GroupId", "PlayIndex", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
