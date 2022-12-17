// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PhotoGallerySettleInfo.proto

package emu.gingerps.net.proto;

public final class PhotoGallerySettleInfoOuterClass {
  private PhotoGallerySettleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PhotoGallerySettleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PhotoGallerySettleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.GalleryStopReason reason = 13;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.GalleryStopReason reason = 13;</code>
     * @return The reason.
     */
    emu.gingerps.net.proto.GalleryStopReasonOuterClass.GalleryStopReason getReason();
  }
  /**
   * Protobuf type {@code PhotoGallerySettleInfo}
   */
  public static final class PhotoGallerySettleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PhotoGallerySettleInfo)
      PhotoGallerySettleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PhotoGallerySettleInfo.newBuilder() to construct.
    private PhotoGallerySettleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PhotoGallerySettleInfo() {
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PhotoGallerySettleInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PhotoGallerySettleInfo(
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
            case 104: {
              int rawValue = input.readEnum();

              reason_ = rawValue;
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
      return emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.internal_static_PhotoGallerySettleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.internal_static_PhotoGallerySettleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo.class, emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo.Builder.class);
    }

    public static final int REASON_FIELD_NUMBER = 13;
    private int reason_;
    /**
     * <code>.GalleryStopReason reason = 13;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.GalleryStopReason reason = 13;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.gingerps.net.proto.GalleryStopReasonOuterClass.GalleryStopReason getReason() {
      @SuppressWarnings("deprecation")
      emu.gingerps.net.proto.GalleryStopReasonOuterClass.GalleryStopReason result = emu.gingerps.net.proto.GalleryStopReasonOuterClass.GalleryStopReason.valueOf(reason_);
      return result == null ? emu.gingerps.net.proto.GalleryStopReasonOuterClass.GalleryStopReason.UNRECOGNIZED : result;
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
      if (reason_ != emu.gingerps.net.proto.GalleryStopReasonOuterClass.GalleryStopReason.GALLERY_STOP_REASON_NONE.getNumber()) {
        output.writeEnum(13, reason_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (reason_ != emu.gingerps.net.proto.GalleryStopReasonOuterClass.GalleryStopReason.GALLERY_STOP_REASON_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(13, reason_);
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
      if (!(obj instanceof emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo other = (emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo) obj;

      if (reason_ != other.reason_) return false;
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
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo prototype) {
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
     * Protobuf type {@code PhotoGallerySettleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PhotoGallerySettleInfo)
        emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.internal_static_PhotoGallerySettleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.internal_static_PhotoGallerySettleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo.class, emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo.newBuilder()
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
        reason_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.internal_static_PhotoGallerySettleInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo build() {
        emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo buildPartial() {
        emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo result = new emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo(this);
        result.reason_ = reason_;
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
        if (other instanceof emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo) {
          return mergeFrom((emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo other) {
        if (other == emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo.getDefaultInstance()) return this;
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
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
        emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.GalleryStopReason reason = 13;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.GalleryStopReason reason = 13;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GalleryStopReason reason = 13;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.gingerps.net.proto.GalleryStopReasonOuterClass.GalleryStopReason getReason() {
        @SuppressWarnings("deprecation")
        emu.gingerps.net.proto.GalleryStopReasonOuterClass.GalleryStopReason result = emu.gingerps.net.proto.GalleryStopReasonOuterClass.GalleryStopReason.valueOf(reason_);
        return result == null ? emu.gingerps.net.proto.GalleryStopReasonOuterClass.GalleryStopReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.GalleryStopReason reason = 13;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.gingerps.net.proto.GalleryStopReasonOuterClass.GalleryStopReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GalleryStopReason reason = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PhotoGallerySettleInfo)
    }

    // @@protoc_insertion_point(class_scope:PhotoGallerySettleInfo)
    private static final emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo();
    }

    public static emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PhotoGallerySettleInfo>
        PARSER = new com.google.protobuf.AbstractParser<PhotoGallerySettleInfo>() {
      @java.lang.Override
      public PhotoGallerySettleInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PhotoGallerySettleInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PhotoGallerySettleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PhotoGallerySettleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.PhotoGallerySettleInfoOuterClass.PhotoGallerySettleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PhotoGallerySettleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PhotoGallerySettleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034PhotoGallerySettleInfo.proto\032\027GalleryS" +
      "topReason.proto\"<\n\026PhotoGallerySettleInf" +
      "o\022\"\n\006reason\030\r \001(\0162\022.GalleryStopReasonB\030\n" +
      "\026emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.GalleryStopReasonOuterClass.getDescriptor(),
        });
    internal_static_PhotoGallerySettleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PhotoGallerySettleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PhotoGallerySettleInfo_descriptor,
        new java.lang.String[] { "Reason", });
    emu.gingerps.net.proto.GalleryStopReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
