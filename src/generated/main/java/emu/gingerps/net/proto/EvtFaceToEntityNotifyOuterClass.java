// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtFaceToEntityNotify.proto

package emu.gingerps.net.proto;

public final class EvtFaceToEntityNotifyOuterClass {
  private EvtFaceToEntityNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtFaceToEntityNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtFaceToEntityNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entity_id = 10;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>.ForwardType forward_type = 8;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    int getForwardTypeValue();
    /**
     * <code>.ForwardType forward_type = 8;</code>
     * @return The forwardType.
     */
    emu.gingerps.net.proto.ForwardTypeOuterClass.ForwardType getForwardType();

    /**
     * <code>uint32 face_entity_id = 4;</code>
     * @return The faceEntityId.
     */
    int getFaceEntityId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 361;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code EvtFaceToEntityNotify}
   */
  public static final class EvtFaceToEntityNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtFaceToEntityNotify)
      EvtFaceToEntityNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtFaceToEntityNotify.newBuilder() to construct.
    private EvtFaceToEntityNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtFaceToEntityNotify() {
      forwardType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtFaceToEntityNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EvtFaceToEntityNotify(
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
            case 32: {

              faceEntityId_ = input.readUInt32();
              break;
            }
            case 64: {
              int rawValue = input.readEnum();

              forwardType_ = rawValue;
              break;
            }
            case 80: {

              entityId_ = input.readUInt32();
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
      return emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.internal_static_EvtFaceToEntityNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.internal_static_EvtFaceToEntityNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify.class, emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify.Builder.class);
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 10;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 10;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int FORWARD_TYPE_FIELD_NUMBER = 8;
    private int forwardType_;
    /**
     * <code>.ForwardType forward_type = 8;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    @java.lang.Override public int getForwardTypeValue() {
      return forwardType_;
    }
    /**
     * <code>.ForwardType forward_type = 8;</code>
     * @return The forwardType.
     */
    @java.lang.Override public emu.gingerps.net.proto.ForwardTypeOuterClass.ForwardType getForwardType() {
      @SuppressWarnings("deprecation")
      emu.gingerps.net.proto.ForwardTypeOuterClass.ForwardType result = emu.gingerps.net.proto.ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
      return result == null ? emu.gingerps.net.proto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
    }

    public static final int FACE_ENTITY_ID_FIELD_NUMBER = 4;
    private int faceEntityId_;
    /**
     * <code>uint32 face_entity_id = 4;</code>
     * @return The faceEntityId.
     */
    @java.lang.Override
    public int getFaceEntityId() {
      return faceEntityId_;
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
      if (faceEntityId_ != 0) {
        output.writeUInt32(4, faceEntityId_);
      }
      if (forwardType_ != emu.gingerps.net.proto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        output.writeEnum(8, forwardType_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(10, entityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (faceEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, faceEntityId_);
      }
      if (forwardType_ != emu.gingerps.net.proto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(8, forwardType_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, entityId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify other = (emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (forwardType_ != other.forwardType_) return false;
      if (getFaceEntityId()
          != other.getFaceEntityId()) return false;
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
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + FORWARD_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + forwardType_;
      hash = (37 * hash) + FACE_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFaceEntityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify prototype) {
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
     *   CMD_ID = 361;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code EvtFaceToEntityNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtFaceToEntityNotify)
        emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.internal_static_EvtFaceToEntityNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.internal_static_EvtFaceToEntityNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify.class, emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify.newBuilder()
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
        entityId_ = 0;

        forwardType_ = 0;

        faceEntityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.internal_static_EvtFaceToEntityNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify build() {
        emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify buildPartial() {
        emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify result = new emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify(this);
        result.entityId_ = entityId_;
        result.forwardType_ = forwardType_;
        result.faceEntityId_ = faceEntityId_;
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
        if (other instanceof emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify) {
          return mergeFrom((emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify other) {
        if (other == emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.forwardType_ != 0) {
          setForwardTypeValue(other.getForwardTypeValue());
        }
        if (other.getFaceEntityId() != 0) {
          setFaceEntityId(other.getFaceEntityId());
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
        emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 10;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 10;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private int forwardType_ = 0;
      /**
       * <code>.ForwardType forward_type = 8;</code>
       * @return The enum numeric value on the wire for forwardType.
       */
      @java.lang.Override public int getForwardTypeValue() {
        return forwardType_;
      }
      /**
       * <code>.ForwardType forward_type = 8;</code>
       * @param value The enum numeric value on the wire for forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardTypeValue(int value) {
        
        forwardType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forward_type = 8;</code>
       * @return The forwardType.
       */
      @java.lang.Override
      public emu.gingerps.net.proto.ForwardTypeOuterClass.ForwardType getForwardType() {
        @SuppressWarnings("deprecation")
        emu.gingerps.net.proto.ForwardTypeOuterClass.ForwardType result = emu.gingerps.net.proto.ForwardTypeOuterClass.ForwardType.valueOf(forwardType_);
        return result == null ? emu.gingerps.net.proto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ForwardType forward_type = 8;</code>
       * @param value The forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardType(emu.gingerps.net.proto.ForwardTypeOuterClass.ForwardType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        forwardType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forward_type = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearForwardType() {
        
        forwardType_ = 0;
        onChanged();
        return this;
      }

      private int faceEntityId_ ;
      /**
       * <code>uint32 face_entity_id = 4;</code>
       * @return The faceEntityId.
       */
      @java.lang.Override
      public int getFaceEntityId() {
        return faceEntityId_;
      }
      /**
       * <code>uint32 face_entity_id = 4;</code>
       * @param value The faceEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setFaceEntityId(int value) {
        
        faceEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 face_entity_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearFaceEntityId() {
        
        faceEntityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EvtFaceToEntityNotify)
    }

    // @@protoc_insertion_point(class_scope:EvtFaceToEntityNotify)
    private static final emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify();
    }

    public static emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtFaceToEntityNotify>
        PARSER = new com.google.protobuf.AbstractParser<EvtFaceToEntityNotify>() {
      @java.lang.Override
      public EvtFaceToEntityNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EvtFaceToEntityNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EvtFaceToEntityNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtFaceToEntityNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.EvtFaceToEntityNotifyOuterClass.EvtFaceToEntityNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtFaceToEntityNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtFaceToEntityNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033EvtFaceToEntityNotify.proto\032\021ForwardTy" +
      "pe.proto\"f\n\025EvtFaceToEntityNotify\022\021\n\tent" +
      "ity_id\030\n \001(\r\022\"\n\014forward_type\030\010 \001(\0162\014.For" +
      "wardType\022\026\n\016face_entity_id\030\004 \001(\rB\033\n\031emu." +
      "gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.ForwardTypeOuterClass.getDescriptor(),
        });
    internal_static_EvtFaceToEntityNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtFaceToEntityNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtFaceToEntityNotify_descriptor,
        new java.lang.String[] { "EntityId", "ForwardType", "FaceEntityId", });
    emu.gingerps.net.proto.ForwardTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
