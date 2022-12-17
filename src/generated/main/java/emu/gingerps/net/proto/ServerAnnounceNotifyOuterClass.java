// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServerAnnounceNotify.proto

package emu.gingerps.net.proto;

public final class ServerAnnounceNotifyOuterClass {
  private ServerAnnounceNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ServerAnnounceNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ServerAnnounceNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .AnnounceData announce_data_list = 14;</code>
     */
    java.util.List<emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceData> 
        getAnnounceDataListList();
    /**
     * <code>repeated .AnnounceData announce_data_list = 14;</code>
     */
    emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceData getAnnounceDataList(int index);
    /**
     * <code>repeated .AnnounceData announce_data_list = 14;</code>
     */
    int getAnnounceDataListCount();
    /**
     * <code>repeated .AnnounceData announce_data_list = 14;</code>
     */
    java.util.List<? extends emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceDataOrBuilder> 
        getAnnounceDataListOrBuilderList();
    /**
     * <code>repeated .AnnounceData announce_data_list = 14;</code>
     */
    emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceDataOrBuilder getAnnounceDataListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 2129;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ServerAnnounceNotify}
   */
  public static final class ServerAnnounceNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ServerAnnounceNotify)
      ServerAnnounceNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ServerAnnounceNotify.newBuilder() to construct.
    private ServerAnnounceNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ServerAnnounceNotify() {
      announceDataList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ServerAnnounceNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ServerAnnounceNotify(
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
            case 114: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                announceDataList_ = new java.util.ArrayList<emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceData>();
                mutable_bitField0_ |= 0x00000001;
              }
              announceDataList_.add(
                  input.readMessage(emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceData.parser(), extensionRegistry));
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
          announceDataList_ = java.util.Collections.unmodifiableList(announceDataList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.internal_static_ServerAnnounceNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.internal_static_ServerAnnounceNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify.class, emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify.Builder.class);
    }

    public static final int ANNOUNCE_DATA_LIST_FIELD_NUMBER = 14;
    private java.util.List<emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceData> announceDataList_;
    /**
     * <code>repeated .AnnounceData announce_data_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceData> getAnnounceDataListList() {
      return announceDataList_;
    }
    /**
     * <code>repeated .AnnounceData announce_data_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceDataOrBuilder> 
        getAnnounceDataListOrBuilderList() {
      return announceDataList_;
    }
    /**
     * <code>repeated .AnnounceData announce_data_list = 14;</code>
     */
    @java.lang.Override
    public int getAnnounceDataListCount() {
      return announceDataList_.size();
    }
    /**
     * <code>repeated .AnnounceData announce_data_list = 14;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceData getAnnounceDataList(int index) {
      return announceDataList_.get(index);
    }
    /**
     * <code>repeated .AnnounceData announce_data_list = 14;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceDataOrBuilder getAnnounceDataListOrBuilder(
        int index) {
      return announceDataList_.get(index);
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
      for (int i = 0; i < announceDataList_.size(); i++) {
        output.writeMessage(14, announceDataList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < announceDataList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, announceDataList_.get(i));
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
      if (!(obj instanceof emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify other = (emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify) obj;

      if (!getAnnounceDataListList()
          .equals(other.getAnnounceDataListList())) return false;
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
      if (getAnnounceDataListCount() > 0) {
        hash = (37 * hash) + ANNOUNCE_DATA_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAnnounceDataListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify prototype) {
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
     *   CMD_ID = 2129;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ServerAnnounceNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ServerAnnounceNotify)
        emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.internal_static_ServerAnnounceNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.internal_static_ServerAnnounceNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify.class, emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify.newBuilder()
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
          getAnnounceDataListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (announceDataListBuilder_ == null) {
          announceDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          announceDataListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.internal_static_ServerAnnounceNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify build() {
        emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify buildPartial() {
        emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify result = new emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify(this);
        int from_bitField0_ = bitField0_;
        if (announceDataListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            announceDataList_ = java.util.Collections.unmodifiableList(announceDataList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.announceDataList_ = announceDataList_;
        } else {
          result.announceDataList_ = announceDataListBuilder_.build();
        }
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
        if (other instanceof emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify) {
          return mergeFrom((emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify other) {
        if (other == emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify.getDefaultInstance()) return this;
        if (announceDataListBuilder_ == null) {
          if (!other.announceDataList_.isEmpty()) {
            if (announceDataList_.isEmpty()) {
              announceDataList_ = other.announceDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureAnnounceDataListIsMutable();
              announceDataList_.addAll(other.announceDataList_);
            }
            onChanged();
          }
        } else {
          if (!other.announceDataList_.isEmpty()) {
            if (announceDataListBuilder_.isEmpty()) {
              announceDataListBuilder_.dispose();
              announceDataListBuilder_ = null;
              announceDataList_ = other.announceDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              announceDataListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getAnnounceDataListFieldBuilder() : null;
            } else {
              announceDataListBuilder_.addAllMessages(other.announceDataList_);
            }
          }
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
        emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceData> announceDataList_ =
        java.util.Collections.emptyList();
      private void ensureAnnounceDataListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          announceDataList_ = new java.util.ArrayList<emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceData>(announceDataList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceData, emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceData.Builder, emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceDataOrBuilder> announceDataListBuilder_;

      /**
       * <code>repeated .AnnounceData announce_data_list = 14;</code>
       */
      public java.util.List<emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceData> getAnnounceDataListList() {
        if (announceDataListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(announceDataList_);
        } else {
          return announceDataListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .AnnounceData announce_data_list = 14;</code>
       */
      public int getAnnounceDataListCount() {
        if (announceDataListBuilder_ == null) {
          return announceDataList_.size();
        } else {
          return announceDataListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .AnnounceData announce_data_list = 14;</code>
       */
      public emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceData getAnnounceDataList(int index) {
        if (announceDataListBuilder_ == null) {
          return announceDataList_.get(index);
        } else {
          return announceDataListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .AnnounceData announce_data_list = 14;</code>
       */
      public Builder setAnnounceDataList(
          int index, emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceData value) {
        if (announceDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAnnounceDataListIsMutable();
          announceDataList_.set(index, value);
          onChanged();
        } else {
          announceDataListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .AnnounceData announce_data_list = 14;</code>
       */
      public Builder setAnnounceDataList(
          int index, emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceData.Builder builderForValue) {
        if (announceDataListBuilder_ == null) {
          ensureAnnounceDataListIsMutable();
          announceDataList_.set(index, builderForValue.build());
          onChanged();
        } else {
          announceDataListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AnnounceData announce_data_list = 14;</code>
       */
      public Builder addAnnounceDataList(emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceData value) {
        if (announceDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAnnounceDataListIsMutable();
          announceDataList_.add(value);
          onChanged();
        } else {
          announceDataListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .AnnounceData announce_data_list = 14;</code>
       */
      public Builder addAnnounceDataList(
          int index, emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceData value) {
        if (announceDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAnnounceDataListIsMutable();
          announceDataList_.add(index, value);
          onChanged();
        } else {
          announceDataListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .AnnounceData announce_data_list = 14;</code>
       */
      public Builder addAnnounceDataList(
          emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceData.Builder builderForValue) {
        if (announceDataListBuilder_ == null) {
          ensureAnnounceDataListIsMutable();
          announceDataList_.add(builderForValue.build());
          onChanged();
        } else {
          announceDataListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AnnounceData announce_data_list = 14;</code>
       */
      public Builder addAnnounceDataList(
          int index, emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceData.Builder builderForValue) {
        if (announceDataListBuilder_ == null) {
          ensureAnnounceDataListIsMutable();
          announceDataList_.add(index, builderForValue.build());
          onChanged();
        } else {
          announceDataListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AnnounceData announce_data_list = 14;</code>
       */
      public Builder addAllAnnounceDataList(
          java.lang.Iterable<? extends emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceData> values) {
        if (announceDataListBuilder_ == null) {
          ensureAnnounceDataListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, announceDataList_);
          onChanged();
        } else {
          announceDataListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .AnnounceData announce_data_list = 14;</code>
       */
      public Builder clearAnnounceDataList() {
        if (announceDataListBuilder_ == null) {
          announceDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          announceDataListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .AnnounceData announce_data_list = 14;</code>
       */
      public Builder removeAnnounceDataList(int index) {
        if (announceDataListBuilder_ == null) {
          ensureAnnounceDataListIsMutable();
          announceDataList_.remove(index);
          onChanged();
        } else {
          announceDataListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .AnnounceData announce_data_list = 14;</code>
       */
      public emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceData.Builder getAnnounceDataListBuilder(
          int index) {
        return getAnnounceDataListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .AnnounceData announce_data_list = 14;</code>
       */
      public emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceDataOrBuilder getAnnounceDataListOrBuilder(
          int index) {
        if (announceDataListBuilder_ == null) {
          return announceDataList_.get(index);  } else {
          return announceDataListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .AnnounceData announce_data_list = 14;</code>
       */
      public java.util.List<? extends emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceDataOrBuilder> 
           getAnnounceDataListOrBuilderList() {
        if (announceDataListBuilder_ != null) {
          return announceDataListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(announceDataList_);
        }
      }
      /**
       * <code>repeated .AnnounceData announce_data_list = 14;</code>
       */
      public emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceData.Builder addAnnounceDataListBuilder() {
        return getAnnounceDataListFieldBuilder().addBuilder(
            emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceData.getDefaultInstance());
      }
      /**
       * <code>repeated .AnnounceData announce_data_list = 14;</code>
       */
      public emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceData.Builder addAnnounceDataListBuilder(
          int index) {
        return getAnnounceDataListFieldBuilder().addBuilder(
            index, emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceData.getDefaultInstance());
      }
      /**
       * <code>repeated .AnnounceData announce_data_list = 14;</code>
       */
      public java.util.List<emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceData.Builder> 
           getAnnounceDataListBuilderList() {
        return getAnnounceDataListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceData, emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceData.Builder, emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceDataOrBuilder> 
          getAnnounceDataListFieldBuilder() {
        if (announceDataListBuilder_ == null) {
          announceDataListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceData, emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceData.Builder, emu.gingerps.net.proto.AnnounceDataOuterClass.AnnounceDataOrBuilder>(
                  announceDataList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          announceDataList_ = null;
        }
        return announceDataListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:ServerAnnounceNotify)
    }

    // @@protoc_insertion_point(class_scope:ServerAnnounceNotify)
    private static final emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify();
    }

    public static emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ServerAnnounceNotify>
        PARSER = new com.google.protobuf.AbstractParser<ServerAnnounceNotify>() {
      @java.lang.Override
      public ServerAnnounceNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ServerAnnounceNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ServerAnnounceNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ServerAnnounceNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServerAnnounceNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ServerAnnounceNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032ServerAnnounceNotify.proto\032\022AnnounceDa" +
      "ta.proto\"A\n\024ServerAnnounceNotify\022)\n\022anno" +
      "unce_data_list\030\016 \003(\0132\r.AnnounceDataB\030\n\026e" +
      "mu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.AnnounceDataOuterClass.getDescriptor(),
        });
    internal_static_ServerAnnounceNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ServerAnnounceNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ServerAnnounceNotify_descriptor,
        new java.lang.String[] { "AnnounceDataList", });
    emu.gingerps.net.proto.AnnounceDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
