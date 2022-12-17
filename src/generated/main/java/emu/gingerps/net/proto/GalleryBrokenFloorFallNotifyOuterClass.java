// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GalleryBrokenFloorFallNotify.proto

package emu.gingerps.net.proto;

public final class GalleryBrokenFloorFallNotifyOuterClass {
  private GalleryBrokenFloorFallNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GalleryBrokenFloorFallNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GalleryBrokenFloorFallNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 fall_count = 10;</code>
     * @return The fallCount.
     */
    int getFallCount();

    /**
     * <code>uint32 gallery_id = 7;</code>
     * @return The galleryId.
     */
    int getGalleryId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 5539;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GalleryBrokenFloorFallNotify}
   */
  public static final class GalleryBrokenFloorFallNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GalleryBrokenFloorFallNotify)
      GalleryBrokenFloorFallNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GalleryBrokenFloorFallNotify.newBuilder() to construct.
    private GalleryBrokenFloorFallNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GalleryBrokenFloorFallNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GalleryBrokenFloorFallNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.internal_static_GalleryBrokenFloorFallNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.internal_static_GalleryBrokenFloorFallNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify.class, emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify.Builder.class);
    }

    public static final int FALL_COUNT_FIELD_NUMBER = 10;
    private int fallCount_ = 0;
    /**
     * <code>uint32 fall_count = 10;</code>
     * @return The fallCount.
     */
    @java.lang.Override
    public int getFallCount() {
      return fallCount_;
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 7;
    private int galleryId_ = 0;
    /**
     * <code>uint32 gallery_id = 7;</code>
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
        output.writeUInt32(7, galleryId_);
      }
      if (fallCount_ != 0) {
        output.writeUInt32(10, fallCount_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, galleryId_);
      }
      if (fallCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, fallCount_);
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
      if (!(obj instanceof emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify other = (emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify) obj;

      if (getFallCount()
          != other.getFallCount()) return false;
      if (getGalleryId()
          != other.getGalleryId()) return false;
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
      hash = (37 * hash) + FALL_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getFallCount();
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify prototype) {
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
     *   CMD_ID = 5539;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GalleryBrokenFloorFallNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GalleryBrokenFloorFallNotify)
        emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.internal_static_GalleryBrokenFloorFallNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.internal_static_GalleryBrokenFloorFallNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify.class, emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify.newBuilder()
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
        fallCount_ = 0;
        galleryId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.internal_static_GalleryBrokenFloorFallNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify build() {
        emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify buildPartial() {
        emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify result = new emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.fallCount_ = fallCount_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.galleryId_ = galleryId_;
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
        if (other instanceof emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify) {
          return mergeFrom((emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify other) {
        if (other == emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify.getDefaultInstance()) return this;
        if (other.getFallCount() != 0) {
          setFallCount(other.getFallCount());
        }
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
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
              case 56: {
                galleryId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 56
              case 80: {
                fallCount_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 80
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

      private int fallCount_ ;
      /**
       * <code>uint32 fall_count = 10;</code>
       * @return The fallCount.
       */
      @java.lang.Override
      public int getFallCount() {
        return fallCount_;
      }
      /**
       * <code>uint32 fall_count = 10;</code>
       * @param value The fallCount to set.
       * @return This builder for chaining.
       */
      public Builder setFallCount(int value) {
        
        fallCount_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 fall_count = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearFallCount() {
        bitField0_ = (bitField0_ & ~0x00000001);
        fallCount_ = 0;
        onChanged();
        return this;
      }

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 7;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 7;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:GalleryBrokenFloorFallNotify)
    }

    // @@protoc_insertion_point(class_scope:GalleryBrokenFloorFallNotify)
    private static final emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify();
    }

    public static emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GalleryBrokenFloorFallNotify>
        PARSER = new com.google.protobuf.AbstractParser<GalleryBrokenFloorFallNotify>() {
      @java.lang.Override
      public GalleryBrokenFloorFallNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<GalleryBrokenFloorFallNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GalleryBrokenFloorFallNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.GalleryBrokenFloorFallNotifyOuterClass.GalleryBrokenFloorFallNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GalleryBrokenFloorFallNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GalleryBrokenFloorFallNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"GalleryBrokenFloorFallNotify.proto\"F\n\034" +
      "GalleryBrokenFloorFallNotify\022\022\n\nfall_cou" +
      "nt\030\n \001(\r\022\022\n\ngallery_id\030\007 \001(\rB\030\n\026emu.ging" +
      "erps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GalleryBrokenFloorFallNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GalleryBrokenFloorFallNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GalleryBrokenFloorFallNotify_descriptor,
        new java.lang.String[] { "FallCount", "GalleryId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
