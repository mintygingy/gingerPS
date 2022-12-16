// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityActionCreateTile.proto

package emu.gingerps.net.proto;

public final class AbilityActionCreateTileOuterClass {
  private AbilityActionCreateTileOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityActionCreateTileOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityActionCreateTile)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector pos = 15;</code>
     * @return Whether the pos field is set.
     */
    boolean hasPos();
    /**
     * <code>.Vector pos = 15;</code>
     * @return The pos.
     */
    emu.gingerps.net.proto.VectorOuterClass.Vector getPos();
    /**
     * <code>.Vector pos = 15;</code>
     */
    emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder();

    /**
     * <code>.Vector rot = 13;</code>
     * @return Whether the rot field is set.
     */
    boolean hasRot();
    /**
     * <code>.Vector rot = 13;</code>
     * @return The rot.
     */
    emu.gingerps.net.proto.VectorOuterClass.Vector getRot();
    /**
     * <code>.Vector rot = 13;</code>
     */
    emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getRotOrBuilder();
  }
  /**
   * Protobuf type {@code AbilityActionCreateTile}
   */
  public static final class AbilityActionCreateTile extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AbilityActionCreateTile)
      AbilityActionCreateTileOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AbilityActionCreateTile.newBuilder() to construct.
    private AbilityActionCreateTile(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AbilityActionCreateTile() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AbilityActionCreateTile();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AbilityActionCreateTile(
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
            case 106: {
              emu.gingerps.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (rot_ != null) {
                subBuilder = rot_.toBuilder();
              }
              rot_ = input.readMessage(emu.gingerps.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(rot_);
                rot_ = subBuilder.buildPartial();
              }

              break;
            }
            case 122: {
              emu.gingerps.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (pos_ != null) {
                subBuilder = pos_.toBuilder();
              }
              pos_ = input.readMessage(emu.gingerps.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(pos_);
                pos_ = subBuilder.buildPartial();
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
      return emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.internal_static_AbilityActionCreateTile_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.internal_static_AbilityActionCreateTile_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile.class, emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile.Builder.class);
    }

    public static final int POS_FIELD_NUMBER = 15;
    private emu.gingerps.net.proto.VectorOuterClass.Vector pos_;
    /**
     * <code>.Vector pos = 15;</code>
     * @return Whether the pos field is set.
     */
    @java.lang.Override
    public boolean hasPos() {
      return pos_ != null;
    }
    /**
     * <code>.Vector pos = 15;</code>
     * @return The pos.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.VectorOuterClass.Vector getPos() {
      return pos_ == null ? emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
    }
    /**
     * <code>.Vector pos = 15;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
      return getPos();
    }

    public static final int ROT_FIELD_NUMBER = 13;
    private emu.gingerps.net.proto.VectorOuterClass.Vector rot_;
    /**
     * <code>.Vector rot = 13;</code>
     * @return Whether the rot field is set.
     */
    @java.lang.Override
    public boolean hasRot() {
      return rot_ != null;
    }
    /**
     * <code>.Vector rot = 13;</code>
     * @return The rot.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.VectorOuterClass.Vector getRot() {
      return rot_ == null ? emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
    }
    /**
     * <code>.Vector rot = 13;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getRotOrBuilder() {
      return getRot();
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
      if (rot_ != null) {
        output.writeMessage(13, getRot());
      }
      if (pos_ != null) {
        output.writeMessage(15, getPos());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (rot_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, getRot());
      }
      if (pos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, getPos());
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
      if (!(obj instanceof emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile other = (emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile) obj;

      if (hasPos() != other.hasPos()) return false;
      if (hasPos()) {
        if (!getPos()
            .equals(other.getPos())) return false;
      }
      if (hasRot() != other.hasRot()) return false;
      if (hasRot()) {
        if (!getRot()
            .equals(other.getRot())) return false;
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
      if (hasPos()) {
        hash = (37 * hash) + POS_FIELD_NUMBER;
        hash = (53 * hash) + getPos().hashCode();
      }
      if (hasRot()) {
        hash = (37 * hash) + ROT_FIELD_NUMBER;
        hash = (53 * hash) + getRot().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile prototype) {
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
     * Protobuf type {@code AbilityActionCreateTile}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityActionCreateTile)
        emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTileOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.internal_static_AbilityActionCreateTile_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.internal_static_AbilityActionCreateTile_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile.class, emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile.newBuilder()
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
        if (posBuilder_ == null) {
          pos_ = null;
        } else {
          pos_ = null;
          posBuilder_ = null;
        }
        if (rotBuilder_ == null) {
          rot_ = null;
        } else {
          rot_ = null;
          rotBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.internal_static_AbilityActionCreateTile_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile getDefaultInstanceForType() {
        return emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile build() {
        emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile buildPartial() {
        emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile result = new emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile(this);
        if (posBuilder_ == null) {
          result.pos_ = pos_;
        } else {
          result.pos_ = posBuilder_.build();
        }
        if (rotBuilder_ == null) {
          result.rot_ = rot_;
        } else {
          result.rot_ = rotBuilder_.build();
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
        if (other instanceof emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile) {
          return mergeFrom((emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile other) {
        if (other == emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile.getDefaultInstance()) return this;
        if (other.hasPos()) {
          mergePos(other.getPos());
        }
        if (other.hasRot()) {
          mergeRot(other.getRot());
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
        emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.gingerps.net.proto.VectorOuterClass.Vector pos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder> posBuilder_;
      /**
       * <code>.Vector pos = 15;</code>
       * @return Whether the pos field is set.
       */
      public boolean hasPos() {
        return posBuilder_ != null || pos_ != null;
      }
      /**
       * <code>.Vector pos = 15;</code>
       * @return The pos.
       */
      public emu.gingerps.net.proto.VectorOuterClass.Vector getPos() {
        if (posBuilder_ == null) {
          return pos_ == null ? emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        } else {
          return posBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector pos = 15;</code>
       */
      public Builder setPos(emu.gingerps.net.proto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pos_ = value;
          onChanged();
        } else {
          posBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector pos = 15;</code>
       */
      public Builder setPos(
          emu.gingerps.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (posBuilder_ == null) {
          pos_ = builderForValue.build();
          onChanged();
        } else {
          posBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector pos = 15;</code>
       */
      public Builder mergePos(emu.gingerps.net.proto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (pos_ != null) {
            pos_ =
              emu.gingerps.net.proto.VectorOuterClass.Vector.newBuilder(pos_).mergeFrom(value).buildPartial();
          } else {
            pos_ = value;
          }
          onChanged();
        } else {
          posBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector pos = 15;</code>
       */
      public Builder clearPos() {
        if (posBuilder_ == null) {
          pos_ = null;
          onChanged();
        } else {
          pos_ = null;
          posBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector pos = 15;</code>
       */
      public emu.gingerps.net.proto.VectorOuterClass.Vector.Builder getPosBuilder() {
        
        onChanged();
        return getPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector pos = 15;</code>
       */
      public emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
        if (posBuilder_ != null) {
          return posBuilder_.getMessageOrBuilder();
        } else {
          return pos_ == null ?
              emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        }
      }
      /**
       * <code>.Vector pos = 15;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder> 
          getPosFieldBuilder() {
        if (posBuilder_ == null) {
          posBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getPos(),
                  getParentForChildren(),
                  isClean());
          pos_ = null;
        }
        return posBuilder_;
      }

      private emu.gingerps.net.proto.VectorOuterClass.Vector rot_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder> rotBuilder_;
      /**
       * <code>.Vector rot = 13;</code>
       * @return Whether the rot field is set.
       */
      public boolean hasRot() {
        return rotBuilder_ != null || rot_ != null;
      }
      /**
       * <code>.Vector rot = 13;</code>
       * @return The rot.
       */
      public emu.gingerps.net.proto.VectorOuterClass.Vector getRot() {
        if (rotBuilder_ == null) {
          return rot_ == null ? emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
        } else {
          return rotBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector rot = 13;</code>
       */
      public Builder setRot(emu.gingerps.net.proto.VectorOuterClass.Vector value) {
        if (rotBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          rot_ = value;
          onChanged();
        } else {
          rotBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector rot = 13;</code>
       */
      public Builder setRot(
          emu.gingerps.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (rotBuilder_ == null) {
          rot_ = builderForValue.build();
          onChanged();
        } else {
          rotBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector rot = 13;</code>
       */
      public Builder mergeRot(emu.gingerps.net.proto.VectorOuterClass.Vector value) {
        if (rotBuilder_ == null) {
          if (rot_ != null) {
            rot_ =
              emu.gingerps.net.proto.VectorOuterClass.Vector.newBuilder(rot_).mergeFrom(value).buildPartial();
          } else {
            rot_ = value;
          }
          onChanged();
        } else {
          rotBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector rot = 13;</code>
       */
      public Builder clearRot() {
        if (rotBuilder_ == null) {
          rot_ = null;
          onChanged();
        } else {
          rot_ = null;
          rotBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector rot = 13;</code>
       */
      public emu.gingerps.net.proto.VectorOuterClass.Vector.Builder getRotBuilder() {
        
        onChanged();
        return getRotFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector rot = 13;</code>
       */
      public emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getRotOrBuilder() {
        if (rotBuilder_ != null) {
          return rotBuilder_.getMessageOrBuilder();
        } else {
          return rot_ == null ?
              emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
        }
      }
      /**
       * <code>.Vector rot = 13;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder> 
          getRotFieldBuilder() {
        if (rotBuilder_ == null) {
          rotBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getRot(),
                  getParentForChildren(),
                  isClean());
          rot_ = null;
        }
        return rotBuilder_;
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


      // @@protoc_insertion_point(builder_scope:AbilityActionCreateTile)
    }

    // @@protoc_insertion_point(class_scope:AbilityActionCreateTile)
    private static final emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile();
    }

    public static emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityActionCreateTile>
        PARSER = new com.google.protobuf.AbstractParser<AbilityActionCreateTile>() {
      @java.lang.Override
      public AbilityActionCreateTile parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AbilityActionCreateTile(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AbilityActionCreateTile> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AbilityActionCreateTile> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.AbilityActionCreateTileOuterClass.AbilityActionCreateTile getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityActionCreateTile_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityActionCreateTile_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035AbilityActionCreateTile.proto\032\014Vector." +
      "proto\"E\n\027AbilityActionCreateTile\022\024\n\003pos\030" +
      "\017 \001(\0132\007.Vector\022\024\n\003rot\030\r \001(\0132\007.VectorB\033\n\031" +
      "emu.gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_AbilityActionCreateTile_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityActionCreateTile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityActionCreateTile_descriptor,
        new java.lang.String[] { "Pos", "Rot", });
    emu.gingerps.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}