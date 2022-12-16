// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InstableSprayRestartDungeonReq.proto

package emu.gingerps.net.proto;

public final class InstableSprayRestartDungeonReqOuterClass {
  private InstableSprayRestartDungeonReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InstableSprayRestartDungeonReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InstableSprayRestartDungeonReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 15;</code>
     */
    java.util.List<emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo> 
        getAvatarInfoListList();
    /**
     * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 15;</code>
     */
    emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo getAvatarInfoList(int index);
    /**
     * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 15;</code>
     */
    int getAvatarInfoListCount();
    /**
     * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 15;</code>
     */
    java.util.List<? extends emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfoOrBuilder> 
        getAvatarInfoListOrBuilderList();
    /**
     * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 15;</code>
     */
    emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfoOrBuilder getAvatarInfoListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 22725;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code InstableSprayRestartDungeonReq}
   */
  public static final class InstableSprayRestartDungeonReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InstableSprayRestartDungeonReq)
      InstableSprayRestartDungeonReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InstableSprayRestartDungeonReq.newBuilder() to construct.
    private InstableSprayRestartDungeonReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InstableSprayRestartDungeonReq() {
      avatarInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InstableSprayRestartDungeonReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private InstableSprayRestartDungeonReq(
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
            case 122: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                avatarInfoList_ = new java.util.ArrayList<emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              avatarInfoList_.add(
                  input.readMessage(emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo.parser(), extensionRegistry));
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
          avatarInfoList_ = java.util.Collections.unmodifiableList(avatarInfoList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.internal_static_InstableSprayRestartDungeonReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.internal_static_InstableSprayRestartDungeonReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq.class, emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq.Builder.class);
    }

    public static final int AVATAR_INFO_LIST_FIELD_NUMBER = 15;
    private java.util.List<emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo> avatarInfoList_;
    /**
     * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo> getAvatarInfoListList() {
      return avatarInfoList_;
    }
    /**
     * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfoOrBuilder> 
        getAvatarInfoListOrBuilderList() {
      return avatarInfoList_;
    }
    /**
     * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 15;</code>
     */
    @java.lang.Override
    public int getAvatarInfoListCount() {
      return avatarInfoList_.size();
    }
    /**
     * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 15;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo getAvatarInfoList(int index) {
      return avatarInfoList_.get(index);
    }
    /**
     * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 15;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfoOrBuilder getAvatarInfoListOrBuilder(
        int index) {
      return avatarInfoList_.get(index);
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
      for (int i = 0; i < avatarInfoList_.size(); i++) {
        output.writeMessage(15, avatarInfoList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < avatarInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, avatarInfoList_.get(i));
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
      if (!(obj instanceof emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq other = (emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq) obj;

      if (!getAvatarInfoListList()
          .equals(other.getAvatarInfoListList())) return false;
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
      if (getAvatarInfoListCount() > 0) {
        hash = (37 * hash) + AVATAR_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAvatarInfoListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq prototype) {
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
     *   CMD_ID = 22725;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code InstableSprayRestartDungeonReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InstableSprayRestartDungeonReq)
        emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.internal_static_InstableSprayRestartDungeonReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.internal_static_InstableSprayRestartDungeonReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq.class, emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq.newBuilder()
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
          getAvatarInfoListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (avatarInfoListBuilder_ == null) {
          avatarInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          avatarInfoListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.internal_static_InstableSprayRestartDungeonReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq build() {
        emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq buildPartial() {
        emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq result = new emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq(this);
        int from_bitField0_ = bitField0_;
        if (avatarInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            avatarInfoList_ = java.util.Collections.unmodifiableList(avatarInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.avatarInfoList_ = avatarInfoList_;
        } else {
          result.avatarInfoList_ = avatarInfoListBuilder_.build();
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
        if (other instanceof emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq) {
          return mergeFrom((emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq other) {
        if (other == emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq.getDefaultInstance()) return this;
        if (avatarInfoListBuilder_ == null) {
          if (!other.avatarInfoList_.isEmpty()) {
            if (avatarInfoList_.isEmpty()) {
              avatarInfoList_ = other.avatarInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureAvatarInfoListIsMutable();
              avatarInfoList_.addAll(other.avatarInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.avatarInfoList_.isEmpty()) {
            if (avatarInfoListBuilder_.isEmpty()) {
              avatarInfoListBuilder_.dispose();
              avatarInfoListBuilder_ = null;
              avatarInfoList_ = other.avatarInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              avatarInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getAvatarInfoListFieldBuilder() : null;
            } else {
              avatarInfoListBuilder_.addAllMessages(other.avatarInfoList_);
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
        emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo> avatarInfoList_ =
        java.util.Collections.emptyList();
      private void ensureAvatarInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          avatarInfoList_ = new java.util.ArrayList<emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo>(avatarInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo, emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo.Builder, emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfoOrBuilder> avatarInfoListBuilder_;

      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 15;</code>
       */
      public java.util.List<emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo> getAvatarInfoListList() {
        if (avatarInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(avatarInfoList_);
        } else {
          return avatarInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 15;</code>
       */
      public int getAvatarInfoListCount() {
        if (avatarInfoListBuilder_ == null) {
          return avatarInfoList_.size();
        } else {
          return avatarInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 15;</code>
       */
      public emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo getAvatarInfoList(int index) {
        if (avatarInfoListBuilder_ == null) {
          return avatarInfoList_.get(index);
        } else {
          return avatarInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 15;</code>
       */
      public Builder setAvatarInfoList(
          int index, emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo value) {
        if (avatarInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.set(index, value);
          onChanged();
        } else {
          avatarInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 15;</code>
       */
      public Builder setAvatarInfoList(
          int index, emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo.Builder builderForValue) {
        if (avatarInfoListBuilder_ == null) {
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          avatarInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 15;</code>
       */
      public Builder addAvatarInfoList(emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo value) {
        if (avatarInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.add(value);
          onChanged();
        } else {
          avatarInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 15;</code>
       */
      public Builder addAvatarInfoList(
          int index, emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo value) {
        if (avatarInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.add(index, value);
          onChanged();
        } else {
          avatarInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 15;</code>
       */
      public Builder addAvatarInfoList(
          emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo.Builder builderForValue) {
        if (avatarInfoListBuilder_ == null) {
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          avatarInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 15;</code>
       */
      public Builder addAvatarInfoList(
          int index, emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo.Builder builderForValue) {
        if (avatarInfoListBuilder_ == null) {
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          avatarInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 15;</code>
       */
      public Builder addAllAvatarInfoList(
          java.lang.Iterable<? extends emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo> values) {
        if (avatarInfoListBuilder_ == null) {
          ensureAvatarInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, avatarInfoList_);
          onChanged();
        } else {
          avatarInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 15;</code>
       */
      public Builder clearAvatarInfoList() {
        if (avatarInfoListBuilder_ == null) {
          avatarInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          avatarInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 15;</code>
       */
      public Builder removeAvatarInfoList(int index) {
        if (avatarInfoListBuilder_ == null) {
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.remove(index);
          onChanged();
        } else {
          avatarInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 15;</code>
       */
      public emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo.Builder getAvatarInfoListBuilder(
          int index) {
        return getAvatarInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 15;</code>
       */
      public emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfoOrBuilder getAvatarInfoListOrBuilder(
          int index) {
        if (avatarInfoListBuilder_ == null) {
          return avatarInfoList_.get(index);  } else {
          return avatarInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 15;</code>
       */
      public java.util.List<? extends emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfoOrBuilder> 
           getAvatarInfoListOrBuilderList() {
        if (avatarInfoListBuilder_ != null) {
          return avatarInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(avatarInfoList_);
        }
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 15;</code>
       */
      public emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo.Builder addAvatarInfoListBuilder() {
        return getAvatarInfoListFieldBuilder().addBuilder(
            emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 15;</code>
       */
      public emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo.Builder addAvatarInfoListBuilder(
          int index) {
        return getAvatarInfoListFieldBuilder().addBuilder(
            index, emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .InstableSprayAvatarInfo avatar_info_list = 15;</code>
       */
      public java.util.List<emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo.Builder> 
           getAvatarInfoListBuilderList() {
        return getAvatarInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo, emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo.Builder, emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfoOrBuilder> 
          getAvatarInfoListFieldBuilder() {
        if (avatarInfoListBuilder_ == null) {
          avatarInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo, emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfo.Builder, emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.InstableSprayAvatarInfoOrBuilder>(
                  avatarInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          avatarInfoList_ = null;
        }
        return avatarInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:InstableSprayRestartDungeonReq)
    }

    // @@protoc_insertion_point(class_scope:InstableSprayRestartDungeonReq)
    private static final emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq();
    }

    public static emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InstableSprayRestartDungeonReq>
        PARSER = new com.google.protobuf.AbstractParser<InstableSprayRestartDungeonReq>() {
      @java.lang.Override
      public InstableSprayRestartDungeonReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new InstableSprayRestartDungeonReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<InstableSprayRestartDungeonReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InstableSprayRestartDungeonReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.InstableSprayRestartDungeonReqOuterClass.InstableSprayRestartDungeonReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InstableSprayRestartDungeonReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InstableSprayRestartDungeonReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$InstableSprayRestartDungeonReq.proto\032\035" +
      "InstableSprayAvatarInfo.proto\"T\n\036Instabl" +
      "eSprayRestartDungeonReq\0222\n\020avatar_info_l" +
      "ist\030\017 \003(\0132\030.InstableSprayAvatarInfoB\033\n\031e" +
      "mu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.getDescriptor(),
        });
    internal_static_InstableSprayRestartDungeonReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InstableSprayRestartDungeonReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InstableSprayRestartDungeonReq_descriptor,
        new java.lang.String[] { "AvatarInfoList", });
    emu.gingerps.net.proto.InstableSprayAvatarInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
