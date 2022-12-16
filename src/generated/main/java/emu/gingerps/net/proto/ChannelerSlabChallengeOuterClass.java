// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChannelerSlabChallenge.proto

package emu.gingerps.net.proto;

public final class ChannelerSlabChallengeOuterClass {
  private ChannelerSlabChallengeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChannelerSlabChallengeOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChannelerSlabChallenge)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 active_camp_index = 1;</code>
     * @return The activeCampIndex.
     */
    int getActiveCampIndex();

    /**
     * <code>repeated .ChannelerSlabCamp camp_list = 14;</code>
     */
    java.util.List<emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp> 
        getCampListList();
    /**
     * <code>repeated .ChannelerSlabCamp camp_list = 14;</code>
     */
    emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp getCampList(int index);
    /**
     * <code>repeated .ChannelerSlabCamp camp_list = 14;</code>
     */
    int getCampListCount();
    /**
     * <code>repeated .ChannelerSlabCamp camp_list = 14;</code>
     */
    java.util.List<? extends emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCampOrBuilder> 
        getCampListOrBuilderList();
    /**
     * <code>repeated .ChannelerSlabCamp camp_list = 14;</code>
     */
    emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCampOrBuilder getCampListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code ChannelerSlabChallenge}
   */
  public static final class ChannelerSlabChallenge extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChannelerSlabChallenge)
      ChannelerSlabChallengeOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChannelerSlabChallenge.newBuilder() to construct.
    private ChannelerSlabChallenge(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChannelerSlabChallenge() {
      campList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChannelerSlabChallenge();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChannelerSlabChallenge(
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

              activeCampIndex_ = input.readUInt32();
              break;
            }
            case 114: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                campList_ = new java.util.ArrayList<emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp>();
                mutable_bitField0_ |= 0x00000001;
              }
              campList_.add(
                  input.readMessage(emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp.parser(), extensionRegistry));
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
          campList_ = java.util.Collections.unmodifiableList(campList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.internal_static_ChannelerSlabChallenge_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.internal_static_ChannelerSlabChallenge_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge.class, emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge.Builder.class);
    }

    public static final int ACTIVE_CAMP_INDEX_FIELD_NUMBER = 1;
    private int activeCampIndex_;
    /**
     * <code>uint32 active_camp_index = 1;</code>
     * @return The activeCampIndex.
     */
    @java.lang.Override
    public int getActiveCampIndex() {
      return activeCampIndex_;
    }

    public static final int CAMP_LIST_FIELD_NUMBER = 14;
    private java.util.List<emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp> campList_;
    /**
     * <code>repeated .ChannelerSlabCamp camp_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp> getCampListList() {
      return campList_;
    }
    /**
     * <code>repeated .ChannelerSlabCamp camp_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCampOrBuilder> 
        getCampListOrBuilderList() {
      return campList_;
    }
    /**
     * <code>repeated .ChannelerSlabCamp camp_list = 14;</code>
     */
    @java.lang.Override
    public int getCampListCount() {
      return campList_.size();
    }
    /**
     * <code>repeated .ChannelerSlabCamp camp_list = 14;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp getCampList(int index) {
      return campList_.get(index);
    }
    /**
     * <code>repeated .ChannelerSlabCamp camp_list = 14;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCampOrBuilder getCampListOrBuilder(
        int index) {
      return campList_.get(index);
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
      if (activeCampIndex_ != 0) {
        output.writeUInt32(1, activeCampIndex_);
      }
      for (int i = 0; i < campList_.size(); i++) {
        output.writeMessage(14, campList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (activeCampIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, activeCampIndex_);
      }
      for (int i = 0; i < campList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, campList_.get(i));
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
      if (!(obj instanceof emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge other = (emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge) obj;

      if (getActiveCampIndex()
          != other.getActiveCampIndex()) return false;
      if (!getCampListList()
          .equals(other.getCampListList())) return false;
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
      hash = (37 * hash) + ACTIVE_CAMP_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getActiveCampIndex();
      if (getCampListCount() > 0) {
        hash = (37 * hash) + CAMP_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getCampListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge prototype) {
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
     * Protobuf type {@code ChannelerSlabChallenge}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChannelerSlabChallenge)
        emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallengeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.internal_static_ChannelerSlabChallenge_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.internal_static_ChannelerSlabChallenge_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge.class, emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge.newBuilder()
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
          getCampListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        activeCampIndex_ = 0;

        if (campListBuilder_ == null) {
          campList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          campListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.internal_static_ChannelerSlabChallenge_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge getDefaultInstanceForType() {
        return emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge build() {
        emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge buildPartial() {
        emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge result = new emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge(this);
        int from_bitField0_ = bitField0_;
        result.activeCampIndex_ = activeCampIndex_;
        if (campListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            campList_ = java.util.Collections.unmodifiableList(campList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.campList_ = campList_;
        } else {
          result.campList_ = campListBuilder_.build();
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
        if (other instanceof emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge) {
          return mergeFrom((emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge other) {
        if (other == emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge.getDefaultInstance()) return this;
        if (other.getActiveCampIndex() != 0) {
          setActiveCampIndex(other.getActiveCampIndex());
        }
        if (campListBuilder_ == null) {
          if (!other.campList_.isEmpty()) {
            if (campList_.isEmpty()) {
              campList_ = other.campList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureCampListIsMutable();
              campList_.addAll(other.campList_);
            }
            onChanged();
          }
        } else {
          if (!other.campList_.isEmpty()) {
            if (campListBuilder_.isEmpty()) {
              campListBuilder_.dispose();
              campListBuilder_ = null;
              campList_ = other.campList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              campListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getCampListFieldBuilder() : null;
            } else {
              campListBuilder_.addAllMessages(other.campList_);
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
        emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int activeCampIndex_ ;
      /**
       * <code>uint32 active_camp_index = 1;</code>
       * @return The activeCampIndex.
       */
      @java.lang.Override
      public int getActiveCampIndex() {
        return activeCampIndex_;
      }
      /**
       * <code>uint32 active_camp_index = 1;</code>
       * @param value The activeCampIndex to set.
       * @return This builder for chaining.
       */
      public Builder setActiveCampIndex(int value) {
        
        activeCampIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 active_camp_index = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearActiveCampIndex() {
        
        activeCampIndex_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp> campList_ =
        java.util.Collections.emptyList();
      private void ensureCampListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          campList_ = new java.util.ArrayList<emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp>(campList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp, emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp.Builder, emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCampOrBuilder> campListBuilder_;

      /**
       * <code>repeated .ChannelerSlabCamp camp_list = 14;</code>
       */
      public java.util.List<emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp> getCampListList() {
        if (campListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(campList_);
        } else {
          return campListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ChannelerSlabCamp camp_list = 14;</code>
       */
      public int getCampListCount() {
        if (campListBuilder_ == null) {
          return campList_.size();
        } else {
          return campListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ChannelerSlabCamp camp_list = 14;</code>
       */
      public emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp getCampList(int index) {
        if (campListBuilder_ == null) {
          return campList_.get(index);
        } else {
          return campListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ChannelerSlabCamp camp_list = 14;</code>
       */
      public Builder setCampList(
          int index, emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp value) {
        if (campListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCampListIsMutable();
          campList_.set(index, value);
          onChanged();
        } else {
          campListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ChannelerSlabCamp camp_list = 14;</code>
       */
      public Builder setCampList(
          int index, emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp.Builder builderForValue) {
        if (campListBuilder_ == null) {
          ensureCampListIsMutable();
          campList_.set(index, builderForValue.build());
          onChanged();
        } else {
          campListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ChannelerSlabCamp camp_list = 14;</code>
       */
      public Builder addCampList(emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp value) {
        if (campListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCampListIsMutable();
          campList_.add(value);
          onChanged();
        } else {
          campListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ChannelerSlabCamp camp_list = 14;</code>
       */
      public Builder addCampList(
          int index, emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp value) {
        if (campListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCampListIsMutable();
          campList_.add(index, value);
          onChanged();
        } else {
          campListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ChannelerSlabCamp camp_list = 14;</code>
       */
      public Builder addCampList(
          emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp.Builder builderForValue) {
        if (campListBuilder_ == null) {
          ensureCampListIsMutable();
          campList_.add(builderForValue.build());
          onChanged();
        } else {
          campListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ChannelerSlabCamp camp_list = 14;</code>
       */
      public Builder addCampList(
          int index, emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp.Builder builderForValue) {
        if (campListBuilder_ == null) {
          ensureCampListIsMutable();
          campList_.add(index, builderForValue.build());
          onChanged();
        } else {
          campListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ChannelerSlabCamp camp_list = 14;</code>
       */
      public Builder addAllCampList(
          java.lang.Iterable<? extends emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp> values) {
        if (campListBuilder_ == null) {
          ensureCampListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, campList_);
          onChanged();
        } else {
          campListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ChannelerSlabCamp camp_list = 14;</code>
       */
      public Builder clearCampList() {
        if (campListBuilder_ == null) {
          campList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          campListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ChannelerSlabCamp camp_list = 14;</code>
       */
      public Builder removeCampList(int index) {
        if (campListBuilder_ == null) {
          ensureCampListIsMutable();
          campList_.remove(index);
          onChanged();
        } else {
          campListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ChannelerSlabCamp camp_list = 14;</code>
       */
      public emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp.Builder getCampListBuilder(
          int index) {
        return getCampListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ChannelerSlabCamp camp_list = 14;</code>
       */
      public emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCampOrBuilder getCampListOrBuilder(
          int index) {
        if (campListBuilder_ == null) {
          return campList_.get(index);  } else {
          return campListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ChannelerSlabCamp camp_list = 14;</code>
       */
      public java.util.List<? extends emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCampOrBuilder> 
           getCampListOrBuilderList() {
        if (campListBuilder_ != null) {
          return campListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(campList_);
        }
      }
      /**
       * <code>repeated .ChannelerSlabCamp camp_list = 14;</code>
       */
      public emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp.Builder addCampListBuilder() {
        return getCampListFieldBuilder().addBuilder(
            emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp.getDefaultInstance());
      }
      /**
       * <code>repeated .ChannelerSlabCamp camp_list = 14;</code>
       */
      public emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp.Builder addCampListBuilder(
          int index) {
        return getCampListFieldBuilder().addBuilder(
            index, emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp.getDefaultInstance());
      }
      /**
       * <code>repeated .ChannelerSlabCamp camp_list = 14;</code>
       */
      public java.util.List<emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp.Builder> 
           getCampListBuilderList() {
        return getCampListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp, emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp.Builder, emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCampOrBuilder> 
          getCampListFieldBuilder() {
        if (campListBuilder_ == null) {
          campListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp, emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCamp.Builder, emu.gingerps.net.proto.ChannelerSlabCampOuterClass.ChannelerSlabCampOrBuilder>(
                  campList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          campList_ = null;
        }
        return campListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:ChannelerSlabChallenge)
    }

    // @@protoc_insertion_point(class_scope:ChannelerSlabChallenge)
    private static final emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge();
    }

    public static emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChannelerSlabChallenge>
        PARSER = new com.google.protobuf.AbstractParser<ChannelerSlabChallenge>() {
      @java.lang.Override
      public ChannelerSlabChallenge parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChannelerSlabChallenge(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChannelerSlabChallenge> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChannelerSlabChallenge> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.ChannelerSlabChallengeOuterClass.ChannelerSlabChallenge getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChannelerSlabChallenge_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChannelerSlabChallenge_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034ChannelerSlabChallenge.proto\032\027Channele" +
      "rSlabCamp.proto\"Z\n\026ChannelerSlabChalleng" +
      "e\022\031\n\021active_camp_index\030\001 \001(\r\022%\n\tcamp_lis" +
      "t\030\016 \003(\0132\022.ChannelerSlabCampB\033\n\031emu.grass" +
      "cutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.ChannelerSlabCampOuterClass.getDescriptor(),
        });
    internal_static_ChannelerSlabChallenge_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChannelerSlabChallenge_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChannelerSlabChallenge_descriptor,
        new java.lang.String[] { "ActiveCampIndex", "CampList", });
    emu.gingerps.net.proto.ChannelerSlabCampOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
