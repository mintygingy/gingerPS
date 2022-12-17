// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtLightCoreMove.proto

package emu.gingerps.net.proto;

public final class EvtLightCoreMoveOuterClass {
  private EvtLightCoreMoveOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtLightCoreMoveOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtLightCoreMove)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float speed = 4;</code>
     * @return The speed.
     */
    float getSpeed();

    /**
     * <code>uint32 entity_id = 12;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>float Unk3300_BLNIJMMNAGH = 1;</code>
     * @return The unk3300BLNIJMMNAGH.
     */
    float getUnk3300BLNIJMMNAGH();

    /**
     * <code>float Unk3300_NHPEDPJMCOL = 5;</code>
     * @return The unk3300NHPEDPJMCOL.
     */
    float getUnk3300NHPEDPJMCOL();

    /**
     * <code>.Vector target_pos = 11;</code>
     * @return Whether the targetPos field is set.
     */
    boolean hasTargetPos();
    /**
     * <code>.Vector target_pos = 11;</code>
     * @return The targetPos.
     */
    emu.gingerps.net.proto.VectorOuterClass.Vector getTargetPos();
    /**
     * <code>.Vector target_pos = 11;</code>
     */
    emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getTargetPosOrBuilder();
  }
  /**
   * Protobuf type {@code EvtLightCoreMove}
   */
  public static final class EvtLightCoreMove extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtLightCoreMove)
      EvtLightCoreMoveOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtLightCoreMove.newBuilder() to construct.
    private EvtLightCoreMove(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtLightCoreMove() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtLightCoreMove();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EvtLightCoreMove(
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
            case 13: {

              unk3300BLNIJMMNAGH_ = input.readFloat();
              break;
            }
            case 37: {

              speed_ = input.readFloat();
              break;
            }
            case 45: {

              unk3300NHPEDPJMCOL_ = input.readFloat();
              break;
            }
            case 90: {
              emu.gingerps.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (targetPos_ != null) {
                subBuilder = targetPos_.toBuilder();
              }
              targetPos_ = input.readMessage(emu.gingerps.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(targetPos_);
                targetPos_ = subBuilder.buildPartial();
              }

              break;
            }
            case 96: {

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
      return emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.internal_static_EvtLightCoreMove_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.internal_static_EvtLightCoreMove_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove.class, emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove.Builder.class);
    }

    public static final int SPEED_FIELD_NUMBER = 4;
    private float speed_;
    /**
     * <code>float speed = 4;</code>
     * @return The speed.
     */
    @java.lang.Override
    public float getSpeed() {
      return speed_;
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 12;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 12;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int UNK3300_BLNIJMMNAGH_FIELD_NUMBER = 1;
    private float unk3300BLNIJMMNAGH_;
    /**
     * <code>float Unk3300_BLNIJMMNAGH = 1;</code>
     * @return The unk3300BLNIJMMNAGH.
     */
    @java.lang.Override
    public float getUnk3300BLNIJMMNAGH() {
      return unk3300BLNIJMMNAGH_;
    }

    public static final int UNK3300_NHPEDPJMCOL_FIELD_NUMBER = 5;
    private float unk3300NHPEDPJMCOL_;
    /**
     * <code>float Unk3300_NHPEDPJMCOL = 5;</code>
     * @return The unk3300NHPEDPJMCOL.
     */
    @java.lang.Override
    public float getUnk3300NHPEDPJMCOL() {
      return unk3300NHPEDPJMCOL_;
    }

    public static final int TARGET_POS_FIELD_NUMBER = 11;
    private emu.gingerps.net.proto.VectorOuterClass.Vector targetPos_;
    /**
     * <code>.Vector target_pos = 11;</code>
     * @return Whether the targetPos field is set.
     */
    @java.lang.Override
    public boolean hasTargetPos() {
      return targetPos_ != null;
    }
    /**
     * <code>.Vector target_pos = 11;</code>
     * @return The targetPos.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.VectorOuterClass.Vector getTargetPos() {
      return targetPos_ == null ? emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : targetPos_;
    }
    /**
     * <code>.Vector target_pos = 11;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getTargetPosOrBuilder() {
      return getTargetPos();
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
      if (unk3300BLNIJMMNAGH_ != 0F) {
        output.writeFloat(1, unk3300BLNIJMMNAGH_);
      }
      if (speed_ != 0F) {
        output.writeFloat(4, speed_);
      }
      if (unk3300NHPEDPJMCOL_ != 0F) {
        output.writeFloat(5, unk3300NHPEDPJMCOL_);
      }
      if (targetPos_ != null) {
        output.writeMessage(11, getTargetPos());
      }
      if (entityId_ != 0) {
        output.writeUInt32(12, entityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300BLNIJMMNAGH_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(1, unk3300BLNIJMMNAGH_);
      }
      if (speed_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(4, speed_);
      }
      if (unk3300NHPEDPJMCOL_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(5, unk3300NHPEDPJMCOL_);
      }
      if (targetPos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getTargetPos());
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, entityId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove other = (emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove) obj;

      if (java.lang.Float.floatToIntBits(getSpeed())
          != java.lang.Float.floatToIntBits(
              other.getSpeed())) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
      if (java.lang.Float.floatToIntBits(getUnk3300BLNIJMMNAGH())
          != java.lang.Float.floatToIntBits(
              other.getUnk3300BLNIJMMNAGH())) return false;
      if (java.lang.Float.floatToIntBits(getUnk3300NHPEDPJMCOL())
          != java.lang.Float.floatToIntBits(
              other.getUnk3300NHPEDPJMCOL())) return false;
      if (hasTargetPos() != other.hasTargetPos()) return false;
      if (hasTargetPos()) {
        if (!getTargetPos()
            .equals(other.getTargetPos())) return false;
      }
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
      hash = (37 * hash) + SPEED_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getSpeed());
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + UNK3300_BLNIJMMNAGH_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getUnk3300BLNIJMMNAGH());
      hash = (37 * hash) + UNK3300_NHPEDPJMCOL_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getUnk3300NHPEDPJMCOL());
      if (hasTargetPos()) {
        hash = (37 * hash) + TARGET_POS_FIELD_NUMBER;
        hash = (53 * hash) + getTargetPos().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove prototype) {
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
     * Protobuf type {@code EvtLightCoreMove}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtLightCoreMove)
        emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMoveOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.internal_static_EvtLightCoreMove_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.internal_static_EvtLightCoreMove_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove.class, emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove.newBuilder()
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
        speed_ = 0F;

        entityId_ = 0;

        unk3300BLNIJMMNAGH_ = 0F;

        unk3300NHPEDPJMCOL_ = 0F;

        if (targetPosBuilder_ == null) {
          targetPos_ = null;
        } else {
          targetPos_ = null;
          targetPosBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.internal_static_EvtLightCoreMove_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove getDefaultInstanceForType() {
        return emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove build() {
        emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove buildPartial() {
        emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove result = new emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove(this);
        result.speed_ = speed_;
        result.entityId_ = entityId_;
        result.unk3300BLNIJMMNAGH_ = unk3300BLNIJMMNAGH_;
        result.unk3300NHPEDPJMCOL_ = unk3300NHPEDPJMCOL_;
        if (targetPosBuilder_ == null) {
          result.targetPos_ = targetPos_;
        } else {
          result.targetPos_ = targetPosBuilder_.build();
        }
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
        if (other instanceof emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove) {
          return mergeFrom((emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove other) {
        if (other == emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove.getDefaultInstance()) return this;
        if (other.getSpeed() != 0F) {
          setSpeed(other.getSpeed());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getUnk3300BLNIJMMNAGH() != 0F) {
          setUnk3300BLNIJMMNAGH(other.getUnk3300BLNIJMMNAGH());
        }
        if (other.getUnk3300NHPEDPJMCOL() != 0F) {
          setUnk3300NHPEDPJMCOL(other.getUnk3300NHPEDPJMCOL());
        }
        if (other.hasTargetPos()) {
          mergeTargetPos(other.getTargetPos());
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
        emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float speed_ ;
      /**
       * <code>float speed = 4;</code>
       * @return The speed.
       */
      @java.lang.Override
      public float getSpeed() {
        return speed_;
      }
      /**
       * <code>float speed = 4;</code>
       * @param value The speed to set.
       * @return This builder for chaining.
       */
      public Builder setSpeed(float value) {
        
        speed_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float speed = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearSpeed() {
        
        speed_ = 0F;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 12;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 12;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private float unk3300BLNIJMMNAGH_ ;
      /**
       * <code>float Unk3300_BLNIJMMNAGH = 1;</code>
       * @return The unk3300BLNIJMMNAGH.
       */
      @java.lang.Override
      public float getUnk3300BLNIJMMNAGH() {
        return unk3300BLNIJMMNAGH_;
      }
      /**
       * <code>float Unk3300_BLNIJMMNAGH = 1;</code>
       * @param value The unk3300BLNIJMMNAGH to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300BLNIJMMNAGH(float value) {
        
        unk3300BLNIJMMNAGH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float Unk3300_BLNIJMMNAGH = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300BLNIJMMNAGH() {
        
        unk3300BLNIJMMNAGH_ = 0F;
        onChanged();
        return this;
      }

      private float unk3300NHPEDPJMCOL_ ;
      /**
       * <code>float Unk3300_NHPEDPJMCOL = 5;</code>
       * @return The unk3300NHPEDPJMCOL.
       */
      @java.lang.Override
      public float getUnk3300NHPEDPJMCOL() {
        return unk3300NHPEDPJMCOL_;
      }
      /**
       * <code>float Unk3300_NHPEDPJMCOL = 5;</code>
       * @param value The unk3300NHPEDPJMCOL to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300NHPEDPJMCOL(float value) {
        
        unk3300NHPEDPJMCOL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float Unk3300_NHPEDPJMCOL = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300NHPEDPJMCOL() {
        
        unk3300NHPEDPJMCOL_ = 0F;
        onChanged();
        return this;
      }

      private emu.gingerps.net.proto.VectorOuterClass.Vector targetPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder> targetPosBuilder_;
      /**
       * <code>.Vector target_pos = 11;</code>
       * @return Whether the targetPos field is set.
       */
      public boolean hasTargetPos() {
        return targetPosBuilder_ != null || targetPos_ != null;
      }
      /**
       * <code>.Vector target_pos = 11;</code>
       * @return The targetPos.
       */
      public emu.gingerps.net.proto.VectorOuterClass.Vector getTargetPos() {
        if (targetPosBuilder_ == null) {
          return targetPos_ == null ? emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : targetPos_;
        } else {
          return targetPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector target_pos = 11;</code>
       */
      public Builder setTargetPos(emu.gingerps.net.proto.VectorOuterClass.Vector value) {
        if (targetPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          targetPos_ = value;
          onChanged();
        } else {
          targetPosBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector target_pos = 11;</code>
       */
      public Builder setTargetPos(
          emu.gingerps.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (targetPosBuilder_ == null) {
          targetPos_ = builderForValue.build();
          onChanged();
        } else {
          targetPosBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector target_pos = 11;</code>
       */
      public Builder mergeTargetPos(emu.gingerps.net.proto.VectorOuterClass.Vector value) {
        if (targetPosBuilder_ == null) {
          if (targetPos_ != null) {
            targetPos_ =
              emu.gingerps.net.proto.VectorOuterClass.Vector.newBuilder(targetPos_).mergeFrom(value).buildPartial();
          } else {
            targetPos_ = value;
          }
          onChanged();
        } else {
          targetPosBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector target_pos = 11;</code>
       */
      public Builder clearTargetPos() {
        if (targetPosBuilder_ == null) {
          targetPos_ = null;
          onChanged();
        } else {
          targetPos_ = null;
          targetPosBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector target_pos = 11;</code>
       */
      public emu.gingerps.net.proto.VectorOuterClass.Vector.Builder getTargetPosBuilder() {
        
        onChanged();
        return getTargetPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector target_pos = 11;</code>
       */
      public emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getTargetPosOrBuilder() {
        if (targetPosBuilder_ != null) {
          return targetPosBuilder_.getMessageOrBuilder();
        } else {
          return targetPos_ == null ?
              emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : targetPos_;
        }
      }
      /**
       * <code>.Vector target_pos = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder> 
          getTargetPosFieldBuilder() {
        if (targetPosBuilder_ == null) {
          targetPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getTargetPos(),
                  getParentForChildren(),
                  isClean());
          targetPos_ = null;
        }
        return targetPosBuilder_;
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


      // @@protoc_insertion_point(builder_scope:EvtLightCoreMove)
    }

    // @@protoc_insertion_point(class_scope:EvtLightCoreMove)
    private static final emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove();
    }

    public static emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtLightCoreMove>
        PARSER = new com.google.protobuf.AbstractParser<EvtLightCoreMove>() {
      @java.lang.Override
      public EvtLightCoreMove parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EvtLightCoreMove(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EvtLightCoreMove> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtLightCoreMove> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.EvtLightCoreMoveOuterClass.EvtLightCoreMove getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtLightCoreMove_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtLightCoreMove_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026EvtLightCoreMove.proto\032\014Vector.proto\"\213" +
      "\001\n\020EvtLightCoreMove\022\r\n\005speed\030\004 \001(\002\022\021\n\ten" +
      "tity_id\030\014 \001(\r\022\033\n\023Unk3300_BLNIJMMNAGH\030\001 \001" +
      "(\002\022\033\n\023Unk3300_NHPEDPJMCOL\030\005 \001(\002\022\033\n\ntarge" +
      "t_pos\030\013 \001(\0132\007.VectorB\030\n\026emu.gingerps.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_EvtLightCoreMove_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtLightCoreMove_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtLightCoreMove_descriptor,
        new java.lang.String[] { "Speed", "EntityId", "Unk3300BLNIJMMNAGH", "Unk3300NHPEDPJMCOL", "TargetPos", });
    emu.gingerps.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
