// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryFungusFighterTrainingInfo.proto

package emu.gingerps.net.proto;

public final class SceneGalleryFungusFighterTrainingInfoOuterClass {
  private SceneGalleryFungusFighterTrainingInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryFungusFighterTrainingInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryFungusFighterTrainingInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3300_GMLIPFDMDOG = 15;</code>
     * @return The unk3300GMLIPFDMDOG.
     */
    int getUnk3300GMLIPFDMDOG();

    /**
     * <code>uint32 Unk3300_IOEELCAMDCK = 8;</code>
     * @return The unk3300IOEELCAMDCK.
     */
    int getUnk3300IOEELCAMDCK();

    /**
     * <code>uint32 max_monster_count = 10;</code>
     * @return The maxMonsterCount.
     */
    int getMaxMonsterCount();

    /**
     * <code>uint32 Unk3300_EDHANEGNMJM = 2;</code>
     * @return The unk3300EDHANEGNMJM.
     */
    int getUnk3300EDHANEGNMJM();

    /**
     * <code>uint32 buff_id = 13;</code>
     * @return The buffId.
     */
    int getBuffId();

    /**
     * <code>uint32 Unk3300_HGPGNCMNDJN = 14;</code>
     * @return The unk3300HGPGNCMNDJN.
     */
    int getUnk3300HGPGNCMNDJN();

