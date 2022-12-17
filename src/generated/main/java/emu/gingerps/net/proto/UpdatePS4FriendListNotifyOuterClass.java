// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UpdatePS4FriendListNotify.proto

package emu.gingerps.net.proto;

public final class UpdatePS4FriendListNotifyOuterClass {
  private UpdatePS4FriendListNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UpdatePS4FriendListNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UpdatePS4FriendListNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated string psn_id_list = 14;</code>
     * @return A list containing the psnIdList.
     */
    java.util.List<java.lang.String>
        getPsnIdListList();
    /**
     * <code>repeated string psn_id_list = 14;</code>
     * @return The count of psnIdList.
     */
    int getPsnIdListCount();
    /**
     * <code>repeated string psn_id_list = 14;</code>
     * @param index The index of the element to return.
     * @return The psnIdList at the given index.
     */
    java.lang.String getPsnIdList(int index);
    /**
     * <code>repeated string psn_id_list = 14;</code>
     * @param index The index of the value to return.
     * @return The bytes of the psnIdList at the given index.
     */
    com.google.protobuf.ByteString
        getPsnIdListBytes(int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4016;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code UpdatePS4FriendListNotify}
   */
  public static final class UpdatePS4FriendListNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UpdatePS4FriendListNotify)
      UpdatePS4FriendListNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UpdatePS4FriendListNotify.newBuilder() to construct.
    private UpdatePS4FriendListNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UpdatePS4FriendListNotify() {
      psnIdList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UpdatePS4FriendListNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UpdatePS4FriendListNotify(
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
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                psnIdList_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              psnIdList_.add(s);
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
          psnIdList_ = psnIdList_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.internal_static_UpdatePS4FriendListNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.internal_static_UpdatePS4FriendListNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify.class, emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify.Builder.class);
    }

    public static final int PSN_ID_LIST_FIELD_NUMBER = 14;
    private com.google.protobuf.LazyStringList psnIdList_;
    /**
     * <code>repeated string psn_id_list = 14;</code>
     * @return A list containing the psnIdList.
     */
    public com.google.protobuf.ProtocolStringList
        getPsnIdListList() {
      return psnIdList_;
    }
    /**
     * <code>repeated string psn_id_list = 14;</code>
     * @return The count of psnIdList.
     */
    public int getPsnIdListCount() {
      return psnIdList_.size();
    }
    /**
     * <code>repeated string psn_id_list = 14;</code>
     * @param index The index of the element to return.
     * @return The psnIdList at the given index.
     */
    public java.lang.String getPsnIdList(int index) {
      return psnIdList_.get(index);
    }
    /**
     * <code>repeated string psn_id_list = 14;</code>
     * @param index The index of the value to return.
     * @return The bytes of the psnIdList at the given index.
     */
    public com.google.protobuf.ByteString
        getPsnIdListBytes(int index) {
      return psnIdList_.getByteString(index);
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
      for (int i = 0; i < psnIdList_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 14, psnIdList_.getRaw(i));
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
        for (int i = 0; i < psnIdList_.size(); i++) {
          dataSize += computeStringSizeNoTag(psnIdList_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getPsnIdListList().size();
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
      if (!(obj instanceof emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify other = (emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify) obj;

      if (!getPsnIdListList()
          .equals(other.getPsnIdListList())) return false;
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
      if (getPsnIdListCount() > 0) {
        hash = (37 * hash) + PSN_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getPsnIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify prototype) {
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
     *   CMD_ID = 4016;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code UpdatePS4FriendListNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UpdatePS4FriendListNotify)
        emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.internal_static_UpdatePS4FriendListNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.internal_static_UpdatePS4FriendListNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify.class, emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify.newBuilder()
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
        psnIdList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.internal_static_UpdatePS4FriendListNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify build() {
        emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify buildPartial() {
        emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify result = new emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          psnIdList_ = psnIdList_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.psnIdList_ = psnIdList_;
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
        if (other instanceof emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify) {
          return mergeFrom((emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify other) {
        if (other == emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify.getDefaultInstance()) return this;
        if (!other.psnIdList_.isEmpty()) {
          if (psnIdList_.isEmpty()) {
            psnIdList_ = other.psnIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePsnIdListIsMutable();
            psnIdList_.addAll(other.psnIdList_);
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
        emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.LazyStringList psnIdList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensurePsnIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          psnIdList_ = new com.google.protobuf.LazyStringArrayList(psnIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated string psn_id_list = 14;</code>
       * @return A list containing the psnIdList.
       */
      public com.google.protobuf.ProtocolStringList
          getPsnIdListList() {
        return psnIdList_.getUnmodifiableView();
      }
      /**
       * <code>repeated string psn_id_list = 14;</code>
       * @return The count of psnIdList.
       */
      public int getPsnIdListCount() {
        return psnIdList_.size();
      }
      /**
       * <code>repeated string psn_id_list = 14;</code>
       * @param index The index of the element to return.
       * @return The psnIdList at the given index.
       */
      public java.lang.String getPsnIdList(int index) {
        return psnIdList_.get(index);
      }
      /**
       * <code>repeated string psn_id_list = 14;</code>
       * @param index The index of the value to return.
       * @return The bytes of the psnIdList at the given index.
       */
      public com.google.protobuf.ByteString
          getPsnIdListBytes(int index) {
        return psnIdList_.getByteString(index);
      }
      /**
       * <code>repeated string psn_id_list = 14;</code>
       * @param index The index to set the value at.
       * @param value The psnIdList to set.
       * @return This builder for chaining.
       */
      public Builder setPsnIdList(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensurePsnIdListIsMutable();
        psnIdList_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string psn_id_list = 14;</code>
       * @param value The psnIdList to add.
       * @return This builder for chaining.
       */
      public Builder addPsnIdList(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensurePsnIdListIsMutable();
        psnIdList_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string psn_id_list = 14;</code>
       * @param values The psnIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllPsnIdList(
          java.lang.Iterable<java.lang.String> values) {
        ensurePsnIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, psnIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string psn_id_list = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearPsnIdList() {
        psnIdList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string psn_id_list = 14;</code>
       * @param value The bytes of the psnIdList to add.
       * @return This builder for chaining.
       */
      public Builder addPsnIdListBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensurePsnIdListIsMutable();
        psnIdList_.add(value);
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


      // @@protoc_insertion_point(builder_scope:UpdatePS4FriendListNotify)
    }

    // @@protoc_insertion_point(class_scope:UpdatePS4FriendListNotify)
    private static final emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify();
    }

    public static emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UpdatePS4FriendListNotify>
        PARSER = new com.google.protobuf.AbstractParser<UpdatePS4FriendListNotify>() {
      @java.lang.Override
      public UpdatePS4FriendListNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UpdatePS4FriendListNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UpdatePS4FriendListNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UpdatePS4FriendListNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.UpdatePS4FriendListNotifyOuterClass.UpdatePS4FriendListNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UpdatePS4FriendListNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UpdatePS4FriendListNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037UpdatePS4FriendListNotify.proto\"0\n\031Upd" +
      "atePS4FriendListNotify\022\023\n\013psn_id_list\030\016 " +
      "\003(\tB\030\n\026emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UpdatePS4FriendListNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UpdatePS4FriendListNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UpdatePS4FriendListNotify_descriptor,
        new java.lang.String[] { "PsnIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
