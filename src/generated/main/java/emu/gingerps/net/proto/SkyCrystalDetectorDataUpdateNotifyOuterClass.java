// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SkyCrystalDetectorDataUpdateNotify.proto

package emu.gingerps.net.proto;

public final class SkyCrystalDetectorDataUpdateNotifyOuterClass {
  private SkyCrystalDetectorDataUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SkyCrystalDetectorDataUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SkyCrystalDetectorDataUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.SkyCrystalDetectorData sky_crystal_detector_data = 15;</code>
     * @return Whether the skyCrystalDetectorData field is set.
     */
    boolean hasSkyCrystalDetectorData();
    /**
     * <code>.SkyCrystalDetectorData sky_crystal_detector_data = 15;</code>
     * @return The skyCrystalDetectorData.
     */
    emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData getSkyCrystalDetectorData();
    /**
     * <code>.SkyCrystalDetectorData sky_crystal_detector_data = 15;</code>
     */
    emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorDataOrBuilder getSkyCrystalDetectorDataOrBuilder();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4259;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code SkyCrystalDetectorDataUpdateNotify}
   */
  public static final class SkyCrystalDetectorDataUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SkyCrystalDetectorDataUpdateNotify)
      SkyCrystalDetectorDataUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SkyCrystalDetectorDataUpdateNotify.newBuilder() to construct.
    private SkyCrystalDetectorDataUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SkyCrystalDetectorDataUpdateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SkyCrystalDetectorDataUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SkyCrystalDetectorDataUpdateNotify(
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
            case 122: {
              emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData.Builder subBuilder = null;
              if (skyCrystalDetectorData_ != null) {
                subBuilder = skyCrystalDetectorData_.toBuilder();
              }
              skyCrystalDetectorData_ = input.readMessage(emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(skyCrystalDetectorData_);
                skyCrystalDetectorData_ = subBuilder.buildPartial();
              }

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
      return emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.internal_static_SkyCrystalDetectorDataUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.internal_static_SkyCrystalDetectorDataUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify.class, emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify.Builder.class);
    }

    public static final int SKY_CRYSTAL_DETECTOR_DATA_FIELD_NUMBER = 15;
    private emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData skyCrystalDetectorData_;
    /**
     * <code>.SkyCrystalDetectorData sky_crystal_detector_data = 15;</code>
     * @return Whether the skyCrystalDetectorData field is set.
     */
    @java.lang.Override
    public boolean hasSkyCrystalDetectorData() {
      return skyCrystalDetectorData_ != null;
    }
    /**
     * <code>.SkyCrystalDetectorData sky_crystal_detector_data = 15;</code>
     * @return The skyCrystalDetectorData.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData getSkyCrystalDetectorData() {
      return skyCrystalDetectorData_ == null ? emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData.getDefaultInstance() : skyCrystalDetectorData_;
    }
    /**
     * <code>.SkyCrystalDetectorData sky_crystal_detector_data = 15;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorDataOrBuilder getSkyCrystalDetectorDataOrBuilder() {
      return getSkyCrystalDetectorData();
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
      if (skyCrystalDetectorData_ != null) {
        output.writeMessage(15, getSkyCrystalDetectorData());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (skyCrystalDetectorData_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, getSkyCrystalDetectorData());
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
      if (!(obj instanceof emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify other = (emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify) obj;

      if (hasSkyCrystalDetectorData() != other.hasSkyCrystalDetectorData()) return false;
      if (hasSkyCrystalDetectorData()) {
        if (!getSkyCrystalDetectorData()
            .equals(other.getSkyCrystalDetectorData())) return false;
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
      if (hasSkyCrystalDetectorData()) {
        hash = (37 * hash) + SKY_CRYSTAL_DETECTOR_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getSkyCrystalDetectorData().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify prototype) {
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
     *   CMD_ID = 4259;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code SkyCrystalDetectorDataUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SkyCrystalDetectorDataUpdateNotify)
        emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.internal_static_SkyCrystalDetectorDataUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.internal_static_SkyCrystalDetectorDataUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify.class, emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify.newBuilder()
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
        if (skyCrystalDetectorDataBuilder_ == null) {
          skyCrystalDetectorData_ = null;
        } else {
          skyCrystalDetectorData_ = null;
          skyCrystalDetectorDataBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.internal_static_SkyCrystalDetectorDataUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify build() {
        emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify buildPartial() {
        emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify result = new emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify(this);
        if (skyCrystalDetectorDataBuilder_ == null) {
          result.skyCrystalDetectorData_ = skyCrystalDetectorData_;
        } else {
          result.skyCrystalDetectorData_ = skyCrystalDetectorDataBuilder_.build();
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
        if (other instanceof emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify) {
          return mergeFrom((emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify other) {
        if (other == emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify.getDefaultInstance()) return this;
        if (other.hasSkyCrystalDetectorData()) {
          mergeSkyCrystalDetectorData(other.getSkyCrystalDetectorData());
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
        emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData skyCrystalDetectorData_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData, emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData.Builder, emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorDataOrBuilder> skyCrystalDetectorDataBuilder_;
      /**
       * <code>.SkyCrystalDetectorData sky_crystal_detector_data = 15;</code>
       * @return Whether the skyCrystalDetectorData field is set.
       */
      public boolean hasSkyCrystalDetectorData() {
        return skyCrystalDetectorDataBuilder_ != null || skyCrystalDetectorData_ != null;
      }
      /**
       * <code>.SkyCrystalDetectorData sky_crystal_detector_data = 15;</code>
       * @return The skyCrystalDetectorData.
       */
      public emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData getSkyCrystalDetectorData() {
        if (skyCrystalDetectorDataBuilder_ == null) {
          return skyCrystalDetectorData_ == null ? emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData.getDefaultInstance() : skyCrystalDetectorData_;
        } else {
          return skyCrystalDetectorDataBuilder_.getMessage();
        }
      }
      /**
       * <code>.SkyCrystalDetectorData sky_crystal_detector_data = 15;</code>
       */
      public Builder setSkyCrystalDetectorData(emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData value) {
        if (skyCrystalDetectorDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          skyCrystalDetectorData_ = value;
          onChanged();
        } else {
          skyCrystalDetectorDataBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.SkyCrystalDetectorData sky_crystal_detector_data = 15;</code>
       */
      public Builder setSkyCrystalDetectorData(
          emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData.Builder builderForValue) {
        if (skyCrystalDetectorDataBuilder_ == null) {
          skyCrystalDetectorData_ = builderForValue.build();
          onChanged();
        } else {
          skyCrystalDetectorDataBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.SkyCrystalDetectorData sky_crystal_detector_data = 15;</code>
       */
      public Builder mergeSkyCrystalDetectorData(emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData value) {
        if (skyCrystalDetectorDataBuilder_ == null) {
          if (skyCrystalDetectorData_ != null) {
            skyCrystalDetectorData_ =
              emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData.newBuilder(skyCrystalDetectorData_).mergeFrom(value).buildPartial();
          } else {
            skyCrystalDetectorData_ = value;
          }
          onChanged();
        } else {
          skyCrystalDetectorDataBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.SkyCrystalDetectorData sky_crystal_detector_data = 15;</code>
       */
      public Builder clearSkyCrystalDetectorData() {
        if (skyCrystalDetectorDataBuilder_ == null) {
          skyCrystalDetectorData_ = null;
          onChanged();
        } else {
          skyCrystalDetectorData_ = null;
          skyCrystalDetectorDataBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.SkyCrystalDetectorData sky_crystal_detector_data = 15;</code>
       */
      public emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData.Builder getSkyCrystalDetectorDataBuilder() {
        
        onChanged();
        return getSkyCrystalDetectorDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.SkyCrystalDetectorData sky_crystal_detector_data = 15;</code>
       */
      public emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorDataOrBuilder getSkyCrystalDetectorDataOrBuilder() {
        if (skyCrystalDetectorDataBuilder_ != null) {
          return skyCrystalDetectorDataBuilder_.getMessageOrBuilder();
        } else {
          return skyCrystalDetectorData_ == null ?
              emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData.getDefaultInstance() : skyCrystalDetectorData_;
        }
      }
      /**
       * <code>.SkyCrystalDetectorData sky_crystal_detector_data = 15;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData, emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData.Builder, emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorDataOrBuilder> 
          getSkyCrystalDetectorDataFieldBuilder() {
        if (skyCrystalDetectorDataBuilder_ == null) {
          skyCrystalDetectorDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData, emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorData.Builder, emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.SkyCrystalDetectorDataOrBuilder>(
                  getSkyCrystalDetectorData(),
                  getParentForChildren(),
                  isClean());
          skyCrystalDetectorData_ = null;
        }
        return skyCrystalDetectorDataBuilder_;
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


      // @@protoc_insertion_point(builder_scope:SkyCrystalDetectorDataUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:SkyCrystalDetectorDataUpdateNotify)
    private static final emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify();
    }

    public static emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SkyCrystalDetectorDataUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<SkyCrystalDetectorDataUpdateNotify>() {
      @java.lang.Override
      public SkyCrystalDetectorDataUpdateNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SkyCrystalDetectorDataUpdateNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SkyCrystalDetectorDataUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SkyCrystalDetectorDataUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.SkyCrystalDetectorDataUpdateNotifyOuterClass.SkyCrystalDetectorDataUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SkyCrystalDetectorDataUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SkyCrystalDetectorDataUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(SkyCrystalDetectorDataUpdateNotify.pro" +
      "to\032\034SkyCrystalDetectorData.proto\"`\n\"SkyC" +
      "rystalDetectorDataUpdateNotify\022:\n\031sky_cr" +
      "ystal_detector_data\030\017 \001(\0132\027.SkyCrystalDe" +
      "tectorDataB\030\n\026emu.gingerps.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.getDescriptor(),
        });
    internal_static_SkyCrystalDetectorDataUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SkyCrystalDetectorDataUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SkyCrystalDetectorDataUpdateNotify_descriptor,
        new java.lang.String[] { "SkyCrystalDetectorData", });
    emu.gingerps.net.proto.SkyCrystalDetectorDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
