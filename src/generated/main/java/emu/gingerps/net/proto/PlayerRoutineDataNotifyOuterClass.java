// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerRoutineDataNotify.proto

package emu.gingerps.net.proto;

public final class PlayerRoutineDataNotifyOuterClass {
  private PlayerRoutineDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerRoutineDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerRoutineDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .PlayerRoutineInfo routine_info_list = 11;</code>
     */
    java.util.List<emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo> 
        getRoutineInfoListList();
    /**
     * <code>repeated .PlayerRoutineInfo routine_info_list = 11;</code>
     */
    emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo getRoutineInfoList(int index);
    /**
     * <code>repeated .PlayerRoutineInfo routine_info_list = 11;</code>
     */
    int getRoutineInfoListCount();
    /**
     * <code>repeated .PlayerRoutineInfo routine_info_list = 11;</code>
     */
    java.util.List<? extends emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfoOrBuilder> 
        getRoutineInfoListOrBuilderList();
    /**
     * <code>repeated .PlayerRoutineInfo routine_info_list = 11;</code>
     */
    emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfoOrBuilder getRoutineInfoListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 3542;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code PlayerRoutineDataNotify}
   */
  public static final class PlayerRoutineDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerRoutineDataNotify)
      PlayerRoutineDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerRoutineDataNotify.newBuilder() to construct.
    private PlayerRoutineDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerRoutineDataNotify() {
      routineInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerRoutineDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerRoutineDataNotify(
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
            case 90: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                routineInfoList_ = new java.util.ArrayList<emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              routineInfoList_.add(
                  input.readMessage(emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo.parser(), extensionRegistry));
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
          routineInfoList_ = java.util.Collections.unmodifiableList(routineInfoList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.internal_static_PlayerRoutineDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.internal_static_PlayerRoutineDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify.class, emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify.Builder.class);
    }

    public static final int ROUTINE_INFO_LIST_FIELD_NUMBER = 11;
    private java.util.List<emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo> routineInfoList_;
    /**
     * <code>repeated .PlayerRoutineInfo routine_info_list = 11;</code>
     */
    @java.lang.Override
    public java.util.List<emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo> getRoutineInfoListList() {
      return routineInfoList_;
    }
    /**
     * <code>repeated .PlayerRoutineInfo routine_info_list = 11;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfoOrBuilder> 
        getRoutineInfoListOrBuilderList() {
      return routineInfoList_;
    }
    /**
     * <code>repeated .PlayerRoutineInfo routine_info_list = 11;</code>
     */
    @java.lang.Override
    public int getRoutineInfoListCount() {
      return routineInfoList_.size();
    }
    /**
     * <code>repeated .PlayerRoutineInfo routine_info_list = 11;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo getRoutineInfoList(int index) {
      return routineInfoList_.get(index);
    }
    /**
     * <code>repeated .PlayerRoutineInfo routine_info_list = 11;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfoOrBuilder getRoutineInfoListOrBuilder(
        int index) {
      return routineInfoList_.get(index);
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
      for (int i = 0; i < routineInfoList_.size(); i++) {
        output.writeMessage(11, routineInfoList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < routineInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, routineInfoList_.get(i));
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
      if (!(obj instanceof emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify other = (emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify) obj;

      if (!getRoutineInfoListList()
          .equals(other.getRoutineInfoListList())) return false;
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
      if (getRoutineInfoListCount() > 0) {
        hash = (37 * hash) + ROUTINE_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getRoutineInfoListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify prototype) {
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
     *   CMD_ID = 3542;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code PlayerRoutineDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerRoutineDataNotify)
        emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.internal_static_PlayerRoutineDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.internal_static_PlayerRoutineDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify.class, emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify.newBuilder()
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
          getRoutineInfoListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (routineInfoListBuilder_ == null) {
          routineInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          routineInfoListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.internal_static_PlayerRoutineDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify build() {
        emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify buildPartial() {
        emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify result = new emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify(this);
        int from_bitField0_ = bitField0_;
        if (routineInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            routineInfoList_ = java.util.Collections.unmodifiableList(routineInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.routineInfoList_ = routineInfoList_;
        } else {
          result.routineInfoList_ = routineInfoListBuilder_.build();
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
        if (other instanceof emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify) {
          return mergeFrom((emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify other) {
        if (other == emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify.getDefaultInstance()) return this;
        if (routineInfoListBuilder_ == null) {
          if (!other.routineInfoList_.isEmpty()) {
            if (routineInfoList_.isEmpty()) {
              routineInfoList_ = other.routineInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureRoutineInfoListIsMutable();
              routineInfoList_.addAll(other.routineInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.routineInfoList_.isEmpty()) {
            if (routineInfoListBuilder_.isEmpty()) {
              routineInfoListBuilder_.dispose();
              routineInfoListBuilder_ = null;
              routineInfoList_ = other.routineInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              routineInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getRoutineInfoListFieldBuilder() : null;
            } else {
              routineInfoListBuilder_.addAllMessages(other.routineInfoList_);
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
        emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo> routineInfoList_ =
        java.util.Collections.emptyList();
      private void ensureRoutineInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          routineInfoList_ = new java.util.ArrayList<emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo>(routineInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo, emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo.Builder, emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfoOrBuilder> routineInfoListBuilder_;

      /**
       * <code>repeated .PlayerRoutineInfo routine_info_list = 11;</code>
       */
      public java.util.List<emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo> getRoutineInfoListList() {
        if (routineInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(routineInfoList_);
        } else {
          return routineInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .PlayerRoutineInfo routine_info_list = 11;</code>
       */
      public int getRoutineInfoListCount() {
        if (routineInfoListBuilder_ == null) {
          return routineInfoList_.size();
        } else {
          return routineInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .PlayerRoutineInfo routine_info_list = 11;</code>
       */
      public emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo getRoutineInfoList(int index) {
        if (routineInfoListBuilder_ == null) {
          return routineInfoList_.get(index);
        } else {
          return routineInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .PlayerRoutineInfo routine_info_list = 11;</code>
       */
      public Builder setRoutineInfoList(
          int index, emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo value) {
        if (routineInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRoutineInfoListIsMutable();
          routineInfoList_.set(index, value);
          onChanged();
        } else {
          routineInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerRoutineInfo routine_info_list = 11;</code>
       */
      public Builder setRoutineInfoList(
          int index, emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo.Builder builderForValue) {
        if (routineInfoListBuilder_ == null) {
          ensureRoutineInfoListIsMutable();
          routineInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          routineInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PlayerRoutineInfo routine_info_list = 11;</code>
       */
      public Builder addRoutineInfoList(emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo value) {
        if (routineInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRoutineInfoListIsMutable();
          routineInfoList_.add(value);
          onChanged();
        } else {
          routineInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerRoutineInfo routine_info_list = 11;</code>
       */
      public Builder addRoutineInfoList(
          int index, emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo value) {
        if (routineInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRoutineInfoListIsMutable();
          routineInfoList_.add(index, value);
          onChanged();
        } else {
          routineInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerRoutineInfo routine_info_list = 11;</code>
       */
      public Builder addRoutineInfoList(
          emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo.Builder builderForValue) {
        if (routineInfoListBuilder_ == null) {
          ensureRoutineInfoListIsMutable();
          routineInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          routineInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PlayerRoutineInfo routine_info_list = 11;</code>
       */
      public Builder addRoutineInfoList(
          int index, emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo.Builder builderForValue) {
        if (routineInfoListBuilder_ == null) {
          ensureRoutineInfoListIsMutable();
          routineInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          routineInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PlayerRoutineInfo routine_info_list = 11;</code>
       */
      public Builder addAllRoutineInfoList(
          java.lang.Iterable<? extends emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo> values) {
        if (routineInfoListBuilder_ == null) {
          ensureRoutineInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, routineInfoList_);
          onChanged();
        } else {
          routineInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerRoutineInfo routine_info_list = 11;</code>
       */
      public Builder clearRoutineInfoList() {
        if (routineInfoListBuilder_ == null) {
          routineInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          routineInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .PlayerRoutineInfo routine_info_list = 11;</code>
       */
      public Builder removeRoutineInfoList(int index) {
        if (routineInfoListBuilder_ == null) {
          ensureRoutineInfoListIsMutable();
          routineInfoList_.remove(index);
          onChanged();
        } else {
          routineInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerRoutineInfo routine_info_list = 11;</code>
       */
      public emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo.Builder getRoutineInfoListBuilder(
          int index) {
        return getRoutineInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .PlayerRoutineInfo routine_info_list = 11;</code>
       */
      public emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfoOrBuilder getRoutineInfoListOrBuilder(
          int index) {
        if (routineInfoListBuilder_ == null) {
          return routineInfoList_.get(index);  } else {
          return routineInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .PlayerRoutineInfo routine_info_list = 11;</code>
       */
      public java.util.List<? extends emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfoOrBuilder> 
           getRoutineInfoListOrBuilderList() {
        if (routineInfoListBuilder_ != null) {
          return routineInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(routineInfoList_);
        }
      }
      /**
       * <code>repeated .PlayerRoutineInfo routine_info_list = 11;</code>
       */
      public emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo.Builder addRoutineInfoListBuilder() {
        return getRoutineInfoListFieldBuilder().addBuilder(
            emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .PlayerRoutineInfo routine_info_list = 11;</code>
       */
      public emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo.Builder addRoutineInfoListBuilder(
          int index) {
        return getRoutineInfoListFieldBuilder().addBuilder(
            index, emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .PlayerRoutineInfo routine_info_list = 11;</code>
       */
      public java.util.List<emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo.Builder> 
           getRoutineInfoListBuilderList() {
        return getRoutineInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo, emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo.Builder, emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfoOrBuilder> 
          getRoutineInfoListFieldBuilder() {
        if (routineInfoListBuilder_ == null) {
          routineInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo, emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfo.Builder, emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.PlayerRoutineInfoOrBuilder>(
                  routineInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          routineInfoList_ = null;
        }
        return routineInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:PlayerRoutineDataNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerRoutineDataNotify)
    private static final emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify();
    }

    public static emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerRoutineDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerRoutineDataNotify>() {
      @java.lang.Override
      public PlayerRoutineDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerRoutineDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerRoutineDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerRoutineDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.PlayerRoutineDataNotifyOuterClass.PlayerRoutineDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerRoutineDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerRoutineDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035PlayerRoutineDataNotify.proto\032\027PlayerR" +
      "outineInfo.proto\"H\n\027PlayerRoutineDataNot" +
      "ify\022-\n\021routine_info_list\030\013 \003(\0132\022.PlayerR" +
      "outineInfoB\033\n\031emu.gingerps.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.getDescriptor(),
        });
    internal_static_PlayerRoutineDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerRoutineDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerRoutineDataNotify_descriptor,
        new java.lang.String[] { "RoutineInfoList", });
    emu.gingerps.net.proto.PlayerRoutineInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
