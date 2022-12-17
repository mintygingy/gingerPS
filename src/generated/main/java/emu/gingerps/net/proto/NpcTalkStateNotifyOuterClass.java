// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NpcTalkStateNotify.proto

package emu.gingerps.net.proto;

public final class NpcTalkStateNotifyOuterClass {
  private NpcTalkStateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NpcTalkStateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NpcTalkStateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_ban = 2;</code>
     * @return The isBan.
     */
    boolean getIsBan();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 450;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code NpcTalkStateNotify}
   */
  public static final class NpcTalkStateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:NpcTalkStateNotify)
      NpcTalkStateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NpcTalkStateNotify.newBuilder() to construct.
    private NpcTalkStateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NpcTalkStateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new NpcTalkStateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.internal_static_NpcTalkStateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.internal_static_NpcTalkStateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify.class, emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify.Builder.class);
    }

    public static final int IS_BAN_FIELD_NUMBER = 2;
    private boolean isBan_ = false;
    /**
     * <code>bool is_ban = 2;</code>
     * @return The isBan.
     */
    @java.lang.Override
    public boolean getIsBan() {
      return isBan_;
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
      if (isBan_ != false) {
        output.writeBool(2, isBan_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isBan_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isBan_);
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
      if (!(obj instanceof emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify other = (emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify) obj;

      if (getIsBan()
          != other.getIsBan()) return false;
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
      hash = (37 * hash) + IS_BAN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsBan());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify prototype) {
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
     *   CMD_ID = 450;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code NpcTalkStateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NpcTalkStateNotify)
        emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.internal_static_NpcTalkStateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.internal_static_NpcTalkStateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify.class, emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify.newBuilder()
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
        isBan_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.internal_static_NpcTalkStateNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify build() {
        emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify buildPartial() {
        emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify result = new emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isBan_ = isBan_;
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
        if (other instanceof emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify) {
          return mergeFrom((emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify other) {
        if (other == emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify.getDefaultInstance()) return this;
        if (other.getIsBan() != false) {
          setIsBan(other.getIsBan());
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
              case 16: {
                isBan_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 16
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

      private boolean isBan_ ;
      /**
       * <code>bool is_ban = 2;</code>
       * @return The isBan.
       */
      @java.lang.Override
      public boolean getIsBan() {
        return isBan_;
      }
      /**
       * <code>bool is_ban = 2;</code>
       * @param value The isBan to set.
       * @return This builder for chaining.
       */
      public Builder setIsBan(boolean value) {
        
        isBan_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_ban = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsBan() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isBan_ = false;
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


      // @@protoc_insertion_point(builder_scope:NpcTalkStateNotify)
    }

    // @@protoc_insertion_point(class_scope:NpcTalkStateNotify)
    private static final emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify();
    }

    public static emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NpcTalkStateNotify>
        PARSER = new com.google.protobuf.AbstractParser<NpcTalkStateNotify>() {
      @java.lang.Override
      public NpcTalkStateNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<NpcTalkStateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NpcTalkStateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.NpcTalkStateNotifyOuterClass.NpcTalkStateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NpcTalkStateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NpcTalkStateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030NpcTalkStateNotify.proto\"$\n\022NpcTalkSta" +
      "teNotify\022\016\n\006is_ban\030\002 \001(\010B\030\n\026emu.gingerps" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_NpcTalkStateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NpcTalkStateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NpcTalkStateNotify_descriptor,
        new java.lang.String[] { "IsBan", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
