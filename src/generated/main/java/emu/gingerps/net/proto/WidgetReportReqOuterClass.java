// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WidgetReportReq.proto

package emu.gingerps.net.proto;

public final class WidgetReportReqOuterClass {
  private WidgetReportReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WidgetReportReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WidgetReportReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 weather_wizard_shield_value = 8;</code>
     * @return The weatherWizardShieldValue.
     */
    int getWeatherWizardShieldValue();

    /**
     * <code>bool Unk3300_APDFKKNKIJJ = 7;</code>
     * @return The unk3300APDFKKNKIJJ.
     */
    boolean getUnk3300APDFKKNKIJJ();

    /**
     * <code>bool Unk3300_BCAIBKDIHHF = 6;</code>
     * @return The unk3300BCAIBKDIHHF.
     */
    boolean getUnk3300BCAIBKDIHHF();

    /**
     * <code>uint32 material_id = 2;</code>
     * @return The materialId.
     */
    int getMaterialId();

    /**
     * <code>bool Unk3300_EFBCLDDKMIM = 14;</code>
     * @return The unk3300EFBCLDDKMIM.
     */
    boolean getUnk3300EFBCLDDKMIM();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4258;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code WidgetReportReq}
   */
  public static final class WidgetReportReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WidgetReportReq)
      WidgetReportReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WidgetReportReq.newBuilder() to construct.
    private WidgetReportReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WidgetReportReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WidgetReportReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WidgetReportReq(
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
            case 16: {

              materialId_ = input.readUInt32();
              break;
            }
            case 48: {

              unk3300BCAIBKDIHHF_ = input.readBool();
              break;
            }
            case 56: {

              unk3300APDFKKNKIJJ_ = input.readBool();
              break;
            }
            case 64: {

              weatherWizardShieldValue_ = input.readUInt32();
              break;
            }
            case 112: {

              unk3300EFBCLDDKMIM_ = input.readBool();
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
      return emu.gingerps.net.proto.WidgetReportReqOuterClass.internal_static_WidgetReportReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.WidgetReportReqOuterClass.internal_static_WidgetReportReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq.class, emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq.Builder.class);
    }

    public static final int WEATHER_WIZARD_SHIELD_VALUE_FIELD_NUMBER = 8;
    private int weatherWizardShieldValue_;
    /**
     * <code>uint32 weather_wizard_shield_value = 8;</code>
     * @return The weatherWizardShieldValue.
     */
    @java.lang.Override
    public int getWeatherWizardShieldValue() {
      return weatherWizardShieldValue_;
    }

    public static final int UNK3300_APDFKKNKIJJ_FIELD_NUMBER = 7;
    private boolean unk3300APDFKKNKIJJ_;
    /**
     * <code>bool Unk3300_APDFKKNKIJJ = 7;</code>
     * @return The unk3300APDFKKNKIJJ.
     */
    @java.lang.Override
    public boolean getUnk3300APDFKKNKIJJ() {
      return unk3300APDFKKNKIJJ_;
    }

    public static final int UNK3300_BCAIBKDIHHF_FIELD_NUMBER = 6;
    private boolean unk3300BCAIBKDIHHF_;
    /**
     * <code>bool Unk3300_BCAIBKDIHHF = 6;</code>
     * @return The unk3300BCAIBKDIHHF.
     */
    @java.lang.Override
    public boolean getUnk3300BCAIBKDIHHF() {
      return unk3300BCAIBKDIHHF_;
    }

    public static final int MATERIAL_ID_FIELD_NUMBER = 2;
    private int materialId_;
    /**
     * <code>uint32 material_id = 2;</code>
     * @return The materialId.
     */
    @java.lang.Override
    public int getMaterialId() {
      return materialId_;
    }

    public static final int UNK3300_EFBCLDDKMIM_FIELD_NUMBER = 14;
    private boolean unk3300EFBCLDDKMIM_;
    /**
     * <code>bool Unk3300_EFBCLDDKMIM = 14;</code>
     * @return The unk3300EFBCLDDKMIM.
     */
    @java.lang.Override
    public boolean getUnk3300EFBCLDDKMIM() {
      return unk3300EFBCLDDKMIM_;
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
      if (materialId_ != 0) {
        output.writeUInt32(2, materialId_);
      }
      if (unk3300BCAIBKDIHHF_ != false) {
        output.writeBool(6, unk3300BCAIBKDIHHF_);
      }
      if (unk3300APDFKKNKIJJ_ != false) {
        output.writeBool(7, unk3300APDFKKNKIJJ_);
      }
      if (weatherWizardShieldValue_ != 0) {
        output.writeUInt32(8, weatherWizardShieldValue_);
      }
      if (unk3300EFBCLDDKMIM_ != false) {
        output.writeBool(14, unk3300EFBCLDDKMIM_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (materialId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, materialId_);
      }
      if (unk3300BCAIBKDIHHF_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, unk3300BCAIBKDIHHF_);
      }
      if (unk3300APDFKKNKIJJ_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, unk3300APDFKKNKIJJ_);
      }
      if (weatherWizardShieldValue_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, weatherWizardShieldValue_);
      }
      if (unk3300EFBCLDDKMIM_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, unk3300EFBCLDDKMIM_);
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
      if (!(obj instanceof emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq other = (emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq) obj;

      if (getWeatherWizardShieldValue()
          != other.getWeatherWizardShieldValue()) return false;
      if (getUnk3300APDFKKNKIJJ()
          != other.getUnk3300APDFKKNKIJJ()) return false;
      if (getUnk3300BCAIBKDIHHF()
          != other.getUnk3300BCAIBKDIHHF()) return false;
      if (getMaterialId()
          != other.getMaterialId()) return false;
      if (getUnk3300EFBCLDDKMIM()
          != other.getUnk3300EFBCLDDKMIM()) return false;
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
      hash = (37 * hash) + WEATHER_WIZARD_SHIELD_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getWeatherWizardShieldValue();
      hash = (37 * hash) + UNK3300_APDFKKNKIJJ_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3300APDFKKNKIJJ());
      hash = (37 * hash) + UNK3300_BCAIBKDIHHF_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3300BCAIBKDIHHF());
      hash = (37 * hash) + MATERIAL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMaterialId();
      hash = (37 * hash) + UNK3300_EFBCLDDKMIM_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3300EFBCLDDKMIM());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq prototype) {
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
     *   CMD_ID = 4258;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code WidgetReportReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WidgetReportReq)
        emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.WidgetReportReqOuterClass.internal_static_WidgetReportReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.WidgetReportReqOuterClass.internal_static_WidgetReportReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq.class, emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq.newBuilder()
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
        weatherWizardShieldValue_ = 0;

        unk3300APDFKKNKIJJ_ = false;

        unk3300BCAIBKDIHHF_ = false;

        materialId_ = 0;

        unk3300EFBCLDDKMIM_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.WidgetReportReqOuterClass.internal_static_WidgetReportReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq build() {
        emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq buildPartial() {
        emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq result = new emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq(this);
        result.weatherWizardShieldValue_ = weatherWizardShieldValue_;
        result.unk3300APDFKKNKIJJ_ = unk3300APDFKKNKIJJ_;
        result.unk3300BCAIBKDIHHF_ = unk3300BCAIBKDIHHF_;
        result.materialId_ = materialId_;
        result.unk3300EFBCLDDKMIM_ = unk3300EFBCLDDKMIM_;
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
        if (other instanceof emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq) {
          return mergeFrom((emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq other) {
        if (other == emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq.getDefaultInstance()) return this;
        if (other.getWeatherWizardShieldValue() != 0) {
          setWeatherWizardShieldValue(other.getWeatherWizardShieldValue());
        }
        if (other.getUnk3300APDFKKNKIJJ() != false) {
          setUnk3300APDFKKNKIJJ(other.getUnk3300APDFKKNKIJJ());
        }
        if (other.getUnk3300BCAIBKDIHHF() != false) {
          setUnk3300BCAIBKDIHHF(other.getUnk3300BCAIBKDIHHF());
        }
        if (other.getMaterialId() != 0) {
          setMaterialId(other.getMaterialId());
        }
        if (other.getUnk3300EFBCLDDKMIM() != false) {
          setUnk3300EFBCLDDKMIM(other.getUnk3300EFBCLDDKMIM());
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
        emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int weatherWizardShieldValue_ ;
      /**
       * <code>uint32 weather_wizard_shield_value = 8;</code>
       * @return The weatherWizardShieldValue.
       */
      @java.lang.Override
      public int getWeatherWizardShieldValue() {
        return weatherWizardShieldValue_;
      }
      /**
       * <code>uint32 weather_wizard_shield_value = 8;</code>
       * @param value The weatherWizardShieldValue to set.
       * @return This builder for chaining.
       */
      public Builder setWeatherWizardShieldValue(int value) {
        
        weatherWizardShieldValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 weather_wizard_shield_value = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearWeatherWizardShieldValue() {
        
        weatherWizardShieldValue_ = 0;
        onChanged();
        return this;
      }

      private boolean unk3300APDFKKNKIJJ_ ;
      /**
       * <code>bool Unk3300_APDFKKNKIJJ = 7;</code>
       * @return The unk3300APDFKKNKIJJ.
       */
      @java.lang.Override
      public boolean getUnk3300APDFKKNKIJJ() {
        return unk3300APDFKKNKIJJ_;
      }
      /**
       * <code>bool Unk3300_APDFKKNKIJJ = 7;</code>
       * @param value The unk3300APDFKKNKIJJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300APDFKKNKIJJ(boolean value) {
        
        unk3300APDFKKNKIJJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3300_APDFKKNKIJJ = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300APDFKKNKIJJ() {
        
        unk3300APDFKKNKIJJ_ = false;
        onChanged();
        return this;
      }

      private boolean unk3300BCAIBKDIHHF_ ;
      /**
       * <code>bool Unk3300_BCAIBKDIHHF = 6;</code>
       * @return The unk3300BCAIBKDIHHF.
       */
      @java.lang.Override
      public boolean getUnk3300BCAIBKDIHHF() {
        return unk3300BCAIBKDIHHF_;
      }
      /**
       * <code>bool Unk3300_BCAIBKDIHHF = 6;</code>
       * @param value The unk3300BCAIBKDIHHF to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300BCAIBKDIHHF(boolean value) {
        
        unk3300BCAIBKDIHHF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3300_BCAIBKDIHHF = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300BCAIBKDIHHF() {
        
        unk3300BCAIBKDIHHF_ = false;
        onChanged();
        return this;
      }

      private int materialId_ ;
      /**
       * <code>uint32 material_id = 2;</code>
       * @return The materialId.
       */
      @java.lang.Override
      public int getMaterialId() {
        return materialId_;
      }
      /**
       * <code>uint32 material_id = 2;</code>
       * @param value The materialId to set.
       * @return This builder for chaining.
       */
      public Builder setMaterialId(int value) {
        
        materialId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 material_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaterialId() {
        
        materialId_ = 0;
        onChanged();
        return this;
      }

      private boolean unk3300EFBCLDDKMIM_ ;
      /**
       * <code>bool Unk3300_EFBCLDDKMIM = 14;</code>
       * @return The unk3300EFBCLDDKMIM.
       */
      @java.lang.Override
      public boolean getUnk3300EFBCLDDKMIM() {
        return unk3300EFBCLDDKMIM_;
      }
      /**
       * <code>bool Unk3300_EFBCLDDKMIM = 14;</code>
       * @param value The unk3300EFBCLDDKMIM to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300EFBCLDDKMIM(boolean value) {
        
        unk3300EFBCLDDKMIM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3300_EFBCLDDKMIM = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300EFBCLDDKMIM() {
        
        unk3300EFBCLDDKMIM_ = false;
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


      // @@protoc_insertion_point(builder_scope:WidgetReportReq)
    }

    // @@protoc_insertion_point(class_scope:WidgetReportReq)
    private static final emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq();
    }

    public static emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WidgetReportReq>
        PARSER = new com.google.protobuf.AbstractParser<WidgetReportReq>() {
      @java.lang.Override
      public WidgetReportReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WidgetReportReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WidgetReportReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WidgetReportReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.WidgetReportReqOuterClass.WidgetReportReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WidgetReportReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WidgetReportReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025WidgetReportReq.proto\"\242\001\n\017WidgetReport" +
      "Req\022#\n\033weather_wizard_shield_value\030\010 \001(\r" +
      "\022\033\n\023Unk3300_APDFKKNKIJJ\030\007 \001(\010\022\033\n\023Unk3300" +
      "_BCAIBKDIHHF\030\006 \001(\010\022\023\n\013material_id\030\002 \001(\r\022" +
      "\033\n\023Unk3300_EFBCLDDKMIM\030\016 \001(\010B\030\n\026emu.ging" +
      "erps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WidgetReportReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WidgetReportReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WidgetReportReq_descriptor,
        new java.lang.String[] { "WeatherWizardShieldValue", "Unk3300APDFKKNKIJJ", "Unk3300BCAIBKDIHHF", "MaterialId", "Unk3300EFBCLDDKMIM", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
