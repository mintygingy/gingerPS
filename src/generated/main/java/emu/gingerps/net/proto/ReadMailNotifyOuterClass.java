// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReadMailNotify.proto

package emu.gingerps.net.proto;

public final class ReadMailNotifyOuterClass {
  private ReadMailNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReadMailNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ReadMailNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 mail_id_list = 7;</code>
     * @return A list containing the mailIdList.
     */
    java.util.List<java.lang.Integer> getMailIdListList();
    /**
     * <code>repeated uint32 mail_id_list = 7;</code>
     * @return The count of mailIdList.
     */
    int getMailIdListCount();
    /**
     * <code>repeated uint32 mail_id_list = 7;</code>
     * @param index The index of the element to return.
     * @return The mailIdList at the given index.
     */
    int getMailIdList(int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 1456;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ReadMailNotify}
   */
  public static final class ReadMailNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ReadMailNotify)
      ReadMailNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReadMailNotify.newBuilder() to construct.
    private ReadMailNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReadMailNotify() {
      mailIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ReadMailNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.ReadMailNotifyOuterClass.internal_static_ReadMailNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.ReadMailNotifyOuterClass.internal_static_ReadMailNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify.class, emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify.Builder.class);
    }

    public static final int MAIL_ID_LIST_FIELD_NUMBER = 7;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList mailIdList_;
    /**
     * <code>repeated uint32 mail_id_list = 7;</code>
     * @return A list containing the mailIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getMailIdListList() {
      return mailIdList_;
    }
    /**
     * <code>repeated uint32 mail_id_list = 7;</code>
     * @return The count of mailIdList.
     */
    public int getMailIdListCount() {
      return mailIdList_.size();
    }
    /**
     * <code>repeated uint32 mail_id_list = 7;</code>
     * @param index The index of the element to return.
     * @return The mailIdList at the given index.
     */
    public int getMailIdList(int index) {
      return mailIdList_.getInt(index);
    }
    private int mailIdListMemoizedSerializedSize = -1;

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
        output.writeUInt32NoTag(58);
        output.writeUInt32NoTag(mailIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < mailIdList_.size(); i++) {
        output.writeUInt32NoTag(mailIdList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
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
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify other = (emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify) obj;

      if (!getMailIdListList()
          .equals(other.getMailIdListList())) return false;
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
      if (getMailIdListCount() > 0) {
        hash = (37 * hash) + MAIL_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMailIdListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify prototype) {
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
     *   CMD_ID = 1456;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ReadMailNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ReadMailNotify)
        emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.ReadMailNotifyOuterClass.internal_static_ReadMailNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.ReadMailNotifyOuterClass.internal_static_ReadMailNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify.class, emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify.newBuilder()
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
        mailIdList_ = emptyIntList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.ReadMailNotifyOuterClass.internal_static_ReadMailNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify build() {
        emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify buildPartial() {
        emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify result = new emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify result) {
        if (((bitField0_ & 0x00000001) != 0)) {
          mailIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.mailIdList_ = mailIdList_;
      }

      private void buildPartial0(emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify result) {
        int from_bitField0_ = bitField0_;
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
        if (other instanceof emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify) {
          return mergeFrom((emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify other) {
        if (other == emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify.getDefaultInstance()) return this;
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
              case 56: {
                int v = input.readUInt32();
                ensureMailIdListIsMutable();
                mailIdList_.addInt(v);
                break;
              } // case 56
              case 58: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureMailIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  mailIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 58
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

      private com.google.protobuf.Internal.IntList mailIdList_ = emptyIntList();
      private void ensureMailIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          mailIdList_ = mutableCopy(mailIdList_);
          bitField0_ |= 0x00000001;
        }
      }
      /**
       * <code>repeated uint32 mail_id_list = 7;</code>
       * @return A list containing the mailIdList.
       */
      public java.util.List<java.lang.Integer>
          getMailIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(mailIdList_) : mailIdList_;
      }
      /**
       * <code>repeated uint32 mail_id_list = 7;</code>
       * @return The count of mailIdList.
       */
      public int getMailIdListCount() {
        return mailIdList_.size();
      }
      /**
       * <code>repeated uint32 mail_id_list = 7;</code>
       * @param index The index of the element to return.
       * @return The mailIdList at the given index.
       */
      public int getMailIdList(int index) {
        return mailIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 mail_id_list = 7;</code>
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
       * <code>repeated uint32 mail_id_list = 7;</code>
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
       * <code>repeated uint32 mail_id_list = 7;</code>
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
       * <code>repeated uint32 mail_id_list = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearMailIdList() {
        mailIdList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:ReadMailNotify)
    }

    // @@protoc_insertion_point(class_scope:ReadMailNotify)
    private static final emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify();
    }

    public static emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReadMailNotify>
        PARSER = new com.google.protobuf.AbstractParser<ReadMailNotify>() {
      @java.lang.Override
      public ReadMailNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<ReadMailNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReadMailNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.ReadMailNotifyOuterClass.ReadMailNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReadMailNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReadMailNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024ReadMailNotify.proto\"&\n\016ReadMailNotify" +
      "\022\024\n\014mail_id_list\030\007 \003(\rB\030\n\026emu.gingerps.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ReadMailNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ReadMailNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReadMailNotify_descriptor,
        new java.lang.String[] { "MailIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
