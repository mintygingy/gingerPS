// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BlossomChestInfoNotify.proto

package emu.gingerps.net.proto;

public final class BlossomChestInfoNotifyOuterClass {
  private BlossomChestInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BlossomChestInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BlossomChestInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.BlossomChestInfo blossom_chest_info = 13;</code>
     * @return Whether the blossomChestInfo field is set.
     */
    boolean hasBlossomChestInfo();
    /**
     * <code>.BlossomChestInfo blossom_chest_info = 13;</code>
     * @return The blossomChestInfo.
     */
    emu.gingerps.net.proto.BlossomChestInfoOuterClass.BlossomChestInfo getBlossomChestInfo();
    /**
     * <code>.BlossomChestInfo blossom_chest_info = 13;</code>
     */
    emu.gingerps.net.proto.BlossomChestInfoOuterClass.BlossomChestInfoOrBuilder getBlossomChestInfoOrBuilder();

    /**
     * <code>uint32 entity_id = 10;</code>
     * @return The entityId.
     */
    int getEntityId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 847;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code BlossomChestInfoNotify}
   */
  public static final class BlossomChestInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BlossomChestInfoNotify)
      BlossomChestInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BlossomChestInfoNotify.newBuilder() to construct.
    private BlossomChestInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BlossomChestInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BlossomChestInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BlossomChestInfoNotify(
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
            case 80: {

              entityId_ = input.readUInt32();
              break;
            }
            case 106: {
              emu.gingerps.net.proto.BlossomChestInfoOuterClass.BlossomChestInfo.Builder subBuilder = null;
              if (blossomChestInfo_ != null) {
                subBuilder = blossomChestInfo_.toBuilder();
              }
              blossomChestInfo_ = input.readMessage(emu.gingerps.net.proto.BlossomChestInfoOuterClass.BlossomChestInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(blossomChestInfo_);
                blossomChestInfo_ = subBuilder.buildPartial();
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
      return emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.internal_static_BlossomChestInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.internal_static_BlossomChestInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify.class, emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify.Builder.class);
    }

    public static final int BLOSSOM_CHEST_INFO_FIELD_NUMBER = 13;
    private emu.gingerps.net.proto.BlossomChestInfoOuterClass.BlossomChestInfo blossomChestInfo_;
    /**
     * <code>.BlossomChestInfo blossom_chest_info = 13;</code>
     * @return Whether the blossomChestInfo field is set.
     */
    @java.lang.Override
    public boolean hasBlossomChestInfo() {
      return blossomChestInfo_ != null;
    }
    /**
     * <code>.BlossomChestInfo blossom_chest_info = 13;</code>
     * @return The blossomChestInfo.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.BlossomChestInfoOuterClass.BlossomChestInfo getBlossomChestInfo() {
      return blossomChestInfo_ == null ? emu.gingerps.net.proto.BlossomChestInfoOuterClass.BlossomChestInfo.getDefaultInstance() : blossomChestInfo_;
    }
    /**
     * <code>.BlossomChestInfo blossom_chest_info = 13;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.BlossomChestInfoOuterClass.BlossomChestInfoOrBuilder getBlossomChestInfoOrBuilder() {
      return getBlossomChestInfo();
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 10;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 10;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
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
      if (entityId_ != 0) {
        output.writeUInt32(10, entityId_);
      }
      if (blossomChestInfo_ != null) {
        output.writeMessage(13, getBlossomChestInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, entityId_);
      }
      if (blossomChestInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, getBlossomChestInfo());
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
      if (!(obj instanceof emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify other = (emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify) obj;

      if (hasBlossomChestInfo() != other.hasBlossomChestInfo()) return false;
      if (hasBlossomChestInfo()) {
        if (!getBlossomChestInfo()
            .equals(other.getBlossomChestInfo())) return false;
      }
      if (getEntityId()
          != other.getEntityId()) return false;
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
      if (hasBlossomChestInfo()) {
        hash = (37 * hash) + BLOSSOM_CHEST_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getBlossomChestInfo().hashCode();
      }
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify prototype) {
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
     *   CMD_ID = 847;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code BlossomChestInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BlossomChestInfoNotify)
        emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.internal_static_BlossomChestInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.internal_static_BlossomChestInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify.class, emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify.newBuilder()
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
        if (blossomChestInfoBuilder_ == null) {
          blossomChestInfo_ = null;
        } else {
          blossomChestInfo_ = null;
          blossomChestInfoBuilder_ = null;
        }
        entityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.internal_static_BlossomChestInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify build() {
        emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify buildPartial() {
        emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify result = new emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify(this);
        if (blossomChestInfoBuilder_ == null) {
          result.blossomChestInfo_ = blossomChestInfo_;
        } else {
          result.blossomChestInfo_ = blossomChestInfoBuilder_.build();
        }
        result.entityId_ = entityId_;
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
        if (other instanceof emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify) {
          return mergeFrom((emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify other) {
        if (other == emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify.getDefaultInstance()) return this;
        if (other.hasBlossomChestInfo()) {
          mergeBlossomChestInfo(other.getBlossomChestInfo());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
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
        emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.gingerps.net.proto.BlossomChestInfoOuterClass.BlossomChestInfo blossomChestInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.BlossomChestInfoOuterClass.BlossomChestInfo, emu.gingerps.net.proto.BlossomChestInfoOuterClass.BlossomChestInfo.Builder, emu.gingerps.net.proto.BlossomChestInfoOuterClass.BlossomChestInfoOrBuilder> blossomChestInfoBuilder_;
      /**
       * <code>.BlossomChestInfo blossom_chest_info = 13;</code>
       * @return Whether the blossomChestInfo field is set.
       */
      public boolean hasBlossomChestInfo() {
        return blossomChestInfoBuilder_ != null || blossomChestInfo_ != null;
      }
      /**
       * <code>.BlossomChestInfo blossom_chest_info = 13;</code>
       * @return The blossomChestInfo.
       */
      public emu.gingerps.net.proto.BlossomChestInfoOuterClass.BlossomChestInfo getBlossomChestInfo() {
        if (blossomChestInfoBuilder_ == null) {
          return blossomChestInfo_ == null ? emu.gingerps.net.proto.BlossomChestInfoOuterClass.BlossomChestInfo.getDefaultInstance() : blossomChestInfo_;
        } else {
          return blossomChestInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.BlossomChestInfo blossom_chest_info = 13;</code>
       */
      public Builder setBlossomChestInfo(emu.gingerps.net.proto.BlossomChestInfoOuterClass.BlossomChestInfo value) {
        if (blossomChestInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          blossomChestInfo_ = value;
          onChanged();
        } else {
          blossomChestInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.BlossomChestInfo blossom_chest_info = 13;</code>
       */
      public Builder setBlossomChestInfo(
          emu.gingerps.net.proto.BlossomChestInfoOuterClass.BlossomChestInfo.Builder builderForValue) {
        if (blossomChestInfoBuilder_ == null) {
          blossomChestInfo_ = builderForValue.build();
          onChanged();
        } else {
          blossomChestInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.BlossomChestInfo blossom_chest_info = 13;</code>
       */
      public Builder mergeBlossomChestInfo(emu.gingerps.net.proto.BlossomChestInfoOuterClass.BlossomChestInfo value) {
        if (blossomChestInfoBuilder_ == null) {
          if (blossomChestInfo_ != null) {
            blossomChestInfo_ =
              emu.gingerps.net.proto.BlossomChestInfoOuterClass.BlossomChestInfo.newBuilder(blossomChestInfo_).mergeFrom(value).buildPartial();
          } else {
            blossomChestInfo_ = value;
          }
          onChanged();
        } else {
          blossomChestInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.BlossomChestInfo blossom_chest_info = 13;</code>
       */
      public Builder clearBlossomChestInfo() {
        if (blossomChestInfoBuilder_ == null) {
          blossomChestInfo_ = null;
          onChanged();
        } else {
          blossomChestInfo_ = null;
          blossomChestInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.BlossomChestInfo blossom_chest_info = 13;</code>
       */
      public emu.gingerps.net.proto.BlossomChestInfoOuterClass.BlossomChestInfo.Builder getBlossomChestInfoBuilder() {
        
        onChanged();
        return getBlossomChestInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.BlossomChestInfo blossom_chest_info = 13;</code>
       */
      public emu.gingerps.net.proto.BlossomChestInfoOuterClass.BlossomChestInfoOrBuilder getBlossomChestInfoOrBuilder() {
        if (blossomChestInfoBuilder_ != null) {
          return blossomChestInfoBuilder_.getMessageOrBuilder();
        } else {
          return blossomChestInfo_ == null ?
              emu.gingerps.net.proto.BlossomChestInfoOuterClass.BlossomChestInfo.getDefaultInstance() : blossomChestInfo_;
        }
      }
      /**
       * <code>.BlossomChestInfo blossom_chest_info = 13;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.BlossomChestInfoOuterClass.BlossomChestInfo, emu.gingerps.net.proto.BlossomChestInfoOuterClass.BlossomChestInfo.Builder, emu.gingerps.net.proto.BlossomChestInfoOuterClass.BlossomChestInfoOrBuilder> 
          getBlossomChestInfoFieldBuilder() {
        if (blossomChestInfoBuilder_ == null) {
          blossomChestInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.BlossomChestInfoOuterClass.BlossomChestInfo, emu.gingerps.net.proto.BlossomChestInfoOuterClass.BlossomChestInfo.Builder, emu.gingerps.net.proto.BlossomChestInfoOuterClass.BlossomChestInfoOrBuilder>(
                  getBlossomChestInfo(),
                  getParentForChildren(),
                  isClean());
          blossomChestInfo_ = null;
        }
        return blossomChestInfoBuilder_;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 10;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 10;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:BlossomChestInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:BlossomChestInfoNotify)
    private static final emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify();
    }

    public static emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BlossomChestInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<BlossomChestInfoNotify>() {
      @java.lang.Override
      public BlossomChestInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BlossomChestInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BlossomChestInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BlossomChestInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.BlossomChestInfoNotifyOuterClass.BlossomChestInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BlossomChestInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BlossomChestInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034BlossomChestInfoNotify.proto\032\026BlossomC" +
      "hestInfo.proto\"Z\n\026BlossomChestInfoNotify" +
      "\022-\n\022blossom_chest_info\030\r \001(\0132\021.BlossomCh" +
      "estInfo\022\021\n\tentity_id\030\n \001(\rB\030\n\026emu.ginger" +
      "ps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.BlossomChestInfoOuterClass.getDescriptor(),
        });
    internal_static_BlossomChestInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BlossomChestInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BlossomChestInfoNotify_descriptor,
        new java.lang.String[] { "BlossomChestInfo", "EntityId", });
    emu.gingerps.net.proto.BlossomChestInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
