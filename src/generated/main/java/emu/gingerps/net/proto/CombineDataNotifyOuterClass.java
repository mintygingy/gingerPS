// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CombineDataNotify.proto

package emu.gingerps.net.proto;

public final class CombineDataNotifyOuterClass {
  private CombineDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CombineDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CombineDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 combine_id_list = 7;</code>
     * @return A list containing the combineIdList.
     */
    java.util.List<java.lang.Integer> getCombineIdListList();
    /**
     * <code>repeated uint32 combine_id_list = 7;</code>
     * @return The count of combineIdList.
     */
    int getCombineIdListCount();
    /**
     * <code>repeated uint32 combine_id_list = 7;</code>
     * @param index The index of the element to return.
     * @return The combineIdList at the given index.
     */
    int getCombineIdList(int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 677;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code CombineDataNotify}
   */
  public static final class CombineDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CombineDataNotify)
      CombineDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CombineDataNotify.newBuilder() to construct.
    private CombineDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CombineDataNotify() {
      combineIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CombineDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CombineDataNotify(
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
                combineIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              combineIdList_.addInt(input.readUInt32());
              break;
            }
            case 58: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                combineIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                combineIdList_.addInt(input.readUInt32());
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
          combineIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.CombineDataNotifyOuterClass.internal_static_CombineDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.CombineDataNotifyOuterClass.internal_static_CombineDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify.class, emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify.Builder.class);
    }

    public static final int COMBINE_ID_LIST_FIELD_NUMBER = 7;
    private com.google.protobuf.Internal.IntList combineIdList_;
    /**
     * <code>repeated uint32 combine_id_list = 7;</code>
     * @return A list containing the combineIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getCombineIdListList() {
      return combineIdList_;
    }
    /**
     * <code>repeated uint32 combine_id_list = 7;</code>
     * @return The count of combineIdList.
     */
    public int getCombineIdListCount() {
      return combineIdList_.size();
    }
    /**
     * <code>repeated uint32 combine_id_list = 7;</code>
     * @param index The index of the element to return.
     * @return The combineIdList at the given index.
     */
    public int getCombineIdList(int index) {
      return combineIdList_.getInt(index);
    }
    private int combineIdListMemoizedSerializedSize = -1;

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
      if (getCombineIdListList().size() > 0) {
        output.writeUInt32NoTag(58);
        output.writeUInt32NoTag(combineIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < combineIdList_.size(); i++) {
        output.writeUInt32NoTag(combineIdList_.getInt(i));
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
        for (int i = 0; i < combineIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(combineIdList_.getInt(i));
        }
        size += dataSize;
        if (!getCombineIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        combineIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify other = (emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify) obj;

      if (!getCombineIdListList()
          .equals(other.getCombineIdListList())) return false;
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
      if (getCombineIdListCount() > 0) {
        hash = (37 * hash) + COMBINE_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getCombineIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify prototype) {
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
     *   CMD_ID = 677;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code CombineDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CombineDataNotify)
        emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.CombineDataNotifyOuterClass.internal_static_CombineDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.CombineDataNotifyOuterClass.internal_static_CombineDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify.class, emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify.newBuilder()
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
        combineIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.CombineDataNotifyOuterClass.internal_static_CombineDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify build() {
        emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify buildPartial() {
        emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify result = new emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          combineIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.combineIdList_ = combineIdList_;
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
        if (other instanceof emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify) {
          return mergeFrom((emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify other) {
        if (other == emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify.getDefaultInstance()) return this;
        if (!other.combineIdList_.isEmpty()) {
          if (combineIdList_.isEmpty()) {
            combineIdList_ = other.combineIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCombineIdListIsMutable();
            combineIdList_.addAll(other.combineIdList_);
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
        emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList combineIdList_ = emptyIntList();
      private void ensureCombineIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          combineIdList_ = mutableCopy(combineIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 combine_id_list = 7;</code>
       * @return A list containing the combineIdList.
       */
      public java.util.List<java.lang.Integer>
          getCombineIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(combineIdList_) : combineIdList_;
      }
      /**
       * <code>repeated uint32 combine_id_list = 7;</code>
       * @return The count of combineIdList.
       */
      public int getCombineIdListCount() {
        return combineIdList_.size();
      }
      /**
       * <code>repeated uint32 combine_id_list = 7;</code>
       * @param index The index of the element to return.
       * @return The combineIdList at the given index.
       */
      public int getCombineIdList(int index) {
        return combineIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 combine_id_list = 7;</code>
       * @param index The index to set the value at.
       * @param value The combineIdList to set.
       * @return This builder for chaining.
       */
      public Builder setCombineIdList(
          int index, int value) {
        ensureCombineIdListIsMutable();
        combineIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 combine_id_list = 7;</code>
       * @param value The combineIdList to add.
       * @return This builder for chaining.
       */
      public Builder addCombineIdList(int value) {
        ensureCombineIdListIsMutable();
        combineIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 combine_id_list = 7;</code>
       * @param values The combineIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllCombineIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureCombineIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, combineIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 combine_id_list = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearCombineIdList() {
        combineIdList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:CombineDataNotify)
    }

    // @@protoc_insertion_point(class_scope:CombineDataNotify)
    private static final emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify();
    }

    public static emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CombineDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<CombineDataNotify>() {
      @java.lang.Override
      public CombineDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CombineDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CombineDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CombineDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.CombineDataNotifyOuterClass.CombineDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CombineDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CombineDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027CombineDataNotify.proto\",\n\021CombineData" +
      "Notify\022\027\n\017combine_id_list\030\007 \003(\rB\033\n\031emu.g" +
      "rasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CombineDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CombineDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CombineDataNotify_descriptor,
        new java.lang.String[] { "CombineIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
