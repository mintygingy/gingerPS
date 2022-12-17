// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGGrowthLevelNotify.proto

package emu.gingerps.net.proto;

public final class GCGGrowthLevelNotifyOuterClass {
  private GCGGrowthLevelNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGGrowthLevelNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGGrowthLevelNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level = 10;</code>
     * @return The level.
     */
    int getLevel();

    /**
     * <code>uint32 exp = 2;</code>
     * @return The exp.
     */
    int getExp();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 7343;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GCGGrowthLevelNotify}
   */
  public static final class GCGGrowthLevelNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGGrowthLevelNotify)
      GCGGrowthLevelNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGGrowthLevelNotify.newBuilder() to construct.
    private GCGGrowthLevelNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGGrowthLevelNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGGrowthLevelNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGGrowthLevelNotify(
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
            case 16: {

              exp_ = input.readUInt32();
              break;
            }
            case 80: {

              level_ = input.readUInt32();
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
      return emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.internal_static_GCGGrowthLevelNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.internal_static_GCGGrowthLevelNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify.class, emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify.Builder.class);
    }

    public static final int LEVEL_FIELD_NUMBER = 10;
    private int level_;
    /**
     * <code>uint32 level = 10;</code>
     * @return The level.
     */
    @java.lang.Override
    public int getLevel() {
      return level_;
    }

    public static final int EXP_FIELD_NUMBER = 2;
    private int exp_;
    /**
     * <code>uint32 exp = 2;</code>
     * @return The exp.
     */
    @java.lang.Override
    public int getExp() {
      return exp_;
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
      if (exp_ != 0) {
        output.writeUInt32(2, exp_);
      }
      if (level_ != 0) {
        output.writeUInt32(10, level_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (exp_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, exp_);
      }
      if (level_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, level_);
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
      if (!(obj instanceof emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify other = (emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify) obj;

      if (getLevel()
          != other.getLevel()) return false;
      if (getExp()
          != other.getExp()) return false;
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
      hash = (37 * hash) + LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getLevel();
      hash = (37 * hash) + EXP_FIELD_NUMBER;
      hash = (53 * hash) + getExp();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify prototype) {
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
     *   CMD_ID = 7343;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GCGGrowthLevelNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGGrowthLevelNotify)
        emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.internal_static_GCGGrowthLevelNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.internal_static_GCGGrowthLevelNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify.class, emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify.newBuilder()
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
        level_ = 0;

        exp_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.internal_static_GCGGrowthLevelNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify build() {
        emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify buildPartial() {
        emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify result = new emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify(this);
        result.level_ = level_;
        result.exp_ = exp_;
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
        if (other instanceof emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify) {
          return mergeFrom((emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify other) {
        if (other == emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify.getDefaultInstance()) return this;
        if (other.getLevel() != 0) {
          setLevel(other.getLevel());
        }
        if (other.getExp() != 0) {
          setExp(other.getExp());
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
        emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int level_ ;
      /**
       * <code>uint32 level = 10;</code>
       * @return The level.
       */
      @java.lang.Override
      public int getLevel() {
        return level_;
      }
      /**
       * <code>uint32 level = 10;</code>
       * @param value The level to set.
       * @return This builder for chaining.
       */
      public Builder setLevel(int value) {
        
        level_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevel() {
        
        level_ = 0;
        onChanged();
        return this;
      }

      private int exp_ ;
      /**
       * <code>uint32 exp = 2;</code>
       * @return The exp.
       */
      @java.lang.Override
      public int getExp() {
        return exp_;
      }
      /**
       * <code>uint32 exp = 2;</code>
       * @param value The exp to set.
       * @return This builder for chaining.
       */
      public Builder setExp(int value) {
        
        exp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 exp = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearExp() {
        
        exp_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGGrowthLevelNotify)
    }

    // @@protoc_insertion_point(class_scope:GCGGrowthLevelNotify)
    private static final emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify();
    }

    public static emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGGrowthLevelNotify>
        PARSER = new com.google.protobuf.AbstractParser<GCGGrowthLevelNotify>() {
      @java.lang.Override
      public GCGGrowthLevelNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGGrowthLevelNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGGrowthLevelNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGGrowthLevelNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.GCGGrowthLevelNotifyOuterClass.GCGGrowthLevelNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGGrowthLevelNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGGrowthLevelNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032GCGGrowthLevelNotify.proto\"2\n\024GCGGrowt" +
      "hLevelNotify\022\r\n\005level\030\n \001(\r\022\013\n\003exp\030\002 \001(\r" +
      "B\030\n\026emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGGrowthLevelNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGGrowthLevelNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGGrowthLevelNotify_descriptor,
        new java.lang.String[] { "Level", "Exp", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
