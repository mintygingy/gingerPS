// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SummerTimeFloatSignalUpdateNotify.proto

package emu.gingerps.net.proto;

public final class SummerTimeFloatSignalUpdateNotifyOuterClass {
  private SummerTimeFloatSignalUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SummerTimeFloatSignalUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SummerTimeFloatSignalUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_transfer_anchor = 1;</code>
     * @return The isTransferAnchor.
     */
    boolean getIsTransferAnchor();

    /**
     * <code>.Vector position = 7;</code>
     * @return Whether the position field is set.
     */
    boolean hasPosition();
    /**
     * <code>.Vector position = 7;</code>
     * @return The position.
     */
    emu.gingerps.net.proto.VectorOuterClass.Vector getPosition();
    /**
     * <code>.Vector position = 7;</code>
     */
    emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getPositionOrBuilder();

    /**
     * <code>uint32 float_signal_id = 12;</code>
     * @return The floatSignalId.
     */
    int getFloatSignalId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8508;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code SummerTimeFloatSignalUpdateNotify}
   */
  public static final class SummerTimeFloatSignalUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SummerTimeFloatSignalUpdateNotify)
      SummerTimeFloatSignalUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SummerTimeFloatSignalUpdateNotify.newBuilder() to construct.
    private SummerTimeFloatSignalUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SummerTimeFloatSignalUpdateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SummerTimeFloatSignalUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SummerTimeFloatSignalUpdateNotify(
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
            case 8: {

              isTransferAnchor_ = input.readBool();
              break;
            }
            case 58: {
              emu.gingerps.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (position_ != null) {
                subBuilder = position_.toBuilder();
              }
              position_ = input.readMessage(emu.gingerps.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(position_);
                position_ = subBuilder.buildPartial();
              }

              break;
            }
            case 96: {

              floatSignalId_ = input.readUInt32();
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
      return emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.internal_static_SummerTimeFloatSignalUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.internal_static_SummerTimeFloatSignalUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify.class, emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify.Builder.class);
    }

    public static final int IS_TRANSFER_ANCHOR_FIELD_NUMBER = 1;
    private boolean isTransferAnchor_;
    /**
     * <code>bool is_transfer_anchor = 1;</code>
     * @return The isTransferAnchor.
     */
    @java.lang.Override
    public boolean getIsTransferAnchor() {
      return isTransferAnchor_;
    }

    public static final int POSITION_FIELD_NUMBER = 7;
    private emu.gingerps.net.proto.VectorOuterClass.Vector position_;
    /**
     * <code>.Vector position = 7;</code>
     * @return Whether the position field is set.
     */
    @java.lang.Override
    public boolean hasPosition() {
      return position_ != null;
    }
    /**
     * <code>.Vector position = 7;</code>
     * @return The position.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.VectorOuterClass.Vector getPosition() {
      return position_ == null ? emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : position_;
    }
    /**
     * <code>.Vector position = 7;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getPositionOrBuilder() {
      return getPosition();
    }

    public static final int FLOAT_SIGNAL_ID_FIELD_NUMBER = 12;
    private int floatSignalId_;
    /**
     * <code>uint32 float_signal_id = 12;</code>
     * @return The floatSignalId.
     */
    @java.lang.Override
    public int getFloatSignalId() {
      return floatSignalId_;
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
      if (isTransferAnchor_ != false) {
        output.writeBool(1, isTransferAnchor_);
      }
      if (position_ != null) {
        output.writeMessage(7, getPosition());
      }
      if (floatSignalId_ != 0) {
        output.writeUInt32(12, floatSignalId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isTransferAnchor_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isTransferAnchor_);
      }
      if (position_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getPosition());
      }
      if (floatSignalId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, floatSignalId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify other = (emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify) obj;

      if (getIsTransferAnchor()
          != other.getIsTransferAnchor()) return false;
      if (hasPosition() != other.hasPosition()) return false;
      if (hasPosition()) {
        if (!getPosition()
            .equals(other.getPosition())) return false;
      }
      if (getFloatSignalId()
          != other.getFloatSignalId()) return false;
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
      hash = (37 * hash) + IS_TRANSFER_ANCHOR_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsTransferAnchor());
      if (hasPosition()) {
        hash = (37 * hash) + POSITION_FIELD_NUMBER;
        hash = (53 * hash) + getPosition().hashCode();
      }
      hash = (37 * hash) + FLOAT_SIGNAL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFloatSignalId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify prototype) {
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
     *   CMD_ID = 8508;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code SummerTimeFloatSignalUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SummerTimeFloatSignalUpdateNotify)
        emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.internal_static_SummerTimeFloatSignalUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.internal_static_SummerTimeFloatSignalUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify.class, emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify.newBuilder()
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
        isTransferAnchor_ = false;

        if (positionBuilder_ == null) {
          position_ = null;
        } else {
          position_ = null;
          positionBuilder_ = null;
        }
        floatSignalId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.internal_static_SummerTimeFloatSignalUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify build() {
        emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify buildPartial() {
        emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify result = new emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify(this);
        result.isTransferAnchor_ = isTransferAnchor_;
        if (positionBuilder_ == null) {
          result.position_ = position_;
        } else {
          result.position_ = positionBuilder_.build();
        }
        result.floatSignalId_ = floatSignalId_;
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
        if (other instanceof emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify) {
          return mergeFrom((emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify other) {
        if (other == emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify.getDefaultInstance()) return this;
        if (other.getIsTransferAnchor() != false) {
          setIsTransferAnchor(other.getIsTransferAnchor());
        }
        if (other.hasPosition()) {
          mergePosition(other.getPosition());
        }
        if (other.getFloatSignalId() != 0) {
          setFloatSignalId(other.getFloatSignalId());
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
        emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isTransferAnchor_ ;
      /**
       * <code>bool is_transfer_anchor = 1;</code>
       * @return The isTransferAnchor.
       */
      @java.lang.Override
      public boolean getIsTransferAnchor() {
        return isTransferAnchor_;
      }
      /**
       * <code>bool is_transfer_anchor = 1;</code>
       * @param value The isTransferAnchor to set.
       * @return This builder for chaining.
       */
      public Builder setIsTransferAnchor(boolean value) {
        
        isTransferAnchor_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_transfer_anchor = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsTransferAnchor() {
        
        isTransferAnchor_ = false;
        onChanged();
        return this;
      }

      private emu.gingerps.net.proto.VectorOuterClass.Vector position_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder> positionBuilder_;
      /**
       * <code>.Vector position = 7;</code>
       * @return Whether the position field is set.
       */
      public boolean hasPosition() {
        return positionBuilder_ != null || position_ != null;
      }
      /**
       * <code>.Vector position = 7;</code>
       * @return The position.
       */
      public emu.gingerps.net.proto.VectorOuterClass.Vector getPosition() {
        if (positionBuilder_ == null) {
          return position_ == null ? emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : position_;
        } else {
          return positionBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector position = 7;</code>
       */
      public Builder setPosition(emu.gingerps.net.proto.VectorOuterClass.Vector value) {
        if (positionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          position_ = value;
          onChanged();
        } else {
          positionBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector position = 7;</code>
       */
      public Builder setPosition(
          emu.gingerps.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (positionBuilder_ == null) {
          position_ = builderForValue.build();
          onChanged();
        } else {
          positionBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector position = 7;</code>
       */
      public Builder mergePosition(emu.gingerps.net.proto.VectorOuterClass.Vector value) {
        if (positionBuilder_ == null) {
          if (position_ != null) {
            position_ =
              emu.gingerps.net.proto.VectorOuterClass.Vector.newBuilder(position_).mergeFrom(value).buildPartial();
          } else {
            position_ = value;
          }
          onChanged();
        } else {
          positionBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector position = 7;</code>
       */
      public Builder clearPosition() {
        if (positionBuilder_ == null) {
          position_ = null;
          onChanged();
        } else {
          position_ = null;
          positionBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector position = 7;</code>
       */
      public emu.gingerps.net.proto.VectorOuterClass.Vector.Builder getPositionBuilder() {
        
        onChanged();
        return getPositionFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector position = 7;</code>
       */
      public emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getPositionOrBuilder() {
        if (positionBuilder_ != null) {
          return positionBuilder_.getMessageOrBuilder();
        } else {
          return position_ == null ?
              emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : position_;
        }
      }
      /**
       * <code>.Vector position = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder> 
          getPositionFieldBuilder() {
        if (positionBuilder_ == null) {
          positionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getPosition(),
                  getParentForChildren(),
                  isClean());
          position_ = null;
        }
        return positionBuilder_;
      }

      private int floatSignalId_ ;
      /**
       * <code>uint32 float_signal_id = 12;</code>
       * @return The floatSignalId.
       */
      @java.lang.Override
      public int getFloatSignalId() {
        return floatSignalId_;
      }
      /**
       * <code>uint32 float_signal_id = 12;</code>
       * @param value The floatSignalId to set.
       * @return This builder for chaining.
       */
      public Builder setFloatSignalId(int value) {
        
        floatSignalId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 float_signal_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearFloatSignalId() {
        
        floatSignalId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SummerTimeFloatSignalUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:SummerTimeFloatSignalUpdateNotify)
    private static final emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify();
    }

    public static emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SummerTimeFloatSignalUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<SummerTimeFloatSignalUpdateNotify>() {
      @java.lang.Override
      public SummerTimeFloatSignalUpdateNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SummerTimeFloatSignalUpdateNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SummerTimeFloatSignalUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SummerTimeFloatSignalUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.SummerTimeFloatSignalUpdateNotifyOuterClass.SummerTimeFloatSignalUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SummerTimeFloatSignalUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SummerTimeFloatSignalUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'SummerTimeFloatSignalUpdateNotify.prot" +
      "o\032\014Vector.proto\"s\n!SummerTimeFloatSignal" +
      "UpdateNotify\022\032\n\022is_transfer_anchor\030\001 \001(\010" +
      "\022\031\n\010position\030\007 \001(\0132\007.Vector\022\027\n\017float_sig" +
      "nal_id\030\014 \001(\rB\030\n\026emu.gingerps.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_SummerTimeFloatSignalUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SummerTimeFloatSignalUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SummerTimeFloatSignalUpdateNotify_descriptor,
        new java.lang.String[] { "IsTransferAnchor", "Position", "FloatSignalId", });
    emu.gingerps.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
