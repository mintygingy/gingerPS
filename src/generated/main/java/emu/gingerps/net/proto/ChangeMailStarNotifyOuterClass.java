// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChangeMailStarNotify.proto

package emu.gingerps.net.proto;

public final class ChangeMailStarNotifyOuterClass {
  private ChangeMailStarNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChangeMailStarNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChangeMailStarNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 mail_id_list = 13;</code>
     * @return A list containing the mailIdList.
     */
    java.util.List<java.lang.Integer> getMailIdListList();
    /**
     * <code>repeated uint32 mail_id_list = 13;</code>
     * @return The count of mailIdList.
     */
    int getMailIdListCount();
    /**
     * <code>repeated uint32 mail_id_list = 13;</code>
     * @param index The index of the element to return.
     * @return The mailIdList at the given index.
     */
    int getMailIdList(int index);

    /**
     * <code>bool is_star = 15;</code>
     * @return The isStar.
     */
    boolean getIsStar();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 1448;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ChangeMailStarNotify}
   */
  public static final class ChangeMailStarNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChangeMailStarNotify)
      ChangeMailStarNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChangeMailStarNotify.newBuilder() to construct.
    private ChangeMailStarNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChangeMailStarNotify() {
      mailIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChangeMailStarNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChangeMailStarNotify(
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
            case 104: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                mailIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              mailIdList_.addInt(input.readUInt32());
              break;
            }
            case 106: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                mailIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                mailIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 120: {

              isStar_ = input.readBool();
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
          mailIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.internal_static_ChangeMailStarNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.internal_static_ChangeMailStarNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify.class, emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify.Builder.class);
    }

    public static final int MAIL_ID_LIST_FIELD_NUMBER = 13;
    private com.google.protobuf.Internal.IntList mailIdList_;
    /**
     * <code>repeated uint32 mail_id_list = 13;</code>
     * @return A list containing the mailIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getMailIdListList() {
      return mailIdList_;
    }
    /**
     * <code>repeated uint32 mail_id_list = 13;</code>
     * @return The count of mailIdList.
     */
    public int getMailIdListCount() {
      return mailIdList_.size();
    }
    /**
     * <code>repeated uint32 mail_id_list = 13;</code>
     * @param index The index of the element to return.
     * @return The mailIdList at the given index.
     */
    public int getMailIdList(int index) {
      return mailIdList_.getInt(index);
    }
    private int mailIdListMemoizedSerializedSize = -1;

    public static final int IS_STAR_FIELD_NUMBER = 15;
    private boolean isStar_;
    /**
     * <code>bool is_star = 15;</code>
     * @return The isStar.
     */
    @java.lang.Override
    public boolean getIsStar() {
      return isStar_;
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
      if (getMailIdListList().size() > 0) {
        output.writeUInt32NoTag(106);
        output.writeUInt32NoTag(mailIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < mailIdList_.size(); i++) {
        output.writeUInt32NoTag(mailIdList_.getInt(i));
      }
      if (isStar_ != false) {
        output.writeBool(15, isStar_);
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
        for (int i = 0; i < mailIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(mailIdList_.getInt(i));
        }
        size += dataSize;
        if (!getMailIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        mailIdListMemoizedSerializedSize = dataSize;
      }
      if (isStar_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isStar_);
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
      if (!(obj instanceof emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify other = (emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify) obj;

      if (!getMailIdListList()
          .equals(other.getMailIdListList())) return false;
      if (getIsStar()
          != other.getIsStar()) return false;
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
      if (getMailIdListCount() > 0) {
        hash = (37 * hash) + MAIL_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMailIdListList().hashCode();
      }
      hash = (37 * hash) + IS_STAR_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsStar());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify prototype) {
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
     *   CMD_ID = 1448;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ChangeMailStarNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChangeMailStarNotify)
        emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.internal_static_ChangeMailStarNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.internal_static_ChangeMailStarNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify.class, emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify.newBuilder()
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
        mailIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        isStar_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.internal_static_ChangeMailStarNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify build() {
        emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify buildPartial() {
        emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify result = new emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          mailIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.mailIdList_ = mailIdList_;
        result.isStar_ = isStar_;
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
        if (other instanceof emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify) {
          return mergeFrom((emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify other) {
        if (other == emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify.getDefaultInstance()) return this;
        if (!other.mailIdList_.isEmpty()) {
          if (mailIdList_.isEmpty()) {
            mailIdList_ = other.mailIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMailIdListIsMutable();
            mailIdList_.addAll(other.mailIdList_);
          }
          onChanged();
        }
        if (other.getIsStar() != false) {
          setIsStar(other.getIsStar());
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
        emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList mailIdList_ = emptyIntList();
      private void ensureMailIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          mailIdList_ = mutableCopy(mailIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 mail_id_list = 13;</code>
       * @return A list containing the mailIdList.
       */
      public java.util.List<java.lang.Integer>
          getMailIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(mailIdList_) : mailIdList_;
      }
      /**
       * <code>repeated uint32 mail_id_list = 13;</code>
       * @return The count of mailIdList.
       */
      public int getMailIdListCount() {
        return mailIdList_.size();
      }
      /**
       * <code>repeated uint32 mail_id_list = 13;</code>
       * @param index The index of the element to return.
       * @return The mailIdList at the given index.
       */
      public int getMailIdList(int index) {
        return mailIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 mail_id_list = 13;</code>
       * @param index The index to set the value at.
       * @param value The mailIdList to set.
       * @return This builder for chaining.
       */
      public Builder setMailIdList(
          int index, int value) {
        ensureMailIdListIsMutable();
        mailIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 mail_id_list = 13;</code>
       * @param value The mailIdList to add.
       * @return This builder for chaining.
       */
      public Builder addMailIdList(int value) {
        ensureMailIdListIsMutable();
        mailIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 mail_id_list = 13;</code>
       * @param values The mailIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllMailIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureMailIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mailIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 mail_id_list = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearMailIdList() {
        mailIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private boolean isStar_ ;
      /**
       * <code>bool is_star = 15;</code>
       * @return The isStar.
       */
      @java.lang.Override
      public boolean getIsStar() {
        return isStar_;
      }
      /**
       * <code>bool is_star = 15;</code>
       * @param value The isStar to set.
       * @return This builder for chaining.
       */
      public Builder setIsStar(boolean value) {
        
        isStar_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_star = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsStar() {
        
        isStar_ = false;
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


      // @@protoc_insertion_point(builder_scope:ChangeMailStarNotify)
    }

    // @@protoc_insertion_point(class_scope:ChangeMailStarNotify)
    private static final emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify();
    }

    public static emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChangeMailStarNotify>
        PARSER = new com.google.protobuf.AbstractParser<ChangeMailStarNotify>() {
      @java.lang.Override
      public ChangeMailStarNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChangeMailStarNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChangeMailStarNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChangeMailStarNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.ChangeMailStarNotifyOuterClass.ChangeMailStarNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChangeMailStarNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChangeMailStarNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032ChangeMailStarNotify.proto\"=\n\024ChangeMa" +
      "ilStarNotify\022\024\n\014mail_id_list\030\r \003(\r\022\017\n\007is" +
      "_star\030\017 \001(\010B\030\n\026emu.gingerps.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChangeMailStarNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChangeMailStarNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChangeMailStarNotify_descriptor,
        new java.lang.String[] { "MailIdList", "IsStar", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
