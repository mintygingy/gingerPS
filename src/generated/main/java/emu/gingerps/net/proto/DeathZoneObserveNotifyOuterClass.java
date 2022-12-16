// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DeathZoneObserveNotify.proto

package emu.gingerps.net.proto;

public final class DeathZoneObserveNotifyOuterClass {
  private DeathZoneObserveNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DeathZoneObserveNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DeathZoneObserveNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 source_entity_id = 2;</code>
     * @return The sourceEntityId.
     */
    int getSourceEntityId();

    /**
     * <code>uint32 target_entity_id = 5;</code>
     * @return The targetEntityId.
     */
    int getTargetEntityId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 3062;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code DeathZoneObserveNotify}
   */
  public static final class DeathZoneObserveNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DeathZoneObserveNotify)
      DeathZoneObserveNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DeathZoneObserveNotify.newBuilder() to construct.
    private DeathZoneObserveNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DeathZoneObserveNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DeathZoneObserveNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DeathZoneObserveNotify(
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

              sourceEntityId_ = input.readUInt32();
              break;
            }
            case 40: {

              targetEntityId_ = input.readUInt32();
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
      return emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.internal_static_DeathZoneObserveNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.internal_static_DeathZoneObserveNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify.class, emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify.Builder.class);
    }

    public static final int SOURCE_ENTITY_ID_FIELD_NUMBER = 2;
    private int sourceEntityId_;
    /**
     * <code>uint32 source_entity_id = 2;</code>
     * @return The sourceEntityId.
     */
    @java.lang.Override
    public int getSourceEntityId() {
      return sourceEntityId_;
    }

    public static final int TARGET_ENTITY_ID_FIELD_NUMBER = 5;
    private int targetEntityId_;
    /**
     * <code>uint32 target_entity_id = 5;</code>
     * @return The targetEntityId.
     */
    @java.lang.Override
    public int getTargetEntityId() {
      return targetEntityId_;
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
      if (sourceEntityId_ != 0) {
        output.writeUInt32(2, sourceEntityId_);
      }
      if (targetEntityId_ != 0) {
        output.writeUInt32(5, targetEntityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (sourceEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, sourceEntityId_);
      }
      if (targetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, targetEntityId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify other = (emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify) obj;

      if (getSourceEntityId()
          != other.getSourceEntityId()) return false;
      if (getTargetEntityId()
          != other.getTargetEntityId()) return false;
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
      hash = (37 * hash) + SOURCE_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSourceEntityId();
      hash = (37 * hash) + TARGET_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetEntityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify prototype) {
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
     *   CMD_ID = 3062;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code DeathZoneObserveNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DeathZoneObserveNotify)
        emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.internal_static_DeathZoneObserveNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.internal_static_DeathZoneObserveNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify.class, emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify.newBuilder()
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
        sourceEntityId_ = 0;

        targetEntityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.internal_static_DeathZoneObserveNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify build() {
        emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify buildPartial() {
        emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify result = new emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify(this);
        result.sourceEntityId_ = sourceEntityId_;
        result.targetEntityId_ = targetEntityId_;
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
        if (other instanceof emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify) {
          return mergeFrom((emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify other) {
        if (other == emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify.getDefaultInstance()) return this;
        if (other.getSourceEntityId() != 0) {
          setSourceEntityId(other.getSourceEntityId());
        }
        if (other.getTargetEntityId() != 0) {
          setTargetEntityId(other.getTargetEntityId());
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
        emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int sourceEntityId_ ;
      /**
       * <code>uint32 source_entity_id = 2;</code>
       * @return The sourceEntityId.
       */
      @java.lang.Override
      public int getSourceEntityId() {
        return sourceEntityId_;
      }
      /**
       * <code>uint32 source_entity_id = 2;</code>
       * @param value The sourceEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setSourceEntityId(int value) {
        
        sourceEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 source_entity_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearSourceEntityId() {
        
        sourceEntityId_ = 0;
        onChanged();
        return this;
      }

      private int targetEntityId_ ;
      /**
       * <code>uint32 target_entity_id = 5;</code>
       * @return The targetEntityId.
       */
      @java.lang.Override
      public int getTargetEntityId() {
        return targetEntityId_;
      }
      /**
       * <code>uint32 target_entity_id = 5;</code>
       * @param value The targetEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setTargetEntityId(int value) {
        
        targetEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_entity_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetEntityId() {
        
        targetEntityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DeathZoneObserveNotify)
    }

    // @@protoc_insertion_point(class_scope:DeathZoneObserveNotify)
    private static final emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify();
    }

    public static emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DeathZoneObserveNotify>
        PARSER = new com.google.protobuf.AbstractParser<DeathZoneObserveNotify>() {
      @java.lang.Override
      public DeathZoneObserveNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DeathZoneObserveNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DeathZoneObserveNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DeathZoneObserveNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.DeathZoneObserveNotifyOuterClass.DeathZoneObserveNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DeathZoneObserveNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DeathZoneObserveNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034DeathZoneObserveNotify.proto\"L\n\026DeathZ" +
      "oneObserveNotify\022\030\n\020source_entity_id\030\002 \001" +
      "(\r\022\030\n\020target_entity_id\030\005 \001(\rB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DeathZoneObserveNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DeathZoneObserveNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DeathZoneObserveNotify_descriptor,
        new java.lang.String[] { "SourceEntityId", "TargetEntityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
