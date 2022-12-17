// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGTCTavernInfoNotify.proto

package emu.gingerps.net.proto;

public final class GCGTCTavernInfoNotifyOuterClass {
  private GCGTCTavernInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGTCTavernInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGTCTavernInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level_id = 5;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>bool Unk3300_IMFJBNFMCHM = 11;</code>
     * @return The unk3300IMFJBNFMCHM.
     */
    boolean getUnk3300IMFJBNFMCHM();

    /**
     * <code>bool Unk3300_MBGMHBNBKBK = 8;</code>
     * @return The unk3300MBGMHBNBKBK.
     */
    boolean getUnk3300MBGMHBNBKBK();

    /**
     * <code>uint32 point_id = 4;</code>
     * @return The pointId.
     */
    int getPointId();

    /**
     * <code>uint32 element_type = 6;</code>
     * @return The elementType.
     */
    int getElementType();

    /**
     * <code>uint32 avatar_id = 9;</code>
     * @return The avatarId.
     */
    int getAvatarId();

    /**
     * <code>uint32 character_id = 12;</code>
     * @return The characterId.
     */
    int getCharacterId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 7268;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GCGTCTavernInfoNotify}
   */
  public static final class GCGTCTavernInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGTCTavernInfoNotify)
      GCGTCTavernInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGTCTavernInfoNotify.newBuilder() to construct.
    private GCGTCTavernInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGTCTavernInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGTCTavernInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.internal_static_GCGTCTavernInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.internal_static_GCGTCTavernInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify.class, emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify.Builder.class);
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 5;
    private int levelId_ = 0;
    /**
     * <code>uint32 level_id = 5;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int UNK3300_IMFJBNFMCHM_FIELD_NUMBER = 11;
    private boolean unk3300IMFJBNFMCHM_ = false;
    /**
     * <code>bool Unk3300_IMFJBNFMCHM = 11;</code>
     * @return The unk3300IMFJBNFMCHM.
     */
    @java.lang.Override
    public boolean getUnk3300IMFJBNFMCHM() {
      return unk3300IMFJBNFMCHM_;
    }

    public static final int UNK3300_MBGMHBNBKBK_FIELD_NUMBER = 8;
    private boolean unk3300MBGMHBNBKBK_ = false;
    /**
     * <code>bool Unk3300_MBGMHBNBKBK = 8;</code>
     * @return The unk3300MBGMHBNBKBK.
     */
    @java.lang.Override
    public boolean getUnk3300MBGMHBNBKBK() {
      return unk3300MBGMHBNBKBK_;
    }

    public static final int POINT_ID_FIELD_NUMBER = 4;
    private int pointId_ = 0;
    /**
     * <code>uint32 point_id = 4;</code>
     * @return The pointId.
     */
    @java.lang.Override
    public int getPointId() {
      return pointId_;
    }

    public static final int ELEMENT_TYPE_FIELD_NUMBER = 6;
    private int elementType_ = 0;
    /**
     * <code>uint32 element_type = 6;</code>
     * @return The elementType.
     */
    @java.lang.Override
    public int getElementType() {
      return elementType_;
    }

    public static final int AVATAR_ID_FIELD_NUMBER = 9;
    private int avatarId_ = 0;
    /**
     * <code>uint32 avatar_id = 9;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public int getAvatarId() {
      return avatarId_;
    }

    public static final int CHARACTER_ID_FIELD_NUMBER = 12;
    private int characterId_ = 0;
    /**
     * <code>uint32 character_id = 12;</code>
     * @return The characterId.
     */
    @java.lang.Override
    public int getCharacterId() {
      return characterId_;
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
      if (pointId_ != 0) {
        output.writeUInt32(4, pointId_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(5, levelId_);
      }
      if (elementType_ != 0) {
        output.writeUInt32(6, elementType_);
      }
      if (unk3300MBGMHBNBKBK_ != false) {
        output.writeBool(8, unk3300MBGMHBNBKBK_);
      }
      if (avatarId_ != 0) {
        output.writeUInt32(9, avatarId_);
      }
      if (unk3300IMFJBNFMCHM_ != false) {
        output.writeBool(11, unk3300IMFJBNFMCHM_);
      }
      if (characterId_ != 0) {
        output.writeUInt32(12, characterId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (pointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, pointId_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, levelId_);
      }
      if (elementType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, elementType_);
      }
      if (unk3300MBGMHBNBKBK_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, unk3300MBGMHBNBKBK_);
      }
      if (avatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, avatarId_);
      }
      if (unk3300IMFJBNFMCHM_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, unk3300IMFJBNFMCHM_);
      }
      if (characterId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, characterId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify other = (emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify) obj;

      if (getLevelId()
          != other.getLevelId()) return false;
      if (getUnk3300IMFJBNFMCHM()
          != other.getUnk3300IMFJBNFMCHM()) return false;
      if (getUnk3300MBGMHBNBKBK()
          != other.getUnk3300MBGMHBNBKBK()) return false;
      if (getPointId()
          != other.getPointId()) return false;
      if (getElementType()
          != other.getElementType()) return false;
      if (getAvatarId()
          != other.getAvatarId()) return false;
      if (getCharacterId()
          != other.getCharacterId()) return false;
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
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + UNK3300_IMFJBNFMCHM_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3300IMFJBNFMCHM());
      hash = (37 * hash) + UNK3300_MBGMHBNBKBK_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3300MBGMHBNBKBK());
      hash = (37 * hash) + POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPointId();
      hash = (37 * hash) + ELEMENT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getElementType();
      hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarId();
      hash = (37 * hash) + CHARACTER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCharacterId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify prototype) {
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
     *   CMD_ID = 7268;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GCGTCTavernInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGTCTavernInfoNotify)
        emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.internal_static_GCGTCTavernInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.internal_static_GCGTCTavernInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify.class, emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify.newBuilder()
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
        levelId_ = 0;
        unk3300IMFJBNFMCHM_ = false;
        unk3300MBGMHBNBKBK_ = false;
        pointId_ = 0;
        elementType_ = 0;
        avatarId_ = 0;
        characterId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.internal_static_GCGTCTavernInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify build() {
        emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify buildPartial() {
        emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify result = new emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.levelId_ = levelId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.unk3300IMFJBNFMCHM_ = unk3300IMFJBNFMCHM_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.unk3300MBGMHBNBKBK_ = unk3300MBGMHBNBKBK_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.pointId_ = pointId_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.elementType_ = elementType_;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.avatarId_ = avatarId_;
        }
        if (((from_bitField0_ & 0x00000040) != 0)) {
          result.characterId_ = characterId_;
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
        if (other instanceof emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify) {
          return mergeFrom((emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify other) {
        if (other == emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify.getDefaultInstance()) return this;
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getUnk3300IMFJBNFMCHM() != false) {
          setUnk3300IMFJBNFMCHM(other.getUnk3300IMFJBNFMCHM());
        }
        if (other.getUnk3300MBGMHBNBKBK() != false) {
          setUnk3300MBGMHBNBKBK(other.getUnk3300MBGMHBNBKBK());
        }
        if (other.getPointId() != 0) {
          setPointId(other.getPointId());
        }
        if (other.getElementType() != 0) {
          setElementType(other.getElementType());
        }
        if (other.getAvatarId() != 0) {
          setAvatarId(other.getAvatarId());
        }
        if (other.getCharacterId() != 0) {
          setCharacterId(other.getCharacterId());
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
              case 32: {
                pointId_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
              case 40: {
                levelId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 40
              case 48: {
                elementType_ = input.readUInt32();
                bitField0_ |= 0x00000010;
                break;
              } // case 48
              case 64: {
                unk3300MBGMHBNBKBK_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 64
              case 72: {
                avatarId_ = input.readUInt32();
                bitField0_ |= 0x00000020;
                break;
              } // case 72
              case 88: {
                unk3300IMFJBNFMCHM_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 88
              case 96: {
                characterId_ = input.readUInt32();
                bitField0_ |= 0x00000040;
                break;
              } // case 96
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

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 5;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 5;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        levelId_ = 0;
        onChanged();
        return this;
      }

      private boolean unk3300IMFJBNFMCHM_ ;
      /**
       * <code>bool Unk3300_IMFJBNFMCHM = 11;</code>
       * @return The unk3300IMFJBNFMCHM.
       */
      @java.lang.Override
      public boolean getUnk3300IMFJBNFMCHM() {
        return unk3300IMFJBNFMCHM_;
      }
      /**
       * <code>bool Unk3300_IMFJBNFMCHM = 11;</code>
       * @param value The unk3300IMFJBNFMCHM to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300IMFJBNFMCHM(boolean value) {
        
        unk3300IMFJBNFMCHM_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3300_IMFJBNFMCHM = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300IMFJBNFMCHM() {
        bitField0_ = (bitField0_ & ~0x00000002);
        unk3300IMFJBNFMCHM_ = false;
        onChanged();
        return this;
      }

      private boolean unk3300MBGMHBNBKBK_ ;
      /**
       * <code>bool Unk3300_MBGMHBNBKBK = 8;</code>
       * @return The unk3300MBGMHBNBKBK.
       */
      @java.lang.Override
      public boolean getUnk3300MBGMHBNBKBK() {
        return unk3300MBGMHBNBKBK_;
      }
      /**
       * <code>bool Unk3300_MBGMHBNBKBK = 8;</code>
       * @param value The unk3300MBGMHBNBKBK to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300MBGMHBNBKBK(boolean value) {
        
        unk3300MBGMHBNBKBK_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3300_MBGMHBNBKBK = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300MBGMHBNBKBK() {
        bitField0_ = (bitField0_ & ~0x00000004);
        unk3300MBGMHBNBKBK_ = false;
        onChanged();
        return this;
      }

      private int pointId_ ;
      /**
       * <code>uint32 point_id = 4;</code>
       * @return The pointId.
       */
      @java.lang.Override
      public int getPointId() {
        return pointId_;
      }
      /**
       * <code>uint32 point_id = 4;</code>
       * @param value The pointId to set.
       * @return This builder for chaining.
       */
      public Builder setPointId(int value) {
        
        pointId_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 point_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearPointId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        pointId_ = 0;
        onChanged();
        return this;
      }

      private int elementType_ ;
      /**
       * <code>uint32 element_type = 6;</code>
       * @return The elementType.
       */
      @java.lang.Override
      public int getElementType() {
        return elementType_;
      }
      /**
       * <code>uint32 element_type = 6;</code>
       * @param value The elementType to set.
       * @return This builder for chaining.
       */
      public Builder setElementType(int value) {
        
        elementType_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 element_type = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearElementType() {
        bitField0_ = (bitField0_ & ~0x00000010);
        elementType_ = 0;
        onChanged();
        return this;
      }

      private int avatarId_ ;
      /**
       * <code>uint32 avatar_id = 9;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public int getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint32 avatar_id = 9;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(int value) {
        
        avatarId_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatar_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        bitField0_ = (bitField0_ & ~0x00000020);
        avatarId_ = 0;
        onChanged();
        return this;
      }

      private int characterId_ ;
      /**
       * <code>uint32 character_id = 12;</code>
       * @return The characterId.
       */
      @java.lang.Override
      public int getCharacterId() {
        return characterId_;
      }
      /**
       * <code>uint32 character_id = 12;</code>
       * @param value The characterId to set.
       * @return This builder for chaining.
       */
      public Builder setCharacterId(int value) {
        
        characterId_ = value;
        bitField0_ |= 0x00000040;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 character_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearCharacterId() {
        bitField0_ = (bitField0_ & ~0x00000040);
        characterId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGTCTavernInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:GCGTCTavernInfoNotify)
    private static final emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify();
    }

    public static emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGTCTavernInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<GCGTCTavernInfoNotify>() {
      @java.lang.Override
      public GCGTCTavernInfoNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<GCGTCTavernInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGTCTavernInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGTCTavernInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGTCTavernInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033GCGTCTavernInfoNotify.proto\"\264\001\n\025GCGTCT" +
      "avernInfoNotify\022\020\n\010level_id\030\005 \001(\r\022\033\n\023Unk" +
      "3300_IMFJBNFMCHM\030\013 \001(\010\022\033\n\023Unk3300_MBGMHB" +
      "NBKBK\030\010 \001(\010\022\020\n\010point_id\030\004 \001(\r\022\024\n\014element" +
      "_type\030\006 \001(\r\022\021\n\tavatar_id\030\t \001(\r\022\024\n\014charac" +
      "ter_id\030\014 \001(\rB\030\n\026emu.gingerps.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGTCTavernInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGTCTavernInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGTCTavernInfoNotify_descriptor,
        new java.lang.String[] { "LevelId", "Unk3300IMFJBNFMCHM", "Unk3300MBGMHBNBKBK", "PointId", "ElementType", "AvatarId", "CharacterId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
