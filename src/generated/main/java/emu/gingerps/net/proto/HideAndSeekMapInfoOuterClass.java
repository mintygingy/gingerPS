// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HideAndSeekMapInfo.proto

package emu.gingerps.net.proto;

public final class HideAndSeekMapInfoOuterClass {
  private HideAndSeekMapInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HideAndSeekMapInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HideAndSeekMapInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 match_lock_reason_list = 6;</code>
     * @return A list containing the matchLockReasonList.
     */
    java.util.List<java.lang.Integer> getMatchLockReasonListList();
    /**
     * <code>repeated uint32 match_lock_reason_list = 6;</code>
     * @return The count of matchLockReasonList.
     */
    int getMatchLockReasonListCount();
    /**
     * <code>repeated uint32 match_lock_reason_list = 6;</code>
     * @param index The index of the element to return.
     * @return The matchLockReasonList at the given index.
     */
    int getMatchLockReasonList(int index);

    /**
     * <code>uint32 id = 12;</code>
     * @return The id.
     */
    int getId();
  }
  /**
   * Protobuf type {@code HideAndSeekMapInfo}
   */
  public static final class HideAndSeekMapInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HideAndSeekMapInfo)
      HideAndSeekMapInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HideAndSeekMapInfo.newBuilder() to construct.
    private HideAndSeekMapInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HideAndSeekMapInfo() {
      matchLockReasonList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HideAndSeekMapInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HideAndSeekMapInfo(
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
            case 48: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                matchLockReasonList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              matchLockReasonList_.addInt(input.readUInt32());
              break;
            }
            case 50: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                matchLockReasonList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                matchLockReasonList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 96: {

              id_ = input.readUInt32();
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
          matchLockReasonList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.internal_static_HideAndSeekMapInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.internal_static_HideAndSeekMapInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo.class, emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo.Builder.class);
    }

    public static final int MATCH_LOCK_REASON_LIST_FIELD_NUMBER = 6;
    private com.google.protobuf.Internal.IntList matchLockReasonList_;
    /**
     * <code>repeated uint32 match_lock_reason_list = 6;</code>
     * @return A list containing the matchLockReasonList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getMatchLockReasonListList() {
      return matchLockReasonList_;
    }
    /**
     * <code>repeated uint32 match_lock_reason_list = 6;</code>
     * @return The count of matchLockReasonList.
     */
    public int getMatchLockReasonListCount() {
      return matchLockReasonList_.size();
    }
    /**
     * <code>repeated uint32 match_lock_reason_list = 6;</code>
     * @param index The index of the element to return.
     * @return The matchLockReasonList at the given index.
     */
    public int getMatchLockReasonList(int index) {
      return matchLockReasonList_.getInt(index);
    }
    private int matchLockReasonListMemoizedSerializedSize = -1;

    public static final int ID_FIELD_NUMBER = 12;
    private int id_;
    /**
     * <code>uint32 id = 12;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
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
      getSerializedSize();
      if (getMatchLockReasonListList().size() > 0) {
        output.writeUInt32NoTag(50);
        output.writeUInt32NoTag(matchLockReasonListMemoizedSerializedSize);
      }
      for (int i = 0; i < matchLockReasonList_.size(); i++) {
        output.writeUInt32NoTag(matchLockReasonList_.getInt(i));
      }
      if (id_ != 0) {
        output.writeUInt32(12, id_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < matchLockReasonList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(matchLockReasonList_.getInt(i));
        }
        size += dataSize;
        if (!getMatchLockReasonListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        matchLockReasonListMemoizedSerializedSize = dataSize;
      }
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, id_);
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
      if (!(obj instanceof emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo other = (emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo) obj;

      if (!getMatchLockReasonListList()
          .equals(other.getMatchLockReasonListList())) return false;
      if (getId()
          != other.getId()) return false;
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
      if (getMatchLockReasonListCount() > 0) {
        hash = (37 * hash) + MATCH_LOCK_REASON_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMatchLockReasonListList().hashCode();
      }
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo prototype) {
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
     * Protobuf type {@code HideAndSeekMapInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HideAndSeekMapInfo)
        emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.internal_static_HideAndSeekMapInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.internal_static_HideAndSeekMapInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo.class, emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo.newBuilder()
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
        matchLockReasonList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.internal_static_HideAndSeekMapInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo build() {
        emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo buildPartial() {
        emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo result = new emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          matchLockReasonList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.matchLockReasonList_ = matchLockReasonList_;
        result.id_ = id_;
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
        if (other instanceof emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo) {
          return mergeFrom((emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo other) {
        if (other == emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo.getDefaultInstance()) return this;
        if (!other.matchLockReasonList_.isEmpty()) {
          if (matchLockReasonList_.isEmpty()) {
            matchLockReasonList_ = other.matchLockReasonList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMatchLockReasonListIsMutable();
            matchLockReasonList_.addAll(other.matchLockReasonList_);
          }
          onChanged();
        }
        if (other.getId() != 0) {
          setId(other.getId());
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
        emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList matchLockReasonList_ = emptyIntList();
      private void ensureMatchLockReasonListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          matchLockReasonList_ = mutableCopy(matchLockReasonList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 match_lock_reason_list = 6;</code>
       * @return A list containing the matchLockReasonList.
       */
      public java.util.List<java.lang.Integer>
          getMatchLockReasonListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(matchLockReasonList_) : matchLockReasonList_;
      }
      /**
       * <code>repeated uint32 match_lock_reason_list = 6;</code>
       * @return The count of matchLockReasonList.
       */
      public int getMatchLockReasonListCount() {
        return matchLockReasonList_.size();
      }
      /**
       * <code>repeated uint32 match_lock_reason_list = 6;</code>
       * @param index The index of the element to return.
       * @return The matchLockReasonList at the given index.
       */
      public int getMatchLockReasonList(int index) {
        return matchLockReasonList_.getInt(index);
      }
      /**
       * <code>repeated uint32 match_lock_reason_list = 6;</code>
       * @param index The index to set the value at.
       * @param value The matchLockReasonList to set.
       * @return This builder for chaining.
       */
      public Builder setMatchLockReasonList(
          int index, int value) {
        ensureMatchLockReasonListIsMutable();
        matchLockReasonList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 match_lock_reason_list = 6;</code>
       * @param value The matchLockReasonList to add.
       * @return This builder for chaining.
       */
      public Builder addMatchLockReasonList(int value) {
        ensureMatchLockReasonListIsMutable();
        matchLockReasonList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 match_lock_reason_list = 6;</code>
       * @param values The matchLockReasonList to add.
       * @return This builder for chaining.
       */
      public Builder addAllMatchLockReasonList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureMatchLockReasonListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, matchLockReasonList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 match_lock_reason_list = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearMatchLockReasonList() {
        matchLockReasonList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 12;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 12;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HideAndSeekMapInfo)
    }

    // @@protoc_insertion_point(class_scope:HideAndSeekMapInfo)
    private static final emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo();
    }

    public static emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HideAndSeekMapInfo>
        PARSER = new com.google.protobuf.AbstractParser<HideAndSeekMapInfo>() {
      @java.lang.Override
      public HideAndSeekMapInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HideAndSeekMapInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HideAndSeekMapInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HideAndSeekMapInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.HideAndSeekMapInfoOuterClass.HideAndSeekMapInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HideAndSeekMapInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HideAndSeekMapInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030HideAndSeekMapInfo.proto\"@\n\022HideAndSee" +
      "kMapInfo\022\036\n\026match_lock_reason_list\030\006 \003(\r" +
      "\022\n\n\002id\030\014 \001(\rB\030\n\026emu.gingerps.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HideAndSeekMapInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HideAndSeekMapInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HideAndSeekMapInfo_descriptor,
        new java.lang.String[] { "MatchLockReasonList", "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
