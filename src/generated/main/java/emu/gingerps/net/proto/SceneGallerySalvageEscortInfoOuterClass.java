// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGallerySalvageEscortInfo.proto

package emu.gingerps.net.proto;

public final class SceneGallerySalvageEscortInfoOuterClass {
  private SceneGallerySalvageEscortInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGallerySalvageEscortInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGallerySalvageEscortInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 max_monster_count = 4;</code>
     * @return The maxMonsterCount.
     */
    int getMaxMonsterCount();

    /**
     * <code>uint32 monster_count = 10;</code>
     * @return The monsterCount.
     */
    int getMonsterCount();

    /**
     * <code>uint32 Unk3300_FGDPFNPENNC = 11;</code>
     * @return The unk3300FGDPFNPENNC.
     */
    int getUnk3300FGDPFNPENNC();

    /**
     * <code>uint32 Unk3300_HDMPOAJLPED = 9;</code>
     * @return The unk3300HDMPOAJLPED.
     */
    int getUnk3300HDMPOAJLPED();
  }
  /**
   * Protobuf type {@code SceneGallerySalvageEscortInfo}
   */
  public static final class SceneGallerySalvageEscortInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGallerySalvageEscortInfo)
      SceneGallerySalvageEscortInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGallerySalvageEscortInfo.newBuilder() to construct.
    private SceneGallerySalvageEscortInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGallerySalvageEscortInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGallerySalvageEscortInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.internal_static_SceneGallerySalvageEscortInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.internal_static_SceneGallerySalvageEscortInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo.class, emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo.Builder.class);
    }

    public static final int MAX_MONSTER_COUNT_FIELD_NUMBER = 4;
    private int maxMonsterCount_ = 0;
    /**
     * <code>uint32 max_monster_count = 4;</code>
     * @return The maxMonsterCount.
     */
    @java.lang.Override
    public int getMaxMonsterCount() {
      return maxMonsterCount_;
    }

    public static final int MONSTER_COUNT_FIELD_NUMBER = 10;
    private int monsterCount_ = 0;
    /**
     * <code>uint32 monster_count = 10;</code>
     * @return The monsterCount.
     */
    @java.lang.Override
    public int getMonsterCount() {
      return monsterCount_;
    }

    public static final int UNK3300_FGDPFNPENNC_FIELD_NUMBER = 11;
    private int unk3300FGDPFNPENNC_ = 0;
    /**
     * <code>uint32 Unk3300_FGDPFNPENNC = 11;</code>
     * @return The unk3300FGDPFNPENNC.
     */
    @java.lang.Override
    public int getUnk3300FGDPFNPENNC() {
      return unk3300FGDPFNPENNC_;
    }

    public static final int UNK3300_HDMPOAJLPED_FIELD_NUMBER = 9;
    private int unk3300HDMPOAJLPED_ = 0;
    /**
     * <code>uint32 Unk3300_HDMPOAJLPED = 9;</code>
     * @return The unk3300HDMPOAJLPED.
     */
    @java.lang.Override
    public int getUnk3300HDMPOAJLPED() {
      return unk3300HDMPOAJLPED_;
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
      if (maxMonsterCount_ != 0) {
        output.writeUInt32(4, maxMonsterCount_);
      }
      if (unk3300HDMPOAJLPED_ != 0) {
        output.writeUInt32(9, unk3300HDMPOAJLPED_);
      }
      if (monsterCount_ != 0) {
        output.writeUInt32(10, monsterCount_);
      }
      if (unk3300FGDPFNPENNC_ != 0) {
        output.writeUInt32(11, unk3300FGDPFNPENNC_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (maxMonsterCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, maxMonsterCount_);
      }
      if (unk3300HDMPOAJLPED_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, unk3300HDMPOAJLPED_);
      }
      if (monsterCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, monsterCount_);
      }
      if (unk3300FGDPFNPENNC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, unk3300FGDPFNPENNC_);
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
      if (!(obj instanceof emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo other = (emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo) obj;

      if (getMaxMonsterCount()
          != other.getMaxMonsterCount()) return false;
      if (getMonsterCount()
          != other.getMonsterCount()) return false;
      if (getUnk3300FGDPFNPENNC()
          != other.getUnk3300FGDPFNPENNC()) return false;
      if (getUnk3300HDMPOAJLPED()
          != other.getUnk3300HDMPOAJLPED()) return false;
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
      hash = (37 * hash) + MAX_MONSTER_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getMaxMonsterCount();
      hash = (37 * hash) + MONSTER_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getMonsterCount();
      hash = (37 * hash) + UNK3300_FGDPFNPENNC_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300FGDPFNPENNC();
      hash = (37 * hash) + UNK3300_HDMPOAJLPED_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300HDMPOAJLPED();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo prototype) {
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
     * Protobuf type {@code SceneGallerySalvageEscortInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGallerySalvageEscortInfo)
        emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.internal_static_SceneGallerySalvageEscortInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.internal_static_SceneGallerySalvageEscortInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo.class, emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo.newBuilder()
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
        maxMonsterCount_ = 0;
        monsterCount_ = 0;
        unk3300FGDPFNPENNC_ = 0;
        unk3300HDMPOAJLPED_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.internal_static_SceneGallerySalvageEscortInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo build() {
        emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo buildPartial() {
        emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo result = new emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.maxMonsterCount_ = maxMonsterCount_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.monsterCount_ = monsterCount_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.unk3300FGDPFNPENNC_ = unk3300FGDPFNPENNC_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.unk3300HDMPOAJLPED_ = unk3300HDMPOAJLPED_;
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
        if (other instanceof emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo) {
          return mergeFrom((emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo other) {
        if (other == emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo.getDefaultInstance()) return this;
        if (other.getMaxMonsterCount() != 0) {
          setMaxMonsterCount(other.getMaxMonsterCount());
        }
        if (other.getMonsterCount() != 0) {
          setMonsterCount(other.getMonsterCount());
        }
        if (other.getUnk3300FGDPFNPENNC() != 0) {
          setUnk3300FGDPFNPENNC(other.getUnk3300FGDPFNPENNC());
        }
        if (other.getUnk3300HDMPOAJLPED() != 0) {
          setUnk3300HDMPOAJLPED(other.getUnk3300HDMPOAJLPED());
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
                maxMonsterCount_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 32
              case 72: {
                unk3300HDMPOAJLPED_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 72
              case 80: {
                monsterCount_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 80
              case 88: {
                unk3300FGDPFNPENNC_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 88
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

      private int maxMonsterCount_ ;
      /**
       * <code>uint32 max_monster_count = 4;</code>
       * @return The maxMonsterCount.
       */
      @java.lang.Override
      public int getMaxMonsterCount() {
        return maxMonsterCount_;
      }
      /**
       * <code>uint32 max_monster_count = 4;</code>
       * @param value The maxMonsterCount to set.
       * @return This builder for chaining.
       */
      public Builder setMaxMonsterCount(int value) {
        
        maxMonsterCount_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_monster_count = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxMonsterCount() {
        bitField0_ = (bitField0_ & ~0x00000001);
        maxMonsterCount_ = 0;
        onChanged();
        return this;
      }

      private int monsterCount_ ;
      /**
       * <code>uint32 monster_count = 10;</code>
       * @return The monsterCount.
       */
      @java.lang.Override
      public int getMonsterCount() {
        return monsterCount_;
      }
      /**
       * <code>uint32 monster_count = 10;</code>
       * @param value The monsterCount to set.
       * @return This builder for chaining.
       */
      public Builder setMonsterCount(int value) {
        
        monsterCount_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 monster_count = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearMonsterCount() {
        bitField0_ = (bitField0_ & ~0x00000002);
        monsterCount_ = 0;
        onChanged();
        return this;
      }

      private int unk3300FGDPFNPENNC_ ;
      /**
       * <code>uint32 Unk3300_FGDPFNPENNC = 11;</code>
       * @return The unk3300FGDPFNPENNC.
       */
      @java.lang.Override
      public int getUnk3300FGDPFNPENNC() {
        return unk3300FGDPFNPENNC_;
      }
      /**
       * <code>uint32 Unk3300_FGDPFNPENNC = 11;</code>
       * @param value The unk3300FGDPFNPENNC to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300FGDPFNPENNC(int value) {
        
        unk3300FGDPFNPENNC_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_FGDPFNPENNC = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300FGDPFNPENNC() {
        bitField0_ = (bitField0_ & ~0x00000004);
        unk3300FGDPFNPENNC_ = 0;
        onChanged();
        return this;
      }

      private int unk3300HDMPOAJLPED_ ;
      /**
       * <code>uint32 Unk3300_HDMPOAJLPED = 9;</code>
       * @return The unk3300HDMPOAJLPED.
       */
      @java.lang.Override
      public int getUnk3300HDMPOAJLPED() {
        return unk3300HDMPOAJLPED_;
      }
      /**
       * <code>uint32 Unk3300_HDMPOAJLPED = 9;</code>
       * @param value The unk3300HDMPOAJLPED to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300HDMPOAJLPED(int value) {
        
        unk3300HDMPOAJLPED_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_HDMPOAJLPED = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300HDMPOAJLPED() {
        bitField0_ = (bitField0_ & ~0x00000008);
        unk3300HDMPOAJLPED_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneGallerySalvageEscortInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGallerySalvageEscortInfo)
    private static final emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo();
    }

    public static emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGallerySalvageEscortInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGallerySalvageEscortInfo>() {
      @java.lang.Override
      public SceneGallerySalvageEscortInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<SceneGallerySalvageEscortInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGallerySalvageEscortInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.SceneGallerySalvageEscortInfoOuterClass.SceneGallerySalvageEscortInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGallerySalvageEscortInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGallerySalvageEscortInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#SceneGallerySalvageEscortInfo.proto\"\213\001" +
      "\n\035SceneGallerySalvageEscortInfo\022\031\n\021max_m" +
      "onster_count\030\004 \001(\r\022\025\n\rmonster_count\030\n \001(" +
      "\r\022\033\n\023Unk3300_FGDPFNPENNC\030\013 \001(\r\022\033\n\023Unk330" +
      "0_HDMPOAJLPED\030\t \001(\rB\030\n\026emu.gingerps.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneGallerySalvageEscortInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGallerySalvageEscortInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGallerySalvageEscortInfo_descriptor,
        new java.lang.String[] { "MaxMonsterCount", "MonsterCount", "Unk3300FGDPFNPENNC", "Unk3300HDMPOAJLPED", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
