// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeSeekFurnitureOneRecord.proto

package emu.gingerps.net.proto;

public final class HomeSeekFurnitureOneRecordOuterClass {
  private HomeSeekFurnitureOneRecordOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeSeekFurnitureOneRecordOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeSeekFurnitureOneRecord)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 timestamp = 12;</code>
     * @return The timestamp.
     */
    int getTimestamp();

    /**
     * <code>repeated .HomeSeekFurniturePlayerScore engaged_player_score_list = 5;</code>
     */
    java.util.List<emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore> 
        getEngagedPlayerScoreListList();
    /**
     * <code>repeated .HomeSeekFurniturePlayerScore engaged_player_score_list = 5;</code>
     */
    emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore getEngagedPlayerScoreList(int index);
    /**
     * <code>repeated .HomeSeekFurniturePlayerScore engaged_player_score_list = 5;</code>
     */
    int getEngagedPlayerScoreListCount();
    /**
     * <code>repeated .HomeSeekFurniturePlayerScore engaged_player_score_list = 5;</code>
     */
    java.util.List<? extends emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScoreOrBuilder> 
        getEngagedPlayerScoreListOrBuilderList();
    /**
     * <code>repeated .HomeSeekFurniturePlayerScore engaged_player_score_list = 5;</code>
     */
    emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScoreOrBuilder getEngagedPlayerScoreListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code HomeSeekFurnitureOneRecord}
   */
  public static final class HomeSeekFurnitureOneRecord extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeSeekFurnitureOneRecord)
      HomeSeekFurnitureOneRecordOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeSeekFurnitureOneRecord.newBuilder() to construct.
    private HomeSeekFurnitureOneRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeSeekFurnitureOneRecord() {
      engagedPlayerScoreList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeSeekFurnitureOneRecord();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.internal_static_HomeSeekFurnitureOneRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.internal_static_HomeSeekFurnitureOneRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.class, emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.Builder.class);
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 12;
    private int timestamp_ = 0;
    /**
     * <code>uint32 timestamp = 12;</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public int getTimestamp() {
      return timestamp_;
    }

    public static final int ENGAGED_PLAYER_SCORE_LIST_FIELD_NUMBER = 5;
    @SuppressWarnings("serial")
    private java.util.List<emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore> engagedPlayerScoreList_;
    /**
     * <code>repeated .HomeSeekFurniturePlayerScore engaged_player_score_list = 5;</code>
     */
    @java.lang.Override
    public java.util.List<emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore> getEngagedPlayerScoreListList() {
      return engagedPlayerScoreList_;
    }
    /**
     * <code>repeated .HomeSeekFurniturePlayerScore engaged_player_score_list = 5;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScoreOrBuilder> 
        getEngagedPlayerScoreListOrBuilderList() {
      return engagedPlayerScoreList_;
    }
    /**
     * <code>repeated .HomeSeekFurniturePlayerScore engaged_player_score_list = 5;</code>
     */
    @java.lang.Override
    public int getEngagedPlayerScoreListCount() {
      return engagedPlayerScoreList_.size();
    }
    /**
     * <code>repeated .HomeSeekFurniturePlayerScore engaged_player_score_list = 5;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore getEngagedPlayerScoreList(int index) {
      return engagedPlayerScoreList_.get(index);
    }
    /**
     * <code>repeated .HomeSeekFurniturePlayerScore engaged_player_score_list = 5;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScoreOrBuilder getEngagedPlayerScoreListOrBuilder(
        int index) {
      return engagedPlayerScoreList_.get(index);
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
      for (int i = 0; i < engagedPlayerScoreList_.size(); i++) {
        output.writeMessage(5, engagedPlayerScoreList_.get(i));
      }
      if (timestamp_ != 0) {
        output.writeUInt32(12, timestamp_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < engagedPlayerScoreList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, engagedPlayerScoreList_.get(i));
      }
      if (timestamp_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, timestamp_);
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
      if (!(obj instanceof emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord other = (emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord) obj;

      if (getTimestamp()
          != other.getTimestamp()) return false;
      if (!getEngagedPlayerScoreListList()
          .equals(other.getEngagedPlayerScoreListList())) return false;
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
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getTimestamp();
      if (getEngagedPlayerScoreListCount() > 0) {
        hash = (37 * hash) + ENGAGED_PLAYER_SCORE_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getEngagedPlayerScoreListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord prototype) {
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
     * Protobuf type {@code HomeSeekFurnitureOneRecord}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeSeekFurnitureOneRecord)
        emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.internal_static_HomeSeekFurnitureOneRecord_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.internal_static_HomeSeekFurnitureOneRecord_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.class, emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.newBuilder()
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
        timestamp_ = 0;
        if (engagedPlayerScoreListBuilder_ == null) {
          engagedPlayerScoreList_ = java.util.Collections.emptyList();
        } else {
          engagedPlayerScoreList_ = null;
          engagedPlayerScoreListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.internal_static_HomeSeekFurnitureOneRecord_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord getDefaultInstanceForType() {
        return emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord build() {
        emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord buildPartial() {
        emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord result = new emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord result) {
        if (engagedPlayerScoreListBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            engagedPlayerScoreList_ = java.util.Collections.unmodifiableList(engagedPlayerScoreList_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.engagedPlayerScoreList_ = engagedPlayerScoreList_;
        } else {
          result.engagedPlayerScoreList_ = engagedPlayerScoreListBuilder_.build();
        }
      }

      private void buildPartial0(emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.timestamp_ = timestamp_;
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
        if (other instanceof emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord) {
          return mergeFrom((emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord other) {
        if (other == emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.getDefaultInstance()) return this;
        if (other.getTimestamp() != 0) {
          setTimestamp(other.getTimestamp());
        }
        if (engagedPlayerScoreListBuilder_ == null) {
          if (!other.engagedPlayerScoreList_.isEmpty()) {
            if (engagedPlayerScoreList_.isEmpty()) {
              engagedPlayerScoreList_ = other.engagedPlayerScoreList_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureEngagedPlayerScoreListIsMutable();
              engagedPlayerScoreList_.addAll(other.engagedPlayerScoreList_);
            }
            onChanged();
          }
        } else {
          if (!other.engagedPlayerScoreList_.isEmpty()) {
            if (engagedPlayerScoreListBuilder_.isEmpty()) {
              engagedPlayerScoreListBuilder_.dispose();
              engagedPlayerScoreListBuilder_ = null;
              engagedPlayerScoreList_ = other.engagedPlayerScoreList_;
              bitField0_ = (bitField0_ & ~0x00000002);
              engagedPlayerScoreListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getEngagedPlayerScoreListFieldBuilder() : null;
            } else {
              engagedPlayerScoreListBuilder_.addAllMessages(other.engagedPlayerScoreList_);
            }
          }
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
              case 42: {
                emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore m =
                    input.readMessage(
                        emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore.parser(),
                        extensionRegistry);
                if (engagedPlayerScoreListBuilder_ == null) {
                  ensureEngagedPlayerScoreListIsMutable();
                  engagedPlayerScoreList_.add(m);
                } else {
                  engagedPlayerScoreListBuilder_.addMessage(m);
                }
                break;
              } // case 42
              case 96: {
                timestamp_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 96
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

      private int timestamp_ ;
      /**
       * <code>uint32 timestamp = 12;</code>
       * @return The timestamp.
       */
      @java.lang.Override
      public int getTimestamp() {
        return timestamp_;
      }
      /**
       * <code>uint32 timestamp = 12;</code>
       * @param value The timestamp to set.
       * @return This builder for chaining.
       */
      public Builder setTimestamp(int value) {
        
        timestamp_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 timestamp = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000001);
        timestamp_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore> engagedPlayerScoreList_ =
        java.util.Collections.emptyList();
      private void ensureEngagedPlayerScoreListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          engagedPlayerScoreList_ = new java.util.ArrayList<emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore>(engagedPlayerScoreList_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore, emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore.Builder, emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScoreOrBuilder> engagedPlayerScoreListBuilder_;

      /**
       * <code>repeated .HomeSeekFurniturePlayerScore engaged_player_score_list = 5;</code>
       */
      public java.util.List<emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore> getEngagedPlayerScoreListList() {
        if (engagedPlayerScoreListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(engagedPlayerScoreList_);
        } else {
          return engagedPlayerScoreListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .HomeSeekFurniturePlayerScore engaged_player_score_list = 5;</code>
       */
      public int getEngagedPlayerScoreListCount() {
        if (engagedPlayerScoreListBuilder_ == null) {
          return engagedPlayerScoreList_.size();
        } else {
          return engagedPlayerScoreListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .HomeSeekFurniturePlayerScore engaged_player_score_list = 5;</code>
       */
      public emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore getEngagedPlayerScoreList(int index) {
        if (engagedPlayerScoreListBuilder_ == null) {
          return engagedPlayerScoreList_.get(index);
        } else {
          return engagedPlayerScoreListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .HomeSeekFurniturePlayerScore engaged_player_score_list = 5;</code>
       */
      public Builder setEngagedPlayerScoreList(
          int index, emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore value) {
        if (engagedPlayerScoreListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEngagedPlayerScoreListIsMutable();
          engagedPlayerScoreList_.set(index, value);
          onChanged();
        } else {
          engagedPlayerScoreListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeSeekFurniturePlayerScore engaged_player_score_list = 5;</code>
       */
      public Builder setEngagedPlayerScoreList(
          int index, emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore.Builder builderForValue) {
        if (engagedPlayerScoreListBuilder_ == null) {
          ensureEngagedPlayerScoreListIsMutable();
          engagedPlayerScoreList_.set(index, builderForValue.build());
          onChanged();
        } else {
          engagedPlayerScoreListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeSeekFurniturePlayerScore engaged_player_score_list = 5;</code>
       */
      public Builder addEngagedPlayerScoreList(emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore value) {
        if (engagedPlayerScoreListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEngagedPlayerScoreListIsMutable();
          engagedPlayerScoreList_.add(value);
          onChanged();
        } else {
          engagedPlayerScoreListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeSeekFurniturePlayerScore engaged_player_score_list = 5;</code>
       */
      public Builder addEngagedPlayerScoreList(
          int index, emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore value) {
        if (engagedPlayerScoreListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEngagedPlayerScoreListIsMutable();
          engagedPlayerScoreList_.add(index, value);
          onChanged();
        } else {
          engagedPlayerScoreListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeSeekFurniturePlayerScore engaged_player_score_list = 5;</code>
       */
      public Builder addEngagedPlayerScoreList(
          emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore.Builder builderForValue) {
        if (engagedPlayerScoreListBuilder_ == null) {
          ensureEngagedPlayerScoreListIsMutable();
          engagedPlayerScoreList_.add(builderForValue.build());
          onChanged();
        } else {
          engagedPlayerScoreListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeSeekFurniturePlayerScore engaged_player_score_list = 5;</code>
       */
      public Builder addEngagedPlayerScoreList(
          int index, emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore.Builder builderForValue) {
        if (engagedPlayerScoreListBuilder_ == null) {
          ensureEngagedPlayerScoreListIsMutable();
          engagedPlayerScoreList_.add(index, builderForValue.build());
          onChanged();
        } else {
          engagedPlayerScoreListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeSeekFurniturePlayerScore engaged_player_score_list = 5;</code>
       */
      public Builder addAllEngagedPlayerScoreList(
          java.lang.Iterable<? extends emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore> values) {
        if (engagedPlayerScoreListBuilder_ == null) {
          ensureEngagedPlayerScoreListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, engagedPlayerScoreList_);
          onChanged();
        } else {
          engagedPlayerScoreListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .HomeSeekFurniturePlayerScore engaged_player_score_list = 5;</code>
       */
      public Builder clearEngagedPlayerScoreList() {
        if (engagedPlayerScoreListBuilder_ == null) {
          engagedPlayerScoreList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          engagedPlayerScoreListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .HomeSeekFurniturePlayerScore engaged_player_score_list = 5;</code>
       */
      public Builder removeEngagedPlayerScoreList(int index) {
        if (engagedPlayerScoreListBuilder_ == null) {
          ensureEngagedPlayerScoreListIsMutable();
          engagedPlayerScoreList_.remove(index);
          onChanged();
        } else {
          engagedPlayerScoreListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .HomeSeekFurniturePlayerScore engaged_player_score_list = 5;</code>
       */
      public emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore.Builder getEngagedPlayerScoreListBuilder(
          int index) {
        return getEngagedPlayerScoreListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .HomeSeekFurniturePlayerScore engaged_player_score_list = 5;</code>
       */
      public emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScoreOrBuilder getEngagedPlayerScoreListOrBuilder(
          int index) {
        if (engagedPlayerScoreListBuilder_ == null) {
          return engagedPlayerScoreList_.get(index);  } else {
          return engagedPlayerScoreListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .HomeSeekFurniturePlayerScore engaged_player_score_list = 5;</code>
       */
      public java.util.List<? extends emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScoreOrBuilder> 
           getEngagedPlayerScoreListOrBuilderList() {
        if (engagedPlayerScoreListBuilder_ != null) {
          return engagedPlayerScoreListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(engagedPlayerScoreList_);
        }
      }
      /**
       * <code>repeated .HomeSeekFurniturePlayerScore engaged_player_score_list = 5;</code>
       */
      public emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore.Builder addEngagedPlayerScoreListBuilder() {
        return getEngagedPlayerScoreListFieldBuilder().addBuilder(
            emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore.getDefaultInstance());
      }
      /**
       * <code>repeated .HomeSeekFurniturePlayerScore engaged_player_score_list = 5;</code>
       */
      public emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore.Builder addEngagedPlayerScoreListBuilder(
          int index) {
        return getEngagedPlayerScoreListFieldBuilder().addBuilder(
            index, emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore.getDefaultInstance());
      }
      /**
       * <code>repeated .HomeSeekFurniturePlayerScore engaged_player_score_list = 5;</code>
       */
      public java.util.List<emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore.Builder> 
           getEngagedPlayerScoreListBuilderList() {
        return getEngagedPlayerScoreListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore, emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore.Builder, emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScoreOrBuilder> 
          getEngagedPlayerScoreListFieldBuilder() {
        if (engagedPlayerScoreListBuilder_ == null) {
          engagedPlayerScoreListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore, emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScore.Builder, emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.HomeSeekFurniturePlayerScoreOrBuilder>(
                  engagedPlayerScoreList_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          engagedPlayerScoreList_ = null;
        }
        return engagedPlayerScoreListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:HomeSeekFurnitureOneRecord)
    }

    // @@protoc_insertion_point(class_scope:HomeSeekFurnitureOneRecord)
    private static final emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord();
    }

    public static emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeSeekFurnitureOneRecord>
        PARSER = new com.google.protobuf.AbstractParser<HomeSeekFurnitureOneRecord>() {
      @java.lang.Override
      public HomeSeekFurnitureOneRecord parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeSeekFurnitureOneRecord> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeSeekFurnitureOneRecord> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeSeekFurnitureOneRecord_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeSeekFurnitureOneRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n HomeSeekFurnitureOneRecord.proto\032\"Home" +
      "SeekFurniturePlayerScore.proto\"q\n\032HomeSe" +
      "ekFurnitureOneRecord\022\021\n\ttimestamp\030\014 \001(\r\022" +
      "@\n\031engaged_player_score_list\030\005 \003(\0132\035.Hom" +
      "eSeekFurniturePlayerScoreB\030\n\026emu.gingerp" +
      "s.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.getDescriptor(),
        });
    internal_static_HomeSeekFurnitureOneRecord_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeSeekFurnitureOneRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeSeekFurnitureOneRecord_descriptor,
        new java.lang.String[] { "Timestamp", "EngagedPlayerScoreList", });
    emu.gingerps.net.proto.HomeSeekFurniturePlayerScoreOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
