// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WorldDataNotify.proto

package emu.gingerps.net.proto;

public final class WorldDataNotifyOuterClass {
  private WorldDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WorldDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WorldDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, .PropValue&gt; world_prop_map = 6;</code>
     */
    int getWorldPropMapCount();
    /**
     * <code>map&lt;uint32, .PropValue&gt; world_prop_map = 6;</code>
     */
    boolean containsWorldPropMap(
        int key);
    /**
     * Use {@link #getWorldPropMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue>
    getWorldPropMap();
    /**
     * <code>map&lt;uint32, .PropValue&gt; world_prop_map = 6;</code>
     */
    java.util.Map<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue>
    getWorldPropMapMap();
    /**
     * <code>map&lt;uint32, .PropValue&gt; world_prop_map = 6;</code>
     */

    emu.gingerps.net.proto.PropValueOuterClass.PropValue getWorldPropMapOrDefault(
        int key,
        emu.gingerps.net.proto.PropValueOuterClass.PropValue defaultValue);
    /**
     * <code>map&lt;uint32, .PropValue&gt; world_prop_map = 6;</code>
     */

    emu.gingerps.net.proto.PropValueOuterClass.PropValue getWorldPropMapOrThrow(
        int key);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 3436;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code WorldDataNotify}
   */
  public static final class WorldDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WorldDataNotify)
      WorldDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WorldDataNotify.newBuilder() to construct.
    private WorldDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WorldDataNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WorldDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WorldDataNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                worldPropMap_ = com.google.protobuf.MapField.newMapField(
                    WorldPropMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue>
              worldPropMap__ = input.readMessage(
                  WorldPropMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              worldPropMap_.getMutableMap().put(
                  worldPropMap__.getKey(), worldPropMap__.getValue());
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
      return emu.gingerps.net.proto.WorldDataNotifyOuterClass.internal_static_WorldDataNotify_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 6:
          return internalGetWorldPropMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.WorldDataNotifyOuterClass.internal_static_WorldDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify.class, emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code WorldDataNotify.DataType}
     */
    public enum DataType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>DATA_TYPE_NONE = 0;</code>
       */
      DATA_TYPE_NONE(0),
      /**
       * <code>DATA_TYPE_WORLD_LEVEL = 1;</code>
       */
      DATA_TYPE_WORLD_LEVEL(1),
      /**
       * <code>DATA_TYPE_IS_IN_MP_MODE = 2;</code>
       */
      DATA_TYPE_IS_IN_MP_MODE(2),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>DATA_TYPE_NONE = 0;</code>
       */
      public static final int DATA_TYPE_NONE_VALUE = 0;
      /**
       * <code>DATA_TYPE_WORLD_LEVEL = 1;</code>
       */
      public static final int DATA_TYPE_WORLD_LEVEL_VALUE = 1;
      /**
       * <code>DATA_TYPE_IS_IN_MP_MODE = 2;</code>
       */
      public static final int DATA_TYPE_IS_IN_MP_MODE_VALUE = 2;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static DataType valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static DataType forNumber(int value) {
        switch (value) {
          case 0: return DATA_TYPE_NONE;
          case 1: return DATA_TYPE_WORLD_LEVEL;
          case 2: return DATA_TYPE_IS_IN_MP_MODE;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<DataType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          DataType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<DataType>() {
              public DataType findValueByNumber(int number) {
                return DataType.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final DataType[] VALUES = values();

      public static DataType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private DataType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:WorldDataNotify.DataType)
    }

    public static final int WORLD_PROP_MAP_FIELD_NUMBER = 6;
    private static final class WorldPropMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue>newDefaultInstance(
                  emu.gingerps.net.proto.WorldDataNotifyOuterClass.internal_static_WorldDataNotify_WorldPropMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  emu.gingerps.net.proto.PropValueOuterClass.PropValue.getDefaultInstance());
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue> worldPropMap_;
    private com.google.protobuf.MapField<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue>
    internalGetWorldPropMap() {
      if (worldPropMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            WorldPropMapDefaultEntryHolder.defaultEntry);
      }
      return worldPropMap_;
    }

    public int getWorldPropMapCount() {
      return internalGetWorldPropMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .PropValue&gt; world_prop_map = 6;</code>
     */

    @java.lang.Override
    public boolean containsWorldPropMap(
        int key) {
      
      return internalGetWorldPropMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getWorldPropMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue> getWorldPropMap() {
      return getWorldPropMapMap();
    }
    /**
     * <code>map&lt;uint32, .PropValue&gt; world_prop_map = 6;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue> getWorldPropMapMap() {
      return internalGetWorldPropMap().getMap();
    }
    /**
     * <code>map&lt;uint32, .PropValue&gt; world_prop_map = 6;</code>
     */
    @java.lang.Override

    public emu.gingerps.net.proto.PropValueOuterClass.PropValue getWorldPropMapOrDefault(
        int key,
        emu.gingerps.net.proto.PropValueOuterClass.PropValue defaultValue) {
      
      java.util.Map<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue> map =
          internalGetWorldPropMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .PropValue&gt; world_prop_map = 6;</code>
     */
    @java.lang.Override

    public emu.gingerps.net.proto.PropValueOuterClass.PropValue getWorldPropMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue> map =
          internalGetWorldPropMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
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
          internalGetWorldPropMap(),
          WorldPropMapDefaultEntryHolder.defaultEntry,
          6);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue> entry
           : internalGetWorldPropMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue>
        worldPropMap__ = WorldPropMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(6, worldPropMap__);
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
      if (!(obj instanceof emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify other = (emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify) obj;

      if (!internalGetWorldPropMap().equals(
          other.internalGetWorldPropMap())) return false;
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
      if (!internalGetWorldPropMap().getMap().isEmpty()) {
        hash = (37 * hash) + WORLD_PROP_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetWorldPropMap().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify prototype) {
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
     *   CMD_ID = 3436;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code WorldDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WorldDataNotify)
        emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.WorldDataNotifyOuterClass.internal_static_WorldDataNotify_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 6:
            return internalGetWorldPropMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 6:
            return internalGetMutableWorldPropMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.WorldDataNotifyOuterClass.internal_static_WorldDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify.class, emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify.newBuilder()
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
        internalGetMutableWorldPropMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.WorldDataNotifyOuterClass.internal_static_WorldDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify build() {
        emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify buildPartial() {
        emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify result = new emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify(this);
        int from_bitField0_ = bitField0_;
        result.worldPropMap_ = internalGetWorldPropMap();
        result.worldPropMap_.makeImmutable();
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
        if (other instanceof emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify) {
          return mergeFrom((emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify other) {
        if (other == emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify.getDefaultInstance()) return this;
        internalGetMutableWorldPropMap().mergeFrom(
            other.internalGetWorldPropMap());
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
        emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.MapField<
          java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue> worldPropMap_;
      private com.google.protobuf.MapField<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue>
      internalGetWorldPropMap() {
        if (worldPropMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              WorldPropMapDefaultEntryHolder.defaultEntry);
        }
        return worldPropMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue>
      internalGetMutableWorldPropMap() {
        onChanged();;
        if (worldPropMap_ == null) {
          worldPropMap_ = com.google.protobuf.MapField.newMapField(
              WorldPropMapDefaultEntryHolder.defaultEntry);
        }
        if (!worldPropMap_.isMutable()) {
          worldPropMap_ = worldPropMap_.copy();
        }
        return worldPropMap_;
      }

      public int getWorldPropMapCount() {
        return internalGetWorldPropMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; world_prop_map = 6;</code>
       */

      @java.lang.Override
      public boolean containsWorldPropMap(
          int key) {
        
        return internalGetWorldPropMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getWorldPropMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue> getWorldPropMap() {
        return getWorldPropMapMap();
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; world_prop_map = 6;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue> getWorldPropMapMap() {
        return internalGetWorldPropMap().getMap();
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; world_prop_map = 6;</code>
       */
      @java.lang.Override

      public emu.gingerps.net.proto.PropValueOuterClass.PropValue getWorldPropMapOrDefault(
          int key,
          emu.gingerps.net.proto.PropValueOuterClass.PropValue defaultValue) {
        
        java.util.Map<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue> map =
            internalGetWorldPropMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; world_prop_map = 6;</code>
       */
      @java.lang.Override

      public emu.gingerps.net.proto.PropValueOuterClass.PropValue getWorldPropMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue> map =
            internalGetWorldPropMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearWorldPropMap() {
        internalGetMutableWorldPropMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; world_prop_map = 6;</code>
       */

      public Builder removeWorldPropMap(
          int key) {
        
        internalGetMutableWorldPropMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue>
      getMutableWorldPropMap() {
        return internalGetMutableWorldPropMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; world_prop_map = 6;</code>
       */
      public Builder putWorldPropMap(
          int key,
          emu.gingerps.net.proto.PropValueOuterClass.PropValue value) {
        
        if (value == null) { throw new java.lang.NullPointerException(); }
        internalGetMutableWorldPropMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; world_prop_map = 6;</code>
       */

      public Builder putAllWorldPropMap(
          java.util.Map<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue> values) {
        internalGetMutableWorldPropMap().getMutableMap()
            .putAll(values);
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


      // @@protoc_insertion_point(builder_scope:WorldDataNotify)
    }

    // @@protoc_insertion_point(class_scope:WorldDataNotify)
    private static final emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify();
    }

    public static emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WorldDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<WorldDataNotify>() {
      @java.lang.Override
      public WorldDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WorldDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WorldDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WorldDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.WorldDataNotifyOuterClass.WorldDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WorldDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WorldDataNotify_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WorldDataNotify_WorldPropMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WorldDataNotify_WorldPropMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025WorldDataNotify.proto\032\017PropValue.proto" +
      "\"\346\001\n\017WorldDataNotify\022:\n\016world_prop_map\030\006" +
      " \003(\0132\".WorldDataNotify.WorldPropMapEntry" +
      "\032?\n\021WorldPropMapEntry\022\013\n\003key\030\001 \001(\r\022\031\n\005va" +
      "lue\030\002 \001(\0132\n.PropValue:\0028\001\"V\n\010DataType\022\022\n" +
      "\016DATA_TYPE_NONE\020\000\022\031\n\025DATA_TYPE_WORLD_LEV" +
      "EL\020\001\022\033\n\027DATA_TYPE_IS_IN_MP_MODE\020\002B\030\n\026emu" +
      ".gingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.PropValueOuterClass.getDescriptor(),
        });
    internal_static_WorldDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WorldDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WorldDataNotify_descriptor,
        new java.lang.String[] { "WorldPropMap", });
    internal_static_WorldDataNotify_WorldPropMapEntry_descriptor =
      internal_static_WorldDataNotify_descriptor.getNestedTypes().get(0);
    internal_static_WorldDataNotify_WorldPropMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WorldDataNotify_WorldPropMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    emu.gingerps.net.proto.PropValueOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
