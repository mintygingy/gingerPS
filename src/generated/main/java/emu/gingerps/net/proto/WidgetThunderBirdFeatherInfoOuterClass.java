// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WidgetThunderBirdFeatherInfo.proto

package emu.gingerps.net.proto;

public final class WidgetThunderBirdFeatherInfoOuterClass {
  private WidgetThunderBirdFeatherInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WidgetThunderBirdFeatherInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WidgetThunderBirdFeatherInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 entity_id_list = 9;</code>
     * @return A list containing the entityIdList.
     */
    java.util.List<java.lang.Integer> getEntityIdListList();
    /**
     * <code>repeated uint32 entity_id_list = 9;</code>
     * @return The count of entityIdList.
     */
    int getEntityIdListCount();
    /**
     * <code>repeated uint32 entity_id_list = 9;</code>
     * @param index The index of the element to return.
     * @return The entityIdList at the given index.
     */
    int getEntityIdList(int index);
  }
  /**
   * Protobuf type {@code WidgetThunderBirdFeatherInfo}
   */
  public static final class WidgetThunderBirdFeatherInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WidgetThunderBirdFeatherInfo)
      WidgetThunderBirdFeatherInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WidgetThunderBirdFeatherInfo.newBuilder() to construct.
    private WidgetThunderBirdFeatherInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WidgetThunderBirdFeatherInfo() {
      entityIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WidgetThunderBirdFeatherInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WidgetThunderBirdFeatherInfo(
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
            case 72: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                entityIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              entityIdList_.addInt(input.readUInt32());
              break;
            }
            case 74: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                entityIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                entityIdList_.addInt(input.readUInt32());
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
          entityIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.internal_static_WidgetThunderBirdFeatherInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.internal_static_WidgetThunderBirdFeatherInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo.class, emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo.Builder.class);
    }

    public static final int ENTITY_ID_LIST_FIELD_NUMBER = 9;
    private com.google.protobuf.Internal.IntList entityIdList_;
    /**
     * <code>repeated uint32 entity_id_list = 9;</code>
     * @return A list containing the entityIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getEntityIdListList() {
      return entityIdList_;
    }
    /**
     * <code>repeated uint32 entity_id_list = 9;</code>
     * @return The count of entityIdList.
     */
    public int getEntityIdListCount() {
      return entityIdList_.size();
    }
    /**
     * <code>repeated uint32 entity_id_list = 9;</code>
     * @param index The index of the element to return.
     * @return The entityIdList at the given index.
     */
    public int getEntityIdList(int index) {
      return entityIdList_.getInt(index);
    }
    private int entityIdListMemoizedSerializedSize = -1;

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
      if (getEntityIdListList().size() > 0) {
        output.writeUInt32NoTag(74);
        output.writeUInt32NoTag(entityIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < entityIdList_.size(); i++) {
        output.writeUInt32NoTag(entityIdList_.getInt(i));
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
        for (int i = 0; i < entityIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(entityIdList_.getInt(i));
        }
        size += dataSize;
        if (!getEntityIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        entityIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo other = (emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo) obj;

      if (!getEntityIdListList()
          .equals(other.getEntityIdListList())) return false;
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
      if (getEntityIdListCount() > 0) {
        hash = (37 * hash) + ENTITY_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getEntityIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo prototype) {
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
     * Protobuf type {@code WidgetThunderBirdFeatherInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WidgetThunderBirdFeatherInfo)
        emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.internal_static_WidgetThunderBirdFeatherInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.internal_static_WidgetThunderBirdFeatherInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo.class, emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo.newBuilder()
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
        entityIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.internal_static_WidgetThunderBirdFeatherInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo build() {
        emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo buildPartial() {
        emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo result = new emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          entityIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.entityIdList_ = entityIdList_;
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
        if (other instanceof emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo) {
          return mergeFrom((emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo other) {
        if (other == emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo.getDefaultInstance()) return this;
        if (!other.entityIdList_.isEmpty()) {
          if (entityIdList_.isEmpty()) {
            entityIdList_ = other.entityIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEntityIdListIsMutable();
            entityIdList_.addAll(other.entityIdList_);
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
        emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList entityIdList_ = emptyIntList();
      private void ensureEntityIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          entityIdList_ = mutableCopy(entityIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 entity_id_list = 9;</code>
       * @return A list containing the entityIdList.
       */
      public java.util.List<java.lang.Integer>
          getEntityIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(entityIdList_) : entityIdList_;
      }
      /**
       * <code>repeated uint32 entity_id_list = 9;</code>
       * @return The count of entityIdList.
       */
      public int getEntityIdListCount() {
        return entityIdList_.size();
      }
      /**
       * <code>repeated uint32 entity_id_list = 9;</code>
       * @param index The index of the element to return.
       * @return The entityIdList at the given index.
       */
      public int getEntityIdList(int index) {
        return entityIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 entity_id_list = 9;</code>
       * @param index The index to set the value at.
       * @param value The entityIdList to set.
       * @return This builder for chaining.
       */
      public Builder setEntityIdList(
          int index, int value) {
        ensureEntityIdListIsMutable();
        entityIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 entity_id_list = 9;</code>
       * @param value The entityIdList to add.
       * @return This builder for chaining.
       */
      public Builder addEntityIdList(int value) {
        ensureEntityIdListIsMutable();
        entityIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 entity_id_list = 9;</code>
       * @param values The entityIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllEntityIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureEntityIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, entityIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 entity_id_list = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityIdList() {
        entityIdList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:WidgetThunderBirdFeatherInfo)
    }

    // @@protoc_insertion_point(class_scope:WidgetThunderBirdFeatherInfo)
    private static final emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo();
    }

    public static emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WidgetThunderBirdFeatherInfo>
        PARSER = new com.google.protobuf.AbstractParser<WidgetThunderBirdFeatherInfo>() {
      @java.lang.Override
      public WidgetThunderBirdFeatherInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WidgetThunderBirdFeatherInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WidgetThunderBirdFeatherInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WidgetThunderBirdFeatherInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.WidgetThunderBirdFeatherInfoOuterClass.WidgetThunderBirdFeatherInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WidgetThunderBirdFeatherInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WidgetThunderBirdFeatherInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"WidgetThunderBirdFeatherInfo.proto\"6\n\034" +
      "WidgetThunderBirdFeatherInfo\022\026\n\016entity_i" +
      "d_list\030\t \003(\rB\030\n\026emu.gingerps.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WidgetThunderBirdFeatherInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WidgetThunderBirdFeatherInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WidgetThunderBirdFeatherInfo_descriptor,
        new java.lang.String[] { "EntityIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
