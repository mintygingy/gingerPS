// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OpenStateUpdateNotify.proto

package emu.gingerps.net.proto;

public final class OpenStateUpdateNotifyOuterClass {
  private OpenStateUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OpenStateUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OpenStateUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, uint32&gt; open_state_map = 12;</code>
     */
    int getOpenStateMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; open_state_map = 12;</code>
     */
    boolean containsOpenStateMap(
        int key);
    /**
     * Use {@link #getOpenStateMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getOpenStateMap();
    /**
     * <code>map&lt;uint32, uint32&gt; open_state_map = 12;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getOpenStateMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; open_state_map = 12;</code>
     */

    int getOpenStateMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; open_state_map = 12;</code>
     */

    int getOpenStateMapOrThrow(
        int key);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 107;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code OpenStateUpdateNotify}
   */
  public static final class OpenStateUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OpenStateUpdateNotify)
      OpenStateUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OpenStateUpdateNotify.newBuilder() to construct.
    private OpenStateUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OpenStateUpdateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OpenStateUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private OpenStateUpdateNotify(
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
            case 98: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                openStateMap_ = com.google.protobuf.MapField.newMapField(
                    OpenStateMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              openStateMap__ = input.readMessage(
                  OpenStateMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              openStateMap_.getMutableMap().put(
                  openStateMap__.getKey(), openStateMap__.getValue());
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
      return emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.internal_static_OpenStateUpdateNotify_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 12:
          return internalGetOpenStateMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.internal_static_OpenStateUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify.class, emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify.Builder.class);
    }

    public static final int OPEN_STATE_MAP_FIELD_NUMBER = 12;
    private static final class OpenStateMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.internal_static_OpenStateUpdateNotify_OpenStateMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> openStateMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetOpenStateMap() {
      if (openStateMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            OpenStateMapDefaultEntryHolder.defaultEntry);
      }
      return openStateMap_;
    }

    public int getOpenStateMapCount() {
      return internalGetOpenStateMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; open_state_map = 12;</code>
     */

    @java.lang.Override
    public boolean containsOpenStateMap(
        int key) {
      
      return internalGetOpenStateMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getOpenStateMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getOpenStateMap() {
      return getOpenStateMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; open_state_map = 12;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getOpenStateMapMap() {
      return internalGetOpenStateMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; open_state_map = 12;</code>
     */
    @java.lang.Override

    public int getOpenStateMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetOpenStateMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; open_state_map = 12;</code>
     */
    @java.lang.Override

    public int getOpenStateMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetOpenStateMap().getMap();
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
          internalGetOpenStateMap(),
          OpenStateMapDefaultEntryHolder.defaultEntry,
          12);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetOpenStateMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        openStateMap__ = OpenStateMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(12, openStateMap__);
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
      if (!(obj instanceof emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify)) {
        return super.equals(obj);
      }
      emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify other = (emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify) obj;

      if (!internalGetOpenStateMap().equals(
          other.internalGetOpenStateMap())) return false;
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
      if (!internalGetOpenStateMap().getMap().isEmpty()) {
        hash = (37 * hash) + OPEN_STATE_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetOpenStateMap().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify prototype) {
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
     *   CMD_ID = 107;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code OpenStateUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OpenStateUpdateNotify)
        emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.internal_static_OpenStateUpdateNotify_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 12:
            return internalGetOpenStateMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 12:
            return internalGetMutableOpenStateMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.internal_static_OpenStateUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify.class, emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify.Builder.class);
      }

      // Construct using emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify.newBuilder()
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
        internalGetMutableOpenStateMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.internal_static_OpenStateUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify getDefaultInstanceForType() {
        return emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify build() {
        emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify buildPartial() {
        emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify result = new emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify(this);
        int from_bitField0_ = bitField0_;
        result.openStateMap_ = internalGetOpenStateMap();
        result.openStateMap_.makeImmutable();
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
        if (other instanceof emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify) {
          return mergeFrom((emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify other) {
        if (other == emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify.getDefaultInstance()) return this;
        internalGetMutableOpenStateMap().mergeFrom(
            other.internalGetOpenStateMap());
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
        emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify) e.getUnfinishedMessage();
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
          java.lang.Integer, java.lang.Integer> openStateMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetOpenStateMap() {
        if (openStateMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              OpenStateMapDefaultEntryHolder.defaultEntry);
        }
        return openStateMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableOpenStateMap() {
        onChanged();;
        if (openStateMap_ == null) {
          openStateMap_ = com.google.protobuf.MapField.newMapField(
              OpenStateMapDefaultEntryHolder.defaultEntry);
        }
        if (!openStateMap_.isMutable()) {
          openStateMap_ = openStateMap_.copy();
        }
        return openStateMap_;
      }

      public int getOpenStateMapCount() {
        return internalGetOpenStateMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; open_state_map = 12;</code>
       */

      @java.lang.Override
      public boolean containsOpenStateMap(
          int key) {
        
        return internalGetOpenStateMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getOpenStateMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getOpenStateMap() {
        return getOpenStateMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; open_state_map = 12;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getOpenStateMapMap() {
        return internalGetOpenStateMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; open_state_map = 12;</code>
       */
      @java.lang.Override

      public int getOpenStateMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetOpenStateMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; open_state_map = 12;</code>
       */
      @java.lang.Override

      public int getOpenStateMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetOpenStateMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearOpenStateMap() {
        internalGetMutableOpenStateMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; open_state_map = 12;</code>
       */

      public Builder removeOpenStateMap(
          int key) {
        
        internalGetMutableOpenStateMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableOpenStateMap() {
        return internalGetMutableOpenStateMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; open_state_map = 12;</code>
       */
      public Builder putOpenStateMap(
          int key,
          int value) {
        
        
        internalGetMutableOpenStateMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; open_state_map = 12;</code>
       */

      public Builder putAllOpenStateMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableOpenStateMap().getMutableMap()
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


      // @@protoc_insertion_point(builder_scope:OpenStateUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:OpenStateUpdateNotify)
    private static final emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify();
    }

    public static emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OpenStateUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<OpenStateUpdateNotify>() {
      @java.lang.Override
      public OpenStateUpdateNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OpenStateUpdateNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<OpenStateUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OpenStateUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gingerps.net.proto.OpenStateUpdateNotifyOuterClass.OpenStateUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OpenStateUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OpenStateUpdateNotify_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OpenStateUpdateNotify_OpenStateMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OpenStateUpdateNotify_OpenStateMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033OpenStateUpdateNotify.proto\"\216\001\n\025OpenSt" +
      "ateUpdateNotify\022@\n\016open_state_map\030\014 \003(\0132" +
      "(.OpenStateUpdateNotify.OpenStateMapEntr" +
      "y\0323\n\021OpenStateMapEntry\022\013\n\003key\030\001 \001(\r\022\r\n\005v" +
      "alue\030\002 \001(\r:\0028\001B\030\n\026emu.gingerps.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_OpenStateUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OpenStateUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OpenStateUpdateNotify_descriptor,
        new java.lang.String[] { "OpenStateMap", });
    internal_static_OpenStateUpdateNotify_OpenStateMapEntry_descriptor =
      internal_static_OpenStateUpdateNotify_descriptor.getNestedTypes().get(0);
    internal_static_OpenStateUpdateNotify_OpenStateMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OpenStateUpdateNotify_OpenStateMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
