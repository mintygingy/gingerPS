// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChatChannelUpdateNotify.proto

package emu.gingerps.net.proto;

public final class ChatChannelUpdateNotifyOuterClass {
  private ChatChannelUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChatChannelUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChatChannelUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 channel_id = 2;</code>
     * @return The channelId.
     */
    int getChannelId();

    /**
     * <code>.ChatChannelInfo channel_info = 5;</code>
     * @return Whether the channelInfo field is set.
     */
    boolean hasChannelInfo();
    /**
     * <code>.ChatChannelInfo channel_info = 5;</code>
     * @return The channelInfo.
     */
    emu.gingerps.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo getChannelInfo();
    /**
     * <code>.ChatChannelInfo channel_info = 5;</code>
     */
    emu.gingerps.net.proto.ChatChannelInfoOuterClass.ChatChannelInfoOrBuilder getChannelInfoOrBuilder();

    /**
     * <code>bool is_create = 15;</code>
     * @return The isCreate.
     */
    boolean getIsCreate();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4989;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ChatChannelUpdateNotify}
   */
  public static final class ChatChannelUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChatChannelUpdateNotify)
      ChatChannelUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChatChannelUpdateNotify.newBuilder() to construct.
    private ChatChannelUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChatChannelUpdateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChatChannelUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChatChannelUpdateNotify(
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
            case 16: {

              channelId_ = input.readUInt32();
              break;
            }
            case 42: {
              emu.gingerps.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo.Builder subBuilder = null;
              if (channelInfo_ != null) {
                subBuilder = channelInfo_.toBuilder();
              }
              channelInfo_ = input.readMessage(emu.gingerps.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(channelInfo_);
                channelInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 120: {

              isCreate_ = input.readBool();
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
      return emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.internal_static_ChatChannelUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.internal_static_ChatChannelUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify.class, emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify.Builder.class);
    }

    public static final int CHANNEL_ID_FIELD_NUMBER = 2;
    private int channelId_;
    /**
     * <code>uint32 channel_id = 2;</code>
     * @return The channelId.
     */
    @java.lang.Override
    public int getChannelId() {
      return channelId_;
    }

    public static final int CHANNEL_INFO_FIELD_NUMBER = 5;
    private emu.gingerps.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo channelInfo_;
    /**
     * <code>.ChatChannelInfo channel_info = 5;</code>
     * @return Whether the channelInfo field is set.
     */
    @java.lang.Override
    public boolean hasChannelInfo() {
      return channelInfo_ != null;
    }
    /**
     * <code>.ChatChannelInfo channel_info = 5;</code>
     * @return The channelInfo.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo getChannelInfo() {
      return channelInfo_ == null ? emu.gingerps.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo.getDefaultInstance() : channelInfo_;
    }
    /**
     * <code>.ChatChannelInfo channel_info = 5;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.ChatChannelInfoOuterClass.ChatChannelInfoOrBuilder getChannelInfoOrBuilder() {
      return getChannelInfo();
    }

    public static final int IS_CREATE_FIELD_NUMBER = 15;
    private boolean isCreate_;
    /**
     * <code>bool is_create = 15;</code>
     * @return The isCreate.
     */
    @java.lang.Override
    public boolean getIsCreate() {
      return isCreate_;
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
      if (channelId_ != 0) {
        output.writeUInt32(2, channelId_);
      }
      if (channelInfo_ != null) {
        output.writeMessage(5, getChannelInfo());
      }
      if (isCreate_ != false) {
        output.writeBool(15, isCreate_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (channelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, channelId_);
      }
      if (channelInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getChannelInfo());
      }
      if (isCreate_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isCreate_);
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
      if (!(obj instanceof emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify other = (emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify) obj;

      if (getChannelId()
          != other.getChannelId()) return false;
      if (hasChannelInfo() != other.hasChannelInfo()) return false;
      if (hasChannelInfo()) {
        if (!getChannelInfo()
            .equals(other.getChannelInfo())) return false;
      }
      if (getIsCreate()
          != other.getIsCreate()) return false;
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
      hash = (37 * hash) + CHANNEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChannelId();
      if (hasChannelInfo()) {
        hash = (37 * hash) + CHANNEL_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getChannelInfo().hashCode();
      }
      hash = (37 * hash) + IS_CREATE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsCreate());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify prototype) {
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
     *   CMD_ID = 4989;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ChatChannelUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChatChannelUpdateNotify)
        emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.internal_static_ChatChannelUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.internal_static_ChatChannelUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify.class, emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify.newBuilder()
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
        channelId_ = 0;

        if (channelInfoBuilder_ == null) {
          channelInfo_ = null;
        } else {
          channelInfo_ = null;
          channelInfoBuilder_ = null;
        }
        isCreate_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.internal_static_ChatChannelUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify build() {
        emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify buildPartial() {
        emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify result = new emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify(this);
        result.channelId_ = channelId_;
        if (channelInfoBuilder_ == null) {
          result.channelInfo_ = channelInfo_;
        } else {
          result.channelInfo_ = channelInfoBuilder_.build();
        }
        result.isCreate_ = isCreate_;
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
        if (other instanceof emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify) {
          return mergeFrom((emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify other) {
        if (other == emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify.getDefaultInstance()) return this;
        if (other.getChannelId() != 0) {
          setChannelId(other.getChannelId());
        }
        if (other.hasChannelInfo()) {
          mergeChannelInfo(other.getChannelInfo());
        }
        if (other.getIsCreate() != false) {
          setIsCreate(other.getIsCreate());
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
        emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int channelId_ ;
      /**
       * <code>uint32 channel_id = 2;</code>
       * @return The channelId.
       */
      @java.lang.Override
      public int getChannelId() {
        return channelId_;
      }
      /**
       * <code>uint32 channel_id = 2;</code>
       * @param value The channelId to set.
       * @return This builder for chaining.
       */
      public Builder setChannelId(int value) {
        
        channelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 channel_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearChannelId() {
        
        channelId_ = 0;
        onChanged();
        return this;
      }

      private emu.gingerps.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo channelInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo, emu.gingerps.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo.Builder, emu.gingerps.net.proto.ChatChannelInfoOuterClass.ChatChannelInfoOrBuilder> channelInfoBuilder_;
      /**
       * <code>.ChatChannelInfo channel_info = 5;</code>
       * @return Whether the channelInfo field is set.
       */
      public boolean hasChannelInfo() {
        return channelInfoBuilder_ != null || channelInfo_ != null;
      }
      /**
       * <code>.ChatChannelInfo channel_info = 5;</code>
       * @return The channelInfo.
       */
      public emu.gingerps.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo getChannelInfo() {
        if (channelInfoBuilder_ == null) {
          return channelInfo_ == null ? emu.gingerps.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo.getDefaultInstance() : channelInfo_;
        } else {
          return channelInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.ChatChannelInfo channel_info = 5;</code>
       */
      public Builder setChannelInfo(emu.gingerps.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo value) {
        if (channelInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          channelInfo_ = value;
          onChanged();
        } else {
          channelInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.ChatChannelInfo channel_info = 5;</code>
       */
      public Builder setChannelInfo(
          emu.gingerps.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo.Builder builderForValue) {
        if (channelInfoBuilder_ == null) {
          channelInfo_ = builderForValue.build();
          onChanged();
        } else {
          channelInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.ChatChannelInfo channel_info = 5;</code>
       */
      public Builder mergeChannelInfo(emu.gingerps.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo value) {
        if (channelInfoBuilder_ == null) {
          if (channelInfo_ != null) {
            channelInfo_ =
              emu.gingerps.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo.newBuilder(channelInfo_).mergeFrom(value).buildPartial();
          } else {
            channelInfo_ = value;
          }
          onChanged();
        } else {
          channelInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.ChatChannelInfo channel_info = 5;</code>
       */
      public Builder clearChannelInfo() {
        if (channelInfoBuilder_ == null) {
          channelInfo_ = null;
          onChanged();
        } else {
          channelInfo_ = null;
          channelInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.ChatChannelInfo channel_info = 5;</code>
       */
      public emu.gingerps.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo.Builder getChannelInfoBuilder() {
        
        onChanged();
        return getChannelInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.ChatChannelInfo channel_info = 5;</code>
       */
      public emu.gingerps.net.proto.ChatChannelInfoOuterClass.ChatChannelInfoOrBuilder getChannelInfoOrBuilder() {
        if (channelInfoBuilder_ != null) {
          return channelInfoBuilder_.getMessageOrBuilder();
        } else {
          return channelInfo_ == null ?
              emu.gingerps.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo.getDefaultInstance() : channelInfo_;
        }
      }
      /**
       * <code>.ChatChannelInfo channel_info = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo, emu.gingerps.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo.Builder, emu.gingerps.net.proto.ChatChannelInfoOuterClass.ChatChannelInfoOrBuilder> 
          getChannelInfoFieldBuilder() {
        if (channelInfoBuilder_ == null) {
          channelInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo, emu.gingerps.net.proto.ChatChannelInfoOuterClass.ChatChannelInfo.Builder, emu.gingerps.net.proto.ChatChannelInfoOuterClass.ChatChannelInfoOrBuilder>(
                  getChannelInfo(),
                  getParentForChildren(),
                  isClean());
          channelInfo_ = null;
        }
        return channelInfoBuilder_;
      }

      private boolean isCreate_ ;
      /**
       * <code>bool is_create = 15;</code>
       * @return The isCreate.
       */
      @java.lang.Override
      public boolean getIsCreate() {
        return isCreate_;
      }
      /**
       * <code>bool is_create = 15;</code>
       * @param value The isCreate to set.
       * @return This builder for chaining.
       */
      public Builder setIsCreate(boolean value) {
        
        isCreate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_create = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsCreate() {
        
        isCreate_ = false;
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


      // @@protoc_insertion_point(builder_scope:ChatChannelUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:ChatChannelUpdateNotify)
    private static final emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify();
    }

    public static emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChatChannelUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<ChatChannelUpdateNotify>() {
      @java.lang.Override
      public ChatChannelUpdateNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChatChannelUpdateNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChatChannelUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChatChannelUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.ChatChannelUpdateNotifyOuterClass.ChatChannelUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChatChannelUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChatChannelUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035ChatChannelUpdateNotify.proto\032\025ChatCha" +
      "nnelInfo.proto\"h\n\027ChatChannelUpdateNotif" +
      "y\022\022\n\nchannel_id\030\002 \001(\r\022&\n\014channel_info\030\005 " +
      "\001(\0132\020.ChatChannelInfo\022\021\n\tis_create\030\017 \001(\010" +
      "B\030\n\026emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.ChatChannelInfoOuterClass.getDescriptor(),
        });
    internal_static_ChatChannelUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChatChannelUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChatChannelUpdateNotify_descriptor,
        new java.lang.String[] { "ChannelId", "ChannelInfo", "IsCreate", });
    emu.gingerps.net.proto.ChatChannelInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
