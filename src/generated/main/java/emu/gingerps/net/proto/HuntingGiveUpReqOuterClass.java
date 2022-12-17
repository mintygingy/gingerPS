// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HuntingGiveUpReq.proto

package emu.gingerps.net.proto;

public final class HuntingGiveUpReqOuterClass {
  private HuntingGiveUpReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HuntingGiveUpReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HuntingGiveUpReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.HuntingPair hunting_pair = 2;</code>
     * @return Whether the huntingPair field is set.
     */
    boolean hasHuntingPair();
    /**
     * <code>.HuntingPair hunting_pair = 2;</code>
     * @return The huntingPair.
     */
    emu.gingerps.net.proto.HuntingPairOuterClass.HuntingPair getHuntingPair();
    /**
     * <code>.HuntingPair hunting_pair = 2;</code>
     */
    emu.gingerps.net.proto.HuntingPairOuterClass.HuntingPairOrBuilder getHuntingPairOrBuilder();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4308;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code HuntingGiveUpReq}
   */
  public static final class HuntingGiveUpReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HuntingGiveUpReq)
      HuntingGiveUpReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HuntingGiveUpReq.newBuilder() to construct.
    private HuntingGiveUpReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HuntingGiveUpReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HuntingGiveUpReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.internal_static_HuntingGiveUpReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.internal_static_HuntingGiveUpReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq.class, emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq.Builder.class);
    }

    public static final int HUNTING_PAIR_FIELD_NUMBER = 2;
    private emu.gingerps.net.proto.HuntingPairOuterClass.HuntingPair huntingPair_;
    /**
     * <code>.HuntingPair hunting_pair = 2;</code>
     * @return Whether the huntingPair field is set.
     */
    @java.lang.Override
    public boolean hasHuntingPair() {
      return huntingPair_ != null;
    }
    /**
     * <code>.HuntingPair hunting_pair = 2;</code>
     * @return The huntingPair.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.HuntingPairOuterClass.HuntingPair getHuntingPair() {
      return huntingPair_ == null ? emu.gingerps.net.proto.HuntingPairOuterClass.HuntingPair.getDefaultInstance() : huntingPair_;
    }
    /**
     * <code>.HuntingPair hunting_pair = 2;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.HuntingPairOuterClass.HuntingPairOrBuilder getHuntingPairOrBuilder() {
      return huntingPair_ == null ? emu.gingerps.net.proto.HuntingPairOuterClass.HuntingPair.getDefaultInstance() : huntingPair_;
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
      if (huntingPair_ != null) {
        output.writeMessage(2, getHuntingPair());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (huntingPair_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getHuntingPair());
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
      if (!(obj instanceof emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq other = (emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq) obj;

      if (hasHuntingPair() != other.hasHuntingPair()) return false;
      if (hasHuntingPair()) {
        if (!getHuntingPair()
            .equals(other.getHuntingPair())) return false;
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
      if (hasHuntingPair()) {
        hash = (37 * hash) + HUNTING_PAIR_FIELD_NUMBER;
        hash = (53 * hash) + getHuntingPair().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq prototype) {
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
     *   CMD_ID = 4308;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code HuntingGiveUpReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HuntingGiveUpReq)
        emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.internal_static_HuntingGiveUpReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.internal_static_HuntingGiveUpReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq.class, emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq.newBuilder()
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
        huntingPair_ = null;
        if (huntingPairBuilder_ != null) {
          huntingPairBuilder_.dispose();
          huntingPairBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.internal_static_HuntingGiveUpReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq build() {
        emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq buildPartial() {
        emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq result = new emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.huntingPair_ = huntingPairBuilder_ == null
              ? huntingPair_
              : huntingPairBuilder_.build();
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
        if (other instanceof emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq) {
          return mergeFrom((emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq other) {
        if (other == emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq.getDefaultInstance()) return this;
        if (other.hasHuntingPair()) {
          mergeHuntingPair(other.getHuntingPair());
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
              case 18: {
                input.readMessage(
                    getHuntingPairFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 18
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

      private emu.gingerps.net.proto.HuntingPairOuterClass.HuntingPair huntingPair_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.HuntingPairOuterClass.HuntingPair, emu.gingerps.net.proto.HuntingPairOuterClass.HuntingPair.Builder, emu.gingerps.net.proto.HuntingPairOuterClass.HuntingPairOrBuilder> huntingPairBuilder_;
      /**
       * <code>.HuntingPair hunting_pair = 2;</code>
       * @return Whether the huntingPair field is set.
       */
      public boolean hasHuntingPair() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.HuntingPair hunting_pair = 2;</code>
       * @return The huntingPair.
       */
      public emu.gingerps.net.proto.HuntingPairOuterClass.HuntingPair getHuntingPair() {
        if (huntingPairBuilder_ == null) {
          return huntingPair_ == null ? emu.gingerps.net.proto.HuntingPairOuterClass.HuntingPair.getDefaultInstance() : huntingPair_;
        } else {
          return huntingPairBuilder_.getMessage();
        }
      }
      /**
       * <code>.HuntingPair hunting_pair = 2;</code>
       */
      public Builder setHuntingPair(emu.gingerps.net.proto.HuntingPairOuterClass.HuntingPair value) {
        if (huntingPairBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          huntingPair_ = value;
        } else {
          huntingPairBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.HuntingPair hunting_pair = 2;</code>
       */
      public Builder setHuntingPair(
          emu.gingerps.net.proto.HuntingPairOuterClass.HuntingPair.Builder builderForValue) {
        if (huntingPairBuilder_ == null) {
          huntingPair_ = builderForValue.build();
        } else {
          huntingPairBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.HuntingPair hunting_pair = 2;</code>
       */
      public Builder mergeHuntingPair(emu.gingerps.net.proto.HuntingPairOuterClass.HuntingPair value) {
        if (huntingPairBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            huntingPair_ != null &&
            huntingPair_ != emu.gingerps.net.proto.HuntingPairOuterClass.HuntingPair.getDefaultInstance()) {
            getHuntingPairBuilder().mergeFrom(value);
          } else {
            huntingPair_ = value;
          }
        } else {
          huntingPairBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.HuntingPair hunting_pair = 2;</code>
       */
      public Builder clearHuntingPair() {
        bitField0_ = (bitField0_ & ~0x00000001);
        huntingPair_ = null;
        if (huntingPairBuilder_ != null) {
          huntingPairBuilder_.dispose();
          huntingPairBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.HuntingPair hunting_pair = 2;</code>
       */
      public emu.gingerps.net.proto.HuntingPairOuterClass.HuntingPair.Builder getHuntingPairBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getHuntingPairFieldBuilder().getBuilder();
      }
      /**
       * <code>.HuntingPair hunting_pair = 2;</code>
       */
      public emu.gingerps.net.proto.HuntingPairOuterClass.HuntingPairOrBuilder getHuntingPairOrBuilder() {
        if (huntingPairBuilder_ != null) {
          return huntingPairBuilder_.getMessageOrBuilder();
        } else {
          return huntingPair_ == null ?
              emu.gingerps.net.proto.HuntingPairOuterClass.HuntingPair.getDefaultInstance() : huntingPair_;
        }
      }
      /**
       * <code>.HuntingPair hunting_pair = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.HuntingPairOuterClass.HuntingPair, emu.gingerps.net.proto.HuntingPairOuterClass.HuntingPair.Builder, emu.gingerps.net.proto.HuntingPairOuterClass.HuntingPairOrBuilder> 
          getHuntingPairFieldBuilder() {
        if (huntingPairBuilder_ == null) {
          huntingPairBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.HuntingPairOuterClass.HuntingPair, emu.gingerps.net.proto.HuntingPairOuterClass.HuntingPair.Builder, emu.gingerps.net.proto.HuntingPairOuterClass.HuntingPairOrBuilder>(
                  getHuntingPair(),
                  getParentForChildren(),
                  isClean());
          huntingPair_ = null;
        }
        return huntingPairBuilder_;
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


      // @@protoc_insertion_point(builder_scope:HuntingGiveUpReq)
    }

    // @@protoc_insertion_point(class_scope:HuntingGiveUpReq)
    private static final emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq();
    }

    public static emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HuntingGiveUpReq>
        PARSER = new com.google.protobuf.AbstractParser<HuntingGiveUpReq>() {
      @java.lang.Override
      public HuntingGiveUpReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<HuntingGiveUpReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HuntingGiveUpReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.HuntingGiveUpReqOuterClass.HuntingGiveUpReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HuntingGiveUpReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HuntingGiveUpReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026HuntingGiveUpReq.proto\032\021HuntingPair.pr" +
      "oto\"6\n\020HuntingGiveUpReq\022\"\n\014hunting_pair\030" +
      "\002 \001(\0132\014.HuntingPairB\030\n\026emu.gingerps.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.HuntingPairOuterClass.getDescriptor(),
        });
    internal_static_HuntingGiveUpReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HuntingGiveUpReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HuntingGiveUpReq_descriptor,
        new java.lang.String[] { "HuntingPair", });
    emu.gingerps.net.proto.HuntingPairOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
