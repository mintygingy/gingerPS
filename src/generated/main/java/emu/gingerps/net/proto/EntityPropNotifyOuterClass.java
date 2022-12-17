// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EntityPropNotify.proto

package emu.gingerps.net.proto;

public final class EntityPropNotifyOuterClass {
  private EntityPropNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EntityPropNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EntityPropNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entity_id = 13;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>map&lt;uint32, .PropValue&gt; prop_map = 9;</code>
     */
    int getPropMapCount();
    /**
     * <code>map&lt;uint32, .PropValue&gt; prop_map = 9;</code>
     */
    boolean containsPropMap(
        int key);
    /**
     * Use {@link #getPropMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue>
    getPropMap();
    /**
     * <code>map&lt;uint32, .PropValue&gt; prop_map = 9;</code>
     */
    java.util.Map<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue>
    getPropMapMap();
    /**
     * <code>map&lt;uint32, .PropValue&gt; prop_map = 9;</code>
     */
    /* nullable */
emu.gingerps.net.proto.PropValueOuterClass.PropValue getPropMapOrDefault(
        int key,
        /* nullable */
emu.gingerps.net.proto.PropValueOuterClass.PropValue defaultValue);
    /**
     * <code>map&lt;uint32, .PropValue&gt; prop_map = 9;</code>
     */
    emu.gingerps.net.proto.PropValueOuterClass.PropValue getPropMapOrThrow(
        int key);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 1279;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code EntityPropNotify}
   */
  public static final class EntityPropNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EntityPropNotify)
      EntityPropNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EntityPropNotify.newBuilder() to construct.
    private EntityPropNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EntityPropNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EntityPropNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.gingerps.net.proto.EntityPropNotifyOuterClass.internal_static_EntityPropNotify_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 9:
          return internalGetPropMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.EntityPropNotifyOuterClass.internal_static_EntityPropNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify.class, emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify.Builder.class);
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 13;
    private int entityId_ = 0;
    /**
     * <code>uint32 entity_id = 13;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int PROP_MAP_FIELD_NUMBER = 9;
    private static final class PropMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue>newDefaultInstance(
                  emu.gingerps.net.proto.EntityPropNotifyOuterClass.internal_static_EntityPropNotify_PropMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  emu.gingerps.net.proto.PropValueOuterClass.PropValue.getDefaultInstance());
    }
    @SuppressWarnings("serial")
    private com.google.protobuf.MapField<
        java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue> propMap_;
    private com.google.protobuf.MapField<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue>
    internalGetPropMap() {
      if (propMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            PropMapDefaultEntryHolder.defaultEntry);
      }
      return propMap_;
    }
    public int getPropMapCount() {
      return internalGetPropMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .PropValue&gt; prop_map = 9;</code>
     */
    @java.lang.Override
    public boolean containsPropMap(
        int key) {
      
      return internalGetPropMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getPropMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue> getPropMap() {
      return getPropMapMap();
    }
    /**
     * <code>map&lt;uint32, .PropValue&gt; prop_map = 9;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue> getPropMapMap() {
      return internalGetPropMap().getMap();
    }
    /**
     * <code>map&lt;uint32, .PropValue&gt; prop_map = 9;</code>
     */
    @java.lang.Override
    public /* nullable */
emu.gingerps.net.proto.PropValueOuterClass.PropValue getPropMapOrDefault(
        int key,
        /* nullable */
emu.gingerps.net.proto.PropValueOuterClass.PropValue defaultValue) {
      
      java.util.Map<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue> map =
          internalGetPropMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .PropValue&gt; prop_map = 9;</code>
     */
    @java.lang.Override
    public emu.gingerps.net.proto.PropValueOuterClass.PropValue getPropMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue> map =
          internalGetPropMap().getMap();
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
          internalGetPropMap(),
          PropMapDefaultEntryHolder.defaultEntry,
          9);
      if (entityId_ != 0) {
        output.writeUInt32(13, entityId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue> entry
           : internalGetPropMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue>
        propMap__ = PropMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(9, propMap__);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, entityId_);
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
      if (!(obj instanceof emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify other = (emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (!internalGetPropMap().equals(
          other.internalGetPropMap())) return false;
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
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      if (!internalGetPropMap().getMap().isEmpty()) {
        hash = (37 * hash) + PROP_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetPropMap().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify prototype) {
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
     *   CMD_ID = 1279;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code EntityPropNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EntityPropNotify)
        emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.EntityPropNotifyOuterClass.internal_static_EntityPropNotify_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 9:
            return internalGetPropMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 9:
            return internalGetMutablePropMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.EntityPropNotifyOuterClass.internal_static_EntityPropNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify.class, emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify.newBuilder()
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
        entityId_ = 0;
        internalGetMutablePropMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.EntityPropNotifyOuterClass.internal_static_EntityPropNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify build() {
        emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify buildPartial() {
        emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify result = new emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.entityId_ = entityId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.propMap_ = internalGetPropMap();
          result.propMap_.makeImmutable();
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
        if (other instanceof emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify) {
          return mergeFrom((emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify other) {
        if (other == emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        internalGetMutablePropMap().mergeFrom(
            other.internalGetPropMap());
        bitField0_ |= 0x00000002;
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
              case 74: {
                com.google.protobuf.MapEntry<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue>
                propMap__ = input.readMessage(
                    PropMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutablePropMap().getMutableMap().put(
                    propMap__.getKey(), propMap__.getValue());
                bitField0_ |= 0x00000002;
                break;
              } // case 74
              case 104: {
                entityId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 104
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

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 13;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 13;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        entityId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue> propMap_;
      private com.google.protobuf.MapField<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue>
          internalGetPropMap() {
        if (propMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              PropMapDefaultEntryHolder.defaultEntry);
        }
        return propMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue>
          internalGetMutablePropMap() {
        if (propMap_ == null) {
          propMap_ = com.google.protobuf.MapField.newMapField(
              PropMapDefaultEntryHolder.defaultEntry);
        }
        if (!propMap_.isMutable()) {
          propMap_ = propMap_.copy();
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return propMap_;
      }
      public int getPropMapCount() {
        return internalGetPropMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; prop_map = 9;</code>
       */
      @java.lang.Override
      public boolean containsPropMap(
          int key) {
        
        return internalGetPropMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getPropMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue> getPropMap() {
        return getPropMapMap();
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; prop_map = 9;</code>
       */
      @java.lang.Override
      public java.util.Map<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue> getPropMapMap() {
        return internalGetPropMap().getMap();
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; prop_map = 9;</code>
       */
      @java.lang.Override
      public /* nullable */
emu.gingerps.net.proto.PropValueOuterClass.PropValue getPropMapOrDefault(
          int key,
          /* nullable */
emu.gingerps.net.proto.PropValueOuterClass.PropValue defaultValue) {
        
        java.util.Map<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue> map =
            internalGetPropMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; prop_map = 9;</code>
       */
      @java.lang.Override
      public emu.gingerps.net.proto.PropValueOuterClass.PropValue getPropMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue> map =
            internalGetPropMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }
      public Builder clearPropMap() {
        bitField0_ = (bitField0_ & ~0x00000002);
        internalGetMutablePropMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; prop_map = 9;</code>
       */
      public Builder removePropMap(
          int key) {
        
        internalGetMutablePropMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue>
          getMutablePropMap() {
        bitField0_ |= 0x00000002;
        return internalGetMutablePropMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; prop_map = 9;</code>
       */
      public Builder putPropMap(
          int key,
          emu.gingerps.net.proto.PropValueOuterClass.PropValue value) {
        
        if (value == null) { throw new NullPointerException("map value"); }
        internalGetMutablePropMap().getMutableMap()
            .put(key, value);
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; prop_map = 9;</code>
       */
      public Builder putAllPropMap(
          java.util.Map<java.lang.Integer, emu.gingerps.net.proto.PropValueOuterClass.PropValue> values) {
        internalGetMutablePropMap().getMutableMap()
            .putAll(values);
        bitField0_ |= 0x00000002;
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


      // @@protoc_insertion_point(builder_scope:EntityPropNotify)
    }

    // @@protoc_insertion_point(class_scope:EntityPropNotify)
    private static final emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify();
    }

    public static emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EntityPropNotify>
        PARSER = new com.google.protobuf.AbstractParser<EntityPropNotify>() {
      @java.lang.Override
      public EntityPropNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<EntityPropNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EntityPropNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.EntityPropNotifyOuterClass.EntityPropNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EntityPropNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EntityPropNotify_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EntityPropNotify_PropMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EntityPropNotify_PropMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026EntityPropNotify.proto\032\017PropValue.prot" +
      "o\"\223\001\n\020EntityPropNotify\022\021\n\tentity_id\030\r \001(" +
      "\r\0220\n\010prop_map\030\t \003(\0132\036.EntityPropNotify.P" +
      "ropMapEntry\032:\n\014PropMapEntry\022\013\n\003key\030\001 \001(\r" +
      "\022\031\n\005value\030\002 \001(\0132\n.PropValue:\0028\001B\030\n\026emu.g" +
      "ingerps.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.gingerps.net.proto.PropValueOuterClass.getDescriptor(),
        });
    internal_static_EntityPropNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EntityPropNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EntityPropNotify_descriptor,
        new java.lang.String[] { "EntityId", "PropMap", });
    internal_static_EntityPropNotify_PropMapEntry_descriptor =
      internal_static_EntityPropNotify_descriptor.getNestedTypes().get(0);
    internal_static_EntityPropNotify_PropMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EntityPropNotify_PropMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    emu.gingerps.net.proto.PropValueOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
