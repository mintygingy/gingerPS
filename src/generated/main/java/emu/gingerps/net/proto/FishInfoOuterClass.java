// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FishInfo.proto

package emu.gingerps.net.proto;

public final class FishInfoOuterClass {
  private FishInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FishInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FishInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3300_AKFBFEDCELN = 14;</code>
     * @return The unk3300AKFBFEDCELN.
     */
    int getUnk3300AKFBFEDCELN();

    /**
     * <code>uint32 Unk3300_FIICLBEFHLL = 7;</code>
     * @return The unk3300FIICLBEFHLL.
     */
    int getUnk3300FIICLBEFHLL();
  }
  /**
   * Protobuf type {@code FishInfo}
   */
  public static final class FishInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FishInfo)
      FishInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FishInfo.newBuilder() to construct.
    private FishInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FishInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FishInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FishInfo(
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

              unk3300FIICLBEFHLL_ = input.readUInt32();
              break;
            }
            case 112: {

              unk3300AKFBFEDCELN_ = input.readUInt32();
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
      return emu.gingerps.net.proto.FishInfoOuterClass.internal_static_FishInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.FishInfoOuterClass.internal_static_FishInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.FishInfoOuterClass.FishInfo.class, emu.gingerps.net.proto.FishInfoOuterClass.FishInfo.Builder.class);
    }

    public static final int UNK3300_AKFBFEDCELN_FIELD_NUMBER = 14;
    private int unk3300AKFBFEDCELN_;
    /**
     * <code>uint32 Unk3300_AKFBFEDCELN = 14;</code>
     * @return The unk3300AKFBFEDCELN.
     */
    @java.lang.Override
    public int getUnk3300AKFBFEDCELN() {
      return unk3300AKFBFEDCELN_;
    }

    public static final int UNK3300_FIICLBEFHLL_FIELD_NUMBER = 7;
    private int unk3300FIICLBEFHLL_;
    /**
     * <code>uint32 Unk3300_FIICLBEFHLL = 7;</code>
     * @return The unk3300FIICLBEFHLL.
     */
    @java.lang.Override
    public int getUnk3300FIICLBEFHLL() {
      return unk3300FIICLBEFHLL_;
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
      if (unk3300FIICLBEFHLL_ != 0) {
        output.writeUInt32(7, unk3300FIICLBEFHLL_);
      }
      if (unk3300AKFBFEDCELN_ != 0) {
        output.writeUInt32(14, unk3300AKFBFEDCELN_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300FIICLBEFHLL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, unk3300FIICLBEFHLL_);
      }
      if (unk3300AKFBFEDCELN_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, unk3300AKFBFEDCELN_);
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
      if (!(obj instanceof emu.gingerps.net.proto.FishInfoOuterClass.FishInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.FishInfoOuterClass.FishInfo other = (emu.gingerps.net.proto.FishInfoOuterClass.FishInfo) obj;

      if (getUnk3300AKFBFEDCELN()
          != other.getUnk3300AKFBFEDCELN()) return false;
      if (getUnk3300FIICLBEFHLL()
          != other.getUnk3300FIICLBEFHLL()) return false;
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
      hash = (37 * hash) + UNK3300_AKFBFEDCELN_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300AKFBFEDCELN();
      hash = (37 * hash) + UNK3300_FIICLBEFHLL_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300FIICLBEFHLL();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.FishInfoOuterClass.FishInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.FishInfoOuterClass.FishInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FishInfoOuterClass.FishInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.FishInfoOuterClass.FishInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FishInfoOuterClass.FishInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.FishInfoOuterClass.FishInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FishInfoOuterClass.FishInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.FishInfoOuterClass.FishInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FishInfoOuterClass.FishInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.FishInfoOuterClass.FishInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.FishInfoOuterClass.FishInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.FishInfoOuterClass.FishInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.FishInfoOuterClass.FishInfo prototype) {
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
     * Protobuf type {@code FishInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FishInfo)
        emu.gingerps.net.proto.FishInfoOuterClass.FishInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.FishInfoOuterClass.internal_static_FishInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.FishInfoOuterClass.internal_static_FishInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.FishInfoOuterClass.FishInfo.class, emu.gingerps.net.proto.FishInfoOuterClass.FishInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.FishInfoOuterClass.FishInfo.newBuilder()
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
        unk3300AKFBFEDCELN_ = 0;

        unk3300FIICLBEFHLL_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.FishInfoOuterClass.internal_static_FishInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.FishInfoOuterClass.FishInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.FishInfoOuterClass.FishInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.FishInfoOuterClass.FishInfo build() {
        emu.gingerps.net.proto.FishInfoOuterClass.FishInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.FishInfoOuterClass.FishInfo buildPartial() {
        emu.gingerps.net.proto.FishInfoOuterClass.FishInfo result = new emu.gingerps.net.proto.FishInfoOuterClass.FishInfo(this);
        result.unk3300AKFBFEDCELN_ = unk3300AKFBFEDCELN_;
        result.unk3300FIICLBEFHLL_ = unk3300FIICLBEFHLL_;
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
        if (other instanceof emu.gingerps.net.proto.FishInfoOuterClass.FishInfo) {
          return mergeFrom((emu.gingerps.net.proto.FishInfoOuterClass.FishInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.FishInfoOuterClass.FishInfo other) {
        if (other == emu.gingerps.net.proto.FishInfoOuterClass.FishInfo.getDefaultInstance()) return this;
        if (other.getUnk3300AKFBFEDCELN() != 0) {
          setUnk3300AKFBFEDCELN(other.getUnk3300AKFBFEDCELN());
        }
        if (other.getUnk3300FIICLBEFHLL() != 0) {
          setUnk3300FIICLBEFHLL(other.getUnk3300FIICLBEFHLL());
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
        emu.gingerps.net.proto.FishInfoOuterClass.FishInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.FishInfoOuterClass.FishInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int unk3300AKFBFEDCELN_ ;
      /**
       * <code>uint32 Unk3300_AKFBFEDCELN = 14;</code>
       * @return The unk3300AKFBFEDCELN.
       */
      @java.lang.Override
      public int getUnk3300AKFBFEDCELN() {
        return unk3300AKFBFEDCELN_;
      }
      /**
       * <code>uint32 Unk3300_AKFBFEDCELN = 14;</code>
       * @param value The unk3300AKFBFEDCELN to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300AKFBFEDCELN(int value) {
        
        unk3300AKFBFEDCELN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_AKFBFEDCELN = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300AKFBFEDCELN() {
        
        unk3300AKFBFEDCELN_ = 0;
        onChanged();
        return this;
      }

      private int unk3300FIICLBEFHLL_ ;
      /**
       * <code>uint32 Unk3300_FIICLBEFHLL = 7;</code>
       * @return The unk3300FIICLBEFHLL.
       */
      @java.lang.Override
      public int getUnk3300FIICLBEFHLL() {
        return unk3300FIICLBEFHLL_;
      }
      /**
       * <code>uint32 Unk3300_FIICLBEFHLL = 7;</code>
       * @param value The unk3300FIICLBEFHLL to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300FIICLBEFHLL(int value) {
        
        unk3300FIICLBEFHLL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_FIICLBEFHLL = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300FIICLBEFHLL() {
        
        unk3300FIICLBEFHLL_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FishInfo)
    }

    // @@protoc_insertion_point(class_scope:FishInfo)
    private static final emu.gingerps.net.proto.FishInfoOuterClass.FishInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.FishInfoOuterClass.FishInfo();
    }

    public static emu.gingerps.net.proto.FishInfoOuterClass.FishInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FishInfo>
        PARSER = new com.google.protobuf.AbstractParser<FishInfo>() {
      @java.lang.Override
      public FishInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FishInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FishInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FishInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.FishInfoOuterClass.FishInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FishInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FishInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016FishInfo.proto\"D\n\010FishInfo\022\033\n\023Unk3300_" +
      "AKFBFEDCELN\030\016 \001(\r\022\033\n\023Unk3300_FIICLBEFHLL" +
      "\030\007 \001(\rB\030\n\026emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FishInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FishInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FishInfo_descriptor,
        new java.lang.String[] { "Unk3300AKFBFEDCELN", "Unk3300FIICLBEFHLL", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
