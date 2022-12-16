// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeCreateBlueprintRsp.proto

package emu.gingerps.net.proto;

public final class HomeCreateBlueprintRspOuterClass {
  private HomeCreateBlueprintRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeCreateBlueprintRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeCreateBlueprintRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>.HomeBlueprintSlotInfo slot_info = 6;</code>
     * @return Whether the slotInfo field is set.
     */
    boolean hasSlotInfo();
    /**
     * <code>.HomeBlueprintSlotInfo slot_info = 6;</code>
     * @return The slotInfo.
     */
    emu.gingerps.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo getSlotInfo();
    /**
     * <code>.HomeBlueprintSlotInfo slot_info = 6;</code>
     */
    emu.gingerps.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfoOrBuilder getSlotInfoOrBuilder();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4806;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code HomeCreateBlueprintRsp}
   */
  public static final class HomeCreateBlueprintRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeCreateBlueprintRsp)
      HomeCreateBlueprintRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeCreateBlueprintRsp.newBuilder() to construct.
    private HomeCreateBlueprintRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeCreateBlueprintRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeCreateBlueprintRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeCreateBlueprintRsp(
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
            case 50: {
              emu.gingerps.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo.Builder subBuilder = null;
              if (slotInfo_ != null) {
                subBuilder = slotInfo_.toBuilder();
              }
              slotInfo_ = input.readMessage(emu.gingerps.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(slotInfo_);
                slotInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 120: {

              retcode_ = input.readInt32();
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
      return emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.internal_static_HomeCreateBlueprintRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.internal_static_HomeCreateBlueprintRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp.class, emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 15;
    private int retcode_;
    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int SLOT_INFO_FIELD_NUMBER = 6;
    private emu.gingerps.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo slotInfo_;
    /**
     * <code>.HomeBlueprintSlotInfo slot_info = 6;</code>
     * @return Whether the slotInfo field is set.
     */
    @java.lang.Override
    public boolean hasSlotInfo() {
      return slotInfo_ != null;
    }
    /**
     * <code>.HomeBlueprintSlotInfo slot_info = 6;</code>
     * @return The slotInfo.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo getSlotInfo() {
      return slotInfo_ == null ? emu.gingerps.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo.getDefaultInstance() : slotInfo_;
    }
    /**
     * <code>.HomeBlueprintSlotInfo slot_info = 6;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfoOrBuilder getSlotInfoOrBuilder() {
      return getSlotInfo();
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
      if (slotInfo_ != null) {
        output.writeMessage(6, getSlotInfo());
      }
      if (retcode_ != 0) {
        output.writeInt32(15, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (slotInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getSlotInfo());
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(15, retcode_);
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
      if (!(obj instanceof emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp other = (emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (hasSlotInfo() != other.hasSlotInfo()) return false;
      if (hasSlotInfo()) {
        if (!getSlotInfo()
            .equals(other.getSlotInfo())) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (hasSlotInfo()) {
        hash = (37 * hash) + SLOT_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getSlotInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp prototype) {
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
     *   CMD_ID = 4806;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code HomeCreateBlueprintRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeCreateBlueprintRsp)
        emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.internal_static_HomeCreateBlueprintRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.internal_static_HomeCreateBlueprintRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp.class, emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp.newBuilder()
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
        retcode_ = 0;

        if (slotInfoBuilder_ == null) {
          slotInfo_ = null;
        } else {
          slotInfo_ = null;
          slotInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.internal_static_HomeCreateBlueprintRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp build() {
        emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp buildPartial() {
        emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp result = new emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp(this);
        result.retcode_ = retcode_;
        if (slotInfoBuilder_ == null) {
          result.slotInfo_ = slotInfo_;
        } else {
          result.slotInfo_ = slotInfoBuilder_.build();
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
        if (other instanceof emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp) {
          return mergeFrom((emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp other) {
        if (other == emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.hasSlotInfo()) {
          mergeSlotInfo(other.getSlotInfo());
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
        emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 15;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private emu.gingerps.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo slotInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo, emu.gingerps.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo.Builder, emu.gingerps.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfoOrBuilder> slotInfoBuilder_;
      /**
       * <code>.HomeBlueprintSlotInfo slot_info = 6;</code>
       * @return Whether the slotInfo field is set.
       */
      public boolean hasSlotInfo() {
        return slotInfoBuilder_ != null || slotInfo_ != null;
      }
      /**
       * <code>.HomeBlueprintSlotInfo slot_info = 6;</code>
       * @return The slotInfo.
       */
      public emu.gingerps.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo getSlotInfo() {
        if (slotInfoBuilder_ == null) {
          return slotInfo_ == null ? emu.gingerps.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo.getDefaultInstance() : slotInfo_;
        } else {
          return slotInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.HomeBlueprintSlotInfo slot_info = 6;</code>
       */
      public Builder setSlotInfo(emu.gingerps.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo value) {
        if (slotInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          slotInfo_ = value;
          onChanged();
        } else {
          slotInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.HomeBlueprintSlotInfo slot_info = 6;</code>
       */
      public Builder setSlotInfo(
          emu.gingerps.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo.Builder builderForValue) {
        if (slotInfoBuilder_ == null) {
          slotInfo_ = builderForValue.build();
          onChanged();
        } else {
          slotInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.HomeBlueprintSlotInfo slot_info = 6;</code>
       */
      public Builder mergeSlotInfo(emu.gingerps.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo value) {
        if (slotInfoBuilder_ == null) {
          if (slotInfo_ != null) {
            slotInfo_ =
              emu.gingerps.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo.newBuilder(slotInfo_).mergeFrom(value).buildPartial();
          } else {
            slotInfo_ = value;
          }
          onChanged();
        } else {
          slotInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.HomeBlueprintSlotInfo slot_info = 6;</code>
       */
      public Builder clearSlotInfo() {
        if (slotInfoBuilder_ == null) {
          slotInfo_ = null;
          onChanged();
        } else {
          slotInfo_ = null;
          slotInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.HomeBlueprintSlotInfo slot_info = 6;</code>
       */
      public emu.gingerps.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo.Builder getSlotInfoBuilder() {
        
        onChanged();
        return getSlotInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.HomeBlueprintSlotInfo slot_info = 6;</code>
       */
      public emu.gingerps.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfoOrBuilder getSlotInfoOrBuilder() {
        if (slotInfoBuilder_ != null) {
          return slotInfoBuilder_.getMessageOrBuilder();
        } else {
          return slotInfo_ == null ?
              emu.gingerps.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo.getDefaultInstance() : slotInfo_;
        }
      }
      /**
       * <code>.HomeBlueprintSlotInfo slot_info = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo, emu.gingerps.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo.Builder, emu.gingerps.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfoOrBuilder> 
          getSlotInfoFieldBuilder() {
        if (slotInfoBuilder_ == null) {
          slotInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo, emu.gingerps.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfo.Builder, emu.gingerps.net.proto.HomeBlueprintSlotInfoOuterClass.HomeBlueprintSlotInfoOrBuilder>(
                  getSlotInfo(),
                  getParentForChildren(),
                  isClean());
          slotInfo_ = null;
        }
        return slotInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:HomeCreateBlueprintRsp)
    }

    // @@protoc_insertion_point(class_scope:HomeCreateBlueprintRsp)
    private static final emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp();
    }

    public static emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeCreateBlueprintRsp>
        PARSER = new com.google.protobuf.AbstractParser<HomeCreateBlueprintRsp>() {
      @java.lang.Override
      public HomeCreateBlueprintRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeCreateBlueprintRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeCreateBlueprintRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeCreateBlueprintRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.HomeCreateBlueprintRspOuterClass.HomeCreateBlueprintRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeCreateBlueprintRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeCreateBlueprintRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034HomeCreateBlueprintRsp.proto\032\033HomeBlue" +
      "printSlotInfo.proto\"T\n\026HomeCreateBluepri" +
      "ntRsp\022\017\n\007retcode\030\017 \001(\005\022)\n\tslot_info\030\006 \001(" +
      "\0132\026.HomeBlueprintSlotInfoB\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.HomeBlueprintSlotInfoOuterClass.getDescriptor(),
        });
    internal_static_HomeCreateBlueprintRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeCreateBlueprintRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeCreateBlueprintRsp_descriptor,
        new java.lang.String[] { "Retcode", "SlotInfo", });
    emu.gingerps.net.proto.HomeBlueprintSlotInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}