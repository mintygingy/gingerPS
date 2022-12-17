// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChangeGameTimeRsp.proto

package emu.gingerps.net.proto;

public final class ChangeGameTimeRspOuterClass {
  private ChangeGameTimeRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChangeGameTimeRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChangeGameTimeRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 extra_days = 2;</code>
     * @return The extraDays.
     */
    int getExtraDays();

    /**
     * <code>uint32 cur_game_time = 8;</code>
     * @return The curGameTime.
     */
    int getCurGameTime();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 157;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ChangeGameTimeRsp}
   */
  public static final class ChangeGameTimeRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChangeGameTimeRsp)
      ChangeGameTimeRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChangeGameTimeRsp.newBuilder() to construct.
    private ChangeGameTimeRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChangeGameTimeRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChangeGameTimeRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChangeGameTimeRsp(
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

              extraDays_ = input.readUInt32();
              break;
            }
            case 64: {

              curGameTime_ = input.readUInt32();
              break;
            }
            case 80: {

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
      return emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.internal_static_ChangeGameTimeRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.internal_static_ChangeGameTimeRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp.class, emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 10;
    private int retcode_;
    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int EXTRA_DAYS_FIELD_NUMBER = 2;
    private int extraDays_;
    /**
     * <code>uint32 extra_days = 2;</code>
     * @return The extraDays.
     */
    @java.lang.Override
    public int getExtraDays() {
      return extraDays_;
    }

    public static final int CUR_GAME_TIME_FIELD_NUMBER = 8;
    private int curGameTime_;
    /**
     * <code>uint32 cur_game_time = 8;</code>
     * @return The curGameTime.
     */
    @java.lang.Override
    public int getCurGameTime() {
      return curGameTime_;
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
      if (extraDays_ != 0) {
        output.writeUInt32(2, extraDays_);
      }
      if (curGameTime_ != 0) {
        output.writeUInt32(8, curGameTime_);
      }
      if (retcode_ != 0) {
        output.writeInt32(10, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (extraDays_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, extraDays_);
      }
      if (curGameTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, curGameTime_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, retcode_);
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
      if (!(obj instanceof emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp other = (emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getExtraDays()
          != other.getExtraDays()) return false;
      if (getCurGameTime()
          != other.getCurGameTime()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + EXTRA_DAYS_FIELD_NUMBER;
      hash = (53 * hash) + getExtraDays();
      hash = (37 * hash) + CUR_GAME_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCurGameTime();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp prototype) {
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
     *   CMD_ID = 157;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ChangeGameTimeRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChangeGameTimeRsp)
        emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.internal_static_ChangeGameTimeRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.internal_static_ChangeGameTimeRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp.class, emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp.newBuilder()
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
        retcode_ = 0;

        extraDays_ = 0;

        curGameTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.internal_static_ChangeGameTimeRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp build() {
        emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp buildPartial() {
        emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp result = new emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp(this);
        result.retcode_ = retcode_;
        result.extraDays_ = extraDays_;
        result.curGameTime_ = curGameTime_;
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
        if (other instanceof emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp) {
          return mergeFrom((emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp other) {
        if (other == emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getExtraDays() != 0) {
          setExtraDays(other.getExtraDays());
        }
        if (other.getCurGameTime() != 0) {
          setCurGameTime(other.getCurGameTime());
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
        emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 10;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 10;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int extraDays_ ;
      /**
       * <code>uint32 extra_days = 2;</code>
       * @return The extraDays.
       */
      @java.lang.Override
      public int getExtraDays() {
        return extraDays_;
      }
      /**
       * <code>uint32 extra_days = 2;</code>
       * @param value The extraDays to set.
       * @return This builder for chaining.
       */
      public Builder setExtraDays(int value) {
        
        extraDays_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 extra_days = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearExtraDays() {
        
        extraDays_ = 0;
        onChanged();
        return this;
      }

      private int curGameTime_ ;
      /**
       * <code>uint32 cur_game_time = 8;</code>
       * @return The curGameTime.
       */
      @java.lang.Override
      public int getCurGameTime() {
        return curGameTime_;
      }
      /**
       * <code>uint32 cur_game_time = 8;</code>
       * @param value The curGameTime to set.
       * @return This builder for chaining.
       */
      public Builder setCurGameTime(int value) {
        
        curGameTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_game_time = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurGameTime() {
        
        curGameTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ChangeGameTimeRsp)
    }

    // @@protoc_insertion_point(class_scope:ChangeGameTimeRsp)
    private static final emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp();
    }

    public static emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChangeGameTimeRsp>
        PARSER = new com.google.protobuf.AbstractParser<ChangeGameTimeRsp>() {
      @java.lang.Override
      public ChangeGameTimeRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChangeGameTimeRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChangeGameTimeRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChangeGameTimeRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.ChangeGameTimeRspOuterClass.ChangeGameTimeRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChangeGameTimeRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChangeGameTimeRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027ChangeGameTimeRsp.proto\"O\n\021ChangeGameT" +
      "imeRsp\022\017\n\007retcode\030\n \001(\005\022\022\n\nextra_days\030\002 " +
      "\001(\r\022\025\n\rcur_game_time\030\010 \001(\rB\030\n\026emu.ginger" +
      "ps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChangeGameTimeRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChangeGameTimeRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChangeGameTimeRsp_descriptor,
        new java.lang.String[] { "Retcode", "ExtraDays", "CurGameTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
