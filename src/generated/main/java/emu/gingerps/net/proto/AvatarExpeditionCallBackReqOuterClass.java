// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarExpeditionCallBackReq.proto

package emu.gingerps.net.proto;

public final class AvatarExpeditionCallBackReqOuterClass {
  private AvatarExpeditionCallBackReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarExpeditionCallBackReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarExpeditionCallBackReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint64 avatar_guid = 14;</code>
     * @return A list containing the avatarGuid.
     */
    java.util.List<java.lang.Long> getAvatarGuidList();
    /**
     * <code>repeated uint64 avatar_guid = 14;</code>
     * @return The count of avatarGuid.
     */
    int getAvatarGuidCount();
    /**
     * <code>repeated uint64 avatar_guid = 14;</code>
     * @param index The index of the element to return.
     * @return The avatarGuid at the given index.
     */
    long getAvatarGuid(int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 1777;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code AvatarExpeditionCallBackReq}
   */
  public static final class AvatarExpeditionCallBackReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarExpeditionCallBackReq)
      AvatarExpeditionCallBackReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarExpeditionCallBackReq.newBuilder() to construct.
    private AvatarExpeditionCallBackReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarExpeditionCallBackReq() {
      avatarGuid_ = emptyLongList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarExpeditionCallBackReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AvatarExpeditionCallBackReq(
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
            case 112: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                avatarGuid_ = newLongList();
                mutable_bitField0_ |= 0x00000001;
              }
              avatarGuid_.addLong(input.readUInt64());
              break;
            }
            case 114: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                avatarGuid_ = newLongList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                avatarGuid_.addLong(input.readUInt64());
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
          avatarGuid_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.internal_static_AvatarExpeditionCallBackReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.internal_static_AvatarExpeditionCallBackReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq.class, emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq.Builder.class);
    }

    public static final int AVATAR_GUID_FIELD_NUMBER = 14;
    private com.google.protobuf.Internal.LongList avatarGuid_;
    /**
     * <code>repeated uint64 avatar_guid = 14;</code>
     * @return A list containing the avatarGuid.
     */
    @java.lang.Override
    public java.util.List<java.lang.Long>
        getAvatarGuidList() {
      return avatarGuid_;
    }
    /**
     * <code>repeated uint64 avatar_guid = 14;</code>
     * @return The count of avatarGuid.
     */
    public int getAvatarGuidCount() {
      return avatarGuid_.size();
    }
    /**
     * <code>repeated uint64 avatar_guid = 14;</code>
     * @param index The index of the element to return.
     * @return The avatarGuid at the given index.
     */
    public long getAvatarGuid(int index) {
      return avatarGuid_.getLong(index);
    }
    private int avatarGuidMemoizedSerializedSize = -1;

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
      if (getAvatarGuidList().size() > 0) {
        output.writeUInt32NoTag(114);
        output.writeUInt32NoTag(avatarGuidMemoizedSerializedSize);
      }
      for (int i = 0; i < avatarGuid_.size(); i++) {
        output.writeUInt64NoTag(avatarGuid_.getLong(i));
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
        for (int i = 0; i < avatarGuid_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(avatarGuid_.getLong(i));
        }
        size += dataSize;
        if (!getAvatarGuidList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        avatarGuidMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq other = (emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq) obj;

      if (!getAvatarGuidList()
          .equals(other.getAvatarGuidList())) return false;
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
      if (getAvatarGuidCount() > 0) {
        hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
        hash = (53 * hash) + getAvatarGuidList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq prototype) {
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
     *   CMD_ID = 1777;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code AvatarExpeditionCallBackReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarExpeditionCallBackReq)
        emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.internal_static_AvatarExpeditionCallBackReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.internal_static_AvatarExpeditionCallBackReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq.class, emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq.newBuilder()
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
        avatarGuid_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.internal_static_AvatarExpeditionCallBackReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq build() {
        emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq buildPartial() {
        emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq result = new emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          avatarGuid_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.avatarGuid_ = avatarGuid_;
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
        if (other instanceof emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq) {
          return mergeFrom((emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq other) {
        if (other == emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq.getDefaultInstance()) return this;
        if (!other.avatarGuid_.isEmpty()) {
          if (avatarGuid_.isEmpty()) {
            avatarGuid_ = other.avatarGuid_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAvatarGuidIsMutable();
            avatarGuid_.addAll(other.avatarGuid_);
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
        emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.LongList avatarGuid_ = emptyLongList();
      private void ensureAvatarGuidIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          avatarGuid_ = mutableCopy(avatarGuid_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint64 avatar_guid = 14;</code>
       * @return A list containing the avatarGuid.
       */
      public java.util.List<java.lang.Long>
          getAvatarGuidList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(avatarGuid_) : avatarGuid_;
      }
      /**
       * <code>repeated uint64 avatar_guid = 14;</code>
       * @return The count of avatarGuid.
       */
      public int getAvatarGuidCount() {
        return avatarGuid_.size();
      }
      /**
       * <code>repeated uint64 avatar_guid = 14;</code>
       * @param index The index of the element to return.
       * @return The avatarGuid at the given index.
       */
      public long getAvatarGuid(int index) {
        return avatarGuid_.getLong(index);
      }
      /**
       * <code>repeated uint64 avatar_guid = 14;</code>
       * @param index The index to set the value at.
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(
          int index, long value) {
        ensureAvatarGuidIsMutable();
        avatarGuid_.setLong(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 avatar_guid = 14;</code>
       * @param value The avatarGuid to add.
       * @return This builder for chaining.
       */
      public Builder addAvatarGuid(long value) {
        ensureAvatarGuidIsMutable();
        avatarGuid_.addLong(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 avatar_guid = 14;</code>
       * @param values The avatarGuid to add.
       * @return This builder for chaining.
       */
      public Builder addAllAvatarGuid(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureAvatarGuidIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, avatarGuid_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 avatar_guid = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        avatarGuid_ = emptyLongList();
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


      // @@protoc_insertion_point(builder_scope:AvatarExpeditionCallBackReq)
    }

    // @@protoc_insertion_point(class_scope:AvatarExpeditionCallBackReq)
    private static final emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq();
    }

    public static emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarExpeditionCallBackReq>
        PARSER = new com.google.protobuf.AbstractParser<AvatarExpeditionCallBackReq>() {
      @java.lang.Override
      public AvatarExpeditionCallBackReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AvatarExpeditionCallBackReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AvatarExpeditionCallBackReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarExpeditionCallBackReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.AvatarExpeditionCallBackReqOuterClass.AvatarExpeditionCallBackReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarExpeditionCallBackReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarExpeditionCallBackReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!AvatarExpeditionCallBackReq.proto\"2\n\033A" +
      "vatarExpeditionCallBackReq\022\023\n\013avatar_gui" +
      "d\030\016 \003(\004B\033\n\031emu.gingerps.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AvatarExpeditionCallBackReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarExpeditionCallBackReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarExpeditionCallBackReq_descriptor,
        new java.lang.String[] { "AvatarGuid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}