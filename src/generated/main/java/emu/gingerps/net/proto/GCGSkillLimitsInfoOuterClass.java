// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGSkillLimitsInfo.proto

package emu.gingerps.net.proto;

public final class GCGSkillLimitsInfoOuterClass {
  private GCGSkillLimitsInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGSkillLimitsInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGSkillLimitsInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 skill_id = 1;</code>
     * @return The skillId.
     */
    int getSkillId();

    /**
     * <code>repeated .GCGLimitsInfo limits_list = 7;</code>
     */
    java.util.List<emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfo> 
        getLimitsListList();
    /**
     * <code>repeated .GCGLimitsInfo limits_list = 7;</code>
     */
    emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfo getLimitsList(int index);
    /**
     * <code>repeated .GCGLimitsInfo limits_list = 7;</code>
     */
    int getLimitsListCount();
    /**
     * <code>repeated .GCGLimitsInfo limits_list = 7;</code>
     */
    java.util.List<? extends emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfoOrBuilder> 
        getLimitsListOrBuilderList();
    /**
     * <code>repeated .GCGLimitsInfo limits_list = 7;</code>
     */
    emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfoOrBuilder getLimitsListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code GCGSkillLimitsInfo}
   */
  public static final class GCGSkillLimitsInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGSkillLimitsInfo)
      GCGSkillLimitsInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGSkillLimitsInfo.newBuilder() to construct.
    private GCGSkillLimitsInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGSkillLimitsInfo() {
      limitsList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGSkillLimitsInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.internal_static_GCGSkillLimitsInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.internal_static_GCGSkillLimitsInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.class, emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.Builder.class);
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

    public static final int LIMITS_LIST_FIELD_NUMBER = 7;
    @SuppressWarnings("serial")
    private java.util.List<emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfo> limitsList_;
    /**
     * <code>repeated .GCGLimitsInfo limits_list = 7;</code>
     */
    @java.lang.Override
    public java.util.List<emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfo> getLimitsListList() {
      return limitsList_;
    }
    /**
     * <code>repeated .GCGLimitsInfo limits_list = 7;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfoOrBuilder> 
        getLimitsListOrBuilderList() {
      return limitsList_;
    }
    /**
     * <code>repeated .GCGLimitsInfo limits_list = 7;</code>
     */
    @java.lang.Override
    public int getLimitsListCount() {
      return limitsList_.size();
    }
    /**
     * <code>repeated .GCGLimitsInfo limits_list = 7;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfo getLimitsList(int index) {
      return limitsList_.get(index);
    }
    /**
     * <code>repeated .GCGLimitsInfo limits_list = 7;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfoOrBuilder getLimitsListOrBuilder(
        int index) {
      return limitsList_.get(index);
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
      for (int i = 0; i < limitsList_.size(); i++) {
        output.writeMessage(7, limitsList_.get(i));
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
      for (int i = 0; i < limitsList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, limitsList_.get(i));
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
      if (!(obj instanceof emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo other = (emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo) obj;

      if (getSkillId()
          != other.getSkillId()) return false;
      if (!getLimitsListList()
          .equals(other.getLimitsListList())) return false;
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
      hash = (37 * hash) + SKILL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSkillId();
      if (getLimitsListCount() > 0) {
        hash = (37 * hash) + LIMITS_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getLimitsListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo prototype) {
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
     * Protobuf type {@code GCGSkillLimitsInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGSkillLimitsInfo)
        emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.internal_static_GCGSkillLimitsInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.internal_static_GCGSkillLimitsInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.class, emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.newBuilder()
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
        skillId_ = 0;
        if (limitsListBuilder_ == null) {
          limitsList_ = java.util.Collections.emptyList();
        } else {
          limitsList_ = null;
          limitsListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.internal_static_GCGSkillLimitsInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo build() {
        emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo buildPartial() {
        emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo result = new emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo result) {
        if (limitsListBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            limitsList_ = java.util.Collections.unmodifiableList(limitsList_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.limitsList_ = limitsList_;
        } else {
          result.limitsList_ = limitsListBuilder_.build();
        }
      }

      private void buildPartial0(emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.skillId_ = skillId_;
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
        if (other instanceof emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo) {
          return mergeFrom((emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo other) {
        if (other == emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.getDefaultInstance()) return this;
        if (other.getSkillId() != 0) {
          setSkillId(other.getSkillId());
        }
        if (limitsListBuilder_ == null) {
          if (!other.limitsList_.isEmpty()) {
            if (limitsList_.isEmpty()) {
              limitsList_ = other.limitsList_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureLimitsListIsMutable();
              limitsList_.addAll(other.limitsList_);
            }
            onChanged();
          }
        } else {
          if (!other.limitsList_.isEmpty()) {
            if (limitsListBuilder_.isEmpty()) {
              limitsListBuilder_.dispose();
              limitsListBuilder_ = null;
              limitsList_ = other.limitsList_;
              bitField0_ = (bitField0_ & ~0x00000002);
              limitsListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getLimitsListFieldBuilder() : null;
            } else {
              limitsListBuilder_.addAllMessages(other.limitsList_);
            }
          }
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
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 58: {
                emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfo m =
                    input.readMessage(
                        emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfo.parser(),
                        extensionRegistry);
                if (limitsListBuilder_ == null) {
                  ensureLimitsListIsMutable();
                  limitsList_.add(m);
                } else {
                  limitsListBuilder_.addMessage(m);
                }
                break;
              } // case 58
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
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 skill_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        skillId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfo> limitsList_ =
        java.util.Collections.emptyList();
      private void ensureLimitsListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          limitsList_ = new java.util.ArrayList<emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfo>(limitsList_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfo, emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfo.Builder, emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfoOrBuilder> limitsListBuilder_;

      /**
       * <code>repeated .GCGLimitsInfo limits_list = 7;</code>
       */
      public java.util.List<emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfo> getLimitsListList() {
        if (limitsListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(limitsList_);
        } else {
          return limitsListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .GCGLimitsInfo limits_list = 7;</code>
       */
      public int getLimitsListCount() {
        if (limitsListBuilder_ == null) {
          return limitsList_.size();
        } else {
          return limitsListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .GCGLimitsInfo limits_list = 7;</code>
       */
      public emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfo getLimitsList(int index) {
        if (limitsListBuilder_ == null) {
          return limitsList_.get(index);
        } else {
          return limitsListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .GCGLimitsInfo limits_list = 7;</code>
       */
      public Builder setLimitsList(
          int index, emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfo value) {
        if (limitsListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLimitsListIsMutable();
          limitsList_.set(index, value);
          onChanged();
        } else {
          limitsListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .GCGLimitsInfo limits_list = 7;</code>
       */
      public Builder setLimitsList(
          int index, emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfo.Builder builderForValue) {
        if (limitsListBuilder_ == null) {
          ensureLimitsListIsMutable();
          limitsList_.set(index, builderForValue.build());
          onChanged();
        } else {
          limitsListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .GCGLimitsInfo limits_list = 7;</code>
       */
      public Builder addLimitsList(emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfo value) {
        if (limitsListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLimitsListIsMutable();
          limitsList_.add(value);
          onChanged();
        } else {
          limitsListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .GCGLimitsInfo limits_list = 7;</code>
       */
      public Builder addLimitsList(
          int index, emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfo value) {
        if (limitsListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLimitsListIsMutable();
          limitsList_.add(index, value);
          onChanged();
        } else {
          limitsListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .GCGLimitsInfo limits_list = 7;</code>
       */
      public Builder addLimitsList(
          emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfo.Builder builderForValue) {
        if (limitsListBuilder_ == null) {
          ensureLimitsListIsMutable();
          limitsList_.add(builderForValue.build());
          onChanged();
        } else {
          limitsListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .GCGLimitsInfo limits_list = 7;</code>
       */
      public Builder addLimitsList(
          int index, emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfo.Builder builderForValue) {
        if (limitsListBuilder_ == null) {
          ensureLimitsListIsMutable();
          limitsList_.add(index, builderForValue.build());
          onChanged();
        } else {
          limitsListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .GCGLimitsInfo limits_list = 7;</code>
       */
      public Builder addAllLimitsList(
          java.lang.Iterable<? extends emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfo> values) {
        if (limitsListBuilder_ == null) {
          ensureLimitsListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, limitsList_);
          onChanged();
        } else {
          limitsListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .GCGLimitsInfo limits_list = 7;</code>
       */
      public Builder clearLimitsList() {
        if (limitsListBuilder_ == null) {
          limitsList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          limitsListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .GCGLimitsInfo limits_list = 7;</code>
       */
      public Builder removeLimitsList(int index) {
        if (limitsListBuilder_ == null) {
          ensureLimitsListIsMutable();
          limitsList_.remove(index);
          onChanged();
        } else {
          limitsListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .GCGLimitsInfo limits_list = 7;</code>
       */
      public emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfo.Builder getLimitsListBuilder(
          int index) {
        return getLimitsListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .GCGLimitsInfo limits_list = 7;</code>
       */
      public emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfoOrBuilder getLimitsListOrBuilder(
          int index) {
        if (limitsListBuilder_ == null) {
          return limitsList_.get(index);  } else {
          return limitsListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .GCGLimitsInfo limits_list = 7;</code>
       */
      public java.util.List<? extends emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfoOrBuilder> 
           getLimitsListOrBuilderList() {
        if (limitsListBuilder_ != null) {
          return limitsListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(limitsList_);
        }
      }
      /**
       * <code>repeated .GCGLimitsInfo limits_list = 7;</code>
       */
      public emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfo.Builder addLimitsListBuilder() {
        return getLimitsListFieldBuilder().addBuilder(
            emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .GCGLimitsInfo limits_list = 7;</code>
       */
      public emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfo.Builder addLimitsListBuilder(
          int index) {
        return getLimitsListFieldBuilder().addBuilder(
            index, emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .GCGLimitsInfo limits_list = 7;</code>
       */
      public java.util.List<emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfo.Builder> 
           getLimitsListBuilderList() {
        return getLimitsListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfo, emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfo.Builder, emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfoOrBuilder> 
          getLimitsListFieldBuilder() {
        if (limitsListBuilder_ == null) {
          limitsListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfo, emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfo.Builder, emu.gingerps.net.proto.GCGLimitsInfoOuterClass.GCGLimitsInfoOrBuilder>(
                  limitsList_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          limitsList_ = null;
        }
        return limitsListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GCGSkillLimitsInfo)
    }

    // @@protoc_insertion_point(class_scope:GCGSkillLimitsInfo)
    private static final emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo();
    }

    public static emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGSkillLimitsInfo>
        PARSER = new com.google.protobuf.AbstractParser<GCGSkillLimitsInfo>() {
      @java.lang.Override
      public GCGSkillLimitsInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<GCGSkillLimitsInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGSkillLimitsInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGSkillLimitsInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGSkillLimitsInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030GCGSkillLimitsInfo.proto\032\023GCGLimitsInf" +
      "o.proto\"K\n\022GCGSkillLimitsInfo\022\020\n\010skill_i" +
      "d\030\001 \001(\r\022#\n\013limits_list\030\007 \003(\0132\016.GCGLimits" +
      "InfoB\030\n\026emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.GCGLimitsInfoOuterClass.getDescriptor(),
        });
    internal_static_GCGSkillLimitsInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGSkillLimitsInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGSkillLimitsInfo_descriptor,
        new java.lang.String[] { "SkillId", "LimitsList", });
    emu.gingerps.net.proto.GCGLimitsInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
