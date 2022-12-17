// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EntityMoveInfo.proto

package emu.gingerps.net.proto;

public final class EntityMoveInfoOuterClass {
  private EntityMoveInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EntityMoveInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EntityMoveInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entity_id = 1;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>.MotionInfo motion_info = 2;</code>
     * @return Whether the motionInfo field is set.
     */
    boolean hasMotionInfo();
    /**
     * <code>.MotionInfo motion_info = 2;</code>
     * @return The motionInfo.
     */
    emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo getMotionInfo();
    /**
     * <code>.MotionInfo motion_info = 2;</code>
     */
    emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfoOrBuilder getMotionInfoOrBuilder();

    /**
     * <code>uint32 scene_time = 3;</code>
     * @return The sceneTime.
     */
    int getSceneTime();

    /**
     * <code>uint32 reliable_seq = 4;</code>
     * @return The reliableSeq.
     */
    int getReliableSeq();

    /**
     * <code>bool is_reliable = 5;</code>
     * @return The isReliable.
     */
    boolean getIsReliable();
  }
  /**
   * Protobuf type {@code EntityMoveInfo}
   */
  public static final class EntityMoveInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EntityMoveInfo)
      EntityMoveInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EntityMoveInfo.newBuilder() to construct.
    private EntityMoveInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EntityMoveInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EntityMoveInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.EntityMoveInfoOuterClass.internal_static_EntityMoveInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.EntityMoveInfoOuterClass.internal_static_EntityMoveInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo.class, emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo.Builder.class);
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 1;
    private int entityId_ = 0;
    /**
     * <code>uint32 entity_id = 1;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int MOTION_INFO_FIELD_NUMBER = 2;
    private emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo motionInfo_;
    /**
     * <code>.MotionInfo motion_info = 2;</code>
     * @return Whether the motionInfo field is set.
     */
    @java.lang.Override
    public boolean hasMotionInfo() {
      return motionInfo_ != null;
    }
    /**
     * <code>.MotionInfo motion_info = 2;</code>
     * @return The motionInfo.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo getMotionInfo() {
      return motionInfo_ == null ? emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo.getDefaultInstance() : motionInfo_;
    }
    /**
     * <code>.MotionInfo motion_info = 2;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfoOrBuilder getMotionInfoOrBuilder() {
      return motionInfo_ == null ? emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo.getDefaultInstance() : motionInfo_;
    }

    public static final int SCENE_TIME_FIELD_NUMBER = 3;
    private int sceneTime_ = 0;
    /**
     * <code>uint32 scene_time = 3;</code>
     * @return The sceneTime.
     */
    @java.lang.Override
    public int getSceneTime() {
      return sceneTime_;
    }

    public static final int RELIABLE_SEQ_FIELD_NUMBER = 4;
    private int reliableSeq_ = 0;
    /**
     * <code>uint32 reliable_seq = 4;</code>
     * @return The reliableSeq.
     */
    @java.lang.Override
    public int getReliableSeq() {
      return reliableSeq_;
    }

    public static final int IS_RELIABLE_FIELD_NUMBER = 5;
    private boolean isReliable_ = false;
    /**
     * <code>bool is_reliable = 5;</code>
     * @return The isReliable.
     */
    @java.lang.Override
    public boolean getIsReliable() {
      return isReliable_;
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
      if (entityId_ != 0) {
        output.writeUInt32(1, entityId_);
      }
      if (motionInfo_ != null) {
        output.writeMessage(2, getMotionInfo());
      }
      if (sceneTime_ != 0) {
        output.writeUInt32(3, sceneTime_);
      }
      if (reliableSeq_ != 0) {
        output.writeUInt32(4, reliableSeq_);
      }
      if (isReliable_ != false) {
        output.writeBool(5, isReliable_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, entityId_);
      }
      if (motionInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getMotionInfo());
      }
      if (sceneTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, sceneTime_);
      }
      if (reliableSeq_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, reliableSeq_);
      }
      if (isReliable_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isReliable_);
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
      if (!(obj instanceof emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo other = (emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (hasMotionInfo() != other.hasMotionInfo()) return false;
      if (hasMotionInfo()) {
        if (!getMotionInfo()
            .equals(other.getMotionInfo())) return false;
      }
      if (getSceneTime()
          != other.getSceneTime()) return false;
      if (getReliableSeq()
          != other.getReliableSeq()) return false;
      if (getIsReliable()
          != other.getIsReliable()) return false;
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
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      if (hasMotionInfo()) {
        hash = (37 * hash) + MOTION_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getMotionInfo().hashCode();
      }
      hash = (37 * hash) + SCENE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getSceneTime();
      hash = (37 * hash) + RELIABLE_SEQ_FIELD_NUMBER;
      hash = (53 * hash) + getReliableSeq();
      hash = (37 * hash) + IS_RELIABLE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsReliable());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo prototype) {
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
     * Protobuf type {@code EntityMoveInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EntityMoveInfo)
        emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.EntityMoveInfoOuterClass.internal_static_EntityMoveInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.EntityMoveInfoOuterClass.internal_static_EntityMoveInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo.class, emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo.newBuilder()
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
        entityId_ = 0;
        motionInfo_ = null;
        if (motionInfoBuilder_ != null) {
          motionInfoBuilder_.dispose();
          motionInfoBuilder_ = null;
        }
        sceneTime_ = 0;
        reliableSeq_ = 0;
        isReliable_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.EntityMoveInfoOuterClass.internal_static_EntityMoveInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo build() {
        emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo buildPartial() {
        emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo result = new emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.entityId_ = entityId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.motionInfo_ = motionInfoBuilder_ == null
              ? motionInfo_
              : motionInfoBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.sceneTime_ = sceneTime_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.reliableSeq_ = reliableSeq_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.isReliable_ = isReliable_;
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
        if (other instanceof emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo) {
          return mergeFrom((emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo other) {
        if (other == emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.hasMotionInfo()) {
          mergeMotionInfo(other.getMotionInfo());
        }
        if (other.getSceneTime() != 0) {
          setSceneTime(other.getSceneTime());
        }
        if (other.getReliableSeq() != 0) {
          setReliableSeq(other.getReliableSeq());
        }
        if (other.getIsReliable() != false) {
          setIsReliable(other.getIsReliable());
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
              case 8: {
                entityId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                input.readMessage(
                    getMotionInfoFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 24: {
                sceneTime_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 32: {
                reliableSeq_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
              case 40: {
                isReliable_ = input.readBool();
                bitField0_ |= 0x00000010;
                break;
              } // case 40
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

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 1;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 1;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        entityId_ = 0;
        onChanged();
        return this;
      }

      private emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo motionInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo, emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo.Builder, emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfoOrBuilder> motionInfoBuilder_;
      /**
       * <code>.MotionInfo motion_info = 2;</code>
       * @return Whether the motionInfo field is set.
       */
      public boolean hasMotionInfo() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.MotionInfo motion_info = 2;</code>
       * @return The motionInfo.
       */
      public emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo getMotionInfo() {
        if (motionInfoBuilder_ == null) {
          return motionInfo_ == null ? emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo.getDefaultInstance() : motionInfo_;
        } else {
          return motionInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.MotionInfo motion_info = 2;</code>
       */
      public Builder setMotionInfo(emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo value) {
        if (motionInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          motionInfo_ = value;
        } else {
          motionInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.MotionInfo motion_info = 2;</code>
       */
      public Builder setMotionInfo(
          emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo.Builder builderForValue) {
        if (motionInfoBuilder_ == null) {
          motionInfo_ = builderForValue.build();
        } else {
          motionInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.MotionInfo motion_info = 2;</code>
       */
      public Builder mergeMotionInfo(emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo value) {
        if (motionInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            motionInfo_ != null &&
            motionInfo_ != emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo.getDefaultInstance()) {
            getMotionInfoBuilder().mergeFrom(value);
          } else {
            motionInfo_ = value;
          }
        } else {
          motionInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.MotionInfo motion_info = 2;</code>
       */
      public Builder clearMotionInfo() {
        bitField0_ = (bitField0_ & ~0x00000002);
        motionInfo_ = null;
        if (motionInfoBuilder_ != null) {
          motionInfoBuilder_.dispose();
          motionInfoBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.MotionInfo motion_info = 2;</code>
       */
      public emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo.Builder getMotionInfoBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getMotionInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.MotionInfo motion_info = 2;</code>
       */
      public emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfoOrBuilder getMotionInfoOrBuilder() {
        if (motionInfoBuilder_ != null) {
          return motionInfoBuilder_.getMessageOrBuilder();
        } else {
          return motionInfo_ == null ?
              emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo.getDefaultInstance() : motionInfo_;
        }
      }
      /**
       * <code>.MotionInfo motion_info = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo, emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo.Builder, emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfoOrBuilder> 
          getMotionInfoFieldBuilder() {
        if (motionInfoBuilder_ == null) {
          motionInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo, emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo.Builder, emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfoOrBuilder>(
                  getMotionInfo(),
                  getParentForChildren(),
                  isClean());
          motionInfo_ = null;
        }
        return motionInfoBuilder_;
      }

      private int sceneTime_ ;
      /**
       * <code>uint32 scene_time = 3;</code>
       * @return The sceneTime.
       */
      @java.lang.Override
      public int getSceneTime() {
        return sceneTime_;
      }
      /**
       * <code>uint32 scene_time = 3;</code>
       * @param value The sceneTime to set.
       * @return This builder for chaining.
       */
      public Builder setSceneTime(int value) {
        
        sceneTime_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_time = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneTime() {
        bitField0_ = (bitField0_ & ~0x00000004);
        sceneTime_ = 0;
        onChanged();
        return this;
      }

      private int reliableSeq_ ;
      /**
       * <code>uint32 reliable_seq = 4;</code>
       * @return The reliableSeq.
       */
      @java.lang.Override
      public int getReliableSeq() {
        return reliableSeq_;
      }
      /**
       * <code>uint32 reliable_seq = 4;</code>
       * @param value The reliableSeq to set.
       * @return This builder for chaining.
       */
      public Builder setReliableSeq(int value) {
        
        reliableSeq_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 reliable_seq = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearReliableSeq() {
        bitField0_ = (bitField0_ & ~0x00000008);
        reliableSeq_ = 0;
        onChanged();
        return this;
      }

      private boolean isReliable_ ;
      /**
       * <code>bool is_reliable = 5;</code>
       * @return The isReliable.
       */
      @java.lang.Override
      public boolean getIsReliable() {
        return isReliable_;
      }
      /**
       * <code>bool is_reliable = 5;</code>
       * @param value The isReliable to set.
       * @return This builder for chaining.
       */
      public Builder setIsReliable(boolean value) {
        
        isReliable_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_reliable = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsReliable() {
        bitField0_ = (bitField0_ & ~0x00000010);
        isReliable_ = false;
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


      // @@protoc_insertion_point(builder_scope:EntityMoveInfo)
    }

    // @@protoc_insertion_point(class_scope:EntityMoveInfo)
    private static final emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo();
    }

    public static emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EntityMoveInfo>
        PARSER = new com.google.protobuf.AbstractParser<EntityMoveInfo>() {
      @java.lang.Override
      public EntityMoveInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<EntityMoveInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EntityMoveInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.EntityMoveInfoOuterClass.EntityMoveInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EntityMoveInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EntityMoveInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024EntityMoveInfo.proto\032\020MotionInfo.proto" +
      "\"\204\001\n\016EntityMoveInfo\022\021\n\tentity_id\030\001 \001(\r\022 " +
      "\n\013motion_info\030\002 \001(\0132\013.MotionInfo\022\022\n\nscen" +
      "e_time\030\003 \001(\r\022\024\n\014reliable_seq\030\004 \001(\r\022\023\n\013is" +
      "_reliable\030\005 \001(\010B\030\n\026emu.gingerps.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.MotionInfoOuterClass.getDescriptor(),
        });
    internal_static_EntityMoveInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EntityMoveInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EntityMoveInfo_descriptor,
        new java.lang.String[] { "EntityId", "MotionInfo", "SceneTime", "ReliableSeq", "IsReliable", });
    emu.gingerps.net.proto.MotionInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
