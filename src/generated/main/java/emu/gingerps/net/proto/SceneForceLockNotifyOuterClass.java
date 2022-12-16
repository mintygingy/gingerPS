// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneForceLockNotify.proto

package emu.gingerps.net.proto;

public final class SceneForceLockNotifyOuterClass {
  private SceneForceLockNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneForceLockNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneForceLockNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 force_id_list = 1;</code>
     * @return A list containing the forceIdList.
     */
    java.util.List<java.lang.Integer> getForceIdListList();
    /**
     * <code>repeated uint32 force_id_list = 1;</code>
     * @return The count of forceIdList.
     */
    int getForceIdListCount();
    /**
     * <code>repeated uint32 force_id_list = 1;</code>
     * @param index The index of the element to return.
     * @return The forceIdList at the given index.
     */
    int getForceIdList(int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 280;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code SceneForceLockNotify}
   */
  public static final class SceneForceLockNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneForceLockNotify)
      SceneForceLockNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneForceLockNotify.newBuilder() to construct.
    private SceneForceLockNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneForceLockNotify() {
      forceIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneForceLockNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneForceLockNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                forceIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              forceIdList_.addInt(input.readUInt32());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                forceIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                forceIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          forceIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.internal_static_SceneForceLockNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.internal_static_SceneForceLockNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify.class, emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify.Builder.class);
    }

    public static final int FORCE_ID_LIST_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.IntList forceIdList_;
    /**
     * <code>repeated uint32 force_id_list = 1;</code>
     * @return A list containing the forceIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getForceIdListList() {
      return forceIdList_;
    }
    /**
     * <code>repeated uint32 force_id_list = 1;</code>
     * @return The count of forceIdList.
     */
    public int getForceIdListCount() {
      return forceIdList_.size();
    }
    /**
     * <code>repeated uint32 force_id_list = 1;</code>
     * @param index The index of the element to return.
     * @return The forceIdList at the given index.
     */
    public int getForceIdList(int index) {
      return forceIdList_.getInt(index);
    }
    private int forceIdListMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (getForceIdListList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(forceIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < forceIdList_.size(); i++) {
        output.writeUInt32NoTag(forceIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < forceIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(forceIdList_.getInt(i));
        }
        size += dataSize;
        if (!getForceIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        forceIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify other = (emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify) obj;

      if (!getForceIdListList()
          .equals(other.getForceIdListList())) return false;
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
      if (getForceIdListCount() > 0) {
        hash = (37 * hash) + FORCE_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getForceIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify prototype) {
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
     *   CMD_ID = 280;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code SceneForceLockNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneForceLockNotify)
        emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.internal_static_SceneForceLockNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.internal_static_SceneForceLockNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify.class, emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify.newBuilder()
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
        forceIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.internal_static_SceneForceLockNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify build() {
        emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify buildPartial() {
        emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify result = new emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          forceIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.forceIdList_ = forceIdList_;
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
        if (other instanceof emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify) {
          return mergeFrom((emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify other) {
        if (other == emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify.getDefaultInstance()) return this;
        if (!other.forceIdList_.isEmpty()) {
          if (forceIdList_.isEmpty()) {
            forceIdList_ = other.forceIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureForceIdListIsMutable();
            forceIdList_.addAll(other.forceIdList_);
          }
          onChanged();
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
        emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList forceIdList_ = emptyIntList();
      private void ensureForceIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          forceIdList_ = mutableCopy(forceIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 force_id_list = 1;</code>
       * @return A list containing the forceIdList.
       */
      public java.util.List<java.lang.Integer>
          getForceIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(forceIdList_) : forceIdList_;
      }
      /**
       * <code>repeated uint32 force_id_list = 1;</code>
       * @return The count of forceIdList.
       */
      public int getForceIdListCount() {
        return forceIdList_.size();
      }
      /**
       * <code>repeated uint32 force_id_list = 1;</code>
       * @param index The index of the element to return.
       * @return The forceIdList at the given index.
       */
      public int getForceIdList(int index) {
        return forceIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 force_id_list = 1;</code>
       * @param index The index to set the value at.
       * @param value The forceIdList to set.
       * @return This builder for chaining.
       */
      public Builder setForceIdList(
          int index, int value) {
        ensureForceIdListIsMutable();
        forceIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 force_id_list = 1;</code>
       * @param value The forceIdList to add.
       * @return This builder for chaining.
       */
      public Builder addForceIdList(int value) {
        ensureForceIdListIsMutable();
        forceIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 force_id_list = 1;</code>
       * @param values The forceIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllForceIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureForceIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, forceIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 force_id_list = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearForceIdList() {
        forceIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:SceneForceLockNotify)
    }

    // @@protoc_insertion_point(class_scope:SceneForceLockNotify)
    private static final emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify();
    }

    public static emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneForceLockNotify>
        PARSER = new com.google.protobuf.AbstractParser<SceneForceLockNotify>() {
      @java.lang.Override
      public SceneForceLockNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneForceLockNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneForceLockNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneForceLockNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.SceneForceLockNotifyOuterClass.SceneForceLockNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneForceLockNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneForceLockNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032SceneForceLockNotify.proto\"-\n\024SceneFor" +
      "ceLockNotify\022\025\n\rforce_id_list\030\001 \003(\rB\033\n\031e" +
      "mu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneForceLockNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneForceLockNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneForceLockNotify_descriptor,
        new java.lang.String[] { "ForceIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
