// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtAnimatorParameterNotify.proto

package emu.gingerps.net.proto;

public final class EvtAnimatorParameterNotifyOuterClass {
  private EvtAnimatorParameterNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtAnimatorParameterNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtAnimatorParameterNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ForwardType forward_type = 9;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    int getForwardTypeValue();
    /**
     * <code>.ForwardType forward_type = 9;</code>
     * @return The forwardType.
     */
    emu.gingerps.net.proto.ForwardTypeOuterClass.ForwardType getForwardType();

    /**
     * <code>.EvtAnimatorParameterInfo animator_param_info = 13;</code>
     * @return Whether the animatorParamInfo field is set.
     */
    boolean hasAnimatorParamInfo();
    /**
     * <code>.EvtAnimatorParameterInfo animator_param_info = 13;</code>
     * @return The animatorParamInfo.
     */
    emu.gingerps.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo getAnimatorParamInfo();
    /**
     * <code>.EvtAnimatorParameterInfo animator_param_info = 13;</code>
     */
    emu.gingerps.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfoOrBuilder getAnimatorParamInfoOrBuilder();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 330;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code EvtAnimatorParameterNotify}
   */
  public static final class EvtAnimatorParameterNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtAnimatorParameterNotify)
      EvtAnimatorParameterNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtAnimatorParameterNotify.newBuilder() to construct.
    private EvtAnimatorParameterNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtAnimatorParameterNotify() {
      forwardType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtAnimatorParameterNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.internal_static_EvtAnimatorParameterNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.internal_static_EvtAnimatorParameterNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify.class, emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify.Builder.class);
    }

    public static final int FORWARD_TYPE_FIELD_NUMBER = 9;
    private int forwardType_ = 0;
    /**
     * <code>.ForwardType forward_type = 9;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    @java.lang.Override public int getForwardTypeValue() {
      return forwardType_;
    }
    /**
     * <code>.ForwardType forward_type = 9;</code>
     * @return The forwardType.
     */
    @java.lang.Override public emu.gingerps.net.proto.ForwardTypeOuterClass.ForwardType getForwardType() {
      emu.gingerps.net.proto.ForwardTypeOuterClass.ForwardType result = emu.gingerps.net.proto.ForwardTypeOuterClass.ForwardType.forNumber(forwardType_);
      return result == null ? emu.gingerps.net.proto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
    }

    public static final int ANIMATOR_PARAM_INFO_FIELD_NUMBER = 13;
    private emu.gingerps.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo animatorParamInfo_;
    /**
     * <code>.EvtAnimatorParameterInfo animator_param_info = 13;</code>
     * @return Whether the animatorParamInfo field is set.
     */
    @java.lang.Override
    public boolean hasAnimatorParamInfo() {
      return animatorParamInfo_ != null;
    }
    /**
     * <code>.EvtAnimatorParameterInfo animator_param_info = 13;</code>
     * @return The animatorParamInfo.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo getAnimatorParamInfo() {
      return animatorParamInfo_ == null ? emu.gingerps.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo.getDefaultInstance() : animatorParamInfo_;
    }
    /**
     * <code>.EvtAnimatorParameterInfo animator_param_info = 13;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfoOrBuilder getAnimatorParamInfoOrBuilder() {
      return animatorParamInfo_ == null ? emu.gingerps.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo.getDefaultInstance() : animatorParamInfo_;
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
      if (forwardType_ != emu.gingerps.net.proto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        output.writeEnum(9, forwardType_);
      }
      if (animatorParamInfo_ != null) {
        output.writeMessage(13, getAnimatorParamInfo());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (forwardType_ != emu.gingerps.net.proto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(9, forwardType_);
      }
      if (animatorParamInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, getAnimatorParamInfo());
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
      if (!(obj instanceof emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify other = (emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify) obj;

      if (forwardType_ != other.forwardType_) return false;
      if (hasAnimatorParamInfo() != other.hasAnimatorParamInfo()) return false;
      if (hasAnimatorParamInfo()) {
        if (!getAnimatorParamInfo()
            .equals(other.getAnimatorParamInfo())) return false;
      }
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
      hash = (37 * hash) + FORWARD_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + forwardType_;
      if (hasAnimatorParamInfo()) {
        hash = (37 * hash) + ANIMATOR_PARAM_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getAnimatorParamInfo().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify prototype) {
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
     *   CMD_ID = 330;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code EvtAnimatorParameterNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtAnimatorParameterNotify)
        emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.internal_static_EvtAnimatorParameterNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.internal_static_EvtAnimatorParameterNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify.class, emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify.newBuilder()
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
        forwardType_ = 0;
        animatorParamInfo_ = null;
        if (animatorParamInfoBuilder_ != null) {
          animatorParamInfoBuilder_.dispose();
          animatorParamInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.internal_static_EvtAnimatorParameterNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify build() {
        emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify buildPartial() {
        emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify result = new emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.forwardType_ = forwardType_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.animatorParamInfo_ = animatorParamInfoBuilder_ == null
              ? animatorParamInfo_
              : animatorParamInfoBuilder_.build();
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
        if (other instanceof emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify) {
          return mergeFrom((emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify other) {
        if (other == emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify.getDefaultInstance()) return this;
        if (other.forwardType_ != 0) {
          setForwardTypeValue(other.getForwardTypeValue());
        }
        if (other.hasAnimatorParamInfo()) {
          mergeAnimatorParamInfo(other.getAnimatorParamInfo());
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
              case 72: {
                forwardType_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 72
              case 106: {
                input.readMessage(
                    getAnimatorParamInfoFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 106
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

      private int forwardType_ = 0;
      /**
       * <code>.ForwardType forward_type = 9;</code>
       * @return The enum numeric value on the wire for forwardType.
       */
      @java.lang.Override public int getForwardTypeValue() {
        return forwardType_;
      }
      /**
       * <code>.ForwardType forward_type = 9;</code>
       * @param value The enum numeric value on the wire for forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardTypeValue(int value) {
        forwardType_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forward_type = 9;</code>
       * @return The forwardType.
       */
      @java.lang.Override
      public emu.gingerps.net.proto.ForwardTypeOuterClass.ForwardType getForwardType() {
        emu.gingerps.net.proto.ForwardTypeOuterClass.ForwardType result = emu.gingerps.net.proto.ForwardTypeOuterClass.ForwardType.forNumber(forwardType_);
        return result == null ? emu.gingerps.net.proto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ForwardType forward_type = 9;</code>
       * @param value The forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardType(emu.gingerps.net.proto.ForwardTypeOuterClass.ForwardType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        forwardType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forward_type = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearForwardType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        forwardType_ = 0;
        onChanged();
        return this;
      }

      private emu.gingerps.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo animatorParamInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo, emu.gingerps.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo.Builder, emu.gingerps.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfoOrBuilder> animatorParamInfoBuilder_;
      /**
       * <code>.EvtAnimatorParameterInfo animator_param_info = 13;</code>
       * @return Whether the animatorParamInfo field is set.
       */
      public boolean hasAnimatorParamInfo() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.EvtAnimatorParameterInfo animator_param_info = 13;</code>
       * @return The animatorParamInfo.
       */
      public emu.gingerps.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo getAnimatorParamInfo() {
        if (animatorParamInfoBuilder_ == null) {
          return animatorParamInfo_ == null ? emu.gingerps.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo.getDefaultInstance() : animatorParamInfo_;
        } else {
          return animatorParamInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.EvtAnimatorParameterInfo animator_param_info = 13;</code>
       */
      public Builder setAnimatorParamInfo(emu.gingerps.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo value) {
        if (animatorParamInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          animatorParamInfo_ = value;
        } else {
          animatorParamInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.EvtAnimatorParameterInfo animator_param_info = 13;</code>
       */
      public Builder setAnimatorParamInfo(
          emu.gingerps.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo.Builder builderForValue) {
        if (animatorParamInfoBuilder_ == null) {
          animatorParamInfo_ = builderForValue.build();
        } else {
          animatorParamInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.EvtAnimatorParameterInfo animator_param_info = 13;</code>
       */
      public Builder mergeAnimatorParamInfo(emu.gingerps.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo value) {
        if (animatorParamInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            animatorParamInfo_ != null &&
            animatorParamInfo_ != emu.gingerps.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo.getDefaultInstance()) {
            getAnimatorParamInfoBuilder().mergeFrom(value);
          } else {
            animatorParamInfo_ = value;
          }
        } else {
          animatorParamInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.EvtAnimatorParameterInfo animator_param_info = 13;</code>
       */
      public Builder clearAnimatorParamInfo() {
        bitField0_ = (bitField0_ & ~0x00000002);
        animatorParamInfo_ = null;
        if (animatorParamInfoBuilder_ != null) {
          animatorParamInfoBuilder_.dispose();
          animatorParamInfoBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.EvtAnimatorParameterInfo animator_param_info = 13;</code>
       */
      public emu.gingerps.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo.Builder getAnimatorParamInfoBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getAnimatorParamInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.EvtAnimatorParameterInfo animator_param_info = 13;</code>
       */
      public emu.gingerps.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfoOrBuilder getAnimatorParamInfoOrBuilder() {
        if (animatorParamInfoBuilder_ != null) {
          return animatorParamInfoBuilder_.getMessageOrBuilder();
        } else {
          return animatorParamInfo_ == null ?
              emu.gingerps.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo.getDefaultInstance() : animatorParamInfo_;
        }
      }
      /**
       * <code>.EvtAnimatorParameterInfo animator_param_info = 13;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo, emu.gingerps.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo.Builder, emu.gingerps.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfoOrBuilder> 
          getAnimatorParamInfoFieldBuilder() {
        if (animatorParamInfoBuilder_ == null) {
          animatorParamInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo, emu.gingerps.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfo.Builder, emu.gingerps.net.proto.EvtAnimatorParameterInfoOuterClass.EvtAnimatorParameterInfoOrBuilder>(
                  getAnimatorParamInfo(),
                  getParentForChildren(),
                  isClean());
          animatorParamInfo_ = null;
        }
        return animatorParamInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:EvtAnimatorParameterNotify)
    }

    // @@protoc_insertion_point(class_scope:EvtAnimatorParameterNotify)
    private static final emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify();
    }

    public static emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtAnimatorParameterNotify>
        PARSER = new com.google.protobuf.AbstractParser<EvtAnimatorParameterNotify>() {
      @java.lang.Override
      public EvtAnimatorParameterNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<EvtAnimatorParameterNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtAnimatorParameterNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.EvtAnimatorParameterNotifyOuterClass.EvtAnimatorParameterNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtAnimatorParameterNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtAnimatorParameterNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n EvtAnimatorParameterNotify.proto\032\036EvtA" +
      "nimatorParameterInfo.proto\032\021ForwardType." +
      "proto\"x\n\032EvtAnimatorParameterNotify\022\"\n\014f" +
      "orward_type\030\t \001(\0162\014.ForwardType\0226\n\023anima" +
      "tor_param_info\030\r \001(\0132\031.EvtAnimatorParame" +
      "terInfoB\030\n\026emu.gingerps.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.EvtAnimatorParameterInfoOuterClass.getDescriptor(),
          emu.gingerps.net.proto.ForwardTypeOuterClass.getDescriptor(),
        });
    internal_static_EvtAnimatorParameterNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtAnimatorParameterNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtAnimatorParameterNotify_descriptor,
        new java.lang.String[] { "ForwardType", "AnimatorParamInfo", });
    emu.gingerps.net.proto.EvtAnimatorParameterInfoOuterClass.getDescriptor();
    emu.gingerps.net.proto.ForwardTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
