// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChooseCurAvatarTeamReq.proto

package emu.gingerps.net.proto;

public final class ChooseCurAvatarTeamReqOuterClass {
  private ChooseCurAvatarTeamReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChooseCurAvatarTeamReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChooseCurAvatarTeamReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 team_id = 10;</code>
     * @return The teamId.
     */
    int getTeamId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 1738;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ChooseCurAvatarTeamReq}
   */
  public static final class ChooseCurAvatarTeamReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChooseCurAvatarTeamReq)
      ChooseCurAvatarTeamReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChooseCurAvatarTeamReq.newBuilder() to construct.
    private ChooseCurAvatarTeamReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChooseCurAvatarTeamReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChooseCurAvatarTeamReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChooseCurAvatarTeamReq(
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
            case 80: {

              teamId_ = input.readUInt32();
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
      return emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.internal_static_ChooseCurAvatarTeamReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.internal_static_ChooseCurAvatarTeamReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq.class, emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq.Builder.class);
    }

    public static final int TEAM_ID_FIELD_NUMBER = 10;
    private int teamId_;
    /**
     * <code>uint32 team_id = 10;</code>
     * @return The teamId.
     */
    @java.lang.Override
    public int getTeamId() {
      return teamId_;
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
      if (teamId_ != 0) {
        output.writeUInt32(10, teamId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (teamId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, teamId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq other = (emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq) obj;

      if (getTeamId()
          != other.getTeamId()) return false;
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
      hash = (37 * hash) + TEAM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTeamId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq prototype) {
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
     *   CMD_ID = 1738;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ChooseCurAvatarTeamReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChooseCurAvatarTeamReq)
        emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.internal_static_ChooseCurAvatarTeamReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.internal_static_ChooseCurAvatarTeamReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq.class, emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq.newBuilder()
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
        teamId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.internal_static_ChooseCurAvatarTeamReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq build() {
        emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq buildPartial() {
        emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq result = new emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq(this);
        result.teamId_ = teamId_;
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
        if (other instanceof emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq) {
          return mergeFrom((emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq other) {
        if (other == emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq.getDefaultInstance()) return this;
        if (other.getTeamId() != 0) {
          setTeamId(other.getTeamId());
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
        emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int teamId_ ;
      /**
       * <code>uint32 team_id = 10;</code>
       * @return The teamId.
       */
      @java.lang.Override
      public int getTeamId() {
        return teamId_;
      }
      /**
       * <code>uint32 team_id = 10;</code>
       * @param value The teamId to set.
       * @return This builder for chaining.
       */
      public Builder setTeamId(int value) {
        
        teamId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 team_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearTeamId() {
        
        teamId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ChooseCurAvatarTeamReq)
    }

    // @@protoc_insertion_point(class_scope:ChooseCurAvatarTeamReq)
    private static final emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq();
    }

    public static emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChooseCurAvatarTeamReq>
        PARSER = new com.google.protobuf.AbstractParser<ChooseCurAvatarTeamReq>() {
      @java.lang.Override
      public ChooseCurAvatarTeamReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChooseCurAvatarTeamReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChooseCurAvatarTeamReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChooseCurAvatarTeamReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.ChooseCurAvatarTeamReqOuterClass.ChooseCurAvatarTeamReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChooseCurAvatarTeamReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChooseCurAvatarTeamReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034ChooseCurAvatarTeamReq.proto\")\n\026Choose" +
      "CurAvatarTeamReq\022\017\n\007team_id\030\n \001(\rB\030\n\026emu" +
      ".gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChooseCurAvatarTeamReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChooseCurAvatarTeamReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChooseCurAvatarTeamReq_descriptor,
        new java.lang.String[] { "TeamId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
