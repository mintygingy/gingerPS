// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LanternRiteStartFireworksReformReq.proto

package emu.gingerps.net.proto;

public final class LanternRiteStartFireworksReformReqOuterClass {
  private LanternRiteStartFireworksReformReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LanternRiteStartFireworksReformReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LanternRiteStartFireworksReformReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 challenge_id = 2;</code>
     * @return The challengeId.
     */
    int getChallengeId();

    /**
     * <code>uint32 stage_id = 1;</code>
     * @return The stageId.
     */
    int getStageId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8200;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code LanternRiteStartFireworksReformReq}
   */
  public static final class LanternRiteStartFireworksReformReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LanternRiteStartFireworksReformReq)
      LanternRiteStartFireworksReformReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LanternRiteStartFireworksReformReq.newBuilder() to construct.
    private LanternRiteStartFireworksReformReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LanternRiteStartFireworksReformReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LanternRiteStartFireworksReformReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LanternRiteStartFireworksReformReq(
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
            case 8: {

              stageId_ = input.readUInt32();
              break;
            }
            case 16: {

              challengeId_ = input.readUInt32();
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
      return emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.internal_static_LanternRiteStartFireworksReformReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.internal_static_LanternRiteStartFireworksReformReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq.class, emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq.Builder.class);
    }

    public static final int CHALLENGE_ID_FIELD_NUMBER = 2;
    private int challengeId_;
    /**
     * <code>uint32 challenge_id = 2;</code>
     * @return The challengeId.
     */
    @java.lang.Override
    public int getChallengeId() {
      return challengeId_;
    }

    public static final int STAGE_ID_FIELD_NUMBER = 1;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 1;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
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
      if (stageId_ != 0) {
        output.writeUInt32(1, stageId_);
      }
      if (challengeId_ != 0) {
        output.writeUInt32(2, challengeId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, stageId_);
      }
      if (challengeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, challengeId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq other = (emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq) obj;

      if (getChallengeId()
          != other.getChallengeId()) return false;
      if (getStageId()
          != other.getStageId()) return false;
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
      hash = (37 * hash) + CHALLENGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeId();
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq prototype) {
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
     *   CMD_ID = 8200;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code LanternRiteStartFireworksReformReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LanternRiteStartFireworksReformReq)
        emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.internal_static_LanternRiteStartFireworksReformReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.internal_static_LanternRiteStartFireworksReformReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq.class, emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq.newBuilder()
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
        challengeId_ = 0;

        stageId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.internal_static_LanternRiteStartFireworksReformReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq build() {
        emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq buildPartial() {
        emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq result = new emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq(this);
        result.challengeId_ = challengeId_;
        result.stageId_ = stageId_;
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
        if (other instanceof emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq) {
          return mergeFrom((emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq other) {
        if (other == emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq.getDefaultInstance()) return this;
        if (other.getChallengeId() != 0) {
          setChallengeId(other.getChallengeId());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
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
        emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int challengeId_ ;
      /**
       * <code>uint32 challenge_id = 2;</code>
       * @return The challengeId.
       */
      @java.lang.Override
      public int getChallengeId() {
        return challengeId_;
      }
      /**
       * <code>uint32 challenge_id = 2;</code>
       * @param value The challengeId to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeId(int value) {
        
        challengeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeId() {
        
        challengeId_ = 0;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 1;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 1;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:LanternRiteStartFireworksReformReq)
    }

    // @@protoc_insertion_point(class_scope:LanternRiteStartFireworksReformReq)
    private static final emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq();
    }

    public static emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LanternRiteStartFireworksReformReq>
        PARSER = new com.google.protobuf.AbstractParser<LanternRiteStartFireworksReformReq>() {
      @java.lang.Override
      public LanternRiteStartFireworksReformReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LanternRiteStartFireworksReformReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LanternRiteStartFireworksReformReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LanternRiteStartFireworksReformReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.LanternRiteStartFireworksReformReqOuterClass.LanternRiteStartFireworksReformReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LanternRiteStartFireworksReformReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LanternRiteStartFireworksReformReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(LanternRiteStartFireworksReformReq.pro" +
      "to\"L\n\"LanternRiteStartFireworksReformReq" +
      "\022\024\n\014challenge_id\030\002 \001(\r\022\020\n\010stage_id\030\001 \001(\r" +
      "B\030\n\026emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LanternRiteStartFireworksReformReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LanternRiteStartFireworksReformReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LanternRiteStartFireworksReformReq_descriptor,
        new java.lang.String[] { "ChallengeId", "StageId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
