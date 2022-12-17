// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LanternRiteFireworksReformSkillInfo.proto

package emu.gingerps.net.proto;

public final class LanternRiteFireworksReformSkillInfoOuterClass {
  private LanternRiteFireworksReformSkillInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LanternRiteFireworksReformSkillInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LanternRiteFireworksReformSkillInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_unlock = 9;</code>
     * @return The isUnlock.
     */
    boolean getIsUnlock();

    /**
     * <code>uint32 skill_id = 1;</code>
     * @return The skillId.
     */
    int getSkillId();

    /**
     * <code>uint32 Unk3300_IEPBAPJHLEI = 15;</code>
     * @return The unk3300IEPBAPJHLEI.
     */
    int getUnk3300IEPBAPJHLEI();

    /**
     * <code>uint32 Unk3300_EDPPFFFLFGG = 10;</code>
     * @return The unk3300EDPPFFFLFGG.
     */
    int getUnk3300EDPPFFFLFGG();
  }
  /**
   * Protobuf type {@code LanternRiteFireworksReformSkillInfo}
   */
  public static final class LanternRiteFireworksReformSkillInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LanternRiteFireworksReformSkillInfo)
      LanternRiteFireworksReformSkillInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LanternRiteFireworksReformSkillInfo.newBuilder() to construct.
    private LanternRiteFireworksReformSkillInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LanternRiteFireworksReformSkillInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LanternRiteFireworksReformSkillInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.internal_static_LanternRiteFireworksReformSkillInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.internal_static_LanternRiteFireworksReformSkillInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo.class, emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo.Builder.class);
    }

    public static final int IS_UNLOCK_FIELD_NUMBER = 9;
    private boolean isUnlock_ = false;
    /**
     * <code>bool is_unlock = 9;</code>
     * @return The isUnlock.
     */
    @java.lang.Override
    public boolean getIsUnlock() {
      return isUnlock_;
    }

    public static final int SKILL_ID_FIELD_NUMBER = 1;
    private int skillId_ = 0;
    /**
     * <code>uint32 skill_id = 1;</code>
     * @return The skillId.
     */
    @java.lang.Override
    public int getSkillId() {
      return skillId_;
    }

    public static final int UNK3300_IEPBAPJHLEI_FIELD_NUMBER = 15;
    private int unk3300IEPBAPJHLEI_ = 0;
    /**
     * <code>uint32 Unk3300_IEPBAPJHLEI = 15;</code>
     * @return The unk3300IEPBAPJHLEI.
     */
    @java.lang.Override
    public int getUnk3300IEPBAPJHLEI() {
      return unk3300IEPBAPJHLEI_;
    }

    public static final int UNK3300_EDPPFFFLFGG_FIELD_NUMBER = 10;
    private int unk3300EDPPFFFLFGG_ = 0;
    /**
     * <code>uint32 Unk3300_EDPPFFFLFGG = 10;</code>
     * @return The unk3300EDPPFFFLFGG.
     */
    @java.lang.Override
    public int getUnk3300EDPPFFFLFGG() {
      return unk3300EDPPFFFLFGG_;
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
      if (skillId_ != 0) {
        output.writeUInt32(1, skillId_);
      }
      if (isUnlock_ != false) {
        output.writeBool(9, isUnlock_);
      }
      if (unk3300EDPPFFFLFGG_ != 0) {
        output.writeUInt32(10, unk3300EDPPFFFLFGG_);
      }
      if (unk3300IEPBAPJHLEI_ != 0) {
        output.writeUInt32(15, unk3300IEPBAPJHLEI_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (skillId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, skillId_);
      }
      if (isUnlock_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isUnlock_);
      }
      if (unk3300EDPPFFFLFGG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, unk3300EDPPFFFLFGG_);
      }
      if (unk3300IEPBAPJHLEI_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, unk3300IEPBAPJHLEI_);
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
      if (!(obj instanceof emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo other = (emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo) obj;

      if (getIsUnlock()
          != other.getIsUnlock()) return false;
      if (getSkillId()
          != other.getSkillId()) return false;
      if (getUnk3300IEPBAPJHLEI()
          != other.getUnk3300IEPBAPJHLEI()) return false;
      if (getUnk3300EDPPFFFLFGG()
          != other.getUnk3300EDPPFFFLFGG()) return false;
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
      hash = (37 * hash) + IS_UNLOCK_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsUnlock());
      hash = (37 * hash) + SKILL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSkillId();
      hash = (37 * hash) + UNK3300_IEPBAPJHLEI_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300IEPBAPJHLEI();
      hash = (37 * hash) + UNK3300_EDPPFFFLFGG_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300EDPPFFFLFGG();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo prototype) {
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
     * Protobuf type {@code LanternRiteFireworksReformSkillInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LanternRiteFireworksReformSkillInfo)
        emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.internal_static_LanternRiteFireworksReformSkillInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.internal_static_LanternRiteFireworksReformSkillInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo.class, emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo.newBuilder()
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
        isUnlock_ = false;
        skillId_ = 0;
        unk3300IEPBAPJHLEI_ = 0;
        unk3300EDPPFFFLFGG_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.internal_static_LanternRiteFireworksReformSkillInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo build() {
        emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo buildPartial() {
        emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo result = new emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isUnlock_ = isUnlock_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.skillId_ = skillId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.unk3300IEPBAPJHLEI_ = unk3300IEPBAPJHLEI_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.unk3300EDPPFFFLFGG_ = unk3300EDPPFFFLFGG_;
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
        if (other instanceof emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo) {
          return mergeFrom((emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo other) {
        if (other == emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo.getDefaultInstance()) return this;
        if (other.getIsUnlock() != false) {
          setIsUnlock(other.getIsUnlock());
        }
        if (other.getSkillId() != 0) {
          setSkillId(other.getSkillId());
        }
        if (other.getUnk3300IEPBAPJHLEI() != 0) {
          setUnk3300IEPBAPJHLEI(other.getUnk3300IEPBAPJHLEI());
        }
        if (other.getUnk3300EDPPFFFLFGG() != 0) {
          setUnk3300EDPPFFFLFGG(other.getUnk3300EDPPFFFLFGG());
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
                skillId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 8
              case 72: {
                isUnlock_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 72
              case 80: {
                unk3300EDPPFFFLFGG_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 80
              case 120: {
                unk3300IEPBAPJHLEI_ = input.readUInt32();
                bitField0_ |= 0x00000004;
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

      private boolean isUnlock_ ;
      /**
       * <code>bool is_unlock = 9;</code>
       * @return The isUnlock.
       */
      @java.lang.Override
      public boolean getIsUnlock() {
        return isUnlock_;
      }
      /**
       * <code>bool is_unlock = 9;</code>
       * @param value The isUnlock to set.
       * @return This builder for chaining.
       */
      public Builder setIsUnlock(boolean value) {
        
        isUnlock_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_unlock = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsUnlock() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isUnlock_ = false;
        onChanged();
        return this;
      }

      private int skillId_ ;
      /**
       * <code>uint32 skill_id = 1;</code>
       * @return The skillId.
       */
      @java.lang.Override
      public int getSkillId() {
        return skillId_;
      }
      /**
       * <code>uint32 skill_id = 1;</code>
       * @param value The skillId to set.
       * @return This builder for chaining.
       */
      public Builder setSkillId(int value) {
        
        skillId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 skill_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        skillId_ = 0;
        onChanged();
        return this;
      }

      private int unk3300IEPBAPJHLEI_ ;
      /**
       * <code>uint32 Unk3300_IEPBAPJHLEI = 15;</code>
       * @return The unk3300IEPBAPJHLEI.
       */
      @java.lang.Override
      public int getUnk3300IEPBAPJHLEI() {
        return unk3300IEPBAPJHLEI_;
      }
      /**
       * <code>uint32 Unk3300_IEPBAPJHLEI = 15;</code>
       * @param value The unk3300IEPBAPJHLEI to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300IEPBAPJHLEI(int value) {
        
        unk3300IEPBAPJHLEI_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_IEPBAPJHLEI = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300IEPBAPJHLEI() {
        bitField0_ = (bitField0_ & ~0x00000004);
        unk3300IEPBAPJHLEI_ = 0;
        onChanged();
        return this;
      }

      private int unk3300EDPPFFFLFGG_ ;
      /**
       * <code>uint32 Unk3300_EDPPFFFLFGG = 10;</code>
       * @return The unk3300EDPPFFFLFGG.
       */
      @java.lang.Override
      public int getUnk3300EDPPFFFLFGG() {
        return unk3300EDPPFFFLFGG_;
      }
      /**
       * <code>uint32 Unk3300_EDPPFFFLFGG = 10;</code>
       * @param value The unk3300EDPPFFFLFGG to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300EDPPFFFLFGG(int value) {
        
        unk3300EDPPFFFLFGG_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_EDPPFFFLFGG = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300EDPPFFFLFGG() {
        bitField0_ = (bitField0_ & ~0x00000008);
        unk3300EDPPFFFLFGG_ = 0;
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


      // @@protoc_insertion_point(builder_scope:LanternRiteFireworksReformSkillInfo)
    }

    // @@protoc_insertion_point(class_scope:LanternRiteFireworksReformSkillInfo)
    private static final emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo();
    }

    public static emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LanternRiteFireworksReformSkillInfo>
        PARSER = new com.google.protobuf.AbstractParser<LanternRiteFireworksReformSkillInfo>() {
      @java.lang.Override
      public LanternRiteFireworksReformSkillInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<LanternRiteFireworksReformSkillInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LanternRiteFireworksReformSkillInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.LanternRiteFireworksReformSkillInfoOuterClass.LanternRiteFireworksReformSkillInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LanternRiteFireworksReformSkillInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LanternRiteFireworksReformSkillInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)LanternRiteFireworksReformSkillInfo.pr" +
      "oto\"\204\001\n#LanternRiteFireworksReformSkillI" +
      "nfo\022\021\n\tis_unlock\030\t \001(\010\022\020\n\010skill_id\030\001 \001(\r" +
      "\022\033\n\023Unk3300_IEPBAPJHLEI\030\017 \001(\r\022\033\n\023Unk3300" +
      "_EDPPFFFLFGG\030\n \001(\rB\030\n\026emu.gingerps.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LanternRiteFireworksReformSkillInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LanternRiteFireworksReformSkillInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LanternRiteFireworksReformSkillInfo_descriptor,
        new java.lang.String[] { "IsUnlock", "SkillId", "Unk3300IEPBAPJHLEI", "Unk3300EDPPFFFLFGG", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
