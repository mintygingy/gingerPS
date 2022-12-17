// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChessPickCardNotify.proto

package emu.gingerps.net.proto;

public final class ChessPickCardNotifyOuterClass {
  private ChessPickCardNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChessPickCardNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChessPickCardNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ChessNormalCardInfo normal_card_info = 8;</code>
     * @return Whether the normalCardInfo field is set.
     */
    boolean hasNormalCardInfo();
    /**
     * <code>.ChessNormalCardInfo normal_card_info = 8;</code>
     * @return The normalCardInfo.
     */
    emu.gingerps.net.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo getNormalCardInfo();
    /**
     * <code>.ChessNormalCardInfo normal_card_info = 8;</code>
     */
    emu.gingerps.net.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfoOrBuilder getNormalCardInfoOrBuilder();

    /**
     * <code>uint32 curse_card_id = 6;</code>
     * @return The curseCardId.
     */
    int getCurseCardId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 5374;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ChessPickCardNotify}
   */
  public static final class ChessPickCardNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChessPickCardNotify)
      ChessPickCardNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChessPickCardNotify.newBuilder() to construct.
    private ChessPickCardNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChessPickCardNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChessPickCardNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.internal_static_ChessPickCardNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.internal_static_ChessPickCardNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify.class, emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify.Builder.class);
    }

    public static final int NORMAL_CARD_INFO_FIELD_NUMBER = 8;
    private emu.gingerps.net.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo normalCardInfo_;
    /**
     * <code>.ChessNormalCardInfo normal_card_info = 8;</code>
     * @return Whether the normalCardInfo field is set.
     */
    @java.lang.Override
    public boolean hasNormalCardInfo() {
      return normalCardInfo_ != null;
    }
    /**
     * <code>.ChessNormalCardInfo normal_card_info = 8;</code>
     * @return The normalCardInfo.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo getNormalCardInfo() {
      return normalCardInfo_ == null ? emu.gingerps.net.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo.getDefaultInstance() : normalCardInfo_;
    }
    /**
     * <code>.ChessNormalCardInfo normal_card_info = 8;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfoOrBuilder getNormalCardInfoOrBuilder() {
      return normalCardInfo_ == null ? emu.gingerps.net.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo.getDefaultInstance() : normalCardInfo_;
    }

    public static final int CURSE_CARD_ID_FIELD_NUMBER = 6;
    private int curseCardId_ = 0;
    /**
     * <code>uint32 curse_card_id = 6;</code>
     * @return The curseCardId.
     */
    @java.lang.Override
    public int getCurseCardId() {
      return curseCardId_;
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
      if (curseCardId_ != 0) {
        output.writeUInt32(6, curseCardId_);
      }
      if (normalCardInfo_ != null) {
        output.writeMessage(8, getNormalCardInfo());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (curseCardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, curseCardId_);
      }
      if (normalCardInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, getNormalCardInfo());
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
      if (!(obj instanceof emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify other = (emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify) obj;

      if (hasNormalCardInfo() != other.hasNormalCardInfo()) return false;
      if (hasNormalCardInfo()) {
        if (!getNormalCardInfo()
            .equals(other.getNormalCardInfo())) return false;
      }
      if (getCurseCardId()
          != other.getCurseCardId()) return false;
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
      if (hasNormalCardInfo()) {
        hash = (37 * hash) + NORMAL_CARD_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getNormalCardInfo().hashCode();
      }
      hash = (37 * hash) + CURSE_CARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCurseCardId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify prototype) {
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
     *   CMD_ID = 5374;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ChessPickCardNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChessPickCardNotify)
        emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.internal_static_ChessPickCardNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.internal_static_ChessPickCardNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify.class, emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify.newBuilder()
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
        normalCardInfo_ = null;
        if (normalCardInfoBuilder_ != null) {
          normalCardInfoBuilder_.dispose();
          normalCardInfoBuilder_ = null;
        }
        curseCardId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.internal_static_ChessPickCardNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify build() {
        emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify buildPartial() {
        emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify result = new emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.normalCardInfo_ = normalCardInfoBuilder_ == null
              ? normalCardInfo_
              : normalCardInfoBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.curseCardId_ = curseCardId_;
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
        if (other instanceof emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify) {
          return mergeFrom((emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify other) {
        if (other == emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify.getDefaultInstance()) return this;
        if (other.hasNormalCardInfo()) {
          mergeNormalCardInfo(other.getNormalCardInfo());
        }
        if (other.getCurseCardId() != 0) {
          setCurseCardId(other.getCurseCardId());
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
              case 48: {
                curseCardId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 48
              case 66: {
                input.readMessage(
                    getNormalCardInfoFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 66
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

      private emu.gingerps.net.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo normalCardInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo, emu.gingerps.net.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo.Builder, emu.gingerps.net.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfoOrBuilder> normalCardInfoBuilder_;
      /**
       * <code>.ChessNormalCardInfo normal_card_info = 8;</code>
       * @return Whether the normalCardInfo field is set.
       */
      public boolean hasNormalCardInfo() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.ChessNormalCardInfo normal_card_info = 8;</code>
       * @return The normalCardInfo.
       */
      public emu.gingerps.net.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo getNormalCardInfo() {
        if (normalCardInfoBuilder_ == null) {
          return normalCardInfo_ == null ? emu.gingerps.net.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo.getDefaultInstance() : normalCardInfo_;
        } else {
          return normalCardInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.ChessNormalCardInfo normal_card_info = 8;</code>
       */
      public Builder setNormalCardInfo(emu.gingerps.net.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo value) {
        if (normalCardInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          normalCardInfo_ = value;
        } else {
          normalCardInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.ChessNormalCardInfo normal_card_info = 8;</code>
       */
      public Builder setNormalCardInfo(
          emu.gingerps.net.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo.Builder builderForValue) {
        if (normalCardInfoBuilder_ == null) {
          normalCardInfo_ = builderForValue.build();
        } else {
          normalCardInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.ChessNormalCardInfo normal_card_info = 8;</code>
       */
      public Builder mergeNormalCardInfo(emu.gingerps.net.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo value) {
        if (normalCardInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            normalCardInfo_ != null &&
            normalCardInfo_ != emu.gingerps.net.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo.getDefaultInstance()) {
            getNormalCardInfoBuilder().mergeFrom(value);
          } else {
            normalCardInfo_ = value;
          }
        } else {
          normalCardInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.ChessNormalCardInfo normal_card_info = 8;</code>
       */
      public Builder clearNormalCardInfo() {
        bitField0_ = (bitField0_ & ~0x00000001);
        normalCardInfo_ = null;
        if (normalCardInfoBuilder_ != null) {
          normalCardInfoBuilder_.dispose();
          normalCardInfoBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.ChessNormalCardInfo normal_card_info = 8;</code>
       */
      public emu.gingerps.net.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo.Builder getNormalCardInfoBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getNormalCardInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.ChessNormalCardInfo normal_card_info = 8;</code>
       */
      public emu.gingerps.net.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfoOrBuilder getNormalCardInfoOrBuilder() {
        if (normalCardInfoBuilder_ != null) {
          return normalCardInfoBuilder_.getMessageOrBuilder();
        } else {
          return normalCardInfo_ == null ?
              emu.gingerps.net.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo.getDefaultInstance() : normalCardInfo_;
        }
      }
      /**
       * <code>.ChessNormalCardInfo normal_card_info = 8;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo, emu.gingerps.net.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo.Builder, emu.gingerps.net.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfoOrBuilder> 
          getNormalCardInfoFieldBuilder() {
        if (normalCardInfoBuilder_ == null) {
          normalCardInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo, emu.gingerps.net.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo.Builder, emu.gingerps.net.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfoOrBuilder>(
                  getNormalCardInfo(),
                  getParentForChildren(),
                  isClean());
          normalCardInfo_ = null;
        }
        return normalCardInfoBuilder_;
      }

      private int curseCardId_ ;
      /**
       * <code>uint32 curse_card_id = 6;</code>
       * @return The curseCardId.
       */
      @java.lang.Override
      public int getCurseCardId() {
        return curseCardId_;
      }
      /**
       * <code>uint32 curse_card_id = 6;</code>
       * @param value The curseCardId to set.
       * @return This builder for chaining.
       */
      public Builder setCurseCardId(int value) {
        
        curseCardId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 curse_card_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurseCardId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        curseCardId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ChessPickCardNotify)
    }

    // @@protoc_insertion_point(class_scope:ChessPickCardNotify)
    private static final emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify();
    }

    public static emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChessPickCardNotify>
        PARSER = new com.google.protobuf.AbstractParser<ChessPickCardNotify>() {
      @java.lang.Override
      public ChessPickCardNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<ChessPickCardNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChessPickCardNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.ChessPickCardNotifyOuterClass.ChessPickCardNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChessPickCardNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChessPickCardNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031ChessPickCardNotify.proto\032\031ChessNormal" +
      "CardInfo.proto\"\\\n\023ChessPickCardNotify\022.\n" +
      "\020normal_card_info\030\010 \001(\0132\024.ChessNormalCar" +
      "dInfo\022\025\n\rcurse_card_id\030\006 \001(\rB\030\n\026emu.ging" +
      "erps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.ChessNormalCardInfoOuterClass.getDescriptor(),
        });
    internal_static_ChessPickCardNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChessPickCardNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChessPickCardNotify_descriptor,
        new java.lang.String[] { "NormalCardInfo", "CurseCardId", });
    emu.gingerps.net.proto.ChessNormalCardInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
