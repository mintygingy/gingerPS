// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SpiceActivityGivingRecordNotify.proto

package emu.gingerps.net.proto;

public final class SpiceActivityGivingRecordNotifyOuterClass {
  private SpiceActivityGivingRecordNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SpiceActivityGivingRecordNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SpiceActivityGivingRecordNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3300_CIHIAJEGCBO = 3;</code>
     * @return The unk3300CIHIAJEGCBO.
     */
    int getUnk3300CIHIAJEGCBO();

    /**
     * <code>uint32 Unk3300_LAKPMMIPBMI = 2;</code>
     * @return The unk3300LAKPMMIPBMI.
     */
    int getUnk3300LAKPMMIPBMI();

    /**
     * <code>uint32 avatar_id = 5;</code>
     * @return The avatarId.
     */
    int getAvatarId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8719;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code SpiceActivityGivingRecordNotify}
   */
  public static final class SpiceActivityGivingRecordNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SpiceActivityGivingRecordNotify)
      SpiceActivityGivingRecordNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SpiceActivityGivingRecordNotify.newBuilder() to construct.
    private SpiceActivityGivingRecordNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SpiceActivityGivingRecordNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SpiceActivityGivingRecordNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SpiceActivityGivingRecordNotify(
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

              unk3300LAKPMMIPBMI_ = input.readUInt32();
              break;
            }
            case 24: {

              unk3300CIHIAJEGCBO_ = input.readUInt32();
              break;
            }
            case 40: {

              avatarId_ = input.readUInt32();
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
      return emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.internal_static_SpiceActivityGivingRecordNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.internal_static_SpiceActivityGivingRecordNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify.class, emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify.Builder.class);
    }

    public static final int UNK3300_CIHIAJEGCBO_FIELD_NUMBER = 3;
    private int unk3300CIHIAJEGCBO_;
    /**
     * <code>uint32 Unk3300_CIHIAJEGCBO = 3;</code>
     * @return The unk3300CIHIAJEGCBO.
     */
    @java.lang.Override
    public int getUnk3300CIHIAJEGCBO() {
      return unk3300CIHIAJEGCBO_;
    }

    public static final int UNK3300_LAKPMMIPBMI_FIELD_NUMBER = 2;
    private int unk3300LAKPMMIPBMI_;
    /**
     * <code>uint32 Unk3300_LAKPMMIPBMI = 2;</code>
     * @return The unk3300LAKPMMIPBMI.
     */
    @java.lang.Override
    public int getUnk3300LAKPMMIPBMI() {
      return unk3300LAKPMMIPBMI_;
    }

    public static final int AVATAR_ID_FIELD_NUMBER = 5;
    private int avatarId_;
    /**
     * <code>uint32 avatar_id = 5;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public int getAvatarId() {
      return avatarId_;
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
      if (unk3300LAKPMMIPBMI_ != 0) {
        output.writeUInt32(2, unk3300LAKPMMIPBMI_);
      }
      if (unk3300CIHIAJEGCBO_ != 0) {
        output.writeUInt32(3, unk3300CIHIAJEGCBO_);
      }
      if (avatarId_ != 0) {
        output.writeUInt32(5, avatarId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300LAKPMMIPBMI_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, unk3300LAKPMMIPBMI_);
      }
      if (unk3300CIHIAJEGCBO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, unk3300CIHIAJEGCBO_);
      }
      if (avatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, avatarId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify other = (emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify) obj;

      if (getUnk3300CIHIAJEGCBO()
          != other.getUnk3300CIHIAJEGCBO()) return false;
      if (getUnk3300LAKPMMIPBMI()
          != other.getUnk3300LAKPMMIPBMI()) return false;
      if (getAvatarId()
          != other.getAvatarId()) return false;
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
      hash = (37 * hash) + UNK3300_CIHIAJEGCBO_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300CIHIAJEGCBO();
      hash = (37 * hash) + UNK3300_LAKPMMIPBMI_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300LAKPMMIPBMI();
      hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify prototype) {
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
     *   CMD_ID = 8719;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code SpiceActivityGivingRecordNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SpiceActivityGivingRecordNotify)
        emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.internal_static_SpiceActivityGivingRecordNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.internal_static_SpiceActivityGivingRecordNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify.class, emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify.newBuilder()
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
        unk3300CIHIAJEGCBO_ = 0;

        unk3300LAKPMMIPBMI_ = 0;

        avatarId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.internal_static_SpiceActivityGivingRecordNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify build() {
        emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify buildPartial() {
        emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify result = new emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify(this);
        result.unk3300CIHIAJEGCBO_ = unk3300CIHIAJEGCBO_;
        result.unk3300LAKPMMIPBMI_ = unk3300LAKPMMIPBMI_;
        result.avatarId_ = avatarId_;
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
        if (other instanceof emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify) {
          return mergeFrom((emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify other) {
        if (other == emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify.getDefaultInstance()) return this;
        if (other.getUnk3300CIHIAJEGCBO() != 0) {
          setUnk3300CIHIAJEGCBO(other.getUnk3300CIHIAJEGCBO());
        }
        if (other.getUnk3300LAKPMMIPBMI() != 0) {
          setUnk3300LAKPMMIPBMI(other.getUnk3300LAKPMMIPBMI());
        }
        if (other.getAvatarId() != 0) {
          setAvatarId(other.getAvatarId());
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
        emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int unk3300CIHIAJEGCBO_ ;
      /**
       * <code>uint32 Unk3300_CIHIAJEGCBO = 3;</code>
       * @return The unk3300CIHIAJEGCBO.
       */
      @java.lang.Override
      public int getUnk3300CIHIAJEGCBO() {
        return unk3300CIHIAJEGCBO_;
      }
      /**
       * <code>uint32 Unk3300_CIHIAJEGCBO = 3;</code>
       * @param value The unk3300CIHIAJEGCBO to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300CIHIAJEGCBO(int value) {
        
        unk3300CIHIAJEGCBO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_CIHIAJEGCBO = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300CIHIAJEGCBO() {
        
        unk3300CIHIAJEGCBO_ = 0;
        onChanged();
        return this;
      }

      private int unk3300LAKPMMIPBMI_ ;
      /**
       * <code>uint32 Unk3300_LAKPMMIPBMI = 2;</code>
       * @return The unk3300LAKPMMIPBMI.
       */
      @java.lang.Override
      public int getUnk3300LAKPMMIPBMI() {
        return unk3300LAKPMMIPBMI_;
      }
      /**
       * <code>uint32 Unk3300_LAKPMMIPBMI = 2;</code>
       * @param value The unk3300LAKPMMIPBMI to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300LAKPMMIPBMI(int value) {
        
        unk3300LAKPMMIPBMI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_LAKPMMIPBMI = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300LAKPMMIPBMI() {
        
        unk3300LAKPMMIPBMI_ = 0;
        onChanged();
        return this;
      }

      private int avatarId_ ;
      /**
       * <code>uint32 avatar_id = 5;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public int getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint32 avatar_id = 5;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(int value) {
        
        avatarId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatar_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        
        avatarId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SpiceActivityGivingRecordNotify)
    }

    // @@protoc_insertion_point(class_scope:SpiceActivityGivingRecordNotify)
    private static final emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify();
    }

    public static emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SpiceActivityGivingRecordNotify>
        PARSER = new com.google.protobuf.AbstractParser<SpiceActivityGivingRecordNotify>() {
      @java.lang.Override
      public SpiceActivityGivingRecordNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SpiceActivityGivingRecordNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SpiceActivityGivingRecordNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SpiceActivityGivingRecordNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.SpiceActivityGivingRecordNotifyOuterClass.SpiceActivityGivingRecordNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SpiceActivityGivingRecordNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SpiceActivityGivingRecordNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%SpiceActivityGivingRecordNotify.proto\"" +
      "n\n\037SpiceActivityGivingRecordNotify\022\033\n\023Un" +
      "k3300_CIHIAJEGCBO\030\003 \001(\r\022\033\n\023Unk3300_LAKPM" +
      "MIPBMI\030\002 \001(\r\022\021\n\tavatar_id\030\005 \001(\rB\030\n\026emu.g" +
      "ingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SpiceActivityGivingRecordNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SpiceActivityGivingRecordNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SpiceActivityGivingRecordNotify_descriptor,
        new java.lang.String[] { "Unk3300CIHIAJEGCBO", "Unk3300LAKPMMIPBMI", "AvatarId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
