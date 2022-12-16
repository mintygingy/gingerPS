// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarChangeAnimHashReq.proto

package emu.gingerps.net.proto;

public final class AvatarChangeAnimHashReqOuterClass {
  private AvatarChangeAnimHashReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarChangeAnimHashReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarChangeAnimHashReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 anim_hash = 11;</code>
     * @return The animHash.
     */
    int getAnimHash();

    /**
     * <code>uint64 avatar_guid = 12;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 1767;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code AvatarChangeAnimHashReq}
   */
  public static final class AvatarChangeAnimHashReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarChangeAnimHashReq)
      AvatarChangeAnimHashReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarChangeAnimHashReq.newBuilder() to construct.
    private AvatarChangeAnimHashReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarChangeAnimHashReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarChangeAnimHashReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AvatarChangeAnimHashReq(
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
            case 88: {

              animHash_ = input.readUInt32();
              break;
            }
            case 96: {

              avatarGuid_ = input.readUInt64();
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
      return emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.internal_static_AvatarChangeAnimHashReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.internal_static_AvatarChangeAnimHashReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq.class, emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq.Builder.class);
    }

    public static final int ANIM_HASH_FIELD_NUMBER = 11;
    private int animHash_;
    /**
     * <code>uint32 anim_hash = 11;</code>
     * @return The animHash.
     */
    @java.lang.Override
    public int getAnimHash() {
      return animHash_;
    }

    public static final int AVATAR_GUID_FIELD_NUMBER = 12;
    private long avatarGuid_;
    /**
     * <code>uint64 avatar_guid = 12;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
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
      if (animHash_ != 0) {
        output.writeUInt32(11, animHash_);
      }
      if (avatarGuid_ != 0L) {
        output.writeUInt64(12, avatarGuid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (animHash_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, animHash_);
      }
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(12, avatarGuid_);
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
      if (!(obj instanceof emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq other = (emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq) obj;

      if (getAnimHash()
          != other.getAnimHash()) return false;
      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
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
      hash = (37 * hash) + ANIM_HASH_FIELD_NUMBER;
      hash = (53 * hash) + getAnimHash();
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq prototype) {
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
     *   CMD_ID = 1767;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code AvatarChangeAnimHashReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarChangeAnimHashReq)
        emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.internal_static_AvatarChangeAnimHashReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.internal_static_AvatarChangeAnimHashReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq.class, emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq.newBuilder()
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
        animHash_ = 0;

        avatarGuid_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.internal_static_AvatarChangeAnimHashReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq build() {
        emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq buildPartial() {
        emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq result = new emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq(this);
        result.animHash_ = animHash_;
        result.avatarGuid_ = avatarGuid_;
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
        if (other instanceof emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq) {
          return mergeFrom((emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq other) {
        if (other == emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq.getDefaultInstance()) return this;
        if (other.getAnimHash() != 0) {
          setAnimHash(other.getAnimHash());
        }
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
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
        emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int animHash_ ;
      /**
       * <code>uint32 anim_hash = 11;</code>
       * @return The animHash.
       */
      @java.lang.Override
      public int getAnimHash() {
        return animHash_;
      }
      /**
       * <code>uint32 anim_hash = 11;</code>
       * @param value The animHash to set.
       * @return This builder for chaining.
       */
      public Builder setAnimHash(int value) {
        
        animHash_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 anim_hash = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearAnimHash() {
        
        animHash_ = 0;
        onChanged();
        return this;
      }

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 12;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 12;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {
        
        avatarGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_guid = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        
        avatarGuid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:AvatarChangeAnimHashReq)
    }

    // @@protoc_insertion_point(class_scope:AvatarChangeAnimHashReq)
    private static final emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq();
    }

    public static emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarChangeAnimHashReq>
        PARSER = new com.google.protobuf.AbstractParser<AvatarChangeAnimHashReq>() {
      @java.lang.Override
      public AvatarChangeAnimHashReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AvatarChangeAnimHashReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AvatarChangeAnimHashReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarChangeAnimHashReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.AvatarChangeAnimHashReqOuterClass.AvatarChangeAnimHashReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarChangeAnimHashReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarChangeAnimHashReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035AvatarChangeAnimHashReq.proto\"A\n\027Avata" +
      "rChangeAnimHashReq\022\021\n\tanim_hash\030\013 \001(\r\022\023\n" +
      "\013avatar_guid\030\014 \001(\004B\033\n\031emu.gingerps.ne" +
      "t.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AvatarChangeAnimHashReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarChangeAnimHashReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarChangeAnimHashReq_descriptor,
        new java.lang.String[] { "AnimHash", "AvatarGuid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}