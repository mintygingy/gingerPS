// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SegmentCRCInfo.proto

package emu.gingerps.net.proto;

public final class SegmentCRCInfoOuterClass {
  private SegmentCRCInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SegmentCRCInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SegmentCRCInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 size = 6;</code>
     * @return The size.
     */
    int getSize();

    /**
     * <code>string crc = 8;</code>
     * @return The crc.
     */
    java.lang.String getCrc();
    /**
     * <code>string crc = 8;</code>
     * @return The bytes for crc.
     */
    com.google.protobuf.ByteString
        getCrcBytes();

    /**
     * <code>uint32 module = 4;</code>
     * @return The module.
     */
    int getModule();

    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 offset = 9;</code>
     * @return The offset.
     */
    int getOffset();
  }
  /**
   * Protobuf type {@code SegmentCRCInfo}
   */
  public static final class SegmentCRCInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SegmentCRCInfo)
      SegmentCRCInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SegmentCRCInfo.newBuilder() to construct.
    private SegmentCRCInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SegmentCRCInfo() {
      crc_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SegmentCRCInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SegmentCRCInfo(
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
            case 24: {

              retcode_ = input.readInt32();
              break;
            }
            case 32: {

              module_ = input.readUInt32();
              break;
            }
            case 48: {

              size_ = input.readUInt32();
              break;
            }
            case 66: {
              java.lang.String s = input.readStringRequireUtf8();

              crc_ = s;
              break;
            }
            case 72: {

              offset_ = input.readUInt32();
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
      return emu.gingerps.net.proto.SegmentCRCInfoOuterClass.internal_static_SegmentCRCInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.SegmentCRCInfoOuterClass.internal_static_SegmentCRCInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo.class, emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo.Builder.class);
    }

    public static final int SIZE_FIELD_NUMBER = 6;
    private int size_;
    /**
     * <code>uint32 size = 6;</code>
     * @return The size.
     */
    @java.lang.Override
    public int getSize() {
      return size_;
    }

    public static final int CRC_FIELD_NUMBER = 8;
    private volatile java.lang.Object crc_;
    /**
     * <code>string crc = 8;</code>
     * @return The crc.
     */
    @java.lang.Override
    public java.lang.String getCrc() {
      java.lang.Object ref = crc_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        crc_ = s;
        return s;
      }
    }
    /**
     * <code>string crc = 8;</code>
     * @return The bytes for crc.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCrcBytes() {
      java.lang.Object ref = crc_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        crc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MODULE_FIELD_NUMBER = 4;
    private int module_;
    /**
     * <code>uint32 module = 4;</code>
     * @return The module.
     */
    @java.lang.Override
    public int getModule() {
      return module_;
    }

    public static final int RETCODE_FIELD_NUMBER = 3;
    private int retcode_;
    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int OFFSET_FIELD_NUMBER = 9;
    private int offset_;
    /**
     * <code>uint32 offset = 9;</code>
     * @return The offset.
     */
    @java.lang.Override
    public int getOffset() {
      return offset_;
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
        output.writeInt32(3, retcode_);
      }
      if (module_ != 0) {
        output.writeUInt32(4, module_);
      }
      if (size_ != 0) {
        output.writeUInt32(6, size_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(crc_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 8, crc_);
      }
      if (offset_ != 0) {
        output.writeUInt32(9, offset_);
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
          .computeInt32Size(3, retcode_);
      }
      if (module_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, module_);
      }
      if (size_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, size_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(crc_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, crc_);
      }
      if (offset_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, offset_);
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
      if (!(obj instanceof emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo other = (emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo) obj;

      if (getSize()
          != other.getSize()) return false;
      if (!getCrc()
          .equals(other.getCrc())) return false;
      if (getModule()
          != other.getModule()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getOffset()
          != other.getOffset()) return false;
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
      hash = (37 * hash) + SIZE_FIELD_NUMBER;
      hash = (53 * hash) + getSize();
      hash = (37 * hash) + CRC_FIELD_NUMBER;
      hash = (53 * hash) + getCrc().hashCode();
      hash = (37 * hash) + MODULE_FIELD_NUMBER;
      hash = (53 * hash) + getModule();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + OFFSET_FIELD_NUMBER;
      hash = (53 * hash) + getOffset();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo prototype) {
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
     * Protobuf type {@code SegmentCRCInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SegmentCRCInfo)
        emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.SegmentCRCInfoOuterClass.internal_static_SegmentCRCInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.SegmentCRCInfoOuterClass.internal_static_SegmentCRCInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo.class, emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo.newBuilder()
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
        size_ = 0;

        crc_ = "";

        module_ = 0;

        retcode_ = 0;

        offset_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.SegmentCRCInfoOuterClass.internal_static_SegmentCRCInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo build() {
        emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo buildPartial() {
        emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo result = new emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo(this);
        result.size_ = size_;
        result.crc_ = crc_;
        result.module_ = module_;
        result.retcode_ = retcode_;
        result.offset_ = offset_;
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
        if (other instanceof emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo) {
          return mergeFrom((emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo other) {
        if (other == emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo.getDefaultInstance()) return this;
        if (other.getSize() != 0) {
          setSize(other.getSize());
        }
        if (!other.getCrc().isEmpty()) {
          crc_ = other.crc_;
          onChanged();
        }
        if (other.getModule() != 0) {
          setModule(other.getModule());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getOffset() != 0) {
          setOffset(other.getOffset());
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
        emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int size_ ;
      /**
       * <code>uint32 size = 6;</code>
       * @return The size.
       */
      @java.lang.Override
      public int getSize() {
        return size_;
      }
      /**
       * <code>uint32 size = 6;</code>
       * @param value The size to set.
       * @return This builder for chaining.
       */
      public Builder setSize(int value) {
        
        size_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 size = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearSize() {
        
        size_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object crc_ = "";
      /**
       * <code>string crc = 8;</code>
       * @return The crc.
       */
      public java.lang.String getCrc() {
        java.lang.Object ref = crc_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          crc_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string crc = 8;</code>
       * @return The bytes for crc.
       */
      public com.google.protobuf.ByteString
          getCrcBytes() {
        java.lang.Object ref = crc_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          crc_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string crc = 8;</code>
       * @param value The crc to set.
       * @return This builder for chaining.
       */
      public Builder setCrc(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        crc_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string crc = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearCrc() {
        
        crc_ = getDefaultInstance().getCrc();
        onChanged();
        return this;
      }
      /**
       * <code>string crc = 8;</code>
       * @param value The bytes for crc to set.
       * @return This builder for chaining.
       */
      public Builder setCrcBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        crc_ = value;
        onChanged();
        return this;
      }

      private int module_ ;
      /**
       * <code>uint32 module = 4;</code>
       * @return The module.
       */
      @java.lang.Override
      public int getModule() {
        return module_;
      }
      /**
       * <code>uint32 module = 4;</code>
       * @param value The module to set.
       * @return This builder for chaining.
       */
      public Builder setModule(int value) {
        
        module_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 module = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearModule() {
        
        module_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 3;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int offset_ ;
      /**
       * <code>uint32 offset = 9;</code>
       * @return The offset.
       */
      @java.lang.Override
      public int getOffset() {
        return offset_;
      }
      /**
       * <code>uint32 offset = 9;</code>
       * @param value The offset to set.
       * @return This builder for chaining.
       */
      public Builder setOffset(int value) {
        
        offset_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 offset = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearOffset() {
        
        offset_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SegmentCRCInfo)
    }

    // @@protoc_insertion_point(class_scope:SegmentCRCInfo)
    private static final emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo();
    }

    public static emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SegmentCRCInfo>
        PARSER = new com.google.protobuf.AbstractParser<SegmentCRCInfo>() {
      @java.lang.Override
      public SegmentCRCInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SegmentCRCInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SegmentCRCInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SegmentCRCInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.SegmentCRCInfoOuterClass.SegmentCRCInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SegmentCRCInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SegmentCRCInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024SegmentCRCInfo.proto\"\\\n\016SegmentCRCInfo" +
      "\022\014\n\004size\030\006 \001(\r\022\013\n\003crc\030\010 \001(\t\022\016\n\006module\030\004 " +
      "\001(\r\022\017\n\007retcode\030\003 \001(\005\022\016\n\006offset\030\t \001(\rB\030\n\026" +
      "emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SegmentCRCInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SegmentCRCInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SegmentCRCInfo_descriptor,
        new java.lang.String[] { "Size", "Crc", "Module", "Retcode", "Offset", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
