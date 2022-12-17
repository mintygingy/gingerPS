// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CookDataNotify.proto

package emu.gingerps.net.proto;

public final class CookDataNotifyOuterClass {
  private CookDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CookDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CookDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
     */
    java.util.List<emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeData> 
        getRecipeDataListList();
    /**
     * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
     */
    emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeData getRecipeDataList(int index);
    /**
     * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
     */
    int getRecipeDataListCount();
    /**
     * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
     */
    java.util.List<? extends emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeDataOrBuilder> 
        getRecipeDataListOrBuilderList();
    /**
     * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
     */
    emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeDataOrBuilder getRecipeDataListOrBuilder(
        int index);

    /**
     * <code>uint32 grade = 9;</code>
     * @return The grade.
     */
    int getGrade();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 133;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code CookDataNotify}
   */
  public static final class CookDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CookDataNotify)
      CookDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CookDataNotify.newBuilder() to construct.
    private CookDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CookDataNotify() {
      recipeDataList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CookDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.CookDataNotifyOuterClass.internal_static_CookDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.CookDataNotifyOuterClass.internal_static_CookDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify.class, emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify.Builder.class);
    }

    public static final int RECIPE_DATA_LIST_FIELD_NUMBER = 15;
    @SuppressWarnings("serial")
    private java.util.List<emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeData> recipeDataList_;
    /**
     * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeData> getRecipeDataListList() {
      return recipeDataList_;
    }
    /**
     * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeDataOrBuilder> 
        getRecipeDataListOrBuilderList() {
      return recipeDataList_;
    }
    /**
     * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
     */
    @java.lang.Override
    public int getRecipeDataListCount() {
      return recipeDataList_.size();
    }
    /**
     * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeData getRecipeDataList(int index) {
      return recipeDataList_.get(index);
    }
    /**
     * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeDataOrBuilder getRecipeDataListOrBuilder(
        int index) {
      return recipeDataList_.get(index);
    }

    public static final int GRADE_FIELD_NUMBER = 9;
    private int grade_ = 0;
    /**
     * <code>uint32 grade = 9;</code>
     * @return The grade.
     */
    @java.lang.Override
    public int getGrade() {
      return grade_;
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
      if (grade_ != 0) {
        output.writeUInt32(9, grade_);
      }
      for (int i = 0; i < recipeDataList_.size(); i++) {
        output.writeMessage(15, recipeDataList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (grade_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, grade_);
      }
      for (int i = 0; i < recipeDataList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, recipeDataList_.get(i));
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
      if (!(obj instanceof emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify other = (emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify) obj;

      if (!getRecipeDataListList()
          .equals(other.getRecipeDataListList())) return false;
      if (getGrade()
          != other.getGrade()) return false;
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
      if (getRecipeDataListCount() > 0) {
        hash = (37 * hash) + RECIPE_DATA_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getRecipeDataListList().hashCode();
      }
      hash = (37 * hash) + GRADE_FIELD_NUMBER;
      hash = (53 * hash) + getGrade();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify prototype) {
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
     *   CMD_ID = 133;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code CookDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CookDataNotify)
        emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.CookDataNotifyOuterClass.internal_static_CookDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.CookDataNotifyOuterClass.internal_static_CookDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify.class, emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify.newBuilder()
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
        if (recipeDataListBuilder_ == null) {
          recipeDataList_ = java.util.Collections.emptyList();
        } else {
          recipeDataList_ = null;
          recipeDataListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        grade_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.CookDataNotifyOuterClass.internal_static_CookDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify build() {
        emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify buildPartial() {
        emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify result = new emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify result) {
        if (recipeDataListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            recipeDataList_ = java.util.Collections.unmodifiableList(recipeDataList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.recipeDataList_ = recipeDataList_;
        } else {
          result.recipeDataList_ = recipeDataListBuilder_.build();
        }
      }

      private void buildPartial0(emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.grade_ = grade_;
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
        if (other instanceof emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify) {
          return mergeFrom((emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify other) {
        if (other == emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify.getDefaultInstance()) return this;
        if (recipeDataListBuilder_ == null) {
          if (!other.recipeDataList_.isEmpty()) {
            if (recipeDataList_.isEmpty()) {
              recipeDataList_ = other.recipeDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureRecipeDataListIsMutable();
              recipeDataList_.addAll(other.recipeDataList_);
            }
            onChanged();
          }
        } else {
          if (!other.recipeDataList_.isEmpty()) {
            if (recipeDataListBuilder_.isEmpty()) {
              recipeDataListBuilder_.dispose();
              recipeDataListBuilder_ = null;
              recipeDataList_ = other.recipeDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              recipeDataListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getRecipeDataListFieldBuilder() : null;
            } else {
              recipeDataListBuilder_.addAllMessages(other.recipeDataList_);
            }
          }
        }
        if (other.getGrade() != 0) {
          setGrade(other.getGrade());
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
              case 72: {
                grade_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 72
              case 122: {
                emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeData m =
                    input.readMessage(
                        emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeData.parser(),
                        extensionRegistry);
                if (recipeDataListBuilder_ == null) {
                  ensureRecipeDataListIsMutable();
                  recipeDataList_.add(m);
                } else {
                  recipeDataListBuilder_.addMessage(m);
                }
                break;
              } // case 122
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

      private java.util.List<emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeData> recipeDataList_ =
        java.util.Collections.emptyList();
      private void ensureRecipeDataListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          recipeDataList_ = new java.util.ArrayList<emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeData>(recipeDataList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeData, emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeData.Builder, emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeDataOrBuilder> recipeDataListBuilder_;

      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public java.util.List<emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeData> getRecipeDataListList() {
        if (recipeDataListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(recipeDataList_);
        } else {
          return recipeDataListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public int getRecipeDataListCount() {
        if (recipeDataListBuilder_ == null) {
          return recipeDataList_.size();
        } else {
          return recipeDataListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeData getRecipeDataList(int index) {
        if (recipeDataListBuilder_ == null) {
          return recipeDataList_.get(index);
        } else {
          return recipeDataListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public Builder setRecipeDataList(
          int index, emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeData value) {
        if (recipeDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecipeDataListIsMutable();
          recipeDataList_.set(index, value);
          onChanged();
        } else {
          recipeDataListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public Builder setRecipeDataList(
          int index, emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeData.Builder builderForValue) {
        if (recipeDataListBuilder_ == null) {
          ensureRecipeDataListIsMutable();
          recipeDataList_.set(index, builderForValue.build());
          onChanged();
        } else {
          recipeDataListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public Builder addRecipeDataList(emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeData value) {
        if (recipeDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecipeDataListIsMutable();
          recipeDataList_.add(value);
          onChanged();
        } else {
          recipeDataListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public Builder addRecipeDataList(
          int index, emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeData value) {
        if (recipeDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecipeDataListIsMutable();
          recipeDataList_.add(index, value);
          onChanged();
        } else {
          recipeDataListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public Builder addRecipeDataList(
          emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeData.Builder builderForValue) {
        if (recipeDataListBuilder_ == null) {
          ensureRecipeDataListIsMutable();
          recipeDataList_.add(builderForValue.build());
          onChanged();
        } else {
          recipeDataListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public Builder addRecipeDataList(
          int index, emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeData.Builder builderForValue) {
        if (recipeDataListBuilder_ == null) {
          ensureRecipeDataListIsMutable();
          recipeDataList_.add(index, builderForValue.build());
          onChanged();
        } else {
          recipeDataListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public Builder addAllRecipeDataList(
          java.lang.Iterable<? extends emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeData> values) {
        if (recipeDataListBuilder_ == null) {
          ensureRecipeDataListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, recipeDataList_);
          onChanged();
        } else {
          recipeDataListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public Builder clearRecipeDataList() {
        if (recipeDataListBuilder_ == null) {
          recipeDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          recipeDataListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public Builder removeRecipeDataList(int index) {
        if (recipeDataListBuilder_ == null) {
          ensureRecipeDataListIsMutable();
          recipeDataList_.remove(index);
          onChanged();
        } else {
          recipeDataListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeData.Builder getRecipeDataListBuilder(
          int index) {
        return getRecipeDataListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeDataOrBuilder getRecipeDataListOrBuilder(
          int index) {
        if (recipeDataListBuilder_ == null) {
          return recipeDataList_.get(index);  } else {
          return recipeDataListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public java.util.List<? extends emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeDataOrBuilder> 
           getRecipeDataListOrBuilderList() {
        if (recipeDataListBuilder_ != null) {
          return recipeDataListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(recipeDataList_);
        }
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeData.Builder addRecipeDataListBuilder() {
        return getRecipeDataListFieldBuilder().addBuilder(
            emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeData.getDefaultInstance());
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeData.Builder addRecipeDataListBuilder(
          int index) {
        return getRecipeDataListFieldBuilder().addBuilder(
            index, emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeData.getDefaultInstance());
      }
      /**
       * <code>repeated .CookRecipeData recipe_data_list = 15;</code>
       */
      public java.util.List<emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeData.Builder> 
           getRecipeDataListBuilderList() {
        return getRecipeDataListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeData, emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeData.Builder, emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeDataOrBuilder> 
          getRecipeDataListFieldBuilder() {
        if (recipeDataListBuilder_ == null) {
          recipeDataListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeData, emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeData.Builder, emu.gingerps.net.proto.CookRecipeDataOuterClass.CookRecipeDataOrBuilder>(
                  recipeDataList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          recipeDataList_ = null;
        }
        return recipeDataListBuilder_;
      }

      private int grade_ ;
      /**
       * <code>uint32 grade = 9;</code>
       * @return The grade.
       */
      @java.lang.Override
      public int getGrade() {
        return grade_;
      }
      /**
       * <code>uint32 grade = 9;</code>
       * @param value The grade to set.
       * @return This builder for chaining.
       */
      public Builder setGrade(int value) {
        
        grade_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 grade = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearGrade() {
        bitField0_ = (bitField0_ & ~0x00000002);
        grade_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CookDataNotify)
    }

    // @@protoc_insertion_point(class_scope:CookDataNotify)
    private static final emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify();
    }

    public static emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CookDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<CookDataNotify>() {
      @java.lang.Override
      public CookDataNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<CookDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CookDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.CookDataNotifyOuterClass.CookDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CookDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CookDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024CookDataNotify.proto\032\024CookRecipeData.p" +
      "roto\"J\n\016CookDataNotify\022)\n\020recipe_data_li" +
      "st\030\017 \003(\0132\017.CookRecipeData\022\r\n\005grade\030\t \001(\r" +
      "B\030\n\026emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.CookRecipeDataOuterClass.getDescriptor(),
        });
    internal_static_CookDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CookDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CookDataNotify_descriptor,
        new java.lang.String[] { "RecipeDataList", "Grade", });
    emu.gingerps.net.proto.CookRecipeDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
