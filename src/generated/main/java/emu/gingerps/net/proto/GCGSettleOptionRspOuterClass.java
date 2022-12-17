// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGSettleOptionRsp.proto

package emu.gingerps.net.proto;

public final class GCGSettleOptionRspOuterClass {
  private GCGSettleOptionRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGSettleOptionRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGSettleOptionRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.GCGSettleOption option = 2;</code>
     * @return The enum numeric value on the wire for option.
     */
    int getOptionValue();
    /**
     * <code>.GCGSettleOption option = 2;</code>
     * @return The option.
     */
    emu.gingerps.net.proto.GCGSettleOptionOuterClass.GCGSettleOption getOption();

    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 7110;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GCGSettleOptionRsp}
   */
  public static final class GCGSettleOptionRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGSettleOptionRsp)
      GCGSettleOptionRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGSettleOptionRsp.newBuilder() to construct.
    private GCGSettleOptionRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGSettleOptionRsp() {
      option_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGSettleOptionRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.internal_static_GCGSettleOptionRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.internal_static_GCGSettleOptionRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp.class, emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp.Builder.class);
    }

    public static final int OPTION_FIELD_NUMBER = 2;
    private int option_ = 0;
    /**
     * <code>.GCGSettleOption option = 2;</code>
     * @return The enum numeric value on the wire for option.
     */
    @java.lang.Override public int getOptionValue() {
      return option_;
    }
    /**
     * <code>.GCGSettleOption option = 2;</code>
     * @return The option.
     */
    @java.lang.Override public emu.gingerps.net.proto.GCGSettleOptionOuterClass.GCGSettleOption getOption() {
      emu.gingerps.net.proto.GCGSettleOptionOuterClass.GCGSettleOption result = emu.gingerps.net.proto.GCGSettleOptionOuterClass.GCGSettleOption.forNumber(option_);
      return result == null ? emu.gingerps.net.proto.GCGSettleOptionOuterClass.GCGSettleOption.UNRECOGNIZED : result;
    }

    public static final int RETCODE_FIELD_NUMBER = 5;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 5;</code>
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
      if (option_ != emu.gingerps.net.proto.GCGSettleOptionOuterClass.GCGSettleOption.GCG_SETTLE_OPTION_OPT_NONE.getNumber()) {
        output.writeEnum(2, option_);
      }
      if (retcode_ != 0) {
        output.writeInt32(5, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (option_ != emu.gingerps.net.proto.GCGSettleOptionOuterClass.GCGSettleOption.GCG_SETTLE_OPTION_OPT_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, option_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, retcode_);
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
      if (!(obj instanceof emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp other = (emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp) obj;

      if (option_ != other.option_) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + OPTION_FIELD_NUMBER;
      hash = (53 * hash) + option_;
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp prototype) {
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
     *   CMD_ID = 7110;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GCGSettleOptionRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGSettleOptionRsp)
        emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.internal_static_GCGSettleOptionRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.internal_static_GCGSettleOptionRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp.class, emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp.newBuilder()
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
        option_ = 0;
        retcode_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.internal_static_GCGSettleOptionRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp build() {
        emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp buildPartial() {
        emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp result = new emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.option_ = option_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
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
        if (other instanceof emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp) {
          return mergeFrom((emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp other) {
        if (other == emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp.getDefaultInstance()) return this;
        if (other.option_ != 0) {
          setOptionValue(other.getOptionValue());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
                option_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 16
              case 40: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 40
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

      private int option_ = 0;
      /**
       * <code>.GCGSettleOption option = 2;</code>
       * @return The enum numeric value on the wire for option.
       */
      @java.lang.Override public int getOptionValue() {
        return option_;
      }
      /**
       * <code>.GCGSettleOption option = 2;</code>
       * @param value The enum numeric value on the wire for option to set.
       * @return This builder for chaining.
       */
      public Builder setOptionValue(int value) {
        option_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.GCGSettleOption option = 2;</code>
       * @return The option.
       */
      @java.lang.Override
      public emu.gingerps.net.proto.GCGSettleOptionOuterClass.GCGSettleOption getOption() {
        emu.gingerps.net.proto.GCGSettleOptionOuterClass.GCGSettleOption result = emu.gingerps.net.proto.GCGSettleOptionOuterClass.GCGSettleOption.forNumber(option_);
        return result == null ? emu.gingerps.net.proto.GCGSettleOptionOuterClass.GCGSettleOption.UNRECOGNIZED : result;
      }
      /**
       * <code>.GCGSettleOption option = 2;</code>
       * @param value The option to set.
       * @return This builder for chaining.
       */
      public Builder setOption(emu.gingerps.net.proto.GCGSettleOptionOuterClass.GCGSettleOption value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        option_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GCGSettleOption option = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearOption() {
        bitField0_ = (bitField0_ & ~0x00000001);
        option_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 5;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:GCGSettleOptionRsp)
    }

    // @@protoc_insertion_point(class_scope:GCGSettleOptionRsp)
    private static final emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp();
    }

    public static emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGSettleOptionRsp>
        PARSER = new com.google.protobuf.AbstractParser<GCGSettleOptionRsp>() {
      @java.lang.Override
      public GCGSettleOptionRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<GCGSettleOptionRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGSettleOptionRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.GCGSettleOptionRspOuterClass.GCGSettleOptionRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGSettleOptionRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGSettleOptionRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030GCGSettleOptionRsp.proto\032\025GCGSettleOpt" +
      "ion.proto\"G\n\022GCGSettleOptionRsp\022 \n\006optio" +
      "n\030\002 \001(\0162\020.GCGSettleOption\022\017\n\007retcode\030\005 \001" +
      "(\005B\030\n\026emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.GCGSettleOptionOuterClass.getDescriptor(),
        });
    internal_static_GCGSettleOptionRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGSettleOptionRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGSettleOptionRsp_descriptor,
        new java.lang.String[] { "Option", "Retcode", });
    emu.gingerps.net.proto.GCGSettleOptionOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
