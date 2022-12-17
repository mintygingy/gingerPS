// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WinterCampTriathlonRestartReq.proto

package emu.gingerps.net.proto;

public final class WinterCampTriathlonRestartReqOuterClass {
  private WinterCampTriathlonRestartReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WinterCampTriathlonRestartReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WinterCampTriathlonRestartReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gallery_id = 12;</code>
     * @return The galleryId.
     */
    int getGalleryId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8524;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code WinterCampTriathlonRestartReq}
   */
  public static final class WinterCampTriathlonRestartReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WinterCampTriathlonRestartReq)
      WinterCampTriathlonRestartReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WinterCampTriathlonRestartReq.newBuilder() to construct.
    private WinterCampTriathlonRestartReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WinterCampTriathlonRestartReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WinterCampTriathlonRestartReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WinterCampTriathlonRestartReq(
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
            case 96: {

              galleryId_ = input.readUInt32();
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
      return emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.internal_static_WinterCampTriathlonRestartReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.internal_static_WinterCampTriathlonRestartReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq.class, emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq.Builder.class);
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 12;
    private int galleryId_;
    /**
     * <code>uint32 gallery_id = 12;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
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
      if (galleryId_ != 0) {
        output.writeUInt32(12, galleryId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, galleryId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq other = (emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq) obj;

      if (getGalleryId()
          != other.getGalleryId()) return false;
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
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq prototype) {
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
     *   CMD_ID = 8524;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code WinterCampTriathlonRestartReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WinterCampTriathlonRestartReq)
        emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.internal_static_WinterCampTriathlonRestartReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.internal_static_WinterCampTriathlonRestartReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq.class, emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq.newBuilder()
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
        galleryId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.internal_static_WinterCampTriathlonRestartReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq build() {
        emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq buildPartial() {
        emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq result = new emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq(this);
        result.galleryId_ = galleryId_;
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
        if (other instanceof emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq) {
          return mergeFrom((emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq other) {
        if (other == emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq.getDefaultInstance()) return this;
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
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
        emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 12;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 12;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        
        galleryId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:WinterCampTriathlonRestartReq)
    }

    // @@protoc_insertion_point(class_scope:WinterCampTriathlonRestartReq)
    private static final emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq();
    }

    public static emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WinterCampTriathlonRestartReq>
        PARSER = new com.google.protobuf.AbstractParser<WinterCampTriathlonRestartReq>() {
      @java.lang.Override
      public WinterCampTriathlonRestartReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WinterCampTriathlonRestartReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WinterCampTriathlonRestartReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WinterCampTriathlonRestartReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.WinterCampTriathlonRestartReqOuterClass.WinterCampTriathlonRestartReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WinterCampTriathlonRestartReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WinterCampTriathlonRestartReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#WinterCampTriathlonRestartReq.proto\"3\n" +
      "\035WinterCampTriathlonRestartReq\022\022\n\ngaller" +
      "y_id\030\014 \001(\rB\030\n\026emu.gingerps.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WinterCampTriathlonRestartReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WinterCampTriathlonRestartReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WinterCampTriathlonRestartReq_descriptor,
        new java.lang.String[] { "GalleryId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
