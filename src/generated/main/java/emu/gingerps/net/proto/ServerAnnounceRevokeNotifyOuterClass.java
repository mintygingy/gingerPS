// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServerAnnounceRevokeNotify.proto

package emu.gingerps.net.proto;

public final class ServerAnnounceRevokeNotifyOuterClass {
  private ServerAnnounceRevokeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ServerAnnounceRevokeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ServerAnnounceRevokeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 config_id_list = 9;</code>
     * @return A list containing the configIdList.
     */
    java.util.List<java.lang.Integer> getConfigIdListList();
    /**
     * <code>repeated uint32 config_id_list = 9;</code>
     * @return The count of configIdList.
     */
    int getConfigIdListCount();
    /**
     * <code>repeated uint32 config_id_list = 9;</code>
     * @param index The index of the element to return.
     * @return The configIdList at the given index.
     */
    int getConfigIdList(int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 2064;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ServerAnnounceRevokeNotify}
   */
  public static final class ServerAnnounceRevokeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ServerAnnounceRevokeNotify)
      ServerAnnounceRevokeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ServerAnnounceRevokeNotify.newBuilder() to construct.
    private ServerAnnounceRevokeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ServerAnnounceRevokeNotify() {
      configIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ServerAnnounceRevokeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.internal_static_ServerAnnounceRevokeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.internal_static_ServerAnnounceRevokeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify.class, emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify.Builder.class);
    }

    public static final int CONFIG_ID_LIST_FIELD_NUMBER = 9;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList configIdList_;
    /**
     * <code>repeated uint32 config_id_list = 9;</code>
     * @return A list containing the configIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getConfigIdListList() {
      return configIdList_;
    }
    /**
     * <code>repeated uint32 config_id_list = 9;</code>
     * @return The count of configIdList.
     */
    public int getConfigIdListCount() {
      return configIdList_.size();
    }
    /**
     * <code>repeated uint32 config_id_list = 9;</code>
     * @param index The index of the element to return.
     * @return The configIdList at the given index.
     */
    public int getConfigIdList(int index) {
      return configIdList_.getInt(index);
    }
    private int configIdListMemoizedSerializedSize = -1;

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
      if (getConfigIdListList().size() > 0) {
        output.writeUInt32NoTag(74);
        output.writeUInt32NoTag(configIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < configIdList_.size(); i++) {
        output.writeUInt32NoTag(configIdList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < configIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(configIdList_.getInt(i));
        }
        size += dataSize;
        if (!getConfigIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        configIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify other = (emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify) obj;

      if (!getConfigIdListList()
          .equals(other.getConfigIdListList())) return false;
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
      if (getConfigIdListCount() > 0) {
        hash = (37 * hash) + CONFIG_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getConfigIdListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify prototype) {
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
     *   CMD_ID = 2064;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ServerAnnounceRevokeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ServerAnnounceRevokeNotify)
        emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.internal_static_ServerAnnounceRevokeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.internal_static_ServerAnnounceRevokeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify.class, emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify.newBuilder()
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
        configIdList_ = emptyIntList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.internal_static_ServerAnnounceRevokeNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify build() {
        emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify buildPartial() {
        emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify result = new emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify result) {
        if (((bitField0_ & 0x00000001) != 0)) {
          configIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.configIdList_ = configIdList_;
      }

      private void buildPartial0(emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify result) {
        int from_bitField0_ = bitField0_;
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
        if (other instanceof emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify) {
          return mergeFrom((emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify other) {
        if (other == emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify.getDefaultInstance()) return this;
        if (!other.configIdList_.isEmpty()) {
          if (configIdList_.isEmpty()) {
            configIdList_ = other.configIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureConfigIdListIsMutable();
            configIdList_.addAll(other.configIdList_);
          }
          onChanged();
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
              case 72: {
                int v = input.readUInt32();
                ensureConfigIdListIsMutable();
                configIdList_.addInt(v);
                break;
              } // case 72
              case 74: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureConfigIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  configIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 74
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

      private com.google.protobuf.Internal.IntList configIdList_ = emptyIntList();
      private void ensureConfigIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          configIdList_ = mutableCopy(configIdList_);
          bitField0_ |= 0x00000001;
        }
      }
      /**
       * <code>repeated uint32 config_id_list = 9;</code>
       * @return A list containing the configIdList.
       */
      public java.util.List<java.lang.Integer>
          getConfigIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(configIdList_) : configIdList_;
      }
      /**
       * <code>repeated uint32 config_id_list = 9;</code>
       * @return The count of configIdList.
       */
      public int getConfigIdListCount() {
        return configIdList_.size();
      }
      /**
       * <code>repeated uint32 config_id_list = 9;</code>
       * @param index The index of the element to return.
       * @return The configIdList at the given index.
       */
      public int getConfigIdList(int index) {
        return configIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 config_id_list = 9;</code>
       * @param index The index to set the value at.
       * @param value The configIdList to set.
       * @return This builder for chaining.
       */
      public Builder setConfigIdList(
          int index, int value) {
        
        ensureConfigIdListIsMutable();
        configIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 config_id_list = 9;</code>
       * @param value The configIdList to add.
       * @return This builder for chaining.
       */
      public Builder addConfigIdList(int value) {
        
        ensureConfigIdListIsMutable();
        configIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 config_id_list = 9;</code>
       * @param values The configIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllConfigIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureConfigIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, configIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 config_id_list = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearConfigIdList() {
        configIdList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:ServerAnnounceRevokeNotify)
    }

    // @@protoc_insertion_point(class_scope:ServerAnnounceRevokeNotify)
    private static final emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify();
    }

    public static emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ServerAnnounceRevokeNotify>
        PARSER = new com.google.protobuf.AbstractParser<ServerAnnounceRevokeNotify>() {
      @java.lang.Override
      public ServerAnnounceRevokeNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<ServerAnnounceRevokeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ServerAnnounceRevokeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.ServerAnnounceRevokeNotifyOuterClass.ServerAnnounceRevokeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServerAnnounceRevokeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ServerAnnounceRevokeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n ServerAnnounceRevokeNotify.proto\"4\n\032Se" +
      "rverAnnounceRevokeNotify\022\026\n\016config_id_li" +
      "st\030\t \003(\rB\030\n\026emu.gingerps.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ServerAnnounceRevokeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ServerAnnounceRevokeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ServerAnnounceRevokeNotify_descriptor,
        new java.lang.String[] { "ConfigIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
