// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CoopRewardUpdateNotify.proto

package emu.gingerps.net.proto;

public final class CoopRewardUpdateNotifyOuterClass {
  private CoopRewardUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CoopRewardUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CoopRewardUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .CoopReward reward_list = 14;</code>
     */
    java.util.List<emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward> 
        getRewardListList();
    /**
     * <code>repeated .CoopReward reward_list = 14;</code>
     */
    emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward getRewardList(int index);
    /**
     * <code>repeated .CoopReward reward_list = 14;</code>
     */
    int getRewardListCount();
    /**
     * <code>repeated .CoopReward reward_list = 14;</code>
     */
    java.util.List<? extends emu.gingerps.net.proto.CoopRewardOuterClass.CoopRewardOrBuilder> 
        getRewardListOrBuilderList();
    /**
     * <code>repeated .CoopReward reward_list = 14;</code>
     */
    emu.gingerps.net.proto.CoopRewardOuterClass.CoopRewardOrBuilder getRewardListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 1984;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code CoopRewardUpdateNotify}
   */
  public static final class CoopRewardUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CoopRewardUpdateNotify)
      CoopRewardUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CoopRewardUpdateNotify.newBuilder() to construct.
    private CoopRewardUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CoopRewardUpdateNotify() {
      rewardList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CoopRewardUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CoopRewardUpdateNotify(
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
                rewardList_ = new java.util.ArrayList<emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward>();
                mutable_bitField0_ |= 0x00000001;
              }
              rewardList_.add(
                  input.readMessage(emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward.parser(), extensionRegistry));
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
          rewardList_ = java.util.Collections.unmodifiableList(rewardList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.internal_static_CoopRewardUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.internal_static_CoopRewardUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify.class, emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify.Builder.class);
    }

    public static final int REWARD_LIST_FIELD_NUMBER = 14;
    private java.util.List<emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward> rewardList_;
    /**
     * <code>repeated .CoopReward reward_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward> getRewardListList() {
      return rewardList_;
    }
    /**
     * <code>repeated .CoopReward reward_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.gingerps.net.proto.CoopRewardOuterClass.CoopRewardOrBuilder> 
        getRewardListOrBuilderList() {
      return rewardList_;
    }
    /**
     * <code>repeated .CoopReward reward_list = 14;</code>
     */
    @java.lang.Override
    public int getRewardListCount() {
      return rewardList_.size();
    }
    /**
     * <code>repeated .CoopReward reward_list = 14;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward getRewardList(int index) {
      return rewardList_.get(index);
    }
    /**
     * <code>repeated .CoopReward reward_list = 14;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.CoopRewardOuterClass.CoopRewardOrBuilder getRewardListOrBuilder(
        int index) {
      return rewardList_.get(index);
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
      for (int i = 0; i < rewardList_.size(); i++) {
        output.writeMessage(14, rewardList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < rewardList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, rewardList_.get(i));
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
      if (!(obj instanceof emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify other = (emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify) obj;

      if (!getRewardListList()
          .equals(other.getRewardListList())) return false;
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
      if (getRewardListCount() > 0) {
        hash = (37 * hash) + REWARD_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getRewardListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify prototype) {
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
     *   CMD_ID = 1984;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code CoopRewardUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CoopRewardUpdateNotify)
        emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.internal_static_CoopRewardUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.internal_static_CoopRewardUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify.class, emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify.newBuilder()
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
          getRewardListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (rewardListBuilder_ == null) {
          rewardList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          rewardListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.internal_static_CoopRewardUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify build() {
        emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify buildPartial() {
        emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify result = new emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify(this);
        int from_bitField0_ = bitField0_;
        if (rewardListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            rewardList_ = java.util.Collections.unmodifiableList(rewardList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.rewardList_ = rewardList_;
        } else {
          result.rewardList_ = rewardListBuilder_.build();
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
        if (other instanceof emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify) {
          return mergeFrom((emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify other) {
        if (other == emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify.getDefaultInstance()) return this;
        if (rewardListBuilder_ == null) {
          if (!other.rewardList_.isEmpty()) {
            if (rewardList_.isEmpty()) {
              rewardList_ = other.rewardList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureRewardListIsMutable();
              rewardList_.addAll(other.rewardList_);
            }
            onChanged();
          }
        } else {
          if (!other.rewardList_.isEmpty()) {
            if (rewardListBuilder_.isEmpty()) {
              rewardListBuilder_.dispose();
              rewardListBuilder_ = null;
              rewardList_ = other.rewardList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              rewardListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getRewardListFieldBuilder() : null;
            } else {
              rewardListBuilder_.addAllMessages(other.rewardList_);
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
        emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward> rewardList_ =
        java.util.Collections.emptyList();
      private void ensureRewardListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          rewardList_ = new java.util.ArrayList<emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward>(rewardList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward, emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward.Builder, emu.gingerps.net.proto.CoopRewardOuterClass.CoopRewardOrBuilder> rewardListBuilder_;

      /**
       * <code>repeated .CoopReward reward_list = 14;</code>
       */
      public java.util.List<emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward> getRewardListList() {
        if (rewardListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(rewardList_);
        } else {
          return rewardListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .CoopReward reward_list = 14;</code>
       */
      public int getRewardListCount() {
        if (rewardListBuilder_ == null) {
          return rewardList_.size();
        } else {
          return rewardListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .CoopReward reward_list = 14;</code>
       */
      public emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward getRewardList(int index) {
        if (rewardListBuilder_ == null) {
          return rewardList_.get(index);
        } else {
          return rewardListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .CoopReward reward_list = 14;</code>
       */
      public Builder setRewardList(
          int index, emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward value) {
        if (rewardListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRewardListIsMutable();
          rewardList_.set(index, value);
          onChanged();
        } else {
          rewardListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CoopReward reward_list = 14;</code>
       */
      public Builder setRewardList(
          int index, emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward.Builder builderForValue) {
        if (rewardListBuilder_ == null) {
          ensureRewardListIsMutable();
          rewardList_.set(index, builderForValue.build());
          onChanged();
        } else {
          rewardListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CoopReward reward_list = 14;</code>
       */
      public Builder addRewardList(emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward value) {
        if (rewardListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRewardListIsMutable();
          rewardList_.add(value);
          onChanged();
        } else {
          rewardListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .CoopReward reward_list = 14;</code>
       */
      public Builder addRewardList(
          int index, emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward value) {
        if (rewardListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRewardListIsMutable();
          rewardList_.add(index, value);
          onChanged();
        } else {
          rewardListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CoopReward reward_list = 14;</code>
       */
      public Builder addRewardList(
          emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward.Builder builderForValue) {
        if (rewardListBuilder_ == null) {
          ensureRewardListIsMutable();
          rewardList_.add(builderForValue.build());
          onChanged();
        } else {
          rewardListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CoopReward reward_list = 14;</code>
       */
      public Builder addRewardList(
          int index, emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward.Builder builderForValue) {
        if (rewardListBuilder_ == null) {
          ensureRewardListIsMutable();
          rewardList_.add(index, builderForValue.build());
          onChanged();
        } else {
          rewardListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CoopReward reward_list = 14;</code>
       */
      public Builder addAllRewardList(
          java.lang.Iterable<? extends emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward> values) {
        if (rewardListBuilder_ == null) {
          ensureRewardListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, rewardList_);
          onChanged();
        } else {
          rewardListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .CoopReward reward_list = 14;</code>
       */
      public Builder clearRewardList() {
        if (rewardListBuilder_ == null) {
          rewardList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          rewardListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .CoopReward reward_list = 14;</code>
       */
      public Builder removeRewardList(int index) {
        if (rewardListBuilder_ == null) {
          ensureRewardListIsMutable();
          rewardList_.remove(index);
          onChanged();
        } else {
          rewardListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .CoopReward reward_list = 14;</code>
       */
      public emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward.Builder getRewardListBuilder(
          int index) {
        return getRewardListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .CoopReward reward_list = 14;</code>
       */
      public emu.gingerps.net.proto.CoopRewardOuterClass.CoopRewardOrBuilder getRewardListOrBuilder(
          int index) {
        if (rewardListBuilder_ == null) {
          return rewardList_.get(index);  } else {
          return rewardListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .CoopReward reward_list = 14;</code>
       */
      public java.util.List<? extends emu.gingerps.net.proto.CoopRewardOuterClass.CoopRewardOrBuilder> 
           getRewardListOrBuilderList() {
        if (rewardListBuilder_ != null) {
          return rewardListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(rewardList_);
        }
      }
      /**
       * <code>repeated .CoopReward reward_list = 14;</code>
       */
      public emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward.Builder addRewardListBuilder() {
        return getRewardListFieldBuilder().addBuilder(
            emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward.getDefaultInstance());
      }
      /**
       * <code>repeated .CoopReward reward_list = 14;</code>
       */
      public emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward.Builder addRewardListBuilder(
          int index) {
        return getRewardListFieldBuilder().addBuilder(
            index, emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward.getDefaultInstance());
      }
      /**
       * <code>repeated .CoopReward reward_list = 14;</code>
       */
      public java.util.List<emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward.Builder> 
           getRewardListBuilderList() {
        return getRewardListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward, emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward.Builder, emu.gingerps.net.proto.CoopRewardOuterClass.CoopRewardOrBuilder> 
          getRewardListFieldBuilder() {
        if (rewardListBuilder_ == null) {
          rewardListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward, emu.gingerps.net.proto.CoopRewardOuterClass.CoopReward.Builder, emu.gingerps.net.proto.CoopRewardOuterClass.CoopRewardOrBuilder>(
                  rewardList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          rewardList_ = null;
        }
        return rewardListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:CoopRewardUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:CoopRewardUpdateNotify)
    private static final emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify();
    }

    public static emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CoopRewardUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<CoopRewardUpdateNotify>() {
      @java.lang.Override
      public CoopRewardUpdateNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CoopRewardUpdateNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CoopRewardUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CoopRewardUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.CoopRewardUpdateNotifyOuterClass.CoopRewardUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CoopRewardUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CoopRewardUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034CoopRewardUpdateNotify.proto\032\020CoopRewa" +
      "rd.proto\":\n\026CoopRewardUpdateNotify\022 \n\013re" +
      "ward_list\030\016 \003(\0132\013.CoopRewardB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.CoopRewardOuterClass.getDescriptor(),
        });
    internal_static_CoopRewardUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CoopRewardUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CoopRewardUpdateNotify_descriptor,
        new java.lang.String[] { "RewardList", });
    emu.gingerps.net.proto.CoopRewardOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
