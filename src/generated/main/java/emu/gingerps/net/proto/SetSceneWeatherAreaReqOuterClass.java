// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SetSceneWeatherAreaReq.proto

package emu.gingerps.net.proto;

public final class SetSceneWeatherAreaReqOuterClass {
  private SetSceneWeatherAreaReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetSceneWeatherAreaReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SetSceneWeatherAreaReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, string&gt; weather_value_map = 8;</code>
     */
    int getWeatherValueMapCount();
    /**
     * <code>map&lt;uint32, string&gt; weather_value_map = 8;</code>
     */
    boolean containsWeatherValueMap(
        int key);
    /**
     * Use {@link #getWeatherValueMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.String>
    getWeatherValueMap();
    /**
     * <code>map&lt;uint32, string&gt; weather_value_map = 8;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.String>
    getWeatherValueMapMap();
    /**
     * <code>map&lt;uint32, string&gt; weather_value_map = 8;</code>
     */
    /* nullable */
java.lang.String getWeatherValueMapOrDefault(
        int key,
        /* nullable */
java.lang.String defaultValue);
    /**
     * <code>map&lt;uint32, string&gt; weather_value_map = 8;</code>
     */
    java.lang.String getWeatherValueMapOrThrow(
        int key);

    /**
     * <code>uint32 weather_gadget_id = 12;</code>
     * @return The weatherGadgetId.
     */
    int getWeatherGadgetId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 214;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code SetSceneWeatherAreaReq}
   */
  public static final class SetSceneWeatherAreaReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SetSceneWeatherAreaReq)
      SetSceneWeatherAreaReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetSceneWeatherAreaReq.newBuilder() to construct.
    private SetSceneWeatherAreaReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetSceneWeatherAreaReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SetSceneWeatherAreaReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.internal_static_SetSceneWeatherAreaReq_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 8:
          return internalGetWeatherValueMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.internal_static_SetSceneWeatherAreaReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq.class, emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq.Builder.class);
    }

    public static final int WEATHER_VALUE_MAP_FIELD_NUMBER = 8;
    private static final class WeatherValueMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.String> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.String>newDefaultInstance(
                  emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.internal_static_SetSceneWeatherAreaReq_WeatherValueMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.STRING,
                  "");
    }
    @SuppressWarnings("serial")
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.String> weatherValueMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.String>
    internalGetWeatherValueMap() {
      if (weatherValueMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            WeatherValueMapDefaultEntryHolder.defaultEntry);
      }
      return weatherValueMap_;
    }
    public int getWeatherValueMapCount() {
      return internalGetWeatherValueMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, string&gt; weather_value_map = 8;</code>
     */
    @java.lang.Override
    public boolean containsWeatherValueMap(
        int key) {
      
      return internalGetWeatherValueMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getWeatherValueMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.String> getWeatherValueMap() {
      return getWeatherValueMapMap();
    }
    /**
     * <code>map&lt;uint32, string&gt; weather_value_map = 8;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, java.lang.String> getWeatherValueMapMap() {
      return internalGetWeatherValueMap().getMap();
    }
    /**
     * <code>map&lt;uint32, string&gt; weather_value_map = 8;</code>
     */
    @java.lang.Override
    public /* nullable */
java.lang.String getWeatherValueMapOrDefault(
        int key,
        /* nullable */
java.lang.String defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.String> map =
          internalGetWeatherValueMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, string&gt; weather_value_map = 8;</code>
     */
    @java.lang.Override
    public java.lang.String getWeatherValueMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.String> map =
          internalGetWeatherValueMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int WEATHER_GADGET_ID_FIELD_NUMBER = 12;
    private int weatherGadgetId_ = 0;
    /**
     * <code>uint32 weather_gadget_id = 12;</code>
     * @return The weatherGadgetId.
     */
    @java.lang.Override
    public int getWeatherGadgetId() {
      return weatherGadgetId_;
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
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetWeatherValueMap(),
          WeatherValueMapDefaultEntryHolder.defaultEntry,
          8);
      if (weatherGadgetId_ != 0) {
        output.writeUInt32(12, weatherGadgetId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, java.lang.String> entry
           : internalGetWeatherValueMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.String>
        weatherValueMap__ = WeatherValueMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(8, weatherValueMap__);
      }
      if (weatherGadgetId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, weatherGadgetId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq other = (emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq) obj;

      if (!internalGetWeatherValueMap().equals(
          other.internalGetWeatherValueMap())) return false;
      if (getWeatherGadgetId()
          != other.getWeatherGadgetId()) return false;
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
      if (!internalGetWeatherValueMap().getMap().isEmpty()) {
        hash = (37 * hash) + WEATHER_VALUE_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetWeatherValueMap().hashCode();
      }
      hash = (37 * hash) + WEATHER_GADGET_ID_FIELD_NUMBER;
      hash = (53 * hash) + getWeatherGadgetId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq prototype) {
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
     *   CMD_ID = 214;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code SetSceneWeatherAreaReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetSceneWeatherAreaReq)
        emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.internal_static_SetSceneWeatherAreaReq_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 8:
            return internalGetWeatherValueMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 8:
            return internalGetMutableWeatherValueMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.internal_static_SetSceneWeatherAreaReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq.class, emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq.newBuilder()
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
        internalGetMutableWeatherValueMap().clear();
        weatherGadgetId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.internal_static_SetSceneWeatherAreaReq_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq getDefaultInstanceForType() {
        return emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq build() {
        emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq buildPartial() {
        emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq result = new emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.weatherValueMap_ = internalGetWeatherValueMap();
          result.weatherValueMap_.makeImmutable();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.weatherGadgetId_ = weatherGadgetId_;
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
        if (other instanceof emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq) {
          return mergeFrom((emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq other) {
        if (other == emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq.getDefaultInstance()) return this;
        internalGetMutableWeatherValueMap().mergeFrom(
            other.internalGetWeatherValueMap());
        bitField0_ |= 0x00000001;
        if (other.getWeatherGadgetId() != 0) {
          setWeatherGadgetId(other.getWeatherGadgetId());
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
              case 66: {
                com.google.protobuf.MapEntry<java.lang.Integer, java.lang.String>
                weatherValueMap__ = input.readMessage(
                    WeatherValueMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableWeatherValueMap().getMutableMap().put(
                    weatherValueMap__.getKey(), weatherValueMap__.getValue());
                bitField0_ |= 0x00000001;
                break;
              } // case 66
              case 96: {
                weatherGadgetId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 96
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

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.String> weatherValueMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.String>
          internalGetWeatherValueMap() {
        if (weatherValueMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              WeatherValueMapDefaultEntryHolder.defaultEntry);
        }
        return weatherValueMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.String>
          internalGetMutableWeatherValueMap() {
        if (weatherValueMap_ == null) {
          weatherValueMap_ = com.google.protobuf.MapField.newMapField(
              WeatherValueMapDefaultEntryHolder.defaultEntry);
        }
        if (!weatherValueMap_.isMutable()) {
          weatherValueMap_ = weatherValueMap_.copy();
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return weatherValueMap_;
      }
      public int getWeatherValueMapCount() {
        return internalGetWeatherValueMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, string&gt; weather_value_map = 8;</code>
       */
      @java.lang.Override
      public boolean containsWeatherValueMap(
          int key) {
        
        return internalGetWeatherValueMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getWeatherValueMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.String> getWeatherValueMap() {
        return getWeatherValueMapMap();
      }
      /**
       * <code>map&lt;uint32, string&gt; weather_value_map = 8;</code>
       */
      @java.lang.Override
      public java.util.Map<java.lang.Integer, java.lang.String> getWeatherValueMapMap() {
        return internalGetWeatherValueMap().getMap();
      }
      /**
       * <code>map&lt;uint32, string&gt; weather_value_map = 8;</code>
       */
      @java.lang.Override
      public /* nullable */
java.lang.String getWeatherValueMapOrDefault(
          int key,
          /* nullable */
java.lang.String defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.String> map =
            internalGetWeatherValueMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, string&gt; weather_value_map = 8;</code>
       */
      @java.lang.Override
      public java.lang.String getWeatherValueMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.String> map =
            internalGetWeatherValueMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }
      public Builder clearWeatherValueMap() {
        bitField0_ = (bitField0_ & ~0x00000001);
        internalGetMutableWeatherValueMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, string&gt; weather_value_map = 8;</code>
       */
      public Builder removeWeatherValueMap(
          int key) {
        
        internalGetMutableWeatherValueMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.String>
          getMutableWeatherValueMap() {
        bitField0_ |= 0x00000001;
        return internalGetMutableWeatherValueMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, string&gt; weather_value_map = 8;</code>
       */
      public Builder putWeatherValueMap(
          int key,
          java.lang.String value) {
        
        if (value == null) { throw new NullPointerException("map value"); }
        internalGetMutableWeatherValueMap().getMutableMap()
            .put(key, value);
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>map&lt;uint32, string&gt; weather_value_map = 8;</code>
       */
      public Builder putAllWeatherValueMap(
          java.util.Map<java.lang.Integer, java.lang.String> values) {
        internalGetMutableWeatherValueMap().getMutableMap()
            .putAll(values);
        bitField0_ |= 0x00000001;
        return this;
      }

      private int weatherGadgetId_ ;
      /**
       * <code>uint32 weather_gadget_id = 12;</code>
       * @return The weatherGadgetId.
       */
      @java.lang.Override
      public int getWeatherGadgetId() {
        return weatherGadgetId_;
      }
      /**
       * <code>uint32 weather_gadget_id = 12;</code>
       * @param value The weatherGadgetId to set.
       * @return This builder for chaining.
       */
      public Builder setWeatherGadgetId(int value) {
        
        weatherGadgetId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 weather_gadget_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearWeatherGadgetId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        weatherGadgetId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SetSceneWeatherAreaReq)
    }

    // @@protoc_insertion_point(class_scope:SetSceneWeatherAreaReq)
    private static final emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq();
    }

    public static emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SetSceneWeatherAreaReq>
        PARSER = new com.google.protobuf.AbstractParser<SetSceneWeatherAreaReq>() {
      @java.lang.Override
      public SetSceneWeatherAreaReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<SetSceneWeatherAreaReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SetSceneWeatherAreaReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.SetSceneWeatherAreaReqOuterClass.SetSceneWeatherAreaReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetSceneWeatherAreaReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetSceneWeatherAreaReq_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetSceneWeatherAreaReq_WeatherValueMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetSceneWeatherAreaReq_WeatherValueMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034SetSceneWeatherAreaReq.proto\"\264\001\n\026SetSc" +
      "eneWeatherAreaReq\022G\n\021weather_value_map\030\010" +
      " \003(\0132,.SetSceneWeatherAreaReq.WeatherVal" +
      "ueMapEntry\022\031\n\021weather_gadget_id\030\014 \001(\r\0326\n" +
      "\024WeatherValueMapEntry\022\013\n\003key\030\001 \001(\r\022\r\n\005va" +
      "lue\030\002 \001(\t:\0028\001B\030\n\026emu.gingerps.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SetSceneWeatherAreaReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetSceneWeatherAreaReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetSceneWeatherAreaReq_descriptor,
        new java.lang.String[] { "WeatherValueMap", "WeatherGadgetId", });
    internal_static_SetSceneWeatherAreaReq_WeatherValueMapEntry_descriptor =
      internal_static_SetSceneWeatherAreaReq_descriptor.getNestedTypes().get(0);
    internal_static_SetSceneWeatherAreaReq_WeatherValueMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetSceneWeatherAreaReq_WeatherValueMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
