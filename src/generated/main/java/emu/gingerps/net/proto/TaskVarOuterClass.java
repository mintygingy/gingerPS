// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TaskVar.proto

package emu.gingerps.net.proto;

public final class TaskVarOuterClass {
  private TaskVarOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TaskVarOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TaskVar)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 key = 2;</code>
     * @return The key.
     */
    int getKey();

    /**
     * <code>repeated int32 value_list = 7;</code>
     * @return A list containing the valueList.
     */
    java.util.List<java.lang.Integer> getValueListList();
    /**
     * <code>repeated int32 value_list = 7;</code>
     * @return The count of valueList.
     */
    int getValueListCount();
    /**
     * <code>repeated int32 value_list = 7;</code>
     * @param index The index of the element to return.
     * @return The valueList at the given index.
     */
    int getValueList(int index);
  }
  /**
   * Protobuf type {@code TaskVar}
   */
  public static final class TaskVar extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TaskVar)
      TaskVarOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TaskVar.newBuilder() to construct.
    private TaskVar(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TaskVar() {
      valueList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TaskVar();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.TaskVarOuterClass.internal_static_TaskVar_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.TaskVarOuterClass.internal_static_TaskVar_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.TaskVarOuterClass.TaskVar.class, emu.gingerps.net.proto.TaskVarOuterClass.TaskVar.Builder.class);
    }

    public static final int KEY_FIELD_NUMBER = 2;
    private int key_ = 0;
    /**
     * <code>uint32 key = 2;</code>
     * @return The key.
     */
    @java.lang.Override
    public int getKey() {
      return key_;
    }

    public static final int VALUE_LIST_FIELD_NUMBER = 7;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList valueList_;
    /**
     * <code>repeated int32 value_list = 7;</code>
     * @return A list containing the valueList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getValueListList() {
      return valueList_;
    }
    /**
     * <code>repeated int32 value_list = 7;</code>
     * @return The count of valueList.
     */
    public int getValueListCount() {
      return valueList_.size();
    }
    /**
     * <code>repeated int32 value_list = 7;</code>
     * @param index The index of the element to return.
     * @return The valueList at the given index.
     */
    public int getValueList(int index) {
      return valueList_.getInt(index);
    }
    private int valueListMemoizedSerializedSize = -1;

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
      if (key_ != 0) {
        output.writeUInt32(2, key_);
      }
      if (getValueListList().size() > 0) {
        output.writeUInt32NoTag(58);
        output.writeUInt32NoTag(valueListMemoizedSerializedSize);
      }
      for (int i = 0; i < valueList_.size(); i++) {
        output.writeInt32NoTag(valueList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (key_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, key_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < valueList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(valueList_.getInt(i));
        }
        size += dataSize;
        if (!getValueListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        valueListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.gingerps.net.proto.TaskVarOuterClass.TaskVar)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.TaskVarOuterClass.TaskVar other = (emu.gingerps.net.proto.TaskVarOuterClass.TaskVar) obj;

      if (getKey()
          != other.getKey()) return false;
      if (!getValueListList()
          .equals(other.getValueListList())) return false;
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
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKey();
      if (getValueListCount() > 0) {
        hash = (37 * hash) + VALUE_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getValueListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.TaskVarOuterClass.TaskVar parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.TaskVarOuterClass.TaskVar parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.TaskVarOuterClass.TaskVar parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.TaskVarOuterClass.TaskVar parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.TaskVarOuterClass.TaskVar parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.TaskVarOuterClass.TaskVar parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.TaskVarOuterClass.TaskVar parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.TaskVarOuterClass.TaskVar parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.TaskVarOuterClass.TaskVar parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.TaskVarOuterClass.TaskVar parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.TaskVarOuterClass.TaskVar parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.TaskVarOuterClass.TaskVar parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.TaskVarOuterClass.TaskVar prototype) {
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
     * Protobuf type {@code TaskVar}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TaskVar)
        emu.gingerps.net.proto.TaskVarOuterClass.TaskVarOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.TaskVarOuterClass.internal_static_TaskVar_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.TaskVarOuterClass.internal_static_TaskVar_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.TaskVarOuterClass.TaskVar.class, emu.gingerps.net.proto.TaskVarOuterClass.TaskVar.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.TaskVarOuterClass.TaskVar.newBuilder()
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
        key_ = 0;
        valueList_ = emptyIntList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.TaskVarOuterClass.internal_static_TaskVar_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.TaskVarOuterClass.TaskVar getDefaultInstanceForType() {
        return emu.gingerps.net.proto.TaskVarOuterClass.TaskVar.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.TaskVarOuterClass.TaskVar build() {
        emu.gingerps.net.proto.TaskVarOuterClass.TaskVar result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.TaskVarOuterClass.TaskVar buildPartial() {
        emu.gingerps.net.proto.TaskVarOuterClass.TaskVar result = new emu.gingerps.net.proto.TaskVarOuterClass.TaskVar(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.gingerps.net.proto.TaskVarOuterClass.TaskVar result) {
        if (((bitField0_ & 0x00000002) != 0)) {
          valueList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.valueList_ = valueList_;
      }

      private void buildPartial0(emu.gingerps.net.proto.TaskVarOuterClass.TaskVar result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.key_ = key_;
        }
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
        if (other instanceof emu.gingerps.net.proto.TaskVarOuterClass.TaskVar) {
          return mergeFrom((emu.gingerps.net.proto.TaskVarOuterClass.TaskVar)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.TaskVarOuterClass.TaskVar other) {
        if (other == emu.gingerps.net.proto.TaskVarOuterClass.TaskVar.getDefaultInstance()) return this;
        if (other.getKey() != 0) {
          setKey(other.getKey());
        }
        if (!other.valueList_.isEmpty()) {
          if (valueList_.isEmpty()) {
            valueList_ = other.valueList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureValueListIsMutable();
            valueList_.addAll(other.valueList_);
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
              case 16: {
                key_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 16
              case 56: {
                int v = input.readInt32();
                ensureValueListIsMutable();
                valueList_.addInt(v);
                break;
              } // case 56
              case 58: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureValueListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  valueList_.addInt(input.readInt32());
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

      private int key_ ;
      /**
       * <code>uint32 key = 2;</code>
       * @return The key.
       */
      @java.lang.Override
      public int getKey() {
        return key_;
      }
      /**
       * <code>uint32 key = 2;</code>
       * @param value The key to set.
       * @return This builder for chaining.
       */
      public Builder setKey(int value) {
        
        key_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 key = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearKey() {
        bitField0_ = (bitField0_ & ~0x00000001);
        key_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList valueList_ = emptyIntList();
      private void ensureValueListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          valueList_ = mutableCopy(valueList_);
          bitField0_ |= 0x00000002;
        }
      }
      /**
       * <code>repeated int32 value_list = 7;</code>
       * @return A list containing the valueList.
       */
      public java.util.List<java.lang.Integer>
          getValueListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(valueList_) : valueList_;
      }
      /**
       * <code>repeated int32 value_list = 7;</code>
       * @return The count of valueList.
       */
      public int getValueListCount() {
        return valueList_.size();
      }
      /**
       * <code>repeated int32 value_list = 7;</code>
       * @param index The index of the element to return.
       * @return The valueList at the given index.
       */
      public int getValueList(int index) {
        return valueList_.getInt(index);
      }
      /**
       * <code>repeated int32 value_list = 7;</code>
       * @param index The index to set the value at.
       * @param value The valueList to set.
       * @return This builder for chaining.
       */
      public Builder setValueList(
          int index, int value) {
        
        ensureValueListIsMutable();
        valueList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 value_list = 7;</code>
       * @param value The valueList to add.
       * @return This builder for chaining.
       */
      public Builder addValueList(int value) {
        
        ensureValueListIsMutable();
        valueList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 value_list = 7;</code>
       * @param values The valueList to add.
       * @return This builder for chaining.
       */
      public Builder addAllValueList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureValueListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, valueList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 value_list = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearValueList() {
        valueList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:TaskVar)
    }

    // @@protoc_insertion_point(class_scope:TaskVar)
    private static final emu.gingerps.net.proto.TaskVarOuterClass.TaskVar DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.TaskVarOuterClass.TaskVar();
    }

    public static emu.gingerps.net.proto.TaskVarOuterClass.TaskVar getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TaskVar>
        PARSER = new com.google.protobuf.AbstractParser<TaskVar>() {
      @java.lang.Override
      public TaskVar parsePartialFrom(
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

    public static com.google.protobuf.Parser<TaskVar> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TaskVar> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.TaskVarOuterClass.TaskVar getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TaskVar_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TaskVar_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rTaskVar.proto\"*\n\007TaskVar\022\013\n\003key\030\002 \001(\r\022" +
      "\022\n\nvalue_list\030\007 \003(\005B\030\n\026emu.gingerps.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TaskVar_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TaskVar_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TaskVar_descriptor,
        new java.lang.String[] { "Key", "ValueList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
