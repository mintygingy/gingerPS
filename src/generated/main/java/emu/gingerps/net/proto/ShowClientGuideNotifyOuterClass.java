// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ShowClientGuideNotify.proto

package emu.gingerps.net.proto;

public final class ShowClientGuideNotifyOuterClass {
  private ShowClientGuideNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ShowClientGuideNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ShowClientGuideNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string guide_name = 6;</code>
     * @return The guideName.
     */
    java.lang.String getGuideName();
    /**
     * <code>string guide_name = 6;</code>
     * @return The bytes for guideName.
     */
    com.google.protobuf.ByteString
        getGuideNameBytes();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 3369;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ShowClientGuideNotify}
   */
  public static final class ShowClientGuideNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ShowClientGuideNotify)
      ShowClientGuideNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ShowClientGuideNotify.newBuilder() to construct.
    private ShowClientGuideNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ShowClientGuideNotify() {
      guideName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ShowClientGuideNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.internal_static_ShowClientGuideNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.internal_static_ShowClientGuideNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify.class, emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify.Builder.class);
    }

    public static final int GUIDE_NAME_FIELD_NUMBER = 6;
    @SuppressWarnings("serial")
    private volatile java.lang.Object guideName_ = "";
    /**
     * <code>string guide_name = 6;</code>
     * @return The guideName.
     */
    @java.lang.Override
    public java.lang.String getGuideName() {
      java.lang.Object ref = guideName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        guideName_ = s;
        return s;
      }
    }
    /**
     * <code>string guide_name = 6;</code>
     * @return The bytes for guideName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getGuideNameBytes() {
      java.lang.Object ref = guideName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        guideName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(guideName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, guideName_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(guideName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, guideName_);
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
      if (!(obj instanceof emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify other = (emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify) obj;

      if (!getGuideName()
          .equals(other.getGuideName())) return false;
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
      hash = (37 * hash) + GUIDE_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getGuideName().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify prototype) {
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
     *   CMD_ID = 3369;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ShowClientGuideNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ShowClientGuideNotify)
        emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.internal_static_ShowClientGuideNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.internal_static_ShowClientGuideNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify.class, emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify.newBuilder()
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
        guideName_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.internal_static_ShowClientGuideNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify build() {
        emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify buildPartial() {
        emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify result = new emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.guideName_ = guideName_;
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
        if (other instanceof emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify) {
          return mergeFrom((emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify other) {
        if (other == emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify.getDefaultInstance()) return this;
        if (!other.getGuideName().isEmpty()) {
          guideName_ = other.guideName_;
          bitField0_ |= 0x00000001;
          onChanged();
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
              case 50: {
                guideName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 50
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

      private java.lang.Object guideName_ = "";
      /**
       * <code>string guide_name = 6;</code>
       * @return The guideName.
       */
      public java.lang.String getGuideName() {
        java.lang.Object ref = guideName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          guideName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string guide_name = 6;</code>
       * @return The bytes for guideName.
       */
      public com.google.protobuf.ByteString
          getGuideNameBytes() {
        java.lang.Object ref = guideName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          guideName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string guide_name = 6;</code>
       * @param value The guideName to set.
       * @return This builder for chaining.
       */
      public Builder setGuideName(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        guideName_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string guide_name = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuideName() {
        guideName_ = getDefaultInstance().getGuideName();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string guide_name = 6;</code>
       * @param value The bytes for guideName to set.
       * @return This builder for chaining.
       */
      public Builder setGuideNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        guideName_ = value;
        bitField0_ |= 0x00000001;
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


      // @@protoc_insertion_point(builder_scope:ShowClientGuideNotify)
    }

    // @@protoc_insertion_point(class_scope:ShowClientGuideNotify)
    private static final emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify();
    }

    public static emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ShowClientGuideNotify>
        PARSER = new com.google.protobuf.AbstractParser<ShowClientGuideNotify>() {
      @java.lang.Override
      public ShowClientGuideNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<ShowClientGuideNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ShowClientGuideNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.ShowClientGuideNotifyOuterClass.ShowClientGuideNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ShowClientGuideNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ShowClientGuideNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033ShowClientGuideNotify.proto\"+\n\025ShowCli" +
      "entGuideNotify\022\022\n\nguide_name\030\006 \001(\tB\030\n\026em" +
      "u.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ShowClientGuideNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ShowClientGuideNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ShowClientGuideNotify_descriptor,
        new java.lang.String[] { "GuideName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
