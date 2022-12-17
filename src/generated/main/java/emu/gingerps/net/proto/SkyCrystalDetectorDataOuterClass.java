// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SkyCrystalDetectorData.proto

package emu.gingerps.net.proto;

public final class SkyCrystalDetectorDataOuterClass {
  private SkyCrystalDetectorDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SkyCrystalDetectorDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SkyCrystalDetectorData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_hint_valid = 1;</code>
     * @return The isHintValid.
     */
    boolean getIsHintValid();

    /**
     * <code>uint32 group_id = 5;</code>
     * @return The groupId.
     */
    int getGroupId();

    /**
     * <code>.Vector hint_center_pos = 12;</code>
     * @return Whether the hintCenterPos field is set.
     */
    boolean hasHintCenterPos();
    /**
     * <code>.Vector hint_center_pos = 12;</code>
     * @return The hintCenterPos.
     */
    emu.gingerps.net.proto.VectorOuterClass.Vector getHintCenterPos();
    /**
     * <code>.Vector hint_center_pos = 12;</code>
     */
    emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getHintCenterPosOrBuilder();

    /**
     * <code>uint32 config_id = 7;</code>
     * @return The configId.
     */
    int getConfigId();
  }
  /**
   * Protobuf type {@code SkyCrystalDetectorData}
   */
  public static final class SkyCrystalDetectorData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SkyCrystalDetectorData)
      SkyCrystalDetectorDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SkyCrystalDetectorData.newBuilder() to construct.
    private SkyCrystalDetectorData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SkyCrystalDetectorData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SkyCrystalDetectorData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.internal_static_SkyCrystalDetectorData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.internal_static_SkyCrystalDetectorData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData.class, emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData.Builder.class);
    }

    public static final int IS_HINT_VALID_FIELD_NUMBER = 1;
    private boolean isHintValid_ = false;
    /**
     * <code>bool is_hint_valid = 1;</code>
     * @return The isHintValid.
     */
    @java.lang.Override
    public boolean getIsHintValid() {
      return isHintValid_;
    }

    public static final int GROUP_ID_FIELD_NUMBER = 5;
    private int groupId_ = 0;
    /**
     * <code>uint32 group_id = 5;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
    }

    public static final int HINT_CENTER_POS_FIELD_NUMBER = 12;
    private emu.gingerps.net.proto.VectorOuterClass.Vector hintCenterPos_;
    /**
     * <code>.Vector hint_center_pos = 12;</code>
     * @return Whether the hintCenterPos field is set.
     */
    @java.lang.Override
    public boolean hasHintCenterPos() {
      return hintCenterPos_ != null;
    }
    /**
     * <code>.Vector hint_center_pos = 12;</code>
     * @return The hintCenterPos.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.VectorOuterClass.Vector getHintCenterPos() {
      return hintCenterPos_ == null ? emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : hintCenterPos_;
    }
    /**
     * <code>.Vector hint_center_pos = 12;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getHintCenterPosOrBuilder() {
      return hintCenterPos_ == null ? emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : hintCenterPos_;
    }

    public static final int CONFIG_ID_FIELD_NUMBER = 7;
    private int configId_ = 0;
    /**
     * <code>uint32 config_id = 7;</code>
     * @return The configId.
     */
    @java.lang.Override
    public int getConfigId() {
      return configId_;
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
      if (isHintValid_ != false) {
        output.writeBool(1, isHintValid_);
      }
      if (groupId_ != 0) {
        output.writeUInt32(5, groupId_);
      }
      if (configId_ != 0) {
        output.writeUInt32(7, configId_);
      }
      if (hintCenterPos_ != null) {
        output.writeMessage(12, getHintCenterPos());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isHintValid_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isHintValid_);
      }
      if (groupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, groupId_);
      }
      if (configId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, configId_);
      }
      if (hintCenterPos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, getHintCenterPos());
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
      if (!(obj instanceof emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData other = (emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData) obj;

      if (getIsHintValid()
          != other.getIsHintValid()) return false;
      if (getGroupId()
          != other.getGroupId()) return false;
      if (hasHintCenterPos() != other.hasHintCenterPos()) return false;
      if (hasHintCenterPos()) {
        if (!getHintCenterPos()
            .equals(other.getHintCenterPos())) return false;
      }
      if (getConfigId()
          != other.getConfigId()) return false;
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
      hash = (37 * hash) + IS_HINT_VALID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsHintValid());
      hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId();
      if (hasHintCenterPos()) {
        hash = (37 * hash) + HINT_CENTER_POS_FIELD_NUMBER;
        hash = (53 * hash) + getHintCenterPos().hashCode();
      }
      hash = (37 * hash) + CONFIG_ID_FIELD_NUMBER;
      hash = (53 * hash) + getConfigId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData prototype) {
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
     * Protobuf type {@code SkyCrystalDetectorData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SkyCrystalDetectorData)
        emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.internal_static_SkyCrystalDetectorData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.internal_static_SkyCrystalDetectorData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData.class, emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData.newBuilder()
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
        isHintValid_ = false;
        groupId_ = 0;
        hintCenterPos_ = null;
        if (hintCenterPosBuilder_ != null) {
          hintCenterPosBuilder_.dispose();
          hintCenterPosBuilder_ = null;
        }
        configId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.internal_static_SkyCrystalDetectorData_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData getDefaultInstanceForType() {
        return emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData build() {
        emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData buildPartial() {
        emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData result = new emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isHintValid_ = isHintValid_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.groupId_ = groupId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.hintCenterPos_ = hintCenterPosBuilder_ == null
              ? hintCenterPos_
              : hintCenterPosBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.configId_ = configId_;
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
        if (other instanceof emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData) {
          return mergeFrom((emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData other) {
        if (other == emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData.getDefaultInstance()) return this;
        if (other.getIsHintValid() != false) {
          setIsHintValid(other.getIsHintValid());
        }
        if (other.getGroupId() != 0) {
          setGroupId(other.getGroupId());
        }
        if (other.hasHintCenterPos()) {
          mergeHintCenterPos(other.getHintCenterPos());
        }
        if (other.getConfigId() != 0) {
          setConfigId(other.getConfigId());
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
                isHintValid_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 40: {
                groupId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 40
              case 56: {
                configId_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 56
              case 98: {
                input.readMessage(
                    getHintCenterPosFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 98
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

      private boolean isHintValid_ ;
      /**
       * <code>bool is_hint_valid = 1;</code>
       * @return The isHintValid.
       */
      @java.lang.Override
      public boolean getIsHintValid() {
        return isHintValid_;
      }
      /**
       * <code>bool is_hint_valid = 1;</code>
       * @param value The isHintValid to set.
       * @return This builder for chaining.
       */
      public Builder setIsHintValid(boolean value) {
        
        isHintValid_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_hint_valid = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsHintValid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isHintValid_ = false;
        onChanged();
        return this;
      }

      private int groupId_ ;
      /**
       * <code>uint32 group_id = 5;</code>
       * @return The groupId.
       */
      @java.lang.Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 group_id = 5;</code>
       * @param value The groupId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {
        
        groupId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 group_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        groupId_ = 0;
        onChanged();
        return this;
      }

      private emu.gingerps.net.proto.VectorOuterClass.Vector hintCenterPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder> hintCenterPosBuilder_;
      /**
       * <code>.Vector hint_center_pos = 12;</code>
       * @return Whether the hintCenterPos field is set.
       */
      public boolean hasHintCenterPos() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>.Vector hint_center_pos = 12;</code>
       * @return The hintCenterPos.
       */
      public emu.gingerps.net.proto.VectorOuterClass.Vector getHintCenterPos() {
        if (hintCenterPosBuilder_ == null) {
          return hintCenterPos_ == null ? emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : hintCenterPos_;
        } else {
          return hintCenterPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector hint_center_pos = 12;</code>
       */
      public Builder setHintCenterPos(emu.gingerps.net.proto.VectorOuterClass.Vector value) {
        if (hintCenterPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          hintCenterPos_ = value;
        } else {
          hintCenterPosBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector hint_center_pos = 12;</code>
       */
      public Builder setHintCenterPos(
          emu.gingerps.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (hintCenterPosBuilder_ == null) {
          hintCenterPos_ = builderForValue.build();
        } else {
          hintCenterPosBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector hint_center_pos = 12;</code>
       */
      public Builder mergeHintCenterPos(emu.gingerps.net.proto.VectorOuterClass.Vector value) {
        if (hintCenterPosBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0) &&
            hintCenterPos_ != null &&
            hintCenterPos_ != emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance()) {
            getHintCenterPosBuilder().mergeFrom(value);
          } else {
            hintCenterPos_ = value;
          }
        } else {
          hintCenterPosBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector hint_center_pos = 12;</code>
       */
      public Builder clearHintCenterPos() {
        bitField0_ = (bitField0_ & ~0x00000004);
        hintCenterPos_ = null;
        if (hintCenterPosBuilder_ != null) {
          hintCenterPosBuilder_.dispose();
          hintCenterPosBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.Vector hint_center_pos = 12;</code>
       */
      public emu.gingerps.net.proto.VectorOuterClass.Vector.Builder getHintCenterPosBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getHintCenterPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector hint_center_pos = 12;</code>
       */
      public emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getHintCenterPosOrBuilder() {
        if (hintCenterPosBuilder_ != null) {
          return hintCenterPosBuilder_.getMessageOrBuilder();
        } else {
          return hintCenterPos_ == null ?
              emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : hintCenterPos_;
        }
      }
      /**
       * <code>.Vector hint_center_pos = 12;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder> 
          getHintCenterPosFieldBuilder() {
        if (hintCenterPosBuilder_ == null) {
          hintCenterPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getHintCenterPos(),
                  getParentForChildren(),
                  isClean());
          hintCenterPos_ = null;
        }
        return hintCenterPosBuilder_;
      }

      private int configId_ ;
      /**
       * <code>uint32 config_id = 7;</code>
       * @return The configId.
       */
      @java.lang.Override
      public int getConfigId() {
        return configId_;
      }
      /**
       * <code>uint32 config_id = 7;</code>
       * @param value The configId to set.
       * @return This builder for chaining.
       */
      public Builder setConfigId(int value) {
        
        configId_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 config_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearConfigId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        configId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SkyCrystalDetectorData)
    }

    // @@protoc_insertion_point(class_scope:SkyCrystalDetectorData)
    private static final emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData();
    }

    public static emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SkyCrystalDetectorData>
        PARSER = new com.google.protobuf.AbstractParser<SkyCrystalDetectorData>() {
      @java.lang.Override
      public SkyCrystalDetectorData parsePartialFrom(
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

    public static com.google.protobuf.Parser<SkyCrystalDetectorData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SkyCrystalDetectorData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SkyCrystalDetectorData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SkyCrystalDetectorData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034SkyCrystalDetectorData.proto\032\014Vector.p" +
      "roto\"v\n\026SkyCrystalDetectorData\022\025\n\ris_hin" +
      "t_valid\030\001 \001(\010\022\020\n\010group_id\030\005 \001(\r\022 \n\017hint_" +
      "center_pos\030\014 \001(\0132\007.Vector\022\021\n\tconfig_id\030\007" +
      " \001(\rB\030\n\026emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_SkyCrystalDetectorData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SkyCrystalDetectorData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SkyCrystalDetectorData_descriptor,
        new java.lang.String[] { "IsHintValid", "GroupId", "HintCenterPos", "ConfigId", });
    emu.gingerps.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
