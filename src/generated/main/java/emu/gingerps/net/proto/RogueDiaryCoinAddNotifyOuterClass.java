// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RogueDiaryCoinAddNotify.proto

package emu.gingerps.net.proto;

public final class RogueDiaryCoinAddNotifyOuterClass {
  private RogueDiaryCoinAddNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RogueDiaryCoinAddNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RogueDiaryCoinAddNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 num = 11;</code>
     * @return The num.
     */
    int getNum();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8525;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code RogueDiaryCoinAddNotify}
   */
  public static final class RogueDiaryCoinAddNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RogueDiaryCoinAddNotify)
      RogueDiaryCoinAddNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RogueDiaryCoinAddNotify.newBuilder() to construct.
    private RogueDiaryCoinAddNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RogueDiaryCoinAddNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RogueDiaryCoinAddNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.internal_static_RogueDiaryCoinAddNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.internal_static_RogueDiaryCoinAddNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify.class, emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify.Builder.class);
    }

    public static final int NUM_FIELD_NUMBER = 11;
    private int num_ = 0;
    /**
     * <code>uint32 num = 11;</code>
     * @return The num.
     */
    @java.lang.Override
    public int getNum() {
      return num_;
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
      if (num_ != 0) {
        output.writeUInt32(11, num_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (num_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, num_);
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
      if (!(obj instanceof emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify other = (emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify) obj;

      if (getNum()
          != other.getNum()) return false;
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
      hash = (37 * hash) + NUM_FIELD_NUMBER;
      hash = (53 * hash) + getNum();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify prototype) {
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
     *   CMD_ID = 8525;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code RogueDiaryCoinAddNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RogueDiaryCoinAddNotify)
        emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.internal_static_RogueDiaryCoinAddNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.internal_static_RogueDiaryCoinAddNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify.class, emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify.newBuilder()
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
        num_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.internal_static_RogueDiaryCoinAddNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify build() {
        emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify buildPartial() {
        emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify result = new emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.num_ = num_;
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
        if (other instanceof emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify) {
          return mergeFrom((emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify other) {
        if (other == emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify.getDefaultInstance()) return this;
        if (other.getNum() != 0) {
          setNum(other.getNum());
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
              case 88: {
                num_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 88
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

      private int num_ ;
      /**
       * <code>uint32 num = 11;</code>
       * @return The num.
       */
      @java.lang.Override
      public int getNum() {
        return num_;
      }
      /**
       * <code>uint32 num = 11;</code>
       * @param value The num to set.
       * @return This builder for chaining.
       */
      public Builder setNum(int value) {
        
        num_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 num = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearNum() {
        bitField0_ = (bitField0_ & ~0x00000001);
        num_ = 0;
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


      // @@protoc_insertion_point(builder_scope:RogueDiaryCoinAddNotify)
    }

    // @@protoc_insertion_point(class_scope:RogueDiaryCoinAddNotify)
    private static final emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify();
    }

    public static emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RogueDiaryCoinAddNotify>
        PARSER = new com.google.protobuf.AbstractParser<RogueDiaryCoinAddNotify>() {
      @java.lang.Override
      public RogueDiaryCoinAddNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<RogueDiaryCoinAddNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RogueDiaryCoinAddNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.RogueDiaryCoinAddNotifyOuterClass.RogueDiaryCoinAddNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RogueDiaryCoinAddNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RogueDiaryCoinAddNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035RogueDiaryCoinAddNotify.proto\"&\n\027Rogue" +
      "DiaryCoinAddNotify\022\013\n\003num\030\013 \001(\rB\030\n\026emu.g" +
      "ingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RogueDiaryCoinAddNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RogueDiaryCoinAddNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RogueDiaryCoinAddNotify_descriptor,
        new java.lang.String[] { "Num", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
