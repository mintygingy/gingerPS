// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UgcNotify.proto

package emu.gingerps.net.proto;

public final class UgcNotifyOuterClass {
  private UgcNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UgcNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UgcNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool Unk3300_IBLDINGJJFI = 8;</code>
     * @return The unk3300IBLDINGJJFI.
     */
    boolean getUnk3300IBLDINGJJFI();

    /**
     * <code>bool is_ugc_feature_closed = 6;</code>
     * @return The isUgcFeatureClosed.
     */
    boolean getIsUgcFeatureClosed();

    /**
     * <code>bool Unk3300_KPABJPMLHCD = 9;</code>
     * @return The unk3300KPABJPMLHCD.
     */
    boolean getUnk3300KPABJPMLHCD();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 6308;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code UgcNotify}
   */
  public static final class UgcNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UgcNotify)
      UgcNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UgcNotify.newBuilder() to construct.
    private UgcNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UgcNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UgcNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UgcNotify(
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
            case 48: {

              isUgcFeatureClosed_ = input.readBool();
              break;
            }
            case 64: {

              unk3300IBLDINGJJFI_ = input.readBool();
              break;
            }
            case 72: {

              unk3300KPABJPMLHCD_ = input.readBool();
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
      return emu.gingerps.net.proto.UgcNotifyOuterClass.internal_static_UgcNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.UgcNotifyOuterClass.internal_static_UgcNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify.class, emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify.Builder.class);
    }

    public static final int UNK3300_IBLDINGJJFI_FIELD_NUMBER = 8;
    private boolean unk3300IBLDINGJJFI_;
    /**
     * <code>bool Unk3300_IBLDINGJJFI = 8;</code>
     * @return The unk3300IBLDINGJJFI.
     */
    @java.lang.Override
    public boolean getUnk3300IBLDINGJJFI() {
      return unk3300IBLDINGJJFI_;
    }

    public static final int IS_UGC_FEATURE_CLOSED_FIELD_NUMBER = 6;
    private boolean isUgcFeatureClosed_;
    /**
     * <code>bool is_ugc_feature_closed = 6;</code>
     * @return The isUgcFeatureClosed.
     */
    @java.lang.Override
    public boolean getIsUgcFeatureClosed() {
      return isUgcFeatureClosed_;
    }

    public static final int UNK3300_KPABJPMLHCD_FIELD_NUMBER = 9;
    private boolean unk3300KPABJPMLHCD_;
    /**
     * <code>bool Unk3300_KPABJPMLHCD = 9;</code>
     * @return The unk3300KPABJPMLHCD.
     */
    @java.lang.Override
    public boolean getUnk3300KPABJPMLHCD() {
      return unk3300KPABJPMLHCD_;
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
      if (isUgcFeatureClosed_ != false) {
        output.writeBool(6, isUgcFeatureClosed_);
      }
      if (unk3300IBLDINGJJFI_ != false) {
        output.writeBool(8, unk3300IBLDINGJJFI_);
      }
      if (unk3300KPABJPMLHCD_ != false) {
        output.writeBool(9, unk3300KPABJPMLHCD_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isUgcFeatureClosed_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isUgcFeatureClosed_);
      }
      if (unk3300IBLDINGJJFI_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, unk3300IBLDINGJJFI_);
      }
      if (unk3300KPABJPMLHCD_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, unk3300KPABJPMLHCD_);
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
      if (!(obj instanceof emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify other = (emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify) obj;

      if (getUnk3300IBLDINGJJFI()
          != other.getUnk3300IBLDINGJJFI()) return false;
      if (getIsUgcFeatureClosed()
          != other.getIsUgcFeatureClosed()) return false;
      if (getUnk3300KPABJPMLHCD()
          != other.getUnk3300KPABJPMLHCD()) return false;
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
      hash = (37 * hash) + UNK3300_IBLDINGJJFI_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3300IBLDINGJJFI());
      hash = (37 * hash) + IS_UGC_FEATURE_CLOSED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsUgcFeatureClosed());
      hash = (37 * hash) + UNK3300_KPABJPMLHCD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3300KPABJPMLHCD());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify prototype) {
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
     *   CMD_ID = 6308;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code UgcNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UgcNotify)
        emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.UgcNotifyOuterClass.internal_static_UgcNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.UgcNotifyOuterClass.internal_static_UgcNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify.class, emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify.newBuilder()
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
        unk3300IBLDINGJJFI_ = false;

        isUgcFeatureClosed_ = false;

        unk3300KPABJPMLHCD_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.UgcNotifyOuterClass.internal_static_UgcNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify build() {
        emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify buildPartial() {
        emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify result = new emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify(this);
        result.unk3300IBLDINGJJFI_ = unk3300IBLDINGJJFI_;
        result.isUgcFeatureClosed_ = isUgcFeatureClosed_;
        result.unk3300KPABJPMLHCD_ = unk3300KPABJPMLHCD_;
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
        if (other instanceof emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify) {
          return mergeFrom((emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify other) {
        if (other == emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify.getDefaultInstance()) return this;
        if (other.getUnk3300IBLDINGJJFI() != false) {
          setUnk3300IBLDINGJJFI(other.getUnk3300IBLDINGJJFI());
        }
        if (other.getIsUgcFeatureClosed() != false) {
          setIsUgcFeatureClosed(other.getIsUgcFeatureClosed());
        }
        if (other.getUnk3300KPABJPMLHCD() != false) {
          setUnk3300KPABJPMLHCD(other.getUnk3300KPABJPMLHCD());
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
        emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean unk3300IBLDINGJJFI_ ;
      /**
       * <code>bool Unk3300_IBLDINGJJFI = 8;</code>
       * @return The unk3300IBLDINGJJFI.
       */
      @java.lang.Override
      public boolean getUnk3300IBLDINGJJFI() {
        return unk3300IBLDINGJJFI_;
      }
      /**
       * <code>bool Unk3300_IBLDINGJJFI = 8;</code>
       * @param value The unk3300IBLDINGJJFI to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300IBLDINGJJFI(boolean value) {
        
        unk3300IBLDINGJJFI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3300_IBLDINGJJFI = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300IBLDINGJJFI() {
        
        unk3300IBLDINGJJFI_ = false;
        onChanged();
        return this;
      }

      private boolean isUgcFeatureClosed_ ;
      /**
       * <code>bool is_ugc_feature_closed = 6;</code>
       * @return The isUgcFeatureClosed.
       */
      @java.lang.Override
      public boolean getIsUgcFeatureClosed() {
        return isUgcFeatureClosed_;
      }
      /**
       * <code>bool is_ugc_feature_closed = 6;</code>
       * @param value The isUgcFeatureClosed to set.
       * @return This builder for chaining.
       */
      public Builder setIsUgcFeatureClosed(boolean value) {
        
        isUgcFeatureClosed_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_ugc_feature_closed = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsUgcFeatureClosed() {
        
        isUgcFeatureClosed_ = false;
        onChanged();
        return this;
      }

      private boolean unk3300KPABJPMLHCD_ ;
      /**
       * <code>bool Unk3300_KPABJPMLHCD = 9;</code>
       * @return The unk3300KPABJPMLHCD.
       */
      @java.lang.Override
      public boolean getUnk3300KPABJPMLHCD() {
        return unk3300KPABJPMLHCD_;
      }
      /**
       * <code>bool Unk3300_KPABJPMLHCD = 9;</code>
       * @param value The unk3300KPABJPMLHCD to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300KPABJPMLHCD(boolean value) {
        
        unk3300KPABJPMLHCD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3300_KPABJPMLHCD = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300KPABJPMLHCD() {
        
        unk3300KPABJPMLHCD_ = false;
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


      // @@protoc_insertion_point(builder_scope:UgcNotify)
    }

    // @@protoc_insertion_point(class_scope:UgcNotify)
    private static final emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify();
    }

    public static emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UgcNotify>
        PARSER = new com.google.protobuf.AbstractParser<UgcNotify>() {
      @java.lang.Override
      public UgcNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UgcNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UgcNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UgcNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.UgcNotifyOuterClass.UgcNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UgcNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UgcNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017UgcNotify.proto\"d\n\tUgcNotify\022\033\n\023Unk330" +
      "0_IBLDINGJJFI\030\010 \001(\010\022\035\n\025is_ugc_feature_cl" +
      "osed\030\006 \001(\010\022\033\n\023Unk3300_KPABJPMLHCD\030\t \001(\010B" +
      "\033\n\031emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UgcNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UgcNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UgcNotify_descriptor,
        new java.lang.String[] { "Unk3300IBLDINGJJFI", "IsUgcFeatureClosed", "Unk3300KPABJPMLHCD", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
