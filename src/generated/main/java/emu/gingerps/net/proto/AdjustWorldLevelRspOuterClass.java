// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AdjustWorldLevelRsp.proto

package emu.gingerps.net.proto;

public final class AdjustWorldLevelRspOuterClass {
  private AdjustWorldLevelRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AdjustWorldLevelRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AdjustWorldLevelRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 after_world_level = 11;</code>
     * @return The afterWorldLevel.
     */
    int getAfterWorldLevel();

    /**
     * <code>uint32 cd_over_time = 5;</code>
     * @return The cdOverTime.
     */
    int getCdOverTime();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 131;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code AdjustWorldLevelRsp}
   */
  public static final class AdjustWorldLevelRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AdjustWorldLevelRsp)
      AdjustWorldLevelRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AdjustWorldLevelRsp.newBuilder() to construct.
    private AdjustWorldLevelRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AdjustWorldLevelRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AdjustWorldLevelRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AdjustWorldLevelRsp(
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
            case 8: {

              retcode_ = input.readInt32();
              break;
            }
            case 40: {

              cdOverTime_ = input.readUInt32();
              break;
            }
            case 88: {

              afterWorldLevel_ = input.readUInt32();
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
      return emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.internal_static_AdjustWorldLevelRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.internal_static_AdjustWorldLevelRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp.class, emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 1;
    private int retcode_;
    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int AFTER_WORLD_LEVEL_FIELD_NUMBER = 11;
    private int afterWorldLevel_;
    /**
     * <code>uint32 after_world_level = 11;</code>
     * @return The afterWorldLevel.
     */
    @java.lang.Override
    public int getAfterWorldLevel() {
      return afterWorldLevel_;
    }

    public static final int CD_OVER_TIME_FIELD_NUMBER = 5;
    private int cdOverTime_;
    /**
     * <code>uint32 cd_over_time = 5;</code>
     * @return The cdOverTime.
     */
    @java.lang.Override
    public int getCdOverTime() {
      return cdOverTime_;
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
      if (retcode_ != 0) {
        output.writeInt32(1, retcode_);
      }
      if (cdOverTime_ != 0) {
        output.writeUInt32(5, cdOverTime_);
      }
      if (afterWorldLevel_ != 0) {
        output.writeUInt32(11, afterWorldLevel_);
      }
      unknownFields.writeTo(output);
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
      if (cdOverTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, cdOverTime_);
      }
      if (afterWorldLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, afterWorldLevel_);
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
      if (!(obj instanceof emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp other = (emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getAfterWorldLevel()
          != other.getAfterWorldLevel()) return false;
      if (getCdOverTime()
          != other.getCdOverTime()) return false;
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
      hash = (37 * hash) + AFTER_WORLD_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getAfterWorldLevel();
      hash = (37 * hash) + CD_OVER_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCdOverTime();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp prototype) {
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
     *   CMD_ID = 131;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code AdjustWorldLevelRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AdjustWorldLevelRsp)
        emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.internal_static_AdjustWorldLevelRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.internal_static_AdjustWorldLevelRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp.class, emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp.newBuilder()
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

        afterWorldLevel_ = 0;

        cdOverTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.internal_static_AdjustWorldLevelRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp build() {
        emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp buildPartial() {
        emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp result = new emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp(this);
        result.retcode_ = retcode_;
        result.afterWorldLevel_ = afterWorldLevel_;
        result.cdOverTime_ = cdOverTime_;
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
        if (other instanceof emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp) {
          return mergeFrom((emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp other) {
        if (other == emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getAfterWorldLevel() != 0) {
          setAfterWorldLevel(other.getAfterWorldLevel());
        }
        if (other.getCdOverTime() != 0) {
          setCdOverTime(other.getCdOverTime());
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
        emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp) e.getUnfinishedMessage();
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
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int afterWorldLevel_ ;
      /**
       * <code>uint32 after_world_level = 11;</code>
       * @return The afterWorldLevel.
       */
      @java.lang.Override
      public int getAfterWorldLevel() {
        return afterWorldLevel_;
      }
      /**
       * <code>uint32 after_world_level = 11;</code>
       * @param value The afterWorldLevel to set.
       * @return This builder for chaining.
       */
      public Builder setAfterWorldLevel(int value) {
        
        afterWorldLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 after_world_level = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearAfterWorldLevel() {
        
        afterWorldLevel_ = 0;
        onChanged();
        return this;
      }

      private int cdOverTime_ ;
      /**
       * <code>uint32 cd_over_time = 5;</code>
       * @return The cdOverTime.
       */
      @java.lang.Override
      public int getCdOverTime() {
        return cdOverTime_;
      }
      /**
       * <code>uint32 cd_over_time = 5;</code>
       * @param value The cdOverTime to set.
       * @return This builder for chaining.
       */
      public Builder setCdOverTime(int value) {
        
        cdOverTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cd_over_time = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearCdOverTime() {
        
        cdOverTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AdjustWorldLevelRsp)
    }

    // @@protoc_insertion_point(class_scope:AdjustWorldLevelRsp)
    private static final emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp();
    }

    public static emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AdjustWorldLevelRsp>
        PARSER = new com.google.protobuf.AbstractParser<AdjustWorldLevelRsp>() {
      @java.lang.Override
      public AdjustWorldLevelRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AdjustWorldLevelRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AdjustWorldLevelRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AdjustWorldLevelRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.AdjustWorldLevelRspOuterClass.AdjustWorldLevelRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AdjustWorldLevelRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AdjustWorldLevelRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031AdjustWorldLevelRsp.proto\"W\n\023AdjustWor" +
      "ldLevelRsp\022\017\n\007retcode\030\001 \001(\005\022\031\n\021after_wor" +
      "ld_level\030\013 \001(\r\022\024\n\014cd_over_time\030\005 \001(\rB\033\n\031" +
      "emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AdjustWorldLevelRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AdjustWorldLevelRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AdjustWorldLevelRsp_descriptor,
        new java.lang.String[] { "Retcode", "AfterWorldLevel", "CdOverTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}