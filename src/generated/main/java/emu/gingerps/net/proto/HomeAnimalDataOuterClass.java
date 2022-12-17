// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeAnimalData.proto

package emu.gingerps.net.proto;

public final class HomeAnimalDataOuterClass {
  private HomeAnimalDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeAnimalDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeAnimalData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 furniture_id = 6;</code>
     * @return The furnitureId.
     */
    int getFurnitureId();

    /**
     * <code>.Vector spawn_rot = 14;</code>
     * @return Whether the spawnRot field is set.
     */
    boolean hasSpawnRot();
    /**
     * <code>.Vector spawn_rot = 14;</code>
     * @return The spawnRot.
     */
    emu.gingerps.net.proto.VectorOuterClass.Vector getSpawnRot();
    /**
     * <code>.Vector spawn_rot = 14;</code>
     */
    emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getSpawnRotOrBuilder();

    /**
     * <code>.Vector spawn_pos = 11;</code>
     * @return Whether the spawnPos field is set.
     */
    boolean hasSpawnPos();
    /**
     * <code>.Vector spawn_pos = 11;</code>
     * @return The spawnPos.
     */
    emu.gingerps.net.proto.VectorOuterClass.Vector getSpawnPos();
    /**
     * <code>.Vector spawn_pos = 11;</code>
     */
    emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getSpawnPosOrBuilder();
  }
  /**
   * Protobuf type {@code HomeAnimalData}
   */
  public static final class HomeAnimalData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeAnimalData)
      HomeAnimalDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeAnimalData.newBuilder() to construct.
    private HomeAnimalData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeAnimalData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeAnimalData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeAnimalData(
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
            case 48: {

              furnitureId_ = input.readUInt32();
              break;
            }
            case 90: {
              emu.gingerps.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (spawnPos_ != null) {
                subBuilder = spawnPos_.toBuilder();
              }
              spawnPos_ = input.readMessage(emu.gingerps.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(spawnPos_);
                spawnPos_ = subBuilder.buildPartial();
              }

              break;
            }
            case 114: {
              emu.gingerps.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (spawnRot_ != null) {
                subBuilder = spawnRot_.toBuilder();
              }
              spawnRot_ = input.readMessage(emu.gingerps.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(spawnRot_);
                spawnRot_ = subBuilder.buildPartial();
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
      return emu.gingerps.net.proto.HomeAnimalDataOuterClass.internal_static_HomeAnimalData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.HomeAnimalDataOuterClass.internal_static_HomeAnimalData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData.class, emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData.Builder.class);
    }

    public static final int FURNITURE_ID_FIELD_NUMBER = 6;
    private int furnitureId_;
    /**
     * <code>uint32 furniture_id = 6;</code>
     * @return The furnitureId.
     */
    @java.lang.Override
    public int getFurnitureId() {
      return furnitureId_;
    }

    public static final int SPAWN_ROT_FIELD_NUMBER = 14;
    private emu.gingerps.net.proto.VectorOuterClass.Vector spawnRot_;
    /**
     * <code>.Vector spawn_rot = 14;</code>
     * @return Whether the spawnRot field is set.
     */
    @java.lang.Override
    public boolean hasSpawnRot() {
      return spawnRot_ != null;
    }
    /**
     * <code>.Vector spawn_rot = 14;</code>
     * @return The spawnRot.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.VectorOuterClass.Vector getSpawnRot() {
      return spawnRot_ == null ? emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : spawnRot_;
    }
    /**
     * <code>.Vector spawn_rot = 14;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getSpawnRotOrBuilder() {
      return getSpawnRot();
    }

    public static final int SPAWN_POS_FIELD_NUMBER = 11;
    private emu.gingerps.net.proto.VectorOuterClass.Vector spawnPos_;
    /**
     * <code>.Vector spawn_pos = 11;</code>
     * @return Whether the spawnPos field is set.
     */
    @java.lang.Override
    public boolean hasSpawnPos() {
      return spawnPos_ != null;
    }
    /**
     * <code>.Vector spawn_pos = 11;</code>
     * @return The spawnPos.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.VectorOuterClass.Vector getSpawnPos() {
      return spawnPos_ == null ? emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : spawnPos_;
    }
    /**
     * <code>.Vector spawn_pos = 11;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getSpawnPosOrBuilder() {
      return getSpawnPos();
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
      if (furnitureId_ != 0) {
        output.writeUInt32(6, furnitureId_);
      }
      if (spawnPos_ != null) {
        output.writeMessage(11, getSpawnPos());
      }
      if (spawnRot_ != null) {
        output.writeMessage(14, getSpawnRot());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (furnitureId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, furnitureId_);
      }
      if (spawnPos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getSpawnPos());
      }
      if (spawnRot_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, getSpawnRot());
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
      if (!(obj instanceof emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData other = (emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData) obj;

      if (getFurnitureId()
          != other.getFurnitureId()) return false;
      if (hasSpawnRot() != other.hasSpawnRot()) return false;
      if (hasSpawnRot()) {
        if (!getSpawnRot()
            .equals(other.getSpawnRot())) return false;
      }
      if (hasSpawnPos() != other.hasSpawnPos()) return false;
      if (hasSpawnPos()) {
        if (!getSpawnPos()
            .equals(other.getSpawnPos())) return false;
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
      hash = (37 * hash) + FURNITURE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFurnitureId();
      if (hasSpawnRot()) {
        hash = (37 * hash) + SPAWN_ROT_FIELD_NUMBER;
        hash = (53 * hash) + getSpawnRot().hashCode();
      }
      if (hasSpawnPos()) {
        hash = (37 * hash) + SPAWN_POS_FIELD_NUMBER;
        hash = (53 * hash) + getSpawnPos().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData prototype) {
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
     * Protobuf type {@code HomeAnimalData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeAnimalData)
        emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.HomeAnimalDataOuterClass.internal_static_HomeAnimalData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.HomeAnimalDataOuterClass.internal_static_HomeAnimalData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData.class, emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData.newBuilder()
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
        furnitureId_ = 0;

        if (spawnRotBuilder_ == null) {
          spawnRot_ = null;
        } else {
          spawnRot_ = null;
          spawnRotBuilder_ = null;
        }
        if (spawnPosBuilder_ == null) {
          spawnPos_ = null;
        } else {
          spawnPos_ = null;
          spawnPosBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.HomeAnimalDataOuterClass.internal_static_HomeAnimalData_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData getDefaultInstanceForType() {
        return emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData build() {
        emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData buildPartial() {
        emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData result = new emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData(this);
        result.furnitureId_ = furnitureId_;
        if (spawnRotBuilder_ == null) {
          result.spawnRot_ = spawnRot_;
        } else {
          result.spawnRot_ = spawnRotBuilder_.build();
        }
        if (spawnPosBuilder_ == null) {
          result.spawnPos_ = spawnPos_;
        } else {
          result.spawnPos_ = spawnPosBuilder_.build();
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
        if (other instanceof emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData) {
          return mergeFrom((emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData other) {
        if (other == emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData.getDefaultInstance()) return this;
        if (other.getFurnitureId() != 0) {
          setFurnitureId(other.getFurnitureId());
        }
        if (other.hasSpawnRot()) {
          mergeSpawnRot(other.getSpawnRot());
        }
        if (other.hasSpawnPos()) {
          mergeSpawnPos(other.getSpawnPos());
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
        emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int furnitureId_ ;
      /**
       * <code>uint32 furniture_id = 6;</code>
       * @return The furnitureId.
       */
      @java.lang.Override
      public int getFurnitureId() {
        return furnitureId_;
      }
      /**
       * <code>uint32 furniture_id = 6;</code>
       * @param value The furnitureId to set.
       * @return This builder for chaining.
       */
      public Builder setFurnitureId(int value) {
        
        furnitureId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 furniture_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearFurnitureId() {
        
        furnitureId_ = 0;
        onChanged();
        return this;
      }

      private emu.gingerps.net.proto.VectorOuterClass.Vector spawnRot_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder> spawnRotBuilder_;
      /**
       * <code>.Vector spawn_rot = 14;</code>
       * @return Whether the spawnRot field is set.
       */
      public boolean hasSpawnRot() {
        return spawnRotBuilder_ != null || spawnRot_ != null;
      }
      /**
       * <code>.Vector spawn_rot = 14;</code>
       * @return The spawnRot.
       */
      public emu.gingerps.net.proto.VectorOuterClass.Vector getSpawnRot() {
        if (spawnRotBuilder_ == null) {
          return spawnRot_ == null ? emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : spawnRot_;
        } else {
          return spawnRotBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector spawn_rot = 14;</code>
       */
      public Builder setSpawnRot(emu.gingerps.net.proto.VectorOuterClass.Vector value) {
        if (spawnRotBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          spawnRot_ = value;
          onChanged();
        } else {
          spawnRotBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector spawn_rot = 14;</code>
       */
      public Builder setSpawnRot(
          emu.gingerps.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (spawnRotBuilder_ == null) {
          spawnRot_ = builderForValue.build();
          onChanged();
        } else {
          spawnRotBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector spawn_rot = 14;</code>
       */
      public Builder mergeSpawnRot(emu.gingerps.net.proto.VectorOuterClass.Vector value) {
        if (spawnRotBuilder_ == null) {
          if (spawnRot_ != null) {
            spawnRot_ =
              emu.gingerps.net.proto.VectorOuterClass.Vector.newBuilder(spawnRot_).mergeFrom(value).buildPartial();
          } else {
            spawnRot_ = value;
          }
          onChanged();
        } else {
          spawnRotBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector spawn_rot = 14;</code>
       */
      public Builder clearSpawnRot() {
        if (spawnRotBuilder_ == null) {
          spawnRot_ = null;
          onChanged();
        } else {
          spawnRot_ = null;
          spawnRotBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector spawn_rot = 14;</code>
       */
      public emu.gingerps.net.proto.VectorOuterClass.Vector.Builder getSpawnRotBuilder() {
        
        onChanged();
        return getSpawnRotFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector spawn_rot = 14;</code>
       */
      public emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getSpawnRotOrBuilder() {
        if (spawnRotBuilder_ != null) {
          return spawnRotBuilder_.getMessageOrBuilder();
        } else {
          return spawnRot_ == null ?
              emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : spawnRot_;
        }
      }
      /**
       * <code>.Vector spawn_rot = 14;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder> 
          getSpawnRotFieldBuilder() {
        if (spawnRotBuilder_ == null) {
          spawnRotBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getSpawnRot(),
                  getParentForChildren(),
                  isClean());
          spawnRot_ = null;
        }
        return spawnRotBuilder_;
      }

      private emu.gingerps.net.proto.VectorOuterClass.Vector spawnPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder> spawnPosBuilder_;
      /**
       * <code>.Vector spawn_pos = 11;</code>
       * @return Whether the spawnPos field is set.
       */
      public boolean hasSpawnPos() {
        return spawnPosBuilder_ != null || spawnPos_ != null;
      }
      /**
       * <code>.Vector spawn_pos = 11;</code>
       * @return The spawnPos.
       */
      public emu.gingerps.net.proto.VectorOuterClass.Vector getSpawnPos() {
        if (spawnPosBuilder_ == null) {
          return spawnPos_ == null ? emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : spawnPos_;
        } else {
          return spawnPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector spawn_pos = 11;</code>
       */
      public Builder setSpawnPos(emu.gingerps.net.proto.VectorOuterClass.Vector value) {
        if (spawnPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          spawnPos_ = value;
          onChanged();
        } else {
          spawnPosBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector spawn_pos = 11;</code>
       */
      public Builder setSpawnPos(
          emu.gingerps.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (spawnPosBuilder_ == null) {
          spawnPos_ = builderForValue.build();
          onChanged();
        } else {
          spawnPosBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector spawn_pos = 11;</code>
       */
      public Builder mergeSpawnPos(emu.gingerps.net.proto.VectorOuterClass.Vector value) {
        if (spawnPosBuilder_ == null) {
          if (spawnPos_ != null) {
            spawnPos_ =
              emu.gingerps.net.proto.VectorOuterClass.Vector.newBuilder(spawnPos_).mergeFrom(value).buildPartial();
          } else {
            spawnPos_ = value;
          }
          onChanged();
        } else {
          spawnPosBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector spawn_pos = 11;</code>
       */
      public Builder clearSpawnPos() {
        if (spawnPosBuilder_ == null) {
          spawnPos_ = null;
          onChanged();
        } else {
          spawnPos_ = null;
          spawnPosBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector spawn_pos = 11;</code>
       */
      public emu.gingerps.net.proto.VectorOuterClass.Vector.Builder getSpawnPosBuilder() {
        
        onChanged();
        return getSpawnPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector spawn_pos = 11;</code>
       */
      public emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder getSpawnPosOrBuilder() {
        if (spawnPosBuilder_ != null) {
          return spawnPosBuilder_.getMessageOrBuilder();
        } else {
          return spawnPos_ == null ?
              emu.gingerps.net.proto.VectorOuterClass.Vector.getDefaultInstance() : spawnPos_;
        }
      }
      /**
       * <code>.Vector spawn_pos = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder> 
          getSpawnPosFieldBuilder() {
        if (spawnPosBuilder_ == null) {
          spawnPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.VectorOuterClass.Vector, emu.gingerps.net.proto.VectorOuterClass.Vector.Builder, emu.gingerps.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getSpawnPos(),
                  getParentForChildren(),
                  isClean());
          spawnPos_ = null;
        }
        return spawnPosBuilder_;
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


      // @@protoc_insertion_point(builder_scope:HomeAnimalData)
    }

    // @@protoc_insertion_point(class_scope:HomeAnimalData)
    private static final emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData();
    }

    public static emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeAnimalData>
        PARSER = new com.google.protobuf.AbstractParser<HomeAnimalData>() {
      @java.lang.Override
      public HomeAnimalData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeAnimalData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeAnimalData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeAnimalData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.HomeAnimalDataOuterClass.HomeAnimalData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeAnimalData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeAnimalData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024HomeAnimalData.proto\032\014Vector.proto\"^\n\016" +
      "HomeAnimalData\022\024\n\014furniture_id\030\006 \001(\r\022\032\n\t" +
      "spawn_rot\030\016 \001(\0132\007.Vector\022\032\n\tspawn_pos\030\013 " +
      "\001(\0132\007.VectorB\030\n\026emu.gingerps.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_HomeAnimalData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeAnimalData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeAnimalData_descriptor,
        new java.lang.String[] { "FurnitureId", "SpawnRot", "SpawnPos", });
    emu.gingerps.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
