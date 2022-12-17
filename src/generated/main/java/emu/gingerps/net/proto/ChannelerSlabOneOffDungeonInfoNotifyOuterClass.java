// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChannelerSlabOneOffDungeonInfoNotify.proto

package emu.gingerps.net.proto;

public final class ChannelerSlabOneOffDungeonInfoNotifyOuterClass {
  private ChannelerSlabOneOffDungeonInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChannelerSlabOneOffDungeonInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChannelerSlabOneOffDungeonInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 scheme_buff_id_list = 8;</code>
     * @return A list containing the schemeBuffIdList.
     */
    java.util.List<java.lang.Integer> getSchemeBuffIdListList();
    /**
     * <code>repeated uint32 scheme_buff_id_list = 8;</code>
     * @return The count of schemeBuffIdList.
     */
    int getSchemeBuffIdListCount();
    /**
     * <code>repeated uint32 scheme_buff_id_list = 8;</code>
     * @param index The index of the element to return.
     * @return The schemeBuffIdList at the given index.
     */
    int getSchemeBuffIdList(int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8015;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ChannelerSlabOneOffDungeonInfoNotify}
   */
  public static final class ChannelerSlabOneOffDungeonInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChannelerSlabOneOffDungeonInfoNotify)
      ChannelerSlabOneOffDungeonInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChannelerSlabOneOffDungeonInfoNotify.newBuilder() to construct.
    private ChannelerSlabOneOffDungeonInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChannelerSlabOneOffDungeonInfoNotify() {
      schemeBuffIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChannelerSlabOneOffDungeonInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChannelerSlabOneOffDungeonInfoNotify(
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
            case 64: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                schemeBuffIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              schemeBuffIdList_.addInt(input.readUInt32());
              break;
            }
            case 66: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                schemeBuffIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                schemeBuffIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
          schemeBuffIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.internal_static_ChannelerSlabOneOffDungeonInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.internal_static_ChannelerSlabOneOffDungeonInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify.class, emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify.Builder.class);
    }

    public static final int SCHEME_BUFF_ID_LIST_FIELD_NUMBER = 8;
    private com.google.protobuf.Internal.IntList schemeBuffIdList_;
    /**
     * <code>repeated uint32 scheme_buff_id_list = 8;</code>
     * @return A list containing the schemeBuffIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getSchemeBuffIdListList() {
      return schemeBuffIdList_;
    }
    /**
     * <code>repeated uint32 scheme_buff_id_list = 8;</code>
     * @return The count of schemeBuffIdList.
     */
    public int getSchemeBuffIdListCount() {
      return schemeBuffIdList_.size();
    }
    /**
     * <code>repeated uint32 scheme_buff_id_list = 8;</code>
     * @param index The index of the element to return.
     * @return The schemeBuffIdList at the given index.
     */
    public int getSchemeBuffIdList(int index) {
      return schemeBuffIdList_.getInt(index);
    }
    private int schemeBuffIdListMemoizedSerializedSize = -1;

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
      if (getSchemeBuffIdListList().size() > 0) {
        output.writeUInt32NoTag(66);
        output.writeUInt32NoTag(schemeBuffIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < schemeBuffIdList_.size(); i++) {
        output.writeUInt32NoTag(schemeBuffIdList_.getInt(i));
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
        for (int i = 0; i < schemeBuffIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(schemeBuffIdList_.getInt(i));
        }
        size += dataSize;
        if (!getSchemeBuffIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        schemeBuffIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify other = (emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify) obj;

      if (!getSchemeBuffIdListList()
          .equals(other.getSchemeBuffIdListList())) return false;
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
      if (getSchemeBuffIdListCount() > 0) {
        hash = (37 * hash) + SCHEME_BUFF_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSchemeBuffIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify prototype) {
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
     *   CMD_ID = 8015;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ChannelerSlabOneOffDungeonInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChannelerSlabOneOffDungeonInfoNotify)
        emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.internal_static_ChannelerSlabOneOffDungeonInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.internal_static_ChannelerSlabOneOffDungeonInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify.class, emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify.newBuilder()
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
        schemeBuffIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.internal_static_ChannelerSlabOneOffDungeonInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify build() {
        emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify buildPartial() {
        emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify result = new emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          schemeBuffIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.schemeBuffIdList_ = schemeBuffIdList_;
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
        if (other instanceof emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify) {
          return mergeFrom((emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify other) {
        if (other == emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify.getDefaultInstance()) return this;
        if (!other.schemeBuffIdList_.isEmpty()) {
          if (schemeBuffIdList_.isEmpty()) {
            schemeBuffIdList_ = other.schemeBuffIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSchemeBuffIdListIsMutable();
            schemeBuffIdList_.addAll(other.schemeBuffIdList_);
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
        emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList schemeBuffIdList_ = emptyIntList();
      private void ensureSchemeBuffIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          schemeBuffIdList_ = mutableCopy(schemeBuffIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 scheme_buff_id_list = 8;</code>
       * @return A list containing the schemeBuffIdList.
       */
      public java.util.List<java.lang.Integer>
          getSchemeBuffIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(schemeBuffIdList_) : schemeBuffIdList_;
      }
      /**
       * <code>repeated uint32 scheme_buff_id_list = 8;</code>
       * @return The count of schemeBuffIdList.
       */
      public int getSchemeBuffIdListCount() {
        return schemeBuffIdList_.size();
      }
      /**
       * <code>repeated uint32 scheme_buff_id_list = 8;</code>
       * @param index The index of the element to return.
       * @return The schemeBuffIdList at the given index.
       */
      public int getSchemeBuffIdList(int index) {
        return schemeBuffIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 scheme_buff_id_list = 8;</code>
       * @param index The index to set the value at.
       * @param value The schemeBuffIdList to set.
       * @return This builder for chaining.
       */
      public Builder setSchemeBuffIdList(
          int index, int value) {
        ensureSchemeBuffIdListIsMutable();
        schemeBuffIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 scheme_buff_id_list = 8;</code>
       * @param value The schemeBuffIdList to add.
       * @return This builder for chaining.
       */
      public Builder addSchemeBuffIdList(int value) {
        ensureSchemeBuffIdListIsMutable();
        schemeBuffIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 scheme_buff_id_list = 8;</code>
       * @param values The schemeBuffIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllSchemeBuffIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureSchemeBuffIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, schemeBuffIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 scheme_buff_id_list = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearSchemeBuffIdList() {
        schemeBuffIdList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:ChannelerSlabOneOffDungeonInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:ChannelerSlabOneOffDungeonInfoNotify)
    private static final emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify();
    }

    public static emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChannelerSlabOneOffDungeonInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<ChannelerSlabOneOffDungeonInfoNotify>() {
      @java.lang.Override
      public ChannelerSlabOneOffDungeonInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChannelerSlabOneOffDungeonInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChannelerSlabOneOffDungeonInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChannelerSlabOneOffDungeonInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.ChannelerSlabOneOffDungeonInfoNotifyOuterClass.ChannelerSlabOneOffDungeonInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChannelerSlabOneOffDungeonInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChannelerSlabOneOffDungeonInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*ChannelerSlabOneOffDungeonInfoNotify.p" +
      "roto\"C\n$ChannelerSlabOneOffDungeonInfoNo" +
      "tify\022\033\n\023scheme_buff_id_list\030\010 \003(\rB\030\n\026emu" +
      ".gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChannelerSlabOneOffDungeonInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChannelerSlabOneOffDungeonInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChannelerSlabOneOffDungeonInfoNotify_descriptor,
        new java.lang.String[] { "SchemeBuffIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
