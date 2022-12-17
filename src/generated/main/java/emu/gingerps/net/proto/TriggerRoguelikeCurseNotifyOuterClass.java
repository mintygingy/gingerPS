// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TriggerRoguelikeCurseNotify.proto

package emu.gingerps.net.proto;

public final class TriggerRoguelikeCurseNotifyOuterClass {
  private TriggerRoguelikeCurseNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TriggerRoguelikeCurseNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TriggerRoguelikeCurseNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3300_POLIENBCNLF = 7;</code>
     * @return The unk3300POLIENBCNLF.
     */
    int getUnk3300POLIENBCNLF();

    /**
     * <code>uint32 Unk3300_LJHJIBDPBBC = 10;</code>
     * @return The unk3300LJHJIBDPBBC.
     */
    int getUnk3300LJHJIBDPBBC();

    /**
     * <code>bool is_trigger_curse = 11;</code>
     * @return The isTriggerCurse.
     */
    boolean getIsTriggerCurse();

    /**
     * <code>repeated uint32 effect_param_list = 9;</code>
     * @return A list containing the effectParamList.
     */
    java.util.List<java.lang.Integer> getEffectParamListList();
    /**
     * <code>repeated uint32 effect_param_list = 9;</code>
     * @return The count of effectParamList.
     */
    int getEffectParamListCount();
    /**
     * <code>repeated uint32 effect_param_list = 9;</code>
     * @param index The index of the element to return.
     * @return The effectParamList at the given index.
     */
    int getEffectParamList(int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8965;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code TriggerRoguelikeCurseNotify}
   */
  public static final class TriggerRoguelikeCurseNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TriggerRoguelikeCurseNotify)
      TriggerRoguelikeCurseNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TriggerRoguelikeCurseNotify.newBuilder() to construct.
    private TriggerRoguelikeCurseNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TriggerRoguelikeCurseNotify() {
      effectParamList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TriggerRoguelikeCurseNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TriggerRoguelikeCurseNotify(
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

              unk3300POLIENBCNLF_ = input.readUInt32();
              break;
            }
            case 72: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                effectParamList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              effectParamList_.addInt(input.readUInt32());
              break;
            }
            case 74: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                effectParamList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                effectParamList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 80: {

              unk3300LJHJIBDPBBC_ = input.readUInt32();
              break;
            }
            case 88: {

              isTriggerCurse_ = input.readBool();
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
          effectParamList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.internal_static_TriggerRoguelikeCurseNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.internal_static_TriggerRoguelikeCurseNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify.class, emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify.Builder.class);
    }

    public static final int UNK3300_POLIENBCNLF_FIELD_NUMBER = 7;
    private int unk3300POLIENBCNLF_;
    /**
     * <code>uint32 Unk3300_POLIENBCNLF = 7;</code>
     * @return The unk3300POLIENBCNLF.
     */
    @java.lang.Override
    public int getUnk3300POLIENBCNLF() {
      return unk3300POLIENBCNLF_;
    }

    public static final int UNK3300_LJHJIBDPBBC_FIELD_NUMBER = 10;
    private int unk3300LJHJIBDPBBC_;
    /**
     * <code>uint32 Unk3300_LJHJIBDPBBC = 10;</code>
     * @return The unk3300LJHJIBDPBBC.
     */
    @java.lang.Override
    public int getUnk3300LJHJIBDPBBC() {
      return unk3300LJHJIBDPBBC_;
    }

    public static final int IS_TRIGGER_CURSE_FIELD_NUMBER = 11;
    private boolean isTriggerCurse_;
    /**
     * <code>bool is_trigger_curse = 11;</code>
     * @return The isTriggerCurse.
     */
    @java.lang.Override
    public boolean getIsTriggerCurse() {
      return isTriggerCurse_;
    }

    public static final int EFFECT_PARAM_LIST_FIELD_NUMBER = 9;
    private com.google.protobuf.Internal.IntList effectParamList_;
    /**
     * <code>repeated uint32 effect_param_list = 9;</code>
     * @return A list containing the effectParamList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getEffectParamListList() {
      return effectParamList_;
    }
    /**
     * <code>repeated uint32 effect_param_list = 9;</code>
     * @return The count of effectParamList.
     */
    public int getEffectParamListCount() {
      return effectParamList_.size();
    }
    /**
     * <code>repeated uint32 effect_param_list = 9;</code>
     * @param index The index of the element to return.
     * @return The effectParamList at the given index.
     */
    public int getEffectParamList(int index) {
      return effectParamList_.getInt(index);
    }
    private int effectParamListMemoizedSerializedSize = -1;

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
      if (unk3300POLIENBCNLF_ != 0) {
        output.writeUInt32(7, unk3300POLIENBCNLF_);
      }
      if (getEffectParamListList().size() > 0) {
        output.writeUInt32NoTag(74);
        output.writeUInt32NoTag(effectParamListMemoizedSerializedSize);
      }
      for (int i = 0; i < effectParamList_.size(); i++) {
        output.writeUInt32NoTag(effectParamList_.getInt(i));
      }
      if (unk3300LJHJIBDPBBC_ != 0) {
        output.writeUInt32(10, unk3300LJHJIBDPBBC_);
      }
      if (isTriggerCurse_ != false) {
        output.writeBool(11, isTriggerCurse_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300POLIENBCNLF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, unk3300POLIENBCNLF_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < effectParamList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(effectParamList_.getInt(i));
        }
        size += dataSize;
        if (!getEffectParamListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        effectParamListMemoizedSerializedSize = dataSize;
      }
      if (unk3300LJHJIBDPBBC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, unk3300LJHJIBDPBBC_);
      }
      if (isTriggerCurse_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, isTriggerCurse_);
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
      if (!(obj instanceof emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify other = (emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify) obj;

      if (getUnk3300POLIENBCNLF()
          != other.getUnk3300POLIENBCNLF()) return false;
      if (getUnk3300LJHJIBDPBBC()
          != other.getUnk3300LJHJIBDPBBC()) return false;
      if (getIsTriggerCurse()
          != other.getIsTriggerCurse()) return false;
      if (!getEffectParamListList()
          .equals(other.getEffectParamListList())) return false;
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
      hash = (37 * hash) + UNK3300_POLIENBCNLF_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300POLIENBCNLF();
      hash = (37 * hash) + UNK3300_LJHJIBDPBBC_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300LJHJIBDPBBC();
      hash = (37 * hash) + IS_TRIGGER_CURSE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsTriggerCurse());
      if (getEffectParamListCount() > 0) {
        hash = (37 * hash) + EFFECT_PARAM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getEffectParamListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify prototype) {
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
     *   CMD_ID = 8965;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code TriggerRoguelikeCurseNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TriggerRoguelikeCurseNotify)
        emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.internal_static_TriggerRoguelikeCurseNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.internal_static_TriggerRoguelikeCurseNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify.class, emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify.newBuilder()
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
        unk3300POLIENBCNLF_ = 0;

        unk3300LJHJIBDPBBC_ = 0;

        isTriggerCurse_ = false;

        effectParamList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.internal_static_TriggerRoguelikeCurseNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify build() {
        emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify buildPartial() {
        emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify result = new emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify(this);
        int from_bitField0_ = bitField0_;
        result.unk3300POLIENBCNLF_ = unk3300POLIENBCNLF_;
        result.unk3300LJHJIBDPBBC_ = unk3300LJHJIBDPBBC_;
        result.isTriggerCurse_ = isTriggerCurse_;
        if (((bitField0_ & 0x00000001) != 0)) {
          effectParamList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.effectParamList_ = effectParamList_;
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
        if (other instanceof emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify) {
          return mergeFrom((emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify other) {
        if (other == emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify.getDefaultInstance()) return this;
        if (other.getUnk3300POLIENBCNLF() != 0) {
          setUnk3300POLIENBCNLF(other.getUnk3300POLIENBCNLF());
        }
        if (other.getUnk3300LJHJIBDPBBC() != 0) {
          setUnk3300LJHJIBDPBBC(other.getUnk3300LJHJIBDPBBC());
        }
        if (other.getIsTriggerCurse() != false) {
          setIsTriggerCurse(other.getIsTriggerCurse());
        }
        if (!other.effectParamList_.isEmpty()) {
          if (effectParamList_.isEmpty()) {
            effectParamList_ = other.effectParamList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEffectParamListIsMutable();
            effectParamList_.addAll(other.effectParamList_);
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
        emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int unk3300POLIENBCNLF_ ;
      /**
       * <code>uint32 Unk3300_POLIENBCNLF = 7;</code>
       * @return The unk3300POLIENBCNLF.
       */
      @java.lang.Override
      public int getUnk3300POLIENBCNLF() {
        return unk3300POLIENBCNLF_;
      }
      /**
       * <code>uint32 Unk3300_POLIENBCNLF = 7;</code>
       * @param value The unk3300POLIENBCNLF to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300POLIENBCNLF(int value) {
        
        unk3300POLIENBCNLF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_POLIENBCNLF = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300POLIENBCNLF() {
        
        unk3300POLIENBCNLF_ = 0;
        onChanged();
        return this;
      }

      private int unk3300LJHJIBDPBBC_ ;
      /**
       * <code>uint32 Unk3300_LJHJIBDPBBC = 10;</code>
       * @return The unk3300LJHJIBDPBBC.
       */
      @java.lang.Override
      public int getUnk3300LJHJIBDPBBC() {
        return unk3300LJHJIBDPBBC_;
      }
      /**
       * <code>uint32 Unk3300_LJHJIBDPBBC = 10;</code>
       * @param value The unk3300LJHJIBDPBBC to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300LJHJIBDPBBC(int value) {
        
        unk3300LJHJIBDPBBC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_LJHJIBDPBBC = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300LJHJIBDPBBC() {
        
        unk3300LJHJIBDPBBC_ = 0;
        onChanged();
        return this;
      }

      private boolean isTriggerCurse_ ;
      /**
       * <code>bool is_trigger_curse = 11;</code>
       * @return The isTriggerCurse.
       */
      @java.lang.Override
      public boolean getIsTriggerCurse() {
        return isTriggerCurse_;
      }
      /**
       * <code>bool is_trigger_curse = 11;</code>
       * @param value The isTriggerCurse to set.
       * @return This builder for chaining.
       */
      public Builder setIsTriggerCurse(boolean value) {
        
        isTriggerCurse_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_trigger_curse = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsTriggerCurse() {
        
        isTriggerCurse_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList effectParamList_ = emptyIntList();
      private void ensureEffectParamListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          effectParamList_ = mutableCopy(effectParamList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 effect_param_list = 9;</code>
       * @return A list containing the effectParamList.
       */
      public java.util.List<java.lang.Integer>
          getEffectParamListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(effectParamList_) : effectParamList_;
      }
      /**
       * <code>repeated uint32 effect_param_list = 9;</code>
       * @return The count of effectParamList.
       */
      public int getEffectParamListCount() {
        return effectParamList_.size();
      }
      /**
       * <code>repeated uint32 effect_param_list = 9;</code>
       * @param index The index of the element to return.
       * @return The effectParamList at the given index.
       */
      public int getEffectParamList(int index) {
        return effectParamList_.getInt(index);
      }
      /**
       * <code>repeated uint32 effect_param_list = 9;</code>
       * @param index The index to set the value at.
       * @param value The effectParamList to set.
       * @return This builder for chaining.
       */
      public Builder setEffectParamList(
          int index, int value) {
        ensureEffectParamListIsMutable();
        effectParamList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 effect_param_list = 9;</code>
       * @param value The effectParamList to add.
       * @return This builder for chaining.
       */
      public Builder addEffectParamList(int value) {
        ensureEffectParamListIsMutable();
        effectParamList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 effect_param_list = 9;</code>
       * @param values The effectParamList to add.
       * @return This builder for chaining.
       */
      public Builder addAllEffectParamList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureEffectParamListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, effectParamList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 effect_param_list = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearEffectParamList() {
        effectParamList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:TriggerRoguelikeCurseNotify)
    }

    // @@protoc_insertion_point(class_scope:TriggerRoguelikeCurseNotify)
    private static final emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify();
    }

    public static emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TriggerRoguelikeCurseNotify>
        PARSER = new com.google.protobuf.AbstractParser<TriggerRoguelikeCurseNotify>() {
      @java.lang.Override
      public TriggerRoguelikeCurseNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TriggerRoguelikeCurseNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TriggerRoguelikeCurseNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TriggerRoguelikeCurseNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TriggerRoguelikeCurseNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TriggerRoguelikeCurseNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!TriggerRoguelikeCurseNotify.proto\"\214\001\n\033" +
      "TriggerRoguelikeCurseNotify\022\033\n\023Unk3300_P" +
      "OLIENBCNLF\030\007 \001(\r\022\033\n\023Unk3300_LJHJIBDPBBC\030" +
      "\n \001(\r\022\030\n\020is_trigger_curse\030\013 \001(\010\022\031\n\021effec" +
      "t_param_list\030\t \003(\rB\030\n\026emu.gingerps.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TriggerRoguelikeCurseNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TriggerRoguelikeCurseNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TriggerRoguelikeCurseNotify_descriptor,
        new java.lang.String[] { "Unk3300POLIENBCNLF", "Unk3300LJHJIBDPBBC", "IsTriggerCurse", "EffectParamList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
