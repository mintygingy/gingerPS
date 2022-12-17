// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UnlockAvatarTalentReq.proto

package emu.gingerps.net.proto;

public final class UnlockAvatarTalentReqOuterClass {
  private UnlockAvatarTalentReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UnlockAvatarTalentReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UnlockAvatarTalentReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 talent_id = 11;</code>
     * @return The talentId.
     */
    int getTalentId();

    /**
     * <code>uint64 avatar_guid = 2;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 1079;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code UnlockAvatarTalentReq}
   */
  public static final class UnlockAvatarTalentReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UnlockAvatarTalentReq)
      UnlockAvatarTalentReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UnlockAvatarTalentReq.newBuilder() to construct.
    private UnlockAvatarTalentReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UnlockAvatarTalentReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UnlockAvatarTalentReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UnlockAvatarTalentReq(
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

              avatarGuid_ = input.readUInt64();
              break;
            }
            case 88: {

              talentId_ = input.readUInt32();
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
      return emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.internal_static_UnlockAvatarTalentReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.internal_static_UnlockAvatarTalentReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq.class, emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq.Builder.class);
    }

    public static final int TALENT_ID_FIELD_NUMBER = 11;
    private int talentId_;
    /**
     * <code>uint32 talent_id = 11;</code>
     * @return The talentId.
     */
    @java.lang.Override
    public int getTalentId() {
      return talentId_;
    }

    public static final int AVATAR_GUID_FIELD_NUMBER = 2;
    private long avatarGuid_;
    /**
     * <code>uint64 avatar_guid = 2;</code>
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
      if (avatarGuid_ != 0L) {
        output.writeUInt64(2, avatarGuid_);
      }
      if (talentId_ != 0) {
        output.writeUInt32(11, talentId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, avatarGuid_);
      }
      if (talentId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, talentId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq other = (emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq) obj;

      if (getTalentId()
          != other.getTalentId()) return false;
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
      hash = (37 * hash) + TALENT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTalentId();
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq prototype) {
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
     *   CMD_ID = 1079;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code UnlockAvatarTalentReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UnlockAvatarTalentReq)
        emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.internal_static_UnlockAvatarTalentReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.internal_static_UnlockAvatarTalentReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq.class, emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq.newBuilder()
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
        talentId_ = 0;

        avatarGuid_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.internal_static_UnlockAvatarTalentReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq build() {
        emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq buildPartial() {
        emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq result = new emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq(this);
        result.talentId_ = talentId_;
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
        if (other instanceof emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq) {
          return mergeFrom((emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq other) {
        if (other == emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq.getDefaultInstance()) return this;
        if (other.getTalentId() != 0) {
          setTalentId(other.getTalentId());
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
        emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int talentId_ ;
      /**
       * <code>uint32 talent_id = 11;</code>
       * @return The talentId.
       */
      @java.lang.Override
      public int getTalentId() {
        return talentId_;
      }
      /**
       * <code>uint32 talent_id = 11;</code>
       * @param value The talentId to set.
       * @return This builder for chaining.
       */
      public Builder setTalentId(int value) {
        
        talentId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 talent_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearTalentId() {
        
        talentId_ = 0;
        onChanged();
        return this;
      }

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 2;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 2;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {
        
        avatarGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_guid = 2;</code>
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


      // @@protoc_insertion_point(builder_scope:UnlockAvatarTalentReq)
    }

    // @@protoc_insertion_point(class_scope:UnlockAvatarTalentReq)
    private static final emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq();
    }

    public static emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UnlockAvatarTalentReq>
        PARSER = new com.google.protobuf.AbstractParser<UnlockAvatarTalentReq>() {
      @java.lang.Override
      public UnlockAvatarTalentReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UnlockAvatarTalentReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UnlockAvatarTalentReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UnlockAvatarTalentReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.UnlockAvatarTalentReqOuterClass.UnlockAvatarTalentReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UnlockAvatarTalentReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UnlockAvatarTalentReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033UnlockAvatarTalentReq.proto\"?\n\025UnlockA" +
      "vatarTalentReq\022\021\n\ttalent_id\030\013 \001(\r\022\023\n\013ava" +
      "tar_guid\030\002 \001(\004B\030\n\026emu.gingerps.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UnlockAvatarTalentReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UnlockAvatarTalentReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UnlockAvatarTalentReq_descriptor,
        new java.lang.String[] { "TalentId", "AvatarGuid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
