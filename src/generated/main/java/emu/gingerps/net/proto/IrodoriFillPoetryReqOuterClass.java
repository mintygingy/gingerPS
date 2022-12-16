// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IrodoriFillPoetryReq.proto

package emu.gingerps.net.proto;

public final class IrodoriFillPoetryReqOuterClass {
  private IrodoriFillPoetryReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IrodoriFillPoetryReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IrodoriFillPoetryReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 line_id = 6;</code>
     * @return The lineId.
     */
    int getLineId();

    /**
     * <code>uint32 theme_id = 5;</code>
     * @return The themeId.
     */
    int getThemeId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8926;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code IrodoriFillPoetryReq}
   */
  public static final class IrodoriFillPoetryReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IrodoriFillPoetryReq)
      IrodoriFillPoetryReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IrodoriFillPoetryReq.newBuilder() to construct.
    private IrodoriFillPoetryReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IrodoriFillPoetryReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IrodoriFillPoetryReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private IrodoriFillPoetryReq(
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
            case 40: {

              themeId_ = input.readUInt32();
              break;
            }
            case 48: {

              lineId_ = input.readUInt32();
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
      return emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.internal_static_IrodoriFillPoetryReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.internal_static_IrodoriFillPoetryReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq.class, emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq.Builder.class);
    }

    public static final int LINE_ID_FIELD_NUMBER = 6;
    private int lineId_;
    /**
     * <code>uint32 line_id = 6;</code>
     * @return The lineId.
     */
    @java.lang.Override
    public int getLineId() {
      return lineId_;
    }

    public static final int THEME_ID_FIELD_NUMBER = 5;
    private int themeId_;
    /**
     * <code>uint32 theme_id = 5;</code>
     * @return The themeId.
     */
    @java.lang.Override
    public int getThemeId() {
      return themeId_;
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
      if (themeId_ != 0) {
        output.writeUInt32(5, themeId_);
      }
      if (lineId_ != 0) {
        output.writeUInt32(6, lineId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (themeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, themeId_);
      }
      if (lineId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, lineId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq other = (emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq) obj;

      if (getLineId()
          != other.getLineId()) return false;
      if (getThemeId()
          != other.getThemeId()) return false;
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
      hash = (37 * hash) + LINE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLineId();
      hash = (37 * hash) + THEME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getThemeId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq prototype) {
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
     *   CMD_ID = 8926;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code IrodoriFillPoetryReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IrodoriFillPoetryReq)
        emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.internal_static_IrodoriFillPoetryReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.internal_static_IrodoriFillPoetryReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq.class, emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq.newBuilder()
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
        lineId_ = 0;

        themeId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.internal_static_IrodoriFillPoetryReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq build() {
        emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq buildPartial() {
        emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq result = new emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq(this);
        result.lineId_ = lineId_;
        result.themeId_ = themeId_;
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
        if (other instanceof emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq) {
          return mergeFrom((emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq other) {
        if (other == emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq.getDefaultInstance()) return this;
        if (other.getLineId() != 0) {
          setLineId(other.getLineId());
        }
        if (other.getThemeId() != 0) {
          setThemeId(other.getThemeId());
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
        emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int lineId_ ;
      /**
       * <code>uint32 line_id = 6;</code>
       * @return The lineId.
       */
      @java.lang.Override
      public int getLineId() {
        return lineId_;
      }
      /**
       * <code>uint32 line_id = 6;</code>
       * @param value The lineId to set.
       * @return This builder for chaining.
       */
      public Builder setLineId(int value) {
        
        lineId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 line_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearLineId() {
        
        lineId_ = 0;
        onChanged();
        return this;
      }

      private int themeId_ ;
      /**
       * <code>uint32 theme_id = 5;</code>
       * @return The themeId.
       */
      @java.lang.Override
      public int getThemeId() {
        return themeId_;
      }
      /**
       * <code>uint32 theme_id = 5;</code>
       * @param value The themeId to set.
       * @return This builder for chaining.
       */
      public Builder setThemeId(int value) {
        
        themeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 theme_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearThemeId() {
        
        themeId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:IrodoriFillPoetryReq)
    }

    // @@protoc_insertion_point(class_scope:IrodoriFillPoetryReq)
    private static final emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq();
    }

    public static emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IrodoriFillPoetryReq>
        PARSER = new com.google.protobuf.AbstractParser<IrodoriFillPoetryReq>() {
      @java.lang.Override
      public IrodoriFillPoetryReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new IrodoriFillPoetryReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<IrodoriFillPoetryReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IrodoriFillPoetryReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.IrodoriFillPoetryReqOuterClass.IrodoriFillPoetryReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IrodoriFillPoetryReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IrodoriFillPoetryReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032IrodoriFillPoetryReq.proto\"9\n\024IrodoriF" +
      "illPoetryReq\022\017\n\007line_id\030\006 \001(\r\022\020\n\010theme_i" +
      "d\030\005 \001(\rB\033\n\031emu.gingerps.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_IrodoriFillPoetryReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IrodoriFillPoetryReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IrodoriFillPoetryReq_descriptor,
        new java.lang.String[] { "LineId", "ThemeId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
