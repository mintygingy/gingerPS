// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EnterSceneReadyRsp.proto

package emu.gingerps.net.proto;

public final class EnterSceneReadyRspOuterClass {
  private EnterSceneReadyRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EnterSceneReadyRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EnterSceneReadyRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 enter_scene_token = 11;</code>
     * @return The enterSceneToken.
     */
    int getEnterSceneToken();

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
   *   CMD_ID = 251;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code EnterSceneReadyRsp}
   */
  public static final class EnterSceneReadyRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EnterSceneReadyRsp)
      EnterSceneReadyRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EnterSceneReadyRsp.newBuilder() to construct.
    private EnterSceneReadyRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EnterSceneReadyRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EnterSceneReadyRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EnterSceneReadyRsp(
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
            case 64: {

              retcode_ = input.readInt32();
              break;
            }
            case 88: {

              enterSceneToken_ = input.readUInt32();
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
      return emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.internal_static_EnterSceneReadyRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.internal_static_EnterSceneReadyRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp.class, emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp.Builder.class);
    }

    public static final int ENTER_SCENE_TOKEN_FIELD_NUMBER = 11;
    private int enterSceneToken_;
    /**
     * <code>uint32 enter_scene_token = 11;</code>
     * @return The enterSceneToken.
     */
    @java.lang.Override
    public int getEnterSceneToken() {
      return enterSceneToken_;
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
      if (retcode_ != 0) {
        output.writeInt32(8, retcode_);
      }
      if (enterSceneToken_ != 0) {
        output.writeUInt32(11, enterSceneToken_);
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
          .computeInt32Size(8, retcode_);
      }
      if (enterSceneToken_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, enterSceneToken_);
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
      if (!(obj instanceof emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp other = (emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp) obj;

      if (getEnterSceneToken()
          != other.getEnterSceneToken()) return false;
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
      hash = (37 * hash) + ENTER_SCENE_TOKEN_FIELD_NUMBER;
      hash = (53 * hash) + getEnterSceneToken();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp prototype) {
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
     *   CMD_ID = 251;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code EnterSceneReadyRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EnterSceneReadyRsp)
        emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.internal_static_EnterSceneReadyRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.internal_static_EnterSceneReadyRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp.class, emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp.newBuilder()
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
        enterSceneToken_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.internal_static_EnterSceneReadyRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp build() {
        emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp buildPartial() {
        emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp result = new emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp(this);
        result.enterSceneToken_ = enterSceneToken_;
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
        if (other instanceof emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp) {
          return mergeFrom((emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp other) {
        if (other == emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp.getDefaultInstance()) return this;
        if (other.getEnterSceneToken() != 0) {
          setEnterSceneToken(other.getEnterSceneToken());
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
        emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int enterSceneToken_ ;
      /**
       * <code>uint32 enter_scene_token = 11;</code>
       * @return The enterSceneToken.
       */
      @java.lang.Override
      public int getEnterSceneToken() {
        return enterSceneToken_;
      }
      /**
       * <code>uint32 enter_scene_token = 11;</code>
       * @param value The enterSceneToken to set.
       * @return This builder for chaining.
       */
      public Builder setEnterSceneToken(int value) {
        
        enterSceneToken_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 enter_scene_token = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearEnterSceneToken() {
        
        enterSceneToken_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EnterSceneReadyRsp)
    }

    // @@protoc_insertion_point(class_scope:EnterSceneReadyRsp)
    private static final emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp();
    }

    public static emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EnterSceneReadyRsp>
        PARSER = new com.google.protobuf.AbstractParser<EnterSceneReadyRsp>() {
      @java.lang.Override
      public EnterSceneReadyRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EnterSceneReadyRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EnterSceneReadyRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EnterSceneReadyRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.EnterSceneReadyRspOuterClass.EnterSceneReadyRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnterSceneReadyRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnterSceneReadyRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030EnterSceneReadyRsp.proto\"@\n\022EnterScene" +
      "ReadyRsp\022\031\n\021enter_scene_token\030\013 \001(\r\022\017\n\007r" +
      "etcode\030\010 \001(\005B\033\n\031emu.gingerps.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EnterSceneReadyRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EnterSceneReadyRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnterSceneReadyRsp_descriptor,
        new java.lang.String[] { "EnterSceneToken", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
