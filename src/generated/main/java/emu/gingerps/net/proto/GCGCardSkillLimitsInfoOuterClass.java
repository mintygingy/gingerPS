// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGCardSkillLimitsInfo.proto

package emu.gingerps.net.proto;

public final class GCGCardSkillLimitsInfoOuterClass {
  private GCGCardSkillLimitsInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGCardSkillLimitsInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGCardSkillLimitsInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 1;</code>
     */
    java.util.List<emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo> 
        getSkillLimitsListList();
    /**
     * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 1;</code>
     */
    emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo getSkillLimitsList(int index);
    /**
     * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 1;</code>
     */
    int getSkillLimitsListCount();
    /**
     * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 1;</code>
     */
    java.util.List<? extends emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfoOrBuilder> 
        getSkillLimitsListOrBuilderList();
    /**
     * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 1;</code>
     */
    emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfoOrBuilder getSkillLimitsListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code GCGCardSkillLimitsInfo}
   */
  public static final class GCGCardSkillLimitsInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGCardSkillLimitsInfo)
      GCGCardSkillLimitsInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGCardSkillLimitsInfo.newBuilder() to construct.
    private GCGCardSkillLimitsInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGCardSkillLimitsInfo() {
      skillLimitsList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGCardSkillLimitsInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.internal_static_GCGCardSkillLimitsInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.internal_static_GCGCardSkillLimitsInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo.class, emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo.Builder.class);
    }

    public static final int SKILL_LIMITS_LIST_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private java.util.List<emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo> skillLimitsList_;
    /**
     * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo> getSkillLimitsListList() {
      return skillLimitsList_;
    }
    /**
     * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfoOrBuilder> 
        getSkillLimitsListOrBuilderList() {
      return skillLimitsList_;
    }
    /**
     * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 1;</code>
     */
    @java.lang.Override
    public int getSkillLimitsListCount() {
      return skillLimitsList_.size();
    }
    /**
     * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 1;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo getSkillLimitsList(int index) {
      return skillLimitsList_.get(index);
    }
    /**
     * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 1;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfoOrBuilder getSkillLimitsListOrBuilder(
        int index) {
      return skillLimitsList_.get(index);
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
      for (int i = 0; i < skillLimitsList_.size(); i++) {
        output.writeMessage(1, skillLimitsList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < skillLimitsList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, skillLimitsList_.get(i));
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
      if (!(obj instanceof emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo other = (emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo) obj;

      if (!getSkillLimitsListList()
          .equals(other.getSkillLimitsListList())) return false;
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
      if (getSkillLimitsListCount() > 0) {
        hash = (37 * hash) + SKILL_LIMITS_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSkillLimitsListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo prototype) {
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
     * Protobuf type {@code GCGCardSkillLimitsInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGCardSkillLimitsInfo)
        emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.internal_static_GCGCardSkillLimitsInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.internal_static_GCGCardSkillLimitsInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo.class, emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo.newBuilder()
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
        if (skillLimitsListBuilder_ == null) {
          skillLimitsList_ = java.util.Collections.emptyList();
        } else {
          skillLimitsList_ = null;
          skillLimitsListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.internal_static_GCGCardSkillLimitsInfo_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo getDefaultInstanceForType() {
        return emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo build() {
        emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo buildPartial() {
        emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo result = new emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo result) {
        if (skillLimitsListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            skillLimitsList_ = java.util.Collections.unmodifiableList(skillLimitsList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.skillLimitsList_ = skillLimitsList_;
        } else {
          result.skillLimitsList_ = skillLimitsListBuilder_.build();
        }
      }

      private void buildPartial0(emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo result) {
        int from_bitField0_ = bitField0_;
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
        if (other instanceof emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo) {
          return mergeFrom((emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo other) {
        if (other == emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo.getDefaultInstance()) return this;
        if (skillLimitsListBuilder_ == null) {
          if (!other.skillLimitsList_.isEmpty()) {
            if (skillLimitsList_.isEmpty()) {
              skillLimitsList_ = other.skillLimitsList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureSkillLimitsListIsMutable();
              skillLimitsList_.addAll(other.skillLimitsList_);
            }
            onChanged();
          }
        } else {
          if (!other.skillLimitsList_.isEmpty()) {
            if (skillLimitsListBuilder_.isEmpty()) {
              skillLimitsListBuilder_.dispose();
              skillLimitsListBuilder_ = null;
              skillLimitsList_ = other.skillLimitsList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              skillLimitsListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getSkillLimitsListFieldBuilder() : null;
            } else {
              skillLimitsListBuilder_.addAllMessages(other.skillLimitsList_);
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
              case 10: {
                emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo m =
                    input.readMessage(
                        emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.parser(),
                        extensionRegistry);
                if (skillLimitsListBuilder_ == null) {
                  ensureSkillLimitsListIsMutable();
                  skillLimitsList_.add(m);
                } else {
                  skillLimitsListBuilder_.addMessage(m);
                }
                break;
              } // case 10
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

      private java.util.List<emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo> skillLimitsList_ =
        java.util.Collections.emptyList();
      private void ensureSkillLimitsListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          skillLimitsList_ = new java.util.ArrayList<emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo>(skillLimitsList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo, emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.Builder, emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfoOrBuilder> skillLimitsListBuilder_;

      /**
       * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 1;</code>
       */
      public java.util.List<emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo> getSkillLimitsListList() {
        if (skillLimitsListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(skillLimitsList_);
        } else {
          return skillLimitsListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 1;</code>
       */
      public int getSkillLimitsListCount() {
        if (skillLimitsListBuilder_ == null) {
          return skillLimitsList_.size();
        } else {
          return skillLimitsListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 1;</code>
       */
      public emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo getSkillLimitsList(int index) {
        if (skillLimitsListBuilder_ == null) {
          return skillLimitsList_.get(index);
        } else {
          return skillLimitsListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 1;</code>
       */
      public Builder setSkillLimitsList(
          int index, emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo value) {
        if (skillLimitsListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSkillLimitsListIsMutable();
          skillLimitsList_.set(index, value);
          onChanged();
        } else {
          skillLimitsListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 1;</code>
       */
      public Builder setSkillLimitsList(
          int index, emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.Builder builderForValue) {
        if (skillLimitsListBuilder_ == null) {
          ensureSkillLimitsListIsMutable();
          skillLimitsList_.set(index, builderForValue.build());
          onChanged();
        } else {
          skillLimitsListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 1;</code>
       */
      public Builder addSkillLimitsList(emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo value) {
        if (skillLimitsListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSkillLimitsListIsMutable();
          skillLimitsList_.add(value);
          onChanged();
        } else {
          skillLimitsListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 1;</code>
       */
      public Builder addSkillLimitsList(
          int index, emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo value) {
        if (skillLimitsListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSkillLimitsListIsMutable();
          skillLimitsList_.add(index, value);
          onChanged();
        } else {
          skillLimitsListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 1;</code>
       */
      public Builder addSkillLimitsList(
          emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.Builder builderForValue) {
        if (skillLimitsListBuilder_ == null) {
          ensureSkillLimitsListIsMutable();
          skillLimitsList_.add(builderForValue.build());
          onChanged();
        } else {
          skillLimitsListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 1;</code>
       */
      public Builder addSkillLimitsList(
          int index, emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.Builder builderForValue) {
        if (skillLimitsListBuilder_ == null) {
          ensureSkillLimitsListIsMutable();
          skillLimitsList_.add(index, builderForValue.build());
          onChanged();
        } else {
          skillLimitsListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 1;</code>
       */
      public Builder addAllSkillLimitsList(
          java.lang.Iterable<? extends emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo> values) {
        if (skillLimitsListBuilder_ == null) {
          ensureSkillLimitsListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, skillLimitsList_);
          onChanged();
        } else {
          skillLimitsListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 1;</code>
       */
      public Builder clearSkillLimitsList() {
        if (skillLimitsListBuilder_ == null) {
          skillLimitsList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          skillLimitsListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 1;</code>
       */
      public Builder removeSkillLimitsList(int index) {
        if (skillLimitsListBuilder_ == null) {
          ensureSkillLimitsListIsMutable();
          skillLimitsList_.remove(index);
          onChanged();
        } else {
          skillLimitsListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 1;</code>
       */
      public emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.Builder getSkillLimitsListBuilder(
          int index) {
        return getSkillLimitsListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 1;</code>
       */
      public emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfoOrBuilder getSkillLimitsListOrBuilder(
          int index) {
        if (skillLimitsListBuilder_ == null) {
          return skillLimitsList_.get(index);  } else {
          return skillLimitsListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 1;</code>
       */
      public java.util.List<? extends emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfoOrBuilder> 
           getSkillLimitsListOrBuilderList() {
        if (skillLimitsListBuilder_ != null) {
          return skillLimitsListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(skillLimitsList_);
        }
      }
      /**
       * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 1;</code>
       */
      public emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.Builder addSkillLimitsListBuilder() {
        return getSkillLimitsListFieldBuilder().addBuilder(
            emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 1;</code>
       */
      public emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.Builder addSkillLimitsListBuilder(
          int index) {
        return getSkillLimitsListFieldBuilder().addBuilder(
            index, emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 1;</code>
       */
      public java.util.List<emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.Builder> 
           getSkillLimitsListBuilderList() {
        return getSkillLimitsListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo, emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.Builder, emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfoOrBuilder> 
          getSkillLimitsListFieldBuilder() {
        if (skillLimitsListBuilder_ == null) {
          skillLimitsListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo, emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.Builder, emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfoOrBuilder>(
                  skillLimitsList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          skillLimitsList_ = null;
        }
        return skillLimitsListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GCGCardSkillLimitsInfo)
    }

    // @@protoc_insertion_point(class_scope:GCGCardSkillLimitsInfo)
    private static final emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo();
    }

    public static emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGCardSkillLimitsInfo>
        PARSER = new com.google.protobuf.AbstractParser<GCGCardSkillLimitsInfo>() {
      @java.lang.Override
      public GCGCardSkillLimitsInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<GCGCardSkillLimitsInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGCardSkillLimitsInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.GCGCardSkillLimitsInfoOuterClass.GCGCardSkillLimitsInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGCardSkillLimitsInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGCardSkillLimitsInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034GCGCardSkillLimitsInfo.proto\032\030GCGSkill" +
      "LimitsInfo.proto\"H\n\026GCGCardSkillLimitsIn" +
      "fo\022.\n\021skill_limits_list\030\001 \003(\0132\023.GCGSkill" +
      "LimitsInfoB\030\n\026emu.gingerps.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.getDescriptor(),
        });
    internal_static_GCGCardSkillLimitsInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGCardSkillLimitsInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGCardSkillLimitsInfo_descriptor,
        new java.lang.String[] { "SkillLimitsList", });
    emu.gingerps.net.proto.GCGSkillLimitsInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
