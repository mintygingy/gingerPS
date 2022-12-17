// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChannelerSlabTakeoffBuffRsp.proto

package emu.gingerps.net.proto;

public final class ChannelerSlabTakeoffBuffRspOuterClass {
  private ChannelerSlabTakeoffBuffRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChannelerSlabTakeoffBuffRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChannelerSlabTakeoffBuffRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 slot_id = 2;</code>
     * @return The slotId.
     */
    int getSlotId();

    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 buff_id = 12;</code>
     * @return The buffId.
     */
    int getBuffId();

    /**
     * <code>bool is_mp = 10;</code>
     * @return The isMp.
     */
    boolean getIsMp();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8034;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ChannelerSlabTakeoffBuffRsp}
   */
  public static final class ChannelerSlabTakeoffBuffRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChannelerSlabTakeoffBuffRsp)
      ChannelerSlabTakeoffBuffRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChannelerSlabTakeoffBuffRsp.newBuilder() to construct.
    private ChannelerSlabTakeoffBuffRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChannelerSlabTakeoffBuffRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChannelerSlabTakeoffBuffRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChannelerSlabTakeoffBuffRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 16: {

              slotId_ = input.readUInt32();
              break;
            }
            case 64: {

              retcode_ = input.readInt32();
              break;
            }
            case 80: {

              isMp_ = input.readBool();
              break;
            }
            case 96: {

              buffId_ = input.readUInt32();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.internal_static_ChannelerSlabTakeoffBuffRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.internal_static_ChannelerSlabTakeoffBuffRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp.class, emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp.Builder.class);
    }

    public static final int SLOT_ID_FIELD_NUMBER = 2;
    private int slotId_;
    /**
     * <code>uint32 slot_id = 2;</code>
     * @return The slotId.
     */
    @java.lang.Override
    public int getSlotId() {
      return slotId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 8;
    private int retcode_;
    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int BUFF_ID_FIELD_NUMBER = 12;
    private int buffId_;
    /**
     * <code>uint32 buff_id = 12;</code>
     * @return The buffId.
     */
    @java.lang.Override
    public int getBuffId() {
      return buffId_;
    }

    public static final int IS_MP_FIELD_NUMBER = 10;
    private boolean isMp_;
    /**
     * <code>bool is_mp = 10;</code>
     * @return The isMp.
     */
    @java.lang.Override
    public boolean getIsMp() {
      return isMp_;
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
      if (slotId_ != 0) {
        output.writeUInt32(2, slotId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(8, retcode_);
      }
      if (isMp_ != false) {
        output.writeBool(10, isMp_);
      }
      if (buffId_ != 0) {
        output.writeUInt32(12, buffId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (slotId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, slotId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, retcode_);
      }
      if (isMp_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isMp_);
      }
      if (buffId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, buffId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp other = (emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp) obj;

      if (getSlotId()
          != other.getSlotId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getBuffId()
          != other.getBuffId()) return false;
      if (getIsMp()
          != other.getIsMp()) return false;
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
      hash = (37 * hash) + SLOT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSlotId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + BUFF_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBuffId();
      hash = (37 * hash) + IS_MP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsMp());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp prototype) {
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
     *   CMD_ID = 8034;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ChannelerSlabTakeoffBuffRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChannelerSlabTakeoffBuffRsp)
        emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.internal_static_ChannelerSlabTakeoffBuffRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.internal_static_ChannelerSlabTakeoffBuffRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp.class, emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp.newBuilder()
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
        slotId_ = 0;

        retcode_ = 0;

        buffId_ = 0;

        isMp_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.internal_static_ChannelerSlabTakeoffBuffRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp build() {
        emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp buildPartial() {
        emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp result = new emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp(this);
        result.slotId_ = slotId_;
        result.retcode_ = retcode_;
        result.buffId_ = buffId_;
        result.isMp_ = isMp_;
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
        if (other instanceof emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp) {
          return mergeFrom((emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp other) {
        if (other == emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp.getDefaultInstance()) return this;
        if (other.getSlotId() != 0) {
          setSlotId(other.getSlotId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getBuffId() != 0) {
          setBuffId(other.getBuffId());
        }
        if (other.getIsMp() != false) {
          setIsMp(other.getIsMp());
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
        emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int slotId_ ;
      /**
       * <code>uint32 slot_id = 2;</code>
       * @return The slotId.
       */
      @java.lang.Override
      public int getSlotId() {
        return slotId_;
      }
      /**
       * <code>uint32 slot_id = 2;</code>
       * @param value The slotId to set.
       * @return This builder for chaining.
       */
      public Builder setSlotId(int value) {
        
        slotId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 slot_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearSlotId() {
        
        slotId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 8;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int buffId_ ;
      /**
       * <code>uint32 buff_id = 12;</code>
       * @return The buffId.
       */
      @java.lang.Override
      public int getBuffId() {
        return buffId_;
      }
      /**
       * <code>uint32 buff_id = 12;</code>
       * @param value The buffId to set.
       * @return This builder for chaining.
       */
      public Builder setBuffId(int value) {
        
        buffId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 buff_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearBuffId() {
        
        buffId_ = 0;
        onChanged();
        return this;
      }

      private boolean isMp_ ;
      /**
       * <code>bool is_mp = 10;</code>
       * @return The isMp.
       */
      @java.lang.Override
      public boolean getIsMp() {
        return isMp_;
      }
      /**
       * <code>bool is_mp = 10;</code>
       * @param value The isMp to set.
       * @return This builder for chaining.
       */
      public Builder setIsMp(boolean value) {
        
        isMp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_mp = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsMp() {
        
        isMp_ = false;
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


      // @@protoc_insertion_point(builder_scope:ChannelerSlabTakeoffBuffRsp)
    }

    // @@protoc_insertion_point(class_scope:ChannelerSlabTakeoffBuffRsp)
    private static final emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp();
    }

    public static emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChannelerSlabTakeoffBuffRsp>
        PARSER = new com.google.protobuf.AbstractParser<ChannelerSlabTakeoffBuffRsp>() {
      @java.lang.Override
      public ChannelerSlabTakeoffBuffRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChannelerSlabTakeoffBuffRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChannelerSlabTakeoffBuffRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChannelerSlabTakeoffBuffRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.ChannelerSlabTakeoffBuffRspOuterClass.ChannelerSlabTakeoffBuffRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChannelerSlabTakeoffBuffRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChannelerSlabTakeoffBuffRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!ChannelerSlabTakeoffBuffRsp.proto\"_\n\033C" +
      "hannelerSlabTakeoffBuffRsp\022\017\n\007slot_id\030\002 " +
      "\001(\r\022\017\n\007retcode\030\010 \001(\005\022\017\n\007buff_id\030\014 \001(\r\022\r\n" +
      "\005is_mp\030\n \001(\010B\030\n\026emu.gingerps.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChannelerSlabTakeoffBuffRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChannelerSlabTakeoffBuffRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChannelerSlabTakeoffBuffRsp_descriptor,
        new java.lang.String[] { "SlotId", "Retcode", "BuffId", "IsMp", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
