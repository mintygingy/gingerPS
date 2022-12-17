// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BossChestActivateNotify.proto

package emu.gingerps.net.proto;

public final class BossChestActivateNotifyOuterClass {
  private BossChestActivateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BossChestActivateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BossChestActivateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entity_id = 15;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>repeated uint32 qualify_uid_list = 7;</code>
     * @return A list containing the qualifyUidList.
     */
    java.util.List<java.lang.Integer> getQualifyUidListList();
    /**
     * <code>repeated uint32 qualify_uid_list = 7;</code>
     * @return The count of qualifyUidList.
     */
    int getQualifyUidListCount();
    /**
     * <code>repeated uint32 qualify_uid_list = 7;</code>
     * @param index The index of the element to return.
     * @return The qualifyUidList at the given index.
     */
    int getQualifyUidList(int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 861;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code BossChestActivateNotify}
   */
  public static final class BossChestActivateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BossChestActivateNotify)
      BossChestActivateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BossChestActivateNotify.newBuilder() to construct.
    private BossChestActivateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BossChestActivateNotify() {
      qualifyUidList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BossChestActivateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BossChestActivateNotify(
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
            case 56: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                qualifyUidList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              qualifyUidList_.addInt(input.readUInt32());
              break;
            }
            case 58: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                qualifyUidList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                qualifyUidList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 120: {

              entityId_ = input.readUInt32();
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
          qualifyUidList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.internal_static_BossChestActivateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.internal_static_BossChestActivateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify.class, emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify.Builder.class);
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 15;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 15;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int QUALIFY_UID_LIST_FIELD_NUMBER = 7;
    private com.google.protobuf.Internal.IntList qualifyUidList_;
    /**
     * <code>repeated uint32 qualify_uid_list = 7;</code>
     * @return A list containing the qualifyUidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getQualifyUidListList() {
      return qualifyUidList_;
    }
    /**
     * <code>repeated uint32 qualify_uid_list = 7;</code>
     * @return The count of qualifyUidList.
     */
    public int getQualifyUidListCount() {
      return qualifyUidList_.size();
    }
    /**
     * <code>repeated uint32 qualify_uid_list = 7;</code>
     * @param index The index of the element to return.
     * @return The qualifyUidList at the given index.
     */
    public int getQualifyUidList(int index) {
      return qualifyUidList_.getInt(index);
    }
    private int qualifyUidListMemoizedSerializedSize = -1;

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
      if (getQualifyUidListList().size() > 0) {
        output.writeUInt32NoTag(58);
        output.writeUInt32NoTag(qualifyUidListMemoizedSerializedSize);
      }
      for (int i = 0; i < qualifyUidList_.size(); i++) {
        output.writeUInt32NoTag(qualifyUidList_.getInt(i));
      }
      if (entityId_ != 0) {
        output.writeUInt32(15, entityId_);
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
        for (int i = 0; i < qualifyUidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(qualifyUidList_.getInt(i));
        }
        size += dataSize;
        if (!getQualifyUidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        qualifyUidListMemoizedSerializedSize = dataSize;
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, entityId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify other = (emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (!getQualifyUidListList()
          .equals(other.getQualifyUidListList())) return false;
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
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      if (getQualifyUidListCount() > 0) {
        hash = (37 * hash) + QUALIFY_UID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getQualifyUidListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify prototype) {
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
     *   CMD_ID = 861;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code BossChestActivateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BossChestActivateNotify)
        emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.internal_static_BossChestActivateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.internal_static_BossChestActivateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify.class, emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify.newBuilder()
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
        entityId_ = 0;

        qualifyUidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.internal_static_BossChestActivateNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify build() {
        emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify buildPartial() {
        emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify result = new emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify(this);
        int from_bitField0_ = bitField0_;
        result.entityId_ = entityId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          qualifyUidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.qualifyUidList_ = qualifyUidList_;
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
        if (other instanceof emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify) {
          return mergeFrom((emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify other) {
        if (other == emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (!other.qualifyUidList_.isEmpty()) {
          if (qualifyUidList_.isEmpty()) {
            qualifyUidList_ = other.qualifyUidList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureQualifyUidListIsMutable();
            qualifyUidList_.addAll(other.qualifyUidList_);
          }
          onChanged();
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
        emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 15;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 15;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList qualifyUidList_ = emptyIntList();
      private void ensureQualifyUidListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          qualifyUidList_ = mutableCopy(qualifyUidList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 qualify_uid_list = 7;</code>
       * @return A list containing the qualifyUidList.
       */
      public java.util.List<java.lang.Integer>
          getQualifyUidListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(qualifyUidList_) : qualifyUidList_;
      }
      /**
       * <code>repeated uint32 qualify_uid_list = 7;</code>
       * @return The count of qualifyUidList.
       */
      public int getQualifyUidListCount() {
        return qualifyUidList_.size();
      }
      /**
       * <code>repeated uint32 qualify_uid_list = 7;</code>
       * @param index The index of the element to return.
       * @return The qualifyUidList at the given index.
       */
      public int getQualifyUidList(int index) {
        return qualifyUidList_.getInt(index);
      }
      /**
       * <code>repeated uint32 qualify_uid_list = 7;</code>
       * @param index The index to set the value at.
       * @param value The qualifyUidList to set.
       * @return This builder for chaining.
       */
      public Builder setQualifyUidList(
          int index, int value) {
        ensureQualifyUidListIsMutable();
        qualifyUidList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 qualify_uid_list = 7;</code>
       * @param value The qualifyUidList to add.
       * @return This builder for chaining.
       */
      public Builder addQualifyUidList(int value) {
        ensureQualifyUidListIsMutable();
        qualifyUidList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 qualify_uid_list = 7;</code>
       * @param values The qualifyUidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllQualifyUidList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureQualifyUidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, qualifyUidList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 qualify_uid_list = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearQualifyUidList() {
        qualifyUidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:BossChestActivateNotify)
    }

    // @@protoc_insertion_point(class_scope:BossChestActivateNotify)
    private static final emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify();
    }

    public static emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BossChestActivateNotify>
        PARSER = new com.google.protobuf.AbstractParser<BossChestActivateNotify>() {
      @java.lang.Override
      public BossChestActivateNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BossChestActivateNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BossChestActivateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BossChestActivateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.BossChestActivateNotifyOuterClass.BossChestActivateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BossChestActivateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BossChestActivateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035BossChestActivateNotify.proto\"F\n\027BossC" +
      "hestActivateNotify\022\021\n\tentity_id\030\017 \001(\r\022\030\n" +
      "\020qualify_uid_list\030\007 \003(\rB\030\n\026emu.gingerps." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BossChestActivateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BossChestActivateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BossChestActivateNotify_descriptor,
        new java.lang.String[] { "EntityId", "QualifyUidList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
