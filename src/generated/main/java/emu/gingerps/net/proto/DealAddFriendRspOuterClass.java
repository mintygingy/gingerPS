// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DealAddFriendRsp.proto

package emu.gingerps.net.proto;

public final class DealAddFriendRspOuterClass {
  private DealAddFriendRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DealAddFriendRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DealAddFriendRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 target_uid = 15;</code>
     * @return The targetUid.
     */
    int getTargetUid();

    /**
     * <code>.DealAddFriendResultType deal_add_friend_result = 4;</code>
     * @return The enum numeric value on the wire for dealAddFriendResult.
     */
    int getDealAddFriendResultValue();
    /**
     * <code>.DealAddFriendResultType deal_add_friend_result = 4;</code>
     * @return The dealAddFriendResult.
     */
    emu.gingerps.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType getDealAddFriendResult();

    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4047;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code DealAddFriendRsp}
   */
  public static final class DealAddFriendRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DealAddFriendRsp)
      DealAddFriendRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DealAddFriendRsp.newBuilder() to construct.
    private DealAddFriendRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DealAddFriendRsp() {
      dealAddFriendResult_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DealAddFriendRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DealAddFriendRsp(
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
            case 32: {
              int rawValue = input.readEnum();

              dealAddFriendResult_ = rawValue;
              break;
            }
            case 88: {

              retcode_ = input.readInt32();
              break;
            }
            case 120: {

              targetUid_ = input.readUInt32();
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
      return emu.gingerps.net.proto.DealAddFriendRspOuterClass.internal_static_DealAddFriendRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.DealAddFriendRspOuterClass.internal_static_DealAddFriendRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp.class, emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp.Builder.class);
    }

    public static final int TARGET_UID_FIELD_NUMBER = 15;
    private int targetUid_;
    /**
     * <code>uint32 target_uid = 15;</code>
     * @return The targetUid.
     */
    @java.lang.Override
    public int getTargetUid() {
      return targetUid_;
    }

    public static final int DEAL_ADD_FRIEND_RESULT_FIELD_NUMBER = 4;
    private int dealAddFriendResult_;
    /**
     * <code>.DealAddFriendResultType deal_add_friend_result = 4;</code>
     * @return The enum numeric value on the wire for dealAddFriendResult.
     */
    @java.lang.Override public int getDealAddFriendResultValue() {
      return dealAddFriendResult_;
    }
    /**
     * <code>.DealAddFriendResultType deal_add_friend_result = 4;</code>
     * @return The dealAddFriendResult.
     */
    @java.lang.Override public emu.gingerps.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType getDealAddFriendResult() {
      @SuppressWarnings("deprecation")
      emu.gingerps.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType result = emu.gingerps.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType.valueOf(dealAddFriendResult_);
      return result == null ? emu.gingerps.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType.UNRECOGNIZED : result;
    }

    public static final int RETCODE_FIELD_NUMBER = 11;
    private int retcode_;
    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (dealAddFriendResult_ != emu.gingerps.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType.DEAL_ADD_FRIEND_RESULT_TYPE_REJECT.getNumber()) {
        output.writeEnum(4, dealAddFriendResult_);
      }
      if (retcode_ != 0) {
        output.writeInt32(11, retcode_);
      }
      if (targetUid_ != 0) {
        output.writeUInt32(15, targetUid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dealAddFriendResult_ != emu.gingerps.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType.DEAL_ADD_FRIEND_RESULT_TYPE_REJECT.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, dealAddFriendResult_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, retcode_);
      }
      if (targetUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, targetUid_);
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
      if (!(obj instanceof emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp other = (emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp) obj;

      if (getTargetUid()
          != other.getTargetUid()) return false;
      if (dealAddFriendResult_ != other.dealAddFriendResult_) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + TARGET_UID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetUid();
      hash = (37 * hash) + DEAL_ADD_FRIEND_RESULT_FIELD_NUMBER;
      hash = (53 * hash) + dealAddFriendResult_;
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp prototype) {
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
     *   CMD_ID = 4047;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code DealAddFriendRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DealAddFriendRsp)
        emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.DealAddFriendRspOuterClass.internal_static_DealAddFriendRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.DealAddFriendRspOuterClass.internal_static_DealAddFriendRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp.class, emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp.newBuilder()
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
        targetUid_ = 0;

        dealAddFriendResult_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.DealAddFriendRspOuterClass.internal_static_DealAddFriendRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp build() {
        emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp buildPartial() {
        emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp result = new emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp(this);
        result.targetUid_ = targetUid_;
        result.dealAddFriendResult_ = dealAddFriendResult_;
        result.retcode_ = retcode_;
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
        if (other instanceof emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp) {
          return mergeFrom((emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp other) {
        if (other == emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp.getDefaultInstance()) return this;
        if (other.getTargetUid() != 0) {
          setTargetUid(other.getTargetUid());
        }
        if (other.dealAddFriendResult_ != 0) {
          setDealAddFriendResultValue(other.getDealAddFriendResultValue());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int targetUid_ ;
      /**
       * <code>uint32 target_uid = 15;</code>
       * @return The targetUid.
       */
      @java.lang.Override
      public int getTargetUid() {
        return targetUid_;
      }
      /**
       * <code>uint32 target_uid = 15;</code>
       * @param value The targetUid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetUid(int value) {
        
        targetUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_uid = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetUid() {
        
        targetUid_ = 0;
        onChanged();
        return this;
      }

      private int dealAddFriendResult_ = 0;
      /**
       * <code>.DealAddFriendResultType deal_add_friend_result = 4;</code>
       * @return The enum numeric value on the wire for dealAddFriendResult.
       */
      @java.lang.Override public int getDealAddFriendResultValue() {
        return dealAddFriendResult_;
      }
      /**
       * <code>.DealAddFriendResultType deal_add_friend_result = 4;</code>
       * @param value The enum numeric value on the wire for dealAddFriendResult to set.
       * @return This builder for chaining.
       */
      public Builder setDealAddFriendResultValue(int value) {
        
        dealAddFriendResult_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.DealAddFriendResultType deal_add_friend_result = 4;</code>
       * @return The dealAddFriendResult.
       */
      @java.lang.Override
      public emu.gingerps.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType getDealAddFriendResult() {
        @SuppressWarnings("deprecation")
        emu.gingerps.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType result = emu.gingerps.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType.valueOf(dealAddFriendResult_);
        return result == null ? emu.gingerps.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType.UNRECOGNIZED : result;
      }
      /**
       * <code>.DealAddFriendResultType deal_add_friend_result = 4;</code>
       * @param value The dealAddFriendResult to set.
       * @return This builder for chaining.
       */
      public Builder setDealAddFriendResult(emu.gingerps.net.proto.DealAddFriendResultTypeOuterClass.DealAddFriendResultType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        dealAddFriendResult_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.DealAddFriendResultType deal_add_friend_result = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearDealAddFriendResult() {
        
        dealAddFriendResult_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 11;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DealAddFriendRsp)
    }

    // @@protoc_insertion_point(class_scope:DealAddFriendRsp)
    private static final emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp();
    }

    public static emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DealAddFriendRsp>
        PARSER = new com.google.protobuf.AbstractParser<DealAddFriendRsp>() {
      @java.lang.Override
      public DealAddFriendRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DealAddFriendRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DealAddFriendRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DealAddFriendRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.DealAddFriendRspOuterClass.DealAddFriendRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DealAddFriendRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DealAddFriendRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026DealAddFriendRsp.proto\032\035DealAddFriendR" +
      "esultType.proto\"q\n\020DealAddFriendRsp\022\022\n\nt" +
      "arget_uid\030\017 \001(\r\0228\n\026deal_add_friend_resul" +
      "t\030\004 \001(\0162\030.DealAddFriendResultType\022\017\n\007ret" +
      "code\030\013 \001(\005B\030\n\026emu.gingerps.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.DealAddFriendResultTypeOuterClass.getDescriptor(),
        });
    internal_static_DealAddFriendRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DealAddFriendRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DealAddFriendRsp_descriptor,
        new java.lang.String[] { "TargetUid", "DealAddFriendResult", "Retcode", });
    emu.gingerps.net.proto.DealAddFriendResultTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
