// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ForceDragAvatarNotify.proto

package emu.gingerps.net.proto;

public final class ForceDragAvatarNotifyOuterClass {
  private ForceDragAvatarNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ForceDragAvatarNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ForceDragAvatarNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 Unk3300_IMFNNPGHKJJ = 3;</code>
     * @return The unk3300IMFNNPGHKJJ.
     */
    long getUnk3300IMFNNPGHKJJ();

    /**
     * <code>.MotionInfo motion_info = 9;</code>
     * @return Whether the motionInfo field is set.
     */
    boolean hasMotionInfo();
    /**
     * <code>.MotionInfo motion_info = 9;</code>
     * @return The motionInfo.
     */
    emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo getMotionInfo();
    /**
     * <code>.MotionInfo motion_info = 9;</code>
     */
    emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfoOrBuilder getMotionInfoOrBuilder();

    /**
     * <code>bool is_first_valid = 7;</code>
     * @return The isFirstValid.
     */
    boolean getIsFirstValid();

    /**
     * <code>uint32 scene_time = 12;</code>
     * @return The sceneTime.
     */
    int getSceneTime();

    /**
     * <code>uint32 entity_id = 10;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>uint64 Unk3300_AFLCLLFDPBD = 5;</code>
     * @return The unk3300AFLCLLFDPBD.
     */
    long getUnk3300AFLCLLFDPBD();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 3008;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ForceDragAvatarNotify}
   */
  public static final class ForceDragAvatarNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ForceDragAvatarNotify)
      ForceDragAvatarNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ForceDragAvatarNotify.newBuilder() to construct.
    private ForceDragAvatarNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ForceDragAvatarNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ForceDragAvatarNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ForceDragAvatarNotify(
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
            case 24: {

              unk3300IMFNNPGHKJJ_ = input.readUInt64();
              break;
            }
            case 40: {

              unk3300AFLCLLFDPBD_ = input.readUInt64();
              break;
            }
            case 56: {

              isFirstValid_ = input.readBool();
              break;
            }
            case 74: {
              emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo.Builder subBuilder = null;
              if (motionInfo_ != null) {
                subBuilder = motionInfo_.toBuilder();
              }
              motionInfo_ = input.readMessage(emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(motionInfo_);
                motionInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 80: {

              entityId_ = input.readUInt32();
              break;
            }
            case 96: {

              sceneTime_ = input.readUInt32();
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
      return emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.internal_static_ForceDragAvatarNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.internal_static_ForceDragAvatarNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify.class, emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify.Builder.class);
    }

    public static final int UNK3300_IMFNNPGHKJJ_FIELD_NUMBER = 3;
    private long unk3300IMFNNPGHKJJ_;
    /**
     * <code>uint64 Unk3300_IMFNNPGHKJJ = 3;</code>
     * @return The unk3300IMFNNPGHKJJ.
     */
    @java.lang.Override
    public long getUnk3300IMFNNPGHKJJ() {
      return unk3300IMFNNPGHKJJ_;
    }

    public static final int MOTION_INFO_FIELD_NUMBER = 9;
    private emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo motionInfo_;
    /**
     * <code>.MotionInfo motion_info = 9;</code>
     * @return Whether the motionInfo field is set.
     */
    @java.lang.Override
    public boolean hasMotionInfo() {
      return motionInfo_ != null;
    }
    /**
     * <code>.MotionInfo motion_info = 9;</code>
     * @return The motionInfo.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo getMotionInfo() {
      return motionInfo_ == null ? emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo.getDefaultInstance() : motionInfo_;
    }
    /**
     * <code>.MotionInfo motion_info = 9;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfoOrBuilder getMotionInfoOrBuilder() {
      return getMotionInfo();
    }

    public static final int IS_FIRST_VALID_FIELD_NUMBER = 7;
    private boolean isFirstValid_;
    /**
     * <code>bool is_first_valid = 7;</code>
     * @return The isFirstValid.
     */
    @java.lang.Override
    public boolean getIsFirstValid() {
      return isFirstValid_;
    }

    public static final int SCENE_TIME_FIELD_NUMBER = 12;
    private int sceneTime_;
    /**
     * <code>uint32 scene_time = 12;</code>
     * @return The sceneTime.
     */
    @java.lang.Override
    public int getSceneTime() {
      return sceneTime_;
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 10;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 10;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int UNK3300_AFLCLLFDPBD_FIELD_NUMBER = 5;
    private long unk3300AFLCLLFDPBD_;
    /**
     * <code>uint64 Unk3300_AFLCLLFDPBD = 5;</code>
     * @return The unk3300AFLCLLFDPBD.
     */
    @java.lang.Override
    public long getUnk3300AFLCLLFDPBD() {
      return unk3300AFLCLLFDPBD_;
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
      if (unk3300IMFNNPGHKJJ_ != 0L) {
        output.writeUInt64(3, unk3300IMFNNPGHKJJ_);
      }
      if (unk3300AFLCLLFDPBD_ != 0L) {
        output.writeUInt64(5, unk3300AFLCLLFDPBD_);
      }
      if (isFirstValid_ != false) {
        output.writeBool(7, isFirstValid_);
      }
      if (motionInfo_ != null) {
        output.writeMessage(9, getMotionInfo());
      }
      if (entityId_ != 0) {
        output.writeUInt32(10, entityId_);
      }
      if (sceneTime_ != 0) {
        output.writeUInt32(12, sceneTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300IMFNNPGHKJJ_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, unk3300IMFNNPGHKJJ_);
      }
      if (unk3300AFLCLLFDPBD_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, unk3300AFLCLLFDPBD_);
      }
      if (isFirstValid_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isFirstValid_);
      }
      if (motionInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, getMotionInfo());
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, entityId_);
      }
      if (sceneTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, sceneTime_);
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
      if (!(obj instanceof emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify other = (emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify) obj;

      if (getUnk3300IMFNNPGHKJJ()
          != other.getUnk3300IMFNNPGHKJJ()) return false;
      if (hasMotionInfo() != other.hasMotionInfo()) return false;
      if (hasMotionInfo()) {
        if (!getMotionInfo()
            .equals(other.getMotionInfo())) return false;
      }
      if (getIsFirstValid()
          != other.getIsFirstValid()) return false;
      if (getSceneTime()
          != other.getSceneTime()) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
      if (getUnk3300AFLCLLFDPBD()
          != other.getUnk3300AFLCLLFDPBD()) return false;
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
      hash = (37 * hash) + UNK3300_IMFNNPGHKJJ_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getUnk3300IMFNNPGHKJJ());
      if (hasMotionInfo()) {
        hash = (37 * hash) + MOTION_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getMotionInfo().hashCode();
      }
      hash = (37 * hash) + IS_FIRST_VALID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFirstValid());
      hash = (37 * hash) + SCENE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getSceneTime();
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + UNK3300_AFLCLLFDPBD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getUnk3300AFLCLLFDPBD());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify prototype) {
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
     *   CMD_ID = 3008;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ForceDragAvatarNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ForceDragAvatarNotify)
        emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.internal_static_ForceDragAvatarNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.internal_static_ForceDragAvatarNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify.class, emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify.newBuilder()
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
        unk3300IMFNNPGHKJJ_ = 0L;

        if (motionInfoBuilder_ == null) {
          motionInfo_ = null;
        } else {
          motionInfo_ = null;
          motionInfoBuilder_ = null;
        }
        isFirstValid_ = false;

        sceneTime_ = 0;

        entityId_ = 0;

        unk3300AFLCLLFDPBD_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.internal_static_ForceDragAvatarNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify build() {
        emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify buildPartial() {
        emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify result = new emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify(this);
        result.unk3300IMFNNPGHKJJ_ = unk3300IMFNNPGHKJJ_;
        if (motionInfoBuilder_ == null) {
          result.motionInfo_ = motionInfo_;
        } else {
          result.motionInfo_ = motionInfoBuilder_.build();
        }
        result.isFirstValid_ = isFirstValid_;
        result.sceneTime_ = sceneTime_;
        result.entityId_ = entityId_;
        result.unk3300AFLCLLFDPBD_ = unk3300AFLCLLFDPBD_;
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
        if (other instanceof emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify) {
          return mergeFrom((emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify other) {
        if (other == emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify.getDefaultInstance()) return this;
        if (other.getUnk3300IMFNNPGHKJJ() != 0L) {
          setUnk3300IMFNNPGHKJJ(other.getUnk3300IMFNNPGHKJJ());
        }
        if (other.hasMotionInfo()) {
          mergeMotionInfo(other.getMotionInfo());
        }
        if (other.getIsFirstValid() != false) {
          setIsFirstValid(other.getIsFirstValid());
        }
        if (other.getSceneTime() != 0) {
          setSceneTime(other.getSceneTime());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getUnk3300AFLCLLFDPBD() != 0L) {
          setUnk3300AFLCLLFDPBD(other.getUnk3300AFLCLLFDPBD());
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
        emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long unk3300IMFNNPGHKJJ_ ;
      /**
       * <code>uint64 Unk3300_IMFNNPGHKJJ = 3;</code>
       * @return The unk3300IMFNNPGHKJJ.
       */
      @java.lang.Override
      public long getUnk3300IMFNNPGHKJJ() {
        return unk3300IMFNNPGHKJJ_;
      }
      /**
       * <code>uint64 Unk3300_IMFNNPGHKJJ = 3;</code>
       * @param value The unk3300IMFNNPGHKJJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300IMFNNPGHKJJ(long value) {
        
        unk3300IMFNNPGHKJJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 Unk3300_IMFNNPGHKJJ = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300IMFNNPGHKJJ() {
        
        unk3300IMFNNPGHKJJ_ = 0L;
        onChanged();
        return this;
      }

      private emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo motionInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo, emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo.Builder, emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfoOrBuilder> motionInfoBuilder_;
      /**
       * <code>.MotionInfo motion_info = 9;</code>
       * @return Whether the motionInfo field is set.
       */
      public boolean hasMotionInfo() {
        return motionInfoBuilder_ != null || motionInfo_ != null;
      }
      /**
       * <code>.MotionInfo motion_info = 9;</code>
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
       * <code>.MotionInfo motion_info = 9;</code>
       */
      public Builder setMotionInfo(emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo value) {
        if (motionInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          motionInfo_ = value;
          onChanged();
        } else {
          motionInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.MotionInfo motion_info = 9;</code>
       */
      public Builder setMotionInfo(
          emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo.Builder builderForValue) {
        if (motionInfoBuilder_ == null) {
          motionInfo_ = builderForValue.build();
          onChanged();
        } else {
          motionInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.MotionInfo motion_info = 9;</code>
       */
      public Builder mergeMotionInfo(emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo value) {
        if (motionInfoBuilder_ == null) {
          if (motionInfo_ != null) {
            motionInfo_ =
              emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo.newBuilder(motionInfo_).mergeFrom(value).buildPartial();
          } else {
            motionInfo_ = value;
          }
          onChanged();
        } else {
          motionInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.MotionInfo motion_info = 9;</code>
       */
      public Builder clearMotionInfo() {
        if (motionInfoBuilder_ == null) {
          motionInfo_ = null;
          onChanged();
        } else {
          motionInfo_ = null;
          motionInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.MotionInfo motion_info = 9;</code>
       */
      public emu.gingerps.net.proto.MotionInfoOuterClass.MotionInfo.Builder getMotionInfoBuilder() {
        
        onChanged();
        return getMotionInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.MotionInfo motion_info = 9;</code>
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
       * <code>.MotionInfo motion_info = 9;</code>
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

      private boolean isFirstValid_ ;
      /**
       * <code>bool is_first_valid = 7;</code>
       * @return The isFirstValid.
       */
      @java.lang.Override
      public boolean getIsFirstValid() {
        return isFirstValid_;
      }
      /**
       * <code>bool is_first_valid = 7;</code>
       * @param value The isFirstValid to set.
       * @return This builder for chaining.
       */
      public Builder setIsFirstValid(boolean value) {
        
        isFirstValid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_first_valid = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFirstValid() {
        
        isFirstValid_ = false;
        onChanged();
        return this;
      }

      private int sceneTime_ ;
      /**
       * <code>uint32 scene_time = 12;</code>
       * @return The sceneTime.
       */
      @java.lang.Override
      public int getSceneTime() {
        return sceneTime_;
      }
      /**
       * <code>uint32 scene_time = 12;</code>
       * @param value The sceneTime to set.
       * @return This builder for chaining.
       */
      public Builder setSceneTime(int value) {
        
        sceneTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_time = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneTime() {
        
        sceneTime_ = 0;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 10;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 10;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private long unk3300AFLCLLFDPBD_ ;
      /**
       * <code>uint64 Unk3300_AFLCLLFDPBD = 5;</code>
       * @return The unk3300AFLCLLFDPBD.
       */
      @java.lang.Override
      public long getUnk3300AFLCLLFDPBD() {
        return unk3300AFLCLLFDPBD_;
      }
      /**
       * <code>uint64 Unk3300_AFLCLLFDPBD = 5;</code>
       * @param value The unk3300AFLCLLFDPBD to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300AFLCLLFDPBD(long value) {
        
        unk3300AFLCLLFDPBD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 Unk3300_AFLCLLFDPBD = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300AFLCLLFDPBD() {
        
        unk3300AFLCLLFDPBD_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:ForceDragAvatarNotify)
    }

    // @@protoc_insertion_point(class_scope:ForceDragAvatarNotify)
    private static final emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify();
    }

    public static emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ForceDragAvatarNotify>
        PARSER = new com.google.protobuf.AbstractParser<ForceDragAvatarNotify>() {
      @java.lang.Override
      public ForceDragAvatarNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ForceDragAvatarNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ForceDragAvatarNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ForceDragAvatarNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.ForceDragAvatarNotifyOuterClass.ForceDragAvatarNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ForceDragAvatarNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ForceDragAvatarNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033ForceDragAvatarNotify.proto\032\020MotionInf" +
      "o.proto\"\262\001\n\025ForceDragAvatarNotify\022\033\n\023Unk" +
      "3300_IMFNNPGHKJJ\030\003 \001(\004\022 \n\013motion_info\030\t " +
      "\001(\0132\013.MotionInfo\022\026\n\016is_first_valid\030\007 \001(\010" +
      "\022\022\n\nscene_time\030\014 \001(\r\022\021\n\tentity_id\030\n \001(\r\022" +
      "\033\n\023Unk3300_AFLCLLFDPBD\030\005 \001(\004B\030\n\026emu.ging" +
      "erps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.MotionInfoOuterClass.getDescriptor(),
        });
    internal_static_ForceDragAvatarNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ForceDragAvatarNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ForceDragAvatarNotify_descriptor,
        new java.lang.String[] { "Unk3300IMFNNPGHKJJ", "MotionInfo", "IsFirstValid", "SceneTime", "EntityId", "Unk3300AFLCLLFDPBD", });
    emu.gingerps.net.proto.MotionInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
