// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WatcherAllDataNotify.proto

package emu.gingerps.net.proto;

public final class WatcherAllDataNotifyOuterClass {
  private WatcherAllDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WatcherAllDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WatcherAllDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 watcher_list = 13;</code>
     * @return A list containing the watcherList.
     */
    java.util.List<java.lang.Integer> getWatcherListList();
    /**
     * <code>repeated uint32 watcher_list = 13;</code>
     * @return The count of watcherList.
     */
    int getWatcherListCount();
    /**
     * <code>repeated uint32 watcher_list = 13;</code>
     * @param index The index of the element to return.
     * @return The watcherList at the given index.
     */
    int getWatcherList(int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 2279;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code WatcherAllDataNotify}
   */
  public static final class WatcherAllDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WatcherAllDataNotify)
      WatcherAllDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WatcherAllDataNotify.newBuilder() to construct.
    private WatcherAllDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WatcherAllDataNotify() {
      watcherList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WatcherAllDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WatcherAllDataNotify(
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
            case 104: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                watcherList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              watcherList_.addInt(input.readUInt32());
              break;
            }
            case 106: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                watcherList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                watcherList_.addInt(input.readUInt32());
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
          watcherList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.internal_static_WatcherAllDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.internal_static_WatcherAllDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify.class, emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify.Builder.class);
    }

    public static final int WATCHER_LIST_FIELD_NUMBER = 13;
    private com.google.protobuf.Internal.IntList watcherList_;
    /**
     * <code>repeated uint32 watcher_list = 13;</code>
     * @return A list containing the watcherList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getWatcherListList() {
      return watcherList_;
    }
    /**
     * <code>repeated uint32 watcher_list = 13;</code>
     * @return The count of watcherList.
     */
    public int getWatcherListCount() {
      return watcherList_.size();
    }
    /**
     * <code>repeated uint32 watcher_list = 13;</code>
     * @param index The index of the element to return.
     * @return The watcherList at the given index.
     */
    public int getWatcherList(int index) {
      return watcherList_.getInt(index);
    }
    private int watcherListMemoizedSerializedSize = -1;

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
      if (getWatcherListList().size() > 0) {
        output.writeUInt32NoTag(106);
        output.writeUInt32NoTag(watcherListMemoizedSerializedSize);
      }
      for (int i = 0; i < watcherList_.size(); i++) {
        output.writeUInt32NoTag(watcherList_.getInt(i));
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
        for (int i = 0; i < watcherList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(watcherList_.getInt(i));
        }
        size += dataSize;
        if (!getWatcherListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        watcherListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify other = (emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify) obj;

      if (!getWatcherListList()
          .equals(other.getWatcherListList())) return false;
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
      if (getWatcherListCount() > 0) {
        hash = (37 * hash) + WATCHER_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getWatcherListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify prototype) {
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
     *   CMD_ID = 2279;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code WatcherAllDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WatcherAllDataNotify)
        emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.internal_static_WatcherAllDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.internal_static_WatcherAllDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify.class, emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify.newBuilder()
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
        watcherList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.internal_static_WatcherAllDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify build() {
        emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify buildPartial() {
        emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify result = new emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          watcherList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.watcherList_ = watcherList_;
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
        if (other instanceof emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify) {
          return mergeFrom((emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify other) {
        if (other == emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify.getDefaultInstance()) return this;
        if (!other.watcherList_.isEmpty()) {
          if (watcherList_.isEmpty()) {
            watcherList_ = other.watcherList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureWatcherListIsMutable();
            watcherList_.addAll(other.watcherList_);
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
        emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList watcherList_ = emptyIntList();
      private void ensureWatcherListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          watcherList_ = mutableCopy(watcherList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 watcher_list = 13;</code>
       * @return A list containing the watcherList.
       */
      public java.util.List<java.lang.Integer>
          getWatcherListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(watcherList_) : watcherList_;
      }
      /**
       * <code>repeated uint32 watcher_list = 13;</code>
       * @return The count of watcherList.
       */
      public int getWatcherListCount() {
        return watcherList_.size();
      }
      /**
       * <code>repeated uint32 watcher_list = 13;</code>
       * @param index The index of the element to return.
       * @return The watcherList at the given index.
       */
      public int getWatcherList(int index) {
        return watcherList_.getInt(index);
      }
      /**
       * <code>repeated uint32 watcher_list = 13;</code>
       * @param index The index to set the value at.
       * @param value The watcherList to set.
       * @return This builder for chaining.
       */
      public Builder setWatcherList(
          int index, int value) {
        ensureWatcherListIsMutable();
        watcherList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 watcher_list = 13;</code>
       * @param value The watcherList to add.
       * @return This builder for chaining.
       */
      public Builder addWatcherList(int value) {
        ensureWatcherListIsMutable();
        watcherList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 watcher_list = 13;</code>
       * @param values The watcherList to add.
       * @return This builder for chaining.
       */
      public Builder addAllWatcherList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureWatcherListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, watcherList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 watcher_list = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearWatcherList() {
        watcherList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:WatcherAllDataNotify)
    }

    // @@protoc_insertion_point(class_scope:WatcherAllDataNotify)
    private static final emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify();
    }

    public static emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WatcherAllDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<WatcherAllDataNotify>() {
      @java.lang.Override
      public WatcherAllDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WatcherAllDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WatcherAllDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WatcherAllDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.WatcherAllDataNotifyOuterClass.WatcherAllDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WatcherAllDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WatcherAllDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032WatcherAllDataNotify.proto\",\n\024WatcherA" +
      "llDataNotify\022\024\n\014watcher_list\030\r \003(\rB\033\n\031em" +
      "u.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WatcherAllDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WatcherAllDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WatcherAllDataNotify_descriptor,
        new java.lang.String[] { "WatcherList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
