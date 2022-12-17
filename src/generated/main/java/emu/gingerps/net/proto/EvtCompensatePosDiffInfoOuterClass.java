// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtCompensatePosDiffInfo.proto

package emu.gingerps.net.proto;

public final class EvtCompensatePosDiffInfoOuterClass {
  private EvtCompensatePosDiffInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtCompensatePosDiffInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtCompensatePosDiffInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entity_id = 12;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>uint32 normalized_time_compact = 5;</code>
     * @return The normalizedTimeCompact.
     */
    int getNormalizedTimeCompact();

    /**
     * <code>uint32 cur_hash = 7;</code>
     * @return The curHash.
     */
    int getCurHash();

    /**
     * <code>int32 face_angle_compact = 11;</code>
     * @return The faceAngleCompact.
     */
    int getFaceAngleCompact();

    /**
     * <code>.Vector cur_pos = 6;</code>
     * @return Whether the curPos field is set.
     */
    boolean hasCurPos();
    /**
     * <code>.Vector cur_pos = 6;</code>
     * @return The curPos.
     */
    emu.gingerps.net.proto.VectorOuterClass.Vector getCurPos();
    /**
     * <code>.Vector cur_pos = 6;</code>
     */
    emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getCurPosOrBuilder();
  }
  /**
   * Protobuf type {@code EvtCompensatePosDiffInfo}
   */
  public static final class EvtCompensatePosDiffInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtCompensatePosDiffInfo)
      EvtCompensatePosDiffInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtCompensatePosDiffInfo.newBuilder() to construct.
    private EvtCompensatePosDiffInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtCompensatePosDiffInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtCompensatePosDiffInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EvtCompensatePosDiffInfo(
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
            case 40: {

              normalizedTimeCompact_ = input.readUInt32();
              break;
            }
            case 50: {
              emu.gingerps.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (curPos_ != null) {
                subBuilder = curPos_.toBuilder();
              }
              curPos_ = input.readMessage(emu.gingerps.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(curPos_);
                curPos_ = subBuilder.buildPartial();
              }

              break;
            }
            case 56: {

              curHash_ = input.readUInt32();
              break;
            }
            case 88: {

              faceAngleCompact_ = input.readInt32();
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
      return emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.internal_static_EvtCompensatePosDiffInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.internal_static_EvtCompensatePosDiffInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo.class, emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo.Builder.class);
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

    public static final int NORMALIZED_TIME_COMPACT_FIELD_NUMBER = 5;
    private int normalizedTimeCompact_;
    /**
     * <code>uint32 normalized_time_compact = 5;</code>
     * @return The normalizedTimeCompact.
     */
    @java.lang.Override
    public int getNormalizedTimeCompact() {
      return normalizedTimeCompact_;
    }

    public static final int CUR_HASH_FIELD_NUMBER = 7;
    private int curHash_;
    /**
     * <code>uint32 cur_hash = 7;</code>
     * @return The curHash.
     */
    @java.lang.Override
    public int getCurHash() {
      return curHash_;
    }

    public static final int FACE_ANGLE_COMPACT_FIELD_NUMBER = 11;
    private int faceAngleCompact_;
    /**
     * <code>int32 face_angle_compact = 11;</code>
     * @return The faceAngleCompact.
     */
    @java.lang.Override
    public int getFaceAngleCompact() {
      return faceAngleCompact_;
    }

    public static final int CUR_POS_FIELD_NUMBER = 6;
    private emu.gingerps.net.proto.VectorOuterClass.Vector curPos_;
    /**
     * <code>.Vector cur_pos = 6;</code>
     * @return Whether the curPos field is set.
     */
    @java.lang.Override
    public boolean hasCurPos() {
      return curPos_ != null;
    }
    /**
     * <code>.Vector cur_pos = 6;</code>
     * @return The curPos.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.VectorOuterClass.Vector getCurPos() {
      return curPos_ == null ? emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : curPos_;
    }
    /**
     * <code>.Vector cur_pos = 6;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getCurPosOrBuilder() {
      return getCurPos();
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
      if (normalizedTimeCompact_ != 0) {
        output.writeUInt32(5, normalizedTimeCompact_);
      }
      if (curPos_ != null) {
        output.writeMessage(6, getCurPos());
      }
      if (curHash_ != 0) {
        output.writeUInt32(7, curHash_);
      }
      if (faceAngleCompact_ != 0) {
        output.writeInt32(11, faceAngleCompact_);
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
      if (normalizedTimeCompact_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, normalizedTimeCompact_);
      }
      if (curPos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getCurPos());
      }
      if (curHash_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, curHash_);
      }
      if (faceAngleCompact_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, faceAngleCompact_);
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
      if (!(obj instanceof emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo other = (emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (getNormalizedTimeCompact()
          != other.getNormalizedTimeCompact()) return false;
      if (getCurHash()
          != other.getCurHash()) return false;
      if (getFaceAngleCompact()
          != other.getFaceAngleCompact()) return false;
      if (hasCurPos() != other.hasCurPos()) return false;
      if (hasCurPos()) {
        if (!getCurPos()
            .equals(other.getCurPos())) return false;
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
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + NORMALIZED_TIME_COMPACT_FIELD_NUMBER;
      hash = (53 * hash) + getNormalizedTimeCompact();
      hash = (37 * hash) + CUR_HASH_FIELD_NUMBER;
      hash = (53 * hash) + getCurHash();
      hash = (37 * hash) + FACE_ANGLE_COMPACT_FIELD_NUMBER;
      hash = (53 * hash) + getFaceAngleCompact();
      if (hasCurPos()) {
        hash = (37 * hash) + CUR_POS_FIELD_NUMBER;
        hash = (53 * hash) + getCurPos().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo prototype) {
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
     * Protobuf type {@code EvtCompensatePosDiffInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtCompensatePosDiffInfo)
        emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.internal_static_EvtCompensatePosDiffInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.internal_static_EvtCompensatePosDiffInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo.class, emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo.newBuilder()
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
        entityId_ = 0;

        normalizedTimeCompact_ = 0;

        curHash_ = 0;

        faceAngleCompact_ = 0;

        if (curPosBuilder_ == null) {
          curPos_ = null;
        } else {
          curPos_ = null;
          curPosBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.internal_static_EvtCompensatePosDiffInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo build() {
        emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo buildPartial() {
        emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo result = new emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo(this);
        result.entityId_ = entityId_;
        result.normalizedTimeCompact_ = normalizedTimeCompact_;
        result.curHash_ = curHash_;
        result.faceAngleCompact_ = faceAngleCompact_;
        if (curPosBuilder_ == null) {
          result.curPos_ = curPos_;
        } else {
          result.curPos_ = curPosBuilder_.build();
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
        if (other instanceof emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo) {
          return mergeFrom((emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo other) {
        if (other == emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getNormalizedTimeCompact() != 0) {
          setNormalizedTimeCompact(other.getNormalizedTimeCompact());
        }
        if (other.getCurHash() != 0) {
          setCurHash(other.getCurHash());
        }
        if (other.getFaceAngleCompact() != 0) {
          setFaceAngleCompact(other.getFaceAngleCompact());
        }
        if (other.hasCurPos()) {
          mergeCurPos(other.getCurPos());
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
        emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
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

      private int normalizedTimeCompact_ ;
      /**
       * <code>uint32 normalized_time_compact = 5;</code>
       * @return The normalizedTimeCompact.
       */
      @java.lang.Override
      public int getNormalizedTimeCompact() {
        return normalizedTimeCompact_;
      }
      /**
       * <code>uint32 normalized_time_compact = 5;</code>
       * @param value The normalizedTimeCompact to set.
       * @return This builder for chaining.
       */
      public Builder setNormalizedTimeCompact(int value) {
        
        normalizedTimeCompact_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 normalized_time_compact = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearNormalizedTimeCompact() {
        
        normalizedTimeCompact_ = 0;
        onChanged();
        return this;
      }

      private int curHash_ ;
      /**
       * <code>uint32 cur_hash = 7;</code>
       * @return The curHash.
       */
      @java.lang.Override
      public int getCurHash() {
        return curHash_;
      }
      /**
       * <code>uint32 cur_hash = 7;</code>
       * @param value The curHash to set.
       * @return This builder for chaining.
       */
      public Builder setCurHash(int value) {
        
        curHash_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_hash = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurHash() {
        
        curHash_ = 0;
        onChanged();
        return this;
      }

      private int faceAngleCompact_ ;
      /**
       * <code>int32 face_angle_compact = 11;</code>
       * @return The faceAngleCompact.
       */
      @java.lang.Override
      public int getFaceAngleCompact() {
        return faceAngleCompact_;
      }
      /**
       * <code>int32 face_angle_compact = 11;</code>
       * @param value The faceAngleCompact to set.
       * @return This builder for chaining.
       */
      public Builder setFaceAngleCompact(int value) {
        
        faceAngleCompact_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 face_angle_compact = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearFaceAngleCompact() {
        
        faceAngleCompact_ = 0;
        onChanged();
        return this;
      }

      private emu.gingerps.net.proto.VectorOuterClass.Vector curPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder> curPosBuilder_;
      /**
       * <code>.Vector cur_pos = 6;</code>
       * @return Whether the curPos field is set.
       */
      public boolean hasCurPos() {
        return curPosBuilder_ != null || curPos_ != null;
      }
      /**
       * <code>.Vector cur_pos = 6;</code>
       * @return The curPos.
       */
      public emu.gingerps.net.proto.VectorOuterClass.Vector getCurPos() {
        if (curPosBuilder_ == null) {
          return curPos_ == null ? emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : curPos_;
        } else {
          return curPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector cur_pos = 6;</code>
       */
      public Builder setCurPos(emu.gingerps.net.proto.VectorOuterClass.Vector value) {
        if (curPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          curPos_ = value;
          onChanged();
        } else {
          curPosBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector cur_pos = 6;</code>
       */
      public Builder setCurPos(
          emu.gingerps.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (curPosBuilder_ == null) {
          curPos_ = builderForValue.build();
          onChanged();
        } else {
          curPosBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector cur_pos = 6;</code>
       */
      public Builder mergeCurPos(emu.gingerps.net.proto.VectorOuterClass.Vector value) {
        if (curPosBuilder_ == null) {
          if (curPos_ != null) {
            curPos_ =
              emu.gingerps.net.proto.VectorOuterClass.Vector.newBuilder(curPos_).mergeFrom(value).buildPartial();
          } else {
            curPos_ = value;
          }
          onChanged();
        } else {
          curPosBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector cur_pos = 6;</code>
       */
      public Builder clearCurPos() {
        if (curPosBuilder_ == null) {
          curPos_ = null;
          onChanged();
        } else {
          curPos_ = null;
          curPosBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector cur_pos = 6;</code>
       */
      public emu.gingerps.net.proto.VectorOuterClass.Vector.Builder getCurPosBuilder() {
        
        onChanged();
        return getCurPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector cur_pos = 6;</code>
       */
      public emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getCurPosOrBuilder() {
        if (curPosBuilder_ != null) {
          return curPosBuilder_.getMessageOrBuilder();
        } else {
          return curPos_ == null ?
              emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : curPos_;
        }
      }
      /**
       * <code>.Vector cur_pos = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder> 
          getCurPosFieldBuilder() {
        if (curPosBuilder_ == null) {
          curPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getCurPos(),
                  getParentForChildren(),
                  isClean());
          curPos_ = null;
        }
        return curPosBuilder_;
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


      // @@protoc_insertion_point(builder_scope:EvtCompensatePosDiffInfo)
    }

    // @@protoc_insertion_point(class_scope:EvtCompensatePosDiffInfo)
    private static final emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo();
    }

    public static emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtCompensatePosDiffInfo>
        PARSER = new com.google.protobuf.AbstractParser<EvtCompensatePosDiffInfo>() {
      @java.lang.Override
      public EvtCompensatePosDiffInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EvtCompensatePosDiffInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EvtCompensatePosDiffInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtCompensatePosDiffInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtCompensatePosDiffInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtCompensatePosDiffInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036EvtCompensatePosDiffInfo.proto\032\014Vector" +
      ".proto\"\226\001\n\030EvtCompensatePosDiffInfo\022\021\n\te" +
      "ntity_id\030\014 \001(\r\022\037\n\027normalized_time_compac" +
      "t\030\005 \001(\r\022\020\n\010cur_hash\030\007 \001(\r\022\032\n\022face_angle_" +
      "compact\030\013 \001(\005\022\030\n\007cur_pos\030\006 \001(\0132\007.VectorB" +
      "\030\n\026emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_EvtCompensatePosDiffInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtCompensatePosDiffInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtCompensatePosDiffInfo_descriptor,
        new java.lang.String[] { "EntityId", "NormalizedTimeCompact", "CurHash", "FaceAngleCompact", "CurPos", });
    emu.gingerps.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
