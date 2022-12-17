// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GearLevelData.proto

package emu.gingerps.net.proto;

public final class GearLevelDataOuterClass {
  private GearLevelDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GearLevelDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GearLevelData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3300_DFGHKDBENED = 4;</code>
     * @return The unk3300DFGHKDBENED.
     */
    int getUnk3300DFGHKDBENED();

    /**
     * <code>bool is_finished = 3;</code>
     * @return The isFinished.
     */
    boolean getIsFinished();

    /**
     * <code>bool is_open = 5;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>uint32 open_time = 11;</code>
     * @return The openTime.
     */
    int getOpenTime();

    /**
     * <code>uint32 level_id = 10;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 Unk3300_FIKPLGJIBGP = 15;</code>
     * @return The unk3300FIKPLGJIBGP.
     */
    int getUnk3300FIKPLGJIBGP();
  }
  /**
   * Protobuf type {@code GearLevelData}
   */
  public static final class GearLevelData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GearLevelData)
      GearLevelDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GearLevelData.newBuilder() to construct.
    private GearLevelData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GearLevelData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GearLevelData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.GearLevelDataOuterClass.internal_static_GearLevelData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.GearLevelDataOuterClass.internal_static_GearLevelData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData.class, emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData.Builder.class);
    }

    public static final int UNK3300_DFGHKDBENED_FIELD_NUMBER = 4;
    private int unk3300DFGHKDBENED_ = 0;
    /**
     * <code>uint32 Unk3300_DFGHKDBENED = 4;</code>
     * @return The unk3300DFGHKDBENED.
     */
    @java.lang.Override
    public int getUnk3300DFGHKDBENED() {
      return unk3300DFGHKDBENED_;
    }

    public static final int IS_FINISHED_FIELD_NUMBER = 3;
    private boolean isFinished_ = false;
    /**
     * <code>bool is_finished = 3;</code>
     * @return The isFinished.
     */
    @java.lang.Override
    public boolean getIsFinished() {
      return isFinished_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 5;
    private boolean isOpen_ = false;
    /**
     * <code>bool is_open = 5;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int OPEN_TIME_FIELD_NUMBER = 11;
    private int openTime_ = 0;
    /**
     * <code>uint32 open_time = 11;</code>
     * @return The openTime.
     */
    @java.lang.Override
    public int getOpenTime() {
      return openTime_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 10;
    private int levelId_ = 0;
    /**
     * <code>uint32 level_id = 10;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int UNK3300_FIKPLGJIBGP_FIELD_NUMBER = 15;
    private int unk3300FIKPLGJIBGP_ = 0;
    /**
     * <code>uint32 Unk3300_FIKPLGJIBGP = 15;</code>
     * @return The unk3300FIKPLGJIBGP.
     */
    @java.lang.Override
    public int getUnk3300FIKPLGJIBGP() {
      return unk3300FIKPLGJIBGP_;
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
      if (isFinished_ != false) {
        output.writeBool(3, isFinished_);
      }
      if (unk3300DFGHKDBENED_ != 0) {
        output.writeUInt32(4, unk3300DFGHKDBENED_);
      }
      if (isOpen_ != false) {
        output.writeBool(5, isOpen_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(10, levelId_);
      }
      if (openTime_ != 0) {
        output.writeUInt32(11, openTime_);
      }
      if (unk3300FIKPLGJIBGP_ != 0) {
        output.writeUInt32(15, unk3300FIKPLGJIBGP_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isFinished_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isFinished_);
      }
      if (unk3300DFGHKDBENED_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, unk3300DFGHKDBENED_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isOpen_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, levelId_);
      }
      if (openTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, openTime_);
      }
      if (unk3300FIKPLGJIBGP_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, unk3300FIKPLGJIBGP_);
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
      if (!(obj instanceof emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData other = (emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData) obj;

      if (getUnk3300DFGHKDBENED()
          != other.getUnk3300DFGHKDBENED()) return false;
      if (getIsFinished()
          != other.getIsFinished()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getOpenTime()
          != other.getOpenTime()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getUnk3300FIKPLGJIBGP()
          != other.getUnk3300FIKPLGJIBGP()) return false;
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
      hash = (37 * hash) + UNK3300_DFGHKDBENED_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300DFGHKDBENED();
      hash = (37 * hash) + IS_FINISHED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinished());
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + OPEN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getOpenTime();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + UNK3300_FIKPLGJIBGP_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300FIKPLGJIBGP();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData prototype) {
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
     * Protobuf type {@code GearLevelData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GearLevelData)
        emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.GearLevelDataOuterClass.internal_static_GearLevelData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.GearLevelDataOuterClass.internal_static_GearLevelData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData.class, emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData.newBuilder()
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
        unk3300DFGHKDBENED_ = 0;
        isFinished_ = false;
        isOpen_ = false;
        openTime_ = 0;
        levelId_ = 0;
        unk3300FIKPLGJIBGP_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.GearLevelDataOuterClass.internal_static_GearLevelData_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData getDefaultInstanceForType() {
        return emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData build() {
        emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData buildPartial() {
        emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData result = new emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.unk3300DFGHKDBENED_ = unk3300DFGHKDBENED_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isFinished_ = isFinished_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.isOpen_ = isOpen_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.openTime_ = openTime_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.levelId_ = levelId_;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.unk3300FIKPLGJIBGP_ = unk3300FIKPLGJIBGP_;
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
        if (other instanceof emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData) {
          return mergeFrom((emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData other) {
        if (other == emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData.getDefaultInstance()) return this;
        if (other.getUnk3300DFGHKDBENED() != 0) {
          setUnk3300DFGHKDBENED(other.getUnk3300DFGHKDBENED());
        }
        if (other.getIsFinished() != false) {
          setIsFinished(other.getIsFinished());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getOpenTime() != 0) {
          setOpenTime(other.getOpenTime());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getUnk3300FIKPLGJIBGP() != 0) {
          setUnk3300FIKPLGJIBGP(other.getUnk3300FIKPLGJIBGP());
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
                isFinished_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 24
              case 32: {
                unk3300DFGHKDBENED_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 32
              case 40: {
                isOpen_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 40
              case 80: {
                levelId_ = input.readUInt32();
                bitField0_ |= 0x00000010;
                break;
              } // case 80
              case 88: {
                openTime_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 88
              case 120: {
                unk3300FIKPLGJIBGP_ = input.readUInt32();
                bitField0_ |= 0x00000020;
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

      private int unk3300DFGHKDBENED_ ;
      /**
       * <code>uint32 Unk3300_DFGHKDBENED = 4;</code>
       * @return The unk3300DFGHKDBENED.
       */
      @java.lang.Override
      public int getUnk3300DFGHKDBENED() {
        return unk3300DFGHKDBENED_;
      }
      /**
       * <code>uint32 Unk3300_DFGHKDBENED = 4;</code>
       * @param value The unk3300DFGHKDBENED to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300DFGHKDBENED(int value) {
        
        unk3300DFGHKDBENED_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_DFGHKDBENED = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300DFGHKDBENED() {
        bitField0_ = (bitField0_ & ~0x00000001);
        unk3300DFGHKDBENED_ = 0;
        onChanged();
        return this;
      }

      private boolean isFinished_ ;
      /**
       * <code>bool is_finished = 3;</code>
       * @return The isFinished.
       */
      @java.lang.Override
      public boolean getIsFinished() {
        return isFinished_;
      }
      /**
       * <code>bool is_finished = 3;</code>
       * @param value The isFinished to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinished(boolean value) {
        
        isFinished_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finished = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinished() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isFinished_ = false;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 5;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 5;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        bitField0_ = (bitField0_ & ~0x00000004);
        isOpen_ = false;
        onChanged();
        return this;
      }

      private int openTime_ ;
      /**
       * <code>uint32 open_time = 11;</code>
       * @return The openTime.
       */
      @java.lang.Override
      public int getOpenTime() {
        return openTime_;
      }
      /**
       * <code>uint32 open_time = 11;</code>
       * @param value The openTime to set.
       * @return This builder for chaining.
       */
      public Builder setOpenTime(int value) {
        
        openTime_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 open_time = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpenTime() {
        bitField0_ = (bitField0_ & ~0x00000008);
        openTime_ = 0;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 10;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 10;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        bitField0_ = (bitField0_ & ~0x00000010);
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int unk3300FIKPLGJIBGP_ ;
      /**
       * <code>uint32 Unk3300_FIKPLGJIBGP = 15;</code>
       * @return The unk3300FIKPLGJIBGP.
       */
      @java.lang.Override
      public int getUnk3300FIKPLGJIBGP() {
        return unk3300FIKPLGJIBGP_;
      }
      /**
       * <code>uint32 Unk3300_FIKPLGJIBGP = 15;</code>
       * @param value The unk3300FIKPLGJIBGP to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300FIKPLGJIBGP(int value) {
        
        unk3300FIKPLGJIBGP_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_FIKPLGJIBGP = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300FIKPLGJIBGP() {
        bitField0_ = (bitField0_ & ~0x00000020);
        unk3300FIKPLGJIBGP_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GearLevelData)
    }

    // @@protoc_insertion_point(class_scope:GearLevelData)
    private static final emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData();
    }

    public static emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GearLevelData>
        PARSER = new com.google.protobuf.AbstractParser<GearLevelData>() {
      @java.lang.Override
      public GearLevelData parsePartialFrom(
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

    public static com.google.protobuf.Parser<GearLevelData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GearLevelData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.GearLevelDataOuterClass.GearLevelData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GearLevelData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GearLevelData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023GearLevelData.proto\"\224\001\n\rGearLevelData\022" +
      "\033\n\023Unk3300_DFGHKDBENED\030\004 \001(\r\022\023\n\013is_finis" +
      "hed\030\003 \001(\010\022\017\n\007is_open\030\005 \001(\010\022\021\n\topen_time\030" +
      "\013 \001(\r\022\020\n\010level_id\030\n \001(\r\022\033\n\023Unk3300_FIKPL" +
      "GJIBGP\030\017 \001(\rB\030\n\026emu.gingerps.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GearLevelData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GearLevelData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GearLevelData_descriptor,
        new java.lang.String[] { "Unk3300DFGHKDBENED", "IsFinished", "IsOpen", "OpenTime", "LevelId", "Unk3300FIKPLGJIBGP", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
