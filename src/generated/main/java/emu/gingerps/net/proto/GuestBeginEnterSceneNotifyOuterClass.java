// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GuestBeginEnterSceneNotify.proto

package emu.gingerps.net.proto;

public final class GuestBeginEnterSceneNotifyOuterClass {
  private GuestBeginEnterSceneNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GuestBeginEnterSceneNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GuestBeginEnterSceneNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 uid = 14;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>uint32 scene_id = 2;</code>
     * @return The sceneId.
     */
    int getSceneId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 3125;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GuestBeginEnterSceneNotify}
   */
  public static final class GuestBeginEnterSceneNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GuestBeginEnterSceneNotify)
      GuestBeginEnterSceneNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GuestBeginEnterSceneNotify.newBuilder() to construct.
    private GuestBeginEnterSceneNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GuestBeginEnterSceneNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GuestBeginEnterSceneNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GuestBeginEnterSceneNotify(
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

              sceneId_ = input.readUInt32();
              break;
            }
            case 112: {

              uid_ = input.readUInt32();
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
      return emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.internal_static_GuestBeginEnterSceneNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.internal_static_GuestBeginEnterSceneNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify.class, emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify.Builder.class);
    }

    public static final int UID_FIELD_NUMBER = 14;
    private int uid_;
    /**
     * <code>uint32 uid = 14;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int SCENE_ID_FIELD_NUMBER = 2;
    private int sceneId_;
    /**
     * <code>uint32 scene_id = 2;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
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
      if (sceneId_ != 0) {
        output.writeUInt32(2, sceneId_);
      }
      if (uid_ != 0) {
        output.writeUInt32(14, uid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, sceneId_);
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, uid_);
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
      if (!(obj instanceof emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify other = (emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify) obj;

      if (getUid()
          != other.getUid()) return false;
      if (getSceneId()
          != other.getSceneId()) return false;
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
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify prototype) {
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
     *   CMD_ID = 3125;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GuestBeginEnterSceneNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GuestBeginEnterSceneNotify)
        emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.internal_static_GuestBeginEnterSceneNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.internal_static_GuestBeginEnterSceneNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify.class, emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify.newBuilder()
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
        uid_ = 0;

        sceneId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.internal_static_GuestBeginEnterSceneNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify build() {
        emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify buildPartial() {
        emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify result = new emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify(this);
        result.uid_ = uid_;
        result.sceneId_ = sceneId_;
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
        if (other instanceof emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify) {
          return mergeFrom((emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify other) {
        if (other == emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
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
        emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 14;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 14;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 2;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 2;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        
        sceneId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GuestBeginEnterSceneNotify)
    }

    // @@protoc_insertion_point(class_scope:GuestBeginEnterSceneNotify)
    private static final emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify();
    }

    public static emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GuestBeginEnterSceneNotify>
        PARSER = new com.google.protobuf.AbstractParser<GuestBeginEnterSceneNotify>() {
      @java.lang.Override
      public GuestBeginEnterSceneNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GuestBeginEnterSceneNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GuestBeginEnterSceneNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GuestBeginEnterSceneNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.GuestBeginEnterSceneNotifyOuterClass.GuestBeginEnterSceneNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GuestBeginEnterSceneNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GuestBeginEnterSceneNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n GuestBeginEnterSceneNotify.proto\";\n\032Gu" +
      "estBeginEnterSceneNotify\022\013\n\003uid\030\016 \001(\r\022\020\n" +
      "\010scene_id\030\002 \001(\rB\033\n\031emu.gingerps.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GuestBeginEnterSceneNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GuestBeginEnterSceneNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GuestBeginEnterSceneNotify_descriptor,
        new java.lang.String[] { "Uid", "SceneId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
