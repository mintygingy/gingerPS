// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetCityReputationInfoRsp.proto

package emu.gingerps.net.proto;

public final class GetCityReputationInfoRspOuterClass {
  private GetCityReputationInfoRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetCityReputationInfoRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetCityReputationInfoRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.CityReputationInfo city_reputation_info = 11;</code>
     * @return Whether the cityReputationInfo field is set.
     */
    boolean hasCityReputationInfo();
    /**
     * <code>.CityReputationInfo city_reputation_info = 11;</code>
     * @return The cityReputationInfo.
     */
    emu.gingerps.net.proto.CityReputationInfoOuterClass.CityReputationInfo getCityReputationInfo();
    /**
     * <code>.CityReputationInfo city_reputation_info = 11;</code>
     */
    emu.gingerps.net.proto.CityReputationInfoOuterClass.CityReputationInfoOrBuilder getCityReputationInfoOrBuilder();

    /**
     * <code>uint32 city_id = 7;</code>
     * @return The cityId.
     */
    int getCityId();

    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 2830;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GetCityReputationInfoRsp}
   */
  public static final class GetCityReputationInfoRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetCityReputationInfoRsp)
      GetCityReputationInfoRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetCityReputationInfoRsp.newBuilder() to construct.
    private GetCityReputationInfoRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetCityReputationInfoRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetCityReputationInfoRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetCityReputationInfoRsp(
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

              retcode_ = input.readInt32();
              break;
            }
            case 56: {

              cityId_ = input.readUInt32();
              break;
            }
            case 90: {
              emu.gingerps.net.proto.CityReputationInfoOuterClass.CityReputationInfo.Builder subBuilder = null;
              if (cityReputationInfo_ != null) {
                subBuilder = cityReputationInfo_.toBuilder();
              }
              cityReputationInfo_ = input.readMessage(emu.gingerps.net.proto.CityReputationInfoOuterClass.CityReputationInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(cityReputationInfo_);
                cityReputationInfo_ = subBuilder.buildPartial();
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
      return emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.internal_static_GetCityReputationInfoRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.internal_static_GetCityReputationInfoRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp.class, emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp.Builder.class);
    }

    public static final int CITY_REPUTATION_INFO_FIELD_NUMBER = 11;
    private emu.gingerps.net.proto.CityReputationInfoOuterClass.CityReputationInfo cityReputationInfo_;
    /**
     * <code>.CityReputationInfo city_reputation_info = 11;</code>
     * @return Whether the cityReputationInfo field is set.
     */
    @java.lang.Override
    public boolean hasCityReputationInfo() {
      return cityReputationInfo_ != null;
    }
    /**
     * <code>.CityReputationInfo city_reputation_info = 11;</code>
     * @return The cityReputationInfo.
     */
    @java.lang.Override
    public emu.gingerps.net.proto.CityReputationInfoOuterClass.CityReputationInfo getCityReputationInfo() {
      return cityReputationInfo_ == null ? emu.gingerps.net.proto.CityReputationInfoOuterClass.CityReputationInfo.getDefaultInstance() : cityReputationInfo_;
    }
    /**
     * <code>.CityReputationInfo city_reputation_info = 11;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.CityReputationInfoOuterClass.CityReputationInfoOrBuilder getCityReputationInfoOrBuilder() {
      return getCityReputationInfo();
    }

    public static final int CITY_ID_FIELD_NUMBER = 7;
    private int cityId_;
    /**
     * <code>uint32 city_id = 7;</code>
     * @return The cityId.
     */
    @java.lang.Override
    public int getCityId() {
      return cityId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 2;
    private int retcode_;
    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (retcode_ != 0) {
        output.writeInt32(2, retcode_);
      }
      if (cityId_ != 0) {
        output.writeUInt32(7, cityId_);
      }
      if (cityReputationInfo_ != null) {
        output.writeMessage(11, getCityReputationInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, retcode_);
      }
      if (cityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, cityId_);
      }
      if (cityReputationInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getCityReputationInfo());
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
      if (!(obj instanceof emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp other = (emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp) obj;

      if (hasCityReputationInfo() != other.hasCityReputationInfo()) return false;
      if (hasCityReputationInfo()) {
        if (!getCityReputationInfo()
            .equals(other.getCityReputationInfo())) return false;
      }
      if (getCityId()
          != other.getCityId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      if (hasCityReputationInfo()) {
        hash = (37 * hash) + CITY_REPUTATION_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getCityReputationInfo().hashCode();
      }
      hash = (37 * hash) + CITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCityId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp prototype) {
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
     *   CMD_ID = 2830;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GetCityReputationInfoRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetCityReputationInfoRsp)
        emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.internal_static_GetCityReputationInfoRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.internal_static_GetCityReputationInfoRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp.class, emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp.newBuilder()
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
        if (cityReputationInfoBuilder_ == null) {
          cityReputationInfo_ = null;
        } else {
          cityReputationInfo_ = null;
          cityReputationInfoBuilder_ = null;
        }
        cityId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.internal_static_GetCityReputationInfoRsp_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp getDefaultInstanceForType() {
        return emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp build() {
        emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp buildPartial() {
        emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp result = new emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp(this);
        if (cityReputationInfoBuilder_ == null) {
          result.cityReputationInfo_ = cityReputationInfo_;
        } else {
          result.cityReputationInfo_ = cityReputationInfoBuilder_.build();
        }
        result.cityId_ = cityId_;
        result.retcode_ = retcode_;
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
        if (other instanceof emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp) {
          return mergeFrom((emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp other) {
        if (other == emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp.getDefaultInstance()) return this;
        if (other.hasCityReputationInfo()) {
          mergeCityReputationInfo(other.getCityReputationInfo());
        }
        if (other.getCityId() != 0) {
          setCityId(other.getCityId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.gingerps.net.proto.CityReputationInfoOuterClass.CityReputationInfo cityReputationInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.CityReputationInfoOuterClass.CityReputationInfo, emu.gingerps.net.proto.CityReputationInfoOuterClass.CityReputationInfo.Builder, emu.gingerps.net.proto.CityReputationInfoOuterClass.CityReputationInfoOrBuilder> cityReputationInfoBuilder_;
      /**
       * <code>.CityReputationInfo city_reputation_info = 11;</code>
       * @return Whether the cityReputationInfo field is set.
       */
      public boolean hasCityReputationInfo() {
        return cityReputationInfoBuilder_ != null || cityReputationInfo_ != null;
      }
      /**
       * <code>.CityReputationInfo city_reputation_info = 11;</code>
       * @return The cityReputationInfo.
       */
      public emu.gingerps.net.proto.CityReputationInfoOuterClass.CityReputationInfo getCityReputationInfo() {
        if (cityReputationInfoBuilder_ == null) {
          return cityReputationInfo_ == null ? emu.gingerps.net.proto.CityReputationInfoOuterClass.CityReputationInfo.getDefaultInstance() : cityReputationInfo_;
        } else {
          return cityReputationInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.CityReputationInfo city_reputation_info = 11;</code>
       */
      public Builder setCityReputationInfo(emu.gingerps.net.proto.CityReputationInfoOuterClass.CityReputationInfo value) {
        if (cityReputationInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          cityReputationInfo_ = value;
          onChanged();
        } else {
          cityReputationInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.CityReputationInfo city_reputation_info = 11;</code>
       */
      public Builder setCityReputationInfo(
          emu.gingerps.net.proto.CityReputationInfoOuterClass.CityReputationInfo.Builder builderForValue) {
        if (cityReputationInfoBuilder_ == null) {
          cityReputationInfo_ = builderForValue.build();
          onChanged();
        } else {
          cityReputationInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.CityReputationInfo city_reputation_info = 11;</code>
       */
      public Builder mergeCityReputationInfo(emu.gingerps.net.proto.CityReputationInfoOuterClass.CityReputationInfo value) {
        if (cityReputationInfoBuilder_ == null) {
          if (cityReputationInfo_ != null) {
            cityReputationInfo_ =
              emu.gingerps.net.proto.CityReputationInfoOuterClass.CityReputationInfo.newBuilder(cityReputationInfo_).mergeFrom(value).buildPartial();
          } else {
            cityReputationInfo_ = value;
          }
          onChanged();
        } else {
          cityReputationInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.CityReputationInfo city_reputation_info = 11;</code>
       */
      public Builder clearCityReputationInfo() {
        if (cityReputationInfoBuilder_ == null) {
          cityReputationInfo_ = null;
          onChanged();
        } else {
          cityReputationInfo_ = null;
          cityReputationInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.CityReputationInfo city_reputation_info = 11;</code>
       */
      public emu.gingerps.net.proto.CityReputationInfoOuterClass.CityReputationInfo.Builder getCityReputationInfoBuilder() {
        
        onChanged();
        return getCityReputationInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.CityReputationInfo city_reputation_info = 11;</code>
       */
      public emu.gingerps.net.proto.CityReputationInfoOuterClass.CityReputationInfoOrBuilder getCityReputationInfoOrBuilder() {
        if (cityReputationInfoBuilder_ != null) {
          return cityReputationInfoBuilder_.getMessageOrBuilder();
        } else {
          return cityReputationInfo_ == null ?
              emu.gingerps.net.proto.CityReputationInfoOuterClass.CityReputationInfo.getDefaultInstance() : cityReputationInfo_;
        }
      }
      /**
       * <code>.CityReputationInfo city_reputation_info = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.gingerps.net.proto.CityReputationInfoOuterClass.CityReputationInfo, emu.gingerps.net.proto.CityReputationInfoOuterClass.CityReputationInfo.Builder, emu.gingerps.net.proto.CityReputationInfoOuterClass.CityReputationInfoOrBuilder> 
          getCityReputationInfoFieldBuilder() {
        if (cityReputationInfoBuilder_ == null) {
          cityReputationInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.gingerps.net.proto.CityReputationInfoOuterClass.CityReputationInfo, emu.gingerps.net.proto.CityReputationInfoOuterClass.CityReputationInfo.Builder, emu.gingerps.net.proto.CityReputationInfoOuterClass.CityReputationInfoOrBuilder>(
                  getCityReputationInfo(),
                  getParentForChildren(),
                  isClean());
          cityReputationInfo_ = null;
        }
        return cityReputationInfoBuilder_;
      }

      private int cityId_ ;
      /**
       * <code>uint32 city_id = 7;</code>
       * @return The cityId.
       */
      @java.lang.Override
      public int getCityId() {
        return cityId_;
      }
      /**
       * <code>uint32 city_id = 7;</code>
       * @param value The cityId to set.
       * @return This builder for chaining.
       */
      public Builder setCityId(int value) {
        
        cityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 city_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearCityId() {
        
        cityId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 2;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GetCityReputationInfoRsp)
    }

    // @@protoc_insertion_point(class_scope:GetCityReputationInfoRsp)
    private static final emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp();
    }

    public static emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetCityReputationInfoRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetCityReputationInfoRsp>() {
      @java.lang.Override
      public GetCityReputationInfoRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetCityReputationInfoRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetCityReputationInfoRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetCityReputationInfoRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.GetCityReputationInfoRspOuterClass.GetCityReputationInfoRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetCityReputationInfoRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetCityReputationInfoRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036GetCityReputationInfoRsp.proto\032\030CityRe" +
      "putationInfo.proto\"o\n\030GetCityReputationI" +
      "nfoRsp\0221\n\024city_reputation_info\030\013 \001(\0132\023.C" +
      "ityReputationInfo\022\017\n\007city_id\030\007 \001(\r\022\017\n\007re" +
      "tcode\030\002 \001(\005B\030\n\026emu.gingerps.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.CityReputationInfoOuterClass.getDescriptor(),
        });
    internal_static_GetCityReputationInfoRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetCityReputationInfoRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetCityReputationInfoRsp_descriptor,
        new java.lang.String[] { "CityReputationInfo", "CityId", "Retcode", });
    emu.gingerps.net.proto.CityReputationInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
