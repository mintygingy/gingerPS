// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BargainTerminateNotify.proto

package emu.gingerps.net.proto;

public final class BargainTerminateNotifyOuterClass {
  private BargainTerminateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BargainTerminateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BargainTerminateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 bargain_id = 7;</code>
     * @return The bargainId.
     */
    int getBargainId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 405;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code BargainTerminateNotify}
   */
  public static final class BargainTerminateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BargainTerminateNotify)
      BargainTerminateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BargainTerminateNotify.newBuilder() to construct.
    private BargainTerminateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BargainTerminateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BargainTerminateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BargainTerminateNotify(
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
            case 56: {

              bargainId_ = input.readUInt32();
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
      return emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.internal_static_BargainTerminateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.internal_static_BargainTerminateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify.class, emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify.Builder.class);
    }

    public static final int BARGAIN_ID_FIELD_NUMBER = 7;
    private int bargainId_;
    /**
     * <code>uint32 bargain_id = 7;</code>
     * @return The bargainId.
     */
    @java.lang.Override
    public int getBargainId() {
      return bargainId_;
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
      if (bargainId_ != 0) {
        output.writeUInt32(7, bargainId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (bargainId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, bargainId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify other = (emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify) obj;

      if (getBargainId()
          != other.getBargainId()) return false;
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
      hash = (37 * hash) + BARGAIN_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBargainId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify prototype) {
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
     *   CMD_ID = 405;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code BargainTerminateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BargainTerminateNotify)
        emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.internal_static_BargainTerminateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.internal_static_BargainTerminateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify.class, emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify.newBuilder()
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
        bargainId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.internal_static_BargainTerminateNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify build() {
        emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify buildPartial() {
        emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify result = new emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify(this);
        result.bargainId_ = bargainId_;
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
        if (other instanceof emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify) {
          return mergeFrom((emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify other) {
        if (other == emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify.getDefaultInstance()) return this;
        if (other.getBargainId() != 0) {
          setBargainId(other.getBargainId());
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
        emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bargainId_ ;
      /**
       * <code>uint32 bargain_id = 7;</code>
       * @return The bargainId.
       */
      @java.lang.Override
      public int getBargainId() {
        return bargainId_;
      }
      /**
       * <code>uint32 bargain_id = 7;</code>
       * @param value The bargainId to set.
       * @return This builder for chaining.
       */
      public Builder setBargainId(int value) {
        
        bargainId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 bargain_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearBargainId() {
        
        bargainId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:BargainTerminateNotify)
    }

    // @@protoc_insertion_point(class_scope:BargainTerminateNotify)
    private static final emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify();
    }

    public static emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BargainTerminateNotify>
        PARSER = new com.google.protobuf.AbstractParser<BargainTerminateNotify>() {
      @java.lang.Override
      public BargainTerminateNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BargainTerminateNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BargainTerminateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BargainTerminateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.BargainTerminateNotifyOuterClass.BargainTerminateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BargainTerminateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BargainTerminateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034BargainTerminateNotify.proto\",\n\026Bargai" +
      "nTerminateNotify\022\022\n\nbargain_id\030\007 \001(\rB\033\n\031" +
      "emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BargainTerminateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BargainTerminateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BargainTerminateNotify_descriptor,
        new java.lang.String[] { "BargainId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
