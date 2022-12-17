// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RogueShowAvatarTeamInfo.proto

package emu.gingerps.net.proto;

public final class RogueShowAvatarTeamInfoOuterClass {
  private RogueShowAvatarTeamInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RogueShowAvatarTeamInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RogueShowAvatarTeamInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .RogueAvatarInfo avatar_list = 13;</code>
     */
    java.util.List<emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfo> 
        getAvatarListList();
    /**
     * <code>repeated .RogueAvatarInfo avatar_list = 13;</code>
     */
    emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfo getAvatarList(int index);
    /**
     * <code>repeated .RogueAvatarInfo avatar_list = 13;</code>
     */
    int getAvatarListCount();
    /**
     * <code>repeated .RogueAvatarInfo avatar_list = 13;</code>
     */
    java.util.List<? extends emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfoOrBuilder> 
        getAvatarListOrBuilderList();
    /**
     * <code>repeated .RogueAvatarInfo avatar_list = 13;</code>
     */
    emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfoOrBuilder getAvatarListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code RogueShowAvatarTeamInfo}
   */
  public static final class RogueShowAvatarTeamInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RogueShowAvatarTeamInfo)
      RogueShowAvatarTeamInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RogueShowAvatarTeamInfo.newBuilder() to construct.
    private RogueShowAvatarTeamInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RogueShowAvatarTeamInfo() {
      avatarList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RogueShowAvatarTeamInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RogueShowAvatarTeamInfo(
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
            case 106: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                avatarList_ = new java.util.ArrayList<emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              avatarList_.add(
                  input.readMessage(emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfo.parser(), extensionRegistry));
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
          avatarList_ = java.util.Collections.unmodifiableList(avatarList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.internal_static_RogueShowAvatarTeamInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.internal_static_RogueShowAvatarTeamInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo.class, emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo.Builder.class);
    }

    public static final int AVATAR_LIST_FIELD_NUMBER = 13;
    private java.util.List<emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfo> avatarList_;
    /**
     * <code>repeated .RogueAvatarInfo avatar_list = 13;</code>
     */
    @java.lang.Override
    public java.util.List<emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfo> getAvatarListList() {
      return avatarList_;
    }
    /**
     * <code>repeated .RogueAvatarInfo avatar_list = 13;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfoOrBuilder> 
        getAvatarListOrBuilderList() {
      return avatarList_;
    }
    /**
     * <code>repeated .RogueAvatarInfo avatar_list = 13;</code>
     */
    @java.lang.Override
    public int getAvatarListCount() {
      return avatarList_.size();
    }
    /**
     * <code>repeated .RogueAvatarInfo avatar_list = 13;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfo getAvatarList(int index) {
      return avatarList_.get(index);
    }
    /**
     * <code>repeated .RogueAvatarInfo avatar_list = 13;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfoOrBuilder getAvatarListOrBuilder(
        int index) {
      return avatarList_.get(index);
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
      for (int i = 0; i < avatarList_.size(); i++) {
        output.writeMessage(13, avatarList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < avatarList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, avatarList_.get(i));
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
      if (!(obj instanceof emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo other = (emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo) obj;

      if (!getAvatarListList()
          .equals(other.getAvatarListList())) return false;
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
      if (getAvatarListCount() > 0) {
        hash = (37 * hash) + AVATAR_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAvatarListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo prototype) {
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
     * Protobuf type {@code RogueShowAvatarTeamInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RogueShowAvatarTeamInfo)
        emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.internal_static_RogueShowAvatarTeamInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.internal_static_RogueShowAvatarTeamInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo.class, emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo.newBuilder()
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
          getAvatarListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (avatarListBuilder_ == null) {
          avatarList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          avatarListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.internal_static_RogueShowAvatarTeamInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo build() {
        emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo buildPartial() {
        emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo result = new emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo(this);
        int from_bitField0_ = bitField0_;
        if (avatarListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            avatarList_ = java.util.Collections.unmodifiableList(avatarList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.avatarList_ = avatarList_;
        } else {
          result.avatarList_ = avatarListBuilder_.build();
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
        if (other instanceof emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo) {
          return mergeFrom((emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo other) {
        if (other == emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo.getDefaultInstance()) return this;
        if (avatarListBuilder_ == null) {
          if (!other.avatarList_.isEmpty()) {
            if (avatarList_.isEmpty()) {
              avatarList_ = other.avatarList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureAvatarListIsMutable();
              avatarList_.addAll(other.avatarList_);
            }
            onChanged();
          }
        } else {
          if (!other.avatarList_.isEmpty()) {
            if (avatarListBuilder_.isEmpty()) {
              avatarListBuilder_.dispose();
              avatarListBuilder_ = null;
              avatarList_ = other.avatarList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              avatarListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getAvatarListFieldBuilder() : null;
            } else {
              avatarListBuilder_.addAllMessages(other.avatarList_);
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
        emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfo> avatarList_ =
        java.util.Collections.emptyList();
      private void ensureAvatarListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          avatarList_ = new java.util.ArrayList<emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfo>(avatarList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfo, emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfo.Builder, emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfoOrBuilder> avatarListBuilder_;

      /**
       * <code>repeated .RogueAvatarInfo avatar_list = 13;</code>
       */
      public java.util.List<emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfo> getAvatarListList() {
        if (avatarListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(avatarList_);
        } else {
          return avatarListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .RogueAvatarInfo avatar_list = 13;</code>
       */
      public int getAvatarListCount() {
        if (avatarListBuilder_ == null) {
          return avatarList_.size();
        } else {
          return avatarListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .RogueAvatarInfo avatar_list = 13;</code>
       */
      public emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfo getAvatarList(int index) {
        if (avatarListBuilder_ == null) {
          return avatarList_.get(index);
        } else {
          return avatarListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .RogueAvatarInfo avatar_list = 13;</code>
       */
      public Builder setAvatarList(
          int index, emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfo value) {
        if (avatarListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAvatarListIsMutable();
          avatarList_.set(index, value);
          onChanged();
        } else {
          avatarListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .RogueAvatarInfo avatar_list = 13;</code>
       */
      public Builder setAvatarList(
          int index, emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfo.Builder builderForValue) {
        if (avatarListBuilder_ == null) {
          ensureAvatarListIsMutable();
          avatarList_.set(index, builderForValue.build());
          onChanged();
        } else {
          avatarListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RogueAvatarInfo avatar_list = 13;</code>
       */
      public Builder addAvatarList(emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfo value) {
        if (avatarListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAvatarListIsMutable();
          avatarList_.add(value);
          onChanged();
        } else {
          avatarListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .RogueAvatarInfo avatar_list = 13;</code>
       */
      public Builder addAvatarList(
          int index, emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfo value) {
        if (avatarListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAvatarListIsMutable();
          avatarList_.add(index, value);
          onChanged();
        } else {
          avatarListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .RogueAvatarInfo avatar_list = 13;</code>
       */
      public Builder addAvatarList(
          emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfo.Builder builderForValue) {
        if (avatarListBuilder_ == null) {
          ensureAvatarListIsMutable();
          avatarList_.add(builderForValue.build());
          onChanged();
        } else {
          avatarListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RogueAvatarInfo avatar_list = 13;</code>
       */
      public Builder addAvatarList(
          int index, emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfo.Builder builderForValue) {
        if (avatarListBuilder_ == null) {
          ensureAvatarListIsMutable();
          avatarList_.add(index, builderForValue.build());
          onChanged();
        } else {
          avatarListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RogueAvatarInfo avatar_list = 13;</code>
       */
      public Builder addAllAvatarList(
          java.lang.Iterable<? extends emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfo> values) {
        if (avatarListBuilder_ == null) {
          ensureAvatarListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, avatarList_);
          onChanged();
        } else {
          avatarListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .RogueAvatarInfo avatar_list = 13;</code>
       */
      public Builder clearAvatarList() {
        if (avatarListBuilder_ == null) {
          avatarList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          avatarListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .RogueAvatarInfo avatar_list = 13;</code>
       */
      public Builder removeAvatarList(int index) {
        if (avatarListBuilder_ == null) {
          ensureAvatarListIsMutable();
          avatarList_.remove(index);
          onChanged();
        } else {
          avatarListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .RogueAvatarInfo avatar_list = 13;</code>
       */
      public emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfo.Builder getAvatarListBuilder(
          int index) {
        return getAvatarListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .RogueAvatarInfo avatar_list = 13;</code>
       */
      public emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfoOrBuilder getAvatarListOrBuilder(
          int index) {
        if (avatarListBuilder_ == null) {
          return avatarList_.get(index);  } else {
          return avatarListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .RogueAvatarInfo avatar_list = 13;</code>
       */
      public java.util.List<? extends emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfoOrBuilder> 
           getAvatarListOrBuilderList() {
        if (avatarListBuilder_ != null) {
          return avatarListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(avatarList_);
        }
      }
      /**
       * <code>repeated .RogueAvatarInfo avatar_list = 13;</code>
       */
      public emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfo.Builder addAvatarListBuilder() {
        return getAvatarListFieldBuilder().addBuilder(
            emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .RogueAvatarInfo avatar_list = 13;</code>
       */
      public emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfo.Builder addAvatarListBuilder(
          int index) {
        return getAvatarListFieldBuilder().addBuilder(
            index, emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .RogueAvatarInfo avatar_list = 13;</code>
       */
      public java.util.List<emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfo.Builder> 
           getAvatarListBuilderList() {
        return getAvatarListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfo, emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfo.Builder, emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfoOrBuilder> 
          getAvatarListFieldBuilder() {
        if (avatarListBuilder_ == null) {
          avatarListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfo, emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfo.Builder, emu.gingerps.net.proto.RogueAvatarInfoOuterClass.RogueAvatarInfoOrBuilder>(
                  avatarList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          avatarList_ = null;
        }
        return avatarListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:RogueShowAvatarTeamInfo)
    }

    // @@protoc_insertion_point(class_scope:RogueShowAvatarTeamInfo)
    private static final emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo();
    }

    public static emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RogueShowAvatarTeamInfo>
        PARSER = new com.google.protobuf.AbstractParser<RogueShowAvatarTeamInfo>() {
      @java.lang.Override
      public RogueShowAvatarTeamInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RogueShowAvatarTeamInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RogueShowAvatarTeamInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RogueShowAvatarTeamInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.RogueShowAvatarTeamInfoOuterClass.RogueShowAvatarTeamInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RogueShowAvatarTeamInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RogueShowAvatarTeamInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035RogueShowAvatarTeamInfo.proto\032\025RogueAv" +
      "atarInfo.proto\"@\n\027RogueShowAvatarTeamInf" +
      "o\022%\n\013avatar_list\030\r \003(\0132\020.RogueAvatarInfo" +
      "B\030\n\026emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.RogueAvatarInfoOuterClass.getDescriptor(),
        });
    internal_static_RogueShowAvatarTeamInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RogueShowAvatarTeamInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RogueShowAvatarTeamInfo_descriptor,
        new java.lang.String[] { "AvatarList", });
    emu.gingerps.net.proto.RogueAvatarInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
