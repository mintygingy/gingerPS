// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGChallengeUpdateNotify.proto

package emu.gingerps.net.proto;

public final class GCGChallengeUpdateNotifyOuterClass {
  private GCGChallengeUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGChallengeUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGChallengeUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 server_seq = 15;</code>
     * @return The serverSeq.
     */
    int getServerSeq();

    /**
     * <code>.GCGDuelChallenge challenge = 1;</code>
     * @return Whether the challenge field is set.
     */
    boolean hasChallenge();
    /**
     * <code>.GCGDuelChallenge challenge = 1;</code>
     * @return The challenge.
     */
    emu.gingerps.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge getChallenge();
    /**
     * <code>.GCGDuelChallenge challenge = 1;</code>
     */
    emu.gingerps.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallengeOrBuilder getChallengeOrBuilder();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 7270;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GCGChallengeUpdateNotify}
   */
  public static final class GCGChallengeUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGChallengeUpdateNotify)
      GCGChallengeUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGChallengeUpdateNotify.newBuilder() to construct.
    private GCGChallengeUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGChallengeUpdateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGChallengeUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.internal_static_GCGChallengeUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.internal_static_GCGChallengeUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify.class, emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify.Builder.class);
    }

    public static final int SERVER_SEQ_FIELD_NUMBER = 15;
    private int serverSeq_ = 0;
    /**
     * <code>uint32 server_seq = 15;</code>
     * @return The serverSeq.
     */
    @java.lang.Override
    public int getServerSeq() {
      return serverSeq_;
    }

    public static final int CHALLENGE_FIELD_NUMBER = 1;
    private emu.gingerps.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge challenge_;
    /**
     * <code>.GCGDuelChallenge challenge = 1;</code>
     * @return Whether the challenge field is set.
     */
    @java.lang.Override
    public boolean hasChallenge() {
      return challenge_ != null;
    }
    /**
     * <code>.GCGDuelChallenge challenge = 1;</code>
     * @return The challenge.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge getChallenge() {
      return challenge_ == null ? emu.gingerps.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge.getDefaultInstance() : challenge_;
    }
    /**
     * <code>.GCGDuelChallenge challenge = 1;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallengeOrBuilder getChallengeOrBuilder() {
      return challenge_ == null ? emu.gingerps.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge.getDefaultInstance() : challenge_;
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
      if (challenge_ != null) {
        output.writeMessage(1, getChallenge());
      }
      if (serverSeq_ != 0) {
        output.writeUInt32(15, serverSeq_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (challenge_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getChallenge());
      }
      if (serverSeq_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, serverSeq_);
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
      if (!(obj instanceof emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify other = (emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify) obj;

      if (getServerSeq()
          != other.getServerSeq()) return false;
      if (hasChallenge() != other.hasChallenge()) return false;
      if (hasChallenge()) {
        if (!getChallenge()
            .equals(other.getChallenge())) return false;
      }
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
      hash = (37 * hash) + SERVER_SEQ_FIELD_NUMBER;
      hash = (53 * hash) + getServerSeq();
      if (hasChallenge()) {
        hash = (37 * hash) + CHALLENGE_FIELD_NUMBER;
        hash = (53 * hash) + getChallenge().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify prototype) {
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
     *   CMD_ID = 7270;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GCGChallengeUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGChallengeUpdateNotify)
        emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.internal_static_GCGChallengeUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.internal_static_GCGChallengeUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify.class, emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify.newBuilder()
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
        serverSeq_ = 0;
        challenge_ = null;
        if (challengeBuilder_ != null) {
          challengeBuilder_.dispose();
          challengeBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.internal_static_GCGChallengeUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify build() {
        emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify buildPartial() {
        emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify result = new emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.serverSeq_ = serverSeq_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.challenge_ = challengeBuilder_ == null
              ? challenge_
              : challengeBuilder_.build();
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
        if (other instanceof emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify) {
          return mergeFrom((emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify other) {
        if (other == emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify.getDefaultInstance()) return this;
        if (other.getServerSeq() != 0) {
          setServerSeq(other.getServerSeq());
        }
        if (other.hasChallenge()) {
          mergeChallenge(other.getChallenge());
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
              case 10: {
                input.readMessage(
                    getChallengeFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 10
              case 120: {
                serverSeq_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 120
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

      private int serverSeq_ ;
      /**
       * <code>uint32 server_seq = 15;</code>
       * @return The serverSeq.
       */
      @java.lang.Override
      public int getServerSeq() {
        return serverSeq_;
      }
      /**
       * <code>uint32 server_seq = 15;</code>
       * @param value The serverSeq to set.
       * @return This builder for chaining.
       */
      public Builder setServerSeq(int value) {
        
        serverSeq_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 server_seq = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearServerSeq() {
        bitField0_ = (bitField0_ & ~0x00000001);
        serverSeq_ = 0;
        onChanged();
        return this;
      }

      private emu.gingerps.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge challenge_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge, emu.gingerps.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge.Builder, emu.gingerps.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallengeOrBuilder> challengeBuilder_;
      /**
       * <code>.GCGDuelChallenge challenge = 1;</code>
       * @return Whether the challenge field is set.
       */
      public boolean hasChallenge() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.GCGDuelChallenge challenge = 1;</code>
       * @return The challenge.
       */
      public emu.gingerps.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge getChallenge() {
        if (challengeBuilder_ == null) {
          return challenge_ == null ? emu.gingerps.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge.getDefaultInstance() : challenge_;
        } else {
          return challengeBuilder_.getMessage();
        }
      }
      /**
       * <code>.GCGDuelChallenge challenge = 1;</code>
       */
      public Builder setChallenge(emu.gingerps.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge value) {
        if (challengeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          challenge_ = value;
        } else {
          challengeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.GCGDuelChallenge challenge = 1;</code>
       */
      public Builder setChallenge(
          emu.gingerps.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge.Builder builderForValue) {
        if (challengeBuilder_ == null) {
          challenge_ = builderForValue.build();
        } else {
          challengeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.GCGDuelChallenge challenge = 1;</code>
       */
      public Builder mergeChallenge(emu.gingerps.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge value) {
        if (challengeBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            challenge_ != null &&
            challenge_ != emu.gingerps.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge.getDefaultInstance()) {
            getChallengeBuilder().mergeFrom(value);
          } else {
            challenge_ = value;
          }
        } else {
          challengeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.GCGDuelChallenge challenge = 1;</code>
       */
      public Builder clearChallenge() {
        bitField0_ = (bitField0_ & ~0x00000002);
        challenge_ = null;
        if (challengeBuilder_ != null) {
          challengeBuilder_.dispose();
          challengeBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.GCGDuelChallenge challenge = 1;</code>
       */
      public emu.gingerps.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge.Builder getChallengeBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getChallengeFieldBuilder().getBuilder();
      }
      /**
       * <code>.GCGDuelChallenge challenge = 1;</code>
       */
      public emu.gingerps.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallengeOrBuilder getChallengeOrBuilder() {
        if (challengeBuilder_ != null) {
          return challengeBuilder_.getMessageOrBuilder();
        } else {
          return challenge_ == null ?
              emu.gingerps.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge.getDefaultInstance() : challenge_;
        }
      }
      /**
       * <code>.GCGDuelChallenge challenge = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge, emu.gingerps.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge.Builder, emu.gingerps.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallengeOrBuilder> 
          getChallengeFieldBuilder() {
        if (challengeBuilder_ == null) {
          challengeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge, emu.gingerps.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallenge.Builder, emu.gingerps.net.proto.GCGDuelChallengeOuterClass.GCGDuelChallengeOrBuilder>(
                  getChallenge(),
                  getParentForChildren(),
                  isClean());
          challenge_ = null;
        }
        return challengeBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GCGChallengeUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:GCGChallengeUpdateNotify)
    private static final emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify();
    }

    public static emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGChallengeUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<GCGChallengeUpdateNotify>() {
      @java.lang.Override
      public GCGChallengeUpdateNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<GCGChallengeUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGChallengeUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.GCGChallengeUpdateNotifyOuterClass.GCGChallengeUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGChallengeUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGChallengeUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036GCGChallengeUpdateNotify.proto\032\026GCGDue" +
      "lChallenge.proto\"T\n\030GCGChallengeUpdateNo" +
      "tify\022\022\n\nserver_seq\030\017 \001(\r\022$\n\tchallenge\030\001 " +
      "\001(\0132\021.GCGDuelChallengeB\030\n\026emu.gingerps.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.GCGDuelChallengeOuterClass.getDescriptor(),
        });
    internal_static_GCGChallengeUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGChallengeUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGChallengeUpdateNotify_descriptor,
        new java.lang.String[] { "ServerSeq", "Challenge", });
    emu.gingerps.net.proto.GCGDuelChallengeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
