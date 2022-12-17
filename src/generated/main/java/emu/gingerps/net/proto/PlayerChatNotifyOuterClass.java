// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerChatNotify.proto

package emu.gingerps.net.proto;

public final class PlayerChatNotifyOuterClass {
  private PlayerChatNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerChatNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerChatNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ChatInfo chat_info = 11;</code>
     * @return Whether the chatInfo field is set.
     */
    boolean hasChatInfo();
    /**
     * <code>.ChatInfo chat_info = 11;</code>
     * @return The chatInfo.
     */
    emu.gingerps.net.proto.ChatInfoOuterClass.ChatInfo getChatInfo();
    /**
     * <code>.ChatInfo chat_info = 11;</code>
     */
    emu.gingerps.net.proto.ChatInfoOuterClass.ChatInfoOrBuilder getChatInfoOrBuilder();

    /**
     * <code>uint32 channel_id = 13;</code>
     * @return The channelId.
     */
    int getChannelId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 3265;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code PlayerChatNotify}
   */
  public static final class PlayerChatNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerChatNotify)
      PlayerChatNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerChatNotify.newBuilder() to construct.
    private PlayerChatNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerChatNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerChatNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.PlayerChatNotifyOuterClass.internal_static_PlayerChatNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.PlayerChatNotifyOuterClass.internal_static_PlayerChatNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify.class, emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify.Builder.class);
    }

    public static final int CHAT_INFO_FIELD_NUMBER = 11;
    private emu.gingerps.net.proto.ChatInfoOuterClass.ChatInfo chatInfo_;
    /**
     * <code>.ChatInfo chat_info = 11;</code>
     * @return Whether the chatInfo field is set.
     */
    @java.lang.Override
    public boolean hasChatInfo() {
      return chatInfo_ != null;
    }
    /**
     * <code>.ChatInfo chat_info = 11;</code>
     * @return The chatInfo.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.ChatInfoOuterClass.ChatInfo getChatInfo() {
      return chatInfo_ == null ? emu.gingerps.net.proto.ChatInfoOuterClass.ChatInfo.getDefaultInstance() : chatInfo_;
    }
    /**
     * <code>.ChatInfo chat_info = 11;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.ChatInfoOuterClass.ChatInfoOrBuilder getChatInfoOrBuilder() {
      return chatInfo_ == null ? emu.gingerps.net.proto.ChatInfoOuterClass.ChatInfo.getDefaultInstance() : chatInfo_;
    }

    public static final int CHANNEL_ID_FIELD_NUMBER = 13;
    private int channelId_ = 0;
    /**
     * <code>uint32 channel_id = 13;</code>
     * @return The channelId.
     */
    @java.lang.Override
    public int getChannelId() {
      return channelId_;
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
      if (chatInfo_ != null) {
        output.writeMessage(11, getChatInfo());
      }
      if (channelId_ != 0) {
        output.writeUInt32(13, channelId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (chatInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getChatInfo());
      }
      if (channelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, channelId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify other = (emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify) obj;

      if (hasChatInfo() != other.hasChatInfo()) return false;
      if (hasChatInfo()) {
        if (!getChatInfo()
            .equals(other.getChatInfo())) return false;
      }
      if (getChannelId()
          != other.getChannelId()) return false;
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
      if (hasChatInfo()) {
        hash = (37 * hash) + CHAT_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getChatInfo().hashCode();
      }
      hash = (37 * hash) + CHANNEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChannelId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify prototype) {
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
     *   CMD_ID = 3265;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code PlayerChatNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerChatNotify)
        emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.PlayerChatNotifyOuterClass.internal_static_PlayerChatNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.PlayerChatNotifyOuterClass.internal_static_PlayerChatNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify.class, emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify.newBuilder()
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
        chatInfo_ = null;
        if (chatInfoBuilder_ != null) {
          chatInfoBuilder_.dispose();
          chatInfoBuilder_ = null;
        }
        channelId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.PlayerChatNotifyOuterClass.internal_static_PlayerChatNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify build() {
        emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify buildPartial() {
        emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify result = new emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.chatInfo_ = chatInfoBuilder_ == null
              ? chatInfo_
              : chatInfoBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.channelId_ = channelId_;
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
        if (other instanceof emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify) {
          return mergeFrom((emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify other) {
        if (other == emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify.getDefaultInstance()) return this;
        if (other.hasChatInfo()) {
          mergeChatInfo(other.getChatInfo());
        }
        if (other.getChannelId() != 0) {
          setChannelId(other.getChannelId());
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
              case 90: {
                input.readMessage(
                    getChatInfoFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 90
              case 104: {
                channelId_ = input.readUInt32();
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

      private emu.gingerps.net.proto.ChatInfoOuterClass.ChatInfo chatInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.ChatInfoOuterClass.ChatInfo, emu.gingerps.net.proto.ChatInfoOuterClass.ChatInfo.Builder, emu.gingerps.net.proto.ChatInfoOuterClass.ChatInfoOrBuilder> chatInfoBuilder_;
      /**
       * <code>.ChatInfo chat_info = 11;</code>
       * @return Whether the chatInfo field is set.
       */
      public boolean hasChatInfo() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.ChatInfo chat_info = 11;</code>
       * @return The chatInfo.
       */
      public emu.gingerps.net.proto.ChatInfoOuterClass.ChatInfo getChatInfo() {
        if (chatInfoBuilder_ == null) {
          return chatInfo_ == null ? emu.gingerps.net.proto.ChatInfoOuterClass.ChatInfo.getDefaultInstance() : chatInfo_;
        } else {
          return chatInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.ChatInfo chat_info = 11;</code>
       */
      public Builder setChatInfo(emu.gingerps.net.proto.ChatInfoOuterClass.ChatInfo value) {
        if (chatInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          chatInfo_ = value;
        } else {
          chatInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.ChatInfo chat_info = 11;</code>
       */
      public Builder setChatInfo(
          emu.gingerps.net.proto.ChatInfoOuterClass.ChatInfo.Builder builderForValue) {
        if (chatInfoBuilder_ == null) {
          chatInfo_ = builderForValue.build();
        } else {
          chatInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.ChatInfo chat_info = 11;</code>
       */
      public Builder mergeChatInfo(emu.gingerps.net.proto.ChatInfoOuterClass.ChatInfo value) {
        if (chatInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            chatInfo_ != null &&
            chatInfo_ != emu.gingerps.net.proto.ChatInfoOuterClass.ChatInfo.getDefaultInstance()) {
            getChatInfoBuilder().mergeFrom(value);
          } else {
            chatInfo_ = value;
          }
        } else {
          chatInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.ChatInfo chat_info = 11;</code>
       */
      public Builder clearChatInfo() {
        bitField0_ = (bitField0_ & ~0x00000001);
        chatInfo_ = null;
        if (chatInfoBuilder_ != null) {
          chatInfoBuilder_.dispose();
          chatInfoBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.ChatInfo chat_info = 11;</code>
       */
      public emu.gingerps.net.proto.ChatInfoOuterClass.ChatInfo.Builder getChatInfoBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getChatInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.ChatInfo chat_info = 11;</code>
       */
      public emu.gingerps.net.proto.ChatInfoOuterClass.ChatInfoOrBuilder getChatInfoOrBuilder() {
        if (chatInfoBuilder_ != null) {
          return chatInfoBuilder_.getMessageOrBuilder();
        } else {
          return chatInfo_ == null ?
              emu.gingerps.net.proto.ChatInfoOuterClass.ChatInfo.getDefaultInstance() : chatInfo_;
        }
      }
      /**
       * <code>.ChatInfo chat_info = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.ChatInfoOuterClass.ChatInfo, emu.gingerps.net.proto.ChatInfoOuterClass.ChatInfo.Builder, emu.gingerps.net.proto.ChatInfoOuterClass.ChatInfoOrBuilder> 
          getChatInfoFieldBuilder() {
        if (chatInfoBuilder_ == null) {
          chatInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.ChatInfoOuterClass.ChatInfo, emu.gingerps.net.proto.ChatInfoOuterClass.ChatInfo.Builder, emu.gingerps.net.proto.ChatInfoOuterClass.ChatInfoOrBuilder>(
                  getChatInfo(),
                  getParentForChildren(),
                  isClean());
          chatInfo_ = null;
        }
        return chatInfoBuilder_;
      }

      private int channelId_ ;
      /**
       * <code>uint32 channel_id = 13;</code>
       * @return The channelId.
       */
      @java.lang.Override
      public int getChannelId() {
        return channelId_;
      }
      /**
       * <code>uint32 channel_id = 13;</code>
       * @param value The channelId to set.
       * @return This builder for chaining.
       */
      public Builder setChannelId(int value) {
        
        channelId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 channel_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearChannelId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        channelId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerChatNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerChatNotify)
    private static final emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify();
    }

    public static emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerChatNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerChatNotify>() {
      @java.lang.Override
      public PlayerChatNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayerChatNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerChatNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.PlayerChatNotifyOuterClass.PlayerChatNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerChatNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerChatNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026PlayerChatNotify.proto\032\016ChatInfo.proto" +
      "\"D\n\020PlayerChatNotify\022\034\n\tchat_info\030\013 \001(\0132" +
      "\t.ChatInfo\022\022\n\nchannel_id\030\r \001(\rB\030\n\026emu.gi" +
      "ngerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.ChatInfoOuterClass.getDescriptor(),
        });
    internal_static_PlayerChatNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerChatNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerChatNotify_descriptor,
        new java.lang.String[] { "ChatInfo", "ChannelId", });
    emu.gingerps.net.proto.ChatInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
