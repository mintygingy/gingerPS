// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGApplyInviteBattleRsp.proto

package emu.gingerps.net.proto;

public final class GCGApplyInviteBattleRspOuterClass {
  private GCGApplyInviteBattleRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGApplyInviteBattleRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGApplyInviteBattleRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 punish_end_time = 6;</code>
     * @return The punishEndTime.
     */
    int getPunishEndTime();

    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 7754;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GCGApplyInviteBattleRsp}
   */
  public static final class GCGApplyInviteBattleRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGApplyInviteBattleRsp)
      GCGApplyInviteBattleRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGApplyInviteBattleRsp.newBuilder() to construct.
    private GCGApplyInviteBattleRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGApplyInviteBattleRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGApplyInviteBattleRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGApplyInviteBattleRsp(
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
            case 48: {

              punishEndTime_ = input.readUInt32();
              break;
            }
            case 64: {

              retcode_ = input.readInt32();
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
      return emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.internal_static_GCGApplyInviteBattleRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.internal_static_GCGApplyInviteBattleRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp.class, emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp.Builder.class);
    }

    public static final int PUNISH_END_TIME_FIELD_NUMBER = 6;
    private int punishEndTime_;
    /**
     * <code>uint32 punish_end_time = 6;</code>
     * @return The punishEndTime.
     */
    @java.lang.Override
    public int getPunishEndTime() {
      return punishEndTime_;
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
      if (punishEndTime_ != 0) {
        output.writeUInt32(6, punishEndTime_);
      }
      if (retcode_ != 0) {
        output.writeInt32(8, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (punishEndTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, punishEndTime_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, retcode_);
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
      if (!(obj instanceof emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp other = (emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp) obj;

      if (getPunishEndTime()
          != other.getPunishEndTime()) return false;
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
      hash = (37 * hash) + PUNISH_END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getPunishEndTime();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp prototype) {
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
     *   CMD_ID = 7754;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GCGApplyInviteBattleRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGApplyInviteBattleRsp)
        emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.internal_static_GCGApplyInviteBattleRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.internal_static_GCGApplyInviteBattleRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp.class, emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp.newBuilder()
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
        punishEndTime_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.internal_static_GCGApplyInviteBattleRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp build() {
        emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp buildPartial() {
        emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp result = new emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp(this);
        result.punishEndTime_ = punishEndTime_;
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
        if (other instanceof emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp) {
          return mergeFrom((emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp other) {
        if (other == emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp.getDefaultInstance()) return this;
        if (other.getPunishEndTime() != 0) {
          setPunishEndTime(other.getPunishEndTime());
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
        emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int punishEndTime_ ;
      /**
       * <code>uint32 punish_end_time = 6;</code>
       * @return The punishEndTime.
       */
      @java.lang.Override
      public int getPunishEndTime() {
        return punishEndTime_;
      }
      /**
       * <code>uint32 punish_end_time = 6;</code>
       * @param value The punishEndTime to set.
       * @return This builder for chaining.
       */
      public Builder setPunishEndTime(int value) {
        
        punishEndTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 punish_end_time = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearPunishEndTime() {
        
        punishEndTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGApplyInviteBattleRsp)
    }

    // @@protoc_insertion_point(class_scope:GCGApplyInviteBattleRsp)
    private static final emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp();
    }

    public static emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGApplyInviteBattleRsp>
        PARSER = new com.google.protobuf.AbstractParser<GCGApplyInviteBattleRsp>() {
      @java.lang.Override
      public GCGApplyInviteBattleRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGApplyInviteBattleRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGApplyInviteBattleRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGApplyInviteBattleRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.GCGApplyInviteBattleRspOuterClass.GCGApplyInviteBattleRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGApplyInviteBattleRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGApplyInviteBattleRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035GCGApplyInviteBattleRsp.proto\"C\n\027GCGAp" +
      "plyInviteBattleRsp\022\027\n\017punish_end_time\030\006 " +
      "\001(\r\022\017\n\007retcode\030\010 \001(\005B\033\n\031emu.gingerps." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGApplyInviteBattleRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGApplyInviteBattleRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGApplyInviteBattleRsp_descriptor,
        new java.lang.String[] { "PunishEndTime", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
