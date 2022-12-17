// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientTransmitReq.proto

package emu.gingerps.net.proto;

public final class ClientTransmitReqOuterClass {
  private ClientTransmitReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ClientTransmitReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ClientTransmitReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.TransmitReason reason = 3;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.TransmitReason reason = 3;</code>
     * @return The reason.
     */
    emu.gingerps.net.proto.TransmitReasonOuterClass.TransmitReason getReason();

    /**
     * <code>uint32 scene_id = 9;</code>
     * @return The sceneId.
     */
    int getSceneId();

    /**
     * <code>.Vector rot = 6;</code>
     * @return Whether the rot field is set.
     */
    boolean hasRot();
    /**
     * <code>.Vector rot = 6;</code>
     * @return The rot.
     */
    emu.gingerps.net.proto.VectorOuterClass.Vector getRot();
    /**
     * <code>.Vector rot = 6;</code>
     */
    emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getRotOrBuilder();

    /**
     * <code>.Vector pos = 4;</code>
     * @return Whether the pos field is set.
     */
    boolean hasPos();
    /**
     * <code>.Vector pos = 4;</code>
     * @return The pos.
     */
    emu.gingerps.net.proto.VectorOuterClass.Vector getPos();
    /**
     * <code>.Vector pos = 4;</code>
     */
    emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 221;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ClientTransmitReq}
   */
  public static final class ClientTransmitReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ClientTransmitReq)
      ClientTransmitReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ClientTransmitReq.newBuilder() to construct.
    private ClientTransmitReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ClientTransmitReq() {
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ClientTransmitReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.ClientTransmitReqOuterClass.internal_static_ClientTransmitReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.ClientTransmitReqOuterClass.internal_static_ClientTransmitReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq.class, emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq.Builder.class);
    }

    public static final int REASON_FIELD_NUMBER = 3;
    private int reason_ = 0;
    /**
     * <code>.TransmitReason reason = 3;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.TransmitReason reason = 3;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.gingerps.net.proto.TransmitReasonOuterClass.TransmitReason getReason() {
      emu.gingerps.net.proto.TransmitReasonOuterClass.TransmitReason result = emu.gingerps.net.proto.TransmitReasonOuterClass.TransmitReason.forNumber(reason_);
      return result == null ? emu.gingerps.net.proto.TransmitReasonOuterClass.TransmitReason.UNRECOGNIZED : result;
    }

    public static final int SCENE_ID_FIELD_NUMBER = 9;
    private int sceneId_ = 0;
    /**
     * <code>uint32 scene_id = 9;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }

    public static final int ROT_FIELD_NUMBER = 6;
    private emu.gingerps.net.proto.VectorOuterClass.Vector rot_;
    /**
     * <code>.Vector rot = 6;</code>
     * @return Whether the rot field is set.
     */
    @java.lang.Override
    public boolean hasRot() {
      return rot_ != null;
    }
    /**
     * <code>.Vector rot = 6;</code>
     * @return The rot.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.VectorOuterClass.Vector getRot() {
      return rot_ == null ? emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
    }
    /**
     * <code>.Vector rot = 6;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getRotOrBuilder() {
      return rot_ == null ? emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
    }

    public static final int POS_FIELD_NUMBER = 4;
    private emu.gingerps.net.proto.VectorOuterClass.Vector pos_;
    /**
     * <code>.Vector pos = 4;</code>
     * @return Whether the pos field is set.
     */
    @java.lang.Override
    public boolean hasPos() {
      return pos_ != null;
    }
    /**
     * <code>.Vector pos = 4;</code>
     * @return The pos.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.VectorOuterClass.Vector getPos() {
      return pos_ == null ? emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
    }
    /**
     * <code>.Vector pos = 4;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
      return pos_ == null ? emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
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
      if (reason_ != emu.gingerps.net.proto.TransmitReasonOuterClass.TransmitReason.TRANSMIT_REASON_NONE.getNumber()) {
        output.writeEnum(3, reason_);
      }
      if (pos_ != null) {
        output.writeMessage(4, getPos());
      }
      if (rot_ != null) {
        output.writeMessage(6, getRot());
      }
      if (sceneId_ != 0) {
        output.writeUInt32(9, sceneId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (reason_ != emu.gingerps.net.proto.TransmitReasonOuterClass.TransmitReason.TRANSMIT_REASON_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, reason_);
      }
      if (pos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getPos());
      }
      if (rot_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getRot());
      }
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, sceneId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq other = (emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq) obj;

      if (reason_ != other.reason_) return false;
      if (getSceneId()
          != other.getSceneId()) return false;
      if (hasRot() != other.hasRot()) return false;
      if (hasRot()) {
        if (!getRot()
            .equals(other.getRot())) return false;
      }
      if (hasPos() != other.hasPos()) return false;
      if (hasPos()) {
        if (!getPos()
            .equals(other.getPos())) return false;
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
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      if (hasRot()) {
        hash = (37 * hash) + ROT_FIELD_NUMBER;
        hash = (53 * hash) + getRot().hashCode();
      }
      if (hasPos()) {
        hash = (37 * hash) + POS_FIELD_NUMBER;
        hash = (53 * hash) + getPos().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq prototype) {
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
     *   CMD_ID = 221;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ClientTransmitReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ClientTransmitReq)
        emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.ClientTransmitReqOuterClass.internal_static_ClientTransmitReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.ClientTransmitReqOuterClass.internal_static_ClientTransmitReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq.class, emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq.newBuilder()
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
        reason_ = 0;
        sceneId_ = 0;
        rot_ = null;
        if (rotBuilder_ != null) {
          rotBuilder_.dispose();
          rotBuilder_ = null;
        }
        pos_ = null;
        if (posBuilder_ != null) {
          posBuilder_.dispose();
          posBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.ClientTransmitReqOuterClass.internal_static_ClientTransmitReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq build() {
        emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq buildPartial() {
        emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq result = new emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.reason_ = reason_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.sceneId_ = sceneId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.rot_ = rotBuilder_ == null
              ? rot_
              : rotBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.pos_ = posBuilder_ == null
              ? pos_
              : posBuilder_.build();
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
        if (other instanceof emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq) {
          return mergeFrom((emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq other) {
        if (other == emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq.getDefaultInstance()) return this;
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
        }
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (other.hasRot()) {
          mergeRot(other.getRot());
        }
        if (other.hasPos()) {
          mergePos(other.getPos());
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
              case 24: {
                reason_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 24
              case 34: {
                input.readMessage(
                    getPosFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000008;
                break;
              } // case 34
              case 50: {
                input.readMessage(
                    getRotFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 50
              case 72: {
                sceneId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 72
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

      private int reason_ = 0;
      /**
       * <code>.TransmitReason reason = 3;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.TransmitReason reason = 3;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        reason_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.TransmitReason reason = 3;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.gingerps.net.proto.TransmitReasonOuterClass.TransmitReason getReason() {
        emu.gingerps.net.proto.TransmitReasonOuterClass.TransmitReason result = emu.gingerps.net.proto.TransmitReasonOuterClass.TransmitReason.forNumber(reason_);
        return result == null ? emu.gingerps.net.proto.TransmitReasonOuterClass.TransmitReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.TransmitReason reason = 3;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.gingerps.net.proto.TransmitReasonOuterClass.TransmitReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.TransmitReason reason = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        bitField0_ = (bitField0_ & ~0x00000001);
        reason_ = 0;
        onChanged();
        return this;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 9;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 9;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        sceneId_ = 0;
        onChanged();
        return this;
      }

      private emu.gingerps.net.proto.VectorOuterClass.Vector rot_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder> rotBuilder_;
      /**
       * <code>.Vector rot = 6;</code>
       * @return Whether the rot field is set.
       */
      public boolean hasRot() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>.Vector rot = 6;</code>
       * @return The rot.
       */
      public emu.gingerps.net.proto.VectorOuterClass.Vector getRot() {
        if (rotBuilder_ == null) {
          return rot_ == null ? emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
        } else {
          return rotBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector rot = 6;</code>
       */
      public Builder setRot(emu.gingerps.net.proto.VectorOuterClass.Vector value) {
        if (rotBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          rot_ = value;
        } else {
          rotBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector rot = 6;</code>
       */
      public Builder setRot(
          emu.gingerps.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (rotBuilder_ == null) {
          rot_ = builderForValue.build();
        } else {
          rotBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector rot = 6;</code>
       */
      public Builder mergeRot(emu.gingerps.net.proto.VectorOuterClass.Vector value) {
        if (rotBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0) &&
            rot_ != null &&
            rot_ != emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance()) {
            getRotBuilder().mergeFrom(value);
          } else {
            rot_ = value;
          }
        } else {
          rotBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector rot = 6;</code>
       */
      public Builder clearRot() {
        bitField0_ = (bitField0_ & ~0x00000004);
        rot_ = null;
        if (rotBuilder_ != null) {
          rotBuilder_.dispose();
          rotBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.Vector rot = 6;</code>
       */
      public emu.gingerps.net.proto.VectorOuterClass.Vector.Builder getRotBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getRotFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector rot = 6;</code>
       */
      public emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getRotOrBuilder() {
        if (rotBuilder_ != null) {
          return rotBuilder_.getMessageOrBuilder();
        } else {
          return rot_ == null ?
              emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
        }
      }
      /**
       * <code>.Vector rot = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder> 
          getRotFieldBuilder() {
        if (rotBuilder_ == null) {
          rotBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getRot(),
                  getParentForChildren(),
                  isClean());
          rot_ = null;
        }
        return rotBuilder_;
      }

      private emu.gingerps.net.proto.VectorOuterClass.Vector pos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder> posBuilder_;
      /**
       * <code>.Vector pos = 4;</code>
       * @return Whether the pos field is set.
       */
      public boolean hasPos() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>.Vector pos = 4;</code>
       * @return The pos.
       */
      public emu.gingerps.net.proto.VectorOuterClass.Vector getPos() {
        if (posBuilder_ == null) {
          return pos_ == null ? emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        } else {
          return posBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector pos = 4;</code>
       */
      public Builder setPos(emu.gingerps.net.proto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pos_ = value;
        } else {
          posBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector pos = 4;</code>
       */
      public Builder setPos(
          emu.gingerps.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (posBuilder_ == null) {
          pos_ = builderForValue.build();
        } else {
          posBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector pos = 4;</code>
       */
      public Builder mergePos(emu.gingerps.net.proto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (((bitField0_ & 0x00000008) != 0) &&
            pos_ != null &&
            pos_ != emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance()) {
            getPosBuilder().mergeFrom(value);
          } else {
            pos_ = value;
          }
        } else {
          posBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector pos = 4;</code>
       */
      public Builder clearPos() {
        bitField0_ = (bitField0_ & ~0x00000008);
        pos_ = null;
        if (posBuilder_ != null) {
          posBuilder_.dispose();
          posBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.Vector pos = 4;</code>
       */
      public emu.gingerps.net.proto.VectorOuterClass.Vector.Builder getPosBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector pos = 4;</code>
       */
      public emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
        if (posBuilder_ != null) {
          return posBuilder_.getMessageOrBuilder();
        } else {
          return pos_ == null ?
              emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        }
      }
      /**
       * <code>.Vector pos = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder> 
          getPosFieldBuilder() {
        if (posBuilder_ == null) {
          posBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getPos(),
                  getParentForChildren(),
                  isClean());
          pos_ = null;
        }
        return posBuilder_;
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


      // @@protoc_insertion_point(builder_scope:ClientTransmitReq)
    }

    // @@protoc_insertion_point(class_scope:ClientTransmitReq)
    private static final emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq();
    }

    public static emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ClientTransmitReq>
        PARSER = new com.google.protobuf.AbstractParser<ClientTransmitReq>() {
      @java.lang.Override
      public ClientTransmitReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<ClientTransmitReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ClientTransmitReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.ClientTransmitReqOuterClass.ClientTransmitReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientTransmitReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientTransmitReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027ClientTransmitReq.proto\032\024TransmitReaso" +
      "n.proto\032\014Vector.proto\"r\n\021ClientTransmitR" +
      "eq\022\037\n\006reason\030\003 \001(\0162\017.TransmitReason\022\020\n\010s" +
      "cene_id\030\t \001(\r\022\024\n\003rot\030\006 \001(\0132\007.Vector\022\024\n\003p" +
      "os\030\004 \001(\0132\007.VectorB\030\n\026emu.gingerps.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.TransmitReasonOuterClass.getDescriptor(),
          emu.gingerps.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_ClientTransmitReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ClientTransmitReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientTransmitReq_descriptor,
        new java.lang.String[] { "Reason", "SceneId", "Rot", "Pos", });
    emu.gingerps.net.proto.TransmitReasonOuterClass.getDescriptor();
    emu.gingerps.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
