// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AttackHitEffectResult.proto

package emu.gingerps.net.proto;

public final class AttackHitEffectResultOuterClass {
  private AttackHitEffectResultOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AttackHitEffectResultOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AttackHitEffectResult)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float air_strength = 13;</code>
     * @return The airStrength.
     */
    float getAirStrength();

    /**
     * <code>float hit_halt_time_scale = 10;</code>
     * @return The hitHaltTimeScale.
     */
    float getHitHaltTimeScale();

    /**
     * <code>float hit_halt_time = 9;</code>
     * @return The hitHaltTime.
     */
    float getHitHaltTime();

    /**
     * <code>uint32 Unk3300_LCKECJCKKJK = 8;</code>
     * @return The unk3300LCKECJCKKJK.
     */
    int getUnk3300LCKECJCKKJK();

    /**
     * <code>uint32 Unk3300_KLNGDAMMFIF = 1;</code>
     * @return The unk3300KLNGDAMMFIF.
     */
    int getUnk3300KLNGDAMMFIF();

    /**
     * <code>float retreat_strength = 3;</code>
     * @return The retreatStrength.
     */
    float getRetreatStrength();
  }
  /**
   * Protobuf type {@code AttackHitEffectResult}
   */
  public static final class AttackHitEffectResult extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AttackHitEffectResult)
      AttackHitEffectResultOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AttackHitEffectResult.newBuilder() to construct.
    private AttackHitEffectResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AttackHitEffectResult() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AttackHitEffectResult();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AttackHitEffectResult(
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

              unk3300KLNGDAMMFIF_ = input.readUInt32();
              break;
            }
            case 29: {

              retreatStrength_ = input.readFloat();
              break;
            }
            case 64: {

              unk3300LCKECJCKKJK_ = input.readUInt32();
              break;
            }
            case 77: {

              hitHaltTime_ = input.readFloat();
              break;
            }
            case 85: {

              hitHaltTimeScale_ = input.readFloat();
              break;
            }
            case 109: {

              airStrength_ = input.readFloat();
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
      return emu.gingerps.net.proto.AttackHitEffectResultOuterClass.internal_static_AttackHitEffectResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.AttackHitEffectResultOuterClass.internal_static_AttackHitEffectResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult.class, emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult.Builder.class);
    }

    public static final int AIR_STRENGTH_FIELD_NUMBER = 13;
    private float airStrength_;
    /**
     * <code>float air_strength = 13;</code>
     * @return The airStrength.
     */
    @java.lang.Override
    public float getAirStrength() {
      return airStrength_;
    }

    public static final int HIT_HALT_TIME_SCALE_FIELD_NUMBER = 10;
    private float hitHaltTimeScale_;
    /**
     * <code>float hit_halt_time_scale = 10;</code>
     * @return The hitHaltTimeScale.
     */
    @java.lang.Override
    public float getHitHaltTimeScale() {
      return hitHaltTimeScale_;
    }

    public static final int HIT_HALT_TIME_FIELD_NUMBER = 9;
    private float hitHaltTime_;
    /**
     * <code>float hit_halt_time = 9;</code>
     * @return The hitHaltTime.
     */
    @java.lang.Override
    public float getHitHaltTime() {
      return hitHaltTime_;
    }

    public static final int UNK3300_LCKECJCKKJK_FIELD_NUMBER = 8;
    private int unk3300LCKECJCKKJK_;
    /**
     * <code>uint32 Unk3300_LCKECJCKKJK = 8;</code>
     * @return The unk3300LCKECJCKKJK.
     */
    @java.lang.Override
    public int getUnk3300LCKECJCKKJK() {
      return unk3300LCKECJCKKJK_;
    }

    public static final int UNK3300_KLNGDAMMFIF_FIELD_NUMBER = 1;
    private int unk3300KLNGDAMMFIF_;
    /**
     * <code>uint32 Unk3300_KLNGDAMMFIF = 1;</code>
     * @return The unk3300KLNGDAMMFIF.
     */
    @java.lang.Override
    public int getUnk3300KLNGDAMMFIF() {
      return unk3300KLNGDAMMFIF_;
    }

    public static final int RETREAT_STRENGTH_FIELD_NUMBER = 3;
    private float retreatStrength_;
    /**
     * <code>float retreat_strength = 3;</code>
     * @return The retreatStrength.
     */
    @java.lang.Override
    public float getRetreatStrength() {
      return retreatStrength_;
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
      if (unk3300KLNGDAMMFIF_ != 0) {
        output.writeUInt32(1, unk3300KLNGDAMMFIF_);
      }
      if (retreatStrength_ != 0F) {
        output.writeFloat(3, retreatStrength_);
      }
      if (unk3300LCKECJCKKJK_ != 0) {
        output.writeUInt32(8, unk3300LCKECJCKKJK_);
      }
      if (hitHaltTime_ != 0F) {
        output.writeFloat(9, hitHaltTime_);
      }
      if (hitHaltTimeScale_ != 0F) {
        output.writeFloat(10, hitHaltTimeScale_);
      }
      if (airStrength_ != 0F) {
        output.writeFloat(13, airStrength_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300KLNGDAMMFIF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, unk3300KLNGDAMMFIF_);
      }
      if (retreatStrength_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(3, retreatStrength_);
      }
      if (unk3300LCKECJCKKJK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, unk3300LCKECJCKKJK_);
      }
      if (hitHaltTime_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(9, hitHaltTime_);
      }
      if (hitHaltTimeScale_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(10, hitHaltTimeScale_);
      }
      if (airStrength_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(13, airStrength_);
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
      if (!(obj instanceof emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult other = (emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult) obj;

      if (java.lang.Float.floatToIntBits(getAirStrength())
          != java.lang.Float.floatToIntBits(
              other.getAirStrength())) return false;
      if (java.lang.Float.floatToIntBits(getHitHaltTimeScale())
          != java.lang.Float.floatToIntBits(
              other.getHitHaltTimeScale())) return false;
      if (java.lang.Float.floatToIntBits(getHitHaltTime())
          != java.lang.Float.floatToIntBits(
              other.getHitHaltTime())) return false;
      if (getUnk3300LCKECJCKKJK()
          != other.getUnk3300LCKECJCKKJK()) return false;
      if (getUnk3300KLNGDAMMFIF()
          != other.getUnk3300KLNGDAMMFIF()) return false;
      if (java.lang.Float.floatToIntBits(getRetreatStrength())
          != java.lang.Float.floatToIntBits(
              other.getRetreatStrength())) return false;
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
      hash = (37 * hash) + AIR_STRENGTH_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getAirStrength());
      hash = (37 * hash) + HIT_HALT_TIME_SCALE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getHitHaltTimeScale());
      hash = (37 * hash) + HIT_HALT_TIME_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getHitHaltTime());
      hash = (37 * hash) + UNK3300_LCKECJCKKJK_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300LCKECJCKKJK();
      hash = (37 * hash) + UNK3300_KLNGDAMMFIF_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300KLNGDAMMFIF();
      hash = (37 * hash) + RETREAT_STRENGTH_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getRetreatStrength());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult prototype) {
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
     * Protobuf type {@code AttackHitEffectResult}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AttackHitEffectResult)
        emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResultOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.AttackHitEffectResultOuterClass.internal_static_AttackHitEffectResult_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.AttackHitEffectResultOuterClass.internal_static_AttackHitEffectResult_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult.class, emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult.newBuilder()
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
        airStrength_ = 0F;

        hitHaltTimeScale_ = 0F;

        hitHaltTime_ = 0F;

        unk3300LCKECJCKKJK_ = 0;

        unk3300KLNGDAMMFIF_ = 0;

        retreatStrength_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.AttackHitEffectResultOuterClass.internal_static_AttackHitEffectResult_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult getDefaultInstanceForType() {
        return emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult build() {
        emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult buildPartial() {
        emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult result = new emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult(this);
        result.airStrength_ = airStrength_;
        result.hitHaltTimeScale_ = hitHaltTimeScale_;
        result.hitHaltTime_ = hitHaltTime_;
        result.unk3300LCKECJCKKJK_ = unk3300LCKECJCKKJK_;
        result.unk3300KLNGDAMMFIF_ = unk3300KLNGDAMMFIF_;
        result.retreatStrength_ = retreatStrength_;
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
        if (other instanceof emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult) {
          return mergeFrom((emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult other) {
        if (other == emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult.getDefaultInstance()) return this;
        if (other.getAirStrength() != 0F) {
          setAirStrength(other.getAirStrength());
        }
        if (other.getHitHaltTimeScale() != 0F) {
          setHitHaltTimeScale(other.getHitHaltTimeScale());
        }
        if (other.getHitHaltTime() != 0F) {
          setHitHaltTime(other.getHitHaltTime());
        }
        if (other.getUnk3300LCKECJCKKJK() != 0) {
          setUnk3300LCKECJCKKJK(other.getUnk3300LCKECJCKKJK());
        }
        if (other.getUnk3300KLNGDAMMFIF() != 0) {
          setUnk3300KLNGDAMMFIF(other.getUnk3300KLNGDAMMFIF());
        }
        if (other.getRetreatStrength() != 0F) {
          setRetreatStrength(other.getRetreatStrength());
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
        emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private float airStrength_ ;
      /**
       * <code>float air_strength = 13;</code>
       * @return The airStrength.
       */
      @java.lang.Override
      public float getAirStrength() {
        return airStrength_;
      }
      /**
       * <code>float air_strength = 13;</code>
       * @param value The airStrength to set.
       * @return This builder for chaining.
       */
      public Builder setAirStrength(float value) {
        
        airStrength_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float air_strength = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearAirStrength() {
        
        airStrength_ = 0F;
        onChanged();
        return this;
      }

      private float hitHaltTimeScale_ ;
      /**
       * <code>float hit_halt_time_scale = 10;</code>
       * @return The hitHaltTimeScale.
       */
      @java.lang.Override
      public float getHitHaltTimeScale() {
        return hitHaltTimeScale_;
      }
      /**
       * <code>float hit_halt_time_scale = 10;</code>
       * @param value The hitHaltTimeScale to set.
       * @return This builder for chaining.
       */
      public Builder setHitHaltTimeScale(float value) {
        
        hitHaltTimeScale_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float hit_halt_time_scale = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearHitHaltTimeScale() {
        
        hitHaltTimeScale_ = 0F;
        onChanged();
        return this;
      }

      private float hitHaltTime_ ;
      /**
       * <code>float hit_halt_time = 9;</code>
       * @return The hitHaltTime.
       */
      @java.lang.Override
      public float getHitHaltTime() {
        return hitHaltTime_;
      }
      /**
       * <code>float hit_halt_time = 9;</code>
       * @param value The hitHaltTime to set.
       * @return This builder for chaining.
       */
      public Builder setHitHaltTime(float value) {
        
        hitHaltTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float hit_halt_time = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearHitHaltTime() {
        
        hitHaltTime_ = 0F;
        onChanged();
        return this;
      }

      private int unk3300LCKECJCKKJK_ ;
      /**
       * <code>uint32 Unk3300_LCKECJCKKJK = 8;</code>
       * @return The unk3300LCKECJCKKJK.
       */
      @java.lang.Override
      public int getUnk3300LCKECJCKKJK() {
        return unk3300LCKECJCKKJK_;
      }
      /**
       * <code>uint32 Unk3300_LCKECJCKKJK = 8;</code>
       * @param value The unk3300LCKECJCKKJK to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300LCKECJCKKJK(int value) {
        
        unk3300LCKECJCKKJK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_LCKECJCKKJK = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300LCKECJCKKJK() {
        
        unk3300LCKECJCKKJK_ = 0;
        onChanged();
        return this;
      }

      private int unk3300KLNGDAMMFIF_ ;
      /**
       * <code>uint32 Unk3300_KLNGDAMMFIF = 1;</code>
       * @return The unk3300KLNGDAMMFIF.
       */
      @java.lang.Override
      public int getUnk3300KLNGDAMMFIF() {
        return unk3300KLNGDAMMFIF_;
      }
      /**
       * <code>uint32 Unk3300_KLNGDAMMFIF = 1;</code>
       * @param value The unk3300KLNGDAMMFIF to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300KLNGDAMMFIF(int value) {
        
        unk3300KLNGDAMMFIF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_KLNGDAMMFIF = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300KLNGDAMMFIF() {
        
        unk3300KLNGDAMMFIF_ = 0;
        onChanged();
        return this;
      }

      private float retreatStrength_ ;
      /**
       * <code>float retreat_strength = 3;</code>
       * @return The retreatStrength.
       */
      @java.lang.Override
      public float getRetreatStrength() {
        return retreatStrength_;
      }
      /**
       * <code>float retreat_strength = 3;</code>
       * @param value The retreatStrength to set.
       * @return This builder for chaining.
       */
      public Builder setRetreatStrength(float value) {
        
        retreatStrength_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float retreat_strength = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetreatStrength() {
        
        retreatStrength_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:AttackHitEffectResult)
    }

    // @@protoc_insertion_point(class_scope:AttackHitEffectResult)
    private static final emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult();
    }

    public static emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AttackHitEffectResult>
        PARSER = new com.google.protobuf.AbstractParser<AttackHitEffectResult>() {
      @java.lang.Override
      public AttackHitEffectResult parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AttackHitEffectResult(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AttackHitEffectResult> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AttackHitEffectResult> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.AttackHitEffectResultOuterClass.AttackHitEffectResult getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AttackHitEffectResult_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AttackHitEffectResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033AttackHitEffectResult.proto\"\265\001\n\025Attack" +
      "HitEffectResult\022\024\n\014air_strength\030\r \001(\002\022\033\n" +
      "\023hit_halt_time_scale\030\n \001(\002\022\025\n\rhit_halt_t" +
      "ime\030\t \001(\002\022\033\n\023Unk3300_LCKECJCKKJK\030\010 \001(\r\022\033" +
      "\n\023Unk3300_KLNGDAMMFIF\030\001 \001(\r\022\030\n\020retreat_s" +
      "trength\030\003 \001(\002B\030\n\026emu.gingerps.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AttackHitEffectResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AttackHitEffectResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AttackHitEffectResult_descriptor,
        new java.lang.String[] { "AirStrength", "HitHaltTimeScale", "HitHaltTime", "Unk3300LCKECJCKKJK", "Unk3300KLNGDAMMFIF", "RetreatStrength", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