    /**
     * <code>uint32 Unk3300_EKAMCPNGCGH = 5;</code>
     * @return The unk3300EKAMCPNGCGH.
     */
    int getUnk3300EKAMCPNGCGH();
  }
  /**
   * Protobuf type {@code SceneGalleryFungusFighterTrainingInfo}
   */
  public static final class SceneGalleryFungusFighterTrainingInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryFungusFighterTrainingInfo)
      SceneGalleryFungusFighterTrainingInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryFungusFighterTrainingInfo.newBuilder() to construct.
    private SceneGalleryFungusFighterTrainingInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryFungusFighterTrainingInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryFungusFighterTrainingInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneGalleryFungusFighterTrainingInfo(
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

              unk3300EDHANEGNMJM_ = input.readUInt32();
              break;
            }
            case 40: {

              unk3300EKAMCPNGCGH_ = input.readUInt32();
              break;
            }
            case 64: {

              unk3300IOEELCAMDCK_ = input.readUInt32();
              break;
            }
            case 80: {

              maxMonsterCount_ = input.readUInt32();
              break;
            }
            case 104: {

              buffId_ = input.readUInt32();
              break;
            }
            case 112: {

              unk3300HGPGNCMNDJN_ = input.readUInt32();
              break;
            }
            case 120: {

              unk3300GMLIPFDMDOG_ = input.readUInt32();
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
      return emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.internal_static_SceneGalleryFungusFighterTrainingInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.internal_static_SceneGalleryFungusFighterTrainingInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo.class, emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo.Builder.class);
    }

    public static final int UNK3300_GMLIPFDMDOG_FIELD_NUMBER = 15;
    private int unk3300GMLIPFDMDOG_;
    /**
     * <code>uint32 Unk3300_GMLIPFDMDOG = 15;</code>
     * @return The unk3300GMLIPFDMDOG.
     */
    @java.lang.Override
    public int getUnk3300GMLIPFDMDOG() {
      return unk3300GMLIPFDMDOG_;
    }

    public static final int UNK3300_IOEELCAMDCK_FIELD_NUMBER = 8;
    private int unk3300IOEELCAMDCK_;
    /**
     * <code>uint32 Unk3300_IOEELCAMDCK = 8;</code>
     * @return The unk3300IOEELCAMDCK.
     */
    @java.lang.Override
    public int getUnk3300IOEELCAMDCK() {
      return unk3300IOEELCAMDCK_;
    }

    public static final int MAX_MONSTER_COUNT_FIELD_NUMBER = 10;
    private int maxMonsterCount_;
    /**
     * <code>uint32 max_monster_count = 10;</code>
     * @return The maxMonsterCount.
     */
    @java.lang.Override
    public int getMaxMonsterCount() {
      return maxMonsterCount_;
    }

    public static final int UNK3300_EDHANEGNMJM_FIELD_NUMBER = 2;
    private int unk3300EDHANEGNMJM_;
    /**
     * <code>uint32 Unk3300_EDHANEGNMJM = 2;</code>
     * @return The unk3300EDHANEGNMJM.
     */
    @java.lang.Override
    public int getUnk3300EDHANEGNMJM() {
      return unk3300EDHANEGNMJM_;
    }

    public static final int BUFF_ID_FIELD_NUMBER = 13;
    private int buffId_;
    /**
     * <code>uint32 buff_id = 13;</code>
     * @return The buffId.
     */
    @java.lang.Override
    public int getBuffId() {
      return buffId_;
    }

    public static final int UNK3300_HGPGNCMNDJN_FIELD_NUMBER = 14;
    private int unk3300HGPGNCMNDJN_;
    /**
     * <code>uint32 Unk3300_HGPGNCMNDJN = 14;</code>
     * @return The unk3300HGPGNCMNDJN.
     */
    @java.lang.Override
    public int getUnk3300HGPGNCMNDJN() {
      return unk3300HGPGNCMNDJN_;
    }

    public static final int UNK3300_EKAMCPNGCGH_FIELD_NUMBER = 5;
    private int unk3300EKAMCPNGCGH_;
    /**
     * <code>uint32 Unk3300_EKAMCPNGCGH = 5;</code>
     * @return The unk3300EKAMCPNGCGH.
     */
    @java.lang.Override
    public int getUnk3300EKAMCPNGCGH() {
      return unk3300EKAMCPNGCGH_;
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
      if (unk3300EDHANEGNMJM_ != 0) {
        output.writeUInt32(2, unk3300EDHANEGNMJM_);
      }
      if (unk3300EKAMCPNGCGH_ != 0) {
        output.writeUInt32(5, unk3300EKAMCPNGCGH_);
      }
      if (unk3300IOEELCAMDCK_ != 0) {
        output.writeUInt32(8, unk3300IOEELCAMDCK_);
      }
      if (maxMonsterCount_ != 0) {
        output.writeUInt32(10, maxMonsterCount_);
      }
      if (buffId_ != 0) {
        output.writeUInt32(13, buffId_);
      }
      if (unk3300HGPGNCMNDJN_ != 0) {
        output.writeUInt32(14, unk3300HGPGNCMNDJN_);
      }
      if (unk3300GMLIPFDMDOG_ != 0) {
        output.writeUInt32(15, unk3300GMLIPFDMDOG_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300EDHANEGNMJM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, unk3300EDHANEGNMJM_);
      }
      if (unk3300EKAMCPNGCGH_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, unk3300EKAMCPNGCGH_);
      }
      if (unk3300IOEELCAMDCK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, unk3300IOEELCAMDCK_);
      }
      if (maxMonsterCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, maxMonsterCount_);
      }
      if (buffId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, buffId_);
      }
      if (unk3300HGPGNCMNDJN_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, unk3300HGPGNCMNDJN_);
      }
      if (unk3300GMLIPFDMDOG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, unk3300GMLIPFDMDOG_);
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
      if (!(obj instanceof emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo other = (emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo) obj;

      if (getUnk3300GMLIPFDMDOG()
          != other.getUnk3300GMLIPFDMDOG()) return false;
      if (getUnk3300IOEELCAMDCK()
          != other.getUnk3300IOEELCAMDCK()) return false;
      if (getMaxMonsterCount()
          != other.getMaxMonsterCount()) return false;
      if (getUnk3300EDHANEGNMJM()
          != other.getUnk3300EDHANEGNMJM()) return false;
      if (getBuffId()
          != other.getBuffId()) return false;
      if (getUnk3300HGPGNCMNDJN()
          != other.getUnk3300HGPGNCMNDJN()) return false;
      if (getUnk3300EKAMCPNGCGH()
          != other.getUnk3300EKAMCPNGCGH()) return false;
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
      hash = (37 * hash) + UNK3300_GMLIPFDMDOG_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300GMLIPFDMDOG();
      hash = (37 * hash) + UNK3300_IOEELCAMDCK_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300IOEELCAMDCK();
      hash = (37 * hash) + MAX_MONSTER_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getMaxMonsterCount();
      hash = (37 * hash) + UNK3300_EDHANEGNMJM_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300EDHANEGNMJM();
      hash = (37 * hash) + BUFF_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBuffId();
      hash = (37 * hash) + UNK3300_HGPGNCMNDJN_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300HGPGNCMNDJN();
      hash = (37 * hash) + UNK3300_EKAMCPNGCGH_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300EKAMCPNGCGH();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo prototype) {
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
     * Protobuf type {@code SceneGalleryFungusFighterTrainingInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryFungusFighterTrainingInfo)
        emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.internal_static_SceneGalleryFungusFighterTrainingInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.internal_static_SceneGalleryFungusFighterTrainingInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo.class, emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo.newBuilder()
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
        unk3300GMLIPFDMDOG_ = 0;

        unk3300IOEELCAMDCK_ = 0;

        maxMonsterCount_ = 0;

        unk3300EDHANEGNMJM_ = 0;

        buffId_ = 0;

        unk3300HGPGNCMNDJN_ = 0;

        unk3300EKAMCPNGCGH_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.internal_static_SceneGalleryFungusFighterTrainingInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo build() {
        emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo buildPartial() {
        emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo result = new emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo(this);
        result.unk3300GMLIPFDMDOG_ = unk3300GMLIPFDMDOG_;
        result.unk3300IOEELCAMDCK_ = unk3300IOEELCAMDCK_;
        result.maxMonsterCount_ = maxMonsterCount_;
        result.unk3300EDHANEGNMJM_ = unk3300EDHANEGNMJM_;
        result.buffId_ = buffId_;
        result.unk3300HGPGNCMNDJN_ = unk3300HGPGNCMNDJN_;
        result.unk3300EKAMCPNGCGH_ = unk3300EKAMCPNGCGH_;
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
        if (other instanceof emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo) {
          return mergeFrom((emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo other) {
        if (other == emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo.getDefaultInstance()) return this;
        if (other.getUnk3300GMLIPFDMDOG() != 0) {
          setUnk3300GMLIPFDMDOG(other.getUnk3300GMLIPFDMDOG());
        }
        if (other.getUnk3300IOEELCAMDCK() != 0) {
          setUnk3300IOEELCAMDCK(other.getUnk3300IOEELCAMDCK());
        }
        if (other.getMaxMonsterCount() != 0) {
          setMaxMonsterCount(other.getMaxMonsterCount());
        }
        if (other.getUnk3300EDHANEGNMJM() != 0) {
          setUnk3300EDHANEGNMJM(other.getUnk3300EDHANEGNMJM());
        }
        if (other.getBuffId() != 0) {
          setBuffId(other.getBuffId());
        }
        if (other.getUnk3300HGPGNCMNDJN() != 0) {
          setUnk3300HGPGNCMNDJN(other.getUnk3300HGPGNCMNDJN());
        }
        if (other.getUnk3300EKAMCPNGCGH() != 0) {
          setUnk3300EKAMCPNGCGH(other.getUnk3300EKAMCPNGCGH());
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
        emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int unk3300GMLIPFDMDOG_ ;
      /**
       * <code>uint32 Unk3300_GMLIPFDMDOG = 15;</code>
       * @return The unk3300GMLIPFDMDOG.
       */
      @java.lang.Override
      public int getUnk3300GMLIPFDMDOG() {
        return unk3300GMLIPFDMDOG_;
      }
      /**
       * <code>uint32 Unk3300_GMLIPFDMDOG = 15;</code>
       * @param value The unk3300GMLIPFDMDOG to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300GMLIPFDMDOG(int value) {
        
        unk3300GMLIPFDMDOG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_GMLIPFDMDOG = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300GMLIPFDMDOG() {
        
        unk3300GMLIPFDMDOG_ = 0;
        onChanged();
        return this;
      }

      private int unk3300IOEELCAMDCK_ ;
      /**
       * <code>uint32 Unk3300_IOEELCAMDCK = 8;</code>
       * @return The unk3300IOEELCAMDCK.
       */
      @java.lang.Override
      public int getUnk3300IOEELCAMDCK() {
        return unk3300IOEELCAMDCK_;
      }
      /**
       * <code>uint32 Unk3300_IOEELCAMDCK = 8;</code>
       * @param value The unk3300IOEELCAMDCK to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300IOEELCAMDCK(int value) {
        
        unk3300IOEELCAMDCK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_IOEELCAMDCK = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300IOEELCAMDCK() {
        
        unk3300IOEELCAMDCK_ = 0;
        onChanged();
        return this;
      }

      private int maxMonsterCount_ ;
      /**
       * <code>uint32 max_monster_count = 10;</code>
       * @return The maxMonsterCount.
       */
      @java.lang.Override
      public int getMaxMonsterCount() {
        return maxMonsterCount_;
      }
      /**
       * <code>uint32 max_monster_count = 10;</code>
       * @param value The maxMonsterCount to set.
       * @return This builder for chaining.
       */
      public Builder setMaxMonsterCount(int value) {
        
        maxMonsterCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_monster_count = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxMonsterCount() {
        
        maxMonsterCount_ = 0;
        onChanged();
        return this;
      }

      private int unk3300EDHANEGNMJM_ ;
      /**
       * <code>uint32 Unk3300_EDHANEGNMJM = 2;</code>
       * @return The unk3300EDHANEGNMJM.
       */
      @java.lang.Override
      public int getUnk3300EDHANEGNMJM() {
        return unk3300EDHANEGNMJM_;
      }
      /**
       * <code>uint32 Unk3300_EDHANEGNMJM = 2;</code>
       * @param value The unk3300EDHANEGNMJM to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300EDHANEGNMJM(int value) {
        
        unk3300EDHANEGNMJM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_EDHANEGNMJM = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300EDHANEGNMJM() {
        
        unk3300EDHANEGNMJM_ = 0;
        onChanged();
        return this;
      }

      private int buffId_ ;
      /**
       * <code>uint32 buff_id = 13;</code>
       * @return The buffId.
       */
      @java.lang.Override
      public int getBuffId() {
        return buffId_;
      }
      /**
       * <code>uint32 buff_id = 13;</code>
       * @param value The buffId to set.
       * @return This builder for chaining.
       */
      public Builder setBuffId(int value) {
        
        buffId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 buff_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearBuffId() {
        
        buffId_ = 0;
        onChanged();
        return this;
      }

      private int unk3300HGPGNCMNDJN_ ;
      /**
       * <code>uint32 Unk3300_HGPGNCMNDJN = 14;</code>
       * @return The unk3300HGPGNCMNDJN.
       */
      @java.lang.Override
      public int getUnk3300HGPGNCMNDJN() {
        return unk3300HGPGNCMNDJN_;
      }
      /**
       * <code>uint32 Unk3300_HGPGNCMNDJN = 14;</code>
       * @param value The unk3300HGPGNCMNDJN to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300HGPGNCMNDJN(int value) {
        
        unk3300HGPGNCMNDJN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_HGPGNCMNDJN = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300HGPGNCMNDJN() {
        
        unk3300HGPGNCMNDJN_ = 0;
        onChanged();
        return this;
      }

      private int unk3300EKAMCPNGCGH_ ;
      /**
       * <code>uint32 Unk3300_EKAMCPNGCGH = 5;</code>
       * @return The unk3300EKAMCPNGCGH.
       */
      @java.lang.Override
      public int getUnk3300EKAMCPNGCGH() {
        return unk3300EKAMCPNGCGH_;
      }
      /**
       * <code>uint32 Unk3300_EKAMCPNGCGH = 5;</code>
       * @param value The unk3300EKAMCPNGCGH to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300EKAMCPNGCGH(int value) {
        
        unk3300EKAMCPNGCGH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_EKAMCPNGCGH = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300EKAMCPNGCGH() {
        
        unk3300EKAMCPNGCGH_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryFungusFighterTrainingInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryFungusFighterTrainingInfo)
    private static final emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo();
    }

    public static emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryFungusFighterTrainingInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryFungusFighterTrainingInfo>() {
      @java.lang.Override
      public SceneGalleryFungusFighterTrainingInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneGalleryFungusFighterTrainingInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneGalleryFungusFighterTrainingInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryFungusFighterTrainingInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.SceneGalleryFungusFighterTrainingInfoOuterClass.SceneGalleryFungusFighterTrainingInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryFungusFighterTrainingInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryFungusFighterTrainingInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+SceneGalleryFungusFighterTrainingInfo." +
      "proto\"\344\001\n%SceneGalleryFungusFighterTrain" +
      "ingInfo\022\033\n\023Unk3300_GMLIPFDMDOG\030\017 \001(\r\022\033\n\023" +
      "Unk3300_IOEELCAMDCK\030\010 \001(\r\022\031\n\021max_monster" +
      "_count\030\n \001(\r\022\033\n\023Unk3300_EDHANEGNMJM\030\002 \001(" +
      "\r\022\017\n\007buff_id\030\r \001(\r\022\033\n\023Unk3300_HGPGNCMNDJ" +
      "N\030\016 \001(\r\022\033\n\023Unk3300_EKAMCPNGCGH\030\005 \001(\rB\030\n\026" +
      "emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneGalleryFungusFighterTrainingInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryFungusFighterTrainingInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryFungusFighterTrainingInfo_descriptor,
        new java.lang.String[] { "Unk3300GMLIPFDMDOG", "Unk3300IOEELCAMDCK", "MaxMonsterCount", "Unk3300EDHANEGNMJM", "BuffId", "Unk3300HGPGNCMNDJN", "Unk3300EKAMCPNGCGH", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
