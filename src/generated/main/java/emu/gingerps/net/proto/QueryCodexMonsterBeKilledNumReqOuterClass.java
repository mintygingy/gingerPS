// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: QueryCodexMonsterBeKilledNumReq.proto

package emu.gingerps.net.proto;

public final class QueryCodexMonsterBeKilledNumReqOuterClass {
  private QueryCodexMonsterBeKilledNumReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface QueryCodexMonsterBeKilledNumReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:QueryCodexMonsterBeKilledNumReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 codex_id_list = 3;</code>
     * @return A list containing the codexIdList.
     */
    java.util.List<java.lang.Integer> getCodexIdListList();
    /**
     * <code>repeated uint32 codex_id_list = 3;</code>
     * @return The count of codexIdList.
     */
    int getCodexIdListCount();
    /**
     * <code>repeated uint32 codex_id_list = 3;</code>
     * @param index The index of the element to return.
     * @return The codexIdList at the given index.
     */
    int getCodexIdList(int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4204;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code QueryCodexMonsterBeKilledNumReq}
   */
  public static final class QueryCodexMonsterBeKilledNumReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:QueryCodexMonsterBeKilledNumReq)
      QueryCodexMonsterBeKilledNumReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use QueryCodexMonsterBeKilledNumReq.newBuilder() to construct.
    private QueryCodexMonsterBeKilledNumReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private QueryCodexMonsterBeKilledNumReq() {
      codexIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new QueryCodexMonsterBeKilledNumReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.internal_static_QueryCodexMonsterBeKilledNumReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.internal_static_QueryCodexMonsterBeKilledNumReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq.class, emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq.Builder.class);
    }

    public static final int CODEX_ID_LIST_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList codexIdList_;
    /**
     * <code>repeated uint32 codex_id_list = 3;</code>
     * @return A list containing the codexIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getCodexIdListList() {
      return codexIdList_;
    }
    /**
     * <code>repeated uint32 codex_id_list = 3;</code>
     * @return The count of codexIdList.
     */
    public int getCodexIdListCount() {
      return codexIdList_.size();
    }
    /**
     * <code>repeated uint32 codex_id_list = 3;</code>
     * @param index The index of the element to return.
     * @return The codexIdList at the given index.
     */
    public int getCodexIdList(int index) {
      return codexIdList_.getInt(index);
    }
    private int codexIdListMemoizedSerializedSize = -1;

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
      if (getCodexIdListList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(codexIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < codexIdList_.size(); i++) {
        output.writeUInt32NoTag(codexIdList_.getInt(i));
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
        for (int i = 0; i < codexIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(codexIdList_.getInt(i));
        }
        size += dataSize;
        if (!getCodexIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        codexIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq other = (emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq) obj;

      if (!getCodexIdListList()
          .equals(other.getCodexIdListList())) return false;
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
      if (getCodexIdListCount() > 0) {
        hash = (37 * hash) + CODEX_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getCodexIdListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq prototype) {
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
     *   CMD_ID = 4204;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code QueryCodexMonsterBeKilledNumReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:QueryCodexMonsterBeKilledNumReq)
        emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.internal_static_QueryCodexMonsterBeKilledNumReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.internal_static_QueryCodexMonsterBeKilledNumReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq.class, emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq.newBuilder()
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
        codexIdList_ = emptyIntList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.internal_static_QueryCodexMonsterBeKilledNumReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq build() {
        emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq buildPartial() {
        emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq result = new emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq result) {
        if (((bitField0_ & 0x00000001) != 0)) {
          codexIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.codexIdList_ = codexIdList_;
      }

      private void buildPartial0(emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq result) {
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
        if (other instanceof emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq) {
          return mergeFrom((emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq other) {
        if (other == emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq.getDefaultInstance()) return this;
        if (!other.codexIdList_.isEmpty()) {
          if (codexIdList_.isEmpty()) {
            codexIdList_ = other.codexIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCodexIdListIsMutable();
            codexIdList_.addAll(other.codexIdList_);
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
              case 24: {
                int v = input.readUInt32();
                ensureCodexIdListIsMutable();
                codexIdList_.addInt(v);
                break;
              } // case 24
              case 26: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureCodexIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  codexIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 26
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

      private com.google.protobuf.Internal.IntList codexIdList_ = emptyIntList();
      private void ensureCodexIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          codexIdList_ = mutableCopy(codexIdList_);
          bitField0_ |= 0x00000001;
        }
      }
      /**
       * <code>repeated uint32 codex_id_list = 3;</code>
       * @return A list containing the codexIdList.
       */
      public java.util.List<java.lang.Integer>
          getCodexIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(codexIdList_) : codexIdList_;
      }
      /**
       * <code>repeated uint32 codex_id_list = 3;</code>
       * @return The count of codexIdList.
       */
      public int getCodexIdListCount() {
        return codexIdList_.size();
      }
      /**
       * <code>repeated uint32 codex_id_list = 3;</code>
       * @param index The index of the element to return.
       * @return The codexIdList at the given index.
       */
      public int getCodexIdList(int index) {
        return codexIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 codex_id_list = 3;</code>
       * @param index The index to set the value at.
       * @param value The codexIdList to set.
       * @return This builder for chaining.
       */
      public Builder setCodexIdList(
          int index, int value) {
        
        ensureCodexIdListIsMutable();
        codexIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 codex_id_list = 3;</code>
       * @param value The codexIdList to add.
       * @return This builder for chaining.
       */
      public Builder addCodexIdList(int value) {
        
        ensureCodexIdListIsMutable();
        codexIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 codex_id_list = 3;</code>
       * @param values The codexIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllCodexIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureCodexIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, codexIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 codex_id_list = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearCodexIdList() {
        codexIdList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:QueryCodexMonsterBeKilledNumReq)
    }

    // @@protoc_insertion_point(class_scope:QueryCodexMonsterBeKilledNumReq)
    private static final emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq();
    }

    public static emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<QueryCodexMonsterBeKilledNumReq>
        PARSER = new com.google.protobuf.AbstractParser<QueryCodexMonsterBeKilledNumReq>() {
      @java.lang.Override
      public QueryCodexMonsterBeKilledNumReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<QueryCodexMonsterBeKilledNumReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QueryCodexMonsterBeKilledNumReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.QueryCodexMonsterBeKilledNumReqOuterClass.QueryCodexMonsterBeKilledNumReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_QueryCodexMonsterBeKilledNumReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_QueryCodexMonsterBeKilledNumReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%QueryCodexMonsterBeKilledNumReq.proto\"" +
      "8\n\037QueryCodexMonsterBeKilledNumReq\022\025\n\rco" +
      "dex_id_list\030\003 \003(\rB\030\n\026emu.gingerps.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_QueryCodexMonsterBeKilledNumReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_QueryCodexMonsterBeKilledNumReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_QueryCodexMonsterBeKilledNumReq_descriptor,
        new java.lang.String[] { "CodexIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
