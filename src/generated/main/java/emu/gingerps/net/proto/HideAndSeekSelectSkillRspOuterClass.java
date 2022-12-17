// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HideAndSeekSelectSkillRsp.proto

package emu.gingerps.net.proto;

public final class HideAndSeekSelectSkillRspOuterClass {
  private HideAndSeekSelectSkillRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HideAndSeekSelectSkillRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HideAndSeekSelectSkillRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated uint32 skill_list = 4;</code>
     * @return A list containing the skillList.
     */
    java.util.List<java.lang.Integer> getSkillListList();
    /**
     * <code>repeated uint32 skill_list = 4;</code>
     * @return The count of skillList.
     */
    int getSkillListCount();
    /**
     * <code>repeated uint32 skill_list = 4;</code>
     * @param index The index of the element to return.
     * @return The skillList at the given index.
     */
    int getSkillList(int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8841;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code HideAndSeekSelectSkillRsp}
   */
  public static final class HideAndSeekSelectSkillRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HideAndSeekSelectSkillRsp)
      HideAndSeekSelectSkillRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HideAndSeekSelectSkillRsp.newBuilder() to construct.
    private HideAndSeekSelectSkillRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HideAndSeekSelectSkillRsp() {
      skillList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HideAndSeekSelectSkillRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.internal_static_HideAndSeekSelectSkillRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.internal_static_HideAndSeekSelectSkillRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp.class, emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 1;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int SKILL_LIST_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList skillList_;
    /**
     * <code>repeated uint32 skill_list = 4;</code>
     * @return A list containing the skillList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getSkillListList() {
      return skillList_;
    }
    /**
     * <code>repeated uint32 skill_list = 4;</code>
     * @return The count of skillList.
     */
    public int getSkillListCount() {
      return skillList_.size();
    }
    /**
     * <code>repeated uint32 skill_list = 4;</code>
     * @param index The index of the element to return.
     * @return The skillList at the given index.
     */
    public int getSkillList(int index) {
      return skillList_.getInt(index);
    }
    private int skillListMemoizedSerializedSize = -1;

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
      if (retcode_ != 0) {
        output.writeInt32(1, retcode_);
      }
      if (getSkillListList().size() > 0) {
        output.writeUInt32NoTag(34);
        output.writeUInt32NoTag(skillListMemoizedSerializedSize);
      }
      for (int i = 0; i < skillList_.size(); i++) {
        output.writeUInt32NoTag(skillList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, retcode_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < skillList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(skillList_.getInt(i));
        }
        size += dataSize;
        if (!getSkillListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        skillListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp other = (emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getSkillListList()
          .equals(other.getSkillListList())) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (getSkillListCount() > 0) {
        hash = (37 * hash) + SKILL_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSkillListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp prototype) {
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
     *   CMD_ID = 8841;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code HideAndSeekSelectSkillRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HideAndSeekSelectSkillRsp)
        emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.internal_static_HideAndSeekSelectSkillRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.internal_static_HideAndSeekSelectSkillRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp.class, emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp.newBuilder()
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
        retcode_ = 0;
        skillList_ = emptyIntList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.internal_static_HideAndSeekSelectSkillRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp build() {
        emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp buildPartial() {
        emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp result = new emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp result) {
        if (((bitField0_ & 0x00000002) != 0)) {
          skillList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.skillList_ = skillList_;
      }

      private void buildPartial0(emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.retcode_ = retcode_;
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
        if (other instanceof emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp) {
          return mergeFrom((emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp other) {
        if (other == emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (!other.skillList_.isEmpty()) {
          if (skillList_.isEmpty()) {
            skillList_ = other.skillList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureSkillListIsMutable();
            skillList_.addAll(other.skillList_);
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
              case 8: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 32: {
                int v = input.readUInt32();
                ensureSkillListIsMutable();
                skillList_.addInt(v);
                break;
              } // case 32
              case 34: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureSkillListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  skillList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 34
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 1;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList skillList_ = emptyIntList();
      private void ensureSkillListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          skillList_ = mutableCopy(skillList_);
          bitField0_ |= 0x00000002;
        }
      }
      /**
       * <code>repeated uint32 skill_list = 4;</code>
       * @return A list containing the skillList.
       */
      public java.util.List<java.lang.Integer>
          getSkillListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(skillList_) : skillList_;
      }
      /**
       * <code>repeated uint32 skill_list = 4;</code>
       * @return The count of skillList.
       */
      public int getSkillListCount() {
        return skillList_.size();
      }
      /**
       * <code>repeated uint32 skill_list = 4;</code>
       * @param index The index of the element to return.
       * @return The skillList at the given index.
       */
      public int getSkillList(int index) {
        return skillList_.getInt(index);
      }
      /**
       * <code>repeated uint32 skill_list = 4;</code>
       * @param index The index to set the value at.
       * @param value The skillList to set.
       * @return This builder for chaining.
       */
      public Builder setSkillList(
          int index, int value) {
        
        ensureSkillListIsMutable();
        skillList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 skill_list = 4;</code>
       * @param value The skillList to add.
       * @return This builder for chaining.
       */
      public Builder addSkillList(int value) {
        
        ensureSkillListIsMutable();
        skillList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 skill_list = 4;</code>
       * @param values The skillList to add.
       * @return This builder for chaining.
       */
      public Builder addAllSkillList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureSkillListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, skillList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 skill_list = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillList() {
        skillList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:HideAndSeekSelectSkillRsp)
    }

    // @@protoc_insertion_point(class_scope:HideAndSeekSelectSkillRsp)
    private static final emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp();
    }

    public static emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HideAndSeekSelectSkillRsp>
        PARSER = new com.google.protobuf.AbstractParser<HideAndSeekSelectSkillRsp>() {
      @java.lang.Override
      public HideAndSeekSelectSkillRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<HideAndSeekSelectSkillRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HideAndSeekSelectSkillRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HideAndSeekSelectSkillRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HideAndSeekSelectSkillRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037HideAndSeekSelectSkillRsp.proto\"@\n\031Hid" +
      "eAndSeekSelectSkillRsp\022\017\n\007retcode\030\001 \001(\005\022" +
      "\022\n\nskill_list\030\004 \003(\rB\030\n\026emu.gingerps.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HideAndSeekSelectSkillRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HideAndSeekSelectSkillRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HideAndSeekSelectSkillRsp_descriptor,
        new java.lang.String[] { "Retcode", "SkillList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
